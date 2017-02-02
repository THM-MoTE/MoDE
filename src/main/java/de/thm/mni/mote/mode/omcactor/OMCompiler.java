package de.thm.mni.mote.mode.omcactor;

import ch.qos.logback.classic.Level;
import de.thm.mni.mote.mode.modelica.ClassInformation;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.parser.modelica.ComponentsLexer;
import de.thm.mni.mote.mode.parser.modelica.ComponentsParser;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import lombok.AccessLevel;
import lombok.Getter;
import omc.ImportHandler;
import omc.corba.OMCClient;
import omc.corba.OMCInterface;
import omc.corba.Result;
import omc.corba.ScriptingHelper;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 27.09.16.
 */
@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class OMCompiler {
  
  private static final Pattern lineEnd = Pattern.compile(";\\s*$");
  
  private static final Pattern modelTypeAndName = Pattern.compile("^\\s*(?:((partial)?)\\s+)?(?<type>class|model|(?:operator\\s+)?record|block|(?:expandable\\s+)?connector|type|package|(?:pure|impure\\s+)?(?:operator\\s+)?function|operator)\\s+(?<name>[^\\s]+)", Pattern.CASE_INSENSITIVE);
  private static final Pattern modelEnd = Pattern.compile("^\\s*end\\s+(?<name>[^\\s]+)", Pattern.CASE_INSENSITIVE);
  @Getter private final UUID group;
  
  public enum TYPE {
    BLOCK,
    CLASS,
    CONNECTOR,
    ENUM,
    FUNCTION,
    MODEL,
    OPERATOR,
    OPERATOR_RECORD,
    PACKAGE,
    RECORD,
    TYPE,
  
    NULL
  }
  
  @Getter(AccessLevel.PACKAGE) private OMCInterface client;
  
  private final Set<Path> systemLibraryPaths = new HashSet<>();
  @Getter private final List<Pair<String, Path>> systemLibraries = new ArrayList<>();
  @Getter private List<Pair<String, Path>> projectLibraries = new ArrayList<>();
  @Getter private Pair<String, Path> project = null;
  @Getter private ImportHandler importHandler = null;
  
  public OMCompiler(UUID group, Path compiler, Locale locale) throws IOException, IllegalStateException {
    this.group = group;
    client = new OMCClient(compiler.toString(), locale.toString());
    client.connect();
    this.loadLibraryPath();
    final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("omc.corba.OMCInterface");
    if (logger instanceof ch.qos.logback.classic.Logger) {
      ch.qos.logback.classic.Logger logbackLogger = (ch.qos.logback.classic.Logger) logger;
      logbackLogger.setLevel(Level.ERROR);
    }
  }
  
  private void loadLibraryPath() {
    Result r = client.call("getModelicaPath");
    String paths = ScriptingHelper.killTrailingQuotes(r.result);
    for (String path : paths.split(":")) {
      systemLibraryPaths.add(Paths.get(path));
    }
  }
  
  void addSystemLibraries(List<String> libs) {
    systemLibraries.clear();
    Result result = client.call("getLoadedLibraries");
    
    List<Pair<String, Path>> list = toLibraryArray(result.result);
    for (Pair<String, Path> entry : list) {
      if (libs.contains(entry.getKey())) systemLibraries.add(entry);
    }
  }
  
  void setProject(Path f) throws ParserException {
    if (this.project != null) throw new ParserException(tr("Error", "error.omcactor.project_already_set"));
    Pair<String, Path> lib = loadProject(f);
    if (lib == null) throw new ParserException(tr("Error", "error.omcactor.cant_load_project", f.getFileName()));
    this.project = lib;
  }
  
  private Pair<String, Path> loadProject(Path f) throws ParserException {
    //TODO: unload existing project?
    
    f = f.toAbsolutePath().normalize();
    
    Result r = client.call("loadFile", ScriptingHelper.asString(f));
    if (r.result.contains("false")) return null;
    if (r.error.isPresent()) throw new ParserException(r.error.get());
    
    r = client.call("getLoadedLibraries");
    
    List<Pair<String, Path>> list = toLibraryArray(r.result);
    
    f = f.getParent();
    for (Pair<String, Path> entry : list) {
      if (f.equals(entry.getValue()))
        return new ImmutablePair<>(entry.getKey(), f);
    }
    return null;
  }
  
  void loadProjectLibraries(Path projectFile) throws ParserException {
    try {
      importHandler = new ImportHandler(projectFile);
      importHandler.loadLibraries(this.client);
      this.projectLibraries.addAll(importHandler.getImportedLibs());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  void addProjectLibrary(Path libFile) throws IOException {
    if (importHandler != null) {
      importHandler.addImportLib(this.client, libFile);
    }
  }
  
  List<String> getAvailableLibraries() {
    Result result = client.sendExpression("getAvailableLibraries()");
    List<String> list = toStringArray(result.result);
    list = list.stream().filter(lib -> !(lib.toLowerCase().contains("obsolete") || lib.toLowerCase().contains("test"))).collect(Collectors.toList());
    return list;
  }
  
  public List<String> getAnnotationStrings(String className) {
    List<String> list = new ArrayList<>();
    Result r = client.call("getAnnotationCount", className);
    Integer count = Integer.parseInt(r.result);
    for (Integer i = 1; i <= count; i++) {
      r = client.call("getNthAnnotationString", className, i);
      if (!r.error.isPresent()) list.add(ScriptingHelper.killTrailingQuotes(r.result));
    }
    
    return list;
  }
  
  public List<String> getChildren(String className) {
    Result result = client.call("getClassNames", className);
    return toStringArray(result.result);
  }
  
  public List<String> getInheritedClasses(String className) {
    Result result = client.call("getInheritedClasses", className);
    return toStringArray(result.result);
  }
  
  public ClassInformation getClassInformation(String className) {
    Result r = client.call("getClassInformation", className);
    List<String> list = toStringArray(r.result, true, false);
    TYPE t;
    try {
      t = TYPE.valueOf(list.get(0).replaceAll(" ", "_").toUpperCase());
    } catch (Exception e) {
      t = TYPE.NULL;
    }
  
    return new ClassInformation(
                                   t,
                                   list.get(1),
                                   getPath(list.get(5)),
                                   Boolean.parseBoolean(list.get(6)),
                                   Integer.parseInt(list.get(7)),
                                   Integer.parseInt(list.get(9)),
                                   Integer.parseInt(list.get(8)),
                                   Integer.parseInt(list.get(10)));
  }
  
  public List<Map<String, String>> getVariables(String className) throws IOException {
    return getVariables(className, getClassInformation(className));
  }
  
  public List<Map<String, String>> getVariables(String className, ClassInformation ci) throws IOException {
    List<Map<String, String>> list = getComponents(className);
    for (Map<String, String> m : list) {
      Pattern regex = Pattern.compile(String.format("%s(\\[.*?\\])? %s[\\W]", m.get("type"), m.get("name")));
      
      try (Stream<String> lines = Files.lines(ci.getFileName())) {
        lines.limit(ci.getLineNumberEnd()).skip(ci.getLineNumberStart() - 1).filter(new Predicate<String>() {
          Boolean match = false;
          
          @Override
          public boolean test(String s) {
            Boolean alwaysReturn = false;
            if (regex.matcher(s).find()) alwaysReturn = match = true;
            if (lineEnd.matcher(s).find()) {
              if (match) alwaysReturn = true;
              match = false;
            }
            return alwaysReturn || match;
          }
        }).map(String::trim).reduce((s, s2) -> s + s2).ifPresent(s -> {
          m.put("isParam", Boolean.toString(s.trim().startsWith("parameter")));
          if (s.contains("annotation")) m.put("annotation", s.substring(s.indexOf("annotation(")));
          m.put("line", s);
        });
      }
    }
    
    return list;
  }
  
  private List<Map<String, String>> getComponents(String className) throws IOException {
    List<Map<String, String>> list = new ArrayList<>();
    Result r = client.call("getComponentsTest", className);
    ANTLRInputStream is;
    ComponentsParser p;
    is = new ANTLRInputStream(new ByteArrayInputStream(r.result.getBytes()));
    p = new ComponentsParser(new CommonTokenStream(new ComponentsLexer(is)));
    ComponentsParser.ComponentsContext cs = p.components();
    for (ComponentsParser.ComponentContext c : cs.component()) {
      Map<String, String> m = new HashMap<>();
      list.add(m);
      m.put("type", ScriptingHelper.killTrailingQuotes(c.className().val.getText()));
      m.put("name", ScriptingHelper.killTrailingQuotes(c.name().val.getText()));
      m.put("comment", ScriptingHelper.killTrailingQuotes(c.comment().val.getText()));
      m.put("isProtected", ScriptingHelper.killTrailingQuotes(c.isProtected().val.getText()));
      m.put("isFinal", ScriptingHelper.killTrailingQuotes(c.isFinal().val.getText()));
      m.put("isFlow", ScriptingHelper.killTrailingQuotes(c.isFlow().val.getText()));
      m.put("isStream", ScriptingHelper.killTrailingQuotes(c.isStream().val.getText()));
      m.put("isReplaceable", ScriptingHelper.killTrailingQuotes(c.isReplaceable().val.getText()));
      m.put("variability", ScriptingHelper.killTrailingQuotes(c.variability().val.getText()));
      m.put("innerOuter", ScriptingHelper.killTrailingQuotes(c.innerOuter().val.getText()));
      m.put("inputOutput", ScriptingHelper.killTrailingQuotes(c.inputOutput().val.getText()));
      m.put("dimensions", ScriptingHelper.killTrailingQuotes(c.dimensions().val.getText()));
    }
    
    return list;
  }
  
  List<Map<String, String>> getConnections(String className) {
    return getConnections(className, getClassInformation(className));
  }
  
  public List<Map<String, String>> getConnections(String className, ClassInformation ci) {
    List<String> equations = getEquations(className, ci);
    
    return equations.stream().collect(ArrayList::new, new BiConsumer<ArrayList<String>, String>() {
      String tmp = "";
      
      @Override
      public void accept(ArrayList<String> objects, String s) {
        if (s.trim().startsWith("connect(")) tmp = "";
        tmp += s.trim();
        if (s.trim().endsWith(";")) {
          if (tmp.startsWith("connect(") && tmp.contains("annotation")) objects.add(tmp);
        }
      }
    }, ArrayList::addAll).stream().map(s -> {
      Map<String, String> map = new HashMap<>();
      Pattern p = Pattern.compile("connect\\(\\s*([^,)\\s]+)\\s*,\\s*([^,)\\s]+)\\s*\\)\\s");
      Matcher m = p.matcher(s);
      if (m.find()) {
        map.put("from", m.group(1));
        map.put("to", m.group(2));
        map.put("annotation", m.replaceAll(""));
      }
      return Collections.unmodifiableMap(map);
    }).filter(map -> !map.isEmpty()).collect(ImmutableListCollector.toImmutableList());
  }
  
  @SuppressWarnings("unchecked")
  private List<String> getClassWithoutContainingClasses(String className, ClassInformation ci) {
    try (Stream<String> lines = Files.lines(ci.getFileName())) {
      return lines.limit(ci.getLineNumberEnd()).skip(ci.getLineNumberStart() - 1).filter(new Predicate<String>() {
        List<String> names = new ArrayList<>();
        
        @Override
        public boolean test(String s) {
          Matcher m = modelTypeAndName.matcher(s);
          if (m.matches()) {
            if (className.endsWith(m.group("name"))) return false;
            names.add(m.group("name"));
          } else {
            m = modelEnd.matcher(s);
            if (m.matches()) {
              if (names.size() == 0) return false;
              names.remove(m.group("name"));
            }
          }
          
          return names.size() == 0;
        }
      }).collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
      return Collections.EMPTY_LIST;
    }
  }
  
  @SuppressWarnings("unchecked")
  private List<String> getEquations(String className, ClassInformation ci) {
    Result r = client.call("getEquationCount", className);
    Integer blockCount = Integer.parseInt(r.result);
    r = client.call("getEquationItemsCount", className);
    Integer itemsCount = Integer.parseInt(r.result);
    if (blockCount == 0 || itemsCount == 0) return Collections.EMPTY_LIST;
    
    List<String> list = getClassWithoutContainingClasses(className, ci);
    
    return list.stream().filter(s -> s.trim().startsWith("connect")).collect(Collectors.toList());
  }
  
  void disconnect() {
    try {
      client.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  
  private List<String> toStringArray(String s) {
    return toStringArray(s, true, true);
  }
  
  private List<String> toStringArray(String s, Boolean unsorted, Boolean removeEmpty) {
    List<String> l = ScriptingHelper.fromNestedArray(s);
    Stream<String> stream = l.stream();
    stream = stream.map(ScriptingHelper::killTrailingQuotes);
  
    if (removeEmpty) stream = stream.filter(s1 -> !s1.isEmpty());
    if (!unsorted) stream = stream.sorted(String::compareToIgnoreCase);
  
    return stream.collect(ImmutableListCollector.toImmutableList());
  }
  
  private List<Pair<String, Path>> toLibraryArray(String s) {
    //TODO: ScriptingHelper.fromNestedArrayToNestedList(s)
    List<String> tmp = toStringArray(s);
    List<Pair<String, Path>> list = new ArrayList<>();
    for (int i = 0; i < tmp.size(); i += 2) {
      list.add(new ImmutablePair<>(tmp.get(i), Paths.get(tmp.get(i + 1))));
    }
    return list;
  }
  
  public Path getPath(String path) {
    Result r = client.call("uriToFilename", ScriptingHelper.asString(path));
    return Paths.get(toStringArray(r.result).get(0));
  }
}
