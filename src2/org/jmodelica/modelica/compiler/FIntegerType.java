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
 * Class representing the primitive type Integer.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:399
 * @production FIntegerType : {@link FPrimitiveNumericType};

 */
public class FIntegerType extends FPrimitiveNumericType implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1745
     */
    public CValue zeroCValueScalar() { return new CValueInteger(0); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1766
     */
    public CValue convert(CValue v) { return v.convertInteger(); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1772
     */
    public CValue limitCValueScalar(boolean high) { return new CValueInteger(   high ? Integer.MAX_VALUE : Integer.MIN_VALUE); }
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:869
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        return new CValueInteger((int) com.deserializeReal());
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:939
     */
    public static final FIntegerType SCALAR                = new FIntegerType(Size.SCALAR);
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1140
     */
    public FExp zeroLiteral() { return new FIntegerLitExp(0); }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1177
     */
    public FExp createLiteral(int v) { return new FIntegerLitExp(v); }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1439
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		return new FIntegerVariable(fvt, variability.combineDown(fDiscrete()), name);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FIntegerType() {
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
    public FIntegerType(Size p0) {
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
    public FIntegerType clone() throws CloneNotSupportedException {
        FIntegerType node = (FIntegerType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FIntegerType copy() {
        try {
            FIntegerType node = (FIntegerType) clone();
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
    public FIntegerType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:83
     */
    public FIntegerType treeCopyNoTransform() {
        FIntegerType tree = (FIntegerType) copy();
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
    public FIntegerType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:110
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FIntegerType)node).tokenSize_Size);    
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
        String formatSpecifier_value = "d";

        return formatSpecifier_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue add(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue add_CValue_CValue_value = new CValueInteger(v1.intValue() + v2.intValue());

        return add_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue sub(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue sub_CValue_CValue_value = new CValueInteger(v1.intValue() - v2.intValue());

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
                return new CValueInteger(v1.intValue()*v2.intValue());
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
    public CValue neg(CValue v) {
        ASTNode$State state = state();
        CValue neg_CValue_value = new CValueInteger(-v.intValue());

        return neg_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue abs(CValue v) {
        ASTNode$State state = state();
        CValue abs_CValue_value = new CValueInteger(StrictMath.abs(v.intValue()));

        return abs_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue sign(CValue v) {
        ASTNode$State state = state();
        CValue sign_CValue_value = new CValueInteger((int) StrictMath.signum(v.realValue()));

        return sign_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceil(CValue v) {
        ASTNode$State state = state();
        CValue ceil_CValue_value = new CValueInteger((int) StrictMath.ceil(v.realValue()));

        return ceil_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue truncToZero(CValue v) {
        ASTNode$State state = state();
        CValue truncToZero_CValue_value = v.realValue() < 0 ? ceil(v) : v.convertInteger();

        return truncToZero_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = "Integer";

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = String.format("i%d", ndims());

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
        boolean typeCompatible_FType_boolean_value = type.isInteger() && dimensionCompatible(type, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInteger() {
        ASTNode$State state = state();
        boolean isInteger_value = true;

        return isInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeIndex() {
        ASTNode$State state = state();
        boolean canBeIndex_value = true;

        return canBeIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType scalarType() {
        ASTNode$State state = state();
        FType scalarType_value = FIntegerType.SCALAR;

        return scalarType_value;
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
        String macroTypeDeclScalar_value = "INT";

        return macroTypeDeclScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public int maxStringLength_C(int precision) {
        ASTNode$State state = state();
        int maxStringLength_C_int_value = 10;

        return maxStringLength_C_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String exportWrapperType_C() {
        ASTNode$State state = state();
        String exportWrapperType_C_value = "int";

        return exportWrapperType_C_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
