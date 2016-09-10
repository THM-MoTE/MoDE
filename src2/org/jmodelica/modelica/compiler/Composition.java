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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:188
 * @production Composition : {@link SourceBaseNode} ::= <span class="component">{@link Clause}*</span> <span class="component">[{@link ExternalClause}]</span>;

 */
public class Composition extends SourceBaseNode implements Cloneable {
    /**
     * Extract elements from Composition and add to a FullClassDecl.
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:208
     */
    public void extractElementsTo(FullClassDecl fcd) {
    	fcd.originalComposition = this;

        for (Clause cl : getClauses()) 
			cl.addToFullClassDecl(fcd);
        
        if (hasExternalClause()) 
        	fcd.setExternalClause(getExternalClause());
    }
    /**
     * @declaredat ASTNode:1
     */
    public Composition() {
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
        setChild(new List(), 0);
        setChild(new Opt(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public Composition(List<Clause> p0, Opt<ExternalClause> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public Composition clone() throws CloneNotSupportedException {
        Composition node = (Composition) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public Composition copy() {
        try {
            Composition node = (Composition) clone();
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
    public Composition fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public Composition treeCopyNoTransform() {
        Composition tree = (Composition) copy();
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
     * @declaredat ASTNode:107
     */
    public Composition treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:114
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Clause list.
     * @param list The new list node to be used as the Clause list.
     * @apilevel high-level
     */
    public void setClauseList(List<Clause> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Clause list.
     * @return Number of children in the Clause list.
     * @apilevel high-level
     */
    public int getNumClause() {
        return getClauseList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Clause list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Clause list.
     * @apilevel low-level
     */
    public int getNumClauseNoTransform() {
        return getClauseListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Clause list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Clause list.
     * @apilevel high-level
     */
    public Clause getClause(int i) {
        return (Clause) getClauseList().getChild(i);
    }
    /**
     * Check whether the Clause list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasClause() {
        return getClauseList().getNumChild() != 0;
    }
    /**
     * Append an element to the Clause list.
     * @param node The element to append to the Clause list.
     * @apilevel high-level
     */
    public void addClause(Clause node) {
        List<Clause> list = (parent == null || state == null) ? getClauseListNoTransform() : getClauseList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addClauseNoTransform(Clause node) {
        List<Clause> list = getClauseListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Clause list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setClause(Clause node, int i) {
        List<Clause> list = getClauseList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Clause list.
     * @return The node representing the Clause list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Clause")
    public List<Clause> getClauseList() {
        List<Clause> list = (List<Clause>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Clause list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Clause list.
     * @apilevel low-level
     */
    public List<Clause> getClauseListNoTransform() {
        return (List<Clause>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Clause list.
     * @return The node representing the Clause list.
     * @apilevel high-level
     */
    public List<Clause> getClauses() {
        return getClauseList();
    }
    /**
     * Retrieves the Clause list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Clause list.
     * @apilevel low-level
     */
    public List<Clause> getClausesNoTransform() {
        return getClauseListNoTransform();
    }
    /**
     * Replaces the optional node for the ExternalClause child. This is the <code>Opt</code>
     * node containing the child ExternalClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ExternalClause child.
     * @apilevel low-level
     */
    public void setExternalClauseOpt(Opt<ExternalClause> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) ExternalClause child.
     * @param node The new node to be used as the ExternalClause child.
     * @apilevel high-level
     */
    public void setExternalClause(ExternalClause node) {
        getExternalClauseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ExternalClause child exists.
     * @return {@code true} if the optional ExternalClause child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasExternalClause() {
        return getExternalClauseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ExternalClause child.
     * @return The ExternalClause child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ExternalClause getExternalClause() {
        return (ExternalClause) getExternalClauseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ExternalClause child. This is the <code>Opt</code> node containing the child ExternalClause, not the actual child!
     * @return The optional node for child the ExternalClause child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ExternalClause")
    public Opt<ExternalClause> getExternalClauseOpt() {
        return (Opt<ExternalClause>) getChild(1);
    }
    /**
     * Retrieves the optional node for child ExternalClause. This is the <code>Opt</code> node containing the child ExternalClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ExternalClause.
     * @apilevel low-level
     */
    public Opt<ExternalClause> getExternalClauseOptNoTransform() {
        return (Opt<ExternalClause>) getChildNoTransform(1);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
