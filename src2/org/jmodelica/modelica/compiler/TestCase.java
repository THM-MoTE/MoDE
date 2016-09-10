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
 * @aspect TestCases
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestCase.jrag:39
 */
abstract public class TestCase extends Object implements GenericTestCase {
    

    private String name = null;

    
    private String description = null;

    
    private String sourceFileName = null;

    
    private String className = null;

    

    private boolean filter = false;

    
    private boolean checkAll = false;

    
    private ErrorCheckType checkType = ErrorCheckType.COMPILE;

    
    
    private String[] modelicaLibraries = new String[0];

    

    protected OptionRegistry options = createOptionRegistry();

    
    private Exception exception = null;

    

	/**
	 * Create the OptionRegistry to be used during compilation.
	 * 
	 * Options may be further changed by test annotation.
	 */
	protected OptionRegistry createOptionRegistry() {
		OptionRegistry or = ModelicaCompiler.createOptions();
		String modelica_path = System.getenv("JMODELICA_HOME") + File.separator + 
				"ThirdParty" + File.separator + "MSL";
		or.setStringOption("MODELICAPATH", modelica_path);
		or.setBooleanOption("generate_runtime_option_parameters", false);
		return or;
	}

    
	
	/**
	 * Set a string option to be used during compilation.
	 */
	public void setStringOption(String key, String value) {
		try {
			options.setStringOption(key, value);
		} catch (UnknownOptionException e) {
			exception = e;
		}
	}

    
    
    public String filterTestResult(String str, Map<Pattern, String> resultFilters) {
        for (Pattern p : resultFilters.keySet()) {
            str = p.matcher(str).replaceAll(resultFilters.get(p));
        }
        return str;
    }

    
    
	/**
	 * Set a boolean option to be used during compilation.
	 */
	public void setBooleanOption(String key, boolean value) {
		try {
			options.setBooleanOption(key, value);
		} catch (UnknownOptionException e) {
			exception = e;
		}
	}

    
	
	/**
	 * Set an integer option to be used during compilation.
	 */
	public void setIntegerOption(String key, int value) {
		try {
			options.setIntegerOption(key, value);
		} catch (UnknownOptionException e) {
			exception = e;
		}
	}

    
	
	/**
	 * Set a real option to be used during compilation.
	 */
	public void setRealOption(String key, double value) {
		try {
			options.setRealOption(key, value);
		} catch (UnknownOptionException e) {
			exception = e;
		}
	}

    
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

    

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

    

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

    

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

    

	/**
	 * @return the sourceFileName
	 */
	public String getSourceFileName() {
		return sourceFileName;
	}

    

	/**
	 * @param sourceFileName the sourceFileName to set
	 */
	public void setSourceFileName(String sourceFileName) {
	    
		this.sourceFileName = sourceFileName;
	}

    

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

    

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

    
	
	/**
	 * Activate or deactivate filtering (see {@link #filter(String)}).
	 */
	public void setFilter(boolean val) {
		filter = val;
	}

    
	
	/**
	 * Activate or deactivate incusion of warnings and compliance errors 
	 *        in error check (see {@link #filterProblems(Collection)}).
	 */
	public void setCheckAll(boolean val) {
		checkAll = val;
	}

    
    
    /**
     * Set type of error checking to be performed.
     * 
     * Available for all test types, but only logical to change for error/warning/compliance tests.
     */
    public void setCheckType(String val) {
        checkType = ErrorCheckType.valueOf(ErrorCheckType.class, val.toUpperCase());
    }

    
    
    /**
     * Get type of error checking being performed.
     */
    public ErrorCheckType getCheckType() {
        return checkType;
    }

    
    
    public void setModelicaLibraries(String s) {
        modelicaLibraries = s.split(",");
    }

    
    
    public String[] getModelicaLibraries() {
        return modelicaLibraries;
    }

    
    
    public boolean hasModelicaLibraries() {
        return modelicaLibraries.length > 0;
    }

    
	
