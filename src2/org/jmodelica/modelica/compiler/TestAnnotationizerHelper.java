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
 * @aspect TestAnnotationizer
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestAnnotationizer.jrag:50
 */
abstract public class TestAnnotationizerHelper extends Object {
    

    // TODO: Use more code directly from the test case classes.
    
    /**
     * This is the main method for creating the annotation.
     * 
     * @param filePath     the path to the Modelica file containing the test model
     * @param testType     the type of test case (case sensitive)
     * @param modelName    the name of the test model
     * @param description  the text to put in the "description" field of the test annotation
     * @param data         any extra data to send to the delegate object
     * @param opts         comma-separated list of compiler options to override defaults for
     * @param checkType    check type to use when checking
     * @param libs         list of libraries needed
     * @param write        if <code>true</code>, write the annotation directly in the Modelica file
     */
    public static void doAnnotation(String filePath, String testType, String modelName, 
            String description, String[] opts, String data, String checkType, String[] libs, 
            boolean write) throws Exception {
        try {
            Class cl = getTestCase(testType);
            Constructor constructor = cl.getConstructor(String.class, String.class, String.class, String[].class, String.class);
            TestAnnotationizerHelper ta = (TestAnnotationizerHelper) constructor.newInstance(filePath, modelName, description, opts, data);
            ta.setCheckType(checkType);
            ta.setModelicaLibraries(libs);
            ta.createAnnotation(write);
        } catch (Exception e) {
            handleException(e);
        }
    }

    

    /**
     * This is the main method for regenerating an existing annotation.
     * 
     * @param filePath     the path to the Modelica file containing the test model
     * @param modelName    the name of the test model
     * @param write        if <code>true</code>, write the annotation directly in the Modelica file
     */
    public static void doRegenerate(String filePath, String modelName, boolean write) throws Exception {
        try {
            SourceRoot root = parse(filePath, modelName, ModelicaCompiler.createOptions());
            ClassDecl cd = root.getProgram().simpleLookupClassDotted(modelName);
            if (cd.isUnknown()) {
                System.err.println("Class " + modelName + " not found");
                System.exit(1);
            }
            AnnotationNode tests = cd.annotation("__JModelica/UnitTesting/tests");
            AnnotationNode test = AnnotationNode.NO_ANNOTATION;
            for (AnnotationNode n : tests) {
                if (test.exists()) {
                    System.err.println("Multiple test annotations found in class " + modelName + ".");
                    System.err.println("TestAnnotationizer is currently unable to regenerate models with multiple tests!");
                    System.exit(1);
                }
                test = n;
            }
            if (!test.exists()) {
                System.err.println("No test annotation found in class " + modelName);
                System.exit(1);
            }
            Class cl = getTestCase(test.name());
            Constructor constructor = cl.getConstructor(ClassDecl.class, String.class, String.class);
            TestAnnotationizerHelper ta = (TestAnnotationizerHelper) constructor.newInstance(cd, filePath, modelName);
            ta.createAnnotation(write);
        } catch (Exception e) {
            handleException(e);
        }
    }

    

    /**
     * Set type of error checking to be performed.
     * 
     * Available for all test types, but only logical to change for error/warning/compliance tests.
     */
    public void setCheckType(String val) {
        if (val != null)
            checkType = ErrorCheckType.valueOf(ErrorCheckType.class, val.toUpperCase());
    }

    
    
    /**
     * Get type of error checking being performed.
     */
    public ErrorCheckType getCheckType() {
        return (checkType == null) ? ErrorCheckType.COMPILE : checkType;
    }

    

    /**
     * Set list of libraries needed by test.
     */
    public void setModelicaLibraries(String[] val) {
        libs = val;
    }

    

    /**
     * Get list of libraries needed by test as comma-separated string.
     */
    public String getModelicaLibrariesString() {
        StringBuilder buf = new StringBuilder();
        for (String lib : libs) {
            if (buf.length() > 0)
                buf.append(',');
            buf.append(lib);
        }
        return buf.toString();
    }

    

