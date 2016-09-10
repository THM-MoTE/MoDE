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
 * A qualified name supporting array subscripts.
 * 
 * Flattened variables and identifiers typically have qualified names, which
 * are represented by FQName. FQName contains a list of FQNamePart objects
 * which in turn contains a name and, optionally, array subscripts. The 
 * structure of the FQName class is motivated by the fact that flat names
 * needs to be printed in a number of different way (dot notation, underscore
 * notation etc).
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:435
 * @production FQName : {@link BaseNode};

 */
public abstract class FQName extends BaseNode implements Cloneable {
    /**
     * Create a list with an FArraySubscripts for each part of this access, empty for parts that has none.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:406
     */
    public ArrayList<FArraySubscripts> createFArraySubscriptsList() {
		ArrayList<FArraySubscripts> res = new ArrayList<FArraySubscripts>(numParts());
		for (int i = 0, n = numParts(); i < n; i++)
			res.add(createFArraySubscriptsForPart(i));
		return res;
	}
    /**
     * Get an FArraySubscripts for part <code>i</code> of this access, creating an empty one if it has none.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:416
     */
    public FArraySubscripts createFArraySubscriptsForPart(int i) {
		return new FArraySubscripts();
	}
    /**
     * Creates a new FQName with the FArraySubscripts taken from the given Index.
     * 
     * The FQName is marked scalarized if this use is.
     * 
     * @param i  the Index specifying what array subscripts to use
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1976
     */
    public FQName specify(Index i) {
		return specify(i, isScalarized());
	}
    /**
     * Creates a new FQName with the FArraySubscripts taken from the given Index.
     * 
     * @param i          the Index specifying what array subscripts to use
     * @param scalarize  <code>true</code> if the FQName should be marked as scalarized 
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1986
     */
    public FQName specify(Index i, boolean scalarize) {
		FQName fqn = copyAndAddFas(i.createFArraySubscripts());
		fqn.scalarized = scalarize;
		return fqn;
	}
    /**
     * Create a copy with all array subscripts replaced by literals.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2420
     */
    public FQName resolveSubscripts(VariableEvaluator evaluator) {
        return fullCopy();
    }
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param values   constant values for the variables
     * @param right    the right hand side
     * @param context  the use to look up names from
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4053
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right, FIdUse context) {
	  throw new UnsupportedOperationException();
  }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:304
     */
    protected static final String DER = "der";
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:305
     */
    protected static final String PRE = "pre";
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:306
     */
    protected static final String DYN_DER = "dynDer";
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:322
     */
    private static String derPrefixString = "_der_der_der_der";
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:324
     */
    protected static String createDerPrefixString(int order) {
        while (4 * order >= derPrefixString.length())
            derPrefixString = derPrefixString + derPrefixString;
        return derPrefixString.substring(0, 4 * order + 1);
    }
    /**
     * Append a new name part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:552
     */
    public FQName append(String name) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:566
     */
    public FQName append(String name, FArraySubscripts fas) {
        return asFQNameFull().append(name, fas);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:579
     */
    public boolean use(FArraySubscripts fas) {
        return fas != null && fas.ndims() > 0;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:592
     */
    protected abstract FQNameFull appendTo(FQNameFull fqn);
    /**
     * Create a copy of the name, with a new name part appended.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:615
     */
    public abstract FQName copyAndAppend(String name);
    /**
     * Create a copy of the name, with a new name part appended.
     * 
     * Passing <code>null</code> as <code>fas</code> is supported, and equivalent 
     * to using {@link #copyAndAppend(String)}.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:635
     */
    public FQName copyAndAppend(String name, FArraySubscripts fas) {
        if (fas == null || fas.ndims() == 0)
            return copyAndAppend(name);
        FQNameFull res = copyAsFQNameFull();
        res.addFQNamePart(new FQNamePartArray(name, fas));
        return res;
    }
    /**
     * Create a copy of the name, with another name appended, and <code>fas</code> applied to the last part.
     * 
     * Passing <code>null</code> as <code>fas</code> is supported, and equivalent 
     * to using {@link #copyAndAppend(FQName)}.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:649
     */
    public FQName copyAndAppend(FQName name, FArraySubscripts fas) {
        if (fas == null || fas.ndims() == 0)
            return copyAndAppend(name);
        FQName res = copyAndAppend(name);
        return res.asFQNameFull().addFArraySubscripts(fas);
    }
    /**
     * Create a copy of the name as an FQNameFull.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:659
     */
    public abstract FQNameFull copyAsFQNameFull();
    /**
     * Return this name as an FQNameFull. 
     * 
     * Creates a copy only if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:678
     */
    public FQNameFull asFQNameFull() {
        return copyAsFQNameFull();
    }
    /**
     * Create a copy of the name, with a new name part prepended.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:689
     */
    public abstract FQName copyAndPrepend(String name);
    /**
     * Create a copy of the name, with a prefix added to the first name part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:714
     */
    public FQName copyAndAddPrefix(String prefix) {
        return copyAndAddPrefix(prefix, false);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:719
     */
    public abstract FQName copyAndAddPrefix(String prefix, boolean removeUnderscore);
    /**
     * Create a copy of the name, with another FQName appended.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:746
     */
    public abstract FQName copyAndAppend(FQName name);
    /**
     * Create a copy of the name, with an FSubscript added to the last part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:763
     */
    public abstract FQName copyAndAddSubscript(FSubscript s);
    /**
     * Create a copy of the name, with an FArraySubscripts added to the last part.
     * 
     * Any previous FArraySubscripts is removed. Passing null as fas is equivalent 
     * to calling {@link #removeFArraySubscripts()}.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:806
     */
    public abstract FQName copyAndAddFas(FArraySubscripts fas);
    /**
     * Copies this and add <code>i</code> as subscripts if <code>i</code>
     * has dimensions. Otherwise returns this.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:828
     */
    public FQName copyAndAddIfFas(Index i) {
        if (i.ndims() > 0) {
            return copyAndAddFas(i.createFArraySubscripts());
        }
        return this;
    }
    /**
     * Remove the FArraySubscripts of the last FQNamePart, if any.
     * 
     * @return  <code>this</code>, for convenience
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:855
     */
    public FQName removeFArraySubscripts() {
        return this;
    }
    /**
     * Create a copy of the name excluding the first part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:877
     */
    public FQName copySuffix() {
        return copyPart(1, numDots());
    }
    /**
     * Create a copy of the last part of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:884
     */
    public FQName copyLastSuffix() {
        int i = numDots();
        return copyPart(i, i);
    }
    /**
     * Create a copy of the last <code>n</code> parts of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:892
     */
    public FQName copySuffix(int n) {
        int m = numDots();
        return copyPart(m - n + 1, m);
    }
    /**
     * Create a copy of all but the first <code>n</code> parts of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:900
     */
    public FQName copyWithoutPrefix(int n) {
        return copyPart(n, numDots());
    }
    /**
     * Create a copy of the name excluding the last part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:907
     */
    public FQName copyPrefix() {
        return copyPart(0, numDots() - 1);
    }
    /**
     * Create a copy of the first part of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:914
     */
    public FQName copyFirstPrefix() {
        return copyPart(0, 0);
    }
    /**
     * Create a copy of the first <code>n</code> parts of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:921
     */
    public FQName copyPrefix(int n) {
        return copyPart(0, n - 1);
    }
    /**
     * Create a copy of all but the last <code>n</code> parts of this name.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:928
     */
    public FQName copyWithoutSuffix(int n) {
        return copyPart(0, numDots() - n);
    }
    /**
     * Create a copy of parts <code>first</code> to <code>last</code> of this name (zero-based).
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:935
     */
    public abstract FQName copyPart(int first, int last);
    /**
     * Create a copy of this name without array subscripts.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:992
     */
    public FQName copyWithoutSubscripts() {
        return fullCopy();
    }
    /**
     * Create a copy of this name with all array subscripts replaced with indices 
     * from <code>i</code>.
     * 
     * The number of dimensions of <code>i</code> must be the same as the number 
     * of non-literal subscripts. The subscripts to be replaced can be spread out 
     * over several name parts.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1011
     */
    public FQName copyReplacingSubscripts(Index i) {
        return fullCopy();
    }
    /**
     * Create an FDerExp for this name with order order, using a copy if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1128
     */
    public FDerExp createFDerExp(int order) {
        return new FDerExp(createFIdUse(), order); 
    }
    /**
     * Create an FHDummyDerExp for this name with order order, using a copy if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1135
     */
    public FDummyDerExp createFDummyDerExp(int order) {
        return new FDummyDerExp(createFIdUse(), (String)null, order); 
    }
    /**
     * Create an FHDummyDerExp for this name with order order, using a copy if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1142
     */
    public FDynamicDerExp createFDynamicDerExp(int order) {
        return new FDynamicDerExp(createFIdUse(), (String)null, order); 
    }
    /**
     * Create an FIdUseExp for this name, using a copy if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1149
     */
    public FIdUseExp createFIdUseExp() {
        return new FIdUseExp(createFIdUse()); 
    }
    /**
     * Create a copy of this name that is suitable for an FIdUse.
     * 
     * It is assumed that this name is from a variable declaration.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1158
     */
    public FQName createUseFQName() {
        if (!isScalarized() && ndims() > 0)
            return copyAndAddFas(size().createExpandedFArraySubscripts());
        else
            return fullCopy();
    }
    /**
     * Create an FIdUse for this name, using a copy if needed.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1168
     */
    public FIdUse createFIdUse() {
        return new FIdUse((FQName) unboundCopy()); 
    }
    /**
     * Create an FIdUseExp using a copy of this name.
     * 
     * @param fas  array subscripts to use for the last name part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1177
     */
    public FIdUseExp createFIdUseExp(FArraySubscripts fas) {
        return new FIdUseExp(createFIdUse(fas)); 
    }
    /**
     * Create an FIdUse using a copy of this name.
     * 
     * @param fas  array subscripts to use for the last name part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1186
     */
    public FIdUse createFIdUse(FArraySubscripts fas) {
        return new FIdUse(copyAndAddFas(fas)); 
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1244
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
    }
    /**
     * @aspect FlatDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:382
     */
    public void dumpTree(String indent) {
		log.debug("FQName.dumpTree");
		String s = indent + dump() +": " + name() + " at line: " + beginLine();
		System.out.println(s);
		for(int i = 0; i < getNumChild(); i++)
      		getChild(i).dumpTree(indent + "  ");
	}
    /**
     * Create an FFunctionCallLeft using a copy of this name.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1140
     */
    public FFunctionCallLeft createFFunctionCallLeft() {
		FQName fqn = fullCopy();
		fqn.removeFArraySubscripts();
		return new FFunctionCallLeft(new Opt(new FIdUseExp(fqn)));
	}
    /**
     * Remove all uses in expressions in array subscripts from the uses lists of their respective variables.
     * 
     * Should only be used to allow iterative algorithms to use updated uses lists while 
     * removing expressions. Only valid in flat tree.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2023
     */
    public void removeFromUses() {}
    /**
     * Encapsulate any event-generating expressions in noEvent().
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:613
     */
    public void preventEvents() {}
    /**
     * Inline all calls to functions that we can inline.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:903
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {}
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1581
     */
    public FQName copyWithNonLiteralSubscriptsAsColon() {
        return treeCopyNoTransform();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1630
     */
    public FArraySubscripts copyNonLiteralSubscripts() {
        return new FArraySubscripts();
    }
    /**
     * Flag indicating if a variable is scalarized.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:229
     */
    boolean scalarized = false;
    /**
     * Create an FExp that represents a specific scalar component of the given record constructor.
     * 
     * @param indexMap  translations for indices in the expressions
     * @param con       the record constructor to extract an expression from
     * 
     * @see FExp#scalarRecordFExp(Map, FQName)
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1109
     */
    public FExp scalarRecordFExpForCon(Map<String,FExp> indexMap, FRecordConstructor con) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1126
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, FExp exp) {
        return exp.scalarRecordFExp(indexMap, this);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1558
     */
    public abstract FQName scalarize(Map<String,FExp> indexMap);
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:43
     */
    public void clearScalarized() {
        scalarized = false;
    }
    /**
     * Create a new FQName that is a copy of this one, prefixed with "_der" <code>order</code> times in the last name part.
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:264
     */
    public FQName createDerPrefixedName(int order) {
        FQName pref = copyPrefix();
        String name = lastActualPartName();
        if (name.startsWith("_"))
            name = name.substring(1);
        name = createDerPrefixString(order) + name;
        FQName der;
        if (hasFArraySubscripts())
            der = pref.copyAndAppend(name, getFArraySubscripts().fullCopy());
        else
            der = pref.copyAndAppend(name);
        der.scalarized = true;
        return der;
    }
    /**
     * Create a new FQName that is a copy of this one, prefixed with "_der" <code>order</code> times in the first name
     * part. This function is used in functions, instead of createDerPrefixedName(int).
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:283
     */
    public FQName createDerPrefixedFunctionName(int order) {
        String prefix = createDerPrefixString(order);
        return copyAndAddPrefix(prefix, true);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:457
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		throw new UnsupportedOperationException();
	}
    /**
     * Print CAD code for value for record use in statement in function. 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:145
     */
    public String genRecordUse_var_CAD(CodePrinter p, FAbstractVariable fv, String type) {
		throw new UnsupportedOperationException();
	}
    /**
     * Print CAD code for for derivative record use in statement in function. 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:168
     */
    public String genRecordUse_der_CAD(CodePrinter p, FAbstractVariable fv, String type) {
		throw new UnsupportedOperationException();
	}
    /**
     * Helper, generates an record variable use
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:572
     */
    public String genRecordUse_C(CodePrinter p, FAbstractVariable fv, String type) {
        throw new UnsupportedOperationException();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FQName() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:39
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public FQName clone() throws CloneNotSupportedException {
        FQName node = (FQName) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:56
     */
    public abstract FQName fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract FQName treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract FQName treeCopy();
    /**
     * Gets the prefix name parts. Considers FQNameString as having one part for each '.'-separated substring.
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:204
     */
    @ASTNodeAnnotation.Attribute
    public abstract String prefixActualPartName();
    /**
     * Return a new name that has index instead of the first array subscript with ndims() > 1.
     * 
     * If name has no subscripts, a set of subscripts with all colons is first created.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1454
     */
    @ASTNodeAnnotation.Attribute
    public abstract FQName splitArrayAccess(int index);
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = 0;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public int accessNdims() {
        ASTNode$State state = state();
        int accessNdims_value = 0;

        return accessNdims_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = Size.SCALAR;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = false;

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findHierarchicalAttribute(FQNameFull prefix, FVariable var, int n) {
        ASTNode$State state = state();
        FAttribute findHierarchicalAttribute_FQNameFull_FVariable_int_value = asFQNameFull().findHierarchicalAttribute(prefix, var, n);

        return findHierarchicalAttribute_FQNameFull_FVariable_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = false;

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = null;

        return getFArraySubscripts_value;
    }
    /**
     * Gets a specific name part. Consides FQNameString as always having a single part.
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:181
     */
    @ASTNodeAnnotation.Attribute
    public String partName(int i) {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String lastPartName() {
        ASTNode$State state = state();
        String lastPartName_value = partName(numParts() - 1);

        return lastPartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastActualPartName() {
        ASTNode$State state = state();
        String lastActualPartName_value = lastPartName();

        return lastActualPartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastActualTypePartName() {
        ASTNode$State state = state();
        String lastActualTypePartName_value = lastPartName();

        return lastActualTypePartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numParts() {
        ASTNode$State state = state();
        int numParts_value = 0;

        return numParts_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDots() {
        ASTNode$State state = state();
        int numDots_value = 0;

        return numDots_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numMatchingParts(FQNameFull fqn) {
        ASTNode$State state = state();
        int numMatchingParts_FQNameFull_value = 0;

        return numMatchingParts_FQNameFull_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = "";

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String resolvedName() {
        ASTNode$State state = state();
        String resolvedName_value = "";

        return resolvedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derName(int index) {
        ASTNode$State state = state();
        String derName_int_value = "";

        return derName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String dynDerName(int index) {
        ASTNode$State state = state();
        String dynDerName_int_value = "";

        return dynDerName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String preName() {
        ASTNode$State state = state();
        String preName_value = "";

        return preName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarName() {
        ASTNode$State state = state();
        String scalarName_value = scalarName(true);

        return scalarName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarName(boolean eval) {
        ASTNode$State state = state();
        String scalarName_boolean_value = name();

        return scalarName_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:330
     */
    @ASTNodeAnnotation.Attribute
    public String derPrefixName(int order) {
        ASTNode$State state = state();
        try {
                String name = prefixActualPartName();
                if (!name.isEmpty())
                    name += ".";
                String last = lastActualPartName();
                if (last.startsWith("_"))
                    last = last.substring(1);
                name += createDerPrefixString(order) + last;
                if (hasFArraySubscripts())
                    name += getFArraySubscripts();
                return name;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = "";

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameUnderscore(String suffix) {
        ASTNode$State state = state();
        String funcNameUnderscore_String_value = "func_" + nameUnderscore() + "_" + suffix;

        return funcNameUnderscore_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSimple() {
        ASTNode$State state = state();
        boolean isSimple_value = true;

        return isSimple_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = false;

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size calcMySize(int i) {
        ASTNode$State state = state();
        Size calcMySize_int_value = lookupFV(asFQNameFull()).size();

        return calcMySize_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public List<FQNamePart> buildAccessContext() {
        ASTNode$State state = state();
        List<FQNamePart> buildAccessContext_value = null;

        return buildAccessContext_value;
    }
    /**
     * @attribute syn
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1177
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasScalarSubscripts() {
        ASTNode$State state = state();
        try {
                FArraySubscripts fas = getFArraySubscripts();
                if (fas == null)
                    return false;
                for (FSubscript s : fas.getFSubscripts())
                    if (s.ndims() > 0)
                        return false;
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = false;

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = false;

        return generatesEvents_value;
    }
    /**
     * Check if any array subscripts contain any calls to functions that we can inline.
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:715
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        try {
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isScalarized() {
        ASTNode$State state = state();
        boolean isScalarized_value = scalarized;

        return isScalarized_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "QualifiedName";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1569
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:23
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_FQName_value = getParent().Define_lookupFV(this, null, fqn);

        return lookupFV_FQName_value;
    }
    /**
     * Check is this node is in a function.
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1596
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
