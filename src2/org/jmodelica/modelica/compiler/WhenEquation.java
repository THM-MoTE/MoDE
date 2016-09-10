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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:313
 * @production WhenEquation : {@link IfWhenEquation};

 */
public class WhenEquation extends IfWhenEquation implements Cloneable {
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2867
     */
    public FIfWhenElseEquation instantiate() {
        return instantiate(new FWhenEquation());
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:439
     */
    @Override
	public FormattingLocator insideFormattingLocator() {
		int line;
		int column;

		if (getComment().hasStringComment()) {
			StringComment stringComment = getComment().getStringComment();
			if (stringComment.preFormatting.isScanned()) {
				line = ((ScannedFormattingItem) stringComment.preFormatting).getStartLine();
				column = ((ScannedFormattingItem) stringComment.preFormatting).getStartColumn();
			} else {
				line = getLine(stringComment.getStart());
				column = getColumn(stringComment.getStart());
			}
		} else if (getComment().hasAnnotation()) {
			Annotation annotation = getComment().getAnnotation();
			if (annotation.preFormatting.isScanned()) {
				line = ((ScannedFormattingItem) annotation.preFormatting).getStartLine();
				column = ((ScannedFormattingItem) annotation.preFormatting).getStartColumn();
			} else {
				line = getLine(annotation.getStart());
				column = getColumn(annotation.getStart());
			}
		} else {
			line = getLine(getEnd());
			column = getColumn(getEnd());
		}

		return new FormattingLocator(FormattingLocator.Locator.END, line, column - 5);
	}
    /**
     * @declaredat ASTNode:1
     */
    public WhenEquation() {
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
        setChild(new Opt(), 0);
        setChild(new List(), 2);
        setChild(new Opt(), 4);
    }
    /**
     * @declaredat ASTNode:16
     */
    public WhenEquation(Opt<AbstractEquationModifier> p0, Comment p1, List<AbstractEquation> p2, Exp p3, Opt<IfWhenElseEquation> p4) {
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
    public WhenEquation clone() throws CloneNotSupportedException {
        WhenEquation node = (WhenEquation) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public WhenEquation copy() {
        try {
            WhenEquation node = (WhenEquation) clone();
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
    public WhenEquation fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:91
     */
    public WhenEquation treeCopyNoTransform() {
        WhenEquation tree = (WhenEquation) copy();
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
    public WhenEquation treeCopy() {
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
     * Replaces the optional node for the AbstractEquationModifier child. This is the <code>Opt</code>
     * node containing the child AbstractEquationModifier, not the actual child!
     * @param opt The new node to be used as the optional node for the AbstractEquationModifier child.
     * @apilevel low-level
     */
    public void setAbstractEquationModifierOpt(Opt<AbstractEquationModifier> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) AbstractEquationModifier child.
     * @param node The new node to be used as the AbstractEquationModifier child.
     * @apilevel high-level
     */
    public void setAbstractEquationModifier(AbstractEquationModifier node) {
        getAbstractEquationModifierOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional AbstractEquationModifier child exists.
     * @return {@code true} if the optional AbstractEquationModifier child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasAbstractEquationModifier() {
        return getAbstractEquationModifierOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) AbstractEquationModifier child.
     * @return The AbstractEquationModifier child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public AbstractEquationModifier getAbstractEquationModifier() {
        return (AbstractEquationModifier) getAbstractEquationModifierOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the AbstractEquationModifier child. This is the <code>Opt</code> node containing the child AbstractEquationModifier, not the actual child!
     * @return The optional node for child the AbstractEquationModifier child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="AbstractEquationModifier")
    public Opt<AbstractEquationModifier> getAbstractEquationModifierOpt() {
        return (Opt<AbstractEquationModifier>) getChild(0);
    }
    /**
     * Retrieves the optional node for child AbstractEquationModifier. This is the <code>Opt</code> node containing the child AbstractEquationModifier, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child AbstractEquationModifier.
     * @apilevel low-level
     */
    public Opt<AbstractEquationModifier> getAbstractEquationModifierOptNoTransform() {
        return (Opt<AbstractEquationModifier>) getChildNoTransform(0);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(1);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(1);
    }
    /**
     * Replaces the AbstractEquation list.
     * @param list The new list node to be used as the AbstractEquation list.
     * @apilevel high-level
     */
    public void setAbstractEquationList(List<AbstractEquation> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the AbstractEquation list.
     * @return Number of children in the AbstractEquation list.
     * @apilevel high-level
     */
    public int getNumAbstractEquation() {
        return getAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the AbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the AbstractEquation list.
     * @apilevel low-level
     */
    public int getNumAbstractEquationNoTransform() {
        return getAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the AbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the AbstractEquation list.
     * @apilevel high-level
     */
    public AbstractEquation getAbstractEquation(int i) {
        return (AbstractEquation) getAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the AbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAbstractEquation() {
        return getAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the AbstractEquation list.
     * @param node The element to append to the AbstractEquation list.
     * @apilevel high-level
     */
    public void addAbstractEquation(AbstractEquation node) {
        List<AbstractEquation> list = (parent == null || state == null) ? getAbstractEquationListNoTransform() : getAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAbstractEquationNoTransform(AbstractEquation node) {
        List<AbstractEquation> list = getAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the AbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAbstractEquation(AbstractEquation node, int i) {
        List<AbstractEquation> list = getAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the AbstractEquation list.
     * @return The node representing the AbstractEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="AbstractEquation")
    public List<AbstractEquation> getAbstractEquationList() {
        List<AbstractEquation> list = (List<AbstractEquation>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the AbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AbstractEquation list.
     * @apilevel low-level
     */
    public List<AbstractEquation> getAbstractEquationListNoTransform() {
        return (List<AbstractEquation>) getChildNoTransform(2);
    }
    /**
     * Retrieves the AbstractEquation list.
     * @return The node representing the AbstractEquation list.
     * @apilevel high-level
     */
    public List<AbstractEquation> getAbstractEquations() {
        return getAbstractEquationList();
    }
    /**
     * Retrieves the AbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AbstractEquation list.
     * @apilevel low-level
     */
    public List<AbstractEquation> getAbstractEquationsNoTransform() {
        return getAbstractEquationListNoTransform();
    }
    /**
     * Replaces the Test child.
     * @param node The new node to replace the Test child.
     * @apilevel high-level
     */
    public void setTest(Exp node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the Test child.
     * @return The current node used as the Test child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Test")
    public Exp getTest() {
        return (Exp) getChild(3);
    }
    /**
     * Retrieves the Test child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Test child.
     * @apilevel low-level
     */
    public Exp getTestNoTransform() {
        return (Exp) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Else child. This is the <code>Opt</code>
     * node containing the child Else, not the actual child!
     * @param opt The new node to be used as the optional node for the Else child.
     * @apilevel low-level
     */
    public void setElseOpt(Opt<IfWhenElseEquation> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) Else child.
     * @param node The new node to be used as the Else child.
     * @apilevel high-level
     */
    public void setElse(IfWhenElseEquation node) {
        getElseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Else child exists.
     * @return {@code true} if the optional Else child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasElse() {
        return getElseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Else child.
     * @return The Else child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public IfWhenElseEquation getElse() {
        return (IfWhenElseEquation) getElseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * @return The optional node for child the Else child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Else")
    public Opt<IfWhenElseEquation> getElseOpt() {
        return (Opt<IfWhenElseEquation>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Else.
     * @apilevel low-level
     */
    public Opt<IfWhenElseEquation> getElseOptNoTransform() {
        return (Opt<IfWhenElseEquation>) getChildNoTransform(4);
    }
    @ASTNodeAnnotation.Attribute
    public String keyword() {
        ASTNode$State state = state();
        String keyword_value = "when";

        return keyword_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
