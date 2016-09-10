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
 * @aspect ExternalProcessCommunication
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:604
 */
public class ProcessCommunicator extends Object {
    
        private BufferedReader in;

    
        private BufferedWriter out;

    
        private Process process;

    
        private Timer timer;

    
        private TimerTask task;

    
        String buffLine = null;

    
        
        public ProcessCommunicator(Process proc) {
            process = proc;
            in  = new BufferedReader(new InputStreamReader(process.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            timer = new Timer();
        }

    
        
        private String getLine() throws IOException {
            String line = buffLine;
            if (line == null)
                line = in.readLine();
            if (line == null)
                throw new IOException("Process halted unexpectedly");
            buffLine = null;
            return line;
        }

    
        
        private void buffLine(String line) {
            buffLine = line;
        }

    
        
        /**
         * Print <code>val</code>, serialized, to the process 
         */
        public void put(CValue val, FType type) throws IOException {
//            ModelicaCompiler.log.debug("ProcessCommunicator WRITE: " + val.toString() + " of type: "+type.toString());
            val.serialize(out);
            out.flush();
        }

    
        
        /**
         * Read <code>type</code>, serialized, from the process 
         */
        public CValue get(FType type) throws IOException {
            CValue val = type.deserialize(this);
//            ModelicaCompiler.log.debug("ProcessCommunicator READ: " + val.toString());
            return val;
        }

    
        
        /**
         * Read a line. Check equals to <code>s</code>.
         */
        public void accept(String s) throws IOException {
            log();
            abort();
            String line = getLine();
            if (!line.equals(s)) {
                throw new IOException(String.format("Communication protocol error. Expected '%s', received '%s'", s, line));
            }
        }

    
        
        public void check(String s) throws IOException {
            out.write(s);
            out.write("\n");
            out.flush();
        }

    
        
        private void log() throws IOException {
            String line = getLine();
            while (line.equals("LOG")) {
                double warning = deserializeReal();
                String name    = deserializeString();
                String format  = deserializeString();
                String value   = deserializeString();
                if (warning != 0)
                    ModelicaCompiler.log.warning("%s: " + format, name, value);
                else
                    ModelicaCompiler.log.verbose("%s: " + format, name, value);
                line = getLine();
            }
            buffLine(line);
        }

    
        
        private void abort() throws IOException, ConstantEvaluationException {
            String line = getLine();
            if (line.equals("ABORT")) {
                throw new AbortConstantEvaluationException("Evaluation aborted by request of external function");
            }
            buffLine(line);
        }

    
        
        class AbortConstantEvaluationException extends ConstantEvaluationException {
            public AbortConstantEvaluationException(String string) {
                super(null, string);
            }
        }

    
        
        /**
         * Wait for and retrieve exit value from process.
         */
        public int end() {
            int res;
            try {
                process.waitFor();
                res = process.exitValue();
            } catch (InterruptedException e) {
                res = -99;
            } catch (IllegalThreadStateException e) {
                res = -100;
            }
            return res;
        }

    
        
        /**
         * Tear down everything
         */
        public void destroy() {
            /* Kill timer */
            timer.cancel();
            timer.purge();
            timer = null;
            
            /* Close streams */
            try {
                in.close();
            } catch (IOException e) {
            }
            in = null;
            try {
                out.close();
            } catch (IOException e) {
            }
            out = null;
            
            /* Destroy process */
            process.destroy();
            process = null;
        }

    
        
        public double deserializeReal() throws IOException {
            String line = getLine();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                throw new IOException("Communication protocol error. Failed to parse real number '" + line + "'");
            }
        }

    
        
        public String deserializeString() throws IOException {
            String line = getLine();
            int len;
            try {
                len = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                throw new IOException("Communication protocol error. Failed to parse size of string '" + line + "'");
            }
            char[] c = new char[len];
            in.read(c,0,len);
            in.readLine();
            return new String(c);
        }

    
        
        public void startTimer(int timeout) {
            if (timeout >= 0) {
                if (task != null) {
                    //XXX: Throw exception instead?
                    task.cancel();
                    timer.purge();
                }
                task = new TimerTask() {
                    @Override
                    public void run() {
                        process.destroy();
                        cancel();
                    }
                };
                timer.schedule(task, timeout);
            }
        }

    
        
        public void cancelTimer() {
            if (task != null) {
                task.cancel();
            }
            task = null;
            timer.purge();
        }


}
