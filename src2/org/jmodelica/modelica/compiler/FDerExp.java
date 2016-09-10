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
 * The built-in function der.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1154
 * @production FDerExp : {@link FAbstractDerExp};

 */
public class FDerExp extends FAbstractDerExp implements Cloneable {
    /**
     * Constructs an FDerExp that refers to the variable with the given FIdUse and order.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:337
     */
    public FDerExp(FIdUse name, int order) {
        this(name, (String)null, order);
    }
    /**
     * Constructs an FDerExp that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:344
     */
    public FDerExp(FQName name, int order) {
        this(new FIdUse(name), order);
    }
    /**
     * Constructs an FDerExp of order one that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:351
     */
    public FDerExp(FQName name) {
        this(new FIdUse(name), 1);
    }
    /**
     * Constructs an FDerExp of order that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:358
     */
    public FDerExp(FIdUse name) {
        this(name, 1);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1086
     */
    public FDerExp createEmptyNode()        { return new FDerExp();        }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1717
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print(name());
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2218
     */
    public void prettyPrint_MC(Printer p, CodeStream str, String indent) {
		str.print("der(");
		str.print(getFIdUse().nameUnderscore());
		str.print(")");
	}
    /**
     * @aspect DummyDerivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2999
     */
    public void enableFHDerRewrite() {
        rewriteFHDer = true;
        is$Final = false;
    }
    /**
     * @aspect DummyDerivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3004
     */
    boolean rewriteFHDer = false;
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1750
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) { return new FDerExp(getFIdUse().scalarize(indexMap), order()); }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:195
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {	
		open_XML(str, indent);
		p.print(getFIdUse(), str, p.indent(indent));
		close_XML(str, indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FDerExp() {
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
    public FDerExp(FIdUse p0, String p1, int p2) {
        setChild(p0, 0);
        setOriginalVariable(p1);
        setOrder(p2);
    }
    /**
     * @declaredat ASTNode:18
     */
    public FDerExp(FIdUse p0, Symbol p1, int p2) {
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
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:44
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:50
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:56
     */
    public FDerExp clone() throws CloneNotSupportedException {
        FDerExp node = (FDerExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public FDerExp copy() {
        try {
            FDerExp node = (FDerExp) clone();
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
     * @declaredat ASTNode:82
     */
    public FDerExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:91
     */
    public FDerExp treeCopyNoTransform() {
        FDerExp tree = (FDerExp) copy();
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
     * @declaredat ASTNode:116
     */
    public FDerExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:123
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_OriginalVariable == ((FDerExp)node).tokenString_OriginalVariable) && (tokenint_Order == ((FDerExp)node).tokenint_Order);    
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
     * Replaces the lexeme Order.
     * @param value The new value for the lexeme Order.
     * @apilevel high-level
     */
    public void setOrder(int value) {
        tokenint_Order = value;
    }
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
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = false;

        return canBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDerAccess() {
        ASTNode$State state = state();
        boolean isDerAccess_value = true;

        return isDerAccess_value;
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
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Der";

        return xmlTag_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2989
        if (myFV().isDummyDerivativeVariable()) {
            state().duringDummyDerivatives++;
            ASTNode result = rewriteRule0();
            state().duringDummyDerivatives--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3014
        if (rewriteFHDer && order() > 1) {
            state().duringDummyDerivatives++;
            ASTNode result = rewriteRule1();
            state().duringDummyDerivatives--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:972
        if (inFunction()) {
            state().duringAlgorithmDifferentiation++;
            ASTNode result = rewriteRule2();
            state().duringAlgorithmDifferentiation--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:258
        if (myFV().isDynamicDerivativeVariable()) {
            state().duringDynamicStateSelect++;
            ASTNode result = rewriteRule3();
            state().duringDynamicStateSelect--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2989
     * @apilevel internal
     */
    private FDummyDerExp rewriteRule0() {
{
            return new FDummyDerExp(getFIdUse(), getOriginalVariable(), order());
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3014
     * @apilevel internal
     */    private FDerExp rewriteRule1() {
        return new FDerExp(getFIdUse().getFQName().createDerPrefixedName(order() - 1));
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:972
     * @apilevel internal
     */    private FIdUseExp rewriteRule2() {
        return new FIdUseExp(getFIdUse().getFQName().createDerPrefixedFunctionName(order()));
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:258
     * @apilevel internal
     */
    private FDynamicDerExp rewriteRule3() {
{
            return new FDynamicDerExp(getFIdUse(), getOriginalVariable(), order());
        }    }
    protected void collect_contributors_FClass_allDifferentiatedRealVariables() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:671
     */
        if (getFIdUse().myFV().isFVariable() && !inDeadIfBranch()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_allDifferentiatedRealVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_allDifferentiatedRealVariables();
    }
    protected void collect_contributors_FClass_differentiatedRealVariablesFilteredSet() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:735
     */
        if (getFIdUse().myFV().isFVariable() && !inDeadIfBranch()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_differentiatedRealVariablesFilteredSet_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_differentiatedRealVariablesFilteredSet();
    }
    protected void collect_contributors_FAbstractEquation_derivativeVariables() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3013
     */
        if (myFV().isDerivativeVariable()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_derivativeVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_derivativeVariables();
    }
    protected void contributeTo_FClass_FClass_allDifferentiatedRealVariables(LinkedHashSet<FRealVariable> collection) {
        super.contributeTo_FClass_FClass_allDifferentiatedRealVariables(collection);
        if (getFIdUse().myFV().isFVariable() && !inDeadIfBranch())
            collection.add((FRealVariable) getFIdUse().myFV());
    }

    protected void contributeTo_FClass_FClass_differentiatedRealVariablesFilteredSet(LinkedHashSet<FRealVariable> collection) {
        super.contributeTo_FClass_FClass_differentiatedRealVariablesFilteredSet(collection);
        if (getFIdUse().myFV().isFVariable() && !inDeadIfBranch())
            collection.add((FRealVariable) getFIdUse().myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_derivativeVariables(LinkedHashSet<FDerivativeVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_derivativeVariables(collection);
        if (myFV().isDerivativeVariable())
            collection.add((FDerivativeVariable) myFV());
    }

}
