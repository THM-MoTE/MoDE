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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1134
 * @production FDSDerExp : {@link FVarRefExp} ::= <span class="component">&lt;SetId:int&gt;</span> <span class="component">&lt;Number:int&gt;</span> <span class="component">Use:{@link FExp}*</span>;

 */
public class FDSDerExp extends FVarRefExp implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1094
     */
    public FDSDerExp createEmptyNode()      { return new FDSDerExp();      }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1757
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
        str.format("dsDer(%d, %d)", getSetId(), getNumber());
    }
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:136
     */
    @Override
    public void findFIdUseExpsInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        for (FExp exp : getUses())
            visitor.visit(exp, set);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:479
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        str.formatln("%sjmi_ad_var_t %s;", indent, tempName_C());
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:484
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        boolean first = true;
        String innerIndent = p.indent(indent);
        for (FVariable[] combination : mySet().stateCombinations()) {
            if (first)
                str.format("%sif (", indent);
            else
                str.format("%s} else if (", indent);
            first = false;
            str.format("jmi_dynamic_state_check_is_state(jmi, %d", mySet().id_C());
            for (FVariable var : combination)
                str.format(", %d", var.valueReference());
            str.println(")) {");
            str.format("%s%s = ", innerIndent, tempName_C());
            p.print(getUse(combination[getNumber() - 1].dynamicStateVarIndex() - 1), str, indent);
            str.println(";");
        }
        str.formatln("%s}", indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:505
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print(tempName_C());
    }
    /**
     * @declaredat ASTNode:1
     */
    public FDSDerExp() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FDSDerExp(int p0, int p1) {
        setSetId(p0);
        setNumber(p1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 0;
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
    public FDSDerExp clone() throws CloneNotSupportedException {
        FDSDerExp node = (FDSDerExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FDSDerExp copy() {
        try {
            FDSDerExp node = (FDSDerExp) clone();
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
    public FDSDerExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public FDSDerExp treeCopyNoTransform() {
        FDSDerExp tree = (FDSDerExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 0:
                    tree.children[i] = null;
                    continue;
                case 1:
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
     * @declaredat ASTNode:114
     */
    public FDSDerExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:121
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_SetId == ((FDSDerExp)node).tokenint_SetId) && (tokenint_Number == ((FDSDerExp)node).tokenint_Number);    
    }
    /**
     * Replaces the lexeme SetId.
     * @param value The new value for the lexeme SetId.
     * @apilevel high-level
     */
    public void setSetId(int value) {
        tokenint_SetId = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_SetId;
    /**
     * Retrieves the value for the lexeme SetId.
     * @return The value for the lexeme SetId.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="SetId")
    public int getSetId() {
        return tokenint_SetId;
    }
    /**
     * Replaces the lexeme Number.
     * @param value The new value for the lexeme Number.
     * @apilevel high-level
     */
    public void setNumber(int value) {
        tokenint_Number = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Number;
    /**
     * Retrieves the value for the lexeme Number.
     * @return The value for the lexeme Number.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Number")
    public int getNumber() {
        return tokenint_Number;
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 0;
    }
    /**
     * Retrieves the number of children in the Use list.
     * @return Number of children in the Use list.
     * @apilevel high-level
     */
    public int getNumUse() {
        return getUseList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Use list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Use list.
     * @apilevel low-level
     */
    public int getNumUseNoTransform() {
        return getUseListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Use list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Use list.
     * @apilevel high-level
     */
    public FExp getUse(int i) {
        return (FExp) getUseList().getChild(i);
    }
    /**
     * Check whether the Use list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasUse() {
        return getUseList().getNumChild() != 0;
    }
    /**
     * Append an element to the Use list.
     * @param node The element to append to the Use list.
     * @apilevel high-level
     */
    public void addUse(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getUseListNoTransform() : getUseList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addUseNoTransform(FExp node) {
        List<FExp> list = getUseListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Use list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setUse(FExp node, int i) {
        List<FExp> list = getUseList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the Use list.
     * @return The the child position of the Use list.
     * @apilevel low-level
     */
    protected int getUseListChildPosition() {
        return 1;
    }
    /**
     * Retrieves the Use list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Use list.
     * @apilevel low-level
     */
    public List<FExp> getUseListNoTransform() {
        return (List<FExp>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Use list.
     * @return The node representing the Use list.
     * @apilevel high-level
     */
    public List<FExp> getUses() {
        return getUseList();
    }
    /**
     * Retrieves the Use list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Use list.
     * @apilevel low-level
     */
    public List<FExp> getUsesNoTransform() {
        return getUseListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public DynamicStateSet mySet() {
        ASTNode$State state = state();
        DynamicStateSet mySet_value = myFClass().getDynamicStateManager().getSet(getSetId() - 1);

        return mySet_value;
    }
    @ASTNodeAnnotation.Attribute
    public List<FExp> getUseList() {
        ASTNode$State state = state();
        List<FExp> getUseList_value = getUseList_compute();
        setChild(getUseList_value, getUseListChildPosition());

        List<FExp> node = (List<FExp>) this.getChild(getUseListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<FExp> getUseList_compute() {
            DynamicStateSet set = mySet();
            List<FExp> list = new List<FExp>();
            for (FIdUseExp var : set.getVars())
                list.add(var.diff(TIME));
            return list;
        }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
