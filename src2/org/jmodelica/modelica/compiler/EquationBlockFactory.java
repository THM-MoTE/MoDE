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
 * @aspect BLT
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:28
 */
public class EquationBlockFactory extends Object {
    
 
        /**
         * This method groups the Eq objects in a BLT block so that Eqs that
         * originates from the same FAbstractEquation are grouped together.
         */
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> Collection<SCCBlock<E, V>> groupComponent(Collection<E> eqs) {
            Map<FAbstractEquation, SCCBlock<E, V>> groups = new LinkedHashMap<FAbstractEquation, SCCBlock<E, V>>();
            for (E eqn : eqs) {
                SCCBlock<E, V> group = groups.get(eqn.getEquation());
                if (group == null) {
                    group = new SCCBlock<E, V>();
                    groups.put(eqn.getEquation(), group);
                }
                group.addMember(eqn);
            }
            return groups.values();
        }

    

        public static SimpleEquationBlock createSimpleEquationBlock(FAbstractEquation e, Collection<FVariable> fvs, Collection<Integer> assignedIndices, BlockProducer producer, BlockDependency blockDependency, boolean solve) {
            // Check if equation is solvable for all active variables (only if we want a solved block)
            Solvability solvability = solve ? Solvability.ANALYTICALLY_SOLVABLE : Solvability.UNSOLVABLE;
            for (Iterator<FVariable> it = fvs.iterator(); solvability.isSolvable() && it.hasNext(); )
                solvability = Solvability.least(solvability, e.isSolved(it.next(), producer.duringTearing()));
            return e.createSimpleEquationBlock(fvs, assignedIndices, solvability, producer, blockDependency);
        }

    

        /**
         * This method takes an equation and a variable and constructs an equation block.
         * If <code>solve</code> is true the equation will be solved for the variable. 
         */
        public static SimpleEquationBlock createSimpleEquationBlock(FAbstractEquation equation, FVariable variable, Integer assignedIndex, BlockProducer producer, BlockDependency blockDependency, boolean solve) {
            return createSimpleEquationBlock(equation, Arrays.asList(variable), Arrays.asList(assignedIndex), producer, blockDependency, solve);
        }

    

        /**
         * This method takes an equation <code>eqn</code> and variable
         * <code>var</code> and produces an unsolved block of types
         * ScalarEquationBlock, IfEquationBlock or FFunctionCallEquationBlock.
         */
        public static <E extends AbstractEq<E,V>, V extends AbstractVar<E,V>> SimpleEquationBlock createSimpleEquationBlock(E eqn, V var, BlockProducer producer) {
            return createSimpleEquationBlock(eqn.getEquation(), var.getVariable(), eqn.groupNumber(), producer, new NoBlockDependency(), false);
        }

    

        /**
         * This method takes a list of Eq objects and create equation blocks
         * of types ScalarEquationBlock, IfEquationBlock or FFunctionCallEquationBlock.
         */
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> SimpleEquationBlock createSimpleEquationBlock(SCCBlock<E, V> component, BlockProducer producer, boolean solve) {
            Collection<FVariable> fvs = new ArrayList<FVariable>();
            Collection<Integer> assignedIndices = new ArrayList<Integer>();
            FAbstractEquation e = component.iterator().next().getEquation(); // TODO remove this hack, set to null and introduce in first loop iteration
            boolean isMeta = true;
            for (E eqn : component) {
                if (eqn.getEquation() != e) 
                    return null;
                if (!eqn.isMeta()) {
                    isMeta = false;
                    fvs.add(eqn.getMatching().getVariable());
                    assignedIndices.add(eqn.groupNumber());
                }
            }
            if (isMeta)
                return createMetaBlock(e);
            else
                return createSimpleEquationBlock(e, fvs, assignedIndices, producer, component.computeBlockDependency(), solve);
        }

    

