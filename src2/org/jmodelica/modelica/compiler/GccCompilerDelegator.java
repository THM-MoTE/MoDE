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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/ModelicaCompiler.jrag:2910
 */
public class GccCompilerDelegator extends CCompilerDelegator {
    
    
    public static final String NAME = "gcc";

    

    public GccCompilerDelegator() {}

    

    /**
     * Get the target platforms to compile for.
     */
    protected String[] getDefaultTargetPlatforms() {
        return new String[] { ModelicaCompiler.getPlatform() };
    }

    
    
    /**
     * Get the path to the Makefile for the specified target platform.
     */
    protected File getMakefile(String jmodelicaHome, String platform) {
        return new File(jmodelicaHome, "Makefiles/MakeFile");
    }

    
    
    /**
     * Get the make command to use for the specified build platform.
     */
    protected String getMake(String platform) {
        if (ModelicaCompiler.getPlatform().startsWith("win")) 
            return new File(getEnv().get("MINGW_HOME"), "bin/mingw32-make").getPath();
        else
            return "make";
    }

    
    
    protected static final QuoteOperation INC_OP = new QuoteOperation("-I");

    
    
    /**
     * Add make variables to set that is valid for all target platforms.
     */
    protected void addFixedMakeVars(Map<String,String> vars, String fileName, String jmodelicaHome, 
            Set<String> ext_libs, Set<String> ext_incl_dirs) {
        String filesep = File.separator;
        vars.put("FILE_NAME", fileName);
        vars.put("JMODELICA_HOME", jmodelicaHome);
        vars.put("CPPAD_HOME", getEnv().get("CPPAD_HOME"));
        vars.put("IPOPT_HOME", getEnv().get("IPOPT_HOME"));
        vars.put("SUNDIALS_HOME", getEnv().get("SUNDIALS_HOME"));
        vars.put("EXT_LIBS", varFromList(ext_libs) != null ?
                      (varFromList(ext_libs) + " " + varFromList(ext_libs)): null);
        vars.put("EXT_INC_DIRS", varFromList(ext_incl_dirs, INC_OP));
        vars.put("JMTABLES_HOME", jmodelicaHome + filesep + "ThirdParty" + filesep + "Tables");
        vars.put("MODULE_HOME", getEnv().get("MODULE_HOME"));
    }

    
    
    /**
     * Add make variables specific to the build platform.
     */
    protected void addBuildPlatformMakeVars(Map<String,String> vars, String platform) {
        if (platform.startsWith("win")) {
            File mingw_bin = new File(getEnv().get("MINGW_HOME"), "bin");
            vars.put("CXX", new File(mingw_bin, "g++").getPath());
            vars.put("AR", new File(mingw_bin, "ar").getPath());
        }
    }

    
    
    /**
     * Add make variables specific to the target platform.
     */
    protected void addTargetPlatformMakeVars(Map<String,String> vars, Set<String> ext_lib_dirs, String platform) {
        vars.put("PLATFORM", platform);
        StringOperation libOp = new ChainedOperations(
                new PlatformDirOperation(platform),
                new QuoteOperation("-L"));
        Set<String> expandedLibDirs = expandLibraries(ext_lib_dirs, "gcc", compilerVersionNumber(), platform);
        vars.put("EXT_LIB_DIRS", varFromList(expandedLibDirs, libOp));
    }

    

    @Override
    public String compilerVersionNumber() {
        String[] cmd = new String[] {
                "gcc", "--version"
        };

        OutputStream os = new ByteArrayOutputStream();
        if (ModelicaCompiler.loggedProcess(cmd, getEnv(), new File("."), os) > 0) {
            return null;
        }
        
        String output = os.toString();
        String[] firstLine = output.split("\n")[0].split(" ");
        String prefix = firstLine[1].contains("tdm") ? "tdm" : "";
        String versionNumber = firstLine[2].replaceAll("\\.", "");
        return prefix + versionNumber.substring(0, versionNumber.length() - 1);
    }

    
    
    /**
     * Compile DLL(s) from generated C code for a set of target platforms.
     */
    protected void compileCCode(Arguments args, File workDir, String[] platforms) {
        String jmodelicaHome = ModelicaCompiler.getJModelicaHome();
        String buildPlatform = ModelicaCompiler.getPlatform();
        String make = getMake(buildPlatform);
        
        Set<String> ext_libs = new LinkedHashSet<String>();
        ext_libs.addAll(args.getExternalLibraries());
        
        if (moduleLibNames != null) {
            for (String name : moduleLibNames) {
                ext_libs.add(name);
            }
        }
        
        Map<String, String> vars = new LinkedHashMap<String, String>();
        addFixedMakeVars(vars, args.getFileName(), jmodelicaHome, ext_libs, args.getExternalIncludeDirectories());
        
        addBuildPlatformMakeVars(vars, buildPlatform);
        
        vars.put("EXTRA_CFLAGS", args.getExtraCFlags());
        
        for (String platform : platforms) {
            Map<String, String> pVars = new LinkedHashMap<String, String>(vars);
            addTargetPlatformMakeVars(pVars, args.getExternalLibraryDirectories(), platform);
            
            File makefile = getMakefile(jmodelicaHome, platform);
            if (!makefile.exists())
                throw new CcodeCompilationException("Makefile '" + makefile + "' does not exist.");
            String makefileVar = "MAKEFILE=" + makefile.getPath();
            String[] mArgs = new String[] { make, "-f", makefile.getPath(), "-j", Integer.toString(args.getMaxProc()), 
                    args.getTarget().getMakeFileFlag(), makefileVar };
            ArrayList<String> vArgs = new ArrayList<String>(pVars.size());
            for (Entry<String,String> var : pVars.entrySet())
                if (var.getValue() != null)
                    vArgs.add(var.getKey() + '=' + var.getValue());
            String[] cmd = new String[mArgs.length + vArgs.size()];
            System.arraycopy(mArgs, 0, cmd, 0, mArgs.length);
            int i = mArgs.length;
            for (String arg : vArgs)
                cmd[i++] = arg;
                
            ASTNode.log.debug("C-code compilation command:");
            ASTNode.log.debug(printStringArrayObject(cmd));

            if (ModelicaCompiler.loggedProcess(cmd, getEnv(), workDir, null) != 0) {
                File sourceDir = new File(workDir, "sources");
                File cfile = new File(sourceDir, args.getFileName()+".c");
                throw new CcodeCompilationException("Compilation of generated C code failed.\n" +
                        "C file location: "+cfile.getAbsolutePath());
            }
        }
    }


}
