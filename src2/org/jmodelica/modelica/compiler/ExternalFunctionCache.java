package org.jmodelica.modelica.compiler;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.HashMap;
import java.util.Locale;
import org.jmodelica.util.BinaryOperation;
import org.jmodelica.util.collections.ConstArrayIterator;
import org.jmodelica.util.collections.SingleIterator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.LinkedHashSet;
import java.util.Set;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.math.BigInteger;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.DigestOutputStream;
import java.security.NoSuchAlgorithmException;
import org.jmodelica.util.streams.StreamGobbler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.jmodelica.util.logging.StreamingLogger;
import org.jmodelica.util.logging.Level;
import org.jmodelica.util.AbstractModelicaScanner;
import java.io.ByteArrayOutputStream;
import org.jmodelica.util.streams.CodeStream;
import org.jmodelica.util.streams.NotNullCodeStream;
import java.util.TreeSet;
import org.jmodelica.util.ErrorCheckType;
import org.jmodelica.util.problemHandling.SimpleProblemProducer;
import org.jmodelica.util.problemHandling.SimpleWarningProducer;
import org.jmodelica.util.problemHandling.SimpleErrorProducer;
import org.jmodelica.util.problemHandling.ComplianceFMUOnlyProducer;
import java.util.LinkedList;
import org.jmodelica.util.collections.ListMap;
import org.jmodelica.util.collections.LinkedHashListMap;
import org.jmodelica.api.problemHandling.Problem;
import org.jmodelica.api.problemHandling.ProblemSeverity;
import org.jmodelica.api.problemHandling.ProblemKind;
import org.jmodelica.util.problemHandling.ReporterNode;
import org.jmodelica.util.problemHandling.ProblemOptionsProvider;
import org.jmodelica.util.Criteria;
import org.jmodelica.util.problemHandling.ErrorProducerUnlessDisabled;
import org.jmodelica.util.problemHandling.AbstractErrorProducerUnlessDisabled;
import org.jmodelica.util.collections.ReverseListIterable;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import org.jmodelica.util.Enumerator;
import java.util.Stack;
import org.jmodelica.util.collections.FilteredIterator;
import java.util.SortedSet;
import java.util.Comparator;
import java.io.*;
import org.jmodelica.util.OptionRegistry;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.jmodelica.util.collections.ChainedIterator;
import org.jmodelica.util.formattedPrint.FormattingInfo;
import org.jmodelica.util.formattedPrint.FormattingItem;
import org.jmodelica.util.formattedPrint.EmptyFormattingItem;
import org.jmodelica.util.formattedPrint.FormattingLocator;
import org.jmodelica.util.formattedPrint.DefaultFormattingItem;
import org.jmodelica.util.formattedPrint.ScannedFormattingItem;
import beaver.Symbol;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.IdentityHashMap;
import org.jmodelica.util.streams.NullStream;
import org.jmodelica.util.problemHandling.SanityProblemProducer;
import java.util.EnumSet;
import org.jmodelica.util.collections.ParallelIterable;
import org.jmodelica.util.munkres.DenseMunkresProblem;
import org.jmodelica.util.munkres.IntegerCost;
import java.util.BitSet;
import org.jmodelica.util.exceptions.BLTException;
import org.jmodelica.util.collections.ChainedIterable;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.Random;
import org.jmodelica.util.collections.HashStack;
import org.jmodelica.util.exceptions.MunkresException;
import org.jmodelica.util.exceptions.IndexReductionException;
import org.jmodelica.util.munkres.SparseMunkresProblem;
import org.jmodelica.util.munkres.MunkresProblem;
import org.jmodelica.util.munkres.MunkresCost;
import org.jmodelica.util.Solvability;
import java.lang.reflect.Constructor;
import org.jmodelica.util.XMLUtil;
import java.io.OutputStream;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import org.jmodelica.util.test.GenericTestCase;
import org.jmodelica.util.test.Assert;
import org.jmodelica.util.CompiledUnit;
import org.jmodelica.util.logging.units.LoggingUnit;
import org.jmodelica.util.test.GenericTestSuite;
import org.jmodelica.util.test.TestTree;
import org.jmodelica.util.AbstractFlatModelicaScanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jmodelica.util.streams.CStringCodeStream;
import org.jmodelica.util.exceptions.CompilerException;
import java.util.Deque;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.InterruptedException;
import java.lang.StringBuilder;
import java.nio.channels.FileChannel;
import java.util.Hashtable;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.jmodelica.util.logging.ModelicaLogger;
import org.jmodelica.util.logging.MemoryLogger;
import org.jmodelica.util.OptionRegistry.UnknownOptionException;
import org.jmodelica.util.Arguments;
import org.jmodelica.util.SymbolValueFixer;
import org.jmodelica.util.exceptions.ModelicaException;
import org.jmodelica.util.exceptions.InternalCompilerError;
import org.jmodelica.util.MemorySpider;
import org.jmodelica.util.exceptions.IllegalCompilerArgumentException;
import org.jmodelica.util.exceptions.ModelicaClassNotFoundException;
import org.jmodelica.util.exceptions.PackingFailedException;
import org.jmodelica.util.exceptions.CcodeCompilationException;
import org.jmodelica.util.problemHandling.ProblemProducer;
import org.jmodelica.util.PassAndForget;
import org.jmodelica.util.logging.IllegalLogStringException;
import org.jmodelica.util.streams.CloneOutputStream;
import org.xml.sax.SAXException;
/**
 * @ast class
 * @aspect ExternalConstantEvaluationCaching
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:214
 */
