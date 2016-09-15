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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2374
 */
public class Size extends Object {
    
		
		/**
		 * Used for unknown lengths.
		 */
		public static final int UNKNOWN = -1;

    
		
		/**
		 * Used to represent the size of scalar expressions.
		 */
		public static final Size SCALAR = new Size();

    
		
		protected int[] size;

    
		
		/**
		 * Private constructor that creates a scalar size.
		 */
		private Size() {
			size = new int[0];
		}

    
		
		/**
		 * Constructs a Size with the given lengths.
		 */
		public Size(int... size) {
			if (size.length == 0)
				throw new IllegalArgumentException();
			this.size = size;
		}

    
		
		/**
		 * Get the number of dimensions.
		 */
		public int ndims() {
			return size.length;
		}

    
		
		/**
		 * Get length in the <code>i</code>th dimension.
		 */
		public int get(int i) {
			return has(i) ? size[i] : UNKNOWN;
		}

    
		
		/**
		 * Get length in the last dimension.
		 */
		public int last() {
			return get(size.length - 1);
		}

    
		
		/**
		 * Check if this size has an <code>i</code>th dimension.
		 */
		public boolean has(int i) {
			return i >= 0 && i < size.length;
		}

    
		
		/**
		 * Returns the number of elements spanned by this Size.
		 * 
		 * Only valid if all dimensions are known or currently evaluable.
		 */
		public int numElements() {
			int res = 1;
			for (int i = 0; i < size.length && res > 0; i++)
				res *= get(i);
			return res < 0 ? 0 : res;
		}

    
		
        /**
         * True if any dimension is verified to be zero
         */
        public boolean isZero() {
            return !isUnknown() && numElements() == 0;
        }

    
		
		/**
		 * Create a new FArraySubscripts object with ranges spanning this size.
		 */
		public FArraySubscripts rangeFArraySubscripts() {
			FArraySubscripts fas = new FArraySubscripts();
			for (int i = 0; i < size.length; i++)
				fas.addFSubscript(rangeFSubscript(i));
			return fas;
		}

    

        /**
         * Create a new FSubscript for dimension <code>i</code>.
         */
        public FSubscript rangeFSubscript(int i) {
            return size[i] == UNKNOWN ? new FColonSubscript() : new FExpSubscript(new FRangeExp(1, size[i]));
        }

    

		/**
		 * Check if any lengths are unknown.
		 */
		public boolean isUnknown() {
			for (int s : size)
				if (s == UNKNOWN)
					return true;
			return false;
		}

    
		public boolean isUnknownNoEval() {
		    return isUnknown();
		}

    
        
        /**
         * Check if length in dimension d is unknown.
         */
        public boolean isUnknown(int d) {
            return !has(d) || size[d] == UNKNOWN;
        }

    
        
		/**
		 * Check if all lengths have a value (fix length or expression).
		 */
		public boolean isComplete() {
			for (int i = 0; i < size.length; i++)
				if (!hasValue(i))
					return false;
			return true;
		}

    
		
		/**
		 * Check is the length in any dimension equals 0.
		 */
		public boolean isEmpty() {
			for (int i = 0; i < size.length; i++)
				if (read(i) == 0)
					return true;
			return false;
		}

    
		
		/**
		 * Check if a given index fits within this size.
		 * 
		 * Unknown lengths are assumed to be long enough.
		 */
		public boolean isOKIndex(Index i) {
			int[] ind = i.index();
			if (size.length != ind.length)
				return false;
			for (int j = 0; j < size.length; j++) {
				int a = ind[j];
				int b = get(j);
				if (a < 1 || (a > b && b != UNKNOWN))
					return false;
			}
			return true;
		}

    
		
		/**
		 * Check if the lengths in the given dimension has a value (fix length or integer).
		 */
		protected boolean hasValue(int dim) {
			return size[dim] != UNKNOWN;
		}

    
		
		/**
		 * Create a copy of this size.
		 */
		protected Size clone() {
			return (size.length == 0) ? SCALAR : new Size(size.clone());
		}

    
		
		/**
		 * Create a copy of this size as a MutableSize.
		 */
		public MutableSize mutableClone() {
			MutableSize ms = new MutableSize(size.length);
			System.arraycopy(size, 0, ms.size, 0, size.length);
			return ms;
		}

    
		
		/**
		 * Create a copy of this with <code>dim</code> dimensions, if necessary 
		 *        adding dimensions of length 1 to the right side, or removing dimensions 
		 *        from the left side.
		 */
		public Size promote(int dim) {
			if (dim == size.length) 
				return this;
			if (dim == 0)
				return SCALAR;
			Size ns = new Size(new int[dim]);
			int old = dim < size.length ? dim : size.length;
			System.arraycopy(size, size.length - old, ns.size, 0, old);
			Arrays.fill(ns.size, old, dim, 1);
			return ns;
		}

    
		
