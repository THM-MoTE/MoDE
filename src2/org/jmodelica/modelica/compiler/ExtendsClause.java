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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:209
 * @production ExtendsClause : {@link Element} ::= <span class="component">{@link VisibilityType}</span> <span class="component">Super:{@link Access}</span> <span class="component">[{@link ClassModification}]</span> <span class="component">[{@link Annotation}]</span>;

 */
public class ExtendsClause extends Element implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:620
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent + "extends ");
		p.print(getSuper(),str,indent);
		p.print(getClassModificationOpt(),str,indent);
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1455
     */
    public InstExtends newInstExtends(InstNode lookup) {
        InstNormalExtends ie = newEmptyInstExtends(lookup);
        ie.setClassName(getSuper().newInstAccess());
        ie.setExtendsClause(this);
        if (hasClassModification())
            ie.setInstClassModification(getClassModification().newInstModification());
        ie.setLocation(this);
        return ie;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1465
     */
    public InstExtends newInstReplacingExtends(InstExtendsShortClass iesc) {
        InstReplacingExtendsShortClass ie = new InstReplacingExtendsShortClass();
        ie.setClassName(getSuper().newInstAccess());
        ie.setExtendsClause(this);
        ie.setInstExtendsShortClass(iesc);
        ie.setLocation(this);
        return ie;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1474
     */
    public InstNormalExtends newEmptyInstExtends(InstNode lookup) {
        return new InstNormalExtends();
    }
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:245
     */
    public void addToFullClassDecl(FullClassDecl fcd) {
    	fcd.addSuper(this);
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:864
     */
    @Override
	protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		preFormatting = new DefaultFormattingItem(" ");
		getSuper().preFormatting = new DefaultFormattingItem(" ");
		postFormatting = new DefaultFormattingItem("\n");
		return false;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1374
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		printStream.print("extends");
		getSuper().doPrettyPrintFormatted(printer, printStream);
		if (hasClassModification()) {
			getClassModification().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasAnnotation())
			getAnnotation().prettyPrintFormattedHelper(printer, printStream);
		printStream.print(";");
	}
    /**
     * @declaredat ASTNode:1
     */
    public ExtendsClause() {
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
        children = new ASTNode[4];
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:15
     */
    public ExtendsClause(VisibilityType p0, Access p1, Opt<ClassModification> p2, Opt<Annotation> p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 4;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:48
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public ExtendsClause clone() throws CloneNotSupportedException {
        ExtendsClause node = (ExtendsClause) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public ExtendsClause copy() {
        try {
            ExtendsClause node = (ExtendsClause) clone();
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
     * @declaredat ASTNode:80
     */
    public ExtendsClause fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public ExtendsClause treeCopyNoTransform() {
        ExtendsClause tree = (ExtendsClause) copy();
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
     * @declaredat ASTNode:109
     */
    public ExtendsClause treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:116
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
    @ASTNodeAnnotation.Attribute
    public boolean needsReplacingExtends() {
        ASTNode$State state = state();
        boolean needsReplacingExtends_value = false;

        return needsReplacingExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl findClassDecl() {
        ASTNode$State state = state();
        ClassDecl findClassDecl_value = getSuper().findClassDecl();

        return findClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode modificationAnnotation() {
        ASTNode$State state = state();
        AnnotationNode modificationAnnotation_value = getClassModificationOpt().annotation();

        return modificationAnnotation_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