public class ExternalFunctionCache extends Object {
    public static ExternalFunction failedEval(FExternalStmt ext, String msg) {
        return new FailedExternalFunction(failedEvalMsg(ext, msg));
    }

    public static String failedEvalMsg(FExternalStmt ext, String msg) {
        return "Failed to evaluate external function '" + ext.getName() + "', " + msg;
    }

    
        
        /**
         * Maps external functions names to compiled executables.
         */
        private Map<String, ExternalFunction> cachedExternals = new HashMap<String, ExternalFunction>();

    
        
        /**
         * Keeps track of all living processes, least recently used first.
         */
        private LinkedHashSet<ExternalFunction> livingCachedExternals = new LinkedHashSet<ExternalFunction>();

    
        
        private ModelicaCompiler mc;

    
        
        public ExternalFunctionCache(ModelicaCompiler mc) {
            this.mc = mc;
        }

    
        
        /**
         * If there is no executable corresponding to <code>ext</code>, create one.
         */
        public ExternalFunction getExternalFunction(FExternalStmt ext) {
            ExternalFunction ef = cachedExternals.get(ext.getName());
            if (ef == null) {
                if (mc == null) {
                    return ExternalFunctionCache.failedEval(ext, "ModelicaCompiler unavailable");
                }
                try {
                    String executable = mc.compileExternal(ext);
                    if (ext.shouldCacheExternalObject()) {
                        ef = new MappedExternalFunction(ext, executable);
                    } else {
                        ef = new CompiledExternalFunction(ext, executable);
                    }
                    ModelicaCompiler.log.debug("Succesfully compiled external function '" + ext.getName() + 
                            "' to executable '" + executable + "' code for evaluation");
                } catch (FileNotFoundException e) {
                    ef = ExternalFunctionCache.failedEval(ext, "c-code generation failed '" + e.getMessage() + "'");
                    ModelicaCompiler.log.debug(ef.getMessage());
                } catch (CcodeCompilationException e) {
                    ef = ExternalFunctionCache.failedEval(ext, "c-code compilation failed '" + e.getMessage() + "'");
                    ModelicaCompiler.log.debug(ef.getMessage());
                    e.printStackTrace(new PrintStream(ModelicaCompiler.log.debugStream()));
                }
                cachedExternals.put(ext.getName(), ef);
            }
            return ef;
        }

    
        
        /**
         * Remove executables compiled by the constant evaluation framework.
         */
        public void removeExternalFunctions() {
            for (ExternalFunction ef : cachedExternals.values()) {
                ef.remove();
            }
            cachedExternals.clear();
        }

    
        
        /**
         * Kill cached processes
         */
        public void destroyProcesses(OptionRegistry options) {
            int timeout = options.getIntegerOption("external_constant_evaluation");
            for (ExternalFunction ef : new ArrayList<ExternalFunction>(livingCachedExternals)) {
                ef.destroyProcess(timeout);
            }
        }

    
        
        public void tearDown(OptionRegistry options) {
            destroyProcesses(options);
            removeExternalFunctions();
        }

    
        