		/**
		 * If this size contains any dimensions that are represented with expressions, then creates 
		 * and attempts to evaluate a copy of this size. Otherwise, return this.
		 */
		public Size evaluated() {
		    return this;
		}

    
		
		/**
		 * Return a Size that have the same lengths as this size where they are known, 
		 *        and any that are unknown copied from the size of <code>exp</code>. 
		 * 
		 * If the size of <code>exp</code> have more dimensions, the last part is assumed to match this size.
		 */
		public Size createKnown(FExp exp) {
			Size known;
			if (!exp.size().isUnknown() || this instanceof MutableSize) { 
				known = clone();
			} else {
				known = new MutableSize(size.length);
				System.arraycopy(size, 0, known.size, 0, size.length);
			}
			known.fillUnknownFrom(exp);
			return known;
		}

    
		
		/**
		 * Return a Size that have the same lengths as this size where they are known, 
		 * and any that are unknown in this size but known in <code>s</code> is copied from there. 
		 */
		public Size createKnown(Size s) {
			Size known = clone();
			for (int i = 0; i < size.length; i++)
				if (known.size[i] == UNKNOWN && s.size[i] != UNKNOWN)
					known.set(i, s.size[i]);
			return known;
		}

    
		
		/**
		 * Sets length <code>i</code> to <code>s</code>.
		 */
		protected void set(int i, int s) {
			size[i] = s;
		}

    
		
		/**
		 * For each unknown length, copy the equivalent length from size of <code>exp</code>. 
		 * 
		 * If the size of <code>exp</code> have more dimensions than this, the last part is ignored.
		 */
		protected void fillUnknownFrom(FExp exp) {
			Size other = exp.size();
			if (other.size.length >= size.length)
				for (int i = 0; i < size.length; i++) 
					if (!hasValue(i))
						copyFrom(i, exp, i);
		}

    
		
		/**
		 * Copy value of dimension <code>d2</code> in <code>other</code> to dimension 
		 *        <code>d1</code> in <code>this</code>.
		 */
		protected void copyFrom(int d1, FExp exp, int d2) {
			size[d1] = exp.size().size[d2];
		}

    
		
		/**
		 * Check if another object is equal to this one.
		 */
		public boolean equals(Object s) {
			return s instanceof Size && equivalent((Size) s, false);
		}

    
		
		/**
		 * Calculate hash code.
		 */
		public int hashCode() {
			int res = 0;
			for (int i = 0; i < size.length; i++)
				res = (res << 8) ^ size[i];
			return res;
		}

    
		
		/**
		 * Check if another size is equivalent to this one.
		 * 
		 * @param allowUnknown  if <code>true</code>, consider unknown lengths equal to any length, 
		 *                      otherwise consider unknown lengths to differ from all lengths, including
		 *                      other unknown lengths
		 */
		public boolean equivalent(Size s, boolean allowUnknown) {
			return equivalentExcept(s, allowUnknown, -1);
		}

    
		
		/**
		 * Check if another size is equivalent to this one, except in a given dimension.
		 * 
		 * @param allowUnknown  if <code>true</code>, consider unknown lengths equal to any length
		 * @param dim			dimension not to check
		 */
		public boolean equivalentExcept(Size s, boolean allowUnknown, int dim) {
			if (size.length != s.size.length)
				return false;
			for (int i = 0; i < size.length; i++) 
				if (i != dim && !equivalentDim(s, allowUnknown, i, i)) 
					return false;
			return true;
		}

    
		
		/**
		 * Check if a specific dimension of another size is equivalent to a specific 
		 *        dimension of this one.
		 * 
		 * @param allowUnknown  if <code>true</code>, consider unknown lengths equal to any length
		 * @param myDim         the dimension in this Size to compare
		 * @param itsDim        the dimension in the other Size to compare
		 */
		public boolean equivalentDim(Size s, boolean allowUnknown, int myDim, int itsDim) {
			int myLen = read(myDim);
			int itsLen = s.read(itsDim);
			boolean same = myLen == itsLen;
			if (same || !allowUnknown)
				return same;
			return myLen == UNKNOWN || itsLen == UNKNOWN;
		}

    
		
		/**
		 * Make sure that size is final, then getAll value of size[i].
		 */
		protected int read(int i) {
			return size[i];
		}

    
		
		private static final String SEP = ", ";

    
		
