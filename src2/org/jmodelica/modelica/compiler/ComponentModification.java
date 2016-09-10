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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:292
 * @production ComponentModification : {@link ElementModification};

 */
public class ComponentModification extends ElementModification implements Cloneable {
    /**
     * Constructs a component modification from an access and modification.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:67
     */
    public ComponentModification(Access name, Modification mod) {
		this();
		setName(name);
		setModification(mod);
	}
    /**
     * @aspect InstModifications
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:240
     */
    public InstComponentModification newInstModification() {
		InstComponentModification icm = new InstComponentModification(this,hasEach(),hasFinal(),getName().newInstAccess(),new Opt());
		if (hasModification())
			icm.setInstModification(getModification().newInstModification());
		icm.setLocation(this);
		return icm;
	}
    /**
     * @declaredat ASTNode:1
     */
    public ComponentModification() {
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
        setChild(new Opt(), 1);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:16
     */
    public ComponentModification(Opt<Each> p0, Opt<Final> p1, Access p2, Opt<Modification> p3, Comment p4) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        annotationNode_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:51
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public ComponentModification clone() throws CloneNotSupportedException {
        ComponentModification node = (ComponentModification) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public ComponentModification copy() {
        try {
            ComponentModification node = (ComponentModification) clone();
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
     * @declaredat ASTNode:83
     */
    public ComponentModification fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public ComponentModification treeCopyNoTransform() {
        ComponentModification tree = (ComponentModification) copy();
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
     * @declaredat ASTNode:112
     */
    public ComponentModification treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:119
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the Each child. This is the <code>Opt</code>
     * node containing the child Each, not the actual child!
     * @param opt The new node to be used as the optional node for the Each child.
     * @apilevel low-level
     */
    public void setEachOpt(Opt<Each> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) Each child.
     * @param node The new node to be used as the Each child.
     * @apilevel high-level
     */
    public void setEach(Each node) {
        getEachOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Each child exists.
     * @return {@code true} if the optional Each child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasEach() {
        return getEachOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Each child.
     * @return The Each child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Each getEach() {
        return (Each) getEachOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Each child. This is the <code>Opt</code> node containing the child Each, not the actual child!
     * @return The optional node for child the Each child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Each")
    public Opt<Each> getEachOpt() {
        return (Opt<Each>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Each. This is the <code>Opt</code> node containing the child Each, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Each.
     * @apilevel low-level
     */
    public Opt<Each> getEachOptNoTransform() {
        return (Opt<Each>) getChildNoTransform(0);
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
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(Access node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public Access getName() {
        return (Access) getChild(2);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public Access getNameNoTransform() {
        return (Access) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Modification child. This is the <code>Opt</code>
     * node containing the child Modification, not the actual child!
     * @param opt The new node to be used as the optional node for the Modification child.
     * @apilevel low-level
     */
    public void setModificationOpt(Opt<Modification> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) Modification child.
     * @param node The new node to be used as the Modification child.
     * @apilevel high-level
     */
    public void setModification(Modification node) {
        getModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Modification child exists.
     * @return {@code true} if the optional Modification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasModification() {
        return getModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Modification child.
     * @return The Modification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Modification getModification() {
        return (Modification) getModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Modification child. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * @return The optional node for child the Modification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Modification")
    public Opt<Modification> getModificationOpt() {
        return (Opt<Modification>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Modification. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Modification.
     * @apilevel low-level
     */
    public Opt<Modification> getModificationOptNoTransform() {
        return (Opt<Modification>) getChildNoTransform(3);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(4);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(4);
    }
    /**
     * @apilevel internal
     */
    protected boolean annotationNode_computed = false;
    /**
     * @apilevel internal
     */
    protected AnnotationNode annotationNode_value;
    /**
     * @apilevel internal
     */
    private void annotationNode_reset() {
        annotationNode_computed = false;
        annotationNode_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotationNode() {
        if(annotationNode_computed) {
            return annotationNode_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        annotationNode_value = new ComponentModAnnotationNode(this);
        if (isFinal && num == state().boundariesCrossed) {
            annotationNode_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return annotationNode_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:425
        if (getName().isQualified()) {
            state().duringInitialTransformations++;
            ASTNode result = rewriteRule0();
            state().duringInitialTransformations--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:425
     * @apilevel internal
     */
    private ComponentModification rewriteRule0() {
{
            log.debug("ComponentModification -> ComponentModification: " + getName().qualifiedName());
            ComponentModification e = new ComponentModification(new Opt(),
                                           new Opt(),
                                           getName().getFirstAccess(),
                                           //getModificationOpt(),
                                           new Opt(new CompleteModification(
                                                    new ClassModification(
                                                     new List().add(
                                                      new ComponentModification(
                                                       getEachOpt(),
                                                       getFinalOpt(),
                                                       getName().stripFirstAccess(),
                                                       getModificationOpt(),
                                                    getComment()))),
                                                   new Opt())),
                                           new Comment(new Opt(), new Opt()));
            e.getModification().setLocationNoTree(this);
            ((CompleteModification)e.getModification()).getClassModification().setLocationNoTree(this);
            ClassModification cm = ((CompleteModification)e.getModification()).getClassModification();
            ((ComponentModification)cm.getArgument(0)).getName().setLocationNoTree(this);
            e.setLocationNoTree(this);
            return e;
        }    }
}
