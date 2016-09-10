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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:154
 * @production InstDot : {@link InstAccess} ::= <span class="component">{@link InstAccess}*</span>;

 */
public class InstDot extends InstAccess implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2080
     */
    protected InstDot specifyEach(Index i, int[] dim) {
		List<InstAccess> l = new List<InstAccess>();
		for (InstAccess ia : getInstAccesss())
			l.add(ia.specifyEach(i, dim));
		return new InstDot(l);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1708
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		getInstAccesss().prettyPrintWithSep(p, str, indent, ".");
	}
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:388
     */
    public FExp createSizeFExp(FExp.FunctionSizeContextReplacer crp) {
        FExp exp = null;
        for (InstAccess ia : getInstAccesss()) {
            if (exp == null) {
                exp = ia.createSizeFExp(crp);
            } else {
                exp = exp.component(ia.name()).cell(crp, ia.getFArraySubscripts());
            }
        }
        return exp;
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:765
     */
    public void forceUsesInSubscriptsVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        for (InstAccess ia : getInstAccesss())
            ia.forceUsesInSubscriptsVariability(checkType, v);
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1114
     */
    public void collectErrors(ErrorCheckType checkType) {
        for (InstAccess ia : getInstAccesss()) {
            ia.collectErrors(checkType);
            if (ia.isUnknown() || !ia.myInstComponentDecl().shouldCheckInto(checkType))
                break;
        }
        allChecks(checkType);
    }
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:96
     */
    public void generateClassLookupProblems(InstLookupResult lookup, ASTNode n) {
         getInstAccess(getNumInstAccess() - 1).generateClassLookupProblems(lookup, n);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:580
     */
    protected void typeError(InstAccess top) {
	  getLastInstAccess().typeError(top);
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1228
     */
    public void typeCheck(ErrorCheckType checkType) {
	  // Check for accesses to non-constant component in class
	  int n = getNumInstAccess();
	  for (int i = 0; i < n - 1; i++)
		  getInstAccess(i).checkAccessCompInClassLeft(getInstAccess(i + 1), checkType);
	  super.typeCheck(checkType);
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2074
     */
    public void extractNonParameterIndices(List<FSubscript> sub, FTypePrefixVariability v) {
        for (InstAccess ia : getInstAccesss()) {
            ia.extractNonParameterIndices(sub, v);
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2172
     */
    public FQName flattenAssignablePart(FQName prefix) {
        return flattenName(prefix, prefix, firstAssignableIndex());
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2208
     */
    public FQName flattenOuterAccess(FQName prefix) {
        int i;
        for (i = getNumInstAccess() - 1; i > 0 && !getInstAccess(i).myInstComponentDecl().isInner(); i--) {}
        FQName innerPrefix = getInstAccess(i).myInstComponentDecl().getFQName().copyPrefix();
        return flattenName(prefix, innerPrefix, i);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2252
     */
    public FQName flattenName(FQName prefix, FQName base, int first) {
        FQName res = base.copyAsFQNameFull();
        for (int i = first; i < getNumInstAccess(); i++) {
            InstAccess cur = getInstAccess(i);
            res = res.append(cur.name(), cur.flattenFAS(prefix));
        }
        return res;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2283
     */
    protected void flattenPartsAndResolveIndices(FQName prefix, FQNameFull target) {
        for (InstAccess ia : getInstAccesss())
            ia.flattenPartsAndResolveIndices(prefix, target);
    }
    /**
     * @aspect InstDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:176
     */
    public void dumpTree(String indent) {
  	super.dumpTree(indent);
	for (InstAccess ia : getInstAccesss())
		ia.dumpTree(indent+" ");
   }
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1016
     */
    public InstDot copyAndAppend(String id) {
    	InstDot res = fullCopy();
    	res.addInstAccess(createPartToAppend(id));
    	return res;
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstDot() {
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
    public InstDot(List<InstAccess> p0) {
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
    public InstDot clone() throws CloneNotSupportedException {
        InstDot node = (InstDot) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public InstDot copy() {
        try {
            InstDot node = (InstDot) clone();
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
    public InstDot fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public InstDot treeCopyNoTransform() {
        InstDot tree = (InstDot) copy();
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
    public InstDot treeCopy() {
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
     * Replaces the InstAccess list.
     * @param list The new list node to be used as the InstAccess list.
     * @apilevel high-level
     */
    public void setInstAccessList(List<InstAccess> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the InstAccess list.
     * @return Number of children in the InstAccess list.
     * @apilevel high-level
     */
    public int getNumInstAccess() {
        return getInstAccessList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstAccess list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstAccess list.
     * @apilevel low-level
     */
    public int getNumInstAccessNoTransform() {
        return getInstAccessListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstAccess list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstAccess list.
     * @apilevel high-level
     */
    public InstAccess getInstAccess(int i) {
        return (InstAccess) getInstAccessList().getChild(i);
    }
    /**
     * Check whether the InstAccess list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstAccess() {
        return getInstAccessList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstAccess list.
     * @param node The element to append to the InstAccess list.
     * @apilevel high-level
     */
    public void addInstAccess(InstAccess node) {
        List<InstAccess> list = (parent == null || state == null) ? getInstAccessListNoTransform() : getInstAccessList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstAccessNoTransform(InstAccess node) {
        List<InstAccess> list = getInstAccessListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstAccess list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstAccess(InstAccess node, int i) {
        List<InstAccess> list = getInstAccessList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the InstAccess list.
     * @return The node representing the InstAccess list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="InstAccess")
    public List<InstAccess> getInstAccessList() {
        List<InstAccess> list = (List<InstAccess>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the InstAccess list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstAccess list.
     * @apilevel low-level
     */
    public List<InstAccess> getInstAccessListNoTransform() {
        return (List<InstAccess>) getChildNoTransform(0);
    }
    /**
     * Retrieves the InstAccess list.
     * @return The node representing the InstAccess list.
     * @apilevel high-level
     */
    public List<InstAccess> getInstAccesss() {
        return getInstAccessList();
    }
    /**
     * Retrieves the InstAccess list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstAccess list.
     * @apilevel low-level
     */
    public List<InstAccess> getInstAccesssNoTransform() {
        return getInstAccessListNoTransform();
    }
    /**
     * Get array dimensions.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:324
     */
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        try {
                int n = 0;
                for (InstAccess ia : getInstAccesss()) {
                    n = n + ia.ndims();
                }
                return n;
            }
        finally {
        }
    }
    /**
     * Get the expanded FArraySubscripts of each part of this access.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:339
     */
    @ASTNodeAnnotation.Attribute
    public java.util.List<FArraySubscripts> allFArraySubscripts() {
        ASTNode$State state = state();
        try {
        		int n = getNumInstAccess();
        		java.util.List<FArraySubscripts>[] lists = new java.util.List[n];
        		for (int i = 0; i < n; i++)
        			lists[i] = getInstAccess(i).allFArraySubscripts();
        		return concatenation(lists);
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1005
     */
    @ASTNodeAnnotation.Attribute
    public Size arraySize() {
        ASTNode$State state = state();
        try {
                MutableSize s = new MutableSize(ndims());
                for (InstAccess ia : getInstAccesss()) {
                    s.append(ia.size());
                }
                return s;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = getLastInstAccess().ceval(evaluator, i);

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numParts() {
        ASTNode$State state = state();
        int numParts_value = getNumInstAccess();

        return numParts_value;
    }
    /**
     * @attribute syn
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2839
     */
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnectorPart() {
        ASTNode$State state = state();
        try {
                InstComponentDecl conn = findReferencedExpandableConnector();
                return conn != null && conn != myInstComponentDecl();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2845
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findReferencedExpandableConnector() {
        ASTNode$State state = state();
        try {
                for (int i = getNumInstAccess() - 1; i >= 0; i--) {
                    InstComponentDecl conn = getInstAccess(i).findReferencedExpandableConnector();
                    if (conn != null)
                        return conn;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2863
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess findExpandableMemberPart(InstComponentDecl expandable) {
        ASTNode$State state = state();
        try {
                for (int i = getNumInstAccess() - 2; i >= 0; i--) 
                    if (getInstAccess(i).findReferencedExpandableConnector() != null)
                        return getInstAccess(i + 1);
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1488
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess splitArrayAccess(int index) {
        ASTNode$State state = state();
        try {
                List<InstAccess> l = new List<InstAccess>();
                boolean split = false;
                for (InstAccess ia : getInstAccesss()) {
                    if (!split && ia.isArray()) {
                        l.add(ia.splitArrayAccess(index));
                        split = true;
                    } else {
                        l.add(ia.treeCopy());
                    }
                }
                return new InstDot(l);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2157
     */
    @ASTNodeAnnotation.Attribute
    public int firstAssignableIndex() {
        ASTNode$State state = state();
        try {
                for (int i = 0, n = getNumInstAccess(); i < n; i++)
                    if (getInstAccess(i).isAssignable())
                        return i;
                return -1;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstAssignable topInstAssignable() {
        ASTNode$State state = state();
        InstAssignable topInstAssignable_value = getInstAccess(firstAssignableIndex()).topInstAssignable();

        return topInstAssignable_value;
    }
    /**
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2176
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasUnknownIndices() {
        ASTNode$State state = state();
        try {
                for (InstAccess ia : getInstAccesss())
                    if (ia.hasUnknownIndices())
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = getLastInstAccess().myInstClassDecl();

        return myInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getInstAccessNoListTrans(int i) {
        ASTNode$State state = state();
        InstAccess getInstAccessNoListTrans_int_value = (InstAccess) getInstAccessListNoTransform().getChild(i);

        return getInstAccessNoListTrans_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasLookupProblem() {
        ASTNode$State state = state();
        boolean hasLookupProblem_value = getInstAccess(getNumInstAccess() - 1).hasLookupProblem();

        return hasLookupProblem_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myInstComponentDecl_value = getLastInstAccess().myInstComponentDecl();

        return myInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<? extends InstLookupResult.Item> myInstLookup() {
        ASTNode$State state = state();
        InstLookupResult<? extends InstLookupResult.Item> myInstLookup_value = getLastInstAccess().myInstLookup();

        return myInstLookup_value;
    }
    /**
     * @attribute syn
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:252
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability variability = fConstant();
                for (InstAccess part : getInstAccesss())
                    variability = variability.combine(part.indexVariability());
                return variability;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = getLastInstAccess().isUnknown();

        return isUnknown_value;
    }
    /**
     * @attribute syn
     * @aspect Types
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:137
     */
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingTypeOfClass() {
        ASTNode$State state = state();
        try {
                InstNode cur = getInstAccess(0).constrainingTypeOfClass();
                for (int i = 1, n = getNumInstAccess(); i < n; i++) {
                    InstLookupResult<InstClassDecl> res = cur.memberInstClass(getInstAccess(i).name());
                    if (res.successful()) {
                        cur = res.target().constrainingInstType();
                    } else {
                        cur = getInstAccess(i).constrainingTypeOfClass();
                    }
                }
                return cur;
            }
        finally {
        }
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
    	  List<InstAccess> l = getInstAccessListNoTransform();
    	  for (int i = 0; i < l.getNumChildNoTransform(); i++) {
    		  buf.append(l.getChildNoTransform(i).name());
    		  buf.append('.');
    	  }
    	  return buf.substring(0, buf.length() - 1);
      }
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:610
     */
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        try {
        	  StringBuilder buf = new StringBuilder();
        	  for (InstAccess ia : getInstAccesss()) {
        		  buf.append(ia.qualifiedName());
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
        String lastName_value = getInstAccessListNoTransform().lastChildNoTransform().lastName();

        return lastName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String enclosingName() {
        ASTNode$State state = state();
        String enclosingName_value = name().substring(0, name().lastIndexOf('.'));

        return enclosingName_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getLastInstAccess() {
        ASTNode$State state = state();
        InstAccess getLastInstAccess_value = getInstAccess(getNumInstAccessNoTransform() - 1);

        return getLastInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getFirstInstAccess() {
        ASTNode$State state = state();
        InstAccess getFirstInstAccess_value = getInstAccess(0);

        return getFirstInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<InstAccess> allParts() {
        ASTNode$State state = state();
        Iterable<InstAccess> allParts_value = getInstAccessList();

        return allParts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = getLastInstAccess().getFArraySubscripts();

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = getLastInstAccess().hasFArraySubscripts();

        return hasFArraySubscripts_value;
    }
    /**
     * @attribute syn
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1443
     */
    @ASTNodeAnnotation.Attribute
    public boolean isDisabled() {
        ASTNode$State state = state();
        try {
            	for (InstAccess ia : getInstAccesss())
            		if (ia.isDisabled())
            			return true;
            	return false;
            }
        finally {
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2556
     * @apilevel internal
     */
    public CValue Define_cevalRecordMember(ASTNode caller, ASTNode child, VariableEvaluator evaluator, InstNamedAccess access) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? cevalRecordMember(evaluator, access) : getInstAccess(i - 1).ceval(evaluator).record().getMember(access.getID());
        }
        else {
            return super.Define_cevalRecordMember(caller, child, evaluator, access);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:209
     * @apilevel internal
     */
    public List<InstAccess> Define_accessContextInst(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i == 0 ? new List<InstAccess>() : getInstAccess(i-1).buildAccessContext();
        }
        else {
            return getParent().Define_accessContextInst(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:114
     * @apilevel internal
     */
    public boolean Define_isExpandableConnectorMemberInConnect(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return isExpandableConnectorPart() && inConnectWithExistingComponent();
        }
        else {
            return super.Define_isExpandableConnectorMemberInConnect(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1839
     * @apilevel internal
     */
    public boolean Define_expandSize(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            {
                    for (int j = 0; j < i; j++) {
                        if (!getInstAccess(j).indexVariability().indexParameterOrLess()) {
                            return false;
                        }
                    }
                    return true;
                }
        }
        else {
            return getParent().Define_expandSize(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i != getNumInstAccess() - 1 || flattenFASContext();
        }
        else {
            return super.Define_flattenFASContext(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? lookupInstClass(name) : getInstAccessNoListTrans(i - 1).qualifiedLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:319
     * @apilevel internal
     */
    public InstClassDecl Define_lookupConstrainingInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return lookupConstrainingInstClassHelper((i == 0) ? null : getInstAccessNoListTrans(i - 1), name);
        }
        else {
            return super.Define_lookupConstrainingInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? lookupInstComponent(name) : getInstAccessNoListTrans(i - 1).qualifiedLookupInstComponent(name);
        }
        else {
            return getParent().Define_lookupInstComponent(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:380
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupConstrainingInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return lookupConstrainingInstComponentHelper((i == 0) ? null : getInstAccessNoListTrans(i - 1), name);
        }
        else {
            return super.Define_lookupConstrainingInstComponent(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:409
     * @apilevel internal
     */
    public InstNode Define_findClosestConstrainingInstNode(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? null : getInstAccessNoListTrans(i - 1).closestConstrainingDecl();
        }
        else {
            return super.Define_findClosestConstrainingInstNode(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            {
            		List<InstAccess> accesses = getInstAccesssNoTransform();
            		if (i >= accesses.getNumChildNoTransform() - 1)
            			return kind();
            		else
            			return accesses.getChildNoTransform(i + 1).kind().predKind(i);
            	}
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:908
     * @apilevel internal
     */
    public InstAccess Define_getNextInstAccess(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i >= getNumInstAccessNoTransform() - 1) ? null : getInstAccess(i + 1);
        }
        else {
            return super.Define_getNextInstAccess(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:968
     * @apilevel internal
     */
    public InstAccess Define_retrieveTopInstAccess(ASTNode caller, ASTNode child, InstAccess pre) {
        int childIndex = this.getIndexOfChild(caller);
        return retrieveTopInstAccess(this);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:976
     * @apilevel internal
     */
    public boolean Define_inQualified(ASTNode caller, ASTNode child) {
        if (caller == getInstAccessListNoTransform()) {
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
