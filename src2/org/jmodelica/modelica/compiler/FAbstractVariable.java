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
 * Abstract base class for flat variables.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:84
 * @production FAbstractVariable : {@link BaseNode};

 */
public abstract class FAbstractVariable extends BaseNode implements Cloneable, CommonVariableDecl, FlatVariableMap.HierarchicalMapNode {
    /**
     * Read current function evaluation value from map.
     * 
     * If this variable isn't in the map, set to value of binding expression.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3617
     */
    public void readEvaluationValue(Map<CommonVariableDecl, CValue> map) {
        CValue val = map.get(this);
        if (val == null) {
            val = cevalFunctionBindingExp(ASTNode.defaultVariableEvaluator());
        }
        if (!isInput()) {
            val = val.cached();
        }
        map.put(this, val);
        setLocalCachedEvaluationValue(val);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3647
     */
    protected CValue cevalFunctionBindingExp(VariableEvaluator evaluator) {
        return CValue.UNKNOWN;
    }
    /**
     * Set the current function evaluation value.
     * 
     * Also updates value map.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3749
     */
    public void setEvaluationValue(VariableEvaluator evaluator, CValue val) {
        evaluator.setEvaluationValue(this, val.cached());
    }
    /**
     * Check if this variable has a current function evaluation value.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3765
     */
    public boolean hasEvaluationValue(VariableEvaluator evaluator) {
	  return evaluator.hasEvaluationValue(this);
  }
    /**
     * Get the current evaluation value.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3779
     */
    public CValue evaluationValue(VariableEvaluator evaluator) {
	  return evaluator.evaluationValue(this);
  }
    /**
     * Remove the current evaluation value
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3793
     */
    public void clearEvaluationValue(VariableEvaluator evaluator) {
        evaluator.clearEvaluationValue(this);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3804
     */
    protected CValue evaluationValue = null;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3807
     */
    public CValue getLocalCachedEvaluationValue() {
        return evaluationValue;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3815
     */
    public void setLocalCachedEvaluationValue(CValue value) {
        evaluationValue = value;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3823
     */
    public void clearLocalCachedEvaluationValue() {
        evaluationValue = null;
    }
    /**
     * Kept for legacy reasons.
     * @deprecated Use {@link #setLocalCachedEvaluationValue} instead.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3835
     */
    public void setEvaluationValue(CValue value) {
        setLocalCachedEvaluationValue(value);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3898
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        return super.collectEvaluationValues(collectMyEvaluationValue(map));
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3923
     */
    public Map<CommonVariableDecl,CValue> collectMyEvaluationValue(Map<CommonVariableDecl,CValue> map) {
        if (evaluationValue != null) {
            if (map == null)
                map = new HashMap<CommonVariableDecl,CValue>();
            map.put(this, evaluationValue);
        }
        return map;
    }
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:386
     */
    public FAbstractVariable lookupHierarchical(FQName name, int part, boolean outermost) {
		return (outermost || name.numParts() <= part) ? this : null;
	}
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:414
     */
    public void addHierarchical(FAbstractVariable fv, FQName name, int part) {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:418
     */
    public void addToVariableMap(FlatVariableMap map) {
		map.addVariableFlat(this);
	}
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:498
     */
    public void addToParameterEquationsMap(
            Map<FAbstractVariable,FAbstractEquation> map, FAbstractEquation equ) {
        if (!isUnknown()) {
            map.put(this, equ);
        }
    }
    /**
     * Create an access to this variable.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1052
     */
    public FIdUse createFIdUse() {
         return null;
    }
    /**
     * This method takes a variable and adds it to the tree. This is done by
     * settings its parent to the same parent as this node.
     * @aspect JastAddHacks
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2127
     */
    
        /**
         * This method takes a variable and adds it to the tree. This is done by
         * settings its parent to the same parent as this node.
         */
        public <V extends FAbstractVariable> V dynamicVariable(V var) {
            var.parent = this.parent;
            return var;
        }
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:79
     */
    public Size lookupHierarchicalSize(FQNameFull name, int part, int last) {
        return type().lookupHierarchical(name, part+1, last).size();
    }
    /**
     * If this is a normal continous variable, convert it to a discrete variable.
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:333
     */
    public void makeContinuousVariableDiscrete() {}
    /**
     * @aspect Sorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1730
     */
    public static final Comparator<FAbstractVariable> NAME_COMPARATOR = 
		new Comparator<FAbstractVariable>() {
			public int compare(FAbstractVariable fv1, FAbstractVariable fv2) {
				String n1 = (fv1 == null) ? null : fv1.name();
				String n2 = (fv2 == null) ? null : fv2.name();
				if (n1 != null)
					return n1.compareTo(n2);
				else
					return (n2 != null) ? 1 : 0;
			}
			
			public boolean equals(Object obj) { 
				return obj == this; 
			}
		};
    /**
     * Remove binding expression of this variable.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2954
     */
    public void removeBindingExp() {}
    /**
     * Mark this variable as a state, by setting stateSelect=always.
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3721
     */
    public void markAsState() {
        throw new UnsupportedOperationException();
    }
    /**
     * Create a TrivialInlineCheck object for this variable.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1125
     */
    public TrivialInlineCheck createTrivialInlineCheck() {
        if (isArray()) {
            if (isRecord())
                return new TrivialInlineCheck.Unsupported();
            if (size().isUnknown())
                return new TrivialInlineCheck.UnknownArray();
            else
                return new TrivialInlineCheck.KnownArray(size().numElements());
        } else {
            if (isRecord())
                return new TrivialInlineCheck.Record(myFRecordDecl());
            else
                return new TrivialInlineCheck.Scalar();
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:22
     */
    public boolean taggedByVProp = false;
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:510
     */
    public void variabilityPropagation(
            FClass.VariabilityPropagator propagator,
            FTypePrefixVariability variability,
            FExp bindingExp) {
        
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:1307
     */
    
        public enum StateSelect {
            NEVER   (IndexReductionBiPGraph.IndexReductionCost.STATE_SELECT_NEVER_WEIGHT_POSITION), 
            AVOID   (IndexReductionBiPGraph.IndexReductionCost.STATE_SELECT_AVOID_WEIGHT_POSITION), 
            DEFAULT (IndexReductionBiPGraph.IndexReductionCost.STATE_SELECT_DEFAULT_WEIGHT_POSITION), 
            PREFER  (IndexReductionBiPGraph.IndexReductionCost.STATE_SELECT_PREFER_WEIGHT_POSITION), 
            ALWAYS  (IndexReductionBiPGraph.IndexReductionCost.STATE_SELECT_ALWAYS_WEIGHT_POSITION);
            
            private int weightPos;
            
            private StateSelect(int weightPos) {
                this.weightPos = weightPos;
            }
            
            public int weightPos() {
                return weightPos;
            }
        }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:206
     */
    public String genUse_var_CAD(CodePrinter p, FArraySubscripts fas, String type) {
		if (shouldBeDifferentiated())
			return varName_CAD();
		else
			return name_C();
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:213
     */
    public String genUse_der_CAD(CodePrinter p, FArraySubscripts fas, String type) {
		return derName_CAD();
		
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:971
     */
    protected String name_C(String prefix, String suffix) {
		StringBuilder buf = new StringBuilder();
		if (prefix != null) {
			buf.append(prefix);
			buf.append('_');
		}
		buf.append(nameUnderscore());
		buf.append('_');
		buf.append(suffix);
		return buf.toString();
	}
    /**
     * Helper, generates an regular variable use
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:539
     */
    public String genUse_C(CodePrinter p, FArraySubscripts fas, String type) {
        return name_C();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FAbstractVariable() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        indices_reset();
        isCircular_reset();
        nonDefiningUses_reset();
        definingUses_reset();
        usedAsFunctionCallLeft_reset();
        dependentRealParameters_reset();
        dependentIntegerParameters_reset();
        dependentEnumParameters_reset();
        dependentBooleanParameters_reset();
        dependentStringParameters_reset();
        myFRecordDecl_reset();
        myFEnumDecl_reset();
        varName_CAD_reset();
        derName_CAD_reset();
        name_C_reset();
        valueReference_reset();
        parameterEquation_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FAbstractVariable_uses_computed = false;
        FAbstractVariable_uses_value = null;
        FAbstractVariable_uses_contributors = null;
        FAbstractVariable_dependentParameters_computed = false;
        FAbstractVariable_dependentParameters_value = null;
        FAbstractVariable_dependentParameters_contributors = null;
    }
    /**
     * @api internal
     * @declaredat ASTNode:63
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:69
     */
    public FAbstractVariable clone() throws CloneNotSupportedException {
        FAbstractVariable node = (FAbstractVariable) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:80
     */
    public abstract FAbstractVariable fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public abstract FAbstractVariable treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public abstract FAbstractVariable treeCopy();
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:28
     */
    @ASTNodeAnnotation.Attribute
    public abstract FType type();
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = -1;

        return ndims_value;
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
        size_value = Size.SCALAR;
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = ndims()>0;

        return isArray_value;
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
        indices_value = null;
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval() {
        ASTNode$State state = state();
        CValue ceval_value = ceval(defaultVariableEvaluator());

        return ceval_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = CValue.UNKNOWN;

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = CValue.UNKNOWN;

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable asFAbstractVariable() {
        ASTNode$State state = state();
        FAbstractVariable asFAbstractVariable_value = this;

        return asFAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVar() {
        ASTNode$State state = state();
        boolean isUnknownSizeVar_value = false;

        return isUnknownSizeVar_value;
    }
    /**
     * @apilevel internal
     */
    protected int isCircular_visited = -1;
    /**
     * @apilevel internal
     */
    private void isCircular_reset() {
        isCircular_computed = false;
        isCircular_initialized = false;
        isCircular_visited = -1;
    }
    /**
     * @apilevel internal
     */
    protected boolean isCircular_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_initialized = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_value;
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        if(isCircular_computed) {
            return isCircular_value;
        }
        ASTNode$State state = state();
        boolean new_isCircular_value;
        if (!isCircular_initialized) {
            isCircular_initialized = true;
            isCircular_value = true;
        }
        if (!state.IN_CIRCLE) {
            state.IN_CIRCLE = true;
            int num = state.boundariesCrossed;
            boolean isFinal = this.is$Final();
            do {
                isCircular_visited = state.CIRCLE_INDEX;
                state.CHANGE = false;
                new_isCircular_value = false;
                if (new_isCircular_value != isCircular_value) {
                    state.CHANGE = true;
                }
                isCircular_value = new_isCircular_value;
                state.CIRCLE_INDEX++;
            } while (state.CHANGE);
            if (isFinal && num == state().boundariesCrossed) {
                isCircular_computed = true;
                state.LAST_CYCLE = true;
                boolean $tmp = false;
                state.LAST_CYCLE = false;
            } else {
                state.RESET_CYCLE = true;
                boolean $tmp = false;
                state.RESET_CYCLE = false;
                isCircular_computed = false;
                isCircular_initialized = false;
            }
            state.IN_CIRCLE = false;
            state.INTERMEDIATE_VALUE = false;
            return isCircular_value;
        }
        if(isCircular_visited != state.CIRCLE_INDEX) {
            isCircular_visited = state.CIRCLE_INDEX;
            if (state.LAST_CYCLE) {
                isCircular_computed = true;
                new_isCircular_value = false;
                return new_isCircular_value;
            }
            if (state.RESET_CYCLE) {
                isCircular_computed = false;
                isCircular_initialized = false;
                isCircular_visited = -1;
                return isCircular_value;
            }
            new_isCircular_value = false;
            if (new_isCircular_value != isCircular_value) {
                state.CHANGE = true;
            }
            isCircular_value = new_isCircular_value;
            state.INTERMEDIATE_VALUE = true;
            return isCircular_value;
        }
        state.INTERMEDIATE_VALUE = true;
        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public int indexInZ() {
        ASTNode$State state = state();
        int indexInZ_value = -1;

        return indexInZ_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConsecutiveInZ(FAbstractVariable fv) {
        ASTNode$State state = state();
        boolean isConsecutiveInZ_FAbstractVariable_value = false;

        return isConsecutiveInZ_FAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFixed() {
        ASTNode$State state = state();
        boolean isFixed_value = true;

        return isFixed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInitialParameter() {
        ASTNode$State state = state();
        boolean isInitialParameter_value = false;

        return isInitialParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> myParameterDependencies() {
        ASTNode$State state = state();
        Set<FVariable> myParameterDependencies_value = Collections.emptySet();

        return myParameterDependencies_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDependentParameter() {
        ASTNode$State state = state();
        boolean isDependentParameter_value = false;

        return isDependentParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentParameter() {
        ASTNode$State state = state();
        boolean isIndependentParameter_value = false;

        return isIndependentParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFVariable() {
        ASTNode$State state = state();
        boolean isFVariable_value = false;

        return isFVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFRealVariable() {
        ASTNode$State state = state();
        boolean isFRealVariable_value = false;

        return isFRealVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFFunctionVariable() {
        ASTNode$State state = state();
        boolean isFFunctionVariable_value = false;

        return isFFunctionVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDifferentiatedVariable() {
        ASTNode$State state = state();
        boolean isDifferentiatedVariable_value = false;

        return isDifferentiatedVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAbstractDerivativeVariable() {
        ASTNode$State state = state();
        boolean isAbstractDerivativeVariable_value = false;

        return isAbstractDerivativeVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDerivativeVariable() {
        ASTNode$State state = state();
        boolean isDerivativeVariable_value = false;

        return isDerivativeVariable_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1924
     */
    @ASTNodeAnnotation.Attribute
    public FVariable asFVariable() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("asFVariable() is not supported for class type " + getClass().getSimpleName());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1929
     */
    @ASTNodeAnnotation.Attribute
    public FRealVariable asFRealVariable() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("asFRealVariable() is not supported for class type " + getClass().getSimpleName());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1934
     */
    @ASTNodeAnnotation.Attribute
    public FDerivativeVariable asDerivativeVariable() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("isDerivativeVariable() is not supported for class type " + getClass().getSimpleName());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDummyDerivativeVariable() {
        ASTNode$State state = state();
        boolean isDummyDerivativeVariable_value = false;

        return isDummyDerivativeVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDynamicDerivativeVariable() {
        ASTNode$State state = state();
        boolean isDynamicDerivativeVariable_value = false;

        return isDynamicDerivativeVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPreVariable() {
        ASTNode$State state = state();
        boolean isPreVariable_value = false;

        return isPreVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlgebraicVariable() {
        ASTNode$State state = state();
        boolean isAlgebraicVariable_value = false;

        return isAlgebraicVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscreteVariable() {
        ASTNode$State state = state();
        boolean isDiscreteVariable_value = false;

        return isDiscreteVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlgebraicContinousRealVariable() {
        ASTNode$State state = state();
        boolean isAlgebraicContinousRealVariable_value = false;

        return isAlgebraicContinousRealVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = false;

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = false;

        return isOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = type().isReal();

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInteger() {
        ASTNode$State state = state();
        boolean isInteger_value = type().isInteger();

        return isInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBoolean() {
        ASTNode$State state = state();
        boolean isBoolean_value = type().isBoolean();

        return isBoolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isString() {
        ASTNode$State state = state();
        boolean isString_value = type().isString();

        return isString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = type().isRecord();

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnum() {
        ASTNode$State state = state();
        boolean isEnum_value = type().isEnum();

        return isEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        boolean isExternalObject_value = type().isExternalObject();

        return isExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComposite() {
        ASTNode$State state = state();
        boolean isComposite_value = isArray() || isRecord();

        return isComposite_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findHierarchicalAttribute(FQNameFull name) {
        ASTNode$State state = state();
        FAttribute findHierarchicalAttribute_FQNameFull_value = findHierarchicalAttribute(name, name.numParts());

        return findHierarchicalAttribute_FQNameFull_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findHierarchicalAttribute(FQNameFull name, int n) {
        ASTNode$State state = state();
        FAttribute findHierarchicalAttribute_FQNameFull_int_value = null;

        return findHierarchicalAttribute_FQNameFull_int_value;
    }
    /**
     * Return the maximum numeric value that this variable can take.
     * 
     * Only implemented for Real and Integer variables.
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2640
     */
    @ASTNodeAnnotation.Attribute
    public double maxRealValue() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * Return the minimum numeric value that this variable can take.
     * 
     * Only implemented for Real and Integer variables.
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2649
     */
    @ASTNodeAnnotation.Attribute
    public double minRealValue() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Nominals
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2748
     */
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        try {
                if (variability().fixedParameterOrLess()) {
                    return new FAbsExp(createUseExp());
                } else {
                    return variableNominal();
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Nominals
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2756
     */
    @ASTNodeAnnotation.Attribute
    public FExp variableNominal() {
        ASTNode$State state = state();
        try {
                return FExp.nominalDefault();
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean nonDefiningUses_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FIdUseExp> nonDefiningUses_value;
    /**
     * @apilevel internal
     */
    private void nonDefiningUses_reset() {
        nonDefiningUses_computed = false;
        nonDefiningUses_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> nonDefiningUses() {
        if(nonDefiningUses_computed) {
            return nonDefiningUses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        nonDefiningUses_value = nonDefiningUses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            nonDefiningUses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return nonDefiningUses_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FIdUseExp> nonDefiningUses_compute() {
            Set<FIdUseExp> res = new HashSet<FIdUseExp>();
            for (FIdUseExp use : uses())
                if (hasBindingExp() || !use.isLeftHandSide())
                    res.add(use);
            return res;
        }
    /**
     * @apilevel internal
     */
    protected boolean definingUses_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FIdUseExp> definingUses_value;
    /**
     * @apilevel internal
     */
    private void definingUses_reset() {
        definingUses_computed = false;
        definingUses_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> definingUses() {
        if(definingUses_computed) {
            return definingUses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        definingUses_value = definingUses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            definingUses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return definingUses_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FIdUseExp> definingUses_compute() {
            if (hasBindingExp()) {
                return Collections.emptySet();
            } else {
                Set<FIdUseExp> res = new HashSet<FIdUseExp>();
                for (FIdUseExp use : uses())
                    if (use.isLeftHandSide())
                        res.add(use);
                return res;
            }
        }
    /**
     * @apilevel internal
     */
    protected boolean usedAsFunctionCallLeft_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean usedAsFunctionCallLeft_value;
    /**
     * @apilevel internal
     */
    private void usedAsFunctionCallLeft_reset() {
        usedAsFunctionCallLeft_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean usedAsFunctionCallLeft() {
        if(usedAsFunctionCallLeft_computed) {
            return usedAsFunctionCallLeft_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        usedAsFunctionCallLeft_value = usedAsFunctionCallLeft_compute();
        if (isFinal && num == state().boundariesCrossed) {
            usedAsFunctionCallLeft_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return usedAsFunctionCallLeft_value;
    }
    /**
     * @apilevel internal
     */
    private boolean usedAsFunctionCallLeft_compute() {
            for (FExp e : definingUses()) 
                if (e.inFunctionCallLeft())
                    return true;
            return false;
        }
    /**
     * @apilevel internal
     */
    protected boolean dependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> dependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentRealParameters_reset() {
        dependentRealParameters_computed = false;
        dependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> dependentRealParameters() {
        if(dependentRealParameters_computed) {
            return dependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentRealParameters_value = FClass.filterCollection(dependentParameters(), FClass.REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> dependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentIntegerParameters_reset() {
        dependentIntegerParameters_computed = false;
        dependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> dependentIntegerParameters() {
        if(dependentIntegerParameters_computed) {
            return dependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentIntegerParameters_value = FClass.filterCollection(dependentParameters(), FClass.INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> dependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentEnumParameters_reset() {
        dependentEnumParameters_computed = false;
        dependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> dependentEnumParameters() {
        if(dependentEnumParameters_computed) {
            return dependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentEnumParameters_value = FClass.filterCollection(dependentParameters(), FClass.ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> dependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentBooleanParameters_reset() {
        dependentBooleanParameters_computed = false;
        dependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> dependentBooleanParameters() {
        if(dependentBooleanParameters_computed) {
            return dependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentBooleanParameters_value = FClass.filterCollection(dependentParameters(), FClass.BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> dependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentStringParameters_reset() {
        dependentStringParameters_computed = false;
        dependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> dependentStringParameters() {
        if(dependentStringParameters_computed) {
            return dependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentStringParameters_value = FClass.filterCollection(dependentParameters(), FClass.STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myPreVariable() {
        ASTNode$State state = state();
        FAbstractVariable myPreVariable_value = lookupPreFV(getFQName());

        return myPreVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myNonPreVariable() {
        ASTNode$State state = state();
        FAbstractVariable myNonPreVariable_value = unknownFVariable();

        return myNonPreVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = false;

        return isForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasBindingExp() {
        ASTNode$State state = state();
        boolean hasBindingExp_value = false;

        return hasBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasParameterEquation() {
        ASTNode$State state = state();
        boolean hasParameterEquation_value = !hasBindingExp() && parameterEquation() != null;

        return hasParameterEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFRecordDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FRecordDecl myFRecordDecl_value;
    /**
     * @apilevel internal
     */
    private void myFRecordDecl_reset() {
        myFRecordDecl_computed = false;
        myFRecordDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordDecl myFRecordDecl() {
        if(myFRecordDecl_computed) {
            return myFRecordDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFRecordDecl_value = null;
        if (isFinal && num == state().boundariesCrossed) {
            myFRecordDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFRecordDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFEnumDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FEnumDecl myFEnumDecl_value;
    /**
     * @apilevel internal
     */
    private void myFEnumDecl_reset() {
        myFEnumDecl_computed = false;
        myFEnumDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FEnumDecl myFEnumDecl() {
        if(myFEnumDecl_computed) {
            return myFEnumDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFEnumDecl_value = null;
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = false;

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public FQName getFQName() {
        ASTNode$State state = state();
        FQName getFQName_value = null;

        return getFQName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = null;

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = null;

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public int variableIndex() {
        ASTNode$State state = state();
        int variableIndex_value = findVariableIndex();

        return variableIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public String displayName() {
        ASTNode$State state = state();
        String displayName_value = name();

        return displayName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = false;

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameter() {
        ASTNode$State state = state();
        boolean isParameter_value = false;

        return isParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscrete() {
        ASTNode$State state = state();
        boolean isDiscrete_value = false;

        return isDiscrete_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isContinuous() {
        ASTNode$State state = state();
        boolean isContinuous_value = false;

        return isContinuous_value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:356
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("Unable to getAll variability of FAbstractVariable type " + getClass().getSimpleName());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = false;

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTemporary() {
        ASTNode$State state = state();
        boolean isTemporary_value = false;

        return isTemporary_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = false;

        return canBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlias() {
        ASTNode$State state = state();
        boolean isAlias_value = false;

        return isAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable alias() {
        ASTNode$State state = state();
        FVariable alias_value = null;

        return alias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegated() {
        ASTNode$State state = state();
        boolean isNegated_value = false;

        return isNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable derivativeEquivalent() {
        ASTNode$State state = state();
        FVariable derivativeEquivalent_value = null;

        return derivativeEquivalent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        boolean canPropagate_value = false;

        return canPropagate_value;
    }
    @ASTNodeAnnotation.Attribute
    public DynamicStateSet dynamicStateSet() {
        ASTNode$State state = state();
        DynamicStateSet dynamicStateSet_value = null;

        return dynamicStateSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dynamicStateVarIndex() {
        ASTNode$State state = state();
        int dynamicStateVarIndex_value = dynamicStateSet().varIndex(this);

        return dynamicStateVarIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDynamicState() {
        ASTNode$State state = state();
        boolean isDynamicState_value = dynamicStateSet() != null;

        return isDynamicState_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFDynamicStateVariable() {
        ASTNode$State state = state();
        boolean isFDynamicStateVariable_value = false;

        return isFDynamicStateVariable_value;
    }
    /**
     * @attribute syn
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:67
     */
    @ASTNodeAnnotation.Attribute
    public FDynamicStateVariable asFDynamicStateVariable() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("Unable to convert " + getClass().getSimpleName() + " to FDynamicStateVariable!");
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFDynamicAlgebraicVariable() {
        ASTNode$State state = state();
        boolean isFDynamicAlgebraicVariable_value = false;

        return isFDynamicAlgebraicVariable_value;
    }
    /**
     * @attribute syn
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:75
     */
    @ASTNodeAnnotation.Attribute
    public FDynamicAlgebraicVariable asFDynamicAlgebraicVariable() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("Unable to convert " + getClass().getSimpleName() + " to FDynamicAlgebraicVariable!");
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSetInReinit() {
        ASTNode$State state = state();
        boolean isSetInReinit_value = false;

        return isSetInReinit_value;
    }
    /**
     * @attribute syn
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:1326
     */
    @ASTNodeAnnotation.Attribute
    public StateSelect stateSelection() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException("Unable to getAll state select from variable type " + getClass().getSimpleName());
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean varName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String varName_CAD_value;
    /**
     * @apilevel internal
     */
    private void varName_CAD_reset() {
        varName_CAD_computed = false;
        varName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        if(varName_CAD_computed) {
            return varName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        varName_CAD_value = name_C();
        if (isFinal && num == state().boundariesCrossed) {
            varName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return varName_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean derName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String derName_CAD_value;
    /**
     * @apilevel internal
     */
    private void derName_CAD_reset() {
        derName_CAD_computed = false;
        derName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        if(derName_CAD_computed) {
            return derName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derName_CAD_value = "0";
        if (isFinal && num == state().boundariesCrossed) {
            derName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcArrayType(boolean assign) {
        ASTNode$State state = state();
        String funcArrayType_boolean_value = isRecord() ? C_ARRAY_RECORD : (assign ? C_ARRAY_REFERENCE : C_ARRAY_VALUE);

        return funcArrayType_boolean_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean name_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_C_value;
    /**
     * @apilevel internal
     */
    private void name_C_reset() {
        name_C_computed = false;
        name_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        if(name_C_computed) {
            return name_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_C_value = null;
        if (isFinal && num == state().boundariesCrossed) {
            name_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String preName_C() {
        ASTNode$State state = state();
        String preName_C_value = null;

        return preName_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String type_C() {
        ASTNode$State state = state();
        String type_C_value = type().type_C();

        return type_C_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1224
     */
    @ASTNodeAnnotation.Attribute
    public CommonForIndex myForIndex() {
        ASTNode$State state = state();
        CommonForIndex myForIndex_value = getParent().Define_myForIndex(this, null);

        return myForIndex_value;
    }
    /**
     * The value reference value is represented by a 32 bit unsigned integer 
     * variable. The lowest 27 bits is used to represent the index of a 
     * variable of the corresponding variable vector. Real, Integer, Boolean and 
     * enumeration variables share a vector, while String variables has their 
     * own vector. 
     * Bit 28 is reserved for representing negated/not negated.
     * Bits 29-31 represents the primitive type, where:
     * 0: Real
     * 1: Integer or enumeration
     * 2: Boolean
     * 3: String
     * Bit 32 is left unused.
     * 
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:172
     */
    @ASTNodeAnnotation.Attribute
    public int valueReference() {
        if(valueReference_computed) {
            return valueReference_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        valueReference_value = getParent().Define_valueReference(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            valueReference_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return valueReference_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean valueReference_computed = false;
    /**
     * @apilevel internal
     */
    protected int valueReference_value;
    /**
     * @apilevel internal
     */
    private void valueReference_reset() {
        valueReference_computed = false;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1565
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2326
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecord() {
        ASTNode$State state = state();
        boolean inRecord_value = getParent().Define_inRecord(this, null);

        return inRecord_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2380
     */
    @ASTNodeAnnotation.Attribute
    public FRecordDecl containingRecordDecl() {
        ASTNode$State state = state();
        FRecordDecl containingRecordDecl_value = getParent().Define_containingRecordDecl(this, null);

        return containingRecordDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:28
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_FQName_value = getParent().Define_lookupFV(this, null, fqn);

        return lookupFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:29
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupDerFV(FQName fqn, int index) {
        ASTNode$State state = state();
        FAbstractVariable lookupDerFV_FQName_int_value = getParent().Define_lookupDerFV(this, null, fqn, index);

        return lookupDerFV_FQName_int_value;
    }
    /**
     * @attribute inh
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:451
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation parameterEquation() {
        if(parameterEquation_computed) {
            return parameterEquation_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        parameterEquation_value = getParent().Define_parameterEquation(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            parameterEquation_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return parameterEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean parameterEquation_computed = false;
    /**
     * @apilevel internal
     */
    protected FAbstractEquation parameterEquation_value;
    /**
     * @apilevel internal
     */
    private void parameterEquation_reset() {
        parameterEquation_computed = false;
        parameterEquation_value = null;
    }
    /**
     * @attribute inh
     * @aspect FlatPreBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:659
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupPreFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupPreFV_FQName_value = getParent().Define_lookupPreFV(this, null, fqn);

        return lookupPreFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:483
     */
    @ASTNodeAnnotation.Attribute
    public int findVariableIndex() {
        ASTNode$State state = state();
        int findVariableIndex_value = getParent().Define_findVariableIndex(this, null);

        return findVariableIndex_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
    /**
     * Collection attribute returning all variable uses in expressions.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2774
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<FIdUseExp> uses() {
        if(FAbstractVariable_uses_computed) {
            return FAbstractVariable_uses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractVariable_uses_value = uses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractVariable_uses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractVariable_uses_value;
    }
    Collection FAbstractVariable_uses_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for uses
     */
    public Collection FAbstractVariable_uses_contributors() {
        if(FAbstractVariable_uses_contributors == null)
            FAbstractVariable_uses_contributors  = new LinkedList();
        return FAbstractVariable_uses_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<FIdUseExp> uses_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FAbstractVariable_uses();
        FAbstractVariable_uses_value = new LinkedHashSet<FIdUseExp>();
        if(FAbstractVariable_uses_contributors != null)
        for (Iterator iter = FAbstractVariable_uses_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractVariable_FAbstractVariable_uses(FAbstractVariable_uses_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractVariable_uses_contributors = null;
        return FAbstractVariable_uses_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractVariable_uses_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<FIdUseExp> FAbstractVariable_uses_value;
    /**
     * @apilevel internal
     */
    private void FAbstractVariable_uses_reset() {
        FAbstractVariable_uses_computed = false;
        FAbstractVariable_uses_value = null;
    }
    /**
     * Collection attribute returning all dependent parameters which
     * depends on the parameter.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2912
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<FVariable> dependentParameters() {
        if(FAbstractVariable_dependentParameters_computed) {
            return FAbstractVariable_dependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractVariable_dependentParameters_value = dependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractVariable_dependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractVariable_dependentParameters_value;
    }
    Collection FAbstractVariable_dependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dependentParameters
     */
    public Collection FAbstractVariable_dependentParameters_contributors() {
        if(FAbstractVariable_dependentParameters_contributors == null)
            FAbstractVariable_dependentParameters_contributors  = new LinkedList();
        return FAbstractVariable_dependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<FVariable> dependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FlatRoot)) {
            node = node.getParent();
        }
        FlatRoot root = (FlatRoot) node;
        root.collect_contributors_FAbstractVariable_dependentParameters();
        FAbstractVariable_dependentParameters_value = new LinkedHashSet<FVariable>();
        if(FAbstractVariable_dependentParameters_contributors != null)
        for (Iterator iter = FAbstractVariable_dependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractVariable_FAbstractVariable_dependentParameters(FAbstractVariable_dependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractVariable_dependentParameters_contributors = null;
        return FAbstractVariable_dependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractVariable_dependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<FVariable> FAbstractVariable_dependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FAbstractVariable_dependentParameters_reset() {
        FAbstractVariable_dependentParameters_computed = false;
        FAbstractVariable_dependentParameters_value = null;
    }
}
