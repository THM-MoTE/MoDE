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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:133
 * @production ExtendsClauseShortClass : {@link ExtendsClause} ::= <span class="component">[{@link TypePrefixFlow}]</span> <span class="component">[{@link TypePrefixVariability}]</span> <span class="component">[{@link TypePrefixInputOutput}]</span> <span class="component">[{@link ArraySubscripts}]</span> <span class="component">{@link Comment}</span>;

 */
public class ExtendsClauseShortClass extends ExtendsClause implements Cloneable {
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1478
     */
    public InstNormalExtends newEmptyInstExtends(InstNode lookup) {
        InstExtendsShortClass res = new InstExtendsShortClass();
        res.setLookupNode(lookup);
        return res;
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1101
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		if (hasTypePrefixInputOutput())
			getTypePrefixInputOutput().doPrettyPrintFormatted(printer, printStream);
		getSuper().doPrettyPrintFormatted(printer, printStream);

		if (hasArraySubscripts()) {
			getArraySubscripts().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasClassModification()) {
			getClassModification().doPrettyPrintFormatted(printer, printStream);
		}
		getComment().prettyPrintFormattedHelper(printer, printStream);
	}
    /**
     * @declaredat ASTNode:1
     */
    public ExtendsClauseShortClass() {
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
        children = new ASTNode[9];
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new Opt(), 5);
        setChild(new Opt(), 6);
        setChild(new Opt(), 7);
    }
    /**
     * @declaredat ASTNode:19
     */
    public ExtendsClauseShortClass(VisibilityType p0, Access p1, Opt<ClassModification> p2, Opt<Annotation> p3, Opt<TypePrefixFlow> p4, Opt<TypePrefixVariability> p5, Opt<TypePrefixInputOutput> p6, Opt<ArraySubscripts> p7, Comment p8) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
        setChild(p6, 6);
        setChild(p7, 7);
        setChild(p8, 8);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:33
     */
    protected int numChildren() {
        return 9;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:57
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public ExtendsClauseShortClass clone() throws CloneNotSupportedException {
        ExtendsClauseShortClass node = (ExtendsClauseShortClass) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:70
     */
    public ExtendsClauseShortClass copy() {
        try {
            ExtendsClauseShortClass node = (ExtendsClauseShortClass) clone();
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
     * @declaredat ASTNode:89
     */
    public ExtendsClauseShortClass fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:98
     */
    public ExtendsClauseShortClass treeCopyNoTransform() {
        ExtendsClauseShortClass tree = (ExtendsClauseShortClass) copy();
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
     * @declaredat ASTNode:118
     */
    public ExtendsClauseShortClass treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:125
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the VisibilityType child.
     * @param node The new node to replace the VisibilityType child.
     * @apilevel high-level
     */
    public void setVisibilityType(VisibilityType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the VisibilityType child.
     * @return The current node used as the VisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="VisibilityType")
    public VisibilityType getVisibilityType() {
        return (VisibilityType) getChild(0);
    }
    /**
     * Retrieves the VisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the VisibilityType child.
     * @apilevel low-level
     */
    public VisibilityType getVisibilityTypeNoTransform() {
        return (VisibilityType) getChildNoTransform(0);
    }
    /**
     * Replaces the Super child.
     * @param node The new node to replace the Super child.
     * @apilevel high-level
     */
    public void setSuper(Access node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Super child.
     * @return The current node used as the Super child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Super")
    public Access getSuper() {
        return (Access) getChild(1);
    }
    /**
     * Retrieves the Super child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Super child.
     * @apilevel low-level
     */
    public Access getSuperNoTransform() {
        return (Access) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the ClassModification child. This is the <code>Opt</code>
     * node containing the child ClassModification, not the actual child!
     * @param opt The new node to be used as the optional node for the ClassModification child.
     * @apilevel low-level
     */
    public void setClassModificationOpt(Opt<ClassModification> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) ClassModification child.
     * @param node The new node to be used as the ClassModification child.
     * @apilevel high-level
     */
    public void setClassModification(ClassModification node) {
        getClassModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ClassModification child exists.
     * @return {@code true} if the optional ClassModification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasClassModification() {
        return getClassModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ClassModification child.
     * @return The ClassModification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ClassModification getClassModification() {
        return (ClassModification) getClassModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ClassModification child. This is the <code>Opt</code> node containing the child ClassModification, not the actual child!
     * @return The optional node for child the ClassModification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ClassModification")
    public Opt<ClassModification> getClassModificationOpt() {
        return (Opt<ClassModification>) getChild(2);
    }
    /**
     * Retrieves the optional node for child ClassModification. This is the <code>Opt</code> node containing the child ClassModification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ClassModification.
     * @apilevel low-level
     */
    public Opt<ClassModification> getClassModificationOptNoTransform() {
        return (Opt<ClassModification>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Annotation child. This is the <code>Opt</code>
     * node containing the child Annotation, not the actual child!
     * @param opt The new node to be used as the optional node for the Annotation child.
     * @apilevel low-level
     */
    public void setAnnotationOpt(Opt<Annotation> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) Annotation child.
     * @param node The new node to be used as the Annotation child.
     * @apilevel high-level
     */
    public void setAnnotation(Annotation node) {
        getAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Annotation child exists.
     * @return {@code true} if the optional Annotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasAnnotation() {
        return getAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Annotation child.
     * @return The Annotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Annotation getAnnotation() {
        return (Annotation) getAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Annotation child. This is the <code>Opt</code> node containing the child Annotation, not the actual child!
     * @return The optional node for child the Annotation child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Annotation")
    public Opt<Annotation> getAnnotationOpt() {
        return (Opt<Annotation>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Annotation. This is the <code>Opt</code> node containing the child Annotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Annotation.
     * @apilevel low-level
     */
    public Opt<Annotation> getAnnotationOptNoTransform() {
        return (Opt<Annotation>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the TypePrefixFlow child. This is the <code>Opt</code>
     * node containing the child TypePrefixFlow, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixFlow child.
     * @apilevel low-level
     */
    public void setTypePrefixFlowOpt(Opt<TypePrefixFlow> opt) {
        setChild(opt, 4);
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
        return (Opt<TypePrefixFlow>) getChild(4);
    }
    /**
     * Retrieves the optional node for child TypePrefixFlow. This is the <code>Opt</code> node containing the child TypePrefixFlow, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixFlow.
     * @apilevel low-level
     */
    public Opt<TypePrefixFlow> getTypePrefixFlowOptNoTransform() {
        return (Opt<TypePrefixFlow>) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the TypePrefixVariability child. This is the <code>Opt</code>
     * node containing the child TypePrefixVariability, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixVariability child.
     * @apilevel low-level
     */
    public void setTypePrefixVariabilityOpt(Opt<TypePrefixVariability> opt) {
        setChild(opt, 5);
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
        return (Opt<TypePrefixVariability>) getChild(5);
    }
    /**
     * Retrieves the optional node for child TypePrefixVariability. This is the <code>Opt</code> node containing the child TypePrefixVariability, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixVariability.
     * @apilevel low-level
     */
    public Opt<TypePrefixVariability> getTypePrefixVariabilityOptNoTransform() {
        return (Opt<TypePrefixVariability>) getChildNoTransform(5);
    }
    /**
     * Replaces the optional node for the TypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child TypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setTypePrefixInputOutputOpt(Opt<TypePrefixInputOutput> opt) {
        setChild(opt, 6);
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
        return (Opt<TypePrefixInputOutput>) getChild(6);
    }
    /**
     * Retrieves the optional node for child TypePrefixInputOutput. This is the <code>Opt</code> node containing the child TypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<TypePrefixInputOutput> getTypePrefixInputOutputOptNoTransform() {
        return (Opt<TypePrefixInputOutput>) getChildNoTransform(6);
    }
    /**
     * Replaces the optional node for the ArraySubscripts child. This is the <code>Opt</code>
     * node containing the child ArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the ArraySubscripts child.
     * @apilevel low-level
     */
    public void setArraySubscriptsOpt(Opt<ArraySubscripts> opt) {
        setChild(opt, 7);
    }
    /**
     * Replaces the (optional) ArraySubscripts child.
     * @param node The new node to be used as the ArraySubscripts child.
     * @apilevel high-level
     */
    public void setArraySubscripts(ArraySubscripts node) {
        getArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ArraySubscripts child exists.
     * @return {@code true} if the optional ArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasArraySubscripts() {
        return getArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ArraySubscripts child.
     * @return The ArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ArraySubscripts getArraySubscripts() {
        return (ArraySubscripts) getArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ArraySubscripts child. This is the <code>Opt</code> node containing the child ArraySubscripts, not the actual child!
     * @return The optional node for child the ArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ArraySubscripts")
    public Opt<ArraySubscripts> getArraySubscriptsOpt() {
        return (Opt<ArraySubscripts>) getChild(7);
    }
    /**
     * Retrieves the optional node for child ArraySubscripts. This is the <code>Opt</code> node containing the child ArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ArraySubscripts.
     * @apilevel low-level
     */
    public Opt<ArraySubscripts> getArraySubscriptsOptNoTransform() {
        return (Opt<ArraySubscripts>) getChildNoTransform(7);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 8);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(8);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(8);
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsReplacingExtends() {
        ASTNode$State state = state();
        boolean needsReplacingExtends_value = true;

        return needsReplacingExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasTypePrefix() {
        ASTNode$State state = state();
        boolean hasTypePrefix_value = hasTypePrefixFlow() || hasTypePrefixVariability() || hasTypePrefixInputOutput();

        return hasTypePrefix_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getComment().annotation();

        return annotation_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
