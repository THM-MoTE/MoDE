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
 * Base class for all type nodes.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:340
 * @production FType : {@link BaseNode} ::= <span class="component">&lt;Size:Size&gt;</span>;

 */
public abstract class FType extends BaseNode implements Cloneable {
    /**
     * Wrap the given expression so it is suitable for use in an expression 
     * calculating the array size of a range expression.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:732
     */
    public FExp wrapRangeSizeExp(FExp exp) {
 		return exp;
 	}
    /**
     * Create a CValue with the zero value for this type, if applicable.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1732
     */
    public CValue zeroCValue() {
        if (isArray() && !zeroCValueScalar().isUnknown()) {
            CValueArray res = new CValueArray(size());
            while (!res.isFilled())
                res.addCell(zeroCValueScalar());
            return res; 
        } else {
            return zeroCValueScalar();
        }
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1743
     */
    public CValue zeroCValueScalar()        { return CValue.UNSUPPORTED; }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1750
     */
    public CValue createCValue(int v) {
        if (isArray()) {
            CValueArray res = new CValueArray(size());
            while (!res.isFilled())
                res.addCell(createCValueScalar(v));
            return res;
        } else {
            return createCValueScalar(v);
        }
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1761
     */
    public CValue createCValueScalar(int v)     { return new CValueInteger(v); }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1764
     */
    public CValue convert(CValue v)        { return v; }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1770
     */
    public CValue limitCValueScalar(boolean high)        { return CValue.UNSUPPORTED; }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1811
     */
    public CValue unknownCValue() {
        if (isArray()) {
            CValueArray arr = new CValueArray(size());
            for (Index i : indices()) {
                arr.setCell(i, CValue.UNKNOWN);
            }
            return arr;
        } else {
            return CValue.UNKNOWN;
        }
    }
    /**
     * Handle one part of the left access of an assignment during function evaluation.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4128
     */
    public CValue assignToPartInFuncEval(CommonNamePart name, CValue left, CValue right) {
	  return assignToLastInFuncEval(name, left, right);
  }
    /**
     * \brief Get the type of a specific component.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4189
     */
    public FType componentType(String name, List<FRecordComponentType> comps) {
        for (FRecordComponentType comp : comps)
            if (comp.getName().equals(name))
                return comp.getFType();
        return fUnknownType();
    }
    /**
     * Handle the last part of the left access of an assignment during function evaluation.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4200
     */
    public CValue assignToLastInFuncEval(CommonNamePart name, CValue left, CValue right) {
        if (!isArray() || !name.hasFArraySubscripts()) {
            return right.cached();
        }
        
        if (left.isUnknown()) {
            left = new CValueArray(size().ceval()).markAsCached();
        }
        
	  if (name.isArray()) {
	  	  CValueArray al = left.array();
		  CValueArray ar = right.array();
		  Indices ind = name.indices();
		  for (Index i : ind)
			  al.setCell(ind.translate(i), ar.getCell(i));
	  } else {
		  left.array().setCell(name.getFArraySubscripts().createIndex(), right);
	  }
	  return left;
  }
    /**
     * Create a negation expression for the flat tree for an expression of this type.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:526
     */
    public FExp createFNegExp(FExp a) {
        return new FNegExp(a);
    }
    /**
     * Create a subtraction expression for the flat tree for two expressions of this type.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:537
     */
    public FExp createFSubExp(FExp a, FExp b) {
        return new FSubExp(a, b);
    }
    /**
     * Create an addition expression for the flat tree for two expressions of this type.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:548
     */
    public FExp createFAddExp(FExp a, FExp b) {
        return new FAddExp(a, b);
    }
    /**
     * Read a constant value of <code>this</code> type from <code>buff</code>
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:845
     */
    public CValue deserialize(ProcessCommunicator com) throws IOException {
        if (isArray()) {
            CValueArray a = new CValueArray(size().ceval());
            for (Index i : a.indices()) {
                a.setCell(i, deserializeScalar(com));
            }
            return a;
        } else {
            return deserializeScalar(com);
        }
    }
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:856
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        throw new IOException("Unsupported type to deserialize '" + getClass().getSimpleName() + "'");
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:271
     */
    public FType createSizeFExp(InstFunctionCall call) {
        FType res = treeCopy();
        res.replaceSizeFExp(call);
        return res;
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:283
     */
    public void replaceSizeFExp(InstFunctionCall call) {
        setSize(getSize().createSizeFExp(call));
        super.replaceSizeFExp(call);
    }
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:628
     */
    public FType lookupHierarchical(FQName name, int part, int last) {
        return this;
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1031
     */
    
        protected static interface TypeChecker {
            public boolean check(FType t);
        }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1035
     */
    
        
        private static final TypeChecker IS_REAL = new TypeChecker() {
            public boolean check(FType t) { return t.isReal(); }
        };
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1040
     */
    protected boolean recursiveTypeCheck(TypeChecker ch) {
        return ch.check(this);
    }
    /**
     * Create a literal with the zero value for this type, if applicable.
     * 
     * For operator records, a record constructor call is created.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1125
     */
    public FExp sizedZeroLiteral() {
         if (isArray()) {
             return size().fillDimsOfExp(createArrayZeroLiteralNoSize());
         } else {
             return zeroLiteral();
         }
     }
    /**
     * Create a literal with the zero value for the scalar version of this type, if applicable.
     * 
     * For operator records, a record constructor call is created.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1138
     */
    public FExp zeroLiteral()        { return new FNoExp(); }
    /**
     * Create a fill or zeros expression, as appropriate to describe a zero-value 
     * literal of this type, without the size filled in.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1155
     */
    protected FArrayDimAsArgsExp createArrayZeroLiteralNoSize() {
       return new FFillExp(new List<FExp>(), zeroLiteral());
   }
    /**
     * Create a literal with the given integer value for this type, if applicable.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1165
     */
    public FExp createSizedLiteral(int v) {
       if (isArray()) {
           return size().fillDimsOfExp(createArrayLiteralNoSize(v));
       } else {
           return createLiteral(v);
       }
   }
    /**
     * Create a literal with the given integer value for the scalar version of this type, if applicable.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1176
     */
    public FExp createLiteral(int v)        { throw new UnsupportedOperationException(); }
    /**
     * Create a fill, zeros or ones expression, as appropriate for the given integer value, 
     * without the size filled in.
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1188
     */
    protected FArrayDimAsArgsExp createArrayLiteralNoSize(int v) {
       return new FFillExp(new List<FExp>(), createLiteral(v));
   }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:645
     */
    public void contentCheckFortranArg(ErrorCheckType checkType, FExternalStmt stmt) {
        
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:670
     */
    public void contentCheckCArg(ErrorCheckType checkType, FExternalStmt stmt) { }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:180
     */
    public void flattenOverloadedOperatorsForFlow(FClass fc) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:477
     */
    public void updateRecordArraySizes(FType from) {
        setSize(from.getSize());
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:806
     */
    public FType flatten(FQName prefix, InstAssignable ia, boolean keepSizeExpressions) {
        FType res = fullCopy();
        res.setSize(getSize().flatten(prefix, res, keepSizeExpressions));
        return res;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:909
     */
    public FExp affixExpression(FExp exp) {
        // TODO: need better way of including exp in tree
        exp.parent = this;
        return exp;
    }
    /**
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:136
     */
    public FType componentType(String name) {
        return fUnknownType();
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2197
     */
    public void transferSizes(FType t) {
        if (!t.isUnknown()) {
            setSize(t.getSize());
        }
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3988
     */
    @Override
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        super.markUsedFunctionsAndRecords(type);
        getSize().markUsedFunctionsAndRecords(type);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:510
     */
    public FExp addInliningVarsAndEqns(final AbstractFunctionInliner fi, final String old, final boolean noEvent,
            final FExp src, final String temp) {
        ExpFromTypeBuilder b = new ExpFromTypeBuilder() {
            public FExp build(String suffix, FType type) {
                String tempName = temp + suffix;
                String oldName = old + suffix;
                FExp e = src.dynamicFExp(new FIdUseExp(tempName));
                FTypePrefixVariability v = fi.contextVariability(src);
                fi.addVarAndEqn(oldName, e, noEvent, type, v);
                fi.addVar(new FQNameString(tempName), v, type);
                return e.fullCopy();
             }
        };
        return buildFExp(b, "");
     }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:845
     */
    public FExp replaceInlined(final AbstractFunctionInliner fi, final String name) {
        ExpFromTypeBuilder b = new ExpFromTypeBuilder() {
            public FExp build(String suffix, FType type) {
                return fi.getReplacementExp(name + suffix).fullCopy();
            }
        };
        return buildFExp(b, "");
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:858
     */
    public FExp buildFExp(ExpFromTypeBuilder b, String suffix) {
         if (isArray()) {
            return buildFExp(b, suffix, 0, indices().iterator());
        } else {
            return buildFExpCell(b, suffix);
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:866
     */
    public FExp buildFExp(ExpFromTypeBuilder b, String suffix, int dim, Iterator<Index> indices) {
        if (dim < size().ndims()) {
            FArray a = new FArray();
            for (int i = 0; i < size().get(dim); i++) {
               a.addFExp(buildFExp(b, suffix, dim + 1, indices));
            }
            return a;
        } else {
            return buildFExpCell(b, suffix + indices.next());
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:878
     */
    public FExp buildFExpCell(ExpFromTypeBuilder b, String suffix) {
        return b.build(suffix, scalarType());
     }
    /**
     * Make a copy of this type with all variable references replaced according to the 
     * function inliner.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1705
     */
    public FType copyAndReplaceReferences(AbstractFunctionInliner fi) {
        FType res = fullCopy();
        return res.replaceReferences(fi);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1710
     */
    public FType replaceReferences(AbstractFunctionInliner fi) {
        setSize(getSize().replaceReferences(fi, this));
        return this;
    }
    /**
     * Generate scalar clauses for this record or record component.
     * 
     * @param s         Scalarization visitor
     * @param suffix    add this as a suffix to the name of the uppermost record in uses
     * @param left      the left expression from the original equation
     * @param right     the right expression from the original equation
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:985
     */
    public void scalarRecordClauses(Scalarizer s, FQName suffix, FExp left, FExp right) {
        left = left.scalarRecordFExp(s.map(), suffix);
        right = right.scalarRecordFExp(s.map(), suffix);
        s.add(left, right);
    }
    /**
     * Generate scalar clauses for this record component.
     * 
     * @param s         Scalarization visitor
     * @param suffix    add this as a suffix to the name of the uppermost record in uses
     * @param left      the left expression from the original equation
     * @param right     the right expression from the original equation
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1007
     */
    public void scalarRecordComponentClauses(Scalarizer s, FQName suffix, FExp left, FExp right) {
		if (isArray()) {
			FQNameFull fullSuffix = suffix.copyAsFQNameFull();
			Indices ind = null;
            if (!size().isUnknown())
				ind = indices(); 
			else  // TODO: This is calculated each time - introduce some kind of lazy attribute?
                ind = left.dynamicFExp(left.scalarRecordFExp(s.map(), suffix)).indices();
			for (Index i : ind) {
				fullSuffix.addFArraySubscripts(i.createFArraySubscripts());
                scalarRecordClauses(s, fullSuffix, left, right);
			}
		} else {
            scalarRecordClauses(s, suffix, left, right);
		}
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1247
     */
    public void addDummyEqnsForTemp(List<FAbstractEquation> l, String name) {
        if (isArray()) {
            FType scalar = scalarType();
            for (Index i : indices()) 
                scalar.addDummyEqnsForTemp(l, name + i);
        } else {
            l.add(new FEquation(new FIdUseExp(name), zeroLiteral()));
        }
    }
    /**
     * Create a record constructor (or FArray of record constructors),  
     * with the arguments taken from a record variable with the given name.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1305
     */
    public FExp createRecordConstructor(Map<String,FExp> indexMap, FExp exp) {
		if (isArray()) 
			return createRecordConstructorArray(indexMap, exp, indices().iterator(), 0);
		else 
			return createRecordConstructorCell(indexMap, exp);
	}
    /**
     * Create an FArray of expressions, with the arguments taken from a record 
     * variable or member with the given name.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1316
     */
    public FExp createRecordConstructorArray(Map<String,FExp> indexMap, FExp exp, Iterator<Index> it, int dim) {
        Size s = size();
        if (s.isEmpty()) {
            List<FExp> dims = new List<FExp>();
            for (int i = 0, n = s.ndims(); i < n ; i++) {
                dims.add(s.createFExp(i));
            }
            return new FFillExp(dims, zeroLiteral());
        }
		FArray arr = new FArray();
		boolean last = dim == ndims() - 1;
		for (int i = 0, n = size().get(dim); i < n; i++) {
			FExp res;
			if (last)
				res = createRecordConstructorCell(indexMap, exp.extractArrayCell(indexMap, it.next()));
			else
				res = createRecordConstructorArray(indexMap, exp, it, dim + 1);
			arr.addFExp(res);
		}
		return arr;
	}
    /**
     * Create a record constructor with the arguments taken from a record 
     * variable with the given name.
     * 
     * Assumes that <code>name</code> refers to a non-array variable 
     * (or a specific cell in an array variable).
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1345
     */
    public FExp createRecordConstructorCell(Map<String,FExp> indexMap, FExp exp) {
	    return exp.scalarize(indexMap);
	}
    /**
     * Creates a new temporary varable with the given name.
     * If this is an array, variables are created for each cell.
     * 
     * @param vars         list of variable to add the new variable to
     * @param name         the name of the new variable
     * @param variability  the variability of the new variable
     * @param fixed        if creating parameters, use this value for the fixed attribute
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1371
     */
    public void createTempFVariables(List vars, FQName name, FTypePrefixVariability variability) {
        if (isArray()) {
            FQNameFull fqn = name.copyAsFQNameFull();
            for (Index i : indices()) {
                fqn.addFArraySubscripts(i.createFArraySubscripts());
                createTempCellFVariables(vars, fqn, variability);
            }
        } else {
            createTempCellFVariables(vars, name, variability);
        }
    }
    /**
     * Creates a new temporary variable with the given name.
     * 
     * @param vars         list of variable to add the new variable to
     * @param name         the name of the new variable
     * @param variability  the variability of the new variable
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1390
     */
    public void createTempCellFVariables(List vars, FQName name, FTypePrefixVariability variability) {
        FQName fqn = name.fullCopy();
        fqn.scalarized = true;
        FVariable var = createTempFVariable(fqn, variability);
        vars.add(var);
    }
    /**
     * Creates a new temporary variable with the given visibility, name and visibility.
     * 
     * All optional children in the new variable are empty.
     * 
     * Default implementation returns <code>null</code>.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1418
     */
    public FVariable createTempFVariable(FQName name, FTypePrefixVariability variability) {
		return createFVariable(new FTemporaryVisibilityType(), name, variability);
	}
    /**
     * Creates a new variable with the given visibility, name and visibility.
     * 
     * All optional children in the new variable are empty.
     * 
     * Default implementation returns <code>null</code>.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1429
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:142
     */
    public void scalarizeInitArray(Scalarizer.Algorithm s, ASTNode context) {
        setSize(getSize().scalarizeInitArray(s, context == null ? this : context));
    }
    /**
     * Scalarize an assignment and put the resulting statements in the list of statements. 
     * @aspect AssignmentScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:169
     */
    public void scalarizeAssignment(Scalarizer.Algorithm s, FAssignableExp left, FExp right) {
        
        FExp expInAst = right.getParent() != null ? right : left;
        
        left.createArrayTemporaries(s);
        right.createArrayTemporaries(s);
        
        ForNames names = s.getNames();
        if (size().isUnknown()) {
            names.addLayer(ndims());
            names.fillLayer(expInAst);
        }
        
        if (size().isUnknown()) {
            left.addArrayUsesToIndexMap(s);
            right.addArrayUsesToIndexMap(s);
            List<FStatement> stmts = s.createForLoops(expInAst);
            s = s.block(stmts);
            names.removeLayer();
        }
        
        scalarizeAssignment_sub(s, left, right);
    }
    /**
     * @aspect AssignmentScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:193
     */
    public void scalarizeAssignment_sub(Scalarizer.Algorithm s, FAssignableExp left, FExp right) {
        if (size().isUnknown() || !isArray()) {
            scalarizeScalarAssignment(s, left, right);
        } else {
            scalarizeArrayAssignment(s, left, right);
        }
    }
    /**
     * Scalarize an array assignment of known size.
     * @aspect AssignmentScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:204
     */
    public void scalarizeArrayAssignment(Scalarizer.Algorithm s, FAssignableExp left, FExp right) {
        Indices ind = size().isUnknown() ? right.indices() : indices();
        for (Index i : ind) {
            scalarizeScalarAssignment(s, (FAssignableExp) left.extractArrayCell(s.map(), i), right.extractArrayCell(s.map(), i));
        }
    }
    /**
     * Scalarize a scalar assignment
     * @aspect AssignmentScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:214
     */
    protected void scalarizeScalarAssignment(Scalarizer.Algorithm s, FAssignableExp left, FExp right) {
        left = (FAssignableExp) left.scalarize(s.map());
        right = right.scalarize(s.map());
        s.add(new FAssignStmt(left,right));
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:212
     */
    public Set<String> sortingAddNamesUsed(Set<String> set) {
        super.sortingAddNamesUsed(set);
        getSize().sortingAddNamesUsed(set);
        return set;
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1120
     */
    public void printDecl_C(CodePrinter p, CodeStream str, String indent, String name, FExp src) {
        printDecl_C(p, str, indent, name, src, false);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1124
     */
    public void printDecl_C(CodePrinter p, CodeStream str, String indent, String name, FExp src, boolean external) {
        print(p.createDeclPrinter(str), indent, name, src, external);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1128
     */
    public void printInit_C(CodePrinter p, CodeStream str, String indent, String name, FExp src) {
        printInit_C(p, str, indent, name, src, false);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1132
     */
    public void printInit_C(CodePrinter p, CodeStream str, String indent, String name, FExp src, boolean external) {
        print(p.createInitSetPrinter(str), indent, name, src, external);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1136
     */
    public void print(TypePrinter_C tp, String indent, String name, FExp src, boolean external) {
        tp.reset(name, src, size().isUnknown(), external, indent);
        print(tp);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1141
     */
    public void print(TypePrinter_C p)               { p.print(this); }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1432
     */
    public void printInitStartValue_C(CodePrinter p, CodeStream str, String indent, String name) {
        
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1703
     */
    public void printDeclBase_C(CodePrinter p, CodeStream str, String indent, String name, FExp src, boolean external) {
        if (isArray()) {
            if (size().isUnknown()) {
                printDecl_C(p, str, indent, name, src, external);
            } else {
                String type = "STAT" + (isReal() ? "REAL" : "");
                str.format("%sJMI_ARR(%s, %s, %s, %s, ", indent, type,
                        nameScalar_C(external), nameArray_C(external), name);
                size().printNumElements_C(p, str, indent, src);
                str.print(", ");
                str.print(ndims());
                str.println(")");
            }
        } else {
            printScalarDecl_C(str, indent, external, name);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2126
     */
    public void printAssignExt_C(CodePrinter p, CodeStream str, String indent, String dst, String src, 
            boolean wb, boolean first) {
        if (wb) {
            str.formatln("%s%s = %s;", indent, src, dst);
        } else {
            str.formatln("%s%s = (%s)%s;", indent, dst, argType_C(false), src);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3658
     */
    public void printAssign_C(CodePrinter p, CodeStream str, String indent, FExp dst, FExp src) {
        str.print(indent);
        p.print(dst, str, indent);
        str.print(" = ");
        p.print(src, str, indent);
        str.print(";\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3678
     */
    public void printReturn_C(CodeStream str, String indent, String dst, String src) {
        str.print(indent);
        str.print("JMI_RET(");
        str.print(macroType());
        str.print(", ");
        str.print(dst);
        str.print(", ");
        str.print(src);
        str.print(")\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3689
     */
    public void printScalarDecl_C(CodeStream str, String indent, boolean external, String name) {
        str.print(indent);
        str.print("JMI_DEF(");
        str.print(macroTypeDecl(external));
        str.print(", ");
        str.print(name);
        str.print(")\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3703
     */
    public void printFree_C(CodeStream str, String indent, boolean external, String name) {
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4653
     */
    public void genFuncCallInOutArg_C(CodeFuncCallInOutArgPrinter p, CodeStream str, String indent, String name, FExp exp) {
        if (isArray()) {
            if (size().isUnknown()) {
                // Works for now!
                str.format("%sJMI_ASG(%s, ", indent, macroType());
                ASTNode.printer_C.print(exp, str, indent);
                str.formatln(", %s)", name);
            } else {
                String type = isRecord() ? C_ARRAY_RECORD : p.arrayAccessConst();
                String pre = String.format("jmi_array_%s_%d(%s, ", type, ndims(), name);
                Array arr = exp.getArray();
                for (Index i : arr.indices()) {
                    String cellName = pre + i.toUnclosedString() + ")";
                    genFuncCallCellInOutArg_C(p, str, indent, cellName, arr.get(i));
                }
            }
        } else {
            genFuncCallCellInOutArg_C(p, str, indent, name, exp);
        }
        p.endComponent(str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4678
     */
    public void genFuncCallCellInOutArg_C(CodeFuncCallInOutArgPrinter p, CodeStream str, String indent, String name, FExp exp) {
        p.printCell(str, indent, name, exp);
    }
    /**
     * Generate code that parses the variable <code>name</code> of type 
     * <code>this</code> from stdin.
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:216
     */
    public void genSerialize_C(CodeStream str, String indent, String name, boolean parse) {
        str.formatln("%sJMCEVAL_%s%s(%s, %s);",
                indent,
                parse ? "parse" : "print",
                isArray() ? "Array" : "",
                isEnum() ? "Enum" : name(),
                name);
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:324
     */
    public void usedTypes(Map<String,FType> res) {
        if (res.containsKey(name())) {
            return;
        }
        res.put(name(), this);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FType() {
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
    public FType(Size p0) {
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
        indices_reset();
        myFEnumDecl_reset();
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
    public FType clone() throws CloneNotSupportedException {
        FType node = (FType) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:61
     */
    public abstract FType fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:68
     */
    public abstract FType treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:76
     */
    public abstract FType treeCopy();
    /**
     * Replaces the lexeme Size.
     * @param value The new value for the lexeme Size.
     * @apilevel high-level
     */
    public void setSize(Size value) {
        tokenSize_Size = value;
    }
    /**
     * @apilevel internal
     */
    protected Size tokenSize_Size;
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
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1190
     */
    @ASTNodeAnnotation.Attribute
    public abstract String name();
    /**
     * @apilevel internal
     */
    protected boolean indices_computed = false;
    /**
     * @apilevel internal
     */
    protected Indices indices_value;
    /**
     * @apilevel internal
     */
    private void indices_reset() {
        indices_computed = false;
        indices_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        if(indices_computed) {
            return indices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        indices_value = Indices.create(size());
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2615
     */
    @ASTNodeAnnotation.Attribute
    public String formatSpecifier() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue add(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue add_CValue_CValue_value = CValue.UNKNOWN;

        return add_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue sub(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue sub_CValue_CValue_value = CValue.UNKNOWN;

        return sub_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue mul(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue mul_CValue_CValue_value = CValue.UNKNOWN;

        return mul_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue div(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue div_CValue_CValue_value = CValue.UNKNOWN;

        return div_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue pow(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue pow_CValue_CValue_value = CValue.UNKNOWN;

        return pow_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue neg(CValue v) {
        ASTNode$State state = state();
        CValue neg_CValue_value = CValue.UNKNOWN;

        return neg_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue abs(CValue v) {
        ASTNode$State state = state();
        CValue abs_CValue_value = CValue.UNKNOWN;

        return abs_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue sign(CValue v) {
        ASTNode$State state = state();
        CValue sign_CValue_value = CValue.UNKNOWN;

        return sign_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceil(CValue v) {
        ASTNode$State state = state();
        CValue ceil_CValue_value = CValue.UNKNOWN;

        return ceil_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue truncToZero(CValue v) {
        ASTNode$State state = state();
        CValue truncToZero_CValue_value = CValue.UNKNOWN;

        return truncToZero_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue and(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue and_CValue_CValue_value = CValue.UNKNOWN;

        return and_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue or(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue or_CValue_CValue_value = CValue.UNKNOWN;

        return or_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue not(CValue v) {
        ASTNode$State state = state();
        CValue not_CValue_value = CValue.UNKNOWN;

        return not_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue equ(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue equ_CValue_CValue_value = new CValueBoolean(v1.intValue() == v2.intValue());

        return equ_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue neq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue neq_CValue_CValue_value = new CValueBoolean(v1.intValue() != v2.intValue());

        return neq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue geq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue geq_CValue_CValue_value = new CValueBoolean(v1.intValue() >= v2.intValue());

        return geq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue gt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue gt_CValue_CValue_value = new CValueBoolean(v1.intValue() > v2.intValue());

        return gt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue leq(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue leq_CValue_CValue_value = new CValueBoolean(v1.intValue() <= v2.intValue());

        return leq_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue lt(CValue v1, CValue v2) {
        ASTNode$State state = state();
        CValue lt_CValue_CValue_value = new CValueBoolean(v1.intValue() < v2.intValue());

        return lt_CValue_CValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarElements() {
        ASTNode$State state = state();
        int numScalarElements_value = size().numElements();

        return numScalarElements_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComposite() {
        ASTNode$State state = state();
        boolean isComposite_value = isArray() || isRecord();

        return isComposite_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordDecl myFRecordDecl() {
        ASTNode$State state = state();
        FRecordDecl myFRecordDecl_value = null;

        return myFRecordDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl myFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl myFFunctionDecl_value = null;

        return myFFunctionDecl_value;
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
        myFEnumDecl_value = null;
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = "-";

        return signatureString_value;
    }
    @ASTNodeAnnotation.Attribute
    public String toString() {
        ASTNode$State state = state();
        String toString_value = isArray() ? name() + size() : name();

        return toString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeRange() {
        ASTNode$State state = state();
        boolean canBeRange_value = false;

        return canBeRange_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNoType() {
        ASTNode$State state = state();
        boolean isNoType_value = false;

        return isNoType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType component(int i) {
        ASTNode$State state = state();
        FType component_int_value = fUnknownType();

        return component_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType nullUnknown(FRecordComponentType t) {
        ASTNode$State state = state();
        FType nullUnknown_FRecordComponentType_value = t == null ? fUnknownType() : t.getFType();

        return nullUnknown_FRecordComponentType_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:594
     */
    @ASTNodeAnnotation.Attribute
    public FType vectorized(Size s) {
        ASTNode$State state = state();
        try {
                if (s == Size.SCALAR) {
                    return this;
                }
                MutableSize s2 = s.mutableClone();
                s2.append(getSize());
                return sizedType(s2);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FType typePromotion(FType type) {
        ASTNode$State state = state();
        FType typePromotion_FType_value = typePromotion(type, false, null);

        return typePromotion_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType looseTypePromotion(FType type) {
        ASTNode$State state = state();
        FType looseTypePromotion_FType_value = looseTypePromotion(type, false, null);

        return looseTypePromotion_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType numericPromotion(FType type) {
        ASTNode$State state = state();
        FType numericPromotion_FType_value = numericPromotion(type, false, null);

        return numericPromotion_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType looseNumericPromotion(FType type) {
        ASTNode$State state = state();
        FType looseNumericPromotion_FType_value = looseNumericPromotion(type, false, null);

        return looseNumericPromotion_FType_value;
    }
    /**
     * Combine two types to the broadest common denominator.
     * 
     * If types are not compatible, the unknown type is returned.
     * An integer type combined with a real type results in a real type.
     * If <code>allowUnknown</code> is <code>true</code>, then unknown 
     * lengths are considered equal to any length. If non-<code>null</code>, 
     * <code>operator</code> defines what operator to use in operator 
     * overloading.
     * @attribute syn
     * @aspect TypePromotion
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:693
     */
    @ASTNodeAnnotation.Attribute
    public FType typePromotion(FType type, boolean allowUnknown, String operator) {
        ASTNode$State state = state();
        try {
                if ((isOperatorRecord() || type.isOperatorRecord()) && operator != null) {
                    return matchOverloadedOperatorType(type, operator, false, allowUnknown);
                } else if (isNumeric())
                    return numericPromotion(type, allowUnknown, operator);
                else if (!equivalentTo(type, allowUnknown))
                    return fUnknownType();
                else
                    return this;
            }
        finally {
        }
    }
    /**
     * Combine two types to the broadest common denominator.
     * 
     * If scalar types are not compatible or if both are array and sizes 
     * doesn't match, the unknown type is returned.
     * An integer type combined with a real type results in a real type.
     * If <code>allowUnknown</code> is <code>true</code>, then unknown 
     * lengths are considered equal to any length. If non-<code>null</code>, 
     * <code>operator</code> defines what operator to use in operator 
     * overloading.
     * @attribute syn
     * @aspect TypePromotion
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:715
     */
    @ASTNodeAnnotation.Attribute
    public FType looseTypePromotion(FType type, boolean allowUnknown, String operator) {
        ASTNode$State state = state();
        try {
                if ((isOperatorRecord() || type.isOperatorRecord()) && operator != null) {
                    return matchOverloadedOperatorType(type, operator, true, allowUnknown);
                } else if (looslyDimensionCompatible(type, allowUnknown)) {
                    FType scalar = scalarType().typePromotion(type.scalarType(), false, operator);
                    return scalar.sizedType(isScalar() ? type.size() : size());
                } else {
                    return fUnknownType();
                }
            }
        finally {
        }
    }
    /**
     * Combine two types to the broadest common numeric denominator.
     * 
     * If either is non-numeric or if sizes doesn't match, 
     * the unknown type is returned. Operator records with suitable 
     * overloaded operators are considered numeric for this purpose.
     * An integer type combined with a real type results in a real type.
     * If <code>allowUnknown</code> is <code>true</code>, then unknown 
     * lengths are considered equal to any length. If non-<code>null</code>, 
     * <code>operator</code> defines what operator to use in operator 
     * overloading.
     * @attribute syn
     * @aspect TypePromotion
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:738
     */
    @ASTNodeAnnotation.Attribute
    public FType numericPromotion(FType type, boolean allowUnknown, String operator) {
        ASTNode$State state = state();
        try {
                if (isOperatorRecord() || type.isOperatorRecord()) {
                    return matchOverloadedOperatorType(type, operator, false, allowUnknown);
                } else if (dimensionCompatible(type, allowUnknown)) {
                    return scalarNumericPromotion(type, operator).arrayType(size());
                } else {
                    return fUnknownType();
                }
            }
        finally {
        }
    }
    /**
     * Combine two types to the broadest common numeric denominator.
     * 
     * If either is non-numeric or if both are array and sizes doesn't match, 
     * the unknown type is returned. Operator records with suitable 
     * overloaded operators are considered numeric for this purpose.
     * An integer type combined with a real type results in a real type.
     * If <code>allowUnknown</code> is <code>true</code>, then unknown 
     * lengths are considered equal to any length. If non-<code>null</code>, 
     * <code>operator</code> defines what operator to use in operator 
     * overloading.
     * @attribute syn
     * @aspect TypePromotion
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:760
     */
    @ASTNodeAnnotation.Attribute
    public FType looseNumericPromotion(FType type, boolean allowUnknown, String operator) {
        ASTNode$State state = state();
        try {
                if (isOperatorRecord() || type.isOperatorRecord()) {
                    return matchOverloadedOperatorType(type, operator, true, allowUnknown);
                } else if (looslyDimensionCompatible(type, allowUnknown)) {
                    return scalarNumericPromotion(type, operator).sizedType(isScalar() ? type.size() : size());
                } else {
                    return fUnknownType();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FType scalarNumericPromotion(FType type, String operator) {
        ASTNode$State state = state();
        FType scalarNumericPromotion_FType_String_value = scalarType().matchOverloadedOperatorType(type.scalarType(), operator, false, false);

        return scalarNumericPromotion_FType_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_value = typeCompatible(type, false);

        return typeCompatible_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_boolean_value = false;

        return typeCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeMatches(FType type, boolean compatible, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeMatches_FType_boolean_boolean_value = compatible ? typeCompatible(type, allowUnknown) : equivalentTo(type, allowUnknown);

        return typeMatches_FType_boolean_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect FTypeCompatibility
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:870
     */
    @ASTNodeAnnotation.Attribute
    public boolean typeMatches(Iterable<FRecordComponentType> comps1, Iterable<FRecordComponentType> comps2, boolean compatible, boolean allowUnknown) {
        ASTNode$State state = state();
        try {
                Iterator<FRecordComponentType> i1 = comps1.iterator();
                Iterator<FRecordComponentType> i2 = comps2.iterator();
                while (i1.hasNext()) {
                    if (!i1.next().typeMatches(i2.next(), compatible, allowUnknown))
                        return false;
                }
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean dimensionCompatible(FType type) {
        ASTNode$State state = state();
        boolean dimensionCompatible_FType_value = dimensionCompatible(type, false);

        return dimensionCompatible_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean dimensionCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean dimensionCompatible_FType_boolean_value = size().equivalent(type.size(), allowUnknown);

        return dimensionCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean looslyDimensionCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean looslyDimensionCompatible_FType_boolean_value = isScalar() || type.isScalar() || dimensionCompatible(type, allowUnknown);

        return looslyDimensionCompatible_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatibleExceptLengths(FType type) {
        ASTNode$State state = state();
        boolean typeCompatibleExceptLengths_FType_value = ndims() == type.ndims() && scalarType().typeCompatible(type.scalarType());

        return typeCompatibleExceptLengths_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_value = equivalentTo(type, false);

        return equivalentTo_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_boolean_value = false;

        return equivalentTo_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentExceptLengths(FType type) {
        ASTNode$State state = state();
        boolean equivalentExceptLengths_FType_value = ndims() == type.ndims() && scalarType().equivalentTo(type.scalarType());

        return equivalentExceptLengths_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = false;

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInteger() {
        ASTNode$State state = state();
        boolean isInteger_value = false;

        return isInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBoolean() {
        ASTNode$State state = state();
        boolean isBoolean_value = false;

        return isBoolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isString() {
        ASTNode$State state = state();
        boolean isString_value = false;

        return isString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = false;

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = false;

        return isOperatorRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnum() {
        ASTNode$State state = state();
        boolean isEnum_value = false;

        return isEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        boolean isExternalObject_value = false;

        return isExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunction() {
        ASTNode$State state = state();
        boolean isFunction_value = false;

        return isFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = getSize() != Size.SCALAR;

        return isArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isScalar() {
        ASTNode$State state = state();
        boolean isScalar_value = getSize() == Size.SCALAR;

        return isScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNumeric() {
        ASTNode$State state = state();
        boolean isNumeric_value = false;

        return isNumeric_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitive() {
        ASTNode$State state = state();
        boolean isPrimitive_value = false;

        return isPrimitive_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRealScalar() {
        ASTNode$State state = state();
        boolean isRealScalar_value = isReal() && isScalar();

        return isRealScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRealArray() {
        ASTNode$State state = state();
        boolean isRealArray_value = isReal() && isArray();

        return isRealArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIntegerScalar() {
        ASTNode$State state = state();
        boolean isIntegerScalar_value = isInteger() && isScalar();

        return isIntegerScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIntegerArray() {
        ASTNode$State state = state();
        boolean isIntegerArray_value = isInteger() && isArray();

        return isIntegerArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBooleanScalar() {
        ASTNode$State state = state();
        boolean isBooleanScalar_value = isBoolean() && isScalar();

        return isBooleanScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBooleanArray() {
        ASTNode$State state = state();
        boolean isBooleanArray_value = isBoolean() && isArray();

        return isBooleanArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStringScalar() {
        ASTNode$State state = state();
        boolean isStringScalar_value = isString() && isScalar();

        return isStringScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStringArray() {
        ASTNode$State state = state();
        boolean isStringArray_value = isString() && isArray();

        return isStringArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecordScalar() {
        ASTNode$State state = state();
        boolean isRecordScalar_value = isRecord() && isScalar();

        return isRecordScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecordArray() {
        ASTNode$State state = state();
        boolean isRecordArray_value = isRecord() && isArray();

        return isRecordArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnumScalar() {
        ASTNode$State state = state();
        boolean isEnumScalar_value = isEnum() && isScalar();

        return isEnumScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnumArray() {
        ASTNode$State state = state();
        boolean isEnumArray_value = isEnum() && isArray();

        return isEnumArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNumericScalar() {
        ASTNode$State state = state();
        boolean isNumericScalar_value = isNumeric() && isScalar();

        return isNumericScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNumericArray() {
        ASTNode$State state = state();
        boolean isNumericArray_value = isNumeric() && isArray();

        return isNumericArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitiveScalar() {
        ASTNode$State state = state();
        boolean isPrimitiveScalar_value = isPrimitive() && isScalar();

        return isPrimitiveScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitiveArray() {
        ASTNode$State state = state();
        boolean isPrimitiveArray_value = isPrimitive() && isArray();

        return isPrimitiveArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObjectScalar() {
        ASTNode$State state = state();
        boolean isExternalObjectScalar_value = isExternalObject() && isScalar();

        return isExternalObjectScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObjectArray() {
        ASTNode$State state = state();
        boolean isExternalObjectArray_value = isExternalObject() && isArray();

        return isExternalObjectArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsReal() {
        ASTNode$State state = state();
        boolean containsReal_value = isReal();

        return containsReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsInteger() {
        ASTNode$State state = state();
        boolean containsInteger_value = isInteger();

        return containsInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsBoolean() {
        ASTNode$State state = state();
        boolean containsBoolean_value = isBoolean();

        return containsBoolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsRecord() {
        ASTNode$State state = state();
        boolean containsRecord_value = isRecord();

        return containsRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsEnum() {
        ASTNode$State state = state();
        boolean containsEnum_value = isEnum();

        return containsEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsExternalObject() {
        ASTNode$State state = state();
        boolean containsExternalObject_value = isExternalObject();

        return containsExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean onlyContainsReal() {
        ASTNode$State state = state();
        boolean onlyContainsReal_value = recursiveTypeCheck(IS_REAL);

        return onlyContainsReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasAdd() {
        ASTNode$State state = state();
        boolean hasAdd_value = false;

        return hasAdd_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNeg() {
        ASTNode$State state = state();
        boolean hasNeg_value = false;

        return hasNeg_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeIndex() {
        ASTNode$State state = state();
        boolean canBeIndex_value = false;

        return canBeIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = getSize().ndims();

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = getSize();

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType sizedType(Size s) {
        ASTNode$State state = state();
        FType sizedType_Size_value = (s == Size.SCALAR) ? scalarType() : arrayType(s);

        return sizedType_Size_value;
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1072
     */
    @ASTNodeAnnotation.Attribute
    public FType scalarType() {
        ASTNode$State state = state();
        try {
                if (isScalar())
                    return this;
                FType copy = (FType) fullCopy();
                copy.setSize(Size.SCALAR);
                return copy;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = false;

        return isUnknown_value;
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1111
     */
    @ASTNodeAnnotation.Attribute
    public FType arrayType(Size size) {
        ASTNode$State state = state();
        try {
                if (size == size())
                    return this;
                FType copy = (FType) fullCopy();
                copy.setSize(size);
                return copy;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeAliasCompatible(FType type) {
        ASTNode$State state = state();
        boolean typeAliasCompatible_FType_value = typeCompatible(type);

        return typeAliasCompatible_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability funcOutputVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability funcOutputVariability_value = fDiscrete();

        return funcOutputVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compatibleConstructor(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean compatibleConstructor_InstClassDecl_value = false;

        return compatibleConstructor_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compatibleDestructor(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean compatibleDestructor_InstClassDecl_value = false;

        return compatibleDestructor_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean externalValid() {
        ASTNode$State state = state();
        boolean externalValid_value = externalValid(false);

        return externalValid_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean externalValid(boolean rec) {
        ASTNode$State state = state();
        boolean externalValid_boolean_value = false;

        return externalValid_boolean_value;
    }
    /**
     * Calculate the type of an operator expression involving operator records.
     * 
     * For binary expressions <code>this</code> should be the left hand side.
     * 
     * @param right     the type of the right-hand side of the expression, <code>null</code> for unary operators
     * @param operator  the name of the operator to look for
     * @param loose     <code>true</code> if dimensions should be matched loosely
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:125
     */
    @ASTNodeAnnotation.Attribute
    public FType matchOverloadedOperatorType(FType right, String operator, boolean loose, boolean allowUnknown) {
        ASTNode$State state = state();
        try {
                FType res = matchOverloadedOperatorType(right, operator);
                if (res.isUnknown() && (isArray() || right.isArray())) {
                    if (loose ? looslyDimensionCompatible(right, allowUnknown) : dimensionCompatible(right, allowUnknown)) {
                        FType scalar = scalarType().matchOverloadedOperatorType(right.scalarType(), operator);
                        res = scalar.sizedType(isScalar() ? right.size() : size());
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * Calculate the type of an operator expression involving operator records.
     * 
     * For binary expressions <code>this</code> should be the left hand side.
     * 
     * @param right     the type of the right-hand side of the expression, <code>null</code> for unary operators
     * @param operator  the name of the operator to look for
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:145
     */
    @ASTNodeAnnotation.Attribute
    public FType matchOverloadedOperatorType(FType right, String operator) {
        ASTNode$State state = state();
        try {
                InstClassDecl func = matchOverloadedOperator(right, operator);
                return (func == null) ? fUnknownType() : func.myOutputs().get(0).type();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedOperator(FType right, String operator) {
        ASTNode$State state = state();
        InstClassDecl matchOverloadedOperator_FType_String_value = matchOverloadedOperator(right, operator, true);

        return matchOverloadedOperator_FType_String_value;
    }
    /**
     * Calculate the function to use for an operator expression involving operator records.
     * 
     * Returns null if none or more than one function matches or expression does not include operator records.
     * 
     * @param other     the type of the other side of the expression, <code>null</code> for unary operators
     * @param operator  the name of the operator to look for
     * @param isLeft    <code>true</code> if this type was on the left hand side of the expression, 
     * must be <code>true</code> for unary operators
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:239
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedOperator(FType other, String operator, boolean isLeft) {
        ASTNode$State state = state();
        try {
                Collection<InstClassDecl> match = matchOverloadedOperators(other, operator, isLeft);
                return (match.size() == 1) ? match.iterator().next() : null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstClassDecl> matchOverloadedOperators(FType right, String operator) {
        ASTNode$State state = state();
        Collection<InstClassDecl> matchOverloadedOperators_FType_String_value = matchOverloadedOperators(right, operator, true);

        return matchOverloadedOperators_FType_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstClassDecl> matchOverloadedOperators(FType other, String operator, boolean isLeft) {
        ASTNode$State state = state();
        Collection<InstClassDecl> matchOverloadedOperators_FType_String_boolean_value = (other != null && other.isOperatorRecord()) ? 
                        other.matchOverloadedOperators(this, operator, !isLeft) : 
                        Collections.<InstClassDecl>emptyList();

        return matchOverloadedOperators_FType_String_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedConstructor(FType other) {
        ASTNode$State state = state();
        InstClassDecl matchOverloadedConstructor_FType_value = null;

        return matchOverloadedConstructor_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstClassDecl> matchOverloadedConstructors(FType other) {
        ASTNode$State state = state();
        Collection<InstClassDecl> matchOverloadedConstructors_FType_value = null;

        return matchOverloadedConstructors_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl matchOverloadedZero() {
        ASTNode$State state = state();
        InstClassDecl matchOverloadedZero_value = null;

        return matchOverloadedZero_value;
    }
    @ASTNodeAnnotation.Attribute
    public Map<String,InstClassDecl> getOperators() {
        ASTNode$State state = state();
        Map<String,InstClassDecl> getOperators_value = Collections.emptyMap();

        return getOperators_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = isReal() || isComposite();

        return shouldBeDifferentiated_value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:945
     */
    @ASTNodeAnnotation.Attribute
    public String arrayAccess(int nd, String name, String ind) {
        ASTNode$State state = state();
        try {
                return String.format("jmi_array_%s_%d(%s, %s)", isRecord() ? C_ARRAY_RECORD : C_ARRAY_REFERENCE, 
                        nd, name, ind);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String type_C() {
        ASTNode$State state = state();
        String type_C_value = isArray() ? arrayType_C() : scalarType_C();

        return type_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarType_C() {
        ASTNode$State state = state();
        String scalarType_C_value = nameScalar_C();

        return scalarType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String arrayType_C() {
        ASTNode$State state = state();
        String arrayType_C_value = nameArray_C() + "*";

        return arrayType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String typeExternal_C() {
        ASTNode$State state = state();
        String typeExternal_C_value = isArray() ? arrayExternalType_C() : scalarExternalType_C();

        return typeExternal_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarExternalType_C() {
        ASTNode$State state = state();
        String scalarExternalType_C_value = nameScalarExt_C();

        return scalarExternalType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String arrayExternalType_C() {
        ASTNode$State state = state();
        String arrayExternalType_C_value = nameArrayExt_C() + "*";

        return arrayExternalType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C(boolean external) {
        ASTNode$State state = state();
        String nameScalar_C_boolean_value = external ? nameScalarExt_C() : nameScalar_C();

        return nameScalar_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArray_C(boolean external) {
        ASTNode$State state = state();
        String nameArray_C_boolean_value = external ? nameArrayExt_C() : nameArray_C();

        return nameArray_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C() {
        ASTNode$State state = state();
        String nameScalar_C_value = "jmi_ad_var_t";

        return nameScalar_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArray_C() {
        ASTNode$State state = state();
        String nameArray_C_value = "jmi_array_t";

        return nameArray_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalarExt_C() {
        ASTNode$State state = state();
        String nameScalarExt_C_value = nameScalar_C();

        return nameScalarExt_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArrayExt_C() {
        ASTNode$State state = state();
        String nameArrayExt_C_value = nameArray_C();

        return nameArrayExt_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argType_C(boolean ref) {
        ASTNode$State state = state();
        String argType_C_boolean_value = argTypeBase_C() + (ref ? "*" : "");

        return argType_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argTypeBase_C() {
        ASTNode$State state = state();
        String argTypeBase_C_value = type_C();

        return argTypeBase_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroType() {
        ASTNode$State state = state();
        String macroType_value = macroTypeScalar() + (isArray() ? "_ARR" : "");

        return macroType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeScalar() {
        ASTNode$State state = state();
        String macroTypeScalar_value = "GEN";

        return macroTypeScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDecl(boolean external) {
        ASTNode$State state = state();
        String macroTypeDecl_boolean_value = external ? macroTypeDeclScalar() + "_EXT" : macroTypeDeclScalar();

        return macroTypeDecl_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDeclScalar() {
        ASTNode$State state = state();
        String macroTypeDeclScalar_value = "GEN";

        return macroTypeDeclScalar_value;
    }
    @ASTNodeAnnotation.Attribute
    public String enumNames_C() {
        ASTNode$State state = state();
        String enumNames_C_value = null;

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
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1095
     */
    @ASTNodeAnnotation.Attribute
    public int maxNumericStringLength_C(int precision) {
        ASTNode$State state = state();
        try {
                return 10 + precision;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String exportWrapperType_C() {
        ASTNode$State state = state();
        String exportWrapperType_C_value = "void";

        return exportWrapperType_C_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1567
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:31
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClass_String_value = getParent().Define_lookupInstClass(this, null, name);

        return lookupInstClass_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