		/**
		 * Returns a string representation on the form "[l1, l2, l3]".
		 */
		public String toString() {
			if (size.length == 0)
				return "scalar";
			StringBuilder buf = new StringBuilder("[");
			String prefix = "";
			for (int i = 0; i < size.length; i++) {
				buf.append(prefix);
				buf.append(toString(i));
				prefix = SEP;
			}
			buf.append("]");
			return buf.toString();
		}

    
		
		/**
		 * Returns a string representation of a single length.
		 */
		protected String toString(int i) {
			return (size[i] == UNKNOWN) ? ":" : Integer.toString(size[i]);
		}

    
		
		/**
		 * Returns a string representation on the form "l1, l2, l3".
		 */
		public String toUnclosedString() {
			String tmp = toString();
			return tmp.substring(1, tmp.length() - 1);
		}

    

        /**
         * Creates a new Size that is a copy of this one, but with dimensions removed 
         * from each side. If nothing is changed, <code>this</code> is returned. 
         * 
         * @param left   the number of dimensions to remove from the left side
         * @param right  the number of dimensions to remove from the right side
         */
        public Size contract(int left, int right) {
            int ndims = size.length - left - right;
            if (ndims == size.length)
                return this;
            if (ndims <= 0)
                return Size.SCALAR;
            int[] ns = new int[ndims];
            System.arraycopy(size, left, ns, 0, ndims);
            return new Size(ns);
        }

    

		/**
		 * Creates a new Size that is a copy of this one, but with dimensions removed 
		 * from the left side. If nothing is changed, <code>this</code> is returned. 
		 * 
		 * @param n   the number of dimensions of the new size
		 */
		public Size contractLeft(int n) {
			return contract(size.length - n, 0);
		}

    
		
		/**
		 * Creates a new Size that is a copy of this one, but with dimensions removed 
		 * from the right side. If nothing is changed, <code>this</code> is returned. 
		 * 
		 * @param n   the number of dimensions of the new size
		 */
		public Size contractRight(int n) {
			return contract(0, size.length - n);
		}

    
		
		/**
		 * Creates a new Size that is a copy of this one, but with one more dimension 
		 * on the left side.
		 * 
		 * @param s  the length of the new dimension
		 */
		public Size expand(int s) {
			int[] ns = new int[size.length + 1];
			ns[0] = s;
			System.arraycopy(size, 0, ns, 1, size.length);
			return new Size(ns);
		}

    
		
        /**
         * Creates a new Size that is a copy of this one, but with one more dimension 
         * on the right side.
         * 
         * @param s  the length of the new dimension
         */
        public Size expandRight(int s) {
            int[] ns = new int[size.length + 1];
            System.arraycopy(size, 0, ns, 0, size.length);
            ns[size.length] = s;
            return new Size(ns);
        }

    

        /**
         * Creates a new Size that is a concatenation of <code>s</code> and this size.
         * 
         * <code>s</code> is added on the left side.
         */
        public Size expand(Size s) {
            return s.createExpanded(s, this);
        }

    

        /**
         * Creates a new Size that is a concatenation of this size and <code>s</code>.
         * 
         * <code>s</code> is added on the right side.
         */
        public Size expandRight(Size s) {
            return s.createExpanded(this, s);
        }

    

        /**
         * Delegate method for expand(Size) and expandRight(Size).
         * 
         * Creates a new size that is the concatenation of a and b.
         */
        protected Size createExpanded(Size a, Size b) {
            int ndims = a.size.length + b.size.length;
            if (ndims == 0)
                return Size.SCALAR;
            int[] ns = new int[ndims];
            System.arraycopy(a.size, 0, ns, 0, a.size.length);
            System.arraycopy(b.size, 0, ns, a.size.length, b.size.length);
            return new Size(ns);
        }

    
        
        /**
         * Create an FArraySubscripts that defines this size as used in variable declarations.
         * 
         * Dimension that nothing is known about getAll an FColonSubscript.
         */
        public FArraySubscripts createFArraySubscripts() {
            FArraySubscripts res = new FArraySubscripts();
            for (int i = 0; i < ndims(); i++)
                res.addFSubscript(createFSubscript(i));
            return res;
        }

    
        
        /**
         * Create an FSubscript that defines the length of dimension <code>d</code>.
         * 
         * If nothing is known of the length of the dimension, an FColonSubscript is created.
         */
        public FSubscript createFSubscript(int d) {
            return hasValue(d) ? new FExpSubscript(createFExp(d)) : new FColonSubscript();
        }

    
		
