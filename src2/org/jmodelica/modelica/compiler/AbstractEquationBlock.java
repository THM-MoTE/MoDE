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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:826
 */
public abstract class AbstractEquationBlock extends Object {
    public boolean containsFHomotopyExp() {
        for (FAbstractEquation eqn : allEquations()) {
            if (eqn.containsFHomotopyExp()) {
                return true;
            }
        }
        return false;
    }

    

        private BlockDependency blockDependency;

    
        private FExp[][] jacobian = null;

    
        private FTypePrefixVariability variability = FContinuous.instance;

    
        private final EquationBlockFactory.BlockProducer producer;

    
        private String label;

    
        private int sequenceNumber = -1;

    
        private int indexNumber = -1;

    

        public AbstractEquationBlock(EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) {
            this.producer = producer;
            this.blockDependency = blockDependency;
        }

    

        public BlockDependency getBlockDependency() {
            return blockDependency;
        }

    

        /**
         * Returns all equations in this block.
         * 
         * @return Collection<FAbstractEquation> all equations
         */
        public Collection<FAbstractEquation> allEquations() {
            Collection<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            l.addAll(realEquations());
            l.addAll(nonRealEquations());
            return l;
        }

    

        /**
         * Returns all local equations in this block.
         * 
         * Local equations are equations that are computed directly in this
         * block.
         * 
         * @return Collection<FAbstractEquation> all local equations
         */
        public Collection<FAbstractEquation> allLocalEquations() {
            Collection<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            l.addAll(localRealEquations());
            l.addAll(localNonRealEquations());
            return l;
        }

    

        /**
         * Returns all equations in this block that are of type real
         * 
         * @return Collection<FAbstractEquation> all real equations
         */
        public abstract Collection<FAbstractEquation> realEquations();

    

        /**
         * Returns all real blocks in this block.
         * 
         * @return Collection<SimpleEquationBlock> all real blocks
         */
        public abstract Collection<SimpleEquationBlock> localRealBlocks();

    

        /**
         * Returns all local equations in this block that are of type real
         * 
         * Local equations are equations that are computed directly in this
         * block.
         * 
         * @return Collection<FAbstractEquation> all local real equations
         */
        public abstract Collection<FAbstractEquation> localRealEquations();

    

        /**
         * Returns all equations in this block that are not of type real
         * 
         * @return Collection<FAbstractEquation> all non-real equations
         */
        public abstract Collection<FAbstractEquation> nonRealEquations();

    

        /**
         * Returns all local equations in this block that are not of type real
         * 
         * Local equations are equations that are computed directly in this
         * block.
         * 
         * @return Collection<FAbstractEquation> all local non-real equations
         */
        public abstract Collection<FAbstractEquation> localNonRealEquations();

    

        /**
         * Returns all equations in this block that are of type real and is unsolved
         * 
         * @return Collection<FAbstractEquation> all unsolved real equations
         */
        public abstract Collection<FAbstractEquation> unsolvedEquations();

    

        /**
         * Returns all local equations in this block that are of type real and is unsolved
         * 
         * Local equations are equations that are computed directly in this
         * block.
         * 
         * @return Collection<FAbstractEquation> all local unsolved real equations
         */
        public abstract Collection<FAbstractEquation> localUnsolvedEquations();

    

