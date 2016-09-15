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
 * Array constructor expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1203
 * @production FArray : {@link FAbstractArrayExp} ::= <span class="component">{@link FExp}*</span>;

 */
public class FArray extends FAbstractArrayExp implements Cloneable {
    /**
     * Add a copy of the expression at position i to arr. 
     * 
     * @param arr    the Array to add the expression to.
     * @param i      the index to add at, denotes position in both Array and FArray.
     * @param level  the level this FArray is at in a structure of nestled FArrays.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1805
     */
    public void fillArray(Array arr, Index i, int level) {
	    if (isIterArray())
	        super.fillArray(arr, i, level);
	    else
	        getFExp(i.get(level) - 1).fillArray(arr, i, level + 1);
	}
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:5062
     */
    public void mapComponents(Map<FIdUseExp, Set<FIdUseExp>> res, CValue val) {
        Enumerator e = new Enumerator();
        mapComponentsArray(res, val.array(), e);
    }
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:5071
     */
    public void mapComponentsArray(Map<FIdUseExp, Set<FIdUseExp>> res, CValueArray val, Enumerator e) {
        for (FExp exp : getFExps()) {
            exp.mapComponentsArray(res, val, e);
        }
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1098
     */
    public FArray createEmptyNode()          { return new FArray();          }
    /**
     * Create new node of same class as this, with the specified 
     * children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1347
     */
    public FArray createNode(List<FExp> exps) {
		FArray node = createEmptyNode();
		node.setFExpList(exps);
		return node;
	}
    /**
     * Create new node of same class as this, with the specified 
     * children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1357
     */
    public FArray createNode(ArrayList<FExp> exps) {
		FArray node = createEmptyNode();
		for (FExp e : exps)
			node.addFExp(e);
		return node;
	}
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1194
     */
    public void flatChildFExps(ArrayList<FExp> res) {
        for (FExp exp : getFExps()) {
            exp.flatChildFExps(res);
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1964
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print("{");
		getFExps().prettyPrintWithSep(p, str, indent, ", ");
		str.print("}");
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:316
     */
    public void makeContinuousVariablesDiscrete() {
        for (FExp e : getFExps())
            e.makeContinuousVariablesDiscrete();
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2330
     */
    public FExp flatten(FQName prefix) {
        if (isIterArray() && !size().isUnknown()) {
            return ((FIterExp)getFExp(0)).flattenArray(prefix);
        }
        List l = new List();
        for (FExp exp : getFExps()) {
            l.add(exp.flatten(prefix));
        }
        return createNode(l);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2512
     */
    public FExp createFPreExp() {
        return this; // Assume literal;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:840
     */
    public FExp extractRecordFExp(String suffix) {
		FArray res = createEmptyNode();
		for (FExp e : getFExps())
			res.addFExp(e.extractRecordFExp(suffix));
		return res;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2265
     */
    @Override
    public void insertTempsInLHS(FClass fClass, boolean param) {
        for (FExp fExp : getFExps()) {
            fExp.insertTempsInLHS(fClass, param);
        }
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:103
     */
    public void findBlockFunctionExtraction(AbstractEquationBlock block, ArrayList<FFunctionCall> functions) {
        for (FExp exp: getFExps()) {
            exp.findBlockFunctionExtraction(block, functions);
        }

    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:140
     */
    public boolean dependsOnBlock(AbstractEquationBlock block) {
        for (FExp exp: getFExps()) {
            if (exp.dependsOnBlock(block)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:199
     */
    public FExp merge(FClass.commonSubexpressionEliminationIfSet.CSESet m, FExp exp) {
        FArray other = (FArray) exp;
        for (int i = 0; i < getNumFExp(); i++) {
            setFExp(getFExp(i).merge(m, other.getFExp(i)), i);
        }
        return this;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:554
     */
    public FExp createInlineVars(
            AbstractFunctionInliner fi, FExp bExp, FTypePrefixVariability variability) {
        FArray bArr = (FArray) bExp;
        FArray res = new FArray();
        int n = getNumFExp();
        for (int i = 0; i < n; i++) {
            FExp cellBExp = (bArr != null) ? bArr.getFExp(i) : null;
            res.addFExp(getFExp(i).createInlineVars(fi, cellBExp, variability));
        }
        return res;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:809
     */
    public void createInliningOutputEquations(
            ArrayList<FAbstractEquation> list, AbstractFunctionInliner fi, FQName name) {
        int i = 1;
        for (FExp exp : getFExps()) {
            FQName cellName = name.copyAndAddSubscript(new FIntegerSubscript(i));
            exp.createInliningOutputEquations(list, fi, cellName);
            i++;
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:65
     */
    @Override
    public FExp cleanEquations() {
        if (taggedByVProp) {
            return super.cleanEquations();
        }
        FArray res = new FArray();
        for (FExp exp : getFExps()) {
            res.addFExpNoTransform(exp.cleanEquations());
        }
        return res;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:439
     */
    @Override
    public boolean variabilityPropagation(
            FClass.VariabilityPropagator propagator,
            CValue value,
            FTypePrefixVariability variability) {
        
        if (taggedByVProp) {
            return taggedByVProp;
        }
        
		CValueArray a = null;
		if (value != CValue.UNKNOWN) {
			a = (CValueArray) value;
		}
        taggedByVProp = this.variabilityPropagationArray(propagator, a, variability, new Enumerator());
        return taggedByVProp;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:466
     */
    @Override
    public boolean variabilityPropagationArray(
            FClass.VariabilityPropagator propagator,
            CValueArray value,
            FTypePrefixVariability variability,
            Enumerator enumerator) {
        boolean res = true;
        for (FExp exp : getFExps()) {
            res &= exp.variabilityPropagationArray(propagator, value, variability, enumerator);
        }
        return res;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1092
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, FQName suffix) {
        FArray res = createEmptyNode();
        if (isIterArray())
            return super.scalarRecordFExp(indexMap, suffix);
        for (FExp e : getFExps())
            res.addFExp(e.scalarRecordFExp(indexMap, suffix));
        return res;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1519
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
		if (isIterArray())
			return getFExp(0).scalarize(indexMap);
		FArray res = new FArray();
		for (FExp e : getFExps())
			res.addFExpNoTransform(e.scalarize(indexMap));
		return res;
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:376
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        ForNames names = s.getNames();
        boolean iter = isIterArray();
        names.addLayer(ndims()- (iter ? 0 : 1));
        names.fillLayer(this);
        
        for (int i = 0; i < getNumFExp(); i++) {
            List<FStatement> inner = new List<FStatement>();
            List<FStatement> outer = s.getClauses();
            FExp right = getFExp(i);
            FIdUseExp left;
            if (iter) {
                left = names.createUseWithSubscripts(tempVarName());
                getFExp(0).editNamesIter(s);
                right.createArrayTemporaries(s.block(inner));
                right.addArrayUsesToIndexMap(s);
                names.removeLayer();
                outer = names.createForLoops(outer, right);
                outer.addAll(inner);
                right = ((FIterExp) right).getFExp();
            } else {
                right.createArrayTemporaries(s);
                right.addArrayUsesToIndexMap(s);
                outer = names.createForLoops(outer, right);
                List<FSubscript> subs = new List<FSubscript>();
                subs.add(new FIntegerSubscript(i+1));
                subs.addAll(names.createFArraySubscripts().getFSubscriptListNoTransform());
                left = tempExp(new FArraySubscripts(subs));
            }
            
            type().scalarizeAssignment_sub((Scalarizer.Algorithm)s.block(outer), left, right);
        }
        
        names.removeLayer();
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:601
     */
    public FExp diff(String name) {
        FArray diff_farray = new FArray();
        for (FExp e : getFExps()) {
            diff_farray.addFExp(e.diff(name));
        }
        return dynamicFExp(diff_farray);
    }
    /**
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1543
     */
    @Override
	public void genTempOutputs_CAD(CodePrinter p, CodeStream str, String indent) {
		type().printInit_C(p, str, indent, tempName_var_CAD(), this);
		type().printInit_C(p, str, indent, tempName_der_CAD(), this);
	}
    /**
     * Declares a regular and a derivate variable for this expression. jmi_ad_var_t
     * is a type that describes floating point numbers. Calls the overridden
     * method in order to continue iteration over that  ASTNode:s
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1653
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        getArray().genVarDecls_CAD(p, str, indent);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FArray() {
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
        children = new ASTNode[2];
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FArray(List<FExp> p0) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:48
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public FArray clone() throws CloneNotSupportedException {
        FArray node = (FArray) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public FArray copy() {
        try {
            FArray node = (FArray) clone();
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
     * @declaredat ASTNode:80
     */
    public FArray fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public FArray treeCopyNoTransform() {
        FArray tree = (FArray) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
                    tree.children[i] = null;
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
     * @declaredat ASTNode:114
     */
    public FArray treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:121
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FExp list.
     * @param list The new list node to be used as the FExp list.
     * @apilevel high-level
     */
    public void setFExpList(List<FExp> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FExp list.
     * @return Number of children in the FExp list.
     * @apilevel high-level
     */
    public int getNumFExp() {
        return getFExpList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FExp list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FExp list.
     * @apilevel low-level
     */
    public int getNumFExpNoTransform() {
        return getFExpListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FExp list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FExp list.
     * @apilevel high-level
     */
    public FExp getFExp(int i) {
        return (FExp) getFExpList().getChild(i);
    }
    /**
     * Check whether the FExp list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFExp() {
        return getFExpList().getNumChild() != 0;
    }
    /**
     * Append an element to the FExp list.
     * @param node The element to append to the FExp list.
     * @apilevel high-level
     */
    public void addFExp(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getFExpListNoTransform() : getFExpList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFExpNoTransform(FExp node) {
        List<FExp> list = getFExpListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FExp list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFExp(FExp node, int i) {
        List<FExp> list = getFExpList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FExp list.
     * @return The node representing the FExp list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FExp")
    public List<FExp> getFExpList() {
        List<FExp> list = (List<FExp>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FExp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FExp list.
     * @apilevel low-level
     */
    public List<FExp> getFExpListNoTransform() {
        return (List<FExp>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FExp list.
     * @return The node representing the FExp list.
     * @apilevel high-level
     */
    public List<FExp> getFExps() {
        return getFExpList();
    }
    /**
     * Retrieves the FExp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FExp list.
     * @apilevel low-level
     */
    public List<FExp> getFExpsNoTransform() {
        return getFExpListNoTransform();
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 1;
    }
    /**
     * @apilevel internal
     */
    protected boolean ndims_computed = false;
    /**
     * @apilevel internal
     */
    protected int ndims_value;
    /**
     * @apilevel internal
     */
    private void ndims_reset() {
        ndims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        if(ndims_computed) {
            return ndims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ndims_value = ndims_compute();
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return ndims_value;
    }
    /**
     * @apilevel internal
     */
    private int ndims_compute() {
    		if (isIterArray())
    			return getFExp(0).ndims();
    		if (getNumFExp()==0)  //Empty array
    			return 1;
    		// We assume that the FArray is set up correctly and that
    		// all branches are equal.
    		return getFExp(0).ndims() + 1;
    	}
    /**
     * @apilevel internal
     */
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = size_compute();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    private Size size_compute() {
    	    if (getFExp(0) == null)
    	        return new Size(0);
    		if (isIterArray())
    			return getFExp(0).size();
    		return getFExp(0).size().expand(getNumFExp());
    	}
    /**
     * @apilevel internal
     */
    protected boolean getArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array getArray_value;
    /**
     * @apilevel internal
     */
    private void getArray_reset() {
        getArray_computed = false;
        getArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array getArray() {
        if(getArray_computed) {
            return (Array) getChild(getArrayChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getArray_value = getArray_compute();
        setChild(getArray_value, getArrayChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Array node = (Array) this.getChild(getArrayChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private Array getArray_compute() {
    		if (isIterArray())
    			return getFExp(0).copyArray();
    		Array arr = new Array(indices());
    		for (Index i : arr.indices())
    			fillArray(arr, i, 0);
    		return arr;
    	}
    /**
     * Given that <code>val</code> is the value of this use expression, 
     * extract the part of it referring to <code>fv</code>, 
     * or <code>null</code> if none match. 
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3094
     */
    @ASTNodeAnnotation.Attribute
    public CValue extractCValue(CValue val, FVariable fv) {
        ASTNode$State state = state();
        try {
        	  CValueArray arr = val.array();
        	  for (Index i : indices()) {
        		  CValue res = getArray().get(i).extractCValue(arr.getCell(i), fv);
        		  if (res != null)
        			  return res;
        	  }
        	  return null;
          }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1327
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> guards() {
        ASTNode$State state = state();
        try {
                ArrayList<FExp> l = new ArrayList<FExp>();
                for (FExp e : childFExps())
                    l.add(e);
                return l;
            }
        finally {
        }
    }
    /**
     * Get the number of scalar variables assigned by this a FFunctionCallLeft with this 
     * FExp as its expression.
     * 
     * Only valid after scalarization.
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1704
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarVars() {
        ASTNode$State state = state();
        try {
                 int n = getNumFExp();
                 return (n == 0) ? 0 : n * getFExp(0).numScalarVars();
             }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIterArray() {
        ASTNode$State state = state();
        boolean isIterArray_value = getNumFExp() == 1 && getFExp(0).isIterExp();

        return isIterArray_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean type_computed = false;
    /**
     * @apilevel internal
     */
    protected FType type_value;
    /**
     * @apilevel internal
     */
    private void type_reset() {
        type_computed = false;
        type_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        if(type_computed) {
            return type_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        type_value = type_compute();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @apilevel internal
     */
    private FType type_compute() {
            if (isIterArray())
                return getFExp(0).type();
            
            // Check that the types of the elements are consistent
            int n = getNumFExp();
            FType t = n > 0 ? getFExp(0).type() : fUnknownType();
            boolean func = inFunction();
            for (int i = 1; i < n && !t.isUnknown(); i++) {
                t = mergeArrayCellTypes(t, getFExp(i).type(), func);
            }
            return t.arrayType(size());
        }
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:486
     */
    @ASTNodeAnnotation.Attribute
    public FType mergeArrayCellTypes(FType t1, FType t2, boolean func) {
        ASTNode$State state = state();
        try {
                if (t1.isNoType()) {
                    return t2;
                } else if (t2.isNoType()) {
                    return t1;
                } else {
                    return t1.typePromotion(t2, func, null);
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp splitArrayExp(int index) {
        ASTNode$State state = state();
        FExp splitArrayExp_int_value = isIterArray() ? getFExp(0).splitArrayExp(index) : getFExp(index - 1);

        return splitArrayExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotationExp() {
        ASTNode$State state = state();
        boolean isAnnotationExp_value = getNumFExp() > 0;

        return isAnnotationExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<? extends ASTNode> annotationList() {
        ASTNode$State state = state();
        Iterable<? extends ASTNode> annotationList_value = getFExps();

        return annotationList_value;
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2549
     */
    @ASTNodeAnnotation.Attribute
    public boolean isZeroLiteral() {
        ASTNode$State state = state();
        try {
        		for (FExp e : getFExps())
        			if (!e.isZeroLiteral())
        				return false;
        		return true;
        	}
        finally {
        }
    }
    /**
     * Checks if left hand side variable(s) is eligible for var. prop.
     * @attribute syn
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:130
     */
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        try {
        		for (FExp exp : getFExps()) {
        			if (!exp.canPropagate()) {
        				return false;
        			}
        		}
        		return true;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizeExpanded() {
        ASTNode$State state = state();
        boolean scalarizeExpanded_value = useTempVar && super.scalarizeExpanded();

        return scalarizeExpanded_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = size().isUnknown() || inUnknownSize();

        return extractTemp_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Array";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     */
    @ASTNodeAnnotation.Attribute
    public boolean useIsAssignment() {
        ASTNode$State state = state();
        boolean useIsAssignment_value = getParent().Define_useIsAssignment(this, null);

        return useIsAssignment_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2015
     */
    @ASTNodeAnnotation.Attribute
    public boolean canInlineConstant() {
        ASTNode$State state = state();
        boolean canInlineConstant_value = getParent().Define_canInlineConstant(this, null);

        return canInlineConstant_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2866
     * @apilevel internal
     */
    public boolean Define_isLeftHandSide(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isLeftHandSide();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        if (caller == getFExpListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return useIsAssignment();
        }
        else {
            return super.Define_useIsAssignment(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:303
     * @apilevel internal
     */
    public boolean Define_iterExpUseOK(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return canInlineConstant();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
