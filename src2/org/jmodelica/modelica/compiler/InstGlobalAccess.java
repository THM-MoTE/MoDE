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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:165
 * @production InstGlobalAccess : {@link InstAccess} ::= <span class="component">{@link InstAccess}</span>;

 */
public class InstGlobalAccess extends InstAccess implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2087
     */
    protected InstGlobalAccess specifyEach(Index i, int[] dim) {
		return new InstGlobalAccess(getInstAccess().specifyEach(i, dim));
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1712
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(".");
		p.print(getInstAccess(), str, indent);
	}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:584
     */
    protected void typeError(InstAccess top) {
	  getInstAccess().typeError(top);
  }
    /**
     * @aspect InstDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:182
     */
    public void dumpTree(String indent) {
  	super.dumpTree(indent);
  	getInstAccess().dumpTree(indent+" ");
  }
    /**
     * @declaredat ASTNode:1
     */
    public InstGlobalAccess() {
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
    }
    /**
     * @declaredat ASTNode:13
     */
    public InstGlobalAccess(InstAccess p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:19
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:25
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        name_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:44
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public InstGlobalAccess clone() throws CloneNotSupportedException {
        InstGlobalAccess node = (InstGlobalAccess) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public InstGlobalAccess copy() {
        try {
            InstGlobalAccess node = (InstGlobalAccess) clone();
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
     * @declaredat ASTNode:76
     */
    public InstGlobalAccess fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:85
     */
    public InstGlobalAccess treeCopyNoTransform() {
        InstGlobalAccess tree = (InstGlobalAccess) copy();
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
     * @declaredat ASTNode:105
     */
    public InstGlobalAccess treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:112
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the InstAccess child.
     * @param node The new node to replace the InstAccess child.
     * @apilevel high-level
     */
    public void setInstAccess(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the InstAccess child.
     * @return The current node used as the InstAccess child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstAccess")
    public InstAccess getInstAccess() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the InstAccess child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstAccess child.
     * @apilevel low-level
     */
    public InstAccess getInstAccessNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = getInstAccess().ndims();

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FArraySubscripts> allFArraySubscripts() {
        ASTNode$State state = state();
        java.util.List<FArraySubscripts> allFArraySubscripts_value = getInstAccess().allFArraySubscripts();

        return allFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FArraySubscripts> qualifiedAllFArraySubscripts() {
        ASTNode$State state = state();
        java.util.List<FArraySubscripts> qualifiedAllFArraySubscripts_value = allFArraySubscripts();

        return qualifiedAllFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size arraySize() {
        ASTNode$State state = state();
        Size arraySize_value = getInstAccess().arraySize();

        return arraySize_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = getInstAccess().ceval(evaluator, i);

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess splitArrayAccess(int index) {
        ASTNode$State state = state();
        InstAccess splitArrayAccess_int_value = new InstGlobalAccess(getInstAccess().splitArrayAccess(index));

        return splitArrayAccess_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = getInstAccess().myInstClassDecl();

        return myInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasLookupProblem() {
        ASTNode$State state = state();
        boolean hasLookupProblem_value = getInstAccess().hasLookupProblem();

        return hasLookupProblem_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myInstComponentDecl_value = getInstAccess().myInstComponentDecl();

        return myInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<? extends InstLookupResult.Item> myInstLookup() {
        ASTNode$State state = state();
        InstLookupResult<? extends InstLookupResult.Item> myInstLookup_value = getInstAccess().myInstLookup();

        return myInstLookup_value;
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
        name_value = "." + getInstAccessNoTransform().name();
        if (isFinal && num == state().boundariesCrossed) {
            name_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        String qualifiedName_value = "." + getInstAccess().qualifiedName();

        return qualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastName() {
        ASTNode$State state = state();
        String lastName_value = getInstAccessNoTransform().lastName();

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
        InstAccess getLastInstAccess_value = getInstAccess().getLastInstAccess();

        return getLastInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getFirstInstAccess() {
        ASTNode$State state = state();
        InstAccess getFirstInstAccess_value = getInstAccess().getFirstInstAccess();

        return getFirstInstAccess_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessNoTransform()) {
            return lookupInstClassFromTop(name);
        }
        else {
            return getParent().Define_lookupInstClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstAccessNoTransform()) {
            return InstLookupResult.notFound();
        }
        else {
            return getParent().Define_lookupInstComponent(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:968
     * @apilevel internal
     */
    public InstAccess Define_retrieveTopInstAccess(ASTNode caller, ASTNode child, InstAccess pre) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