        /**
         * Returns a list of all local equations that has been differentiated.
         * 
         * @return Collection<FAbstractEquation> all local differentiated equations
         */
        public Collection<FAbstractEquation> localDifferentiatedEquations() {
            java.util.List<FAbstractEquation> diffedEq = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : allLocalEquations()) {
                if (e.getMeIntegrated() != null) {
                    diffedEq.add(e);
                }
            }
            return diffedEq;
        }

    

        /**
         * Returns all variables in this block
         * 
         * @return Collection<FVariable> all variables
         */
        public Collection<FVariable> allVariables() {
            Collection<FVariable> l = new ArrayList<FVariable>();
            l.addAll(realVariables());
            l.addAll(nonRealVariables());
            return l;
        }

    
        
        /**
         * Returns all local variables in this block
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local variables
         */
        public Collection<FVariable> allLocalVariables() {
            Collection<FVariable> l = new ArrayList<FVariable>();
            l.addAll(localRealVariables());
            l.addAll(localNonRealVariables());
            return l;
        }

    

        /**
         * Returns all variables in this block that are of type real.
         * 
         * @return Collection<FVariable> all real variables
         */
        public abstract Collection<FVariable> realVariables();

    

        /**
         * Returns all local variables in this block that are of type real.
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local real variables
         */
        public abstract Collection<FVariable> localRealVariables();

    

        /**
         * Returns all variables in this block that are not of type real.
         * 
         * @return Collection<FVariable> all non-real variables
         */
        public abstract Collection<FVariable> nonRealVariables();

    

        /**
         * Returns all local variables in this block that are not of real and discrete.
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local discrete real variables
         */
        public abstract Collection<FVariable> localDiscreteRealVariables();

    
        
        /**
         * Returns all local variables in this block that are not of type real.
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local non-real variables
         */
        public abstract Collection<FVariable> localNonRealVariables();

    

        /**
         * Returns all local variables in this block that are solved and of
         * real type.
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local solved real variables
         */
        public abstract Collection<FVariable> localSolvedRealVariables();

    
        
        /**
         * Returns all variables in this block that are of type real and is unsolved.
         * 
         * @return Collection<FVariable> all unsolved real variables
         */
        public abstract Collection<FVariable> unsolvedVariables();

    

        /**
         * Returns all local variables in this block that are of type real and is unsolved.
         * 
         * Local variables are variables that are computed directly in this
         * block.
         * 
         * @return Collection<FVariable> all local unsolved real variables
         */
        public abstract Collection<FVariable> localUnsolvedVariables();

    

		public Collection<FVariable> inactiveVariables() {
			java.util.List<FVariable> s = new ArrayList<FVariable>();
			for (FAbstractEquation e : allEquations()) {
				s.addAll(e.algebraicVariables());
				s.addAll(e.derivativeVariables());
				s.addAll(e.differentiatedRealVariables());
				s.addAll(e.initialParameters());
			}
			s.removeAll(allVariables());
			return s;	
		}

    		

		public Collection<FVariable> independentVariables() {
			java.util.List<FVariable> s = new ArrayList<FVariable>();
			for (FAbstractEquation e : allEquations()) {
				s.addAll(e.inputs());
				s.addAll(e.differentiatedRealVariables());
                s.addAll(e.discretePreVariables());
                //Add all independent parameters the block depends on
                for (FVariable vv: e.parameters())
                    s.addAll(vv.myParameterDependencies());
			}
			return s;
		}

    
		
		public abstract boolean isSolvable();

    
		
        public void computeDependencies(Map<FVariable, AbstractEquationBlock> blockMap) {
            blockDependency = blockDependency.computeComplete(blockMap);
            for (FVariable var : allVariables())
                blockMap.put(var, this);
        }

    

        public Collection<AbstractEquationBlock> immediatePredecessors() {
            return blockDependency.immediatePredecessors();
        }

    

        public Collection<AbstractEquationBlock> allPredecessors() {
            return blockDependency.allPredecessors();
        }

    

        public Collection<AbstractEquationBlock> immediateSuccessors() {
            return blockDependency.immediateSuccessors();
        }

    

        private Set<FVariable> dependsOnVariables_cashe = null;

    

        public Set<FVariable> dependsOn() {
            if (dependsOnVariables_cashe != null)
                return dependsOnVariables_cashe;
            dependsOnVariables_cashe = new LinkedHashSet<FVariable>(independentVariables());
            for (AbstractEquationBlock eb : blockDependency.immediatePredecessors())
                dependsOnVariables_cashe.addAll(eb.dependsOn());
            return dependsOnVariables_cashe;
        }

    

        public boolean isSimple() {
            return false;
        }

    

        public SimpleEquationBlock asSimple() {
            throw new UnsupportedOperationException("Unable to convert block of type '" + getClass().getSimpleName() + "' to 'SimpleEquationBlock'!");
        }

    

        /**
         * Returns the jacobian for this block if it has been computed, else null.
         * 
         * @return FExp[][] jacobian for this block
         */
        public FExp[][] jacobian() {
            return jacobian;
        }

    

        public abstract boolean canComputeJacobian();

    

        /**
         * Computes the jacobian for the unsolved part of this block and store
         * the result. This method should only be called if the block is linear.
         * This method also computes the variability of the resulting jacobian.
         */
        public boolean computeJacobian(Set<FAbstractEquation> activeRealEquations) {
            if (!canComputeJacobian())
                return false;
            jacobian = computeJacobian(localRealBlocks(), activeRealEquations);
            variability = computeVariability(jacobian);
            return true;
        }

    

        /**
         * Returns true if the block is linear.
         * 
         * @return boolean True if linear
         */
        public boolean isLinear() {
            return jacobian != null;
        }

    

        public FTypePrefixVariability variability() {
            return variability;
        }

    

        public final String getLabel() {
            return label;
        }

    

        public final int getSequenceNumber() {
            return sequenceNumber;
        }

    

        public final int getIndexNumber() {
            if (indexNumber < 0) {
                throw new IllegalStateException("indexNumber has not been initialized.");
            }
            return indexNumber;
        }

    

        public void setIndexNumber(int indexNumber) {
            this.indexNumber = indexNumber;
        }

    

        protected abstract boolean needLabel(boolean inSubBlock);

    
        protected abstract boolean needSequenceNumber(boolean inSubBlock);

    

        public final void setLabel(Enumerator nestedEnum, Enumerator seqEnum) {
            setLabel(null, false, nestedEnum, seqEnum);
        }

    

        protected void setLabel(String prefix, boolean inSubBlock, Enumerator nestedEnum, Enumerator seqEnum) {
            if (needLabel(inSubBlock)) {
                if (nestedEnum == null) { // Used for HomotopySubBlock
                    label = String.valueOf(prefix);
                } else if (prefix == null) {
                    label = String.valueOf(nestedEnum.next());
                } else {
                    label = prefix + '.' + nestedEnum.next();
                }
            }
            if (needSequenceNumber(inSubBlock)) {
                sequenceNumber = seqEnum.next();
            }
        }

    

        /**
         * This method is call on blocks that are used in iterations. This
         * method should check the start values of its variable and verify
         * that a start value is set.
         */
        public abstract void errorCheck(FClass fclass);

    

        protected final static FExp[][] computeJacobian(Collection<SimpleEquationBlock> blocks, Set<FAbstractEquation> activeRealEquations) {
            
            Collection<FAbstractEquation> eqns = new ArrayList<FAbstractEquation>();
            Collection<FVariable> vars = new ArrayList<FVariable>();
            
            for (SimpleEquationBlock block : blocks) {
                Collection<FVariable> blockVars = block.localRealVariables();
                if (blockVars.size() == 0 || block.isMeta()) {
                    continue;
                }
                vars.addAll(blockVars);
                
                Collection<FAbstractEquation> blockEqns = block.localRealEquations();
                // There should be exactly one equation in this list
                if (blockEqns.size() != 1) {
                    throw new IllegalArgumentException("Incorrect arguments to AbstractEquationBlock.computeJacobian(). There are " + blockVars.size() + " local real variables but " + blockEqns.size() + " local real equations in sub-block:" + block);
                }
                // Let's add it n number of times, one for each variable
                for (int i = 0; i < blockVars.size(); i++) {
                    eqns.addAll(blockEqns);
                }
            }
            
            FExp[][] jacobian = new FExp[eqns.size()][vars.size()];
            int row = 0;
            int col = 0;
            Map<FVariable, Integer> columnMap = new HashMap<FVariable, Integer>();
            for (FVariable fv : vars)
                columnMap.put(fv, col++);
            
            for (FAbstractEquation fe : eqns) {
                if (!activeRealEquations.contains(fe)) {
                    jacobian[row][row] = new FRealLitExp(1);
                    jacobian[row][row].parent = fe; // TODO: This is ugly, yes!
                } else {
                    Set<FVariable> RLHS = fe.referencedFVariablesInLHS();
                    Set<FVariable> RRHS = fe.referencedFVariablesInRHS();
                    FExp l = ((FEquation)fe).getLeft();
                    FExp r = ((FEquation)fe).getRight();
                    for (FVariable fv : new ChainedIterable<FVariable>(RLHS, RRHS)) {
                        Integer colObj = columnMap.get(fv);
                        if (colObj == null)
                            continue;
                        col = colObj;
                        
                        FExp dl = l.dynamicFExp(l.diff(fv.name()));
                        boolean lz = dl.equalsRealValue(0);
                        FExp dr = r.dynamicFExp(r.diff(fv.name()));;
                        boolean rz = dr.equalsRealValue(0);;
                        FExp je;
                        if (rz && lz) {
                            je = null;
                        } else if (lz) {
                            je = r.dynamicFExp(new FNegExp(dr));
                        } else if (rz) {
                            je = dl;
                        } else {
                            je = r.dynamicFExp(new FSubExp(dl,dr));
                        }
                        jacobian[row][col] = je;
                    }   
                }
                row++;
            }
            return jacobian;
        }

    

        protected final static FTypePrefixVariability computeVariability(FExp[][] jacobian) {
            FTypePrefixVariability blockVariability = ASTNode.fConstant();
            for (FExp[] row : jacobian)
                for (FExp element : row)
                    if (element != null && !element.variability().lessOrEqual(blockVariability))
                        blockVariability = element.variability();
            return blockVariability;
        }

    

        protected final static Collection<FVariable> collectLocalVariables(Collection<? extends SimpleEquationBlock> ... blockss) {
            Collection<FVariable> l = new ArrayList<FVariable>();
            for (Collection<? extends AbstractEquationBlock> blocks : blockss)
                for (AbstractEquationBlock sb : blocks)
                    l.addAll(sb.allLocalVariables());
            return l;
        }

    

        protected final static Collection<FAbstractEquation> collectLocalEquations(Collection<? extends SimpleEquationBlock> ... blockss) {
            Collection<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (Collection<? extends AbstractEquationBlock> blocks : blockss)
                for (AbstractEquationBlock sb : blocks)
                    l.addAll(sb.allLocalEquations());
            return l;
        }

    
        
        public EquationBlockFactory.BlockProducer producer() {
            return producer;
        }

    
        
        public String printAllVariables() {
            return printAllVariables(", ");
        }

    
        public String printAllVariables(String separator) {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (FVariable var : allVariables()) {
                if (!first)
                    sb.append(separator);
                first = false;
                sb.append(var.displayName());
            }
            return sb.toString();
        }

    
        
        public boolean isMeta() {
            return false;
        }

    
        
        public boolean isScalar() {
            return false;
        }

    
        
        public boolean isTimeDependent() {
            for (FAbstractEquation eqn : allEquations()) {
                if (eqn.containsFTimeExp()) {
                    return true;
                }
            }

            return false;
        }

    
        
        public static class BlockProblemProducer extends ProblemProducer<ReporterNode> {
            
            private final String message;
            
            public BlockProblemProducer(String identifier, String message) {
                super(identifier, ProblemKind.SEMANTIC);
                this.message = message;
            }
            
            @Override
            public ProblemSeverity severity() {
                return ProblemSeverity.ERROR;
            }
            
            public void invoke(ReporterNode src, AbstractEquationBlock block) {
                invoke(src, ProblemSeverity.ERROR, "%s\nBlock which produced the error:\n%s", message, block);
            }

            @Override
            public String description() {
                return message;
            }

        }

    

        /**
         * Tries to merge the provided block with this one if they are of the
         * same type. True is returned if the merge was successful, false
         * otherwise.
         */
        public final boolean merge(AbstractEquationBlock block) {
            if (getClass().equals(block.getClass()) && do_merge(block)) {
                return true;
            }
            return false;
        }

    
        
        /**
         * Internal method for merging, subclasses should override and try to
         * merge. Return true on successful merge. No type check is needed, it
         * has already been checked.
         */
        protected boolean do_merge(AbstractEquationBlock block) {
            return false;
        }

    @Override
    public final String toString() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        CodeStream str = new CodeStream(os);
        prettyPrint(str);
        return os.toString();
    }

    public void prettyPrint(CodeStream str) {
        prettyPrint(ASTNode.BLTPrettyPrinter, str, "");
    }

    public abstract void prettyPrint(Printer p, CodeStream str, String indent);

    public abstract void prettyPrintSub(Printer p, CodeStream str, String indent);

    public abstract void prettyPrintActiveVariables(Printer p, CodeStream str, String indent, boolean printAttributes, boolean printLabel);

    protected void printIterationVariables(CodeStream str) {}

    protected void printTearingPairs(CodeStream str) {}

    public void genBlockResidualFunction_CAD(boolean inInitial, String outerIndent, CodeStream str) {
        if (!hasResidualFunction_C())
            return;
        for (AbstractEquationBlock subBlock : genBlockResidualFunction_subBlocks_C())
            subBlock.genBlockResidualFunction_CAD(inInitial, outerIndent, str);
        
        str.format("%sstatic int dae_%sblock_dir_der_%d(jmi_t* jmi, jmi_real_t* x, jmi_real_t* dx,jmi_real_t* residual, jmi_real_t* dRes, int evaluation_mode) {\n",
                outerIndent, (inInitial ? "init_" : ""), getSequenceNumber());
        
        String indent = ASTNode.printer_CAD.indent(outerIndent);
        String innerIndent = ASTNode.printer_CAD.indent(indent);
        
        str.format("%s/***** %s: %s *****/\n", indent, inInitial ? "Init block" : "Block", getLabel());
        
        genVarDecls_CAD(str, indent, null);
        
        str.print(indent);
        str.println("jmi_real_t** res = &residual;");
        str.print(indent);
        str.println("int ef = 0;");
        str.print(indent);
        str.println("jmi_real_t** dF = &dRes;");
        str.print(indent);
        str.println("jmi_real_t** dz;");
        
        str.print(indent);
        str.println("if (evaluation_mode == JMI_BLOCK_INITIALIZE) {");
        int var_counter = 0;
        // Loop over all unsolved variables and write their value to x  
        for (FVariable fv : localUnsolvedVariables()) {
            str.print(innerIndent);
            str.println("x["+var_counter+"] = " + fv.name_C() + ";");
            var_counter++;
        }
        str.print(innerIndent);
        str.println("return 0;");
        
        // If we should evaluate the block Jacobian, then use dz_active_variables as seed
        str.print(indent);
        str.println("} else if (evaluation_mode == JMI_BLOCK_EVALUATE) {");
        str.print(innerIndent);
        str.println("dz = jmi->dz_active_variables;");
        // Loop over all active variables and write the values in x to the z vector
        var_counter = 0;
        // Iteration is over the unsolved variables. 
        for (FVariable fv : localUnsolvedVariables()) {
            str.print(innerIndent);
            str.println("(*dz)[ jmi_get_index_from_value_ref(" + fv.valueReference() + ")-jmi->offs_real_dx] = dx[" + var_counter + "];");
            str.print(innerIndent);
            str.println(fv.name_C() + " = x["+var_counter+"];");
            var_counter++;
        }
        
        // If we should evaluate the right hand side use global dz as seed
        str.print(indent);
        str.println("} else if (evaluation_mode == JMI_BLOCK_EVALUATE_INACTIVE) {");
        str.print(innerIndent);
        str.println("dz = jmi->dz;");
        
        // If we should write back directional derivatives then global use dz as seed
        str.print(indent);
        str.println("} else if (evaluation_mode == JMI_BLOCK_WRITE_BACK) {");
        str.print(innerIndent);
        str.println("dz = jmi->dz;");
        // Code that stores the evaluated dz
        // dz entries for the solved variables are updated below as well
        var_counter = 0;
        for (FVariable fv : localUnsolvedVariables()) {
            str.print(innerIndent);
            str.println("(*dz)[jmi_get_index_from_value_ref(" + fv.valueReference() + ")-jmi->offs_real_dx] = -(*dF)[" + var_counter + "];");
            var_counter++;
        }
        str.print(indent);
        str.println("} else {");
        str.print(innerIndent);
        str.println("return -1;");
        str.print(indent);
        str.println("}");
        
        Set<FAbstractEquation> visitedList = new HashSet<FAbstractEquation>();
        // Generate dz_i seeds from solved equations and variables
        genBlockResidualFunctionBeforeEqns_CAD(indent, str, inInitial, visitedList);
        
        str.print(indent);
        str.println("if (evaluation_mode == JMI_BLOCK_EVALUATE_INACTIVE || evaluation_mode == JMI_BLOCK_EVALUATE) {");
        
        // AD-code for residual equations
        genBlockResidualFunctionEqns_CAD(new Enumerator(), innerIndent, str, visitedList);
        
        // Reset all variables. global dz is updated elsewhere and dz_active should
        // always be reset so as not to cause incorrect seeds
        for (FVariable fv : localUnsolvedVariables()) {
            str.print(innerIndent);
            str.println("(*dz)[jmi_get_index_from_value_ref(" + fv.valueReference() + ")-jmi->offs_real_dx] = 0;");
        }
        
        str.print(indent);
        str.println("}");
        str.print(indent);
        str.println("return ef;");
        str.print(outerIndent);
        str.println("}");
        str.println();
    }

    public void genBlock_CAD(int i, boolean inInitial, String indent, CodeStream str){
        if (inInitial) {
            str.print(indent + "jmi_ode_unsolved_block_dir_der(jmi, jmi->dae_init_block_residuals[" + i +"]);\n");
        } else {
            str.print(indent + "jmi_ode_unsolved_block_dir_der(jmi, jmi->dae_block_residuals[" + i +"]);\n");
        }
    }

    public abstract void genBlockResidualFunctionBeforeEqns_CAD(String indent, CodeStream str, boolean inInitial, Set<FAbstractEquation> visited);

    public void genBlockResidualFunctionBeforeSubEqns_CAD(String indent, CodeStream str, boolean inInitial, Set<FAbstractEquation> visited) {
        genBlockResidualFunctionBeforeEqns_CAD(indent, str, inInitial, visited);
    }

    public abstract void genBlockResidualFunctionEqns_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited);

    protected void genVarDecls_CAD(CodeStream str, String indent, Set<ASTNode> visited) {
        for (ASTNode n : blockResidualNodes_C())
            if (visited == null || visited.add(n))
                n.genVarDecls_CAD(ASTNode.printer_CAD, str, indent);
    }

    public void genEvalModeValueReferences_C(CodePrinter p, CodeStream str, String indent, 
            String mode, Collection<FVariable> fvs) {
        if (fvs.size() > 0) {
            String nextIndent = p.indent(indent);
            int i = 0;
            genOpenEvalMode_C(str, indent, mode);
            for (FVariable fv : fvs) {
                if (!fv.isPreVariable()) {
                    str.format("%sx[%d] = %d;\n", nextIndent, i, fv.valueReference());
                }
                i++;
            }
            genCloseEvalMode_C(str, indent);
        }
    }

    public Map<FVariable,String> createSolverArrayMap(Collection<FVariable> fvs) {
        Map<FVariable,String> solverArrayMap = new LinkedHashMap<FVariable,String>();
        int i = 0;
        for (FVariable fv : fvs) {
            solverArrayMap.put(fv, "x[" + (i++) + "]");
        }
        return solverArrayMap;
    }

    public void genEvalModeAttribute_C(CodePrinter p, CodeStream str, String indent, 
            String mode, String attr, Map<FVariable,String> solverArrayMap) {
        if (p.C_blockResidualAttributePrinter.attributeSet(attr, solverArrayMap)) {
            String nextIndent = p.indent(indent);
            genOpenEvalMode_C(str, indent, mode);
            p.C_blockResidualAttributePrinter.print(p, str, nextIndent, attr, solverArrayMap);
            genCloseEvalMode_C(str, indent);
        }
    }

    public void genEvalModeSwitchIndex_C(CodePrinter p, CodeStream str, String indent, 
            String mode, Collection<FRelExp> ... relExpss) {
        boolean print = false;
        for (Collection<FRelExp> relExps : relExpss) {
            if (relExps.size() > 0) {
                print = true;
            }
        }
        if (print) {
            String nextIndent = p.indent(indent);
            genOpenEvalMode_C(str, indent, mode);
            Enumerator e = new Enumerator();
            for (Collection<FRelExp> relExps : relExpss) {
                for (FRelExp relExp : relExps) {
                    relExp.genBlockResidualFunction_printSwitchIndex_C(p, str, nextIndent, e);
                }
            }
            genCloseEvalMode_C(str, indent);
        }
    }

    public void genOpenEvalMode_C(CodeStream str, String indent, String mode) {
        str.print("if (evaluation_mode == ");
        str.print(mode);
        str.print(") {\n");
    }

    public void genCloseEvalMode_C(CodeStream str, String indent) {
        str.print(indent + "} else ");
    }

    public void genBlockResidualFunction_C(CodePrinter p, CodeStream str, String outerIndent, boolean inInitial) {
        if (!hasResidualFunction_C())
            return;
        for (AbstractEquationBlock subBlock : genBlockResidualFunction_subBlocks_C())
            subBlock.genBlockResidualFunction_C(p, str, outerIndent, inInitial);
        
        Map<FVariable,String> solverArrayMap = createSolverArrayMap(localUnsolvedVariables());
        
        String indent = p.indent(outerIndent);
        String nextIndent = p.indent(indent);
        str.format("%sstatic int dae_%sblock_%d(jmi_t* jmi, jmi_real_t* x, jmi_real_t* residual, int evaluation_mode) {\n", 
                outerIndent, (inInitial? "init_": ""), getSequenceNumber());
        str.format("%s/***** %s: %s *****/\n", indent, inInitial ? "Init block" : "Block", getLabel());
        str.print(indent + "jmi_real_t** res = &residual;\n");
        str.print(indent + "int ef = 0;\n");
        genVarDecls_C(p, str, indent, null);
        
        str.print(indent);
        
        // Nominal values
        genEvalModeAttribute_C(p, str, indent, "JMI_BLOCK_NOMINAL", FAttribute.NOMINAL, solverArrayMap); 
        
        // Start values
        if (p.C_blockResidualAttributePrinter.attributeSet(FAttribute.START, solverArrayMap)) {
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_START");
            p.C_blockResidualAttributePrinter.print(p, str, nextIndent, FAttribute.START, solverArrayMap);
            genCloseEvalMode_C(str, indent);
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_START_SET");
            p.C_blockResidualAttributePrinter.printSet(p, str, nextIndent, FAttribute.START, solverArrayMap);
            genCloseEvalMode_C(str, indent);
        }
        
        genEvalModeAttribute_C(p, str, indent, "JMI_BLOCK_MIN", FAttribute.MIN, solverArrayMap);
        genEvalModeAttribute_C(p, str, indent, "JMI_BLOCK_MAX", FAttribute.MAX, solverArrayMap);
        
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_VALUE_REFERENCE",
                localUnsolvedVariables());
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_SOLVED_REAL_VALUE_REFERENCE",
                localSolvedRealVariables());
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_DISCRETE_REAL_VALUE_REFERENCE",
                discreteRealVariables_C());
        genEvalModeAttribute_C(p, str, indent,       "JMI_BLOCK_DISCRETE_REAL_NOMINAL", 
                FAttribute.NOMINAL, createSolverArrayMap(discreteRealVariables_C()));
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_SOLVED_NON_REAL_VALUE_REFERENCE", 
                nonRealVariables_C());
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_DIRECTLY_IMPACTING_NON_REAL_VALUE_REFERENCE", 
                directlyImpactingNonReals_C());
        genEvalModeValueReferences_C(p, str, indent, "JMI_BLOCK_NON_REAL_TEMP_VALUE_REFERENCE", 
                nonRealTempVariables_C());
        
        genEvalModeSwitchIndex_C(p, str, indent, "JMI_BLOCK_ACTIVE_SWITCH_INDEX",
                activeSwitches_C(), activeInitialSwitches_C());
        genEvalModeSwitchIndex_C(p, str, indent, "JMI_BLOCK_DIRECTLY_ACTIVE_SWITCH_INDEX",
                directlyActiveSwitches_C);
        
        // Equation nominal values
        if (hasEquationNominal_C(false)) {
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_EQUATION_NOMINAL");
            Map<FAbstractEquation,FExp> nominalMap = new HashMap<FAbstractEquation,FExp>();
            genEquationNominalVarDecl_C(p, str, p.indent(indent), false, nominalMap);
            genEquationNominal_C(p, str, p.indent(indent), false, nominalMap);
            genCloseEvalMode_C(str, indent);
        }
        
        if (hasEquationNominal_C(true)) {
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_EQUATION_NOMINAL_AUTO");
            Map<FAbstractEquation,FExp> nominalMap = new HashMap<FAbstractEquation,FExp>();
            genEquationNominalVarDecl_C(p, str, p.indent(indent), true, nominalMap);
            genEquationNominal_C(p, str, p.indent(indent), true, nominalMap);
            genCloseEvalMode_C(str, indent);
        }
        
        // Loop over all active variables and write their value to x	
        if (localUnsolvedVariables().size() > 0) {
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_INITIALIZE");
            for (FVariable fv : localUnsolvedVariables()) 
                fv.genBlockResidualInit_C(p, str, nextIndent, solverArrayMap);
            genCloseEvalMode_C(str, indent);
        }
        
        // Generate code for Jacobian
        if (jacobian != null) {
            genOpenEvalMode_C(str, indent, "JMI_BLOCK_EVALUATE_JACOBIAN");
            // TODO: Merge the two functions?
            genBlockResidualFunction_jacobianDecls_C(p, str, p.indent(indent));
            genBlockResidualFunction_jacobian_C(p, str, p.indent(indent));
            genCloseEvalMode_C(str, indent);
        }
        
        str.print("if (evaluation_mode & JMI_BLOCK_EVALUATE || evaluation_mode & JMI_BLOCK_WRITE_BACK) {\n");
        // Loop over all active variables and write the values in x to the z vector
        str.print(nextIndent + "if ((evaluation_mode & JMI_BLOCK_EVALUATE_NON_REALS) == 0) {\n"); // TODO: remove guard when correct x is given to JMI_BLOCK_EVALUATE_NON_REALS
        for (FVariable fv : localUnsolvedVariables()) 
            fv.genBlockResidualEvalInit_C(p, str, p.indent(nextIndent), solverArrayMap);
        str.print(nextIndent + "}\n");
        Set<FAbstractEquation> visitedList = new HashSet<FAbstractEquation>();
        genBlockResidualFunction_solvedEqns_C(p, str, nextIndent, inInitial, visitedList);
        str.print(nextIndent + "if (evaluation_mode & JMI_BLOCK_EVALUATE) {\n");
        // Write the residual expressions
        genBlockResidualFunction_residualEqns_C(p, str, p.indent(nextIndent), new Enumerator(), visitedList, solverArrayMap);
        str.print(nextIndent + "}\n");
        str.print(indent + "}\n");
        str.print(indent + "return ef;\n");
        str.print(outerIndent + "}\n\n");
    }

    protected Collection<AbstractEquationBlock> genBlockResidualFunction_subBlocks_C() {
        return Collections.emptyList();
    }

    public abstract void genBlockResidualFunction_residualEqns_C(CodePrinter p, CodeStream str, String indent,
            Enumerator enumerator, Set<FAbstractEquation> visited, Map<FVariable,String> solverArrayMap);

    public void genBlockResidualFunction_solvedEqns_C(CodePrinter p, CodeStream str,
            String indent, boolean inInitial, Set<FAbstractEquation> visited) {}

    public abstract void genBlockResidualFunction_solvedEqn_C(CodePrinter p, CodeStream str,
            String indent, boolean inInitial, Set<FAbstractEquation> visited);

    public abstract boolean hasEquationNominal_C(boolean auto);

    public abstract void genEquationNominalVarDecl_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap);

    public abstract void genEquationNominal_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap);

    protected void genVarDecls_C(CodePrinter p, CodeStream str, String indent, Set<ASTNode> visited) {
        for (ASTNode n : blockResidualNodes_C())
            if (visited == null || visited.add(n))
                p.printVarDecls(n, str, indent);
    }

    public Set<ASTNode> blockResidualNodes_C() {
		Set<ASTNode> res = new LinkedHashSet<ASTNode>();
		res.addAll(allLocalEquations());
		return res;
	}

    public void genBlockResidualFunction_jacobianDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (jacobian != null)
            for (FExp[] col : jacobian)
                for (FExp exp : col)
                    if (exp != null)
                        exp.genVarDecls_C(ASTNode.printer_C, str, indent);
    }

    public void genBlockResidualFunction_jacobian_C(CodePrinter p, CodeStream str, String indent) {
        if (jacobian == null)
            return;
        FExp[][] jacobian = jacobian();
        int rows = jacobian.length;
        int cols = jacobian.length;
        str.format("%smemset(residual, 0, %d * sizeof(jmi_real_t));\n", indent, rows * cols);
        // Output Jacobian
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (jacobian[row][col] != null) {
                    p.printPreSteps(jacobian[row][col], str, indent);
                    str.format("%sresidual[%d] = ", indent, rows * col + row);
                    p.print(jacobian[row][col], str, indent);
                    str.format(";\n");
                    p.printPostSteps(jacobian[row][col], str, indent);
                }
            }
        }
    }

    public boolean hasResidualFunction_C() {
        return getLabel() != null;
    }

    public void genBlockAddCall_C(CodePrinter p, CodeStream str, String indent, boolean dirDer, boolean inInit, String nleSolver, int parentBlockNumber) {
		if (!hasResidualFunction_C())
			return;
		for (AbstractEquationBlock subBlock : genBlockResidualFunction_subBlocks_C())
			subBlock.genBlockAddCall_C(p, str, indent, dirDer, inInit, nleSolver, getSequenceNumber());
		
		str.print(indent);
		str.print("jmi_dae_" + (inInit ? "init_" : "") + "add_equation_block(");
		str.print("*jmi, dae_" + (inInit ? "init_" : "") + "block_" + getSequenceNumber() + ", ");
		if (dirDer)
			str.print("dae_" + (inInit ? "init_" : "") + "block_dir_der_" + getSequenceNumber() + ", ");
		else
			str.print("NULL, ");
		str.print(localUnsolvedVariables().size() + ", "); // Rename to realIterationVariables() and nonRealIterationVariables()?
		str.print(localSolvedRealVariables().size() + ", ");
        str.print(discreteRealVariables_C().size() + ", ");
		str.print(nonRealVariables_C().size() + ", ");
		str.print(directlyImpactingNonReals_C().size() + ", ");
        str.print(nonRealTempVariables_C().size() + ", ");
		str.print((activeSwitches_C().size() + activeInitialSwitches_C().size()) + ", ");
		str.print(directlyActiveSwitches_C().size() + ", ");
		str.print(variability().genJMIVariabilityConstant_C() + ", ");
		p.C_blockResidualAttributePrinter.printVariability(p, str, indent, this.localUnsolvedVariables());
		str.print(genJMISolverConstant_C(nleSolver) + ", ");
		str.print(getSequenceNumber() + ", \"");
		str.print(getLabel() + "\", ");
		str.print(parentBlockNumber + ");\n");
	}

    public String genJMISolverConstant_C(String nleSolver) {
        if (isLinear() || localUnsolvedEquations().isEmpty())
            return "JMI_LINEAR_SOLVER";
        else if (nleSolver.equals("kinsol"))
            return "JMI_KINSOL_SOLVER";
        else if (nleSolver.equals("minpack"))
            return "JMI_MINPACK_SOLVER";
        else
            throw new UnsupportedOperationException("The string value: " + nleSolver + " is not valid for the compiler option nonlinear_solver");
    }

    private Collection<FRelExp> activeSwitches_C = null;

    private Collection<FRelExp> inactiveSwitches_C = null;

    private Collection<FRelExp> activeInitialSwitches_C = null;

    private Collection<FRelExp> inactiveInitialSwitches_C = null;

    private Collection<FRelExp> directlyActiveSwitches_C = null;

    private Collection<FVariable> directlyImpactingNonReals_C = null;

    public Collection<FRelExp> activeSwitches_C() {
        cacheSwitches_C();
        return activeSwitches_C;
    }

    public Collection<FRelExp> activeInitialSwitches_C() {
        cacheSwitches_C();
        return activeInitialSwitches_C;
    }

    public Collection<FRelExp> inactiveSwitches_C() {
        cacheSwitches_C();
        return inactiveSwitches_C;
    }

    public Collection<FRelExp> inactiveInitialSwitches_C() {
        cacheSwitches_C();
        return inactiveInitialSwitches_C;
    }

    public Collection<FRelExp> directlyActiveSwitches_C() {
        cacheSwitches_C();
        return directlyActiveSwitches_C;
    }

    public Collection<FVariable> discreteRealVariables_C() {
        Collection<FVariable> l = new ArrayList<FVariable>();
        for (FVariable fv : localDiscreteRealVariables()) {
            if (!fv.isTemporary()) {
                l.add(fv);
            }
        }
        return l;
    }

    public Collection<FVariable> nonRealVariables_C() {
        Collection<FVariable> l = new ArrayList<FVariable>();
        for (FVariable fv : localNonRealVariables()) {
            if (!fv.isTemporary()) {
                l.add(fv);
            }
        }
        return l;
    }

    public Collection<FVariable> nonRealTempVariables_C() {
        Collection<FVariable> l = new ArrayList<FVariable>();
        for (FVariable fv : localNonRealVariables()) {
            if (fv.isTemporary()) {
                l.add(fv);
            }
        }
        return l;
    }

    public Collection<FVariable> directlyImpactingNonReals_C() {
        cacheSwitches_C();
        return directlyImpactingNonReals_C;
    }

    private void cacheSwitches_C() {
        if (activeSwitches_C != null && activeInitialSwitches_C != null && inactiveSwitches_C != null &&
                inactiveInitialSwitches_C != null && directlyActiveSwitches_C != null && directlyImpactingNonReals_C != null)
            return;
        activeSwitches_C = new LinkedHashSet<FRelExp>();
        activeInitialSwitches_C = new LinkedHashSet<FRelExp>();
        inactiveSwitches_C = new LinkedHashSet<FRelExp>();
        inactiveInitialSwitches_C = new LinkedHashSet<FRelExp>();
        directlyActiveSwitches_C = new LinkedHashSet<FRelExp>();
        directlyImpactingNonReals_C = new LinkedHashSet<FVariable>();
        
        Set<FAbstractEquation> realEqns = new HashSet<FAbstractEquation>(localRealEquations());
        Set<FVariable> nonRealVars = new HashSet<FVariable>(nonRealVariables_C());
        Set<FVariable> allVariables = new HashSet<FVariable>(allLocalVariables());
        for (FAbstractEquation equation : allLocalEquations()) {
            boolean realEqn = realEqns.contains(equation);
            for (FRelExp relExp : equation.relExpInInitialEquation()) {
                FRelExp orig = relExp.originalFExp();
                if (orig.dependsOn(allVariables)) {
                    activeInitialSwitches_C.add(orig);
                    if (realEqn)
                        directlyActiveSwitches_C.add(orig);
                } else {
                    inactiveInitialSwitches_C.add(orig);
                }
            }
            for (FRelExp relExp : equation.relExpInEquation()) {
                FRelExp orig = relExp.originalFExp();
                if (orig.dependsOn(allVariables)) {
                    activeSwitches_C.add(orig);
                    if (realEqn)
                        directlyActiveSwitches_C.add(orig);
                } else {
                    inactiveSwitches_C.add(orig);
                }
            }
            if (realEqn) {
                for (FVariable var : equation.referencedFVariables()) {
                    if (nonRealVars.contains(var))
                        directlyImpactingNonReals_C.add(var);
                }
            }
        }
    }

    public void genBlockBase_C(CodePrinter p, CodeStream str, String indent, boolean inInitial) {
        for (FRelExp relExp : inactiveSwitches_C())
            p.printPreSteps(relExp, str, indent);
        for (FRelExp relExp : inactiveInitialSwitches_C())
            p.printPreSteps(relExp, str, indent);
        String var = inInitial ? "dae_init_block_residuals" : "dae_block_residuals";
        str.format("%sef |= jmi_solve_block_residual(jmi->%s[%d]);\n", indent, var, getSequenceNumber());
        for (FRelExp relExp : inactiveSwitches_C())
            p.printPostSteps(relExp, str, indent);
        for (FRelExp relExp : inactiveInitialSwitches_C())
            p.printPostSteps(relExp, str, indent);
    }

    public abstract void genBlock_C(CodePrinter p, CodeStream str, String indent, boolean inInitial);

    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (isSolvable()) {
            genVarDecls_C(p, str, indent, null);
        } else {
            for (FRelExp relExp : inactiveSwitches_C())
                p.printVarDecls(relExp, str, indent);
            for (FRelExp relExp : inactiveInitialSwitches_C())
                p.printVarDecls(relExp, str, indent);
        }
    }

    public void genReinitTempDecls_C(CodePrinter p, CodeStream str, String indent) {
        for (FAbstractEquation eqn : allEquations()) {
            eqn.genReinitTempDecls_C(p, str, indent);
        }
    }

    public void genReinitTempInits_C(CodePrinter p, CodeStream str, String indent) {
        for (FAbstractEquation eqn : allEquations()) {
            eqn.genReinitTempInits_C(p, str, indent);
        }
    }

    public void genReinitWritebacks_C(CodePrinter p, String indent, CodeStream str) {
        Map<String, ArrayList<FReinit>> map = new LinkedHashMap<String, ArrayList<FReinit>>();
        for (FAbstractEquation eqn : allEquations()) {
            eqn.collectReinits_C(map, p.inInitialSystem());
        }
        for (ArrayList<FReinit> list : map.values()) {
            for (int i = 0, n = list.size(); i < n; i++) {
                list.get(i).genReinitWritebacks_C(p, str, indent, i == 0, i == n - 1);
            }
        }
    }

    protected abstract String diagnostics_generateBLTTable_color();

    protected Map<FVariable, Integer> EMPTY_VAR_FILTER = Collections.emptyMap();

    public static final int DIAGNOSTICS_CELL_SIZE = 15;

    public void diagnostics_generateBLTTable_block(FVariable[] order, CodeStream out, DiagnosticsGenerator.TableManager tm) {
    int numReal = realVariables().size();
    int numNonReal = nonRealVariables().size();
    int start = tm.getYPos() * DIAGNOSTICS_CELL_SIZE;
    int sizeReal = numReal * DIAGNOSTICS_CELL_SIZE + 1;
    int sizeNonReal = (numReal + numNonReal) * DIAGNOSTICS_CELL_SIZE + 1;
    if (numNonReal > 0)
        out.formatln("    <div class=\"block\" style=\"background:#F0E7CC;left:%dpx;top:%dpx;width:%dpx;height:%dpx;\"></div>", start, start, sizeNonReal, sizeNonReal);
    if (numReal > 0)
        out.formatln("    <div class=\"block\" style=\"background:%s;left:%dpx;top:%dpx;width:%dpx;height:%dpx;\"></div>", diagnostics_generateBLTTable_color(), start, start, sizeReal, sizeReal);
    diagnostics_generateBLTTable_rows(order, out, tm, false, -1, EMPTY_VAR_FILTER);
}

    public void diagnostics_generateBLTTable_rows(FVariable[] order, CodeStream out, DiagnosticsGenerator.TableManager tm, boolean inTearBlock, int size, Map<FVariable, Integer> varFilter) {
    for (FAbstractEquation equation : allEquations()) {
        if (varFilter == EMPTY_VAR_FILTER)
            size = equation.numScalarEquations();
        String equationStr = ASTNode.escapeHTML(equation);
        for (int i = 0; i < size; i++) {
            out.formatln("    <div class=\"equation\" style=\"top:%dpx;\" title=\"%s\">%s</div>", tm.getYPos() * DIAGNOSTICS_CELL_SIZE, equationStr, equationStr);
            for (FVariable var : order) {
                Integer pos = varFilter.get(var);
                boolean contains = (equation.variables().contains(var) 
                        || equation.discretePreVariables().contains(var)
                        || equation.initialParameters().contains(var))
                        && (pos == null || pos == i);
                if (contains)
                    out.formatln("    <div class=\"incidence\" style=\"left:%dpx;top:%dpx;z-index:10000;\" title=\"%s&#13;&#13;%s\" onmouseover=\"hightlight(this);\" onmouseout=\"unhighlight(this);\" onclick=\"lockHighlight(this);\"><div>%s</div></div>", tm.getXPos() * DIAGNOSTICS_CELL_SIZE, tm.getYPos() * DIAGNOSTICS_CELL_SIZE, ASTNode.escapeHTML(var.name()), equationStr, diagnostics_generateBLTTable_solvabilitySymbol(equation.isSolved(var, inTearBlock)));
                tm.newCol();
            }
            tm.newRow();
        }
    }
}

    private String diagnostics_generateBLTTable_solvabilitySymbol(Solvability s) {
    switch (s) {
    case ANALYTICALLY_SOLVABLE:
        return "O";
    case NUMERICALLY_SOLVABLE:
        return "@";
    case UNSOLVABLE:
        return "X";
    }
    throw new IllegalArgumentException("Unsupported solvability type " + s);
}

    public void diagnostics_generateBLTTable_row(FVariable[] order, CodeStream out, DiagnosticsGenerator.TableManager tm, boolean inTearBlock, FAbstractEquation equation, Map<FVariable, Integer> varMap) {
}


}
