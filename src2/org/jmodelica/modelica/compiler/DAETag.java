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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/GenericCodeGen/src/jastadd/DAETag.jrag:30
 */
public abstract class DAETag extends AbstractTag {
    protected  void setOptions(String... opts) {
        options = opts;
    }

    protected  void addOptions(String... opts) {
	    if (options.length == 0) {
	        options = opts;
	    } else {
	        String[] old = options;
	        options = new String[old.length + opts.length];
            System.arraycopy(old, 0, options, 0, old.length);
            System.arraycopy(opts, 0, options, old.length, opts.length);
	    }
	}

    public  boolean isActive() {
        if (!optionsChecked) 
            active = checkOptions();
        return active;
    }

    private  boolean checkOptions() {
        optionsChecked = true;
        for (String opt : options) {
            boolean flip = false;
            if (opt.charAt(0) == '!') {
                flip = true;
                opt = opt.substring(1);
            }
            if (fclass.myOptions().getBooleanOption(opt) == flip)
                return false;
        }
        return true;
    }

    public  FClass getFClass() {
		return fclass;
	}

    protected  void instantiateTags(Map<String,AbstractTag> map) {
		instantiateTags(getClass(), map, this, myGenerator, fclass);
	}

    protected  FClass fclass;

    private  String[] options;

    private  boolean optionsChecked;

    private  boolean active;

    public  DAETag(String name, AbstractGenerator myGenerator, FClass fclass) {
		super(name, myGenerator);
		this.fclass = fclass;
        options = new String[0];
        optionsChecked = false;
	}

    public abstract  class CodeSplitter<T> {
        private int itemIndex = 0;
        private int itemLimit = 1000;
        private int splitCount = 0;
        private String funcName;
        protected CodeStream str;
        protected CodePrinter p;
        protected String indent;
        protected boolean allowDirect;
        
        private ArrayList<T> elements = new ArrayList<T>();
        
        public CodeSplitter(CodePrinter p, CodeStream str, String indent, boolean allowDirect, String funcName) {
            this(p, str, indent, allowDirect, funcName, new ArrayList<T>());
        }
        
        public CodeSplitter(CodePrinter p, CodeStream str, String indent,
                boolean allowDirect, String funcName, ArrayList<T> elements) {
            this.funcName = funcName;
            this.str = str;
            this.p = p;
            this.indent = indent;
            this.elements = elements;
            this.allowDirect = allowDirect;
        }
        
        public Collection<T> getElements() {
            return elements;
        }

        public void add(Collection<T> coll) {
            elements.addAll(coll);
        }
        
        public void add(T fv) {
            elements.add(fv);
        }
        
        private int numSplits() {
            int s = elements.size();
            if (allowDirect && s < itemLimit) {
                s = 0;
            } else if (s > 0) {
                s = 1 + ((s-1) / itemLimit);
            }
            return s;
        }
        
        public void printStatusDecl() {
            str.print(indent + "int ef = 0;\n");
        }
        
        public void printStatusReturn() {
            str.print(indent + "return ef;\n");
        }
        
        public void genFuncs() {
            for (int split = 0; split < numSplits(); split++) {
                str.print("int ");
                str.print(funcName);
                str.print(split);
                str.print("(jmi_t* jmi) {\n");
                printStatusDecl();
                int n = Math.min(itemLimit, elements.size()-split*itemLimit);
                gen(split*itemLimit, n);
                printStatusReturn();
                str.print("}\n\n");
            }
        }
        
        public void genCalls() {
            int n = numSplits();
            if (n == 0) {
                gen(0, elements.size());
            }
            for (int split = 0; split < n; split++) {
                str.print(indent);
                str.print("ef |= ");
                str.print(funcName);
                str.print(split);
                str.print("(jmi);\n");
            }
        }
        
        protected void gen(int start, int n) {
            for (int i = start; i < start + n; i++) {
                genDecl(elements.get(i));
            }
            for (int i = start; i < start + n; i++) {
                genPre(elements.get(i));
            }
            for (int i = start; i < start + n; i++) {
                gen(elements.get(i));
            }
            for (int i = start; i < start + n; i++) {
                genPost(elements.get(i));
            }
        }
        
        public abstract void genDecl(T element);
        public void genPre(T element) {}
        public abstract void gen(T element);
        public void genPost(T element) {}
    }


}
