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
 * Generic vectorized function call expression in instance trees.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1309
 * @production InstVectorFunctionCall : {@link InstFunctionCall} ::= <span class="component">&lt;Dims:int&gt;</span>;

 */
public class InstVectorFunctionCall extends InstFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3322
     */
    @Override
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        evaluateVector(evaluator, values);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2727
     */
    public FFunctionCall createFFunctionCall(FIdUse name, List args, FType type) {
        boolean[] vectorFlags = new boolean[getNumArg()];
        int i = 0;
        for (InstFunctionArgument e : getArgs())
            vectorFlags[i++] = e.isVectorized();
        return new FVectorFunctionCall(name, args, type, size(), vectorFlags);
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstVectorFunctionCall() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public InstVectorFunctionCall(InstAccess p0, List<InstFunctionArgument> p1, int p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setDims(p2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        vectorizedSize_reset();
        getFType_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:49
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public InstVectorFunctionCall clone() throws CloneNotSupportedException {
        InstVectorFunctionCall node = (InstVectorFunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public InstVectorFunctionCall copy() {
        try {
            InstVectorFunctionCall node = (InstVectorFunctionCall) clone();
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
     * @declaredat ASTNode:81
     */
    public InstVectorFunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public InstVectorFunctionCall treeCopyNoTransform() {
        InstVectorFunctionCall tree = (InstVectorFunctionCall) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
                case 3:
                    tree.children[i] = null;
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
     * @declaredat ASTNode:116
     */
    public InstVectorFunctionCall treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:123
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_Dims == ((InstVectorFunctionCall)node).tokenint_Dims);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public InstAccess getName() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public InstAccess getNameNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<InstFunctionArgument> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Arg list.
     * @return Number of children in the Arg list.
     * @apilevel high-level
     */
    public int getNumArg() {
        return getArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Arg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Arg list.
     * @apilevel low-level
     */
    public int getNumArgNoTransform() {
        return getArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Arg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Arg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getArg(int i) {
        return (InstFunctionArgument) getArgList().getChild(i);
    }
    /**
     * Check whether the Arg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasArg() {
        return getArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the Arg list.
     * @param node The element to append to the Arg list.
     * @apilevel high-level
     */
    public void addArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<InstFunctionArgument> getArgList() {
        List<InstFunctionArgument> list = (List<InstFunctionArgument>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgsNoTransform() {
        return getArgListNoTransform();
    }
    /**
     * Replaces the lexeme Dims.
     * @param value The new value for the lexeme Dims.
     * @apilevel high-level
     */
    public void setDims(int value) {
        tokenint_Dims = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Dims;
    /**
     * Retrieves the value for the lexeme Dims.
     * @return The value for the lexeme Dims.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Dims")
    public int getDims() {
        return tokenint_Dims;
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 2;
    }
    /**
     * Retrieves the FType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FType child.
     * @apilevel low-level
     */
    public FType getFTypeNoTransform() {
        return (FType) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child FType.
     * @return The the child position of the optional child FType.
     * @apilevel low-level
     */
    protected int getFTypeChildPosition() {
        return 3;
    }
    /**
     * @apilevel internal
     */
    protected boolean ndims_computed = false;
    /**
     * @apilevel internal
     */
    protected int ndims_value;
    /**
     * @apilevel internal
     */
    private void ndims_reset() {
        ndims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        if(ndims_computed) {
            return ndims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ndims_value = getDims();
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return ndims_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean vectorizedSize_computed = false;
    /**
     * @apilevel internal
     */
    protected Size vectorizedSize_value;
    /**
     * @apilevel internal
     */
    private void vectorizedSize_reset() {
        vectorizedSize_computed = false;
        vectorizedSize_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size vectorizedSize() {
        if(vectorizedSize_computed) {
            return vectorizedSize_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        vectorizedSize_value = vectorizedSize_compute();
        if (isFinal && num == state().boundariesCrossed) {
            vectorizedSize_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return vectorizedSize_value;
    }
    /**
     * @apilevel internal
     */
    private Size vectorizedSize_compute() {
            boolean func = inFunction();
            int tot = getNumArg(), n = 0, ndims = ndims();
            Size[] candidates = new Size[tot];
            int[] freq = new int[tot];
            
            for (InstFunctionArgument arg : getArgs()) {
                if (arg.isVectorized()) {
                    Size s = arg.size().contractRight(ndims);
                    for (int i = 0; i < n && s != null; i++) {
                        if (!candidates[i].equivalent(s, func)) {
                            if (func && candidates[i].isUnknown())
                                candidates[i] = candidates[i].createKnown(s);
                            s = null;
                            freq[i]++;
                        }
                    }
                    if (s != null)
                        candidates[n++] = s;
                }
            }
        
            int index = 0;
            for (int i = 1; i < n; i++) 
                if (freq[index] < freq[i]) 
                    index = i;
            return candidates[index];
        }
    /**
     * @apilevel internal
     */
    protected boolean getFType_computed = false;
    /**
     * @apilevel internal
     */
    protected FType getFType_value;
    /**
     * @apilevel internal
     */
    private void getFType_reset() {
        getFType_computed = false;
        getFType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType getFType() {
        if(getFType_computed) {
            return (FType) getChild(getFTypeChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFType_value = declType().removeInputs().createSizeFExp(this).sizedType(vectorizedSize());
        setChild(getFType_value, getFTypeChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FType node = (FType) this.getChild(getFTypeChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonVectorizedFunctionCall() {
        ASTNode$State state = state();
        boolean isNonVectorizedFunctionCall_value = false;

        return isNonVectorizedFunctionCall_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:463
     * @apilevel internal
     */
    public Size Define_vectorizedSize(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return vectorizedSize();
        }
        else {
            return super.Define_vectorizedSize(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:892
     * @apilevel internal
     */
    public boolean Define_inVectorizedCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