        /**
         * This method takes as input a set of Eq objects corresponeing to
         * a BLT block. First the, the Eq objects are grouped using
         * groupComponent to simplify the analysis. Then, if there is
         * only one Eq, a SimpleEquationBlock is created, if possible. Otherwise
         * a real or mixed equation block is created.
         */
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> AbstractEquationBlock createEquationBlock(SCCBlock<E, V> component, BlockProducer producer, OptionRegistry options, boolean isInitial) {
            if (component.containsDynamicStates())
                return computeDynamicStateBlock(component, producer, options);
            
            SimpleEquationBlock seb = createSimpleEquationBlock(component, producer, true);
            if (seb != null && seb.isSolvable())
                return seb;
            
            BiPGraph g = new BiPGraph(component.getMembers(), isInitial);
            Collection<SCCBlock<Eq, Var>> subBlocks = g.tarjan(options, false);
            
            errorCheckWhenEquations(subBlocks);
            
            Collection<SimpleEquationBlock> solvedBlocks = new ArrayList<SimpleEquationBlock>();
            boolean allOk = true;
            for (SCCBlock<Eq, Var> subBlock : subBlocks) {
                SimpleEquationBlock subSEB = createSimpleEquationBlock(subBlock, producer, true);
                if (subSEB != null && subSEB.isSolvable()) {
                    solvedBlocks.add(subSEB);
                } else {
                    allOk = false;
                    break;
                }
            }
            if (allOk) {
                return new PrePropagationEquationBlock(producer, component.computeBlockDependency(), solvedBlocks, Collections.<SimpleEquationBlock>emptyList());
            }
            
            Collection<E> realEquations = new LinkedHashSet<E>();
            Collection<E> nonRealEquations = new ArrayList<E>();
            Collection<E> metaEquations = new ArrayList<E>();
            Set<FVariable> realVariables = new HashSet<FVariable>();
            for (E e : component) {
                if (e.isMeta()) {
                    metaEquations.add(e);
                } else if (e.getMatching().getVariable().isReal()) {
                    realEquations.add(e);
                    realVariables.add(e.getMatching().getVariable());
                } else {
                    nonRealEquations.add(e);
                }
            }

            AbstractEquationBlock block = null;
            EquationBlock eqnBlock = null;
            boolean torn = false;
            if (producer.useTearing() && realEquations.size() > 1) {
                eqnBlock = tear(component, producer, options, isInitial);
                if (eqnBlock != null && !eqnBlock.solvedBlocks().isEmpty()) {
                    block = eqnBlock;
                    torn = true;
                }
            }
            Set<FAbstractEquation> activeRealEquations = new HashSet<FAbstractEquation>();
            if (torn) {
                // Check if an equation block is mixed, i.e., contains both continous
                // and discrete variables, and if it is linear in the unknowns
                Map<FVariable, AbstractEquationBlock> varToBlockMap = new HashMap<FVariable, AbstractEquationBlock>();
                for (AbstractEquationBlock subBlock : eqnBlock.solvedRealBlocks()) {
                    for (FVariable var : subBlock.allVariables())
                        varToBlockMap.put(var, subBlock);
                }
                Set<FVariable> iterationVariables = new HashSet<FVariable>();
                for (FVariable var : block.localUnsolvedVariables())
                    iterationVariables.add(var);
                Set<AbstractEquationBlock> visitedBlocks = new HashSet<AbstractEquationBlock>();
                Set<AbstractEquationBlock> activeBlocks = new HashSet<AbstractEquationBlock>();
                for (SimpleEquationBlock subBlock : eqnBlock.unsolvedBlocks()) {
                    linearityUseCheck(subBlock, varToBlockMap, iterationVariables, visitedBlocks, activeBlocks);
                    activeBlocks.add(subBlock);
                }
                for (AbstractEquationBlock subBlock : activeBlocks)
                    activeRealEquations.addAll(subBlock.allEquations());
            } else {
                for (E eqn : realEquations)
                    activeRealEquations.add(eqn.getEquation());
            }
            
            boolean linear = true;
            for (FAbstractEquation eqn : activeRealEquations)
                linear &= eqn.checkLinearity(realVariables);
            
            boolean mixed = nonRealEquations.size() > 0 && realEquations.size() > 0;
            
            if (block == null) {
                if (seb != null && !mixed) {
                    block = seb;
                } else {
                    BiPGraph nonRealG = new BiPGraph(nonRealEquations, isInitial);
                    Collection<SimpleEquationBlock> nonRealBlocks = nonRealG.computeNonRealBlocks(producer, options);
                    eqnBlock = new EquationBlock(producer, component.computeBlockDependency(), nonRealBlocks, createSimpleBlocks(groupComponent(realEquations), producer));
                    block = eqnBlock;
                }
            }
            
            if (linear) {
                if (block.canComputeJacobian())
                    block.computeJacobian(activeRealEquations);
//                else
//                   Give warning?
            }
            if (eqnBlock != null && !torn) {
                // Torn blocks handles meta equations internaly!
                for (E eqn : metaEquations) {
                    eqnBlock.addSolvedBlock(createMetaBlock(eqn.getEquation()));
                }
            }
            return block;
        }

    
        
