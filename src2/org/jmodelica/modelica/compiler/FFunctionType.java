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
 * Partial function call type
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:358
 * @production FFunctionType : {@link FType} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">Input:{@link FRecordComponentType}*</span> <span class="component">Output:{@link FRecordComponentType}*</span> <span class="component">&lt;FClass:FClass&gt;</span>;

 */
public class FFunctionType extends FType implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1458
     */
    public static FFunctionType create(String name, Iterable<FVariable> fvs, FClass fclass) {
        List<FRecordComponentType> in = new List<FRecordComponentType>();
        List<FRecordComponentType> out = new List<FRecordComponentType>();
        for (FVariable fv : fvs) {
            out.add(new FRecordComponentType(fv.name(), fv.type().treeCopy()));
        }
        return new FFunctionType(Size.SCALAR, name, in, out, fclass);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:488
     */
    public void updateRecordArraySizes(FType from) {
        super.updateRecordArraySizes(from);
        FFunctionType rfrom = (FFunctionType) from;
        for (FRecordComponentType comp : getInputs())
            comp.getFType().updateRecordArraySizes(componentType(comp.getName(), rfrom.getInputs()));
        for (FRecordComponentType comp : getOutputs())
            comp.getFType().updateRecordArraySizes(componentType(comp.getName(), rfrom.getOutputs()));
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:828
     */
    @Override
    public FType flatten(FQName prefix, InstAssignable ia, boolean keepSizeExpressions) {
        List<FRecordComponentType> inputs = new List<FRecordComponentType>();
        for (FRecordComponentType frct : getInputs()) {
            inputs.add(frct.flatten(prefix, ia, keepSizeExpressions));
        }
        List<FRecordComponentType> outputs = new List<FRecordComponentType>();
        for (FRecordComponentType frct : getOutputs()) {
            outputs.add(frct.flatten(prefix, ia, keepSizeExpressions));
        }
        FFunctionType res = new FFunctionType(getSize(), getName(), inputs, outputs, getFClass());
        res.setSize(getSize().flatten(prefix, res, keepSizeExpressions));
        res.flattened = true;
        return res;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:860
     */
    private boolean flattened = false;
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2705
     */
    public void clearFlattened() { flattened = false; super.clearFlattened(); }
    /**
     * Remove input types
     * @return this
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:182
     */
    public FFunctionType removeInputs() {
        setInputList(new List<FRecordComponentType>());
        return this;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1723
     */
    public FType replaceReferences(AbstractFunctionInliner fi) {
        super.replaceReferences(fi);
        for (FRecordComponentType frct : getInputs()) {
            frct.getFType().replaceReferences(fi);
        }
        for (FRecordComponentType frct : getOutputs()) {
            frct.getFType().replaceReferences(fi);
        }
        return this;
    }
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionType() {
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
        children = new ASTNode[2];
        setChild(new List(), 0);
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FFunctionType(Size p0, String p1, List<FRecordComponentType> p2, List<FRecordComponentType> p3, FClass p4) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setChild(p3, 1);
        setFClass(p4);
    }
    /**
     * @declaredat ASTNode:22
     */
    public FFunctionType(Size p0, Symbol p1, List<FRecordComponentType> p2, List<FRecordComponentType> p3, FClass p4) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setChild(p3, 1);
        setFClass(p4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:32
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:44
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myFFunctionDecl_reset();
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
    public FFunctionType clone() throws CloneNotSupportedException {
        FFunctionType node = (FFunctionType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:70
     */
    public FFunctionType copy() {
        try {
            FFunctionType node = (FFunctionType) clone();
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
    public FFunctionType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:98
     */
    public FFunctionType treeCopyNoTransform() {
        FFunctionType tree = (FFunctionType) copy();
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
     * @declaredat ASTNode:118
     */
    public FFunctionType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:125
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FFunctionType)node).tokenSize_Size) && (tokenString_Name == ((FFunctionType)node).tokenString_Name) && (tokenFClass_FClass == ((FFunctionType)node).tokenFClass_FClass);    
    }
    /**
     * Replaces the lexeme Size.
     * @param value The new value for the lexeme Size.
     * @apilevel high-level
     */
    public void setSize(Size value) {
        tokenSize_Size = value;
    }
    /**
     * Retrieves the value for the lexeme Size.
     * @return The value for the lexeme Size.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Size")
    public Size getSize() {
        return tokenSize_Size;
    }
    /**
     * Replaces the lexeme Name.
     * @param value The new value for the lexeme Name.
     * @apilevel high-level
     */
    public void setName(String value) {
        tokenString_Name = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Name;
    /**
     */
    public int Namestart;
    /**
     */
    public int Nameend;
    /**
     * JastAdd-internal setter for lexeme Name using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Name
     * @apilevel internal
     */
    public void setName(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setName is only valid for String lexemes");
        tokenString_Name = (String)symbol.value;
        Namestart = symbol.getStart();
        Nameend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Name.
     * @return The value for the lexeme Name.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Name")
    public String getName() {
        return tokenString_Name != null ? tokenString_Name : "";
    }
    /**
     * Replaces the Input list.
     * @param list The new list node to be used as the Input list.
     * @apilevel high-level
     */
    public void setInputList(List<FRecordComponentType> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Input list.
     * @return Number of children in the Input list.
     * @apilevel high-level
     */
    public int getNumInput() {
        return getInputList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Input list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Input list.
     * @apilevel low-level
     */
    public int getNumInputNoTransform() {
        return getInputListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Input list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Input list.
     * @apilevel high-level
     */
    public FRecordComponentType getInput(int i) {
        return (FRecordComponentType) getInputList().getChild(i);
    }
    /**
     * Check whether the Input list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInput() {
        return getInputList().getNumChild() != 0;
    }
    /**
     * Append an element to the Input list.
     * @param node The element to append to the Input list.
     * @apilevel high-level
     */
    public void addInput(FRecordComponentType node) {
        List<FRecordComponentType> list = (parent == null || state == null) ? getInputListNoTransform() : getInputList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInputNoTransform(FRecordComponentType node) {
        List<FRecordComponentType> list = getInputListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Input list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInput(FRecordComponentType node, int i) {
        List<FRecordComponentType> list = getInputList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Input list.
     * @return The node representing the Input list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Input")
    public List<FRecordComponentType> getInputList() {
        List<FRecordComponentType> list = (List<FRecordComponentType>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Input list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Input list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getInputListNoTransform() {
        return (List<FRecordComponentType>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Input list.
     * @return The node representing the Input list.
     * @apilevel high-level
     */
    public List<FRecordComponentType> getInputs() {
        return getInputList();
    }
    /**
     * Retrieves the Input list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Input list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getInputsNoTransform() {
        return getInputListNoTransform();
    }
    /**
     * Replaces the Output list.
     * @param list The new list node to be used as the Output list.
     * @apilevel high-level
     */
    public void setOutputList(List<FRecordComponentType> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Output list.
     * @return Number of children in the Output list.
     * @apilevel high-level
     */
    public int getNumOutput() {
        return getOutputList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Output list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Output list.
     * @apilevel low-level
     */
    public int getNumOutputNoTransform() {
        return getOutputListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Output list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Output list.
     * @apilevel high-level
     */
    public FRecordComponentType getOutput(int i) {
        return (FRecordComponentType) getOutputList().getChild(i);
    }
    /**
     * Check whether the Output list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasOutput() {
        return getOutputList().getNumChild() != 0;
    }
    /**
     * Append an element to the Output list.
     * @param node The element to append to the Output list.
     * @apilevel high-level
     */
    public void addOutput(FRecordComponentType node) {
        List<FRecordComponentType> list = (parent == null || state == null) ? getOutputListNoTransform() : getOutputList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addOutputNoTransform(FRecordComponentType node) {
        List<FRecordComponentType> list = getOutputListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Output list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setOutput(FRecordComponentType node, int i) {
        List<FRecordComponentType> list = getOutputList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Output list.
     * @return The node representing the Output list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Output")
    public List<FRecordComponentType> getOutputList() {
        List<FRecordComponentType> list = (List<FRecordComponentType>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Output list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Output list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getOutputListNoTransform() {
        return (List<FRecordComponentType>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Output list.
     * @return The node representing the Output list.
     * @apilevel high-level
     */
    public List<FRecordComponentType> getOutputs() {
        return getOutputList();
    }
    /**
     * Retrieves the Output list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Output list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getOutputsNoTransform() {
        return getOutputListNoTransform();
    }
    /**
     * Replaces the lexeme FClass.
     * @param value The new value for the lexeme FClass.
     * @apilevel high-level
     */
    public void setFClass(FClass value) {
        tokenFClass_FClass = value;
    }
    /**
     * @apilevel internal
     */
    protected FClass tokenFClass_FClass;
    /**
     * Retrieves the value for the lexeme FClass.
     * @return The value for the lexeme FClass.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="FClass")
    public FClass getFClass() {
        return tokenFClass_FClass;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFFunctionDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FFunctionDecl myFFunctionDecl_value;
    /**
     * @apilevel internal
     */
    private void myFFunctionDecl_reset() {
        myFFunctionDecl_computed = false;
        myFFunctionDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl myFFunctionDecl() {
        if(myFFunctionDecl_computed) {
            return myFFunctionDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFFunctionDecl_value = (getFClass() != null) ? getFClass().lookupFunc(getName()) : (FFunctionDecl)lookupFCallable(getName());
        if (isFinal && num == state().boundariesCrossed) {
            myFFunctionDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFFunctionDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    /**
     * @attribute syn
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:942
     */
    @ASTNodeAnnotation.Attribute
    public String toString() {
        ASTNode$State state = state();
        try {
                StringBuilder sb = new StringBuilder();
                sb.append("((");
                sb.append(getOutputs().toString());
                sb.append(") = ");
                sb.append(getName());
                sb.append("(");
                sb.append(getInputs().toString());
                sb.append("))");
                if (ndims() > 0) {
                    sb.append(size());
                }
                return sb.toString();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FType component(int i) {
        ASTNode$State state = state();
        FType component_int_value = nullUnknown(getOutput(i)).vectorized(getSize());

        return component_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_boolean_value = typeMatches(type, true, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect FTypeCompatibility
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:814
     */
    @ASTNodeAnnotation.Attribute
    public boolean typeMatches(FType type, boolean compatible, boolean allowUnknown) {
        ASTNode$State state = state();
        try {
                if (!dimensionCompatible(type, allowUnknown) || !type.isFunction())
                    return false;
                FFunctionType obj = (FFunctionType) type;
                if (!compatible && !getName().equals(obj.getName())) 
                    return false;
                if (getNumInput() != obj.getNumInput())
                    return false;
                if (getNumOutput() > obj.getNumOutput())
                    return false;
                
                return typeMatches(getInputs(), obj.getInputs(), compatible, allowUnknown) &&
                        typeMatches(getOutputs(), obj.getOutputs(), compatible, allowUnknown);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_boolean_value = typeMatches(type, false, allowUnknown);

        return equivalentTo_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunction() {
        ASTNode$State state = state();
        boolean isFunction_value = true;

        return isFunction_value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:212
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability funcOutputVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability var = fConstant();
                for (FRecordComponentType component : getOutputs()) {
                    var = var.combine(component.getFType().funcOutputVariability());
                }
                return var;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C() {
        ASTNode$State state = state();
        String nameScalar_C_value = myFFunctionDecl().funcNameUnderscore(C_SUFFIX_FP) + "*";

        return nameScalar_C_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:533
     */
    @ASTNodeAnnotation.Attribute
    public FCallable lookupFCallable(String name) {
        ASTNode$State state = state();
        FCallable lookupFCallable_String_value = getParent().Define_lookupFCallable(this, null, name);

        return lookupFCallable_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:862
        if (flattened) {
            state().duringFlattening++;
            ASTNode result = rewriteRule0();
            state().duringFlattening--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:862
     * @apilevel internal
     */
    private FFunctionType rewriteRule0() {
{
            setFClass(myFClass());
            flattened = false;
            return this;
        }    }
}
