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
 * Array subscripts used in FQNames.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:522
 * @production FArraySubscripts : {@link BaseNode} ::= <span class="component">{@link FSubscript}*</span>;

 */
public class FArraySubscripts extends BaseNode implements Cloneable {
    /**
     * Return an Index with these array subscripts.
     * 
     * This version is not cached, to allow indices to be re-evaluated at each use 
     * during function evaluation.
     * 
     * @throws ConstantEvaluationException  if the subscripts can't be evaluated to 
     * constant Integer values.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:80
     */
    public Index createIndex() {
        if (getNumFSubscript() == 0) {
            return Index.NULL;
        }
		int[] i = new int[getNumFSubscript()];
		int j = 0;
		for (FSubscript s : getFSubscripts()) 
			i[j++] = s.value();
		return new Index(i);
	}
    /**
     * Get the array size for a collection of FSubscripts.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:593
     */
    public static Size declarationSize(Iterable<? extends FSubscript> subs) {
		int ndims = 0;
		for (FSubscript fs : subs)
			ndims++;
		if (ndims == 0)
			return Size.SCALAR;
		MutableSize s = new MutableSize(ndims);
		for (FSubscript fs : subs)
			fs.addDeclarationSize(s);
		return s;
	}
    /**
     * Create a copy with all array subscripts replaced by literals.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2445
     */
    public FArraySubscripts resolveSubscripts(VariableEvaluator evaluator) {
        FArraySubscripts res = new FArraySubscripts();
        for (FSubscript fs : getFSubscripts())
          res.addFSubscript(fs.resolveSubscripts(evaluator));
        return res;
    }
    /**
     * Create a new FArraySubscripts <code>n</code> literal subscripts from 
     * <code>i</code>, starting at <code>j</code>.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:928
     */
    public FArraySubscripts(Index i, int j, int n) {
		this();
		for (int k = j; k < n+j; k++)
			addFSubscript(i.get(k));
	}
    /**
     * Add a new use expression subscript to the list of FSubscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:937
     */
    public void addFSubscript(FExp e) {
		addFSubscript(new FExpSubscript(e));
	}
    /**
     * Add a new integer literal subscript to the list of FSubscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:944
     */
    public void addFSubscript(int i) {
		addFSubscript(new FIntegerSubscript(i));
	}
    /**
     * Add new integer literal subscripts for each index to the list of FSubscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:951
     */
    public void addFSubscripts(int[] index) {
		for (int i : index)
			addFSubscript(i);
	}
    /**
     * Add new integer literal subscripts for each index to the list of FSubscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:959
     */
    public void addFSubscripts(Index i) {
		addFSubscripts(i.index());
	}
    /**
     * Create a new FArraySubscripts containing <code>n</code> {@link FColonSubscript}s.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:966
     */
    public static FArraySubscripts createFColonSubscripts(int n) {
		List<FSubscript> l = new List<FSubscript>();
		for (int i = 0; i < n; i++)
			l.add(new FColonSubscript());
		return new FArraySubscripts(l);
	}
    /**
     * Create a new FArraySubscripts containing an integer literal.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:976
     */
    public static FArraySubscripts createLiteralSubscripts(int i) {
		List<FSubscript> l = new List<FSubscript>();
		l.add(new FIntegerSubscript(i));
		return new FArraySubscripts(l);
	}
    /**
     * Create a new FArraySubscripts containing integer literals.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:985
     */
    public static FArraySubscripts createLiteralSubscripts(int[] index) {
		FArraySubscripts fas = new FArraySubscripts();
		fas.addFSubscripts(index);
		return fas;
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:247
     */
    public FArraySubscripts createEvaluated() {
        FArraySubscripts res = new FArraySubscripts(new List());
        for (FSubscript fs : getFSubscripts())
            res.addFSubscript(fs.createEvaluated());
        return res;
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1259
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		if (getNumFSubscript()>0) {
			str.print("[");
			for (int i=0;i<getNumFSubscript();i++) {
				p.print(getFSubscript(i),str,indent);
				if (i<getNumFSubscript()-1)
					str.print(",");
			}
			str.print("]");
		}
	}
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:545
     */
    public FArraySubscripts copyReplaceAccess(FExp.ContextReplacer crp) {
        FArraySubscripts res = new FArraySubscripts();
        for (FSubscript f : getFSubscripts()) {
            res.addFSubscript(f.copyReplaceAccess(crp));
        }
        return res;
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:735
     */
    public void forceVariability(ErrorCheckType checkType,  FTypePrefixVariability v) {
        for (FSubscript s : getFSubscripts())
            s.forceVariability(checkType, v);
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1147
     */
    public void collectErrors(ErrorCheckType checkType) {
		// Should this check be in the access instead?
        int ndims = myDims();
		if (getNumFSubscript() > ndims && !isInstComponentSize() && myAccessExists()) {
			// TODO: shouldn't this check for to few as well? (no [] or all dimensions given)
			error("Too many array subscripts for access: " + getNumFSubscript() + 
                    " subscripts given, component has " + ndims + " dimensions");
			allChecks(checkType);
			for (int i = 0; i < ndims; i++)
				getFSubscript(i).collectErrors(checkType);
		} else {
    		super.collectErrors(checkType);
		}
	}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1520
     */
    public void specifyNext(int index) {
        for (int i = 0; i < getNumFSubscript(); i++) {
            if (getFSubscript(i).ndims() > 0) {
                setFSubscript(getFSubscript(i).specify(index), i);
                return;
            }
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1821
     */
    public FArraySubscripts flatten(FQName prefix) {
        List l = new List();
        for (FSubscript fs : getFSubscripts())
            l.add(fs.flatten(prefix));
        return new FArraySubscripts(l);
    }
    /**
     * Inline all calls to functions that we can inline.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:914
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        for (FSubscript fs : getFSubscripts()) {
            fs.inlineFunctions(fi);
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1601
     */
    public FArraySubscripts copyWithNonLiteralSubscriptsAsColon() {
        FArraySubscripts res = new FArraySubscripts();
        for (FSubscript s : getFSubscripts()) {
            res.addFSubscriptNoTransform(s.copyWithNonLiteralSubscriptsAsColon());
        }
        return res;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1649
     */
    public void copyNonLiteralSubscriptsTo(FArraySubscripts fas) {
        for (FSubscript s : getFSubscripts()) {
            s.copyNonLiteralSubscriptsTo(fas);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1542
     */
    public FArraySubscripts scalarize(Map<String,FExp> indexMap) {
		FArraySubscripts fas = new FArraySubscripts();
		for (FSubscript fs : getFSubscripts()) {
			fas.addFSubscript(fs.scalarize(indexMap));
		}
		return fas;
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:703
     */
    public void addArrayUsesToIndexMap(FExp[] names) {
        int i = 0;
        for (FSubscript fs : getFSubscripts()) {
            if (fs.type().isArray()) {
                FExp[] local = new FExp[1];
                local[0] = names[i++];
                fs.addArrayUsesToIndexMap(local);
            }
        }
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:487
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
        if (getNumFSubscript()>0) {
            String namespace = "exp";
            String tag = this.xmlTag();
            
            str.println(indent + "<" + namespace + ":" + tag + ">");
            
            for (FSubscript s : this.getFSubscriptList()) {
                s.prettyPrint_XML(str,p.indent(indent+"\t"));
            }
            
            str.println(indent + "</" + namespace + ":" + tag + ">");
            
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:234
     */
    public String genFunctionArrayUse_var_CAD(CodePrinter p, String name, String type) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();	
		CodeStream str = new CodeStream(os);
		str.print("jmi_array_");
		str.print(type);
		str.print("_");
		str.print(getNumFSubscript());
		str.print("(");
		str.print(name);
		str.print(", ");
		getFSubscripts().prettyPrintWithSep(printer_C, str, "", ", ");
		str.print(")");
		return os.toString();
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:263
     */
    public String genFunctionArrayUse_der_CAD(CodePrinter p, String name, String type) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();	
		CodeStream str = new CodeStream(os);
		str.print("jmi_array_");
		str.print(type);
		str.print("_");
		str.print(getNumFSubscript());
		str.print("(");
		str.print(name);
		str.print(", ");
		getFSubscripts().prettyPrintWithSep(printer_C, str, "", ", ");
		str.print(")");
		return os.toString();
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1524
     */
    @Override
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Helper, generates an array variable use
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:554
     */
    public String genFunctionArrayUse_C(CodePrinter p, String name, String type) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        CodeStream str = new CodeStream(os);
        str.print("jmi_array_");
        str.print(type);
        str.print("_");
        str.print(getNumFSubscript());
        str.print("(");
        str.print(name);
        str.print(", ");
        getFSubscripts().prettyPrintWithSep(p, str, "", ", ");
        str.print(")");
        return os.toString();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FArraySubscripts() {
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
        children = new ASTNode[1];
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FArraySubscripts(List<FSubscript> p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:20
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:26
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        asIndex_reset();
        accessNdims_reset();
        declarationSize_reset();
        accessSize_reset();
        indices_reset();
        hasUnknownIndices_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:44
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:50
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:56
     */
    public FArraySubscripts clone() throws CloneNotSupportedException {
        FArraySubscripts node = (FArraySubscripts) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public FArraySubscripts copy() {
        try {
            FArraySubscripts node = (FArraySubscripts) clone();
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
     * @declaredat ASTNode:82
     */
    public FArraySubscripts fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:91
     */
    public FArraySubscripts treeCopyNoTransform() {
        FArraySubscripts tree = (FArraySubscripts) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
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
     * @declaredat ASTNode:111
     */
    public FArraySubscripts treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:118
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FSubscript list.
     * @param list The new list node to be used as the FSubscript list.
     * @apilevel high-level
     */
    public void setFSubscriptList(List<FSubscript> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FSubscript list.
     * @return Number of children in the FSubscript list.
     * @apilevel high-level
     */
    public int getNumFSubscript() {
        return getFSubscriptList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FSubscript list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FSubscript list.
     * @apilevel low-level
     */
    public int getNumFSubscriptNoTransform() {
        return getFSubscriptListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FSubscript list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FSubscript list.
     * @apilevel high-level
     */
    public FSubscript getFSubscript(int i) {
        return (FSubscript) getFSubscriptList().getChild(i);
    }
    /**
     * Check whether the FSubscript list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFSubscript() {
        return getFSubscriptList().getNumChild() != 0;
    }
    /**
     * Append an element to the FSubscript list.
     * @param node The element to append to the FSubscript list.
     * @apilevel high-level
     */
    public void addFSubscript(FSubscript node) {
        List<FSubscript> list = (parent == null || state == null) ? getFSubscriptListNoTransform() : getFSubscriptList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFSubscriptNoTransform(FSubscript node) {
        List<FSubscript> list = getFSubscriptListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FSubscript list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFSubscript(FSubscript node, int i) {
        List<FSubscript> list = getFSubscriptList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FSubscript list.
     * @return The node representing the FSubscript list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FSubscript")
    public List<FSubscript> getFSubscriptList() {
        List<FSubscript> list = (List<FSubscript>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FSubscript list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FSubscript list.
     * @apilevel low-level
     */
    public List<FSubscript> getFSubscriptListNoTransform() {
        return (List<FSubscript>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FSubscript list.
     * @return The node representing the FSubscript list.
     * @apilevel high-level
     */
    public List<FSubscript> getFSubscripts() {
        return getFSubscriptList();
    }
    /**
     * Retrieves the FSubscript list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FSubscript list.
     * @apilevel low-level
     */
    public List<FSubscript> getFSubscriptsNoTransform() {
        return getFSubscriptListNoTransform();
    }
    /**
     * @apilevel internal
     */
    protected boolean asIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected Index asIndex_value;
    /**
     * @apilevel internal
     */
    private void asIndex_reset() {
        asIndex_computed = false;
        asIndex_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Index asIndex() {
        if(asIndex_computed) {
            return asIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        asIndex_value = createIndex();
        if (isFinal && num == state().boundariesCrossed) {
            asIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return asIndex_value;
    }
    /**
     * Get array dimensions.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:128
     */
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        try { 
        		return getNumFSubscript();
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean accessNdims_computed = false;
    /**
     * @apilevel internal
     */
    protected int accessNdims_value;
    /**
     * @apilevel internal
     */
    private void accessNdims_reset() {
        accessNdims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int accessNdims() {
        if(accessNdims_computed) {
            return accessNdims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        accessNdims_value = accessNdims_compute();
        if (isFinal && num == state().boundariesCrossed) {
            accessNdims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return accessNdims_value;
    }
    /**
     * @apilevel internal
     */
    private int accessNdims_compute() { 
    		int nd = 0;
    		for (FSubscript fs : getFSubscripts()) {
    			nd += fs.ndims();
    		}
    		return nd;
    	}
    /**
     * @apilevel internal
     */
    protected boolean declarationSize_computed = false;
    /**
     * @apilevel internal
     */
    protected Size declarationSize_value;
    /**
     * @apilevel internal
     */
    private void declarationSize_reset() {
        declarationSize_computed = false;
        declarationSize_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size declarationSize() {
        if(declarationSize_computed) {
            return declarationSize_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        declarationSize_value = declarationSize(getFSubscripts());
        if (isFinal && num == state().boundariesCrossed) {
            declarationSize_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return declarationSize_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean accessSize_computed = false;
    /**
     * @apilevel internal
     */
    protected Size accessSize_value;
    /**
     * @apilevel internal
     */
    private void accessSize_reset() {
        accessSize_computed = false;
        accessSize_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size accessSize() {
        if(accessSize_computed) {
            return accessSize_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        accessSize_value = accessSize_compute();
        if (isFinal && num == state().boundariesCrossed) {
            accessSize_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return accessSize_value;
    }
    /**
     * @apilevel internal
     */
    private Size accessSize_compute() {
    		if (accessNdims() == 0)
    			return Size.SCALAR;
    		MutableSize s = new MutableSize(accessNdims());
    		for (FSubscript fs : getFSubscripts()) 
    			if (fs.ndims() == 1)
    				s.append(fs.size());
    		return s;
    	}
    /**
     * Filter out known subscripts and copy to a new FArraySubscripts. 
     * Unknown non-scalar subscripts will be specified
     * by the corresponding position in index.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1590
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts specify(Index index) {
        ASTNode$State state = state();
        try {
                FArraySubscripts res = new FArraySubscripts();
                int j = 0;
                for (FSubscript fs : getFSubscripts()) {
                    if (!fs.variability().indexParameterOrLess()) {
                        if (fs.ndims() > 0) {
                            fs = fs.specify(index.get(j));
                        } else {
                            fs = fs.fullCopy();
                        }
                        j++;
                        res.addFSubscript(fs);
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
    protected boolean indices_computed = false;
    /**
     * @apilevel internal
     */
    protected Indices indices_value;
    /**
     * @apilevel internal
     */
    private void indices_reset() {
        indices_computed = false;
        indices_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        if(indices_computed) {
            return indices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        indices_value = Indices.createFromFas(this);
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    /**
     * @attribute syn
     * @aspect CircularExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4799
     */
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        try {
        		for (FSubscript fs : getFSubscripts())
        			if (fs.isCircular())
        				return true;
        		return false;
        	}
        finally {
        }
    }
    /**
     * Check if this array subscript list has any expression or colon subscripts.
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:535
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        try {
                for (FSubscript s : getFSubscripts())
                    if (s.hasNonLiteralSubscripts())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:237
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts buildAccessContext() {
        ASTNode$State state = state();
        try {
                FArraySubscripts res = new FArraySubscripts();
                for (FSubscript fs : getFSubscripts()) {
                    res.addFSubscript(fs.buildAccessContext());
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:517
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
        		FTypePrefixVariability total = fConstant();
        		for (FSubscript arg : getFSubscripts()) 
        			total = total.combine(arg.variability());
        		return total;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:844
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFullSize() {
        ASTNode$State state = state();
        try {
              for (FSubscript fs : getFSubscripts())
                  if (!fs.isColon())
                      return false;
              return true;
          }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean hasUnknownIndices_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean hasUnknownIndices_value;
    /**
     * @apilevel internal
     */
    private void hasUnknownIndices_reset() {
        hasUnknownIndices_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasUnknownIndices() {
        if(hasUnknownIndices_computed) {
            return hasUnknownIndices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        hasUnknownIndices_value = hasUnknownIndices_compute();
        if (isFinal && num == state().boundariesCrossed) {
            hasUnknownIndices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return hasUnknownIndices_value;
    }
    /**
     * @apilevel internal
     */
    private boolean hasUnknownIndices_compute() {
            for (FSubscript fs : getFSubscripts())
                if (fs.isUnknownIndex())
                    return true;
            return false;
        }
    /**
     * @attribute syn
     * @aspect Slices
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1058
     */
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        try {
                for (FSubscript fs : getFSubscripts()) {
                    if (fs.isSlice()) {
                        return true;
                    }
                }
                return false;
            }
        finally {
        }
    }
    /**
     * Check if an array subscript contains any calls to functions that we can inline.
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:731
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        try {
                for (FSubscript fs : getFSubscripts()) {
                    if (fs.hasInlinableFunctions(fi)) {
                        return true;
                    }
                }
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "ArraySubscripts";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect AccessDims
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Dims.jrag:23
     */
    @ASTNodeAnnotation.Attribute
    public int myDims() {
        ASTNode$State state = state();
        int myDims_value = getParent().Define_myDims(this, null);

        return myDims_value;
    }
    /**
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:45
     */
    @ASTNodeAnnotation.Attribute
    public Size mySize() {
        ASTNode$State state = state();
        Size mySize_value = getParent().Define_mySize(this, null);

        return mySize_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1143
     */
    @ASTNodeAnnotation.Attribute
    public boolean myAccessExists() {
        ASTNode$State state = state();
        boolean myAccessExists_value = getParent().Define_myAccessExists(this, null);

        return myAccessExists_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:830
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInstComponentSize() {
        ASTNode$State state = state();
        boolean isInstComponentSize_value = getParent().Define_isInstComponentSize(this, null);

        return isInstComponentSize_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:40
     * @apilevel internal
     */
    public boolean Define_inArraySubscripts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:641
     * @apilevel internal
     */
    public int Define_myDim(ASTNode caller, ASTNode child) {
        if (caller == getFSubscriptListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i;
        }
        else {
            return getParent().Define_myDim(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:51
     * @apilevel internal
     */
    public Size Define_mySize(ASTNode caller, ASTNode child) {
        if (caller == getFSubscriptListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return mySize().contract(i);
        }
        else {
            return getParent().Define_mySize(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        if (caller == getFSubscriptListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_canInlineConstant(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:334
     * @apilevel internal
     */
    public boolean Define_inFunctionArg(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