		/**
		 * Create an FArraySubscripts that spans this size.
		 * 
		 * Dimension that nothing is known about getAll an FColonSubscript.
		 */
		public FArraySubscripts createExpandedFArraySubscripts() {
			FArraySubscripts res = new FArraySubscripts();
			for (int i = 0; i < ndims(); i++)
				res.addFSubscript(createExpandedFSubscript(i));
			return res;
		}

    
		
		/**
		 * Create an FSubscript that spans the length of dimension <code>d</code>.
		 * 
		 * If nothing is known of the length of the dimension, an FColonSubscript is created.
		 */
		public FSubscript createExpandedFSubscript(int d) {
			if (!isUnknown(d)) {
				List<FExp> lim = new List<FExp>();
				lim.add(new FIntegerLitExp(1));
				lim.add(createFExp(d));
				return new FExpSubscript(new FRangeExp(lim));
			} else {
				return new FColonSubscript();
			}
		}

    
		
		/**
		 * Create an FExp that describes this size.
		 * 
		 * The resulting expression is not expanded like createSizeFExp().
		 */
		public FExp createFExp() {
			List<FExp> cells = new List<FExp>();
			for (int i = 0; i < size.length; i++)
				cells.add(createFExp(i));
			return new FArray(cells);
		}

    
		
		/**
		 * Create an FExp that describes the length of dimension <code>d</code>.
		 * 
		 * The resulting expression is not expanded like createSizeFExp().
		 */
		public FExp createFExp(int d) {
			return new FIntegerLitExp(size[d]);
		}

    
		
        public FExp createFExpForced(int d) {
            return createFExp(d);
        }

    
		
		/**
		 * Create an FExp that describes the number of elements of this size.
		 */
		public FExp createNumElementsFExp() {
			return new FIntegerLitExp(numElements());
		}

    

        /**
         * Create a zero expression of this size.
         */
        public FExp createZeroFExp() {
            if (size.length == 0) {
                return new FIntegerLitExp(0);
            } else {
                return fillDimsOfExp(new FZeros());
            }
        }

    

        /**
         * Add dimensions to an FArrayDimAsArgsExp so that it will have this size 
         * (assuming a scalar expression for fill).
         */
        public FArrayDimAsArgsExp fillDimsOfExp(FArrayDimAsArgsExp exp) {
            for (int i = 0; i < size.length; i++)
                exp.addFExp(createFExp(i));
            return exp;
        }

    

		public FFunctionVariable createFunctionVariable(String name, FType type) {
		    return createFunctionVariable(name, type, new Opt<FTypePrefixInputOutput>());
		}

    
		
		public FFunctionVariable createFunctionVariable(String name, FType type, FTypePrefixInputOutput inputOutput) {
		    return createFunctionVariable(name, type, new Opt<FTypePrefixInputOutput>(inputOutput));
		}

    
		
		public FFunctionVariable createFunctionVariable(String name, FType type, Opt<FTypePrefixInputOutput> inputOutput) {
		    if (this == Size.SCALAR)
		        return new FFunctionVariable(inputOutput, type.scalarType(), new Opt<FExp>(), new FQNameString(name));
		    else
		        return new FFunctionArray(inputOutput, type.arrayType(this), new Opt<FExp>(), new FQNameString(name));
		}

    public CValue ceval(VariableEvaluator evaluator, int d) {
        int s = get(d);
        return (s == Size.UNKNOWN) ? CValue.UNKNOWN : new CValueInteger(s);
    }

    public Size ceval() {
      return ceval(ASTNode.defaultVariableEvaluator());
  }

    public Size ceval(VariableEvaluator evaluator) {
	  return this;
  }

    public boolean flushUnknownSizes() {
        return false;
    }

    public boolean isCircular() {
		for (int d = 0; d < size.length; d++)
			if (isCircular(d))
				return true;
		return false;
	}

    public boolean isCircular(int d) {
		return false;
	}

    public Size contract(int i) {
        if (has(i)) {
            return contract(i,size.length-i-1);
        } else {
            return Size.SCALAR;
        }
    }

    public Size accessContextSize(FSubscript sub) {
        return this;
    }

    public FExp buildAccessContextSizeExp(FSubscript fs)        { throw new UnsupportedOperationException(); }

    public Size createSizeFExp(InstFunctionCall call) {
        
        if (!isUnknown() || call.isCircular())
            return this;
        
        HashMap<InstComponentDecl, InstFunctionArgument> varMap = new HashMap<InstComponentDecl, InstFunctionArgument>();
        for (int j = 0; j < call.getNumArg(); j++) {
            call.getArg(j).sizeOfOutput(varMap, call.myCallInputs().get(j));
        }
        
        MutableSize ms = new MutableSize(ndims());
        FExp.FunctionSizeContextReplacer crp = new FExp.FunctionSizeContextReplacer(varMap);
        for (int j = 0; j < ndims(); j++) {
            try {
                ms.append(call.dynamicFExp(copyReplaceAccess(j, crp)));
            } catch (ConstantEvaluationException e) {
                ms.append(Size.UNKNOWN);
            }
        }
        return ms;
    }

