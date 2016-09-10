/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.11 */
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
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:67
 * @production Program : {@link SourceBaseNode} ::= <span class="component">UnstructuredEntity:{@link StoredDefinition}*</span> <span class="component">{@link UnknownClassDecl}</span> <span class="component">{@link UnknownComponentDecl}</span> <span class="component">EnumBaseDecl:{@link EnumClassDecl}</span> <span class="component">PredefinedType:{@link BaseClassDecl}*</span> <span class="component">BuiltInType:{@link ClassDecl}*</span> <span class="component">BuiltInFunction:{@link BaseClassDecl}*</span> <span class="component">{@link LibNode}*</span> <span class="component">AnonymousClass:{@link BaseClassDecl}*</span> <span class="component">{@link InstProgramRoot}</span>;

 */
public class Program extends SourceBaseNode implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:265
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		for (StoredDefinition sd : getUnstructuredEntitys()) {
			p.print(sd,str,indent);
		}
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:793
     */
    private Map<String,ClassDecl> anonymousClassMap = null;
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:216
     */
    private LibraryList libraryList;
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:218
     */
    public LibraryList getLibraryList() {
        if (libraryList == null)
            libraryList = new DefaultLibraryList(myOptions());
        return libraryList;
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:224
     */
    public void setLibraryList(LibraryList list) {
        libraryList = list;
    }
    /**
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:227
     */
    private static final String BUILTIN_FUNCS = 
              "function initial end initial;\n"
            + "function terminal end terminal;\n"
            + "function smooth\n"
            + "  input Integer p;\n"
            + "  input Real expr;\n"   // Type not used
            + "  output Real y;\n"     // Type not used
            + "end smooth;\n"
            + "function noEvent\n"
            + "  input Real expr;\n"   // Type not used
            + "  output Real y;\n"     // Type not used
            + "end noEvent;\n"
            + "function sample\n"
            + "  input Real start;\n"
            + "  input Real interval;\n"
            + "  output Real y;\n"     // Type not used
            + "end sample;\n"
            + "function pre\n"
            + "  input Real x;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end pre;\n"
            + "function edge\n"
            + "  input Real x;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end edge;\n"
            + "function change\n"
            + "  input Real x;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end change;\n"
            + "function reinit\n"
            + "  input Real x;\n"      // Type not used
            + "  input Real expr;\n"     // Type not used
            + "end reinit;\n"
            + "function assert\n"
            + "  input Boolean condition;\n"
            + "  input String message;\n"
            + "  input AssertionLevel level = AssertionLevel.error;\n"
            + "end assert;\n"
            + "function terminate\n"
            + "  input String reason;\n"
            + "end terminate;\n"
            + "function abs\n"
            + "  input Real v;\n"
            + "  output Real y;\n"
            + "end abs;\n"
            + "function sign\n"
            + "  input Real v;\n"
            + "  output Real y;\n"
            + "end sign;\n"
            + "function sqrt\n"
            + "  input Real x;\n"
            + "  output Real y;\n"
            + "end sqrt;\n"
            + "function universeLifeAndEverything\n"
            + "  output Integer y = 42;\n"
            + "algorithm\n"
            + "end universeLifeAndEverything;\n"
            + "function div"
            + "  input Real x1;\n"      // Type not used
            + "  input Real x2;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end div;\n"
            + "function mod"
            + "  input Real x1;\n"      // Type not used
            + "  input Real x2;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end mod;\n"
            + "function rem"
            + "  input Real x1;\n"      // Type not used
            + "  input Real x2;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end rem;\n"
            + "function floor"
            + "  input Real x;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end floor;\n"
            + "function ceil"
            + "  input Real x;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end ceil;\n"
            + "function integer"
            + "  input Real x;\n"      // Type not used
            + "  output Integer y;\n"  // Type not used
            + "end integer;\n"
            + "function Integer"
            + "  input Real x;\n"      // Type not used
            + "  output Integer y;\n"  // Type not used
            + "end Integer;\n"
            + "function String"
            + "  input Real x;\n"      // Type not used
            + "  input Integer minimumLength = 0;\n"
            + "  input Boolean leftJustified = true;\n"
            + "  input Integer significantDigits = 6;\n"
            + "  input String format = \"\";\n"
            + "  output String y;\n"
            + "end String;\n"
            + "function delay"
            + "  input Real exp;\n"      // Type not used
            + "  input Real delayTime;\n"
            + "  input Real delayMax = delayTime;\n"
            + "  output Real y;\n"       // Type not used
            + "end delay;\n"
            + "function spatialDistribution"
            + "  input Real in0;\n"
            + "  input Real in1;\n"
            + "  input Real x;\n"
            + "  input Boolean positiveVelocity;\n"
            + "  input Real[:] initialPoints = {0.0, 1.0};\n"
            + "  input Real[:] initialValues = {0.0, 0.0};\n"
            + "  output Real out0;\n"
            + "  output Real out1;\n"
            + "end spatialDistribution;\n"
            + "function cardinality"
            + "  input Real x;\n"      // Type not used
            + "  output Integer y;\n"  // Type not used
            + "end cardinality;\n"
            + "package Subtask"
            + "  function decouple"
            + "    input Real x;\n"      // Type not used
            + "    output Integer y;\n"  // Type not used
            + "  end decouple;\n"
            + "end Subtask;\n"
            + "function ndims\n"
            + "  input Real A;\n"      // Type not used
            + "  output Integer n;\n"
            + "end ndims;\n"
            + "function size\n"
            + "  input Real A;\n"         // Type not used
            + "  input Integer d = 0;\n"  // Default value not used
            + "  output Integer s;\n"
            + "end size;\n"
            + "function scalar"
            + "  input Real A;\n"      // Type not used
            + "  output Real y;\n"     // Type not used
            + "end scalar;\n"
            + "function vector"
            + "  input Real A;\n"      // Type not used
            + "  output Real B;\n"     // Type not used
            + "end vector;\n"
            + "function matrix"
            + "  input Real A;\n"      // Type not used
            + "  output Real B;\n"     // Type not used
            + "end matrix;\n"
            + "function transpose\n"
            + "  input Real A;\n"    // Type not used
            + "  output Real B;\n"   // Type not used
            + "end transpose;\n"
            + "function symmetric\n"
            + "  input Real A;\n"    // Type not used
            + "  output Real B;\n"   // Type not used
            + "end symmetric;\n"
            + "function cross\n"
            + "  input Real x[3];\n"
            + "  input Real y[3];\n"
            + "  output Real z[3];\n"   // Type not used
            + "end cross;\n"
            + "function outerProduct\n"
            + "  input Real x[:];\n"
            + "  input Real y[:];\n"
            + "  output Real z[:,:];\n"   // Type not used
            + "end outerProduct;\n"
            + "function diagonal\n"
            + "  input Real v[:];\n"
            + "  output Real z[:,:];\n"   // Type not used
            + "end diagonal;\n"
            + "function identity\n"
            + "  input Integer n;\n"
            + "  output Integer a[n, n];\n"
            + "end identity;\n"
            + "function array end array;\n"
            + "function zeros end zeros;\n"
            + "function ones end ones;\n"
            + "function fill\n"
            + "  input Real s;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end fill;\n"
            + "function cat\n"
            + "  input Real k;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end cat;\n"
            + "function linspace\n" 
            + "  input Real x1;\n"
            + "  input Real x2;\n"
            + "  input Integer n;\n"
            + "  output Real z[1];\n"   // Size not used
            + "end linspace;\n"
            + "function min\n"
            + "  input Real x;\n"      // Type not used
            + "  input Real y = 0;\n"  // Type and default value not used
            + "  output Real z;\n"     // Type not used
            + "end min;\n"
            + "function max\n"
            + "  input Real x;\n"      // Type not used
            + "  input Real y = 0;\n"  // Type and default value not used
            + "  output Real z;\n"     // Type not used
            + "end max;\n"
            + "function sum\n"
            + "  input Real A;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end sum;\n"
            + "function product\n"
            + "  input Real A;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end product;\n"
            + "function skew\n"
            + "  input Real x[3];\n"
            + "  output Real y[3,3];\n"   // Type not used
            + "end skew;\n"
            + "function homotopy\n"
            + "  input Real actual;\n"
            + "  input Real simplified;\n"
            + "  output Real o;\n"
            + "end homotopy;\n"
            + "function semiLinear\n"
            + "  input Real v1;\n"     // Type not used
            + "  input Real v2;\n"     // Type not used
            + "  input Real v3;\n"     // Type not used
            + "  output Real o;\n"     // Type not used
            + "end semiLinear;\n"
            + "function inStream\n"
            + "  input Real v;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end inStream;\n"
            + "function actualStream\n"
            + "  input Real n;\n"      // Type not used
            + "  output Real o;\n"     // Type not used
            + "end actualStream;\n"
            + "function getInstanceName\n"
            + "  output String o;\n"
            + "end getInstanceName;\n"
            + "function sin \"sine\"\n"
            + "  input Modelica.SIunits.Angle u;\n"
            + "  output Real y;\n"
            + "end sin;\n"
            + "function cos \"cosine\"" 
            + "  input Modelica.SIunits.Angle u;\n"
            + "  output Real y;\n"
            + "end cos;\n"
            + "function tan \"tangent (u shall not be -pi/2, pi/2, 3*pi/2, ...)\"\n"
            + "  input Modelica.SIunits.Angle u;\n"
            + "  output Real y;\n"
            + "end tan;\n"
            + "function asin \"inverse sine (-1 <= u <= 1)\"\n"
            + "  input Real u;\n"
            + "  output Modelica.SIunits.Angle y;\n"
            + "end asin;\n"
            + "function acos \"inverse cosine (-1 <= u <= 1)\"\n"
            + "  input Real u;\n"
            + "  output Modelica.SIunits.Angle y;\n"
            + "end acos;\n"
            + "function atan \"inverse tangent\"\n"
            + "  input Real u;\n"
            + "  output Modelica.SIunits.Angle y;\n"
            + "end atan;\n"
            + "function atan2 \"four quadrant inverse tangent\"\n"
            + "  input Real u1;\n"
            + "  input Real u2;\n"
            + "  output Modelica.SIunits.Angle y;\n"
            + "end atan2;\n"
            + "function sinh \"hyperbolic sine\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end sinh;\n"
            + "function cosh \"hyperbolic cosine\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end cosh;\n"
            + "function tanh \"hyperbolic tangent\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end tanh;\n"
            + "function exp \"exponential, base e\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end exp;\n"
            + "function log \"natural (base e) logarithm (u shall be > 0)\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end log;\n"
            + "function log10 \"base 10 logarithm (u shall be > 0)\"\n"
            + "  input Real u;\n"
            + "  output Real y;\n"
            + "end log10;\n"
            + "package Connections"
            + "  function branch"
            + "    input Real a;\n"      // Type not used
            + "    input Real b;\n"      // Type not used
            + "  end branch;"
            + "  function root"
            + "    input Real a;\n"      // Type not used
            + "  end root;"
            + "  function potentialRoot"
            + "    input Real A;\n"      // Type not used
            + "    input Integer priority = 0;\n"
            + "  end potentialRoot;"
            + "  function isRoot"
            + "    input Real a;\n"      // Type not used
            + "  end isRoot;"
            + "  function rooted"
            + "    input Real a;\n"      // Type not used
            + "    output Boolean y;\n"
            + "  end rooted;"
            + "end Connections;"
            + "function rooted"
            + "  input Real a;\n"      // Type not used
            + "  output Boolean y;\n"
            + "end rooted;"
            ;
    /**
     * @aspect DumpClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:411
     */
    public void dumpClasses(String indent) {
		for (StoredDefinition sd : getUnstructuredEntitys()) {
//		    System.out.println("### #" + sd.getFileName());
		    for (Element e : sd.getElements()) {
				e.dumpClasses(indent + " ");
			}
		}	
		/*
		for (LibNode ln : getLibNodes()) {
//		    System.out.println("### #" + ln.getStoredDefinition().getFileName());
			for (Element el : ln.getStoredDefinition().getElements()) {
				el.dumpClasses(indent + " ");
			}
		}
		*/
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:123
     */
    @Override
	public void propagateFormatting() {
		for (StoredDefinition definition : getUnstructuredEntitys())
			definition.propagateFormatting();
	}
    /**
     * @declaredat ASTNode:1
     */
    public Program() {
        super();
    }
    /**
     * Initializes the child array to the correct size.
     * Initializes List and Opt nta children.
     * @apilevel internal
     * @ast method
     * @declaredat ASTNode:10
     */
    public void init$Children() {
        children = new ASTNode[10];
        setChild(new List(), 0);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
    }
    /**
     * @declaredat ASTNode:19
     */
    public Program(List<StoredDefinition> p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getAnonymousClassList_reset();
        getInstProgramRoot_reset();
        getUnknownClassDecl_reset();
        getUnknownComponentDecl_reset();
        getLibNodeList_reset();
        getPredefinedTypeList_reset();
        getEnumBaseDecl_reset();
        getBuiltInFunctionList_reset();
        getBuiltInTypeList_reset();
        simpleLookupClassDefaultScope_String_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:59
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public Program clone() throws CloneNotSupportedException {
        Program node = (Program) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public Program copy() {
        try {
            Program node = (Program) clone();
            node.parent = null;
            if(children != null) {
                node.children = (ASTNode[]) children.clone();
            }
            return node;
        } catch (CloneNotSupportedException e) {
            throw new Error("Error: clone not supported for " + getClass().getName());
        }
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:91
     */
    public Program fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:100
     */
    public Program treeCopyNoTransform() {
        Program tree = (Program) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
                case 2:
                case 3:
                case 9:
                    tree.children[i] = null;
                    continue;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    tree.children[i] = new List();
                    continue;
                }
                ASTNode child = (ASTNode) children[i];
                if(child != null) {
                    child = child.treeCopyNoTransform();
                    tree.setChild(child, i);
                }
            }
        }
        return tree;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:135
     */
    public Program treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:142
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the UnstructuredEntity list.
     * @param list The new list node to be used as the UnstructuredEntity list.
     * @apilevel high-level
     */
    public void setUnstructuredEntityList(List<StoredDefinition> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the UnstructuredEntity list.
     * @return Number of children in the UnstructuredEntity list.
     * @apilevel high-level
     */
    public int getNumUnstructuredEntity() {
        return getUnstructuredEntityList().getNumChild();
    }
    /**
     * Retrieves the number of children in the UnstructuredEntity list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the UnstructuredEntity list.
     * @apilevel low-level
     */
    public int getNumUnstructuredEntityNoTransform() {
        return getUnstructuredEntityListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the UnstructuredEntity list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the UnstructuredEntity list.
     * @apilevel high-level
     */
    public StoredDefinition getUnstructuredEntity(int i) {
        return (StoredDefinition) getUnstructuredEntityList().getChild(i);
    }
    /**
     * Check whether the UnstructuredEntity list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasUnstructuredEntity() {
        return getUnstructuredEntityList().getNumChild() != 0;
    }
    /**
     * Append an element to the UnstructuredEntity list.
     * @param node The element to append to the UnstructuredEntity list.
     * @apilevel high-level
     */
    public void addUnstructuredEntity(StoredDefinition node) {
        List<StoredDefinition> list = (parent == null || state == null) ? getUnstructuredEntityListNoTransform() : getUnstructuredEntityList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addUnstructuredEntityNoTransform(StoredDefinition node) {
        List<StoredDefinition> list = getUnstructuredEntityListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the UnstructuredEntity list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setUnstructuredEntity(StoredDefinition node, int i) {
        List<StoredDefinition> list = getUnstructuredEntityList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the UnstructuredEntity list.
     * @return The node representing the UnstructuredEntity list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="UnstructuredEntity")
    public List<StoredDefinition> getUnstructuredEntityList() {
        List<StoredDefinition> list = (List<StoredDefinition>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the UnstructuredEntity list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the UnstructuredEntity list.
     * @apilevel low-level
     */
    public List<StoredDefinition> getUnstructuredEntityListNoTransform() {
        return (List<StoredDefinition>) getChildNoTransform(0);
    }
    /**
     * Retrieves the UnstructuredEntity list.
     * @return The node representing the UnstructuredEntity list.
     * @apilevel high-level
     */
    public List<StoredDefinition> getUnstructuredEntitys() {
        return getUnstructuredEntityList();
    }
    /**
     * Retrieves the UnstructuredEntity list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the UnstructuredEntity list.
     * @apilevel low-level
     */
    public List<StoredDefinition> getUnstructuredEntitysNoTransform() {
        return getUnstructuredEntityListNoTransform();
    }
    /**
     * Retrieves the UnknownClassDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the UnknownClassDecl child.
     * @apilevel low-level
     */
    public UnknownClassDecl getUnknownClassDeclNoTransform() {
        return (UnknownClassDecl) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child UnknownClassDecl.
     * @return The the child position of the optional child UnknownClassDecl.
     * @apilevel low-level
     */
    protected int getUnknownClassDeclChildPosition() {
        return 1;
    }
    /**
     * Retrieves the UnknownComponentDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the UnknownComponentDecl child.
     * @apilevel low-level
     */
    public UnknownComponentDecl getUnknownComponentDeclNoTransform() {
        return (UnknownComponentDecl) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child UnknownComponentDecl.
     * @return The the child position of the optional child UnknownComponentDecl.
     * @apilevel low-level
     */
    protected int getUnknownComponentDeclChildPosition() {
        return 2;
    }
    /**
     * Retrieves the EnumBaseDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the EnumBaseDecl child.
     * @apilevel low-level
     */
    public EnumClassDecl getEnumBaseDeclNoTransform() {
        return (EnumClassDecl) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child EnumBaseDecl.
     * @return The the child position of the optional child EnumBaseDecl.
     * @apilevel low-level
     */
    protected int getEnumBaseDeclChildPosition() {
        return 3;
    }
    /**
     * Retrieves the number of children in the PredefinedType list.
     * @return Number of children in the PredefinedType list.
     * @apilevel high-level
     */
    public int getNumPredefinedType() {
        return getPredefinedTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the PredefinedType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the PredefinedType list.
     * @apilevel low-level
     */
    public int getNumPredefinedTypeNoTransform() {
        return getPredefinedTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the PredefinedType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the PredefinedType list.
     * @apilevel high-level
     */
    public BaseClassDecl getPredefinedType(int i) {
        return (BaseClassDecl) getPredefinedTypeList().getChild(i);
    }
    /**
     * Check whether the PredefinedType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasPredefinedType() {
        return getPredefinedTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the PredefinedType list.
     * @param node The element to append to the PredefinedType list.
     * @apilevel high-level
     */
    public void addPredefinedType(BaseClassDecl node) {
        List<BaseClassDecl> list = (parent == null || state == null) ? getPredefinedTypeListNoTransform() : getPredefinedTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addPredefinedTypeNoTransform(BaseClassDecl node) {
        List<BaseClassDecl> list = getPredefinedTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the PredefinedType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setPredefinedType(BaseClassDecl node, int i) {
        List<BaseClassDecl> list = getPredefinedTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the PredefinedType list.
     * @return The the child position of the PredefinedType list.
     * @apilevel low-level
     */
    protected int getPredefinedTypeListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the PredefinedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the PredefinedType list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getPredefinedTypeListNoTransform() {
        return (List<BaseClassDecl>) getChildNoTransform(4);
    }
    /**
     * Retrieves the PredefinedType list.
     * @return The node representing the PredefinedType list.
     * @apilevel high-level
     */
    public List<BaseClassDecl> getPredefinedTypes() {
        return getPredefinedTypeList();
    }
    /**
     * Retrieves the PredefinedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the PredefinedType list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getPredefinedTypesNoTransform() {
        return getPredefinedTypeListNoTransform();
    }
    /**
     * Retrieves the number of children in the BuiltInType list.
     * @return Number of children in the BuiltInType list.
     * @apilevel high-level
     */
    public int getNumBuiltInType() {
        return getBuiltInTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the BuiltInType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the BuiltInType list.
     * @apilevel low-level
     */
    public int getNumBuiltInTypeNoTransform() {
        return getBuiltInTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the BuiltInType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the BuiltInType list.
     * @apilevel high-level
     */
    public ClassDecl getBuiltInType(int i) {
        return (ClassDecl) getBuiltInTypeList().getChild(i);
    }
    /**
     * Check whether the BuiltInType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasBuiltInType() {
        return getBuiltInTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the BuiltInType list.
     * @param node The element to append to the BuiltInType list.
     * @apilevel high-level
     */
    public void addBuiltInType(ClassDecl node) {
        List<ClassDecl> list = (parent == null || state == null) ? getBuiltInTypeListNoTransform() : getBuiltInTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addBuiltInTypeNoTransform(ClassDecl node) {
        List<ClassDecl> list = getBuiltInTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the BuiltInType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setBuiltInType(ClassDecl node, int i) {
        List<ClassDecl> list = getBuiltInTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the BuiltInType list.
     * @return The the child position of the BuiltInType list.
     * @apilevel low-level
     */
    protected int getBuiltInTypeListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the BuiltInType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the BuiltInType list.
     * @apilevel low-level
     */
    public List<ClassDecl> getBuiltInTypeListNoTransform() {
        return (List<ClassDecl>) getChildNoTransform(5);
    }
    /**
     * Retrieves the BuiltInType list.
     * @return The node representing the BuiltInType list.
     * @apilevel high-level
     */
    public List<ClassDecl> getBuiltInTypes() {
        return getBuiltInTypeList();
    }
    /**
     * Retrieves the BuiltInType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the BuiltInType list.
     * @apilevel low-level
     */
    public List<ClassDecl> getBuiltInTypesNoTransform() {
        return getBuiltInTypeListNoTransform();
    }
    /**
     * Retrieves the number of children in the BuiltInFunction list.
     * @return Number of children in the BuiltInFunction list.
     * @apilevel high-level
     */
    public int getNumBuiltInFunction() {
        return getBuiltInFunctionList().getNumChild();
    }
    /**
     * Retrieves the number of children in the BuiltInFunction list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the BuiltInFunction list.
     * @apilevel low-level
     */
    public int getNumBuiltInFunctionNoTransform() {
        return getBuiltInFunctionListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the BuiltInFunction list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the BuiltInFunction list.
     * @apilevel high-level
     */
    public BaseClassDecl getBuiltInFunction(int i) {
        return (BaseClassDecl) getBuiltInFunctionList().getChild(i);
    }
    /**
     * Check whether the BuiltInFunction list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasBuiltInFunction() {
        return getBuiltInFunctionList().getNumChild() != 0;
    }
    /**
     * Append an element to the BuiltInFunction list.
     * @param node The element to append to the BuiltInFunction list.
     * @apilevel high-level
     */
    public void addBuiltInFunction(BaseClassDecl node) {
        List<BaseClassDecl> list = (parent == null || state == null) ? getBuiltInFunctionListNoTransform() : getBuiltInFunctionList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addBuiltInFunctionNoTransform(BaseClassDecl node) {
        List<BaseClassDecl> list = getBuiltInFunctionListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the BuiltInFunction list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setBuiltInFunction(BaseClassDecl node, int i) {
        List<BaseClassDecl> list = getBuiltInFunctionList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the BuiltInFunction list.
     * @return The the child position of the BuiltInFunction list.
     * @apilevel low-level
     */
    protected int getBuiltInFunctionListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the BuiltInFunction list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the BuiltInFunction list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getBuiltInFunctionListNoTransform() {
        return (List<BaseClassDecl>) getChildNoTransform(6);
    }
    /**
     * Retrieves the BuiltInFunction list.
     * @return The node representing the BuiltInFunction list.
     * @apilevel high-level
     */
    public List<BaseClassDecl> getBuiltInFunctions() {
        return getBuiltInFunctionList();
    }
    /**
     * Retrieves the BuiltInFunction list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the BuiltInFunction list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getBuiltInFunctionsNoTransform() {
        return getBuiltInFunctionListNoTransform();
    }
    /**
     * Retrieves the number of children in the LibNode list.
     * @return Number of children in the LibNode list.
     * @apilevel high-level
     */
    public int getNumLibNode() {
        return getLibNodeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the LibNode list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the LibNode list.
     * @apilevel low-level
     */
    public int getNumLibNodeNoTransform() {
        return getLibNodeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the LibNode list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the LibNode list.
     * @apilevel high-level
     */
    public LibNode getLibNode(int i) {
        return (LibNode) getLibNodeList().getChild(i);
    }
    /**
     * Check whether the LibNode list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasLibNode() {
        return getLibNodeList().getNumChild() != 0;
    }
    /**
     * Append an element to the LibNode list.
     * @param node The element to append to the LibNode list.
     * @apilevel high-level
     */
    public void addLibNode(LibNode node) {
        List<LibNode> list = (parent == null || state == null) ? getLibNodeListNoTransform() : getLibNodeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addLibNodeNoTransform(LibNode node) {
        List<LibNode> list = getLibNodeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the LibNode list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setLibNode(LibNode node, int i) {
        List<LibNode> list = getLibNodeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the LibNode list.
     * @return The the child position of the LibNode list.
     * @apilevel low-level
     */
    protected int getLibNodeListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the LibNode list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the LibNode list.
     * @apilevel low-level
     */
    public List<LibNode> getLibNodeListNoTransform() {
        return (List<LibNode>) getChildNoTransform(7);
    }
    /**
     * Retrieves the LibNode list.
     * @return The node representing the LibNode list.
     * @apilevel high-level
     */
    public List<LibNode> getLibNodes() {
        return getLibNodeList();
    }
    /**
     * Retrieves the LibNode list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the LibNode list.
     * @apilevel low-level
     */
    public List<LibNode> getLibNodesNoTransform() {
        return getLibNodeListNoTransform();
    }
    /**
     * Retrieves the number of children in the AnonymousClass list.
     * @return Number of children in the AnonymousClass list.
     * @apilevel high-level
     */
    public int getNumAnonymousClass() {
        return getAnonymousClassList().getNumChild();
    }
    /**
     * Retrieves the number of children in the AnonymousClass list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the AnonymousClass list.
     * @apilevel low-level
     */
    public int getNumAnonymousClassNoTransform() {
        return getAnonymousClassListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the AnonymousClass list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the AnonymousClass list.
     * @apilevel high-level
     */
    public BaseClassDecl getAnonymousClass(int i) {
        return (BaseClassDecl) getAnonymousClassList().getChild(i);
    }
    /**
     * Check whether the AnonymousClass list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAnonymousClass() {
        return getAnonymousClassList().getNumChild() != 0;
    }
    /**
     * Append an element to the AnonymousClass list.
     * @param node The element to append to the AnonymousClass list.
     * @apilevel high-level
     */
    public void addAnonymousClass(BaseClassDecl node) {
        List<BaseClassDecl> list = (parent == null || state == null) ? getAnonymousClassListNoTransform() : getAnonymousClassList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAnonymousClassNoTransform(BaseClassDecl node) {
        List<BaseClassDecl> list = getAnonymousClassListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the AnonymousClass list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAnonymousClass(BaseClassDecl node, int i) {
        List<BaseClassDecl> list = getAnonymousClassList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the AnonymousClass list.
     * @return The the child position of the AnonymousClass list.
     * @apilevel low-level
     */
    protected int getAnonymousClassListChildPosition() {
        return 8;
    }
    /**
     * Retrieves the AnonymousClass list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AnonymousClass list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getAnonymousClassListNoTransform() {
        return (List<BaseClassDecl>) getChildNoTransform(8);
    }
    /**
     * Retrieves the AnonymousClass list.
     * @return The node representing the AnonymousClass list.
     * @apilevel high-level
     */
    public List<BaseClassDecl> getAnonymousClasss() {
        return getAnonymousClassList();
    }
    /**
     * Retrieves the AnonymousClass list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AnonymousClass list.
     * @apilevel low-level
     */
    public List<BaseClassDecl> getAnonymousClasssNoTransform() {
        return getAnonymousClassListNoTransform();
    }
    /**
     * Retrieves the InstProgramRoot child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstProgramRoot child.
     * @apilevel low-level
     */
    public InstProgramRoot getInstProgramRootNoTransform() {
        return (InstProgramRoot) getChildNoTransform(9);
    }
    /**
     * Retrieves the child position of the optional child InstProgramRoot.
     * @return The the child position of the optional child InstProgramRoot.
     * @apilevel low-level
     */
    protected int getInstProgramRootChildPosition() {
        return 9;
    }
    /**
     * @apilevel internal
     */
    protected boolean getAnonymousClassList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getAnonymousClassList_value;
    /**
     * @apilevel internal
     */
    private void getAnonymousClassList_reset() {
        getAnonymousClassList_computed = false;
        getAnonymousClassList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getAnonymousClassList() {
        if(getAnonymousClassList_computed) {
            return (List) getChild(getAnonymousClassListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getAnonymousClassList_value = new List();
        setChild(getAnonymousClassList_value, getAnonymousClassListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getAnonymousClassList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getAnonymousClassListChildPosition());
        return node;
    }
    /**
     * @attribute syn
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:795
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl anonymousClass(String code, Restriction restriction, String targetName) {
        ASTNode$State state = state();
        try {
                if (anonymousClassMap == null)
                    anonymousClassMap = new HashMap<String,ClassDecl>();
                ClassDecl res = anonymousClassMap.get(code);
                if (res == null) {
                    try {
                        addAnonymousClass(ParserHandler.parseAnonymousClassString(code, restriction, targetName));
                        res = getAnonymousClass(getNumAnonymousClass() - 1);
                        anonymousClassMap.put(code, res);
                    } catch (IOException e) {
                        // Can't normally happen when reading from a string, but just in case
                        throw new RuntimeException("Reading from string failed", e);
                    } catch (beaver.Parser.Exception e) {
                        // Parser crashed - just handle this higher up
                        throw new RuntimeException("Parser crashed", e);
                    } catch (ParserException e) {
                        CompilerException ce = new CompilerException();
                        ce.addProblem(e.getProblem());
                        throw ce;
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstProgramRoot_computed = false;
    /**
     * @apilevel internal
     */
    protected InstProgramRoot getInstProgramRoot_value;
    /**
     * @apilevel internal
     */
    private void getInstProgramRoot_reset() {
        getInstProgramRoot_computed = false;
        getInstProgramRoot_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstProgramRoot getInstProgramRoot() {
        if(getInstProgramRoot_computed) {
            return (InstProgramRoot) getChild(getInstProgramRootChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstProgramRoot_value = getInstProgramRoot_compute();
        setChild(getInstProgramRoot_value, getInstProgramRootChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstProgramRoot_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        InstProgramRoot node = (InstProgramRoot) this.getChild(getInstProgramRootChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private InstProgramRoot getInstProgramRoot_compute() {
            return new InstProgramRoot(this, new Opt(), new Opt(), new Opt());
        }
    /**
     * @attribute syn
     * @aspect SourceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2390
     */
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        try {
            	ArrayList<ClassDecl> l = new ArrayList<ClassDecl>();
                for (StoredDefinition sd : getUnstructuredEntitys()) 
                    for (Element e : sd.getElements()) 
                        if (!e.isError())
                            l.add((ClassDecl) e);
            	// Libraries are loaded when needed in instance lookup instead
            	return l;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean getUnknownClassDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected UnknownClassDecl getUnknownClassDecl_value;
    /**
     * @apilevel internal
     */
    private void getUnknownClassDecl_reset() {
        getUnknownClassDecl_computed = false;
        getUnknownClassDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownClassDecl getUnknownClassDecl() {
        if(getUnknownClassDecl_computed) {
            return (UnknownClassDecl) getChild(getUnknownClassDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownClassDecl_value = new UnknownClassDecl(new IdDecl("Unknown"),
                                     new PublicVisibilityType(),
                                     new Opt(),
                                     new Opt(),
                                     new MClass(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new Opt(),
                                     new List(),
                                     new List(),
                                     new List(),
                                     new List(),
                                     new List(),
                                     new List(),
                                     new List(),
                                     new Opt(),
                                     new Opt(),
                                     new EndDecl("Unknown"));
        setChild(getUnknownClassDecl_value, getUnknownClassDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownClassDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        UnknownClassDecl node = (UnknownClassDecl) this.getChild(getUnknownClassDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getUnknownComponentDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected UnknownComponentDecl getUnknownComponentDecl_value;
    /**
     * @apilevel internal
     */
    private void getUnknownComponentDecl_reset() {
        getUnknownComponentDecl_computed = false;
        getUnknownComponentDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownComponentDecl getUnknownComponentDecl() {
        if(getUnknownComponentDecl_computed) {
            return (UnknownComponentDecl) getChild(getUnknownComponentDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownComponentDecl_value = new UnknownComponentDecl(new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new ClassAccess("Unknown"),
                                          new Opt(),
                                          new PublicVisibilityType(),
                                          new IdDecl("Unknown"),
                                          new Opt(),
                                          new Opt(),
                                          new Opt(),
                                          new Comment(),
                                          new Opt(),
                                          new Comment());
        setChild(getUnknownComponentDecl_value, getUnknownComponentDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownComponentDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        UnknownComponentDecl node = (UnknownComponentDecl) this.getChild(getUnknownComponentDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getLibNodeList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getLibNodeList_value;
    /**
     * @apilevel internal
     */
    private void getLibNodeList_reset() {
        getLibNodeList_computed = false;
        getLibNodeList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getLibNodeList() {
        if(getLibNodeList_computed) {
            return (List) getChild(getLibNodeListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getLibNodeList_value = getLibraryList().createLibNodeList();
        setChild(getLibNodeList_value, getLibNodeListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getLibNodeList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getLibNodeListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getPredefinedTypeList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getPredefinedTypeList_value;
    /**
     * @apilevel internal
     */
    private void getPredefinedTypeList_reset() {
        getPredefinedTypeList_computed = false;
        getPredefinedTypeList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getPredefinedTypeList() {
        if(getPredefinedTypeList_computed) {
            return (List) getChild(getPredefinedTypeListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getPredefinedTypeList_value = getPredefinedTypeList_compute();
        setChild(getPredefinedTypeList_value, getPredefinedTypeListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getPredefinedTypeList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getPredefinedTypeListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getPredefinedTypeList_compute() {
            List l = new List();
    
            String builtInDef = 
                    "type Real\n"
                  + "RealType value=0;\n"
                  + "parameter StringType quantity=\"\";\n"
                  + "parameter StringType unit=\"\";\n"
                  + "parameter StringType displayUnit=\"\";\n"
                  + "parameter RealType min=-1e20, max=1e20;\n"
                  + "parameter RealType start=0;\n"
                  + "parameter BooleanType fixed=false;\n"
                  + "parameter RealType nominal=0;\n"
                  + "parameter EnumType stateSelect=StateSelect.default;\n"
                  + "end Real;\n"
                    
                  + "type Integer\n"
                  + "IntegerType value=0;\n"
                  + "parameter StringType quantity=\"\";\n"
                  + "parameter IntegerType min=-1e20, max=1e20;\n"
                  + "parameter IntegerType start=0;\n"
                  + "parameter BooleanType fixed=false;\n"
                  + "end Integer;\n"
                    
                  + "type Boolean\n"
                  + "BooleanType value=0;\n"
                  + "parameter StringType quantity=\"\";\n"
                  + "parameter BooleanType start=false;\n"
                  + "parameter BooleanType fixed=true;\n"
                  + "end Boolean;\n"
                    
                  + "type String\n"
                  + "StringType value=0;\n"
                  + "parameter StringType quantity=\"\";\n"
                  + "parameter StringType start=\"\";\n"
                  + "end String;\n"
                    
                  + "type StateSelect = enumeration("
                  + " never \"Do not use as state at all.\","
                  + " avoid \"Use as state, if it cannot be avoided (but only if variable appears differentiated and no other potential state with attribute default, prefer, or always can be selected).\","
                  + " default \"Use as state if appropriate, but only if variable appears differentiated.\","
                  + " prefer \"Prefer it as state over those having the default value (also variables can be selected, which do not appear differentiated). \","
                  + " always \"Do use it as a state.\""
                  + ");\n"
                    
                  + "type AssertionLevel = enumeration(error, warning);\n"
                    
                  + "partial model ExternalObject\n"
                  + "end ExternalObject;\n";
    
            PrimitiveClassDecl pcd = null;
    
            Program p;
            try {
                p = ParserHandler.parseString(root().getUtilInterface(), builtInDef, "").getProgram();
            } catch (Exception e) {
                return l;
            }
            
            for (Element elem : p.getUnstructuredEntity(0).getElements()) {
                FullClassDecl cd = (FullClassDecl) elem;
                
                if (!cd.name().equals("StateSelect") && !cd.name().equals("AssertionLevel")) {
                    pcd = new PrimitiveClassDecl(cd.getName(),
                            new PublicVisibilityType(),
                            new Opt(),
                            new Opt(),
                            cd.getRestriction(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            cd.getEquationList(),
                            cd.getAlgorithmList(),
                            cd.getSuperList(),
                            cd.getImportList(),
                            cd.getClassDeclList(),
                            cd.getComponentDeclList(),
                            cd.getElementModificationList(),
                            new Opt(),
                            cd.getAnnotationOpt(),
                            cd.getEndDecl());
                    l.add(pcd); 
                } else {
                    pcd = new EnumClassDecl(cd.getName(),
                            new PublicVisibilityType(),
                            new Opt(),
                            new Opt(),
                            cd.getRestriction(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            new Opt(),
                            cd.getEquationList(),
                            cd.getAlgorithmList(),
                            cd.getSuperList(),
                            cd.getImportList(),
                            cd.getClassDeclList(),
                            cd.getComponentDeclList(),
                            cd.getElementModificationList(),
                            new Opt(),
                            cd.getAnnotationOpt(),
                            cd.getEndDecl(),
                            new Symbol("enumeration"));
                    pcd.originalComposition = cd.originalComposition;
                    l.add(pcd);
                }
            }
            
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getEnumBaseDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected EnumClassDecl getEnumBaseDecl_value;
    /**
     * @apilevel internal
     */
    private void getEnumBaseDecl_reset() {
        getEnumBaseDecl_computed = false;
        getEnumBaseDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public EnumClassDecl getEnumBaseDecl() {
        if(getEnumBaseDecl_computed) {
            return (EnumClassDecl) getChild(getEnumBaseDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getEnumBaseDecl_value = getEnumBaseDecl_compute();
        setChild(getEnumBaseDecl_value, getEnumBaseDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getEnumBaseDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        EnumClassDecl node = (EnumClassDecl) this.getChild(getEnumBaseDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private EnumClassDecl getEnumBaseDecl_compute() {
    
            // Build a string with a Modelica class corresponding to a basic
        	// enumeration
            String builtInDef = 
                    "type BaseEnum\n"
                  + "EnumType value;\n"
                  + "parameter StringType quantity=\"\";\n"
                  + "parameter EnumType min, max;\n"
                  + "parameter EnumType start;\n"
                  + "parameter BooleanType fixed=false;\n"
                  + "end BaseEnum;\n";
            
            EnumClassDecl ecd = null;
      
            try {
            
                SourceRoot sr = ParserHandler.parseString(root().getUtilInterface(), builtInDef,"");
                Program p = sr.getProgram();
    
                FullClassDecl cd = (FullClassDecl)(p.getUnstructuredEntity(0).getElement(0));   
                
                ecd = new EnumClassDecl(cd.getName(),
                                        new PublicVisibilityType(),
                                        new Opt(),
                                        new Opt(),
                                        cd.getRestriction(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        new Opt(),
                                        cd.getEquationList(),
                                        cd.getAlgorithmList(),
                                        cd.getSuperList(),
                                        cd.getImportList(),
                                        cd.getClassDeclList(),
                                        cd.getComponentDeclList(),
                                        cd.getElementModificationList(),
                                        new Opt(),
                                        cd.getAnnotationOpt(),
                                        cd.getEndDecl(),
                                        new Symbol("enumeration"));
                ecd.originalComposition = cd.originalComposition;
            
            } catch(Exception e){e.printStackTrace();}
                
            //log.debug("Program.getPredefinedTypeList(): "+l.getNumChild());
            
            return ecd;
            
        }
    /**
     * @apilevel internal
     */
    protected boolean getBuiltInFunctionList_computed = false;
    /**
     * @apilevel internal
     */
    protected List<BaseClassDecl> getBuiltInFunctionList_value;
    /**
     * @apilevel internal
     */
    private void getBuiltInFunctionList_reset() {
        getBuiltInFunctionList_computed = false;
        getBuiltInFunctionList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<BaseClassDecl> getBuiltInFunctionList() {
        if(getBuiltInFunctionList_computed) {
            return (List<BaseClassDecl>) getChild(getBuiltInFunctionListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getBuiltInFunctionList_value = getBuiltInFunctionList_compute();
        setChild(getBuiltInFunctionList_value, getBuiltInFunctionListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getBuiltInFunctionList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List<BaseClassDecl> node = (List<BaseClassDecl>) this.getChild(getBuiltInFunctionListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<BaseClassDecl> getBuiltInFunctionList_compute() {
            List<BaseClassDecl> l = new List<BaseClassDecl>();
      
            try {
                SourceRoot sr = ParserHandler.parseString(root().getUtilInterface(), BUILTIN_FUNCS, "");
                Program p = sr.getProgram();
                
                ExternalClause builtin = new ExternalClause(new Opt(new ExternalLanguage("builtin")), new Opt(), new Opt());
                for (Element e : p.getUnstructuredEntity(0).getElements()) 
                	e.addBuiltinFunctions(l, builtin);
            } catch (Exception e) {}
            
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getBuiltInTypeList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getBuiltInTypeList_value;
    /**
     * @apilevel internal
     */
    private void getBuiltInTypeList_reset() {
        getBuiltInTypeList_computed = false;
        getBuiltInTypeList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getBuiltInTypeList() {
        if(getBuiltInTypeList_computed) {
            return (List) getChild(getBuiltInTypeListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getBuiltInTypeList_value = getBuiltInTypeList_compute();
        setChild(getBuiltInTypeList_value, getBuiltInTypeListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getBuiltInTypeList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getBuiltInTypeListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getBuiltInTypeList_compute() {
            List l = new List();
            l.add(new BuiltInClassDecl(new IdDecl("RealType")));
            l.add(new BuiltInClassDecl(new IdDecl("IntegerType")));
            l.add(new BuiltInClassDecl(new IdDecl("BooleanType")));
            l.add(new BuiltInClassDecl(new IdDecl("StringType")));
            l.add(new BuiltInClassDecl(new IdDecl("EnumType")));
            return l;
        }
    /**
     * @attribute syn
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:78
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDotted(String name) {
        ASTNode$State state = state();
        try {
        		String[] parts = name.split("\\.", 2);
        		ClassDecl base = simpleLookupClassDefaultScope(parts[0]);
        		return (base == null || parts.length == 1) ? base : base.simpleLookupClassDotted(parts[1]);
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:84
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDottedGlobal(String name) {
        ASTNode$State state = state();
        try {
                return simpleLookupClassDotted(name);
            }
        finally {
        }
    }
    protected Map simpleLookupClassDefaultScope_String_values;
    /**
     * @apilevel internal
     */
    private void simpleLookupClassDefaultScope_String_reset() {
        simpleLookupClassDefaultScope_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDefaultScope(String name) {
        Object _parameters = name;
        if (simpleLookupClassDefaultScope_String_values == null) simpleLookupClassDefaultScope_String_values = new HashMap(4);
        if(simpleLookupClassDefaultScope_String_values.containsKey(_parameters)) {
            return (ClassDecl)simpleLookupClassDefaultScope_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ClassDecl simpleLookupClassDefaultScope_String_value = simpleLookupClassDefaultScope_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            simpleLookupClassDefaultScope_String_values.put(_parameters, simpleLookupClassDefaultScope_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return simpleLookupClassDefaultScope_String_value;
    }
    /**
     * @apilevel internal
     */
    private ClassDecl simpleLookupClassDefaultScope_compute(String name) {
    		for (StoredDefinition sd : getUnstructuredEntitys())
    			for (Element e : sd.getElements())
    				if (e instanceof ClassDecl && e.matches(name))
    					return (ClassDecl) e;
    		
    		ClassDecl res = simpleLookupInClassList(getPredefinedTypes(), name);
    		if (res != null)
    			return res;
    			
    		res = simpleLookupInClassList(getBuiltInTypes(), name);
    		if (res != null)
    			return res;
    			
    		res = simpleLookupInClassList(getBuiltInFunctions(), name);
    		if (res != null)
    			return res;
    		
    		res = simpleLookupInLibNodeList(getLibNodes(), name);
    		return (res != null) ? res : getUnknownClassDecl();
    	}
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:488
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child) {
        if (caller == getInstProgramRootNoTransform()) {
            return new Environment();
        }
        else {
            return getParent().Define_myEnvironment(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:517
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstProgramRootNoTransform()) {
            return new Environment();
        }
        else {
            return getParent().Define_myEnvironment(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:51
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return simpleLookupClassDefaultScope(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:88
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClassGlobalScope(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return simpleLookupClassDefaultScope(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:554
     * @apilevel internal
     */
    public String Define_retrieveFileName(ASTNode caller, ASTNode child) {
        if (caller == getAnonymousClassListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return ParserHandler.ANONYMOUS_CLASS_FILENAME;
        }
        else {
            return super.Define_retrieveFileName(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
