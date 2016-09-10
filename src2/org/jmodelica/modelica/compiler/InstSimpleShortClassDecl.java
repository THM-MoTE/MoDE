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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:48
 * @production InstSimpleShortClassDecl : {@link InstAbstractShortClassDecl} ::= <span class="component">Target:{@link InstAccess}</span>;

 */
public class InstSimpleShortClassDecl extends InstAbstractShortClassDecl implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3557
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
       actualInstClass().evaluate(evaluator, values);
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:796
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!errorChecked) {
            errorChecked = true;
            getTarget().collectErrors(checkType);
            actualInstClass().collectErrors(checkType);
        }
    }
    /**
     * Check if extends tree is recursive.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1450
     */
    public boolean isRecursive() {
		if (recursiveCache == RECURSIVE_UNKNOWN)
			calcIsRecursive(new HashSet<InstNode>());
		return recursiveCache == RECURSIVE_YES;
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1474
     */
    public void calcIsRecursive(HashSet<InstNode> visited) {
        recursiveCache = visited.contains(this) ? RECURSIVE_YES : RECURSIVE_NO;
        visited.add(this);
        if (recursiveCache == RECURSIVE_NO) 
            myTargetInstClassDecl().calcIsRecursive(visited);
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1482
     */
    private byte recursiveCache = RECURSIVE_UNKNOWN;
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:113
     */
    public void flattenInstClassDecl(FClass fc) {
        actualInstClass().flattenInstClassDecl(fc);
        fc.setFQName(new FQNameString(qualifiedName()));
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:154
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        actualInstClass().flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:279
     */
    public void flattenFunction(FClass fc) {
        actualInstClass().flattenFunction(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:391
     */
    @Override
    protected AnnotationNode findAnnotationRoot(boolean lookInExternal, boolean lookInExtends, String ... subPaths) {
        return myTargetInstClassDecl().findAnnotationRoot(lookInExternal, lookInExtends, subPaths);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:585
     */
    public void flattenComponentsInRecord(FRecordDecl frd, FClass fc, Set<String> names, int level) {
        actualInstClass().flattenComponentsInRecord(frd, fc, names, level);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1112
     */
    public void flattenEnum(FClass fc) {
        actualInstClass().flattenEnum(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1268
     */
    public void addFDerivedType(FClass fc) {
        actualInstClass().addFDerivedType(fc);
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1166
     */
    public InstExtends createInstReplacingExtends(ExtendsClause ec, InstNode lookup) {
        return actualInstClass().createInstReplacingExtends(ec, lookup);
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1217
     */
    public InstComponentDecl newInstComponentDecl(ComponentDecl cd, Access className) {
		return actualInstClass().newInstComponentDecl(cd, className);
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1633
     */
    public List<InstComponentDecl> getInstComponentDeclList() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1637
     */
    public List<InstClassDecl> getInstClassDeclList() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1641
     */
    public List<InstExtends> getInstExtendsList() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1645
     */
    public List<InstImport> getInstImportList() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1649
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclList() {
		throw new UnsupportedOperationException();
	}
    /**
     * @declaredat ASTNode:1
     */
    public InstSimpleShortClassDecl() {
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
        setChild(new Opt(), 0);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new Opt(), 10);
    }
    /**
     * @declaredat ASTNode:22
     */
    public InstSimpleShortClassDecl(ClassDecl p0, Opt<InstConstrainingClass> p1, InstRestriction p2) {
        setClassDecl(p0);
        setChild(p1, 0);
        setChild(p2, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:30
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myInputs_reset();
        myNonInputs_reset();
        myOutputs_reset();
        myModifiableComponents_reset();
        genericLookupInstClass_String_reset();
        genericLookupInstComponent_String_reset();
        memberInstComponent_String_reset();
        memberInstConstantWithExtends_String_reset();
        memberInstConstant_String_reset();
        totalMergedEnvironment_reset();
        getTarget_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:65
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:71
     */
    public InstSimpleShortClassDecl clone() throws CloneNotSupportedException {
        InstSimpleShortClassDecl node = (InstSimpleShortClassDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:78
     */
    public InstSimpleShortClassDecl copy() {
        try {
            InstSimpleShortClassDecl node = (InstSimpleShortClassDecl) clone();
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
     * @declaredat ASTNode:97
     */
    public InstSimpleShortClassDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:106
     */
    public InstSimpleShortClassDecl treeCopyNoTransform() {
        InstSimpleShortClassDecl tree = (InstSimpleShortClassDecl) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 9:
                case 11:
                case 12:
                    tree.children[i] = null;
                    continue;
                case 10:
                    tree.children[i] = new Opt();
                    continue;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
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
     * @declaredat ASTNode:145
     */
    public InstSimpleShortClassDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:152
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenClassDecl_ClassDecl == ((InstSimpleShortClassDecl)node).tokenClassDecl_ClassDecl);    
    }
    /**
     * Replaces the lexeme ClassDecl.
     * @param value The new value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    public void setClassDecl(ClassDecl value) {
        tokenClassDecl_ClassDecl = value;
    }
    /**
     * Retrieves the value for the lexeme ClassDecl.
     * @return The value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ClassDecl")
    public ClassDecl getClassDecl() {
        return tokenClassDecl_ClassDecl;
    }
    /**
     * Replaces the optional node for the InstConstrainingClass child. This is the <code>Opt</code>
     * node containing the child InstConstrainingClass, not the actual child!
     * @param opt The new node to be used as the optional node for the InstConstrainingClass child.
     * @apilevel low-level
     */
    public void setInstConstrainingClassOpt(Opt<InstConstrainingClass> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) InstConstrainingClass child.
     * @param node The new node to be used as the InstConstrainingClass child.
     * @apilevel high-level
     */
    public void setInstConstrainingClass(InstConstrainingClass node) {
        getInstConstrainingClassOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstConstrainingClass child exists.
     * @return {@code true} if the optional InstConstrainingClass child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstConstrainingClass() {
        return getInstConstrainingClassOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstConstrainingClass child.
     * @return The InstConstrainingClass child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstConstrainingClass getInstConstrainingClass() {
        return (InstConstrainingClass) getInstConstrainingClassOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstConstrainingClass child. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * @return The optional node for child the InstConstrainingClass child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstConstrainingClass")
    public Opt<InstConstrainingClass> getInstConstrainingClassOpt() {
        return (Opt<InstConstrainingClass>) getChild(0);
    }
    /**
     * Retrieves the optional node for child InstConstrainingClass. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstConstrainingClass.
     * @apilevel low-level
     */
    public Opt<InstConstrainingClass> getInstConstrainingClassOptNoTransform() {
        return (Opt<InstConstrainingClass>) getChildNoTransform(0);
    }
    /**
     * Replaces the InstRestriction child.
     * @param node The new node to replace the InstRestriction child.
     * @apilevel high-level
     */
    public void setInstRestriction(InstRestriction node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the InstRestriction child.
     * @return The current node used as the InstRestriction child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstRestriction")
    public InstRestriction getInstRestriction() {
        return (InstRestriction) getChild(1);
    }
    /**
     * Retrieves the InstRestriction child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstRestriction child.
     * @apilevel low-level
     */
    public InstRestriction getInstRestrictionNoTransform() {
        return (InstRestriction) getChildNoTransform(1);
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel high-level
     */
    public int getNumInstComponentDecl() {
        return getInstComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel low-level
     */
    public int getNumInstComponentDeclNoTransform() {
        return getInstComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstComponentDecl list.
     * @apilevel high-level
     */
    public InstComponentDecl getInstComponentDecl(int i) {
        return (InstComponentDecl) getInstComponentDeclList().getChild(i);
    }
    /**
     * Check whether the InstComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstComponentDecl() {
        return getInstComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstComponentDecl list.
     * @param node The element to append to the InstComponentDecl list.
     * @apilevel high-level
     */
    public void addInstComponentDecl(InstComponentDecl node) {
        List<InstComponentDecl> list = (parent == null || state == null) ? getInstComponentDeclListNoTransform() : getInstComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstComponentDeclNoTransform(InstComponentDecl node) {
        List<InstComponentDecl> list = getInstComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node, int i) {
        List<InstComponentDecl> list = getInstComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstComponentDecl list.
     * @return The the child position of the InstComponentDecl list.
     * @apilevel low-level
     */
    protected int getInstComponentDeclListChildPosition() {
        return 2;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(2);
    }
    /**
     * Retrieves the InstComponentDecl list.
     * @return The node representing the InstComponentDecl list.
     * @apilevel high-level
     */
    public List<InstComponentDecl> getInstComponentDecls() {
        return getInstComponentDeclList();
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclsNoTransform() {
        return getInstComponentDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * @return Number of children in the InstClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstClassDecl() {
        return getInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstClassDeclNoTransform() {
        return getInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstClassDecl(int i) {
        return (InstClassDecl) getInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstClassDecl() {
        return getInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstClassDecl list.
     * @param node The element to append to the InstClassDecl list.
     * @apilevel high-level
     */
    public void addInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstClassDeclListNoTransform() : getInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstClassDecl list.
     * @return The the child position of the InstClassDecl list.
     * @apilevel low-level
     */
    protected int getInstClassDeclListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InstClassDecl list.
     * @return The node representing the InstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstClassDecls() {
        return getInstClassDeclList();
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclsNoTransform() {
        return getInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * @return Number of children in the InstExtends list.
     * @apilevel high-level
     */
    public int getNumInstExtends() {
        return getInstExtendsList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstExtends list.
     * @apilevel low-level
     */
    public int getNumInstExtendsNoTransform() {
        return getInstExtendsListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstExtends list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstExtends list.
     * @apilevel high-level
     */
    public InstExtends getInstExtends(int i) {
        return (InstExtends) getInstExtendsList().getChild(i);
    }
    /**
     * Check whether the InstExtends list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstExtends() {
        return getInstExtendsList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstExtends list.
     * @param node The element to append to the InstExtends list.
     * @apilevel high-level
     */
    public void addInstExtends(InstExtends node) {
        List<InstExtends> list = (parent == null || state == null) ? getInstExtendsListNoTransform() : getInstExtendsList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstExtendsNoTransform(InstExtends node) {
        List<InstExtends> list = getInstExtendsListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstExtends list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstExtends(InstExtends node, int i) {
        List<InstExtends> list = getInstExtendsList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstExtends list.
     * @return The the child position of the InstExtends list.
     * @apilevel low-level
     */
    protected int getInstExtendsListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(4);
    }
    /**
     * Retrieves the InstExtends list.
     * @return The node representing the InstExtends list.
     * @apilevel high-level
     */
    public List<InstExtends> getInstExtendss() {
        return getInstExtendsList();
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendssNoTransform() {
        return getInstExtendsListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * @return Number of children in the InstImport list.
     * @apilevel high-level
     */
    public int getNumInstImport() {
        return getInstImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstImport list.
     * @apilevel low-level
     */
    public int getNumInstImportNoTransform() {
        return getInstImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstImport list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstImport list.
     * @apilevel high-level
     */
    public InstImport getInstImport(int i) {
        return (InstImport) getInstImportList().getChild(i);
    }
    /**
     * Check whether the InstImport list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstImport() {
        return getInstImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstImport list.
     * @param node The element to append to the InstImport list.
     * @apilevel high-level
     */
    public void addInstImport(InstImport node) {
        List<InstImport> list = (parent == null || state == null) ? getInstImportListNoTransform() : getInstImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstImportNoTransform(InstImport node) {
        List<InstImport> list = getInstImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstImport list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstImport(InstImport node, int i) {
        List<InstImport> list = getInstImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstImport list.
     * @return The the child position of the InstImport list.
     * @apilevel low-level
     */
    protected int getInstImportListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InstImport list.
     * @return The node representing the InstImport list.
     * @apilevel high-level
     */
    public List<InstImport> getInstImports() {
        return getInstImportList();
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportsNoTransform() {
        return getInstImportListNoTransform();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public int getNumRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public int getNumRedeclaredInstClassDeclNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the RedeclaredInstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getRedeclaredInstClassDecl(int i) {
        return (InstClassDecl) getRedeclaredInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the RedeclaredInstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the RedeclaredInstClassDecl list.
     * @param node The element to append to the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public void addRedeclaredInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getRedeclaredInstClassDeclListNoTransform() : getRedeclaredInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addRedeclaredInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the RedeclaredInstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setRedeclaredInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the RedeclaredInstClassDecl list.
     * @return The the child position of the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    protected int getRedeclaredInstClassDeclListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(6);
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDecls() {
        return getRedeclaredInstClassDeclList();
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclsNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform();
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
     * Retrieves the child position of the FAbstractEquation list.
     * @return The the child position of the FAbstractEquation list.
     * @apilevel low-level
     */
    protected int getFAbstractEquationListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(7);
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
     * Retrieves the number of children in the ElementInstModification list.
     * @return Number of children in the ElementInstModification list.
     * @apilevel high-level
     */
    public int getNumElementInstModification() {
        return getElementInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementInstModification list.
     * @apilevel low-level
     */
    public int getNumElementInstModificationNoTransform() {
        return getElementInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementInstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementInstModification list.
     * @apilevel high-level
     */
    public InstModification getElementInstModification(int i) {
        return (InstModification) getElementInstModificationList().getChild(i);
    }
    /**
     * Check whether the ElementInstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementInstModification() {
        return getElementInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementInstModification list.
     * @param node The element to append to the ElementInstModification list.
     * @apilevel high-level
     */
    public void addElementInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getElementInstModificationListNoTransform() : getElementInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getElementInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementInstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementInstModification(InstModification node, int i) {
        List<InstModification> list = getElementInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the ElementInstModification list.
     * @return The the child position of the ElementInstModification list.
     * @apilevel low-level
     */
    protected int getElementInstModificationListChildPosition() {
        return 8;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(8);
    }
    /**
     * Retrieves the ElementInstModification list.
     * @return The node representing the ElementInstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getElementInstModifications() {
        return getElementInstModificationList();
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationsNoTransform() {
        return getElementInstModificationListNoTransform();
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(9);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 9;
    }
    /**
     * Replaces the (optional) ClassAnnotation child.
     * @param node The new node to be used as the ClassAnnotation child.
     * @apilevel high-level
     */
    public void setClassAnnotation(InstClassModification node) {
        getClassAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ClassAnnotation child exists.
     * @return {@code true} if the optional ClassAnnotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasClassAnnotation() {
        return getClassAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ClassAnnotation child.
     * @return The ClassAnnotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getClassAnnotation() {
        return (InstClassModification) getClassAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child ClassAnnotation. This is the <code>Opt</code> node containing the child ClassAnnotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ClassAnnotation.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getClassAnnotationOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(10);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 10;
    }
    /**
     * Retrieves the FunctionType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FunctionType child.
     * @apilevel low-level
     */
    public FType getFunctionTypeNoTransform() {
        return (FType) getChildNoTransform(11);
    }
    /**
     * Retrieves the child position of the optional child FunctionType.
     * @return The the child position of the optional child FunctionType.
     * @apilevel low-level
     */
    protected int getFunctionTypeChildPosition() {
        return 11;
    }
    /**
     * Retrieves the Target child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Target child.
     * @apilevel low-level
     */
    public InstAccess getTargetNoTransform() {
        return (InstAccess) getChildNoTransform(12);
    }
    /**
     * Retrieves the child position of the optional child Target.
     * @return The the child position of the optional child Target.
     * @apilevel low-level
     */
    protected int getTargetChildPosition() {
        return 12;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myInputs_value;
    /**
     * @apilevel internal
     */
    private void myInputs_reset() {
        myInputs_computed = false;
        myInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myInputs() {
        if(myInputs_computed) {
            return myInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInputs_value = actualInstClass().myInputs();
        if (isFinal && num == state().boundariesCrossed) {
            myInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myNonInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myNonInputs_value;
    /**
     * @apilevel internal
     */
    private void myNonInputs_reset() {
        myNonInputs_computed = false;
        myNonInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myNonInputs() {
        if(myNonInputs_computed) {
            return myNonInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myNonInputs_value = actualInstClass().myNonInputs();
        if (isFinal && num == state().boundariesCrossed) {
            myNonInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myNonInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myOutputs_value;
    /**
     * @apilevel internal
     */
    private void myOutputs_reset() {
        myOutputs_computed = false;
        myOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myOutputs() {
        if(myOutputs_computed) {
            return myOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myOutputs_value = actualInstClass().myOutputs();
        if (isFinal && num == state().boundariesCrossed) {
            myOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myModifiableComponents_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myModifiableComponents_value;
    /**
     * @apilevel internal
     */
    private void myModifiableComponents_reset() {
        myModifiableComponents_computed = false;
        myModifiableComponents_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myModifiableComponents() {
        if(myModifiableComponents_computed) {
            return myModifiableComponents_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myModifiableComponents_value = actualInstClass().myModifiableComponents();
        if (isFinal && num == state().boundariesCrossed) {
            myModifiableComponents_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myModifiableComponents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkPackage() {
        ASTNode$State state = state();
        boolean isOkPackage_value = actualInstClass().isOkPackage();

        return isOkPackage_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numInstExternal() {
        ASTNode$State state = state();
        int numInstExternal_value = actualInstClass().numInstExternal();

        return numInstExternal_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFAlgorithm() {
        ASTNode$State state = state();
        int numFAlgorithm_value = actualInstClass().numFAlgorithm();

        return numFAlgorithm_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeReplacedFor(InstNode source) {
        ASTNode$State state = state();
        boolean canBeReplacedFor_InstNode_value = super.canBeReplacedFor(source) || myTargetInstClassDecl().canBeReplacedFor(source);

        return canBeReplacedFor_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstExternal findFunctionExternal() {
        ASTNode$State state = state();
        InstExternal findFunctionExternal_value = actualInstClass().findFunctionExternal();

        return findFunctionExternal_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(false, actualInstClass());

        return extraNodesToSetModLevelFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl actualInstClass() {
        ASTNode$State state = state();
        InstClassDecl actualInstClass_value = isRecursive() ? unknownInstClassDecl() : myTargetInstClassDecl().actualInstClass();

        return actualInstClass_value;
    }
    protected Map genericLookupInstClass_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstClass_String_reset() {
        genericLookupInstClass_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> genericLookupInstClass(String name) {
        Object _parameters = name;
        if (genericLookupInstClass_String_values == null) genericLookupInstClass_String_values = new HashMap(4);
        if(genericLookupInstClass_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstClassDecl>)genericLookupInstClass_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstClassDecl> genericLookupInstClass_String_value = actualInstClass().genericLookupInstClass(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstClass_String_values.put(_parameters, genericLookupInstClass_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstClass_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassLocal(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> superLookupInstClassLocal_String_value = actualInstClass().superLookupInstClassLocal(name);

        return superLookupInstClassLocal_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> memberInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> memberInstClass_String_value = actualInstClass().memberInstClass(name);

        return memberInstClass_String_value;
    }
    protected Map genericLookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstComponent_String_reset() {
        genericLookupInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstComponent(String name) {
        Object _parameters = name;
        if (genericLookupInstComponent_String_values == null) genericLookupInstComponent_String_values = new HashMap(4);
        if(genericLookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)genericLookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> genericLookupInstComponent_String_value = actualInstClass().genericLookupInstComponent(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstComponent_String_values.put(_parameters, genericLookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstComponent_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> arrayMemberInstComponent(String name, int ndims) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> arrayMemberInstComponent_String_int_value = actualInstClass().arrayMemberInstComponent(name, ndims);

        return arrayMemberInstComponent_String_int_value;
    }
    protected Map memberInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstComponent_String_reset() {
        memberInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstComponent(String name) {
        Object _parameters = name;
        if (memberInstComponent_String_values == null) memberInstComponent_String_values = new HashMap(4);
        if(memberInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstComponent_String_value = actualInstClass().memberInstComponent(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstComponent_String_values.put(_parameters, memberInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstComponent_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstantFirst(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> memberInstConstantFirst_String_value = actualInstClass().memberInstConstantFirst(name);

        return memberInstConstantFirst_String_value;
    }
    protected Map memberInstConstantWithExtends_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstConstantWithExtends_String_reset() {
        memberInstConstantWithExtends_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstantWithExtends(String name) {
        Object _parameters = name;
        if (memberInstConstantWithExtends_String_values == null) memberInstConstantWithExtends_String_values = new HashMap(4);
        if(memberInstConstantWithExtends_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstConstantWithExtends_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstConstantWithExtends_String_value = actualInstClass().memberInstConstantWithExtends(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstConstantWithExtends_String_values.put(_parameters, memberInstConstantWithExtends_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstConstantWithExtends_String_value;
    }
    protected Map memberInstConstant_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstConstant_String_reset() {
        memberInstConstant_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstant(String name) {
        Object _parameters = name;
        if (memberInstConstant_String_values == null) memberInstConstant_String_values = new HashMap(4);
        if(memberInstConstant_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstConstant_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstConstant_String_value = actualInstClass().memberInstConstant(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstConstant_String_values.put(_parameters, memberInstConstant_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstConstant_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        boolean isExternalObject_value = false;

        return isExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> targetClassInstModifications() {
        ASTNode$State state = state();
        java.util.List<InstModification> targetClassInstModifications_value = isRecursive() ? Collections.<InstModification>emptyList() : myTargetInstClassDecl().classInstModifications();

        return targetClassInstModifications_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean totalMergedEnvironment_computed = false;
    /**
     * @apilevel internal
     */
    protected Environment totalMergedEnvironment_value;
    /**
     * @apilevel internal
     */
    private void totalMergedEnvironment_reset() {
        totalMergedEnvironment_computed = false;
        totalMergedEnvironment_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment totalMergedEnvironment() {
        if(totalMergedEnvironment_computed) {
            return totalMergedEnvironment_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        totalMergedEnvironment_value = actualInstClass().getMergedEnvironment();
        if (isFinal && num == state().boundariesCrossed) {
            totalMergedEnvironment_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return totalMergedEnvironment_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstRestriction inheritedRestriction(boolean checkMine) {
        ASTNode$State state = state();
        InstRestriction inheritedRestriction_boolean_value = actualInstClass().inheritedRestriction(true);

        return inheritedRestriction_boolean_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getTarget_computed = false;
    /**
     * @apilevel internal
     */
    protected InstAccess getTarget_value;
    /**
     * @apilevel internal
     */
    private void getTarget_reset() {
        getTarget_computed = false;
        getTarget_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getTarget() {
        if(getTarget_computed) {
            return (InstAccess) getChild(getTargetChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getTarget_value = getBaseClassDecl().superClasses().iterator().next().getSuper().newInstAccess();
        setChild(getTarget_value, getTargetChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getTarget_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        InstAccess node = (InstAccess) this.getChild(getTargetChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myTargetInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myTargetInstClassDecl_value = getTarget().myInstClassDecl();

        return myTargetInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String baseClassName() {
        ASTNode$State state = state();
        String baseClassName_value = actualInstClass().baseClassName();

        return baseClassName_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstEnumLiteral> enumLiterals() {
        ASTNode$State state = state();
        ArrayList<InstEnumLiteral> enumLiterals_value = actualInstClass().enumLiterals();

        return enumLiterals_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsPrimitive() {
        ASTNode$State state = state();
        boolean extendsPrimitive_value = actualInstClass().isOrExtendsPrimitive();

        return extendsPrimitive_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsEnum() {
        ASTNode$State state = state();
        boolean extendsEnum_value = actualInstClass().extendsEnum();

        return extendsEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FSubscript> myFSubscripts() {
        ASTNode$State state = state();
        java.util.List<FSubscript> myFSubscripts_value = actualInstClass().myFSubscripts();

        return myFSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode findConstrainingInstType() {
        ASTNode$State state = state();
        InstNode findConstrainingInstType_value = myTargetInstClassDecl().constrainingInstType();

        return findConstrainingInstType_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getClassDecl().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl finalClass() {
        ASTNode$State state = state();
        InstClassDecl finalClass_value = actualInstClass().finalClass();

        return finalClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = actualInstClass().isInput();

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = actualInstClass().isOutput();

        return isOutput_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupInstClass(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupInstComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getTargetNoTransform()) {
            return Kind.CLASS_ACCESS;
        }
        else {
            return super.Define_kind(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
