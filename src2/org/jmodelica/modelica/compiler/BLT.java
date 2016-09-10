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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:538
 */
public class BLT extends ArrayList<AbstractEquationBlock> {
    
        
        public static final StructuredBLT EMPTY_BLT = new StructuredBLT();

    
        private boolean dependenciesComputed = false;

    
        
        private int numLabledBlocks = 0;

    
		
        private Enumerator indexEnumerator;

    

		public ArrayList<Integer> unsolvedBlockSizes() {
			ArrayList<Integer> blockSizes = new ArrayList<Integer>();
			for (AbstractEquationBlock b : this) {
				if (!b.isSolvable()) {
					blockSizes.add(new Integer(b.allVariables().size()));
				}		
			}
			return blockSizes;
		}

    

		public ArrayList<Integer> unsolvedBlockIterationSizes() {
			ArrayList<Integer> blockSizes = new ArrayList<Integer>();
			for (AbstractEquationBlock b : this) {
				if (!b.isSolvable()) {
					blockSizes.add(new Integer(b.unsolvedVariables().size()));
				}
			}
			return blockSizes;
		}

    

        public void setLabels() {
            Enumerator nestedEnum = new Enumerator(1);
            Enumerator seqEnum = new Enumerator(0);
            setLabels(null, nestedEnum, seqEnum);
            numLabledBlocks = seqEnum.peek();
        }

    
        
        protected void setLabels(String prefix, Enumerator nestedEnum, Enumerator seqEnum) {
            for (AbstractEquationBlock eb : this)
                eb.setLabel(prefix, false, nestedEnum, seqEnum);
        }

    
        
        public int getNumLabledBlocks() {
            return numLabledBlocks;
        }

    

        public void complianceCheck(ErrorCheckType checkType, OptionRegistry options) {
        }

    

        public void errorCheck(FClass fclass) {
            for (AbstractEquationBlock block : this)
                block.errorCheck(fclass);
        }

    

        public void computeDependencies() {
            if (dependenciesComputed)
                return;
            dependenciesComputed = true;
            Map<FVariable, AbstractEquationBlock> blockMap = new HashMap<FVariable, AbstractEquationBlock>();
            for (AbstractEquationBlock block : this)
                block.computeDependencies(blockMap);

            for (AbstractEquationBlock block : this) {
                for (AbstractEquationBlock preBlock : block.immediatePredecessors()) {
                    BlockDependency blockDependency = preBlock.getBlockDependency();
                    
                    if (!blockDependency.immediateSuccessors().contains(block)) {
                        blockDependency.immediateSuccessors().add(block);
                    }
                }
            }
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

    public void prettyPrint(Printer p, CodeStream str, String indent) {
        boolean first = true;
        for (AbstractEquationBlock eb : this) {
            if (!first)
                str.println();
            first = false;
            eb.prettyPrint(p, str, indent);
        }
        if (!first)
            str.formatln("%s-------------------------------", indent);
    }

    public void writeIterationVariablesToFile(File file) throws FileNotFoundException {
        CodeStream out = new CodeStream(file);
        for (AbstractEquationBlock block : this)
            block.printIterationVariables(out);
        out.close();
    }

    public void writeTearingPairsToFile(File file) throws FileNotFoundException {
        CodeStream out = new CodeStream(file);
        for (AbstractEquationBlock block : this)
            block.printTearingPairs(out);
        out.close();
    }

    public void genSolvedVarDecls_CAD(CodeStream str, String indent) {
        int i = 0;
        for (AbstractEquationBlock eb : getAllBlocks()){
            if(eb.isSolvable()){
                eb.genVarDecls_CAD(str, indent, null);
            }
        }
    }

    public void genOdeDerivativeBlocks_CAD(CodeStream str) {
        int block_counter = 0;
        for (AbstractEquationBlock block : this) {
            block.genBlock_CAD(block_counter, false, ASTNode.printer_CAD.indent(""), str);
            if (!block.isSolvable()) {
                block_counter++;
            }
        }
    }

    public void genOdeDerivativeBlocks(CodePrinter p, CodeStream str, String indent) {
		for (AbstractEquationBlock block : this) {
			block.genBlock_C(p, str, indent, false); 
		}
	}

    public java.util.List<AbstractEquationBlock> getAllBlocks() {
		return this;
	}

    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
		for (AbstractEquationBlock eb : getAllBlocks()) {
            eb.genVarDecls_C(p, str, indent);
		}
	}

    public void diagnostics_generateBLTTable(CodeStream out, boolean isInit) {
    Deque<FVariable> orderList = new ArrayDeque<FVariable>();
    for (AbstractEquationBlock aeb : this) {
        orderList.addAll(aeb.allVariables());
    }
    FVariable[] order = orderList.toArray(new FVariable[orderList.size()]);

    DiagnosticsGenerator.TableManager tm = new DiagnosticsGenerator.TableManager(isInit ? "block_init_" : "block_");

    out.formatln("<div class=\"blt\" style=\"width:%dpx;height:%dpx;\">", order.length * AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + 1, order.length * AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + 1);
    for (int i = 0; i < order.length; i++) {
        FVariable fv = order[i];
        out.formatln("    <div class=\"variable\" style=\"left:%dpx\" title=\"%s\">%s</div>", (i - 6) * AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE - 2, ASTNode.escapeHTML(fv.name()), ASTNode.escapeHTML(fv.name()));
    }

    for (AbstractEquationBlock aeb : this) {
        aeb.diagnostics_generateBLTTable_block(order, out, tm);
    }

    out.println("</div>");
}


}