        private static boolean linearityUseCheck(AbstractEquationBlock block, Map<FVariable, AbstractEquationBlock> varToBlockMap,
                Set<FVariable> iterationVariables, Set<AbstractEquationBlock> visitedBlocks, Set<AbstractEquationBlock> activeBlocks) {
            if (visitedBlocks.contains(block))
                return activeBlocks.contains(block);
            visitedBlocks.add(block);
            boolean inLoop = false;
            for (FVariable var : block.inactiveVariables()) {
                if (iterationVariables.contains(var)) {
                    inLoop = true;
                    continue;
                }
                AbstractEquationBlock varBlock = varToBlockMap.get(var);
                if (varBlock != null)
                    inLoop |= linearityUseCheck(varBlock, varToBlockMap, iterationVariables, visitedBlocks, activeBlocks);
            }
            if (inLoop)
                activeBlocks.add(block);
            return inLoop;
        }

    

        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> Collection<SimpleEquationBlock> createSimpleBlocks(Collection<SCCBlock<E, V>> eqs, BlockProducer producer) {
            Collection<SimpleEquationBlock> blocks = new ArrayList<SimpleEquationBlock>();
            for (SCCBlock<E, V> e : eqs)
                blocks.add(createSimpleEquationBlock(e, producer, false));
            return blocks;
        }

    

        private static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> void errorCheckWhenEquations(Collection<SCCBlock<Eq, Var>> subBlocks) {
            for (SCCBlock<Eq, Var> block : subBlocks) {
                if (block.getMembers().size() == 1)
                    continue;
                Collection<FVariable> vars = new ArrayList<FVariable>();
                for (Eq eqn : block.getMembers()) {
                    vars.add(eqn.getMatching().getVariable());
                }
                for (Eq eqn : block.getMembers()) {
                    if (!eqn.getEquation().isWhen())
                        continue;
                    for (FExp guard : eqn.getEquation().transformedGuards()) {
                        if (guard.dependsOn(vars)) {
                            StringBuilder sb = new StringBuilder();
                            for (Eq e : block.getMembers()) {
                                sb.append(e.printEquation());
                                sb.append("\n");
                            }
                            throw new BLTException("A when-guard is involved in an algebraic loop, "
                                            + "consider breaking it using pre() expressions. Equations in block:\n" 
                                    + sb.toString());
                        }
                    }
                }
            }
        }

    

        /**
         * This method creates a MetaEquationBlock for a given equation.
         * This method does not do any checks of the equation. So checks that
         * ensures that the equation is an meta equation must be made before
         * calling this method.
         */
        public static SimpleEquationBlock createMetaBlock(FAbstractEquation eqn) {
            Collection<FVariable> depVars = new ArrayList<FVariable>();
            depVars.addAll(eqn.algebraicVariables());
            depVars.addAll(eqn.derivativeVariables());
            return eqn.createSimpleEquationBlock(Collections.<FVariable>emptyList(), null, Solvability.ANALYTICALLY_SOLVABLE, EquationBlockFactory.DEFAULT_BLOCK_PRODUCER, new SimpleBlockDependency(depVars));
        }

    

        public static abstract class BlockProducer {
            public abstract boolean useTearing();
            public abstract boolean duringTearing();
            public abstract String symbol();
        }

    
        public static final BlockProducer DEFAULT_BLOCK_PRODUCER = new DefaultBlockProducer();

    
        private final static class DefaultBlockProducer extends BlockProducer {
            @Override
            public boolean useTearing() {
                return true;
            }

            @Override
            public boolean duringTearing() {
                return false;
            }

