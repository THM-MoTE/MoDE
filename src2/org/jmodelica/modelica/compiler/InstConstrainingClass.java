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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:93
 * @production InstConstrainingClass : {@link InstConstraining} ::= <span class="component">&lt;BaseClassDecl:BaseClassDecl&gt;</span> <span class="component">&lt;InstRedeclare:InstRedeclareClassNode&gt;</span>;

 */
public class InstConstrainingClass extends InstConstraining implements Cloneable {
    /**
     * @declaredat ASTNode:1
     */
    public InstConstrainingClass() {
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
        setChild(new Opt(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public InstConstrainingClass(InstAccess p0, Opt<InstClassModification> p1, BaseClassDecl p2, InstRedeclareClassNode p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setBaseClassDecl(p2);
        setInstRedeclare(p3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getConstrainingClause_reset();
        getInstNode_reset();
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
    public InstConstrainingClass clone() throws CloneNotSupportedException {
        InstConstrainingClass node = (InstConstrainingClass) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public InstConstrainingClass copy() {
        try {
            InstConstrainingClass node = (InstConstrainingClass) clone();
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
    public InstConstrainingClass fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public InstConstrainingClass treeCopyNoTransform() {
        InstConstrainingClass tree = (InstConstrainingClass) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
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
    public InstConstrainingClass treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenBaseClassDecl_BaseClassDecl == ((InstConstrainingClass)node).tokenBaseClassDecl_BaseClassDecl) && (tokenInstRedeclareClassNode_InstRedeclare == ((InstConstrainingClass)node).tokenInstRedeclareClassNode_InstRedeclare);    
    }
    /**
     * Replaces the ClassName child.
     * @param node The new node to replace the ClassName child.
     * @apilevel high-level
     */
    public void setClassName(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the ClassName child.
     * @return The current node used as the ClassName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ClassName")
    public InstAccess getClassName() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the ClassName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ClassName child.
     * @apilevel low-level
     */
    public InstAccess getClassNameNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the InstClassModification child. This is the <code>Opt</code>
     * node containing the child InstClassModification, not the actual child!
     * @param opt The new node to be used as the optional node for the InstClassModification child.
     * @apilevel low-level
     */
    public void setInstClassModificationOpt(Opt<InstClassModification> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) InstClassModification child.
     * @param node The new node to be used as the InstClassModification child.
     * @apilevel high-level
     */
    public void setInstClassModification(InstClassModification node) {
        getInstClassModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstClassModification child exists.
     * @return {@code true} if the optional InstClassModification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstClassModification() {
        return getInstClassModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstClassModification child.
     * @return The InstClassModification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getInstClassModification() {
        return (InstClassModification) getInstClassModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstClassModification child. This is the <code>Opt</code> node containing the child InstClassModification, not the actual child!
     * @return The optional node for child the InstClassModification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstClassModification")
    public Opt<InstClassModification> getInstClassModificationOpt() {
        return (Opt<InstClassModification>) getChild(1);
    }
    /**
     * Retrieves the optional node for child InstClassModification. This is the <code>Opt</code> node containing the child InstClassModification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstClassModification.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getInstClassModificationOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(1);
    }
    /**
     * Replaces the lexeme BaseClassDecl.
     * @param value The new value for the lexeme BaseClassDecl.
     * @apilevel high-level
     */
    public void setBaseClassDecl(BaseClassDecl value) {
        tokenBaseClassDecl_BaseClassDecl = value;
    }
    /**
     * @apilevel internal
     */
    protected BaseClassDecl tokenBaseClassDecl_BaseClassDecl;
    /**
     * Retrieves the value for the lexeme BaseClassDecl.
     * @return The value for the lexeme BaseClassDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="BaseClassDecl")
    public BaseClassDecl getBaseClassDecl() {
        return tokenBaseClassDecl_BaseClassDecl;
    }
    /**
     * Replaces the lexeme InstRedeclare.
     * @param value The new value for the lexeme InstRedeclare.
     * @apilevel high-level
     */
    public void setInstRedeclare(InstRedeclareClassNode value) {
        tokenInstRedeclareClassNode_InstRedeclare = value;
    }
    /**
     * @apilevel internal
     */
    protected InstRedeclareClassNode tokenInstRedeclareClassNode_InstRedeclare;
    /**
     * Retrieves the value for the lexeme InstRedeclare.
     * @return The value for the lexeme InstRedeclare.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="InstRedeclare")
    public InstRedeclareClassNode getInstRedeclare() {
        return tokenInstRedeclareClassNode_InstRedeclare;
    }
    /**
     * Retrieves the InstNode child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstNode child.
     * @apilevel low-level
     */
    public InstBaseNode getInstNodeNoTransform() {
        return (InstBaseNode) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child InstNode.
     * @return The the child position of the optional child InstNode.
     * @apilevel low-level
     */
    protected int getInstNodeChildPosition() {
        return 2;
    }
    /**
     * @apilevel internal
     */
    protected boolean getConstrainingClause_computed = false;
    /**
     * @apilevel internal
     */
    protected ConstrainingClause getConstrainingClause_value;
    /**
     * @apilevel internal
     */
    private void getConstrainingClause_reset() {
        getConstrainingClause_computed = false;
        getConstrainingClause_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ConstrainingClause getConstrainingClause() {
        if(getConstrainingClause_computed) {
            return getConstrainingClause_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getConstrainingClause_value = getBaseClassDecl().getConstrainingClause();
        if (isFinal && num == state().boundariesCrossed) {
            getConstrainingClause_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getConstrainingClause_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstNode_computed = false;
    /**
     * @apilevel internal
     */
    protected InstBaseNode getInstNode_value;
    /**
     * @apilevel internal
     */
    private void getInstNode_reset() {
        getInstNode_computed = false;
        getInstNode_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstBaseNode getInstNode() {
        if(getInstNode_computed) {
            return (InstBaseNode) getChild(getInstNodeChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstNode_value = getInstNode_compute();
        setChild(getInstNode_value, getInstNodeChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstNode_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        InstBaseNode node = (InstBaseNode) this.getChild(getInstNodeChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private InstBaseNode getInstNode_compute() {
            ClassDecl classToExpand = getClassName().myInstClassDecl().getClassDecl();
            return classToExpand.newInstClassDecl();
        }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstRedeclare() {
        ASTNode$State state = state();
        boolean hasInstRedeclare_value = getInstRedeclare() != null;

        return hasInstRedeclare_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode getRedeclareInstNode() {
        ASTNode$State state = state();
        InstNode getRedeclareInstNode_value = getInstRedeclare().redeclaringInstClassDecl();

        return getRedeclareInstNode_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstNodeNoTransform()) {
            return getClassName().myInstClassDecl().lookupInstClass(name);
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return (getInstRedeclare() != null) ? getInstRedeclare().lookupInstClass(name) : lookupInstClass(name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return (getInstRedeclare() != null) ? getInstRedeclare().lookupInstComponent(name) : lookupInstComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:732
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInInstElement(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstClassModificationOptNoTransform()) {
            return getInstNode().memberInstComponent(name).unresolved();
        }
        else {
            return getParent().Define_lookupInstComponentInInstElement(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:238
     * @apilevel internal
     */
    public Size Define_expectedSizeFromParent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getClassName().myInstClassDecl().size();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
