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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:56
 * @production InstReplacingFullClassDecl : {@link InstFullClassDecl} ::= <span class="component">&lt;OriginalClassDecl:ClassDecl&gt;</span> <span class="component">OriginalInstClass:{@link InstClassDecl}</span> <span class="component">&lt;InstClassRedeclare:InstRedeclareClassNode&gt;</span>;

 */
public class InstReplacingFullClassDecl extends InstFullClassDecl implements Cloneable {
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1042
     */
    public void collectErrors(ErrorCheckType checkType) {
	    if (!errorChecked) {
		  super.collectErrors(checkType);
    	  errorChecked = true;
		  getOriginalInstClass().collectErrors(checkType);
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public InstReplacingFullClassDecl() {
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
        children = new ASTNode[14];
        setChild(new Opt(), 0);
        setChild(new Opt(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new List(), 9);
        setChild(new Opt(), 11);
    }
    /**
     * @declaredat ASTNode:23
     */
    public InstReplacingFullClassDecl(ClassDecl p0, Opt<InstConstrainingClass> p1, InstRestriction p2, Opt<InstExternal> p3, ClassDecl p4, InstRedeclareClassNode p5) {
        setClassDecl(p0);
        setChild(p1, 0);
        setChild(p2, 1);
        setChild(p3, 2);
        setOriginalClassDecl(p4);
        setInstClassRedeclare(p5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:34
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getOriginalInstClass_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:59
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public InstReplacingFullClassDecl clone() throws CloneNotSupportedException {
        InstReplacingFullClassDecl node = (InstReplacingFullClassDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public InstReplacingFullClassDecl copy() {
        try {
            InstReplacingFullClassDecl node = (InstReplacingFullClassDecl) clone();
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
     * @declaredat ASTNode:91
     */
    public InstReplacingFullClassDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:100
     */
    public InstReplacingFullClassDecl treeCopyNoTransform() {
        InstReplacingFullClassDecl tree = (InstReplacingFullClassDecl) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 10:
                case 12:
                case 13:
                    tree.children[i] = null;
                    continue;
                case 11:
                    tree.children[i] = new Opt();
                    continue;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
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
     * @declaredat ASTNode:139
     */
    public InstReplacingFullClassDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:146
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenClassDecl_ClassDecl == ((InstReplacingFullClassDecl)node).tokenClassDecl_ClassDecl) && (tokenClassDecl_OriginalClassDecl == ((InstReplacingFullClassDecl)node).tokenClassDecl_OriginalClassDecl) && (tokenInstRedeclareClassNode_InstClassRedeclare == ((InstReplacingFullClassDecl)node).tokenInstRedeclareClassNode_InstClassRedeclare);    
    }
    /**
     * Replaces the lexeme ClassDecl.
     * @param value The new value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    public void setClassDecl(ClassDecl value) {
        tokenClassDecl_ClassDecl = value;
    }
    /**
     * Retrieves the value for the lexeme ClassDecl.
     * @return The value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ClassDecl")
    public ClassDecl getClassDecl() {
        return tokenClassDecl_ClassDecl;
    }
    /**
     * Replaces the optional node for the InstConstrainingClass child. This is the <code>Opt</code>
     * node containing the child InstConstrainingClass, not the actual child!
     * @param opt The new node to be used as the optional node for the InstConstrainingClass child.
     * @apilevel low-level
     */
    public void setInstConstrainingClassOpt(Opt<InstConstrainingClass> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) InstConstrainingClass child.
     * @param node The new node to be used as the InstConstrainingClass child.
     * @apilevel high-level
     */
    public void setInstConstrainingClass(InstConstrainingClass node) {
        getInstConstrainingClassOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstConstrainingClass child exists.
     * @return {@code true} if the optional InstConstrainingClass child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstConstrainingClass() {
        return getInstConstrainingClassOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstConstrainingClass child.
     * @return The InstConstrainingClass child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstConstrainingClass getInstConstrainingClass() {
        return (InstConstrainingClass) getInstConstrainingClassOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstConstrainingClass child. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * @return The optional node for child the InstConstrainingClass child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstConstrainingClass")
    public Opt<InstConstrainingClass> getInstConstrainingClassOpt() {
        return (Opt<InstConstrainingClass>) getChild(0);
    }
    /**
     * Retrieves the optional node for child InstConstrainingClass. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstConstrainingClass.
     * @apilevel low-level
     */
    public Opt<InstConstrainingClass> getInstConstrainingClassOptNoTransform() {
        return (Opt<InstConstrainingClass>) getChildNoTransform(0);
    }
    /**
     * Replaces the InstRestriction child.
     * @param node The new node to replace the InstRestriction child.
     * @apilevel high-level
     */
    public void setInstRestriction(InstRestriction node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the InstRestriction child.
     * @return The current node used as the InstRestriction child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstRestriction")
    public InstRestriction getInstRestriction() {
        return (InstRestriction) getChild(1);
    }
    /**
     * Retrieves the InstRestriction child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstRestriction child.
     * @apilevel low-level
     */
    public InstRestriction getInstRestrictionNoTransform() {
        return (InstRestriction) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the InstExternal child. This is the <code>Opt</code>
     * node containing the child InstExternal, not the actual child!
     * @param opt The new node to be used as the optional node for the InstExternal child.
     * @apilevel low-level
     */
    public void setInstExternalOpt(Opt<InstExternal> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) InstExternal child.
     * @param node The new node to be used as the InstExternal child.
     * @apilevel high-level
     */
    public void setInstExternal(InstExternal node) {
        getInstExternalOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstExternal child exists.
     * @return {@code true} if the optional InstExternal child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstExternal() {
        return getInstExternalOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstExternal child.
     * @return The InstExternal child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstExternal getInstExternal() {
        return (InstExternal) getInstExternalOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstExternal child. This is the <code>Opt</code> node containing the child InstExternal, not the actual child!
     * @return The optional node for child the InstExternal child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstExternal")
    public Opt<InstExternal> getInstExternalOpt() {
        return (Opt<InstExternal>) getChild(2);
    }
    /**
     * Retrieves the optional node for child InstExternal. This is the <code>Opt</code> node containing the child InstExternal, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstExternal.
     * @apilevel low-level
     */
    public Opt<InstExternal> getInstExternalOptNoTransform() {
        return (Opt<InstExternal>) getChildNoTransform(2);
    }
    /**
     * Replaces the lexeme OriginalClassDecl.
     * @param value The new value for the lexeme OriginalClassDecl.
     * @apilevel high-level
     */
    public void setOriginalClassDecl(ClassDecl value) {
        tokenClassDecl_OriginalClassDecl = value;
    }
    /**
     * @apilevel internal
     */
    protected ClassDecl tokenClassDecl_OriginalClassDecl;
    /**
     * Retrieves the value for the lexeme OriginalClassDecl.
     * @return The value for the lexeme OriginalClassDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="OriginalClassDecl")
    public ClassDecl getOriginalClassDecl() {
        return tokenClassDecl_OriginalClassDecl;
    }
    /**
     * Replaces the lexeme InstClassRedeclare.
     * @param value The new value for the lexeme InstClassRedeclare.
     * @apilevel high-level
     */
    public void setInstClassRedeclare(InstRedeclareClassNode value) {
        tokenInstRedeclareClassNode_InstClassRedeclare = value;
    }
    /**
     * @apilevel internal
     */
    protected InstRedeclareClassNode tokenInstRedeclareClassNode_InstClassRedeclare;
    /**
     * Retrieves the value for the lexeme InstClassRedeclare.
     * @return The value for the lexeme InstClassRedeclare.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="InstClassRedeclare")
    public InstRedeclareClassNode getInstClassRedeclare() {
        return tokenInstRedeclareClassNode_InstClassRedeclare;
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel high-level
     */
    public int getNumInstComponentDecl() {
        return getInstComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel low-level
     */
    public int getNumInstComponentDeclNoTransform() {
        return getInstComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstComponentDecl list.
     * @apilevel high-level
     */
    public InstComponentDecl getInstComponentDecl(int i) {
        return (InstComponentDecl) getInstComponentDeclList().getChild(i);
    }
    /**
     * Check whether the InstComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstComponentDecl() {
        return getInstComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstComponentDecl list.
     * @param node The element to append to the InstComponentDecl list.
     * @apilevel high-level
     */
    public void addInstComponentDecl(InstComponentDecl node) {
        List<InstComponentDecl> list = (parent == null || state == null) ? getInstComponentDeclListNoTransform() : getInstComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstComponentDeclNoTransform(InstComponentDecl node) {
        List<InstComponentDecl> list = getInstComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node, int i) {
        List<InstComponentDecl> list = getInstComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstComponentDecl list.
     * @return The the child position of the InstComponentDecl list.
     * @apilevel low-level
     */
    protected int getInstComponentDeclListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InstComponentDecl list.
     * @return The node representing the InstComponentDecl list.
     * @apilevel high-level
     */
    public List<InstComponentDecl> getInstComponentDecls() {
        return getInstComponentDeclList();
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclsNoTransform() {
        return getInstComponentDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * @return Number of children in the InstClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstClassDecl() {
        return getInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstClassDeclNoTransform() {
        return getInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstClassDecl(int i) {
        return (InstClassDecl) getInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstClassDecl() {
        return getInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstClassDecl list.
     * @param node The element to append to the InstClassDecl list.
     * @apilevel high-level
     */
    public void addInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstClassDeclListNoTransform() : getInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstClassDecl list.
     * @return The the child position of the InstClassDecl list.
     * @apilevel low-level
     */
    protected int getInstClassDeclListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(4);
    }
    /**
     * Retrieves the InstClassDecl list.
     * @return The node representing the InstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstClassDecls() {
        return getInstClassDeclList();
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclsNoTransform() {
        return getInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * @return Number of children in the InstExtends list.
     * @apilevel high-level
     */
    public int getNumInstExtends() {
        return getInstExtendsList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstExtends list.
     * @apilevel low-level
     */
    public int getNumInstExtendsNoTransform() {
        return getInstExtendsListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstExtends list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstExtends list.
     * @apilevel high-level
     */
    public InstExtends getInstExtends(int i) {
        return (InstExtends) getInstExtendsList().getChild(i);
    }
    /**
     * Check whether the InstExtends list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstExtends() {
        return getInstExtendsList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstExtends list.
     * @param node The element to append to the InstExtends list.
     * @apilevel high-level
     */
    public void addInstExtends(InstExtends node) {
        List<InstExtends> list = (parent == null || state == null) ? getInstExtendsListNoTransform() : getInstExtendsList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstExtendsNoTransform(InstExtends node) {
        List<InstExtends> list = getInstExtendsListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstExtends list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstExtends(InstExtends node, int i) {
        List<InstExtends> list = getInstExtendsList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstExtends list.
     * @return The the child position of the InstExtends list.
     * @apilevel low-level
     */
    protected int getInstExtendsListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InstExtends list.
     * @return The node representing the InstExtends list.
     * @apilevel high-level
     */
    public List<InstExtends> getInstExtendss() {
        return getInstExtendsList();
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendssNoTransform() {
        return getInstExtendsListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * @return Number of children in the InstImport list.
     * @apilevel high-level
     */
    public int getNumInstImport() {
        return getInstImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstImport list.
     * @apilevel low-level
     */
    public int getNumInstImportNoTransform() {
        return getInstImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstImport list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstImport list.
     * @apilevel high-level
     */
    public InstImport getInstImport(int i) {
        return (InstImport) getInstImportList().getChild(i);
    }
    /**
     * Check whether the InstImport list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstImport() {
        return getInstImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstImport list.
     * @param node The element to append to the InstImport list.
     * @apilevel high-level
     */
    public void addInstImport(InstImport node) {
        List<InstImport> list = (parent == null || state == null) ? getInstImportListNoTransform() : getInstImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstImportNoTransform(InstImport node) {
        List<InstImport> list = getInstImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstImport list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstImport(InstImport node, int i) {
        List<InstImport> list = getInstImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstImport list.
     * @return The the child position of the InstImport list.
     * @apilevel low-level
     */
    protected int getInstImportListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(6);
    }
    /**
     * Retrieves the InstImport list.
     * @return The node representing the InstImport list.
     * @apilevel high-level
     */
    public List<InstImport> getInstImports() {
        return getInstImportList();
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportsNoTransform() {
        return getInstImportListNoTransform();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public int getNumRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public int getNumRedeclaredInstClassDeclNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the RedeclaredInstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getRedeclaredInstClassDecl(int i) {
        return (InstClassDecl) getRedeclaredInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the RedeclaredInstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the RedeclaredInstClassDecl list.
     * @param node The element to append to the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public void addRedeclaredInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getRedeclaredInstClassDeclListNoTransform() : getRedeclaredInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addRedeclaredInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the RedeclaredInstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setRedeclaredInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the RedeclaredInstClassDecl list.
     * @return The the child position of the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    protected int getRedeclaredInstClassDeclListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(7);
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDecls() {
        return getRedeclaredInstClassDeclList();
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclsNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the FAbstractEquation list.
     * @return The the child position of the FAbstractEquation list.
     * @apilevel low-level
     */
    protected int getFAbstractEquationListChildPosition() {
        return 8;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(8);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * @return Number of children in the ElementInstModification list.
     * @apilevel high-level
     */
    public int getNumElementInstModification() {
        return getElementInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementInstModification list.
     * @apilevel low-level
     */
    public int getNumElementInstModificationNoTransform() {
        return getElementInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementInstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementInstModification list.
     * @apilevel high-level
     */
    public InstModification getElementInstModification(int i) {
        return (InstModification) getElementInstModificationList().getChild(i);
    }
    /**
     * Check whether the ElementInstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementInstModification() {
        return getElementInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementInstModification list.
     * @param node The element to append to the ElementInstModification list.
     * @apilevel high-level
     */
    public void addElementInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getElementInstModificationListNoTransform() : getElementInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getElementInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementInstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementInstModification(InstModification node, int i) {
        List<InstModification> list = getElementInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the ElementInstModification list.
     * @return The the child position of the ElementInstModification list.
     * @apilevel low-level
     */
    protected int getElementInstModificationListChildPosition() {
        return 9;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(9);
    }
    /**
     * Retrieves the ElementInstModification list.
     * @return The node representing the ElementInstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getElementInstModifications() {
        return getElementInstModificationList();
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationsNoTransform() {
        return getElementInstModificationListNoTransform();
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(10);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 10;
    }
    /**
     * Replaces the (optional) ClassAnnotation child.
     * @param node The new node to be used as the ClassAnnotation child.
     * @apilevel high-level
     */
    public void setClassAnnotation(InstClassModification node) {
        getClassAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ClassAnnotation child exists.
     * @return {@code true} if the optional ClassAnnotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasClassAnnotation() {
        return getClassAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ClassAnnotation child.
     * @return The ClassAnnotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getClassAnnotation() {
        return (InstClassModification) getClassAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child ClassAnnotation. This is the <code>Opt</code> node containing the child ClassAnnotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ClassAnnotation.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getClassAnnotationOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(11);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 11;
    }
    /**
     * Retrieves the FunctionType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FunctionType child.
     * @apilevel low-level
     */
    public FType getFunctionTypeNoTransform() {
        return (FType) getChildNoTransform(12);
    }
    /**
     * Retrieves the child position of the optional child FunctionType.
     * @return The the child position of the optional child FunctionType.
     * @apilevel low-level
     */
    protected int getFunctionTypeChildPosition() {
        return 12;
    }
    /**
     * Retrieves the OriginalInstClass child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the OriginalInstClass child.
     * @apilevel low-level
     */
    public InstClassDecl getOriginalInstClassNoTransform() {
        return (InstClassDecl) getChildNoTransform(13);
    }
    /**
     * Retrieves the child position of the optional child OriginalInstClass.
     * @return The the child position of the optional child OriginalInstClass.
     * @apilevel low-level
     */
    protected int getOriginalInstClassChildPosition() {
        return 13;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupDerivativeFunction(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupDerivativeFunction_String_value = getInstClassRedeclare().lookupInstClassQualified(name);

        return lookupDerivativeFunction_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsRedeclared() {
        ASTNode$State state = state();
        boolean containsRedeclared_value = true;

        return containsRedeclared_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(true, getInstClassRedeclare().redeclaringInstClassDecl());

        return extraNodesToSetModLevelFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassInInstClassRedeclare(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassInInstClassRedeclare_String_value = getInstClassRedeclare().lookupInstClass(name);

        return lookupInstClassInInstClassRedeclare_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClassFromComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClassFromComponent_String_value = lookupRedeclareExtendsInstClass(name);

        return lookupRedeclareExtendsInstClassFromComponent_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassInSurrounding(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassInSurrounding_String_value = getInstClassRedeclare().lookupInstClass(name);

        return lookupInstClassInSurrounding_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRedeclaredNonSimple() {
        ASTNode$State state = state();
        boolean isRedeclaredNonSimple_value = true;

        return isRedeclaredNonSimple_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode myDefaultConstrainingDecl() {
        ASTNode$State state = state();
        InstNode myDefaultConstrainingDecl_value = getOriginalInstClass();

        return myDefaultConstrainingDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsFromConstrainingType() {
        ASTNode$State state = state();
        java.util.List<InstModification> instModificationsFromConstrainingType_value = getOriginalInstClass().instModificationsForConstraining();

        return instModificationsFromConstrainingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl originalInstClass() {
        ASTNode$State state = state();
        InstClassDecl originalInstClass_value = getOriginalInstClass();

        return originalInstClass_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getOriginalInstClass_computed = false;
    /**
     * @apilevel internal
     */
    protected InstClassDecl getOriginalInstClass_value;
    /**
     * @apilevel internal
     */
    private void getOriginalInstClass_reset() {
        getOriginalInstClass_computed = false;
        getOriginalInstClass_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl getOriginalInstClass() {
        if(getOriginalInstClass_computed) {
            return (InstClassDecl) getChild(getOriginalInstClassChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getOriginalInstClass_value = getOriginalClassDecl().newInstClassDecl();
        setChild(getOriginalInstClass_value, getOriginalInstClassChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getOriginalInstClass_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        InstClassDecl node = (InstClassDecl) this.getChild(getOriginalInstClassChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRedeclared() {
        ASTNode$State state = state();
        boolean isRedeclared_value = true;

        return isRedeclared_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode findConstrainingInstType() {
        ASTNode$State state = state();
        InstNode findConstrainingInstType_value = getOriginalInstClass().constrainingInstType();

        return findConstrainingInstType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInner() {
        ASTNode$State state = state();
        boolean isInner_value = getClassDecl().hasInnerOrOuter() ? getClassDecl().isInner() : getOriginalClassDecl().isInner();

        return isInner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOuter() {
        ASTNode$State state = state();
        boolean isOuter_value = getClassDecl().hasInnerOrOuter() ? getClassDecl().isOuter() : getOriginalClassDecl().isOuter();

        return isOuter_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        if (caller == getOriginalInstClassNoTransform()) {
            return retrieveFQName();
        }
        else {
            return super.Define_retrieveFQName(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getOriginalInstClassNoTransform()) {
            return lookupInstClass(name);
        }
        else {
            return super.Define_lookupInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:149
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupRedeclareExtendsInstClass(name);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