            @Override
            public String symbol() {
                return "D";
            }
        }

    
        
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, T extends BLT> T computeBLT(OptionRegistry options, BlockProducer producer, T blt, boolean inInitial,
                boolean handleHomotopy, Collection<? extends SCCBlock<E, V>> components) {
            Set<SCCBlock<E,V>> homotopyComponents = Collections.emptySet();
            if (inInitial && handleHomotopy) {
                ASTNode.log.verbose("Initial system contains homotopy, computing homotopy block components...");
                homotopyComponents = computeHomotopyComponents(components);
                ASTNode.log.verbose("... block components computed: %s", homotopyComponents);
            }
            int homotopyCounter = 0;
            for (SCCBlock<E,V> component : components) {
                if (homotopyComponents.contains(component)) {
                    if (++homotopyCounter < homotopyComponents.size()) {
                        continue;
                    }
                    blt.add(computeHomotopyBlock(homotopyComponents, producer, options));
                } else {
                    blt.add(createEquationBlock(component, producer, options, inInitial));
                }
            }
            blt.setLabels();
            return blt;
        }

    

        
        
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> Set<SCCBlock<E, V>> computeHomotopyComponents(Collection<? extends SCCBlock<E, V>> components) {
            Set<E> eqsInHomotopyComponent = new HashSet<E>();
            Set<SCCBlock<E, V>> homotopyComponents = new LinkedHashSet<SCCBlock<E, V>>();
            for (SCCBlock<E, V> component : components) {
                boolean add = component.containsHomotopy();
                if (!add) {
                    for (E eqn : component.getPredecessors()) {
                        if (eqsInHomotopyComponent.contains(eqn)) {
                            add = true;
                            break;
                        }
                    }
                }
                if (!add) {
                    continue;
                }
                homotopyComponents.add(component);
                for (E eqn : component) {
                    eqsInHomotopyComponent.add(eqn);
                }
            }
            return homotopyComponents;
        }

    public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>>
        AbstractEquationBlock computeHomotopyBlock(Collection<SCCBlock<E, V>> components,
        BlockProducer producer, OptionRegistry options) {
        SCCBlock<E, V> mergedComponent = new SCCBlock<E, V>();
        for (SCCBlock<E, V> component : components) {
            for (E eqn : component) {
                mergedComponent.addMember(eqn);
            }
            mergedComponent.addPredecessors(component.getPredecessors());
        }
        
        BLT homotopyBLT = computeBLT(options, producer, new BLT(), true, false, components);
        HomotopySubBlock homotopySubBlock = new HomotopySubBlock(producer, mergedComponent.computeBlockDependency(), homotopyBLT);
        ASTNode.log.debug("Homotopy sub block:");
        ASTNode.log.debug(homotopySubBlock);
        
        BiPGraph graph = new BiPGraph(mergedComponent.getMembers(), true);
        graph.setAsHomotopySimplified();
        graph.maximumMatching(true);
        BLT simplifiedBLT = graph.computeBLT(options, producer, new BLT(), false);
        ASTNode.log.debug("Simplified BLT:");
        ASTNode.log.debug(simplifiedBLT);
        
        return new HomotopyBlock(producer, mergedComponent.computeBlockDependency(), homotopySubBlock, simplifiedBLT);
    }

    
        
        private static Collection<TearingAlgorithm> tearingAlgorithms;

    
        
        private static <T extends TearingAlgorithm> T addTearingAlgorithm(T algorithm) {
            if (tearingAlgorithms == null)
                tearingAlgorithms = new PriorityQueue<TearingAlgorithm>();
            tearingAlgorithms.add(algorithm);
            return algorithm;
        }

    
        
        public abstract static class TearingAlgorithm implements Comparable<TearingAlgorithm> {
            private final int priority;
            private final String option;

            public TearingAlgorithm(int priority) {
                this.priority = priority;
                this.option = null;
            }

            public TearingAlgorithm(int priority, String option) {
                this.priority = priority;
                this.option = option;
            }

            public boolean active(OptionRegistry options) {
                return options.getBooleanOption(option);
            }

            public final int compareTo(TearingAlgorithm other) {
                return other.priority - priority;
            }

            public abstract <E extends AbstractEq<E,V>, V extends AbstractVar<E,V>> TornEquationBlock tear(SCCBlock<E, V> block, BlockProducer producer, OptionRegistry options, boolean isInitial);
        }

    
        