        /**
         * Represents an external function that can be evaluated using {@link ExternalFunction.evaluate}.
         */
        public static abstract class ExternalFunction {
            public abstract int evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout)
                    throws IOException;
            public abstract void destroyProcess(int timeout);
            public abstract void remove();
            public abstract String getMessage();
        }

    
        
        
        /**
         * Represents an external function that for some reason fail to evaluate.
         */
        private static class FailedExternalFunction extends ExternalFunction {
            private String s;
            
            public FailedExternalFunction(String s) {
                this.s = s;
            }
            
            public String getMessage() {
                return s;
            }
            
            @Override
            public int evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout) 
                    throws IOException {
                ModelicaCompiler.log.debug("Evaluating failed external function: " + ext.getName());
                throw new ConstantEvaluationException(null, getMessage());
            }
            
            @Override
            public void destroyProcess(int timeout) {
                // Do nothing.
            }
            
            @Override
            public void remove() {
                // Do nothing.
            }
        }

    
        
        /**
         * Represents an external function that has been compiled successfully.
         */
        private class CompiledExternalFunction extends ExternalFunction {
            protected String executable;
            protected ProcessBuilder processBuilder;
            private String msg;
            
            public CompiledExternalFunction(FExternalStmt ext, String executable) {
                this.executable = executable;
                this.processBuilder = createProcessBuilder(ext);
                this.msg = "Succesfully compiled external function '" + ext.getName() + "'";
            }
            
            public String getMessage() {
                return msg;
            }
            
            protected ProcessCommunicator createProcessCommunicator(FExternalStmt ext) throws IOException {
                return new ProcessCommunicator(processBuilder.start());
            }
            
            @Override
            public int evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout) 
                    throws IOException {
                ModelicaCompiler.log.debug("Evaluating compiled external function: " + ext.getName());
                ProcessCommunicator com = null;
                try {
                    com = createProcessCommunicator(ext);
                    setup(ext, values, timeout, com);
                    evaluate(ext, values, timeout, com);
                    return teardown(timeout, com);
                } finally {
                    if (com != null) {
                        com.destroy();
                    }
                }
            }
            
            public void setup(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout,
                    ProcessCommunicator com) throws IOException {
                com.startTimer(timeout);
                com.accept("START");
                for (CommonVariableDecl eo : ext.externalObjectsToSerialize()) {
                    com.put(values.containsKey(eo) ? values.get(eo) : eo.ceval(), eo.type());
                }
                com.accept("READY");
                com.cancelTimer();
            }
            
            public void evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout,
                    ProcessCommunicator com) throws IOException {
                com.startTimer(timeout);
                com.check("EVAL");
                
                for (CommonVariableDecl arg : ext.functionArgsToSerialize()) {
                    com.put(values.containsKey(arg) ? values.get(arg) : arg.ceval(), arg.type());
                }
                com.accept("CALC");
                com.accept("DONE");
                for (CommonVariableDecl cvd : ext.varsToDeserialize())
                    values.put(cvd, com.get(cvd.type()));
                com.accept("READY");
                com.cancelTimer();
            }
            
            public int teardown(int timeout, ProcessCommunicator com) throws IOException {
                com.startTimer(timeout);
                com.check("EXIT");
                com.accept("END");
                int result = com.end();
                com.cancelTimer();
//                ModelicaCompiler.log.debug("SUCCESS TEARDOWN");
                return result;
            }
            
            @Override
            public void destroyProcess(int timeout) {
                
            }
            
            @Override
            public void remove() {
                new File(executable).delete();
            }
            
            private ProcessBuilder createProcessBuilder(FExternalStmt ext) {
                ProcessBuilder pb = new ProcessBuilder(executable);
                Map<String,String> env = pb.environment();
                if (env.keySet().contains("Path")) {
                    env.put("PATH", env.get("Path"));
                    env.remove("Path");
                }
                pb.redirectErrorStream(true);
                if (ext.libraryDirectory() != null) {
                    // Update environment in case of shared library
                    String platform = ModelicaCompiler.reduceBits(ModelicaCompiler.getPlatform(), 
                            mc.getCCompiler().getTargetPlatforms());
                    File f = new File(ext.libraryDirectory(), platform);
                    String libLoc = f.isDirectory() ? f.getPath() : ext.libraryDirectory();
                    appendPath(env, libLoc, platform);
                }
                return pb;
            }
            
            /**
             * Append a library location <code>libLoc</code> to the path variable in environment <code>env</code>.
             */
            private void appendPath(Map<String,String> env, String libLoc, String platform) {
                String sep = platform.startsWith("win") ? ";" : ":";
                String var = platform.startsWith("win") ? "PATH" : "LD_LIBRARY_PATH";
                String res = env.get(var);
                if (res == null)
                    res = libLoc;
                else
                    res = res + sep + libLoc;
                env.put(var, res);
            }
        }

    
        
        /**
         * A CompiledExternalFunction which can cache several processes with 
         * external object constructor only called once.
         */
        private class MappedExternalFunction extends CompiledExternalFunction {
            
            private Map<String, ExternalFunction> lives = new HashMap<String, ExternalFunction>();
            
            private final int externalConstantEvaluationMaxProc;
            
            public MappedExternalFunction(FExternalStmt ext, String executable) {
                super(ext, executable);
                externalConstantEvaluationMaxProc = ext.myOptions().getIntegerOption("external_constant_evaluation_max_proc");
            }
            
            /**
             * Find a LiveExternalFunction based on the external object of this external function.
             * Start a new process if not up already. Failure to set up (call constructor) will
             * cache and return a Failed external function.
             */
            private ExternalFunction getActual(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout) {
                CommonVariableDecl cvd = ext.cachedExternalObject();
                String name = cvd.ceval().getMarkedExternalObject();
                ExternalFunction ef = lives.get(name);
                if (ef == null) {
                    LiveExternalFunction lef = new LiveExternalFunction(name);
                    try {
                        lef.ready(ext, values, timeout);
                        ef = lef;
                    } catch (IOException e) {
                        lef.destroyProcess(timeout);
                        ef = ExternalFunctionCache.failedEval(ext, " error starting process '" + e.getMessage() + "'");
                    } catch (ConstantEvaluationException e) {
                        lef.destroyProcess(timeout);
                        ef = ExternalFunctionCache.failedEval(ext, " error starting process '" + e.getMessage() + "'");
                    }
                    lives.put(name, ef);
                }
                return ef;
            }
            
            @Override
            public int evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout) 
                    throws IOException {
                return getActual(ext, values, timeout).evaluate(ext, values, timeout);
            }
            
            @Override
            public void destroyProcess(int timeout) {
                for (ExternalFunction ef : lives.values()) {
                    ef.destroyProcess(timeout);
                }
                lives.clear();
            }
            
            /**
             * Represents a (possible) living external function process.
             */
            private class LiveExternalFunction extends ExternalFunction {
                
                private String name;
                
                protected ProcessCommunicator com;
                
                public LiveExternalFunction(String name) {
                    this.name = name;
                }
                
                public String getMessage() {
                    return MappedExternalFunction.this.getMessage();
                }
                
                @Override
                public int evaluate(FExternalStmt ext, Map<CommonVariableDecl, CValue> values, int timeout) 
                        throws IOException {
                    ModelicaCompiler.log.debug("Evaluating live external function: " + ext.getName());
                    try {
                        ready(ext, values, timeout);
                        MappedExternalFunction.this.evaluate(ext, values, timeout, com);
                    } catch (ProcessCommunicator.AbortConstantEvaluationException e) {
                        
                    } catch (ConstantEvaluationException e) {
                        destroyProcess(timeout);
                        throw e;
                    } catch (IOException e) {
                        destroyProcess(timeout);
                        throw e;
                    }
                    return 0;
                }
                
                /**
                 * Make sure process is ready for evaluation call.
                 */
                protected void ready(FExternalStmt ext, Map<CommonVariableDecl, 
                        CValue> values, int timeout) throws IOException {
                    if (com == null) {
                        // Start process if not live.
                        com = createProcessCommunicator(ext);
                        // Send external object constructor inputs
                        MappedExternalFunction.this.setup(ext, values, timeout, com);
                        ModelicaCompiler.log.debug("Setup live external function: " + ext.getName());
                    }
                    
                    // Mark as most recently used
                    livingCachedExternals.remove(this);
                    livingCachedExternals.add(this);
                    
                    // If we are over the allowed number of cached processes
                    // we kill the least recently used.
                    if (livingCachedExternals.size() > externalConstantEvaluationMaxProc) {
                        livingCachedExternals.iterator().next().destroyProcess(timeout);
                    }
                }
                
                @Override
                public void destroyProcess(int timeout) {
                    if (com != null) {
                        livingCachedExternals.remove(this);
                        try {
                            teardown(timeout, com);
                        } catch (IOException e) {
                        } catch (ConstantEvaluationException e) {
                        }
                        com.destroy();
                        com = null;
                    }
                }
                
                @Override
                public void remove() {
                    // Removing this executable is handled by surrounding MappedExternalFunction
                    throw new UnsupportedOperationException();
                }
            }
        }


}