    /**
     * Are there any extra libraries needed by test?
     */
    public boolean hasModelicaLibraries() {
        return libs.length > 0;
    }

    

	/**
	 * Get the test case generator class for the specified test case name (or prefix thereof).
	 */
	private static Class getTestCase(String testType) {
		String ttl = testType.toLowerCase();
		for (Class cl : TestAnnotationizerHelper.class.getClasses()) {
			if (cl.getSimpleName().toLowerCase().startsWith(ttl) && !Modifier.isAbstract(cl.getModifiers())) {
				System.out.println("Creating " + cl.getSimpleName() + "...");
				return cl;
			}
		}
		
		System.out.println("Test type " + testType + " not found.");
		System.exit(1);
		return null;
	}

    
	
	/**
	 * Print error message for exception and exit.
	 */
	private static void handleException(Exception e) {
		System.out.println("Creating annotation failed:");
		Throwable cause = (e instanceof InvocationTargetException) ? e.getCause() : e;
		String message = cause.getMessage();
		if (message == null || !(cause instanceof ModelicaException))
			cause.printStackTrace(System.out);
		else
			System.out.println(message);
		System.exit(1);
	}

    
	
	/**
	 * Prints a help message and exits.
	 * 
	 * Iterates over all available test case types and prints a usage message for each.
	 * 
	 * @param errorLevel  the exit status to pass to System.exit()
	 */
	public static void usageError(int errorLevel) throws Exception {
		System.out.println("Usage: java TestAnnotationizer <.mo file path> [options...] [<description>]");
		System.out.println("  Options:");
		System.out.println("    -w           write result to file instead of stdout");
		System.out.println("    -m/-o        create annotation for Modelica/Optimica (default is infer from file path)");
		System.out.println("    -r           regenerate an already present annotation");
		System.out.println("    -a           regenerate annotations for all models in test file (implies -r)");
		System.out.println("    -l=<libs>    comma-separated list of libraries needed by test (except for MSL)");
		System.out.println("                 paths should be relative to test file");
		System.out.println("    -t=<type>    set type of test, a unique prefix is enough, e.g. Err for ErrorTestCase");
		System.out.println("    -c=<class>   set name of class to generate annotation for, if name ");
		System.out.println("                 does not contain a dot, base name of .mo file is prepended");
		System.out.println("    -d=<data>    set extra data to send to the specific generator, \\n is interpreted");
		System.out.println("    -p=<opts>    comma-separated list of compiler options to override defaults for, ");
		System.out.println("                 example: -p=eliminate_alias_variables=false,default_msl_version=\"2.2\"");
        System.out.println("    -k=<type>    set the check type to use when error checking");
        System.out.println("    -h           print this help");
		System.out.println("  User will be prompted for type and/or class if not set with options.");
		System.out.println("  Available test types:");
		for (Class cl : TestAnnotationizerHelper.class.getClasses()) 
			if (!Modifier.isAbstract(cl.getModifiers()))
				cl.getMethod("usage", String.class, String.class).invoke(null, cl.getSimpleName(), null);
		System.exit(errorLevel);
	}

    
	
	/**
	 * Prints a usage message for this test case type.
	 * 
	 * Prints the class name and, if given in <code>extra</code>, a description of 
	 * what extra data passed to the test case type is used for.
	 * 
	 * Subclasses should override and call this implementation if they use the 
	 * <code>data</code> argument of their constructor.
	 */
	public static void usage(String cl, String extra) {
		System.out.print("    " + cl);
		if (extra != null && !extra.equals(""))
			System.out.print(",  data = " + extra);
		System.out.println();
	}

    


    protected String filePath;

    
    protected String className;

    
    protected String testName;

    
    protected String description;

    
    protected String data;

    
    protected SourceRoot root;

    
    protected String[] opts;

    
    protected String[] libs;

    
    protected OptionRegistry or = null;

    
    protected ErrorCheckType checkType = null;

    

