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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:306
 * @production AbstractEquation : {@link SourceBaseNode} ::= <span class="component">[{@link AbstractEquationModifier}]</span> <span class="component">{@link Comment}</span>;

 */
public abstract class AbstractEquation extends SourceBaseNode implements Cloneable {
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2816
     */
    public FEquationType equationType() {
        return isInitial() ? new FInitialEquation() : new FNormalEquation();
    }
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2824
     */
    public FAbstractEquation instantiate() {
        return contribute(copyLocationTo(new FUnsupportedEquation(equationType())));
    }
    /**
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3361
     */
    
        public <N extends FAbstractEquation> N contribute(N equation) {
            for (AttributeContributer contributer : attributeContributers())
                contributer.contribute(this, equation);
            return equation;
        }
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:263
     */
    public void addToFullClassDecl(FullClassDecl fcd) {
        fcd.addEquation(this);
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:734
     */
    @Override
	protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		preFormatting = inheritFormatting(indentation);
		if (getComment().hasStringComment()) {
			getComment().getStringComment().preFormatting = new DefaultFormattingItem(" ");
		} else if (getComment().hasAnnotation()) {
			getComment().getAnnotation().preFormatting = new DefaultFormattingItem(" ");
		}
		postFormatting = postFormatting.mergeItems(FormattingItem.Adjacency.FRONT, new DefaultFormattingItem("\n"));
		return false;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:746
     */
    private FormattingItem inheritFormatting(DefaultFormattingIndentation indentation) {
		if (getParent() instanceof List && getParent().getParent() instanceof FullClassDecl) {
			List<Clause> clauseList = (List<Clause>) ((FullClassDecl) getParent().getParent()).originalComposition.getClauses();

			for (Clause clause : clauseList) {
				if (clause instanceof EquationClause) {
					int thisIndex = ((EquationClause) clause).getAbstractEquations().getIndexOfChild(this);
					if (thisIndex > 0) {
						return ((EquationClause) clause).getAbstractEquations().getChild(thisIndex - 1).preFormatting.copyWhitepacesFromFormatting();
					} else if (thisIndex == 0) {
						return new DefaultFormattingItem("\n" + indentation.toString());
					}
				}
			}
		}

		return preFormatting.mergeItems(FormattingItem.Adjacency.BACK, new DefaultFormattingItem(indentation.toString()));
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1020
     */
    void doPrettyPrintFormatted(Printer printer, CodeStream printStream) {
		printStream.print(preFormatting);
		prettyPrintFormattedHelper(printer, printStream);
		printStream.print(";");
		printStream.print(postFormatting);
	}
    /**
     * @declaredat ASTNode:1
     */
    public AbstractEquation() {
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
    }
    /**
     * @declaredat ASTNode:14
     */
    public AbstractEquation(Opt<AbstractEquationModifier> p0, Comment p1) {
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
    public AbstractEquation clone() throws CloneNotSupportedException {
        AbstractEquation node = (AbstractEquation) super.clone();
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
    public abstract AbstractEquation fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:69
     */
    public abstract AbstractEquation treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:77
     */
    public abstract AbstractEquation treeCopy();
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
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getComment().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInitial() {
        ASTNode$State state = state();
        boolean isInitial_value = hasAbstractEquationModifier() && getAbstractEquationModifier().isInitial();

        return isInitial_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
