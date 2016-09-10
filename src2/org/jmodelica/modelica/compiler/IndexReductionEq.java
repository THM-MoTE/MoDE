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
 * @ast class
 * @aspect IndexReduction
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:312
 */
public class IndexReductionEq extends AbstractEq<IndexReductionEq, IndexReductionVar> {
    public Collection<IndexReductionVar> getVariablesSortedSAP2(final Map<IndexReductionVar, IndexReductionEq> tempAssignmentMap) {
        java.util.List<IndexReductionVar> res = new ArrayList<IndexReductionVar>(getVariables());
        Collections.sort(res, new Comparator<IndexReductionVar>() {
            @Override
            public int compare(IndexReductionVar a, IndexReductionVar b) {
                // Get unmatched first
                int diff = (a.getMatching() == null ? 1 : 0) - (b.getMatching() == null ? 1 : 0);
                if (diff != 0) {
                    return -diff;
                }
                // Get other variables after the one matched to the equation
                diff = (a.getMatching() == IndexReductionEq.this ? 1 : 0) - (b.getMatching() == IndexReductionEq.this ? 1 : 0);
                if (diff != 0) {
                    return -diff;
                }
                // Get non-temporary variables first. Then temporary variables
                // that are not assigned in its "temporary equation"
                IndexReductionEq aEq = tempAssignmentMap.get(a);
                IndexReductionEq bEq = tempAssignmentMap.get(b);
                diff = (aEq != null ? (aEq.getMatching() != a ? 2 : 1) : 0) - (bEq != null ? (bEq.getMatching() != b ? 2 : 1) : 0);
                if (diff != 0) {
                    return -diff;
                }
                return a.getName().compareTo(b.getName());
            }
        });
        return res;
    }

    public boolean isTempAssignmentFor(IndexReductionVar var) {
        if (!var.getVariable().isTemporary()) {
            return false;
        }
        return getEquation().assignedFV() == var.getVariable();
    }

    

        private IndexReductionEq meDifferentiated = null;

    
        private IndexReductionEq meIntegrated = null;

    
        private Set<String> nonDiffVars;

    
        private Set<FAbstractEquation> nonDiffEqns;

    
        private Set<IndexReductionVar> remoteVars = null;

    

        public IndexReductionEq(String name, FAbstractEquation eqn, int groupNumber, Collection<IndexReductionEq> groupMembers, FTypePrefixVariability variability, FType type, boolean isMeta) {
            super(name, eqn, groupNumber, groupMembers, variability, type, isMeta);
        }

    

        public int numDifferentiations() {
            return getMeIntegrated() == null ? 0: getMeIntegrated().numDifferentiations() + 1; 
        }

    

        public void setMeDifferentiated(IndexReductionEq e) {
            this.meDifferentiated = e;
            this.getEquation().setMeDifferentiated(e.getEquation());
        }

    

        public IndexReductionEq getMeDifferentiated() {
            return this.meDifferentiated;
        }

    

        public void setMeIntegrated(IndexReductionEq e) {
            this.meIntegrated = e;
            this.getEquation().setMeIntegrated(e.getEquation());
        }

    

        public IndexReductionEq getMeIntegrated() {
            return this.meIntegrated;
        }

    

        public boolean isNonDiffUse(IndexReductionVar var) {
            computeNonDiffCache();
            return nonDiffVars.contains(var.getName());
        }

    

        public int numDiffableVars() {
            int n = 0;
            for (IndexReductionVar var : getVariables())
                if (!isNonDiffUse(var))
                    n++;
            return n;
        }

    
        
        public boolean diffExtraEqn(FAbstractEquation eqn) {
            computeNonDiffCache();
            return !nonDiffEqns.contains(eqn);
        }

    

        private Collection<FAbstractEquation> extraEquations = Collections.emptyList();

    

        public void setExtraEquations(Collection<FAbstractEquation> extraEquations) {
            this.extraEquations = extraEquations;
        }

    

        public Collection<FAbstractEquation> getExtraEquations() {
            return extraEquations;
        }

    

