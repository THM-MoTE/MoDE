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
 * Class representing the primitive type String.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:409
 * @production FStringType : {@link FPrimitiveType};

 */
public class FStringType extends FPrimitiveType implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1747
     */
    public CValue zeroCValueScalar()  { return new CValueString(""); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1767
     */
    public CValue convert(CValue v)  { return v.convertString(); }
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:875
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        return new CValueString(com.deserializeString());
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:941
     */
    public static final FStringType SCALAR                 = new FStringType(Size.SCALAR);
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1141
     */
    public FExp zeroLiteral()  { return new FStringLitExp(""); }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:653
     */
    public void contentCheckFortranArg(ErrorCheckType checkType, FExternalStmt stmt) {
        String funcName = stmt.containingInstClassDecl().qualifiedName();
        boolean islapack = funcName.startsWith("Modelica.Math.Matrices.LAPACK");
        if (!islapack) {
            stmt.error("Passing strings to external fortran functions is not allowed");
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1449
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		return new FStringVariable(fvt, variability.combineDown(fDiscrete()), name);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1436
     */
    @Override
    public void printInitStartValue_C(CodePrinter p, CodeStream str, String indent, String name) {
        str.print(indent);
        str.print("JMI_INI(");
        str.print(macroTypeScalar());
        str.print(", ");
        str.print(name);
        str.print(")\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2135
     */
    @Override
    public void printAssignExt_C(CodePrinter p, CodeStream str, String indent, String dst, String src, 
            boolean wb, boolean first) {
        str.formatln("%sJMI_ASG(%s, %s, %s)", indent, macroType(), dst, src);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3666
     */
    @Override
    public void printAssign_C(CodePrinter p, CodeStream str, String indent, FExp dst, FExp src) {
        str.print(indent);
        str.print("JMI_ASG(");
        str.print(macroType());
        str.print(", ");
        p.print(dst, str, indent);
        str.print(", ");
        p.print(src, str, indent);
        str.print(")\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3706
     */
    @Override
    public void printFree_C(CodeStream str, String indent, boolean external, String name) {
        if (isArray()) {
            str.formatln("%sjmi_free_str_arr(%s);", indent, name);
        } else {
            str.formatln("%sJMI_FREE(%s)", indent, name);
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FStringType() {
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
    public FStringType(Size p0) {
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
    public FStringType clone() throws CloneNotSupportedException {
        FStringType node = (FStringType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FStringType copy() {
        try {
            FStringType node = (FStringType) clone();
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
    public FStringType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:83
     */
    public FStringType treeCopyNoTransform() {
        FStringType tree = (FStringType) copy();
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
    public FStringType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:110
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FStringType)node).tokenSize_Size);    
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
    public CValue add(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue add_CValue_CValue_value = new CValueString(v1.stringValue() + v2.stringValue());

        return add_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue equ(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue equ_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) == 0);

        return equ_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue neq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue neq_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) != 0);

        return neq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue geq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue geq_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) >= 0);

        return geq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue gt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue gt_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) > 0);

        return gt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue leq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue leq_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) <= 0);

        return leq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue lt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue lt_CValue_CValue_value = new CValueBoolean(v1.stringValue().compareTo(v2.stringValue()) < 0);

        return lt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = "String";

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = String.format("s%d", ndims());

        return signatureString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_boolean_value = type.isString() && dimensionCompatible(type, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_boolean_value = type.isString() && dimensionCompatible(type, allowUnknown);

        return equivalentTo_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isString() {
        ASTNode$State state = state();
        boolean isString_value = true;

        return isString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasAdd() {
        ASTNode$State state = state();
        boolean hasAdd_value = true;

        return hasAdd_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType scalarType() {
        ASTNode$State state = state();
        FType scalarType_value = FStringType.SCALAR;

        return scalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C() {
        ASTNode$State state = state();
        String nameScalar_C_value = "jmi_string_t";

        return nameScalar_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArray_C() {
        ASTNode$State state = state();
        String nameArray_C_value = "jmi_string_array_t";

        return nameArray_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argType_C(boolean ref) {
        ASTNode$State state = state();
        String argType_C_boolean_value = argTypeBase_C();

        return argType_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argTypeBase_C() {
        ASTNode$State state = state();
        String argTypeBase_C_value = "char*";

        return argTypeBase_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeScalar() {
        ASTNode$State state = state();
        String macroTypeScalar_value = "STR";

        return macroTypeScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDeclScalar() {
        ASTNode$State state = state();
        String macroTypeDeclScalar_value = "STR";

        return macroTypeDeclScalar_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
