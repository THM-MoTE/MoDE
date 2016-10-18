package de.thm.mni.mhpp11.util.parser;

import javafx.util.Pair;
import lombok.Getter;
import omc.corba.OMCClient;
import omc.corba.OMCInterface;
import omc.corba.Result;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by hobbypunk on 27.09.16.
 */
public class OMCompiler {
  
  private static final Pattern removeQuotes = Pattern.compile("(^\")|(\"$)");
  private static OMCompiler ourInstance;
  
  public static OMCompiler getInstance(Path compiler, Path library, Locale locale) throws IOException {
    if (ourInstance == null) ourInstance = new OMCompiler(compiler, library, locale);
    return ourInstance;
  }
  
  public static OMCompiler getInstance() {
    return ourInstance;
  }
  
  
  public enum TYPE {
    TYPE,
    PACKAGE,
    CLASS,
    RECORD,
    FUNCTION,
    MODEL,
    CONNECTOR,
    ENUM,
    OPERATOR,
    OPERATOR_RECORD,
    NULL
  }
  
  private final Path library;
  private OMCInterface client;
  
  private Lock lock = new ReentrantLock();
  private Condition systemLibs;
  
  private List<Pair<String, Path>> systemLibraries = new ArrayList<>();
  @Getter private List<Pair<String, Path>> projectLibraries = new ArrayList<>();
  @Getter private Pair<String, Path> project = null;
  
  private OMCompiler(Path compiler, Path library, Locale locale) throws IOException {
    this.library = library;
    client = new OMCClient(compiler.toString(), locale.toString());
    client.connect();
    this.preloadSystemLibraries();
  }
  
  private void preloadSystemLibraries() {
    Thread t = new Thread(() -> {
      lock.lock();
      systemLibs = lock.newCondition();
      List<String> list = OMCompiler.this.getAvailableLibraries();
      for (String s : list) {
        sendExpression(String.format("loadModel(%s)", s), true);
      }
      loadSystemLibraries(list);
      Condition s = systemLibs;
      systemLibs = null;
      s.signal();
      lock.unlock();
    });
    t.start();
  }
  
  public void setProject(Path f) throws ParserException {
    if (this.project != null) throw new ParserException("project already set");
    Pair<String, Path> lib = addLibrary(f);
    if (lib == null) throw new ParserException("project not loaded");
    this.project = lib;
  }
  
  private Pair<String, Path> addLibrary(Path f) throws ParserException {
    f = f.toAbsolutePath().normalize();
    loadSystemLibraries(null); // if not loaded now;
    
    Result r = sendExpression(String.format("loadFile(\"%s\")", f));
    if (r.result.contains("false")) throw new ParserException("Cannot load file");
    if (r.error.isPresent()) throw new ParserException(r.error.get());
    
    r = sendExpression("getLoadedLibraries()");
    
    List<Pair<String, Path>> list = toLibraryArray(r.result);
    
    for (Pair<String, Path> entry : list) {
      if (entry.equals(project)) continue;
      if (systemLibraries.contains(entry) || projectLibraries.contains(entry)) continue;
      if (!f.startsWith(entry.getValue())) continue;
      return new Pair<>(entry.getKey(), f);
    }
    return null;
  }
  
  public void addProjectLibraries(List<Path> files) throws ParserException {
    for (Path f : files) {
      Pair<String, Path> p = addLibrary(f);
      if (p != null) this.projectLibraries.add(p);
    }
  }
  
  private List<String> getAvailableLibraries() {
//    Result result = client.sendExpression("getAvailableLibraries()");
//    List<String> list = toStringArray(result.result);
    String[] first = new String[]{"Modelica", "ModelicaServices", "ModelicaReference", "Complex"};
//    list.removeAll(Arrays.asList(first));
//    list.addAll(0, Arrays.asList(first));
//    return list;
    return Arrays.asList(first);
  }
  
