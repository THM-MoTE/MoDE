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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:612
 */
public class StructuredBLT extends BLT {
    
		private ArrayList<AbstractEquationBlock> topEquationBlocks = new ArrayList<AbstractEquationBlock>();

    
		private ArrayList<AbstractEquationBlock> allBlocks = new ArrayList<AbstractEquationBlock>();

    
		private ArrayList<AbstractEquationBlock> odeBlocks = new ArrayList<AbstractEquationBlock>();

    
		private ArrayList<AbstractEquationBlock> realOutputBlocks = new ArrayList<AbstractEquationBlock>();

    
		private ArrayList<AbstractEquationBlock> integerBooleanOutputBlocks = new ArrayList<AbstractEquationBlock>();

    
		private ArrayList<AbstractEquationBlock> otherBlocks = new ArrayList<AbstractEquationBlock>();

    
		
		protected StructuredBLT() {
		}

    
		
        public StructuredBLT(FClass fclass, BLT blt) {
            blt.computeDependencies();
            
            for (AbstractEquationBlock eb : blt) {
                add(eb);
                if (eb.immediatePredecessors().size() == 0)
                    topEquationBlocks.add(eb);
            }
            
            Set<AbstractEquationBlock> visitedMap = new HashSet<AbstractEquationBlock>();
            
            // Loop over all derivatives
            for (FVariable fv : fclass.derivativeVariables()) {
                // Get the block where the variable is solved for
                AbstractEquationBlock eb = fv.myDAEEquationBlock();
                if (!visitedMap.contains(eb)) {
                    visitedMap.add(eb);
                    for (AbstractEquationBlock ebb : eb.allPredecessors()) {
                        if (!visitedMap.contains(ebb)) {
                            visitedMap.add(ebb);
                            odeBlocks.add(ebb);
                        }
                    }
                    odeBlocks.add(eb);
                }
            }
            
            // Loop over all real outputs
            for (FVariable fv : fclass.realOutputs()) {
                // Get the block where the variable is solved for
                AbstractEquationBlock eb = fv.myDAEEquationBlock();
                //States and inputs can be outputs in which case they don't have equation blocks associated with them
                if (eb != null && !visitedMap.contains(eb)) {
                    visitedMap.add(eb);
                    for (AbstractEquationBlock ebb : eb.allPredecessors()) {
                        if (!visitedMap.contains(ebb)) {
                            visitedMap.add(ebb);
                            realOutputBlocks.add(ebb);
                        }
                    }
                    realOutputBlocks.add(eb);
                }
            }
            
            // Loop over integer and boolean outputs
            for (FVariable fv : fclass.outputs()) {
                // Get the block where the variable is solved for
                AbstractEquationBlock eb = fv.myDAEEquationBlock();
                if (eb != null && !visitedMap.contains(eb)) {
                    visitedMap.add(eb);
                    for (AbstractEquationBlock ebb : eb.allPredecessors()) {
                        if (!visitedMap.contains(ebb)) {
                            visitedMap.add(ebb);
                            integerBooleanOutputBlocks.add(ebb);
                        }
                    }
                    integerBooleanOutputBlocks.add(eb);
                }
            }
            
            // Loop over all others
            for (FVariable fv : fclass.variables()) {
                // Get the block where the variable is solved for
                AbstractEquationBlock eb = fv.myDAEEquationBlock();
                if (eb != null && !visitedMap.contains(eb)) {
                    visitedMap.add(eb);
                    for (AbstractEquationBlock ebb : eb.allPredecessors()) {
                        if (!visitedMap.contains(ebb)) {
                            visitedMap.add(ebb);
                            otherBlocks.add(ebb);
                        }
                    }
                    otherBlocks.add(eb);
                }
            }
            // Add any blocks not visited (generally meta blocks)
            for (AbstractEquationBlock eb : this) {
                if (!visitedMap.contains(eb)) {
                    visitedMap.add(eb);
                    otherBlocks.add(eb);
                }
            }
            
            allBlocks.addAll(odeBlocks);
            allBlocks.addAll(realOutputBlocks);
            allBlocks.addAll(integerBooleanOutputBlocks);
            allBlocks.addAll(otherBlocks);
            
        }

    

	    public ArrayList<AbstractEquationBlock> getAllBlocks() {
			return allBlocks;
		}

    

	    public ArrayList<AbstractEquationBlock> getOdeBlocks() {
			return odeBlocks;
		}

    

