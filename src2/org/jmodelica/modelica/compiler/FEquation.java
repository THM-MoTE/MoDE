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
 * An equation consisting of a right and a left hand side expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:578
 * @production FEquation : {@link FAbstractEquation} ::= <span class="component">Left:{@link FExp}</span> <span class="component">Right:{@link FExp}</span>;

 */
public class FEquation extends FAbstractEquation implements Cloneable {
    /**
     * Constructs an equation that is not initial and is not marked as
     * residual.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:99
     */
    public FEquation(FExp left, FExp right) {
		this(new FNormalEquation(), new List<FAttribute>(), left, right);
	}
    /**
     * Constructs an equation that is not marked as residual.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:106
     */
    public FEquation(FEquationType type, FExp left, FExp right) {
		this(type, new List<FAttribute>(), left, right);
	}
    /**
     * Constructs an equation that is not initial
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:113
     */
    public FEquation(List<FAttribute> attrs, FExp left, FExp right) {
		this(new FNormalEquation(), attrs, left, right);
	}
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:475
     */
    public void addToParameterEquationsMap(
			Map<FAbstractVariable,FAbstractEquation> map) {
		getLeft().addToParameterEquationsMap(map, this);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1292
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);
    	p.print(getLeft(),str,indent);
   		str.print(" = ");
   		p.print(getRight(),str,indent);
        getFAttributeList().prettyPrintFAnnotationAttributeList(str, p);
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:275
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        if (inWhen) {
            getLeft().makeContinuousVariablesDiscrete();
        }
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:426
     */
    public void contentCheck(ErrorCheckType checkType) {
		super.contentCheck(checkType);
		if (inWhen() && !isAssignmentEqn())
			error("Only assignment equations are allowed in when clauses");
	}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:349
     */
    public void typeCheck(ErrorCheckType checkType) {
        typeCheckLocalIteration(checkType);
        FType left = getLeft().type();
        FType right = getRight().type();
        if (!left.isUnknown() && !right.isUnknown()) {
            if (!left.equivalentTo(right)) {
                if (left.equivalentExceptLengths(right)) {
                    if (!lockBranch(checkType))
                        ARRAY_SIZE_MISMATCH_IN_EQUATION.invoke(this, left.size(), right.size());
                } else {
                    TYPE_MISMATCH_IN_EQUATION.invoke(this, left, right);
                }
            }
        }
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:45
     */
    public void flattenEqn(List<FAbstractEquation> l, FQName prefix, FClass fc) {
        FEquation flattened = new FEquation(getLeft().flatten(prefix), getRight().flatten(prefix));
        flattenAttrs(flattened, prefix);
        l.add(flattened);
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:104
     */
    public void sanityCheckParameterEquations(FClass fc) {
        getLeft().sanityCheckParameterEquationLeft(fc, this);
    }
    /**
     * Detection of alias variables in equations
     * 
     * Equations of the type 'x=y', 'x=-y', '-x=y' and '-x=-y' are detected
     * as alias equations and an AliasPair object is returned.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1448
     */
    public AliasPair aliasVariables() {
        AliasPair res = null;
        if (!containsActiveAnnotations()) // This equation should not be alias-removed if it is marked as residual!
            res = aliasVariables(true);
        aliasClassified = true;
        classifiedAsAlias = res != null;
        return res;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1457
     */
    public AliasPair aliasVariables(boolean checkVariables) {
        return aliasVariables(getLeft(), getRight(), 1, checkVariables);
    }
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2929
     */
    public void removeBindingExpOfAssignedVars() {
		getLeft().removeBindingExpOfReferencedVars();
	}
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2979
     */
    public void revertToBindingExp() throws ConstantEvaluationException {
		FVariable fv = (FVariable) ((FIdUseExp) getLeft()).getFIdUse().myFV();
		fv.setBindingExp(getRight().ceval().buildLiteral());
	}
    /**
     * @aspect DerivativeRewriting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:1004
     */
    public void propagateDerivativeBindings() {
        if (!isDerivativeBindingEquation())
            return;
        FAbstractVariable right = getRight().asFIdUseExp().myFV();
        FAbstractVariable left = getLeft().asFIdUseExp().myFV();
        if (!left.isFVariable() || !right.isFVariable())
            return;
        if (left.isTemporary() || right.isTemporary())
            return;
        if (left.isInput() || right.isInput())
            return;
        if (left.variability().discreteOrLess() || right.variability().discreteOrLess())
            return;
        boolean rightIsDer = right.isDerivativeVariable();
        boolean leftIsDer = left.isDerivativeVariable();
        FVariable var;
        FVariable derVar;
        if (rightIsDer && !leftIsDer) {
            var = left.asFVariable();
            derVar = right.asFVariable();
        } else if (!rightIsDer && leftIsDer) {
            var = right.asFVariable();
            derVar = left.asFVariable();
        } else {
            return;
        }
        //aliasClass = AliasClass.DER_ALIAS;
        myFClass().getAliasManager().addDerivativeBindingPair(var, derVar.getMeIntegrated());
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:81
     */
    public void findBlockFunctionExtraction(AbstractEquationBlock block, ArrayList<FFunctionCall> functions) {  
        getLeft().findBlockFunctionExtraction(block, functions); 
        getRight().findBlockFunctionExtraction(block, functions);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:758
     */
    @Override
    public Collection<FAbstractEquation> inlineFunctions(AbstractFunctionInliner fi) {
        getLeft().inlineFunctions(fi);
        getRight().inlineFunctions(fi);
        return Collections.singletonList((FAbstractEquation)this);
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:288
     */
    public void variabilityPropagation(FClass.VariabilityPropagator propagator) {
		
		FVariable fVariable;
		FExp solution;
		FTypePrefixVariability solutionVariability;

		fVariable = variables().iterator().next();

		if (!fVariable.canPropagate()) {
			return;
		}

		solution = solution(fVariable);
		solution.resetOriginalReferences();
		
		if (!solution.isValidExp()) {
			return;
		}
		
		if (!canPropagate(fVariable, solution)) {
			return;
		}
		
		solutionVariability = solution.variability();

		if (!solutionVariability.parameterOrLess()) {
			// Sometimes combinations of parameters and constants yield 
			// discrete variability. IfExpr, sample() etc.
			return;
		}

		if (solutionVariability.knownParameterOrLess()) {
			try {
				solution = solution.ceval().buildLiteral();
			} catch (ConstantEvaluationException e) {
				// If we can't evaluate right now, set it as parameter
				solutionVariability = fParameter();
			}
		}
		
        if (!solutionVariability.knownParameterOrLess()) {
            propagator.addEquation(solutionVariability, new FEquation(fVariable.createUseExp(), solution));
        }
        
        this.taggedByVProp = true;
        fVariable.variabilityPropagation(propagator, solutionVariability, solution);
        
    }
    /**
     * Scalarize equation and put all resulting equations in list eqns.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:926
     */
    @Override
    public void scalarize(Scalarizer.Equation s) {
		//log.debug("FEquation.scalarize() " + ndims());
        if (size().isZero())
            return;
        
        createArrayTemporaries(s);
		if (ndims()==0) {
			/*
			 * If the equation is of dimension 0, i.e, already scalar,
			 * the equations is "scalarized" into a simple equation where
			 * e.g. built in functions are replaced by elementary operations.
			 */
			
            List<FAttribute> attrs = scalarizeAttributeList(Index.NULL, s.map());
            createScalarFEquations(s, attrs, getLeft(), getRight());
		} else if (ndims() > 0) {
			/*
			 * If the expression is an array expression, then the FExp.getArray()
			 * element is used to generate scalar equations.
			 */
			// Iterate over array elements and create scalarized equation for each
			for (Index i : indices()) {
                List<FAttribute> attrs = scalarizeAttributeList(i, s.map());
                createScalarFEquations(s, attrs, getLeft().getArray().get(i), getRight().getArray().get(i));
			}
		} else {
			throw new UnsupportedOperationException("Bad equation: ndims() for equation '" + 
					this + "' returned " + ndims()); 
		}
	}
    /**
     * Scalarize left and right expressions and create new scalar equations.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:968
     */
    public void createScalarFEquations(Scalarizer.Equation s, List<FAttribute> attrs, FExp left, FExp right) {
        if (left.inferType().isRecord()) {
            left.inferType().scalarRecordClauses(s, new FQNameEmpty(), left, right);
        } else {
            s.add(new FEquation(attrs, left.scalarize(s), right.scalarize(s)));
        }
	}
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:364
     */
    @Override
	public SimpleEquationBlock createSimpleEquationBlock(Collection<FVariable> fvs, Collection<Integer> assignedIndices, Solvability solvability, EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) { 
		FVariable fv = fvs.iterator().next();
		if (solvability.isAnalyticallySolvable()) { // Solved scalar equation
			return new SolvedScalarEquationBlock(producer, blockDependency, this, fv);
		} else if(solvability.isSolvable()) { // Numerically solvable scalar equation
			return new NumericallySolvedScalarEquationBlock(producer, blockDependency, this, fv);
		} else { // Unsolved scalar equation
			return new UnsolvedScalarEquationBlock(producer, blockDependency, this, fv);
		}
	}
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:647
     */
    @Override
    public <V> AbstractBiPGraph.AssignmentIncidenceMap assignmentIncidenceMap(AbstractBiPGraph g, EnumSet<AbstractBiPGraph.VarType> variableTypes, AbstractBiPGraph.VariableResolver resolver) {
        return g.new SingleAssignmentIncidenceMap(this, resolver);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:139
     */
    private static FExp computeInactiveSolution(Collection<FExp> exps) {
        if (exps.size() == 0) {
            return new FRealLitExp(0);
        }
        java.util.List<FExp> expsCopies = new ArrayList<FExp>();
        // Compute new expressions for the inactive terms
        for (FExp exp : exps) {
            FExp expCopy = exp.copySymbolic();
            if (!exp.isNegativeTerm()) {
                expCopy = new FNegExp(expCopy);
            }
            expsCopies.add(expCopy);
        }
        return FExp.createBalancedBinaryTree(new FAddExp(), expsCopies);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:155
     */
    private static FExp computeActiveSolution(Collection<FExp> exps, FVariable var,
            boolean dontAllowDivisionByVariable, double tol) {
        java.util.List<FExp> parts = new ArrayList<FExp>();
        FTypePrefixVariability mulCoeffVar = fConstant(); // Keep track of variability
        // Compute new expressions for the active terms
        for (FExp e : exps) {
            ArrayList<FExp> fac = e.factors();
            // There is only one reference to the active variable in each
            // term - this is checked above.            
            ArrayList<FExp> activeFactors = new ArrayList<FExp>();
            ArrayList<FExp> inactiveFactors = new ArrayList<FExp>();
            // Find terms
            boolean negatedFactor = false;          
            for (FExp ee : fac) {
                if (ee.nbrUses(var.name())==1 && !ee.isInvertedFactor() && 
                    (ee.isIdentifier(var.name()) || // Identifier 
                    (ee instanceof FPreExp))) { // pre expression 
                    activeFactors.add(ee);
                } else if (ee.nbrUses(var.name())==1 && !ee.isInvertedFactor() && 
                    ((ee instanceof FNegExp) && ((FNegExp)ee).getFExp().isIdentifier(var.name()))) { 
                    // TODO: remove this branch since it is not general enough
                    activeFactors.add(((FNegExp)ee).getFExp());
                    negatedFactor = true;
                } else if (ee.nbrUses(var.name())==0) {
                    if (ee.variability().constantVariability() &&
                            Math.abs(ee.ceval().realValue()) *
                            ee.dynamicFExp(var.nominal()).ceval().realValue() < tol) {
                        return new FNoExp();
                    }
                    inactiveFactors.add(ee);
                } else {
                    // This equation cannot be solved
                    return new FNoExp();
                }
            }
            
            FExp coeff = computeInactiveFactorSolution(inactiveFactors);
            for (FExp eee : inactiveFactors) {
                mulCoeffVar = mulCoeffVar.combine(eee.variability());
            }
            if (e.isNegativeTerm() || negatedFactor) {
                coeff = new FNegExp(coeff);
            }
            parts.add(coeff);
        }
        if (dontAllowDivisionByVariable && !mulCoeffVar.lessOrEqual(fConstant())) {
            return new FNoExp();
        }
        return FExp.createBalancedBinaryTree(new FAddExp(), parts);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:206
     */
    private static FExp computeInactiveFactorSolution(Collection<FExp> exps) {
        if (exps.size() == 0) {
            return new FRealLitExp(1);
        }
        java.util.List<FExp> expsCopies = new ArrayList<FExp>();
        // Compute new expressions for the inactive factor terms
        for (FExp exp : exps) {
            FExp expCopy = exp.copySymbolic();
            if (exp.isInvertedFactor()) {
                expCopy = new FDivExp(new FRealLitExp(1), expCopy);
            }
            expsCopies.add(expCopy);
        }
        return FExp.createBalancedBinaryTree(new FMulExp(), expsCopies);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:230
     */
    private static final FSubExp EXP_TEMPLATE = new FSubExp();
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:232
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		String indent3 = p.indent(indent2);
		open_XML(str, indent);
		EXP_TEMPLATE.open_XML(str, indent2);
		p.print(getLeft(), str, indent3);
		p.print(getRight(), str, indent3);
		EXP_TEMPLATE.close_XML(str, indent2);
		close_XML(str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:828
     */
    @Override
    public void genResidual_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        boolean firstVisit = visited == null ? true : visited.add(this);
        if(!shouldBeDifferentiated()){
            genResidual_C(printer_C, str, indent, enumerator, null, null);
            return;
        }
        genTempVars_CAD(printer_CAD, str, indent);
        int index = enumerator.next();
        
        str.print(indent);
        str.print("(*res)[");
        str.print(index);
        str.print("] = ");
        getRight().genVar_CAD(printer_CAD, str, indent);
        str.print(" - (");
        getLeft().genVar_CAD(printer_CAD, str, indent);
        str.print(");\n");
        
        str.print(indent);
        str.print("(*dF)[");
        str.print(index);
        str.print("] = ");
        getRight().genDer_CAD(printer_CAD, str, indent);
        str.print(" - (");
        getLeft().genDer_CAD(printer_CAD, str, indent);
        str.print(");\n");
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1173
     */
    @Override
    public void genBlock_CAD(String indent, CodeStream str, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        FVariable v = forVariables.iterator().next();
        FExp solution = solution(v);
        if(v.shouldBeDifferentiated()){
            printer_CAD.printPreSteps(solution, str, indent);
            str.print(indent + v.name_C() + " = ");
            solution.genVar_CAD(printer_CAD, str, indent);
            str.print(";\n");
            str.print(indent + "(*dz)[jmi_get_index_from_value_ref(" + v.valueReference() + ")-jmi->offs_real_dx] = ");
            solution.genDer_CAD(printer_CAD, str, indent);
            str.print(";\n");
            printer_CAD.printPostSteps(solution, str, indent);
        } else {
            printer_CAD.printPreSteps(solution, str, indent);
            str.format("%s%s = ", indent, v.name_C());
            solution.genVar_CAD(printer_CAD, str, indent);
            str.print(";\n");
            printer_CAD.printPostSteps(solution, str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3422
     */
    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        FVariable fv = forVariables.iterator().next();
        FExp sol = solution(fv);
        p.printPreSteps(sol, str, indent);
        str.format("%s%s = ", indent, fv.name_C());
        p.print(sol, str, indent);
        str.print(";\n");
        p.printPostSteps(sol, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3568
     */
    @Override
    public void genResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        boolean firstVisit = visited == null || visited.add(this);
        p.printPreSteps(this, str, indent);
        str.print(indent + "(*res)[" + enumerator.next() + "] = ");
        p.print(getRight(), str, "");
        str.print(" - (");
        p.print(getLeft(), str, "");
        str.print(");\n");
        p.printPostSteps(this, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3753
     */
    @Override
	public void genAssignment_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(this, str, indent);
        FIdUseExp left = (FIdUseExp)getLeft().stripNegations();
        FAbstractVariable fv = left.myFV();
        if (left.myFV().isExternalObject()) {
            FExternalObjectVariable eo = (FExternalObjectVariable) fv;
            eo.genDestructorCall_C(p, str, indent);
        }
        str.print(indent);
        p.print(left.getFIdUse(), str, "");
        str.print(" = ");
        if (getLeft().isNegated()) {
            str.print("-");
        }
        str.print("(");
        p.print(getRight(), str, "");
        str.print(")");
        if (left.myFV().isReal() && myOptions().getBooleanOption("enable_variable_scaling") && !inFunction()) {
            str.print("/sf(");
            str.print(left.myFV().valueReference());
            str.print(")");
        }
        str.print(";\n");
        
        p.printPostSteps(this, str, indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FEquation() {
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
        setChild(new List(), 4);
        setChild(new Opt(), 5);
    }
    /**
     * @declaredat ASTNode:16
     */
    public FEquation(FEquationType p0, List<FAttribute> p1, FExp p2, FExp p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 4;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        assignedInAllBranchesVariables_reset();
        type_reset();
        assignedSet_reset();
        isAliasEquation_reset();
        solution_FVariable_boolean_reset();
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
    public FEquation clone() throws CloneNotSupportedException {
        FEquation node = (FEquation) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public FEquation copy() {
        try {
            FEquation node = (FEquation) clone();
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
    public FEquation fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public FEquation treeCopyNoTransform() {
        FEquation tree = (FEquation) copy();
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
     * @declaredat ASTNode:124
     */
    public FEquation treeCopy() {
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
     * Replaces the Left child.
     * @param node The new node to replace the Left child.
     * @apilevel high-level
     */
    public void setLeft(FExp node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the Left child.
     * @return The current node used as the Left child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Left")
    public FExp getLeft() {
        return (FExp) getChild(2);
    }
    /**
     * Retrieves the Left child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Left child.
     * @apilevel low-level
     */
    public FExp getLeftNoTransform() {
        return (FExp) getChildNoTransform(2);
    }
    /**
     * Replaces the Right child.
     * @param node The new node to replace the Right child.
     * @apilevel high-level
     */
    public void setRight(FExp node) {
        setChild(node, 3);
    }
    /**
     * Retrieves the Right child.
     * @return The current node used as the Right child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Right")
    public FExp getRight() {
        return (FExp) getChild(3);
    }
    /**
     * Retrieves the Right child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Right child.
     * @apilevel low-level
     */
    public FExp getRightNoTransform() {
        return (FExp) getChildNoTransform(3);
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
     * Get array dimensions.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:112
     */
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        try {
        		if (getLeft().ndims() == getRight().ndims()) {
        			return getLeft().ndims();
        		}
        		return -1;
        	}
        finally {
        }
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
        size_value = size_compute();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    private Size size_compute() {
    		Size left = getLeft().size();
    		Size right = getRight().size();
    		return left.equals(right) ? left : Size.SCALAR;
    	}
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = getLeft().indices();

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalParameter(VariableEvaluator evaluator, FVariable fv) {
        ASTNode$State state = state();
        CValue cevalParameter_VariableEvaluator_FVariable_value = getRight().ceval(evaluator);

        return cevalParameter_VariableEvaluator_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalParameter(VariableEvaluator evaluator, FVariable fv, Index i) {
        ASTNode$State state = state();
        CValue cevalParameter_VariableEvaluator_FVariable_Index_value = getRight().ceval(evaluator, i);

        return cevalParameter_VariableEvaluator_FVariable_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        ASTNode$State state = state();
        int numScalarEquations_value = getLeft().type().numScalarElements();

        return numScalarEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroEquation() {
        ASTNode$State state = state();
        boolean isZeroEquation_value = getLeft().isLiteralZero() && getRight().isLiteralZero();

        return isZeroEquation_value;
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
                    return getLeft().referencedParametersInFExp();
                } else {
                    return Collections.emptySet();
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1525
     */
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> RHSVariables() {
        ASTNode$State state = state();
        try {
                if (isParameterEquation()) {
                    return getRight().referencedParametersInFExp();
                } else {
                    return Collections.emptySet();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInRHS_FIdUseExpLookupVisitor_value = getRight().findFIdUseExpsInTree(visitor);

        return FIdUseExpsInRHS_FIdUseExpLookupVisitor_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInLHS_FIdUseExpLookupVisitor_value = getLeft().findFIdUseExpsInTree(visitor);

        return FIdUseExpsInLHS_FIdUseExpLookupVisitor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean assignedInAllBranches(FAbstractVariable var) {
        ASTNode$State state = state();
        boolean assignedInAllBranches_FAbstractVariable_value = assignedInAllBranchesVariables().contains(var.name());

        return assignedInAllBranches_FAbstractVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean assignedInAllBranchesVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> assignedInAllBranchesVariables_value;
    /**
     * @apilevel internal
     */
    private void assignedInAllBranchesVariables_reset() {
        assignedInAllBranchesVariables_computed = false;
        assignedInAllBranchesVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> assignedInAllBranchesVariables() {
        if(assignedInAllBranchesVariables_computed) {
            return assignedInAllBranchesVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        assignedInAllBranchesVariables_value = assignedInAllBranchesVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            assignedInAllBranchesVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return assignedInAllBranchesVariables_value;
    }
    /**
     * @apilevel internal
     */
    private Set<String> assignedInAllBranchesVariables_compute() {
            Set<String> res = new HashSet<String>();
            getLeft().assignedInAllBranchesVariables(res);
            getRight().assignedInAllBranchesVariables(res);
            return res;
        }
    /**
     * @attribute syn
     * @aspect Nominals
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2702
     */
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        try {
                FExp nom = getLeft().dynamicFExp(FExp.nominalMax(getLeft(), getRight()));
                if (nom.variability().knownParameterOrLess()) {
                    try {
                        nom = getLeft().dynamicFExp(nom.ceval().buildLiteral());
                    } catch (ConstantEvaluationException e) {
                        
                    }
                }
                return nom;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegated() {
        ASTNode$State state = state();
        boolean isNegated_value = getLeft().isNegated() ^ getRight().isNegated();

        return isNegated_value;
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
        type_value = getRight().type().typePromotion(getLeft().type());
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReal(boolean exclusive) {
        ASTNode$State state = state();
        boolean isReal_boolean_value = type().isReal();

        return isReal_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect ExternalObjectTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1237
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasConstructorCall(Index i) {
        ASTNode$State state = state();
        try {
                FExp exp = getRight();
                if (i != Index.NULL)
                    exp = exp.getArray().get(i);
                return exp.isConstructorCall();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = isWhen() ? fDiscrete() : getLeft().variability().combine(getRight().variability());

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable assignedFV() {
        ASTNode$State state = state();
        FAbstractVariable assignedFV_value = getLeft().assignedFV();

        return assignedFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignmentEqn() {
        ASTNode$State state = state();
        boolean isAssignmentEqn_value = getLeft().isAccess();

        return isAssignmentEqn_value;
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
        assignedSet_value = getLeft().accessedVarSet();
        if (isFinal && num == state().boundariesCrossed) {
            assignedSet_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return assignedSet_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:760
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable isPrePropagationEquation() {
        ASTNode$State state = state();
        try {
                FAbstractVariable left = getLeft().isAccess() ? getLeft().asFIdUse().myFV() : null;
                FAbstractVariable right = getRight().isAccess() ? getRight().asFIdUse().myFV() : null;
                return left == right ? left : null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean potentialAliasEquation() {
        ASTNode$State state = state();
        boolean potentialAliasEquation_value = aliasVariables(false) != null;

        return potentialAliasEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isAliasEquation_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isAliasEquation_value;
    /**
     * @apilevel internal
     */
    private void isAliasEquation_reset() {
        isAliasEquation_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAliasEquation() {
        if(isAliasEquation_computed) {
            return isAliasEquation_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isAliasEquation_value = aliasClassified? classifiedAsAlias: aliasVariables()!=null;
        if (isFinal && num == state().boundariesCrossed) {
            isAliasEquation_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isAliasEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSameVariableEquality() {
        ASTNode$State state = state();
        boolean isSameVariableEquality_value = getLeft().isAccess() && getRight().isAccess()
                    && getLeft().asFIdUseExp().myFV() == getRight().asFIdUseExp().myFV()
                    && !getLeft().asFIdUseExp().myFV().isUnknown();

        return isSameVariableEquality_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSampleEquation() {
        ASTNode$State state = state();
        boolean isSampleEquation_value = getRight().isFSampleExp();

        return isSampleEquation_value;
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2539
     */
    @ASTNodeAnnotation.Attribute
    public FExp createResidualExp() {
        ASTNode$State state = state();
        try {
        		if (getLeft().isZeroLiteral())
        			return getRight().fullCopy();
        		if (getRight().isZeroLiteral())
        			return getLeft().fullCopy();
        		return new FSubExp(getLeft().fullCopy(), getRight().fullCopy());
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp assignmentExp() {
        ASTNode$State state = state();
        FExp assignmentExp_value = isAssignmentEqn() ? getRight() : null;

        return assignmentExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentParameterEquation() {
        ASTNode$State state = state();
        boolean isIndependentParameterEquation_value = getLeft().isFlatParameterUse() && getRight().isIndependentParameterExp();

        return isIndependentParameterEquation_value;
    }
    /**
     * @attribute syn
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3567
     */
    @ASTNodeAnnotation.Attribute
    public boolean isZeroFlowForm() {
        ASTNode$State state = state();
        try { 
                FExp l = getLeft().stripNegations();
                FExp r = getRight().stripNegations();
                return l.isZeroFlowForm(r) || r.isZeroFlowForm(l);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3577
     */
    @ASTNodeAnnotation.Attribute
    public boolean isConstantZeroFlow() {
        ASTNode$State state = state();
        try { 
                FExp l = getLeft().stripNegations();
                FExp r = getRight().stripNegations();
                
                if (l.isZeroLiteral() && r.isSemiLinear()) {
                    return ((FSemiLinearExp) r).getX().isZeroLiteral();
                }
                if (r.isZeroLiteral() && l.isSemiLinear()) {
                    return ((FSemiLinearExp) l).getX().isZeroLiteral();
                }
                
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3592
     */
    @ASTNodeAnnotation.Attribute
    public FIdUseExp zeroFlowGetLeft() {
        ASTNode$State state = state();
        try {
                FExp l = getLeft().stripNegations();
                FExp r = getRight().stripNegations();
                return (FIdUseExp) (l.isSemiLinear() ? r : l);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3598
     */
    @ASTNodeAnnotation.Attribute
    public FSemiLinearExp zeroFlowGetRight() {
        ASTNode$State state = state();
        try {
                FExp l = getLeft().stripNegations();
                FExp r = getRight().stripNegations();
                return (FSemiLinearExp) (l.isSemiLinear() ? l : r);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp zeroFlowGetX() {
        ASTNode$State state = state();
        FExp zeroFlowGetX_value = zeroFlowGetRight().getX().stripNegations();

        return zeroFlowGetX_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp zeroFlowGetPos() {
        ASTNode$State state = state();
        FExp zeroFlowGetPos_value = zeroFlowGetRight().getX().isNegated() ? zeroFlowGetRight().getNegSlope() : zeroFlowGetRight().getPosSlope();

        return zeroFlowGetPos_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp zeroFlowGetNeg() {
        ASTNode$State state = state();
        FExp zeroFlowGetNeg_value = zeroFlowGetRight().getX().isNegated() ? zeroFlowGetRight().getPosSlope() : zeroFlowGetRight().getNegSlope();

        return zeroFlowGetNeg_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean zeroFlowNegated() {
        ASTNode$State state = state();
        boolean zeroFlowNegated_value = isNegated() ^ zeroFlowGetRight().getX().isNegated();

        return zeroFlowNegated_value;
    }
    /**
     * @attribute syn
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3609
     */
    @ASTNodeAnnotation.Attribute
    public String zeroFlowGetKey() {
        ASTNode$State state = state();
        try {
                StringBuilder sb = new StringBuilder();
                if (zeroFlowNegated())
                    sb.append("-");
                sb.append(zeroFlowGetLeft().prettyPrint(""));
                sb.append("$");
                sb.append(zeroFlowGetX().prettyPrint(""));
                return sb.toString();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect DerivativeRewriting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:1034
     */
    @ASTNodeAnnotation.Attribute
    public boolean isDerivativeBindingEquation() {
        ASTNode$State state = state();
        try {
                if (!getRight().isAccess() || !getLeft().isAccess())
                    return false;
                if (!inEquationSection())
                    return false;
                boolean rightIsDer = getRight().isAbstractDerAccess();
                boolean leftIsDer = getLeft().isAbstractDerAccess();
                return rightIsDer && !leftIsDer || !rightIsDer && leftIsDer;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = getLeft().generatesEvents() || getRight().generatesEvents();

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = getLeft().hasInlinableFunctions(fi) || getRight().hasInlinableFunctions(fi);

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        boolean canPropagate_value = super.canPropagate() && variables().size() == 1;

        return canPropagate_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate(FVariable var, FExp solution) {
        ASTNode$State state = state();
        boolean canPropagate_FVariable_FExp_value = true;

        return canPropagate_FVariable_FExp_value;
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
                    return Arrays.asList(dynamicFAbstractEquation(new FEquation(getLeft().diff(name), getRight().diff(name))));
                } catch (ExpressionDifferentiationException e) {
                    throw new EquationDifferentiationException(this, e.toQuotedString() + " in equation:\n   " + this);
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp asSubExp() {
        ASTNode$State state = state();
        FExp asSubExp_value = getLeft().dynamicFExp(new FSubExp(getLeft().fullCopy(), getRight().fullCopy()));

        return asSubExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue OIS_ceval(VariableEvaluator evaluator, FVariable var) {
        ASTNode$State state = state();
        CValue OIS_ceval_VariableEvaluator_FVariable_value = solution(var).ceval(evaluator);

        return OIS_ceval_VariableEvaluator_FVariable_value;
    }
    /**
     * Used for evaluation of equations during analyse of overdetermined
     * initial system.
     * Tries to validate the equation and ensuring that the left hand side is
     * equal to the right hand side.
     * @attribute syn
     * @aspect OverdeterminedInitialSystem
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/OverdeterminedInitialSystem.jrag:169
     */
    @ASTNodeAnnotation.Attribute
    public boolean OIS_consistencyCheck(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                try {
                    CValue left = getLeft().ceval(evaluator);
                    CValue right = getRight().ceval(evaluator);
                    return left.isValid() && right.isValid() && type().equ(left, right).booleanValue();
                } catch (ConstantEvaluationException e) {
                    return false;
                }
            }
        finally {
        }
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
        		boolean solvable = !(solution(var, duringTearing) instanceof FNoExp);
        		if (solvable)
        			return Solvability.ANALYTICALLY_SOLVABLE;
        		else if (duringTearing && canUseLocalIteration())
        			return Solvability.NUMERICALLY_SOLVABLE;
        		else
        			return Solvability.UNSOLVABLE;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:102
     */
    @ASTNodeAnnotation.Attribute
    public FExp solution(FVariable var) {
        ASTNode$State state = state();
        try {
        		return solution(var, false);
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected Map solution_FVariable_boolean_values;
    /**
     * @apilevel internal
     */
    protected List solution_FVariable_boolean_list;
    /**
     * @apilevel internal
     */
    private void solution_FVariable_boolean_reset() {
        solution_FVariable_boolean_values = null;
        solution_FVariable_boolean_list = null;
    }
    @ASTNodeAnnotation.Attribute
    public FExp solution(FVariable var, boolean duringTearing) {
        java.util.List _parameters = new ArrayList(2);
        _parameters.add(var);
        _parameters.add(Boolean.valueOf(duringTearing));
        if (solution_FVariable_boolean_values == null) solution_FVariable_boolean_values = new HashMap(4);
        if(solution_FVariable_boolean_values.containsKey(_parameters)) {
            return (FExp)solution_FVariable_boolean_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FExp solution_FVariable_boolean_value = solution_compute(var, duringTearing);
        if(solution_FVariable_boolean_list == null) {
            solution_FVariable_boolean_list = new List();
            solution_FVariable_boolean_list.is$Final = true;
            solution_FVariable_boolean_list.setParent(this);
        }
        solution_FVariable_boolean_list.add(solution_FVariable_boolean_value);
        if(solution_FVariable_boolean_value != null) {
            solution_FVariable_boolean_value = (FExp) solution_FVariable_boolean_list.getChild(solution_FVariable_boolean_list.numChildren-1);
            solution_FVariable_boolean_value.is$Final = true;
        }
        if (true) {
            solution_FVariable_boolean_values.put(_parameters, solution_FVariable_boolean_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return solution_FVariable_boolean_value;
    }
    /**
     * @apilevel internal
     */
    private FExp solution_compute(FVariable var, boolean duringTearing) {
    		
    		// Get terms
    		ArrayList<FExp> t = terms();
    		
    		ArrayList<FExp> activeTerms = new ArrayList<FExp>();
    		ArrayList<FExp> inactiveTerms = new ArrayList<FExp>();
    		// Find terms
    		for (FExp e : t) {
    			if (e.nbrUses(var.name())==1) {
    				activeTerms.add(e);
    			} else if (e.nbrUses(var.name())==0) {
    			    inactiveTerms.add(e);
    			} else {
    			    return new FNoExp();
    			}
    		}
    		
            // Compute new expressions for the inactive and active terms
            FExp inactiveTerm = computeInactiveSolution(inactiveTerms);
            FExp activeTerm = computeActiveSolution(activeTerms, var,
                    duringTearing && !myOptions().getBooleanOption("divide_by_vars_in_tearing") ||
                    inactiveTerm.isLiteralZero(), duringTearing ? myOptions().getRealOption("tearing_division_tolerance") : 0);
            
            if (activeTerm.isNoExp()) {
                return new FNoExp();
            }
            if (inactiveTerm.isLiteralZero() || activeTerm.isLiteralOne()) {
                return inactiveTerm;
            }
            return new FDivExp(inactiveTerm, activeTerm);
        }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:223
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> terms() {
        ASTNode$State state = state();
        try {
        		ArrayList<FExp> t = new ArrayList<FExp>();
        		t.addAll(getLeft().terms());
        		t.addAll(getRight().terms());
        		return t;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:320
     */
    @ASTNodeAnnotation.Attribute
    public int nbrUses(String name) {
        ASTNode$State state = state();
        try {
        		return getLeft().nbrUses(name) + getRight().nbrUses(name);
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Equation";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1510
     * @apilevel internal
     */
    public Set<FVariable> Define_boundParameters(ASTNode caller, ASTNode child) {
        if (caller == getRightNoTransform()) {
            return boundParameters();
        }
        else {
            return getParent().Define_boundParameters(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2866
     * @apilevel internal
     */
    public boolean Define_isLeftHandSide(ASTNode caller, ASTNode child) {
        if (caller == getLeftNoTransform()) {
            return true;
        }
        else {
            return super.Define_isLeftHandSide(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1980
     * @apilevel internal
     */
    public FIdUseExp Define_inlineUsesFunctionCallLeft(ASTNode caller, ASTNode child) {
        if (caller == getRightNoTransform()) {
            return getLeft().getEquationLeftInlineUse();
        }
        else {
            return super.Define_inlineUsesFunctionCallLeft(caller, child);
        }
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:279
     * @apilevel internal
     */
    public boolean Define_isNegativeTerm(ASTNode caller, ASTNode child) {
        if (caller == getLeftNoTransform()) {
            return false;
        }
        else if (caller == getRightNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_isNegativeTerm(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:287
     * @apilevel internal
     */
    public boolean Define_isInvertedFactor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
