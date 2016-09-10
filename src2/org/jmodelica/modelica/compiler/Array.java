/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.11 */
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
 * Describes the set of scalarized FExp nodes corresponding to an array expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:833
 * @production Array : {@link BaseNode} ::= <span class="component">{@link FExp}*</span>;

 */
public class Array extends BaseNode implements Cloneable {
    /**
     * Expand for all values of for indices given in <code>indices</code>.
     * 
     * This is used to get the set of values for array indices while error checking 
     * and to expand summation reduction expressions.
     * 
     * Size of new Array will be (n + m), where n = indices.size() and m = ndims().  
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1127
     */
    public Array createExpanded(Iterable<? extends CommonForIndex> forIndices, boolean scalarize) {
		if (!forIndices.iterator().hasNext())
			return (Array) fullCopy();
		Indices newIndices = Indices.create(forIndices);
		Array arr = new Array(Indices.create(expandedSize(newIndices.size())));
		Map<String,FExp> indexMap = new HashMap<String,FExp>();
		for (Index i : newIndices) {
			newIndices.fillIndexMap(indexMap, i, forIndices);
			for (CommonForIndex fi : forIndices)
				indexMap.put(fi.uniqueIterExpName(), fi.evaluationValue().buildLiteral());
            fillSubset(arr, i, indexMap, scalarize);
		}
        for (CommonForIndex fi : forIndices)
            fi.clearEvaluationValue();
		return arr;
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1144
     */
    protected Size expandedSize(Size size) {
		return size().expand(size);
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1148
     */
    protected void fillSubset(Array arr, Index i, Map<String,FExp> indexMap, boolean scalarize) {
		for (Index i2 : indices()) {
            arr.set(i.expand(i2), createSubsetExp(get(i2), indexMap, scalarize));
		}
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1158
     */
    protected FExp createSubsetExp(FExp e, Map<String,FExp> indexMap, boolean scalarize) {
        FExp res;
        if (scalarize) {
            res = e.dynamicFExp(e.scalarize(indexMap));
            e.flushForScalarization(false);
        } else {
            res = e.dynamicFExp(e.fullCopy()).replaceIndices(indexMap);
        }
        return res;
    }
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3437
     */
    
		
		protected Indices indices;
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3438
     */
    
		protected int length;
    /**
     * Create an Array spanning a given Indices.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3443
     */
    
		
		/**
		 * Create an Array spanning a given Indices.
		 */
		public Array(Indices indices) {
			this.indices = indices;
			setChild(new List<FExp>(), 0);
			length = indices.numElements();
			if (length > 0)
				setFExp(null, length - 1);
		}
    /**
     * Creates an iterator that iterates over all FExp nodes in this Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3454
     */
    
		
		/**
		 * Creates an iterator that iterates over all FExp nodes in this Array.
		 */
		public Iterator<FExp> iteratorFExp() {
			return getFExps().iterator();
		}
    /**
     * Returns an Iterable<FExp> containing all expressions in Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3461
     */
    
		
		/**
		 * Returns an Iterable<FExp> containing all expressions in Array.
		 */
		public Iterable<FExp> iterable() {
			return getFExps();
		}
    /**
     * Creates a left-hand iterator for multiplication. 
     * 
     * Creates an iterator that iterates over all FExp nodes involved in 
     * calculating the cell i in a multiplication with this Array at the 
     * left side. 
     * 
     * If this Array is a vector, i is ignored and an iterator that iterates 
     * over all elements in the Array is returned. 
     * 
     * If this Array is a matrix, an iterator that iterates over the row 
     * specified by i is returned.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3478
     */
    
		
		/**
		 * Creates a left-hand iterator for multiplication. 
		 * 
		 * Creates an iterator that iterates over all FExp nodes involved in 
		 * calculating the cell i in a multiplication with this Array at the 
		 * left side. 
		 * 
		 * If this Array is a vector, i is ignored and an iterator that iterates 
		 * over all elements in the Array is returned. 
		 * 
		 * If this Array is a matrix, an iterator that iterates over the row 
		 * specified by i is returned.
		 */
		public Iterator<FExp> leftMulIterator(Index i) {
			if (ndims() < 2)
				return new AIterator();
			else
				return createMatrixRowIterator(i.first(), size().get(1));
		}
    /**
     * Creates a right-hand iterator for multiplication. 
     * 
     * Creates an iterator that iterates over all FExp nodes involved in 
     * calculating the cell i in a multiplication with this Array at the 
     * right side. 
     * 
     * If this Array is a vector, i is ignored and an iterator that iterates 
     * over all elements in the Array is returned. 
     * 
     * If this Array is a matrix, an iterator that iterates over the column 
     * specified by i is returned.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3498
     */
    
		
		/**
		 * Creates a right-hand iterator for multiplication. 
		 * 
		 * Creates an iterator that iterates over all FExp nodes involved in 
		 * calculating the cell i in a multiplication with this Array at the 
		 * right side. 
		 * 
		 * If this Array is a vector, i is ignored and an iterator that iterates 
		 * over all elements in the Array is returned. 
		 * 
		 * If this Array is a matrix, an iterator that iterates over the column 
		 * specified by i is returned.
		 */
		public Iterator<FExp> rightMulIterator(Index i) {
			if (ndims() < 2)
				return new AIterator();
			else
				return createMatrixColIterator(i.last(), size().get(1), size().get(0));
		}
    /**
     * Returns the element referenced by <code>i</code> in this Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3508
     */
    
		
		/**
		 * Returns the element referenced by <code>i</code> in this Array.
		 */
		public FExp get(Index i) {
			return getFExp(i.internal(indices));
		}
    /**
     * Returns element <code>i</code> in this Array.
     * 
     * For vectors, this is equivalent to <code>get(new Index(new int[]{i}))</code>.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3517
     */
    
		
		/**
		 * Returns element <code>i</code> in this Array.
		 * 
		 * For vectors, this is equivalent to <code>get(new Index(new int[]{i}))</code>.
		 */
		public FExp get(int i) {
			return getFExp(i - 1);
		}
    /**
     * Sets the element referenced by <code>i</code> in this Array to <code>exp</code>.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3524
     */
    
		
		/**
		 * Sets the element referenced by <code>i</code> in this Array to <code>exp</code>.
		 */
		public void set(Index i, FExp exp) {
			setFExp(exp.unboundCopy(), i.internal(indices));
		}
    /**
     * Returns the Indices associated with this Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3531
     */
    
		
		/**
		 * Returns the Indices associated with this Array.
		 */
		public Indices indices() {
			return indices;
		}
    /**
     * Set all expressions in Array to copies of <code>exp</code>.
     * 
     * If <code>exp</code> is an array, it is duplicated as many times as 
     * nessecary to fill this Array with scalar expressions.
     * 
     * @return <code>this</code> 
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3543
     */
    
		
		/**
		 * Set all expressions in Array to copies of <code>exp</code>.
		 * 
		 * If <code>exp</code> is an array, it is duplicated as many times as 
		 * nessecary to fill this Array with scalar expressions.
		 * 
		 * @return <code>this</code> 
		 */
		public Array fill(FExp exp) {
			if (exp.isArray()) {
				int n = exp.size().numElements();
				for (int i = 0; i < length; i++)
					setFExp(exp.getArray().getFExp(i % n).fullCopy(), i);
			} else {
				for (int i = 0; i < length; i++)
					setFExp(exp.fullCopy(), i);
			}
			return this;
		}
    /**
     * Returns the number of dimensions spanned by this Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3558
     */
    
		
		/**
		 * Returns the number of dimensions spanned by this Array.
		 */
		public int ndims() {
			return indices.ndims();
		}
    /**
     * Returns the size of this Array in each dimension.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3565
     */
    
		
		/**
		 * Returns the size of this Array in each dimension.
		 */
		public Size size() {
			return indices.size();
		}
    /**
     * Recursive method for building an FArray describing this Array.
     * For use by methods creating specific types of FArrays.
     * 
     * @param it       the iterator returned by a call to {@link #iteratorFExp()}
     * @param builder  helper object that processes each subexpression
     * @param dim      the dimension to start at, use 0 to process entire array
     * 
     * @see #buildLiteral(boolean)
     * @see #buildScalarized(Map,FExp)
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3580
     */
    
		
	    /**
	     * Recursive method for building an FArray describing this Array.
	     *        For use by methods creating specific types of FArrays.
	     *  
	     * @param it       the iterator returned by a call to {@link #iteratorFExp()}
	     * @param builder  helper object that processes each subexpression
	     * @param dim      the dimension to start at, use 0 to process entire array
	     * 
	     * @see #buildLiteral(boolean)
	     * @see #buildScalarized(Map,FExp)
	     */
        protected FExp buildFArray(Iterator<FExp> it, ElementBuilder builder, int dim) {
            return buildFArray(it, builder, dim, size(), null);
        }
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3584
     */
    
        
        protected FExp buildFArray(Iterator<FExp> it, ElementBuilder builder, int dim, Size size, boolean[] b) {
            FArray arr = new FArray(new List<FExp>());
            int n = size.get(dim);
            if (b != null) {
                if (dim >= b.length) {
                    return builder.build(it.next().unboundCopy());
                } else if (!b[dim]) {
                    return buildFArray(it, builder, dim + 1, size, b);
                }
            }
            if (dim < size.ndims() - 1) {
                for (int i = 0; i < n; i++)
                    arr.addFExp(buildFArray(it, builder, dim + 1, size, b));
            } else {
                for (int i = 0; i < n; i++) 
                    arr.addFExp(builder.build(it.next()).unboundCopy());
            }
            return arr;
        }
    /**
     * Build an FArray describing this Array.
     * For use by methods creating specific types of FArrays.
     * 
     * @param builder  helper object that processes each subexpression
     * 
     * @see #buildLiteral(boolean)
     * @see #buildScalarized(Map,FExp)
     * @see #buildFArray(Iterator,ElementBuilder,int)
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3614
     */
    
		
	    /**
	     * Build an FArray describing this Array.
	     *        For use by methods creating specific types of FArrays.
	     *  
	     * @param builder  helper object that processes each subexpression
	     * 
	     * @see #buildLiteral(boolean)
	     * @see #buildScalarized(Map,FExp)
	     * @see #buildFArray(Iterator,ElementBuilder,int)
	     */
	    protected FExp buildFArray(ElementBuilder builder) {
			Size s = size();
			if (s.isEmpty()) {
				List<FExp> dims = new List<FExp>();
				for (int i = 0, n = s.ndims(); i < n ; i++)
					dims.add(s.createFExp(i));
				return new FFillExp(dims, type().zeroLiteral());
			} else {
		    	return buildFArray(iteratorFExp(), builder, 0);
			}
	    }
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3626
     */
    
	    
        protected FExp buildFArray() {
            return buildFArray(new IdentityBuilder());
        }
    /**
     * Create an FExp describing the part of this array indicated by <code>i</code>.
     * 
     * If <code>i</code> has fewer dimensions than this, an FArray is created.
     * Otherwise a copy of a specific cell is returned. 
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3636
     */
    
	    
	    /**
	     * Create an FExp describing the part of this array indicated by <code>i</code>.
	     * 
	     * If <code>i</code> has fewer dimensions than this, an FArray is created.
	     * Otherwise a copy of a specific cell is returned. 
	     */
	    public FExp subArrayFExp(Index i) {
	    	if (i.ndims() >= ndims())
	    		return get(i).fullCopy();
	    	
	    	Index j = i.promote(ndims());
	    	int start = j.internal(indices);
	    	Iterator<FExp> it = new AIterator(start, 1, length - start);
	    	return buildFArray(it, new IdentityBuilder(), ndims() - i.ndims());
	    }
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3646
     */
    
	    
        public FExp subArrayFExp(Index i, NonConsecutiveIndices indices) {
            if (i.ndims() >= ndims())
                return get(indices.translate(i)).fullCopy();
            
            boolean[] b = new boolean[ndims()];
            indices = indices.locked(i, b);
            Iterator<FExp> it = new IndexIterator(indices);
            return buildFArray(it, new IdentityBuilder(), 0, indices.size(), b);
        }
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3656
     */
    
        
        public class IndexIterator implements Iterator<FExp> {
            
            
            private Iterator<Index> it;
            private Indices indices;
            
            public IndexIterator(Indices indices) {
                this.indices = indices;
                this.it = indices.iterator();
            }
            
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public FExp next() {
                return get(indices.translate(it.next()));
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }
    /**
     * Create an iterator that iterates over a row. Assumes the Array is a matrix.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3686
     */
    
		
		/**
		 * Create an iterator that iterates over a row. Assumes the Array is a matrix.
		 */
		private AIterator createMatrixRowIterator(int row, int width) {
			return new AIterator((row - 1) * width, 1, width);
		}
    /**
     * Create an iterator that iterates over a column. Assumes the Array is a matrix.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3693
     */
    
		
		/**
		 * Create an iterator that iterates over a column. Assumes the Array is a matrix.
		 */
		private AIterator createMatrixColIterator(int col, int width, int height) {
			return new AIterator(col - 1, width, height);
		}
    /**
     * Discribes the helper object for {@link #buildFArray(Iterator,ElementBuilder,int)}. 
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3701
     */
    

		
	    /**
	     * Discribes the helper object for {@link #buildFArray(Iterator,ElementBuilder,int)}. 
	     */
	    protected interface ElementBuilder {
	    	public FExp build(FExp e);
	    }
    /**
     * Builder for buildFArray(), that returns a straight copy of the FExp.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3708
     */
    
	    
	    /**
	     * Builder for buildFArray(), that returns a straight copy of the FExp.
	     */
	    public class IdentityBuilder implements ElementBuilder {
	    	public FExp build(FExp exp) {
	    		return exp.fullCopy();
	    	}
	    }
    /**
     * Iterates over FExp nodes in this Array.
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:3718
     */
    
		
	    
		/**
		 * Iterates over FExp nodes in this Array.
		 */
		private class AIterator implements Iterator<FExp> {
			
			private int i = 0;
			private int s;
			private int l;
			private int n;
			
			/**
			 * Create an iterator that iterates over all elements in the Array. 
			 */
			public AIterator() {
				s = 0;
				l = 1;
				n = length;
			}
			
			/**
			 * Create an iterator that iterates over a consecutive strech of the elements 
			 * in the Array. 
			 */
			public AIterator(int start, int step, int number) {
				s = start;
				l = step;
				n = number;
			}
			
			public boolean hasNext() {
				return i < n;
			}
			
			public FExp next() {
				if (i >= n)
					throw new NoSuchElementException();
				return getFExp(s + l * i++);
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		}
    /** 
     * \build Creates an FExp with literals from this Array.
     * 
     * Creates a (possibly nested) FArray containing FLitExp nodes.
     * 
     * @param toReal  if <code>true</code>, convert all values to real.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1972
     */
    public FExp buildLiteral(boolean toReal) {
    	return buildFArray(new LiteralBuilder(toReal));
    }
    /**
     * Helper object for {@link #buildLiteral(boolean)}.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1980
     */
    
        /**
         * Helper object for {@link #buildLiteral(boolean)}.
         */
        protected static class LiteralBuilder implements ElementBuilder {
            private boolean toReal;
            
            public LiteralBuilder(boolean toReal) {
                this.toReal = toReal;
            }
            
            public FExp build(FExp e) {
                return toReal ? e.ceval().convertReal().buildLiteral() : e.ceval().buildLiteral();
            }
        }
    /**
     * Create an FArray containing flattened subexpressions.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2444
     */
    public FExp buildFlattened(FQName prefix, FExp context) {
        return buildFArray(new FlattenedBuilder(prefix, context));
    }
    /**
     * Helper object for {@link #buildFlattened(FQName, FExp)}.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2452
     */
    
        /**
         * Helper object for {@link #buildFlattened(FQName, FExp)}.
         */
        protected static class FlattenedBuilder implements ElementBuilder {
            private FQName prefix;
            private FExp context;
            
            public FlattenedBuilder(FQName prefix, FExp context) {
                this.prefix = prefix;
                this.context = context;
            }
            
            public FExp build(FExp e) {
                return context.dynamicFExp(e).flatten(prefix);
            }
        }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1664
     */
    

        public FExp buildWithReplacedReferences(AbstractFunctionInliner fi, FExp context) {
            return buildFArray(new ReplaceReferenceBuilder(fi, context));
        }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1668
     */
    

        protected class ReplaceReferenceBuilder implements ElementBuilder {
            private AbstractFunctionInliner fi;
            private FExp context;

            public ReplaceReferenceBuilder(AbstractFunctionInliner fi, FExp context) {
                this.fi = fi;
                this.context = context;
            }

            public FExp build(FExp e) {
                return context.dynamicFExp(e).replaceReferences(fi);
            }
        }
    /**
     * Build an FArray containing the differentiated elements of this array 
     * (by calling {@link FExp#diff(String)} on each one).
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:783
     */
    public FExp buildDiff(final String name) {
        return buildFArray(new ElementBuilder() {
            public FExp build(FExp exp) {
                return exp.diff(name);
            }
        });
    }
    /**
     * @declaredat ASTNode:1
     */
    public Array() {
        super();
    }
    /**
     * Initializes the child array to the correct size.
     * Initializes List and Opt nta children.
     * @apilevel internal
     * @ast method
     * @declaredat ASTNode:10
     */
    public void init$Children() {
        children = new ASTNode[1];
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public Array(List<FExp> p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:20
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:26
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:44
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public Array clone() throws CloneNotSupportedException {
        Array node = (Array) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public Array copy() {
        try {
            Array node = (Array) clone();
            node.parent = null;
            if(children != null) {
                node.children = (ASTNode[]) children.clone();
            }
            return node;
        } catch (CloneNotSupportedException e) {
            throw new Error("Error: clone not supported for " + getClass().getName());
        }
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:76
     */
    public Array fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:85
     */
    public Array treeCopyNoTransform() {
        Array tree = (Array) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                ASTNode child = (ASTNode) children[i];
                if(child != null) {
                    child = child.treeCopyNoTransform();
                    tree.setChild(child, i);
                }
            }
        }
        return tree;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:105
     */
    public Array treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:112
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FExp list.
     * @param list The new list node to be used as the FExp list.
     * @apilevel high-level
     */
    public void setFExpList(List<FExp> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FExp list.
     * @return Number of children in the FExp list.
     * @apilevel high-level
     */
    public int getNumFExp() {
        return getFExpList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FExp list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FExp list.
     * @apilevel low-level
     */
    public int getNumFExpNoTransform() {
        return getFExpListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FExp list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FExp list.
     * @apilevel high-level
     */
    public FExp getFExp(int i) {
        return (FExp) getFExpList().getChild(i);
    }
    /**
     * Check whether the FExp list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFExp() {
        return getFExpList().getNumChild() != 0;
    }
    /**
     * Append an element to the FExp list.
     * @param node The element to append to the FExp list.
     * @apilevel high-level
     */
    public void addFExp(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getFExpListNoTransform() : getFExpList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFExpNoTransform(FExp node) {
        List<FExp> list = getFExpListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FExp list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFExp(FExp node, int i) {
        List<FExp> list = getFExpList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FExp list.
     * @return The node representing the FExp list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FExp")
    public List<FExp> getFExpList() {
        List<FExp> list = (List<FExp>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FExp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FExp list.
     * @apilevel low-level
     */
    public List<FExp> getFExpListNoTransform() {
        return (List<FExp>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FExp list.
     * @return The node representing the FExp list.
     * @apilevel high-level
     */
    public List<FExp> getFExps() {
        return getFExpList();
    }
    /**
     * Retrieves the FExp list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FExp list.
     * @apilevel low-level
     */
    public List<FExp> getFExpsNoTransform() {
        return getFExpListNoTransform();
    }
    /**
     * The type of the expression this Array belongs to.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2364
     */
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        FType type_value = getParent().Define_type(this, null);

        return type_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2346
     * @apilevel internal
     */
    public boolean Define_inArray(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2355
     * @apilevel internal
     */
    public FType Define_inferredType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return type().scalarType();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