	    public ArrayList<AbstractEquationBlock> getRealOutputBlocks() {
			return realOutputBlocks;
		}

    

	    public ArrayList<AbstractEquationBlock> getIntegerBooleanOutputBlocks() {
			return integerBooleanOutputBlocks;
		}

    

	    public ArrayList<AbstractEquationBlock> getOtherBlocks() {
			return otherBlocks;
		}

    @Override
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.formatln("%s***********************************", indent);
        str.formatln("%s*********** ODE section ***********", indent);
        str.formatln("%s***********************************", indent);
        // Loop over all derivatives
        for (AbstractEquationBlock eb : getOdeBlocks()) {
            str.println();
            eb.prettyPrint(p, str, indent);
        }
        str.println();
        str.formatln("%s***********************************", indent);
        str.formatln("%s*********** Real outputs **********", indent);
        str.formatln("%s***********************************", indent);
        for (AbstractEquationBlock eb : getRealOutputBlocks()) {
            str.println();
            eb.prettyPrint(p, str, indent);
        }
        str.println();
        str.formatln("%s***********************************", indent);
        str.formatln("%s*** Integer and boolean outputs ***", indent);
        str.formatln("%s***********************************", indent);
        for (AbstractEquationBlock eb : getIntegerBooleanOutputBlocks()) {
            str.println();
            eb.prettyPrint(p, str, indent);
        }
        str.println();
        str.formatln("%s***********************************", indent);
        str.formatln("%s********* Other variables *********", indent);
        str.formatln("%s***********************************", indent);
        for (AbstractEquationBlock eb : getOtherBlocks()) {
            str.println();
            eb.prettyPrint(p, str, indent);
        }
        str.println();
        str.formatln("%s***********************************", indent);
    }

    @Override
    public void genOdeDerivativeBlocks_CAD(CodeStream str) {
        int block_counter = 0;
        String indent = ASTNode.printer_CAD.indent("");
        str.format("%s/*********** ODE section ***********/\n", indent);
        // Loop over all derivatives
        for (AbstractEquationBlock eb : getOdeBlocks()) {
            eb.genBlock_CAD(block_counter, false, indent, str);
            block_counter += eb.isSolvable() ? 0: 1;
        }
        str.format("%s/*********** Real outputs **********/\n", indent);
        for (AbstractEquationBlock eb : getRealOutputBlocks()) {
            eb.genBlock_CAD(block_counter, false, indent, str);
            block_counter += eb.isSolvable() ? 0: 1;
        }
        str.format("%s/*** Integer and boolean outputs ***/\n", indent);
        for (AbstractEquationBlock eb : getIntegerBooleanOutputBlocks()) {
            eb.genBlock_CAD(block_counter, false, indent, str);
            block_counter += eb.isSolvable() ? 0: 1;
        }
        str.format("%s/********* Other variables *********/\n", indent);
        for (AbstractEquationBlock eb : getOtherBlocks()) {
            eb.genBlock_CAD(block_counter, false, indent, str);
            block_counter += eb.isSolvable() ? 0: 1;
        }
    }

    @Override
	public void genOdeDerivativeBlocks(CodePrinter p, CodeStream str, String indent) {
        str.formatln("%s/********* Initialize reinits *******/", indent);
        for (AbstractEquationBlock eb : getAllBlocks()) {
            eb.genReinitTempInits_C(p, str, indent);
        }
		str.formatln("%s/************* ODE section *********/", indent);
		// Loop over all derivatives
		for (AbstractEquationBlock eb : getOdeBlocks()) {
			eb.genBlock_C(p, str, indent, false);
		}
		str.formatln("%s/************ Real outputs *********/", indent);
		for (AbstractEquationBlock eb : getRealOutputBlocks()) {
			eb.genBlock_C(p, str, indent, false);
		}
		str.formatln("%s/****Integer and boolean outputs ***/", indent);
		for (AbstractEquationBlock eb : getIntegerBooleanOutputBlocks()) {
			eb.genBlock_C(p, str, indent, false);
		}
		str.formatln("%s/**** Other variables ***/", indent);
		for (AbstractEquationBlock eb : getOtherBlocks()) {
			eb.genBlock_C(p, str, indent, false);
		}
        str.formatln("%s/********* Write back reinits *******/", indent);
        for (AbstractEquationBlock eb : getAllBlocks()) {
            eb.genReinitWritebacks_C(p, indent, str);
        }
	}


}
