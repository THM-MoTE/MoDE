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
 * An operator record type. 
 * 
 * Only used in instance tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:365
 * @production FOperatorRecordType : {@link FRecordType} ::= <span class="component">&lt;Operators:Map<String,InstClassDecl>&gt;</span>;

 */
public class FOperatorRecordType extends FRecordType implements Cloneable {
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:530
     */
    public FExp createFNegExp(FExp a) {
        return matchOverloadedOperator(null, FExp.OP_NEG).flattenOverloadedFunctionCall(new FQNameEmpty(), arr(a), arr(this));
    }
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:541
     */
    public FExp createFSubExp(FExp a, FExp b) {
        return matchOverloadedOperator(this, FExp.OP_SUB).flattenOverloadedFunctionCall(new FQNameEmpty(), arr(a, b), arr(this, this));
    }
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:552
     */
    public FExp createFAddExp(FExp a, FExp b) {
        return matchOverloadedOperator(this, FExp.OP_ADD).flattenOverloadedFunctionCall(new FQNameEmpty(), arr(a, b), arr(this, this));
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:182
     */
    public void flattenOverloadedOperatorsForFlow(FClass fc) {
        matchOverloadedOperator(null, FExp.OP_NEG).flattenFunction(fc);
        matchOverloadedOperator(this, FExp.OP_SUB).flattenFunction(fc);
        matchOverloadedOperator(this, FExp.OP_ADD).flattenFunction(fc);
    }
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:106
     */
    public FExp zeroLiteral() {
        InstClassDecl func = matchOverloadedZero();
        return (func != null) ? func.flattenOverloadedFunctionCall(new FQNameEmpty()) : super.zeroLiteral();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FOperatorRecordType() {
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
    public FOperatorRecordType(Size p0, String p1, List<FRecordComponentType> p2, FClass p3, Map<String,InstClassDecl> p4) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setFClass(p3);
        setOperators(p4);
    }
    /**
     * @declaredat ASTNode:21
     */
    public FOperatorRecordType(Size p0, Symbol p1, List<FRecordComponentType> p2, FClass p3, Map<String,InstClassDecl> p4) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setFClass(p3);
        setOperators(p4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:31
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:55
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public FOperatorRecordType clone() throws CloneNotSupportedException {
        FOperatorRecordType node = (FOperatorRecordType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public FOperatorRecordType copy() {
        try {
            FOperatorRecordType node = (FOperatorRecordType) clone();
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
     * @declaredat ASTNode:87
     */
    public FOperatorRecordType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public FOperatorRecordType treeCopyNoTransform() {
        FOperatorRecordType tree = (FOperatorRecordType) copy();
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
     * @declaredat ASTNode:116
     */
    public FOperatorRecordType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:123
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FOperatorRecordType)node).tokenSize_Size) && (tokenString_Name == ((FOperatorRecordType)node).tokenString_Name) && (tokenFClass_FClass == ((FOperatorRecordType)node).tokenFClass_FClass) && (tokenMap_String_InstClassDecl__Operators == ((FOperatorRecordType)node).tokenMap_String_InstClassDecl__Operators);    
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
     * Replaces the Component list.
     * @param list The new list node to be used as the Component list.
     * @apilevel high-level
     */
    public void setComponentList(List<FRecordComponentType> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Component list.
     * @return Number of children in the Component list.
     * @apilevel high-level
     */
    public int getNumComponent() {
        return getComponentList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Component list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Component list.
     * @apilevel low-level
     */
    public int getNumComponentNoTransform() {
        return getComponentListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Component list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Component list.
     * @apilevel high-level
     */
    public FRecordComponentType getComponent(int i) {
        return (FRecordComponentType) getComponentList().getChild(i);
    }
    /**
     * Check whether the Component list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasComponent() {
        return getComponentList().getNumChild() != 0;
    }
    /**
     * Append an element to the Component list.
     * @param node The element to append to the Component list.
     * @apilevel high-level
     */
    public void addComponent(FRecordComponentType node) {
        List<FRecordComponentType> list = (parent == null || state == null) ? getComponentListNoTransform() : getComponentList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addComponentNoTransform(FRecordComponentType node) {
        List<FRecordComponentType> list = getComponentListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Component list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setComponent(FRecordComponentType node, int i) {
        List<FRecordComponentType> list = getComponentList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Component")
    public List<FRecordComponentType> getComponentList() {
        List<FRecordComponentType> list = (List<FRecordComponentType>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getComponentListNoTransform() {
        return (List<FRecordComponentType>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    public List<FRecordComponentType> getComponents() {
        return getComponentList();
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getComponentsNoTransform() {
        return getComponentListNoTransform();
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
     * Retrieves the value for the lexeme FClass.
     * @return The value for the lexeme FClass.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="FClass")
    public FClass getFClass() {
        return tokenFClass_FClass;
    }
    /**
     * Replaces the lexeme Operators.
     * @param value The new value for the lexeme Operators.
     * @apilevel high-level
     */
    public void setOperators(Map<String,InstClassDecl> value) {
        tokenMap_String_InstClassDecl__Operators = value;
    }
    /**
     * @apilevel internal
     */
    protected Map<String,InstClassDecl> tokenMap_String_InstClassDecl__Operators;
    /**
     * Retrieves the value for the lexeme Operators.
     * @return The value for the lexeme Operators.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Operators")
    public Map<String,InstClassDecl> getOperators() {
        return tokenMap_String_InstClassDecl__Operators;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = true;

        return isOperatorRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasAdd() {
        ASTNode$State state = state();
        boolean hasAdd_value = getOperators().get(FExp.OP_ADD) != null;

        return hasAdd_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNeg() {
        ASTNode$State state = state();
        boolean hasNeg_value = getOperators().get(FExp.OP_NEG) != null;

        return hasNeg_value;
    }
    /**
     * Calculate the functions that match an operator expression involving operator records.
     * 
     * If expression does not include operator records, the empty set is returned.
     * 
     * @param other     the type of the other side of the expression, <code>null</code> for unary operators
     * @param operator  the name of the operator to look for
     * @param isLeft    <code>true</code> if this type was on the left hand side of the expression, 
     * must be <code>true</code> for unary operators
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:266
     */
    @ASTNodeAnnotation.Attribute
    public Collection<InstClassDecl> matchOverloadedOperators(FType other, String operator, boolean isLeft) {
        ASTNode$State state = state();
        try {
                if (operator == null)
                    return Collections.emptyList();
                OperatorMatches mine = matchOverloadedOperators(operator, this, other, isLeft);
                OperatorMatches others = OperatorMatches.EMPTY;
                if (other instanceof FOperatorRecordType) {
                    FOperatorRecordType other2 = (FOperatorRecordType) other;
                    if (!other2.getName().equals(getName()))
                        others = other2.matchOverloadedOperators(operator, other, this, !isLeft);
                }
                return mine.combine(others).matches();
            }
        finally {
        }
    }
    /**
     * Find the constructor to use to convert a given type to this type.
     * 
     * Returns null if none or more than one constructor matches or this is not a operator record type.
     * 
     * @param other     the type to convert
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:290
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedConstructor(FType other) {
        ASTNode$State state = state();
        try {
                Collection<InstClassDecl> match = matchOverloadedConstructors(other);
                return (match.size() == 1) ? match.iterator().next() : null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstClassDecl> matchOverloadedConstructors(FType other) {
        ASTNode$State state = state();
        Collection<InstClassDecl> matchOverloadedConstructors_FType_value = isArray() ? Collections.<InstClassDecl>emptyList() : matchOverloadedOperators(FExp.OP_CON, other, null, true).matches();

        return matchOverloadedConstructors_FType_value;
    }
    /**
     * Find the zero function for an operator record type.
     * 
     * Returns null if none or more than one constructor matches or this is not a operator record type.
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:312
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedZero() {
        ASTNode$State state = state();
        try {
                InstClassDecl op = getOperators().get(FExp.OP_ZERO);
                if (op == null) 
                    return null;
                Collection<InstClassDecl> match = op.operatorFunctions();
                return (match.size() == 1) ? match.iterator().next() : null;
            }
        finally {
        }
    }
    /**
     * Calculate the functions in this operator record type that matches an operator expression 
     * involving operator records.
     * 
     * @param operator  the name of the operator to look for
     * @param a         an operand that is of the operator record type that contains this function
     * @param b         the other operand. If it is <code>null</code>, then the function should be unary.
     * @param aIsLeft   <code>true</code> if a is the left operand, must be true if b is <code>null</code>
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:330
     */
    @ASTNodeAnnotation.Attribute
    public OperatorMatches matchOverloadedOperators(String operator, FType a, FType b, boolean aIsLeft) {
        ASTNode$State state = state();
        try {
                InstClassDecl op = getOperators().get(operator);
                return (op != null) ? op.matchOverloadedOperators(a, b, aIsLeft) : OperatorMatches.EMPTY;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
