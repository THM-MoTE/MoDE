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
 * Abstract super class for all der related expressions.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1149
 * @production FAbstractDerExp : {@link FIdUseExp} ::= <span class="component">&lt;Order:int&gt;</span>;

 */
public abstract class FAbstractDerExp extends FIdUseExp implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1095
     */
    public abstract FAbstractDerExp createEmptyNode();
    /**
     * Create new node of same class as this, with the specified children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1213
     */
    public FIdUseExp createNode(FIdUse use) {
        FAbstractDerExp node = createEmptyNode();
        node.setFIdUse(use);
        node.setOrder(order());
        return node;
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:84
     */
    public void sanityCheckFIdUseConsistency(FClass fc) {
        sanityCheckFIdUseConsistencyInChildren(fc);
        // TODO: Check if past step that created der variables?
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:456
     */
    @Override
    public void genAssignedRef_C(CodePrinter p, CodeStream str, String indent) {
        str.print(myFV().name_C());
    }
    /**
     * @declaredat ASTNode:1
     */
    public FAbstractDerExp() {
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
    public FAbstractDerExp(FIdUse p0, String p1, int p2) {
        setChild(p0, 0);
        setOriginalVariable(p1);
        setOrder(p2);
    }
    /**
     * @declaredat ASTNode:18
     */
    public FAbstractDerExp(FIdUse p0, Symbol p1, int p2) {
        setChild(p0, 0);
        setOriginalVariable(p1);
        setOrder(p2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:26
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myFV_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:52
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FAbstractDerExp clone() throws CloneNotSupportedException {
        FAbstractDerExp node = (FAbstractDerExp) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:69
     */
    public abstract FAbstractDerExp fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:76
     */
    public abstract FAbstractDerExp treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:84
     */
    public abstract FAbstractDerExp treeCopy();
    /**
     * Replaces the FIdUse child.
     * @param node The new node to replace the FIdUse child.
     * @apilevel high-level
     */
    public void setFIdUse(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FIdUse child.
     * @return The current node used as the FIdUse child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FIdUse")
    public FIdUse getFIdUse() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the FIdUse child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FIdUse child.
     * @apilevel low-level
     */
    public FIdUse getFIdUseNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the lexeme OriginalVariable.
     * @param value The new value for the lexeme OriginalVariable.
     * @apilevel high-level
     */
    public void setOriginalVariable(String value) {
        tokenString_OriginalVariable = value;
    }
    /**
     * JastAdd-internal setter for lexeme OriginalVariable using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme OriginalVariable
     * @apilevel internal
     */
    public void setOriginalVariable(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setOriginalVariable is only valid for String lexemes");
        tokenString_OriginalVariable = (String)symbol.value;
        OriginalVariablestart = symbol.getStart();
        OriginalVariableend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme OriginalVariable.
     * @return The value for the lexeme OriginalVariable.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="OriginalVariable")
    public String getOriginalVariable() {
        return tokenString_OriginalVariable != null ? tokenString_OriginalVariable : "";
    }
    /**
     * Replaces the lexeme Order.
     * @param value The new value for the lexeme Order.
     * @apilevel high-level
     */
    public void setOrder(int value) {
        tokenint_Order = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Order;
    /**
     * Retrieves the value for the lexeme Order.
     * @return The value for the lexeme Order.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Order")
    public int getOrder() {
        return tokenint_Order;
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
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2481
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalUse(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                if (getFIdUse().variability().discreteOrLess())
                    return new CValueInteger(0);
                FAbstractVariable decl = myFV();
                return decl == null ? CValue.UNKNOWN : evaluator.ceval(decl);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3221
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
    /**
     * @apilevel internal
     */
    protected boolean myFV_computed = false;
    /**
     * @apilevel internal
     */
    protected FAbstractVariable myFV_value;
    /**
     * @apilevel internal
     */
    private void myFV_reset() {
        myFV_computed = false;
        myFV_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFV() {
        if(myFV_computed) {
            return myFV_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFV_value = getFIdUse().lookupDerFV(getFIdUse().getFQName(), order());
        if (isFinal && num == state().boundariesCrossed) {
            myFV_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = derName(order());

        return name_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:423
     */
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        try {
                if (order() == 1)
                    return "der_" + getFIdUse().nameUnderscore();
                else
                    return "der_" + order() + "_" + getFIdUse().nameUnderscore();
            }
        finally {
        }
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
        type_value = fRealType(size());
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = getFIdUse().variability().discreteOrLess() ? fConstant() : getFIdUse().variability();

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp getEquationLeftInlineUse() {
        ASTNode$State state = state();
        FIdUseExp getEquationLeftInlineUse_value = null;

        return getEquationLeftInlineUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAbstractDerAccess() {
        ASTNode$State state = state();
        boolean isAbstractDerAccess_value = true;

        return isAbstractDerAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = getOrder();

        return order_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1816
        if (rewriteAlias && getFIdUse().myFV().isFVariable() && (myFV().isAlias() || getFIdUse().myFV().isAlias())) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule0();
            state().duringTransformCanonical--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1864
        if (getFIdUse().myFV().isFVariable() && getFIdUse().myFV().variability().parameterOrLess()) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule1();
            state().duringTransformCanonical--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1816
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            if (myFV().isAlias()) {
                FVariable fv = (FVariable) myFV();
                FIdUseExp new_exp = fv.alias().createUseExp();
                new_exp.setOriginalVariable(this, fv);
                if (myFV().isNegated()) 
                    return new FNegExp(new_exp);
                else
                    return new_exp;
            } else {
                FQName new_name = (FQName)((FVariable)getFIdUse().myFV()).alias().getFQName().fullCopy();
                FAbstractDerExp new_exp = createEmptyNode();
                new_exp.setFIdUse(new FIdUse(new_name));
                new_exp.setOrder(order());
                new_exp.setOriginalVariable(this, getFIdUse().myFV());
                if (getFIdUse().myFV().isNegated())
                    return new FNegExp(new_exp);
                else
                    return new_exp;
            }
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1864
     * @apilevel internal
     */
    private FExp rewriteRule1() {
{
            return new FRealLitExp(0.0);
        }    }
}
