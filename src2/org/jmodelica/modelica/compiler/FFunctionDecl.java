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
 * A flattened user-defined function.
 * 
 * Results from a class with the restriction "function" and an algorithm block.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:52
 * @production FFunctionDecl : {@link BaseNode} ::= <span class="component">{@link FQName}</span> <span class="component">{@link FFunctionVariable}*</span> <span class="component">{@link FAlgorithm}</span> <span class="component">{@link FAttribute}*</span>;

 */
public class FFunctionDecl extends BaseNode implements Cloneable, FCallable {
    /**
     * Perform constant evaluation of functions.
     * 
     * @param values  constant values for the variables. 
     * Should be filled with the values of the inputs.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3472
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        FAlgorithm fab = getFAlgorithm();
        Map<CommonVariableDecl, CValue> oldVal = currentEvaluationValues;
        currentEvaluationValues = values;
        for (FFunctionVariable var : getFFunctionVariables())
            var.clearLocalCachedEvaluationValue();
        fab.prepareForFunctionEval();
        for (FFunctionVariable var : myNonInputs())
            var.prepareForFunctionEval();
        
        AlgorithmEvaluator algoEvaluator = evaluator.createAlgorithmEvaluator(values);
        try {
            ArrayList<FFunctionVariable> inputs = myInputs();
            ArrayList<FFunctionVariable> nonInputs = myNonInputs();
            
            for (FFunctionVariable var : inputs)
                var.readEvaluationValue(values);
            for (FFunctionVariable var : nonInputs)
                var.readEvaluationValue(values);
            
            if (oldVal == null || algoEvaluator.recursive(inputs, nonInputs)) {
                fab.getFStatements().evaluateList(algoEvaluator);
            }
        } catch (ConstantEvaluationException e) {
            algoEvaluator.failed(name(), myOutputs(), e);
        } finally {
            for (FFunctionVariable var : getFFunctionVariables())
                var.clearLocalCachedEvaluationValue();
            if (oldVal != null)
                for (CommonVariableDecl var : oldVal.keySet())
                    var.setLocalCachedEvaluationValue(oldVal.get(var));
            currentEvaluationValues = oldVal;
        }
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3511
     */
    private Map<CommonVariableDecl, CValue> currentEvaluationValues = null;
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:991
     */
    public FFunctionDecl(String name, List<FFunctionVariable> vars, FStatement ... statements) {
        this(new FQNameString(name), vars, new FAlgorithm(new List<FStatement>(statements)), new List<FAttribute>());
    }
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:110
     */
    private FlatVariableMap tempLookupMap = null;
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1798
     */
    private FlatVariableMap.NameIndexCache nameIndexCache = new FlatVariableMap.NameIndexCache();
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1808
     */
    public String nextTempVarName() {
         return nextGeneratedVarName(FlatVariableMap.GeneratedVarType.TEMP);
     }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1812
     */
    public String nextGeneratedVarName(FlatVariableMap.GeneratedVarType gvt) {
         return variablesMap().nextGeneratedVarName(nameIndexCache, gvt);
     }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1156
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
    	str.print(indent + "function " + name() + "\n");
    	getFFunctionVariables().prettyPrintWithIndent(p, str, p.indent(indent), ";");
    	p.print(getFAlgorithm(), str, indent);
        getFAttributeList().prettyPrintFAnnotationAttributeList(str, p, indent, ";\n");
    	str.print(indent + "end " + name() + ";\n\n");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:465
     */
    public void updateRecordArraySizes() {
        for (FFunctionVariable ffv : getFFunctionVariables())
            ffv.updateRecordArraySizes();
    }
    /**
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:398
     */
    private static boolean partitionArgumentsByOrder(boolean[] hasDerivative, int start, int max, int order, int[] result) {
	    int n = hasDerivative.length - start;
	    if (order <= 1) {
	        result[result.length - 1] = n;
	        return max == n;
	    }
	    int first = (n + order - 1) / order;
	    int nd = 0;
        for (int i = start; i < start + first - 1; i++)
            if (hasDerivative[i])
                nd++;
	    for (; first < max; first++) {
	        result[result.length - order] = first;
            if (hasDerivative[start + first - 1])
                nd++;
            if (nd * order >= n - first && partitionArgumentsByOrder(hasDerivative, start + first, nd, order - 1, result))
                return true;
	    }
	    return false;
	}
    /**
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:419
     */
    private boolean[] cachedShouldBeDifferentiated = null;
    /**
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:420
     */
    private AnnotationNode cachedShouldBeDifferentiatedFor = null;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1726
     */
    public void enableAliasRewrite() {
	}
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3876
     */
    
        public enum UseType{
            NONE(false, false),
            ALIAS_ATTRIBUTE_USE(false, false),
            ANNOTATION_DERIVATIVE(true, false),
            DIRECT(true, true);
            
            private final boolean normalUse;
            private final boolean derivativeUse;
            UseType(boolean normalUse, boolean derivativeUse) {
                this.normalUse = normalUse;
                this.derivativeUse = derivativeUse;
            }
            public boolean normalUse() {
                return normalUse;
            }
            public boolean derivativeUse() {
                return derivativeUse;
            }
            