	/**
	 * Standard constructor for test case creators.
	 * 
	 * Parses the Modelica file containing the test model and saves the source root.
	 * 
	 * All subclasses should have a constructor with the same arguments that calls this constructor.
	 * 
	 * @param filePath     the path to the Modelica file containing the test model
	 * @param className    the name of the test model
	 * @param description  the text to put in the "description" field of the test annotation
	 * @param opts         comma-separated list of compiler options to override defaults for
	 * @param data         any extra data to send to the delegate object
	 */
	public TestAnnotationizerHelper(String filePath, String className, String description, String[] opts, String data) throws Exception {
		this.filePath = filePath;
		this.className = className;
		this.description = prepare(description);
		this.opts = opts;
		this.data = data;
	}

    

    /**
     * Test regeneration constructor for test case creators.
     * 
     * Parses the Modelica file containing the test model and saves the source root.
     * 
     * All subclasses should have a constructor with the same arguments that calls this constructor.
     * 
     * @param filePath     the path to the Modelica file containing the test model
     * @param className    the name of the test model
     */
    public TestAnnotationizerHelper(ClassDecl cd, String filePath, String className) throws Exception {
        this.filePath = filePath;
        this.className = className;
        AnnotationNode a = cd.annotation("__JModelica/UnitTesting/tests").iterator().next();
        this.description = annotationString(a.forPath("description"), false);
        this.data = annotationString(a.forPath(dataName()), false);
        setCheckType(annotationString(a.forPath("checkType"), false));
        String libs = annotationString(a.forPath("modelicaLibraries"), false);
        setModelicaLibraries((libs == null) ? new String[0] : libs.split(","));
        ArrayList<String> optStrings = new ArrayList<String>();
        for (AnnotationNode a2 : a) 
            if (a2.name().indexOf('_') >= 0) 
                optStrings.add(a2.name() + '=' + annotationString(a2, true));
        opts = optStrings.toArray(new String[optStrings.size()]);
    }

    

	protected static String annotationString(AnnotationNode a, boolean option) {
		if (a.isStringValue()) {
			String str = prepare(a.string().trim());
			return option ? '"' + str + '"' : str;
		} else {
			Exp exp = a.exp();
			if (exp != null)
				return exp.toString();
		}
		return null;
	}

    
	
	/**
	 * Get the name of the extra data parameter in the annotation, if any.
	 */
	protected String dataName() {
		return "";
	}

    

    /**
     * Process input and prepare all data needed for creating annotation.
     * 
     * Base implementation calculates test name and parses file.
     */
    protected void process() throws Exception {
        testName = className.substring(className.indexOf('.') + 1).replace('.', '_');
        root = parse(filesToParse(filePath, libs), className, optionRegistry());
    }

    

    /**
     * Create list of files and libraries to parse.
     */
    private static String[] filesToParse(String filePath, String[] libs) {
        String[] names = new String[libs.length + 1];
        names[0] = filePath;
        File parent = new File(filePath).getParentFile();
        for (int i = 0; i < libs.length; i++) {
            names[i + 1] = new File(parent, libs[i]).getAbsolutePath();
        }
        return names;
    }

    

    /**
     * Parse a single file.
     */
    private static SourceRoot parse(String filePath, String className, OptionRegistry opts) throws Exception {
        return parse(new String[] { filePath }, className, opts);
    }

    

    /**
     * Parse a set of files.
     */
    private static SourceRoot parse(String[] files, String className, OptionRegistry opts) throws Exception {
        String modelicapath = System.getenv("JMODELICA_HOME") + "/ThirdParty/MSL";
        opts.setStringOption("MODELICAPATH", modelicapath);
        SourceRoot root;
        
        try {
            root = ParserHandler.parseModel(UtilInterface.create(opts), files);
        } catch (ParserException e) {
            e.getProblem().setFileName(files[0]);
            CompilerException ce = new CompilerException();
            ce.addProblem(e.getProblem());
            throw ce;
        }
        for (StoredDefinition sd : root.getProgram().getUnstructuredEntitys()) 
            sd.setFileName(files[0]);
        return root;
    }

    

