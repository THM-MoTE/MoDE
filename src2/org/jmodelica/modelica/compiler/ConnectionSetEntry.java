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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:828
 */
public class ConnectionSetEntry extends Object implements Comparable<ConnectionSetEntry> {
    

        private InstComponentDecl cd;

    
        private boolean outside;

    
        private FQName fqName;

    
        private String prefix;

    
        private String str;

    
        private String[] scalarNames;

    

        public static ConnectionSetEntry create(InstComponentDecl cd, boolean outside, FQName fqName) {
            if (cd.isFlow()) 
                return new FlowConnectionSetEntry(cd, outside, fqName);
            if (cd.isStream()) 
                return new StreamConnectionSetEntry(cd, outside, fqName);
            return new ConnectionSetEntry(cd, outside, fqName);
        }

    

        private ConnectionSetEntry(InstComponentDecl cd, boolean outside, FQName fqName) {
            //log.debug("Created ConnectionSetEntry: " + cd.name());
            this.cd = cd;
            this.outside = outside;
            this.fqName = fqName;
            prefix = null;
        }

    

        public void disconnectFromInstanceTree() {
            cd = null;
        }

    

        public boolean isOutside() {
            return outside;
        }

    

        public boolean isInside() {
            return !outside;
        }

    

        public InstComponentDecl getVar() {
            return cd;
        }

    

        public boolean isFlow() {
            return false;
        }

    

        public boolean isStream() {
            return false;
        }

    

        public String name() {
           return fqName.name();
        }

    
        
        public String[] names() {
            if (scalarNames != null)
                return scalarNames;
            else
                return new String[] {name()};
        }

    

        public String prefix() {
            if (prefix == null) 
                prefix = fqName.copyPrefix().name();
            return prefix;
        }

    

        public boolean equals(String name, boolean outside) {
            if (outside != this.outside)
                return false;
            if (scalarNames != null) {
                for (String scalarName : scalarNames)
                    if (name.equals(scalarName))
                        return true;
                return false;
            } else {
                return name.equals(name());
            }
        }

    

        public String toString() {
            if (str == null)
                str = fqName + (outside ? " (o)" : " (i)");
            return str;
        }

    

        public FQName getFQName() {
            return fqName;
        }

    

        public FExp createFIdUseExp() {
            return fqName.createFIdUseExp();
        }

    

        /**
         * Create an FIdUseExp that is an access to a variable in this entry, that is connected to 
         * the variable named <code>name</code> in <code>other</code>.
         */
        public FExp createFIdUseExp(String name, ConnectionSetEntry other) {
            if (other == this)
                return new FIdUseExp(name); 
            if (scalarNames == null || other.scalarNames == null)
                return createFIdUseExp();
            int i;
            for (i = 0; i < other.scalarNames.length && !other.scalarNames[i].equals(name); i++);
            return (i < scalarNames.length) ? new FIdUseExp(scalarNames[i]) : createFIdUseExp();
        }

    

        /**
         * Create an access to the var of this entry and add or subtract it to/from e.
         * 
         * Used to build up flow equations.
         */
        public FExp buildFlow(FExp e) {
            return createFIdUseExp().appendSum(e, outside, cd.type());
        }

    

        public int hashCode() {
            return toString().hashCode();
        }

    

        /**
         * Create a new connection set entry referring to a specific cell of the variable this refers to.
         * 
         * Assumes that the variable is an array and that <code>i</code> is suitable.
         */
        public ConnectionSetEntry specifyCell(Index i) {
            return ConnectionSetEntry.create(cd.findCell(i, 0), outside, fqName.copyAndAddFas(i.createFArraySubscripts()));
        }

    

        /**
         * If this entry points to an outer component (or a member of one), redirect it to point to the 
         * corresponding inner component. 
         * 
         * This should only be done once, or "inner outer" declarations will not be handled correctly.
         */
        public void redirectInner() {
            if (cd.inOrIsInner()) {
                fqName = cd.getFQName().copyPrefix().asFQNameFull().append(fqName.copyLastSuffix());
            }
        }

    

        public boolean equals(Object o) {
            return o instanceof ConnectionSetEntry && toString().equals(o.toString());
        }

    
    
        public int compareTo(ConnectionSetEntry cse) {
            return toString().compareTo(cse.toString());
        }

    

        /**
         * Create an access expression to the associated flow variable.
         * 
         * Only valid for stream connection entries.
         */
        public FExp createFlowFIdUseExp() {
            throw new UnsupportedOperationException("Only supported for stream connection sets");
        }

    

        /**
         * Get the epsilon to use when calculating flows, based on the associated flow variable's nominal value.
         * 
         * Only valid for stream connection entries.
         */
         public double flowEps() {
             throw new UnsupportedOperationException("Only supported for stream connection sets");
        }

    

         /**
          * Check if this entry should contribute when calculating streams.
          * 
          * Only valid for stream connection entries.
          */
          public boolean contributesToStream() {
              throw new UnsupportedOperationException("Only supported for stream connection sets");
        }

    


        private static class FlowConnectionSetEntry extends ConnectionSetEntry {

            public FlowConnectionSetEntry(InstComponentDecl cd, boolean outside, FQName fqName) {
                super(cd, outside, fqName);
            }

            public boolean isFlow() {
                return true;
            }

        }

    

        private static class StreamConnectionSetEntry extends ConnectionSetEntry {

            private FExp flowExp;
            private double eps = 1e-8;
            private boolean contribute = true;

            public StreamConnectionSetEntry(InstComponentDecl cd, boolean outside, FQName fqName) {
                super(cd, outside, fqName);
                InstComponentDecl flow = cd.myFlowVar();
                flowExp = new FIdUseExp(flow.flattenedAccess());
                try {
                    eps *= Math.abs(flow.nominalAttributeCValue().realValue());
                } catch (ConstantEvaluationException e) {}
                try {
                    contribute = isOutside() ? 
                            (flow.maxAttributeCValue().realValue() > 0) : 
                            (flow.minAttributeCValue().realValue() < 0);
                } catch (ConstantEvaluationException e) {}
            }

            public boolean isStream() {
                return true;
            }

            public FExp createFlowFIdUseExp() {
                return flowExp.fullCopy();
            }

            public double flowEps() {
                return eps;
            }

            public boolean contributesToStream() {
                return contribute;
            }

        }

    public void scalarize() {
		if (fqName.accessNdims() == 0) {
			// Can't use FQName.scalarize(), since it relies on rewrites
			fqName = new FQNameString(fqName.scalarName());
		} else {
			Indices ind = Indices.createFromFas(fqName.getFArraySubscripts());
			scalarNames = new String[ind.numElements()];
			int j = 0;
			for (Index i : ind)
				scalarNames[j++] = fqName.copyAndAddFas(i.createFArraySubscripts()).scalarName();
		}
	}


}
