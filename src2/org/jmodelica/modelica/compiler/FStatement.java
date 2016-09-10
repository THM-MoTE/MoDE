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
 * Base class for statements in flattened algorithms.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:709
 * @production FStatement : {@link BaseNode};

 */
public abstract class FStatement extends BaseNode implements Cloneable, FunctionEvalNode {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3934
     */
    public static final int EVAL_CONT   = 1;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3935
     */
    public static final int EVAL_RETURN = 2;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3936
     */
    public static final int EVAL_BREAK  = 3;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3937
     */
    public static final int EVAL_MASK   = 3;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3938
     */
    public static final int EVAL_IFHIT  = 4;
    /**
     * Evaluate statement during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3969
     */
    public abstract int evaluate(AlgorithmEvaluator evaluator);
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1583
     */
    public Iterable<FAbstractEquation> enclosingEquationsIterator() {
        return myFEquation().enclosingEquationsIterator();
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1823
     */
    public void addAsInitial(ArrayList<FStatement> stmts, Set<FIdUseExp> usesLHS, 
            Set<FVariable> fvSet, Set<FVariable> fvUse) {
        
        defSet(fvSet, fvUse);
        stmts.add(copySymbolic());
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1866
     */
    public void defSetAdd(Set<FVariable> s1, Set<FVariable> s2, Collection<FVariable> fvs) {
        for (FVariable fv : fvs)
            if (!s1.contains(fv))
                s2.add(fv);
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1871
     */
    public void defSet(Set<FVariable> fvSet, Set<FVariable> fvUse) {
        defSetAdd(fvSet, fvUse, lookupFVariablesInSet(FIdUseExpsInRHS()));
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:19
     */
    public static boolean flattenFStatementList(List<FStatement> sl, FClass fc, FQName prefix) {
        return FStatement.flattenFStatementList(sl, new List<FStatement>(), fc, prefix);
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:23
     */
    public static boolean flattenFStatementList(List<FStatement> fromList, List<FStatement> toList, 
            FClass fc, FQName prefix) {
        boolean hasBroken = false;
        boolean res = false;
        for (FStatement stmt : fromList) {
            if (hasBroken) {
                toList = FStatement.breakBlock(toList, new FIdUseExp(stmt.breakCondName()));
            }
            res = (hasBroken = stmt.flatten(toList, fc, prefix)) || res;
        }
        return res;
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:36
     */
    public static List<FStatement> breakBlock(List<FStatement> stmts, FExp breakCond) {
        FIfStmt ifStmt = new FIfStmt();
        FIfClause clause = new FIfClause();
        clause.setTest(breakCond.fullCopy());
        ifStmt.addFIfWhenClause(clause);
        stmts.add(ifStmt);
        return clause.getFStatements();
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:61
     */
    public abstract boolean flatten(List<FStatement> sl, FClass fc, FQName prefix);
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1049
     */
    public void acceptTransform(AlgorithmTransformer tf)  { tf.visit(this); }
    /**
     * Inline this statement.
     * 
     * @param fi      the function inlining helper to use
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1312
     */
    public void inline(AbstractFunctionInliner fi) {}
    /**
     * Simplify a statement into a list of assignments, that can then easily be inlined.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1394
     */
    public void inlinePrepare(AbstractFunctionInliner fi, List<FStatement> stmts) {}
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:88
     */
    protected FStatement convertWhenStmtToIfStmt(Collection<FAbstractEquation> outerEqnList, Collection<FStatement> newStmts, FClass fclass) {
        return this;
    }
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:126
     */
    private boolean isWhen        = false;
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:135
     */
    public void setWhen()        { isWhen = true; }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:20
     */
    public static void scalarizeStmtList(Scalarizer.Algorithm s, List<FStatement> fromList) {
        for (FStatement stmt : fromList) {
            stmt.addSizeAsserts(s.getClauses());
            stmt.scalarize(s);
        }
    }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:27
     */
    public void scalarize(Scalarizer.Algorithm s) {
        s.add(fullCopy());
    }
    /**
     * Creates assert statements to check sizes in assignments between known
     * and unknown sizes. 
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:23
     */
    public void addSizeAsserts(List clauses) {
        if (!inFunction())
            return;
        
        FStatement stmt;
        Set<String> vis = new HashSet<String>();
        for (FAssert a : sizeAssertsColl()) {
            String s = a.prettyPrint("");
            if (!vis.contains(s)) {
                vis.add(s);
                stmt = new FFunctionCallStmt(new List<FFunctionCallLeft>(), a);
                clauses.add(stmt);
            }
        }
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:883
     */
    public void diff(List<FStatement> diffed) {
        throw new UnsupportedOperationException("Can not differentiate statment: " + this);
    }
    /**
     * Flag that controls if this statement should be a part of the set of statements at 
     * the beginning of a function that are generated from variable declarations, and 
     * should be sorted to ensure assignment before use among them.
     * 
     * Set during flattening
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:39
     */
    public boolean shouldBeSorted = false;
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:56
     */
    public void addToSortingMap(Map<String,FStatement> map) {
        if (shouldBeSorted) {
            for (String name : sortingAssignedNames()) {
                FStatement old = map.get(name);
                if (old != null && old != this)
                    extraSortingDependencies().add(old);
                map.put(name, this);
            }
        }
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:68
     */
    private boolean isBeingSorted = false;
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:69
     */
    private boolean addedDuringSorting = false;
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:71
     */
    public void addSortedByAssignmentOrder(
            List<FStatement> stmts, Map<String,FStatement> map) {
        if (isBeingSorted) 
            throw new CircularBindingExpressionException();
        isBeingSorted = true;
        
        for (String depName : sortingDependencies()) {
            FStatement dep = map.get(depName);
            if (dep != null && dep != this)
                dep.addSortedByAssignmentOrder(stmts, map);
        }
        for (FStatement dep : extraSortingDependencies()) {
            if (!dep.addedDuringSorting)
                dep.addSortedByAssignmentOrder(stmts, map);
        }
        
        stmts.add(this);
        addedDuringSorting = true;
        for (String name : sortingAssignedNames())
            map.remove(name);
        
        isBeingSorted = false;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:97
     */
    private Set<FStatement> extraSortingDependencies = null;
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:98
     */
    private Set<FStatement> extraSortingDependencies() {
        if (extraSortingDependencies == null)
            extraSortingDependencies = new LinkedHashSet<FStatement>();
        return extraSortingDependencies;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:103
     */
    private boolean hasExtraSortingDependencies() {
        return extraSortingDependencies != null;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:132
     */
    public static Set<String> sortingAssignedNames(List<FStatement> stmts) {
        Set<String> res = new LinkedHashSet<String>();
        for (FStatement stmt : stmts)
            res.addAll(stmt.sortingAssignedNames());
        return res;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:174
     */
    protected Set<String> baseSortingDependencies() {
        Set<String> res = new LinkedHashSet<String>();
        for (String name : sortingAssignedNames()) 
            res.add("size(" + name + ")");
        return res;
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:181
     */
    public static Set<String> addCompoundStmtSortingDependencies(
            Set<String> set, ASTNode head, List<FStatement> body) {
        head.sortingAddNamesUsed(set);
        for (FStatement stmt : body)
            set.addAll(stmt.sortingDependencies());
        return set;
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:437
     */
    public FStatement copySymbolic() { return (FStatement) super.copySymbolic(); }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:308
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
    	single_XML(str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3654
     */
    public static void printAssignStmt_C(CodeStream str, String indent, String dst, String src) {
        str.print(indent + dst + " = " + src + ";\n");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FStatement() {
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
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
        sortingAssignedNames_reset();
        sortingDependencies_reset();
        myFAlgorithm_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FStatement_relExpInStmt_computed = false;
        FStatement_relExpInStmt_value = null;
        FStatement_relExpInStmt_contributors = null;
        FStatement_eventGenExps_computed = false;
        FStatement_eventGenExps_value = null;
        FStatement_eventGenExps_contributors = null;
        FStatement_sizeAssertsColl_computed = false;
        FStatement_sizeAssertsColl_value = null;
        FStatement_sizeAssertsColl_contributors = null;
        collect_contributors_FStatement_relExpInStmt = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:53
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FStatement clone() throws CloneNotSupportedException {
        FStatement node = (FStatement) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:70
     */
    public abstract FStatement fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:77
     */
    public abstract FStatement treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:85
     */
    public abstract FStatement treeCopy();
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1421
     */
        private boolean collect_contributors_FStatement_relExpInStmt = false;
    protected void collect_contributors_FStatement_relExpInStmt() {
        if(collect_contributors_FStatement_relExpInStmt) return;
        super.collect_contributors_FStatement_relExpInStmt();
        collect_contributors_FStatement_relExpInStmt = true;
    }

    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS() {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInRHS_value = FIdUseExpsInRHS(DefaultFidUseExpLookupVisitor.instance);

        return FIdUseExpsInRHS_value;
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2082
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FIdUseExp use : findFIdUseExpsInTree(visitor))
                    if (!use.useIsAssignment() && !use.myFV().isForIndex())
                        res.add(use);
                res.removeAll(FIdUseExpsInLHS(visitor));
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS() {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInLHS_value = FIdUseExpsInLHS(DefaultFidUseExpLookupVisitor.instance);

        return FIdUseExpsInLHS_value;
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2120
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FIdUseExp use : findFIdUseExpsInTree(visitor))
                    if (use.useIsAssignment() && !use.myFV().isForIndex())
                        res.add(use);
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean canDifferentiate() {
        ASTNode$State state = state();
        boolean canDifferentiate_value = true;

        return canDifferentiate_value;
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
        type_value = fUnknownType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = type().shouldBeDifferentiated();

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInline() {
        ASTNode$State state = state();
        boolean isOkTrivialInline_value = false;

        return isOkTrivialInline_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInlineInFor() {
        ASTNode$State state = state();
        boolean isOkTrivialInlineInFor_value = false;

        return isOkTrivialInlineInFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable() {
        ASTNode$State state = state();
        boolean isInlinable_value = false;

        return isInlinable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isWhen() {
        ASTNode$State state = state();
        boolean isWhen_value = isWhen;

        return isWhen_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sortingAssignedNames_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingAssignedNames_value;
    /**
     * @apilevel internal
     */
    private void sortingAssignedNames_reset() {
        sortingAssignedNames_computed = false;
        sortingAssignedNames_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingAssignedNames() {
        if(sortingAssignedNames_computed) {
            return sortingAssignedNames_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingAssignedNames_value = Collections.<String>emptySet();
        if (isFinal && num == state().boundariesCrossed) {
            sortingAssignedNames_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingAssignedNames_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sortingDependencies_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingDependencies_value;
    /**
     * @apilevel internal
     */
    private void sortingDependencies_reset() {
        sortingDependencies_computed = false;
        sortingDependencies_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingDependencies() {
        if(sortingDependencies_computed) {
            return sortingDependencies_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingDependencies_value = Collections.<String>emptySet();
        if (isFinal && num == state().boundariesCrossed) {
            sortingDependencies_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingDependencies_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "fun";

        return xmlNamespace_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1432
     */
    @ASTNodeAnnotation.Attribute
    public FStatement myFStatement() {
        ASTNode$State state = state();
        FStatement myFStatement_value = getParent().Define_myFStatement(this, null);

        return myFStatement_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1561
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation myFEquation() {
        ASTNode$State state = state();
        FAbstractEquation myFEquation_value = getParent().Define_myFEquation(this, null);

        return myFEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1574
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3730
     */
    @ASTNodeAnnotation.Attribute
    public FAlgorithm myFAlgorithm() {
        if(myFAlgorithm_computed) {
            return myFAlgorithm_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFAlgorithm_value = getParent().Define_myFAlgorithm(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myFAlgorithm_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFAlgorithm_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFAlgorithm_computed = false;
    /**
     * @apilevel internal
     */
    protected FAlgorithm myFAlgorithm_value;
    /**
     * @apilevel internal
     */
    private void myFAlgorithm_reset() {
        myFAlgorithm_computed = false;
        myFAlgorithm_value = null;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1604
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1667
     */
    @ASTNodeAnnotation.Attribute
    public boolean insideBlockStmt() {
        ASTNode$State state = state();
        boolean insideBlockStmt_value = getParent().Define_insideBlockStmt(this, null);

        return insideBlockStmt_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1675
     */
    @ASTNodeAnnotation.Attribute
    public boolean insideBranchedStmt() {
        ASTNode$State state = state();
        boolean insideBranchedStmt_value = getParent().Define_insideBranchedStmt(this, null);

        return insideBranchedStmt_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1884
     */
    @ASTNodeAnnotation.Attribute
    public boolean inEquationSection() {
        ASTNode$State state = state();
        boolean inEquationSection_value = getParent().Define_inEquationSection(this, null);

        return inEquationSection_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1889
     */
    @ASTNodeAnnotation.Attribute
    public boolean inInitialEquationSection() {
        ASTNode$State state = state();
        boolean inInitialEquationSection_value = getParent().Define_inInitialEquationSection(this, null);

        return inInitialEquationSection_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1930
     */
    @ASTNodeAnnotation.Attribute
    public boolean inWhen() {
        ASTNode$State state = state();
        boolean inWhen_value = getParent().Define_inWhen(this, null);

        return inWhen_value;
    }
    /**
     * @attribute inh
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:191
     */
    @ASTNodeAnnotation.Attribute
    public String breakCondName() {
        ASTNode$State state = state();
        String breakCondName_value = getParent().Define_breakCondName(this, null);

        return breakCondName_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:862
     */
    @ASTNodeAnnotation.Attribute
    public FStatement enclosingLoop() {
        ASTNode$State state = state();
        FStatement enclosingLoop_value = getParent().Define_enclosingLoop(this, null);

        return enclosingLoop_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1431
     * @apilevel internal
     */
    public FStatement Define_myFStatement(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:885
     * @apilevel internal
     */
    public boolean Define_expandWithIterExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:177
     * @apilevel internal
     */
    public FExp Define_enclosingIfExpCond(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1421
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpInStmt() {
        if(FStatement_relExpInStmt_computed) {
            return FStatement_relExpInStmt_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FStatement_relExpInStmt_value = relExpInStmt_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FStatement_relExpInStmt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FStatement_relExpInStmt_value;
    }
    Collection FStatement_relExpInStmt_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for relExpInStmt
     */
    public Collection FStatement_relExpInStmt_contributors() {
        if(FStatement_relExpInStmt_contributors == null)
            FStatement_relExpInStmt_contributors  = new LinkedList();
        return FStatement_relExpInStmt_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRelExp> relExpInStmt_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FStatement)) {
            node = node.getParent();
        }
        FStatement root = (FStatement) node;
        root.collect_contributors_FStatement_relExpInStmt();
        FStatement_relExpInStmt_value = new ArrayList<FRelExp>();
        if(FStatement_relExpInStmt_contributors != null)
        for (Iterator iter = FStatement_relExpInStmt_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FStatement_FStatement_relExpInStmt(FStatement_relExpInStmt_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FStatement_relExpInStmt_contributors = null;
        return FStatement_relExpInStmt_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FStatement_relExpInStmt_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRelExp> FStatement_relExpInStmt_value;
    /**
     * @apilevel internal
     */
    private void FStatement_relExpInStmt_reset() {
        FStatement_relExpInStmt_computed = false;
        FStatement_relExpInStmt_value = null;
    }
    /**
     * Collects event generating expressions in this statements
     * @attribute coll
     * @aspect EventGeneratingExps
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3336
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FEventGenExp> eventGenExps() {
        if(FStatement_eventGenExps_computed) {
            return FStatement_eventGenExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FStatement_eventGenExps_value = eventGenExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FStatement_eventGenExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FStatement_eventGenExps_value;
    }
    Collection FStatement_eventGenExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for eventGenExps
     */
    public Collection FStatement_eventGenExps_contributors() {
        if(FStatement_eventGenExps_contributors == null)
            FStatement_eventGenExps_contributors  = new LinkedList();
        return FStatement_eventGenExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FEventGenExp> eventGenExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAlgorithm)) {
            node = node.getParent();
        }
        FAlgorithm root = (FAlgorithm) node;
        root.collect_contributors_FStatement_eventGenExps();
        FStatement_eventGenExps_value = new ArrayList<FEventGenExp>();
        if(FStatement_eventGenExps_contributors != null)
        for (Iterator iter = FStatement_eventGenExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FStatement_FStatement_eventGenExps(FStatement_eventGenExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FStatement_eventGenExps_contributors = null;
        return FStatement_eventGenExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FStatement_eventGenExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FEventGenExp> FStatement_eventGenExps_value;
    /**
     * @apilevel internal
     */
    private void FStatement_eventGenExps_reset() {
        FStatement_eventGenExps_computed = false;
        FStatement_eventGenExps_value = null;
    }
    /**
     * @attribute coll
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:38
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAssert> sizeAssertsColl() {
        if(FStatement_sizeAssertsColl_computed) {
            return FStatement_sizeAssertsColl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FStatement_sizeAssertsColl_value = sizeAssertsColl_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FStatement_sizeAssertsColl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FStatement_sizeAssertsColl_value;
    }
    Collection FStatement_sizeAssertsColl_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for sizeAssertsColl
     */
    public Collection FStatement_sizeAssertsColl_contributors() {
        if(FStatement_sizeAssertsColl_contributors == null)
            FStatement_sizeAssertsColl_contributors  = new LinkedList();
        return FStatement_sizeAssertsColl_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FAssert> sizeAssertsColl_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FFunctionDecl)) {
            node = node.getParent();
        }
        FFunctionDecl root = (FFunctionDecl) node;
        root.collect_contributors_FStatement_sizeAssertsColl();
        FStatement_sizeAssertsColl_value = new ArrayList<FAssert>();
        if(FStatement_sizeAssertsColl_contributors != null)
        for (Iterator iter = FStatement_sizeAssertsColl_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FStatement_FStatement_sizeAssertsColl(FStatement_sizeAssertsColl_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FStatement_sizeAssertsColl_contributors = null;
        return FStatement_sizeAssertsColl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FStatement_sizeAssertsColl_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAssert> FStatement_sizeAssertsColl_value;
    /**
     * @apilevel internal
     */
    private void FStatement_sizeAssertsColl_reset() {
        FStatement_sizeAssertsColl_computed = false;
        FStatement_sizeAssertsColl_value = null;
    }
}
