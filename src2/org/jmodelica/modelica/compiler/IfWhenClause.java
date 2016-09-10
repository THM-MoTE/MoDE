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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:333
 * @production IfWhenClause : {@link SourceBaseNode} ::= <span class="component">Test:{@link Exp}</span> <span class="component">{@link Statement}*</span>;

 */
public abstract class IfWhenClause extends SourceBaseNode implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:491
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		p.print(getTest(), str, indent);
		str.println(" then");
		for (Statement s : getStatements()) {
			p.print(s, str, indent + "  ");
		}
	}
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2987
     */
    public FIfWhenClause instantiate() {
        FExp t = getTest().instantiate();
        List l = Statement.instantiateStatementList(getStatements());
        FIfWhenClause c = instantiateIfWhenClause(t, l);
        c.setLocation(this);
        return c;
    }
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2995
     */
    protected abstract FIfWhenClause instantiateIfWhenClause(FExp t, List l);
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:721
     */
    @Override
	protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		getTest().preFormatting = new DefaultFormattingItem(" ");
		getTest().postFormatting = new DefaultFormattingItem(" ");
		if (getNumStatement() > 0) {
			getStatement(0).preFormatting = new DefaultFormattingItem("\n");
			indentation.stepOut();
			getStatement(getNumStatement() - 1).postFormatting = new DefaultFormattingItem(indentation.toString());
			indentation.stepIn();
		}
		return super.setDefaultFormattingHelper(indentation);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1545
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		getTest().doPrettyPrintFormatted(printer, printStream);
		printStream.print("then");
		for (Statement statement : getStatements()) {
			statement.doPrettyPrintFormatted(printer, printStream);
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public IfWhenClause() {
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
    public IfWhenClause(Exp p0, List<Statement> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public boolean mayHaveRewrite() {
        return false;
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
    public IfWhenClause clone() throws CloneNotSupportedException {
        IfWhenClause node = (IfWhenClause) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:62
     */
    public abstract IfWhenClause fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:69
     */
    public abstract IfWhenClause treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:77
     */
    public abstract IfWhenClause treeCopy();
    /**
     * Replaces the Test child.
     * @param node The new node to replace the Test child.
     * @apilevel high-level
     */
    public void setTest(Exp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Test child.
     * @return The current node used as the Test child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Test")
    public Exp getTest() {
        return (Exp) getChild(0);
    }
    /**
     * Retrieves the Test child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Test child.
     * @apilevel low-level
     */
    public Exp getTestNoTransform() {
        return (Exp) getChildNoTransform(0);
    }
    /**
     * Replaces the Statement list.
     * @param list The new list node to be used as the Statement list.
     * @apilevel high-level
     */
    public void setStatementList(List<Statement> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Statement list.
     * @return Number of children in the Statement list.
     * @apilevel high-level
     */
    public int getNumStatement() {
        return getStatementList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Statement list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Statement list.
     * @apilevel low-level
     */
    public int getNumStatementNoTransform() {
        return getStatementListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Statement list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Statement list.
     * @apilevel high-level
     */
    public Statement getStatement(int i) {
        return (Statement) getStatementList().getChild(i);
    }
    /**
     * Check whether the Statement list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasStatement() {
        return getStatementList().getNumChild() != 0;
    }
    /**
     * Append an element to the Statement list.
     * @param node The element to append to the Statement list.
     * @apilevel high-level
     */
    public void addStatement(Statement node) {
        List<Statement> list = (parent == null || state == null) ? getStatementListNoTransform() : getStatementList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addStatementNoTransform(Statement node) {
        List<Statement> list = getStatementListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Statement list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setStatement(Statement node, int i) {
        List<Statement> list = getStatementList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Statement list.
     * @return The node representing the Statement list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Statement")
    public List<Statement> getStatementList() {
        List<Statement> list = (List<Statement>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Statement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Statement list.
     * @apilevel low-level
     */
    public List<Statement> getStatementListNoTransform() {
        return (List<Statement>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Statement list.
     * @return The node representing the Statement list.
     * @apilevel high-level
     */
    public List<Statement> getStatements() {
        return getStatementList();
    }
    /**
     * Retrieves the Statement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Statement list.
     * @apilevel low-level
     */
    public List<Statement> getStatementsNoTransform() {
        return getStatementListNoTransform();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