	/**
	 * Perform filtering on string, if activated.
	 */
	protected String filter(String str) {
		if (filter) {
			// TODO: Add more filters
			str = str.replace("%dir%", testFileDirectory());
			str = str.replace("%msl%", mslDirectory());
		}
		return str;
	}

    

    /**
     * Get the path to the directory containing the test file.
     */
    protected String testFileDirectory() {
        File file = new File(getSourceFileName());
        return ASTNode.canonicalPath(file.getParentFile());
    }

    

	/**
	 * Get the path to the directory containing the MSL.
	 */
	protected String mslDirectory() {
		for (String path : options.getStringOption("MODELICAPATH").split(File.pathSeparator)) {
			File f = new File(path, "Modelica");
			if (f.isDirectory())
				return f.getAbsolutePath();
		}
		return null;
	}

    
	
	/**
	 * Remove all whitespace.
	 */
	public String removeWhitespace(String str) {
		// TODO: this can mask errors, we need a better filtering
		return str.replaceAll("\\s+", "");
	}

    
	
	private Assert asserter;

    
	
	/**
	 * Perform an assertion that two strings are equal.
	 * 
	 * @param msg       a message describing what went wrong
	 * @param expected  the expected value
	 * @param actual    the actual value
	 */
	protected void assertEquals(String msg, String expected, String actual) {
		expected = expected.replaceAll("\\r\\n|\\r", "\n");
		expected = expected.replaceFirst("^([ \\t]*[\\n])+", "");
		expected = expected.replaceAll("[ \\t]*$", "");
		actual = actual.replaceFirst("^([ \\t]*[\\n\\r])+", "");
		msg = getDescription() + "\n" + getClass().getSimpleName() + ": " + msg;
		asserter.assertEquals(msg, expected, actual);
	}

    
	
	/**
	 * Signal that the test failed.
	 * 
	 * @param msg  a message describing what went wrong
	 */
	protected void fail(String msg) {
		asserter.fail(getDescription() + "\n" + getClass().getSimpleName() + ": " + msg);
	}

    
	
	/**
	 * Signal that the test failed.
	 * 
	 * @param e  the exception that caused the failure
	 */
	protected void fail(Exception e) {
		if (e instanceof ModelicaException) 
			fail(e.getMessage());

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		e.printStackTrace(new PrintStream(out));
		fail("Exception caught in test case: " + out.toString());
	}

    
	
	public void testMe(Assert a) {
		try {
			asserter = a;
			performTest();
		} catch (ParserException e) {
			fail(e);
		} catch (ModelicaClassNotFoundException e) {
			fail(e);
		} catch (beaver.Parser.Exception e) {
			fail(e);
		} catch (IOException e) {
			fail(e);
		}
	}

    

    public void performTest() throws ParserException, beaver.Parser.Exception, 
                IOException, ModelicaClassNotFoundException {
        UtilInterface uif = UtilInterface.create(options);
        try {
            performTest(uif);
        } finally {
            uif.tearDown();
        }
    }

    
    
