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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:1757
 */
public class TornEquationBlock extends EquationBlock {
    

        public TornEquationBlock(EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) {
            super(producer, blockDependency);
        }

    @Override
    protected void prettyPrintTypeStr(CodeStream str) {
        str.print("Torn");
    }

    @Override
    protected void prettyPrintNumVarStr(CodeStream str) {
        str.print(localUnsolvedVariables().size() + " iteration variables and " + (realVariables().size() - localUnsolvedVariables().size()) + " solved variables");
    }

    @Override
    protected void prettyPrintBeforeVariablesStr(Printer p, CodeStream str, String indent) {
        String innerIndent = p.indent(indent);
        str.formatln("%sTorn variables:", indent);
        for (AbstractEquationBlock aeb : solvedRealBlocks())
            aeb.prettyPrintActiveVariables(p, str, innerIndent, false, true);
        str.println();
    }

    @Override
    protected void prettyPrintUnsolvedVariablesStr(Printer p, CodeStream str, String indent) {
        str.formatln("%sIteration variables:", indent);
    }

    @Override
    protected void prettyPrintBeforeEquationsStr(Printer p, CodeStream str, String indent) {
        String innerIndent = p.indent(indent);
        str.formatln("%sTorn equations:", indent);
        for (AbstractEquationBlock aeb : solvedRealBlocks()) {
            if (!aeb.isMeta()) {
                aeb.prettyPrintSub(p, str, innerIndent);
            }
        }
        str.println();
    }

    @Override
    protected void prettyPrintUnsolvedEquationsStr(Printer p, CodeStream str, String indent) {
        if (isMixed())
            str.formatln("%sContinuous residual equations:", indent);
        else
            str.formatln("%sResidual equations:", indent);
    }

    @Override
    protected void printIterationVariables(CodeStream str) {
        for (FVariable var : localUnsolvedVariables())
            str.println(var.displayName());
    }

    @Override
    protected void printTearingPairs(CodeStream str) {
        int counter = 0;
        str.println("In block #" + getLabel());
        for (SimpleEquationBlock block : unsolvedBlocks()) {
            for (FVariable var : block.allLocalVariables()) {
                str.print(" (");
                str.print(block.producer().symbol());
                str.print(") " + (counter++) + " " + var.displayName() + " (");
                var.printFAttributes(str, FAttribute.MIN, FAttribute.MAX, FAttribute.START, FAttribute.NOMINAL);
                str.println(")");
                str.print("   (");
                str.print(block.producer().symbol());
                str.print(") " + block.equation().toString()); 
                str.println();
            }
            str.println();
        }
        str.println();
        for (AbstractEquationBlock subBlock : solvedBlocks())
            subBlock.printTearingPairs(str);
    }

    @Override
    public void genBlockResidualFunctionBeforeEqns_CAD(String indent, CodeStream str, boolean inInitial, Set<FAbstractEquation> visited) {
        for (AbstractEquationBlock aeb : solvedBlocks())
            aeb.genBlockResidualFunctionBeforeSubEqns_CAD(indent, str, inInitial, visited);
    }