        public static <E extends AbstractEq<E,V>, V extends AbstractVar<E,V>> TornEquationBlock tear(SCCBlock<E, V> block, BlockProducer producer, OptionRegistry options, boolean isInitial) {
            TearingAlgorithm algorithm = getActiveAlgorithm(options);
            if (algorithm == null)
                return null;
            else
                return algorithm.tear(block, producer, options, isInitial);
        }

    
        
        public static TearingAlgorithm getActiveAlgorithm(OptionRegistry options) {
            for (TearingAlgorithm algorithm : tearingAlgorithms)
                if (algorithm.active(options))
                    return algorithm;
            return null;
        }

    
        
        public static boolean canTear(OptionRegistry options) {
            return getActiveAlgorithm(options) != null;
        }

    
        
        public static final BlockProducer AUTOMATIC_TEARING_BLOCK_PRODUCER = new AutomaticTearingBlockProducer();

    
        private final static class AutomaticTearingBlockProducer extends BlockProducer {
            @Override
            public boolean useTearing() {
                return true;
            }

            @Override
            public boolean duringTearing() {
                return true;
            }

            @Override
            public String symbol() {
                return "A";
            }
        }

    
        
        private static AutomaticTearingAlgorithm AUTOMATIC_TEARING = addTearingAlgorithm(new AutomaticTearingAlgorithm());

    
        
        public static class AutomaticTearingAlgorithm extends TearingAlgorithm {

            public AutomaticTearingAlgorithm() {
                super(1, "automatic_tearing");
            }

            @Override
            public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> TornEquationBlock tear(SCCBlock<E, V> block, BlockProducer producer, OptionRegistry options, boolean isInitial) {
                TornEquationBlock teb = new TornEquationBlock(producer, block.computeBlockDependency());
                tear(block, teb, isInitial);
                return teb;
            }
            
