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
 * Base class for array subscripts.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:527
 * @production FSubscript : {@link BaseNode};

 */
public abstract class FSubscript extends BaseNode implements Cloneable {
    /**
     * Add the size of the dimension denoted by this subscript when used 
     * in a declaration to the given Size.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:609
     */
    public abstract void addDeclarationSize(MutableSize s);
    /**
     * Creates a new FSubscript that specifies this array subscript to a single index.
     * 
     * - For scalar subscripts, a copy is returned.
     * - For colon subscripts, the given index is used as the new subscript.
     * - For other vector subscripts, the given index is used as the index of a 
     * cell in the vector, and that cell is used as the new subscript.
     * In this case, dim will be incremented.
     * 
     * @param i    the Index specifying what array subscripts to use
     * @param dim  the dimension in <code>i</code> to use, 
     * wrapped in an array so that it can be changed by the method
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2038
     */
    public FSubscript createSpecified(Index i, int[] dim) {
		return fullCopy();
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:254
     */
    public FSubscript createEvaluated() {
        return (FSubscript) fullCopy();
    }
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:553
     */
    public FSubscript copyReplaceAccess(FExp.ContextReplacer crp) {
        return treeCopy();
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:740
     */
    public void forceVariability(ErrorCheckType checkType,  FTypePrefixVariability v) {}
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2728
     */
    public abstract boolean calculateExpandableConnectorSize(MutableSize s, int i, int len);
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1828
     */
    abstract public FSubscript flatten(FQName prefix);
    /**
     * Specialized flattening method for resolving loop indices during flattening.
     * Intended for use when building connection sets. Do not use for accesses in functions or size 
     * expressions.
     * 
     * @param prefix  prefix to add to name
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2307
     */
    public FSubscript flattenAndResolveIndices(FQName prefix) {
        return flatten(prefix);
    }
    /**
     * @aspect DeferredSubscripts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2540
     */
    public FSubscript deferredCopy() {
        return fullCopy();
    }
    /**
     * Remove all uses in an expression from the uses lists of their respective variables.
     * 
     * Should only be used to allow iterative algorithms to use updated uses lists while 
     * removing expressions. Only valid in flat tree.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2038
     */
    public void removeFromUses() {}
    /**
     * Encapsulate any event-generating expressions in noEvent().
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:624
     */
    public void preventEvents() {}
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:920
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {}
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1609
     */
    public FSubscript copyWithNonLiteralSubscriptsAsColon() {
        return treeCopyNoTransform();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1655
     */
    public void copyNonLiteralSubscriptsTo(FArraySubscripts fas) {
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1528
     */
    public FSubscript scalarize(Map<String,FExp> indexMap) {
		return (FSubscript) fullCopy();
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:503
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
		return;
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:249
     */
    public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		throw new UnsupportedOperationException();
	}
    /**
     * @declaredat ASTNode:1
     */
    public FSubscript() {
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
        indices_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:40
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public FSubscript clone() throws CloneNotSupportedException {
        FSubscript node = (FSubscript) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:57
     */
    public abstract FSubscript fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:64
     */
    public abstract FSubscript treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:72
     */
    public abstract FSubscript treeCopy();
    /**
     * Get array dimensions.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:160
     */
    @ASTNodeAnnotation.Attribute
    public abstract int ndims();
    /**
     * Get the set of all indices this array subscript spans.
     * 
     * @return an int array containing the indices spanned
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2276
     */
    @ASTNodeAnnotation.Attribute
    public abstract int[] myIndices();
    /**
     * Get the array sizes. 
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:26
     */
    @ASTNodeAnnotation.Attribute
    public abstract Size size();
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:623
     */
    @ASTNodeAnnotation.Attribute
    public abstract FType type();
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1529
     */
    @ASTNodeAnnotation.Attribute
    public abstract FSubscript specify(int index);
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
        indices_value = Indices.create(size());
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    /**
     * Create a copy with all array subscripts replaced by literals.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2455
     */
    @ASTNodeAnnotation.Attribute
    public FSubscript resolveSubscripts(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                throw new ConstantEvaluationException();
            }
        finally {
        }
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
        CValue ceval_VariableEvaluator_value = CValue.UNSUPPORTED;

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public int value() {
        ASTNode$State state = state();
        int value_value = ceval(defaultVariableEvaluator()).intValue();

        return value_value;
    }
    @ASTNodeAnnotation.Attribute
    public int[] arrayIndices(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        int[] arrayIndices_VariableEvaluator_value = new int[0];

        return arrayIndices_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndices(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        int numIndices_VariableEvaluator_value = 0;

        return numIndices_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = false;

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isColon() {
        ASTNode$State state = state();
        boolean isColon_value = false;

        return isColon_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpSubscript() {
        ASTNode$State state = state();
        boolean isExpSubscript_value = false;

        return isExpSubscript_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:279
     */
    @ASTNodeAnnotation.Attribute
    public FExpSubscript asExpSubscript() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = false;

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inAlgorithmOrFunction() {
        ASTNode$State state = state();
        boolean inAlgorithmOrFunction_value = inFunction() || inAlgorithm();

        return inAlgorithmOrFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size accessContextSize() {
        ASTNode$State state = state();
        Size accessContextSize_value = mySize().accessContextSize(this);

        return accessContextSize_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getAccessContextSizeExp() {
        ASTNode$State state = state();
        FExp getAccessContextSizeExp_value = null;

        return getAccessContextSizeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript buildAccessContext() {
        ASTNode$State state = state();
        FSubscript buildAccessContext_value = treeCopy();

        return buildAccessContext_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = true;

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = fConstant();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownIndex() {
        ASTNode$State state = state();
        boolean isUnknownIndex_value = false;

        return isUnknownIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = true;

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = false;

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = false;

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    /**
     * The dimension this subscript is used for.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:641
     */
    @ASTNodeAnnotation.Attribute
    public int myDim() {
        ASTNode$State state = state();
        int myDim_value = getParent().Define_myDim(this, null);

        return myDim_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1606
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * Check is this node is in a non-function algorithm.
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1644
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAlgorithm() {
        ASTNode$State state = state();
        boolean inAlgorithm_value = getParent().Define_inAlgorithm(this, null);

        return inAlgorithm_value;
    }
    /**
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:31
     */
    @ASTNodeAnnotation.Attribute
    public boolean inSubscriptedExp() {
        ASTNode$State state = state();
        boolean inSubscriptedExp_value = getParent().Define_inSubscriptedExp(this, null);

        return inSubscriptedExp_value;
    }
    /**
     * Get the size this subscript(s) would have if all subscripts were colons.
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:44
     */
    @ASTNodeAnnotation.Attribute
    public Size mySize() {
        ASTNode$State state = state();
        Size mySize_value = getParent().Define_mySize(this, null);

        return mySize_value;
    }
    /**
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:169
     */
    @ASTNodeAnnotation.Attribute
    public FIdUseExp buildAccessContextSizeExp() {
        ASTNode$State state = state();
        FIdUseExp buildAccessContextSizeExp_value = getParent().Define_buildAccessContextSizeExp(this, null);

        return buildAccessContextSizeExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:810
     */
    @ASTNodeAnnotation.Attribute
    public boolean inUnknownAccess() {
        ASTNode$State state = state();
        boolean inUnknownAccess_value = getParent().Define_inUnknownAccess(this, null);

        return inUnknownAccess_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1838
     */
    @ASTNodeAnnotation.Attribute
    public boolean expandSize() {
        ASTNode$State state = state();
        boolean expandSize_value = getParent().Define_expandSize(this, null);

        return expandSize_value;
    }
    /**
     * Find the parent access for this subscript 
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:922
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess myInstAccess() {
        ASTNode$State state = state();
        InstAccess myInstAccess_value = getParent().Define_myInstAccess(this, null);

        return myInstAccess_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
