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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:247
 * @production PN_ComponentClause : {@link BaseComponentDecl} ::= <span class="component">Name:{@link PN_ComponentDecl}*</span> <span class="component">[{@link ConstrainingClause}]</span> <span class="component">{@link Comment}</span>;

 */
public class PN_ComponentClause extends BaseComponentDecl implements Cloneable {
    /**
     * @declaredat ASTNode:1
     */
    public PN_ComponentClause() {
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
        children = new ASTNode[13];
        setChild(new Opt(), 0);
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new Opt(), 5);
        setChild(new Opt(), 6);
        setChild(new Opt(), 7);
        setChild(new Opt(), 9);
        setChild(new List(), 10);
        setChild(new Opt(), 11);
    }
    /**
     * @declaredat ASTNode:24
     */
    public PN_ComponentClause(Opt<Redeclare> p0, Opt<Final> p1, Opt<Inner> p2, Opt<Outer> p3, Opt<Replaceable> p4, Opt<TypePrefixFlow> p5, Opt<TypePrefixVariability> p6, Opt<TypePrefixInputOutput> p7, Access p8, Opt<ArraySubscripts> p9, List<PN_ComponentDecl> p10, Opt<ConstrainingClause> p11, Comment p12) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
        setChild(p6, 6);
        setChild(p7, 7);
        setChild(p8, 8);
        setChild(p9, 9);
        setChild(p10, 10);
        setChild(p11, 11);
        setChild(p12, 12);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:42
     */
    protected int numChildren() {
        return 13;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:66
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public PN_ComponentClause clone() throws CloneNotSupportedException {
        PN_ComponentClause node = (PN_ComponentClause) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:79
     */
    public PN_ComponentClause copy() {
        try {
            PN_ComponentClause node = (PN_ComponentClause) clone();
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
     * @declaredat ASTNode:98
     */
    public PN_ComponentClause fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:107
     */
    public PN_ComponentClause treeCopyNoTransform() {
        PN_ComponentClause tree = (PN_ComponentClause) copy();
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
     * @declaredat ASTNode:127
     */
    public PN_ComponentClause treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:134
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the Redeclare child. This is the <code>Opt</code>
     * node containing the child Redeclare, not the actual child!
     * @param opt The new node to be used as the optional node for the Redeclare child.
     * @apilevel low-level
     */
    public void setRedeclareOpt(Opt<Redeclare> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) Redeclare child.
     * @param node The new node to be used as the Redeclare child.
     * @apilevel high-level
     */
    public void setRedeclare(Redeclare node) {
        getRedeclareOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Redeclare child exists.
     * @return {@code true} if the optional Redeclare child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasRedeclare() {
        return getRedeclareOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Redeclare child.
     * @return The Redeclare child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Redeclare getRedeclare() {
        return (Redeclare) getRedeclareOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Redeclare child. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * @return The optional node for child the Redeclare child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Redeclare")
    public Opt<Redeclare> getRedeclareOpt() {
        return (Opt<Redeclare>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Redeclare. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Redeclare.
     * @apilevel low-level
     */
    public Opt<Redeclare> getRedeclareOptNoTransform() {
        return (Opt<Redeclare>) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the Final child. This is the <code>Opt</code>
     * node containing the child Final, not the actual child!
     * @param opt The new node to be used as the optional node for the Final child.
     * @apilevel low-level
     */
    public void setFinalOpt(Opt<Final> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) Final child.
     * @param node The new node to be used as the Final child.
     * @apilevel high-level
     */
    public void setFinal(Final node) {
        getFinalOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Final child exists.
     * @return {@code true} if the optional Final child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFinal() {
        return getFinalOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Final child.
     * @return The Final child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Final getFinal() {
        return (Final) getFinalOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Final child. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * @return The optional node for child the Final child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Final")
    public Opt<Final> getFinalOpt() {
        return (Opt<Final>) getChild(1);
    }
    /**
     * Retrieves the optional node for child Final. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Final.
     * @apilevel low-level
     */
    public Opt<Final> getFinalOptNoTransform() {
        return (Opt<Final>) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Inner child. This is the <code>Opt</code>
     * node containing the child Inner, not the actual child!
     * @param opt The new node to be used as the optional node for the Inner child.
     * @apilevel low-level
     */
    public void setInnerOpt(Opt<Inner> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Inner child.
     * @param node The new node to be used as the Inner child.
     * @apilevel high-level
     */
    public void setInner(Inner node) {
        getInnerOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Inner child exists.
     * @return {@code true} if the optional Inner child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInner() {
        return getInnerOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Inner child.
     * @return The Inner child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Inner getInner() {
        return (Inner) getInnerOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Inner child. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * @return The optional node for child the Inner child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Inner")
    public Opt<Inner> getInnerOpt() {
        return (Opt<Inner>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Inner. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Inner.
     * @apilevel low-level
     */
    public Opt<Inner> getInnerOptNoTransform() {
        return (Opt<Inner>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Outer child. This is the <code>Opt</code>
     * node containing the child Outer, not the actual child!
     * @param opt The new node to be used as the optional node for the Outer child.
     * @apilevel low-level
     */
    public void setOuterOpt(Opt<Outer> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) Outer child.
     * @param node The new node to be used as the Outer child.
     * @apilevel high-level
     */
    public void setOuter(Outer node) {
        getOuterOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Outer child exists.
     * @return {@code true} if the optional Outer child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasOuter() {
        return getOuterOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Outer child.
     * @return The Outer child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Outer getOuter() {
        return (Outer) getOuterOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Outer child. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * @return The optional node for child the Outer child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Outer")
    public Opt<Outer> getOuterOpt() {
        return (Opt<Outer>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Outer. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Outer.
     * @apilevel low-level
     */
    public Opt<Outer> getOuterOptNoTransform() {
        return (Opt<Outer>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Replaceable child. This is the <code>Opt</code>
     * node containing the child Replaceable, not the actual child!
     * @param opt The new node to be used as the optional node for the Replaceable child.
     * @apilevel low-level
     */
    public void setReplaceableOpt(Opt<Replaceable> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) Replaceable child.
     * @param node The new node to be used as the Replaceable child.
     * @apilevel high-level
     */
    public void setReplaceable(Replaceable node) {
        getReplaceableOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Replaceable child exists.
     * @return {@code true} if the optional Replaceable child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasReplaceable() {
        return getReplaceableOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Replaceable child.
     * @return The Replaceable child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Replaceable getReplaceable() {
        return (Replaceable) getReplaceableOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Replaceable child. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * @return The optional node for child the Replaceable child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Replaceable")
    public Opt<Replaceable> getReplaceableOpt() {
        return (Opt<Replaceable>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Replaceable. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Replaceable.
     * @apilevel low-level
     */
    public Opt<Replaceable> getReplaceableOptNoTransform() {
        return (Opt<Replaceable>) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the TypePrefixFlow child. This is the <code>Opt</code>
     * node containing the child TypePrefixFlow, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixFlow child.
     * @apilevel low-level
     */
    public void setTypePrefixFlowOpt(Opt<TypePrefixFlow> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) TypePrefixFlow child.
     * @param node The new node to be used as the TypePrefixFlow child.
     * @apilevel high-level
     */
    public void setTypePrefixFlow(TypePrefixFlow node) {
        getTypePrefixFlowOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixFlow child exists.
     * @return {@code true} if the optional TypePrefixFlow child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixFlow() {
        return getTypePrefixFlowOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixFlow child.
     * @return The TypePrefixFlow child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixFlow getTypePrefixFlow() {
        return (TypePrefixFlow) getTypePrefixFlowOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixFlow child. This is the <code>Opt</code> node containing the child TypePrefixFlow, not the actual child!
     * @return The optional node for child the TypePrefixFlow child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixFlow")
    public Opt<TypePrefixFlow> getTypePrefixFlowOpt() {
        return (Opt<TypePrefixFlow>) getChild(5);
    }
    /**
     * Retrieves the optional node for child TypePrefixFlow. This is the <code>Opt</code> node containing the child TypePrefixFlow, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixFlow.
     * @apilevel low-level
     */
    public Opt<TypePrefixFlow> getTypePrefixFlowOptNoTransform() {
        return (Opt<TypePrefixFlow>) getChildNoTransform(5);
    }
    /**
     * Replaces the optional node for the TypePrefixVariability child. This is the <code>Opt</code>
     * node containing the child TypePrefixVariability, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixVariability child.
     * @apilevel low-level
     */
    public void setTypePrefixVariabilityOpt(Opt<TypePrefixVariability> opt) {
        setChild(opt, 6);
    }
    /**
     * Replaces the (optional) TypePrefixVariability child.
     * @param node The new node to be used as the TypePrefixVariability child.
     * @apilevel high-level
     */
    public void setTypePrefixVariability(TypePrefixVariability node) {
        getTypePrefixVariabilityOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixVariability child exists.
     * @return {@code true} if the optional TypePrefixVariability child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixVariability() {
        return getTypePrefixVariabilityOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixVariability child.
     * @return The TypePrefixVariability child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixVariability getTypePrefixVariability() {
        return (TypePrefixVariability) getTypePrefixVariabilityOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixVariability child. This is the <code>Opt</code> node containing the child TypePrefixVariability, not the actual child!
     * @return The optional node for child the TypePrefixVariability child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixVariability")
    public Opt<TypePrefixVariability> getTypePrefixVariabilityOpt() {
        return (Opt<TypePrefixVariability>) getChild(6);
    }
    /**
     * Retrieves the optional node for child TypePrefixVariability. This is the <code>Opt</code> node containing the child TypePrefixVariability, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixVariability.
     * @apilevel low-level
     */
    public Opt<TypePrefixVariability> getTypePrefixVariabilityOptNoTransform() {
        return (Opt<TypePrefixVariability>) getChildNoTransform(6);
    }
    /**
     * Replaces the optional node for the TypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child TypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setTypePrefixInputOutputOpt(Opt<TypePrefixInputOutput> opt) {
        setChild(opt, 7);
    }
    /**
     * Replaces the (optional) TypePrefixInputOutput child.
     * @param node The new node to be used as the TypePrefixInputOutput child.
     * @apilevel high-level
     */
    public void setTypePrefixInputOutput(TypePrefixInputOutput node) {
        getTypePrefixInputOutputOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixInputOutput child exists.
     * @return {@code true} if the optional TypePrefixInputOutput child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixInputOutput() {
        return getTypePrefixInputOutputOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixInputOutput child.
     * @return The TypePrefixInputOutput child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixInputOutput getTypePrefixInputOutput() {
        return (TypePrefixInputOutput) getTypePrefixInputOutputOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixInputOutput child. This is the <code>Opt</code> node containing the child TypePrefixInputOutput, not the actual child!
     * @return The optional node for child the TypePrefixInputOutput child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixInputOutput")
    public Opt<TypePrefixInputOutput> getTypePrefixInputOutputOpt() {
        return (Opt<TypePrefixInputOutput>) getChild(7);
    }
    /**
     * Retrieves the optional node for child TypePrefixInputOutput. This is the <code>Opt</code> node containing the child TypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<TypePrefixInputOutput> getTypePrefixInputOutputOptNoTransform() {
        return (Opt<TypePrefixInputOutput>) getChildNoTransform(7);
    }
    /**
     * Replaces the ClassName child.
     * @param node The new node to replace the ClassName child.
     * @apilevel high-level
     */
    public void setClassName(Access node) {
        setChild(node, 8);
    }
    /**
     * Retrieves the ClassName child.
     * @return The current node used as the ClassName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ClassName")
    public Access getClassName() {
        return (Access) getChild(8);
    }
    /**
     * Retrieves the ClassName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ClassName child.
     * @apilevel low-level
     */
    public Access getClassNameNoTransform() {
        return (Access) getChildNoTransform(8);
    }
    /**
     * Replaces the optional node for the TypeArraySubscripts child. This is the <code>Opt</code>
     * node containing the child TypeArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the TypeArraySubscripts child.
     * @apilevel low-level
     */
    public void setTypeArraySubscriptsOpt(Opt<ArraySubscripts> opt) {
        setChild(opt, 9);
    }
    /**
     * Replaces the (optional) TypeArraySubscripts child.
     * @param node The new node to be used as the TypeArraySubscripts child.
     * @apilevel high-level
     */
    public void setTypeArraySubscripts(ArraySubscripts node) {
        getTypeArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypeArraySubscripts child exists.
     * @return {@code true} if the optional TypeArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypeArraySubscripts() {
        return getTypeArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypeArraySubscripts child.
     * @return The TypeArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ArraySubscripts getTypeArraySubscripts() {
        return (ArraySubscripts) getTypeArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypeArraySubscripts child. This is the <code>Opt</code> node containing the child TypeArraySubscripts, not the actual child!
     * @return The optional node for child the TypeArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypeArraySubscripts")
    public Opt<ArraySubscripts> getTypeArraySubscriptsOpt() {
        return (Opt<ArraySubscripts>) getChild(9);
    }
    /**
     * Retrieves the optional node for child TypeArraySubscripts. This is the <code>Opt</code> node containing the child TypeArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypeArraySubscripts.
     * @apilevel low-level
     */
    public Opt<ArraySubscripts> getTypeArraySubscriptsOptNoTransform() {
        return (Opt<ArraySubscripts>) getChildNoTransform(9);
    }
    /**
     * Replaces the Name list.
     * @param list The new list node to be used as the Name list.
     * @apilevel high-level
     */
    public void setNameList(List<PN_ComponentDecl> list) {
        setChild(list, 10);
    }
    /**
     * Retrieves the number of children in the Name list.
     * @return Number of children in the Name list.
     * @apilevel high-level
     */
    public int getNumName() {
        return getNameList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Name list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Name list.
     * @apilevel low-level
     */
    public int getNumNameNoTransform() {
        return getNameListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Name list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Name list.
     * @apilevel high-level
     */
    public PN_ComponentDecl getName(int i) {
        return (PN_ComponentDecl) getNameList().getChild(i);
    }
    /**
     * Check whether the Name list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasName() {
        return getNameList().getNumChild() != 0;
    }
    /**
     * Append an element to the Name list.
     * @param node The element to append to the Name list.
     * @apilevel high-level
     */
    public void addName(PN_ComponentDecl node) {
        List<PN_ComponentDecl> list = (parent == null || state == null) ? getNameListNoTransform() : getNameList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addNameNoTransform(PN_ComponentDecl node) {
        List<PN_ComponentDecl> list = getNameListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Name list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setName(PN_ComponentDecl node, int i) {
        List<PN_ComponentDecl> list = getNameList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Name list.
     * @return The node representing the Name list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Name")
    public List<PN_ComponentDecl> getNameList() {
        List<PN_ComponentDecl> list = (List<PN_ComponentDecl>) getChild(10);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Name list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Name list.
     * @apilevel low-level
     */
    public List<PN_ComponentDecl> getNameListNoTransform() {
        return (List<PN_ComponentDecl>) getChildNoTransform(10);
    }
    /**
     * Retrieves the Name list.
     * @return The node representing the Name list.
     * @apilevel high-level
     */
    public List<PN_ComponentDecl> getNames() {
        return getNameList();
    }
    /**
     * Retrieves the Name list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Name list.
     * @apilevel low-level
     */
    public List<PN_ComponentDecl> getNamesNoTransform() {
        return getNameListNoTransform();
    }
    /**
     * Replaces the optional node for the ConstrainingClause child. This is the <code>Opt</code>
     * node containing the child ConstrainingClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClause child.
     * @apilevel low-level
     */
    public void setConstrainingClauseOpt(Opt<ConstrainingClause> opt) {
        setChild(opt, 11);
    }
    /**
     * Replaces the (optional) ConstrainingClause child.
     * @param node The new node to be used as the ConstrainingClause child.
     * @apilevel high-level
     */
    public void setConstrainingClause(ConstrainingClause node) {
        getConstrainingClauseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConstrainingClause child exists.
     * @return {@code true} if the optional ConstrainingClause child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConstrainingClause() {
        return getConstrainingClauseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConstrainingClause child.
     * @return The ConstrainingClause child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ConstrainingClause getConstrainingClause() {
        return (ConstrainingClause) getConstrainingClauseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConstrainingClause child. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * @return The optional node for child the ConstrainingClause child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConstrainingClause")
    public Opt<ConstrainingClause> getConstrainingClauseOpt() {
        return (Opt<ConstrainingClause>) getChild(11);
    }
    /**
     * Retrieves the optional node for child ConstrainingClause. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClause.
     * @apilevel low-level
     */
    public Opt<ConstrainingClause> getConstrainingClauseOptNoTransform() {
        return (Opt<ConstrainingClause>) getChildNoTransform(11);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 12);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(12);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(12);
    }
    /**
     * @attribute inh
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:33
     */
    @ASTNodeAnnotation.Attribute
    public VisibilityType visibility() {
        ASTNode$State state = state();
        VisibilityType visibility_value = getParent().Define_visibility(this, null);

        return visibility_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:286
        state().duringInitialTransformations++;
        ASTNode result = rewriteRule0();
        state().duringInitialTransformations--;
        return result;
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:286
     * @apilevel internal
     */
    private ComponentClause rewriteRule0() {
{
            List l = new List();
         
            for(int i=0;i<getNumName();i++) {
                if (getName(i)!=null) l.add(getName(i));
            }
         
            ComponentClause c = new ComponentClause(getRedeclareOpt(),
                                                    getFinalOpt(),
                                                    getInnerOpt(),
                                                    getOuterOpt(),
                                                    getReplaceableOpt(),
                                                    getTypePrefixFlowOpt(),
                                                    getTypePrefixVariabilityOpt(),
                                                    getTypePrefixInputOutputOpt(),
                                                    getClassName(),
                                                    getTypeArraySubscriptsOpt(),
                                                    visibility(),
                                                    l,
                                                    getConstrainingClauseOpt(),
                                                    getComment());
            c.setLocationNoTree(this);
            //log.debug("PN_ComponentClause->ComponentClause.getStart() = "+c.getStart());
            return c;
        }    }
}
