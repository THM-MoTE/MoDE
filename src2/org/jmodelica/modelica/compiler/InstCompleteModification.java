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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:178
 * @production InstCompleteModification : {@link InstModification} ::= <span class="component">{@link InstClassModification}</span> <span class="component">[{@link InstValueModification}]</span>;

 */
public class InstCompleteModification extends InstModification implements Cloneable {
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:156
     */
    public boolean contentCheckExtendsOperatorRecord(ErrorCheckType checkType) {
        return getInstClassModification().contentCheckExtendsOperatorRecord(checkType) && 
                (!hasInstValueModification() || getInstValueModification().contentCheckExtendsOperatorRecord(checkType));
    }
    /**
     * @aspect InstModifications
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:206
     */
    public ArrayList<InstModification> expand() {
		ArrayList<InstModification> l = new ArrayList<InstModification>();
		for (InstModification im : getInstClassModification().getInstArguments())
			l.add(im);
		if (hasInstValueModification())
			l.add(getInstValueModification());
		return l;	
		
	}
    /**
     * @declaredat ASTNode:1
     */
    public InstCompleteModification() {
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
        setChild(new Opt(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public InstCompleteModification(Modification p0, InstClassModification p1, Opt<InstValueModification> p2) {
        setModification(p0);
        setChild(p1, 0);
        setChild(p2, 1);
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
    public InstCompleteModification clone() throws CloneNotSupportedException {
        InstCompleteModification node = (InstCompleteModification) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public InstCompleteModification copy() {
        try {
            InstCompleteModification node = (InstCompleteModification) clone();
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
    public InstCompleteModification fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public InstCompleteModification treeCopyNoTransform() {
        InstCompleteModification tree = (InstCompleteModification) copy();
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
    public InstCompleteModification treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:114
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenModification_Modification == ((InstCompleteModification)node).tokenModification_Modification);    
    }
    /**
     * Replaces the lexeme Modification.
     * @param value The new value for the lexeme Modification.
     * @apilevel high-level
     */
    public void setModification(Modification value) {
        tokenModification_Modification = value;
    }
    /**
     * Retrieves the value for the lexeme Modification.
     * @return The value for the lexeme Modification.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Modification")
    public Modification getModification() {
        return tokenModification_Modification;
    }
    /**
     * Replaces the InstClassModification child.
     * @param node The new node to replace the InstClassModification child.
     * @apilevel high-level
     */
    public void setInstClassModification(InstClassModification node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the InstClassModification child.
     * @return The current node used as the InstClassModification child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstClassModification")
    public InstClassModification getInstClassModification() {
        return (InstClassModification) getChild(0);
    }
    /**
     * Retrieves the InstClassModification child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstClassModification child.
     * @apilevel low-level
     */
    public InstClassModification getInstClassModificationNoTransform() {
        return (InstClassModification) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the InstValueModification child. This is the <code>Opt</code>
     * node containing the child InstValueModification, not the actual child!
     * @param opt The new node to be used as the optional node for the InstValueModification child.
     * @apilevel low-level
     */
    public void setInstValueModificationOpt(Opt<InstValueModification> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) InstValueModification child.
     * @param node The new node to be used as the InstValueModification child.
     * @apilevel high-level
     */
    public void setInstValueModification(InstValueModification node) {
        getInstValueModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstValueModification child exists.
     * @return {@code true} if the optional InstValueModification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstValueModification() {
        return getInstValueModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstValueModification child.
     * @return The InstValueModification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstValueModification getInstValueModification() {
        return (InstValueModification) getInstValueModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstValueModification child. This is the <code>Opt</code> node containing the child InstValueModification, not the actual child!
     * @return The optional node for child the InstValueModification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstValueModification")
    public Opt<InstValueModification> getInstValueModificationOpt() {
        return (Opt<InstValueModification>) getChild(1);
    }
    /**
     * Retrieves the optional node for child InstValueModification. This is the <code>Opt</code> node containing the child InstValueModification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstValueModification.
     * @apilevel low-level
     */
    public Opt<InstValueModification> getInstValueModificationOptNoTransform() {
        return (Opt<InstValueModification>) getChildNoTransform(1);
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstValueMod() {
        ASTNode$State state = state();
        boolean hasInstValueMod_value = hasInstValueModification();

        return hasInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp instValueMod() {
        ASTNode$State state = state();
        FExp instValueMod_value = getInstValueModification().getFExp();

        return instValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstValueModification getInstValueMod() {
        ASTNode$State state = state();
        InstValueModification getInstValueMod_value = getInstValueModification();

        return getInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasValue() {
        ASTNode$State state = state();
        boolean hasValue_value = hasInstValueModification();

        return hasValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean allModificationsMatchesSize(Size s) {
        ASTNode$State state = state();
        boolean allModificationsMatchesSize_Size_value = getInstClassModification().allModificationsMatchesSize(s) && 
                (!hasInstValueModification() || getInstValueModification().allModificationsMatchesSize(s));

        return allModificationsMatchesSize_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public CompleteModification getCompleteModification() {
        ASTNode$State state = state();
        CompleteModification getCompleteModification_value = (CompleteModification)  modification();

        return getCompleteModification_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:568
     */
    @ASTNodeAnnotation.Attribute
    public InstModification matchInstModification(String name) {
        ASTNode$State state = state();
        try {
                for (InstModification im : getInstClassModification().getInstArguments()) {
                    InstModification match = im.matchInstModification(name);
                    if (match != null)
                        return match;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:194
     * @apilevel internal
     */
    public boolean Define_isForAttributeOnOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        if (caller == getInstValueModificationOptNoTransform()) {
            return // TODO: not needed?
                    isForAttributeOnOperatorRecordDeclarationMember();
        }
        else {
            return getParent().Define_isForAttributeOnOperatorRecordDeclarationMember(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