	/**
	 * Create an annotation from this helper object.
	 * 
	 * @param write  if <code>true</code>, write the annotation directly in the Modelica file
	 */
	protected void createAnnotation(boolean write) throws Exception {
        process();
		if (write)
			writeAnnotation();
		else
			printAnnotation();
	}

    

    /**
     * Get the options registry to use.
     * 
     * Creates one if not already created.
     */
    protected OptionRegistry optionRegistry() {
        if (or == null) {
            or = ModelicaCompiler.createOptions();
            or.setBooleanOption("generate_runtime_option_parameters", false);
            for (String opt : opts) {
                String parts[] = opt.split("=");
                if (parts.length != 2)
                    throw new ModelicaException("Bad compiler option string: " + opt);
                String key = parts[0];
                String val = parts[1];
                if (val.startsWith("\"") && val.endsWith("\"")) {
                    or.setStringOption(key, val.substring(1, val.length() - 1));
                } else if (val.equals("true") || val.equals("false")) {
                    or.setBooleanOption(key, val.equals("true"));
                } else if (isInteger(val)) {
                    or.setIntegerOption(key, Integer.parseInt(val));
                } else if (isReal(val)) {
                    or.setRealOption(key, Double.parseDouble(val));
                } else {
                    throw new ModelicaException("Bad compiler option value: " + opt);
                }
            }
        }
        return or;
    }

    

	/**
	 * Check if a string can be parsed as an int.
	 */
	protected static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

    
	
