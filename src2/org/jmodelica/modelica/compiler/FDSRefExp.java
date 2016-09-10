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
 * A reference to a dynamic state
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1132
 * @production FDSRefExp : {@link FVarRefExp} ::= <span class="component">&lt;SetId:int&gt;</span> <span class="component">Use:{@link FIdUseExp}*</span> <span class="component">Org:{@link FIdUseExp}</span>;

 */
public class FDSRefExp extends FVarRefExp implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1093
     */
    public FDSRefExp createEmptyNode()      { return new FDSRefExp();      }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1751
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
        str.format("ds(%d, ", getSetId());
        p.print(getOrg(), str, indent);
        str.print(")");
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:424
     */
    public FExp diff(String name) {
        return getOrg().diff(name);
    }
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:121
     */
    @Override
    public void findFIdUseExpsInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        for (FIdUseExp exp : getUses())
            set.add(exp);
        visitor.visit(getOrg(), set);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:474
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        p.print(getOrg(), str, indent);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FDSRefExp() {
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
        children = new ASTNode[3];
        setChild(new List(), 2);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FDSRefExp(int p0, FIdUseExp p1) {
        setSetId(p0);
        setChild(p1, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 1;
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
    public FDSRefExp clone() throws CloneNotSupportedException {
        FDSRefExp node = (FDSRefExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FDSRefExp copy() {
        try {
            FDSRefExp node = (FDSRefExp) clone();
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
    public FDSRefExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FDSRefExp treeCopyNoTransform() {
        FDSRefExp tree = (FDSRefExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
                    tree.children[i] = null;
                    continue;
                case 2:
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
    public FDSRefExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_SetId == ((FDSRefExp)node).tokenint_SetId);    
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
     * Replaces the Org child.
     * @param node The new node to replace the Org child.
     * @apilevel high-level
     */
    public void setOrg(FIdUseExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Org child.
     * @return The current node used as the Org child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Org")
    public FIdUseExp getOrg() {
        return (FIdUseExp) getChild(0);
    }
    /**
     * Retrieves the Org child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Org child.
     * @apilevel low-level
     */
    public FIdUseExp getOrgNoTransform() {
        return (FIdUseExp) getChildNoTransform(0);
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
    public FIdUseExp getUse(int i) {
        return (FIdUseExp) getUseList().getChild(i);
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
    public void addUse(FIdUseExp node) {
        List<FIdUseExp> list = (parent == null || state == null) ? getUseListNoTransform() : getUseList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addUseNoTransform(FIdUseExp node) {
        List<FIdUseExp> list = getUseListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Use list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setUse(FIdUseExp node, int i) {
        List<FIdUseExp> list = getUseList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the Use list.
     * @return The the child position of the Use list.
     * @apilevel low-level
     */
    protected int getUseListChildPosition() {
        return 2;
    }
    /**
     * Retrieves the Use list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Use list.
     * @apilevel low-level
     */
    public List<FIdUseExp> getUseListNoTransform() {
        return (List<FIdUseExp>) getChildNoTransform(2);
    }
    /**
     * Retrieves the Use list.
     * @return The node representing the Use list.
     * @apilevel high-level
     */
    public List<FIdUseExp> getUses() {
        return getUseList();
    }
    /**
     * Retrieves the Use list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Use list.
     * @apilevel low-level
     */
    public List<FIdUseExp> getUsesNoTransform() {
        return getUseListNoTransform();
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
        type_value = getOrg().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDynamicState() {
        ASTNode$State state = state();
        boolean isDynamicState_value = true;

        return isDynamicState_value;
    }
    @ASTNodeAnnotation.Attribute
    public DynamicStateSet mySet() {
        ASTNode$State state = state();
        DynamicStateSet mySet_value = myFClass().getDynamicStateManager().getSet(getSetId() - 1);

        return mySet_value;
    }
    @ASTNodeAnnotation.Attribute
    public List<FIdUseExp> getUseList() {
        ASTNode$State state = state();
        List<FIdUseExp> getUseList_value = getUseList_compute();
        setChild(getUseList_value, getUseListChildPosition());

        List<FIdUseExp> node = (List<FIdUseExp>) this.getChild(getUseListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<FIdUseExp> getUseList_compute() {
            DynamicStateSet set = mySet();
            List<FIdUseExp> list = new List<FIdUseExp>();
            for (int i = 1; i <= set.numAlgebraics(); i++)
                list.add(new FIdUseExp("_ds." + set.id() + ".a" + i));
            return list;
        }
    @ASTNodeAnnotation.Attribute
    public boolean isIdentifier(String name) {
        ASTNode$State state = state();
        boolean isIdentifier_String_value = getOrg().isIdentifier(name);

        return isIdentifier_String_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:86
     * @apilevel internal
     */
    public boolean Define_shouldRewriteToDSRef(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
