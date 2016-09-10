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
 * Sample built-in function.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1421
 * @production FSampleExp : {@link FBuiltInFunctionCall} ::= <span class="component">Offset:{@link FExp}</span> <span class="component">Interval:{@link FExp}</span>;

 */
public class FSampleExp extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1075
     */
    public FSampleExp createEmptyNode()      { return new FSampleExp();      }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:143
     */
    public void complianceCheck(ErrorCheckType checkType) {
        ONLY_FMU_FUNCTION_LIKE_OPERATOR.invoke(this, "sample");
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2546
     */
    public FSampleExp flatten(FQName prefix)    { return new FSampleExp(getOffset().flatten(prefix), getInterval().flatten(prefix)); }
    /**
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2325
     */
    public void extractSampleExpressions(Collection<FEquation> newEqns, Collection<FVariable> newVars) {
        if (!originalFExp().shouldExtract())
            return;
        if (originalFExp() == this) {
            newEqns.add(new FEquation(tempUseExp(), fullCopy()));
            newVars.add(type().createFVariable(new FPublicVisibilityType(), new FQNameFull(tempVarName()), variability().combine(fDiscrete())));
        }
        rewriteToTemp = true;
    }
    /**
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2335
     */
    private boolean rewriteToTemp = false;
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1754
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap)     { return new FSampleExp(getOffset().scalarize(indexMap), getInterval().scalarize(indexMap)); }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:347
     */
    private FSampleExp originalFSampleExp                = null;
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:358
     */
    public void setOriginalFExp(FSampleExp original)           { this.originalFSampleExp      = original; }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:382
     */
    @Override
    protected void resetOriginalReferences() {
        setOriginalFExp(this);
        super.resetOriginalReferences();
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:412
     */
    @Override
	protected void traverseSymbolic(ASTNode e) {
        setOriginalFExp(((FSampleExp)e).originalFExp());
		super.traverseSymbolic(e);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4285
     */
    @Override
    public void genTimeEvent_C(CodePrinter p, CodeStream str, String indent, String res) {
        /*
            There are three cases to consider for each sampler:
             1) The current time is (surely) before the offset of 
                the sampler. In this case, the next time event occurs
                at time offset.
             2) The current time is a sample instant of the sampler
                in which case next time event is the next sample
                instant.
             3) If neither of the above holds true, then the current
                time is in between two sample instants of the sampler.
                In this case, the next time event is the next sample
                instant.
        */
        super.genTempVars_C(p, str, indent);
        // Case 1: time is before offset 
        str.print("  if (SURELY_LT_ZERO(_t - (");
        getOffset().prettyPrint_C(str,"");
        str.print("))) {\n");
        str.format("%sjmi_min_time_event(&%s, 1, 0, ", indent, res);
        getOffset().prettyPrint_C(str,"");
        str.println(");");
        //str.print("printf(\"Hepp: %f %f\\n\",_t,nextTimeEventTmp);\n");
        str.print("  } ");   
        // Case 2: we are at a sample                                   
        str.print(" else if (ALMOST_ZERO(jmi_dremainder(jmi, _t - (");
        getOffset().prettyPrint_C(str,"");
        str.print("), ");
        getInterval().prettyPrint_C(str,"");
        str.print("))) {\n");
        // nSamp should be almost an integer - round to get it exact
        str.print("    nSamp = jmi_dround((_t - (");
        getOffset().prettyPrint_C(str,"");
        str.print(")) / (");
        getInterval().prettyPrint_C(str,"");
        str.print("));\n");
        str.format("%sjmi_min_time_event(&%s, 1, 0, ", indent, res);
        str.print("(nSamp + 1.0) * (");
        getInterval().prettyPrint_C(str,"");
        str.print(") + (");
        getOffset().prettyPrint_C(str,"");
        str.println("));");
/*----*//*
        str.print("printf(\"Hopp: %12.12f %12.12f %12.12f %12.12f\\n\",_t,nextTimeEventTmp,nSamp,");
        str.print("(_t-");
        getOffset().prettyPrint_C(str,"");
        str.print(")/(");
        getInterval().prettyPrint_C(str,"");
        str.print("));\n");

*//*---*/
        str.print("  } ");

        // Case 3: Neither of the above: in between samples
        str.print(" else if (SURELY_GT_ZERO(jmi_dremainder(jmi, _t - (");
        getOffset().prettyPrint_C(str,"");
        str.print("), ");
        getInterval().prettyPrint_C(str,"");
        str.print("))) {\n");
        // User the floor function to get the number of previous
        // samples
        str.print("    nSamp = floor((_t - (");
        getOffset().prettyPrint_C(str,"");
        str.print(")) / (");
        getInterval().prettyPrint_C(str,"");
        str.print("));\n");
        str.format("%sjmi_min_time_event(&%s, 1, 0, ", indent, res);
        str.print("(nSamp + 1.0) * (");
        getInterval().prettyPrint_C(str,"");
        str.print(") + (");
        getOffset().prettyPrint_C(str,"");
        str.println("));");
/*----*//*
        str.print("printf(\"Hopp2: %12.12f %12.12f %12.12f %12.12f\\n\",_t,nextTimeEventTmp,nSamp,");
        str.print("(_t-");
        getOffset().prettyPrint_C(str,"");
        str.print(")/(");
        getInterval().prettyPrint_C(str,"");
        str.print("));\n");

*//*---*/
        str.print("  }\n");
        super.genTempFree_C(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:250
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print("jmi_sample(jmi,");
        p.print(getOffset(),str,"");
        str.print(",");
        p.print(getInterval(),str,"");
        str.print(")");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FSampleExp() {
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
        children = new ASTNode[4];
        setChild(new List(), 3);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FSampleExp(FExp p0, FExp p1) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public FSampleExp clone() throws CloneNotSupportedException {
        FSampleExp node = (FSampleExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FSampleExp copy() {
        try {
            FSampleExp node = (FSampleExp) clone();
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
    public FSampleExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FSampleExp treeCopyNoTransform() {
        FSampleExp tree = (FSampleExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
                    tree.children[i] = null;
                    continue;
                case 3:
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
     * @declaredat ASTNode:115
     */
    public FSampleExp treeCopy() {
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
     * Replaces the Offset child.
     * @param node The new node to replace the Offset child.
     * @apilevel high-level
     */
    public void setOffset(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Offset child.
     * @return The current node used as the Offset child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Offset")
    public FExp getOffset() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Offset child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Offset child.
     * @apilevel low-level
     */
    public FExp getOffsetNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the Interval child.
     * @param node The new node to replace the Interval child.
     * @apilevel high-level
     */
    public void setInterval(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Interval child.
     * @return The current node used as the Interval child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Interval")
    public FExp getInterval() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the Interval child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Interval child.
     * @apilevel low-level
     */
    public FExp getIntervalNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 2;
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
        return 3;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(3);
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
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = CValue.UNKNOWN;

        return cevalCalc_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingType() {
        ASTNode$State state = state();
        boolean hasEventGeneratingType_value = true;

        return hasEventGeneratingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String builtInName() {
        ASTNode$State state = state();
        String builtInName_value = "sample";

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
        type_value = type_compute();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @apilevel internal
     */
    private FType type_compute() {
            for (FExp ch : childFExps())
                if (!ch.variability().parameterOrLess())
                    return fUnknownType();
            return fBooleanScalarType();
        }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = fDiscrete();

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFSampleExp() {
        ASTNode$State state = state();
        boolean isFSampleExp_value = true;

        return isFSampleExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSampleExp originalFExp() {
        ASTNode$State state = state();
        FSampleExp originalFExp_value = (originalFSampleExp == null)       ? this : originalFSampleExp;

        return originalFExp_value;
    }
    /**
     * @attribute inh
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2343
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldExtract() {
        ASTNode$State state = state();
        boolean shouldExtract_value = getParent().Define_shouldExtract(this, null);

        return shouldExtract_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2338
        if (rewriteToTemp) {
            state().duringExtractSampleExpressions++;
            ASTNode result = rewriteRule0();
            state().duringExtractSampleExpressions--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2338
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            return originalFExp().tempUseExp();
        }    }
    protected void collect_contributors_FClass_sampleExpsWithTimeEvent() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1274
     */
        if (generatesEventInDAE()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_sampleExpsWithTimeEvent_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_sampleExpsWithTimeEvent();
    }
    protected void contributeTo_FClass_FClass_sampleExpsWithTimeEvent(ArrayList<FSampleExp> collection) {
        super.contributeTo_FClass_FClass_sampleExpsWithTimeEvent(collection);
        if (generatesEventInDAE())
            collection.add(this);
    }

}