        /**
         * This method computes which equations and variables that shouldn't be
         * differentiated. This is done by visiting the original equations,
         * following referenced variables and visiting extra equations where
         * they are referenced. This is done recursivly through all extra
         * equations. If we enter a functioncall argument that is "noDerivtive"
         * or "zeroDerivative", then week keep track of that and referenced
         * variables and equations are makred as nondiff.
         * 
         * This method sets the same cache lists to all group members.
         */
        private void computeNonDiffCache() {
            if (nonDiffVars != null && nonDiffEqns != null)
                return;
            Map<String, Collection<FAbstractEquation>> varToEqnMap = new HashMap<String, Collection<FAbstractEquation>>();
            
            Collection<FAbstractEquation> mainEqns = new LinkedHashSet<FAbstractEquation>();
            Stack<WorklistPair> worklist = new Stack<WorklistPair>();
            for (IndexReductionEq member : getGroupMembers()) {
                worklist.add(new WorklistPair(member.getEquation(), false));
                mainEqns.add(member.getEquation());
            }
            
            for (FAbstractEquation eqn : new ChainedIterable<FAbstractEquation>(mainEqns, extraEquations)) {
                for (FIdUseExp use : eqn.referencedFIdUseExps()) {
                    Collection<FAbstractEquation> eqnList = varToEqnMap.get(use.name());
                    if (eqnList == null) {
                        eqnList = new HashSet<FAbstractEquation>();
                        varToEqnMap.put(use.name(), eqnList);
                    }
                    eqnList.add(eqn);
                }
            }
            
            
            Map<String, Boolean> varNonDiffMap = new HashMap<String, Boolean>();
            Map<FAbstractEquation, Boolean> eqnNonDiffMap = new HashMap<FAbstractEquation, Boolean>();
            while (!worklist.isEmpty()) {
                WorklistPair pair = worklist.pop();
                FAbstractEquation eqn = pair.eqn;
                boolean nonDiff = pair.value;
                Boolean currentNonDiffValue = eqnNonDiffMap.get(eqn);
                // If we already have visited and concluded that it should be diffed or if we are checking nondiff and already visited, then skip
                if (currentNonDiffValue != null && (!currentNonDiffValue || nonDiff))
                    continue;
                eqnNonDiffMap.put(eqn, nonDiff);
                for (FIdUseExp use : eqn.referencedFIdUseExps()) {
                    Boolean oldValue = varNonDiffMap.get(use.name());
                    boolean value = (oldValue == null || oldValue) && (nonDiff || use.inNonDiffArg());
                    varNonDiffMap.put(use.name(), value);
                    Collection<FAbstractEquation> eqnList = varToEqnMap.get(use.name());
                    if (eqnList == null)
                        continue;
                    for (FAbstractEquation otherEqn : eqnList)
                        worklist.add(new WorklistPair(otherEqn, value));
                }
            }
            
            Set<String> nonDiffVars = Collections.emptySet();
            for (Entry<String, Boolean> entry : varNonDiffMap.entrySet()) {
                if (entry.getValue()) {
                    if (nonDiffVars.isEmpty())
                        nonDiffVars = new HashSet<String>();
                    nonDiffVars.add(entry.getKey());
                }
            }
            
            Set<FAbstractEquation> nonDiffEqns = Collections.emptySet();
            for (Entry<FAbstractEquation, Boolean> entry : eqnNonDiffMap.entrySet()) {
                if (entry.getValue()) {
                    if (nonDiffEqns.isEmpty())
                        nonDiffEqns = new HashSet<FAbstractEquation>();
                    nonDiffEqns.add(entry.getKey());
                }
            }
            
            for (IndexReductionEq member : getGroupMembers()) {
                member.nonDiffVars = nonDiffVars;
                member.nonDiffEqns = nonDiffEqns;
            }
        }

    

        private static class WorklistPair {
            public final FAbstractEquation eqn;
            public final boolean value;
            public WorklistPair(FAbstractEquation eqn, boolean value) {
                this.eqn = eqn;
                this.value = value;
            }
        }

    

        @Override
        public String printEquation() {
            if (extraEquations.size() == 0)
                return super.printEquation();
            StringBuilder sb = new StringBuilder();
            sb.append(super.printEquation());
            for (FAbstractEquation eqn : extraEquations) {
                sb.append("\n    Extra: ");
                sb.append(eqn.toString());
            }
            return sb.toString();
        }

    
        
        /**
         * Used by index reduction for indicating that the incidence isn't
         * direct but through other low order equations and variables.
         */
        public void addVariable(IndexReductionVar var, boolean remote) {
            super.addVariable(var);
            if (remote) {
                if (remoteVars == null) {
                    remoteVars = new HashSet<IndexReductionVar>();
                }
                remoteVars.add(var);
            }
        }

    
        
