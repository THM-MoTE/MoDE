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
 * @aspect CompilationHelpers
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/ModelicaCompiler.jrag:2559
 */
public abstract class CCompilerDelegator extends Object {
    
    
    private static Map<String,Creator> CREATORS = creators();

    
    
    private static Map<String,Creator> creators() {
        if (CREATORS == null)
            CREATORS = new HashMap<String,Creator>();
        return CREATORS;
    }

    
    
    private static final Creator GCC = addDelegator(GccCompilerDelegator.NAME, new Creator() {
        public CCompilerDelegator create() {
            return new GccCompilerDelegator();
        }
    });

    
    
    public static final String OPTION = "c_compiler";

    
    public static final String OPTION_DESC = "The C compiler to use to compile generated C code.";

    
    
    public interface Creator {
        public CCompilerDelegator create();
    }

    
    
    /**
     * Add support for a new compiler delegator.
     * 
     * @param name     a short name for the delegator that the user can use to select it
     * @param creator  the creator for the delegator class
     */
    public static Creator addDelegator(String name, Creator creator) {
        if (creators().containsKey(name))
            throw new IllegalArgumentException("Compiler delegator name " + name + 
                    " is already used by " + CREATORS.get(name).create().getClass().getSimpleName());
        creators().put(name, creator);
        return creator;
    }

    
    
    /**
     * Create a C compiler delegator for the given set of options.
     */
    public static CCompilerDelegator delegatorFor(String c_compiler) {
        return creators().get(c_compiler).create();
    }

    
    
    public static void addCompilerOptionValues(OptionRegistry opt) {
        for (String name : creators().keySet())
            opt.addStringOptionAllowed(OPTION, name);
    }

    
    
    private static Map<String, String> env = System.getenv();

    
    private String[] targetPlatforms = null;

    
    
    protected java.util.List<String> moduleLibNames;

    
    
    public void setModuleLibraryNames(java.util.List<String> names) {
        moduleLibNames = names;
    }

    
    
    protected abstract String compilerVersionNumber();

    
    
    public Set<String> expandLibraries(Set<String> paths, String compilerType, String versionNumber, String platform) {
        Set<String> newPaths = new LinkedHashSet<String>();
        for (String path : paths) {
            String platformed = path + "/" + platform;
            
            if (versionNumber != null) {
                String compilered = platformed + "/" + compilerType + versionNumber;
                newPaths.add(compilered);
            }
            
            newPaths.add(platformed);
        }
        return newPaths;
    }

    
    
    public static class Arguments {
        private String fileName;
        private OptionRegistry options;
        private ModelicaCompiler.TargetObject target;
        
        Set<String> externalLibraries;
        Set<String> externalLibraryDirectories;
        Set<String> externalIncludeDirectories;
        
        public Arguments(String fileName, FClass fc, ModelicaCompiler.TargetObject target) {
            this(fileName, fc.myOptions(), target, fc.externalLibraries(), fc.externalLibraryDirectories(), 
                    fc.externalIncludeDirectories());
        }
        
        public Arguments(String fileName, OptionRegistry options, ModelicaCompiler.TargetObject target, 
                Set<String> externalLibraries, Set<String> externalLibraryDirectories, 
                Set<String> externalIncludeDirectories) {
            
            this.fileName = fileName;
            this.options = options;
            this.target = target;
            
            this.externalLibraries = externalLibraries;
            this.externalLibraryDirectories = externalLibraryDirectories;
            this.externalIncludeDirectories = externalIncludeDirectories;
        }
        
        public OptionRegistry getOptions() {
            return options;
        }
        
        public String getFileName() {
            return fileName;
        }
        
        public ModelicaCompiler.TargetObject getTarget() {
            return target;
        }
        
        public Set<String> getExternalLibraries() {
            return externalLibraries;
        }
        
        public Set<String> getExternalLibraryDirectories() {
            return externalLibraryDirectories;
        }
        
        public Set<String> getExternalIncludeDirectories() {
            return externalIncludeDirectories;
        }
        
        public int getMaxProc() {
            return options.getIntegerOption("max_n_proc");
        }
        
        public String getExtraCFlags() {
            return target.createExtraCFlagsString(options, fileName);
        }
    }

    
    
    /**
     * Compile DLL(s) from generated C code.
     */
    public final void compileCCode(Arguments args, File workDir) {
        compileCCode(args, workDir, getTargetPlatforms());
    }

    
    
    /**
     * Compile an executable for build platform.
     */
    public final String compileCCodeLocal(Arguments args, File workDir) {
        String[] platform = {ModelicaCompiler.reduceBits(ModelicaCompiler.getPlatform(), getTargetPlatforms())};
        compileCCode(args, workDir, platform);
        File dir = new File(workDir, "binaries");
        File executable = new File(dir, args.getFileName() + (platform[0].startsWith("win") ? ".exe" : ""));
        return executable.getAbsolutePath();
    }

    
    
