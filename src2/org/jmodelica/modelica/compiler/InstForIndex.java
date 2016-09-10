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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:167
 * @production InstForIndex : {@link CommonForIndex} ::= <span class="component">{@link InstPrimitive}</span>;

 */
public class InstForIndex extends CommonForIndex implements Cloneable {
    /**
     * Evaluate statement list over this for index during function evaluation.
     * 
     * @param values  constant values for the variables. 
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4316
     */
    public int evaluateInFunc(AlgorithmEvaluator evaluator, 
		  List<InstForIndex> indices, int i, List<FStatement> stmts) {
	  InstComponentDecl var = getInstPrimitive();
	  CValue oldVal = var.evaluationValue(evaluator);
	  boolean last = i == indices.getNumChild() - 1;
	  CValueArray ivals = getFExp().ceval(evaluator).array();
	  for (Index j : ivals.indices()) {
		  var.setEvaluationValue(evaluator, ivals.getCell(j));
		  stmts.prepareForFunctionEval();
		  int res = last ? stmts.evaluateList(evaluator) : 
				  indices.getChild(i + 1).evaluateInFunc(evaluator, indices, i + 1, stmts);
		  if (res != FStatement.EVAL_CONT) {
			  var.setEvaluationValue(evaluator, oldVal);
			  return (res == FStatement.EVAL_BREAK) ? FStatement.EVAL_CONT : res;
		  }
	  }
	  var.setEvaluationValue(evaluator, oldVal);
	  return FStatement.EVAL_CONT;
  }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1956
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.print(getInstPrimitive().name());
        if (hasFExp()) {
            str.print(" in ");
        p.print(getFExp(), str, indent);
        }
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:251
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        if (hasFExp() && getFExp().size().isUnknown() && getFExp().isAccess() && inFunction()) {
            UNSUPPORTED_IN_FUNCTION_UNKNOWN_SIZE_ARRAY_FOR_INDEX.invoke(this);
        }
        if (!hasFExp()) {
            UNSUPPORTED_FOR_INDEX_WITHOUT_EXPRESSION.invoke(this);
        }
        if (hasFExp() && !getFExp().variability().parameterOrLess() && !inFunction()) {
            UNSUPPORTED_NON_FIXED_FOR_INDEX.invoke(this);
        }
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:264
     */
    public void contentCheck(ErrorCheckType checkType) {
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1256
     */
    public void collectErrorsForAllIndices(
            List<? extends CommonForIndex> indices, int i, ASTNode child, ErrorCheckType checkType) {
        if (hasFExp()) {
            InstComponentDecl var = getInstPrimitive();
            CValue oldVal = var.evaluationValue;
            boolean last = i == indices.getNumChild() - 1;
            CommonForIndex next = last ? null : indices.getChild(i + 1);
            CValueArray ivals = getFExp().ceval().array();
            for (Index j : ivals.indices()) {
                var.setLocalCachedEvaluationValue(ivals.getCell(j));
                if (last) {
                    child.resetCollectErrors();
                    child.collectErrors(checkType);
                    child.flushAllRecursive();
                } else {
                    next.collectErrorsForAllIndices(indices, i + 1, child, checkType);
                }
            }
            var.setLocalCachedEvaluationValue(oldVal);
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:732
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (hasFExp() && !getFExp().type().isUnknown() && getFExp().ndims() != 1)
		  error("The expression of for index " + name() + " must be a vector expression: " + 
				  getFExp() + " has " + getFExp().ndims() + " dimension(s)");
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2775
     */
    public FForIndex flatten(FQName prefix) {
        return new FForIndex(hasFExp()? new Opt(getFExp().flatten(prefix)): new Opt(),
                getInstPrimitive().createFVariable());
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstForIndex() {
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
        setChild(new Opt(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public InstForIndex(Opt<FExp> p0, InstPrimitive p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:45
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public InstForIndex clone() throws CloneNotSupportedException {
        InstForIndex node = (InstForIndex) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public InstForIndex copy() {
        try {
            InstForIndex node = (InstForIndex) clone();
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
     * @declaredat ASTNode:77
     */
    public InstForIndex fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public InstForIndex treeCopyNoTransform() {
        InstForIndex tree = (InstForIndex) copy();
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
     * @declaredat ASTNode:106
     */
    public InstForIndex treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:113
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the FExp child. This is the <code>Opt</code>
     * node containing the child FExp, not the actual child!
     * @param opt The new node to be used as the optional node for the FExp child.
     * @apilevel low-level
     */
    public void setFExpOpt(Opt<FExp> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FExp child.
     * @param node The new node to be used as the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        getFExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FExp child exists.
     * @return {@code true} if the optional FExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFExp() {
        return getFExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FExp child.
     * @return The FExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getFExp() {
        return (FExp) getFExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FExp child. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * @return The optional node for child the FExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FExp")
    public Opt<FExp> getFExpOpt() {
        return (Opt<FExp>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FExp. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FExp.
     * @apilevel low-level
     */
    public Opt<FExp> getFExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(0);
    }
    /**
     * Replaces the InstPrimitive child.
     * @param node The new node to replace the InstPrimitive child.
     * @apilevel high-level
     */
    public void setInstPrimitive(InstPrimitive node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the InstPrimitive child.
     * @return The current node used as the InstPrimitive child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstPrimitive")
    public InstPrimitive getInstPrimitive() {
        return (InstPrimitive) getChild(1);
    }
    /**
     * Retrieves the InstPrimitive child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstPrimitive child.
     * @apilevel low-level
     */
    public InstPrimitive getInstPrimitiveNoTransform() {
        return (InstPrimitive) getChildNoTransform(1);
    }
    /**
     * Get the set of all values this for index spans.
     * 
     * @return an int array containing the values spanned
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2327
     */
    @ASTNodeAnnotation.Attribute
    public int[] myIndices() {
        ASTNode$State state = state();
        try {
        		if (hasFExp())
        			return getFExp().myIndices();
        		else
        			return new int[0]; // TODO: return 1..n, where n is given by use.
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCVD() {
        ASTNode$State state = state();
        CommonVariableDecl myCVD_value = getInstPrimitive();

        return myCVD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = getInstPrimitive().matches(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getInstPrimitiveNoTransform().name();

        return name_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1601
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        if (caller == getInstPrimitiveNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_myForIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        if (caller == getInstPrimitiveNoTransform()) {
            return false;
        }
        else {
            return getParent().Define_inRecord(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:436
     * @apilevel internal
     */
    public boolean Define_isForIndex(ASTNode caller, ASTNode child) {
        if (caller == getInstPrimitiveNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_isForIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FQNameEmpty();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:194
     * @apilevel internal
     */
    public boolean Define_isFlattened(ASTNode caller, ASTNode child, InstValueModification ivm) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return !inFunction() || getFExp().isSlice();
        }
        else {
            return super.Define_flattenFASContext(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
