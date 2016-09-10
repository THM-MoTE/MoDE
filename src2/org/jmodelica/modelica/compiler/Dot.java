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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:393
 * @production Dot : {@link Access} ::= <span class="component">{@link Access}*</span>;

 */
public class Dot extends Access implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:833
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		getAccesss().prettyPrintWithSep(p, str, indent, ".");
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1511
     */
    public InstAccess newInstAccess() {
		List<InstAccess> l = new List<InstAccess>();
		for (Access a : getAccesss())
			l.add(a.newInstAccess());
		InstDot ia = new InstDot(l);
		ia.setLocation(this);
		return ia;
	}
    /**
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:67
     */
    public void dumpTree(String indent) {
  	super.dumpTree(indent);
  	indent += ' ';
  	for (Access ia : getAccesss())
  		ia.dumpTree(indent);
  }
    /**
     * @aspect DumpTreeBasic
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:209
     */
    public void dumpTreeBasic(String indent) {
  	for(int i = 0; i < getNumChild(); i++)
      getChild(i).dumpTreeBasic(indent + "  ");
  }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1126
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		getAccesss().prettyPrintWithSep(printer, printStream, null, ".");
	}
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:935
     */
    public Access stripFirstAccess() {
    	int n = getNumAccess();
    	if (n <= 2)
    		return getAccess(n - 1);
    	List<Access> l = new List<Access>();
    	for (int i = 1; i < n; i++)
    		l.add(getAccess(i));
        return new Dot(l);
    }
    /**
     * @declaredat ASTNode:1
     */
    public Dot() {
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
        children = new ASTNode[1];
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public Dot(List<Access> p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:20
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:26
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        name_reset();
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
    public Dot clone() throws CloneNotSupportedException {
        Dot node = (Dot) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public Dot copy() {
        try {
            Dot node = (Dot) clone();
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
     * @declaredat ASTNode:77
     */
    public Dot fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public Dot treeCopyNoTransform() {
        Dot tree = (Dot) copy();
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
     * @declaredat ASTNode:106
     */
    public Dot treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:113
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Access list.
     * @param list The new list node to be used as the Access list.
     * @apilevel high-level
     */
    public void setAccessList(List<Access> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Access list.
     * @return Number of children in the Access list.
     * @apilevel high-level
     */
    public int getNumAccess() {
        return getAccessList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Access list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Access list.
     * @apilevel low-level
     */
    public int getNumAccessNoTransform() {
        return getAccessListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Access list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Access list.
     * @apilevel high-level
     */
    public Access getAccess(int i) {
        return (Access) getAccessList().getChild(i);
    }
    /**
     * Check whether the Access list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAccess() {
        return getAccessList().getNumChild() != 0;
    }
    /**
     * Append an element to the Access list.
     * @param node The element to append to the Access list.
     * @apilevel high-level
     */
    public void addAccess(Access node) {
        List<Access> list = (parent == null || state == null) ? getAccessListNoTransform() : getAccessList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAccessNoTransform(Access node) {
        List<Access> list = getAccessListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Access list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAccess(Access node, int i) {
        List<Access> list = getAccessList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Access list.
     * @return The node representing the Access list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Access")
    public List<Access> getAccessList() {
        List<Access> list = (List<Access>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Access list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Access list.
     * @apilevel low-level
     */
    public List<Access> getAccessListNoTransform() {
        return (List<Access>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Access list.
     * @return The node representing the Access list.
     * @apilevel high-level
     */
    public List<Access> getAccesss() {
        return getAccessList();
    }
    /**
     * Retrieves the Access list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Access list.
     * @apilevel low-level
     */
    public List<Access> getAccesssNoTransform() {
        return getAccessListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl findClassDecl() {
        ASTNode$State state = state();
        ClassDecl findClassDecl_value = getLastAccess().findClassDecl();

        return findClassDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean name_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_value;
    /**
     * @apilevel internal
     */
    private void name_reset() {
        name_computed = false;
        name_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        if(name_computed) {
            return name_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_value = name_compute();
        if (isFinal && num == state().boundariesCrossed) {
            name_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_value;
    }
    /**
     * @apilevel internal
     */
    private String name_compute() {
    	  StringBuilder buf = new StringBuilder();
    	  List<Access> l = getAccessListNoTransform();
    	  for (int i = 0; i < l.getNumChildNoTransform(); i++) {
    		  buf.append(l.getChildNoTransform(i).name());
    		  buf.append('.');
    	  }
    	  return buf.substring(0, buf.length() - 1);
      }
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:596
     */
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        try {
        	  StringBuilder buf = new StringBuilder();
        	  for (Access a : getAccesss()) {
        		  buf.append(a.qualifiedName());
        		  buf.append('.');
        	  }
        	  return buf.substring(0, buf.length() - 1);
          }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String lastName() {
        ASTNode$State state = state();
        String lastName_value = getAccessListNoTransform().lastChildNoTransform().lastName();

        return lastName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Access getLastAccess() {
        ASTNode$State state = state();
        Access getLastAccess_value = getAccess(getNumAccess() - 1);

        return getLastAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public Access getFirstAccess() {
        ASTNode$State state = state();
        Access getFirstAccess_value = getAccess(0);

        return getFirstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isQualified() {
        ASTNode$State state = state();
        boolean isQualified_value = true;

        return isQualified_value;
    }
    /**
     * @attribute syn
     * @aspect CompilationHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/ModelicaCompiler.jrag:2137
     */
    @ASTNodeAnnotation.Attribute
    public File findOutermostLibraryDirForWithin(File f) {
        ASTNode$State state = state();
        try {
            for (int i = getNumAccess() - 1; i >= 0 && f != null; i--)
                f = getAccess(i).findOutermostLibraryDirForWithin(f);
            return f;
        }
        finally {
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:51
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? simpleLookupClass(name) : getAccess(i - 1).findClassDecl().simpleLookupClassMemberScope(name);
        }
        else {
            return getParent().Define_simpleLookupClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:895
     * @apilevel internal
     */
    public Access Define_getNextAccess(ASTNode caller, ASTNode child) {
        if (caller == getAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i >= getNumAccess() - 1) ? null : getAccess(i + 1);
        }
        else {
            return getParent().Define_getNextAccess(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:958
     * @apilevel internal
     */
    public Access Define_retrieveTopAccess(ASTNode caller, ASTNode child, Access pre) {
        int childIndex = this.getIndexOfChild(caller);
        return retrieveTopAccess(this);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:976
     * @apilevel internal
     */
    public boolean Define_inQualified(ASTNode caller, ASTNode child) {
        if (caller == getAccessListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_inQualified(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