    /**
     * Compile DLL(s) from generated C code for a set of target platforms.
     */
    protected abstract void compileCCode(Arguments args, File workDir, String[] platforms);

    
    
    abstract protected String[] getDefaultTargetPlatforms();

    
    
    protected String[] getTargetPlatforms() {
        if (targetPlatforms != null)
            return targetPlatforms;
        else
            return getDefaultTargetPlatforms();
    }

    
    
    public void setTargetPlatforms(String[] platforms) {
        targetPlatforms = platforms;
    }

    
    
    /**
     * Copy shared libs to binaries[\<platform>] folder.
     */
    public void copySharedLibs(File outDir, Set<String> ext_libs, 
            Set<String> ext_lib_dirs) {
        for (String platform : getTargetPlatforms()) {
            StringOperation po = new PlatformDirOperation(platform);
            StringOperation sh = new SharedLibOperation(platform);
            for (String dir : ext_lib_dirs) {
                String dirpath = po.op(dir);
                for (String lib : ext_libs) {
                    String libname = sh.op(lib);
                    File shlib = new File(dirpath, libname);
                    if (shlib.exists()) {
                        String destfile = "binaries" + File.separator + platform + File.separator + libname; 
                        File destdir = new File(outDir, destfile);
                        try {
                            copyFile(shlib, destdir);
                        } catch (IOException e) {
                            // TODO: this should result in an error message about failing copy shared libs
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    
    
    public static Map<String, String> getEnv() {
        return env;
    }

    
    
    /**
     * Format a list of values into space-separated.
     */
    protected String varFromList(Collection<String> list) {
        return varFromList(list, StringOperation.NULL_OP);
    }

    
    
    /**
     * Format a list of values into a form understood by make (i.e. space-separated).
     * 
     * Applies op to each value before adding it to the result.
     */
    protected String varFromList(Collection<String> list, StringOperation op) {
        StringBuilder buf = new StringBuilder();
        String prefix = "";
        for (String str : list) {
            str = op.op(str);
            if (str != null) {
                buf.append(prefix);
                buf.append(str);
                prefix = " ";
            }
        }
        return (buf.length() == 0) ? null : buf.toString();
    }

    
    
    protected interface StringOperation {
        
        public static final StringOperation NULL_OP = new StringOperation() {
            public String op(String str) { return str; }
        };
        
        public String op(String str);
        
    }

    
    
    protected static class ChainedOperations implements StringOperation {
        
        private StringOperation[] ops;
        
        public ChainedOperations(StringOperation... ops) {
            this.ops = ops;
        }
        
        public String op(String path) {
            for (StringOperation op : ops)
                path = op.op(path);
            return path;
        }
        
    }

    
    
    protected static class QuoteOperation implements StringOperation {
        
        private String prefix;
        
        public QuoteOperation() {
            this("");
        }
        
        public QuoteOperation(String prefix) {
            this.prefix = prefix;
        }
        
        public String op(String path) {
            if (ModelicaCompiler.getPlatform().startsWith("win")) {
                return String.format("%s\\\"%s\\\"", prefix, path);
            } else {
                return String.format("%s\"%s\"", prefix, path);
            }
        }
    }

    
    
    protected static class PlatformDirOperation implements StringOperation {
        
        private String platform;
        
        public PlatformDirOperation(String platform) {
            this.platform = platform;
        }
        
        public String op(String path) {
            File f = new File(path, platform);
            return f.isDirectory() ? f.getPath() : path;
        }
    }

    
    
    protected static class SharedLibOperation implements StringOperation {
        
        private String format;
        
        public SharedLibOperation(String platform) {
            if (platform.startsWith("win")) 
                format = "%s.dll";
            else if (platform.startsWith("darwin")) 
                format = "lib%s.dylib";
            else
                format = "lib%s.so";
        }
        
        public String op(String library) {
            return String.format(format, library);
        }

    }

    
    
    
    protected static void copyFile(File sourceFile, File destFile) throws IOException {
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            long count =0;
            long size = source.size();
            while( (count += destination.transferFrom(source, 0, size-count)) < size);
        }
        
        finally {
            if(source != null) 
                source.close();
            
            if(destination != null)
                destination.close();
        }
    }

    
    
    protected static Object printStringArrayObject(final String[] strArr) {
        return new Object() {
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                boolean first = true;
                for (String str : strArr) {
                    if (!first)
                        sb.append(' ');
                    first = false;
                    sb.append(str);
                }
                return sb.toString();
            }
        };
    }


}