    @Override
    public void genBlockResidualFunctionEqns_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited) {
        for (SimpleEquationBlock block : unsolvedBlocks())
            block.genBlockResidualFunctionEqns_CAD(enumerator, indent, str, visited);
    }

    @Override
    protected void genVarDecls_CAD(CodeStream str, String indent, Set<ASTNode> visited) {
        if (visited == null)
            visited = new HashSet<ASTNode>();
        for (AbstractEquationBlock aeb : solvedBlocks())
            aeb.genVarDecls_CAD(str, indent, visited);
        for (AbstractEquationBlock aeb : unsolvedBlocks())
            aeb.genVarDecls_CAD(str, indent, visited);
    }

    @Override
    public Set<ASTNode> blockResidualNodes_C() {
        Set<ASTNode> res = super.blockResidualNodes_C();
        res.addAll(localSolvedEquations());
        return res;
    }

    @Override
    public void genBlockResidualFunction_jacobian_C(CodePrinter p, CodeStream str, String indent) {
        if (!isLinear())
            return;
        int n1 = localSolvedRealBlocks().size() - localMetaBlocks().size();
        int n2 = unsolvedBlocks().size();
        if (n1 == 0) {
            /* This block should not be a torn block. #4691. */
            super.genBlockResidualFunction_jacobian_C(p, str, indent);
            return;
        }
        indent = p.indent(indent);
        String innerIndent = p.indent(indent);
        FExp[][] jacobian = jacobian();
        str.format("%sjmi_real_t* Q1 = calloc(%d, sizeof(jmi_real_t));\n", indent, n1 * n2);
        str.format("%sjmi_real_t* Q2 = calloc(%d, sizeof(jmi_real_t));\n", indent, n2 * n1);
        str.format("%sjmi_real_t* Q3 = residual;\n", indent);
        str.format("%sint i;\n", indent);
        str.format("%schar trans = 'N';\n", indent);
        str.format("%sdouble alpha = -1;\n", indent);
        str.format("%sdouble beta = 1;\n", indent);
        str.format("%sint n1 = %d;\n", indent, n1);
        str.format("%sint n2 = %d;\n", indent, n2);
        
        // Write top-right quadrant, A12, to Q1.
        for (int col = n1; col < n1 + n2; col++) {
            for (int row = 0; row < n1; row++) {
                if (jacobian[row][col] != null) {
                    p.printPreSteps(jacobian[row][col], str, indent);
                    str.format("%sQ1[%d] = ", indent, n1 * (col - n1) + row);
                    p.print(jacobian[row][col], str, indent);
                    str.format(";\n");
                    p.printPostSteps(jacobian[row][col], str, indent);
                }
            }
        }
        // Compute L^-1 * A12 by doing Q1 = L^-1 * Q1
        str.format("%sfor (i = 0; i < %d; i += %d) {\n", indent, n1 * n2, n1);
        for (int row = 0; row < n1; row++) {
            for (int col = 0; col <= row; col++) {
                if (jacobian[row][col] != null) {
                    p.printPreSteps(jacobian[row][col], str, innerIndent);
                }
            }
            str.format("%sQ1[i + %d] = (Q1[i + %d]", innerIndent, row, row);
            for (int col = 0; col < row; col++) {
                if (jacobian[row][col] != null) {
                    str.format(" - (");
                    p.print(jacobian[row][col], str, indent);
                    str.format(") * Q1[i + %d]", col);
                }
            }
            str.format(") / (");
            p.print(jacobian[row][row], str, indent);
            str.format(");\n");
            for (int col = 0; col <= row; col++) {
                if (jacobian[row][col] != null) {
                    p.printPostSteps(jacobian[row][col], str, innerIndent);
                }
            }
        }
        str.format("%s}\n", indent);
        // Write bottom-left quadrant, A21, to Q2.
        for (int col = 0; col < n1; col++) {
            for (int row = n1; row < n1 + n2; row++) {
                if (jacobian[row][col] != null) {
                	p.printPreSteps(jacobian[row][col], str, indent);
                    str.format("%sQ2[%d] = ", indent, n2 * col + (row - n1));
                    p.print(jacobian[row][col], str, indent);
                    str.format(";\n");
                    p.printPostSteps(jacobian[row][col], str, indent);
                }
            }
        }
        
        // Write bottom-right quadrant, A22, to Q3.
        str.format("%smemset(Q3, 0, %d * sizeof(jmi_real_t));\n", indent, n2 * n2);
        for (int col = n1; col < n1 + n2; col++) {
            for (int row = n1; row < n1 + n2; row++) {
                if (jacobian[row][col] != null) {
                	p.printPreSteps(jacobian[row][col], str, indent);
                    str.format("%sQ3[%d] = ", indent, n2 * (col - n1) + (row - n1));
                    p.print(jacobian[row][col], str, indent);
                    str.format(";\n");
                    p.printPostSteps(jacobian[row][col], str, indent);
                }
            }
        }
        
        // Compute block jacobian into Q3
        str.format("%sdgemm_(&trans, &trans, &n2, &n2, &n1, &alpha, Q2, &n2, Q1, &n1, &beta, Q3, &n2);\n", indent);
        
        str.format("%sfree(Q1);\n", indent);
        str.format("%sfree(Q2);\n", indent);
    }

    protected String diagnostics_generateBLTTable_color() {
    return "#F0CCCC";
}

    public void diagnostics_generateBLTTable_rows(FVariable[] order, CodeStream out, DiagnosticsGenerator.TableManager tm, boolean inTearBlock, int size, Map<FVariable, Integer> varFilter) {
    int numSolved = realVariables().size() - localUnsolvedVariables().size();
    int solvedStart = tm.getYPos() * DIAGNOSTICS_CELL_SIZE;
    int solvedSize = numSolved * DIAGNOSTICS_CELL_SIZE + 1;
    int unsolvedStart = (tm.getYPos() + numSolved) * DIAGNOSTICS_CELL_SIZE;
    int unsolvedSize = localUnsolvedVariables().size() * DIAGNOSTICS_CELL_SIZE + 1;
    int numNonReal = localNonRealVariables().size();
    if (inTearBlock)
        out.formatln("    <div class=\"block\" style=\"background:#F0C7C7;left:%dpx;top:%dpx;width:%dpx;height:%dpx;\"></div>", solvedStart, solvedStart, solvedSize + unsolvedSize - 1, solvedSize + unsolvedSize - 1);
    out.formatln("    <div class=\"block\" style=\"background:#F0E4E4;left:%dpx;top:%dpx;width:%dpx;height:%dpx;\"></div>", solvedStart, solvedStart, solvedSize, solvedSize);
    out.formatln("    <div class=\"block\" style=\"background:#F0C0C0;left:%dpx;top:%dpx;width:%dpx;height:%dpx;\"></div>", unsolvedStart, unsolvedStart, unsolvedSize, unsolvedSize);
    java.util.List<AbstractEquationBlock> blocks = new ArrayList<AbstractEquationBlock>();
    blocks.addAll(solvedRealBlocks());
    blocks.addAll(unsolvedBlocks());
    blocks.addAll(localNonRealBlocks());
    for (AbstractEquationBlock seb : blocks) {
        seb.diagnostics_generateBLTTable_rows(order, out, tm, true, size, varFilter);
    }
}


}