        /**
         * Used by index reduction for indicating that the incidence isn't
         * direct but through other low order equations and variables.
         */
        public boolean isRemoteVar(IndexReductionVar var) {
            if (remoteVars == null) {
                return false;
            } else {
                return remoteVars.contains(var);
            }
        }

    public int calculateLinearityWeight(IndexReductionVar var, Map<IndexReductionEq, Map<IndexReductionVar, IndexReductionBiPGraph.Coefficient>> coefficientsMatrix) {
        Map<IndexReductionVar, IndexReductionBiPGraph.Coefficient> coefficients = coefficientsMatrix.get(this);
        if (coefficients == null) {
            coefficients = new HashMap<IndexReductionVar, IndexReductionBiPGraph.Coefficient>();
            coefficientsMatrix.put(this, coefficients);
        }
        if (!extraEquations.isEmpty()) {
            if (getVariables().contains(var))
                coefficients.put(var, new IndexReductionBiPGraph.Coefficient(null, IndexReductionBiPGraph.COEFFICIENT_STATE.SPLIT));
            return 0;
        }
        try {
            FVariable variable = var.getVariable();
            if (!getEquation().referencedFVariables().contains(variable))
                return 0;
            Collection<FAbstractEquation> feqds = getEquation().diff(variable.name());
            FTypePrefixVariability variability = ASTNode.fConstant();
            for (FAbstractEquation feqd : feqds)
                variability = variability.combine(feqd.variability());
            if (feqds.size() > 1) {
                Iterator<FAbstractEquation> it = feqds.iterator();
                while (it.hasNext() && feqds.size() > 1) {
                    FAbstractEquation eqn = it.next();
                    if (eqn.isZeroEquation()) {
                        it.remove();
                    }
                }
            }
            FAbstractEquation eqn = feqds.iterator().next();
            coefficients.put(var, new IndexReductionBiPGraph.Coefficient(feqds.size() > 1 ? new FNoExp() : eqn.asSubExp(), IndexReductionBiPGraph.COEFFICIENT_STATE.create(variability)));
            
            if (!variability.lessOrEqual(ASTNode.fParameter())) {
                return 2;
            } else if (!variability.lessOrEqual(ASTNode.fConstant()))
                return 0;
        } catch(EquationDifferentiationException e) {
            coefficients.put(var, new IndexReductionBiPGraph.Coefficient(null, IndexReductionBiPGraph.COEFFICIENT_STATE.EXCEPTION));
        }
        return 0;
    }

    public void lookForHigherOrderVars(Map<IndexReductionVar, Collection<IndexReductionEq>> reverseMap,
            Map<IndexReductionVar, Collection<IndexReductionVar>> visitedCache) {
        Set<IndexReductionVar> newIncidences = new HashSet<IndexReductionVar>();
        for (IndexReductionVar var : getVariables()) {
            if (var.numDifferentiations() < numDifferentiations()) { // && isNonDiffUse(var)) {
                newIncidences.addAll(lookForHigherOrderVars(reverseMap, visitedCache, var));
            }
        }
        for (IndexReductionVar incidence : newIncidences) {
            addVariable(incidence, true);
        }
    }

    public Collection<IndexReductionVar> lookForHigherOrderVars(Map<IndexReductionVar, Collection<IndexReductionEq>> reverseMap, 
            Map<IndexReductionVar, Collection<IndexReductionVar>> visitedCache, IndexReductionVar startVar) {
        Collection<IndexReductionVar> higherOrderVars = visitedCache.get(startVar);
        if (higherOrderVars != null)
            return higherOrderVars;
        
        higherOrderVars = new ArrayList<IndexReductionVar>();
        
        Queue<IndexReductionVar> queue = new ArrayDeque<IndexReductionVar>();
        queue.add(startVar);
        
        while (!queue.isEmpty()) {
            IndexReductionVar currentVar = queue.poll();
            if (visitedCache.containsKey(currentVar))
                continue;
            visitedCache.put(currentVar, higherOrderVars);
            for (IndexReductionEq eqn : reverseMap.get(currentVar)) {
                if (eqn.numDifferentiations() >= numDifferentiations())
                    continue;
                for (IndexReductionVar var : eqn.getVariables()) {
                    if (var == currentVar)
                        continue;
                    if (var.numDifferentiations() >= numDifferentiations())
                        higherOrderVars.add(var);
                    else if (!higherOrderVars.contains(var))
                        queue.add(var);
                }
            }
        }
        return higherOrderVars;
    }


}
