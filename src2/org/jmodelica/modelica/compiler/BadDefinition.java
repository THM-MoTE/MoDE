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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Error.ast:17
 * @production BadDefinition : {@link StoredDefinition};

 */
public class BadDefinition extends StoredDefinition implements Cloneable {
    /**
     * @aspect ErrorClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorClasses.jrag:41
     */
    public Iterator<ASTNode> iterator() {
		return Collections.<ASTNode>emptyList().iterator();
	}
    /**
     * @aspect ErrorClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorClasses.jrag:86
     */
    private BadNodeInfo badNodeInfo = null;
    /**
     * @aspect ErrorClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorClasses.jrag:92
     */
    public BadNodeInfo badInfo() {
		if (badNodeInfo == null)
			badNodeInfo = new BadNodeInfo(this);
		return badNodeInfo;
	}
    /**
     * @aspect ErrorClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorClasses.jrag:125
     */
    public void collectErrors(ErrorCheckType checkType) {
		if (badNodeInfo != null)
			badNodeInfo.collectErrors(checkType);
		super.collectErrors(checkType);
	}
    /**
     * @declaredat ASTNode:1
     */
    public BadDefinition() {
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
        setChild(new Opt(), 0);
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public BadDefinition(Opt<Within> p0, List<Element> p1) {
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
    public BadDefinition clone() throws CloneNotSupportedException {
        BadDefinition node = (BadDefinition) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public BadDefinition copy() {
        try {
            BadDefinition node = (BadDefinition) clone();
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
    public BadDefinition fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public BadDefinition treeCopyNoTransform() {
        BadDefinition tree = (BadDefinition) copy();
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
    public BadDefinition treeCopy() {
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
     * Replaces the optional node for the Within child. This is the <code>Opt</code>
     * node containing the child Within, not the actual child!
     * @param opt The new node to be used as the optional node for the Within child.
     * @apilevel low-level
     */
    public void setWithinOpt(Opt<Within> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) Within child.
     * @param node The new node to be used as the Within child.
     * @apilevel high-level
     */
    public void setWithin(Within node) {
        getWithinOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Within child exists.
     * @return {@code true} if the optional Within child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasWithin() {
        return getWithinOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Within child.
     * @return The Within child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Within getWithin() {
        return (Within) getWithinOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Within child. This is the <code>Opt</code> node containing the child Within, not the actual child!
     * @return The optional node for child the Within child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Within")
    public Opt<Within> getWithinOpt() {
        return (Opt<Within>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Within. This is the <code>Opt</code> node containing the child Within, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Within.
     * @apilevel low-level
     */
    public Opt<Within> getWithinOptNoTransform() {
        return (Opt<Within>) getChildNoTransform(0);
    }
    /**
     * Replaces the Element list.
     * @param list The new list node to be used as the Element list.
     * @apilevel high-level
     */
    public void setElementList(List<Element> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Element list.
     * @return Number of children in the Element list.
     * @apilevel high-level
     */
    public int getNumElement() {
        return getElementList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Element list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Element list.
     * @apilevel low-level
     */
    public int getNumElementNoTransform() {
        return getElementListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Element list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Element list.
     * @apilevel high-level
     */
    public Element getElement(int i) {
        return (Element) getElementList().getChild(i);
    }
    /**
     * Check whether the Element list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElement() {
        return getElementList().getNumChild() != 0;
    }
    /**
     * Append an element to the Element list.
     * @param node The element to append to the Element list.
     * @apilevel high-level
     */
    public void addElement(Element node) {
        List<Element> list = (parent == null || state == null) ? getElementListNoTransform() : getElementList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementNoTransform(Element node) {
        List<Element> list = getElementListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Element list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElement(Element node, int i) {
        List<Element> list = getElementList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Element list.
     * @return The node representing the Element list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Element")
    public List<Element> getElementList() {
        List<Element> list = (List<Element>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Element list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Element list.
     * @apilevel low-level
     */
    public List<Element> getElementListNoTransform() {
        return (List<Element>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Element list.
     * @return The node representing the Element list.
     * @apilevel high-level
     */
    public List<Element> getElements() {
        return getElementList();
    }
    /**
     * Retrieves the Element list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Element list.
     * @apilevel low-level
     */
    public List<Element> getElementsNoTransform() {
        return getElementListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public boolean isError() {
        ASTNode$State state = state();
        boolean isError_value = true;

        return isError_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
