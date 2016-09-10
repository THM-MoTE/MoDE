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
 * Class representing an enumeration type.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:414
 * @production FEnumType : {@link FPrimitiveType} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link FEnumLiteralType}*</span>;

 */
public class FEnumType extends FPrimitiveType implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:736
     */
    public FExp wrapRangeSizeExp(FExp exp) {
 		return new FEnumIntegerExp(exp);
 	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1746
     */
    public CValue zeroCValueScalar()    { return new CValueEnum(this, 1); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1774
     */
    public CValue limitCValueScalar(boolean high)    { return new CValueEnum(this, high ? getNumFEnumLiteralType() : 1); }
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:878
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        return new CValueEnum(this, (int) com.deserializeReal());
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1143
     */
    public FExp zeroLiteral()    { return new FEnumLitExp(this, 1); }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1179
     */
    public FExp createLiteral(int v)    { return new FEnumLitExp(this, v); }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1459
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		return new FEnumVariable(fvt, variability.combineDown(fDiscrete()), name, new FQNameString(getName()));
	}
    /**
     * @declaredat ASTNode:1
     */
    public FEnumType() {
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
    public FEnumType(Size p0, String p1, List<FEnumLiteralType> p2) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
    }
    /**
     * @declaredat ASTNode:19
     */
    public FEnumType(Size p0, Symbol p1, List<FEnumLiteralType> p2) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:27
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myFEnumDecl_reset();
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
    public FEnumType clone() throws CloneNotSupportedException {
        FEnumType node = (FEnumType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FEnumType copy() {
        try {
            FEnumType node = (FEnumType) clone();
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
    public FEnumType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FEnumType treeCopyNoTransform() {
        FEnumType tree = (FEnumType) copy();
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
     * @declaredat ASTNode:113
     */
    public FEnumType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:120
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FEnumType)node).tokenSize_Size) && (tokenString_Name == ((FEnumType)node).tokenString_Name);    
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
     * Replaces the FEnumLiteralType list.
     * @param list The new list node to be used as the FEnumLiteralType list.
     * @apilevel high-level
     */
    public void setFEnumLiteralTypeList(List<FEnumLiteralType> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FEnumLiteralType list.
     * @return Number of children in the FEnumLiteralType list.
     * @apilevel high-level
     */
    public int getNumFEnumLiteralType() {
        return getFEnumLiteralTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FEnumLiteralType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FEnumLiteralType list.
     * @apilevel low-level
     */
    public int getNumFEnumLiteralTypeNoTransform() {
        return getFEnumLiteralTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FEnumLiteralType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FEnumLiteralType list.
     * @apilevel high-level
     */
    public FEnumLiteralType getFEnumLiteralType(int i) {
        return (FEnumLiteralType) getFEnumLiteralTypeList().getChild(i);
    }
    /**
     * Check whether the FEnumLiteralType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFEnumLiteralType() {
        return getFEnumLiteralTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FEnumLiteralType list.
     * @param node The element to append to the FEnumLiteralType list.
     * @apilevel high-level
     */
    public void addFEnumLiteralType(FEnumLiteralType node) {
        List<FEnumLiteralType> list = (parent == null || state == null) ? getFEnumLiteralTypeListNoTransform() : getFEnumLiteralTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFEnumLiteralTypeNoTransform(FEnumLiteralType node) {
        List<FEnumLiteralType> list = getFEnumLiteralTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FEnumLiteralType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFEnumLiteralType(FEnumLiteralType node, int i) {
        List<FEnumLiteralType> list = getFEnumLiteralTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FEnumLiteralType list.
     * @return The node representing the FEnumLiteralType list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FEnumLiteralType")
    public List<FEnumLiteralType> getFEnumLiteralTypeList() {
        List<FEnumLiteralType> list = (List<FEnumLiteralType>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FEnumLiteralType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FEnumLiteralType list.
     * @apilevel low-level
     */
    public List<FEnumLiteralType> getFEnumLiteralTypeListNoTransform() {
        return (List<FEnumLiteralType>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FEnumLiteralType list.
     * @return The node representing the FEnumLiteralType list.
     * @apilevel high-level
     */
    public List<FEnumLiteralType> getFEnumLiteralTypes() {
        return getFEnumLiteralTypeList();
    }
    /**
     * Retrieves the FEnumLiteralType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FEnumLiteralType list.
     * @apilevel low-level
     */
    public List<FEnumLiteralType> getFEnumLiteralTypesNoTransform() {
        return getFEnumLiteralTypeListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public String formatSpecifier() {
        ASTNode$State state = state();
        String formatSpecifier_value = "s";

        return formatSpecifier_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFEnumDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FEnumDecl myFEnumDecl_value;
    /**
     * @apilevel internal
     */
    private void myFEnumDecl_reset() {
        myFEnumDecl_computed = false;
        myFEnumDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FEnumDecl myFEnumDecl() {
        if(myFEnumDecl_computed) {
            return myFEnumDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFEnumDecl_value = lookupFEnum(getName());
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = String.format("[%s]%d", getName(), ndims());

        return signatureString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeRange() {
        ASTNode$State state = state();
        boolean canBeRange_value = true;

        return canBeRange_value;
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
                if (!dimensionCompatible(type, allowUnknown) || !type.isEnum())
                    return false;
                FEnumType enu = (FEnumType) type;
                if (getName().equals(enu.getName())) 
                    return true;
                int n1 = getNumFEnumLiteralType(), n2 = enu.getNumFEnumLiteralType();
                if (n1 != n2)
                    return n1 == 0 || n2 == 0;
                Iterator<FEnumLiteralType> it = enu.getFEnumLiteralTypes().iterator();
                for (FEnumLiteralType elt : getFEnumLiteralTypes())
                    if (!elt.getName().equals(it.next().getName()))
                        return false;
                return true;
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
    public boolean isEnum() {
        ASTNode$State state = state();
        boolean isEnum_value = true;

        return isEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeIndex() {
        ASTNode$State state = state();
        boolean canBeIndex_value = true;

        return canBeIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalarExt_C() {
        ASTNode$State state = state();
        String nameScalarExt_C_value = "jmi_int_t";

        return nameScalarExt_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArrayExt_C() {
        ASTNode$State state = state();
        String nameArrayExt_C_value = "jmi_int_array_t";

        return nameArrayExt_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argTypeBase_C() {
        ASTNode$State state = state();
        String argTypeBase_C_value = "int";

        return argTypeBase_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDeclScalar() {
        ASTNode$State state = state();
        String macroTypeDeclScalar_value = "ENU";

        return macroTypeDeclScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public String enumNames_C() {
        ASTNode$State state = state();
        String enumNames_C_value = myFEnumDecl().name_C();

        return enumNames_C_value;
    }
    /**
     * The maximum length string representations of values of this type can have in C.
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1082
     */
    @ASTNodeAnnotation.Attribute
    public int maxStringLength_C(int precision) {
        ASTNode$State state = state();
        try {
                int res = 0;
                for (FEnumLiteralType lit : getFEnumLiteralTypes())
                    res = Math.max(res, lit.getName().length());
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect FlatEnumBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:610
     */
    @ASTNodeAnnotation.Attribute
    public FEnumDecl lookupFEnum(String name) {
        ASTNode$State state = state();
        FEnumDecl lookupFEnum_String_value = getParent().Define_lookupFEnum(this, null, name);

        return lookupFEnum_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
