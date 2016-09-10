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
 * Base class for relational expressions.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:961
 * @production FRelExp : {@link FBoolBinExp} ::= <span class="component">[Indicator:{@link FIdUseExp}]</span>;

 */
public abstract class FRelExp extends FBoolBinExp implements Cloneable {
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:69
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        if (!inFunction() && generatesEvent() && inWhile())
            UNSUPPORTED_EVENT_GENERATING_EXPRESSION_IN_WHILE_STATEMENT.invoke(this);
    }
    /**
     * Creates an indicator for this FRelExp
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1106
     */
    public void genIndicator() {
		FVariable v = new FRealVariable(new FPublicVisibilityType(), fContinuous(), new FQNameFull(calcIndicatorVarName()));
		myFClass().addFVariable(v);
		setIndicator(v.createUseExp());
	}
    /**
     * @aspect EliminateEqualSwitches
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3790
     */
    public void collectEqualSwitches(Map<String, Collection<FRelExp>> candidates) {
        String key = toString();
        Collection<FRelExp> list = candidates.get(key);
        if (list == null) {
            list = new ArrayList<FRelExp>();
            candidates.put(key, list);
        }
        list.add(this);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:346
     */
    private FRelExp originalFRelExp                         = null;
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:357
     */
    public void setOriginalFExp(FRelExp original)                 { this.originalFRelExp         = original; }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:376
     */
    @Override
    protected void resetOriginalReferences() {
        setOriginalFExp(this);
        super.resetOriginalReferences();
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:406
     */
    @Override
	protected void traverseSymbolic(ASTNode e) {
        setOriginalFExp(((FRelExp)e).originalFExp());
		super.traverseSymbolic(e);
	}
    /**
     * Prints the position for the switch in the z-vector
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2614
     */
    public void genBlockResidualFunction_printSwitchIndex_C(CodePrinter p, CodeStream str, String nextIndent, Enumerator enumerator) {
        if (originalFExp().generatesEventInDAE()) {
            str.format("%sx[%d] = jmi->offs_sw + %d;\n", nextIndent, enumerator.next(), mySwitchIndex());
        } else {
            str.format("%sx[%d] = jmi->offs_sw_init + %d;\n", nextIndent, enumerator.next(), relExpInInitialEquationsIndex());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4065
     */
    @Override
    public void genEventResidualVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        printIndicator(p.DeclStep, str, indent, true);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4089
     */
    @Override
    public void genEventResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator) {
        printIndicator(p.PreStep, str, indent, true);
		str.print(indent + "(*res)[" + enumerator.next() + "] = ");
        printIndicator(p.ExecStep, str, indent, true);
		str.print(";\n");
        printIndicator(p.PostStep, str, indent, true);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4151
     */
    private void printIndicator(CodePrinter.StepPrinter sp, CodeStream str, String indent, boolean guard) {
        boolean hb = hasBrancher();
        if (guard && hb) {
            sp.print(str, FEqExp.macro_C);
            sp.print(str, "(");
            printIndicatorGuard(sp, str, indent, this);
            sp.print(str, ", JMI_TRUE, ");
        }
        
        if (scale()) {
            sp.print(str, "(");
        }
        
        if (hasIndicator()) {
            sp.print(getIndicator(), str, indent);
        } else {
            sp.print(getLeft(), str, indent);
            sp.print(str, " - (");
            sp.print(getRight(), str, indent);
            sp.print(str, ")");
        }
        
        if (scale()) {
            sp.print(str, ") / ");
            sp.print(getIndicatorNominal(), str, indent);
        }
        
        if (guard && hb) {
            sp.print(str, ", " + FLitExp.macro_C + "(1))");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4256
     */
    @Override
    public void genTimeEventVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        printIndicator(p.DeclStep, str, indent, true);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4265
     */
    @Override
    public void genTimeEvent_C(CodePrinter p, CodeStream str, String indent, String res) {
        printIndicator(p.PreStep, str, indent, true);
        boolean phased = isPhased();
        str.format("%sif (SURELY_LT_ZERO(", indent);
        printIndicator(p.ExecStep, str, indent, true);
        str.print(")");
        if (phased) {
            str.print(" || (!jmi->eventPhase && ALMOST_ZERO(");
            printIndicator(p.ExecStep, str, indent, true);
            str.print("))");
        }
        str.println(") {");
        
        str.format("%sjmi_min_time_event(&%s, 1, %s, ", p.indent(indent), res, phased ? "1" : "0");
        p.print(solutionForTime(), str, indent);
        str.formatln(");\n%s}", indent);
        printIndicator(p.PostStep, str, indent, true);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4412
     */
    @Override
    public void genRelExpKind(CodeStream str) {
    	str.print(kindString());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4417
     */
    public void genRelExpKindPhased(CodeStream str) {
        str.print(kindStringPhased());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4421
     */
    public static String LT_C  = "JMI_REL_LT";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4422
     */
    public static String LEQ_C = "JMI_REL_LEQ";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4423
     */
    public static String GT_C  = "JMI_REL_GT";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4424
     */
    public static String GEQ_C = "JMI_REL_GEQ";
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1105
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (myOptions().getBooleanOption("generate_dae") || !generatesEvent(p.inInitialSystem())) {
            super.genVarDecls_C(p, str, indent);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1112
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String outerIndent) {
        if (myOptions().getBooleanOption("generate_dae") || !generatesEvent(p.inInitialSystem())) {
            super.genTempVars_C(p, str, outerIndent);
        } else if (p.writeSwitches()) {
            str.format("%sif (", outerIndent);
            if (p.inBlock())
                str.print("evaluation_mode & JMI_BLOCK_EVALUATE_NON_REALS");
            else
                str.print("jmi->atInitial || jmi->atEvent");
            str.println(") {");
            
            String indent = p.indent(outerIndent);
            printIndicator(p.DeclStep, str, indent, false);
            printIndicator(p.PreStep, str, indent, false);
            str.print(indent);
            printSwitchMacro_C(p, str, indent);
            boolean time = isTimeEventGenerating();
            if (time) {
                str.print(" = jmi_turn_switch_time(");
            } else {
                str.print(" = jmi_turn_switch(");
            }
            str.print("jmi");
            str.print(", ");
            printIndicator(p.ExecStep, str, indent, false);
            str.print(", ");
            printSwitchMacro_C(p, str, indent);
            str.print(", ");
            boolean phased = isPhased();
            if (phased) {
                str.print("jmi->eventPhase ? (");
                genRelExpKindPhased(str);
                str.print(") : (");
            }
            genRelExpKind(str);
            if (phased) {
                str.print(")");
            }
            
            str.formatln(");");
            printIndicator(p.PostStep, str, indent, false);
            str.formatln("%s}", outerIndent);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1158
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        if (cevalType().isString()) {
            str.print("strcmp(");
            p.print(getLeft(), str, indent);
            str.print(", ");
            p.print(getRight(), str, indent);
            str.print(")");
            str.print(op_C());
            str.print("0");
        } else if (!generatesEvent(p.inInitialSystem())) {
            str.print(macro_C()+"(");
            p.print(getLeft(), str, indent);
            str.print(", ");
            p.print(getRight(), str, indent);
            str.print(relIsInverted_C() ? ", JMI_FALSE, JMI_TRUE)" : ", JMI_TRUE, JMI_FALSE)");
        } else {
            printSwitchMacro_C(p, str, indent);
        }
    }
    /**
     * Helper, prints the appropiate jmi switch macro
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1207
     */
    private void printSwitchMacro_C(CodePrinter p, CodeStream str, String indent) {
        if (originalFExp().generatesEventInDAE()) {
            str.format("_sw(%d)", mySwitchIndex());
        } else {
            str.format("_sw_init(%d)", relExpInInitialEquationsIndex());
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FRelExp() {
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
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FRelExp(FExp p0, FExp p1) {
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
        mySwitchIndex_reset();
        myEventIndicatorIndex_reset();
        type_reset();
        getIndicatorOpt_reset();
        getIndicatorNominal_reset();
        scale_reset();
        hasBrancher_reset();
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
    public FRelExp clone() throws CloneNotSupportedException {
        FRelExp node = (FRelExp) super.clone();
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
    public abstract FRelExp fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:76
     */
    public abstract FRelExp treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:84
     */
    public abstract FRelExp treeCopy();
    /**
     * Replaces the Left child.
     * @param node The new node to replace the Left child.
     * @apilevel high-level
     */
    public void setLeft(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Left child.
     * @return The current node used as the Left child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Left")
    public FExp getLeft() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Left child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Left child.
     * @apilevel low-level
     */
    public FExp getLeftNoTransform() {
        return (FExp) getChildNoTransform(0);
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
     * Replaces the (optional) Indicator child.
     * @param node The new node to be used as the Indicator child.
     * @apilevel high-level
     */
    public void setIndicator(FIdUseExp node) {
        getIndicatorOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Indicator child exists.
     * @return {@code true} if the optional Indicator child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasIndicator() {
        return getIndicatorOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Indicator child.
     * @return The Indicator child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FIdUseExp getIndicator() {
        return (FIdUseExp) getIndicatorOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child Indicator. This is the <code>Opt</code> node containing the child Indicator, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Indicator.
     * @apilevel low-level
     */
    public Opt<FIdUseExp> getIndicatorOptNoTransform() {
        return (Opt<FIdUseExp>) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child Indicator.
     * @return The the child position of the optional child Indicator.
     * @apilevel low-level
     */
    protected int getIndicatorOptChildPosition() {
        return 3;
    }
    @ASTNodeAnnotation.Attribute
    public FType cevalType() {
        ASTNode$State state = state();
        FType cevalType_value = getLeft().type().typePromotion(getRight().type());

        return cevalType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTimeEventGenerating() {
        ASTNode$State state = state();
        boolean isTimeEventGenerating_value = myOptions().getBooleanOption("relational_time_events") && solutionForTime().isValidExp();

        return isTimeEventGenerating_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean mySwitchIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int mySwitchIndex_value;
    /**
     * @apilevel internal
     */
    private void mySwitchIndex_reset() {
        mySwitchIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int mySwitchIndex() {
        if(mySwitchIndex_computed) {
            return mySwitchIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        mySwitchIndex_value = isTimeEventGenerating() ?
                    checkIndex(myFClass().switchExps().indexOf(originalFExp())) + myFClass().delayExpsWithStateEvent().size() :
                    myEventIndicatorIndex();
        if (isFinal && num == state().boundariesCrossed) {
            mySwitchIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

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
        myEventIndicatorIndex_value = checkIndex(myFClass().stateEventExps().indexOf(originalFExp()));
        if (isFinal && num == state().boundariesCrossed) {
            myEventIndicatorIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myEventIndicatorIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingType() {
        ASTNode$State state = state();
        boolean hasEventGeneratingType_value = isRealComparison();

        return hasEventGeneratingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEventInInitDAE() {
        ASTNode$State state = state();
        boolean generatesEventInInitDAE_value = generatesEventInInitDAE(originalFExp());

        return generatesEventInInitDAE_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEventInInitDAE(FExp orig) {
        ASTNode$State state = state();
        boolean generatesEventInInitDAE_FExp_value = (inInitialEquationSection() || (inEquationSection() && variability().initialParameterVariability()))
                    && orig==this && generatesEvent(true);

        return generatesEventInInitDAE_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int relExpInInitialEquationsIndex() {
        ASTNode$State state = state();
        int relExpInInitialEquationsIndex_value = checkIndex(myFClass().relExpInInitialEquations().indexOf(originalFExp()));

        return relExpInInitialEquationsIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public String calcIndicatorVarName() {
        ASTNode$State state = state();
        String calcIndicatorVarName_value = calcGeneratedVarName(FlatVariableMap.GeneratedVarType.INDICATOR);

        return calcIndicatorVarName_value;
    }
    @ASTNodeAnnotation.Attribute
    public int precedence() {
        ASTNode$State state = state();
        int precedence_value = PRECEDENCE_RELATIONAL;

        return precedence_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRealComparison() {
        ASTNode$State state = state();
        boolean isRealComparison_value = getRight().type().numericPromotion(getLeft().type()).isReal();

        return isRealComparison_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIntegerComparison() {
        ASTNode$State state = state();
        boolean isIntegerComparison_value = getRight().type().numericPromotion(getLeft().type()).isInteger();

        return isIntegerComparison_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBooleanComparison() {
        ASTNode$State state = state();
        boolean isBooleanComparison_value = getRight().type().numericPromotion(getLeft().type()).isBoolean();

        return isBooleanComparison_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStringComparison() {
        ASTNode$State state = state();
        boolean isStringComparison_value = getRight().type().numericPromotion(getLeft().type()).isString();

        return isStringComparison_value;
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
            if (shouldUseOverloadedOperator()) 
                return getLeft().type().matchOverloadedOperatorType(getRight().type(), operatorName());
            FType left = getLeft().type();
            if (left.equivalentTo(getRight().type()) && left.isScalar())
                return fBooleanScalarType();
            else
                return fUnknownType();
        }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = inNoEventExp() ? super.expVariability() : super.expVariability().combineDown(fDiscrete());

        return expVariability_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getIndicatorOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt<FIdUseExp> getIndicatorOpt_value;
    /**
     * @apilevel internal
     */
    private void getIndicatorOpt_reset() {
        getIndicatorOpt_computed = false;
        getIndicatorOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt<FIdUseExp> getIndicatorOpt() {
        if(getIndicatorOpt_computed) {
            return (Opt<FIdUseExp>) getChild(getIndicatorOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getIndicatorOpt_value = new Opt<FIdUseExp>();
        setChild(getIndicatorOpt_value, getIndicatorOptChildPosition());
        if (true) {
            getIndicatorOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt<FIdUseExp> node = (Opt<FIdUseExp>) this.getChild(getIndicatorOptChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public FStatement indicatorInitStmt() {
        ASTNode$State state = state();
        FStatement indicatorInitStmt_value = new FAssignStmt(getIndicator().fullCopy(), new FIntegerLitExp(1));

        return indicatorInitStmt_value;
    }
    @ASTNodeAnnotation.Attribute
    public FStatement indicatorStmt() {
        ASTNode$State state = state();
        FStatement indicatorStmt_value = new FAssignStmt(getIndicator().fullCopy(), indicatorExp());

        return indicatorStmt_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1122
     */
    @ASTNodeAnnotation.Attribute
    public FExp indicatorExp() {
        ASTNode$State state = state();
        try {
                FExp res = new FSubExp(getLeft(), getRight());
                if (myOptions().getBooleanOption("event_indicator_scaling")) {
                    res = new FDivExp(res, nominal());
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean eventGenerating() {
        ASTNode$State state = state();
        boolean eventGenerating_value = getLeft().isContinuousExp() || getRight().isContinuousExp();

        return eventGenerating_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:336
     */
    @ASTNodeAnnotation.Attribute
    public FExp solutionForTime() {
        ASTNode$State state = state();
        try {
                if (getLeft() instanceof FTimeExp && getRight().variability().discreteOrLess()) {
                    return getRight();
                } else if (getRight() instanceof FTimeExp && getLeft().variability().discreteOrLess()) {
                    return getLeft();
                }
                return new FNoExp();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FRelExp originalFExp() {
        ASTNode$State state = state();
        FRelExp originalFExp_value = (originalFRelExp == null)          ? this : originalFRelExp;

        return originalFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildADStatements_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildADStatements_CAD_value = !generatesEvent();

        return autoGenChildADStatements_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getIndicatorNominal_computed = false;
    /**
     * @apilevel internal
     */
    protected FExp getIndicatorNominal_value;
    /**
     * @apilevel internal
     */
    private void getIndicatorNominal_reset() {
        getIndicatorNominal_computed = false;
        getIndicatorNominal_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getIndicatorNominal() {
        if(getIndicatorNominal_computed) {
            return getIndicatorNominal_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getIndicatorNominal_value = FExp.nominalMax(getLeft(), getRight());
        getIndicatorNominal_value.setParent(this);
        getIndicatorNominal_value.is$Final = true;
        if (true) {
            getIndicatorNominal_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getIndicatorNominal_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean scale_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean scale_value;
    /**
     * @apilevel internal
     */
    private void scale_reset() {
        scale_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean scale() {
        if(scale_computed) {
            return scale_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        scale_value = myOptions().getBooleanOption("event_indicator_scaling");
        if (isFinal && num == state().boundariesCrossed) {
            scale_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return scale_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventIndicator() {
        ASTNode$State state = state();
        boolean hasEventIndicator_value = originalFExp() == this && generatesEvent() || super.hasEventIndicator();

        return hasEventIndicator_value;
    }
    @ASTNodeAnnotation.Attribute
    public String kindString() {
        ASTNode$State state = state();
        String kindString_value = "-1";

        return kindString_value;
    }
    @ASTNodeAnnotation.Attribute
    public String kindStringPhased() {
        ASTNode$State state = state();
        String kindStringPhased_value = kindString();

        return kindStringPhased_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean relIsInverted_C() {
        ASTNode$State state = state();
        boolean relIsInverted_C_value = false;

        return relIsInverted_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String op_C() {
        ASTNode$State state = state();
        String op_C_value = op();

        return op_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPhased() {
        ASTNode$State state = state();
        boolean isPhased_value = isTimeEventGenerating() && isPhased_sub();

        return isPhased_value;
    }
    /**
     * Helper, subcall for isPhased()
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1230
     */
    @ASTNodeAnnotation.Attribute
    public boolean isPhased_sub() {
        ASTNode$State state = state();
        try { throw new UnsupportedOperationException(); }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:85
     */
    @ASTNodeAnnotation.Attribute
    public boolean inWhile() {
        ASTNode$State state = state();
        boolean inWhile_value = getParent().Define_inWhile(this, null);

        return inWhile_value;
    }
    /**
     * @attribute inh
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1089
     */
    @ASTNodeAnnotation.Attribute
    public boolean needsIndicatorInit() {
        ASTNode$State state = state();
        boolean needsIndicatorInit_value = getParent().Define_needsIndicatorInit(this, null);

        return needsIndicatorInit_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4141
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasBrancher() {
        if(hasBrancher_computed) {
            return hasBrancher_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        hasBrancher_value = getParent().Define_hasBrancher(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            hasBrancher_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return hasBrancher_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean hasBrancher_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean hasBrancher_value;
    /**
     * @apilevel internal
     */
    private void hasBrancher_reset() {
        hasBrancher_computed = false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_relExpsWithEvent() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1393
     */
        if (generatesEventInDAE()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_relExpsWithEvent_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_relExpsWithEvent();
    }
    protected void collect_contributors_FAbstractEquation_relExpInEquation() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1418
     */
        if (generatesEventInDAE(this)) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_relExpInEquation_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_relExpInEquation();
    }
    protected void collect_contributors_FStatement_relExpInStmt() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1423
     */
        if (generatesEventInDAE()) {
            {
                FStatement ref = (FStatement) (myFStatement());
                if (ref != null) {
                    ref.FStatement_relExpInStmt_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FStatement_relExpInStmt();
    }
    protected void collect_contributors_FClass_relExpInInitialEquations() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1470
     */
        if (generatesEventInInitDAE()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_relExpInInitialEquations_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_relExpInInitialEquations();
    }
    protected void collect_contributors_FAbstractEquation_relExpInInitialEquation() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1475
     */
        if (generatesEventInInitDAE(this)) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_relExpInInitialEquation_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_relExpInInitialEquation();
    }
    protected void contributeTo_FClass_FClass_relExpsWithEvent(ArrayList<FRelExp> collection) {
        super.contributeTo_FClass_FClass_relExpsWithEvent(collection);
        if (generatesEventInDAE())
            collection.add(this);
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_relExpInEquation(ArrayList<FRelExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_relExpInEquation(collection);
        if (generatesEventInDAE(this))
            collection.add(this);
    }

    protected void contributeTo_FStatement_FStatement_relExpInStmt(ArrayList<FRelExp> collection) {
        super.contributeTo_FStatement_FStatement_relExpInStmt(collection);
        if (generatesEventInDAE())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_relExpInInitialEquations(ArrayList<FRelExp> collection) {
        super.contributeTo_FClass_FClass_relExpInInitialEquations(collection);
        if (generatesEventInInitDAE())
            collection.add(this);
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_relExpInInitialEquation(ArrayList<FRelExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_relExpInInitialEquation(collection);
        if (generatesEventInInitDAE(this))
            collection.add(this);
    }

}
