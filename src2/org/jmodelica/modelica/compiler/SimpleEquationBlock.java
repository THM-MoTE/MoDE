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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:2021
 */
public abstract class SimpleEquationBlock extends AbstractEquationBlock {
    
        private FAbstractEquation equation;

    

        public SimpleEquationBlock(EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency, FAbstractEquation equation) {
            super(producer, blockDependency);
            this.equation = equation;
        }

    

        public FAbstractEquation equation() {
            return equation;
        }

    

        public boolean isReal() {
            for (FVariable fv : allVariables())
                if (!fv.isReal())
                    return false;
            return true;
        }

    
        
        public boolean isDiscreteReal() {
            for (FVariable fv : allVariables())
                if (!fv.isReal() || !fv.isDiscrete())
                    return false;
            return true;
        }

    

        @Override
        public Collection<FAbstractEquation> allEquations() {
            return allLocalEquations();
        }

    

        @Override
        public Collection<FAbstractEquation> allLocalEquations() {
            return Arrays.asList(equation());
        }

    

        @Override
        public Collection<FAbstractEquation> realEquations() {
            return localRealEquations();
        }

    

        @Override
        public Collection<SimpleEquationBlock> localRealBlocks() {
            if (isReal()) {
                return Collections.singletonList(this);
            } else {
                return Collections.emptyList();
            }
        }

    

        @Override
        public Collection<FAbstractEquation> localRealEquations() {
            if (isReal())
                return allLocalEquations();
            else
                return Collections.emptyList();
        }

    

        @Override
        public Collection<FAbstractEquation> nonRealEquations() {
            return localNonRealEquations();
        }

    

        @Override
        public Collection<FAbstractEquation> localNonRealEquations() {
            if (isReal())
                return Collections.emptyList();
            else
                return allLocalEquations();
        }

    

        @Override
        public Collection<FAbstractEquation> unsolvedEquations() {
            return localUnsolvedEquations();
        }

    

        @Override
        public Collection<FAbstractEquation> localUnsolvedEquations() {
            if (isSolvable())
                return Collections.emptyList();
            else
                return allLocalEquations();
        }

    

        @Override
        public Collection<FVariable> allVariables() {
            return allLocalVariables();
        }

    

        @Override
        public abstract Collection<FVariable> allLocalVariables();

    

        @Override
        public Collection<FVariable> realVariables() {
            return localRealVariables();
        }

    