            private <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> void tear(SCCBlock<E, V> block, TornEquationBlock eb, boolean isInitial) {
                SolvingBiPGraph g = new SolvingBiPGraph(block.getMembers(), isInitial);
                if (isInitial)
                    g.setAsInitialSystem();
                
                ASTNode.log.verbose("Starting automatic tearing");
                ASTNode.log.verbose(g);
                ASTNode.log.verbose("Initial matching");
                ASTNode.log.verbose(g.printMatchingObj());
                
                // Obtain Maximum Solvable Matching in two steps (greedy and augmenting paths)
                g.greedyMatching();
                for (SolvingEq eqn : g.getUnmatchedEquations()) {
                    if (!g.augmentPath(eqn)) {
                        g.constrainedAugmentedPath(eqn);
                    }
                    g.lightReset();
                }
                Collection<SolvingEq> SUME = new ArrayList<SolvingEq>();
                for (SolvingEq eqn : g.getUnmatchedEquations()) {
                    eqn.isRes(true);
                    SUME.add(eqn);
                }

                ASTNode.log.verbose("Matching after initial manipulation");
                ASTNode.log.verbose(g.printMatchingObj());
                // Now we have a Maximum Solvable Matching

                if (SUME.isEmpty()) { // If: there exist a Pefect Solvable Matching
                                        //     proceed with recursive tearing of block
                    SimpleEquationBlock tearBlock = EquationBlockFactory.createSimpleEquationBlock(block, AUTOMATIC_TEARING_BLOCK_PRODUCER, true);
                    if (tearBlock != null && tearBlock.isSolvable()) {
                        eb.addSolvedBlock(tearBlock);
                    } else {
                        tearInner(g, eb);
                    }
                } else {
                    // Else: Start out by trying to insert residuals that contain
                    //       few variables. 
                    java.util.List<SolvingEq> residuals = new ArrayList<SolvingEq>();
                    for (SolvingEq e : SUME) {
                        // No need to deal with meta equations here since they
                        // can not be in SUME and no variable matches to a meta
                        // equation.
                        SolvingEq bestRes = e;
                        for (SolvingVar v : e.getSolvableVariables()) {
                            SolvingEq ee = v.getMatching();
                            if (ee.compareTo(bestRes) > 0)
                                bestRes = ee;
                        }
                        if (bestRes != e) {
                            bestRes.isRes(true);
                            g.match(e, bestRes.getMatching());
                            e.isRes(false);
                            residuals.add(bestRes);
                        } else {
                            residuals.add(e);
                        }
                    }

                    // Compute inner BLT and see if tearings can be changed 
                    Set<SolvingVar> SUMV = new LinkedHashSet<SolvingVar>(g.getUnmatchedVariables());
                    Collection<SCCBlock<SolvingEq, SolvingVar>> innerBlocks = g.tarjan(false);
                    java.util.List<SolvingVar> tearings = new ArrayList<SolvingVar>();

                    for (SCCBlock<SolvingEq, SolvingVar> bInner : innerBlocks) {
                        SimpleEquationBlock tearBlock = EquationBlockFactory.createSimpleEquationBlock(bInner, AUTOMATIC_TEARING_BLOCK_PRODUCER, true);
                        if (tearBlock != null && tearBlock.isSolvable()) {
                            eb.addSolvedBlock(tearBlock);
                            // If the equation contains a Var in SUMV, that Var cannot be
                            // reinserted and must be used as a iteration variable.
                            for (SolvingEq e : bInner) {
                                for (SolvingVar vv : e.getVariables()) {
                                    if (SUMV.remove(vv))
                                        tearings.add(vv);
                                }
                            }
                        } else {
                            // Build Inner Graph and add info about iteration variables
                            SolvingBiPGraph gInner = new SolvingBiPGraph(bInner.getMembers(), isInitial);
                            // Build block-graph and look for interchangeable variables in SUMV
                            java.util.List<SolvingEq> eqs = new ArrayList<SolvingEq>();
                            boolean graphHasTear = false;
                            for (SolvingEq e : bInner) {
                                SolvingEq gInnerEq = gInner.getEquation(e.getName());
                                for (SolvingVar v : e.getVariables()) {
                                    SolvingVar gInnerVar = gInner.getVariable(v.getName());
                                    if (gInnerVar != null && gInnerVar.isIter()) {
                                        gInner.addInsidence(gInnerEq, gInnerVar);
                                        if (gInner.canMatch(gInnerEq, gInnerVar) && gInnerVar.isIter() && !eqs.contains(gInnerEq)) {
                                            eqs.add(gInnerEq);
                                        }
                                    } else if (SUMV.contains(v)) {
                                        gInnerVar = gInner.addVariable(v.getName(), v.getVariable());
                                        gInnerVar.isIter(true);
                                        SUMV.remove(v);
                                        tearings.add(v);
                                        graphHasTear = true;
                                        gInner.addInsidence(gInnerEq, gInnerVar);
                                        if (gInner.canMatch(gInnerEq, gInnerVar) && !eqs.contains(gInnerEq)) {
                                            eqs.add(gInnerEq);
                                        }
                                    }
                                }
                            }
                            // Go through equations that might get a new matching
                            boolean isChanged = false;
                            for (SolvingEq e : eqs) {
                                if (e.isMeta()) {
                                    continue;
                                }
                                SolvingVar bestMatch = e.getMatching();
                                for (SolvingVar v : e.getSolvableVariables()) {
                                    if (v.isIter() && v.compareTo(bestMatch) < 0)
                                        bestMatch = v;
                                }
                                if (bestMatch != e.getMatching()) {
                                    SolvingVar tmp = e.getMatching();
                                    tmp.isIter(true);
                                    bestMatch.isIter(false);
                                    tearings.add(tmp);
                                    tearings.remove(bestMatch);
                                    gInner.match(e, bestMatch);
                                    isChanged = true;
                                }
                            }

                            if (graphHasTear) {
                                if (isChanged) {
                                    Collection<SCCBlock<SolvingEq, SolvingVar>> newBlocks = gInner.tarjan(false);
                                    for (SCCBlock<SolvingEq, SolvingVar> bInnerInner : newBlocks) {
                                        tearBlock = EquationBlockFactory.createSimpleEquationBlock(bInnerInner, AUTOMATIC_TEARING_BLOCK_PRODUCER, true);
                                        if (tearBlock != null && tearBlock.isSolvable()) {
                                            eb.addSolvedBlock(tearBlock);
                                        } else {
                                            tearInner(new SolvingBiPGraph(bInnerInner.getMembers(), isInitial), eb);
                                        }
                                    }
                                } else {
                                    tearInner(new SolvingBiPGraph(bInner.getMembers(), isInitial), eb);
                                }
                            } else {
                                // Reuse the already constructed graph
                                tearInner(gInner, eb);
                            }
                        }
                    }
                    for (SolvingVar v : SUMV) {
                        //SUMV ought to be empty, but there might exist variables that hasn't 
                        // been altered before. 
                        tearings.add(v);
                    }
                    for (int i = 0; i < tearings.size(); i++) {
                        ASTNode.log.verbose("Automatic tearing pair, equation: %s, tearing with variable: %s", residuals.get(i).getEquation(), tearings.get(i).getName());
                        eb.addUnsolvedBlock(EquationBlockFactory.createSimpleEquationBlock(residuals.get(i), tearings.get(i), AUTOMATIC_TEARING_BLOCK_PRODUCER));
                    }
                }
            }
            
