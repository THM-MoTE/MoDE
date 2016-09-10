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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:1802
 */
public abstract class AbstractSubBLTBlock<T extends BLT> extends AbstractEquationBlock {
    
        private final T[] subBLTs;

    
        
        public AbstractSubBLTBlock(EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency, T[] subBLTs) {
            super(producer, blockDependency);
            this.subBLTs = subBLTs;
            
        }

    
        @Override
        public Collection<FAbstractEquation> realEquations() {
            Set<FAbstractEquation> res = new LinkedHashSet<FAbstractEquation>();
            for (T blt : subBLTs)
                for (AbstractEquationBlock block : blt)
                    res.addAll(block.realEquations());
            return res;
        }

    

        @Override
        public Collection<FAbstractEquation> localRealEquations() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FAbstractEquation> nonRealEquations() {
            Set<FAbstractEquation> res = new LinkedHashSet<FAbstractEquation>();
            for (T blt : subBLTs)
                for (AbstractEquationBlock block : blt)
                    res.addAll(block.nonRealEquations());
            return res;
        }

    

        @Override
        public Collection<FAbstractEquation> localNonRealEquations() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FAbstractEquation> unsolvedEquations() {
            return Collections.emptyList();
       }

    

        @Override
        public Collection<FAbstractEquation> localUnsolvedEquations() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<SimpleEquationBlock> localRealBlocks() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> realVariables() {
            Set<FVariable> res = new LinkedHashSet<FVariable>();
            for (T blt : subBLTs)
                for (AbstractEquationBlock block : blt)
                    res.addAll(block.realVariables());
            return res;
        }

    

        @Override
        public Collection<FVariable> localRealVariables() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> nonRealVariables() {
            Set<FVariable> res = new LinkedHashSet<FVariable>();
            for (T blt : subBLTs)
                for (AbstractEquationBlock block : blt)
                    res.addAll(block.nonRealVariables());
            return res;
        }

    

        @Override
        public Collection<FVariable> localDiscreteRealVariables() {
            return Collections.emptyList();
        }

    
        
        @Override
        public Collection<FVariable> localNonRealVariables() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> localSolvedRealVariables() {
            return Collections.emptyList();
        }

    
        
        @Override
        public Collection<FVariable> unsolvedVariables() {
            return Collections.emptyList();
        }

    

        @Override
        public Collection<FVariable> localUnsolvedVariables() {
            return Collections.emptyList();
        }

    

        @Override
        public boolean isSolvable() {
            return false;
        }

    

        @Override
        public boolean canComputeJacobian() {
            return false;
        }

    

        @Override
        protected boolean needLabel(boolean inSubBlock) {
            return true;
        }

    

        @Override
        protected boolean needSequenceNumber(boolean inSubBlock) {
            return false;
        }

    
        
        @Override
        protected void setLabel(String prefix, boolean inSubBlock, Enumerator nestedEnum, Enumerator seqEnum) {
            super.setLabel(prefix, false, nestedEnum, seqEnum);
            for (T blt : subBLTs)
                blt.setLabels(getLabel() + '(' + computeLabel(blt) + ')', new Enumerator(1), seqEnum);
        }

    

        protected abstract String computeLabel(T blt);

    

        @Override
        public void errorCheck(FClass fclass) {
            for (T blt : subBLTs)
                blt.errorCheck(fclass);
            
        }

    
        
        protected T[] subBLTs() {
            return subBLTs;
        }

    @Override
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.formatln("%s--- %s block ---", indent, blockTypeTitle());
        String innerIndent = p.indent(indent);
        for (T blt : subBLTs)
            blt.prettyPrint(p, str, innerIndent);
    }

    public abstract String blockTypeTitle();

    @Override
    public void prettyPrintSub(Printer p, CodeStream str, String indent) {
        prettyPrint(p, str, indent);
        str.println();
    }

    @Override
    public void prettyPrintActiveVariables(Printer p, CodeStream str, String indent, boolean printAttributes, boolean printLabel) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.prettyPrintActiveVariables() is not implemented!");
    }

    @Override
    public void genBlockResidualFunctionBeforeEqns_CAD(String indent, CodeStream str, boolean inInitial, Set<FAbstractEquation> visited) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genBlockResidualFunctionBeforeEqns_CAD() is not implemented!");
    }

    @Override
    public void genBlockResidualFunctionEqns_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genBlockResidualFunctionEqns_CAD() is not implemented!");
    }

    @Override
    public void genBlockResidualFunction_C(CodePrinter p, CodeStream str, String outerIndent, boolean inInitial) {
        for (T blt : subBLTs)
            for (AbstractEquationBlock block : blt)
                block.genBlockResidualFunction_C(p, str, outerIndent, inInitial);
    }

    @Override
    public void genBlockResidualFunction_residualEqns_C(CodePrinter p, CodeStream str, String indent,
            Enumerator enumerator, Set<FAbstractEquation> visited, Map<FVariable,String> solverArrayMap) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genBlockResidualFunction_residualEqns_C() is not implemented!");
    }

    @Override
    public void genBlockResidualFunction_solvedEqn_C(CodePrinter p,
            CodeStream str, String indent, boolean inInitial, Set<FAbstractEquation> visited) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genBlockResidualFunction_solvedEqn_C() is not implemented!");
    }

    @Override
    public boolean hasEquationNominal_C(boolean auto) { return true; }

    @Override
    public void genEquationNominalVarDecl_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genEquationNominalVarDecl_C() is not implemented!");
    }

    @Override
    public void genEquationNominal_C(CodePrinter p, CodeStream str, String indent,
            boolean auto, Map<FAbstractEquation,FExp> nominalMap) {
        throw new UnsupportedOperationException("AbstractSubBLTBlock.genEquationNominal_C() is not implemented!");
    }

    @Override
    public boolean hasResidualFunction_C() {
        return false;
    }

    @Override
    public void genBlockAddCall_C(CodePrinter p, CodeStream str, String indent, boolean dirDer, boolean inInit, String nleSolver, int parentBlockNumber) {
        for (T blt : subBLTs)
            for (AbstractEquationBlock block : blt)
                block.genBlockAddCall_C(p, str, indent, dirDer, inInit, nleSolver, parentBlockNumber);
    }

    protected String diagnostics_generateBLTTable_color() {
    return "#FF00FF";
}


}
