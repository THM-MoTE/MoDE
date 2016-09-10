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
 * Pre built-in function.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1174
 * @production FPreExp : {@link FIdUseExp};

 */
public class FPreExp extends FIdUseExp implements Cloneable {
    /**
     * Constructs an FPreExp that refers to the variable with the given FIdUse.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:365
     */
    public FPreExp(FIdUse name) {
        this(name, (String)null);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1090
     */
    public FPreExp createEmptyNode()        { return new FPreExp();        }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1729
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print(name());
	}
    /**
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1449
     */
    private FExp instanceTreeSource = null;
    /**
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1454
     */
    public void setInstanceTreeSource(FExp source) {
        instanceTreeSource = source;
    }
    /**
     * Surrounds the FExp <code>exp</code> with pre if it is an non literal exp, else return exp.
     * 
     * Also sets the <code>instanceTreeSource</code> field of the FPreExp (if any) 
     * to <code>source</code>.
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1468
     */
    public static FExp create(FExp exp, FExp source) {
        exp = exp.createFPreExp();
        exp.setInstanceTreeSource(source);
        return exp;
    }
    /**
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1486
     */
    public void checkDiscreteOperations() {
        if (instanceTreeSource != null && getFIdUse().myFV().isContinuous() && !inWhen() && !inInitialEquationSection()) 
            instanceTreeSource.discreteArgError();
        instanceTreeSource = null;
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:89
     */
    public void sanityCheckFIdUseConsistency(FClass fc) {
        sanityCheckFIdUseConsistencyInChildren(fc);
        // TODO: Check if past step that created pre variables?
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1319
     */
    public void gatherContinuousVariablesUsedInPre(Set<FVariable> res) {
        FAbstractVariable fv = getFIdUse().myFV();
        if (fv.isContinuous())
            res.add((FVariable) fv);
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:699
     */
    public void enableConstantFolding() {
		if (variability().parameterOrLess()) {
			constantFoldingEnabled = true;
			is$Final = false;
			return;
		}
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1751
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) { return new FPreExp(getFIdUse().scalarize(indexMap)); }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:401
     */
    public FExp diff(String name) {
        if (name.equals(name())) {
            return type().createSizedLiteral(1);
        } else {
            return diffZero();
        }   
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:241
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        FAbstractVariable fv = myFV();
        if (fv.isUnknown()) {
            fv = myNonPreFV();
        }
        str.print(fv.preName_C());
    }
    /**
     * @declaredat ASTNode:1
     */
    public FPreExp() {
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
    public FPreExp(FIdUse p0, String p1) {
        setChild(p0, 0);
        setOriginalVariable(p1);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FPreExp(FIdUse p0, Symbol p1) {
        setChild(p0, 0);
        setOriginalVariable(p1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public FPreExp clone() throws CloneNotSupportedException {
        FPreExp node = (FPreExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public FPreExp copy() {
        try {
            FPreExp node = (FPreExp) clone();
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
    public FPreExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public FPreExp treeCopyNoTransform() {
        FPreExp tree = (FPreExp) copy();
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
    public FPreExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:121
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_OriginalVariable == ((FPreExp)node).tokenString_OriginalVariable);    
    }
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
                if (variability().constantVariability())
                    return super.cevalUse(evaluator);
                FAbstractVariable decl = myFV();
                return decl == null ? CValue.UNKNOWN : evaluator.ceval(decl);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFV() {
        ASTNode$State state = state();
        FAbstractVariable myFV_value = lookupPreFV(getFIdUse().getFQName());

        return myFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myNonPreFV() {
        ASTNode$State state = state();
        FAbstractVariable myNonPreFV_value = lookupFV(getFIdUse().getFQName());

        return myNonPreFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = preName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = super.expVariability().combineDown(fDiscrete());

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp getEquationLeftInlineUse() {
        ASTNode$State state = state();
        FIdUseExp getEquationLeftInlineUse_value = null;

        return getEquationLeftInlineUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldExtractGuard() {
        ASTNode$State state = state();
        boolean shouldExtractGuard_value = true;

        return shouldExtractGuard_value;
    }
    @ASTNodeAnnotation.Attribute
    public int nbrUses(String name) {
        ASTNode$State state = state();
        int nbrUses_String_value = name.equals(name())? 1: 0;

        return nbrUses_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1772
        if (rewriteAlias) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule0();
            state().duringTransformCanonical--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:735
        if (constantFoldingEnabled) {
            state().duringConstantFolding++;
            ASTNode result = rewriteRule1();
            state().duringConstantFolding--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1772
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            if (myNonPreFV().isFVariable() && myNonPreFV().isAlias()) {
                FVariable fv = (FVariable) myNonPreFV();
                FIdUseExp new_exp = fv.alias().createFPreExp();
                new_exp.setOriginalVariable(this, fv);
                if (fv.isNegated()) 
                    return new FNegExp(new_exp);
                else
                    return new_exp;
            } else {
                rewriteAlias = false;
                return this;
            }
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:735
     * @apilevel internal
     */
    private FExp rewriteRule1() {
{
            FIdUseExp res = new FIdUseExp(getFIdUse().fullCopy());
            res.constantFoldingEnabled = true;
            return res;
		}    }
    protected void collect_contributors_FAbstractEquation_discretePreVariables() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3073
     */
        if (myFV().isPreVariable()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_discretePreVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_discretePreVariables();
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_discretePreVariables(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_discretePreVariables(collection);
        if (myFV().isPreVariable())
            collection.add((FVariable) myFV());
    }

}
