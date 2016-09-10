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
 * Partial function call expression in flat tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1289
 * @production FPartialFunctionCall : {@link FFunctionCall} ::= <span class="component">ArgName:{@link FIdUse}*</span>;

 */
public class FPartialFunctionCall extends FFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3352
     */
    @Override
    public void evaluateCell(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        evaluatePartial(values);
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1780
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
        str.print("function ");
        super.prettyPrintExp(p, str, indent);
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:670
     */
    public void enableConstantFolding() {
        for (ASTNode n : this)
            n.enableConstantFolding();
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1817
     */
    protected FFunctionCall createScalarized(FIdUse name, List<FExp> args, FType type) {
        return new FPartialFunctionCall(name, args, type, getArgNames().fullCopy()); 
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1877
     */
    @Override
    public void genTempInputs_CAD(CodePrinter p, CodeStream str, String indent) {
        if (myFCallable().isPartialFunction()) {
            p.printTempInputAssigns(str, indent, this);
            str.formatln("%sJMI_DYNAMIC_ADD(%s)", indent, tempName_var_CAD());
            str.formatln("%sJMI_DYNAMIC_ADD(%s)", indent, tempName_der_CAD());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:437
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        boolean exp = functionCallIsExp();
        FCallable fc = myFCallable();
        String previous = "NULL";
        String result   = "NULL";
        if (fc.isPartialFunction()) {
            previous = ((FFunctionVariable) fc).name_C();
        } else {
            result = "&" + tempName_C();
        }
        if (fc.isPartialFunction()) {
            str.print(previous);
            str.print("->fpcr");
        } else {
            str.print(fc.funcNameUnderscore(C_SUFFIX_FPCR));
        }
        str.print("(");
        str.print(previous);
        str.print(", ");
        str.print(result);
        
        /* Print "0" for the inputs we don't set, and "1, value" for those we do set */
        Iterator<FIdUse> it = getArgNames().iterator();
        Iterator<FFunctionVariable> it2 = fc.myInputs().iterator();
        for (FExp arg : getArgs()) {
            String name = it.next().name();
            while (!it2.next().name().equals(name)) {
                str.print(", 0");
            }
            str.print(", 1");
            
            str.print(", ");
            str.format("(%s)(", arg.type().type_C());
            arg.genArgument_C(p, str, indent);
            str.print(")");
        }
        while (it2.hasNext()) {
            str.print(", 0");
            it2.next();
        }
        
        str.print(")");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1628
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        super.genVarDecls_C(p, str, indent);
        String fp = myFCallable().actualFFunctionDecl().funcNameUnderscore(C_SUFFIX_FP);
        if (myFCallable().isPartialFunction()) {
            fp = fp + "*";
        }
        str.formatln("%s%s %s;", indent, fp, tempName_C());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2378
     */
    @Override
    public void genTempInput_C(CodePrinter p, CodeStream str, String indent) {
        if (myFCallable().isPartialFunction()) {
            p.printTempInputAssigns(str, indent, this);
            str.formatln("%sJMI_DYNAMIC_ADD(%s)", indent, tempName_C());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4049
     */
    @Override
    public void genArgument_C(CodePrinter p, CodeStream str, String indent) {
        str.print("(");
        str.print(myCorrespondingInput().type().type_C());
        str.print(")");
        if (myFCallable().isPartialFunction()) {
            str.print(tempName_C());
        } else {
            p.print(this, str, indent);
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FPartialFunctionCall() {
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
        setChild(new List(), 1);
        setChild(new List(), 3);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FPartialFunctionCall(FIdUse p0, List<FExp> p1, FType p2, List<FIdUse> p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 4;
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
        type_reset();
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
    public FPartialFunctionCall clone() throws CloneNotSupportedException {
        FPartialFunctionCall node = (FPartialFunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FPartialFunctionCall copy() {
        try {
            FPartialFunctionCall node = (FPartialFunctionCall) clone();
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
    public FPartialFunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public FPartialFunctionCall treeCopyNoTransform() {
        FPartialFunctionCall tree = (FPartialFunctionCall) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 4:
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
    public FPartialFunctionCall treeCopy() {
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
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public FIdUse getName() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public FIdUse getNameNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<FExp> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Arg list.
     * @return Number of children in the Arg list.
     * @apilevel high-level
     */
    public int getNumArg() {
        return getArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Arg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Arg list.
     * @apilevel low-level
     */
    public int getNumArgNoTransform() {
        return getArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Arg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Arg list.
     * @apilevel high-level
     */
    public FExp getArg(int i) {
        return (FExp) getArgList().getChild(i);
    }
    /**
     * Check whether the Arg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasArg() {
        return getArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the Arg list.
     * @param node The element to append to the Arg list.
     * @apilevel high-level
     */
    public void addArg(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(FExp node) {
        List<FExp> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(FExp node, int i) {
        List<FExp> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<FExp> getArgList() {
        List<FExp> list = (List<FExp>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgListNoTransform() {
        return (List<FExp>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<FExp> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgsNoTransform() {
        return getArgListNoTransform();
    }
    /**
     * Replaces the FType child.
     * @param node The new node to replace the FType child.
     * @apilevel high-level
     */
    public void setFType(FType node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the FType child.
     * @return The current node used as the FType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FType")
    public FType getFType() {
        return (FType) getChild(2);
    }
    /**
     * Retrieves the FType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FType child.
     * @apilevel low-level
     */
    public FType getFTypeNoTransform() {
        return (FType) getChildNoTransform(2);
    }
    /**
     * Replaces the ArgName list.
     * @param list The new list node to be used as the ArgName list.
     * @apilevel high-level
     */
    public void setArgNameList(List<FIdUse> list) {
        setChild(list, 3);
    }
    /**
     * Retrieves the number of children in the ArgName list.
     * @return Number of children in the ArgName list.
     * @apilevel high-level
     */
    public int getNumArgName() {
        return getArgNameList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ArgName list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ArgName list.
     * @apilevel low-level
     */
    public int getNumArgNameNoTransform() {
        return getArgNameListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ArgName list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ArgName list.
     * @apilevel high-level
     */
    public FIdUse getArgName(int i) {
        return (FIdUse) getArgNameList().getChild(i);
    }
    /**
     * Check whether the ArgName list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasArgName() {
        return getArgNameList().getNumChild() != 0;
    }
    /**
     * Append an element to the ArgName list.
     * @param node The element to append to the ArgName list.
     * @apilevel high-level
     */
    public void addArgName(FIdUse node) {
        List<FIdUse> list = (parent == null || state == null) ? getArgNameListNoTransform() : getArgNameList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNameNoTransform(FIdUse node) {
        List<FIdUse> list = getArgNameListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ArgName list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArgName(FIdUse node, int i) {
        List<FIdUse> list = getArgNameList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ArgName list.
     * @return The node representing the ArgName list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ArgName")
    public List<FIdUse> getArgNameList() {
        List<FIdUse> list = (List<FIdUse>) getChild(3);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ArgName list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ArgName list.
     * @apilevel low-level
     */
    public List<FIdUse> getArgNameListNoTransform() {
        return (List<FIdUse>) getChildNoTransform(3);
    }
    /**
     * Retrieves the ArgName list.
     * @return The node representing the ArgName list.
     * @apilevel high-level
     */
    public List<FIdUse> getArgNames() {
        return getArgNameList();
    }
    /**
     * Retrieves the ArgName list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ArgName list.
     * @apilevel low-level
     */
    public List<FIdUse> getArgNamesNoTransform() {
        return getArgNameListNoTransform();
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(4);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 4;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunctionCall() {
        ASTNode$State state = state();
        boolean isPartialFunctionCall_value = true;

        return isPartialFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myCallInputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myCallInputs_value = filterPartialInputs(myFCallable().myInputs());

        return myCallInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myCallOutputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myCallOutputs_value = new ArrayList<FFunctionVariable>(Arrays.asList((FFunctionVariable)myCorrespondingInput()));

        return myCallOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType typeOfOutput(int i) {
        ASTNode$State state = state();
        FType typeOfOutput_int_value = getFType();

        return typeOfOutput_int_value;
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
            List<FRecordComponentType> inputs = new List<FRecordComponentType>();
            Set<String> s = new HashSet<String>();
            for (FIdUse u : getArgNames()) {
                s.add(u.name());
            }
            for (CommonVariableDecl cvd : myFCallable().myInputs()) {
                if (!s.contains(cvd.name()))
                    inputs.add(new FRecordComponentType(cvd.name(), cvd.type()));
            }
            List<FRecordComponentType> outputs = new List<FRecordComponentType>();
            for (CommonVariableDecl cvd : myFCallable().myOutputs()) {
                outputs.add(new FRecordComponentType(cvd.name(), cvd.type()));
            }
            return new FFunctionType(size(), name(), inputs, outputs, myFClass());
        }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinableFunctionCall(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean isInlinableFunctionCall_AbstractFunctionInliner_value = false;

        return isInlinableFunctionCall_AbstractFunctionInliner_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_myFFunctionDeclsPartial() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:749
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myFFunctionDeclsPartial_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_myFFunctionDeclsPartial();
    }
    protected void collect_contributors_FClass_myFFunctionDeclsPartialCalled() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:758
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myFFunctionDeclsPartialCalled_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_myFFunctionDeclsPartialCalled();
    }
    protected void contributeTo_FClass_FClass_myFFunctionDeclsPartial(LinkedHashSet<FFunctionDecl> collection) {
        super.contributeTo_FClass_FClass_myFFunctionDeclsPartial(collection);
        collection.add(myFCallable().actualFFunctionDecl());
    }

    protected void contributeTo_FClass_FClass_myFFunctionDeclsPartialCalled(LinkedHashSet<FFunctionDecl> collection) {
        super.contributeTo_FClass_FClass_myFFunctionDeclsPartialCalled(collection);
        collection.add(myFCallable().actualFFunctionDecl());
    }

}