        @Override
        public Collection<FVariable> localRealVariables() {
            if (isReal())
                return allLocalVariables();
            else
                return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> nonRealVariables() {
            return localNonRealVariables();
        }

    

        @Override
        public Collection<FVariable> localDiscreteRealVariables() {
            if (!isDiscreteReal())
                return Collections.emptyList();
            else
                return allLocalVariables();
        }

    
        
        @Override
        public Collection<FVariable> localNonRealVariables() {
            if (isReal())
                return Collections.emptyList();
            else
                return allLocalVariables();
        }

    

        @Override
        public Collection<FVariable> localSolvedRealVariables() {
            if (isReal() && isSolvable())
                return allLocalVariables();
            else
                return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> unsolvedVariables() {
            return localUnsolvedVariables();
        }

    

        @Override
        public Collection<FVariable> localUnsolvedVariables() {
            if (isSolvable())
                return Collections.emptyList();
            else
                return allLocalVariables();
        }

    

        public Collection<Integer> assignedIndices() {
            return null;
        }

    

        public boolean canComputeJacobian() {
            return true;
        }

    

        @Override
        public void errorCheck(FClass fclass) {}

    

        protected boolean needLabel(boolean inSubBlock) {
            return needSequenceNumber(inSubBlock);
        }

    

        protected boolean needSequenceNumber(boolean inSubBlock) {
            return !inSubBlock && !isSolvable();
        }

    
        
        @Override
        public boolean isSimple() {
            return true;
        }

    

        @Override
        public SimpleEquationBlock asSimple() {
            return this;
        }

    @Override
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        String innerIndent = p.indent(indent);
        if (getLabel() == null)
            str.formatln("%s--- %s ---", indent, prettyPrintTitle());
        else
            str.formatln("%s--- %s (Block %s) ---", indent, prettyPrintTitle(), getLabel());
        p.print(equation(), str, indent);
        str.println();
        if (allLocalVariables().size() == 0)
            return;
        if (isSolvable())
            prettyPrintActiveVariables(p, str, innerIndent + "Assigned variables: ", innerIndent + "                    ", false);
        else
            prettyPrintActiveVariables(p, str, innerIndent + "Computed variables: ", innerIndent + "                    ", false);
    }

    @Override
    public void prettyPrintSub(Printer p, CodeStream str, String indent) {
        String innerIndent = p.indent(indent);
        p.print(equation(), str, indent);
        str.println();
        if (allLocalVariables().size() == 0)
            return;
        if (isSolvable())
            prettyPrintActiveVariables(p, str, innerIndent + "Assigned variables: ", innerIndent + "                    ", false);
        else
            prettyPrintActiveVariables(p, str, innerIndent + "Iteration variables: ", innerIndent + "                     ", false);
    }

    public abstract String prettyPrintTitle();

    @Override
    public void prettyPrintActiveVariables(Printer p, CodeStream str, String indent, boolean printAttributes, boolean printLabel) {
        prettyPrintActiveVariables(p, str, indent, indent, printAttributes, printLabel ? getLabel() : null);
    }

    public void prettyPrintActiveVariables(Printer p, CodeStream str, String indent, boolean printAttributes, String label) {
        prettyPrintActiveVariables(p, str, indent, indent, printAttributes, label);
    }

    public void prettyPrintActiveVariables(Printer p, CodeStream str, String firstIndent, String otherIndent, boolean printAttributes) {
        prettyPrintActiveVariables(p, str, firstIndent, otherIndent, printAttributes, null);
    }

    public void prettyPrintActiveVariables(Printer p, CodeStream str, String firstIndent, String otherIndent, boolean printAttributes, String label) {
        boolean first = true;
        for (FVariable fv : allLocalVariables()) {
            str.print(first ? firstIndent : otherIndent);
            if (label != null)
                str.format("(%s) ", label);
            str.print(fv.displayName());
            first = false;
            if (printAttributes) {
                str.print(" (");
                fv.printFAttributes(str, FAttribute.MIN, FAttribute.MAX, FAttribute.START, FAttribute.NOMINAL);
                str.print(")");
            }
            str.println();
        }
    }

    @Override
    public void genBlock_CAD(int i, boolean inInitial, String indent, CodeStream str){
        if (getSequenceNumber() >= 0) {
            String var = inInitial ? "dae_init_block_residuals" : "dae_block_residuals";
            str.format("%sjmi_ode_unsolved_block_dir_der(jmi, jmi->%s[%d]);\n", indent, var, getSequenceNumber());
        } else if (genBlockEnabled()) {
            equation().genBlock_CAD(indent, str, null, allLocalVariables(), assignedIndices());
        } else {
            throw new UnsupportedOperationException("Unable to produce solving code for block of type " + getClass().getSimpleName() + " in residual function");
        }
    }

    @Override
    public void genBlockResidualFunctionBeforeEqns_CAD(String indent, CodeStream str, boolean inInitial, Set<FAbstractEquation> visited) {
        if (genBlockEnabled())
            equation().genBlock_CAD(indent, str, visited, allLocalVariables(), assignedIndices());
    }

    @Override
    public void genBlockResidualFunctionEqns_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited) {
        equation().genResidual_CAD(enumerator, indent, str, visited, assignedIndices() == null ? null : new LinkedHashSet<Integer>(assignedIndices()));
    }

    @Override
    public void genBlockResidualFunction_residualEqns_C(CodePrinter p, CodeStream str, String indent,
            Enumerator enumerator, Set<FAbstractEquation> visited, Map<FVariable,String> solverArrayMap) {
        genBlockResidualFunction_residualEqn_C(p, str, indent, enumerator, visited, solverArrayMap);
    }

