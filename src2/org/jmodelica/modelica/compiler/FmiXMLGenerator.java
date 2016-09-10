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
 * @aspect FmiXMLGenerator
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/FmiXMLCodeGen/src/jastadd/FmiXMLGenerator.jrag:29
 */
public abstract class FmiXMLGenerator extends GenericXMLGenerator {
    
    
    /**
     * Constructor.
     * 
     * @param expPrinter Printer object used to generate code for expressions.
     * @param escapeCharacter Escape characters used to decode tags.
     * @param fclass An FClass object used as a basis for the code generation.
     */
    public FmiXMLGenerator(Printer expPrinter, char escapeCharacter, FClass fclass) {
        super(expPrinter,escapeCharacter, fclass);
    }

    
    
    /**
     * Base class for tags used to generate XML that should only be present in ME FMUs.
     */
    public abstract class METag extends XMLTag {
        
        /**
         * Construct a tag.
         * 
         * @param name        tag name
         * @param xml         name to use for the xml tag or attribute
         * @param myGenerator the tag's generator
         * @param fclass      an FClass to generate code for
         */
        public METag(String name, String xml, AbstractGenerator myGenerator, FClass fclass) {
            super(name, xml, myGenerator, fclass);
            addOptions("generate_fmi_me_xml");
        }
        
    }

    
    
    /**
     * Base class for tags used to generate XML that should only be present in CS FMUs.
     */
    public abstract class CSTag extends XMLTag {
        
        /**
         * Construct a tag.
         * 
         * @param name        tag name
         * @param xml         name to use for the xml tag or attribute
         * @param myGenerator the tag's generator
         * @param fclass      an FClass to generate code for
         */
        public CSTag(String name, String xml, AbstractGenerator myGenerator, FClass fclass) {
            super(name, xml, myGenerator, fclass);
            addOptions("generate_fmi_cs_xml");
        }
        
    }

    
    
    /**
	 * Internal class used to generate a DefaultExperiment tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_defaultExperiment extends XMLTag {
		
		private FClass.Experiment e = fclass.experiment;
		
		public XMLTag_defaultExperiment(AbstractGenerator myGenerator, FClass fclass) {
			super("defaultExperiment", "DefaultExperiment", myGenerator, fclass);
		}
		
		public void generate(CodeStream genPrinter) {
			if (e != null) {
				super.generate(genPrinter);
			}
		}
		
		public void generateAttributes(CodeStream genPrinter) {
			if (e.hasStart)
				generateAttribute("startTime", Double.toString(e.start),     genPrinter);
			if (e.hasStop)
				generateAttribute("stopTime",  Double.toString(e.stop),      genPrinter);
			if (e.hasTolerance)
				generateAttribute("tolerance", Double.toString(e.tolerance), genPrinter);
		}
	}

    
    
    /**
	 * Internal class used to generate a VendorAnnotations tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_vendorAnnotations extends XMLTag {
		
		public XMLTag_vendorAnnotations(AbstractGenerator myGenerator, FClass fclass) {
			super("vendorAnnotations", "VendorAnnotations", myGenerator, fclass);
		}
		
		public String[] children() { return new String[] {"tool"}; }
	}

    
	
	/**
	 * Internal class used to generate a Tool tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_tool extends XMLTag {
		
		public XMLTag_tool(AbstractGenerator myGenerator, FClass fclass) {
			super("tool", "Tool", myGenerator, fclass);
		}
		
		public String[] children() { return new String[] {"annotation"}; }
		
		public void generateAttributes(CodeStream genPrinter) {
			generateAttribute("name", ASTNode.vendorName(), genPrinter);
		}
	}

    
	
	/**
	 * Internal class used to generate a Annotation tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_annotation extends XMLTag {
		
		private String name;
		private String value;
		
		public XMLTag_annotation(AbstractGenerator myGenerator, FClass fclass) {
			super("annotation", "Annotation", myGenerator, fclass);
		}
		
		public void generate(CodeStream genPrinter) {
			HashSet<String> extLibraries = fclass.externalLibraries();
			HashSet<String> extIncludes  = fclass.externalIncludes();
			HashSet<String> extLibDirs   = fclass.externalLibraryDirectories();
			HashSet<String> extInclDirs  = fclass.externalIncludeDirectories();
			
			name = "Library";
			for(String lib : extLibraries) {
				value = lib;
				super.generate(genPrinter);
			}
			name = "Include";
			for(String inc : extIncludes) {
				value = inc;
				super.generate(genPrinter);
			}
			name = "LibraryDirectory";
			for(String libdir : extLibDirs) {
				value = libdir;
				super.generate(genPrinter);
			}
			name = "IncludeDirectory";
			for(String incdir : extInclDirs) {
				value = incdir;
				super.generate(genPrinter);
			}
		}
		
		public void generateAttributes(CodeStream genPrinter) {
			generateAttribute("name",  name,  genPrinter);
            generateAttribute("value", value, genPrinter);
		}
	}

    
    
    /**
     * Checks if a variable is real and has a unit associated with it.
     *
     * @param FVariable A variable class.
     */
    private boolean realVariableWithUnit(FVariable variable) {
        return variable instanceof FRealVariable && variable.unitAttributeSet();
    }

    
    
