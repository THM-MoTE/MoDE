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
 * The spatialDistribution() operator.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1416
 * @production FSpatialDistExp : {@link FBuiltInFunctionCall} ::= <span class="component">In0:{@link FExp}</span> <span class="component">In1:{@link FExp}</span> <span class="component">X:{@link FExp}</span> <span class="component">PositiveVelocity:{@link FExp}</span> <span class="component">InitialPoints:{@link FExp}</span> <span class="component">InitialValues:{@link FExp}</span>;

 */
public class FSpatialDistExp extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2277
     */
    public CValue[] evaluate(VariableEvaluator evaluator) {
        CValue[] res = new CValue[2];
        CValueArray vals = getInitialValues().ceval(evaluator).array();
        if (getPositiveVelocity().ceval(evaluator).booleanValue()) {
            res[1] = vals.getCell(vals.values.length-1);
            res[0] = vals.getCell(0);
        } else {
            res[0] = vals.getCell(vals.values.length-1);
            res[1] = vals.getCell(0);
        }
        return res;
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1074
     */
    public FSpatialDistExp createEmptyNode() { return new FSpatialDistExp(); }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1761
     */
    public FExp createInitialReplacement(boolean second) {
        int size = getInitialValues().getArray().length;
        return new FIfExp(getPositiveVelocity().copySymbolic(),
                getInitialValues().getArray().get(second ? size : 1).copySymbolic(), 
                getInitialValues().getArray().get(second ? 1 : size).copySymbolic());
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:197
     */
    public void complianceCheck(ErrorCheckType checkType) {
        ONLY_FMU_FUNCTION_LIKE_OPERATOR.invoke(this, "spatialDistribution");
        FAbstractEquation equation = myFEquation();
        if (isArray() && equation != null && equation instanceof FFunctionCallEquation) {
            INCORRECT_USE_OF_SPATIAL_DISTRIBUTION.invoke(this);
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1041
     */
    public void typeCheck(ErrorCheckType checkType) {
        super.typeCheck(checkType);
        if (!getIn0().size().equivalent(getIn1().size(), true)) {
            errorUnlessDisabledAnd(getIn0().ndims() == getIn1().ndims(), 
                    "Calling function spatialDistribution(): first and second arguments 'in0' and 'in1' needs equivalent sizes");
        }
        if (isArray()) {
            if (getX().isArray()) {
                error("Calling function spatialDistribution(): third argument 'x' cannot be vectorized");
            }
            if (getPositiveVelocity().isArray()) {
                error("Calling function spatialDistribution(): fourth argument 'positiveVelocity' cannot be vectorized");
            }
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2534
     */
    public FSpatialDistExp flatten(FQName prefix)     {
        return new FSpatialDistExp(
            getIn0().flatten(prefix), getIn1().flatten(prefix), 
            getX().flatten(prefix), getPositiveVelocity().flatten(prefix),
            getInitialPoints().flatten(prefix), getInitialValues().flatten(prefix)
        );
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1835
     */
    public FSpatialDistExp scalarizeExp(Map<String,FExp> indexMap) {
        return new FSpatialDistExp(getIn0().scalarize(indexMap), getIn1().scalarize(indexMap),
                getX().scalarize(indexMap), getPositiveVelocity().scalarize(indexMap),
                getInitialPoints().scalarize(indexMap), getInitialValues().scalarize(indexMap));
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:467
     */
    public FExp diff(String name) {
        throw new FunctionDifferentiationException(this);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:349
     */
    private FSpatialDistExp originalFSpatialDistExp = null;
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:360
     */
    public void setOriginalFExp(FSpatialDistExp original) { this.originalFSpatialDistExp = original; }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:394
     */
    @Override
    protected void resetOriginalReferences() {
        setOriginalFExp(this);
        super.resetOriginalReferences();
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:424
     */
    @Override
    protected void traverseSymbolic(ASTNode e) {
        setOriginalFExp(((FSpatialDistExp)e).originalFExp());
        super.traverseSymbolic(e);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4077
     */
    @Override
    public void genEventResidualVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (!p.inInitialSystem()) {
            p.printVarDecls(getX(), str, indent);
            p.printVarDecls(getPositiveVelocity(), str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4116
     */
    @Override
    public void genEventResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator) {
//        int jmi_spatialdist_event_indicator(jmi_t *jmi, int index, jmi_real_t x, 
//              jmi_boolean positiveVelocity, jmi_real_t *event_indicator);
        if (p.inInitialSystem()) {
            str.formatln("%s(*res)[%d] = JMI_DELAY_INITIAL_EVENT_RES;", indent, enumerator.next());
        } else {
            p.printPreSteps(getX(), str, indent);
            p.printPreSteps(getPositiveVelocity(), str, indent);
            int index = mySpatialDistIndex();
            str.format("%sef = jmi_spatialdist_event_indicator(jmi, %d, ", indent, index);
            p.print(getX(), str, indent);
            str.print(", ");
            p.print(getPositiveVelocity(), str, indent);
            str.print(", &(*res)[" + enumerator.next() + "]);\n");
            p.printPostSteps(getX(), str, indent);
            p.printPostSteps(getPositiveVelocity(), str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4407
     */
    @Override
    public void genRelExpKind(CodeStream str) {
        str.print(FRelExp.GEQ_C);
    }
    /**
     * Generate temp declarations for the initialization of spatialDistribution blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1301
     */
    public void genInitVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getX(), str, indent);
        getX().genTempInputDecl_C(p, str, indent);
        p.printVarDecls(getInitialPoints(), str, indent);
        getInitialPoints().genTempInputDecl_C(p, str, indent);
        p.printVarDecls(getInitialValues(), str, indent);
        getInitialValues().genTempInputDecl_C(p, str, indent);
    }
    /**
     * Generate the initialization of spatialDistribution blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1313
     */
    public void genInit_C(CodePrinter p, CodeStream str, String indent) {
        
        //int jmi_spatialdist_init(jmi_t *jmi, int index, jmi_boolean no_event,
        // jmi_real_t x0, jmi_real_t *x_init, jmi_real_t *y_init, int n_init);
        
        p.printPreSteps(getX(), str, indent);
        getX().genTempInput_C(p, str, indent);
        p.printPreSteps(getInitialPoints(), str, indent);
        getInitialPoints().genTempInput_C(p, str, indent);
        p.printPreSteps(getInitialValues(), str, indent);
        getInitialValues().genTempInput_C(p, str, indent);
        
        str.format("%sjmi_spatialdist_init(jmi, %d, ", indent, mySpatialDistIndex());
        str.print(generatesEventInDAE() ? "JMI_FALSE" : "JMI_TRUE"); // jmi_boolean no_event
        str.print(", "); 
        p.print(getX(), str, indent); // jmi_real_t x0,
        str.print(", "); 
        getInitialPoints().genArgument_C(p, str, indent); // jmi_real_t *x_init
        str.print(", ");
        getInitialValues().genArgument_C(p, str, indent); // jmi_real_t *y_init
        str.println(");");
        
        p.printPostSteps(getX(), str, indent);
        p.printPostSteps(getInitialPoints(), str, indent);
        p.printPostSteps(getInitialValues(), str, indent);
    }
    /**
     * Generate temp declarations for the sampling of spatialDistribution blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1343
     */
    public void genSampleVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getIn0(), str, indent);
        p.printVarDecls(getIn1(), str, indent);
        p.printVarDecls(getX(), str, indent);
        p.printVarDecls(getPositiveVelocity(), str, indent);
    }
    /**
     * Generate the sampling of spatialDistribution blocks.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1353
     */
    public void genSample_C(CodePrinter p, CodeStream str, String indent) {
//        int jmi_spatialdist_record_sample(jmi_t *jmi, int index, jmi_real_t in0,
//              jmi_real_t in1, jmi_real_t x, jmi_boolean positiveVelocity);
        
        p.printPreSteps(getIn0(), str, indent);
        p.printPreSteps(getIn1(), str, indent);
        p.printPreSteps(getX(), str, indent);
        p.printPreSteps(getPositiveVelocity(), str, indent);
            
        str.format("%sjmi_spatialdist_record_sample(jmi, %d, ", indent, mySpatialDistIndex());
        p.print(getIn0(), str, indent);
        str.print(", ");
        p.print(getIn1(), str, indent);
        str.print(", ");
        p.print(getX(), str, indent);
        str.print(", ");
        p.print(getPositiveVelocity(), str, indent);
        str.println(");");
        
        p.printPostSteps(getIn0(), str, indent);
        p.printPostSteps(getIn1(), str, indent);
        p.printPostSteps(getX(), str, indent);
        p.printPostSteps(getPositiveVelocity(), str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1378
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getIn0(), str, indent);
        p.printVarDecls(getIn1(), str, indent);
        p.printVarDecls(getX(), str, indent);
        p.printVarDecls(getPositiveVelocity(), str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1386
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(getIn0(), str, indent);
        p.printPreSteps(getIn1(), str, indent);
        p.printPreSteps(getX(), str, indent);
        p.printPreSteps(getPositiveVelocity(), str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1394
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
//        int jmi_spatialdist_evaluate(jmi_t *jmi, int index, jmi_real_t *out0,
//            jmi_real_t *out1, jmi_real_t in0, jmi_real_t in1, jmi_real_t x, 
//            jmi_boolean positiveVelocity);
        
        boolean exp = functionCallIsExp();
        if (!exp) {
            str.print(indent);
        }
        str.format("jmi_spatialdist_evaluate(jmi, %d, ", mySpatialDistIndex());
        if (exp) {
            str.print("NULL, NULL");
        } else {
            prettyPrintCallOutputs_C(p, str, indent, 2, "");
        }
        str.print(", ");
        p.print(getIn0(), str, indent);
        str.print(", ");
        p.print(getIn1(), str, indent);
        str.print(", ");
        p.print(getX(), str, indent);
        str.print(", ");
        p.print(getPositiveVelocity(), str, indent);
        str.print(")");
        
        if (!exp) {
            str.println(";");
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1425
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        p.printPostSteps(getIn0(), str, indent);
        p.printPostSteps(getIn1(), str, indent);
        p.printPostSteps(getX(), str, indent);
        p.printPostSteps(getPositiveVelocity(), str, indent);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FSpatialDistExp() {
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
        children = new ASTNode[8];
        setChild(new List(), 7);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FSpatialDistExp(FExp p0, FExp p1, FExp p2, FExp p3, FExp p4, FExp p5) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 6;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        mySpatialDistIndex_reset();
        myEventIndicatorIndex_reset();
        type_reset();
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
    public FSpatialDistExp clone() throws CloneNotSupportedException {
        FSpatialDistExp node = (FSpatialDistExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public FSpatialDistExp copy() {
        try {
            FSpatialDistExp node = (FSpatialDistExp) clone();
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
    public FSpatialDistExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public FSpatialDistExp treeCopyNoTransform() {
        FSpatialDistExp tree = (FSpatialDistExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 6:
                    tree.children[i] = null;
                    continue;
                case 7:
                    tree.children[i] = new List();
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
     * @declaredat ASTNode:124
     */
    public FSpatialDistExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:131
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the In0 child.
     * @param node The new node to replace the In0 child.
     * @apilevel high-level
     */
    public void setIn0(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the In0 child.
     * @return The current node used as the In0 child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="In0")
    public FExp getIn0() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the In0 child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the In0 child.
     * @apilevel low-level
     */
    public FExp getIn0NoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the In1 child.
     * @param node The new node to replace the In1 child.
     * @apilevel high-level
     */
    public void setIn1(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the In1 child.
     * @return The current node used as the In1 child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="In1")
    public FExp getIn1() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the In1 child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the In1 child.
     * @apilevel low-level
     */
    public FExp getIn1NoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Replaces the X child.
     * @param node The new node to replace the X child.
     * @apilevel high-level
     */
    public void setX(FExp node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the X child.
     * @return The current node used as the X child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="X")
    public FExp getX() {
        return (FExp) getChild(2);
    }
    /**
     * Retrieves the X child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the X child.
     * @apilevel low-level
     */
    public FExp getXNoTransform() {
        return (FExp) getChildNoTransform(2);
    }
    /**
     * Replaces the PositiveVelocity child.
     * @param node The new node to replace the PositiveVelocity child.
     * @apilevel high-level
     */
    public void setPositiveVelocity(FExp node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the PositiveVelocity child.
     * @return The current node used as the PositiveVelocity child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="PositiveVelocity")
    public FExp getPositiveVelocity() {
        return (FExp) getChild(3);
    }
    /**
     * Retrieves the PositiveVelocity child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the PositiveVelocity child.
     * @apilevel low-level
     */
    public FExp getPositiveVelocityNoTransform() {
        return (FExp) getChildNoTransform(3);
    }
    /**
     * Replaces the InitialPoints child.
     * @param node The new node to replace the InitialPoints child.
     * @apilevel high-level
     */
    public void setInitialPoints(FExp node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the InitialPoints child.
     * @return The current node used as the InitialPoints child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InitialPoints")
    public FExp getInitialPoints() {
        return (FExp) getChild(4);
    }
    /**
     * Retrieves the InitialPoints child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InitialPoints child.
     * @apilevel low-level
     */
    public FExp getInitialPointsNoTransform() {
        return (FExp) getChildNoTransform(4);
    }
    /**
     * Replaces the InitialValues child.
     * @param node The new node to replace the InitialValues child.
     * @apilevel high-level
     */
    public void setInitialValues(FExp node) {
        setChild(node, 5);
    }
    /**
     * Retrieves the InitialValues child.
     * @return The current node used as the InitialValues child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InitialValues")
    public FExp getInitialValues() {
        return (FExp) getChild(5);
    }
    /**
     * Retrieves the InitialValues child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InitialValues child.
     * @apilevel low-level
     */
    public FExp getInitialValuesNoTransform() {
        return (FExp) getChildNoTransform(5);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(6);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 6;
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * @return Number of children in the OriginalArg list.
     * @apilevel high-level
     */
    public int getNumOriginalArg() {
        return getOriginalArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the OriginalArg list.
     * @apilevel low-level
     */
    public int getNumOriginalArgNoTransform() {
        return getOriginalArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the OriginalArg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the OriginalArg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getOriginalArg(int i) {
        return (InstFunctionArgument) getOriginalArgList().getChild(i);
    }
    /**
     * Check whether the OriginalArg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasOriginalArg() {
        return getOriginalArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the OriginalArg list.
     * @param node The element to append to the OriginalArg list.
     * @apilevel high-level
     */
    public void addOriginalArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getOriginalArgListNoTransform() : getOriginalArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addOriginalArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getOriginalArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the OriginalArg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setOriginalArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getOriginalArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the OriginalArg list.
     * @return The the child position of the OriginalArg list.
     * @apilevel low-level
     */
    protected int getOriginalArgListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(7);
    }
    /**
     * Retrieves the OriginalArg list.
     * @return The node representing the OriginalArg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getOriginalArgs() {
        return getOriginalArgList();
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgsNoTransform() {
        return getOriginalArgListNoTransform();
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
        ndims_value = vectorizedNdims();
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
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = vectorizedSize();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:922
     */
    @ASTNodeAnnotation.Attribute
    public Size vectorizedSize() {
        ASTNode$State state = state();
        try {
                return getIn0().size();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:932
     */
    @ASTNodeAnnotation.Attribute
    public int vectorizedNdims() {
        ASTNode$State state = state();
        try {
                return getIn0().ndims();
            }
        finally {
        }
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
            if (!isArray()) {
                return super.getArray();
            }
            Array arr = new Array(indices());
            boolean vecPoints = getInitialPoints().ndims() > 1;
            boolean vecValues = getInitialValues().ndims() > 1;
            FExp points = getInitialPoints();
            FExp values = getInitialValues();
            for (Index i : arr.indices()) {
                if (vecPoints) {
                    points = getInitialPoints().getArray().subArrayFExp(i);
                }
                if (vecValues) {
                    values = getInitialValues().getArray().subArrayFExp(i);
                }
                arr.set(i, new FSpatialDistExp(getIn0().getArray().subArrayFExp(i), getIn1().getArray().subArrayFExp(i), getX().fullCopy(),
                        getPositiveVelocity().fullCopy(), points, values));
            }
            return arr;
        }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = evaluate(evaluator)[0];

        return cevalCalc_VariableEvaluator_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean mySpatialDistIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int mySpatialDistIndex_value;
    /**
     * @apilevel internal
     */
    private void mySpatialDistIndex_reset() {
        mySpatialDistIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int mySpatialDistIndex() {
        if(mySpatialDistIndex_computed) {
            return mySpatialDistIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        mySpatialDistIndex_value = myFClass().mySpatialDistExps().indexOf(originalFExp());
        if (isFinal && num == state().boundariesCrossed) {
            mySpatialDistIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return mySpatialDistIndex_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myEventIndicatorIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int myEventIndicatorIndex_value;
    /**
     * @apilevel internal
     */
    private void myEventIndicatorIndex_reset() {
        myEventIndicatorIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int myEventIndicatorIndex() {
        if(myEventIndicatorIndex_computed) {
            return myEventIndicatorIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myEventIndicatorIndex_value = checkIndex(myFClass().stateEventExps().indexOf(originalFExp()));
        if (isFinal && num == state().boundariesCrossed) {
            myEventIndicatorIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myEventIndicatorIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingType() {
        ASTNode$State state = state();
        boolean hasEventGeneratingType_value = true;

        return hasEventGeneratingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = FExp.nominalMax(getIn0(), getIn1());

        return nominal_value;
    }
    @ASTNodeAnnotation.Attribute
    public String builtInName() {
        ASTNode$State state = state();
        String builtInName_value = "spatialDistribution";

        return builtInName_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean type_computed = false;
    /**
     * @apilevel internal
     */
    protected FType type_value;
    /**
     * @apilevel internal
     */
    private void type_reset() {
        type_computed = false;
        type_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        if(type_computed) {
            return type_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        type_value = getIn0().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeOutput(int i) {
        ASTNode$State state = state();
        boolean typeOutput_int_value = i == 1 || super.typeOutput(i);

        return typeOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public int builtInNumOutput() {
        ASTNode$State state = state();
        int builtInNumOutput_value = 2;

        return builtInNumOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSpatialDistExp originalFExp() {
        ASTNode$State state = state();
        FSpatialDistExp originalFExp_value = (originalFSpatialDistExp == null)  ? this : originalFSpatialDistExp;

        return originalFExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1943
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInitial() {
        ASTNode$State state = state();
        boolean isInitial_value = getParent().Define_isInitial(this, null);

        return isInitial_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:463
     * @apilevel internal
     */
    public Size Define_vectorizedSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return vectorizedSize();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:892
     * @apilevel internal
     */
    public boolean Define_inVectorizedCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isArray();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1756
        if (isInitial() && !isFunctionCallClause()) {
            state().duringFlatAPI++;
            ASTNode result = rewriteRule0();
            state().duringFlatAPI--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1756
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            return createInitialReplacement(false);
        }    }
    protected void collect_contributors_FClass_mySpatialDistExps() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:768
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_mySpatialDistExps_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_mySpatialDistExps();
    }
    protected void collect_contributors_FClass_spatialDistExpsWithStateEvent() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1280
     */
        if (generatesEventInDAE()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_spatialDistExpsWithStateEvent_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_spatialDistExpsWithStateEvent();
    }
    protected void collect_contributors_FAbstractEquation_replacedAtInitialExps() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1685
     */
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_replacedAtInitialExps_contributors().add(this);
                }
            }
        super.collect_contributors_FAbstractEquation_replacedAtInitialExps();
    }
    protected void contributeTo_FClass_FClass_mySpatialDistExps(ArrayList<FSpatialDistExp> collection) {
        super.contributeTo_FClass_FClass_mySpatialDistExps(collection);
        collection.add(this);
    }

    protected void contributeTo_FClass_FClass_spatialDistExpsWithStateEvent(ArrayList<FSpatialDistExp> collection) {
        super.contributeTo_FClass_FClass_spatialDistExpsWithStateEvent(collection);
        if (generatesEventInDAE())
            collection.add(this);
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(ArrayList<FExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(collection);
        collection.add(this);
    }

}