    public void genBlockResidualFunction_residualEqn_C(CodePrinter p, CodeStream str, String indent,
            Enumerator enumerator, Set<FAbstractEquation> visited, Map<FVariable,String> solverArrayMap) {
        equation().genResidual_C(p, str, indent, enumerator, visited, assignedIndices() == null ? null : new LinkedHashSet<Integer>(assignedIndices()));
    }

    @Override
    public void genBlockResidualFunction_solvedEqn_C(CodePrinter p, CodeStream str,
            String indent, boolean inInitial, Set<FAbstractEquation> visited) {
        if (getSequenceNumber() >= 0) {
            String var = inInitial ? "dae_init_block_residuals" : "dae_block_residuals";
            str.format("%sef |= jmi_solve_block_residual(jmi->%s[%d]);\n", indent, var, getSequenceNumber());
        } else if (genBlockEnabled()) {
            Collection<FVariable> forVariables = allLocalVariables();
            Collection<Integer> forIndices = assignedIndices();
            if (!isReal()) {
                if (equation().isMixed()) {
                    equation().genBlockEval_C(p, str, indent, visited, forVariables, forIndices);
                }
                if (equation().shouldProduceNonRealGuard_C(forVariables)) {
                    str.format("%sif (evaluation_mode & JMI_BLOCK_EVALUATE_NON_REALS) {\n", indent);
                    equation().genBlock_C(p, str, p.indent(indent), visited, forVariables, forIndices);
                    str.format("%s}\n", indent);
                } else {
                    equation().genBlock_C(p, str, indent, visited, forVariables, forIndices);
                }
            } else {
                equation().genBlock_C(p, str, indent, visited, forVariables, forIndices);
            }
        } else {
            throw new UnsupportedOperationException("Unable to produce solving code for block of type " + getClass().getSimpleName() + " in residual function");
        }
    }

    @Override
    public boolean hasEquationNominal_C(boolean auto) { 
        return realVariables().size() > 0 && equation().equationNominal_C(auto) != null;
    }

    @Override
    public void genEquationNominalVarDecl_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap) {
        FExp nom = equation().equationNominal_C(auto);
        nominalMap.put(equation(), nom);
        if (nom == null) {
            return;
        }
        p.printVarDecls(nom, str, indent);
    }

    @Override
    public void genEquationNominal_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap) {
        genEquationNominal_C(p, str, indent, auto, nominalMap, new Enumerator());
    }

    public void genEquationNominal_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap, Enumerator e) {
        FExp nom = nominalMap.get(equation());
        if (nom == null) {
            return;
        }
        for (int i = 0; i < realVariables().size(); i++) {
            int num = e.next();
            if (i == 0) {
                p.printPreSteps(nom, str, indent);
                str.format("%s(*res)[%d] = ", indent, num);
                p.print(nom, str, indent);
                p.printPostSteps(nom, str, indent);
                str.print(";\n");
            } else {
                str.format("%s(*res)[%d] = (*res)[%d];\n", indent, num, num - 1);
            }
        }
    }

    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, boolean inInitial) {
        if (getSequenceNumber() >= 0) {
            genBlockBase_C(p, str, indent, inInitial);
        } else if (genBlockEnabled()) {
            equation().genBlock_C(p, str, indent, new HashSet<FAbstractEquation>(), allLocalVariables(), assignedIndices());
            for (FVariable var : allLocalVariables()) {
                if (!inInitial && var.isDiscrete() && !var.isPreVariable()) {
                    str.formatln("%s%s = %s;", indent, var.myPreVariable().name_C(), var.name_C());
                }
            }
        } else {
            throw new UnsupportedOperationException("Unable to produce solving code for block of type " + getClass().getSimpleName());
        }
    }

    public boolean genBlockEnabled()             { return false; }

    protected String diagnostics_generateBLTTable_color() {
    return "#CCF0CC";
}


}
