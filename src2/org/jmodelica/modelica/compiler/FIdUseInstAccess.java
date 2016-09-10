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
 * Identifier in the instance tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1184
 * @production FIdUseInstAccess : {@link FIdUse} ::= <span class="component">{@link InstAccess}</span>;

 */
public class FIdUseInstAccess extends FIdUse implements Cloneable {
    /**
     * Returns a scalar FIdUseInstAccess, as specified by an index.
     * 
     * @param i          the Index specifying what array subscripts to use
     * @param scalarize  ignored (needed by superclass implementation) 
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1943
     */
    public FIdUseInstAccess specify(Index i, boolean scalarize) {
		InstAccess ia = getInstAccess().specify(i);
		return new FIdUseInstAccess(ia);
	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3910
     */
    public Map<CommonVariableDecl,CValue> collectMyEvaluationValue(Map<CommonVariableDecl,CValue> map) {
        return map;
    }
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @param right     the CValue to assign
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4041
     */
    @Override
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue val) {
        getInstAccess().assignToInFuncEval(evaluator, val);
    }
    /**
     * Constructs an FIdUseInstAccess with an empty FQName.
     * 
     * Note: the FQName of an FIdUseInstAccess should always be empty.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:381
     */
    public FIdUseInstAccess(InstAccess ia) {
		this(new FQNameEmpty(), ia);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1694
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		p.print(getInstAccess(), str, indent);
	}
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:157
     */
    public FExp buildAccessContextSizeExp(FExp.SizeContextReplacer crp) {
        return new FIdUseExp(new FIdUseInstAccess(getInstAccess().buildAccessContextSizeExp(crp)));
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:364
     */
    public FExp createSizeFExp(FExp.FunctionSizeContextReplacer crp) {
        return getInstAccess().createSizeFExp(crp);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:474
     */
    public void typeError(ErrorCheckType checkType, FIdUseExp use) {
        getInstAccess().typeError();
    }
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2773
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
        if (getInstAccess().isExpandableConnectorPart())
            csm.getExpandable().addUse(getInstAccess());
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:222
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        super.flattenUsedFuncsAndEnums(fc);
        InstAccess ia = getInstAccess();
        if (ia.myInstComponentDecl().isRecord() && ia.myInstComponentDecl().isConstant() && !ia.hasUnknownIndices()) 
            ((InstAssignable) ia.myInstComponentDecl()).flattenMyType(fc);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1903
     */
    public FExp flatten(FQName prefix, FIdUseExp use) {
        InstComponentDecl var = getInstAccess().myInstComponentDecl();
        if (use.inDefaultArgument()) {
            int i;
            if (var.inRecordConstructor()) {
                i = var.argIndexInRecordConstructor();
            } else {
                InstClassDecl parent = (InstClassDecl) var.containingEntity();
                i = parent.myCallInputs().indexOf(var);
            }
            int d = use.findDepthOfNestledFunctionCalls();
            return new FArgumentExp(i, d);
        } else if (!inFunction() && !getInstAccess().indexVariability().indexParameterOrLess()) {
            FIdUseExp copy = (FIdUseExp) use.dynamicFExp(use.fullCopy());
            List<FSubscript> sub = new List<FSubscript>();
            ((FIdUseInstAccess)copy.getFIdUse()).getInstAccess().extractNonParameterIndices(sub, getInstAccess().myInstComponentDecl().variability());
            FExp res = use.dynamicFExp(new FSubscriptedExp(copy, new FArraySubscripts(sub)));
            return res.flatten(prefix);
        } else {
            return var.flattenAccess(prefix, use);
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2326
     */
    public FIdUse flatten(FQName prefix) {
       return new FIdUse(getInstAccess().flatten(prefix));
    }
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:653
     */
    public void populateInstRecordModificationList(
			List<InstRecordModification> list, InstValueModification org, FExp exp) {
		getInstAccess().populateInstRecordModificationList(list, org, exp);
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:821
     */
    public FIdUse extractRecordFExp(String suffix) {
        return new FIdUseInstAccess(getInstAccess().copyAndAppend(suffix));
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1577
     */
    public FIdUse copyWithNonLiteralSubscriptsAsColon() {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1626
     */
    public FArraySubscripts copyNonLiteralSubscripts() {
        throw new UnsupportedOperationException();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIdUseInstAccess() {
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
        children = new ASTNode[3];
    }
    /**
     * @declaredat ASTNode:13
     */
    public FIdUseInstAccess(FQName p0, InstAccess p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:20
     */
    protected int numChildren() {
        return 2;
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
        size_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:46
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:52
     */
    public FIdUseInstAccess clone() throws CloneNotSupportedException {
        FIdUseInstAccess node = (FIdUseInstAccess) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FIdUseInstAccess copy() {
        try {
            FIdUseInstAccess node = (FIdUseInstAccess) clone();
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
     * @declaredat ASTNode:78
     */
    public FIdUseInstAccess fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FIdUseInstAccess treeCopyNoTransform() {
        FIdUseInstAccess tree = (FIdUseInstAccess) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
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
     * @declaredat ASTNode:112
     */
    public FIdUseInstAccess treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:119
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(0);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(0);
    }
    /**
     * Replaces the InstAccess child.
     * @param node The new node to replace the InstAccess child.
     * @apilevel high-level
     */
    public void setInstAccess(InstAccess node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the InstAccess child.
     * @return The current node used as the InstAccess child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstAccess")
    public InstAccess getInstAccess() {
        return (InstAccess) getChild(1);
    }
    /**
     * Retrieves the InstAccess child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstAccess child.
     * @apilevel low-level
     */
    public InstAccess getInstAccessNoTransform() {
        return (InstAccess) getChildNoTransform(1);
    }
    /**
     * Retrieves the ExpandedSubscripts child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ExpandedSubscripts child.
     * @apilevel low-level
     */
    public FArraySubscripts getExpandedSubscriptsNoTransform() {
        return (FArraySubscripts) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child ExpandedSubscripts.
     * @return The the child position of the optional child ExpandedSubscripts.
     * @apilevel low-level
     */
    protected int getExpandedSubscriptsChildPosition() {
        return 2;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = getInstAccess().ndims();

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
        size_value = getInstAccess().size();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonForIndex myForIndex() {
        ASTNode$State state = state();
        CommonForIndex myForIndex_value = getInstAccess().myInstComponentDecl().myForIndex();

        return myForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = getInstAccess().indices();

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = getInstAccess().ceval(evaluator);

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular(int dim) {
        ASTNode$State state = state();
        boolean isCircular_int_value = getInstAccess().myInstComponentDecl().isCircular(dim);

        return isCircular_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVarUse() {
        ASTNode$State state = state();
        boolean isUnknownSizeVarUse_value = getInstAccess().isUnknownSizeVarUse();

        return isUnknownSizeVarUse_value;
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3244
     */
    @ASTNodeAnnotation.Attribute
    public boolean isIndependent(Set<? extends CommonVariableDecl> set) {
        ASTNode$State state = state();
        try {
                return getInstAccess().isIndependent(set);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCommonVarDecl() {
        ASTNode$State state = state();
        CommonVariableDecl myCommonVarDecl_value = getInstAccess().myInstComponentDecl();

        return myCommonVarDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = getInstAccess().isForIndex();

        return isForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExternalStmt myFExternalStmt() {
        ASTNode$State state = state();
        FExternalStmt myFExternalStmt_value = getInstAccess().myInstClassDecl().findFunctionExternal().getFAlgorithm().getFExternalStmt();

        return myFExternalStmt_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = getInstAccess().hasFArraySubscripts();

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = getInstAccess().getFArraySubscripts();

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getInstAccessNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = false;

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInstAccess() {
        ASTNode$State state = state();
        boolean isInstAccess_value = true;

        return isInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess asInstAccess() {
        ASTNode$State state = state();
        InstAccess asInstAccess_value = getInstAccess();

        return asInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccessToStream() {
        ASTNode$State state = state();
        boolean isAccessToStream_value = getInstAccess().isAccessToStream();

        return isAccessToStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentSizeClass() {
        ASTNode$State state = state();
        boolean isComponentSizeClass_value = getInstAccess().isComponentSizeClass();

        return isComponentSizeClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentReference(Criteria<InstComponentDecl> criteria) {
        ASTNode$State state = state();
        boolean isComponentReference_Criteria_InstComponentDecl__value = criteria.test(getInstAccess().myInstComponentDecl());

        return isComponentReference_Criteria_InstComponentDecl__value;
    }
    @ASTNodeAnnotation.Attribute
    public int cardinalityValue() {
        ASTNode$State state = state();
        int cardinalityValue_value = 1;

        return cardinalityValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUse splitArrayAccess(int index) {
        ASTNode$State state = state();
        FIdUse splitArrayAccess_int_value = new FIdUseInstAccess(getInstAccess().splitArrayAccess(index));

        return splitArrayAccess_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myInstComponentDecl_value = getInstAccess().myInstComponentDecl();

        return myInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordType recordType() {
        ASTNode$State state = state();
        FRecordType recordType_value = getInstAccess().recordType();

        return recordType_value;
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
        type_value = getInstAccess().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> accessedVarSet() {
        ASTNode$State state = state();
        Set<InstComponentDecl> accessedVarSet_value = getInstAccess().accessedVarSet();

        return accessedVarSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = getInstAccess().myInstComponentDecl().variability().combine(indexVariability());

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability indexVariability_value = getInstAccess().indexVariability();

        return indexVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = getInstAccess().isUnknown();

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = getInstAccess().isSlice();

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDisabled() {
        ASTNode$State state = state();
        boolean isDisabled_value = getInstAccess().isDisabled();

        return isDisabled_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp createDerExp(int order) {
        ASTNode$State state = state();
        FExp createDerExp_int_value = getInstAccess().createDerExp(order);

        return createDerExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        ASTNode$State state = state();
        String name_C_value = toString_C(printer_C);

        return name_C_value;
    }
    /**
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:363
     */
    @ASTNodeAnnotation.Attribute
    public String toString_C(CodePrinter p) {
        ASTNode$State state = state();
        try {
                return getInstAccess().toString_C(p);
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:120
     */
    @ASTNodeAnnotation.Attribute
    public boolean inConnectWithExistingComponent() {
        ASTNode$State state = state();
        boolean inConnectWithExistingComponent_value = getParent().Define_inConnectWithExistingComponent(this, null);

        return inConnectWithExistingComponent_value;
    }
    /**
     * Find the depth of nestled function calls in this expression.
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2104
     */
    @ASTNodeAnnotation.Attribute
    public int findDepthOfNestledFunctionCalls() {
        ASTNode$State state = state();
        int findDepthOfNestledFunctionCalls_value = getParent().Define_findDepthOfNestledFunctionCalls(this, null);

        return findDepthOfNestledFunctionCalls_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2225
     */
    @ASTNodeAnnotation.Attribute
    public boolean flattenFASContext() {
        ASTNode$State state = state();
        boolean flattenFASContext_value = getParent().Define_flattenFASContext(this, null);

        return flattenFASContext_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:119
     * @apilevel internal
     */
    public boolean Define_inConnectWithExistingComponent(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessNoTransform()) {
            return inConnectWithExistingComponent();
        }
        else {
            return super.Define_inConnectWithExistingComponent(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return flattenFASContext();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