    /**
     * Adds the unit data of a real variable to the unit HashMap.
     *
     * @param HashMap A HashMap that data about units should be added.
     * @param FRealVariable A real variable class with unit attribute(s).
     */
    private void addToUnitMap(HashMap<String,HashSet<String>> unitMap, FRealVariable variable) {
        String attribute = variable.unitAttribute();
        if (variable.displayUnitAttributeSet()) {
            if(unitMap.containsKey(attribute)) {
                HashSet<String> displayUnitsSet = unitMap.get(attribute);
                displayUnitsSet.add(variable.displayUnitAttribute());
            } else {
                HashSet<String> displayUnitsSet = new LinkedHashSet<String>();
                displayUnitsSet.add(variable.displayUnitAttribute());
                unitMap.put(attribute, displayUnitsSet);
            }
        } else if(!unitMap.containsKey(attribute)) {
            HashSet<String> emptySet = new LinkedHashSet<String>();
            unitMap.put(attribute, emptySet);
        }
    }

    
    
    /**
     * Create and format the Unit data in a HashMap.
     *
     * @param fclass An FClass object used as a basis for the code generation.
     */
    protected HashMap<String,HashSet<String>> extractUnits(FClass fclass) {
        HashMap<String,HashSet<String>> unitMap = new LinkedHashMap<String,HashSet<String>>();
        for(FVariable variable:fclass.allVariables()) {
            if(realVariableWithUnit(variable)) {
                addToUnitMap(unitMap, (FRealVariable)variable);
            }
        }
        
        return unitMap;
    }

    
    
    /**
     * Gets the start expresion of a variable. Returns null if there is
     * none.
     *
     * @param FVariable A variable class.
     */
    protected FExp getStartExp(FVariable var) {
        if (var.useBindingExpAsStart()) 
            return var.getBindingExp();
        else if (var.startAttributeSet() && !var.isDependentParameter() && !var.isAlias())
            return var.startAttributeExp();
        else if (var.isInput())
            return var.createStartAttributeExp();
        else
            return null; //Default value
    }

    
    
    /**
     * Checks if the start attribute should be generated.
     *
     * @param FVariable A variable class.
     */
    protected boolean generateStartAttribute(FVariable var) {
        FExp startExp = getStartExp(var);
        return startExp != null && startExp.isConstantExp();
    }

    
    
    /**
     * Gets the start attribute formated as XML value attribute.
     *
     * @param FVariable A variable class.
     */
    protected String getXMLStartAttribute(FVariable var) {
        return var.type().convert(getStartExp(var).ceval()).xmlValue();
    }

    
    
    /**
     * Gets the number of event indicators that should be stated in the XML
     */
    protected int numberOfEventIndicators(FClass fclass) {
        if (fclass.onlyInitBLT())
            return fclass.numEventIndicators() + fclass.numInitialEventIndicators();
        else
            return fclass.numEventIndicators();
    }

    
    
    protected boolean generateAsConstant(FVariable var) {
        return var.variability().knownParameterOrLess();
    }

    
    
    protected String getCausality(FVariable var) {
        if (var.isInput()) {
            return "input";
        } else if (var.isOutput()) {
            return "output";
        } else {
            return getNonIOCausality(var);
        }
    }

    
    
    protected String getNonIOCausality(FVariable var) {
        return "internal";
    }

    
    
    protected String getVariability(FVariable var) {
        if (generateAsConstant(var)) {
            return "constant";
        } else if (var.isParameter()) {
            return getParameterVariability();
        } else if (var.isDiscrete()) {
            return "discrete";
        } else {
            return "continuous";
        }
    }

    
    
    protected String getParameterVariability() {
        return "parameter";
    }

    protected Unit getUnitConversion(String from, String to) {
    try {
        UnitParser unitParser = UnitParser.getParser();
        Unit c = unitParser.parse(from).convertTo(unitParser.parse(to));
        if (c.isAnyUnit()) return null;
        return c;
    } catch(UnitParser.Exception e) {
        return null;
    }
}

    protected Unit getBaseUnitInfo(String unit) {
    try {
        // Parse unit
        Unit u = UnitParser.getParser().parse(unit);
        if (u.isAnyUnit()) return null;
        return u;
    } catch(UnitParser.Exception e) {
        return null;
    }
}


}
