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
 * @declaredat ASTNode$State:4
 */
public class ASTNode$State extends Object {
    
    /**
     * @apilevel internal
     */
    public boolean LAST_CYCLE = false;

    

    /**
     * @apilevel internal
     */
    public boolean INTERMEDIATE_VALUE = false;

    

    /**
     * @apilevel internal
     */
    public boolean IN_CIRCLE = false;

    

    /**
     * @apilevel internal
     */
    public int CIRCLE_INDEX = 1;

    

    /**
     * @apilevel internal
     */
    public boolean CHANGE = false;

    

    /**
     * @apilevel internal
     */
    public boolean RESET_CYCLE = false;

    

    /**
     * @apilevel internal
     */
    static public class CircularValue {
        Object value;
        int visited = -1;
    }

    
    /**
     * @apilevel internal
     */
    public static final int REWRITE_CHANGE = 1;

    

    /**
     * @apilevel internal
     */
    public static final int REWRITE_NOCHANGE = 2;

    

    /**
     * @apilevel internal
     */
    public static final int REWRITE_INTERRUPT = 3;

    

    public int boundariesCrossed = 0;

    

    // state code
    private int[] stack;

    

    private int pos;

    

    public ASTNode$State() {
        stack = new int[64];
        pos = 0;
    }

    

    private void ensureSize(int size) {
        if(size < stack.length)
            return;
        int[] newStack = new int[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    

    public void push(int i) {
        ensureSize(pos+1);
        stack[pos++] = i;
    }

    

    public int pop() {
        return stack[--pos];
    }

    

    public int peek() {
        return stack[pos-1];
    }

    protected int duringTransformCanonical = 0;

    protected int duringFlattening = 0;

    protected int duringScalarization = 0;

    protected int duringIfEquations = 0;

    protected int duringConstantFolding = 0;

    protected int duringExpressionSimplification = 0;

    protected int duringFlatAPI = 0;

    protected int duringDynamicStateSelect = 0;

    protected int duringFunctionScalarization = 0;

    protected int duringDummyDerivatives = 0;

    protected int duringAlgorithmDifferentiation = 0;

    protected int duringInstFunctionBinding = 0;

    protected int duringFlatExpressions = 0;

    protected int duringExtractSampleExpressions = 0;

    protected int duringConnections = 0;

    protected int duringInstanceTreeConstruction = 0;

    protected int duringInstNameClassification = 0;

    protected int duringInstResolveAmbiguousNames = 0;

    protected int duringInitialTransformations = 0;

    protected int duringPredefinedTypes = 0;

    public void reset() {
        IN_CIRCLE = false;
        CIRCLE_INDEX = 1;
        CHANGE = false;
        LAST_CYCLE = false;
        boundariesCrossed = 0;
        if(duringTransformCanonical != 0) {
            System.out.println("Warning: resetting duringTransformCanonical");
            duringTransformCanonical = 0;
        }
        if(duringFlattening != 0) {
            System.out.println("Warning: resetting duringFlattening");
            duringFlattening = 0;
        }
        if(duringScalarization != 0) {
            System.out.println("Warning: resetting duringScalarization");
            duringScalarization = 0;
        }
        if(duringIfEquations != 0) {
            System.out.println("Warning: resetting duringIfEquations");
            duringIfEquations = 0;
        }
        if(duringConstantFolding != 0) {
            System.out.println("Warning: resetting duringConstantFolding");
            duringConstantFolding = 0;
        }
        if(duringExpressionSimplification != 0) {
            System.out.println("Warning: resetting duringExpressionSimplification");
            duringExpressionSimplification = 0;
        }
        if(duringFlatAPI != 0) {
            System.out.println("Warning: resetting duringFlatAPI");
            duringFlatAPI = 0;
        }
        if(duringDynamicStateSelect != 0) {
            System.out.println("Warning: resetting duringDynamicStateSelect");
            duringDynamicStateSelect = 0;
        }
        if(duringFunctionScalarization != 0) {
            System.out.println("Warning: resetting duringFunctionScalarization");
            duringFunctionScalarization = 0;
        }
        if(duringDummyDerivatives != 0) {
            System.out.println("Warning: resetting duringDummyDerivatives");
            duringDummyDerivatives = 0;
        }
        if(duringAlgorithmDifferentiation != 0) {
            System.out.println("Warning: resetting duringAlgorithmDifferentiation");
            duringAlgorithmDifferentiation = 0;
        }
        if(duringInstFunctionBinding != 0) {
            System.out.println("Warning: resetting duringInstFunctionBinding");
            duringInstFunctionBinding = 0;
        }
        if(duringFlatExpressions != 0) {
            System.out.println("Warning: resetting duringFlatExpressions");
            duringFlatExpressions = 0;
        }
        if(duringExtractSampleExpressions != 0) {
            System.out.println("Warning: resetting duringExtractSampleExpressions");
            duringExtractSampleExpressions = 0;
        }
        if(duringConnections != 0) {
            System.out.println("Warning: resetting duringConnections");
            duringConnections = 0;
        }
        if(duringInstanceTreeConstruction != 0) {
            System.out.println("Warning: resetting duringInstanceTreeConstruction");
            duringInstanceTreeConstruction = 0;
        }
        if(duringInstNameClassification != 0) {
            System.out.println("Warning: resetting duringInstNameClassification");
            duringInstNameClassification = 0;
        }
        if(duringInstResolveAmbiguousNames != 0) {
            System.out.println("Warning: resetting duringInstResolveAmbiguousNames");
            duringInstResolveAmbiguousNames = 0;
        }
        if(duringInitialTransformations != 0) {
            System.out.println("Warning: resetting duringInitialTransformations");
            duringInitialTransformations = 0;
        }
        if(duringPredefinedTypes != 0) {
            System.out.println("Warning: resetting duringPredefinedTypes");
            duringPredefinedTypes = 0;
        }

    }


}
