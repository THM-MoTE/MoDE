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
 * Generic vectorized function call expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1294
 * @production FVectorFunctionCall : {@link FFunctionCall} ::= <span class="component">&lt;VectorSize:Size&gt;</span> <span class="component">&lt;Vectorized:boolean[]&gt;</span>;

 */
public class FVectorFunctionCall extends FFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3317
     */
    @Override
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        evaluateVector(evaluator, values);
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:277
     */
    public void knownArrayTemporaries(Scalarizer s) {
        getArray().createArrayTemporaries(s);
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:323
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        List<FExp> newArgs = new List<FExp>();
        List<FStatement> result = new List<FStatement>();
        List<FStatement> outer = s.getClauses();
        ForNames names = s.getNames();

        names.addLayer(ndims());
        names.fillLayer(this);

        List<FStatement> firstLoop = names.createForLoops(result, this, 1);
        FIdUseExp funcLeft = tempExp(names.createFArraySubscripts(1));

        for (int i = 0; i < getNumArg(); ++i) {
            FExp arg = getArg(i);

            arg.createArrayTemporaries(s.block(outer));

            if (getVectorized()[i]) {
                arg.addArrayUsesToIndexMap(s);
                int dimDiff = arg.ndims() - ndims();

                if (dimDiff > 0) {
                    names.addLayer(dimDiff + 1);
                    names.promote(0);
                    names.fillLayer(arg);
                    
                    String tempName = arg.calcTempVarName();
                    FIdUseExp tempExp = new FIdUseExp(new FIdUse(tempName));

                    FType tempType = arg.type().arrayType(arg.size().contract(1));
                    s.block(firstLoop).addTempVar(tempType, tempName);

                    newArgs.add(names.createUseWithSubscripts(tempName, 0, dimDiff - 1));

                    FAssignableExp left = names.createUseWithSubscripts(tempName, 1, dimDiff + 1);
                    FExp right = arg.tempExp(names.createFArraySubscripts(0, dimDiff + 1));
                    names.createForLoops(firstLoop, arg, 1, dimDiff + 1).add(new FAssignStmt(left, right));
                    names.removeLayer();
                } else {
                    newArgs.add(arg.scalarize(s));
                }
            } else {
                newArgs.add(arg.scalarize(s));
            }
        }

        FFunctionCall funcRight = new FFunctionCall(getName().fullCopy(), newArgs, getFType().scalarType());
        firstLoop.add(new FAssignStmt(funcLeft, funcRight));

        outer.addAll(result);
        names.removeLayer();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FVectorFunctionCall() {
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
    public FVectorFunctionCall(FIdUse p0, List<FExp> p1, FType p2, Size p3, boolean[] p4) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setVectorSize(p3);
        setVectorized(p4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        getArray_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:44
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:50
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:56
     */
    public FVectorFunctionCall clone() throws CloneNotSupportedException {
        FVectorFunctionCall node = (FVectorFunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public FVectorFunctionCall copy() {
        try {
            FVectorFunctionCall node = (FVectorFunctionCall) clone();
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
     * @declaredat ASTNode:82
     */
    public FVectorFunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:91
     */
    public FVectorFunctionCall treeCopyNoTransform() {
        FVectorFunctionCall tree = (FVectorFunctionCall) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
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
    public FVectorFunctionCall treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:123
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_VectorSize == ((FVectorFunctionCall)node).tokenSize_VectorSize) && (tokenboolean_a_Vectorized == ((FVectorFunctionCall)node).tokenboolean_a_Vectorized);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public FIdUse getName() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public FIdUse getNameNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<FExp> list) {
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
    public FExp getArg(int i) {
        return (FExp) getArgList().getChild(i);
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
    public void addArg(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(FExp node) {
        List<FExp> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(FExp node, int i) {
        List<FExp> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<FExp> getArgList() {
        List<FExp> list = (List<FExp>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgListNoTransform() {
        return (List<FExp>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<FExp> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgsNoTransform() {
        return getArgListNoTransform();
    }
    /**
     * Replaces the FType child.
     * @param node The new node to replace the FType child.
     * @apilevel high-level
     */
    public void setFType(FType node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the FType child.
     * @return The current node used as the FType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FType")
    public FType getFType() {
        return (FType) getChild(2);
    }
    /**
     * Retrieves the FType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FType child.
     * @apilevel low-level
     */
    public FType getFTypeNoTransform() {
        return (FType) getChildNoTransform(2);
    }
    /**
     * Replaces the lexeme VectorSize.
     * @param value The new value for the lexeme VectorSize.
     * @apilevel high-level
     */
    public void setVectorSize(Size value) {
        tokenSize_VectorSize = value;
    }
    /**
     * @apilevel internal
     */
    protected Size tokenSize_VectorSize;
    /**
     * Retrieves the value for the lexeme VectorSize.
     * @return The value for the lexeme VectorSize.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="VectorSize")
    public Size getVectorSize() {
        return tokenSize_VectorSize;
    }
    /**
     * Replaces the lexeme Vectorized.
     * @param value The new value for the lexeme Vectorized.
     * @apilevel high-level
     */
    public void setVectorized(boolean[] value) {
        tokenboolean_a_Vectorized = value;
    }
    /**
     * @apilevel internal
     */
    protected boolean[] tokenboolean_a_Vectorized;
    /**
     * Retrieves the value for the lexeme Vectorized.
     * @return The value for the lexeme Vectorized.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Vectorized")
    public boolean[] getVectorized() {
        return tokenboolean_a_Vectorized;
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
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
        ndims_value = size().ndims();
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
    protected boolean getArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array getArray_value;
    /**
     * @apilevel internal
     */
    private void getArray_reset() {
        getArray_computed = false;
        getArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array getArray() {
        if(getArray_computed) {
            return (Array) getChild(getArrayChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getArray_value = getArray_compute();
        setChild(getArray_value, getArrayChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Array node = (Array) this.getChild(getArrayChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private Array getArray_compute() {
            Array arr = new Array(indices());
            boolean[] vec = getVectorized();
            int j;
            for (Index i : arr.indices()) {
                List<FExp> args = new List<FExp>();
                j = 0;
                for (FExp arg : getArgs()) 
                    args.add(vec[j++] ? arg.getArray().subArrayFExp(i) : arg);
                arr.set(i, new FFunctionCall(getName().fullCopy(), args, getFType().scalarType()));
            }
            return arr;
        }
    @ASTNodeAnnotation.Attribute
    public boolean isVectorized() {
        ASTNode$State state = state();
        boolean isVectorized_value = true;

        return isVectorized_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonVectorizedFunctionCall() {
        ASTNode$State state = state();
        boolean isNonVectorizedFunctionCall_value = false;

        return isNonVectorizedFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = true;

        return extractTemp_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        if (caller == getArrayNoTransform()) {
            return calcGeneratedVarName(gvt);
        }
        else {
            return super.Define_calcGeneratedVarName(caller, child, gvt);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:80
     * @apilevel internal
     */
    public boolean Define_isFVectorFunctionCallArg(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_isFVectorFunctionCallArg(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