  private void loadSystemLibraries(List<String> list1) {
    if (list1 == null) waitLibs();
    if (systemLibraries.isEmpty()) {
      Result result = sendExpression("getLoadedLibraries()", true);
      
      List<Pair<String, Path>> list = toLibraryArray(result.result);
      for (Pair<String, Path> entry : list) {
        String name = entry.getKey().toLowerCase();
        if (name.contains("obsolete") || name.contains("test")) continue;
        if (this.library != null && entry.getValue().startsWith(this.library))
          systemLibraries.add(entry);
      }
      systemLibraries.sort((o1, o2) -> list1.indexOf(o1.getKey()) - list1.indexOf(o2.getKey()));
    }
  }
  
  public List<Pair<String, Path>> getSystemLibraries() {
    waitLibs();
    return this.systemLibraries;
  }
  
  public List<String> getAnnotationStrings(String className) {
    List<String> list = new ArrayList<>();
    Result r = sendExpression(String.format("getAnnotationCount(%s)", className));
    Integer count = Integer.parseInt(r.result);
    for (Integer i = 1; i <= count; i++) {
      r = sendExpression(String.format("getNthAnnotationString(%s, %d)", className, i));
      if (!r.error.isPresent()) list.add(toString(r.result));
    }
    
    return list;
  }
  
  public List<String> getChildren(String className) {
    Result result = sendExpression(String.format("getClassNames(%s)", className));
    return toStringArray(result.result);
  }
  
  public List<String> getInheritedClasses(String className) {
    Result result = sendExpression(String.format("getInheritedClasses(%s)", className));
    return toStringArray(result.result);
  }
  
  public TYPE getType(String className) {
    Result r = sendExpression(String.format("getClassRestriction(%s)", className));
    String res = toString(r.result).toLowerCase();
    switch (res) {
      case "type":
        return TYPE.TYPE;
      case "package":
        return TYPE.PACKAGE;
      case "class":
        return TYPE.CLASS;
      case "record":
        return TYPE.RECORD;
      case "function":
        return TYPE.FUNCTION;
      case "model":
        return TYPE.MODEL;
      case "connector":
        return TYPE.CONNECTOR;
      case "enum":
        return TYPE.ENUM;
      case "operator":
        return TYPE.OPERATOR;
      case "operator record":
        return TYPE.OPERATOR_RECORD;
      default:
        return TYPE.NULL;
    }
  }
  
  private String toString(String result) {
    return removeQuotes.matcher(result).replaceAll("");
  }
  
  public void disconnect() {
    waitLibs();
    try {
      client.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private List<String> toStringArray(String s) {
    return toStringArray(s, true);
  }
  
  private List<String> toStringArray(String s, Boolean unsorted) {
    List<String> l = Arrays.asList(s.split(","));
    
    for (int i = 0; i < l.size(); i++) {
      l.set(i, l.get(i).replaceAll("(^[\\{\\\"]*)|([\\\"\\}]*$)", ""));
    }
    l = l.stream().filter(s1 -> !s1.isEmpty()).collect(Collectors.toList());
    if (!unsorted) l.sort(String::compareToIgnoreCase);
    
    return l;
  }
  
  private List<Pair<String, Path>> toLibraryArray(String s) {
    List<String> tmp = toStringArray(s);
    List<Pair<String, Path>> list = new ArrayList<>();
    for (int i = 0; i < tmp.size(); i += 2) {
      list.add(new Pair<>(tmp.get(i), Paths.get(tmp.get(i + 1))));
    }
    return list;
  }
  
  public Path getPath(String path) {
    Result r = sendExpression(String.format("uriToFilename(\"%s\")", path));
    return Paths.get(r.result);
  }
  
  public Result sendExpression(String s) {
    return sendExpression(s, false);
  }
  
  private Result sendExpression(String s, Boolean ignoreLoaded) {
    if (!ignoreLoaded)
      waitLibs();
    Result r = client.sendExpression(s);
    return r;
  }
  
  private void waitLibs() {
    lock.lock();
    try {
      if (systemLibs != null) {
        systemLibs.await();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    lock.unlock();
  }
}