            public UseType combine(UseType other) {
                return compareTo(other) > 0 ? this : other;
            }
        }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3901
     */
    private UseType functionUsed = UseType.NONE;
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3903
     */
    public void resetUsedIndicator() {
        functionUsed = UseType.NONE;
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3961
     */
    @Override
    public void markUsedFunctionsAndRecords(UseType type) {
        UseType oldType = functionUsed;
        functionUsed = functionUsed.combine(type);
        if (functionUsed != oldType) {
            if (functionUsed == UseType.DIRECT &&
               (myOptions().getBooleanOption("generate_block_jacobian") ||
                myOptions().getBooleanOption("generate_dae_jacobian") ||
                myOptions().getBooleanOption("generate_ode_jacobian"))) {
                if (requiresDerivative() && !canDifferentiate()) {
                    error("Unable to determine derivative function for function '" + name() + "'");
                } else if (derivativeFunctionUnrestricted() != null) {
                    derivativeFunctionUnrestricted().markUsedFunctionsAndRecords(UseType.ANNOTATION_DERIVATIVE);
                }
            }
            super.markUsedFunctionsAndRecords(functionUsed);
        }
    }
    /**
     * Describes the possible inputs from the user concerning if and how to inline the function.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:75
     */
    

        /**
         * Describes the possible inputs from the user concerning if and how to inline the function.
         */
        public enum InlineAnnotation { 
            DEFAULT     (true,  false, false), 
            NONE        (false, false, false), 
            INLINE      (true,  true,  false), 
            LATE        (true,  true,  true), 
            AFTER_INDEX (true,  true,  true);

            private boolean may;
            private boolean always;
            private boolean late;

            private InlineAnnotation(boolean may, boolean always, boolean late) {
                this.may = may;
                this.always = always;
                this.late = late;
            }

            /**
             * Check if the annotation says that we may try to inline the function.
             */
            public boolean may() {
                return may;
            }

            /**
             * Check if the annotation says that we should always try to inline the function.
             */
            public boolean always() {
                return always;
            }

            /**
             * Check if the annotation says that we should wait until after other symbolic transformations 
             * (especially index reduction) to inline.
             */
            public boolean late() {
                return late;
            }

        }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:117
     */
    private InlineAnnotation inlineAnnotationCache = null;
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:119
     */
    public InlineAnnotation inlineAnnotation() {
        if (inlineAnnotationCache != null)
            return inlineAnnotationCache;
        AnnotationNode inline = annotation().forPath("Inline");
        AnnotationNode late = annotation().forPath("LateInline");
        AnnotationNode index = annotation().forPath("InlineAfterIndexReduction");
        inlineAnnotationCache = InlineAnnotation.DEFAULT;
        if (late.isBoolValue())
            inlineAnnotationCache = late.bool() ? InlineAnnotation.LATE : InlineAnnotation.NONE;
        if (inline.isBoolValue() && !(late.isBoolValue() && late.bool()))
            inlineAnnotationCache =  inline.bool() ? InlineAnnotation.INLINE : InlineAnnotation.NONE;
        if (index.isBoolValue())
            inlineAnnotationCache = index.bool() ? InlineAnnotation.AFTER_INDEX : InlineAnnotation.NONE;
        return inlineAnnotationCache;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:135
     */
    public void copyInlineAnnotation(AnnotationNode src) {
        copyInlineAnnotation(src, "Inline");
        copyInlineAnnotation(src, "LateInline");
        copyInlineAnnotation(src, "InlineAfterIndexReduction");
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:141
     */
    private void copyInlineAnnotation(AnnotationNode src, String type) {
        src = src.forPath(type);
        if (src.exists() && src.isBoolValue())
            annotation().forPath(type).setValue(FBooleanLitExp.create(src.bool()));
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1032
     */
    private boolean containsExtObjArrays(ArrayList<FFunctionVariable> variables) {
        for (FFunctionVariable var : variables)
            if (var.getType().isExternalObjectArray())
                return true;
        return false;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1039
     */
    private boolean containsPartialFunction() {
        for (FFunctionVariable var : getFFunctionVariables())
            if (var.getType().isFunction())
                return true;
        return false;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1046
     */
    private boolean hasInlinableIO() {
        return !containsExtObjArrays(myInputs()) && !containsExtObjArrays(myOutputs())
                && !containsPartialFunction();
    }
    /**
     * Flags that this function is being inlined.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1259
     */
    private boolean duringInlining = false;
    /**
     * Inline a call to this function.
     * 
     * @param fi    the function inlining helper to use
     * @param args  the argument list for the function call
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1272
     */
    public void inline(AbstractFunctionInliner fi, List<FExp> args) {
        duringInlining = true;
        tempLookupMap = fi.startFunction(this);
        flushAllRecursive();
        
        int i = 0;
        ArrayList<FFunctionVariable> inp = myInputs();
        for (FFunctionVariable var : myInputs()) {
            FExp arg = args.getChild(i++);
            fi.setTypeOf(var.name(), arg.type());
            arg.addInliningVarsAndEqns(fi, var.name(), false);
            var.functionInliner = fi;
        }
        
        for (FFunctionVariable var : myNonInputs()) {
            FType t = var.getType().copyAndReplaceReferences(fi);
            t.setParent(var);
            fi.setTypeOf(var.name(), t);
            var.functionInliner = fi;
        }
        
        for (FStatement stmt : getFAlgorithm().getFStatements()) 
            stmt.inline(fi);
        
        for (FFunctionVariable var : getFFunctionVariables())
            var.functionInliner = null;
        
        tempLookupMap = null;
        duringInlining = false;
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:650
     */
    public void enableConstantFolding() {
        
    }
    /**
     * Scalarize the function, replacing all array assignments with separate scalar 
     * assignments and scalarize all expressions.
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:23
     */
    public void scalarize() {
        Map<String,FExp> emptyIndexMap = Collections.emptyMap();
        List<FStatement> stmts = new List<FStatement>();
        List<FAttribute> attrs = new List<FAttribute>();
        FStatement.scalarizeStmtList(Scalarizer.function(getFFunctionVariables(), stmts), getFAlgorithm().getFStatements());
        setFAlgorithm(new FAlgorithm(stmts));
        clearScalarized();  // Functions need scalarized = false in FQNames
        flushAllRecursive();
    }
    /**
     * @aspect SmoothOrder
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:805
     */
    public void smoothOrder(int order) {
        AnnotationNode node = annotation().forPath("smoothOrder");
        if (node.exists() || order != SMOOTH_ORDER_ANNOTATION_DEFAULT)
            // We only wan't to set this attribute if it is already set or order is non equal to default.
            annotation().forPath("smoothOrder").setValue(new FIntegerLitExp(order));
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:836
     */
    public FFunctionDecl createAndAddDerivativeFunction(AnnotationNode derNode) {
        FQName name = getFQName().createDerPrefixedName(1);
        derNode.setValue(name.createFIdUseExp());
        derNode.forPath("order").setValue(new FIntegerLitExp(order() + 1));
        
        Collection<FFunctionVariable> inputs = new ArrayList<FFunctionVariable>();
        Collection<FFunctionVariable> derivatedInputs = new ArrayList<FFunctionVariable>();
        Collection<FFunctionVariable> outputs = new ArrayList<FFunctionVariable>();
        Collection<FFunctionVariable> others = new ArrayList<FFunctionVariable>();
        for (FFunctionVariable ffv : getFFunctionVariables()) {
            FFunctionVariable ffvCopy = ffv.fullCopy();
            if (ffv.isInput()) {
                inputs.add(ffvCopy);
                if (ffv.order() == order() && ffv.shouldBeDifferentiated(derNode))
                    derivatedInputs.add(ffv.createDerivative());
            } else if (ffv.isOutput()) {
                ffvCopy.setFTypePrefixInputOutputOpt(new Opt<FTypePrefixInputOutput>());
                others.add(ffvCopy);
                if (ffv.order() == order() && ffv.shouldBeDifferentiated(derNode))
                    outputs.add(ffv.createDerivative());
            } else {
                others.add(ffvCopy);
                if (ffv.order() == order() && ffv.shouldBeDifferentiated(derNode))
                    others.add(ffv.createDerivative());
            }
        }
        List<FFunctionVariable> variables = new List<FFunctionVariable>();
        variables.addAll(inputs);
        variables.addAll(derivatedInputs);
        variables.addAll(outputs);
        variables.addAll(others);

        FFunctionDecl function = new FFunctionDecl(name, variables, new FAlgorithm(), new List<FAttribute>());
        function.smoothOrder(Math.max(smoothOrder() - 1, 0));
        myFClass().addFFunctionDecl(function);
        function.setFAlgorithm(getFAlgorithm().diff());
        
        return function;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:41
     */
    public void sortBindingAssignments() {
        Map<String,FStatement> map = new LinkedHashMap<String,FStatement>();
        for (FStatement stmt : getFAlgorithm().getFStatements())
            stmt.addToSortingMap(map);
        
        List<FStatement> stmts = new List<FStatement>();
        while (!map.isEmpty()) 
            map.values().iterator().next().addSortedByAssignmentOrder(stmts, map);
        
        for (FStatement stmt : getFAlgorithm().getFStatements())
            if (!stmt.shouldBeSorted)
                stmts.add(stmt);
        getFAlgorithm().setFStatementList(stmts);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:259
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		open_XML(str, indent);
		enclose_XML(p, str, indent2, "Name", getFQName());
		p.print(myOutputs(), str, indent2);
		p.print(myInputs(), str, indent2);
		p.print(myProtected(), str, indent2);
		p.print(getFAlgorithm(), str, indent2);
		close_XML(str, indent);
    }
    /**
     * Used to declare function headers. 
     * 
     * @param indent  used to get a consistently formated c-code
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2153
     */
    public void genHeader_CAD(CodeStream str, String indent) {
        if (!shouldPrintFuncDecl_CAD())
            return;
        prettyPrintHead_CAD(printer_CAD, str, indent, "void", "der_AD", true);
        str.print(";\n");
    }
    /**
     * Functions in Modelica may have derivative annotations associated with them. 
     * When printing the body of a function a check is made to see if it has a derivative
     * annotation, if so this function is called that assigns the variables of the function
     * by calling its non-AD counterpart and its derivatives by calling its derivative annotation. 
     * Only variables of type real can be filled by the derivative function, if they are not of 
     * type real they are omitted in the printed call.
     * 
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2170
     */
    public void genFuncAnnotation_CAD(CodePrinter p, CodeStream str, String indent){
        for (FFunctionVariable ffv : myOutputs())
            ffv.genVarDecls_CAD(p, str, indent);
        str.print(indent);
        str.print("/*Using specified derivative annotation instead of AD*/\n");
        
        genNonADFunctionCall_CAD(p, str, indent);
        
        // Print the call to the specified derivative function
        AnnotationNode derNode = derivativeAnnotationUnrestricted();
        str.print(indent);
        str.print(derivativeFunction(derNode).funcNameUnderscore("def") + "(");
        String sep = "";
        for (FFunctionVariable ffv : myInputs()){
            str.print(sep);
            sep = ", ";
            if (ffv.shouldBeDifferentiated(derNode)) {
                str.print(ffv.varName_CAD());
            } else {
                str.print(ffv.name_C());
            }
        }
        for (FFunctionVariable ffv : myInputs()){
            if (ffv.shouldBeDifferentiated(derNode)){
                str.print(sep);
                sep = ", ";
                str.print(ffv.derName_CAD());
            }
        }
        for (FFunctionVariable ffv : myOutputs()){
            if (ffv.shouldBeDifferentiated(derNode)) {
                str.print(sep);
                sep = ", ";
                if (!ffv.isComposite()) {
                    str.print("&");
                }
                str.print(ffv.derName_CAD());
            }
        }
        str.print(");\n");
    }
    /**
     * Function for generating a dummy function that only calls the normal function and also
     * set output derivatives to zero. 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2216
     */
    public void genZeroDerivativeFunction_CAD(CodePrinter p, CodeStream str, String indent) {
        for (FFunctionVariable ffv : myOutputs())
            ffv.genVarDecls_CAD(p, str, indent);
        str.print(indent);
        str.print("/*Zero derivative function*/\n");
        
        genNonADFunctionCall_CAD(p, str, indent);
        
        AnnotationNode derNode = derivativeAnnotationUnrestricted();
        for (FFunctionVariable ffv : myOutputs())
            if(ffv.shouldBeDifferentiated(derNode))
                str.format("%s%s = 0;\n", indent, ffv.derName_CAD());
    }
    /**
     * Generates a function call to the non AD function.
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2233
     */
    public void genNonADFunctionCall_CAD(CodePrinter p, CodeStream str, String indent) {
        str.print(indent);
        str.print(funcNameUnderscore("def") + "(");
        String sep = "";
        AnnotationNode derNode = derivativeAnnotationUnrestricted();
        for (FFunctionVariable ffv : myInputs()){
            str.print(sep);
            sep = ", ";
            if (ffv.shouldBeDifferentiated(derNode)) {
                str.print(ffv.varName_CAD());
            } else {
                str.print(ffv.name_C());
            }
        }
        for (FFunctionVariable ffv : myOutputs()){
            str.print(sep);
            sep = ", ";
            if (!ffv.isComposite()) {
                str.print("&");
            }
            if (ffv.shouldBeDifferentiated(derNode)) {
                str.print(ffv.varName_CAD());
            } else {
                str.print(ffv.name_C());
            }
        }
        str.print(");\n");
    }
    /**
     * Prints a function, the header and body. A check is made whether the function
     * has a derivative annotation, if so the body of the function is printed in a 
     * special way. 
     * Since the function may have NULL inputs a check is made at the end of the function,
     * if some of the inputs that are to be filled by the function are NULL they are 
     * not updated. 
     * 
     * @param p            use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str          the c-code is written to this stream 
     * @param outerIndent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2276
     */
    @Override
    public void prettyPrint_CAD(CodePrinter p, CodeStream str, String outerIndent) {
        if (!shouldPrintFuncDecl_CAD())
            return;
        String indent = p.indent(outerIndent);
        // Print definition
        prettyPrintHead_CAD(p, str, outerIndent, "void", "der_AD", true);
        str.print(" {\n");
        str.print(indent + "JMI_DYNAMIC_INIT()\n");
        if (derivativeFunctionUnrestricted() != null){
            genFuncAnnotation_CAD(p, str, indent);
            genReturnStmt_CAD(p, str, indent);
        } else if (derivativeEqualsZero()){
            genZeroDerivativeFunction_CAD(p, str, indent);
            genReturnStmt_CAD(p, str, indent);
        } else {
            genVarDecls_CAD(p, str, indent);
            for (FFunctionVariable ffv : myNonInputs()) {
                if (!ffv.isArray()) {
                    p.print(ffv, str, indent);
                }
            }
            p.print(getFAlgorithm(), str, indent);
        }
        str.print(outerIndent + "}\n\n");
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2303
     */
    public void genReturnStmt_CAD(CodePrinter p, CodeStream str, String indent) {
		returnDefinition().printReturnWrite_CAD(str, indent);
		str.print(indent + "JMI_DYNAMIC_FREE()\n");
		str.print(indent + "return;\n");
	}
    /**
     * Generates the header for this function declaration in this way:
     * type functionname_suffix(inputs, (returnArgs? outputs:""))
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream 
     * @param indent  used to get a consistently formated c-code
     * @param type  the functions return type
     * @param suffix  typically der_AD for AD functions
     * @param returnArgs  specifies whether return arguments should be printed or not
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2385
     */
    private void prettyPrintHead_CAD(CodePrinter p, CodeStream str, String indent, 
            String type, String suffix, boolean returnArgs) {
        str.print(indent);
        str.print(type);
        str.print(" ");
        str.print(funcNameUnderscore(suffix));
        str.print("(");
        String sep = "";
        AnnotationNode derNode = derivativeAnnotationUnrestricted();
        for (FFunctionVariable v : myInputs()) {
            str.print(sep);
            if (v.shouldBeDifferentiated(derNode)) {
                v.printArgument_var_CAD(str);
            } else {
                v.printArgument_C(str);
            }
            sep = ", ";
        }
        for (FFunctionVariable v : myInputs()) {
            if (v.shouldBeDifferentiated(derNode)){
                str.print(sep);
                v.printArgument_der_CAD(str);
            }
        }
        if (returnArgs) {
            for (FFunctionVariable v : myOutputs()) {
                str.print(sep);
                if (v.shouldBeDifferentiated(derNode)) {
                    v.printReturnArgument_var_CAD(str);
                } else {
                    v.printReturnArgument_C(str);
                }
                sep = ", ";
            }
        }
        if (returnArgs) {
            for (FFunctionVariable v : myOutputs()) {
                if (v.shouldBeDifferentiated(derNode)) {
                    str.print(sep);
                    v.printReturnArgument_der_CAD(str);
                    sep = ", ";
                }
            }
        }
        str.print(")");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:369
     */
    @Override
    public void prettyPrintCall_C(CodePrinter p, CodeStream str, String indent, FFunctionCall call) {
        boolean exp = call.functionCallIsExp();
        if (!exp)
            str.print(indent);
        str.print(funcNameUnderscore(exp ? C_SUFFIX_EXP : C_SUFFIX_DEF));
        str.print("(");
        String sep = "";
        for (FExp arg : call.getArgs()) {
            str.print(sep);
            arg.genArgument_C(p, str, indent);
            sep = ", ";
        }
        if (!exp) {
            call.prettyPrintCallOutputs_C(p, str, indent, myOutputs().size(), sep);
        }
        str.print(")");
        if (!exp)
            str.print(";\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:510
     */
    private void prettyPrintHead_C(CodePrinter p, CodeStream str, String indent, 
			String type, String suffix, boolean returnArgs) {
		str.print(indent);
		str.print(type);
		str.print(" ");
		str.print(funcNameUnderscore(suffix));
		str.print("(");
		String sep = "";
		for (FFunctionVariable v : myInputs()) {
			str.print(sep);
			v.printArgument_C(str);
			sep = ", ";
		}
		if (returnArgs) {
			for (FFunctionVariable v : myOutputs()) {
				str.print(sep);
				v.printReturnArgument_C(str);
				sep = ", ";
			}
		}
		str.print(")");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:533
     */
    private void prettyPrintWrappedCall_C(CodeStream str, String indent) {
		if (!shouldPrintFuncDecl_C())
			return;
		str.print(indent);
		str.print(funcNameUnderscore(C_SUFFIX_DEF));
		str.print("(");
		String sep = "";
		for (FFunctionVariable v : myInputs()) {
			str.print(sep);
			str.print(v.name_C());
			sep = ", ";
		}
		if (myOutputs().size() > 0) {
			str.print(sep);
			str.print("&");
			str.print(myOutputs().get(0).name_C());
			for (int i = myOutputs().size() - 1; i > 0; i--)
				str.print(", NULL");
		}
		str.print(");\n");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:555
     */
    public void genHeader_C(CodeStream str, String indent) {
		if (!shouldPrintFuncDecl_C())
			return;
		prettyPrintHead_C(printer_C, str, indent, "void", C_SUFFIX_DEF, true);
		str.print(";\n");
    	if (generateExpFunction()) {
    		String type = returnDefinition().getDeclaredType_C();
			prettyPrintHead_C(printer_C, str, indent, type, C_SUFFIX_EXP, false);
			str.print(";\n");
    	}
	}
    /**
     * \brief Generates forward declarations for FPCL and FPCR functions used
     * by partial function calls.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:571
     */
    public void genHeadersPartial_C(CodeStream str, String indent) {
        prettyPrintHeadFPCL_C(str, indent);
        str.println(";");
        prettyPrintHeadFPCR_C(str, indent);
        str.println(";");
    }
    /**
     * \brief Generates FP and OUT structs used by partial function calls.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:581
     */
    public void genStructsPartial_C(CodeStream str, String indent) {
        CodePrinter p = ASTNode.printer_C;
        String fp  = funcNameUnderscore(C_SUFFIX_FP);
        String out = funcNameUnderscore(C_SUFFIX_FPOUT);
        String next = p.indent(indent);
        
        beginStruct_C(str, indent, out);
        str.formatln("%sint n;", next);
        for (FFunctionVariable ffv : myOutputs()) {
            str.formatln("%s%s %s;", next, ffv.type().type_C(), ffv.name_C());
        }
        endStruct_C(str, indent);
        
        beginStruct_C(str, indent, fp);
        str.formatln("%s%s (*fpcl)(%s*, %s*, ...);", next, returnDefinition().getDeclaredType_C(), fp, out);
        str.formatln("%s%s* (*fpcr)(%s*, %s*, ...);", next, fp, fp, fp);
        for (FFunctionVariable ffv : myInputs()) {
            String name = ffv.name_C();
            str.formatln("%s%s %s;", next, ffv.type().type_C(), name);
            str.formatln("%sint %s_s;", next, name);
        }
        endStruct_C(str, indent);
    }
    /**
     * \brief Generate first line of struct declaration name_ with typedef to name
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:608
     */
    public static void beginStruct_C(CodeStream str, String indent, String name) {
        str.formatln("%stypedef struct %s_ %s;", indent, name, name);
        str.formatln("%sstruct %s_ {", indent, name);
    }
    /**
     * \brief Generate last line of struct declaration
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:616
     */
    public static void endStruct_C(CodeStream str, String indent) {
        str.formatln("%s};", indent);
    }
    /**
     * \brief Generate declaration for varargs
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:623
     */
    public void genVarArgsDecl(CodeStream str, String indent) {
        str.print(indent);
        str.println("va_list argp;");
    }
    /**
     * \brief Generate initialization for varargs
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:631
     */
    public void genVarArgsOpen(CodeStream str, String indent, String last) {
        str.print(indent);
        str.print("va_start(argp, ");
        str.print(last);
        str.println(");");
    }
    /**
     * \brief Generate use for varargs
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:641
     */
    public void genVarArgsRead(CodeStream str, String indent, String dest, String type) {
        str.print(indent);
        str.print(dest);
        str.print(" = ");
        genVarArgsRead(str, type);
        str.println(";");
    }
    /**
     * \brief Generate use for varargs
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:652
     */
    public void genVarArgsRead(CodeStream str, String type) {
        str.print("va_arg(argp, ");
        str.print(type);
        str.print(")");
    }
    /**
     * \brief Generate closing for varargs
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:661
     */
    public void genVarArgsClose(CodeStream str, String indent) {
        str.print(indent);
        str.println("va_end(argp);");
    }
    /**
     * \brief Generate header for FPCL function.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:669
     */
    public void prettyPrintHeadFPCL_C(CodeStream str, String indent) {
        str.format("%s%s %s(%s* fp_in, %s* out, ...)", indent, returnDefinition().getDeclaredType_C(), funcNameUnderscore(C_SUFFIX_FPCL), funcNameUnderscore(C_SUFFIX_FP), funcNameUnderscore(C_SUFFIX_FPOUT));
    }
    /**
     * \brief Generate header for FPCR function.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:676
     */
    public void prettyPrintHeadFPCR_C(CodeStream str, String indent) {
        String fp = funcNameUnderscore(C_SUFFIX_FP);
        str.format("%s%s* %s(%s* fp_in, %s* fp_out, ...)", indent, fp, funcNameUnderscore(C_SUFFIX_FPCR), fp, fp);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:686
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		if (!shouldPrintFuncDecl_C())
			return;
		String next = p.indent(indent);
		// Print definition
		prettyPrintHead_C(p, str, indent, "void", C_SUFFIX_DEF, true);
		str.print(" {\n");
		// TODO: Check if there are any dynamic declarations first
		str.print(next + "JMI_DYNAMIC_INIT()\n");
		genVarDecls_C(p, str, p.indent(indent));
        for (FFunctionVariable ffv : myNonInputs()) {
            if (!ffv.isArray()) {
                p.print(ffv, str, next);
            }
        }
    	p.print(getFAlgorithm(), str, next);
    	str.print(indent);
    	str.print("}\n\n");
    	
    	// Print wrapper for expressions
    	if (generateExpFunction()) {
	    	String type = returnDefinition().getDeclaredType_C();
			prettyPrintHead_C(p, str, indent, type, C_SUFFIX_EXP, false);
			str.print(" {\n");
			returnDefinition().printDeclarationForExp_C(p, str, next);
			prettyPrintWrappedCall_C(str, next);
			returnDefinition().printReturnForExp_C(str, next);
	    	str.print(indent);
	    	str.print("}\n\n");
    	}
	}
    /**
     * \brief Generates FPCL and FPCR functions used by partial function calls.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:722
     */
    public void prettyPrintPartial_C(CodeStream str, String indent) {
        int i;
        CodePrinter p = ASTNode.printer_C;
        String next = p.indent(indent);
        String next2 = p.indent(next);
        String next3 = p.indent(next2);
        String fp = funcNameUnderscore(C_SUFFIX_FP);
        ArrayList<FFunctionVariable> inputs  = myInputs();
        ArrayList<FFunctionVariable> outputs = myOutputs();
        int n = inputs.size() + outputs.size();
        String[] names = new String[n];
        for (i = 0; i < n; i++) {
            names[i] = "tmp_" + (i+1); 
        }
        
        // FPCL
        prettyPrintHeadFPCL_C(str, indent);
        str.print(" {\n");
        
        i = 0;
        for (FFunctionVariable ffv : inputs) {
            str.formatln("%s%s %s;", next, ffv.type_C(), names[i++]);
        }
        for (FFunctionVariable ffv : outputs) {
            str.formatln("%s%s %s;", next, ffv.type_C(), names[i++]);
        }
        
        genVarArgsDecl(str, next);
        genVarArgsOpen(str, next, "out");
        i = 0;
        for (FFunctionVariable ffv : inputs) {
              str.formatln("%sif (fp_in->%s_s) {", next, ffv.name_C());
              str.formatln("%s%s = fp_in->%s;", next2, names[i], ffv.name_C());
              str.formatln("%s} else {", next);
              genVarArgsRead(str, next2, names[i], ffv.type_C());
              str.formatln("%s}", next);
              i++;
        }
        genVarArgsClose(str, next);
        
        str.format("%s%s(", next, funcNameUnderscore("def"));
        String prefix = "";
        i = 0;
        for (FFunctionVariable ffv : inputs) {
            str.print(prefix);
            str.print(names[i++]);
            prefix = ", ";
        }
        for (FFunctionVariable ffv : outputs) {
            str.print(prefix);
            str.print("&");
            str.print(names[i++]);
        }
        str.println(");");
        
        str.formatln("%sif (out != NULL) {",next);
        i = 0;
        for (FFunctionVariable ffv : outputs) {
              str.formatln("%sif (out->n > %d) {", next2, i);
              str.formatln("%sout->%s = %s;", next3, ffv.name_C(), names[i + inputs.size()]);
              str.formatln("%s}", next2);
              i++;
        }
        str.formatln("%s}",next);
        if (outputs.size() > 0)
            str.formatln("%sreturn %s;", next, names[inputs.size()]);
        str.format("%s}\n\n", indent);
        
        
        // FPCR
        prettyPrintHeadFPCR_C(str, indent);
        str.print(" {\n");
        genVarArgsDecl(str, next);
        str.formatln("%sif (fp_out == NULL) {", next);
        str.formatln("%sfp_out = malloc(sizeof(%s));", next2, fp);
        str.formatln("%s}", next);
        
        str.formatln("%sfp_out->fpcl = &%s;", next, funcNameUnderscore(C_SUFFIX_FPCL));
        str.formatln("%sfp_out->fpcr = &%s;", next, funcNameUnderscore(C_SUFFIX_FPCR));
        
        str.formatln("%sif (fp_in == NULL) {", next);
        for (FFunctionVariable ffv : inputs) {
            str.formatln("%sfp_out->%s_s = 0;", next2, ffv.name_C());
        }
        str.formatln("%s} else {", next);
        for (FFunctionVariable ffv : inputs) {
            String name = ffv.name_C();
            str.formatln("%sfp_out->%s_s = fp_in->%s_s;", next2, name, name);
            str.formatln("%sfp_out->%s = fp_in->%s;", next2, name, name);
        }
        str.formatln("%s}", next);
        
        genVarArgsOpen(str, next, "fp_out");
        for (FFunctionVariable ffv : inputs) {
            String name = ffv.name_C();
            str.format("%sif (!fp_out->%s_s && ", next, name);
            genVarArgsRead(str, "int");
            str.println(") {");
            str.formatln("%sfp_out->%s_s = 1;", next2, name);
            genVarArgsRead(str, next2, "fp_out->" + name, ffv.type_C());
            str.formatln("%s}", next);
        }
        genVarArgsClose(str, next);
        
        str.formatln("%sreturn fp_out;", next);
        str.format("%s}\n\n", indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2319
     */
    private CodeGenContext codeGenContext = new CodeGenContext();
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:71
     */
    public void exportWrapper_C(CodeStream str, String indent) {
		// TODO: handle multiple outputs/array output

		// Function header
		str.format("%sDllExport %s %s(", indent, exportWrapperType_C(), funcNameExportWrapper());
		exportWrapperArgumentDecl_C(str);
		str.print(") {\n");
		
		// Function body
		// TODO: add conversions from/to our internal representations, where needed
		String bodyInd = printer_C.indent(indent);
		FFunctionVariable out = myOutputs().get(0);
		// - Declare return var
		str.print(bodyInd);
		out.exportWrapperDecl_C(str);
		str.print(";\n");
		// - Declare temporary vars
		for (FFunctionVariable var : myInputs()) 
			var.exportWrapperDeclareTemp_C(str, bodyInd);
		// - Initialize temporary vars
		for (FFunctionVariable var : myInputs()) 
			var.exportWrapperInitTemp_C(str, bodyInd);
		// - Call function
		str.format("%s%s(", bodyInd, funcNameUnderscore(C_SUFFIX_DEF));
		for (FFunctionVariable var : myInputs()) 
			str.format("%s, ", var.name_C());
		str.format("&%s);\n", out.name_C());
		// - Return value
		str.format("%sreturn %s;\n", bodyInd, out.name_C());
		
		str.format("%s}\n\n", indent);
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:104
     */
    public void exportWrapperArgumentDecl_C(CodeStream str) {
		// TODO: handle multiple outputs/array output
		String sep = "";
		for (FFunctionVariable var : myInputs()) {
			str.print(sep);
			var.exportWrapperDecl_C(str);
			sep = ", ";
		}
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:114
     */
    public void exportWrapperArgumentTypeDecl_C(CodeStream str) {
		// TODO: handle multiple outputs/array output
		String sep = "";
		for (FFunctionVariable var : myInputs()) {
			str.print(sep);
			var.exportWrapperTypeDecl_C(str);
			sep = ", ";
		}
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:124
     */
    public void exportWrapperArgumentCall_C(CodeStream str) {
		// TODO: handle multiple outputs/array output
		String sep = "";
		for (FFunctionVariable var : myInputs()) {
			str.print(sep);
			var.exportWrapperCall_C(str);
			sep = ", ";
		}
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:211
     */
    public static final Comparator<FFunctionDecl> UNAME_COMPARATOR = 
		new Comparator<FFunctionDecl>() {
		 public int compare(FFunctionDecl f1, FFunctionDecl f2) {
			 return f1.getFQName().nameUnderscore().compareTo(f2.getFQName().nameUnderscore());
		 }
		 
		 public boolean equals(Object obj) {
			 return obj == this;
		 }
	};
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionDecl() {
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
        setChild(new List(), 3);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FFunctionDecl(FQName p0, List<FFunctionVariable> p1, FAlgorithm p2, List<FAttribute> p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 4;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        variablesMap_reset();
        myInputs_reset();
        myProtected_reset();
        myNonInputs_reset();
        myOutputs_reset();
        returnDefinition_reset();
        signatureString_reset();
        isInlinable_boolean_FFunctionCall_reset();
        isTrivialInlinable_boolean_FFunctionCall_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        collect_contributors_FFunctionVariable_assigningUses = false;
        collect_contributors_FStatement_sizeAssertsColl = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:59
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FFunctionDecl clone() throws CloneNotSupportedException {
        FFunctionDecl node = (FFunctionDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public FFunctionDecl copy() {
        try {
            FFunctionDecl node = (FFunctionDecl) clone();
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
     * @declaredat ASTNode:91
     */
    public FFunctionDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:100
     */
    public FFunctionDecl treeCopyNoTransform() {
        FFunctionDecl tree = (FFunctionDecl) copy();
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
     * @declaredat ASTNode:120
     */
    public FFunctionDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:127
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(0);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(0);
    }
    /**
     * Replaces the FFunctionVariable list.
     * @param list The new list node to be used as the FFunctionVariable list.
     * @apilevel high-level
     */
    public void setFFunctionVariableList(List<FFunctionVariable> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FFunctionVariable list.
     * @return Number of children in the FFunctionVariable list.
     * @apilevel high-level
     */
    public int getNumFFunctionVariable() {
        return getFFunctionVariableList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FFunctionVariable list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FFunctionVariable list.
     * @apilevel low-level
     */
    public int getNumFFunctionVariableNoTransform() {
        return getFFunctionVariableListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FFunctionVariable list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FFunctionVariable list.
     * @apilevel high-level
     */
    public FFunctionVariable getFFunctionVariable(int i) {
        return (FFunctionVariable) getFFunctionVariableList().getChild(i);
    }
    /**
     * Check whether the FFunctionVariable list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFFunctionVariable() {
        return getFFunctionVariableList().getNumChild() != 0;
    }
    /**
     * Append an element to the FFunctionVariable list.
     * @param node The element to append to the FFunctionVariable list.
     * @apilevel high-level
     */
    public void addFFunctionVariable(FFunctionVariable node) {
        List<FFunctionVariable> list = (parent == null || state == null) ? getFFunctionVariableListNoTransform() : getFFunctionVariableList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFFunctionVariableNoTransform(FFunctionVariable node) {
        List<FFunctionVariable> list = getFFunctionVariableListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FFunctionVariable list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFFunctionVariable(FFunctionVariable node, int i) {
        List<FFunctionVariable> list = getFFunctionVariableList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FFunctionVariable list.
     * @return The node representing the FFunctionVariable list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FFunctionVariable")
    public List<FFunctionVariable> getFFunctionVariableList() {
        List<FFunctionVariable> list = (List<FFunctionVariable>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FFunctionVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FFunctionVariable list.
     * @apilevel low-level
     */
    public List<FFunctionVariable> getFFunctionVariableListNoTransform() {
        return (List<FFunctionVariable>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FFunctionVariable list.
     * @return The node representing the FFunctionVariable list.
     * @apilevel high-level
     */
    public List<FFunctionVariable> getFFunctionVariables() {
        return getFFunctionVariableList();
    }
    /**
     * Retrieves the FFunctionVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FFunctionVariable list.
     * @apilevel low-level
     */
    public List<FFunctionVariable> getFFunctionVariablesNoTransform() {
        return getFFunctionVariableListNoTransform();
    }
    /**
     * Replaces the FAlgorithm child.
     * @param node The new node to replace the FAlgorithm child.
     * @apilevel high-level
     */
    public void setFAlgorithm(FAlgorithm node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the FAlgorithm child.
     * @return The current node used as the FAlgorithm child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FAlgorithm")
    public FAlgorithm getFAlgorithm() {
        return (FAlgorithm) getChild(2);
    }
    /**
     * Retrieves the FAlgorithm child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FAlgorithm child.
     * @apilevel low-level
     */
    public FAlgorithm getFAlgorithmNoTransform() {
        return (FAlgorithm) getChildNoTransform(2);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 3);
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * @return Number of children in the FAttribute list.
     * @apilevel high-level
     */
    public int getNumFAttribute() {
        return getFAttributeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAttribute list.
     * @apilevel low-level
     */
    public int getNumFAttributeNoTransform() {
        return getFAttributeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAttribute list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAttribute list.
     * @apilevel high-level
     */
    public FAttribute getFAttribute(int i) {
        return (FAttribute) getFAttributeList().getChild(i);
    }
    /**
     * Check whether the FAttribute list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAttribute() {
        return getFAttributeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAttribute list.
     * @param node The element to append to the FAttribute list.
     * @apilevel high-level
     */
    public void addFAttribute(FAttribute node) {
        List<FAttribute> list = (parent == null || state == null) ? getFAttributeListNoTransform() : getFAttributeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAttributeNoTransform(FAttribute node) {
        List<FAttribute> list = getFAttributeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAttribute list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAttribute(FAttribute node, int i) {
        List<FAttribute> list = getFAttributeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAttribute")
    public List<FAttribute> getFAttributeList() {
        List<FAttribute> list = (List<FAttribute>) getChild(3);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributeListNoTransform() {
        return (List<FAttribute>) getChildNoTransform(3);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    public List<FAttribute> getFAttributes() {
        return getFAttributeList();
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributesNoTransform() {
        return getFAttributeListNoTransform();
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2858
     */
        private boolean collect_contributors_FFunctionVariable_assigningUses = false;
    protected void collect_contributors_FFunctionVariable_assigningUses() {
        if(collect_contributors_FFunctionVariable_assigningUses) return;
        super.collect_contributors_FFunctionVariable_assigningUses();
        collect_contributors_FFunctionVariable_assigningUses = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:38
     */
        private boolean collect_contributors_FStatement_sizeAssertsColl = false;
    protected void collect_contributors_FStatement_sizeAssertsColl() {
        if(collect_contributors_FStatement_sizeAssertsColl) return;
        super.collect_contributors_FStatement_sizeAssertsColl();
        collect_contributors_FStatement_sizeAssertsColl = true;
    }

    @ASTNodeAnnotation.Attribute
    public CValue evaluatePartial(Map<CommonVariableDecl, CValue> values) {
        ASTNode$State state = state();
        CValue evaluatePartial_Map_CommonVariableDecl__CValue__value = CValuePartialFunction.create(this, values);

        return evaluatePartial_Map_CommonVariableDecl__CValue__value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findAttribute(String name) {
        ASTNode$State state = state();
        FAttribute findAttribute_String_value = findMatching(getFAttributes(), name);

        return findAttribute_String_value;
    }
    /**
     * Generic lookup function. Can findBasePackage normal variables, records and record members.
     * @attribute syn
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:91
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        try {
        		FAbstractVariable res = (tempLookupMap == null) ? null : tempLookupMap.lookup(fqn);
        		if (res == null)
        			res = variablesMap().lookup(fqn);
        		return nullUnknown(res);
        	}
        finally {
        }
    }
    /**
     * Lookup function for finding the outermost record variable. 
     * 
     * Can also findBasePackage normal variables.
     * @attribute syn
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:103
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupOutermostFV(FQName fqn) {
        ASTNode$State state = state();
        try {
        		FAbstractVariable res = (tempLookupMap == null) ? null : tempLookupMap.lookupOutermost(fqn);
        		if (res == null)
        			res = variablesMap().lookupOutermost(fqn);
        		return nullUnknown(res);
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean variablesMap_computed = false;
    /**
     * @apilevel internal
     */
    protected FlatVariableMap variablesMap_value;
    /**
     * @apilevel internal
     */
    private void variablesMap_reset() {
        variablesMap_computed = false;
        variablesMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FlatVariableMap variablesMap() {
        if(variablesMap_computed) {
            return variablesMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        variablesMap_value = variablesMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            variablesMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return variablesMap_value;
    }
    /**
     * @apilevel internal
     */
    private FlatVariableMap variablesMap_compute() {
    		FlatVariableMap map = new FlatVariableMap();
    		map.addVariables(getFFunctionVariables());
    		return map;
    	}
    /**
     * @attribute syn
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:546
     */
    @ASTNodeAnnotation.Attribute
    public FCallable lookupFunc(String name) {
        ASTNode$State state = state();
        try {
                for (FFunctionVariable ffv : getFFunctionVariables())
                    if (ffv.name().equals(name) && ffv.type().isFunction())
                        return ffv;
                return lookupFCallable(name);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFQNameNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameUnderscore(String suffix) {
        ASTNode$State state = state();
        String funcNameUnderscore_String_value = getFQName().funcNameUnderscore(suffix) + functionIndex();

        return funcNameUnderscore_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl asFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl asFFunctionDecl_value = this;

        return asFFunctionDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl actualFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl actualFFunctionDecl_value = this;

        return actualFFunctionDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunction() {
        ASTNode$State state = state();
        boolean isPartialFunction_value = false;

        return isPartialFunction_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FFunctionVariable> myInputs_value;
    /**
     * @apilevel internal
     */
    private void myInputs_reset() {
        myInputs_computed = false;
        myInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myInputs() {
        if(myInputs_computed) {
            return myInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInputs_value = myInputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FFunctionVariable> myInputs_compute() {
             ArrayList<FFunctionVariable> l = new ArrayList<FFunctionVariable>();
             for (FFunctionVariable var : getFFunctionVariables())
                 if (var.isInput())
                     l.add(var);
             return l;
         }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable myInput(int i) {
        ASTNode$State state = state();
        FFunctionVariable myInput_int_value = myInputs().get(i);

        return myInput_int_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myProtected_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FFunctionVariable> myProtected_value;
    /**
     * @apilevel internal
     */
    private void myProtected_reset() {
        myProtected_computed = false;
        myProtected_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myProtected() {
        if(myProtected_computed) {
            return myProtected_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myProtected_value = myProtected_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myProtected_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myProtected_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FFunctionVariable> myProtected_compute() {
             ArrayList<FFunctionVariable> l = new ArrayList<FFunctionVariable>();
             for (FFunctionVariable var : myNonInputs())
                 if (!var.isOutput())
                     l.add(var);
             return l;
         }
    /**
     * @apilevel internal
     */
    protected boolean myNonInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FFunctionVariable> myNonInputs_value;
    /**
     * @apilevel internal
     */
    private void myNonInputs_reset() {
        myNonInputs_computed = false;
        myNonInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myNonInputs() {
        if(myNonInputs_computed) {
            return myNonInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myNonInputs_value = myNonInputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myNonInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myNonInputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FFunctionVariable> myNonInputs_compute() {
             ArrayList<FFunctionVariable> l = new ArrayList<FFunctionVariable>();
             for (FFunctionVariable var : getFFunctionVariables())
                 if (!var.isInput())
                     l.add(var);
             return l;
         }
    /**
     * @apilevel internal
     */
    protected boolean myOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FFunctionVariable> myOutputs_value;
    /**
     * @apilevel internal
     */
    private void myOutputs_reset() {
        myOutputs_computed = false;
        myOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myOutputs() {
        if(myOutputs_computed) {
            return myOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myOutputs_value = myOutputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myOutputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FFunctionVariable> myOutputs_compute() {
             ArrayList<FFunctionVariable> l = new ArrayList<FFunctionVariable>();
             for (FFunctionVariable var : getFFunctionVariables())
                 if (var.isOutput())
                     l.add(var);
             return l;
         }
    @ASTNodeAnnotation.Attribute
    public boolean hasOutputs() {
        ASTNode$State state = state();
        boolean hasOutputs_value = !myOutputs().isEmpty();

        return hasOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable expOutput() {
        ASTNode$State state = state();
        FFunctionVariable expOutput_value = myOutputs().get(0);

        return expOutput_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean returnDefinition_computed = false;
    /**
     * @apilevel internal
     */
    protected FunctionReturnDefinition returnDefinition_value;
    /**
     * @apilevel internal
     */
    private void returnDefinition_reset() {
        returnDefinition_computed = false;
        returnDefinition_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FunctionReturnDefinition returnDefinition() {
        if(returnDefinition_computed) {
            return returnDefinition_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        returnDefinition_value = new FunctionReturnDefinition(this);
        if (isFinal && num == state().boundariesCrossed) {
            returnDefinition_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return returnDefinition_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = hasOutputs() ? expOutput().isArray() : false;

        return isArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = hasOutputs() ? expOutput().type().isRecord() : false;

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComposite() {
        ASTNode$State state = state();
        boolean isComposite_value = hasOutputs() ? expOutput().isComposite() : false;

        return isComposite_value;
    }
    /**
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1514
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsRealInputs() {
        ASTNode$State state = state();
        try {
                for (FFunctionVariable var : myInputs())
                    if (var.type().containsReal())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1520
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsRealOutputs() {
        ASTNode$State state = state();
        try {
                for (FFunctionVariable var : myOutputs())
                    if (var.type().containsReal())
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean requiresDerivative() {
        ASTNode$State state = state();
        boolean requiresDerivative_value = true;

        return requiresDerivative_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean derivativeEqualsZero() {
        ASTNode$State state = state();
        boolean derivativeEqualsZero_value = !containsRealInputs() || !containsRealOutputs();

        return derivativeEqualsZero_value;
    }
    /**
     * Determines if the compiler is able to differentiate this function declaration
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1536
     */
    @ASTNodeAnnotation.Attribute
    public boolean canDifferentiate() {
        ASTNode$State state = state();
        try {
                if (derivativeFunctionUnrestricted() != null)
                    return true;
                if (derivativeEqualsZero())
                    return true;
                for (FStatement statement : getFAlgorithm().getFStatements())
                    if (!statement.canDifferentiate())
                        return false;
                return true;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean signatureString_computed = false;
    /**
     * @apilevel internal
     */
    protected String signatureString_value;
    /**
     * @apilevel internal
     */
    private void signatureString_reset() {
        signatureString_computed = false;
        signatureString_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        if(signatureString_computed) {
            return signatureString_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        signatureString_value = signatureString_compute();
        if (isFinal && num == state().boundariesCrossed) {
            signatureString_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return signatureString_value;
    }
    /**
     * @apilevel internal
     */
    private String signatureString_compute() {
             StringBuilder buf = new StringBuilder();
             for (FFunctionVariable v : myInputs())
                 buf.append(v.type().signatureString());
             buf.append(':');
             for (FFunctionVariable v : myOutputs())
                 buf.append(v.type().signatureString());
             return buf.toString();
         }
    /**
     * Check if this FFunctionDecl contains any active annotation attributes.
     * @attribute syn
     * @aspect AttributeUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2104
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsActiveAnnotations() {
        ASTNode$State state = state();
        try {
                if (getNumFAttribute() == 0)
                    return false;
                for (AttributeContributer contributer : attributeContributers())
                    if (contributer.containsActiveAttributes(this))
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructor() {
        ASTNode$State state = state();
        boolean isDestructor_value = false;

        return isDestructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructor() {
        ASTNode$State state = state();
        boolean isConstructor_value = false;

        return isConstructor_value;
    }
    /**
     * Get the first derivative annotation on this function that match the given restrictions.
     * 
     * If no annotation matches, an empty AnnotationNode is returned.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:226
     */
    @ASTNodeAnnotation.Attribute
    public AnnotationNode derivativeAnnotation(int order, Set<String> zero) {
        ASTNode$State state = state();
        try {
                for (AnnotationNode derNode : annotation().allFor("derivative")) {
                    int myOrder = derivativeOrder(derNode);
                    if ((myOrder == order || myOrder == 1) && zero.containsAll(zeroDerivative(derNode))) {
                        return derNode;
                    }
                }
                // None found, return a null node
                return annotation().emptyNode("derivative");
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode derivativeAnnotationUnrestricted() {
        ASTNode$State state = state();
        AnnotationNode derivativeAnnotationUnrestricted_value = derivativeAnnotation(1, Collections.<String>emptySet());

        return derivativeAnnotationUnrestricted_value;
    }
    /**
     * Get the order of a given derivative annotation.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:263
     */
    @ASTNodeAnnotation.Attribute
    public int derivativeOrder(AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                AnnotationNode orderNode = derNode.forPath("order");
                return orderNode.exists() ? orderNode.integer() : 1;
            }
        finally {
        }
    }
    /**
     * Get the set of names given as zeroDerivative for a given derivative annotation.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:271
     */
    @ASTNodeAnnotation.Attribute
    public Set<String> zeroDerivative(AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                Set<String> set = new HashSet<String>();
                for (AnnotationNode zeroNode : derNode.allFor("zeroDerivative")) {
                    set.add(zeroNode.fExp().asFIdUse().name());
                }
                return set;
            }
        finally {
        }
    }
    /**
     * Get the set of names given as noDerivative for a given derivative annotation.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:282
     */
    @ASTNodeAnnotation.Attribute
    public Set<String> noDerivative(AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                Set<String> set = new HashSet<String>();
                for (AnnotationNode noDerNode : derNode.allFor("noDerivative")) {
                    set.add(noDerNode.fExp().asFIdUse().name());
                }
                return set;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl derivativeFunctionUnrestricted() {
        ASTNode$State state = state();
        FFunctionDecl derivativeFunctionUnrestricted_value = derivativeFunction(derivativeAnnotationUnrestricted());

        return derivativeFunctionUnrestricted_value;
    }
    /**
     * Find the derivative function for the given annotation node.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:299
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl derivativeFunction(AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                FCallable fc = null;
                if (derNode != null && derNode.exists()) {
                    fc = derNode.fExp().asFIdUse().myFCallable();
                }
                return (fc == null) ? null : fc.asFFunctionDecl();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:317
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldVarBeDifferentiated(int i, AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                if (derNode.exists())
                    return calculateShouldBeDifferentiated(i, derNode);
                else
                    return getFFunctionVariable(i).type().shouldBeDifferentiated();
            }
        finally {
        }
    }
    /**
     * Calculate if variable no <code>i</code> in the variables the function should be differentiated.
     * 
     * Result is cached for all variables in list, and in subsequent calls it will be assumed that 
     * the list is the same.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:341
     */
    @ASTNodeAnnotation.Attribute
    public boolean calculateShouldBeDifferentiated(int i, AnnotationNode derNode) {
        ASTNode$State state = state();
        try {
                if (cachedShouldBeDifferentiatedFor != derNode) {
                    List<FFunctionVariable> vars = getFFunctionVariables();
                    cachedShouldBeDifferentiated = new boolean[vars.getNumChild()];
                    cachedShouldBeDifferentiatedFor = derNode;
                    
                    // Type
                    boolean[] okType = new boolean[cachedShouldBeDifferentiated.length];
                    boolean[] input = new boolean[cachedShouldBeDifferentiated.length];
                    int n = 0;
                    int k = 0;
                    for (FFunctionVariable var : vars) {
                        okType[k] = var.type().shouldBeDifferentiated();
                        input[k] = var.isInput();
                        if (okType[k] && input[k]) 
                            n++;
                        k++;
                    }
                    
                    // noDerivative && zeroDerivative
                    Set<String> exclude = new HashSet<String>();
                    exclude.addAll(zeroDerivative(derNode));
                    exclude.addAll(noDerivative(derNode));
                    
                    int j = k = 0;
                    boolean[] hasDerivative = new boolean[n];
                    for (FFunctionVariable var : vars) {
                        if (okType[k] && input[k]) {
                            if (!exclude.contains(var.name()))
                                hasDerivative[j] = true;
                            j++;
                        }
                        k++;
                    }
                    
                    // order
                    int order = derivativeOrder(derNode);
                    int[] part = new int[order];
                    partitionArgumentsByOrder(hasDerivative, 0, n, order, part);
                    
                    // Calc result
                    int ignore = n - part[order - 1];
                    for (k = 0, j = 0; k < cachedShouldBeDifferentiated.length; k++) {
                        if (okType[k]) { 
                            if (input[k]) {
                                if (j >= ignore && hasDerivative[j])
                                    cachedShouldBeDifferentiated[k] = true;
                                j++;
                            } else {
                                cachedShouldBeDifferentiated[k] = true;
                            }
                        }
                    }
                }
                return cachedShouldBeDifferentiated[i];
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = new FAttributeListAnnotationNode(getFAttributes());

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean functionIsUsed() {
        ASTNode$State state = state();
        boolean functionIsUsed_value = functionUsed != UseType.NONE;

        return functionIsUsed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean functionIsUsedAsDerivative() {
        ASTNode$State state = state();
        boolean functionIsUsedAsDerivative_value = functionUsed.derivativeUse();

        return functionIsUsedAsDerivative_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable(AbstractFunctionInliner fi, FFunctionCall call) {
        ASTNode$State state = state();
        boolean isInlinable_AbstractFunctionInliner_FFunctionCall_value = fi.isInlinable(this, call);

        return isInlinable_AbstractFunctionInliner_FFunctionCall_value;
    }
    protected Map isInlinable_boolean_FFunctionCall_values;
    /**
     * @apilevel internal
     */
    private void isInlinable_boolean_FFunctionCall_reset() {
        isInlinable_boolean_FFunctionCall_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable(boolean late, FFunctionCall call) {
        java.util.List _parameters = new ArrayList(2);
        _parameters.add(Boolean.valueOf(late));
        _parameters.add(call);
        if (isInlinable_boolean_FFunctionCall_values == null) isInlinable_boolean_FFunctionCall_values = new HashMap(4);
        if(isInlinable_boolean_FFunctionCall_values.containsKey(_parameters)) {
            return ((Boolean)isInlinable_boolean_FFunctionCall_values.get(_parameters)).booleanValue();
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isInlinable_boolean_FFunctionCall_value = inlineAnnotation().may() && (late || !inlineAnnotation().late()) && 
                isAllInlinable(getFAlgorithm().getFStatements()) && hasInlinableIO();
        if (isFinal && num == state().boundariesCrossed) {
            isInlinable_boolean_FFunctionCall_values.put(_parameters, Boolean.valueOf(isInlinable_boolean_FFunctionCall_value));
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isInlinable_boolean_FFunctionCall_value;
    }
    protected Map isTrivialInlinable_boolean_FFunctionCall_values;
    /**
     * @apilevel internal
     */
    private void isTrivialInlinable_boolean_FFunctionCall_reset() {
        isTrivialInlinable_boolean_FFunctionCall_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTrivialInlinable(boolean late, FFunctionCall call) {
        java.util.List _parameters = new ArrayList(2);
        _parameters.add(Boolean.valueOf(late));
        _parameters.add(call);
        if (isTrivialInlinable_boolean_FFunctionCall_values == null) isTrivialInlinable_boolean_FFunctionCall_values = new HashMap(4);
        if(isTrivialInlinable_boolean_FFunctionCall_values.containsKey(_parameters)) {
            return ((Boolean)isTrivialInlinable_boolean_FFunctionCall_values.get(_parameters)).booleanValue();
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isTrivialInlinable_boolean_FFunctionCall_value = isTrivialInlinable_compute(late, call);
        if (isFinal && num == state().boundariesCrossed) {
            isTrivialInlinable_boolean_FFunctionCall_values.put(_parameters, Boolean.valueOf(isTrivialInlinable_boolean_FFunctionCall_value));
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isTrivialInlinable_boolean_FFunctionCall_value;
    }
    /**
     * @apilevel internal
     */
    private boolean isTrivialInlinable_compute(boolean late, FFunctionCall call) {
            if (!inlineAnnotation().may())
                return false;
            if (!late && inlineAnnotation().late())
                return false;
            if (inlineAnnotation().always())
                return isInlinable(late, call);
            if (!late && call.derivativeAnnotation().exists())
                return false;
            if (myProtected().size() > 0)
                return false;
            if (!hasInlinableIO())
                return false;
            for (FStatement stmt : getFAlgorithm().getFStatements())
                if (!stmt.isOkTrivialInline())
                    return false;
            for (FFunctionVariable out : myOutputs()) {
                TrivialInlineCheck chk = out.createTrivialInlineCheck();
                for (FIdUseExp use : out.assigningUses()) 
                    chk.check(use.getFIdUse());
                if (!chk.isOk())
                    return false;
            }
            return true;
        }
    @ASTNodeAnnotation.Attribute
    public int smoothOrder() {
        ASTNode$State state = state();
        int smoothOrder_value = readSmoothOrderAnnotation(annotation());

        return smoothOrder_value;
    }
    /**
     * @attribute syn
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:825
     */
    @ASTNodeAnnotation.Attribute
    public FCallable diff(AnnotationNode derNode, boolean inFunction) {
        ASTNode$State state = state();
        try {
                if (smoothOrder() == 0 && !inFunction)
                    return null;
                FFunctionDecl func = derivativeFunction(derNode);
                if (func != null) 
                    return func;
                if (smoothOrder() == SMOOTH_ORDER_ANNOTATION_DEFAULT && !inFunction)
                    return null;
                return createAndAddDerivativeFunction(derNode);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = getFAlgorithm().order();

        return order_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Function";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "fun";

        return xmlNamespace_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldPrintFuncDecl_CAD() {
        ASTNode$State state = state();
        boolean shouldPrintFuncDecl_CAD_value = requiresDerivative() && functionIsUsedAsDerivative();

        return shouldPrintFuncDecl_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldPrintFuncDecl_C() {
        ASTNode$State state = state();
        boolean shouldPrintFuncDecl_C_value = functionIsUsed();

        return shouldPrintFuncDecl_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generateExpFunction() {
        ASTNode$State state = state();
        boolean generateExpFunction_value = hasOutputs() && !isComposite();

        return generateExpFunction_value;
    }
    /**
     * Check if function should generate an export wrapper. 
     * @attribute syn
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:30
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasExportWrapper_C() {
        ASTNode$State state = state();
        try {
        		if (myOutputs().size() != 1)
        			return false;
        		if (!myOutputs().get(0).type().isNumericScalar())
        			return false;
        		for (FFunctionVariable ffv : myInputs())
        			if (ffv.type().isRecord())
        				return false;
        		return true;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String exportWrapperType_C() {
        ASTNode$State state = state();
        String exportWrapperType_C_value = exportWrapperReturnsValue_C() ? myOutputs().get(0).exportWrapperType_C() : "void";

        return exportWrapperType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean exportWrapperReturnsValue_C() {
        ASTNode$State state = state();
        boolean exportWrapperReturnsValue_C_value = myOutputs().size() == 1 && myOutputs().get(0).type().isScalar();

        return exportWrapperReturnsValue_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameExportWrapper() {
        ASTNode$State state = state();
        String funcNameExportWrapper_value = funcNameUnderscore(C_SUFFIX_EXPORT);

        return funcNameExportWrapper_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1570
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:532
     */
    @ASTNodeAnnotation.Attribute
    public FCallable lookupFCallable(String name) {
        ASTNode$State state = state();
        FCallable lookupFCallable_String_value = getParent().Define_lookupFCallable(this, null, name);

        return lookupFCallable_String_value;
    }
    /**
     * Get the index of this function.
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:470
     */
    @ASTNodeAnnotation.Attribute
    public int functionIndex() {
        ASTNode$State state = state();
        int functionIndex_value = getParent().Define_functionIndex(this, null);

        return functionIndex_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3222
     * @apilevel internal
     */
    public boolean Define_duringFunctionEval(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return currentEvaluationValues != null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:115
     * @apilevel internal
     */
    public boolean Define_isConstructorStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isConstructor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:120
     * @apilevel internal
     */
    public boolean Define_isDestructorStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isDestructor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2662
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2672
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child, FVariable fv) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2682
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2692
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child, FDerivedType t) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:31
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFV(fqn);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:25
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupDerFV(ASTNode caller, ASTNode child, FQName fqn, int index) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFV(fqn.createDerPrefixedName(index));
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:26
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupOutermostFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupOutermostFV(fqn);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:451
     * @apilevel internal
     */
    public FAbstractEquation Define_parameterEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:508
     * @apilevel internal
     */
    public boolean Define_inParameterEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:517
     * @apilevel internal
     */
    public boolean Define_inAttributeValue(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:531
     * @apilevel internal
     */
    public FCallable Define_lookupFCallable(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFunc(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1488
     * @apilevel internal
     */
    public FunctionReturnDefinition Define_returnDefinition(ASTNode caller, ASTNode child) {
        if (caller == getFAlgorithmNoTransform()) {
            return returnDefinition();
        }
        else {
            return getParent().Define_returnDefinition(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1601
     * @apilevel internal
     */
    public boolean Define_inFunction(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1626
     * @apilevel internal
     */
    public FFunctionDecl Define_containingFFunctionDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        int childIndex = this.getIndexOfChild(caller);
        return nextGeneratedVarName(gvt);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1897
     * @apilevel internal
     */
    public boolean Define_inNoEventExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:62
     * @apilevel internal
     */
    public CommonVariableDecl Define_myConstructorOutput(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myOutputs().get(0);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:307
     * @apilevel internal
     */
    public boolean Define_delegateShouldBeDifferentiated(ASTNode caller, ASTNode child) {
        if (caller == getFFunctionVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return shouldVarBeDifferentiated(i, derivativeAnnotationUnrestricted());
        }
        else {
            return getParent().Define_delegateShouldBeDifferentiated(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:312
     * @apilevel internal
     */
    public boolean Define_shouldBeDifferentiated(ASTNode caller, ASTNode child, AnnotationNode derNode) {
        if (caller == getFFunctionVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return shouldVarBeDifferentiated(i, derNode);
        }
        else {
            return getParent().Define_shouldBeDifferentiated(this, caller, derNode);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1761
     * @apilevel internal
     */
    public boolean Define_duringFunctionInlining(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return duringInlining;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2324
     * @apilevel internal
     */
    public CodeGenContext Define_myCodeGenContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return codeGenContext;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
