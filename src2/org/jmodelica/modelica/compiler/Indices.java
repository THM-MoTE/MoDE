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
 * @aspect ArrayHelpers
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:4058
 */
public class Indices extends Object implements Iterable<Index> {
    
		protected int ndims;

    
		protected Size size;

    
		
		/**
		 *  Used to represent the Indices of scalar expressions.
		 */
		public static final Indices SCALAR = new Indices(Size.SCALAR);

    
		
		/**
		 * A perfect hash for all Indices that have consecutive indicies, 
		 *        ndims <= 3 and size[i] <= 1023 for 0 <= i < ndims. -1 for other 
		 *        Indices.
		 */
		protected int hash;

    
		
		/**
		 * Create an Indices object based on array sizes. 
		 */
		public static Indices create(Size size) {
			if (size == Size.SCALAR)
				return SCALAR;
			else
				return new Indices(size);
		}

    
		
		/**
		 * Create an Indices object based on FArraySubcripts.
		 */
		public static Indices createFromFas(FArraySubscripts fas) {
			return NonConsecutiveIndices.createFromFas(fas);
		}

    
		
		/**
		 * Create an Indices object based on a list of FArraySubcripts.
		 */
		public static Indices createFromFas(java.util.List<FArraySubscripts> fasl) {
			return NonConsecutiveIndices.createFromFas(fasl);
		}

    
		
		/**
		 * Create an Indices object based on a list of int arrays.
		 */
		public static Indices create(ArrayList<int[]> ind) {
			return NonConsecutiveIndices.create(ind, true);
		}

    
		
		/**
		 * Create an Indices object based on a list of CommonForIndexes.
		 */
		public static Indices create(Iterable<? extends CommonForIndex> forIndices) {
			ArrayList<int[]> ind = new ArrayList<int[]>();
			for (CommonForIndex fi : forIndices) 
				ind.add(fi.myIndices());
			return NonConsecutiveIndices.create(ind, false);
		}

    
		
		/**
		 * Check that i is valid for this Indices object.
		 */
		public boolean isValid(Index i) {
			if (i.ndims() != ndims)
				return false;
			int[] index = i.index();
			for (int j = 0; j < ndims; j++)
				if (index[j] < 1 || index[j] > size.get(j))
					return false;
			return true;
		}

    
		
		/**
		 * Returns an Iterator, that iterates over all indices spanned by this Indices object.
		 */
		public Iterator<Index> iterator() {
			return new IIterator();
		}

    
		
		/**
		 * Returns the number of elements spanned by this Indices object.
		 */
		public int numElements() {
			return size.numElements();
		}

    
		
		/**
		 * Returns the number of dimensions spanned by this Indices object.
		 */
		public int ndims() {
			return ndims;
		}

    
		
		/**
		 * Returns the size of this Indices object in each dimension.
		 */
		public Size size() {
			return size;
		}

    
		
		/**
		 * Translates an Index to the corresponding Index in the underlying 
		 *        expression.
		 * 
		 * Default implementation always returns <code>i</code>.
		 */
		public Index translate(Index i) {
			return i;
		}

    
		
		/**
		 * Add values to an index map for a given index from this set and a given set of for indices.
		 * 
		 * Also sets the evaluation values of the index variables.
		 */
		public void fillIndexMap(Map<String,FExp> indexMap, Index i, Iterable<? extends CommonForIndex> forIndices) {
			int j = 0;
			int[] ii = translate(i).index();
			for (CommonForIndex fi : forIndices) {
				indexMap.put(fi.name(), new FIntegerLitExp(ii[j]));
				fi.setEvaluationValue(new CValueInteger(ii[j]));
				j++;
			}
		}

    
				
		
		/**
		 * Internal constructor to create an Indices object based on array sizes. 
		 */
		protected Indices(Size size) {
			ndims = size.ndims();
            this.size = size.evaluated();
			hash = -1;
			if (ndims < 4) {
				int h = 0;
				for (int i = 0; i < ndims; i++) {
					int s = size.get(i);
					if (s > 1023) 
						return;
					h = (h << 10) | s;
				}
				hash = h;
			}
		}

    
				
		/**
		 * Calculate the internal index in an Array that spans this Indices.
		 */
		protected int internal(Index i) {
			if (i.ndims() > ndims)
				throw new UnsupportedOperationException("Too many dimensions in Index.");
			int[] index = i.index();
			int res = 0;
			for (int j = 0; j < ndims; j++)
				res = res * size.get(j) + (j < index.length ? index[j] - 1 : 0);
			return res;
		}

    
		
		/**
		 * Iterates over all indices spanned by this Indices.
		 */
		protected class IIterator implements Iterator<Index> {
			
			protected IIndex index;
			protected int max;
			
			public IIterator() {
				index = new IIndex();
				max = numElements() - 1;
			}
			
			public boolean hasNext() {
				return index.internal < max;
			}
			
			public Index next() {
				if (index.internal >= max)
					throw new NoSuchElementException();
				index.internal++;
				if (ndims == 0)
					return index;
				int[] ind = index.index();
				int i;
				for (i = ndims - 1; i > 0 && ind[i] >= size.get(i); i--)
					ind[i] = 1;
				ind[i]++;
				return index;
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		}

    
		
		/**
		 * Internal implementation of Index.
		 */
		protected class IIndex extends Index {
			
			public int internal;
			
			/**
			 * Construct an Index over the number of dimensions of the enclosing Indices, 
			 *        pointing at the spot before the first cell.
			 */
			public IIndex() {
				super(ndims);
				internal = -1;
			}
			
			/**
			 * Return the internal index in an Array of the cell this Index refers to.
			 *        Only for use from Array.
			 * 
			 * @param ind  the indices to resolve the internal index with
			 */
			public int internal(Indices ind) {
				if (Indices.this == ind || (hash != -1 && hash == ind.hash)) 
					return internal;
				else
					return ind.internal(this);
			}
			
		}


}
