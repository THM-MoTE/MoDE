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
 * If equation clause.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:688
 * @production FIfEquation : {@link FIfWhenEquation};

 */
public class FIfEquation extends FIfWhenEquation implements Cloneable {
    /**
     * Constructs an if equation.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:261
     */
    public FIfEquation(FEquationType type, List<FAbstractEquation> eqns, FExp guard, Opt<FIfWhenElseEquation> elseClause) {
		this(type, new List<FAttribute>(), eqns, guard, elseClause);
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1392
     */
    public FIfEquation createEmptyNode()   { return new FIfEquation(); }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:259
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        if (getTest().variability().knownParameterOrLess()) {
            try {
                if (getTest().ceval().booleanValue()) {
                    getFAbstractEquations().updateVariabilityForVariablesInWhen(inWhen);
                } else if (hasElse()) {
                    getElse().updateVariabilityForVariablesInWhen(inWhen);
                }
                return;
            } catch (ConstantEvaluationException e) {
                
            }
        }
        super.updateVariabilityForVariablesInWhen(inWhen);
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:359
     */
    public void checkMayContainConnect(ErrorCheckType checkType, FConnectClause connect) {
        super.checkMayContainConnect(checkType, connect);
        FTypePrefixVariability v = getTest().variability();
        if (!v.fixedParameterOrLess()) {
            connect.error("Connect clauses are not allowed in if equations with non-parameter or non-fixed conditions");
        } else {
            if (!getTest().canCeval()) {
                getTest().error("Could not evaluate test expression for if equation containing connect clause");
            }
            getTest().markAsStructuralParameter(checkType);
        }
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:405
     */
    public static final String UNBALANCED_ERROR = 
		"All branches in if equation with non-parameter tests must have the same number of equations";
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:407
     */
    public static final String UNBALANCED_ERROR_WHEN = 
		"All branches in if equation with non-parameter tests within when equation must assign the same variables";
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:410
     */
    public void contentCheck(ErrorCheckType checkType) {
        super.contentCheck(checkType);
        if (isTopWhenIfEquation()) {
            boolean inWhen = inWhen();
            boolean balanced = inWhen ? isBalancedAssignments() : isBalancedEquations();
            boolean functionCallEqu = hasFunctionCallEquations(); 
            if (hasOnlyFixedParamTests()) {
                markTestsAsStructuralParameter(checkType);
            } else {
                if (!balanced) {
                    error(inWhen ? UNBALANCED_ERROR_WHEN : UNBALANCED_ERROR);
                }
            }
        }
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:434
     */
    protected void markTestsAsStructuralParameter(ErrorCheckType checkType) {
        getTest().markAsStructuralParameter(checkType);
        if (hasElse())
            getElse().markTestsAsStructuralParameter(checkType);
    }
    /**
     * Lock this if-expression and return true if it only has only parameter-expression 
     * tests and evaluates to the branch not indicated by <code>then</code>. Otherwise 
     * delegates to {@link #lockBranch(ErrorCheckType)}.
     * 
     * Any parameters used in the test will be marked as structural.
     * 
     * @param checkType  the type of error checks to use when marking structural parameters
     * @param then       if true, we are trying to remove the then-branch, otherwise the else-branch
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:474
     */
    public boolean lockMyBranch(ErrorCheckType checkType, boolean then) {
        if (getTest().lockable(then)) {
		  getTest().markAsStructuralParameter(checkType);
		  return true;
	  } else {
		  return lockBranch(checkType);
	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:891
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (!getTest().type().isUnknown() && !fBooleanScalarType().typeCompatible(getTest().type())) 
		  error("Type of test expression of if equation is not Boolean");
  }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1284
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
		boolean all = true;
		boolean test = false;
		try {
			test = getTest().ceval().booleanValue();
			all = false;
		} catch (ConstantEvaluationException e) {
		}
		getTest().buildConnectionSets(prefix, csm, connect);
		for (FAbstractEquation equ : getFAbstractEquations())
		    equ.buildConnectionSets(prefix, csm, (all || test) && connect);
		if (hasElse())
			getElse().buildConnectionSets(prefix, csm, (all || !test) && connect);
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2389
     */
    public void enableIfEquationElimination() {
		super.enableIfEquationElimination();
		eliminateIfEquation = true;
		is$Final = false;
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2401
     */
    private boolean eliminateIfEquation = false;
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2478
     */
    public void enableIfEquationRewrite() {
		super.enableIfEquationRewrite();
		rewriteIfEquation = true;
		is$Final = false;
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2484
     */
    private boolean rewriteIfEquation = false;
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2491
     */
    public void checkIfEquationCompliance() {
        int numAssigned = referencedFVariablesInLHS().size();
        int numEqs = numScalarEquations();
        if (numAssigned != numEqs)
            compliance("If equations that has non-parameter tests and contains function calls using multiple " +
                    "outputs must assign the same variables in all branches");
    }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2611
     */
    protected static ArrayList<FEquation> unmatchedEquations(
			FIfWhenElseEquation ifEqn, Set<FAbstractVariable> varsInBoth) {
		Set<FEquation> unMatchedAssign = 
			valuesOfUnNamedKeys(ifEqn.assignmentEquationMap(), varsInBoth);
		unMatchedAssign.addAll(ifEqn.nonAssignmentEquationSet());
		return toSortedList(unMatchedAssign, CHILD_ORDER_COMPARATOR);
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2619
     */
    private int[][] matchEquationsMinimizeIncidences(ArrayList<FEquation> left, ArrayList<FEquation> right) {
        int nl = left.size();
        int nr = right.size();
        if (nl == 0 || nr == 0)
            return new int[0][0];
        int[][] weights = new int[nl][nr];
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nr; j++) {
                Set<String> rightVars = right.get(j).referencedVariablesAsStrings();
                weights[i][j] = rightVars.size();
                for (String var : left.get(i).referencedVariablesAsStrings()) 
                    weights[i][j] += rightVars.contains(var) ? -1 : 1;
            }
        }
        return new DenseMunkresProblem(IntegerCost.create(weights)).solve();
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2636
     */
    private void sortOutMatchedEquations(ArrayList<FEquation> eqns, int[][] match, int col, 
	        ArrayList<FEquation> matched, List<FAbstractEquation> remaining) {
	    int n = eqns.size();
        boolean used[] = new boolean[n];
        for (int i = 0; i < match.length; i++) {
            matched.add(eqns.get(match[i][col]));
            used[match[i][col]] = true;
        }
        for (int i = 0; i < n; i++)
            if (!used[i])
                remaining.add(eqns.get(i));
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2717
     */
    public void copyFlagsTo(FIfEquation e) {
        if (isTempAssign()) {
            e.setIsTempAssign();
        }
        if (isWhen()) {
            e.setWhen();
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:787
     */
    @Override
    public Collection<FAbstractEquation> inlineFunctions(AbstractFunctionInliner fi) {
        super.inlineFunctions(fi);
        if (hasElse())
            getElse().inlineFunctions(fi);
        return Collections.singletonList((FAbstractEquation)this);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1201
     */
    @Override
    public void scalarize(Scalarizer.Equation s) {
        boolean lockedBranch = false;
        if (getTest().variability().indexParameterOrLess()) {
            try {
                if (getTest().ceval().booleanValue()) {
                    scalarizeList(s, getFAbstractEquations());
                } else if (hasElse()) {
                    scalarizeList(s, getElse().getFAbstractEquations());
                }
                lockedBranch = true;
            } catch (ConstantEvaluationException e) {}
        }
        if (!lockedBranch) {
            super.scalarize(s);
        }
    }
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:404
     */
    @Override
    public SimpleEquationBlock createSimpleEquationBlock(Collection<FVariable> fvs, Collection<Integer> assignedIndices, Solvability solvability, EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) { 
        if (numScalarEquations() == 0)
            return new MetaEquationBlock(producer, blockDependency, this);
        for (Integer assignedIndex : assignedIndices)
            if (assignedIndex == null)
                throw new IllegalArgumentException("FIfEquation, AssignedIndex must be set for this class type! equation: " + this);
        if (solvability.isAnalyticallySolvable()) {
            return new SolvedIfEquationBlock(producer, blockDependency, this, fvs, assignedIndices);
        } else {
            return new UnsolvedIfEquationBlock(producer, blockDependency, this, fvs, assignedIndices);
        }
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:2205
     */
    @Override
    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, C extends SCCBlock<E, V>>
    AbstractBiPGraph<E, V, C>.IncidenceMap createIncidenceMap(AbstractBiPGraph<E, V, C> g, EnumSet<AbstractBiPGraph.VarType> variableTypes,
            AbstractBiPGraph.VariableResolver<E, V> resolver) {
        return g.new ManyIncidenceMap(this, resolver, variableTypes);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1811
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        if (isWhen() && p.inInitialSystem() && !getTest().isInitialGuard()) {
            return;
        }
        genIfStart_C(p, str, indent);
        for (FAbstractEquation equation : getFAbstractEquations())
            p.print(equation, str, p.indent(indent));
        if (hasElse()) {
            p.print(getElse(), str,indent);
        }
        genIfEnd_C(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2270
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(getTest(), str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2275
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        p.printPostSteps(getTest(), str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3516
     */
    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        super.genBlock_C(p, str, indent, visited, forVariables, forIndices);
        if (hasElse())
            getElse().genBlock_C(p, str, indent, visited, forVariables, forIndices);
        genIfEnd_C(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3548
     */
    @Override
    public void genBlockEval_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        super.genBlockEval_C(p, str, indent, visited, forVariables, forIndices);
        if (hasElse())
            getElse().genBlockEval_C(p, str, indent, visited, forVariables, forIndices);
        genIfEnd_C(p, str, indent);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIfEquation() {
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
        children = new ASTNode[7];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new Opt(), 4);
        setChild(new List(), 5);
        setChild(new Opt(), 6);
    }
    /**
     * @declaredat ASTNode:18
     */
    public FIfEquation(FEquationType p0, List<FAttribute> p1, List<FAbstractEquation> p2, FExp p3, Opt<FIfWhenElseEquation> p4) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:28
     */
    protected int numChildren() {
        return 5;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public FIfEquation clone() throws CloneNotSupportedException {
        FIfEquation node = (FIfEquation) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FIfEquation copy() {
        try {
            FIfEquation node = (FIfEquation) clone();
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
    public FIfEquation fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FIfEquation treeCopyNoTransform() {
        FIfEquation tree = (FIfEquation) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 6:
                    tree.children[i] = new Opt();
                    continue;
                case 5:
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
     * @declaredat ASTNode:121
     */
    public FIfEquation treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:128
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FEquationType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FEquationType getType() {
        return (FEquationType) getChild(0);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FEquationType getTypeNoTransform() {
        return (FEquationType) getChildNoTransform(0);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 1);
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
        List<FAttribute> list = (List<FAttribute>) getChild(1);
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
        return (List<FAttribute>) getChildNoTransform(1);
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
     * Replaces the FAbstractEquation list.
     * @param list The new list node to be used as the FAbstractEquation list.
     * @apilevel high-level
     */
    public void setFAbstractEquationList(List<FAbstractEquation> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAbstractEquation")
    public List<FAbstractEquation> getFAbstractEquationList() {
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(2);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Replaces the Test child.
     * @param node The new node to replace the Test child.
     * @apilevel high-level
     */
    public void setTest(FExp node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the Test child.
     * @return The current node used as the Test child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Test")
    public FExp getTest() {
        return (FExp) getChild(3);
    }
    /**
     * Retrieves the Test child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Test child.
     * @apilevel low-level
     */
    public FExp getTestNoTransform() {
        return (FExp) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Else child. This is the <code>Opt</code>
     * node containing the child Else, not the actual child!
     * @param opt The new node to be used as the optional node for the Else child.
     * @apilevel low-level
     */
    public void setElseOpt(Opt<FIfWhenElseEquation> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) Else child.
     * @param node The new node to be used as the Else child.
     * @apilevel high-level
     */
    public void setElse(FIfWhenElseEquation node) {
        getElseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Else child exists.
     * @return {@code true} if the optional Else child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasElse() {
        return getElseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Else child.
     * @return The Else child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FIfWhenElseEquation getElse() {
        return (FIfWhenElseEquation) getElseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * @return The optional node for child the Else child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Else")
    public Opt<FIfWhenElseEquation> getElseOpt() {
        return (Opt<FIfWhenElseEquation>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Else.
     * @apilevel low-level
     */
    public Opt<FIfWhenElseEquation> getElseOptNoTransform() {
        return (Opt<FIfWhenElseEquation>) getChildNoTransform(4);
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * @return Number of children in the InitialEquation list.
     * @apilevel high-level
     */
    public int getNumInitialEquation() {
        return getInitialEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InitialEquation list.
     * @apilevel low-level
     */
    public int getNumInitialEquationNoTransform() {
        return getInitialEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InitialEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InitialEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getInitialEquation(int i) {
        return (FAbstractEquation) getInitialEquationList().getChild(i);
    }
    /**
     * Check whether the InitialEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInitialEquation() {
        return getInitialEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InitialEquation list.
     * @param node The element to append to the InitialEquation list.
     * @apilevel high-level
     */
    public void addInitialEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getInitialEquationListNoTransform() : getInitialEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInitialEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getInitialEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InitialEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInitialEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getInitialEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InitialEquation list.
     * @return The the child position of the InitialEquation list.
     * @apilevel low-level
     */
    protected int getInitialEquationListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InitialEquation list.
     * @return The node representing the InitialEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getInitialEquations() {
        return getInitialEquationList();
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationsNoTransform() {
        return getInitialEquationListNoTransform();
    }
    /**
     * Replaces the (optional) DynamicFAbstractEquation child.
     * @param node The new node to be used as the DynamicFAbstractEquation child.
     * @apilevel high-level
     */
    public void setDynamicFAbstractEquation(FAbstractEquation node) {
        getDynamicFAbstractEquationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional DynamicFAbstractEquation child exists.
     * @return {@code true} if the optional DynamicFAbstractEquation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDynamicFAbstractEquation() {
        return getDynamicFAbstractEquationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) DynamicFAbstractEquation child.
     * @return The DynamicFAbstractEquation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FAbstractEquation getDynamicFAbstractEquation() {
        return (FAbstractEquation) getDynamicFAbstractEquationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child DynamicFAbstractEquation. This is the <code>Opt</code> node containing the child DynamicFAbstractEquation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    public Opt<FAbstractEquation> getDynamicFAbstractEquationOptNoTransform() {
        return (Opt<FAbstractEquation>) getChildNoTransform(6);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 6;
    }
    @ASTNodeAnnotation.Attribute
    public List<FAbstractEquation> getInitialEquationList() {
        ASTNode$State state = state();
        List<FAbstractEquation> getInitialEquationList_value = getInitialEquationList_compute();
        setChild(getInitialEquationList_value, getInitialEquationListChildPosition());

        List<FAbstractEquation> node = (List<FAbstractEquation>) this.getChild(getInitialEquationListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<FAbstractEquation> getInitialEquationList_compute() {
            return createInitialEquationList();
        }
    @ASTNodeAnnotation.Attribute
    public String ifWhenType() {
        ASTNode$State state = state();
        String ifWhenType_value = "if";

        return ifWhenType_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:143
     */
    @ASTNodeAnnotation.Attribute
    public boolean isReal(boolean exclusive) {
        ASTNode$State state = state();
        try {
                return super.isReal(exclusive) && (!exclusive || (!hasElse() || getElse().isReal()));
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:146
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
                if (isWhen())
                    return fDiscrete();
                FTypePrefixVariability var = super.variability();
                if (hasElse())
                    var = var.combine(getElse().variability());
                return var;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBalancedEquations() {
        ASTNode$State state = state();
        boolean isBalancedEquations_value = hasElse() ? elseIsBalancedEquations() : numScalarEquations() == 0;

        return isBalancedEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBalancedAssignments() {
        ASTNode$State state = state();
        boolean isBalancedAssignments_value = hasElse() ? elseIsBalancedAssignments() : numScalarEquations() == 0;

        return isBalancedAssignments_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldEliminateIf() {
        ASTNode$State state = state();
        boolean shouldEliminateIf_value = getTest().isConstantExp();

        return shouldEliminateIf_value;
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2649
     */
    @ASTNodeAnnotation.Attribute
    public List createIfExpEquationList() {
        ASTNode$State state = state();
        try {
        		List<FAbstractEquation> l = new List<FAbstractEquation>();
        		
        		// Generate equations for assignment equations that can be matched
        		Set<FAbstractVariable> varsInBoth = assignmentEquationMap().keySet();
        		if (hasElse())
        		    varsInBoth = intersection(varsInBoth, getElse().assignmentEquationMap().keySet()); 
        		for (FAbstractVariable v : toSortedList(varsInBoth, FAbstractVariable.NAME_COMPARATOR)) {
        			FExp left = assignmentEquationMap().get(v).assignmentExp().fullCopy();
        			FExp right = getElse().assignmentEquationMap().get(v).assignmentExp().fullCopy();
        			FIfExp ifExp = new FIfExp(getTest().fullCopy(), left, right);
        			FEquation e = new FEquation(getType().fullCopy(), v.createUseExp(), ifExp);
        			if (isWhen()) {
        				ifExp.setWhen();
        				e.setWhen();
        			}
        			l.add(e);
        		}
        		
        		// Find equations to match up among remaining FEquations based on indices
                ArrayList<FEquation> unmatchedLeft = unmatchedEquations(this, varsInBoth);
                ArrayList<FEquation> unmatchedRight;
                if (hasElse())
                    unmatchedRight = unmatchedEquations(getElse(), varsInBoth);
                else
                    unmatchedRight = new ArrayList<FEquation>();
                
                int[][] match = matchEquationsMinimizeIncidences(unmatchedLeft, unmatchedRight);
                
        		// Sort remaining equations into those that should remain in if equation and those that should become residual eqns
                // Left side
        		ArrayList<FEquation> residualLeft = new ArrayList<FEquation>();
                List<FAbstractEquation> keepLeft = new List<FAbstractEquation>();
                sortOutMatchedEquations(unmatchedLeft, match, 0, residualLeft, keepLeft);
                keepLeft.addAll(toSortedList(nonFEquationSet(), CHILD_ORDER_COMPARATOR));
                // Right side
                ArrayList<FEquation> residualRight = new ArrayList<FEquation>();
                List<FAbstractEquation> keepRight = new List<FAbstractEquation>();
                sortOutMatchedEquations(unmatchedRight, match, 1, residualRight, keepRight);
                if (hasElse())
                    keepRight.addAll(toSortedList(getElse().nonFEquationSet(), CHILD_ORDER_COMPARATOR));
                
                // Generate residual equations
        		for (FEquation[] eqs : new ParallelIterable<FEquation>(new FEquation[2], true, residualLeft, residualRight)) {
        			FExp left = eqs[0].createResidualExp();
        			FExp right = eqs[1].createResidualExp();
        			FIfExp ifExp = new FIfExp(getTest().fullCopy(), left, right);
        			l.add(new FEquation(getType().fullCopy(), eqs[0].type().zeroLiteral(), ifExp));
        		}
        		
        		// Generate new if equation with remaining equations
        		FIfEquation e;
        		if (keepLeft.getNumChild() > 0) {
        		    Opt<FIfWhenElseEquation> elseOpt = new Opt<FIfWhenElseEquation>();
        		    if (keepRight.getNumChild() > 0) 
        		        elseOpt.addChild(new FElseEquation(getType().fullCopy(), keepRight));
        		    e = new FIfEquation(getType().fullCopy(), keepLeft, getTest(), elseOpt);
                    copyFlagsTo(e);
        		    l.add(e);
        		} else if (keepRight.getNumChild() > 0) {
                    e = new FIfEquation(getType().fullCopy(), keepRight, new FNotExp(getTest()), new Opt());
                    copyFlagsTo(e);
                    l.add(e);
        		}
        		
        		return l;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = super.hasInlinableFunctions(fi) || (hasElse() && getElse().hasInlinableFunctions(fi));

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    /**
     * @attribute syn
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:83
     */
    @ASTNodeAnnotation.Attribute
    public Collection<FAbstractEquation> diff(String name) {
        ASTNode$State state = state();
        try {
                if (isWhen()) {
                    throw new EquationDifferentiationException(this, "Cannot differentate the equation:\n   " + prettyPrint(""));
                }
                try {
                    Opt<FIfWhenElseEquation> elseOpt = hasElse() ?
                        new Opt<FIfWhenElseEquation>((FElseEquation)getElse().diff(name).iterator().next()):
                        new Opt<FIfWhenElseEquation>();
                    return Arrays.asList(dynamicFAbstractEquation(
                            new FIfEquation(getType().treeCopy(), FAbstractEquation.diffList(name, getFAbstractEquations()), getTest().treeCopy(), elseOpt)));
                } catch (ExpressionDifferentiationException e) {
                    throw new EquationDifferentiationException(this, e.toQuotedString() + " in equation:\n   " + this);
                }
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:454
     */
    @ASTNodeAnnotation.Attribute
    public boolean isTopWhenIfEquation() {
        ASTNode$State state = state();
        boolean isTopWhenIfEquation_value = getParent().Define_isTopWhenIfEquation(this, null);

        return isTopWhenIfEquation_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:773
     * @apilevel internal
     */
    public boolean Define_inDeadIfBranch(ASTNode caller, ASTNode child) {
        if (caller == getElseOptNoTransform()) {
            return getTest().inDeadIfBranchTest(true);
        }
        else if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getTest().inDeadIfBranchTest(false);
        }
        else {
            return getParent().Define_inDeadIfBranch(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:210
     * @apilevel internal
     */
    public boolean Define_inIfTestWithoutConnect(ASTNode caller, ASTNode child) {
        if (caller == getTestNoTransform()) {
            return !containsConnect();
        }
        else {
            return getParent().Define_inIfTestWithoutConnect(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:421
     * @apilevel internal
     */
    public boolean Define_lockBranch(ASTNode caller, ASTNode child, ErrorCheckType checkType) {
        if (caller == getElseOptNoTransform()) {
            return lockMyBranch(checkType, false);
        }
        else if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return lockMyBranch(checkType, true);
        }
        else {
            return getParent().Define_lockBranch(this, caller, checkType);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2407
        if (eliminateIfEquation) {
            state().duringIfEquations++;
            ASTNode result = rewriteRule0();
            state().duringIfEquations--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2730
        if (rewriteIfEquation) {
            state().duringIfEquations++;
            ASTNode result = rewriteRule1();
            state().duringIfEquations--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2407
     * @apilevel internal
     */
    private FIfWhenElseEquation rewriteRule0() {
{
			eliminateIfEquation = false;
			
			if (shouldEliminateIf()) {
				try {
					if (getTest().ceval().booleanValue())
						return new FElseEquation(getType(), getFAbstractEquations());
					else if (hasElse())
						return getElse();
					else
						return new FElseEquation(getType(), new List());
				} catch (ConstantEvaluationException e) {}
			}
			
			return this;
		}    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2730
     * @apilevel internal
     */    private FElseEquation rewriteRule1() {
        return new FElseEquation(getType(), createIfExpEquationList());
    }
    protected void collect_contributors_FAbstractEquation_transformedGuards() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1316
     */
        if (isWhen()) {
            {
                FAbstractEquation ref = (FAbstractEquation) (this);
                if (ref != null) {
                    ref.FAbstractEquation_transformedGuards_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_transformedGuards();
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(Set<FExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(collection);
        if (isWhen())
            collection.add(getTest());
    }

}
