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
 * Unary negation expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:951
 * @production FNegExp : {@link FUnaryExp};

 */
public class FNegExp extends FUnaryExp implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1042
     */
    public FNegExp createEmptyNode()       { return new FNegExp();       }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1581
     */
    protected void prettyPrintExp(Printer p,CodeStream str, String indent){
		str.print("- ");
		p.print(getFExp(),str,indent);
	}
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:253
     */
    public FExp diff(String name) {
        return diffWrap(name, getFExp());
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:624
     */
    @Override
    public void genDerExp_CAD(CodePrinter p, CodeStream str, String indent) {
        str.print("- (");
        getFExp().genDer_CAD(p, str, indent);
        str.print(")");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FNegExp() {
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
    public FNegExp(FExp p0) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:44
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public FNegExp clone() throws CloneNotSupportedException {
        FNegExp node = (FNegExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public FNegExp copy() {
        try {
            FNegExp node = (FNegExp) clone();
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
     * @declaredat ASTNode:76
     */
    public FNegExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:85
     */
    public FNegExp treeCopyNoTransform() {
        FNegExp tree = (FNegExp) copy();
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
     * @declaredat ASTNode:110
     */
    public FNegExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:117
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FExp child.
     * @param node The new node to replace the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FExp child.
     * @return The current node used as the FExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FExp")
    public FExp getFExp() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the FExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FExp child.
     * @apilevel low-level
     */
    public FExp getFExpNoTransform() {
        return (FExp) getChildNoTransform(0);
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
    @ASTNodeAnnotation.Attribute
    public CValue cevalEval(CValue val) {
        ASTNode$State state = state();
        CValue cevalEval_CValue_value = type().neg(val);

        return cevalEval_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp createNegated() {
        ASTNode$State state = state();
        FExp createNegated_value = getFExp().fullCopy();

        return createNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp makeNegated() {
        ASTNode$State state = state();
        FExp makeNegated_value = getFExp();

        return makeNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasSimpleNegation() {
        ASTNode$State state = state();
        boolean hasSimpleNegation_value = true;

        return hasSimpleNegation_value;
    }
    @ASTNodeAnnotation.Attribute
    public double maxRealValue() {
        ASTNode$State state = state();
        double maxRealValue_value = -getFExp().minRealValue();

        return maxRealValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public double minRealValue() {
        ASTNode$State state = state();
        double minRealValue_value = -getFExp().maxRealValue();

        return minRealValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = getFExp().nominal();

        return nominal_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp stripNegations() {
        ASTNode$State state = state();
        FExp stripNegations_value = getFExp().stripNegations();

        return stripNegations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegated() {
        ASTNode$State state = state();
        boolean isNegated_value = !getFExp().isNegated();

        return isNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public int precedence() {
        ASTNode$State state = state();
        int precedence_value = PRECEDENCE_ADDITIVE;

        return precedence_value;
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
        type_value = getFExp().type().hasNeg() ? super.type() : fUnknownType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMultiplicationOf(FVariable v) {
        ASTNode$State state = state();
        boolean isMultiplicationOf_FVariable_value = getFExp().isMultiplicationOf(v);

        return isMultiplicationOf_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public String operatorName() {
        ASTNode$State state = state();
        String operatorName_value = OP_NEG;

        return operatorName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = getFExp().canBeAlias();

        return canBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public int aliasSign() {
        ASTNode$State state = state();
        int aliasSign_value = -getFExp().aliasSign();

        return aliasSign_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable variableThatCanBeAlias() {
        ASTNode$State state = state();
        FVariable variableThatCanBeAlias_value = getFExp().variableThatCanBeAlias();

        return variableThatCanBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSmoothInSemiLinear() {
        ASTNode$State state = state();
        boolean isSmoothInSemiLinear_value = getFExp().isSmoothInSemiLinear();

        return isSmoothInSemiLinear_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:251
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> factors() {
        ASTNode$State state = state();
        try {
        		ArrayList<FExp> t = new ArrayList<FExp>();
        		t.add(dynamicFExp(new FNegExp(new FRealLitExp(1.))));
        		t.addAll(getFExp().factors());
        		return t;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegTerm(String name) {
        ASTNode$State state = state();
        boolean isNegTerm_String_value = getFExp().isIdentifier(name);

        return isNegTerm_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralZero() {
        ASTNode$State state = state();
        boolean isLiteralZero_value = getFExpNoTransform().isLiteralZero();

        return isLiteralZero_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralOne() {
        ASTNode$State state = state();
        boolean isLiteralOne_value = getFExpNoTransform().isLiteralMinusOne();

        return isLiteralOne_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralMinusOne() {
        ASTNode$State state = state();
        boolean isLiteralMinusOne_value = getFExpNoTransform().isLiteralOne();

        return isLiteralMinusOne_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Neg";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1555
     * @apilevel internal
     */
    public boolean Define_shouldhaveParenthesis(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            return true;
        }
        else {
            return super.Define_shouldhaveParenthesis(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:279
     * @apilevel internal
     */
    public boolean Define_isNegativeTerm(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            return !isNegativeTerm();
        }
        else {
            return getParent().Define_isNegativeTerm(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:505
        if (getFExpNoTransform().isLiteralZero()) {
            state().duringExpressionSimplification++;
            ASTNode result = rewriteRule0();
            state().duringExpressionSimplification--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:506
        if (getFExpNoTransform().hasSimpleNegation()) {
            state().duringExpressionSimplification++;
            ASTNode result = rewriteRule1();
            state().duringExpressionSimplification--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:505
     * @apilevel internal
     */    private FExp rewriteRule0() {
        return getFExp();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:506
     * @apilevel internal
     */    private FExp rewriteRule1() {
        return getFExp().makeNegated();
    }
}
