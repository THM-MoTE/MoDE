package de.thm.mni.mhpp11.util.parser;

import de.thm.mni.mhpp11.util.config.Settings;
import omc.corba.OMCClient;
import omc.corba.OMCInterface;
import omc.corba.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hobbypunk on 27.09.16.
 */
public class OMCompiler {
  
  public enum TYPE {
    TYPE,
    PACKAGE,
    CLASS,
    RECORD,
    FUNCTION,
    MODEL,
    CONNECTOR,
    ENUM,
    NULL
  }
  
  Settings settings;
  OMCInterface client;
  Boolean libsLoaded = false;
  
  List<String> systemLibraries = new ArrayList<>();
  
  public OMCompiler() throws IOException {
    settings = Settings.load();
    client = new OMCClient(settings.getModelica().getOmc().getPath(), settings.getLang().toString());
    client.connect();
    this.preloadLibraries();
  }
  
  private void preloadLibraries() {
    Thread t = new Thread(() -> {
      for (String s : OMCompiler.this.getAvailableLibraries()) {
        client.sendExpression("loadModel(" + s + ")");
      }
      getSystemLibraries();
      libsLoaded = true;
    });
    t.run();
  }
  
  private List<String> getAvailableLibraries() {
    Result result = client.sendExpression("getAvailableLibraries()");
    return toStringArray(result.result);
  }
  
  public List<String> getSystemLibraries() {
    if (systemLibraries.isEmpty())
      systemLibraries.addAll(getLibraries(true));
    
    return systemLibraries;
  }
  
  public List<String> getLibraries() {
    return getLibraries(false);
  }
  
  private List<String> getLibraries(Boolean ignoreLoaded) {
    Result result = sendExpression("getLoadedLibraries()", ignoreLoaded);
    List<String> tmp = new ArrayList<>();
    for (String s : toStringArray(result.result))
      if (!(s.startsWith("/") || s.startsWith("Obsolete") || s.contains("Test") || systemLibraries.contains(s)))
        tmp.add(s);
    
    return tmp;
  }
  
  public String getDescription(String className) {
    Result result = sendExpression("getClassComment(" + className + ")");
    return result.result;
  }
  
  public List<String> getChildren(String className) {
    Result result = sendExpression("getClassNames(" + className + ")");
    return toStringArray(result.result);
  }
  
  public TYPE getType(String className) {
    Result r;
    
    r = sendExpression("isType(" + className + ")");
    if (r.result.contains("true")) return TYPE.TYPE;
    
    r = sendExpression("isPackage(" + className + ")");
    if (r.result.contains("true")) return TYPE.PACKAGE;
    
    r = sendExpression("isClass(" + className + ")");
    if (r.result.contains("true")) return TYPE.CLASS;
    
    r = sendExpression("isRecord(" + className + ")");
    if (r.result.contains("true")) return TYPE.RECORD;
    
    r = sendExpression("isFunction(" + className + ")");
    if (r.result.contains("true")) return TYPE.FUNCTION;
    
    r = sendExpression("isModel(" + className + ")");
    if (r.result.contains("true")) return TYPE.MODEL;
    
    r = sendExpression("isConnector(" + className + ")");
    if (r.result.contains("true")) return TYPE.CONNECTOR;
    
    r = sendExpression("isEnumeration(" + className + ")");
    if (r.result.contains("true")) return TYPE.ENUM;
    
    return TYPE.NULL;
  }
  
  public String getDocumentation(String className) {
    Result result = sendExpression("getDocumentationAnnotation(" + className + ")");
    List<String> l = toStringArray(result.result, false);
    if (l.isEmpty()) return null;
    return l.get(0);
  }
  
  public String getIcon(String className) {
    Result result = sendExpression("getIconAnnotation(" + className + ")");
    return result.result.replaceAll("(^\\{)|(\\}$)", "");
  }
  
  
  public void disconnect() {
    waitForLibs();
    try {
      client.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private List<String> toStringArray(String s) {
    return toStringArray(s, true);
  }
  
  private List<String> toStringArray(String s, Boolean sort) {
    List<String> l = Arrays.asList(s.split(","));
    
    for (int i = 0; i < l.size(); i++) {
      l.set(i, l.get(i).replaceAll("(^[\\{\\\"]*)|([\\\"\\}]*$)", ""));
    }
    
    if (sort) l.sort(String::compareToIgnoreCase);
    
    return l;
  }
  
  public Result sendExpression(String s) {
    return sendExpression(s, false);
  }
  
  private Result sendExpression(String s, Boolean ignoreLoaded) {
    if (!ignoreLoaded)
      waitForLibs();
    return client.sendExpression(s);
  }
  
  private void waitForLibs() {
    while (!libsLoaded) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
