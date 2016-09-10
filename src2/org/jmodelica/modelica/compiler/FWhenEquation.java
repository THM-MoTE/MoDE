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
 * When equation clause.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:683
 * @production FWhenEquation : {@link FIfWhenEquation};

 */
public class FWhenEquation extends FIfWhenEquation implements Cloneable {
    /**
     * Constructs a when equation.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:395
     */
    public FWhenEquation(FEquationType type, List<FAbstractEquation> eqns, FExp guard, Opt<FIfWhenElseEquation> elseClause) {
		this(type, new List<FAttribute>(), eqns, guard, elseClause);
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1393
     */
    public FWhenEquation createEmptyNode() { return new FWhenEquation(); }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:251
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        super.updateVariabilityForVariablesInWhen(true);
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:112
     */
    public void complianceCheck(ErrorCheckType checkType) {
        ONLY_FMU_WHEN_EQUATIONS.invoke(this);
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:354
     */
    public void checkMayContainConnect(ErrorCheckType checkType, FConnectClause connect) {
        super.checkMayContainConnect(checkType, connect);
        connect.error("Connect clauses are not allowed in when equations");
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:385
     */
    public void contentCheck(ErrorCheckType checkType) {
		// TODO: check that two when clauses do not assign the same variable
		super.contentCheck(checkType);
		if (inWhen())
			error("Nestled when clauses are not allowed");
		else if (getType() instanceof FInitialEquation || isInitial()) {
			error("When equations are not allowed in initial equation sections");
		} else {
			if (!isBalancedAssignments())
				error("All branches in when equation must assign the same variables");
		}
	}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:896
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (!getTest().type().isUnknown()) {
		  if (!getTest().type().isBoolean() || getTest().type().ndims() > 1) 
			  error("Test expression of when equation isn't Boolean scalar or vector expression");
	  }
  }
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:59
     */
    @Override
    protected FIfWhenElseEquation convertWhenEqnToIfEqn(Collection<FAbstractEquation> outerNewList, FClass fclass) {
        FIfEquation e = new FIfEquation();
        e.setTest(getTest().transformGuard(outerNewList, null, fclass));
        if (hasElse()) {
            e.setElse(getElse().convertWhenEqnToIfEqn(outerNewList, fclass));
        } else {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (FVariable fv : referencedFVariablesInLHS()) {
                l.add(new FEquation(fv.createUseExp(), fv.createFPreExp()));
            }
            e.setElse(new FElseEquation(getType(), new List<FAbstractEquation>(l)));
        }
        e.setType(getType());
        e.setFAbstractEquationList(getFAbstractEquations());
        e.setWhen();
        return e;
    }
    /**
     * @declaredat ASTNode:1
     */
    public FWhenEquation() {
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
        children = new ASTNode[7];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new Opt(), 4);
        setChild(new List(), 5);
        setChild(new Opt(), 6);
    }
    /**
     * @declaredat ASTNode:18
     */
    public FWhenEquation(FEquationType p0, List<FAttribute> p1, List<FAbstractEquation> p2, FExp p3, Opt<FIfWhenElseEquation> p4) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:28
     */
    protected int numChildren() {
        return 5;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:52
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FWhenEquation clone() throws CloneNotSupportedException {
        FWhenEquation node = (FWhenEquation) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FWhenEquation copy() {
        try {
            FWhenEquation node = (FWhenEquation) clone();
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
     * @declaredat ASTNode:84
     */
    public FWhenEquation fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FWhenEquation treeCopyNoTransform() {
        FWhenEquation tree = (FWhenEquation) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 6:
                    tree.children[i] = new Opt();
                    continue;
                case 5:
                    tree.children[i] = new List();
                    continue;
                }
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
     * @declaredat ASTNode:121
     */
    public FWhenEquation treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:128
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FEquationType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FEquationType getType() {
        return (FEquationType) getChild(0);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FEquationType getTypeNoTransform() {
        return (FEquationType) getChildNoTransform(0);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * @return Number of children in the FAttribute list.
     * @apilevel high-level
     */
    public int getNumFAttribute() {
        return getFAttributeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAttribute list.
     * @apilevel low-level
     */
    public int getNumFAttributeNoTransform() {
        return getFAttributeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAttribute list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAttribute list.
     * @apilevel high-level
     */
    public FAttribute getFAttribute(int i) {
        return (FAttribute) getFAttributeList().getChild(i);
    }
    /**
     * Check whether the FAttribute list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAttribute() {
        return getFAttributeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAttribute list.
     * @param node The element to append to the FAttribute list.
     * @apilevel high-level
     */
    public void addFAttribute(FAttribute node) {
        List<FAttribute> list = (parent == null || state == null) ? getFAttributeListNoTransform() : getFAttributeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAttributeNoTransform(FAttribute node) {
        List<FAttribute> list = getFAttributeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAttribute list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAttribute(FAttribute node, int i) {
        List<FAttribute> list = getFAttributeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAttribute")
    public List<FAttribute> getFAttributeList() {
        List<FAttribute> list = (List<FAttribute>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributeListNoTransform() {
        return (List<FAttribute>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    public List<FAttribute> getFAttributes() {
        return getFAttributeList();
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributesNoTransform() {
        return getFAttributeListNoTransform();
    }
    /**
     * Replaces the FAbstractEquation list.
     * @param list The new list node to be used as the FAbstractEquation list.
     * @apilevel high-level
     */
    public void setFAbstractEquationList(List<FAbstractEquation> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAbstractEquation")
    public List<FAbstractEquation> getFAbstractEquationList() {
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(2);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Replaces the Test child.
     * @param node The new node to replace the Test child.
     * @apilevel high-level
     */
    public void setTest(FExp node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the Test child.
     * @return The current node used as the Test child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Test")
    public FExp getTest() {
        return (FExp) getChild(3);
    }
    /**
     * Retrieves the Test child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Test child.
     * @apilevel low-level
     */
    public FExp getTestNoTransform() {
        return (FExp) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Else child. This is the <code>Opt</code>
     * node containing the child Else, not the actual child!
     * @param opt The new node to be used as the optional node for the Else child.
     * @apilevel low-level
     */
    public void setElseOpt(Opt<FIfWhenElseEquation> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) Else child.
     * @param node The new node to be used as the Else child.
     * @apilevel high-level
     */
    public void setElse(FIfWhenElseEquation node) {
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
    public FIfWhenElseEquation getElse() {
        return (FIfWhenElseEquation) getElseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * @return The optional node for child the Else child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Else")
    public Opt<FIfWhenElseEquation> getElseOpt() {
        return (Opt<FIfWhenElseEquation>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Else.
     * @apilevel low-level
     */
    public Opt<FIfWhenElseEquation> getElseOptNoTransform() {
        return (Opt<FIfWhenElseEquation>) getChildNoTransform(4);
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * @return Number of children in the InitialEquation list.
     * @apilevel high-level
     */
    public int getNumInitialEquation() {
        return getInitialEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InitialEquation list.
     * @apilevel low-level
     */
    public int getNumInitialEquationNoTransform() {
        return getInitialEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InitialEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InitialEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getInitialEquation(int i) {
        return (FAbstractEquation) getInitialEquationList().getChild(i);
    }
    /**
     * Check whether the InitialEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInitialEquation() {
        return getInitialEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InitialEquation list.
     * @param node The element to append to the InitialEquation list.
     * @apilevel high-level
     */
    public void addInitialEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getInitialEquationListNoTransform() : getInitialEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInitialEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getInitialEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InitialEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInitialEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getInitialEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InitialEquation list.
     * @return The the child position of the InitialEquation list.
     * @apilevel low-level
     */
    protected int getInitialEquationListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InitialEquation list.
     * @return The node representing the InitialEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getInitialEquations() {
        return getInitialEquationList();
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationsNoTransform() {
        return getInitialEquationListNoTransform();
    }
    /**
     * Replaces the (optional) DynamicFAbstractEquation child.
     * @param node The new node to be used as the DynamicFAbstractEquation child.
     * @apilevel high-level
     */
    public void setDynamicFAbstractEquation(FAbstractEquation node) {
        getDynamicFAbstractEquationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional DynamicFAbstractEquation child exists.
     * @return {@code true} if the optional DynamicFAbstractEquation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDynamicFAbstractEquation() {
        return getDynamicFAbstractEquationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) DynamicFAbstractEquation child.
     * @return The DynamicFAbstractEquation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FAbstractEquation getDynamicFAbstractEquation() {
        return (FAbstractEquation) getDynamicFAbstractEquationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child DynamicFAbstractEquation. This is the <code>Opt</code> node containing the child DynamicFAbstractEquation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    public Opt<FAbstractEquation> getDynamicFAbstractEquationOptNoTransform() {
        return (Opt<FAbstractEquation>) getChildNoTransform(6);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 6;
    }
    @ASTNodeAnnotation.Attribute
    public String ifWhenType() {
        ASTNode$State state = state();
        String ifWhenType_value = "when";

        return ifWhenType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBalancedAssignments() {
        ASTNode$State state = state();
        boolean isBalancedAssignments_value = !hasElse() || elseIsBalancedAssignments();

        return isBalancedAssignments_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isWhen() {
        ASTNode$State state = state();
        boolean isWhen_value = true;

        return isWhen_value;
    }
    /**
     * Find the top when-equation in a when-elsewhen-else equation.
     * 
     * @param last  will be returned if parent is not a when equation
     * @attribute inh
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1693
     */
    @ASTNodeAnnotation.Attribute
    public FWhenEquation findTopWhen(FWhenEquation last) {
        ASTNode$State state = state();
        FWhenEquation findTopWhen_FWhenEquation_value = getParent().Define_findTopWhen(this, null, last);

        return findTopWhen_FWhenEquation_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1683
     * @apilevel internal
     */
    public FWhenEquation Define_myWhen(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return findTopWhen(this);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1693
     * @apilevel internal
     */
    public FWhenEquation Define_findTopWhen(ASTNode caller, ASTNode child, FWhenEquation last) {
        int childIndex = this.getIndexOfChild(caller);
        return findTopWhen(this);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_guardExpInEquations() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1300
     */
        if (getTest().inEquationSection()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_guardExpInEquations_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_guardExpInEquations();
    }
    protected void collect_contributors_FClass_guardExpInInitialEquations() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1307
     */
        if (getTest().inInitialEquationSection()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_guardExpInInitialEquations_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_guardExpInInitialEquations();
    }
    protected void contributeTo_FClass_FClass_guardExpInEquations(ArrayList<FExp> collection) {
        super.contributeTo_FClass_FClass_guardExpInEquations(collection);
        if (getTest().inEquationSection())
            collection.addAll(getTest().guards());
    }

    protected void contributeTo_FClass_FClass_guardExpInInitialEquations(ArrayList<FExp> collection) {
        super.contributeTo_FClass_FClass_guardExpInInitialEquations(collection);
        if (getTest().inInitialEquationSection())
            collection.addAll(getTest().guards());
    }

}