	/**
	 * Check if a string can be parsed as a double.
	 */
	protected static boolean isReal(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

    
	
	protected void printSpecificLine(
			PrintStream out, String indent, String name, String value, boolean last) {
        int nl = Math.max(value.lastIndexOf('\n'), value.lastIndexOf('\r'));
        boolean multi = nl >= 0;
        if (multi) 
            value = "\n" + value + (nl < value.length() - 1 ? "\n" : "");
		doPrintSpecificLine(out, indent, name, '"' + value + '"', last, multi);
	}

    
	
	protected void printSpecificLine(
			PrintStream out, String indent, String name, double value, boolean last) {
		doPrintSpecificLine(out, indent, name, Double.toString(value), last, false);
	}

    
	
	protected void printSpecificLine(
			PrintStream out, String indent, String name, int value, boolean last) {
		doPrintSpecificLine(out, indent, name, Integer.toString(value), last, false);
	}

    
	
	protected void printSpecificLine(
			PrintStream out, String indent, String name, boolean value, boolean last) {
		doPrintSpecificLine(out, indent, name, Boolean.toString(value), last, false);
	}

    
	
	protected void doPrintSpecificLine(
			PrintStream out, String indent, String name, String value, boolean last, boolean multi) {
		out.print(indent + name + "=" + value);
		if (!last)
			out.print(",\n");
		else if (!multi) 
			out.print("\n ");
	}

    

    /**
     * Prints the resulting test annotation to stdout.
     */
    public void printAnnotation() throws Exception {
        System.out.println("Annotation:\n=====================");
        outputAnnotation(System.out);
        System.out.println("\n=====================");
    }

    

	/**
	 * Writes the resulting test annotation directly in the Modelica file.
	 */
	public void writeAnnotation() throws Exception {
		InstClassDecl icd = root.getProgram().getInstProgramRoot().lookupInstClassQualified(className).target();
		int start = icd.beginLine();
		int end = icd.endLine();
		File old = new File(filePath);
		BufferedReader in = new BufferedReader(ParserHandler.fileReader(null, old));
        File altered = File.createTempFile(className, ".mo");
        PrintStream out = new PrintStream(altered, "UTF-8");
        boolean foundOld = false;
        boolean lastBlank = false;
        for (int i = 0; i < end - 1; i++) {
        	String line = in.readLine();
        	String trimmed = line.trim();
        	if (!foundOld) {
        		if (i > start && trimmed.equals(HEADER)) {
        			foundOld = true;
        		} else {
        			out.println(line);
        			lastBlank = trimmed.isEmpty();
        		}
        	}
        }
        if (!lastBlank)
        	out.println();
        try {
        	outputAnnotation(out);
        } catch (Exception e) {
    		out.close();
			altered.delete();
			throw e;
       }
		for (String line = in.readLine(); line != null; line = in.readLine())
			out.println(line);
		out.close();
		if (!altered.renameTo(old)) {
			in = new BufferedReader(ParserHandler.fileReader(null, altered));
	        out = new PrintStream(old, "UTF-8");
			for (String line = in.readLine(); line != null; line = in.readLine())
				out.println(line);
			altered.delete();
		}
		System.out.println("File " + old.getName() + " updated.");
	}

    
	
	private final static String HEADER = "annotation(__JModelica(UnitTesting(tests={";

    

    /**
     * Generates the test annotation and ouputs it on the given stream.
     */
    public void outputAnnotation(PrintStream out) throws Exception {
        out.println("    " + HEADER);
        out.println("        " + getClass().getSimpleName() + "(");
        out.println("            name=\"" + testName + "\",");
        out.println("            description=\"" + description + "\",");
        if (hasModelicaLibraries())
            out.println("            modelicaLibraries=\"" + getModelicaLibrariesString() + "\",");
        for (String opt : opts) 
            out.println("            " + opt + ",");
        if (checkType != null)
            out.println("            checkType=" + checkType.toString().toLowerCase() + ",");
        printSpecific(out, "            ");
        out.println(")})));");
    }

    

    /**
     * Escapes unallowed characters in the fields of the test annotation.
     */
    protected static String prepare(String str) {
        return str.replaceAll("\\\\", "\\\\\\\\").replaceAll("\"", "\\\\\"");
    }

    

    /**
     * Performs the instantiation, flattening and transform canonical steps of the compilation.
     */
    protected FClass compile() throws Exception {
        InstClassDecl icl = instantiate();
        FClass fc = flatten(icl);
        transformCanonical(fc);
        return fc;
    }

    

	/**
	 * Performs the instantiation step of the compilation.
	 */
	protected InstClassDecl instantiate() throws Exception {
		InstProgramRoot ipr = root.getProgram().getInstProgramRoot();
		Collection<Problem> problems = null;
		try {
			ipr.checkErrorsInInstClass(className, getCheckType());
			problems = root.collectWarnings();
		} catch (CompilerException e) {
			problems = e.getProblems();
		}
		handleCompilerProblems(problems);
		return ipr.lookupInstClassQualified(className).target();
	}

    

    /**
     * Performs the flattening step of the compilation.
     */
    protected FClass flatten(InstClassDecl icd) {
        FClass fc = FClass.create(icd, null);
        Collection<Problem> problems = null;
        try {
            icd.flattenInstClassDecl(fc);
            problems = root.collectWarnings();
        } catch (CompilerException e) {
            problems = e.getProblems();
        }
        handleCompilerProblems(problems);
        return fc;
    }

    

	/**
	 * Performs the transform canonical step of the compilation.
	 */
	protected void transformCanonical(FClass fc) throws Exception {
		fc.transformCanonical();
		Collection<Problem> problems = null;
		try {
			fc.errorCheck(getCheckType());
			problems = root.collectWarnings();
		} catch (CompilerException e) {
			problems = e.getProblems();
		}
		handleCompilerProblems(problems);
	}

    
	
	/**
	 * Filters away the Problems that is ignored by test cases and throws an 
	 *        exception if any remain.
	 * 
	 * Called by instantiate() and transformCanonical() after error checking.
	 */
	protected void handleCompilerProblems(Collection<Problem> problems) throws CompilerException {
		CompilerException ce = new CompilerException();
		for (Problem p : problems) 
			if (keepProblem(p)) 
				ce.addProblem(p);
		if (!ce.getProblems().isEmpty())
			throw ce;
	}

    
	
	/**
	 * Decides what Problems to keep when filtering.
	 * 
	 * This implementation filters out warnings and compliance errors.
	 */
	protected boolean keepProblem(Problem p) {
		return p.isTestError(false);
	}

    
	
	/**
	 * Ensure that user has passed extra data for test case.
	 */
	protected void checkData(String data) throws Exception {
		if (data == null)
			throw new ModelicaException(getClass().getSimpleName() + " needs extra data.");
	}

    

	/**
	 * Generate and print the part of the annotation that is specific to 
	 *        the test case type.
	 */
	abstract protected void printSpecific(PrintStream out, String indent) throws Exception;

    

	/**
	 * Base class for code generation tests.
	 * 
	 * Extra data is used as the code template.
	 */
	public static abstract class CodeGenTestCase extends TestAnnotationizerHelper {

		protected String template;
		protected String code;

		/**
		 * Constructor for base code generation test.
		 * 
		 * Compiles the model and generates code using the code template passed in 
		 * <code>data</code> and a code generator created by subclass.
		 */
		public CodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for base code generation test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public CodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected String dataName() {
			return "template";
		}

        protected void process() throws Exception {
            super.process();
            checkData(data);
            template = prepare(data.replaceAll("\\\\n", "\n"));
            FClass fc = compile();
            AbstractGenerator generator = createGenerator(fc);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            generator.generate(new StringReader(template), createCodeStream(os));
            code = prepare(os.toString());
        }

        private NotNullCodeStream createCodeStream(OutputStream os) {
            PrintStream ps;
            if (or.getBooleanOption("debug_duplicate_generated")) {
                ps = new PrintStream(new CloneOutputStream(os, System.out).setClose(true, false), true);
            } else {
                ps = new PrintStream(os);
            }
            return new NotNullCodeStream(ps);
        }

		/**
		 * Create the code generator to use.
		 */
		public abstract AbstractGenerator createGenerator(FClass fc);

		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			printSpecificLine(out, indent, "template", template, false);
			printSpecificLine(out, indent, "generatedCode", code, true);
		}
		
	}

    

