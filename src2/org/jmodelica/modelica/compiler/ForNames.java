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
 * @aspect FunctionScalarizationHelpers
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:747
 */
public class ForNames extends Object implements Iterable<String> {
    
        private ArrayList<String[]> names;

    
        private ArrayList<Integer> last;

    
        private int pos;

    
        
        /**
         * Standard constructor.
         */
        public ForNames() {
            names = new ArrayList<String[]>();
            last = new ArrayList<Integer>();
            last.add(0);
        }

    
        
        /**
         * Creates a new ForNames with a single layer with space for <code>n</code> names.
         */
        public ForNames(int n) {
            this();
            addLayer(n);
        }

    
        
        /**
         * Add a new layer of names, that can be filled with new names or names 
         *        from the layer underneath.
         * 
         * @param n  the number of names in the new layer
         */
        public void addLayer(int n) {
            names.add(new String[n]);
            pos = 0;
            last.add(last());
        }

    
        
        /**
         * Fills all empty spots in the top layer with newly created names.
         */
        public void fillLayer(FlatLookupNode context) {
            String[] top = topLayer();
            for (int i = pos; i < top.length; i++) 
                create(context);
        }

    
        
        /**
         * Removes the top layer, exposing the layer underneath.
         */
        public void removeLayer() {
            names.remove(names.size() - 1);
            last.remove(last.size() - 1);
        }

    

        private String[] topLayer() {
            return names.get(names.size() - 1);
        }

    
        
        public boolean hasNames() {
            return names.size() > 0 && topLayer().length > 0;
        }

    
        
        /**
         * Gets name with index <code>i</code> in the top layer.
         */
        public String get(int i) {
            return topLayer()[i];
        }

    
        
        /**
         * Adds a name to the top layer.
         */
        public void add(String name) {
            topLayer()[pos++] = name;
        }

    
        
        /**
         * Creates a new name and adds it to the top layer.
         * 
         * @return the created name
         */
        public String create(FlatLookupNode context) {
            String name;
            int l = last();
            do {
                name = "i" + (++l);
            } while (!context.lookupFV(new FQNameString(name)).isUnknown()); 
            add(name);
            last.set(last.size()-1, l);
            return name;
        }

    
        
        private int last() {
            return last.get(last.size()-1);
        }

    
        
        /**
         * Adds a name from the underlying layer to the top layer.
         * 
         * @param i  the index in the underlying layer
         */
        public void promote(int i) {
            add(names.get(names.size() - 2)[i]);
        }

    
        
        /**
         * Checks if there are enough layers to promote a name.
         */
        public boolean canPromote() {
            return names.size() > 1;
        }

    
        
        /**
         * Return the number of names in the top layer.
         */
        public int size() {
            return topLayer().length;
        }

    
        
        /**
         * Iterates over the top layer.
         */
        public Iterator<String> iterator() {
            return Arrays.asList(topLayer()).iterator();
        }

    
        
        /**
         * Pushes a copy of the top layer with first and second names switched
         */
        public void createTransposedLayer() {
            String[] lay = topLayer();
            addLayer(lay.length);
            for (int i = 0; i < lay.length; i++) {
                promote(i);
            }
            topLayer()[0] = lay[1];
            topLayer()[1] = lay[0];
            
        }

    
        
        /**
         * Creates nestled for loops using the top layer of names.
         *  
         * Adds the outermost for loop to a list of statements.
         * 
         * @param stmts  list to add the created for statements to
         * @param sizes  array of expressions describing the size of each dimension
         * @return  the list of statements of the innermost loop
         */
        public List<FStatement> createForLoops(List<FStatement> stmts, FExp[] sizes, int startDim) {
            List<FStatement> cur = stmts;
            for (int i = 0; i < sizes.length; i++) {
                FForIndex ffi = new FForIndex(topLayer()[startDim + i], sizes[i]);
                FForStmt fs = new FForStmt(ffi, new List());
                cur.add(fs);
                cur = fs.getForStmts();
            }
            return cur;
        }

    
        
        /**
         * Creates nestled for loops over a single variable, using the top layer of names.
         *  
         * Adds the outermost for loop to a list of statements.
         * 
         * @param stmts  list to add the created for statements to
         * @param var    name of the variable to loop over
         * @return  the list of statements of the innermost loop
         */
        public List<FStatement> createForLoops(List<FStatement> stmts, FQName var) {
            int n = topLayer().length;
            FExp[] sizes = new FExp[n];
            for (int i = 0; i < n; i++)
                sizes[i] = new FSizeExp(var, i);
            return createForLoops(stmts, sizes, 0);
        }

    
        
