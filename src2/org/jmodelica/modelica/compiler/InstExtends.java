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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:143
 * @production InstExtends : {@link InstNode} ::= <span class="component">ClassName:{@link InstAccess}</span> <span class="component">&lt;ExtendsClause:ExtendsClause&gt;</span> <span class="component">[ClassAnnotation:{@link InstClassModification}]</span> <span class="component">[ClassAnnotationExtends:{@link InstClassModification}]</span>;

 */
public class InstExtends extends InstNode implements Cloneable {
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:123
     */
    public void contentCheck(ErrorCheckType checkType) {
        if (myInstClass().isExternalObject())
            error("Classed derived from ExternalObject can neither be used in an extends-clause nor in a short class defenition");
        if (myInstClass().isOperatorRecord())
            contentCheckExtendsOperatorRecord(checkType);
    }
    /**
     * Check if this is a valid extends of an operator record.
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:133
     */
    public void contentCheckExtendsOperatorRecord(ErrorCheckType checkType) {
        error("Extending operator records is only allowed as a short class declaration");
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:989
     */
    public void collectErrors(ErrorCheckType checkType) {
	    if (!errorChecked) {
	    	if (isRecursed()) {
	    		error("Recursive class structure");
	    		errorChecked = true;
	    	} else {
				super.collectErrors(checkType);
    			errorChecked = true;
				getClassName().collectErrors(checkType);
				if (hasInstClassModification() && shouldCheckModification())
					getInstClassModification().collectErrors(checkType);
			}
	    }
	}
    /**
     * Check if extends tree is recursive.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1441
     */
    public boolean isRecursive() {
		if (recursiveCache == RECURSIVE_UNKNOWN)
			calcIsRecursive(new HashSet<InstNode>());
		return recursiveCache == RECURSIVE_YES;
	}
    /**
     * Examine extends tree to findBasePackage recursive extends nodes.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1459
     */
    public void calcIsRecursive(HashSet<InstNode> visited) {
		recursiveCache = visited.contains(this) ? RECURSIVE_YES : RECURSIVE_NO;
		visited.add(this);
		if (recursiveCache == RECURSIVE_NO) 
			myInstClass().calcIsRecursive(visited);
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1481
     */
    private byte recursiveCache              = RECURSIVE_UNKNOWN;
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2598
     */
    public void dumpTree(String indent) {
		System.out.println(indent + dump()
		                      + ": " + 
		                      getExtendsClause().getSuper().name());
		System.out.println(toString(indent+"|"));

		//getComponentDecl().dumpTree("");
		for (InstNode n : getInstClassDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstComponentDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstExtendss())
			n.dumpTree(indent + " ");

		}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2748
     */
    public String toString(String indent) {
	   StringBuilder str = new StringBuilder();
	   str.append(indent+"InstExtendsDecl:\n");
	   str.append(indent+" Extends clause: " + getExtendsClause().getSuper().name() + "\n");
       str.append(indent+ " "+ getClassName().toString());
	   appendEnvironment(str, indent);
	   //str.append(indent+" Declared type:\n");
	   //str.append(indent+declaredType().toString());
	   
	   return str.toString();	
	}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2796
     */
    public String toString() {
    	return getExtendsClause().toString();
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:652
     */
    protected long gatherMemoryUse(PrintStream out, String indent, boolean deep, int maxDepth, long minSize, int depth) {
		return super.gatherMemoryUse(out, indent, deep, maxDepth, minSize, depth);
	}
    /**
     * @declaredat ASTNode:1
     */
    public InstExtends() {
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
        children = new ASTNode[11];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new Opt(), 9);
        setChild(new Opt(), 10);
    }
    /**
     * @declaredat ASTNode:22
     */
    public InstExtends(InstAccess p0, ExtendsClause p1) {
        setChild(p0, 0);
        setExtendsClause(p1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:29
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        genericLookupInstClassInExtends_String_reset();
        memberInstComponent_String_reset();
        getClassAnnotationOpt_reset();
        getClassAnnotationExtendsOpt_reset();
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
    public InstExtends clone() throws CloneNotSupportedException {
        InstExtends node = (InstExtends) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:70
     */
    public InstExtends copy() {
        try {
            InstExtends node = (InstExtends) clone();
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
    public InstExtends fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:98
     */
    public InstExtends treeCopyNoTransform() {
        InstExtends tree = (InstExtends) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 8:
                    tree.children[i] = null;
                    continue;
                case 9:
                case 10:
                    tree.children[i] = new Opt();
                    continue;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
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
     * @declaredat ASTNode:136
     */
    public InstExtends treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:143
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenExtendsClause_ExtendsClause == ((InstExtends)node).tokenExtendsClause_ExtendsClause);    
    }
    /**
     * Replaces the ClassName child.
     * @param node The new node to replace the ClassName child.
     * @apilevel high-level
     */
    public void setClassName(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the ClassName child.
     * @return The current node used as the ClassName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ClassName")
    public InstAccess getClassName() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the ClassName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ClassName child.
     * @apilevel low-level
     */
    public InstAccess getClassNameNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Replaces the lexeme ExtendsClause.
     * @param value The new value for the lexeme ExtendsClause.
     * @apilevel high-level
     */
    public void setExtendsClause(ExtendsClause value) {
        tokenExtendsClause_ExtendsClause = value;
    }
    /**
     * @apilevel internal
     */
    protected ExtendsClause tokenExtendsClause_ExtendsClause;
    /**
     * Retrieves the value for the lexeme ExtendsClause.
     * @return The value for the lexeme ExtendsClause.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ExtendsClause")
    public ExtendsClause getExtendsClause() {
        return tokenExtendsClause_ExtendsClause;
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
        return 1;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(1);
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
        return 2;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(2);
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
        return 3;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(3);
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
        return 4;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(4);
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
        return 5;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(5);
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
        return 6;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(6);
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
        return 7;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(7);
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
        return (FQName) getChildNoTransform(8);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 8;
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
        return (Opt<InstClassModification>) getChildNoTransform(9);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 9;
    }
    /**
     * Replaces the (optional) ClassAnnotationExtends child.
     * @param node The new node to be used as the ClassAnnotationExtends child.
     * @apilevel high-level
     */
    public void setClassAnnotationExtends(InstClassModification node) {
        getClassAnnotationExtendsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ClassAnnotationExtends child exists.
     * @return {@code true} if the optional ClassAnnotationExtends child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasClassAnnotationExtends() {
        return getClassAnnotationExtendsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ClassAnnotationExtends child.
     * @return The ClassAnnotationExtends child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getClassAnnotationExtends() {
        return (InstClassModification) getClassAnnotationExtendsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child ClassAnnotationExtends. This is the <code>Opt</code> node containing the child ClassAnnotationExtends, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ClassAnnotationExtends.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getClassAnnotationExtendsOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(10);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotationExtends.
     * @return The the child position of the optional child ClassAnnotationExtends.
     * @apilevel low-level
     */
    protected int getClassAnnotationExtendsOptChildPosition() {
        return 10;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldCheckModification() {
        ASTNode$State state = state();
        boolean shouldCheckModification_value = true;

        return shouldCheckModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecursed() {
        ASTNode$State state = state();
        boolean isRecursed_value = isWithin(myInstClass());

        return isRecursed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOfInstClassDecl(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isOfInstClassDecl_InstClassDecl_value = icd == myInstClass() && !icd.isUnknown();

        return isOfInstClassDecl_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(true, myInstClass());

        return extraNodesToSetModLevelFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassRedirect(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassRedirect_String_value = genericLookupInstClassInExtends(name);

        return lookupInstClassRedirect_String_value;
    }
    protected Map genericLookupInstClassInExtends_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstClassInExtends_String_reset() {
        genericLookupInstClassInExtends_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> genericLookupInstClassInExtends(String name) {
        Object _parameters = name;
        if (genericLookupInstClassInExtends_String_values == null) genericLookupInstClassInExtends_String_values = new HashMap(4);
        if(genericLookupInstClassInExtends_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstClassDecl>)genericLookupInstClassInExtends_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstClassDecl> genericLookupInstClassInExtends_String_value = genericLookupInstClassInExtends_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstClassInExtends_String_values.put(_parameters, genericLookupInstClassInExtends_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstClassInExtends_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstClassDecl> genericLookupInstClassInExtends_compute(String name) {
            for (InstClassDecl icd : getInstClassDecls()) 
                if (icd.matches(name)) 
                    return InstLookupResult.found(icd);
            
            for (InstExtends ie : getInstExtendss()) {
                InstLookupResult<InstClassDecl> res = ie.memberInstClass(name);
                if (res.successful())
                    return res;
            }
            
            return myInstClass().genericLookupInstClass(name);
        }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:444
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassInExtends(String name) {
        ASTNode$State state = state();
        try {
                for (InstClassDecl icd : getInstClassDecls()) 
                    if (icd.matches(name)) 
                        return InstLookupResult.found(icd);
                
                return myInstClass().superLookupInstClass(name);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:453
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> memberInstClass(String name) {
        ASTNode$State state = state();
        try {
                for (InstClassDecl icd : getInstClassDecls()) 
                    if (icd.matches(name)) 
                        return InstLookupResult.found(icd);
                
                for (InstExtends ie : getInstExtendss()) {
                    InstLookupResult<InstClassDecl> res = ie.memberInstClass(name);
                    if (res.successful())
                        return res;
                }
                
                return InstLookupResult.notFound();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClass() {
        ASTNode$State state = state();
        InstClassDecl myInstClass_value = getClassName().myInstClassDecl();

        return myInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstConstant(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> genericLookupInstConstant_String_value = myInstClass().lookupInstConstant(name);

        return genericLookupInstConstant_String_value;
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
        InstLookupResult<InstComponentDecl> memberInstComponent_String_value = extendsPrimitive() ? myInstClass().memberInstComponent(name) : super.memberInstComponent(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstComponent_String_values.put(_parameters, memberInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstComponent_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode inheritingNode() {
        ASTNode$State state = state();
        InstNode inheritingNode_value = findInheritingNode();

        return inheritingNode_value;
    }
    /**
     * All local modifications except those from any target class.
     * 
     * Used for extends within components.
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:295
     */
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsNoClass() {
        ASTNode$State state = state();
        try {
                ArrayList<InstModification> l = new ArrayList<InstModification>();
                if (hasInstClassModification()) {
                    l.add(getInstClassModification());
                }
                return l;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsClass() {
        ASTNode$State state = state();
        Collection<InstModification> localInstModificationsClass_value = myInstClass().classInstModifications();

        return localInstModificationsClass_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:718
     */
    @ASTNodeAnnotation.Attribute
    public InstRedeclareClassNode retrieveReplacingClass(String name) {
        ASTNode$State state = state();
        try {
        		InstRedeclareClassNode res = super.retrieveReplacingClass(name);
        		return (res == null) ? lookupReplacingClass(name) : res;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstClassModification() {
        ASTNode$State state = state();
        boolean hasInstClassModification_value = false;

        return hasInstClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassModification getInstClassModification() {
        ASTNode$State state = state();
        InstClassModification getInstClassModification_value = null;

        return getInstClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getClassName().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        String qualifiedName_value = myInstClass().qualifiedName();

        return qualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<AbstractEquation> equations() {
        ASTNode$State state = state();
        Iterable<AbstractEquation> equations_value = myInstClass().equations();

        return equations_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Algorithm> algorithms() {
        ASTNode$State state = state();
        Iterable<Algorithm> algorithms_value = myInstClass().algorithms();

        return algorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<FAlgorithm> fAlgorithms() {
        ASTNode$State state = state();
        Iterable<FAlgorithm> fAlgorithms_value = myInstClass().fAlgorithms();

        return fAlgorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = extendsPrimitive() ? Collections.<ComponentDecl>emptyList() : myInstClass().components();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = myInstClass().superClasses();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = myInstClass().classes();

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = myInstClass().imports();

        return imports_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Modification> elementModifications() {
        ASTNode$State state = state();
        Iterable<Modification> elementModifications_value = myInstClass().elementModifications();

        return elementModifications_value;
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2019
     */
    @ASTNodeAnnotation.Attribute
    public boolean extendsPrimitive() {
        ASTNode$State state = state();
        try {
                InstClassDecl icd = myInstClass();
                return !isRecursive() && icd.isOrExtendsPrimitive();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClassDecl() {
        ASTNode$State state = state();
        boolean isClassDecl_value = isInClassDecl();

        return isClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExtends() {
        ASTNode$State state = state();
        boolean isExtends_value = true;

        return isExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentDecl() {
        ASTNode$State state = state();
        boolean isComponentDecl_value = isInComponentDecl();

        return isComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsEnum() {
        ASTNode$State state = state();
        boolean extendsEnum_value = !isRecursive() && myInstClass().extendsEnum();

        return extendsEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl getBaseInstClass() {
        ASTNode$State state = state();
        InstClassDecl getBaseInstClass_value = myInstClass().getBaseInstClass();

        return getBaseInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public int nTypeDims() {
        ASTNode$State state = state();
        int nTypeDims_value = myInstClass().nTypeDims();

        return nTypeDims_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FSubscript> myFSubscripts() {
        ASTNode$State state = state();
        java.util.List<FSubscript> myFSubscripts_value = isRecursive() ? Collections.<FSubscript>emptyList() : myInstClass().myFSubscripts();

        return myFSubscripts_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getClassAnnotationOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt<InstClassModification> getClassAnnotationOpt_value;
    /**
     * @apilevel internal
     */
    private void getClassAnnotationOpt_reset() {
        getClassAnnotationOpt_computed = false;
        getClassAnnotationOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt<InstClassModification> getClassAnnotationOpt() {
        if(getClassAnnotationOpt_computed) {
            return (Opt<InstClassModification>) getChild(getClassAnnotationOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getClassAnnotationOpt_value = new Opt<InstClassModification>();
        setChild(getClassAnnotationOpt_value, getClassAnnotationOptChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getClassAnnotationOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt<InstClassModification> node = (Opt<InstClassModification>) this.getChild(getClassAnnotationOptChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getClassAnnotationExtendsOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt<InstClassModification> getClassAnnotationExtendsOpt_value;
    /**
     * @apilevel internal
     */
    private void getClassAnnotationExtendsOpt_reset() {
        getClassAnnotationExtendsOpt_computed = false;
        getClassAnnotationExtendsOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt<InstClassModification> getClassAnnotationExtendsOpt() {
        if(getClassAnnotationExtendsOpt_computed) {
            return (Opt<InstClassModification>) getChild(getClassAnnotationExtendsOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getClassAnnotationExtendsOpt_value = new Opt<InstClassModification>();
        setChild(getClassAnnotationExtendsOpt_value, getClassAnnotationExtendsOptChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getClassAnnotationExtendsOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt<InstClassModification> node = (Opt<InstClassModification>) this.getChild(getClassAnnotationExtendsOptChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = " extending \"" + getClassName().name() + "\"";

        return extraMemoryUseInfo_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecord() {
        ASTNode$State state = state();
        boolean inRecord_value = getParent().Define_inRecord(this, null);

        return inRecord_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2349
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecordConstructor() {
        ASTNode$State state = state();
        boolean inRecordConstructor_value = getParent().Define_inRecordConstructor(this, null);

        return inRecordConstructor_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1609
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1616
     */
    @ASTNodeAnnotation.Attribute
    public boolean extendsInFunction() {
        ASTNode$State state = state();
        boolean extendsInFunction_value = getParent().Define_extendsInFunction(this, null);

        return extendsInFunction_value;
    }
    /**
     * Check if this node is in an InstComponentDecl.
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:639
     */
    @ASTNodeAnnotation.Attribute
    public boolean inInstComponent() {
        ASTNode$State state = state();
        boolean inInstComponent_value = getParent().Define_inInstComponent(this, null);

        return inInstComponent_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1492
     */
    @ASTNodeAnnotation.Attribute
    public boolean isWithin(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isWithin_InstClassDecl_value = getParent().Define_isWithin(this, null, icd);

        return isWithin_InstClassDecl_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1596
     */
    @ASTNodeAnnotation.Attribute
    public InstValueModification inheritedInstValueModTop() {
        ASTNode$State state = state();
        InstValueModification inheritedInstValueModTop_value = getParent().Define_inheritedInstValueModTop(this, null);

        return inheritedInstValueModTop_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1927
     */
    @ASTNodeAnnotation.Attribute
    public int argIndexInRecordConstructor() {
        ASTNode$State state = state();
        int argIndexInRecordConstructor_value = getParent().Define_argIndexInRecordConstructor(this, null);

        return argIndexInRecordConstructor_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:63
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassFromMod(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassFromMod_String_value = getParent().Define_lookupInstClassFromMod(this, null, name);

        return lookupInstClassFromMod_String_value;
    }
    /**
     * Look up the class being redeclared & extended in the last step of a chain 
     * of "redeclare class extends" declarations.
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:175
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupTopRedeclareExtendsInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupTopRedeclareExtendsInstClass_String_value = getParent().Define_lookupTopRedeclareExtendsInstClass(this, null, name);

        return lookupTopRedeclareExtendsInstClass_String_value;
    }
    /**
     * Find the surrounding class or component.
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:337
     */
    @ASTNodeAnnotation.Attribute
    public InstNode findInheritingNode() {
        ASTNode$State state = state();
        InstNode findInheritingNode_value = getParent().Define_findInheritingNode(this, null);

        return findInheritingNode_value;
    }
    /**
     * @attribute inh
     * @aspect InstModificationType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:653
     */
    @ASTNodeAnnotation.Attribute
    public boolean inheritsFinal() {
        ASTNode$State state = state();
        boolean inheritsFinal_value = getParent().Define_inheritsFinal(this, null);

        return inheritsFinal_value;
    }
    /**
     * @attribute inh
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:152
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability parentBExpVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability parentBExpVariability_value = getParent().Define_parentBExpVariability(this, null);

        return parentBExpVariability_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:468
     */
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironmentNoClass() {
        ASTNode$State state = state();
        Environment myEnvironmentNoClass_value = getParent().Define_myEnvironmentNoClass(this, null);

        return myEnvironmentNoClass_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:469
     */
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironmentClass() {
        ASTNode$State state = state();
        Environment myEnvironmentClass_value = getParent().Define_myEnvironmentClass(this, null);

        return myEnvironmentClass_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:741
     */
    @ASTNodeAnnotation.Attribute
    public InstRedeclareClassNode lookupReplacingClass(String name) {
        ASTNode$State state = state();
        InstRedeclareClassNode lookupReplacingClass_String_value = getParent().Define_lookupReplacingClass(this, null, name);

        return lookupReplacingClass_String_value;
    }
    /**
     * Check if this extends is part of a class declaration.
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2044
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInClassDecl() {
        ASTNode$State state = state();
        boolean isInClassDecl_value = getParent().Define_isInClassDecl(this, null);

        return isInClassDecl_value;
    }
    /**
     * Check if this extends is part of a component declaration.
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2059
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInComponentDecl() {
        ASTNode$State state = state();
        boolean isInComponentDecl_value = getParent().Define_isInComponentDecl(this, null);

        return isInComponentDecl_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:842
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl enclosingInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl enclosingInstComponentDecl_value = getParent().Define_enclosingInstComponentDecl(this, null);

        return enclosingInstComponentDecl_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return inRecord();
        }
        else {
            return super.Define_inRecord(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2342
     * @apilevel internal
     */
    public boolean Define_inRecordDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inRecordDecl();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2349
     * @apilevel internal
     */
    public boolean Define_inRecordConstructor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inRecordConstructor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:202
     * @apilevel internal
     */
    public boolean Define_isForOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myInstClass().isOperatorRecord();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1492
     * @apilevel internal
     */
    public boolean Define_isWithin(ASTNode caller, ASTNode child, InstClassDecl icd) {
        int childIndex = this.getIndexOfChild(caller);
        return isOfInstClassDecl(icd) || isWithin(icd);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1596
     * @apilevel internal
     */
    public InstValueModification Define_inheritedInstValueModTop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inheritedInstValueModTop();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1695
     * @apilevel internal
     */
    public boolean Define_isOnPrimitiveTypeDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return extendsPrimitive();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1742
     * @apilevel internal
     */
    public InstNode Define_parentNodeToSetModLevelFor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return hasModificationLevel() ? null : this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1927
     * @apilevel internal
     */
    public int Define_argIndexInRecordConstructor(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return argIndexInRecordConstructorImpl(i, getInstExtendss()) + argIndexInRecordConstructor();
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return argIndexInRecordConstructorImpl(-1, getInstExtendss()) + i + argIndexInRecordConstructor();
        }
        else {
            return super.Define_argIndexInRecordConstructor(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:49
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupInnerInstComponent(ASTNode caller, ASTNode child, InstComponentDecl outer, boolean firstScope) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupInnerInstComponent(outer, firstScope);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:131
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInnerInstClass(ASTNode caller, ASTNode child, String name, boolean firstScope) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupInnerInstClass(name, firstScope);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getElementInstModificationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else if (caller == getRedeclaredInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return superLookupInstClassInExtends(name);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else if (caller == getInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else {
            return super.Define_lookupInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:63
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromMod(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClassInExtends(name);
        }
        else {
            return super.Define_lookupInstClassFromMod(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:149
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClass().lookupRedeclareExtendsInstClass(name);
        }
        else if (caller == getInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return lookupTopRedeclareExtendsInstClass(name);
        }
        else {
            return super.Define_lookupRedeclareExtendsInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getClassNameNoTransform()) {
            return Kind.CLASS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:651
     * @apilevel internal
     */
    public boolean Define_inheritsFinal(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inheritsFinal();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:468
     * @apilevel internal
     */
    public Environment Define_myEnvironmentNoClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myEnvironmentNoClass().mergeInnerClone(getElementInstModifications(), localInstModificationsNoClass());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:469
     * @apilevel internal
     */
    public Environment Define_myEnvironmentClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myEnvironmentClass().mergeInnerClone(localInstModificationsClass());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:741
     * @apilevel internal
     */
    public InstRedeclareClassNode Define_lookupReplacingClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
        		InstRedeclareClassNode res = lookupReplacingClass(name);
        		if (res != null)
        			return res;
        		for (InstClassDecl icd : getRedeclaredInstClassDecls())
        			if (icd.name().equals(name))
        				return icd;
        		return super.retrieveReplacingClass(name);
        	}
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1862
     * @apilevel internal
     */
    public String Define_instClassNamePrefix(ASTNode caller, ASTNode child, boolean sup) {
        int childIndex = this.getIndexOfChild(caller);
        return sup ? qualifiedName() : instClassNamePrefix(sup);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:842
     * @apilevel internal
     */
    public InstComponentDecl Define_enclosingInstComponentDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return enclosingInstComponentDecl();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
