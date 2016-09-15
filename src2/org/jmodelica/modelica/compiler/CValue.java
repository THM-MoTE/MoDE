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
 * @aspect ConstantEvaluation
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:128
 */
public abstract class CValue extends Object implements Iterable<CValue>, Cloneable {
    
		
		/**
		 * An unknown value.
		 */
		public static final CValue UNKNOWN = new CValueUnknown();

    
		
		/**
		 * An unknown value for an expression that constant evaluation 
		 *        isn't supported for.
		 */
		public static final CValue UNSUPPORTED = new CValueUnsupported();

    

		/** 
		 * Default constructor.
		 */
	    protected CValue() {
	    }

    
	    
	    /**
	     * Copy this constant value.
	     */
	    public CValue clone() {
	    	try {
				return (CValue) super.clone();
			} catch (CloneNotSupportedException e) {
				return null;
			}
	    }

    
	    
	    /**
	     * Get a string describing this CValue for use in 
	     *        ConstantEvaluationExceptions.
	     */
	    public String errorDesc() {
	    	return getClass().getSimpleName() + " (" + toString() + ")";
	    }

    

	    /**
	     * Convert to int, default implementation.
	     * 
	     * @return Value converted to int.
	     */
	    public int intValue() { 
	    	throw new ConstantEvaluationException(this, "getAll int value of ");
	    }

    
	    
	    /**
	     * Convert to double, default implementation.
	     * 
	     * @return Value converted to double.
	     */
	    public double realValue() { 
	    	throw new ConstantEvaluationException(this, "getAll real value of ");
	    }

    
	    
        /**
         * Convert to a vector of double, default implementation.
         * 
         * @return Value converted to double vector.
         */
        public double[] realVector() { 
            throw new ConstantEvaluationException(this, "getAll real vector of ");
        }

    
        
        /**
         * Convert to a matrix of doubles, default implementation.
         * 
         * @return Value converted to double matrix.
         */
        public double[][] realMatrix() { 
            throw new ConstantEvaluationException(this, "getAll real matrix of ");
        }

    
        
	    /**
	     * Convert to boolean, default implementation.
	     * 
	     * @return Value converted to boolean.
	     */
	    public boolean booleanValue() { 
	    	throw new ConstantEvaluationException(this, "getAll boolean value of ");
	    }

    
	    
	    /**
	     * Convert to string, default implementation.
	     * 
	     * @return Value converted to string.
	     */
	    public String stringValue() { 
	    	throw new ConstantEvaluationException(this, "getAll string value of ");
	    }

    
	    
        /**
         * Convert to a vector of strings, default implementation.
         * 
         * @return Value converted to string vector.
         */
        public String[] stringVector() { 
            throw new ConstantEvaluationException(this, "getAll string vector of ");
        }

    

        /**
         * Calculate the min value of this constant value.
         * Works for integer, real and array CValues.
         * 
         * @return The smallest value that this CValue represent
         */
        public double minValue() {
            throw new ConstantEvaluationException(this, "getAll min value of ");
        }

    

        /**
         * Calculate the max value of this constant value.
         * Works for integer, real and array CValues.
         * 
         * @return The largest value that this CValue represent
         */
        public double maxValue() {
            throw new ConstantEvaluationException(this, "getAll max value of ");
        }

    

        /**
         * Create a literal AST node from constant, for use in flat tree.
         * 
         * @return  literal expression AST node
         */
        public FExp buildLiteral() { 
            throw new ConstantEvaluationException(this, "create literal expression from "); 
        }

    

        /**
         * Create a literal AST node from constant, for use in instance tree.
         * 
         * @return  literal expression AST node
         */
        public FExp buildInstLiteral() { 
            return buildLiteral(); 
        }

    

        /**
         * Constrain value to be between min and max, inclusively
         */
        public CValue constrainWithin(CValue min, CValue max) {
            throw new ConstantEvaluationException(this, "do relational comparison on "); 
        }

    

        /**
         * Convert to CValueInteger, default implementation.
         */
        public CValue convertInteger() {
            return new CValueInteger(intValue());
        }

    

        /**
         * Convert to CValueReal, default implementation.
         */
        public CValue convertReal() {
            return new CValueReal(realValue());
        }

    

