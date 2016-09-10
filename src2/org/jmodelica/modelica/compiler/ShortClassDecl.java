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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:131
 * @production ShortClassDecl : {@link BaseClassDecl} ::= <span class="component">{@link ExtendsClauseShortClass}</span>;

 */
public class ShortClassDecl extends BaseClassDecl implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:289
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.print(indent);
	    if (hasEncapsulated())
	    	str.print("encapsulated ");
	    if (hasPartial())
	    	str.print("partial ");
	    if (hasRedeclare())
	    	str.print("redeclare ");
	    if (hasFinal())
	    	str.print("final ");
	    if (hasInner())
	    	str.print("inner ");
	    if (hasOuter())
	    	str.print("outer ");
	    if (hasReplaceable())
	    	str.print("replaceable ");
	    
	    
	    str.print(getRestriction().toString());
 		str.print(" " + getName().getID());
	    str.print(" = ");
	    str.print(getExtendsClauseShortClass().getSuper().name());
	    if (getExtendsClauseShortClass().hasArraySubscripts())
	    	p.print(getExtendsClauseShortClass().getArraySubscripts(),str,indent+"  ");
	    if (getExtendsClauseShortClass().hasClassModification())
	    	p.print(getExtendsClauseShortClass().getClassModification(),str,indent+"  ");
	    if (hasConstrainingClause())
	    	p.print(getConstrainingClause(),str,indent+"  ");
	    
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1332
     */
    public InstShortClassDecl newInstClassDecl() {
        Opt fas_opt = new Opt();
        if (getExtendsClauseShortClass().hasArraySubscripts()) {
            fas_opt.setChild(getExtendsClauseShortClass().getArraySubscripts().instantiate(),0);
        }
        InstShortClassDecl scd =  new InstShortClassDecl(this, new Opt(), 
                newInstRestriction(),fas_opt);
        scd.setInstConstrainingClassOpt(newInstConstrainingClassOpt(null));     
        scd.setLocation(this);
        return scd;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1393
     */
    public InstClassDecl createInstReplacingClass(
            ClassDecl replacedClass, InstRedeclareClassNode icr, InstRedeclareClassNode cicr) {
        Opt fas_opt = new Opt();
        if (getExtendsClauseShortClass().hasArraySubscripts()) {
            fas_opt.setChild(getExtendsClauseShortClass().getArraySubscripts().instantiate(), 0);
        }
        ClassDecl constrainingDecl = (cicr == null) ? replacedClass : cicr.redeclaringClassDecl();
        InstRestriction ir = newInstRestriction();
        InstReplacingShortClassDecl scd =  new InstReplacingShortClassDecl(this, new Opt(), ir, fas_opt, replacedClass, icr);
        scd.setInstConstrainingClassOpt(constrainingDecl.newInstConstrainingClassOpt(cicr));
        scd.setLocation(this);
        return scd;
     }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1197
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		prettyPrintFormattedHelper(printer, printStream, new Opt<Each>(), getFinalOpt());
		printStream.print(';');
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1237
     */
    void prettyPrintFormattedDecl(Printer printer, CodeStream printStream) {
		getName().doPrettyPrintFormatted(printer, printStream);
		printStream.print("=");
		getExtendsClauseShortClass().doPrettyPrintFormatted(printer, printStream);
		if (hasConstrainingClause()) {
			getConstrainingClause().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasConstrainingClauseComment()) {
			getConstrainingClauseComment().doPrettyPrintFormatted(printer, printStream);
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public ShortClassDecl() {
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
        children = new ASTNode[13];
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 5);
        setChild(new Opt(), 6);
        setChild(new Opt(), 7);
        setChild(new Opt(), 8);
        setChild(new Opt(), 9);
        setChild(new Opt(), 10);
        setChild(new Opt(), 11);
    }
    /**
     * @declaredat ASTNode:22
     */
    public ShortClassDecl(IdDecl p0, VisibilityType p1, Opt<Encapsulated> p2, Opt<Partial> p3, Restriction p4, Opt<Redeclare> p5, Opt<Final> p6, Opt<Inner> p7, Opt<Outer> p8, Opt<Replaceable> p9, Opt<ConstrainingClause> p10, Opt<Comment> p11, ExtendsClauseShortClass p12) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
        setChild(p6, 6);
        setChild(p7, 7);
        setChild(p8, 8);
        setChild(p9, 9);
        setChild(p10, 10);
        setChild(p11, 11);
        setChild(p12, 12);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:40
     */
    protected int numChildren() {
        return 13;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:52
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:64
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:70
     */
    public ShortClassDecl clone() throws CloneNotSupportedException {
        ShortClassDecl node = (ShortClassDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:77
     */
    public ShortClassDecl copy() {
        try {
            ShortClassDecl node = (ShortClassDecl) clone();
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
     * @declaredat ASTNode:96
     */
    public ShortClassDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:105
     */
    public ShortClassDecl treeCopyNoTransform() {
        ShortClassDecl tree = (ShortClassDecl) copy();
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
     * @declaredat ASTNode:125
     */
    public ShortClassDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:132
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(IdDecl node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public IdDecl getName() {
        return (IdDecl) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public IdDecl getNameNoTransform() {
        return (IdDecl) getChildNoTransform(0);
    }
    /**
     * Replaces the VisibilityType child.
     * @param node The new node to replace the VisibilityType child.
     * @apilevel high-level
     */
    public void setVisibilityType(VisibilityType node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the VisibilityType child.
     * @return The current node used as the VisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="VisibilityType")
    public VisibilityType getVisibilityType() {
        return (VisibilityType) getChild(1);
    }
    /**
     * Retrieves the VisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the VisibilityType child.
     * @apilevel low-level
     */
    public VisibilityType getVisibilityTypeNoTransform() {
        return (VisibilityType) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Encapsulated child. This is the <code>Opt</code>
     * node containing the child Encapsulated, not the actual child!
     * @param opt The new node to be used as the optional node for the Encapsulated child.
     * @apilevel low-level
     */
    public void setEncapsulatedOpt(Opt<Encapsulated> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Encapsulated child.
     * @param node The new node to be used as the Encapsulated child.
     * @apilevel high-level
     */
    public void setEncapsulated(Encapsulated node) {
        getEncapsulatedOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Encapsulated child exists.
     * @return {@code true} if the optional Encapsulated child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasEncapsulated() {
        return getEncapsulatedOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Encapsulated child.
     * @return The Encapsulated child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Encapsulated getEncapsulated() {
        return (Encapsulated) getEncapsulatedOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Encapsulated child. This is the <code>Opt</code> node containing the child Encapsulated, not the actual child!
     * @return The optional node for child the Encapsulated child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Encapsulated")
    public Opt<Encapsulated> getEncapsulatedOpt() {
        return (Opt<Encapsulated>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Encapsulated. This is the <code>Opt</code> node containing the child Encapsulated, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Encapsulated.
     * @apilevel low-level
     */
    public Opt<Encapsulated> getEncapsulatedOptNoTransform() {
        return (Opt<Encapsulated>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Partial child. This is the <code>Opt</code>
     * node containing the child Partial, not the actual child!
     * @param opt The new node to be used as the optional node for the Partial child.
     * @apilevel low-level
     */
    public void setPartialOpt(Opt<Partial> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) Partial child.
     * @param node The new node to be used as the Partial child.
     * @apilevel high-level
     */
    public void setPartial(Partial node) {
        getPartialOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Partial child exists.
     * @return {@code true} if the optional Partial child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasPartial() {
        return getPartialOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Partial child.
     * @return The Partial child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Partial getPartial() {
        return (Partial) getPartialOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Partial child. This is the <code>Opt</code> node containing the child Partial, not the actual child!
     * @return The optional node for child the Partial child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Partial")
    public Opt<Partial> getPartialOpt() {
        return (Opt<Partial>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Partial. This is the <code>Opt</code> node containing the child Partial, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Partial.
     * @apilevel low-level
     */
    public Opt<Partial> getPartialOptNoTransform() {
        return (Opt<Partial>) getChildNoTransform(3);
    }
    /**
     * Replaces the Restriction child.
     * @param node The new node to replace the Restriction child.
     * @apilevel high-level
     */
    public void setRestriction(Restriction node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the Restriction child.
     * @return The current node used as the Restriction child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Restriction")
    public Restriction getRestriction() {
        return (Restriction) getChild(4);
    }
    /**
     * Retrieves the Restriction child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Restriction child.
     * @apilevel low-level
     */
    public Restriction getRestrictionNoTransform() {
        return (Restriction) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the Redeclare child. This is the <code>Opt</code>
     * node containing the child Redeclare, not the actual child!
     * @param opt The new node to be used as the optional node for the Redeclare child.
     * @apilevel low-level
     */
    public void setRedeclareOpt(Opt<Redeclare> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) Redeclare child.
     * @param node The new node to be used as the Redeclare child.
     * @apilevel high-level
     */
    public void setRedeclare(Redeclare node) {
        getRedeclareOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Redeclare child exists.
     * @return {@code true} if the optional Redeclare child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasRedeclare() {
        return getRedeclareOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Redeclare child.
     * @return The Redeclare child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Redeclare getRedeclare() {
        return (Redeclare) getRedeclareOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Redeclare child. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * @return The optional node for child the Redeclare child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Redeclare")
    public Opt<Redeclare> getRedeclareOpt() {
        return (Opt<Redeclare>) getChild(5);
    }
    /**
     * Retrieves the optional node for child Redeclare. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Redeclare.
     * @apilevel low-level
     */
    public Opt<Redeclare> getRedeclareOptNoTransform() {
        return (Opt<Redeclare>) getChildNoTransform(5);
    }
    /**
     * Replaces the optional node for the Final child. This is the <code>Opt</code>
     * node containing the child Final, not the actual child!
     * @param opt The new node to be used as the optional node for the Final child.
     * @apilevel low-level
     */
    public void setFinalOpt(Opt<Final> opt) {
        setChild(opt, 6);
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
        return (Opt<Final>) getChild(6);
    }
    /**
     * Retrieves the optional node for child Final. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Final.
     * @apilevel low-level
     */
    public Opt<Final> getFinalOptNoTransform() {
        return (Opt<Final>) getChildNoTransform(6);
    }
    /**
     * Replaces the optional node for the Inner child. This is the <code>Opt</code>
     * node containing the child Inner, not the actual child!
     * @param opt The new node to be used as the optional node for the Inner child.
     * @apilevel low-level
     */
    public void setInnerOpt(Opt<Inner> opt) {
        setChild(opt, 7);
    }
    /**
     * Replaces the (optional) Inner child.
     * @param node The new node to be used as the Inner child.
     * @apilevel high-level
     */
    public void setInner(Inner node) {
        getInnerOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Inner child exists.
     * @return {@code true} if the optional Inner child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInner() {
        return getInnerOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Inner child.
     * @return The Inner child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Inner getInner() {
        return (Inner) getInnerOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Inner child. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * @return The optional node for child the Inner child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Inner")
    public Opt<Inner> getInnerOpt() {
        return (Opt<Inner>) getChild(7);
    }
    /**
     * Retrieves the optional node for child Inner. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Inner.
     * @apilevel low-level
     */
    public Opt<Inner> getInnerOptNoTransform() {
        return (Opt<Inner>) getChildNoTransform(7);
    }
    /**
     * Replaces the optional node for the Outer child. This is the <code>Opt</code>
     * node containing the child Outer, not the actual child!
     * @param opt The new node to be used as the optional node for the Outer child.
     * @apilevel low-level
     */
    public void setOuterOpt(Opt<Outer> opt) {
        setChild(opt, 8);
    }
    /**
     * Replaces the (optional) Outer child.
     * @param node The new node to be used as the Outer child.
     * @apilevel high-level
     */
    public void setOuter(Outer node) {
        getOuterOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Outer child exists.
     * @return {@code true} if the optional Outer child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasOuter() {
        return getOuterOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Outer child.
     * @return The Outer child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Outer getOuter() {
        return (Outer) getOuterOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Outer child. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * @return The optional node for child the Outer child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Outer")
    public Opt<Outer> getOuterOpt() {
        return (Opt<Outer>) getChild(8);
    }
    /**
     * Retrieves the optional node for child Outer. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Outer.
     * @apilevel low-level
     */
    public Opt<Outer> getOuterOptNoTransform() {
        return (Opt<Outer>) getChildNoTransform(8);
    }
    /**
     * Replaces the optional node for the Replaceable child. This is the <code>Opt</code>
     * node containing the child Replaceable, not the actual child!
     * @param opt The new node to be used as the optional node for the Replaceable child.
     * @apilevel low-level
     */
    public void setReplaceableOpt(Opt<Replaceable> opt) {
        setChild(opt, 9);
    }
    /**
     * Replaces the (optional) Replaceable child.
     * @param node The new node to be used as the Replaceable child.
     * @apilevel high-level
     */
    public void setReplaceable(Replaceable node) {
        getReplaceableOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Replaceable child exists.
     * @return {@code true} if the optional Replaceable child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasReplaceable() {
        return getReplaceableOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Replaceable child.
     * @return The Replaceable child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Replaceable getReplaceable() {
        return (Replaceable) getReplaceableOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Replaceable child. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * @return The optional node for child the Replaceable child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Replaceable")
    public Opt<Replaceable> getReplaceableOpt() {
        return (Opt<Replaceable>) getChild(9);
    }
    /**
     * Retrieves the optional node for child Replaceable. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Replaceable.
     * @apilevel low-level
     */
    public Opt<Replaceable> getReplaceableOptNoTransform() {
        return (Opt<Replaceable>) getChildNoTransform(9);
    }
    /**
     * Replaces the optional node for the ConstrainingClause child. This is the <code>Opt</code>
     * node containing the child ConstrainingClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClause child.
     * @apilevel low-level
     */
    public void setConstrainingClauseOpt(Opt<ConstrainingClause> opt) {
        setChild(opt, 10);
    }
    /**
     * Replaces the (optional) ConstrainingClause child.
     * @param node The new node to be used as the ConstrainingClause child.
     * @apilevel high-level
     */
    public void setConstrainingClause(ConstrainingClause node) {
        getConstrainingClauseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConstrainingClause child exists.
     * @return {@code true} if the optional ConstrainingClause child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConstrainingClause() {
        return getConstrainingClauseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConstrainingClause child.
     * @return The ConstrainingClause child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ConstrainingClause getConstrainingClause() {
        return (ConstrainingClause) getConstrainingClauseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConstrainingClause child. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * @return The optional node for child the ConstrainingClause child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConstrainingClause")
    public Opt<ConstrainingClause> getConstrainingClauseOpt() {
        return (Opt<ConstrainingClause>) getChild(10);
    }
    /**
     * Retrieves the optional node for child ConstrainingClause. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClause.
     * @apilevel low-level
     */
    public Opt<ConstrainingClause> getConstrainingClauseOptNoTransform() {
        return (Opt<ConstrainingClause>) getChildNoTransform(10);
    }
    /**
     * Replaces the optional node for the ConstrainingClauseComment child. This is the <code>Opt</code>
     * node containing the child ConstrainingClauseComment, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClauseComment child.
     * @apilevel low-level
     */
    public void setConstrainingClauseCommentOpt(Opt<Comment> opt) {
        setChild(opt, 11);
    }
    /**
     * Replaces the (optional) ConstrainingClauseComment child.
     * @param node The new node to be used as the ConstrainingClauseComment child.
     * @apilevel high-level
     */
    public void setConstrainingClauseComment(Comment node) {
        getConstrainingClauseCommentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConstrainingClauseComment child exists.
     * @return {@code true} if the optional ConstrainingClauseComment child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConstrainingClauseComment() {
        return getConstrainingClauseCommentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConstrainingClauseComment child.
     * @return The ConstrainingClauseComment child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Comment getConstrainingClauseComment() {
        return (Comment) getConstrainingClauseCommentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConstrainingClauseComment child. This is the <code>Opt</code> node containing the child ConstrainingClauseComment, not the actual child!
     * @return The optional node for child the ConstrainingClauseComment child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConstrainingClauseComment")
    public Opt<Comment> getConstrainingClauseCommentOpt() {
        return (Opt<Comment>) getChild(11);
    }
    /**
     * Retrieves the optional node for child ConstrainingClauseComment. This is the <code>Opt</code> node containing the child ConstrainingClauseComment, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClauseComment.
     * @apilevel low-level
     */
    public Opt<Comment> getConstrainingClauseCommentOptNoTransform() {
        return (Opt<Comment>) getChildNoTransform(11);
    }
    /**
     * Replaces the ExtendsClauseShortClass child.
     * @param node The new node to replace the ExtendsClauseShortClass child.
     * @apilevel high-level
     */
    public void setExtendsClauseShortClass(ExtendsClauseShortClass node) {
        setChild(node, 12);
    }
    /**
     * Retrieves the ExtendsClauseShortClass child.
     * @return The current node used as the ExtendsClauseShortClass child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ExtendsClauseShortClass")
    public ExtendsClauseShortClass getExtendsClauseShortClass() {
        return (ExtendsClauseShortClass) getChild(12);
    }
    /**
     * Retrieves the ExtendsClauseShortClass child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ExtendsClauseShortClass child.
     * @apilevel low-level
     */
    public ExtendsClauseShortClass getExtendsClauseShortClassNoTransform() {
        return (ExtendsClauseShortClass) getChildNoTransform(12);
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasClassModification() {
        ASTNode$State state = state();
        boolean hasClassModification_value = getExtendsClauseShortClass().hasClassModification();

        return hasClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasTypePrefix() {
        ASTNode$State state = state();
        boolean hasTypePrefix_value = getExtendsClauseShortClass().hasTypePrefix();

        return hasTypePrefix_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = Collections.<ExtendsClause>singletonList(getExtendsClauseShortClass());

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassMemberScope(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClassMemberScope_String_value = getExtendsClauseShortClass().findClassDecl().simpleLookupClassMemberScope(name);

        return simpleLookupClassMemberScope_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getExtendsClauseShortClass().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = hasInputOrOutput() && getExtendsClauseShortClass().getTypePrefixInputOutput().isInput();

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = hasInputOrOutput() && getExtendsClauseShortClass().getTypePrefixInputOutput().isOutput();

        return isOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInputOrOutput() {
        ASTNode$State state = state();
        boolean hasInputOrOutput_value = getExtendsClauseShortClass().hasTypePrefixInputOutput();

        return hasInputOrOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasStringComment() {
        ASTNode$State state = state();
        boolean hasStringComment_value = getExtendsClauseShortClass().getComment().hasStringComment();

        return hasStringComment_value;
    }
    @ASTNodeAnnotation.Attribute
    public StringComment getStringComment() {
        ASTNode$State state = state();
        StringComment getStringComment_value = getExtendsClauseShortClass().getComment().getStringComment();

        return getStringComment_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:848
     * @apilevel internal
     */
    public BaseClassDecl Define_enclosingClassDecl(ASTNode caller, ASTNode child) {
        if (caller == getExtendsClauseShortClassNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_enclosingClassDecl(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
