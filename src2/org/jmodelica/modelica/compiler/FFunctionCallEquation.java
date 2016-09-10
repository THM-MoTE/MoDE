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
 * An equation consisting of a left hand side that is a list of component 
 * references and a right hand side that is a function call.
 * 
 * Example: (x, y, z) = func(a, b);
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:586
 * @production FFunctionCallEquation : {@link FAbstractEquation} ::= <span class="component">Left:{@link FFunctionCallLeft}*</span> <span class="component">Call:{@link FAbstractFunctionCall}</span>;

 */
public class FFunctionCallEquation extends FAbstractEquation implements Cloneable {
    /**
     * Constructs a function call equation that is not initial.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:120
     */
    public FFunctionCallEquation(List<FFunctionCallLeft> left, FAbstractFunctionCall call) {
		this(new FNormalEquation(), new List<FAttribute>(), left, call);
	}
    /**
     * Constructs a function call equation.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:127
     */
    public FFunctionCallEquation(FEquationType type, List<FFunctionCallLeft> left, FAbstractFunctionCall call) {
		this(type, new List<FAttribute>(), left, call);
	}
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3929
     */
    public void calculateEquationSparsity(
            ArrayList<Integer>[] sp, int i, Set<? extends FVariable> vars, int offset) {
        Set<FVariable> rv = FClass.intersectFVSet(referencedFVariablesInRHS(), vars);
//      Set<FVariable> lv = FClass.intersectFVSet(referencedFVariablesInLHS(), vars);
        Set<FVariable> lv = referencedFVariablesInLHS();
        
        for (FVariable fv : lv) {
//          sp[fv.indexInZ() - offset].add(new Integer(i)); 
            if (vars.contains(fv))
                sp[fv.indexInZ() - offset].add(new Integer(i)); 
            for (FVariable ffv : rv) {
                if (ffv != fv) {
                    sp[ffv.indexInZ() - offset].add(new Integer(i)); 
                }
            }
            i++;     
        }
    }
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:480
     */
    public void addToParameterEquationsMap(
			Map<FAbstractVariable,FAbstractEquation> map) {
		for (FFunctionCallLeft left : getLefts())
			if (left.hasFExp())
				left.getFExp().addToParameterEquationsMap(map, this);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1348
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);
		if (getNumLeft() > 0) {
	   		str.print("(");
	   		getLefts().prettyPrintWithSep(p, str, indent, ", ");
	   		str.print(") = ");
		}
   		p.print(getCall(), str, indent);
        getFAttributeList().prettyPrintFAnnotationAttributeList(str, p);
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:281
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        if (inWhen) {
            for (FFunctionCallLeft left : getLefts()) {
                if (left.hasFExp()) {
                    left.getFExp().makeContinuousVariablesDiscrete();
                }
            }
        }
    }
    /**
     * @aspect AssertEval
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1537
     */
    @Override
    public boolean evaluateAsserts(boolean inClause) {
        return getCall().evaluateAsserts(inClause);
    }
    /**
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1662
     */
    public void collectReinits(Map<FAbstractVariable,Set<FReinit>> map) {
        getCall().collectReinits(map);
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:106
     */
    public void flattenEqn(List<FAbstractEquation> l, FQName prefix, FClass fc) {
        if (ignoreInFlattening()) {
            return;
        }
        FExp call = getCall().flatten(prefix);
        if (!(call instanceof FAbstractFunctionCall)) {
            return;
        }
        List<FFunctionCallLeft> lefts = new List<FFunctionCallLeft>();
        for (FFunctionCallLeft left : getLefts()) { 
            lefts.add(left.flatten(prefix));
        }
        FFunctionCallEquation flattened =  new FFunctionCallEquation(lefts, (FAbstractFunctionCall) call);
        flattenAttrs(flattened, prefix);
        l.add(flattened);
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:108
     */
    public void sanityCheckParameterEquations(FClass fc) {
        for (FFunctionCallLeft left : getLefts())
            if (left.hasFExp())
                left.getFExp().sanityCheckParameterEquationLeft(fc, this);
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2224
     */
    @Override
    public void insertTempsInLHS(FClass fClass, boolean param) {
        for (FFunctionCallLeft left : getLefts()) {
            left.insertTempsInLHS(fClass, param);
        }
    }
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2933
     */
    public void removeBindingExpOfAssignedVars() {
		for (FFunctionCallLeft left : getLefts())
			if (left.hasFExp())
				left.getFExp().removeBindingExpOfReferencedVars();
	}
    /**
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3686
     */
    public void makeReinitedVarsStates() {
        getCall().makeReinitedVarsStates();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:765
     */
    @Override
    public Collection<FAbstractEquation> inlineFunctions(AbstractFunctionInliner fi) {
        if (getCall().isInlinableFunctionCall(fi)) {
            getCall().inline(fi);
            ArrayList<FFunctionVariable> outs = ((FFunctionCall) getCall()).myCallOutputs();
            int n = getNumLeft();
            ArrayList<FAbstractEquation> list = new ArrayList<FAbstractEquation>();
            for (int i = 0; i < n; i++) {
                if (getLeft(i).hasFExp()) {
                    FQName name = outs.get(i).getFQName().fullCopy();
                    name.removeFArraySubscripts();
                    name.scalarized = true;
                    getLeft(i).getFExp().createInliningOutputEquations(list, fi, name);
                }
            }
            return fi.handleInlinedFunctionCallEquation(this, list);
        } else {
            getCall().inlineFunctions(fi);
            return Collections.singletonList((FAbstractEquation)this);
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:20
     */
    public boolean taggedForCleanup = false;
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:39
     */
    public void cleanEquations(ArrayList<FAbstractEquation> l) {
        super.cleanEquations(l);
        if (taggedForCleanup) {
            for (FFunctionCallLeft left : getLefts()) {
                left.cleanEquations();
            }
            taggedForCleanup = false;
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:337
     */
    public void variabilityPropagation(FClass.VariabilityPropagator propagator) {
        
        FTypePrefixVariability variability = getCall().variability();
        for (FFunctionCallLeft left : getLefts()) {
            if (left.hasFExp() && !left.getFExp().canPropagate()) {
                variability = fContinuous();
                break;
            }
        }
        boolean eval = potentialPartialVariability().knownParameterOrLess();
        
        CValue[] val = null;
        if (eval) {
            try {
                VariableEvaluator evaluator;
                boolean fullEval = variability.knownParameterOrLess();
                if (fullEval) {
                    evaluator = defaultVariableEvaluator();
                } else {
                    evaluator = new PartialVariableEvaluator();
                }
                val = getCall().evaluate(evaluator);
            } catch (ConstantEvaluationException e) {
                eval = false;
            }
        }
        
        boolean allRemoved = true;
        int i = 0;
        for (FFunctionCallLeft left : getLefts()) {
            if (left.hasFExp()) {
                if (left.getFExp().canPropagate()) {
                    left.taggedByVProp = left.getFExp().variabilityPropagation(propagator,
                            eval ? val[i] : CValue.UNKNOWN, variability);
                }
                allRemoved &= left.taggedByVProp;
            }
            i++;
        }
        
        if (allRemoved) {
            this.taggedByVProp = true;
        } else {
            variability = variability.combine(fFixedParameter());
            if (variability.parameterVariability()) {
                propagator.addEquation(variability, this);
                this.taggedByVProp = true;
            }
        }
        this.taggedForCleanup = true;
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:654
     */
    public void enableConstantFolding() {
		for (FExp childExp : getCall().childFExps()) {
			childExp.enableConstantFolding();
		}
	}
    /**
     * Scalarize equation and put all scalarized equations in list eqns.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1168
     */
    public void scalarize(Scalarizer.Equation s) {
        createArrayTemporaries(s);
	    if (getCall().isVectorizedOperatorWithoutOutputs()) { // Special case
	        for (FExp e : getCall().getArray().iterable()) {
                FAbstractFunctionCall call = (FAbstractFunctionCall) e.scalarizeExp(s.map());
	            List<FFunctionCallLeft> lefts = new List<FFunctionCallLeft>();
                s.add(new FFunctionCallEquation(lefts, call));
	        }
	    } else {
	        List<FFunctionCallLeft> lefts = new List<FFunctionCallLeft>();
            for (FFunctionCallLeft id : getLefts()) {
                lefts.add(id.scalarize(s.map()));
            }
	        s.add(new FFunctionCallEquation(lefts, (FAbstractFunctionCall) getCall().scalarizeExp(s.map())));
	    }
	}
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:390
     */
    @Override
	public SimpleEquationBlock createSimpleEquationBlock(Collection<FVariable> fvs, Collection<Integer> assignedIndices, Solvability solvability, EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) {
		if (numScalarEquations() == 0)
			return new MetaEquationBlock(producer, blockDependency, this);
		for (Integer assignedIndex : assignedIndices)
			if (assignedIndex == null)
				throw new IllegalArgumentException("FFunctionCallEquation, AssignedIndex must be set for this class type! equation: " + this);
		if (solvability.isAnalyticallySolvable()) {
			return new SolvedFunctionCallEquationBlock(producer, blockDependency, this, fvs, assignedIndices);
		} else {
			return new UnsolvedFunctionCallEquationBlock(producer, blockDependency, this, fvs, assignedIndices);
		}
	}
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:2213
     */
    @Override
    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, C extends SCCBlock<E, V>> 
    AbstractBiPGraph<E, V, C>.IncidenceMap createIncidenceMap(AbstractBiPGraph<E, V, C> g, EnumSet<AbstractBiPGraph.VarType> variableTypes,
            AbstractBiPGraph.VariableResolver<E, V> resolver) {
        if (myOptions().getStringOption("function_incidence_computation").equals("all")) {
            try {
                AbstractBiPGraph<E, V, C>.SplitIncidenceMap splitIncidenceMap = g.new SplitIncidenceMap(this, resolver, variableTypes);
                splitIncidenceMap.lhs(); // trigger cache calculations
                return splitIncidenceMap;
            } catch (ConstantEvaluationException e) {
                
            }
        }
        return g.new ManyIncidenceMap(this, resolver, variableTypes);
    }
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:652
     */
    @Override
    public <V> AbstractBiPGraph.AssignmentIncidenceMap assignmentIncidenceMap(AbstractBiPGraph g, EnumSet<AbstractBiPGraph.VarType> variableTypes, AbstractBiPGraph.VariableResolver resolver) {
        return g.new SplitIncidenceMap(this, resolver, variableTypes);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:243
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		if (!getCall().isIgnoredXML()) {
			String indent2 = p.indent(indent);
			open_XML(str, indent);
			for (FFunctionCallLeft f : this.getLeftList())
				p.print(f, str, indent2);
			p.print(getCall(), str, indent2);
			close_XML(str, indent);
		}
	}
    /**
     * Generates AD-code for a FunctionCallEquation, i.e. an equation of the sort <outs> = f(<ins>). 
     * FFunctionCallLeft is looped over and their base index is set to i. This is needed since the call 
     * has several outputs which need to be aware of which index in the residual and dF vector that they should fill.
     * The call is then made and the variables are set. Then a write back function, which prints the residual code is called.
     * 
     * @see FAbstractEquation#genResidual_CAD(Enumerator, String, CodeStream, Set, Collection)
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:865
     */
    @Override
    public void genResidual_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        boolean firstVisit = visited == null ? true : visited.add(this);
        if (!getCall().isIgnored()) {
            if (firstVisit) {
                genTempVars_CAD(printer_CAD, str, indent);
            }
            Enumerator indexCounter = new Enumerator();
            for (FFunctionCallLeft l : getLefts())
                l.genWriteBack_CAD(str, indent, enumerator, forIndices, indexCounter);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1196
     */
    @Override
    public void genBlock_CAD(String indent, CodeStream str, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        boolean firstVisit = visited == null ? true : visited.add(this);
        if (!getCall().isIgnored()) {
            if (firstVisit)
                printer_CAD.printPreSteps(this, str, indent);
            int i = 0;
            for (FFunctionCallLeft l : getLefts()) {
                l.setEquationIndex(i++);
                l.genWriteBackAssignment_CAD(str, indent, new HashSet<FVariable>(forVariables));
            }
            if (firstVisit)
                printer_CAD.printPostSteps(this, str, indent);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2113
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		if (!getCall().isIgnored())
			genTempVars_CAD(p, str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1801
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		if (!getCall().isIgnored()) {
			p.printPreSteps(this, str, indent);
			p.print(getCall(), str, indent);
            p.printPostSteps(this, str, indent);
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3434
     */
    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        if (!getCall().isIgnored()) {
            genBlockEval_C(p, str, indent, visited, forVariables, forIndices);
            for (FFunctionCallLeft l : getLefts()) {
                l.genWriteBackAssignment_C(str, indent, forVariables);
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3445
     */
    @Override
    public void genBlockEval_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        boolean firstVisit = visited == null || visited.add(this);
        if (!getCall().isIgnored()) {
            if (firstVisit) {
                p.printPreSteps(this, str, indent);
                p.print(getCall(), str, indent);
                p.printPostSteps(this, str, indent);
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3580
     */
    @Override
    public void genResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        boolean firstVisit = visited == null || visited.add(this);
        if (!getCall().isIgnored()) {
            if (firstVisit) {
                p.printPreSteps(this, str, indent);
                p.print(getCall(), str, indent);
                p.printPostSteps(this, str, indent);
            }
            Enumerator indexCounter = new Enumerator();
            for (FFunctionCallLeft l : getLefts())
                l.genWriteBackResidual_C(str, indent, enumerator, forIndices, indexCounter);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:621
     */
    @Override
    public void genReinitTempDecls_C(CodePrinter p, CodeStream str, String indent) {
        getCall().genReinitTempDecls_C(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:669
     */
    @Override
    public void genReinitTempInits_C(CodePrinter p, CodeStream str, String indent) {
        getCall().genReinitTempInits_C(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:738
     */
    @Override
    public void collectReinits_C(Map<String, ArrayList<FReinit>> map, boolean initial) {
        getCall().collectReinits_C(map, initial);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionCallEquation() {
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
        children = new ASTNode[6];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 4);
        setChild(new Opt(), 5);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FFunctionCallEquation(FEquationType p0, List<FAttribute> p1, List<FFunctionCallLeft> p2, FAbstractFunctionCall p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:26
     */
    protected int numChildren() {
        return 4;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        assignedSet_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:51
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public FFunctionCallEquation clone() throws CloneNotSupportedException {
        FFunctionCallEquation node = (FFunctionCallEquation) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public FFunctionCallEquation copy() {
        try {
            FFunctionCallEquation node = (FFunctionCallEquation) clone();
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
     * @declaredat ASTNode:83
     */
    public FFunctionCallEquation fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public FFunctionCallEquation treeCopyNoTransform() {
        FFunctionCallEquation tree = (FFunctionCallEquation) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 5:
                    tree.children[i] = new Opt();
                    continue;
                case 4:
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
     * @declaredat ASTNode:120
     */
    public FFunctionCallEquation treeCopy() {
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
     * Replaces the Left list.
     * @param list The new list node to be used as the Left list.
     * @apilevel high-level
     */
    public void setLeftList(List<FFunctionCallLeft> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the Left list.
     * @return Number of children in the Left list.
     * @apilevel high-level
     */
    public int getNumLeft() {
        return getLeftList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Left list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Left list.
     * @apilevel low-level
     */
    public int getNumLeftNoTransform() {
        return getLeftListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Left list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Left list.
     * @apilevel high-level
     */
    public FFunctionCallLeft getLeft(int i) {
        return (FFunctionCallLeft) getLeftList().getChild(i);
    }
    /**
     * Check whether the Left list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasLeft() {
        return getLeftList().getNumChild() != 0;
    }
    /**
     * Append an element to the Left list.
     * @param node The element to append to the Left list.
     * @apilevel high-level
     */
    public void addLeft(FFunctionCallLeft node) {
        List<FFunctionCallLeft> list = (parent == null || state == null) ? getLeftListNoTransform() : getLeftList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addLeftNoTransform(FFunctionCallLeft node) {
        List<FFunctionCallLeft> list = getLeftListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Left list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setLeft(FFunctionCallLeft node, int i) {
        List<FFunctionCallLeft> list = getLeftList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Left list.
     * @return The node representing the Left list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Left")
    public List<FFunctionCallLeft> getLeftList() {
        List<FFunctionCallLeft> list = (List<FFunctionCallLeft>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Left list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Left list.
     * @apilevel low-level
     */
    public List<FFunctionCallLeft> getLeftListNoTransform() {
        return (List<FFunctionCallLeft>) getChildNoTransform(2);
    }
    /**
     * Retrieves the Left list.
     * @return The node representing the Left list.
     * @apilevel high-level
     */
    public List<FFunctionCallLeft> getLefts() {
        return getLeftList();
    }
    /**
     * Retrieves the Left list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Left list.
     * @apilevel low-level
     */
    public List<FFunctionCallLeft> getLeftsNoTransform() {
        return getLeftListNoTransform();
    }
    /**
     * Replaces the Call child.
     * @param node The new node to replace the Call child.
     * @apilevel high-level
     */
    public void setCall(FAbstractFunctionCall node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the Call child.
     * @return The current node used as the Call child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Call")
    public FAbstractFunctionCall getCall() {
        return (FAbstractFunctionCall) getChild(3);
    }
    /**
     * Retrieves the Call child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Call child.
     * @apilevel low-level
     */
    public FAbstractFunctionCall getCallNoTransform() {
        return (FAbstractFunctionCall) getChildNoTransform(3);
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
        return 4;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(4);
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
        return (Opt<FAbstractEquation>) getChildNoTransform(5);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 5;
    }
    /**
     * Constant evaluation of binding equation for dependent parameter.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3063
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalParameter(VariableEvaluator evaluator, FVariable fv) {
        ASTNode$State state = state();
        try {
        	  CValue[] vals = getCall().cevalFunction(evaluator);
        	  for (int i = 0; i < getNumLeft(); i++) {
        		  CValue res = getLeft(i).extractCValue(vals[i], fv);
        		  if (res != null)
        			  return res;
        	  }
        	  return CValue.UNKNOWN;
          }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1143
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        ASTNode$State state = state();
        try {
                int res = 0;
                for (FFunctionCallLeft l : getLefts())
                    res += l.numScalarElements();
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1516
     */
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> boundParameters() {
        ASTNode$State state = state();
        try { 
                if (isParameterEquation()) { 
                    return referencedParametersInLHS(); 
                } else {
                    return Collections.emptySet();
                }
            }
        finally {
        }
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
            if (getCall() instanceof FSpatialDistExp) {
                FSpatialDistExp call = (FSpatialDistExp) getCall();
                ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
                if (getNumLeft() > 0 && getLeft(0).hasFExp()) {
                    l.add(new FEquation(getLeft(0).getFExp().copySymbolic(), call.createInitialReplacement(false)));
                }
                if (getNumLeft() > 1 && getLeft(1).hasFExp()) {
                    l.add(new FEquation(getLeft(1).getFExp().copySymbolic(), call.createInitialReplacement(true)));
                }
                return new List<FAbstractEquation>(l);
            }
            return super.getInitialEquationList();
        }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInRHS_FIdUseExpLookupVisitor_value = getCall().findFIdUseExpsInTree(visitor);

        return FIdUseExpsInRHS_FIdUseExpLookupVisitor_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInLHS_FIdUseExpLookupVisitor_value = getLefts().findFIdUseExpsInTree(visitor);

        return FIdUseExpsInLHS_FIdUseExpLookupVisitor_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedParametersInLHS() {
        ASTNode$State state = state();
        Set<FVariable> referencedParametersInLHS_value = parametersInSet(referencedFVariablesInLHS());

        return referencedParametersInLHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean ignoreInFlattening() {
        ASTNode$State state = state();
        boolean ignoreInFlattening_value = getCall().ignoreInFlattening();

        return ignoreInFlattening_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIgnored() {
        ASTNode$State state = state();
        boolean isIgnored_value = getCall().isIgnored();

        return isIgnored_value;
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
                FTypePrefixVariability var = fConstant();
                // Check all output arguments
                for (FFunctionCallLeft fl : getLefts()) {
                    if (fl.hasFExp()) {
                        var = var.combine(fl.getFExp().variability());
                    }
                }
                // Check call
                return var.combine(getCall().variability());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquations() {
        ASTNode$State state = state();
        boolean hasFunctionCallEquations_value = true;

        return hasFunctionCallEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquationsWithLefts() {
        ASTNode$State state = state();
        boolean hasFunctionCallEquationsWithLefts_value = getNumLeft() > 0;

        return hasFunctionCallEquationsWithLefts_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean assignedSet_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<InstComponentDecl> assignedSet_value;
    /**
     * @apilevel internal
     */
    private void assignedSet_reset() {
        assignedSet_computed = false;
        assignedSet_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> assignedSet() {
        if(assignedSet_computed) {
            return assignedSet_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        assignedSet_value = assignedSet_compute();
        if (isFinal && num == state().boundariesCrossed) {
            assignedSet_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return assignedSet_value;
    }
    /**
     * @apilevel internal
     */
    private Set<InstComponentDecl> assignedSet_compute() {
            LinkedHashSet<InstComponentDecl> s = new LinkedHashSet<InstComponentDecl>();
            for (FFunctionCallLeft left : getLefts()) {
                if (left.hasFExp()) {
                    s.addAll(left.getFExp().accessedVarSet());
                }
            }
            return s;
        }
    @ASTNodeAnnotation.Attribute
    public boolean allowGlobalOnIfRewrite() {
        ASTNode$State state = state();
        boolean allowGlobalOnIfRewrite_value = getNumLeft() > 0;

        return allowGlobalOnIfRewrite_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = getCall().generatesEvents();

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = getCall().hasInlinableFunctions(fi);

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    /**
     * Checks if equation is eligible for var. prop.
     * @attribute syn
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:94
     */
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        try {
                getCall().flushAllRecursiveClearFinal();
                return super.canPropagate() && variables().size() > 0 && numScalarEquations() > 0 && 
                        ((variables().size() == numScalarEquations() && getCall().variability().parameterOrLess()) 
                                || potentialPartialVariability().knownParameterOrLess());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability potentialPartialVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability potentialPartialVariability_value = getCall().potentialPartialVariability();

        return potentialPartialVariability_value;
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
                try {
                    FExp diffedCall = getCall().diff(name);
                    if (diffedCall.isLiteralZero()) {
                        Collection<FAbstractEquation> res = new ArrayList<FAbstractEquation>();
                        for (FFunctionCallLeft left : getLefts())
                            for (FIdUseExp use : FIdUseExpsInLHS())
                                res.add(dynamicFAbstractEquation(new FEquation(use.diff(name), use.type().sizedZeroLiteral())));
                        return res;
                    } else {
                        List lefts = new List();
                        for (FFunctionCallLeft l : getLefts()) {
                            Opt lopt = l.hasFExp() ? new Opt(l.getFExp().diff(name)) : new Opt();
                            lefts.add(new FFunctionCallLeft(lopt));
                        }
                        return Arrays.asList(dynamicFAbstractEquation(
                                new FFunctionCallEquation(lefts, (FAbstractFunctionCall)diffedCall)));
                    }
                } catch (ExpressionDifferentiationException e) {
                    throw new EquationDifferentiationException(this, e.toQuotedString() + " in equation:\n   " + this);
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue OIS_ceval(VariableEvaluator evaluator, FVariable var) {
        ASTNode$State state = state();
        CValue OIS_ceval_VariableEvaluator_FVariable_value = cevalParameter(evaluator, var);

        return OIS_ceval_VariableEvaluator_FVariable_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:25
     */
    @ASTNodeAnnotation.Attribute
    public Solvability isSolved(FVariable var, boolean duringTearing) {
        ASTNode$State state = state();
        try {
        		Set<FVariable> leftVars = referencedFVariablesInLHS();
        		
        		boolean inLeft = false;
        		for (FVariable fv : leftVars) {
        			if (fv == var)
        				inLeft = true;
        		}
        		
        		Set<FVariable> argVars = referencedFVariablesInRHS();
        
        		boolean inArgs = false;
        		for (FVariable fv : argVars) {
        			if (fv == var)
        				inArgs = true;
        		}
        
        		if (inLeft && !inArgs)
        			return Solvability.ANALYTICALLY_SOLVABLE;
        		else if (leftVars.size() == 1 && duringTearing && canUseLocalIteration())
        			return Solvability.NUMERICALLY_SOLVABLE;
        		else
        			return Solvability.UNSOLVABLE;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "FunctionCallEquation";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:964
     * @apilevel internal
     */
    public Size Define_size(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().sizeOfOutput(i);
        }
        else {
            return getParent().Define_size(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1510
     * @apilevel internal
     */
    public Set<FVariable> Define_boundParameters(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return boundParameters();
        }
        else {
            return getParent().Define_boundParameters(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1493
     * @apilevel internal
     */
    public String Define_funcName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getCall().name();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1662
     * @apilevel internal
     */
    public boolean Define_isFunctionCallClause(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return true;
        }
        else {
            return super.Define_isFunctionCallClause(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1685
     * @apilevel internal
     */
    public int Define_prevIndex(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? -1 : getLeft(i - 1).myLastIndex();
        }
        else {
            return getParent().Define_prevIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1716
     * @apilevel internal
     */
    public InstComponentDecl Define_myOutput(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().findOutput(i);
        }
        else {
            return getParent().Define_myOutput(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return false;
        }
        else {
            return getParent().Define_functionCallIsExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return getLefts().toArrayList();
        }
        else {
            return getParent().Define_myLefts(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1738
     * @apilevel internal
     */
    public FAbstractFunctionCall Define_myFunctionCall(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getCall();
        }
        else {
            return getParent().Define_myFunctionCall(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2364
     * @apilevel internal
     */
    public FType Define_type(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().typeOfOutput(i);
        }
        else {
            return getParent().Define_type(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1147
     * @apilevel internal
     */
    public String Define_functionCallDecription(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getCall().functionCallDecription();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
