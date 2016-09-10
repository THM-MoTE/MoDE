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
 * A flattened assignment statement.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:714
 * @production FAssignStmt : {@link FStatement} ::= <span class="component">Left:{@link FAssignableExp}</span> <span class="component">Right:{@link FExp}</span>;

 */
public class FAssignStmt extends FStatement implements Cloneable {
    /**
     * Evaluate statement during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3976
     */
    @Override
    public int evaluate(AlgorithmEvaluator evaluator) {
        getLeft().assignToInFuncEval(evaluator, evaluator.ceval(getRight()));
        return EVAL_CONT;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1874
     */
    public void defSet(Set<FVariable> fvSet, Set<FVariable> fvUse) {
        defSetAdd(fvSet, fvUse, lookupFVariablesInSet(getRight().findFIdUseExpsInTree()));
        defSetAdd(fvUse, fvSet, lookupFVariablesInSet(getLeft().findFIdUseExpsInTree()));
    }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1761
     */
    private String myTempVarName;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1366
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		p.print(getLeft(), str, indent);
		str.print(" := ");
		p.print(getRight(), str, indent);
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:291
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        if (inWhen) {
            getLeft().makeContinuousVariablesDiscrete();
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:857
     */
    public void typeCheck(ErrorCheckType checkType) {
      FType left = getLeft().type();
      FType right = getRight().type();
      if (!left.isUnknown() && !right.isUnknown()) {
          if (!left.typeCompatible(right, true)) {
              if (left.typeCompatibleExceptLengths(right)) {
                  // TODO: should use lockBranch() here as well, but no support yet
                  errorUnlessDisabled("The array sizes of right and left hand side of assignment are not compatible, " + 
                          "size of left-hand side is %s, and size of right-hand side is %s", left.size(), right.size());
              } else {
                  error("The right and left expression types of assignment are not compatible, " + 
                          "type of left-hand side is %s, and type of right-hand side is %s", left, right);
              }
          }
      }
  }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:63
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        sl.add(new FAssignStmt((FAssignableExp)getLeft().flatten(prefix), getRight().flatten(prefix)));
        return false;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1050
     */
    public void acceptTransform(AlgorithmTransformer tf) { tf.visit(this); }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1714
     */
    public void enableAliasRewrite() {
		super.enableAliasRewrite();
		rewriteAlias = true;
		is$Final = false;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1730
     */
    boolean rewriteAlias = false;
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1314
     */
    public void inline(AbstractFunctionInliner fi) {
        FExp right = getRight().fullCopy();
        right = getRight().dynamicFExp(right);
        right = right.replaceReferences(fi);
        FIdUseExp left = (FIdUseExp)getLeft().dynamicFExp(getLeft().fullCopy());
        left.replaceReferencesInSubscripts(fi);
        right.addInliningVarsAndEqns(fi, left.scalarName(), true);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1396
     */
    public void inlinePrepare(AbstractFunctionInliner fi, List<FStatement> stmts) {
        stmts.add(fullCopy());
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:660
     */
    public void enableConstantFolding() {
        getRight().enableConstantFolding();
    }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:31
     */
    @Override
    public void scalarize(Scalarizer.Algorithm s) {
        
        FAssignableExp left = getLeft();
        FExp right = getRight();
        
        if (scalarizedAsFFunctionCallStmt()) {
            // Special case, Function call stmt
            FFunctionCall call = (FFunctionCall) right;
            s.createScalarizedFunctionCallClause(left, call);
        } else {
            FType t = left.size().isUnknown() ? left.type() : right.type();
            if (extractTemp()) {
                s.addTempVar(this);
                FIdUseExp temp = getRight().tempExp(tempVarName());
                t.scalarizeAssignment(s, temp, right);
                right = temp;
            }
            t.scalarizeAssignment(s, left, right);
        }
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:887
     */
    @Override
    public void diff(List<FStatement> diffed) {
        if (order() == myFAlgorithm().order() && shouldBeDifferentiated())
            diffed.add(new FDerivativeAssignStmt(getLeft().createDerExp(1).asFIdUseExp(), getRight().diff("time"), order() + 1));
        diffed.add(fullCopy());
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:312
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		open_XML(str, indent);
		p.print(getLeft(), str, indent2);
		enclose_XML(p, str, indent2, "Expression", getRight());
		close_XML(str, indent);
    }
    /**
     * Prints AD code for this assignement statement
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param indent  used to get a consistently formated c-code
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2125
     */
    @Override
    public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
        genTempVars_CAD(p, str, indent);
        str.print(indent);
        p.print(getLeft(), str, indent);
        str.print(" = ");
        p.print(getRight(), str, indent);
        str.print(";\n");

        if (shouldBeDifferentiated()) {
            str.print(indent);
            str.print(((FIdUseExp)getLeft()).getFIdUse().toString_der_CAD(p));
            str.print(" = ");
            getRight().genDer_CAD(p, str, indent);
            str.print(";\n");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1832
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		p.printPreSteps(this, str, indent);
        getLeft().type().printAssign_C(p, str, indent, getLeft(), getRight());
        p.printPostSteps(this, str, indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FAssignStmt() {
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
    public FAssignStmt(FAssignableExp p0, FExp p1) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
        sortingAssignedNames_reset();
        sortingDependencies_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:47
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public FAssignStmt clone() throws CloneNotSupportedException {
        FAssignStmt node = (FAssignStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FAssignStmt copy() {
        try {
            FAssignStmt node = (FAssignStmt) clone();
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
     * @declaredat ASTNode:79
     */
    public FAssignStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public FAssignStmt treeCopyNoTransform() {
        FAssignStmt tree = (FAssignStmt) copy();
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
     * @declaredat ASTNode:108
     */
    public FAssignStmt treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:115
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Left child.
     * @param node The new node to replace the Left child.
     * @apilevel high-level
     */
    public void setLeft(FAssignableExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Left child.
     * @return The current node used as the Left child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Left")
    public FAssignableExp getLeft() {
        return (FAssignableExp) getChild(0);
    }
    /**
     * Retrieves the Left child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Left child.
     * @apilevel low-level
     */
    public FAssignableExp getLeftNoTransform() {
        return (FAssignableExp) getChildNoTransform(0);
    }
    /**
     * Replaces the Right child.
     * @param node The new node to replace the Right child.
     * @apilevel high-level
     */
    public void setRight(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Right child.
     * @return The current node used as the Right child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Right")
    public FExp getRight() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the Right child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Right child.
     * @apilevel low-level
     */
    public FExp getRightNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1756
     */
    @ASTNodeAnnotation.Attribute
    public String tempVarName() {
        ASTNode$State state = state();
        try {
                 if (myTempVarName == null)
                     myTempVarName = calcTempVarName();
                 return myTempVarName;
             }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String calcTempVarName() {
        ASTNode$State state = state();
        String calcTempVarName_value = calcGeneratedVarName(FlatVariableMap.GeneratedVarType.TEMP);

        return calcTempVarName_value;
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
        type_value = getRight().type().typePromotion(getLeft().type());
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInline() {
        ASTNode$State state = state();
        boolean isOkTrivialInline_value = true;

        return isOkTrivialInline_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInlineInFor() {
        ASTNode$State state = state();
        boolean isOkTrivialInlineInFor_value = getLeft().isOkTrivialInlineInFor();

        return isOkTrivialInlineInFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable() {
        ASTNode$State state = state();
        boolean isInlinable_value = true;

        return isInlinable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizedAsFFunctionCallStmt() {
        ASTNode$State state = state();
        boolean scalarizedAsFFunctionCallStmt_value = getRight().isNonVectorizedFunctionCall() && getLeft().type().isComposite() && 
                    inFunction() && !getLeft().isSlice();

        return scalarizedAsFFunctionCallStmt_value;
    }
    /**
     * @attribute syn
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:103
     */
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        try {
                if (type().size().isUnknown() || type().isArray()) {
                    Set<FAbstractVariable> left = getLeft().usesInScalarizedExp();
                    Set<FAbstractVariable> right = getRight().usesInScalarizedExp();
                    for (FAbstractVariable fv : left) {
                        if (right.contains(fv)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:53
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAssert> sizeAsserts() {
        ASTNode$State state = state();
        try {
                ArrayList<FAssert> a = new ArrayList<FAssert>();
                getLeft().size().sizeAsserts(a, getRight().size(), getLeft());
                getRight().size().sizeAsserts(a, getLeft().size(), getLeft());
                return a;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = 0;

        return order_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sortingAssignedNames_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingAssignedNames_value;
    /**
     * @apilevel internal
     */
    private void sortingAssignedNames_reset() {
        sortingAssignedNames_computed = false;
        sortingAssignedNames_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingAssignedNames() {
        if(sortingAssignedNames_computed) {
            return sortingAssignedNames_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingAssignedNames_value = getLeft().sortingAssignedNames();
        if (isFinal && num == state().boundariesCrossed) {
            sortingAssignedNames_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingAssignedNames_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sortingDependencies_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingDependencies_value;
    /**
     * @apilevel internal
     */
    private void sortingDependencies_reset() {
        sortingDependencies_computed = false;
        sortingDependencies_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingDependencies() {
        if(sortingDependencies_computed) {
            return sortingDependencies_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingDependencies_value = getRight().sortingAddNamesUsed(baseSortingDependencies());
        if (isFinal && num == state().boundariesCrossed) {
            sortingDependencies_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingDependencies_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Assign";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1769
     */
    @ASTNodeAnnotation.Attribute
    public String calcGeneratedVarName(FlatVariableMap.GeneratedVarType gvt) {
        ASTNode$State state = state();
        String calcGeneratedVarName_FlatVariableMap_GeneratedVarType_value = getParent().Define_calcGeneratedVarName(this, null, gvt);

        return calcGeneratedVarName_FlatVariableMap_GeneratedVarType_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2876
     * @apilevel internal
     */
    public boolean Define_isAssignedTo(ASTNode caller, ASTNode child) {
        if (caller == getLeftNoTransform()) {
            return true;
        }
        else {
            return super.Define_isAssignedTo(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        if (caller == getLeftNoTransform()) {
            return true;
        }
        else {
            return super.Define_useIsAssignment(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        if (caller == getLeftNoTransform()) {
            return !scalarizedAsFFunctionCallStmt();
        }
        else {
            return super.Define_flattenFASContext(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getLeft().size().isUnknown() || getRight().size().isUnknown();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:519
     * @apilevel internal
     */
    public boolean Define_isAssignUse(ASTNode caller, ASTNode child) {
        if (caller == getRightNoTransform()) {
            return false;
        }
        else if (caller == getLeftNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_isAssignUse(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1789
        if (rewriteAlias && getLeft() instanceof FIdUseExp) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule0();
            state().duringTransformCanonical--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1789
     * @apilevel internal
     */
    private FAssignStmt rewriteRule0() {
{
            FIdUseExp left = (FIdUseExp) getLeft();
            if (left.myFV().isFVariable() && left.myFV().isAlias()) {
                FVariable fv = (FVariable) left.myFV();
                FIdUseExp exp = fv.alias().createUseExp();
                setLeft(exp);
                exp.setOriginalVariable(left, fv);
                if (fv.isNegated()) 
                    setRight(new FNegExp(getRight()));
                return this;
            } else {
                rewriteAlias = false;
                return this;
            }
        }    }
    protected void collect_contributors_FStatement_sizeAssertsColl() {
    /**
     * @attribute coll
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:40
     */
            {
                FStatement ref = (FStatement) (this);
                if (ref != null) {
                    ref.FStatement_sizeAssertsColl_contributors().add(this);
                }
            }
        super.collect_contributors_FStatement_sizeAssertsColl();
    }
    protected void contributeTo_FStatement_FStatement_sizeAssertsColl(ArrayList<FAssert> collection) {
        super.contributeTo_FStatement_FStatement_sizeAssertsColl(collection);
        collection.addAll(sizeAsserts());
    }

}
