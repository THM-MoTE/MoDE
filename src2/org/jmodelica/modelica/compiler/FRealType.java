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
 * Class representing the primitive type Real.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:394
 * @production FRealType : {@link FPrimitiveNumericType};

 */
public class FRealType extends FPrimitiveNumericType implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1744
     */
    public CValue zeroCValueScalar()    { return new CValueReal(0.0); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1762
     */
    public CValue createCValueScalar(int v) { return new CValueReal(v); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1765
     */
    public CValue convert(CValue v)    { return v.convertReal(); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1771
     */
    public CValue limitCValueScalar(boolean high)    { return new CValueReal(      high ? Double.MAX_VALUE  : -Double.MAX_VALUE); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4514
     */
    public static double MACHINE_EPSILON = 2.2204460492503131e-16;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4517
     */
    public static double ALMOST_EPSILON = MACHINE_EPSILON;
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:866
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        return new CValueReal(com.deserializeReal());
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:938
     */
    public static final FRealType SCALAR                   = new FRealType(Size.SCALAR);
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1139
     */
    public FExp zeroLiteral()    { return new FRealLitExp(0.0); }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1178
     */
    public FExp createLiteral(int v)    { return new FRealLitExp(v); }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1434
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		return new FRealVariable(fvt, variability, name);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FRealType() {
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
    }
    /**
     * @declaredat ASTNode:12
     */
    public FRealType(Size p0) {
        setSize(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:18
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:24
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:42
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public FRealType clone() throws CloneNotSupportedException {
        FRealType node = (FRealType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FRealType copy() {
        try {
            FRealType node = (FRealType) clone();
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
     * @declaredat ASTNode:74
     */
    public FRealType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:83
     */
    public FRealType treeCopyNoTransform() {
        FRealType tree = (FRealType) copy();
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
     * @declaredat ASTNode:103
     */
    public FRealType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:110
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FRealType)node).tokenSize_Size);    
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
    @ASTNodeAnnotation.Attribute
    public String formatSpecifier() {
        ASTNode$State state = state();
        String formatSpecifier_value = "g";

        return formatSpecifier_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue add(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue add_CValue_CValue_value = new CValueReal(v1.realValue() + v2.realValue());

        return add_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue sub(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue sub_CValue_CValue_value = new CValueReal(v1.realValue() - v2.realValue());

        return sub_CValue_CValue_value;
    }
    /**
     * Multiplication of constant values.
     * 
     * @param v1 Constant value of left operand.
     * @param v2 Constant value of right operand.
     * @return Resulting constant value.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4382
     */
    @ASTNodeAnnotation.Attribute
    public CValue mul(CValue v1, CValue v2) {
        ASTNode$State state = state();
        try {
                return new CValueReal(v1.realValue()*v2.realValue());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue div(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue div_CValue_CValue_value = new CValueReal(v1.realValue()/v2.realValue());

        return div_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue pow(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue pow_CValue_CValue_value = new CValueReal(StrictMath.pow(v1.realValue(), v2.realValue()));

        return pow_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue neg(CValue v) {
        ASTNode$State state = state();
        CValue neg_CValue_value = new CValueReal(-v.realValue());

        return neg_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue abs(CValue v) {
        ASTNode$State state = state();
        CValue abs_CValue_value = new CValueReal(StrictMath.abs(v.realValue()));

        return abs_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceil(CValue v) {
        ASTNode$State state = state();
        CValue ceil_CValue_value = new CValueReal(StrictMath.ceil(v.realValue()));

        return ceil_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue truncToZero(CValue v) {
        ASTNode$State state = state();
        CValue truncToZero_CValue_value = v.realValue() < 0 ? ceil(v) : v.convertInteger().convertReal();

        return truncToZero_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean almostZero(double op) {
        ASTNode$State state = state();
        boolean almostZero_double_value = almostLtZero(op) && almostGtZero(op);

        return almostZero_double_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean almostLtZero(double op) {
        ASTNode$State state = state();
        boolean almostLtZero_double_value = op <= ALMOST_EPSILON;

        return almostLtZero_double_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean almostGtZero(double op) {
        ASTNode$State state = state();
        boolean almostGtZero_double_value = op >= -ALMOST_EPSILON;

        return almostGtZero_double_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean surelyLtZero(double op) {
        ASTNode$State state = state();
        boolean surelyLtZero_double_value = op < -ALMOST_EPSILON;

        return surelyLtZero_double_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean surelyGtZero(double op) {
        ASTNode$State state = state();
        boolean surelyGtZero_double_value = op > ALMOST_EPSILON;

        return surelyGtZero_double_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue equ(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue equ_CValue_CValue_value = new CValueBoolean(almostZero(v1.realValue() - v2.realValue()));

        return equ_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue neq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue neq_CValue_CValue_value = new CValueBoolean(!almostZero(v1.realValue() - v2.realValue()));

        return neq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue geq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue geq_CValue_CValue_value = new CValueBoolean(almostGtZero(v1.realValue() - v2.realValue()));

        return geq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue gt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue gt_CValue_CValue_value = new CValueBoolean(surelyGtZero(v1.realValue() - v2.realValue()));

        return gt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue leq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue leq_CValue_CValue_value = new CValueBoolean(almostLtZero(v1.realValue() - v2.realValue()));

        return leq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue lt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue lt_CValue_CValue_value = new CValueBoolean(surelyLtZero(v1.realValue() - v2.realValue()));

        return lt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = "Real";

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = String.format("r%d", ndims());

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
        boolean typeCompatible_FType_boolean_value = (type.isReal() || type.isInteger()) && dimensionCompatible(type, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = true;

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType scalarType() {
        ASTNode$State state = state();
        FType scalarType_value = FRealType.SCALAR;

        return scalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeAliasCompatible(FType type) {
        ASTNode$State state = state();
        boolean typeAliasCompatible_FType_value = type.isReal() && typeCompatible(type);

        return typeAliasCompatible_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability funcOutputVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability funcOutputVariability_value = fContinuous();

        return funcOutputVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDeclScalar() {
        ASTNode$State state = state();
        String macroTypeDeclScalar_value = "REA";

        return macroTypeDeclScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public int maxStringLength_C(int precision) {
        ASTNode$State state = state();
        int maxStringLength_C_int_value = 7 + precision;

        return maxStringLength_C_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String exportWrapperType_C() {
        ASTNode$State state = state();
        String exportWrapperType_C_value = "double";

        return exportWrapperType_C_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
