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
 * Base class for all function calls and function call-like operators.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1274
 * @production FAbstractFunctionCall : {@link FAbstractArrayExp};

 */
public abstract class FAbstractFunctionCall extends FAbstractArrayExp implements Cloneable {
    /**
     * Perform constant evaluation of functions.
     * 
     * @return  constant values for the outputs
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3287
     */
    public CValue[] evaluate(VariableEvaluator evaluator) {
	  Map<CommonVariableDecl, CValue> values = new HashMap<CommonVariableDecl, CValue>();
	  int i = 0;
	  for (CommonVariableDecl var : myCallInputs()) {
		  var.prepareForFunctionEval();
		  FExp arg = argument(i++);
            if (arg != null) {
                values.put(var, arg.ceval(evaluator));
            } else {
                throw new ConstantEvaluationException();
            }
	  }
	  
	  evaluate(evaluator, values);
	  
	  CValue[] res = new CValue[myCallOutputs().size()];
	  i = 0;
	  for (CommonVariableDecl var : myCallOutputs()) {
		  CValue val = values.get(var);
		  res[i] = (val == null) ? CValue.UNKNOWN : val;
		  i++;
	  }
	  return res;
  }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3313
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        evaluateCell(evaluator, values);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3328
     */
    public void evaluateCell(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        values.clear();
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3363
     */
    public void evaluateVector(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        Size vectorizedSize = sizeOfOutput(0);
        CommonVariableDecl output = myCallOutputs().get(0);
        Map<CommonVariableDecl, CValue> input  = new HashMap<CommonVariableDecl, CValue>(values.size());
        input.putAll(values);
        values.put(output, new CValueArray(vectorizedSize));
        
        Map<CommonVariableDecl, Boolean> isVectorized = new HashMap<CommonVariableDecl, Boolean>(input.size());
        for (CommonVariableDecl cvd : input.keySet()) {
            isVectorized.put(cvd, cvd.size().expand(vectorizedSize).equivalent(input.get(cvd).size(), true));
        }
        
        for (Index i : Indices.create(vectorizedSize)) {
            Map<CommonVariableDecl, CValue> valuesCell = new HashMap<CommonVariableDecl, CValue>();
            for (CommonVariableDecl cvd : input.keySet()) {
                if (isVectorized.get(cvd)) {
                    valuesCell.put(cvd, input.get(cvd).array().getPart(i));
                } else {
                    valuesCell.put(cvd, input.get(cvd));
                }
            }
            evaluateCell(evaluator, valuesCell);
            values.get(output).array().setCell(i, valuesCell.get(output));
        }
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3389
     */
    public void evaluatePartial(Map<CommonVariableDecl, CValue> values) {
        values.put(myCallOutputs().get(0), myCommonCallable().evaluatePartial(values));
    }
    /**
     * \brief List of CommonVariableDecl used as inputs in this function call
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1424
     */
    public abstract ArrayList<? extends CommonVariableDecl> myCallInputs();
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1433
     */
    
        public <T extends CommonVariableDecl> ArrayList<T> filterPartialInputs(ArrayList<T> decls) {
            List<FRecordComponentType> comps = ((FFunctionType)type()).getInputs();
            ArrayList<T> res = new ArrayList<T>();
            Iterator<FRecordComponentType> it = comps.iterator();
            String name = it.hasNext() ? it.next().getName() : "";
            for (T cvd : decls) {
                if (name.equals(cvd.name())) {
                    name = it.hasNext() ? it.next().getName() : "";
                } else {
                    res.add(cvd);
                }
            }
            return res;
        }
    /**
     * \brief List of CommonVariableDecl used as outputs in this function call
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1452
     */
    public abstract ArrayList<? extends CommonVariableDecl> myCallOutputs();
    /**
     * \brief Alias of myCallInputs.
     * @Deprecated Use {@link #myCallInputs()} instead.
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1464
     */
    @Deprecated
    public ArrayList<? extends CommonVariableDecl> myFuncInputs() {
        return myCallInputs();
    }
    /**
     * If this call is an assert with constant test, try to evaluate it.
     * 
     * @return  <code>true</code> if this is an assert that should be removed
     * @aspect AssertEval
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1569
     */
    public boolean evaluateAsserts(boolean error) {
        return false;
    }
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:153
     */
    public void setUnbindableArgsList(ArrayList<InstFunctionArgument> list) {
		throw new UnsupportedOperationException();
	}
    /**
     * Add a new argument to list of arguments. (Only valid for some subclasses.)
     * 
     * Default implementation does nothing.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:201
     */
    public void addArgument(InstFunctionArgument arg) {}
    /**
     * It this is a reinit(), mark reinited variable as state.
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3693
     */
    public void makeReinitedVarsStates() {}
    /**
     * Inline this function call.
     * 
     * Base implementation throws exception.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:931
     */
    public void inline(AbstractFunctionInliner fi) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:390
     */
    public void prettyPrintCallOutputs_C(CodePrinter p, CodeStream str, String indent, int outputs, String sep) {
        int lefts = myLefts().size();
        for (int i = 0; i < outputs; i++) {
            str.print(sep);
            if (i < lefts) {
                myLefts().get(i).genArgument_C(str);
            } else if (i == 0 && lefts == 0 && isFunctionCallArg()) {
                str.print(tempName_C());
            } else {
                str.print("NULL");
            }
            sep = ", ";
        }
    }
    /**
     * Helper, used for writing temp decl for reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:609
     */
    public void genReinitTempDecls_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Helper, used for writing temp init for reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:662
     */
    public void genReinitTempInits_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Helper, used for finding reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:720
     */
    public void collectReinits_C(Map<String, ArrayList<FReinit>> map, boolean initial) {}
    /**
     * @declaredat ASTNode:1
     */
    public FAbstractFunctionCall() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:16
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:22
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myLefts_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:41
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:47
     */
    public FAbstractFunctionCall clone() throws CloneNotSupportedException {
        FAbstractFunctionCall node = (FAbstractFunctionCall) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:58
     */
    public abstract FAbstractFunctionCall fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:65
     */
    public abstract FAbstractFunctionCall treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:73
     */
    public abstract FAbstractFunctionCall treeCopy();
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 0;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:364
     */
    @ASTNodeAnnotation.Attribute
    public abstract String name();
    @ASTNodeAnnotation.Attribute
    public CValue[] cevalFunction(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue[] cevalFunction_VariableEvaluator_value = new CValue[] { ceval(evaluator) };

        return cevalFunction_VariableEvaluator_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3273
     */
    @ASTNodeAnnotation.Attribute
    public FExp argument(int i) {
        ASTNode$State state = state();
        try {
        	  for (FExp e : childFExps())
        		  if (i-- == 0)
        			  return e;
        	  return null;
          }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean ignoreInFlattening() {
        ASTNode$State state = state();
        boolean ignoreInFlattening_value = false;

        return ignoreInFlattening_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIgnored() {
        ASTNode$State state = state();
        boolean isIgnored_value = false;

        return isIgnored_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonCallable myCommonCallable() {
        ASTNode$State state = state();
        CommonCallable myCommonCallable_value = null;

        return myCommonCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findOutput(int i) {
        ASTNode$State state = state();
        InstComponentDecl findOutput_int_value = unknownInstComponentDecl();

        return findOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size sizeOfOutput(int i) {
        ASTNode$State state = state();
        Size sizeOfOutput_int_value = (i == 0) ? size() : Size.SCALAR;

        return sizeOfOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType typeOfOutput(int i) {
        ASTNode$State state = state();
        FType typeOfOutput_int_value = typeOutput(i) ? type() : fUnknownType();

        return typeOfOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeOutput(int i) {
        ASTNode$State state = state();
        boolean typeOutput_int_value = i == 0;

        return typeOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String functionCallDecription() {
        ASTNode$State state = state();
        String functionCallDecription_value = "Calling function " + name() + "()";

        return functionCallDecription_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInline() {
        ASTNode$State state = state();
        boolean isOkTrivialInline_value = isIgnored();

        return isOkTrivialInline_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability potentialPartialVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability potentialPartialVariability_value = variability();

        return potentialPartialVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isVectorizedOperatorWithoutOutputs() {
        ASTNode$State state = state();
        boolean isVectorizedOperatorWithoutOutputs_value = false;

        return isVectorizedOperatorWithoutOutputs_value;
    }
    /**
     * Check if this function call is the call of a function call equation 
     * or function call statement.
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1662
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFunctionCallClause() {
        ASTNode$State state = state();
        boolean isFunctionCallClause_value = getParent().Define_isFunctionCallClause(this, null);

        return isFunctionCallClause_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     */
    @ASTNodeAnnotation.Attribute
    public boolean functionCallIsExp() {
        ASTNode$State state = state();
        boolean functionCallIsExp_value = getParent().Define_functionCallIsExp(this, null);

        return functionCallIsExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionCallLeft> myLefts() {
        if(myLefts_computed) {
            return myLefts_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myLefts_value = getParent().Define_myLefts(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myLefts_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myLefts_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myLefts_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FFunctionCallLeft> myLefts_value;
    /**
     * @apilevel internal
     */
    private void myLefts_reset() {
        myLefts_computed = false;
        myLefts_value = null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1493
     * @apilevel internal
     */
    public String Define_funcName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return name();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:463
     * @apilevel internal
     */
    public Size Define_vectorizedSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return Size.SCALAR;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1147
     * @apilevel internal
     */
    public String Define_functionCallDecription(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return functionCallDecription();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1294
     * @apilevel internal
     */
    public boolean Define_argumentDefinedTypeValid(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1326
     * @apilevel internal
     */
    public boolean Define_argumentTypeValid(ASTNode caller, ASTNode child, FType type) {
        int childIndex = this.getIndexOfChild(caller);
        return type.isPrimitive();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1362
     * @apilevel internal
     */
    public String Define_expectedArgumentType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return "Real, Integer, Boolean, String or enumeration";
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:892
     * @apilevel internal
     */
    public boolean Define_inVectorizedCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:334
     * @apilevel internal
     */
    public boolean Define_inFunctionArg(ASTNode caller, ASTNode child) {
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
