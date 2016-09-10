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
 * The delay() operator.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1411
 * @production FDelayExp : {@link FBuiltInFunctionCall} ::= <span class="component">{@link FExp}</span> <span class="component">Delay:{@link FExp}</span> <span class="component">[Max:{@link FExp}]</span>;

 */
public class FDelayExp extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1073
     */
    public FDelayExp createEmptyNode()       { return new FDelayExp();       }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:190
     */
    public void complianceCheck(ErrorCheckType checkType) {
        ONLY_FMU_FUNCTION_LIKE_OPERATOR.invoke(this, "delay");
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1036
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (!(hasMax() ? getMax() : getDelay()).variability().parameterOrLess())
            error("Calling function delay(): last argument supplied must be of parameter variability");
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2532
     */
    public FDelayExp flatten(FQName prefix)        { return new FDelayExp(getFExp().flatten(prefix), getDelay().flatten(prefix), hasMax() ? new Opt(getMax().flatten(prefix)) : new Opt()); }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1830
     */
    public FDelayExp scalarizeExp(Map<String,FExp> indexMap) {
        Opt max = hasMax() ? new Opt(getMax().scalarize(indexMap)) : new Opt();
        return new FDelayExp(getFExp().scalarize(indexMap), getDelay().scalarize(indexMap), max);
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:458
     */
    public FExp diff(String name) {
        Opt max = hasMax() ? new Opt(getMax().copySymbolic()) : new Opt();
        FExp res = new FDelayExp(getFExp().diff(name), getDelay().copySymbolic(), max);
        if (getDelay().isContinuousExp()) {
            res = new FMulExp(getDelay().diff(name), res);
        }
        return res;
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:348
     */
    private FDelayExp originalFDelayExp                   = null;
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:359
     */
    public void setOriginalFExp(FDelayExp original)             { this.originalFDelayExp       = original; }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:388
     */
    @Override
    protected void resetOriginalReferences() {
        setOriginalFExp(this);
        super.resetOriginalReferences();
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:418
     */
    @Override
    protected void traverseSymbolic(ASTNode e) {
        setOriginalFExp(((FDelayExp)e).originalFExp());
        super.traverseSymbolic(e);
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:652
     */
    public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
        getFExp().prettyPrint_CAD(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4070
     */
    @Override
    public void genEventResidualVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (!p.inInitialSystem()) {
            p.printVarDecls(getDelay(), str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4098
     */
    @Override
    public void genEventResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator) {
        if (p.inInitialSystem()) {
            str.formatln("%s(*res)[%d] = JMI_DELAY_INITIAL_EVENT_RES;", indent, enumerator.next());
            str.formatln("%s(*res)[%d] = JMI_DELAY_INITIAL_EVENT_RES;", indent, enumerator.next());
        } else {
            p.printPreSteps(getDelay(), str, indent);
            int index = myDelayIndex();
            str.format("%sjmi_delay_first_event_indicator(jmi, %d, ", indent, index);
            p.print(getDelay(), str, indent);
            str.print(", &(*res)[" + enumerator.next() + "]);\n");
            str.format("%sjmi_delay_second_event_indicator(jmi, %d, ", indent, index);
            p.print(getDelay(), str, indent);
            str.print(", &(*res)[" + enumerator.next() + "]);\n");
            p.printPostSteps(getDelay(), str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4400
     */
    @Override
    public void genRelExpKind(CodeStream str) {
        str.print(FRelExp.GEQ_C);
        str.print(", ");
        str.print(FRelExp.GEQ_C);
    }
    /**
     * Generate temp declarations for the initialization of delay blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1243
     */
    public void genInitVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getFExp(), str, indent);
        p.printVarDecls(myMaxDelayExp(), str, indent);
    }
    /**
     * Generate the initialization of delay blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1251
     */
    public void genInit_C(CodePrinter p, CodeStream str, String indent) {
        FExp maxDelayExp = myMaxDelayExp();
        p.printPreSteps(getFExp(), str, indent);
        p.printPreSteps(maxDelayExp, str, indent);
        
        str.format("%sjmi_delay_init(jmi, %d, ", indent, myDelayIndex());
        str.print(!isTimeEventGenerating() ? "JMI_FALSE" : "JMI_TRUE"); // jmi_boolean fixed
        str.print(", "); 
        str.print(generatesEventInDAE() ? "JMI_FALSE" : "JMI_TRUE"); // jmi_boolean no_event
        str.print(", "); 
        p.print(maxDelayExp, str, indent); // jmi_real_t max_delay
        str.print(", "); 
        p.print(getFExp(), str, indent); // jmi_real_t y0
        str.println(");");
        
        p.printPostSteps(getFExp(), str, indent);
        p.printPostSteps(maxDelayExp, str, indent);
    }
    /**
     * Generate temp declarations for the sampling of delay blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1274
     */
    public void genSampleVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getFExp(), str, indent);
    }
    /**
     * Generate the sampling of delay blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1281
     */
    public void genSample_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(getFExp(), str, indent);
        str.format("%sjmi_delay_record_sample(jmi, %d, ", indent, myDelayIndex());
        p.print(getFExp(), str, indent);
        str.println(");");
        p.printPostSteps(getFExp(), str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1289
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.format("jmi_delay_evaluate(jmi, %d, ", myDelayIndex());
        p.print(getFExp(), str, indent);
        str.print(", ");
        p.print(getDelay(), str, indent);
        str.print(")");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FDelayExp() {
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
        children = new ASTNode[5];
        setChild(new Opt(), 2);
        setChild(new List(), 4);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FDelayExp(FExp p0, FExp p1, Opt<FExp> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        myDelayIndex_reset();
        myEventIndicatorIndex_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:47
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:53
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FDelayExp clone() throws CloneNotSupportedException {
        FDelayExp node = (FDelayExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:66
     */
    public FDelayExp copy() {
        try {
            FDelayExp node = (FDelayExp) clone();
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
     * @declaredat ASTNode:85
     */
    public FDelayExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:94
     */
    public FDelayExp treeCopyNoTransform() {
        FDelayExp tree = (FDelayExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 3:
                    tree.children[i] = null;
                    continue;
                case 4:
                    tree.children[i] = new List();
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
     * @declaredat ASTNode:122
     */
    public FDelayExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:129
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
     * Replaces the Delay child.
     * @param node The new node to replace the Delay child.
     * @apilevel high-level
     */
    public void setDelay(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Delay child.
     * @return The current node used as the Delay child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Delay")
    public FExp getDelay() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the Delay child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Delay child.
     * @apilevel low-level
     */
    public FExp getDelayNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Max child. This is the <code>Opt</code>
     * node containing the child Max, not the actual child!
     * @param opt The new node to be used as the optional node for the Max child.
     * @apilevel low-level
     */
    public void setMaxOpt(Opt<FExp> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Max child.
     * @param node The new node to be used as the Max child.
     * @apilevel high-level
     */
    public void setMax(FExp node) {
        getMaxOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Max child exists.
     * @return {@code true} if the optional Max child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasMax() {
        return getMaxOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Max child.
     * @return The Max child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getMax() {
        return (FExp) getMaxOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Max child. This is the <code>Opt</code> node containing the child Max, not the actual child!
     * @return The optional node for child the Max child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Max")
    public Opt<FExp> getMaxOpt() {
        return (Opt<FExp>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Max. This is the <code>Opt</code> node containing the child Max, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Max.
     * @apilevel low-level
     */
    public Opt<FExp> getMaxOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(2);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 3;
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * @return Number of children in the OriginalArg list.
     * @apilevel high-level
     */
    public int getNumOriginalArg() {
        return getOriginalArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the OriginalArg list.
     * @apilevel low-level
     */
    public int getNumOriginalArgNoTransform() {
        return getOriginalArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the OriginalArg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the OriginalArg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getOriginalArg(int i) {
        return (InstFunctionArgument) getOriginalArgList().getChild(i);
    }
    /**
     * Check whether the OriginalArg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasOriginalArg() {
        return getOriginalArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the OriginalArg list.
     * @param node The element to append to the OriginalArg list.
     * @apilevel high-level
     */
    public void addOriginalArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getOriginalArgListNoTransform() : getOriginalArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addOriginalArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getOriginalArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the OriginalArg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setOriginalArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getOriginalArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the OriginalArg list.
     * @return The the child position of the OriginalArg list.
     * @apilevel low-level
     */
    protected int getOriginalArgListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(4);
    }
    /**
     * Retrieves the OriginalArg list.
     * @return The node representing the OriginalArg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getOriginalArgs() {
        return getOriginalArgList();
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgsNoTransform() {
        return getOriginalArgListNoTransform();
    }
    /**
     * @apilevel internal
     */
    protected boolean ndims_computed = false;
    /**
     * @apilevel internal
     */
    protected int ndims_value;
    /**
     * @apilevel internal
     */
    private void ndims_reset() {
        ndims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        if(ndims_computed) {
            return ndims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ndims_value = vectorizedNdims();
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

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
        size_value = vectorizedSize();
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
    protected boolean getArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array getArray_value;
    /**
     * @apilevel internal
     */
    private void getArray_reset() {
        getArray_computed = false;
        getArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array getArray() {
        if(getArray_computed) {
            return (Array) getChild(getArrayChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getArray_value = getArray_compute();
        setChild(getArray_value, getArrayChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Array node = (Array) this.getChild(getArrayChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private Array getArray_compute() {
            if (!isArray()) {
                return super.getArray();
            }
            Array arr = new Array(indices());
            for (Index i : arr.indices()) {
                arr.set(i, new FDelayExp(getFExp().getArray().get(i), getDelay().getArray().get(i), 
                        hasMax() ? new Opt(getMax().getArray().get(i)) : new Opt()));
            }
            return arr;
        }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = getFExp().ceval(evaluator);

        return cevalCalc_VariableEvaluator_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myDelayIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int myDelayIndex_value;
    /**
     * @apilevel internal
     */
    private void myDelayIndex_reset() {
        myDelayIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int myDelayIndex() {
        if(myDelayIndex_computed) {
            return myDelayIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myDelayIndex_value = myFClass().myDelayExps().indexOf(originalFExp());
        if (isFinal && num == state().boundariesCrossed) {
            myDelayIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myDelayIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTimeEventGenerating() {
        ASTNode$State state = state();
        boolean isTimeEventGenerating_value = getDelay().variability().parameterOrLess();

        return isTimeEventGenerating_value;
    }
    @ASTNodeAnnotation.Attribute
    public int mySwitchIndex() {
        ASTNode$State state = state();
        int mySwitchIndex_value = myEventIndicatorIndex();

        return mySwitchIndex_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myEventIndicatorIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int myEventIndicatorIndex_value;
    /**
     * @apilevel internal
     */
    private void myEventIndicatorIndex_reset() {
        myEventIndicatorIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int myEventIndicatorIndex() {
        if(myEventIndicatorIndex_computed) {
            return myEventIndicatorIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myEventIndicatorIndex_value = myFClass().relExpsWithStateEvent().size() + myDelayEventIndicatorIndex();
        if (isFinal && num == state().boundariesCrossed) {
            myEventIndicatorIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myEventIndicatorIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int myDelayEventIndicatorIndex() {
        ASTNode$State state = state();
        int myDelayEventIndicatorIndex_value = 2*checkIndex(myFClass().delayExpsWithStateEvent().indexOf(originalFExp()));

        return myDelayEventIndicatorIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingType() {
        ASTNode$State state = state();
        boolean hasEventGeneratingType_value = true;

        return hasEventGeneratingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = getFExp().nominal();

        return nominal_value;
    }
    @ASTNodeAnnotation.Attribute
    public String builtInName() {
        ASTNode$State state = state();
        String builtInName_value = "delay";

        return builtInName_value;
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
        type_value = getFExp().type();
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
        FTypePrefixVariability expVariability_value = getFExp().variability();

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FDelayExp originalFExp() {
        ASTNode$State state = state();
        FDelayExp originalFExp_value = (originalFDelayExp == null)        ? this : originalFDelayExp;

        return originalFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp myMaxDelayExp() {
        ASTNode$State state = state();
        FExp myMaxDelayExp_value = hasMax() ? getMax() : getDelay();

        return myMaxDelayExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1942
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInitial() {
        ASTNode$State state = state();
        boolean isInitial_value = getParent().Define_isInitial(this, null);

        return isInitial_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:463
     * @apilevel internal
     */
    public Size Define_vectorizedSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return vectorizedSize();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:892
     * @apilevel internal
     */
    public boolean Define_inVectorizedCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isArray();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1750
        if (isInitial()) {
            state().duringFlatAPI++;
            ASTNode result = rewriteRule0();
            state().duringFlatAPI--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1750
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            return getFExp().copySymbolic();
        }    }
    protected void collect_contributors_FClass_myDelayExps() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:762
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myDelayExps_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_myDelayExps();
    }
    protected void collect_contributors_FClass_delayExpsWithStateEvent() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1286
     */
        if (generatesEventInDAE() && !isTimeEventGenerating()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_delayExpsWithStateEvent_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_delayExpsWithStateEvent();
    }
    protected void collect_contributors_FAbstractEquation_delayExpInEquation() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1428
     */
        if (generatesEventInDAE()) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_delayExpInEquation_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_delayExpInEquation();
    }
    protected void collect_contributors_FAbstractEquation_replacedAtInitialExps() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1683
     */
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_replacedAtInitialExps_contributors().add(this);
                }
            }
        super.collect_contributors_FAbstractEquation_replacedAtInitialExps();
    }
    protected void contributeTo_FClass_FClass_myDelayExps(ArrayList<FDelayExp> collection) {
        super.contributeTo_FClass_FClass_myDelayExps(collection);
        collection.add(this);
    }

    protected void contributeTo_FClass_FClass_delayExpsWithStateEvent(ArrayList<FDelayExp> collection) {
        super.contributeTo_FClass_FClass_delayExpsWithStateEvent(collection);
        if (generatesEventInDAE() && !isTimeEventGenerating())
            collection.add(this);
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_delayExpInEquation(ArrayList<FDelayExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_delayExpInEquation(collection);
        if (generatesEventInDAE())
            collection.add(this);
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(ArrayList<FExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(collection);
        collection.add(this);
    }

}