            private static void tearInner(SolvingBiPGraph g, TornEquationBlock eb){
                SolvingVar bestIter = null;
                for (SolvingEq e : g.getEquations()) {
                    if (e.isMeta()) {
                        continue;
                    }
                    SolvingVar v = e.getMatching();
                    if (bestIter == null || v.compareTo(bestIter) > 0)
                        bestIter = v;
                }
                SolvingEq res = bestIter.getMatching();
                bestIter.isIter(true);
                res.isRes(true);
                ASTNode.log.verbose("Automatic tearing pair, equation: %s, tearing with variable: %s", res.getEquation(), bestIter.getVariable().displayName());
                eb.addUnsolvedBlock(EquationBlockFactory.createSimpleEquationBlock(res, bestIter, AUTOMATIC_TEARING_BLOCK_PRODUCER));
                Collection<SCCBlock<SolvingEq, SolvingVar>> blt = g.tarjan(false);
                for (SCCBlock<SolvingEq, SolvingVar> block : blt) {
                    SimpleEquationBlock tearBlock = EquationBlockFactory.createSimpleEquationBlock(block, AUTOMATIC_TEARING_BLOCK_PRODUCER, true);
                    if (tearBlock != null && tearBlock.isSolvable()) {
                        eb.addSolvedBlock(tearBlock);
                    } else {
                        tearInner(new SolvingBiPGraph(block.getMembers(), g.isInitialSystem()), eb);
                    }
                }
            }
        }

    private static FVariable[][] combineDSCombinations(FVariable[][][] sets, int totalNumVars) {
        if (sets.length == 1)
            return sets[0];
        Collection<FVariable[]> res = new ArrayList<FVariable[]>();
        combineDSCombinations(sets, res, totalNumVars, new FVariable[totalNumVars], 0, 0);
        return res.toArray(new FVariable[res.size()][]);
    }