        /**
         * Convert to CValueBoolean, default implementation.
         */
        public CValue convertBoolean() {
            return new CValueBoolean(booleanValue());
        }

    

        /**
         * Convert to CValueString, default implementation.
         */
        public CValue convertString() {
            return new CValueString(stringValue());
        }

    

        /**
         * Returns true if the constant value is of integer type or array that
         * only contain integer types.
         * 
         * @return True if the constant is an integer value.
         */
        public boolean isInteger() {
            return false;
        }

    

        /**
         * Returns true if the constant value is of real type or array that
         * only contain real types.
         * 
         * @return True if the constant is a real value.
         */
        public boolean isReal() {
            return false;
        }

    

        /**
         * Returns true if the constant value is of boolean type or array that
         * only contain boolean types.
         * 
         * @return True if the constant is a boolean value.
         */
        public boolean isBoolean() {
            return false;
        }

    

        /**
         * Returns true if the constant value is of string type or array that
         * only contain string types.
         * 
         * @return True if the constant is a string value.
         */
        public boolean isString() {
            return false;
        }

    

        /**
         * Returns true if the constant value is of enum type or array that
         * only contain enum types.
         * 
         * @return True if the constant is a enum value.
         */
        public boolean isEnum() {
            return false;
        }

    

	    /**
	     * Returns true if the constant value is of numeric type.
	     * 
	     * @return True if the constant is a numerical value.
	     */
	    public boolean isNumeric() {
	    	return false;
	    }

    
	    
	    /**
	     * Check if there was an error in the evaluation.
	     *
	     * @return true if there was an error, otherwise false. 
	     */
	    public boolean isUnknown() {
      		return false;
      	}

    
	    
        /**
         * Check if there was an error in any part of the evaluation.
         *
         * @return true if there was an error, otherwise false. 
         */
        public boolean isPartlyUnknown() {
            return isUnknown();
        }

    
    	
	    /**
	     * Check if there was a compliance error in the evaluation.
	     *
	     * @return true if there was a compliance error, otherwise false. 
	     */
    	public boolean isUnsupported() {
    		return false;
    	}

    

        /**
         * Returns true if the constant value is of scalar numeric type and has a negative value.
         */
        public boolean isNegative() {
            return false;
        }

    

        /**
         * Returns true if the constant value is NaN, infinity or unknown.
         */
        public boolean isValid() {
            return false;
        }

    

        /**
         * Overloading of the toString() method.
         * 
         * @return The string.
         */
        public String toString() { 
        	return stringValue(); 
        }

    
	   
        /**
         * 
         * Returns true if the constant value represents a scalar value.
         * @return True if constant is a scalar
         */
        public final boolean isScalar() {
            return !isArray();
        }

    

        /**
         * Returns true if the constant value represents an array.
         * ,
         * @return True if constant is an array.
         */
        public boolean isArray() {
        	return false;
        }

    
        
        /**
         * Returns true if the constant value is a vector.
         * 
         * @return True if the constant is a vector
         */
        public final boolean isVector() {
            return isArray(-1);
        }

    

        /**
         * Returns true if the constant value is a matrix.
         * 
         * @return True if the constant is a matrix
         */
        public final boolean isMatrix() {
            return isArray(-1, -1);
        }

    

        /**
         * Returns true if the constant value is an array with the given
         * dimention sizes.
         * It is possible to allow dimention of unknown size by providing a
         * negative number for that dimention.
         * 
         * @param dims Sizes of each dimention. 
         * @return True if the constant is an array with given dimention sizes.
         */
        public final boolean isArray(int ... dims) {
            return isArray(0, dims);
        }

    

        /**
         * Internal method for doing array dimention size check.
         */
        protected boolean isArray(int pos, int[] dims) {
            return false;
        }

    

        /**
         * Convenience method for accessing an array CValue as CValueArray.
         * 
         * Only valid for arrays.
         */
        public CValueArray array() {
        	throw new ConstantEvaluationException(this, "use this as array: ");
        }

    
        
        public CValueUnknownUse unknownUse() {
            throw new ConstantEvaluationException(this, "use this as unknown value use: ");
        }

    
        
        /**
         * Expand this CValue so that it represents an array of the given size, 
         * duplicating values as needed.
         */
        public CValue expandArray(Size s) {
        	if (s == Size.SCALAR)
        		return this;
        	CValueArray res = new CValueArray(s);
        	while (!res.isFilled())
        		res.addCell(this);
        	return res;
        }

    
 	   
