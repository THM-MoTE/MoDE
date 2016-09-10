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
 * \package org.jmodelica.ast Package containing all AST classes.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:59
 * @production SourceBaseNode : {@link BaseNode};

 */
public abstract class SourceBaseNode extends BaseNode implements Cloneable {
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:94
     */
    protected FormattingItem preFormatting = FormattingItem.NOT_FORMATTED;
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:95
     */
    protected FormattingItem insideFormatting = FormattingItem.NOT_FORMATTED;
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:96
     */
    protected FormattingItem postFormatting = FormattingItem.NOT_FORMATTED;
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:98
     */
    public boolean hasBeenFormatted() {
		return (preFormatting != FormattingItem.NOT_FORMATTED);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:113
     */
    @Override
	public void propagateFormatting() {
		getParent().propagateFormatting();
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:164
     */
    @Override
	protected void addFormattingInformation(FormattingInfo formattingInfo) {
		if (hasBeenFormatted() || shouldNotBeFormatted())
			return;
		
		if (formattingInfo != null && !shouldOnlyFormatChildren()) {
			addPreFormatting(formattingInfo);
			addPostFormatting(formattingInfo);
		}
		
		super.addFormattingInformation(formattingInfo);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:192
     */
    public void addPreFormatting(FormattingInfo formattingInfo) {
		preFormatting = formattingInfo.getFrontAdjacentFormatting(this);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:196
     */
    public void addPostFormatting(FormattingInfo formattingInfo) {
		postFormatting = formattingInfo.getBackAdjacentFormatting(this);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:216
     */
    @Override
	public void addFormattingRest(FormattingInfo formattingInfo) {
		if (shouldNotBeFormatted())
			return;
		preFormatting = formattingInfo.addFormattingRest(preFormatting);
		postFormatting = formattingInfo.addFormattingRest(postFormatting);
		super.addFormattingRest(formattingInfo);
		addInsideFormatting(formattingInfo);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:226
     */
    public void addInsideFormatting(FormattingInfo formattingInfo) {
		if (insideFormatting != FormattingItem.NOT_FORMATTED)
			return;
		FormattingLocator locator = insideFormattingLocator();
		if (locator == null)
			return;
		insideFormatting = formattingInfo.getInsideFormatting(locator);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:235
     */
    public FormattingLocator insideFormattingLocator() {
		return null;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:531
     */
    @Override
	protected void setDefaultFormatting(DefaultFormattingIndentation indentation) {
		if (hasBeenFormatted()) {
			for (ASTNode node : this) {
				node.setDefaultFormatting(indentation);
			}
			return;
		}
		boolean addedIndentation = setDefaultFormattingHelper(indentation);
		for (ASTNode node : this) {
			node.setDefaultFormatting(indentation);
		}
		if (addedIndentation) {
			indentation.stepOut();
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:548
     */
    protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		return false;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1014
     */
    void doPrettyPrintFormatted(Printer printer, CodeStream printStream) {
		printStream.print(preFormatting);
		prettyPrintFormattedHelper(printer, printStream);
		printStream.print(postFormatting);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1041
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		for (ASTNode childNode: this) {
			childNode.doPrettyPrintFormatted(printer, printStream);
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2032
     */
    void copyFormattingFrom(ASTNode node) {
		if (this.getClass() != node.getClass())
			return;
		SourceBaseNode bn = (SourceBaseNode) node;
		node.propagateFormatting();
		preFormatting = bn.preFormatting;
		postFormatting = bn.postFormatting;
		super.copyFormattingFrom(node);
	}
    /**
     * @declaredat ASTNode:1
     */
    public SourceBaseNode() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:39
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public SourceBaseNode clone() throws CloneNotSupportedException {
        SourceBaseNode node = (SourceBaseNode) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:56
     */
    public abstract SourceBaseNode fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract SourceBaseNode treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract SourceBaseNode treeCopy();
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2049
     */
    @ASTNodeAnnotation.Attribute
    public int numberOfDefaultFormattingItems() {
        ASTNode$State state = state();
        try {
        		int result = 0;
        		if (!preFormatting.isScanned() && !preFormatting.isEmptyDefault()) {
        			++result;
        		}
        		if (!insideFormatting.isScanned() && !insideFormatting.isEmptyDefault()) {
        			++result;
        		}
        		if (!postFormatting.isScanned() && !postFormatting.isEmptyDefault()) {
        			++result;
        		}
        		for (ASTNode node : this) {
        			result += node.numberOfDefaultFormattingItems();
        		}
        		return result;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2074
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<SourceBaseNode> nonScannedNodes() {
        ASTNode$State state = state();
        try {
        		ArrayList<SourceBaseNode> result = new ArrayList<SourceBaseNode>();
        		if (!preFormatting.isScanned() && !preFormatting.isEmptyDefault()) {
        			result.add(this);
        		} else if (!insideFormatting.isScanned() && !insideFormatting.isEmptyDefault()) {
        			result.add(this);
        		} else if (!postFormatting.isScanned() && !postFormatting.isEmptyDefault()) {
        			result.add(this);
        		}
        		for (ASTNode node : this) {
        			result.addAll(node.nonScannedNodes());
        		}
        		return result;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2097
     */
    @ASTNodeAnnotation.Attribute
    public SourceBaseNode ownsFormattingItem(int startLine, int startColumn) {
        ASTNode$State state = state();
        try {
        		if (preFormatting.isScanned() && ((ScannedFormattingItem) preFormatting).getStartLine() == startLine && ((ScannedFormattingItem) preFormatting).getStartColumn() == startColumn) {
        			return this;
        		}
        		if (insideFormatting.isScanned() && ((ScannedFormattingItem) insideFormatting).getStartLine() == startLine && ((ScannedFormattingItem) insideFormatting).getStartColumn() == startColumn) {
        			return this;
        		}
        		if (postFormatting.isScanned() && ((ScannedFormattingItem) postFormatting).getStartLine() == startLine && ((ScannedFormattingItem) postFormatting).getStartColumn() == startColumn) {
        			return this;
        		}
        
        		SourceBaseNode owner = null;
        		for (ASTNode node : this) {
        			owner = node.ownsFormattingItem(startLine, startColumn);
        			if (owner != null) {
        				return owner;
        			}
        		}
        
        		return null;
        	}
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:154
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldNotBeFormatted() {
        ASTNode$State state = state();
        boolean shouldNotBeFormatted_value = getParent().Define_shouldNotBeFormatted(this, null);

        return shouldNotBeFormatted_value;
    }
    /**
     * @attribute inh
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:160
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldOnlyFormatChildren() {
        ASTNode$State state = state();
        boolean shouldOnlyFormatChildren_value = getParent().Define_shouldOnlyFormatChildren(this, null);

        return shouldOnlyFormatChildren_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