	/**
	 * A generic code generation test.
	 */
	public static class GenericCodeGenTestCase extends CodeGenTestCase {

		/**
		 * Constructor for generic code generation test.
		 * 
		 * Delegates to super class.
		 */
		public GenericCodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for generic code generation test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public GenericCodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "generic code template");
		}

		/**
		 * Create the code generator to use.
		 * 
		 * Creates a GenericGenerator.
		 */
		@Override
		public AbstractGenerator createGenerator(FClass fc) {
			return new GenericGenerator(new PrettyPrinter(), '$', fc);
		}
		
	}

    

	/**
	 * A flattening test.
	 */
	public static class FlatteningTestCase extends TestAnnotationizerHelper {
		
		protected FClass fc;

		/**
		 * Constructor for flattening test.
		 * 
		 * Performs the flattening and instantiation steps of compilation.
		 */
		public FlatteningTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for flattening test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public FlatteningTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected void process() throws Exception {
			super.process();
			fc = flatten(instantiate());
		}

		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			out.println(indent + "flatModel=\"");
			out.print(prepare(fc.prettyPrint("")));
			out.print("\"");
		}
		
	}

    

	/**
	 * A transform canonical test.
	 */
	public static class TransformCanonicalTestCase extends FlatteningTestCase {

		/**
		 * Constructor for transform canonical test.
		 * 
		 * Performs the transform canonical step of compilation.
		 * (Superclass performs the flattening and instantiation steps.)
		 */
		public TransformCanonicalTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for transform canonical test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public TransformCanonicalTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected void process() throws Exception {
			super.process();
			transformCanonical(fc);
		}
		
	}

    

	/**
	 * An error test case.
	 */
	public static class ErrorTestCase extends TestAnnotationizerHelper {

		private String message;

		/**
		 * Constructor for error test case.
		 * 
		 * Compiles the model and catches any compiler exceptions thrown. If an 
		 * exception is caught, an error message is composed, to be included in 
		 * the annotation.
		 */
		public ErrorTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for error test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public ErrorTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}

        protected void process() throws Exception {
            super.process();
            try {
                compile();
                throw new ModelicaException(noExceptionMessage());
            } catch (CompilerException e) {
                message = prepare(e.getMessage(true));
            }
        }

		/**
		 * Returns an error message for when no errors were detected in test model.
		 */
		protected String noExceptionMessage() {
			return "No errors reported in "+getClass().getSimpleName()+".";
		}

		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			printSpecificLine(out, indent, "errorMessage", message, true);
		}

	}

    
	
	/**
	 * A warning test.
	 */
	public static class WarningTestCase extends ErrorTestCase {

		/**
		 * Constructor for warning test.
		 * 
		 * Delegates to super class.
		 */
		public WarningTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for warning test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public WarningTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Returns an error message for when no errors were detected in test model.
		 */
		protected String noExceptionMessage() {
			return "No warnings or errors reported in WarningTestCase.";
		}
		
		/**
		 * Decides what Problems to keep when filtering.
		 * 
		 * This implementation keeps all problems.
		 */
		protected boolean keepProblem(Problem p) {
			return true;
		}

	}

    
	
	/**
	 * A compliance error test.
	 */
	public static class ComplianceErrorTestCase extends ErrorTestCase {

		/**
		 * Constructor for compliance error test.
		 * 
		 * Delegates to super class.
		 */
		public ComplianceErrorTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for compliance test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public ComplianceErrorTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Decides what Problems to keep when filtering.
		 * 
		 * This implementation filters out compliance errors.
		 */
		protected boolean keepProblem(Problem p) {
			return p.severity() == ProblemSeverity.ERROR;
		}

	}

    

	/**
	 * An FClass method test case.
	 */
	public static class FClassMethodTestCase extends TestAnnotationizerHelper {

		private String methodName;
		private String methodResult;
		protected FClass fc;
		
		/**
		 * Constructor for FClass method test case.
		 * 
		 * Compiles the model.
		 */
		public FClassMethodTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for FClass method test case.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public FClassMethodTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected String dataName() {
			return "methodName";
		}
		
		protected void process() throws Exception {
			super.process();
			fc = compile();
			checkData(data);
			methodName = data;
	    	Method method = fc.getClass().getMethod(methodName);
			methodResult = method.invoke(fc).toString();
		}
		
		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			printSpecificLine(out, indent, "methodName", methodName, false);
			printSpecificLine(out, indent, "methodResult", methodResult, true);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "method name");
		}

	}

    

	/**
	 * A constant evaluation test case.
	 */
	public static class EvalTestCase extends TestAnnotationizerHelper {

		private String values;
		private String variables;
		protected FClass fc;
		
		/**
		 * Constructor for parameter value evaluation test case.
		 * 
		 * Compiles the model.
		 */
		public EvalTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for parameter value evaluation test case.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public EvalTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected String dataName() {
			return "variables";
		}
		
		protected void process() throws Exception {
			super.process();
			fc = compile();
			checkData(data);
			variables = makeVariableList(data);
			values = prepare(evaluateVars(variables.split("[\\n\\r]+")));
		}
		
		/**
		 * Create newline-separated list of scalarized variables from comma-separated list of 
		 * possibly non-scalarized variables.
		 */
		public String makeVariableList(String vars) {
			String[] list = vars.replace(',', '\n').split("[\\n\\r]+");
			Set<String> available = fc.variablesMap().flatNameSet();
			ArrayList<String> names = new ArrayList<String>();
			for (String name : list) {
				name = name.trim();
				int l = names.size();
				if (available.contains(name)) {
					names.add(name + "\n");
				} else {
					Pattern p = Pattern.compile(name + "[\\[.].*");
					for (String var : available) 
						if (p.matcher(var).matches()) 
							names.add(var + "\n");
				}
				if (names.size() == l)
					throw new IllegalArgumentException("Could not find variable " + name);
			}
			Collections.sort(names);
			StringBuilder res = new StringBuilder();
			for (String name : names)
				res.append(name);
			return res.toString().trim();
		}
		
		/**
		 * Evaluate variables in an FClass.
		 * 
		 * @return the resulting values, as a string, one value per line.
		 */
		public String evaluateVars(String[] variables) {
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < variables.length; i++) {
				if (i != 0)
					res.append('\n');
				res.append(fc.lookupFV(variables[i]).ceval().toString());
			}
			return res.toString();
		}
		
		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			printSpecificLine(out, indent, "variables", variables, false);
			printSpecificLine(out, indent, "values", values, true);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "variable list");
		}

	}

    

	/**
	 * A constant evaluation test case.
	 */
	public static class TimeTestCase extends TestAnnotationizerHelper {
		
		private double time;

		public TimeTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for compilation time test case.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public TimeTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		protected String dataName() {
			return "maxTime";
		}
		
		protected void process() throws Exception {
			super.process();
			time = Double.parseDouble(data);
		}
		
		/**
		 * Generate and print the part of the annotation that is specific to 
	     *        this test case type.
		 */
		@Override
		protected void printSpecific(PrintStream out, String indent) throws Exception {
			printSpecificLine(out, indent, "maxTime", time, true);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "maximum execution time");
		}
		
	}

    

    /**
     * An FMI XML code generation test.
     */
    public static class FmiXMLCodeGenTestCase extends CodeGenTestCase {

        public FmiXMLCodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
            super(filePath, className, description, opts, data);
        }

        public FmiXMLCodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
            super(cd, filePath, className);
        }

        public static void usage(String cl, String extra) {
            TestAnnotationizerHelper.usage(cl, "XML code template");
        }

        @Override
        public AbstractGenerator createGenerator(FClass fc) {
            String ver = optionRegistry().getStringOption("fmi_version");
            if (ver == OptionRegistry.FMIVersion.FMI20)
                return new Fmi2XMLGenerator(new PrettyPrinter(), '$', fc);
            else
                return new Fmi1XMLGenerator(new PrettyPrinter(), '$', fc);
        }

    }

    

	/**
	 * An XML code generation test.
	 */
	public static class XMLCodeGenTestCase extends CodeGenTestCase {

		/**
		 * Constructor for XML code generation test.
		 * 
		 * Delegates to super class.
		 */
		public XMLCodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for XML code generation test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public XMLCodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "XML code template");
		}

		/**
		 * Create the code generator to use.
		 * 
		 * Creates an XMLGenerator.
		 */
		@Override
		public AbstractGenerator createGenerator(FClass fc) {
			return new XMLGenerator(new PrettyPrinter(), '$', fc);
		}
		
	}

    

	/**
	 * A C code generation test.
	 */
	public static class CCodeGenTestCase extends CodeGenTestCase {

		/**
		 * Constructor for C code generation test.
		 * 
		 * Delegates to super class.
		 */
		public CCodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for C code generation test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public CCodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "C code template");
		}

		/**
		 * Create the code generator to use.
		 * 
		 * Creates a CGenerator.
		 */
		@Override
		public AbstractGenerator createGenerator(FClass fc) {
			return new CGenerator(new PrettyPrinter(), '$', fc);
		}
		
	}

    
	
	public static class CADCodeGenTestCase extends CodeGenTestCase {

		/**
		 * Constructor for CAD code generation test.
		 * 
		 * Delegates to super class.
		 */
		public CADCodeGenTestCase(String filePath, String className, String description, String[] opts, String data) throws Exception {
			super(filePath, className, description, opts, data);
		}
		
		/**
		 * Test regeneration constructor for CAD code generation test.
		 * 
		 * Delegates to superclass implementation.
		 * 
		 * @param filePath     the path to the Modelica file containing the test model
		 * @param className    the name of the test model
		 */
		public CADCodeGenTestCase(ClassDecl cd, String filePath, String className) throws Exception {
			super(cd, filePath, className);
		}
		
		/**
		 * Prints a usage message for this test case type.
		 */
		public static void usage(String cl, String extra) {
			TestAnnotationizerHelper.usage(cl, "CAD code template");
		}

		/**
		 * Create the code generator to use.
		 * 
		 * Creates a CADGenerator.
		 */
		@Override
		public AbstractGenerator createGenerator(FClass fc) {
			return new CADGenerator(new PrettyPrinter(), '$', fc);
		}
		
	}


}
