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
 * A qualified identifier.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1105
 * @production FIdUse : {@link CommonAccess} ::= <span class="component">{@link FQName}</span> <span class="component">ExpandedSubscripts:{@link FArraySubscripts}</span>;

 */
public class FIdUse extends CommonAccess implements Cloneable {
    /**
     * Returns a scalar FIdUse, as specified by an index.
     * 
     * The use is marked scalarized if this use is.
     * 
     * @param i  the Index specifying what array subscripts to use
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1955
     */
    public FIdUse specify(Index i) {
		return new FIdUse(getFQName().specify(i));
	}
    /**
     * Returns a scalar FIdUse, as specified by an index.
     * 
     * @param i          the Index specifying what array subscripts to use
     * @param scalarize  <code>true</code> if the use should be marked as scalarized 
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1965
     */
    public FIdUse specify(Index i, boolean scalarize) {
		return new FIdUse(getFQName().specify(i, scalarize));
	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3894
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        return super.collectEvaluationValues(collectMyEvaluationValue(map));
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3906
     */
    public Map<CommonVariableDecl,CValue> collectMyEvaluationValue(Map<CommonVariableDecl,CValue> map) {
        return myFV().collectMyEvaluationValue(map);
    }
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @param right     the CValue to assign
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4031
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right) {
        getFQName().assignToInFuncEval(evaluator, right, this);
    }
    /**
     * Constructs an FIdUse that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:238
     */
    public FIdUse(String name) {
		this(new FQNameString(name));
	}
    /**
     * Constructs an FIdUse that refers to a cell of the variable with the given name.
     * 
     * @param fas  the array subscripts to set for the last name part
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:254
     */
    public FIdUse(String name, FArraySubscripts fas) {
		this(new FQNameFull(name, fas));
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1114
     */
    public FIdUseExp createFExp() {
        return new FIdUseExp(this);
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1687
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		if (getFQName().isScalarized())
			str.print(name());
		else 
			p.print(getFQName(), str, indent);
	}
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:153
     */
    public FExp buildAccessContextSizeExp(FExp.SizeContextReplacer crp) {
        return new FIdUseExp(treeCopy());
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:360
     */
    public FExp createSizeFExp(FExp.FunctionSizeContextReplacer crp) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:470
     */
    public void typeError(ErrorCheckType checkType, FIdUseExp use) {
        use.typeError(checkType);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:641
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (inAlgorithm() && useIsAssignment()) {
            if (variability().constantVariability()) {
                error("Assignments to constants is not allowed in algorithms");
            } else if (variability().parameterVariability()) {
                if (isForIndex()) {
                    error("Can not assign a value to a for loop index");
                } else if (!(myFAlgorithm().getType() instanceof FInitialEquation)) {
                    error("Assignments to parameters in algorithms is only allowed in initial algorithms");
                }
            }
        }
	}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1891
     */
    public FIdUse flatten(FQName prefix) {
        return (FIdUse)fullCopy();
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1899
     */
    public FExp flatten(FQName prefix, FIdUseExp use) {
        return new FIdUseExp(flatten(prefix));
    }
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:650
     */
    public void populateInstRecordModificationList(
			List<InstRecordModification> list, InstValueModification org, FExp exp) {}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:817
     */
    public FIdUse extractRecordFExp(String suffix) {
        return new FIdUse(getFQName().copyAsFQNameFull().append(suffix));
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1573
     */
    public FIdUse copyWithNonLiteralSubscriptsAsColon() {
        return new FIdUse(getFQName().copyWithNonLiteralSubscriptsAsColon());
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1622
     */
    public FArraySubscripts copyNonLiteralSubscripts() {
        return getFQName().copyNonLiteralSubscripts();
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1582
     */
    public FIdUse scalarize(Map<String,FExp> indexMap) {
    	return new FIdUse(getFQName().scalarize(indexMap));
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:195
     */
    public Set<String> sortingAddNamesUsed(Set<String> set) {
        if (!myFV().isUnknown())
            set.add(name());
        return super.sortingAddNamesUsed(set);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:202
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		open_XML(str, indent);
		p.print(getFQName(), str, p.indent(indent));
		close_XML(str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:131
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		str.print(varName_CAD());
	}
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:510
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print(toString_C(p));
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIdUse() {
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
    }
    /**
     * @declaredat ASTNode:13
     */
    public FIdUse(FQName p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:19
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:25
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        allFArraySubscripts_reset();
        size_reset();
        myFRecordDecl_reset();
        myFEnumDecl_reset();
        type_reset();
        myFAlgorithm_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:49
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FIdUse clone() throws CloneNotSupportedException {
        FIdUse node = (FIdUse) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FIdUse copy() {
        try {
            FIdUse node = (FIdUse) clone();
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
     * @declaredat ASTNode:81
     */
    public FIdUse fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public FIdUse treeCopyNoTransform() {
        FIdUse tree = (FIdUse) copy();
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
     * @declaredat ASTNode:115
     */
    public FIdUse treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
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
     * Retrieves the ExpandedSubscripts child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ExpandedSubscripts child.
     * @apilevel low-level
     */
    public FArraySubscripts getExpandedSubscriptsNoTransform() {
        return (FArraySubscripts) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child ExpandedSubscripts.
     * @return The the child position of the optional child ExpandedSubscripts.
     * @apilevel low-level
     */
    protected int getExpandedSubscriptsChildPosition() {
        return 1;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:299
     */
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        try {
        		// Notice here the use of accessNdims. Also, if the access has
        		// no subscripts, it may still have dimension > 0 if its declaration
        		// is an array declaration. 
        		// If the FQName is marked as scalarized, then dimension must 
        		// be 0 and using myFV() might cause a NullPointerException.
        		// This is because if scalarization is in progress, 
        		// then this node will be hanging without a proper AST.
        		int n = 0;
        		if (!getFQName().isScalarized())
        			for (FArraySubscripts fas : allFArraySubscripts())
        				n += fas.accessNdims();
        		return n;
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean allFArraySubscripts_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FArraySubscripts> allFArraySubscripts_value;
    /**
     * @apilevel internal
     */
    private void allFArraySubscripts_reset() {
        allFArraySubscripts_computed = false;
        allFArraySubscripts_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FArraySubscripts> allFArraySubscripts() {
        if(allFArraySubscripts_computed) {
            return allFArraySubscripts_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        allFArraySubscripts_value = allFArraySubscripts_compute();
        if (isFinal && num == state().boundariesCrossed) {
            allFArraySubscripts_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return allFArraySubscripts_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FArraySubscripts> allFArraySubscripts_compute() {
    		ArrayList<FArraySubscripts> res = getFQName().createFArraySubscriptsList();
    		if (!hasFArraySubscripts() && myFV().isArray()) 
    			res.set(res.size() - 1, getExpandedSubscripts());
    		return res;
    	}
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getExpandedSubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getExpandedSubscripts_value = getExpandedSubscripts_compute();
        setChild(getExpandedSubscripts_value, getExpandedSubscriptsChildPosition());

        FArraySubscripts node = (FArraySubscripts) this.getChild(getExpandedSubscriptsChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private FArraySubscripts getExpandedSubscripts_compute() {
    		Size s = myFV().size();
    		if (s.isUnknown() && myFV().inRecord()) {
                s = getFQName().calcMySize(getFQName().numParts());
    		}
    		return s.createExpandedFArraySubscripts();
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
    		if (ndims() == 0)
    			return Size.SCALAR;
    		
    		MutableSize s = new MutableSize(ndims());
    		for (FArraySubscripts fas : allFArraySubscripts())
    			for (FSubscript fs : fas.getFSubscripts()) 
    				if (fs.ndims() >= 1)
    					s.append(fs.size());
    		return s;
    	}
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = ndims() > 0;

        return isArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonForIndex myForIndex() {
        ASTNode$State state = state();
        CommonForIndex myForIndex_value = myFV().myForIndex();

        return myForIndex_value;
    }
    /**
     * Find the all ancestors that are FExpSubscripts, if any.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1243
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExpSubscript> allSurroundingFExpSubscripts() {
        ASTNode$State state = state();
        try {
        		ArrayList<FExpSubscript> list = new ArrayList<FExpSubscript>();
        		FExpSubscript cur = surroundingFExpSubscript();
        		while (cur != null) {
        			list.add(cur);
        			cur = cur.surroundingFExpSubscript();
        		}
        		return list;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = Indices.createFromFas(allFArraySubscripts());

        return indices_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2393
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                boolean func = inFunction();
                FQName name = getFQName();
                if (func)
                    name = name.resolveSubscripts(evaluator);
                FAbstractVariable var = func ? lookupFV(name) : myFV();
                if (var != null && !var.isUnknown()) {
                    Index i = Index.NULL;
                    if (hasFArraySubscripts() && !name.isScalarized() && !isArray()) {
                        i = name.getFArraySubscripts().createIndex();
                    } else if (var.isFVariable() && name.isScalarized() && !var.asFVariable().isScalarized()) {
                        i = var.asFVariable().getFQName().getFArraySubscripts().createIndex();
                    }
                    if (i != Index.NULL) {
                        return var.inRecord() ? cevalRecordMember(evaluator, name).array().getCell(i) : evaluator.ceval(var, i);
                    } else {
                        return var.inRecord() ? cevalRecordMember(evaluator, name) : evaluator.ceval(var);
                    }
                } else {
                    return CValue.UNKNOWN;
                }
            }
        finally {
        }
    }
    /**
     * Perform constant evaluation of an access to a record member.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2466
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalRecordMember(VariableEvaluator evaluator, FQName name) {
        ASTNode$State state = state();
        try {
                if (name.numDots() < 1)
                  return CValue.UNKNOWN;
                String last = name.lastActualPartName();
                FQName prefix = name.copyPrefix();
                prefix.parent = this;
                FAbstractVariable var = lookupFV(prefix.copyWithoutSubscripts());
                CValue res = var.inRecord() ? cevalRecordMember(evaluator, prefix) : evaluator.ceval(var);
                if (prefix.hasFArraySubscripts())
                  res = res.array().getCell(prefix.getFArraySubscripts().createIndex());
                return res.record().getMember(last);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular(int dim) {
        ASTNode$State state = state();
        boolean isCircular_int_value = myFV().isCircular();

        return isCircular_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVarUse() {
        ASTNode$State state = state();
        boolean isUnknownSizeVarUse_value = myFV().isUnknownSizeVar();

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
                return !set.contains(myFV());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFV() {
        ASTNode$State state = state();
        FAbstractVariable myFV_value = lookupFV(getFQName());

        return myFV_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:42
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable myFuncVar() {
        ASTNode$State state = state();
        try {
                FAbstractVariable fv = lookupOutermostFV(getFQName());
                return (fv instanceof FFunctionVariable) ? (FFunctionVariable) fv: null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCommonVarDecl() {
        ASTNode$State state = state();
        CommonVariableDecl myCommonVarDecl_value = myFV();

        return myCommonVarDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = myFV().isForIndex();

        return isForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public FCallable myFCallable() {
        ASTNode$State state = state();
        FCallable myFCallable_value = lookupFCallable(name());

        return myFCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myRecordFV() {
        ASTNode$State state = state();
        FAbstractVariable myRecordFV_value = lookupFV(getFQName().copyFirstPrefix());

        return myRecordFV_value;
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
        myFRecordDecl_value = lookupFRec(name());
        if (isFinal && num == state().boundariesCrossed) {
            myFRecordDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFRecordDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myEnumFV() {
        ASTNode$State state = state();
        FAbstractVariable myEnumFV_value = lookupFV(getFQName().copyPrefix());

        return myEnumFV_value;
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
        myFEnumDecl_value = lookupFEnum(name());
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExternalStmt myFExternalStmt() {
        ASTNode$State state = state();
        FExternalStmt myFExternalStmt_value = myFCallable().asFFunctionDecl().getFAlgorithm().getFExternalStmt();

        return myFExternalStmt_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = getFQName().hasFArraySubscripts();

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = getFQName().getFArraySubscripts();

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFQName().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derName(int order) {
        ASTNode$State state = state();
        String derName_int_value = getFQNameNoTransform().derName(order);

        return derName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String preName() {
        ASTNode$State state = state();
        String preName_value = getFQNameNoTransform().preName();

        return preName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarName() {
        ASTNode$State state = state();
        String scalarName_value = getFQName().scalarName();

        return scalarName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = getFQName().nameUnderscore();

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameUnderscore(String suffix) {
        ASTNode$State state = state();
        String funcNameUnderscore_String_value = getFQName().funcNameUnderscore(suffix);

        return funcNameUnderscore_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = getFQName().hasNonLiteralSubscripts();

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordType recordType() {
        ASTNode$State state = state();
        FRecordType recordType_value = myFRecordDecl().type();

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
        type_value = myFV().type().sizedType(size());
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:502
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
                FAbstractVariable variable = myFV();
                if (variable instanceof FVariable) {
                    FVariable fVariable = (FVariable) variable;
                    return(fVariable.variability());
                } else {
                    return (fContinuous());
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:630
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        try {
                FQName fqn = getFQName();
                FTypePrefixVariability variability = fConstant();
                if (fqn.isSimple())
                    return variability;
                for (FQNamePart part : fqn.asFQNameFull().getFQNameParts())
                    if (part.hasFArraySubscripts())
                        variability = variability.combine(part.getFArraySubscripts().variability());
                return variability;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInstAccess() {
        ASTNode$State state = state();
        boolean isInstAccess_value = false;

        return isInstAccess_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:717
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess asInstAccess() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccessToStream() {
        ASTNode$State state = state();
        boolean isAccessToStream_value = false;

        return isAccessToStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentSizeClass() {
        ASTNode$State state = state();
        boolean isComponentSizeClass_value = false;

        return isComponentSizeClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentReference(Criteria<InstComponentDecl> criteria) {
        ASTNode$State state = state();
        boolean isComponentReference_Criteria_InstComponentDecl__value = false;

        return isComponentReference_Criteria_InstComponentDecl__value;
    }
    @ASTNodeAnnotation.Attribute
    public int cardinalityValue() {
        ASTNode$State state = state();
        int cardinalityValue_value = myFClass().getConnectionSetManager().getCardinality(scalarName());

        return cardinalityValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUse splitArrayAccess(int index) {
        ASTNode$State state = state();
        FIdUse splitArrayAccess_int_value = new FIdUse(getFQName().splitArrayAccess(index));

        return splitArrayAccess_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> accessedVarSet() {
        ASTNode$State state = state();
        Set<InstComponentDecl> accessedVarSet_value = Collections.emptySet();

        return accessedVarSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = myFV().isUnknown();

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = myFV().shouldBeDifferentiated();

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = getFQName().isSlice();

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFlatParameterUse() {
        ASTNode$State state = state();
        boolean isFlatParameterUse_value = myFV().isParameter();

        return isFlatParameterUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp createDerExp(int order) {
        ASTNode$State state = state();
        FExp createDerExp_int_value = new FDerExp(fullCopy(), order);

        return createDerExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Identifier";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "exp";

        return xmlNamespace_value;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        ASTNode$State state = state();
        String varName_CAD_value = toString_var_CAD(printer_CAD);

        return varName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        ASTNode$State state = state();
        String derName_CAD_value = toString_der_CAD(printer_CAD);

        return derName_CAD_value;
    }
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:188
     */
    @ASTNodeAnnotation.Attribute
    public String toString_var_CAD(CodePrinter p) {
        ASTNode$State state = state();
        try {
        		String type = myFV().funcArrayType(isAssignUse());
        		if (myFV().inRecord() && inFunction()) {
        			return getFQName().genRecordUse_var_CAD(p, myRecordFV(), type);
        		} else {
        			return myFV().genUse_var_CAD(p, getFQName().getFArraySubscripts(), type);
        		}
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:197
     */
    @ASTNodeAnnotation.Attribute
    public String toString_der_CAD(CodePrinter p) {
        ASTNode$State state = state();
        try {
        		String type = myFV().funcArrayType(isAssignUse());
        		if (myFV().inRecord() && inFunction()) {
        			return getFQName().genRecordUse_der_CAD(p, myRecordFV(), type);
        		} else {
        			return myFV().genUse_der_CAD(p, getFQName().getFArraySubscripts(), type);
        		}
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        ASTNode$State state = state();
        String name_C_value = toString_C(printer_C);

        return name_C_value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:528
     */
    @ASTNodeAnnotation.Attribute
    public String toString_C(CodePrinter p) {
        ASTNode$State state = state();
        try {
                String type = myFV().funcArrayType(isAssignUse());
                if (myFV().inRecord() && inFunction())
                    return getFQName().genRecordUse_C(p, myRecordFV(), type);
                else
                    return myFV().genUse_C(p, getFQName().getFArraySubscripts(), type);
            }
        finally {
        }
    }
    /**
     * Find the closest ancestor that is an FExpSubscript, if any.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1235
     */
    @ASTNodeAnnotation.Attribute
    public FExpSubscript surroundingFExpSubscript() {
        ASTNode$State state = state();
        FExpSubscript surroundingFExpSubscript_value = getParent().Define_surroundingFExpSubscript(this, null);

        return surroundingFExpSubscript_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1568
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3729
     */
    @ASTNodeAnnotation.Attribute
    public FAlgorithm myFAlgorithm() {
        if(myFAlgorithm_computed) {
            return myFAlgorithm_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFAlgorithm_value = getParent().Define_myFAlgorithm(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myFAlgorithm_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFAlgorithm_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFAlgorithm_computed = false;
    /**
     * @apilevel internal
     */
    protected FAlgorithm myFAlgorithm_value;
    /**
     * @apilevel internal
     */
    private void myFAlgorithm_reset() {
        myFAlgorithm_computed = false;
        myFAlgorithm_value = null;
    }
    /**
     * @attribute inh
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3741
     */
    @ASTNodeAnnotation.Attribute
    public boolean useIsAssignment() {
        ASTNode$State state = state();
        boolean useIsAssignment_value = getParent().Define_useIsAssignment(this, null);

        return useIsAssignment_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:24
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:25
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupDerFV(FQName fqn, int index) {
        ASTNode$State state = state();
        FAbstractVariable lookupDerFV_FQName_int_value = getParent().Define_lookupDerFV(this, null, fqn, index);

        return lookupDerFV_FQName_int_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:26
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupOutermostFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupOutermostFV_FQName_value = getParent().Define_lookupOutermostFV(this, null, fqn);

        return lookupOutermostFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:531
     */
    @ASTNodeAnnotation.Attribute
    public FCallable lookupFCallable(String name) {
        ASTNode$State state = state();
        FCallable lookupFCallable_String_value = getParent().Define_lookupFCallable(this, null, name);

        return lookupFCallable_String_value;
    }
    /**
     * @attribute inh
     * @aspect FlatRecordBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:579
     */
    @ASTNodeAnnotation.Attribute
    public FRecordDecl lookupFRec(String name) {
        ASTNode$State state = state();
        FRecordDecl lookupFRec_String_value = getParent().Define_lookupFRec(this, null, name);

        return lookupFRec_String_value;
    }
    /**
     * @attribute inh
     * @aspect FlatEnumBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:612
     */
    @ASTNodeAnnotation.Attribute
    public FEnumDecl lookupFEnum(String name) {
        ASTNode$State state = state();
        FEnumDecl lookupFEnum_String_value = getParent().Define_lookupFEnum(this, null, name);

        return lookupFEnum_String_value;
    }
    /**
     * @attribute inh
     * @aspect FlatPreBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:657
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupPreFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupPreFV_FQName_value = getParent().Define_lookupPreFV(this, null, fqn);

        return lookupPreFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1603
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1646
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAlgorithm() {
        ASTNode$State state = state();
        boolean inAlgorithm_value = getParent().Define_inAlgorithm(this, null);

        return inAlgorithm_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1221
     */
    @ASTNodeAnnotation.Attribute
    public boolean inForLoop() {
        ASTNode$State state = state();
        boolean inForLoop_value = getParent().Define_inForLoop(this, null);

        return inForLoop_value;
    }
    /**
     * Checks if the use is in an assignment possition, LHS of a function call
     * equation or LHS of a statemet.
     * @attribute inh
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:519
     */
    @ASTNodeAnnotation.Attribute
    public boolean isAssignUse() {
        ASTNode$State state = state();
        boolean isAssignUse_value = getParent().Define_isAssignUse(this, null);

        return isAssignUse_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:31
     * @apilevel internal
     */
    public boolean Define_inSubscriptedExp(ASTNode caller, ASTNode child) {
        if (caller == getExpandedSubscriptsNoTransform()) {
            return false;
        }
        else {
            return getParent().Define_inSubscriptedExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:51
     * @apilevel internal
     */
    public Size Define_mySize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getFQName().calcMySize(getFQName().numParts());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:169
     * @apilevel internal
     */
    public FIdUseExp Define_buildAccessContextSizeExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FIdUseExp(new FIdUse(new FQNameFull(getFQName().buildAccessContext())));
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:810
     * @apilevel internal
     */
    public boolean Define_inUnknownAccess(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myFV().isUnknown();
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1839
     * @apilevel internal
     */
    public boolean Define_expandSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FExpSubscript_collectForIndices() {
    /**
     * @attribute coll
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1216
     */
        if (isForIndex()) {
            for(Iterator iter = (allSurroundingFExpSubscripts()).iterator(); iter.hasNext(); ) {
                FExpSubscript ref = (FExpSubscript) iter.next();
                if (ref != null) {
                    ref.FExpSubscript_collectForIndices_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FExpSubscript_collectForIndices();
    }
    protected void contributeTo_FExpSubscript_FExpSubscript_collectForIndices(HashSet<CommonForIndex> collection) {
        super.contributeTo_FExpSubscript_FExpSubscript_collectForIndices(collection);
        if (isForIndex())
            collection.add(myForIndex());
    }

}
