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
 * Base class for flattened equations.
 * 
 * The NTA InitialEquation is used to represent default initial equations for
 * when equations that are not active during initialization.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:565
 * @production FAbstractEquation : {@link BaseNode} ::= <span class="component">Type:{@link FEquationType}</span> <span class="component">InitialEquation:{@link FAbstractEquation}*</span> <span class="component">[DynamicFAbstractEquation:{@link FAbstractEquation}]</span> <span class="component">{@link FAttribute}*</span>;

 */
public abstract class FAbstractEquation extends BaseNode implements Cloneable, FDiagnosticsNode {
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1208
     */
    protected static int numForElems(List<? extends CommonForIndex> list) {
        int res = 1;
        for (CommonForIndex i : list)
            res *= i.size().numElements();
        return res;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1215
     */
    protected static int numScalarEqnsInList(List<FAbstractEquation> list) {
        int res = 0;
        for (FAbstractEquation e : list) 
            res += e.numScalarEquations();
        return res;
    }
    /**
     * Returns an iterable that can be used to iterate over all surounding
     * equations (including this one).
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1609
     */
    public Iterable<FAbstractEquation> enclosingEquationsIterator() {
        return new Iterable<FAbstractEquation>() {

            @Override
            public Iterator<FAbstractEquation> iterator() {
                return new Iterator<FAbstractEquation>() {

                    private FAbstractEquation next = FAbstractEquation.this;
                    
                    @Override
                    public boolean hasNext() {
                        return next != null;
                    }

                    @Override
                    public FAbstractEquation next() {
                        FAbstractEquation res = next;
                        next = next.enclosingEquation();
                        return res;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                    
                };
            }
            
        };
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1981
     */
    private FAbstractEquation meDifferentiated = null;
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1982
     */
    private FAbstractEquation meIntegrated = null;
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1986
     */
    public void setMeDifferentiated(FAbstractEquation e) {
        this.meDifferentiated = e;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1990
     */
    public FAbstractEquation getMeDifferentiated() {
        return this.meDifferentiated;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2002
     */
    public void setMeIntegrated(FAbstractEquation e) {
        this.meIntegrated = e;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2006
     */
    public FAbstractEquation getMeIntegrated() {
        return this.meIntegrated;
    }
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3919
     */
    public void calculateEquationSparsity(
            ArrayList<Integer>[] sp, int i, Set<? extends FVariable> vars, int offset) {
        for (int j = 0; j < numScalarEquations(); j++) {
            for (FVariable fv : vars) {
                sp[fv.indexInZ() - offset].add(new Integer(i)); 
            }
            i++;
        }
    }
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3973
     */
    public void derivativeVariablesEquationSparsity(ArrayList<Integer>[] sp, int i) {
        calculateEquationSparsity(sp, i, derivativeVariables(), myFClass().derivativeVariablesOffset());
    }
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:4002
     */
    public void differentiatedRealVariablesEquationSparsity(ArrayList<Integer>[] sp, int i) {
        calculateEquationSparsity(sp, i, differentiatedRealVariables(), myFClass().differentiatedRealVariablesOffset());
    }
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:4031
     */
    public void realInputsEquationSparsity(ArrayList<Integer>[] sp, int i) {
        calculateEquationSparsity(sp, i, realInputs(), myFClass().realInputsOffset());
    }
    /**
     * @aspect Sparsity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:4060
     */
    public void algebraicRealVariablesEquationSparsity(ArrayList<Integer>[] sp, int i) {
        calculateEquationSparsity(sp, i, algebraicContinousRealVariables(), myFClass().algebraicContinousRealVariablesOffset());
    }
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:468
     */
    public void addToParameterEquationsMap(
            Map<FAbstractVariable,FAbstractEquation> map) {
        for (FVariable fv : referencedFVariablesInLHS()) {
            fv.addToParameterEquationsMap(map, this);
        }
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:222
     */
    public static boolean containsConnect(List<FAbstractEquation> eqns) {
		for (FAbstractEquation eqn : eqns)
			if (eqn.containsConnect())
				return true;
		return false;
	}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:47
     */
    public void contentCheck(ErrorCheckType checkType) {
		if (inFunction()) 
			error("Equations are not allowed in functions");
	}
    /**
     * Check if this equation may legally contain a connect clause.
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:347
     */
    public void checkMayContainConnect(ErrorCheckType checkType, FConnectClause connect) {
        FAbstractEquation context = surroundingFAbstractEquation();
        if (context != null) {
            context.checkMayContainConnect(checkType, connect);
        }
    }
    /**
     * Try to evaluate asserts with constant tests in this equation.
     * 
     * If this equation should be removed, returns true.
     * @aspect AssertEval
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1533
     */
    public boolean evaluateAsserts(boolean inClause) {
        return false;
    }
    /**
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1647
     */
    public void collectReinits(Map<FAbstractVariable,Set<FReinit>> map) {}
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:18
     */
    public void flatten(FQName prefix, FClass fc) {
        flattenEqn(getType().equationList(fc), prefix, fc);
//        if (eqn != null) {
//            eqn.annotation("src").setValue(new FStringLitExp(fileName() + ":" + beginLine()));;
//        }
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:34
     */
    public void flattenEqn(List<FAbstractEquation> l, FQName prefix, FClass fc) {
        l.add(fullCopy());
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:38
     */
    public void flattenAttrs(FAbstractEquation eqn, FQName prefix) {
        List<FAttribute> flatAttrs = new List<FAttribute>();
        for (FAttribute attr : getFAttributes())
            flatAttrs.add(attr.flatten(prefix));
        eqn.setFAttributeList(flatAttrs);
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:51
     */
    public static void flattenEqnList(List<FAbstractEquation> l, FQName prefix, FClass fc, List<FAbstractEquation> eqs) {
        for (FAbstractEquation fae : eqs) {
            fae.flattenEqn(l, prefix, fc);
        }
    }
    /**
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:202
     */
    protected static Set<InstComponentDecl> assignedSetFromEqns(List<FAbstractEquation> eqns) {
        Set<InstComponentDecl> res = new HashSet<InstComponentDecl>();
        for (FAbstractEquation eqn : eqns)
            res.addAll(eqn.assignedSet());
        return res;
    }
    /**
     * Dynamically places an FAbstractEquation in the tree under this FAbstractEquation.
     * 
     * @return  the final version of the dynamically placed node.
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:894
     */
    public FAbstractEquation dynamicFAbstractEquation(FAbstractEquation eqn) {
		if (eqn == this)
			return eqn;
		getDynamicFAbstractEquationOpt().setChild(eqn, 0);
		return (FAbstractEquation) getDynamicFAbstractEquationOpt().getChild(0);
	}
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:102
     */
    public void sanityCheckParameterEquations(FClass fc) {}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1435
     */
    public AliasPair aliasVariables() {
		return null;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1439
     */
    public boolean aliasClassified = false;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1440
     */
    public boolean classifiedAsAlias = false;
    /**
     * Flag for removing equation.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1992
     */
    public boolean markedForRemoval = false;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1994
     */
    public void markForRemoval() {
        markedForRemoval = true;
    }
    /**
     * Remove all contained equations with <code>markedForRemoval == true</code>. 
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2070
     */
    public void removeMarkedEqns() {}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2222
     */
    public void insertTempsInLHS(FClass fClass, boolean param) {}
    /**
     * Index of equation during equation sorting.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2741
     */
    public int sortingIndex = -1;
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2744
     */
    
		public static class SortingIndexComparator implements Comparator<FAbstractEquation> {
			public int compare(FAbstractEquation o1, FAbstractEquation o2) {
				return o1.sortingIndex - o2.sortingIndex;
			}
		}
    /**
     * Creates a TreeSet that can hold FAbstractEquations, sorted by their sortingIndex.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2762
     */
    public static TreeSet<FAbstractEquation> sortingSet() {
		return new TreeSet<FAbstractEquation>(new SortingIndexComparator());
	}
    /**
     * Remove binding expression of variables assigned in this equation.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2927
     */
    public void removeBindingExpOfAssignedVars() {}
    /**
     * Convert this parameter equation to a binding expression.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2978
     */
    public void revertToBindingExp() {}
    /**
     * Mark all variables reinited in this equation as states.
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3673
     */
    public void makeReinitedVarsStates() {}
    /**
     * @aspect LocalIteration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/extentions/LocalIteration.jrag:83
     */
    protected void typeCheckLocalIteration(ErrorCheckType checkType) {
        AnnotationNode node = annotation().vendorNode().forPath("LocalIteration");
        if (!node.exists())
            return;
        AnnotationNode enabledNode = node.forPath("enabled");
        if (enabledNode.exists()) {
            FExp enabledExp = enabledNode.fExp();
            typeCheckEnabled(checkType, enabledExp, type(), enabledNode.isEach());
        }
    }
    /**
     * @aspect DerivativeRewriting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:1001
     */
    public void propagateDerivativeBindings() {
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:77
     */
    public void findBlockFunctionExtraction(AbstractEquationBlock block, ArrayList<FFunctionCall> functions) {

    }
    /**
     * Inline all calls to functions that we can inline.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:754
     */
    public Collection<FAbstractEquation> inlineFunctions(AbstractFunctionInliner fi) {
        return Collections.singletonList((FAbstractEquation)this);
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:21
     */
    public boolean taggedByVProp = false;
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:26
     */
    public void cleanEquations(ArrayList<FAbstractEquation> l) {
        if (!taggedByVProp) {
            l.add(this);
        }
        taggedByVProp = false;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:212
     */
    public void addEquationsToWorkList(Set<FAbstractEquation> wl) {
        wl.add(this);
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:284
     */
    public void variabilityPropagation(FClass.VariabilityPropagator propagator) {
		
	}
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:35
     */
    protected FAbstractEquation convertWhenEqnToIfEqn(Collection<FAbstractEquation> outerNewList, FClass fclass) {
        return this;
    }
    /**
     * Flag for whether or not this if clause/expression 
     * originates from a when clause.
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:125
     */
    private boolean isWhen = false;
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:134
     */
    public void setWhen() { isWhen = true; }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:353
     */
    public static void scalarizeList(Scalarizer.Equation s, List<FAbstractEquation> fromList) {
        for (FAbstractEquation ae : fromList) {
            ae.scalarize(s);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:914
     */
    public List<FAttribute> scalarizeAttributeList(Index i, Map<String,FExp> indexMap) {
        List<FAttribute> scalarized = new List<FAttribute>();
        for (FAttribute a : getFAttributes()) 
            a.scalarize(scalarized, i, indexMap);
        return scalarized;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:921
     */
    public void scalarize(Scalarizer.Equation s) {}
    /**
     * Create a simple equation block from a single equation. 
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:360
     */
    public SimpleEquationBlock createSimpleEquationBlock(Collection<FVariable> fvs, Collection<Integer> assignedIndices, Solvability solvability, EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) {
		throw new UnsupportedOperationException("Unable to construct equation block from equation type " + getClass().getSimpleName());
	}
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:87
     */
    public static List<FAbstractEquation> diffList(String name, List<FAbstractEquation> equations) {
        List<FAbstractEquation> res = new List<FAbstractEquation>();
        for (FAbstractEquation equation : equations) {
            res.addAll(equation.diff(name));
        }
        return res;
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:2184
     */
    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, C extends SCCBlock<E, V>>
    AbstractBiPGraph<E, V, C>.IncidenceMap createIncidenceMap(AbstractBiPGraph<E, V, C> g, EnumSet<AbstractBiPGraph.VarType> variableTypes) {
        return createIncidenceMap(g, variableTypes, g.defaultVariableResolver());
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:2190
     */
    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, C extends SCCBlock<E, V>>
    AbstractBiPGraph<E, V, C>.IncidenceMap createIncidenceMap(AbstractBiPGraph<E, V, C> g, EnumSet<AbstractBiPGraph.VarType> variableTypes,
            AbstractBiPGraph.VariableResolver<E, V> resolver) {
        return g.new IncidenceMap(this, resolver);
    }
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:643
     */
    public <V> AbstractBiPGraph.AssignmentIncidenceMap assignmentIncidenceMap(AbstractBiPGraph g, EnumSet<AbstractBiPGraph.VarType> variableTypes, AbstractBiPGraph.VariableResolver resolver) {
        throw new UnsupportedOperationException("FAbstractEquation.assignmentIncidenceMap() isn't implemented for equations of type " + getClass().getSimpleName() + "!");
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:438
     */
    public FAbstractEquation copySymbolic() { return (FAbstractEquation) super.copySymbolic(); }
    /**
     * Generates AD-code for a single equation. Empty implementation for FAbtractEquation,
     * other types implement their specific functionality.
     * Note that methods called assumes that variables are already declared. 
     * 
     * TODO: Some of the code in these functions are duplicated from the corresponding C codegen!
     * 
     * @param enumerator  An enumerator that is used to number the residual equations
     * @param indent      Indentation
     * @param str         Output stream
     * @param visited     A list that contains all visisted equations.
     * Used by FFunctionCallEquation so that only one function call is generated.
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:826
     */
    public void genResidual_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited, Set<Integer> forIndices) {}
    /**
     * Generates AD code for this equation and a variable in it. Typically called from within 
     * a solved block when printing AD code. Empty standard implementation and other blocks override. 
     * 
     * @param indent        indentation that should be used
     * @param str           output stream
     * @param visited       a set that contains all visited equations. Might be null!
     * @param forVariables  variables to generate assignments for.
     * @param forIndices    indices to generate assignments for.
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1170
     */
    public void genBlock_CAD(String indent, CodeStream str, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1441
     */
    @Override
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                p.printPreSteps(node, str, indent);
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1449
     */
    @Override
    public void genTempFree_CAD(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                p.printPostSteps(node, str, indent);
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1567
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                node.genVarDecls_CAD(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1595
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                node.genVarDecls_C(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2254
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                p.printPreSteps(node, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2262
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        ASTNode attributeList = getFAttributeList();
        for (ASTNode node : this)
            if (node != attributeList)
                p.printPostSteps(node, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2860
     */
    public FExp equationNominal_C(boolean auto) {
        return auto ? nominal() : null;
    }
    /**
     * Generate block code for equations
     * 
     * @param visited      Keeps track of visited equations
     * @param forVariables Variables that should getAll a writeback
     * @param forIndices   Indices of equations that should getAll a writeback
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3416
     */
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3419
     */
    public void genBlockEval_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {}
    /**
     * Generate residual code for equations
     * 
     * @param enumerator Enumerates residuals
     * @param visited    Keeps track of visited equations
     * @param forIndices Indices of equations that should getAll a residual
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3566
     */
    public void genResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator, Set<FAbstractEquation> visited, Set<Integer> forIndices) {}
    /**
     * Generates code for dependent parameter assignments
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3749
     */
    public void genAssignment_C(CodePrinter p, CodeStream str, String indent) {
        genBlock_C(p, str, indent, null, null, null);
    }
    /**
     * Helper, used for writing temp decl for reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:619
     */
    public void genReinitTempDecls_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Helper, used for writing temp init for reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:667
     */
    public void genReinitTempInits_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Helper, used for finding reinits
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:736
     */
    public void collectReinits_C(Map<String, ArrayList<FReinit>> map, boolean initial) {}
    /**
     * @declaredat ASTNode:1
     */
    public FAbstractEquation() {
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
        setChild(new List(), 2);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:16
     */
    public FAbstractEquation(FEquationType p0, List<FAttribute> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        containsFTimeExp_reset();
        containsFHomotopyExp_reset();
        referencedFIdUseExps_reset();
        referencedFVariables_reset();
        inputs_reset();
        realInputs_reset();
        algebraicContinousRealVariables_reset();
        discreteRealVariables_reset();
        discreteIntegerVariables_reset();
        discreteBooleanVariables_reset();
        discreteStringVariables_reset();
        discreteEnumVariables_reset();
        variables_reset();
        type_reset();
        assignedSet_reset();
        getDynamicFAbstractEquationOpt_reset();
        isAliasEquation_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FAbstractEquation_transformedGuards_computed = false;
        FAbstractEquation_transformedGuards_value = null;
        FAbstractEquation_transformedGuards_contributors = null;
        FAbstractEquation_relExpInEquation_computed = false;
        FAbstractEquation_relExpInEquation_value = null;
        FAbstractEquation_relExpInEquation_contributors = null;
        FAbstractEquation_delayExpInEquation_computed = false;
        FAbstractEquation_delayExpInEquation_value = null;
        FAbstractEquation_delayExpInEquation_contributors = null;
        FAbstractEquation_relExpInInitialEquation_computed = false;
        FAbstractEquation_relExpInInitialEquation_value = null;
        FAbstractEquation_relExpInInitialEquation_contributors = null;
        FAbstractEquation_replacedAtInitialExps_computed = false;
        FAbstractEquation_replacedAtInitialExps_value = null;
        FAbstractEquation_replacedAtInitialExps_contributors = null;
        FAbstractEquation_retrieveInputs_computed = false;
        FAbstractEquation_retrieveInputs_value = null;
        FAbstractEquation_retrieveInputs_contributors = null;
        FAbstractEquation_algebraicVariables_computed = false;
        FAbstractEquation_algebraicVariables_value = null;
        FAbstractEquation_algebraicVariables_contributors = null;
        FAbstractEquation_derivativeVariables_computed = false;
        FAbstractEquation_derivativeVariables_value = null;
        FAbstractEquation_derivativeVariables_contributors = null;
        FAbstractEquation_differentiatedRealVariables_computed = false;
        FAbstractEquation_differentiatedRealVariables_value = null;
        FAbstractEquation_differentiatedRealVariables_contributors = null;
        FAbstractEquation_dependentParameters_computed = false;
        FAbstractEquation_dependentParameters_value = null;
        FAbstractEquation_dependentParameters_contributors = null;
        FAbstractEquation_parameters_computed = false;
        FAbstractEquation_parameters_value = null;
        FAbstractEquation_parameters_contributors = null;
        FAbstractEquation_discreteVariables_computed = false;
        FAbstractEquation_discreteVariables_value = null;
        FAbstractEquation_discreteVariables_contributors = null;
        FAbstractEquation_initialParameters_computed = false;
        FAbstractEquation_initialParameters_value = null;
        FAbstractEquation_initialParameters_contributors = null;
        FAbstractEquation_discretePreVariables_computed = false;
        FAbstractEquation_discretePreVariables_value = null;
        FAbstractEquation_discretePreVariables_contributors = null;
        FAbstractEquation_collectUses_computed = false;
        FAbstractEquation_collectUses_value = null;
        FAbstractEquation_collectUses_contributors = null;
        FAbstractEquation_timeExps_computed = false;
        FAbstractEquation_timeExps_value = null;
        FAbstractEquation_timeExps_contributors = null;
        collect_contributors_FAbstractEquation_transformedGuards = false;
        collect_contributors_FAbstractEquation_relExpInEquation = false;
        collect_contributors_FAbstractEquation_delayExpInEquation = false;
        collect_contributors_FAbstractEquation_relExpInInitialEquation = false;
        collect_contributors_FAbstractEquation_replacedAtInitialExps = false;
        collect_contributors_FAbstractEquation_retrieveInputs = false;
        collect_contributors_FAbstractEquation_algebraicVariables = false;
        collect_contributors_FAbstractEquation_derivativeVariables = false;
        collect_contributors_FAbstractEquation_differentiatedRealVariables = false;
        collect_contributors_FAbstractEquation_dependentParameters = false;
        collect_contributors_FAbstractEquation_parameters = false;
        collect_contributors_FAbstractEquation_discreteVariables = false;
        collect_contributors_FAbstractEquation_initialParameters = false;
        collect_contributors_FAbstractEquation_discretePreVariables = false;
        collect_contributors_FAbstractEquation_collectUses = false;
        collect_contributors_FAbstractEquation_timeExps = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:129
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:135
     */
    public FAbstractEquation clone() throws CloneNotSupportedException {
        FAbstractEquation node = (FAbstractEquation) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:146
     */
    public abstract FAbstractEquation fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:153
     */
    public abstract FAbstractEquation treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:161
     */
    public abstract FAbstractEquation treeCopy();
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
        return 2;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(2);
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
        return (Opt<FAbstractEquation>) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 3;
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1312
     */
        private boolean collect_contributors_FAbstractEquation_transformedGuards = false;
    protected void collect_contributors_FAbstractEquation_transformedGuards() {
        if(collect_contributors_FAbstractEquation_transformedGuards) return;
        super.collect_contributors_FAbstractEquation_transformedGuards();
        collect_contributors_FAbstractEquation_transformedGuards = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1416
     */
        private boolean collect_contributors_FAbstractEquation_relExpInEquation = false;
    protected void collect_contributors_FAbstractEquation_relExpInEquation() {
        if(collect_contributors_FAbstractEquation_relExpInEquation) return;
        super.collect_contributors_FAbstractEquation_relExpInEquation();
        collect_contributors_FAbstractEquation_relExpInEquation = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1426
     */
        private boolean collect_contributors_FAbstractEquation_delayExpInEquation = false;
    protected void collect_contributors_FAbstractEquation_delayExpInEquation() {
        if(collect_contributors_FAbstractEquation_delayExpInEquation) return;
        super.collect_contributors_FAbstractEquation_delayExpInEquation();
        collect_contributors_FAbstractEquation_delayExpInEquation = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1473
     */
        private boolean collect_contributors_FAbstractEquation_relExpInInitialEquation = false;
    protected void collect_contributors_FAbstractEquation_relExpInInitialEquation() {
        if(collect_contributors_FAbstractEquation_relExpInInitialEquation) return;
        super.collect_contributors_FAbstractEquation_relExpInInitialEquation();
        collect_contributors_FAbstractEquation_relExpInInitialEquation = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1681
     */
        private boolean collect_contributors_FAbstractEquation_replacedAtInitialExps = false;
    protected void collect_contributors_FAbstractEquation_replacedAtInitialExps() {
        if(collect_contributors_FAbstractEquation_replacedAtInitialExps) return;
        super.collect_contributors_FAbstractEquation_replacedAtInitialExps();
        collect_contributors_FAbstractEquation_replacedAtInitialExps = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2939
     */
        private boolean collect_contributors_FAbstractEquation_retrieveInputs = false;
    protected void collect_contributors_FAbstractEquation_retrieveInputs() {
        if(collect_contributors_FAbstractEquation_retrieveInputs) return;
        super.collect_contributors_FAbstractEquation_retrieveInputs();
        collect_contributors_FAbstractEquation_retrieveInputs = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2973
     */
        private boolean collect_contributors_FAbstractEquation_algebraicVariables = false;
    protected void collect_contributors_FAbstractEquation_algebraicVariables() {
        if(collect_contributors_FAbstractEquation_algebraicVariables) return;
        super.collect_contributors_FAbstractEquation_algebraicVariables();
        collect_contributors_FAbstractEquation_algebraicVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3010
     */
        private boolean collect_contributors_FAbstractEquation_derivativeVariables = false;
    protected void collect_contributors_FAbstractEquation_derivativeVariables() {
        if(collect_contributors_FAbstractEquation_derivativeVariables) return;
        super.collect_contributors_FAbstractEquation_derivativeVariables();
        collect_contributors_FAbstractEquation_derivativeVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3020
     */
        private boolean collect_contributors_FAbstractEquation_differentiatedRealVariables = false;
    protected void collect_contributors_FAbstractEquation_differentiatedRealVariables() {
        if(collect_contributors_FAbstractEquation_differentiatedRealVariables) return;
        super.collect_contributors_FAbstractEquation_differentiatedRealVariables();
        collect_contributors_FAbstractEquation_differentiatedRealVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3030
     */
        private boolean collect_contributors_FAbstractEquation_dependentParameters = false;
    protected void collect_contributors_FAbstractEquation_dependentParameters() {
        if(collect_contributors_FAbstractEquation_dependentParameters) return;
        super.collect_contributors_FAbstractEquation_dependentParameters();
        collect_contributors_FAbstractEquation_dependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3040
     */
        private boolean collect_contributors_FAbstractEquation_parameters = false;
    protected void collect_contributors_FAbstractEquation_parameters() {
        if(collect_contributors_FAbstractEquation_parameters) return;
        super.collect_contributors_FAbstractEquation_parameters();
        collect_contributors_FAbstractEquation_parameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3050
     */
        private boolean collect_contributors_FAbstractEquation_discreteVariables = false;
    protected void collect_contributors_FAbstractEquation_discreteVariables() {
        if(collect_contributors_FAbstractEquation_discreteVariables) return;
        super.collect_contributors_FAbstractEquation_discreteVariables();
        collect_contributors_FAbstractEquation_discreteVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3060
     */
        private boolean collect_contributors_FAbstractEquation_initialParameters = false;
    protected void collect_contributors_FAbstractEquation_initialParameters() {
        if(collect_contributors_FAbstractEquation_initialParameters) return;
        super.collect_contributors_FAbstractEquation_initialParameters();
        collect_contributors_FAbstractEquation_initialParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3070
     */
        private boolean collect_contributors_FAbstractEquation_discretePreVariables = false;
    protected void collect_contributors_FAbstractEquation_discretePreVariables() {
        if(collect_contributors_FAbstractEquation_discretePreVariables) return;
        super.collect_contributors_FAbstractEquation_discretePreVariables();
        collect_contributors_FAbstractEquation_discretePreVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3175
     */
        private boolean collect_contributors_FAbstractEquation_collectUses = false;
    protected void collect_contributors_FAbstractEquation_collectUses() {
        if(collect_contributors_FAbstractEquation_collectUses) return;
        super.collect_contributors_FAbstractEquation_collectUses();
        collect_contributors_FAbstractEquation_collectUses = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:192
     */
        private boolean collect_contributors_FAbstractEquation_timeExps = false;
    protected void collect_contributors_FAbstractEquation_timeExps() {
        if(collect_contributors_FAbstractEquation_timeExps) return;
        super.collect_contributors_FAbstractEquation_timeExps();
        collect_contributors_FAbstractEquation_timeExps = true;
    }

    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = -1;

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
        size_value = Size.SCALAR;
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size totalSize() {
        ASTNode$State state = state();
        Size totalSize_value = size().expand(parentTotalSize());

        return totalSize_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:562
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts expandedSubscripts() {
        ASTNode$State state = state();
        try {
        		FArraySubscripts fas = parentExpandedSubscripts();
        		Size size = size();
        		for (int i = 0; i < size.ndims(); i++) {
        			fas.addFSubscript(size.createExpandedFSubscript(i));
        		}
        		return fas;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalParameter(VariableEvaluator evaluator, FVariable fv) {
        ASTNode$State state = state();
        CValue cevalParameter_VariableEvaluator_FVariable_value = CValue.UNKNOWN;

        return cevalParameter_VariableEvaluator_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalParameter(VariableEvaluator evaluator, FVariable fv, Index i) {
        ASTNode$State state = state();
        CValue cevalParameter_VariableEvaluator_FVariable_Index_value = CValue.UNKNOWN;

        return cevalParameter_VariableEvaluator_FVariable_Index_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean containsFTimeExp_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean containsFTimeExp_value;
    /**
     * @apilevel internal
     */
    private void containsFTimeExp_reset() {
        containsFTimeExp_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsFTimeExp() {
        if(containsFTimeExp_computed) {
            return containsFTimeExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        containsFTimeExp_value = super.containsFTimeExp();
        if (isFinal && num == state().boundariesCrossed) {
            containsFTimeExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return containsFTimeExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean containsFHomotopyExp_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean containsFHomotopyExp_value;
    /**
     * @apilevel internal
     */
    private void containsFHomotopyExp_reset() {
        containsFHomotopyExp_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsFHomotopyExp() {
        if(containsFHomotopyExp_computed) {
            return containsFHomotopyExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        containsFHomotopyExp_value = super.containsFHomotopyExp();
        if (isFinal && num == state().boundariesCrossed) {
            containsFHomotopyExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return containsFHomotopyExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        ASTNode$State state = state();
        int numScalarEquations_value = 1;

        return numScalarEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMetaEquation() {
        ASTNode$State state = state();
        boolean isMetaEquation_value = numScalarEquations() == 0;

        return isMetaEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroEquation() {
        ASTNode$State state = state();
        boolean isZeroEquation_value = false;

        return isZeroEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> boundParameters() {
        ASTNode$State state = state();
        Set<FVariable> boundParameters_value = Collections.emptySet();

        return boundParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> RHSVariables() {
        ASTNode$State state = state();
        Set<FVariable> RHSVariables_value = Collections.emptySet();

        return RHSVariables_value;
    }
    /**
     * Returns the outermost enclosing equation or the equation itself if it is
     * the outermost.
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1595
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation outermostEnclosingEquation() {
        ASTNode$State state = state();
        try {
                FAbstractEquation enclosing = this;
                FAbstractEquation next = enclosingEquation();
                while (next != null) {
                    enclosing = next;
                    next = enclosing.enclosingEquation();
                }
                return enclosing;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean replacedAtInitialization() {
        ASTNode$State state = state();
        boolean replacedAtInitialization_value = isWhen() || replacedAtInitialExps().size() > 0;

        return replacedAtInitialization_value;
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
            List<FAbstractEquation> l = new List<FAbstractEquation>();
            if (replacedAtInitialization()) {
                l.add((FAbstractEquation) copySymbolic());
            }
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS() {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInRHS_value = FIdUseExpsInRHS(DefaultFidUseExpLookupVisitor.instance);

        return FIdUseExpsInRHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInRHS_FIdUseExpLookupVisitor_value = Collections.emptySet();

        return FIdUseExpsInRHS_FIdUseExpLookupVisitor_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS() {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInLHS_value = FIdUseExpsInLHS(DefaultFidUseExpLookupVisitor.instance);

        return FIdUseExpsInLHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        Set<FIdUseExp> FIdUseExpsInLHS_FIdUseExpLookupVisitor_value = Collections.emptySet();

        return FIdUseExpsInLHS_FIdUseExpLookupVisitor_value;
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2142
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FIdUseExp> uniqueFIdUseExpsInLHS() {
        ASTNode$State state = state();
        try {
                ArrayList<FIdUseExp>   res   = new ArrayList<FIdUseExp>();
                Set<FAbstractVariable> visit = new LinkedHashSet<FAbstractVariable>();
                for (FIdUseExp e : FIdUseExpsInLHS()) {
                    FAbstractVariable fv = e.myFV();
                    if (!visit.contains(fv)) {
                        visit.add(fv);
                        res.add(e);
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean referencedFIdUseExps_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FIdUseExp> referencedFIdUseExps_value;
    /**
     * @apilevel internal
     */
    private void referencedFIdUseExps_reset() {
        referencedFIdUseExps_computed = false;
        referencedFIdUseExps_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> referencedFIdUseExps() {
        if(referencedFIdUseExps_computed) {
            return referencedFIdUseExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        referencedFIdUseExps_value = referencedFIdUseExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            referencedFIdUseExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return referencedFIdUseExps_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FIdUseExp> referencedFIdUseExps_compute() {
            Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
            res.addAll(FIdUseExpsInRHS());
            res.addAll(FIdUseExpsInLHS());
            return res;
        }
    /***
     * DANGER! Use this method and its results with caution. It will probably
     * not work before saclarization but should be safe afterwards!
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2166
     */
    @ASTNodeAnnotation.Attribute
    public Set<String> referencedVariablesAsStrings() {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> exps = new LinkedHashSet<FIdUseExp>();
                Set<String> res = new LinkedHashSet<String>();
                for (FIdUseExp exp : exps) {
                    res.add(exp.name());
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> variableDependenciesRHS() {
        ASTNode$State state = state();
        Set<FVariable> variableDependenciesRHS_value = referencedFVariablesInRHS();

        return variableDependenciesRHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariablesInRHS() {
        ASTNode$State state = state();
        Set<FVariable> referencedFVariablesInRHS_value = lookupFVariablesInSet(FIdUseExpsInRHS());

        return referencedFVariablesInRHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariablesInLHS() {
        ASTNode$State state = state();
        Set<FVariable> referencedFVariablesInLHS_value = lookupFVariablesInSet(FIdUseExpsInLHS());

        return referencedFVariablesInLHS_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean referencedFVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FVariable> referencedFVariables_value;
    /**
     * @apilevel internal
     */
    private void referencedFVariables_reset() {
        referencedFVariables_computed = false;
        referencedFVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariables() {
        if(referencedFVariables_computed) {
            return referencedFVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        referencedFVariables_value = lookupFVariablesInSet(referencedFIdUseExps());
        if (isFinal && num == state().boundariesCrossed) {
            referencedFVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return referencedFVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean assignedInAllBranches(FAbstractVariable var) {
        ASTNode$State state = state();
        boolean assignedInAllBranches_FAbstractVariable_value = true;

        return assignedInAllBranches_FAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findAttribute(String name) {
        ASTNode$State state = state();
        FAttribute findAttribute_String_value = findMatching(getFAttributes(), name);

        return findAttribute_String_value;
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
                FExp nom = FExp.nominalDefault();
                nom.setParent(this);
                return nom;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean inputs_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> inputs_value;
    /**
     * @apilevel internal
     */
    private void inputs_reset() {
        inputs_computed = false;
        inputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> inputs() {
        if(inputs_computed) {
            return inputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        inputs_value = retrieveInputs();
        if (isFinal && num == state().boundariesCrossed) {
            inputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return inputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean realInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> realInputs_value;
    /**
     * @apilevel internal
     */
    private void realInputs_reset() {
        realInputs_computed = false;
        realInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> realInputs() {
        if(realInputs_computed) {
            return realInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realInputs_value = new LinkedHashSet<FVariable>(FClass.filterCollection(inputs(), FClass.REAL_VARIABLE_FILTER));
        if (isFinal && num == state().boundariesCrossed) {
            realInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean algebraicContinousRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> algebraicContinousRealVariables_value;
    /**
     * @apilevel internal
     */
    private void algebraicContinousRealVariables_reset() {
        algebraicContinousRealVariables_computed = false;
        algebraicContinousRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> algebraicContinousRealVariables() {
        if(algebraicContinousRealVariables_computed) {
            return algebraicContinousRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicContinousRealVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().algebraicContinousRealVariables());
        if (isFinal && num == state().boundariesCrossed) {
            algebraicContinousRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicContinousRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> discreteRealVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteRealVariables_reset() {
        discreteRealVariables_computed = false;
        discreteRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteRealVariables() {
        if(discreteRealVariables_computed) {
            return discreteRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteRealVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().discreteRealVariables());
        if (isFinal && num == state().boundariesCrossed) {
            discreteRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteIntegerVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> discreteIntegerVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteIntegerVariables_reset() {
        discreteIntegerVariables_computed = false;
        discreteIntegerVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteIntegerVariables() {
        if(discreteIntegerVariables_computed) {
            return discreteIntegerVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteIntegerVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().discreteIntegerVariables());
        if (isFinal && num == state().boundariesCrossed) {
            discreteIntegerVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteIntegerVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteBooleanVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> discreteBooleanVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteBooleanVariables_reset() {
        discreteBooleanVariables_computed = false;
        discreteBooleanVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteBooleanVariables() {
        if(discreteBooleanVariables_computed) {
            return discreteBooleanVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteBooleanVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().discreteBooleanVariables());
        if (isFinal && num == state().boundariesCrossed) {
            discreteBooleanVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteBooleanVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteStringVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> discreteStringVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteStringVariables_reset() {
        discreteStringVariables_computed = false;
        discreteStringVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteStringVariables() {
        if(discreteStringVariables_computed) {
            return discreteStringVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteStringVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().discreteStringVariables());
        if (isFinal && num == state().boundariesCrossed) {
            discreteStringVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteStringVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteEnumVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> discreteEnumVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteEnumVariables_reset() {
        discreteEnumVariables_computed = false;
        discreteEnumVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteEnumVariables() {
        if(discreteEnumVariables_computed) {
            return discreteEnumVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteEnumVariables_value = FClass.intersectFVSet(algebraicVariables(), myFClass().discreteStringVariables());
        if (isFinal && num == state().boundariesCrossed) {
            discreteEnumVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteEnumVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean variables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> variables_value;
    /**
     * @apilevel internal
     */
    private void variables_reset() {
        variables_computed = false;
        variables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> variables() {
        if(variables_computed) {
            return variables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        variables_value = variables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            variables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return variables_value;
    }
    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> variables_compute() {
            LinkedHashSet<FVariable> l = new LinkedHashSet<FVariable>();
            l.addAll(differentiatedRealVariables());
            l.addAll(derivativeVariables());
            l.addAll(algebraicVariables());
            l.addAll(discreteVariables());
            return l;
        }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3182
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> collectUses(Set<FVariable> vars) {
        ASTNode$State state = state();
        try {
                HashSet<FIdUseExp> set = new HashSet<FIdUseExp>();
                for (FIdUseExp e : collectUses()) {
                    if (vars.contains(e.myFV())) {
                        set.add(e);         
                    }
                }
                return set;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3192
     */
    @ASTNodeAnnotation.Attribute
    public boolean checkLinearity(Set<FVariable> vars) {
        ASTNode$State state = state();
        try {
                for (FIdUseExp e : collectUses(vars)) {
                    if (!e.isLinear(vars)) {
                        return false;
                    }
                }
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numScalars() {
        ASTNode$State state = state();
        int numScalars_value = numScalarEquations();

        return numScalars_value;
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
    /**
     * Check if this FAbstractEquation contains any active annotation attributes.
     * @attribute syn
     * @aspect AttributeUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2092
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
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = isReal(true);

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonReal() {
        ASTNode$State state = state();
        boolean isNonReal_value = !isReal(false);

        return isNonReal_value;
    }
    /**
     * True if this equation equates at least one real type and one non real type.
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:139
     */
    @ASTNodeAnnotation.Attribute
    public boolean isMixed() {
        ASTNode$State state = state();
        try {
                return !isReal(true) && isReal(false);
            }
        finally {
        }
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
                boolean res = exclusive;
                for (FVariable fv : referencedFVariablesInLHS()) {
                    boolean fvRes = fv.isReal();
                    res = exclusive ? res && fvRes : res || fvRes;
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasConstructorCall(Index i) {
        ASTNode$State state = state();
        boolean hasConstructorCall_Index_value = false;

        return hasConstructorCall_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = fContinuous();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = variability().constantVariability();

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameter() {
        ASTNode$State state = state();
        boolean isParameter_value = variability().parameterVariability();

        return isParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscrete() {
        ASTNode$State state = state();
        boolean isDiscrete_value = variability().discreteVariability();

        return isDiscrete_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isContinuous() {
        ASTNode$State state = state();
        boolean isContinuous_value = variability().continuousVariability();

        return isContinuous_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable assignedFV() {
        ASTNode$State state = state();
        FAbstractVariable assignedFV_value = null;

        return assignedFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsConnect() {
        ASTNode$State state = state();
        boolean containsConnect_value = false;

        return containsConnect_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignmentEqn() {
        ASTNode$State state = state();
        boolean isAssignmentEqn_value = false;

        return isAssignmentEqn_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquations() {
        ASTNode$State state = state();
        boolean hasFunctionCallEquations_value = false;

        return hasFunctionCallEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquationsWithLefts() {
        ASTNode$State state = state();
        boolean hasFunctionCallEquationsWithLefts_value = false;

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
        assignedSet_value = Collections.emptySet();
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
    protected boolean getDynamicFAbstractEquationOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getDynamicFAbstractEquationOpt_value;
    /**
     * @apilevel internal
     */
    private void getDynamicFAbstractEquationOpt_reset() {
        getDynamicFAbstractEquationOpt_computed = false;
        getDynamicFAbstractEquationOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getDynamicFAbstractEquationOpt() {
        if(getDynamicFAbstractEquationOpt_computed) {
            return (Opt) getChild(getDynamicFAbstractEquationOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getDynamicFAbstractEquationOpt_value = new DynamicOpt();
        setChild(getDynamicFAbstractEquationOpt_value, getDynamicFAbstractEquationOptChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getDynamicFAbstractEquationOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt node = (Opt) this.getChild(getDynamicFAbstractEquationOptChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = variability().continuousVariability();

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = new FAttributeListAnnotationNode(getFAttributes());

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable isPrePropagationEquation() {
        ASTNode$State state = state();
        FAbstractVariable isPrePropagationEquation_value = null;

        return isPrePropagationEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean potentialAliasEquation() {
        ASTNode$State state = state();
        boolean potentialAliasEquation_value = false;

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
        isAliasEquation_value = false;
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
        boolean isSameVariableEquality_value = false;

        return isSameVariableEquality_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSampleEquation() {
        ASTNode$State state = state();
        boolean isSampleEquation_value = false;

        return isSampleEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp createResidualExp() {
        ASTNode$State state = state();
        FExp createResidualExp_value = null;

        return createResidualExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp assignmentExp() {
        ASTNode$State state = state();
        FExp assignmentExp_value = null;

        return assignmentExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean allowGlobalOnIfRewrite() {
        ASTNode$State state = state();
        boolean allowGlobalOnIfRewrite_value = false;

        return allowGlobalOnIfRewrite_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentParameterEquation() {
        ASTNode$State state = state();
        boolean isIndependentParameterEquation_value = false;

        return isIndependentParameterEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroFlowForm() {
        ASTNode$State state = state();
        boolean isZeroFlowForm_value = false;

        return isZeroFlowForm_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstantZeroFlow() {
        ASTNode$State state = state();
        boolean isConstantZeroFlow_value = false;

        return isConstantZeroFlow_value;
    }
    /**
     * @attribute syn
     * @aspect LocalIteration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/extentions/LocalIteration.jrag:73
     */
    @ASTNodeAnnotation.Attribute
    public boolean canUseLocalIteration() {
        ASTNode$State state = state();
        try {
                String option = myOptions().getStringOption("local_iteration_in_tearing");
                if (option == OptionRegistry.LocalIteration.OFF)
                    return false;
                else if (option == OptionRegistry.LocalIteration.ANNOTATION)
                    return hasLocalIteration();
                else
                    return true;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect LocalIteration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/extentions/LocalIteration.jrag:94
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasLocalIteration() {
        ASTNode$State state = state();
        try {
                AnnotationNode node = annotation().vendorNode().forPath("LocalIteration");
                if (!node.exists())
                    return false;
                AnnotationNode enabledNode = node.forPath("enabled");
                return !enabledNode.exists() || enabledNode.bool();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDerivativeBindingEquation() {
        ASTNode$State state = state();
        boolean isDerivativeBindingEquation_value = false;

        return isDerivativeBindingEquation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = false;

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = false;

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        boolean canPropagate_value = canPropagateContext() && !containsActiveAnnotations();

        return canPropagate_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isWhen() {
        ASTNode$State state = state();
        boolean isWhen_value = isWhen;

        return isWhen_value;
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
                throw new EquationDifferentiationException(this, "Cannot differentate the equation:\n   " + prettyPrint(""));
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp asSubExp() {
        ASTNode$State state = state();
        FExp asSubExp_value = new FNoExp();

        return asSubExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue OIS_ceval(VariableEvaluator evaluator, FVariable var) {
        ASTNode$State state = state();
        CValue OIS_ceval_VariableEvaluator_FVariable_value = CValue.UNKNOWN;

        return OIS_ceval_VariableEvaluator_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean OIS_consistencyCheck(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        boolean OIS_consistencyCheck_VariableEvaluator_value = false;

        return OIS_consistencyCheck_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public Solvability isSolved(FVariable var) {
        ASTNode$State state = state();
        Solvability isSolved_FVariable_value = isSolved(var, false);

        return isSolved_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public Solvability isSolved(FVariable var, boolean duringTearing) {
        ASTNode$State state = state();
        Solvability isSolved_FVariable_boolean_value = Solvability.UNSOLVABLE;

        return isSolved_FVariable_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "equ";

        return xmlNamespace_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldProduceNonRealGuard_C(Collection<FVariable> fv) {
        ASTNode$State state = state();
        boolean shouldProduceNonRealGuard_C_Collection_FVariable__value = !isSampleEquation() && !fv.iterator().next().isTemporary();

        return shouldProduceNonRealGuard_C_Collection_FVariable__value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:548
     */
    @ASTNodeAnnotation.Attribute
    public Size parentTotalSize() {
        ASTNode$State state = state();
        Size parentTotalSize_value = getParent().Define_parentTotalSize(this, null);

        return parentTotalSize_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:571
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts parentExpandedSubscripts() {
        ASTNode$State state = state();
        FArraySubscripts parentExpandedSubscripts_value = getParent().Define_parentExpandedSubscripts(this, null);

        return parentExpandedSubscripts_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1573
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1587
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation enclosingEquation() {
        ASTNode$State state = state();
        FAbstractEquation enclosingEquation_value = getParent().Define_enclosingEquation(this, null);

        return enclosingEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1664
     */
    @ASTNodeAnnotation.Attribute
    public boolean isParameterEquation() {
        ASTNode$State state = state();
        boolean isParameterEquation_value = getParent().Define_isParameterEquation(this, null);

        return isParameterEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1668
     */
    @ASTNodeAnnotation.Attribute
    public boolean isNormalEquation() {
        ASTNode$State state = state();
        boolean isNormalEquation_value = getParent().Define_isNormalEquation(this, null);

        return isNormalEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1674
     */
    @ASTNodeAnnotation.Attribute
    public List<FAbstractEquation> myFAbstractEquationList() {
        ASTNode$State state = state();
        List<FAbstractEquation> myFAbstractEquationList_value = getParent().Define_myFAbstractEquationList(this, null);

        return myFAbstractEquationList_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1605
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1883
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1888
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1925
     */
    @ASTNodeAnnotation.Attribute
    public boolean inWhen() {
        ASTNode$State state = state();
        boolean inWhen_value = getParent().Define_inWhen(this, null);

        return inWhen_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1940
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInitial() {
        ASTNode$State state = state();
        boolean isInitial_value = getParent().Define_isInitial(this, null);

        return isInitial_value;
    }
    /**
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:373
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation surroundingFAbstractEquation() {
        ASTNode$State state = state();
        FAbstractEquation surroundingFAbstractEquation_value = getParent().Define_surroundingFAbstractEquation(this, null);

        return surroundingFAbstractEquation_value;
    }
    /**
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:420
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockBranch(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean lockBranch_ErrorCheckType_value = getParent().Define_lockBranch(this, null, checkType);

        return lockBranch_ErrorCheckType_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:762
     */
    @ASTNodeAnnotation.Attribute
    public InstNode myInstNode() {
        ASTNode$State state = state();
        InstNode myInstNode_value = getParent().Define_myInstNode(this, null);

        return myInstNode_value;
    }
    /**
     * @attribute inh
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:106
     */
    @ASTNodeAnnotation.Attribute
    public boolean canPropagateContext() {
        ASTNode$State state = state();
        boolean canPropagateContext_value = getParent().Define_canPropagateContext(this, null);

        return canPropagateContext_value;
    }
    /**
     * @attribute inh
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1289
     */
    @ASTNodeAnnotation.Attribute
    public FIfWhenEquation surroundingIfOrElse() {
        ASTNode$State state = state();
        FIfWhenEquation surroundingIfOrElse_value = getParent().Define_surroundingIfOrElse(this, null);

        return surroundingIfOrElse_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:40
     * @apilevel internal
     */
    public boolean Define_inArraySubscripts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1431
     * @apilevel internal
     */
    public FStatement Define_myFStatement(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1556
     * @apilevel internal
     */
    public boolean Define_inFEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1560
     * @apilevel internal
     */
    public FAbstractEquation Define_myFEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1587
     * @apilevel internal
     */
    public FAbstractEquation Define_enclosingEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2981
     * @apilevel internal
     */
    public boolean Define_inAlgebraicAccessLocation(ASTNode caller, ASTNode child) {
        if (caller == getFAttributeListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return false;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return true;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3151
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3729
     * @apilevel internal
     */
    public FAlgorithm Define_myFAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1645
     * @apilevel internal
     */
    public boolean Define_inAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1893
     * @apilevel internal
     */
    public boolean Define_inEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1909
     * @apilevel internal
     */
    public boolean Define_inConnectClause(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1916
     * @apilevel internal
     */
    public boolean Define_inIfCondition(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1943
     * @apilevel internal
     */
    public boolean Define_isInitial(ASTNode caller, ASTNode child) {
        if (caller == getInitialEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_isInitial(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:372
     * @apilevel internal
     */
    public FAbstractEquation Define_surroundingFAbstractEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1838
     * @apilevel internal
     */
    public boolean Define_isElse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2343
     * @apilevel internal
     */
    public boolean Define_shouldExtract(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4141
     * @apilevel internal
     */
    public boolean Define_hasBrancher(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4183
     * @apilevel internal
     */
    public FExp Define_parentFExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:334
     * @apilevel internal
     */
    public boolean Define_inFunctionArg(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1312
     */
    @ASTNodeAnnotation.Attribute
    public Set<FExp> transformedGuards() {
        if(FAbstractEquation_transformedGuards_computed) {
            return FAbstractEquation_transformedGuards_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_transformedGuards_value = transformedGuards_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_transformedGuards_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_transformedGuards_value;
    }
    Collection FAbstractEquation_transformedGuards_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for transformedGuards
     */
    public Collection FAbstractEquation_transformedGuards_contributors() {
        if(FAbstractEquation_transformedGuards_contributors == null)
            FAbstractEquation_transformedGuards_contributors  = new LinkedList();
        return FAbstractEquation_transformedGuards_contributors;
    }

    /**
     * @apilevel internal
     */
    private Set<FExp> transformedGuards_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_transformedGuards();
        FAbstractEquation_transformedGuards_value = new HashSet<FExp>();
        if(FAbstractEquation_transformedGuards_contributors != null)
        for (Iterator iter = FAbstractEquation_transformedGuards_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(FAbstractEquation_transformedGuards_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_transformedGuards_contributors = null;
        return FAbstractEquation_transformedGuards_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_transformedGuards_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FExp> FAbstractEquation_transformedGuards_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_transformedGuards_reset() {
        FAbstractEquation_transformedGuards_computed = false;
        FAbstractEquation_transformedGuards_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1416
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpInEquation() {
        if(FAbstractEquation_relExpInEquation_computed) {
            return FAbstractEquation_relExpInEquation_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_relExpInEquation_value = relExpInEquation_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_relExpInEquation_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_relExpInEquation_value;
    }
    Collection FAbstractEquation_relExpInEquation_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for relExpInEquation
     */
    public Collection FAbstractEquation_relExpInEquation_contributors() {
        if(FAbstractEquation_relExpInEquation_contributors == null)
            FAbstractEquation_relExpInEquation_contributors  = new LinkedList();
        return FAbstractEquation_relExpInEquation_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRelExp> relExpInEquation_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_relExpInEquation();
        FAbstractEquation_relExpInEquation_value = new ArrayList<FRelExp>();
        if(FAbstractEquation_relExpInEquation_contributors != null)
        for (Iterator iter = FAbstractEquation_relExpInEquation_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_relExpInEquation(FAbstractEquation_relExpInEquation_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_relExpInEquation_contributors = null;
        return FAbstractEquation_relExpInEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_relExpInEquation_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRelExp> FAbstractEquation_relExpInEquation_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_relExpInEquation_reset() {
        FAbstractEquation_relExpInEquation_computed = false;
        FAbstractEquation_relExpInEquation_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1426
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FDelayExp> delayExpInEquation() {
        if(FAbstractEquation_delayExpInEquation_computed) {
            return FAbstractEquation_delayExpInEquation_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_delayExpInEquation_value = delayExpInEquation_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_delayExpInEquation_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_delayExpInEquation_value;
    }
    Collection FAbstractEquation_delayExpInEquation_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for delayExpInEquation
     */
    public Collection FAbstractEquation_delayExpInEquation_contributors() {
        if(FAbstractEquation_delayExpInEquation_contributors == null)
            FAbstractEquation_delayExpInEquation_contributors  = new LinkedList();
        return FAbstractEquation_delayExpInEquation_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FDelayExp> delayExpInEquation_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_delayExpInEquation();
        FAbstractEquation_delayExpInEquation_value = new ArrayList<FDelayExp>();
        if(FAbstractEquation_delayExpInEquation_contributors != null)
        for (Iterator iter = FAbstractEquation_delayExpInEquation_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_delayExpInEquation(FAbstractEquation_delayExpInEquation_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_delayExpInEquation_contributors = null;
        return FAbstractEquation_delayExpInEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_delayExpInEquation_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FDelayExp> FAbstractEquation_delayExpInEquation_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_delayExpInEquation_reset() {
        FAbstractEquation_delayExpInEquation_computed = false;
        FAbstractEquation_delayExpInEquation_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1473
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpInInitialEquation() {
        if(FAbstractEquation_relExpInInitialEquation_computed) {
            return FAbstractEquation_relExpInInitialEquation_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_relExpInInitialEquation_value = relExpInInitialEquation_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_relExpInInitialEquation_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_relExpInInitialEquation_value;
    }
    Collection FAbstractEquation_relExpInInitialEquation_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for relExpInInitialEquation
     */
    public Collection FAbstractEquation_relExpInInitialEquation_contributors() {
        if(FAbstractEquation_relExpInInitialEquation_contributors == null)
            FAbstractEquation_relExpInInitialEquation_contributors  = new LinkedList();
        return FAbstractEquation_relExpInInitialEquation_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRelExp> relExpInInitialEquation_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_relExpInInitialEquation();
        FAbstractEquation_relExpInInitialEquation_value = new ArrayList<FRelExp>();
        if(FAbstractEquation_relExpInInitialEquation_contributors != null)
        for (Iterator iter = FAbstractEquation_relExpInInitialEquation_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_relExpInInitialEquation(FAbstractEquation_relExpInInitialEquation_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_relExpInInitialEquation_contributors = null;
        return FAbstractEquation_relExpInInitialEquation_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_relExpInInitialEquation_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRelExp> FAbstractEquation_relExpInInitialEquation_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_relExpInInitialEquation_reset() {
        FAbstractEquation_relExpInInitialEquation_computed = false;
        FAbstractEquation_relExpInInitialEquation_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1681
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> replacedAtInitialExps() {
        if(FAbstractEquation_replacedAtInitialExps_computed) {
            return FAbstractEquation_replacedAtInitialExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_replacedAtInitialExps_value = replacedAtInitialExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_replacedAtInitialExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_replacedAtInitialExps_value;
    }
    Collection FAbstractEquation_replacedAtInitialExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for replacedAtInitialExps
     */
    public Collection FAbstractEquation_replacedAtInitialExps_contributors() {
        if(FAbstractEquation_replacedAtInitialExps_contributors == null)
            FAbstractEquation_replacedAtInitialExps_contributors  = new LinkedList();
        return FAbstractEquation_replacedAtInitialExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FExp> replacedAtInitialExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_replacedAtInitialExps();
        FAbstractEquation_replacedAtInitialExps_value = new ArrayList<FExp>();
        if(FAbstractEquation_replacedAtInitialExps_contributors != null)
        for (Iterator iter = FAbstractEquation_replacedAtInitialExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(FAbstractEquation_replacedAtInitialExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_replacedAtInitialExps_contributors = null;
        return FAbstractEquation_replacedAtInitialExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_replacedAtInitialExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> FAbstractEquation_replacedAtInitialExps_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_replacedAtInitialExps_reset() {
        FAbstractEquation_replacedAtInitialExps_computed = false;
        FAbstractEquation_replacedAtInitialExps_value = null;
    }
    /**
     * Collection attribute returning all input variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2939
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> retrieveInputs() {
        if(FAbstractEquation_retrieveInputs_computed) {
            return FAbstractEquation_retrieveInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_retrieveInputs_value = retrieveInputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_retrieveInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_retrieveInputs_value;
    }
    Collection FAbstractEquation_retrieveInputs_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for retrieveInputs
     */
    public Collection FAbstractEquation_retrieveInputs_contributors() {
        if(FAbstractEquation_retrieveInputs_contributors == null)
            FAbstractEquation_retrieveInputs_contributors  = new LinkedList();
        return FAbstractEquation_retrieveInputs_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> retrieveInputs_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_retrieveInputs();
        FAbstractEquation_retrieveInputs_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_retrieveInputs_contributors != null)
        for (Iterator iter = FAbstractEquation_retrieveInputs_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_retrieveInputs(FAbstractEquation_retrieveInputs_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_retrieveInputs_contributors = null;
        return FAbstractEquation_retrieveInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_retrieveInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_retrieveInputs_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_retrieveInputs_reset() {
        FAbstractEquation_retrieveInputs_computed = false;
        FAbstractEquation_retrieveInputs_value = null;
    }
    /**
     * Collection attribute returning all algebraic variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2973
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> algebraicVariables() {
        if(FAbstractEquation_algebraicVariables_computed) {
            return FAbstractEquation_algebraicVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_algebraicVariables_value = algebraicVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_algebraicVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_algebraicVariables_value;
    }
    Collection FAbstractEquation_algebraicVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for algebraicVariables
     */
    public Collection FAbstractEquation_algebraicVariables_contributors() {
        if(FAbstractEquation_algebraicVariables_contributors == null)
            FAbstractEquation_algebraicVariables_contributors  = new LinkedList();
        return FAbstractEquation_algebraicVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> algebraicVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_algebraicVariables();
        FAbstractEquation_algebraicVariables_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_algebraicVariables_contributors != null)
        for (Iterator iter = FAbstractEquation_algebraicVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_algebraicVariables(FAbstractEquation_algebraicVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_algebraicVariables_contributors = null;
        return FAbstractEquation_algebraicVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_algebraicVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_algebraicVariables_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_algebraicVariables_reset() {
        FAbstractEquation_algebraicVariables_computed = false;
        FAbstractEquation_algebraicVariables_value = null;
    }
    /**
     * Collection attribute returning all derivative variables (FDerivativeVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3010
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FDerivativeVariable> derivativeVariables() {
        if(FAbstractEquation_derivativeVariables_computed) {
            return FAbstractEquation_derivativeVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_derivativeVariables_value = derivativeVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_derivativeVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_derivativeVariables_value;
    }
    Collection FAbstractEquation_derivativeVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for derivativeVariables
     */
    public Collection FAbstractEquation_derivativeVariables_contributors() {
        if(FAbstractEquation_derivativeVariables_contributors == null)
            FAbstractEquation_derivativeVariables_contributors  = new LinkedList();
        return FAbstractEquation_derivativeVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FDerivativeVariable> derivativeVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_derivativeVariables();
        FAbstractEquation_derivativeVariables_value = new LinkedHashSet<FDerivativeVariable>();
        if(FAbstractEquation_derivativeVariables_contributors != null)
        for (Iterator iter = FAbstractEquation_derivativeVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_derivativeVariables(FAbstractEquation_derivativeVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_derivativeVariables_contributors = null;
        return FAbstractEquation_derivativeVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_derivativeVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FDerivativeVariable> FAbstractEquation_derivativeVariables_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_derivativeVariables_reset() {
        FAbstractEquation_derivativeVariables_computed = false;
        FAbstractEquation_derivativeVariables_value = null;
    }
    /**
     * Collection attribute returning all differentiated variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3020
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> differentiatedRealVariables() {
        if(FAbstractEquation_differentiatedRealVariables_computed) {
            return FAbstractEquation_differentiatedRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_differentiatedRealVariables_value = differentiatedRealVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_differentiatedRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_differentiatedRealVariables_value;
    }
    Collection FAbstractEquation_differentiatedRealVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for differentiatedRealVariables
     */
    public Collection FAbstractEquation_differentiatedRealVariables_contributors() {
        if(FAbstractEquation_differentiatedRealVariables_contributors == null)
            FAbstractEquation_differentiatedRealVariables_contributors  = new LinkedList();
        return FAbstractEquation_differentiatedRealVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> differentiatedRealVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_differentiatedRealVariables();
        FAbstractEquation_differentiatedRealVariables_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_differentiatedRealVariables_contributors != null)
        for (Iterator iter = FAbstractEquation_differentiatedRealVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_differentiatedRealVariables(FAbstractEquation_differentiatedRealVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_differentiatedRealVariables_contributors = null;
        return FAbstractEquation_differentiatedRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_differentiatedRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_differentiatedRealVariables_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_differentiatedRealVariables_reset() {
        FAbstractEquation_differentiatedRealVariables_computed = false;
        FAbstractEquation_differentiatedRealVariables_value = null;
    }
    /**
     * Collection attribute returning all independent parameter variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3030
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> dependentParameters() {
        if(FAbstractEquation_dependentParameters_computed) {
            return FAbstractEquation_dependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_dependentParameters_value = dependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_dependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_dependentParameters_value;
    }
    Collection FAbstractEquation_dependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dependentParameters
     */
    public Collection FAbstractEquation_dependentParameters_contributors() {
        if(FAbstractEquation_dependentParameters_contributors == null)
            FAbstractEquation_dependentParameters_contributors  = new LinkedList();
        return FAbstractEquation_dependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> dependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_dependentParameters();
        FAbstractEquation_dependentParameters_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_dependentParameters_contributors != null)
        for (Iterator iter = FAbstractEquation_dependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_dependentParameters(FAbstractEquation_dependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_dependentParameters_contributors = null;
        return FAbstractEquation_dependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_dependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_dependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_dependentParameters_reset() {
        FAbstractEquation_dependentParameters_computed = false;
        FAbstractEquation_dependentParameters_value = null;
    }
    /**
     * Collection attribute returning all dependent parameter variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3040
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> parameters() {
        if(FAbstractEquation_parameters_computed) {
            return FAbstractEquation_parameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_parameters_value = parameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_parameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_parameters_value;
    }
    Collection FAbstractEquation_parameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for parameters
     */
    public Collection FAbstractEquation_parameters_contributors() {
        if(FAbstractEquation_parameters_contributors == null)
            FAbstractEquation_parameters_contributors  = new LinkedList();
        return FAbstractEquation_parameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> parameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_parameters();
        FAbstractEquation_parameters_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_parameters_contributors != null)
        for (Iterator iter = FAbstractEquation_parameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_parameters(FAbstractEquation_parameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_parameters_contributors = null;
        return FAbstractEquation_parameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_parameters_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_parameters_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_parameters_reset() {
        FAbstractEquation_parameters_computed = false;
        FAbstractEquation_parameters_value = null;
    }
    /**
     * Collection attribute returning all discrete variables (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3050
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discreteVariables() {
        if(FAbstractEquation_discreteVariables_computed) {
            return FAbstractEquation_discreteVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_discreteVariables_value = discreteVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_discreteVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_discreteVariables_value;
    }
    Collection FAbstractEquation_discreteVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for discreteVariables
     */
    public Collection FAbstractEquation_discreteVariables_contributors() {
        if(FAbstractEquation_discreteVariables_contributors == null)
            FAbstractEquation_discreteVariables_contributors  = new LinkedList();
        return FAbstractEquation_discreteVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> discreteVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_discreteVariables();
        FAbstractEquation_discreteVariables_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_discreteVariables_contributors != null)
        for (Iterator iter = FAbstractEquation_discreteVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_discreteVariables(FAbstractEquation_discreteVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_discreteVariables_contributors = null;
        return FAbstractEquation_discreteVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_discreteVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_discreteVariables_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_discreteVariables_reset() {
        FAbstractEquation_discreteVariables_computed = false;
        FAbstractEquation_discreteVariables_value = null;
    }
    /**
     * Collection attribute returning all non-fixed parameters (FVariables)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3060
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> initialParameters() {
        if(FAbstractEquation_initialParameters_computed) {
            return FAbstractEquation_initialParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_initialParameters_value = initialParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_initialParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_initialParameters_value;
    }
    Collection FAbstractEquation_initialParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for initialParameters
     */
    public Collection FAbstractEquation_initialParameters_contributors() {
        if(FAbstractEquation_initialParameters_contributors == null)
            FAbstractEquation_initialParameters_contributors  = new LinkedList();
        return FAbstractEquation_initialParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> initialParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_initialParameters();
        FAbstractEquation_initialParameters_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_initialParameters_contributors != null)
        for (Iterator iter = FAbstractEquation_initialParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_initialParameters(FAbstractEquation_initialParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_initialParameters_contributors = null;
        return FAbstractEquation_initialParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_initialParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_initialParameters_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_initialParameters_reset() {
        FAbstractEquation_initialParameters_computed = false;
        FAbstractEquation_initialParameters_value = null;
    }
    /**
     * Collection attribute returning all pre variables (FPreVariable)
     * referenced in an equation.
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3070
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> discretePreVariables() {
        if(FAbstractEquation_discretePreVariables_computed) {
            return FAbstractEquation_discretePreVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_discretePreVariables_value = discretePreVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_discretePreVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_discretePreVariables_value;
    }
    Collection FAbstractEquation_discretePreVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for discretePreVariables
     */
    public Collection FAbstractEquation_discretePreVariables_contributors() {
        if(FAbstractEquation_discretePreVariables_contributors == null)
            FAbstractEquation_discretePreVariables_contributors  = new LinkedList();
        return FAbstractEquation_discretePreVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> discretePreVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_discretePreVariables();
        FAbstractEquation_discretePreVariables_value = new LinkedHashSet<FVariable>();
        if(FAbstractEquation_discretePreVariables_contributors != null)
        for (Iterator iter = FAbstractEquation_discretePreVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_discretePreVariables(FAbstractEquation_discretePreVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_discretePreVariables_contributors = null;
        return FAbstractEquation_discretePreVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_discretePreVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> FAbstractEquation_discretePreVariables_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_discretePreVariables_reset() {
        FAbstractEquation_discretePreVariables_computed = false;
        FAbstractEquation_discretePreVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3175
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> collectUses() {
        if(FAbstractEquation_collectUses_computed) {
            return FAbstractEquation_collectUses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_collectUses_value = collectUses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_collectUses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_collectUses_value;
    }
    Collection FAbstractEquation_collectUses_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for collectUses
     */
    public Collection FAbstractEquation_collectUses_contributors() {
        if(FAbstractEquation_collectUses_contributors == null)
            FAbstractEquation_collectUses_contributors  = new LinkedList();
        return FAbstractEquation_collectUses_contributors;
    }

    /**
     * @apilevel internal
     */
    private Set<FIdUseExp> collectUses_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_collectUses();
        FAbstractEquation_collectUses_value = new LinkedHashSet<FIdUseExp>();
        if(FAbstractEquation_collectUses_contributors != null)
        for (Iterator iter = FAbstractEquation_collectUses_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_collectUses(FAbstractEquation_collectUses_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_collectUses_contributors = null;
        return FAbstractEquation_collectUses_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_collectUses_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FIdUseExp> FAbstractEquation_collectUses_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_collectUses_reset() {
        FAbstractEquation_collectUses_computed = false;
        FAbstractEquation_collectUses_value = null;
    }
    /**
     * @attribute coll
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:192
     */
    @ASTNodeAnnotation.Attribute
    public Set<FExp> timeExps() {
        if(FAbstractEquation_timeExps_computed) {
            return FAbstractEquation_timeExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAbstractEquation_timeExps_value = timeExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FAbstractEquation_timeExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FAbstractEquation_timeExps_value;
    }
    Collection FAbstractEquation_timeExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for timeExps
     */
    public Collection FAbstractEquation_timeExps_contributors() {
        if(FAbstractEquation_timeExps_contributors == null)
            FAbstractEquation_timeExps_contributors  = new LinkedList();
        return FAbstractEquation_timeExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private Set<FExp> timeExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FAbstractEquation)) {
            node = node.getParent();
        }
        FAbstractEquation root = (FAbstractEquation) node;
        root.collect_contributors_FAbstractEquation_timeExps();
        FAbstractEquation_timeExps_value = new LinkedHashSet<FExp>();
        if(FAbstractEquation_timeExps_contributors != null)
        for (Iterator iter = FAbstractEquation_timeExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FAbstractEquation_FAbstractEquation_timeExps(FAbstractEquation_timeExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FAbstractEquation_timeExps_contributors = null;
        return FAbstractEquation_timeExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FAbstractEquation_timeExps_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FExp> FAbstractEquation_timeExps_value;
    /**
     * @apilevel internal
     */
    private void FAbstractEquation_timeExps_reset() {
        FAbstractEquation_timeExps_computed = false;
        FAbstractEquation_timeExps_value = null;
    }
}
