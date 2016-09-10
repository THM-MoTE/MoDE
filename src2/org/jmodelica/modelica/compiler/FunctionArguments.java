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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:368
 * @production FunctionArguments : {@link SourceBaseNode} ::= <span class="component">{@link Exp}*</span> <span class="component">{@link NamedArgument}*</span>;

 */
public class FunctionArguments extends SourceBaseNode implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:816
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		for (int i=0; i<getNumExp(); i++) {
			p.print(getExp(i),str,indent);
			if (i<getNumExp()-1)
				str.print(",");
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1687
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		Iterator<ASTNode> it = new ChainedIterator<ASTNode>(getExps().iterator(), getNamedArguments().iterator());
		while (it.hasNext()) {
			ASTNode node = it.next();
			node.doPrettyPrintFormatted(printer, printStream);
			if (it.hasNext())
				printStream.print(',');
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public FunctionArguments() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FunctionArguments(List<Exp> p0, List<NamedArgument> p1) {
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
    public FunctionArguments clone() throws CloneNotSupportedException {
        FunctionArguments node = (FunctionArguments) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FunctionArguments copy() {
        try {
            FunctionArguments node = (FunctionArguments) clone();
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
    public FunctionArguments fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FunctionArguments treeCopyNoTransform() {
        FunctionArguments tree = (FunctionArguments) copy();
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
    public FunctionArguments treeCopy() {
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
     * Replaces the Exp list.
     * @param list The new list node to be used as the Exp list.
     * @apilevel high-level
     */
    public void setExpList(List<Exp> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Exp list.
     * @return Number of children in the Exp list.
     * @apilevel high-level
     */
    public int getNumExp() {
        return getExpList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Exp list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Exp list.
     * @apilevel low-level
     */
    public int getNumExpNoTransform() {
        return getExpListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Exp list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Exp list.
     * @apilevel high-level
     */
    public Exp getExp(int i) {
        return (Exp) getExpList().getChild(i);
    }
    /**
     * Check whether the Exp list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasExp() {
        return getExpList().getNumChild() != 0;
    }
    /**
     * Append an element to the Exp list.
     * @param node The element to append to the Exp list.
     * @apilevel high-level
     */
    public void addExp(Exp node) {
        List<Exp> list = (parent == null || state == null) ? getExpListNoTransform() : getExpList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addExpNoTransform(Exp node) {
        List<Exp> list = getExpListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Exp list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setExp(Exp node, int i) {
        List<Exp> list = getExpList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Exp list.
     * @return The node representing the Exp list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Exp")
    public List<Exp> getExpList() {
        List<Exp> list = (List<Exp>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Exp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Exp list.
     * @apilevel low-level
     */
    public List<Exp> getExpListNoTransform() {
        return (List<Exp>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Exp list.
     * @return The node representing the Exp list.
     * @apilevel high-level
     */
    public List<Exp> getExps() {
        return getExpList();
    }
    /**
     * Retrieves the Exp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Exp list.
     * @apilevel low-level
     */
    public List<Exp> getExpsNoTransform() {
        return getExpListNoTransform();
    }
    /**
     * Replaces the NamedArgument list.
     * @param list The new list node to be used as the NamedArgument list.
     * @apilevel high-level
     */
    public void setNamedArgumentList(List<NamedArgument> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the NamedArgument list.
     * @return Number of children in the NamedArgument list.
     * @apilevel high-level
     */
    public int getNumNamedArgument() {
        return getNamedArgumentList().getNumChild();
    }
    /**
     * Retrieves the number of children in the NamedArgument list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the NamedArgument list.
     * @apilevel low-level
     */
    public int getNumNamedArgumentNoTransform() {
        return getNamedArgumentListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the NamedArgument list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the NamedArgument list.
     * @apilevel high-level
     */
    public NamedArgument getNamedArgument(int i) {
        return (NamedArgument) getNamedArgumentList().getChild(i);
    }
    /**
     * Check whether the NamedArgument list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasNamedArgument() {
        return getNamedArgumentList().getNumChild() != 0;
    }
    /**
     * Append an element to the NamedArgument list.
     * @param node The element to append to the NamedArgument list.
     * @apilevel high-level
     */
    public void addNamedArgument(NamedArgument node) {
        List<NamedArgument> list = (parent == null || state == null) ? getNamedArgumentListNoTransform() : getNamedArgumentList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addNamedArgumentNoTransform(NamedArgument node) {
        List<NamedArgument> list = getNamedArgumentListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the NamedArgument list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setNamedArgument(NamedArgument node, int i) {
        List<NamedArgument> list = getNamedArgumentList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the NamedArgument list.
     * @return The node representing the NamedArgument list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="NamedArgument")
    public List<NamedArgument> getNamedArgumentList() {
        List<NamedArgument> list = (List<NamedArgument>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the NamedArgument list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the NamedArgument list.
     * @apilevel low-level
     */
    public List<NamedArgument> getNamedArgumentListNoTransform() {
        return (List<NamedArgument>) getChildNoTransform(1);
    }
    /**
     * Retrieves the NamedArgument list.
     * @return The node representing the NamedArgument list.
     * @apilevel high-level
     */
    public List<NamedArgument> getNamedArguments() {
        return getNamedArgumentList();
    }
    /**
     * Retrieves the NamedArgument list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the NamedArgument list.
     * @apilevel low-level
     */
    public List<NamedArgument> getNamedArgumentsNoTransform() {
        return getNamedArgumentListNoTransform();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