        /**
         * Check if this is a record.
         */
        public boolean isRecord() {
        	return false;
        }

    
       
        /**
         * Convenience method for accessing a record CValue as CValueRecord.
         * 
         * Only valid for records.
         */
        public CValueRecord record() {
        	throw new ConstantEvaluationException(this, "use this as record: ");
        }

    
        
        /**
         * Reduce an array to a single value.
         * 
         * For a scalar, returns itself. For an empty array, returns zero.
         * 
         * @param op    the operation to use to combine two values
         * @param zero  the start value
         */
        public CValue reduce(BinaryOperation<CValue> op, CValue zero) {
        	return this;
        }

    
        
        /**
         * Reduce an array of constant boolean values to a single boolean that is the logical 
         * or of the array.
         * 
         * Used for the test expression of while statements. For scalar constant values, 
         * just returns the boolean value.
         */
        public boolean reduceBooleanOr() {
        	return reduce(OR_OPERATION, CValueBoolean.FALSE).booleanValue();
        }

    
        
        private static final BinaryOperation<CValue> OR_OPERATION = new BinaryOperation<CValue>() {
        	public CValue op(CValue x, CValue y) {
        		return (x.booleanValue() || y.booleanValue()) ? CValueBoolean.TRUE : CValueBoolean.FALSE;
        	}
        };

    
		
        /**
         * Reduce an array of constant boolean values to a single boolean that is the logical 
         * and of the array.
         * 
         * Used for evaluation of fixed=false parameters when evalute=true.
         */
        public boolean reduceBooleanAnd() {
            return reduce(AND_OPERATION, CValueBoolean.TRUE).booleanValue();
        }

    
        
        private static final BinaryOperation<CValue> AND_OPERATION = new BinaryOperation<CValue>() {
            public CValue op(CValue x, CValue y) {
                return (x.booleanValue() && y.booleanValue()) ? CValueBoolean.TRUE : CValueBoolean.FALSE;
            }
        };

    
        
		/**
		 * Returns the array size of this constant value.
		 */
		public Size size() {
			return Size.SCALAR;
		}

    
		
		/**
		 * Iterates over all array cells in CValue.
		 * 
		 * A scalar CValue is considered to have a single array cell.
		 */
		public Iterator<CValue> iterator() {
			return new SingleIterator<CValue>(this);
		}

    
        
        /**
         * Evaluate this as a function call. Throws exception if not a partial function.
         */
        public void evaluateFunction(VariableEvaluator evaluator, CommonCallable partial, Map<CommonVariableDecl, CValue> values) {
            throw new ConstantEvaluationException(this, "use this as a partial function: ");
        }

    
        
        /**
         * Evaluate this as a partial function call. Throws exception if not a partial function.
         */
        public CValue evaluatePartialFunction(CommonCallable partial, Map<CommonVariableDecl, CValue> values) {
            throw new ConstantEvaluationException(this, "use this as a partial function: ");
        }

    public boolean isZero()        { return false; }

    public CValue cached()       { return this; }

    public boolean equals(CValue other) {
        return super.equals(other);
    }

    public CValue merge(CValue other) {
        if (equals(other)) {
            return this;
        }
        if (isUnknown() && !other.isUnknown()) {
            return this;
        } else if (!isUnknown() && other.isUnknown()) {
            return other;
        }
        return CValue.UNKNOWN;
    }

    public CValue component(String name) {
        return CValue.UNKNOWN;
    }

    public void applyAttributes(List<FAttribute> attrs, Index i) {}

    public Set<FIdUseExp> getDependencies() {
        return new HashSet<FIdUseExp>();
    }

    public void markExternalObject(String name) {
        
    }

    public String getMarkedExternalObject() {
        throw new ConstantEvaluationException();
    }

    public void serialize(BufferedWriter buff) throws IOException {
        throw new IOException("Unsupported type to serialize '" + getClass().getSimpleName() + "'");
    }

    public FSubscript createFSubscript() {
        return new FExpSubscript(buildLiteral());
    }

    public String xmlValue() {
    		return stringValue();
    	}

    public String cCodeValue() {
		return toString();
	}


}
