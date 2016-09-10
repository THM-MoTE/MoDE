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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:251
 * @production PN_ComponentDecl : {@link SourceBaseNode} ::= <span class="component">Name:{@link IdDecl}</span> <span class="component">[VarArraySubscripts:{@link ArraySubscripts}]</span> <span class="component">[{@link Modification}]</span> <span class="component">[{@link ConditionalAttribute}]</span> <span class="component">{@link Comment}</span>;

 */
public class PN_ComponentDecl extends SourceBaseNode implements Cloneable {
    /**
     * @declaredat ASTNode:1
     */
    public PN_ComponentDecl() {
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
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:16
     */
    public PN_ComponentDecl(IdDecl p0, Opt<ArraySubscripts> p1, Opt<Modification> p2, Opt<ConditionalAttribute> p3, Comment p4) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:26
     */
    protected int numChildren() {
        return 5;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public boolean mayHaveRewrite() {
        return false;
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
    public PN_ComponentDecl clone() throws CloneNotSupportedException {
        PN_ComponentDecl node = (PN_ComponentDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public PN_ComponentDecl copy() {
        try {
            PN_ComponentDecl node = (PN_ComponentDecl) clone();
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
    public PN_ComponentDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:91
     */
    public PN_ComponentDecl treeCopyNoTransform() {
        PN_ComponentDecl tree = (PN_ComponentDecl) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
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
     * @declaredat ASTNode:111
     */
    public PN_ComponentDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:118
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(IdDecl node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public IdDecl getName() {
        return (IdDecl) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public IdDecl getNameNoTransform() {
        return (IdDecl) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the VarArraySubscripts child. This is the <code>Opt</code>
     * node containing the child VarArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the VarArraySubscripts child.
     * @apilevel low-level
     */
    public void setVarArraySubscriptsOpt(Opt<ArraySubscripts> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) VarArraySubscripts child.
     * @param node The new node to be used as the VarArraySubscripts child.
     * @apilevel high-level
     */
    public void setVarArraySubscripts(ArraySubscripts node) {
        getVarArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional VarArraySubscripts child exists.
     * @return {@code true} if the optional VarArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasVarArraySubscripts() {
        return getVarArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) VarArraySubscripts child.
     * @return The VarArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ArraySubscripts getVarArraySubscripts() {
        return (ArraySubscripts) getVarArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the VarArraySubscripts child. This is the <code>Opt</code> node containing the child VarArraySubscripts, not the actual child!
     * @return The optional node for child the VarArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="VarArraySubscripts")
    public Opt<ArraySubscripts> getVarArraySubscriptsOpt() {
        return (Opt<ArraySubscripts>) getChild(1);
    }
    /**
     * Retrieves the optional node for child VarArraySubscripts. This is the <code>Opt</code> node containing the child VarArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child VarArraySubscripts.
     * @apilevel low-level
     */
    public Opt<ArraySubscripts> getVarArraySubscriptsOptNoTransform() {
        return (Opt<ArraySubscripts>) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Modification child. This is the <code>Opt</code>
     * node containing the child Modification, not the actual child!
     * @param opt The new node to be used as the optional node for the Modification child.
     * @apilevel low-level
     */
    public void setModificationOpt(Opt<Modification> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Modification child.
     * @param node The new node to be used as the Modification child.
     * @apilevel high-level
     */
    public void setModification(Modification node) {
        getModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Modification child exists.
     * @return {@code true} if the optional Modification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasModification() {
        return getModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Modification child.
     * @return The Modification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Modification getModification() {
        return (Modification) getModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Modification child. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * @return The optional node for child the Modification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Modification")
    public Opt<Modification> getModificationOpt() {
        return (Opt<Modification>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Modification. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Modification.
     * @apilevel low-level
     */
    public Opt<Modification> getModificationOptNoTransform() {
        return (Opt<Modification>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the ConditionalAttribute child. This is the <code>Opt</code>
     * node containing the child ConditionalAttribute, not the actual child!
     * @param opt The new node to be used as the optional node for the ConditionalAttribute child.
     * @apilevel low-level
     */
    public void setConditionalAttributeOpt(Opt<ConditionalAttribute> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) ConditionalAttribute child.
     * @param node The new node to be used as the ConditionalAttribute child.
     * @apilevel high-level
     */
    public void setConditionalAttribute(ConditionalAttribute node) {
        getConditionalAttributeOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConditionalAttribute child exists.
     * @return {@code true} if the optional ConditionalAttribute child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConditionalAttribute() {
        return getConditionalAttributeOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConditionalAttribute child.
     * @return The ConditionalAttribute child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ConditionalAttribute getConditionalAttribute() {
        return (ConditionalAttribute) getConditionalAttributeOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConditionalAttribute child. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * @return The optional node for child the ConditionalAttribute child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConditionalAttribute")
    public Opt<ConditionalAttribute> getConditionalAttributeOpt() {
        return (Opt<ConditionalAttribute>) getChild(3);
    }
    /**
     * Retrieves the optional node for child ConditionalAttribute. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConditionalAttribute.
     * @apilevel low-level
     */
    public Opt<ConditionalAttribute> getConditionalAttributeOptNoTransform() {
        return (Opt<ConditionalAttribute>) getChildNoTransform(3);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(4);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(4);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