    public FExp copyReplaceAccess(int d, FExp.ContextReplacer crp) {
        if (d < 0 || d >= ndims()) {
            throw new ConstantEvaluationException();
        }
        return createFExp(d);
    }

    public FTypePrefixVariability variability() {
        return ASTNode.fConstant();
    }

    public FTypePrefixVariability variability(int d) {
        return ASTNode.fConstant();
    }

    public void forceVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        
    }

    public void markAsStructuralParameter(ErrorCheckType checkType) {}

    public Size flatten(FQName prefix, ASTNode context, boolean keepSizeExpressions) {
        return this;
    }

    public FArraySubscripts flattenFArraySubscripts() {
        List<FSubscript> l = new List<FSubscript>();
        for (int i = 0; i < ndims(); i++) {
            l.add(flattenFSubscript(i));
        }
        return new FArraySubscripts(l);
    }

    public FSubscript flattenFSubscript(int i) {
        int s = get(i);
        return s == Size.UNKNOWN ? new FColonSubscript() : new FIntegerSubscript(s);
    }

    public FSubscript flattenSubscript(int i) {
        return new FExpSubscript(new FRangeExp(new FIntegerLitExp(1),new FIntegerLitExp(get(i))));
    }

    public FArraySubscripts flattenSubscript() {
        if (ndims() == 0) {
            return null;
        }
        FArraySubscripts fas = new FArraySubscripts();
        for (int i = 0; i < ndims(); i++) {
            fas.addFSubscript(flattenSubscript(i));
        }
        return fas;
    }

    public FExp flattenFExp(int d) {
        return createFExp(d);
    }

    public boolean isSliceFAS(FExp exp) {
        return isUnknown() || !exp.isLiteral(get(0));
    }

    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        
    }

    public Size replaceReferences(AbstractFunctionInliner fi, ASTNode context) {
        return this;
    }

    public Size scalarizeInitArray(Scalarizer.Algorithm s, ASTNode context) {
        return this;
    }

    public void sizeAsserts(Collection<FAssert> asserts, Size other, FExp context) {
        Size l = evaluated();
        other = other.evaluated();
        for (int i = 0; i < l.size.length; i++) {
            if (l.size[i] != UNKNOWN && other.size[i] == UNKNOWN) {
                FAssert a = new FAssert(
                        context.orNotIfExpConds(new FEqExp(other.createFExp(i), l.createFExp(i))),
                        new FStringLitExp("Mismatching sizes in " + context.containingFFunctionDecl().name()), new Opt<FExp>());
                asserts.add(a);
            }
        }
    }

    public Set<String> sortingAddNamesUsed(Set<String> set) {
        return set;
    }

    public void printNumElements_C(CodePrinter p, CodeStream str, String indent, ASTNode src) {
		str.print(numElements());
	}

    public void printDimensions_C(CodePrinter p, CodeStream str, String indent, ASTNode src) {
        str.print(toUnclosedString());
    }

    public void printNumElements_C(CodePrinter p, CodeStream str, String indent, String name) {
        printDimsWithSep_C(p, str, indent, name, " * ");
    }

    public void printDimensions_C(CodePrinter p, CodeStream str, String indent, String name) {
        printDimsWithSep_C(p, str, indent, name, ", ");
    }

    private void printDimsWithSep_C(CodePrinter p, CodeStream str, String indent, String name, String sep) {
        printSize_C(p, str, indent, name, 0);
        for (int i = 1; i < ndims(); i++) {
            str.print(sep);
            printSize_C(p, str, indent, name, i);
        }
    }

    public void printSize_C(CodePrinter p, CodeStream str, String indent, String name, int dim) {
        str.print("jmi_array_size(");
        str.print(name);
        str.print(", ");
        str.print(dim);
        str.print(")");
    }

    public void printSize_C(CodePrinter p, CodeStream str, String indent, FExp e, int dim) {
        str.print("jmi_array_size(");
        p.print(e, str, indent);
        str.print(", ");
        str.print(dim);
        str.print(")");
    }

    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent, FExp src) {}

    public void genTempVars_C(CodePrinter p, CodeStream str, String indent, FExp src) {}

    public void genTempFree_C(CodePrinter p, CodeStream str, String indent, FExp src) {}


}