    public void performTest(UtilInterface uif) throws ParserException, beaver.Parser.Exception, 
                IOException, ModelicaClassNotFoundException {
        if (exception != null)
            fail(exception);
        
        // Parse
        SourceRoot sr;
        if (modelicaLibraries.length > 0) {
            String[] names = new String[modelicaLibraries.length + 1];
            File parent = new File(getSourceFileName()).getParentFile();
            for (int i = 0; i < modelicaLibraries.length; i++) {
                names[i] = new File(parent, modelicaLibraries[i]).getAbsolutePath();
            }
            names[modelicaLibraries.length] = getSourceFileName();
            sr = ParserHandler.parseModel(uif, names);
        } else {
            sr = ParserHandler.parseFile(uif, getSourceFileName());
        }
        
        // Instantiate and check for errors
        InstProgramRoot ipr = sr.getProgram().getInstProgramRoot();
        Collection<Problem> problems = null;
        try {
            ipr.checkErrorsInInstClass(className, checkType);
            problems = sr.collectWarnings();
        } catch (CompilerException e) {
            problems = e.getProblems();
        }
        if (testSemanticProblems(problems)) return;
        
        
        // Flatten class and check errors reported during flattening
        InstClassDecl icd = ipr.lookupInstClassQualified(getClassName()).target();
        FClass fc = FClass.create(icd, null);
        try {
            icd.flattenInstClassDecl(fc);
            problems = sr.collectWarnings();
        } catch (CompilerException e) {
            problems = e.getProblems();
        }
        if (testSemanticProblems(problems)) return;
        
        
        // Test flattened class
        if (testFlattened(fc)) return;
        
        
        // Transform canonical and check for errors again
        try {
            fc.transformCanonical();
            fc.errorCheck(checkType);
            problems = fc.collectWarnings();
        } catch (CompilerException e) {
            problems = e.getProblems();
        }
        if (testTransformedProblems(problems)) return;
		
		
		// Test transformed class
	    testTransformed(fc);
	}

    

	/**
	 * Perform tests on the set of semantic problems found in the instance tree.
	 * 
	 * Default implementation fails if any errors other than COMPLIANCE were found, and returns false otherwise.
	 * 
	 * @return  <code>true</code> if test case shoule stop after this method
	 */
	protected boolean testSemanticProblems(Collection<Problem> problems) {
		return testProblems(problems);
	}

    
	
	/**
	 * Perform tests on flattened class.
	 * 
	 * @return  <code>true</code> if test case shoule stop after this method
	 */
	protected boolean testFlattened(FClass fc) {
		return false;
	}

    

	/**
	 * Perform tests on flat class after transform canonical step.
	 * 
	 * @return  <code>true</code> if test case shoule stop after this method
	 */
	protected boolean testTransformed(FClass fc) {
		return false;
	}

    

	/**
	 * Perform tests on the set of semantic problems found after transform canonical step.
	 * 
	 * Default implementation fails if any errors other than COMPLIANCE were found, and returns false otherwise.
	 * 
	 * @return  <code>true</code> if test case shoule stop after this method
	 */
	protected boolean testTransformedProblems(Collection<Problem> problems) {
		return testProblems(problems);
	}

    
	
	/**
	 * Perform tests on a set of semantic problems.
	 * 
	 * Default implementation fails if any errors other than COMPLIANCE were found, and returns false otherwise.
	 * 
	 * @return  <code>true</code> if test case should stop after this method
	 */
	protected boolean testProblems(Collection<Problem> problems) {
		filterProblems(problems);
		if (problems.size() > 0)
			fail(new CompilerException(problems));
		return false;
	}

    
	
	/**
	 * Filters out any uninteresting problems from a set of semantic problems.
	 * 
	 * Default implementation removes any warnings and any COMPLIANCE errors.
	 */
	protected void filterProblems(Collection<Problem> problems) {
		for (Iterator<Problem> it = problems.iterator(); it.hasNext(); )
			if (!it.next().isTestError(checkAll))
				it.remove();
	}

    
	
	/**
	 * Compare a flat class to a pretty-printed correct model and fail if different.
	 */
	protected void testPrettyPrint(FClass fc, String correct) {
		TokenTester tt = new TokenTester();
		String test = fc.prettyPrint("");
		if (!tt.test(test, correct)) {
			String diff = tt.firstDiff();
			String err = "Flat class does not match expected.";
			assertEquals(err, correct, test);
		}
	}

    
	
	/**
	 * Sort lines in string alphabetically.
	 */
	protected String sortLines(String str) {
		String[] lines = str.split("\n|\r|\r\n");
		Arrays.sort(lines);
		StringBuilder buf = new StringBuilder();
		for (String line : lines) {
			buf.append(line);
			buf.append('\n');
		}
		return buf.toString();
	}


}