        /**
         * Creates nestled (maximum d) for loops  over an expression, 
         * using the top layer of names.
         *  
         * Adds the outermost for loop to a list of statements.
         * 
         * @param stmts  list to add the created for statements to
         * @param exp    expression to loop over
         * @param d      dimensions to loop over
         * @return  the list of statements of the innermost loop
         */
        public List<FStatement> createForLoops(List<FStatement> stmts, FExp exp, int d) {
            return createForLoops(stmts, exp, 0, d);
        }

    
        
        /**
         * Creates nestled (from d1 to d2) for loops over an expression, 
         * using the top layer of names.
         *  
         * Adds the outermost for loop to a list of statements.
         * 
         * @param stmts  list to add the created for statements to
         * @param exp    expression to loop over
         * @param d1     dimensions to start in
         * @param d2     dimensions to end in
         * @return  the list of statements of the innermost loop
         */
        public List<FStatement> createForLoops(List<FStatement> stmts, FExp exp, int d1, int d2) {
            FExp[] sizes = new FExp[d2 - d1];
            for (int i = d1; i < d2; i++)
                sizes[i-d1] = exp.size().createFExp(i);
            return createForLoops(stmts, sizes, d1);
        }

    
        
        /**
         * Creates nestled for loops over an expression, using the top layer of names.
         *  
         * Adds the outermost for loop to a list of statements.
         * 
         * @param stmts  list to add the created for statements to
         * @param exp    expression to loop over
         * @return  the list of statements of the innermost loop
         */
        public List<FStatement> createForLoops(List<FStatement> stmts, FExp exp) {
            return createForLoops(stmts, exp, exp.ndims());
        }

    
        
        public void createForLoops(List clauses, List inner, FExp exp) {
            List<FStatement> fsl = createForLoops(clauses, exp);
            fsl.addAll(inner);
        }

    
        
        /**
         * Creates a new FArraySubscripts with uses of the <code>d1</code> to <code>d2</code> names
         * in the top layer as subscripts. When out of names, adds 1s.
         */
        public FArraySubscripts createFArraySubscripts(int d1, int d2) {
            if (d1 < 0)
                throw new UnsupportedOperationException();
            FArraySubscripts fas = new FArraySubscripts();
            for (int i = d1; i < d2; ++i) {
                if (i < topLayer().length)
                    fas.addFSubscript(new FIdTempExp(new FIdUse(topLayer()[i])));
                else
                    fas.addFSubscript(new FIntegerLitExp(1));
            }
            return fas;
        }

    
        
        /**
         * Creates a new FArraySubscripts with uses of the <code>d</code> 
         * first names in the top layer as subscripts. When out of names, adds 1s.
         */
        public FArraySubscripts createFArraySubscripts(int d) {
            return createFArraySubscripts(0, d);
        }

    
        
        /**
         * Creates a new FArraySubscripts with uses of all the names in the top layer.
         */
        public FArraySubscripts createFArraySubscripts() {
            return createFArraySubscripts(topLayer().length);
        }

    
        
        /**
         * Creates a new FArraySubscripts with uses of the names in the top layer as subscripts.
         * 
         * @param name  the name of the expression to have subscripts.
         * @param d1    the first subscript integer to use.
         * @param d2    the first subscript integer not to use after d1.
         * @return  the expression using subscripts in top layer [d1, d2).
         */
        public FIdUseExp createUseWithSubscripts(String name, int d1, int d2) {
            FQName fqn;
            if (hasNames() && (d2 - d1) > 0)
                fqn = new FQNameFull(name, createFArraySubscripts(d1, d2));
            else
                fqn = new FQNameFull(name);
            return new FIdTempExp(new FIdUse(fqn));
        }

    
        
        /**
         * Creates a new FIdUseExp with the first </code>d</code> names in the top layer.
         */
        public FIdUseExp createUseWithSubscripts(String name, int d) {
            return createUseWithSubscripts(name, 0, d < topLayer().length ? d : topLayer().length);
        }

    
        
        /**
         * Creates a new FIdUseExp with all of the names in the top layer.
         */
        public FIdUseExp createUseWithSubscripts(String name) {
            return createUseWithSubscripts(name, topLayer().length);
        }

    
        
        public FExp[] createFExpArray() {
            if (!hasNames())
                return new FExp[0];
            FExp[] subs = new FExp[topLayer().length];
            int i = 0;
            for (String s : topLayer()) {
                subs[i++] = new FIdUseExp(s);
            }
            return subs;
        }

    
        
        /**
         * Creates a new ForNames with the top layer copied
         */
        public ForNames copySurface() {
            ForNames fn = new ForNames();
            if (names.size() > 0) {
                fn.addLayer(topLayer().length);
                for (String s : topLayer())
                    fn.add(s);
            }
            fn.last.add(last());
            return fn;
        }


}
