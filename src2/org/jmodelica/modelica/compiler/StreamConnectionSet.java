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
 * @aspect Connections
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:476
 */
public class StreamConnectionSet extends ConnectionSet {
    

        private double eps = Double.MAX_VALUE;

    

        public StreamConnectionSet(ConnectionSetEntry e) {
            super(e);
        }

    

        public String typeString() {
            return "stream";
        }

    

        public void generateEquations(List<FAbstractEquation> eqns) {
            for (ConnectionSetEntry e : this)
                eps = Math.min(e.flowEps(), eps);
            
            for (ConnectionSetEntry e : this) {
                if (e.isOutside()) {
                    FExp left = e.createFIdUseExp();
                    FExp right = expandInStreamExp(e, null, new FIntegerLitExp(0));
                    eqns.add(new FEquation(left, right));
                }
            }
        }

    

        /**
         * Create rewrite expression for an inStream() on a variable in this set.
         * 
         * @param name  the name of the variable to generate name for
         */
        public FExp expandInStreamExp(String name) {
            ConnectionSetEntry e = getConnectionSetEntry(name, false);
            FExp exp = expandInStreamExp(e, name, new FIdUseExp(name));
            exp.enableStreamsRewrite();
            return exp;
        }

    

        /**
         * Create an expression for the inStream() of the given entry.
         * 
         * Used for inStream() for inside entries and for additional equations for outside entries.
         * 
         * @param cse   the entry to generate the expression for
         * @param name  the name of the scalar var to generate the stream access for, 
         *              of null for the entire array (in scalar case they are equivalent)
         * @param def   expression to use when there are no contributing streams
         */
        private FExp expandInStreamExp(ConnectionSetEntry cse, String name, FExp def) {
            FExp stream = def;
            List<FExp> vars = new List<FExp>();
            for (ConnectionSetEntry e : this) {
                if (cse != e) {
                    stream = (name == null) ? e.createFIdUseExp() : e.createFIdUseExp(name, cse);
                    if (e.isOutside()) 
                        stream = new FInStream(stream);
                    vars.add(e.createFlowFIdUseExp());
                    vars.add(stream);
                    vars.add(FBooleanLitExp.create(e.isOutside()));
                }
            }
            
            if (vars.getNumChildNoTransform() < 6) {
                return stream;
            } else {
                return new FExInStream(def, new FRealLitExp(eps), vars);
            }

//            FExp stream = null;
//            FExp sum = null;
//            FExp div = null;
//            int numContributors = 0;
//            final boolean ignoreMinMax = size() == 2;
//            for (ConnectionSetEntry e : this) {
//                if (cse != e && (ignoreMinMax || e.contributesToStream())) {
//                    numContributors++;
//                    FExp flow = e.createFlowFIdUseExp();
//                    stream = (name == null) ? e.createFIdUseExp() : e.createFIdUseExp(name, cse);
//                    if (e.isOutside()) 
//                        stream = new FInStream(stream);
//                    else
//                        flow = new FNegExp(flow);
//                    FExp divP = new FMaxExp(flow, new Opt(new FRealLitExp(eps)));
//                    FExp sumP = new FMulExp(divP.fullCopy(), stream);
//                    if (sum == null) {
//                        sum = sumP;
//                        div = divP;
//                    } else {
//                        sum = new FAddExp(sum, sumP);
//                        div = new FAddExp(div, divP);
//                    }
//                }
//            }
//            
//            if (numContributors < 2) 
//                return stream;
//            else 
//                return new FDivExp(sum, div);
        }


}