    private static void combineDSCombinations(FVariable[][][] sets, Collection<FVariable[]> res, int totalNumVars, FVariable[] current, int set, int offset) {
        for (int i = 1; i <= sets[set].length; i++) {
            System.arraycopy(sets[set][i - 1], 0, current, offset, sets[set][i - 1].length);
            if (sets.length == set + 1) {
                FVariable[] copy = new FVariable[totalNumVars];
                System.arraycopy(current, 0, copy, 0, totalNumVars);
                res.add(copy);
            } else {
                combineDSCombinations(sets, res, totalNumVars, current, set + 1, offset + sets[set][i - 1].length);
            }
        }
    }

    
        public static <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> DynamicStateBlock computeDynamicStateBlock(SCCBlock<E, V> component, BlockProducer producer, OptionRegistry options) {
            Map<DynamicStateSet, FDynamicAlgebraicVariable[]> setVarMap = new LinkedHashMap<DynamicStateSet, FDynamicAlgebraicVariable[]>();
            Collection<V> otherVars = new ArrayList<V>();
            for (E eqn : component.getMembers()) {
                if (eqn.isMeta()) {
                    continue;
                }
                FVariable fVar = eqn.getMatching().getVariable();
                if (!fVar.isFDynamicAlgebraicVariable()) {
                    otherVars.add(eqn.getMatching());
                    continue;
                }
                FDynamicAlgebraicVariable var = fVar.asFDynamicAlgebraicVariable();
                DynamicStateSet set = var.getSet();
                if (var.getNumber() - 1 >= set.numAlgebraics() || var.getNumber() - 1 < 0)
                    throw new BLTException(var.name() + " has illegal dynamic state variable number, set size is " + set.numAlgebraics());
                FDynamicAlgebraicVariable[] vars = setVarMap.get(set);
                if (vars == null) {
                    vars = new FDynamicAlgebraicVariable[set.numAlgebraics()];
                    setVarMap.put(set, vars);
                }
                if (vars[var.getNumber() - 1] != null)
                    throw new BLTException("There are two instances of " + var.name() + " in the same BLT block!");
                vars[var.getNumber() - 1] = var;
            }
            if (setVarMap.isEmpty())
                throw new BLTException("No dynamic state variables were found in the BLT block");
            FVariable[][][] setCombinations = new FVariable[setVarMap.size()][][];
            int setCounter = 0;
            int totalNumAlgebraics = 0;
            int totalNumCombinations = 1;
            Collection<FVariable> allDynamicStates = new ArrayList<FVariable>();
            for (Entry<DynamicStateSet, FDynamicAlgebraicVariable[]> entry : setVarMap.entrySet()) {
                boolean allSet = true;
                DynamicStateSet set = entry.getKey();
                FDynamicAlgebraicVariable[] DSVars = entry.getValue();
                for (int i = 1; i <= DSVars.length; i++) {
                    if (DSVars[i - 1] == null) {
                        allSet = false;
                    }
                }
                if (!allSet) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not all dynamic state variables resides in the same block, index ");
                    boolean first = true;
                    for (int i = 1; i <= DSVars.length; i++) {
                        if (DSVars[i - 1] != null)
                            continue;
                        if (!first)
                            sb.append(", ");
                        first = false;
                        sb.append(i);
                    }
                    sb.append(" are missing. Set:\n");
                    sb.append(set);
                    throw new BLTException(sb.toString());
                }
                setCombinations[setCounter] = set.algebraicCombinations();
                allDynamicStates.addAll(set.fVarsColl());
                totalNumAlgebraics += set.numAlgebraics();
                totalNumCombinations *= set.numCombinations();
                setCounter++;
            }
            if (totalNumCombinations > 42)
                throw new BLTException("Ouch! There are more than 42 combinations for the dynamic states, there were " + totalNumCombinations + " combinations!");
            FVariable[][] combinations = combineDSCombinations(setCombinations, totalNumAlgebraics);
            DynamicStateBLT[] blts = new DynamicStateBLT[combinations.length];
            for (int i = 0; i < combinations.length; i++) {
                FVariable[] combination = combinations[i];
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < combination.length; j++) {
                    sb.append(combination[j].name() + " ");
                }
                ASTNode.log.debug("Generating BLT for: %s", sb);
                BiPGraph graph = new BiPGraph(component.getMembers(), otherVars);
                for (FVariable var : combination)
                    graph.addVariable(var);
                for (Eq eqn : graph.getEquations()) {
                    Set<FVariable> vars = eqn.getEquation().referencedFVariables();
                    for (FVariable var : combination)
                        if (vars.contains(var))
                            graph.addEdge(eqn, graph.getVariable(var.name()));
                }
                ASTNode.log.debug(graph);
                graph.maximumMatching(true);
                Set<FVariable> algebraics = new LinkedHashSet<FVariable>(Arrays.asList(combination));
                Collection<FVariable> states = new ArrayList<FVariable>();
                for (FVariable var : allDynamicStates)
                    if (!algebraics.contains(var))
                        states.add(var);
                DynamicStateBLT blt = new DynamicStateBLT(setVarMap.keySet(), states, algebraics);
                if (graph.isComplete()) {
                    blt = graph.computeBLT(options, producer, blt, false);
                } else {
                    ASTNode.log.verbose("  This combination does not have a valid solution!");
                    ASTNode.log.debug(graph.printMatchingObj());
                }
                ASTNode.log.debug(blt);
                blts[i] = blt;
            }
            return new DynamicStateBlock(producer, component.computeBlockDependency(), blts, setVarMap.keySet());
        }

    
        public static final BlockProducer INDEX_REDUCTION_BLOCK_PRODUCER = new IndexReductionBlockProducer();

    

        private final static class IndexReductionBlockProducer extends BlockProducer {
            @Override
            public boolean useTearing() {
                return false;
            }

            @Override
            public boolean duringTearing() {
                return false;
            }

            @Override
            public String symbol() {
                return "I";
            }
        }


}
