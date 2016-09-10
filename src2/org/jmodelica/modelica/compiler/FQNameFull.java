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
 * A full FQName, with a list of FQNameParts.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:450
 * @production FQNameFull : {@link FQName} ::= <span class="component">{@link FQNamePart}*</span>;

 */
public class FQNameFull extends FQName implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:420
     */
    public FArraySubscripts createFArraySubscriptsForPart(int i) {
		FQNamePart part = getFQNamePart(i);
		return part.hasFArraySubscripts() ? part.getFArraySubscripts() : new FArraySubscripts();
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1992
     */
    public FQName specify(Index i, boolean scalarize) {
		FQNameFull res = new FQNameFull();
		int[] dim = new int[1];
		int np = getNumFQNamePart();
		for (int j = 0; j < np; j++) {
			FQNamePart part = getFQNamePart(j);
			int n = part.numFSubscripts();
			if (n == 0 && j == np - 1)
				n = i.ndims() - dim[0];
			FArraySubscripts newfas = null;
			if (n > 0) {
				boolean hasfas = part.hasFArraySubscripts();
				newfas = new FArraySubscripts();
				FArraySubscripts oldfas = hasfas ? part.getFArraySubscripts() : null;
				for (int k = 0; k < n; k++) {
					FSubscript fs = hasfas ?
							oldfas.getFSubscript(k).createSpecified(i, dim) :
							new FIntegerSubscript(i.get(dim[0]++));
					newfas.addFSubscript(fs);
				}
                // If this is last part, append the rest of i to newfas
                while (j == np - 1 && dim[0] < i.ndims())
                    newfas.addFSubscript(i.get(dim[0]++));
			}
			FQNamePart newpart = (newfas == null) ? 
					new FQNamePart(part.getName()) : 
					new FQNamePartArray(part.getName(), newfas);
			res.addFQNamePart(newpart);
		}
		res.scalarized = scalarize;
		return res;
	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2424
     */
    public FQNameFull resolveSubscripts(VariableEvaluator evaluator) {
        FQNameFull res = new FQNameFull();
        for (FQNamePart part : getFQNameParts())
          res.addFQNamePart(part.resolveSubscripts(evaluator));
        return res;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4062
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right, FIdUse context) {
        FFunctionVariable var = (FFunctionVariable) context.lookupOutermostFV(this);
        FQNamePart firstPart = getFQNamePart(0);
        CValue val = var.type().assignToPartInFuncEval(firstPart, var.evaluationValue(evaluator), right);
        evaluator.setEvaluationValue(var, val);
    }
    /**
     * Constructs an FQName by splitting the given name into name parts.
     * 
     * Does <em>not</em> parse array subscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:270
     */
    public FQNameFull(String name) {
        this(name.split("\\."));
    }
    /**
     * Constructs an FQName with the given name parts (without any subscripts).
     * 
     * Does <em>not</em> parse array subscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:279
     */
    public FQNameFull(String... name) {
        this(new List());
        for (String part : name)
            addFQNamePart(part);
    }
    /**
     * Creates and adds a new FQNamePart without array subscripts.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:288
     */
    public void addFQNamePart(String name) {
    	addFQNamePart(new FQNamePart(name));
    }
    /**
     * Constructs an FQName by splitting the given name into name parts and adding array subscripts.
     * 
     * Does <em>not</em> parse array subscripts.
     * 
     * @param fas  the array subscripts to set for the last name part
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:299
     */
    public FQNameFull(String name, FArraySubscripts fas) {
		this(name);
		addFArraySubscripts(fas);
	}
    /**
     * Get a string representation of a prefix of this name.
     * 
     * @param n     the number of parts to include. If <code>n <= 0</code>, then 
     * all but the last <code>-n</code> parts are included.
     * @param op    if not <code>null</code>, generate a name with an operator applied (e.g. "der(a.b)")
     * @param eval  if <code>true</code>, then evaluate all expressions first
     * @param index if greater or equal to two, then the index added as a second argument (eg "der(a.b,2)").
     * This only works if op is not null. 
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:146
     */
    private String prefixName(int n, String op, boolean eval, int index) {
        int tot = getNumFQNamePart();
        if (n <= 0)
            n = tot + n;
        StringBuilder str = new StringBuilder();
        if (op != null) {
            str.append(op);
            str.append("(");
        }
        for (int i = 0; i < n; i++) {
            FQNamePart part = getFQNamePart(i);
            boolean last = i == n - 1;
            str.append(part.getName());
            if ((!last || op != null || isScalarized()) && part.hasFArraySubscripts()) {
                FArraySubscripts fas = part.getFArraySubscripts();
                if (eval)
                    fas = fas.createEvaluated();
                str.append(fas);
            }
            if (!last) 
                str.append(".");
        }
        if (op != null) {
            if (index > 1) {
                str.append(',');
                str.append(index);
            }
            str.append(")");
        }
        return str.toString();
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:561
     */
    public FQNameFull append(String name) {
        addFQNamePart(name);
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:570
     */
    public FQName append(String name, FArraySubscripts fas) {
        if (use(fas)) {
            addFQNamePart(new FQNamePartArray(name, fas));
        } else {
            addFQNamePart(new FQNamePart(name));
        }
        return this;
    }
    /**
     * Copy and append all name parts from <code>fqn</code>.
     * 
     * @return  <code>this</code>, for convenience
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:588
     */
    public FQNameFull append(FQName fqn) {
        return fqn.appendTo(this);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:602
     */
    protected FQNameFull appendTo(FQNameFull fqn) {
        return fqn.appendFull(this);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:606
     */
    protected FQNameFull appendFull(FQNameFull fqn) {
        for (FQNamePart part : fqn.getFQNameParts())
            addFQNamePart(part.fullCopy());
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:625
     */
    public FQNameFull copyAndAppend(String name) {
        return fullCopy().append(name);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:669
     */
    public FQNameFull copyAsFQNameFull() {
        return fullCopy();
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:682
     */
    public FQNameFull asFQNameFull() {
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:699
     */
    public FQNameFull copyAndPrepend(String name) {
        FQNameFull res = new FQNameFull(name);
        int n = res.getNumFQNamePart();
        for (int i = getNumFQNamePart() - 1; i >= 0; i--)
            res.setFQNamePart(getFQNamePart(i).fullCopy(), i + n);
        return res;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:733
     */
    public FQNameFull copyAndAddPrefix(String prefix, boolean removeUnderscore) {
        FQNameFull res = fullCopy();
        String name = res.getFQNamePart(0).getName();
        if (removeUnderscore && name.startsWith("_")) {
            name = name.substring(1);
        }
        res.getFQNamePart(0).setName(prefix + name);
        return res;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:756
     */
    public FQName copyAndAppend(FQName name) {
        return fullCopy().append(name);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:773
     */
    public FQName copyAndAddSubscript(FSubscript s) {
        return fullCopy().addSubscript(s);
    }
    /**
     * Add new FSubscript to the last name part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:780
     */
    public FQName addSubscript(FSubscript s) {
        int i = getNumFQNamePart() - 1;
        setFQNamePart(getFQNamePart(i).addSubscript(s), i);
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:820
     */
    public FQName copyAndAddFas(FArraySubscripts fas) {
        return fullCopy().addFArraySubscripts(fas);
    }
    /**
     * Set the FArraySubscripts of the last FQNamePart.
     * 
     * Passing null as fas is equivalent to calling {@link #removeFArraySubscripts()}.
     * 
     * @return  <code>this</code>, for convenience
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:842
     */
    public FQNameFull addFArraySubscripts(FArraySubscripts fas) {
        if (fas == null)
            return removeFArraySubscripts();
        int i = getNumFQNamePart() - 1;
        setFQNamePart(new FQNamePartArray(getFQNamePart(i).getName(), fas), i);
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:859
     */
    public FQNameFull removeFArraySubscripts() {
        int i = getNumFQNamePart() - 1;
        if (getFQNamePart(i).hasFArraySubscripts())
            setFQNamePart(new FQNamePart(getFQNamePart(i).getName()), i);
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:959
     */
    public FQName copyPart(int first, int last) {
        if (last < first)
            return new FQNameEmpty();
        if (last == first)
            return getFQNamePart(first).createFQName();
        FQNameFull res = new FQNameFull();
        for (int i = first; i <= last; i++)
            res.addFQNamePart(getFQNamePart(i).fullCopy());
        return res;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:996
     */
    public FQName copyWithoutSubscripts() {
        FQNameFull res = new FQNameFull();
        for (FQNamePart part : getFQNameParts())
            res.addFQNamePart(part.getName());
        return res;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1015
     */
    public FQName copyReplacingSubscripts(Index i) {
        FQNameFull res = new FQNameFull();
        int j = 0;
        for (FQNamePart part : getFQNameParts()) 
            j = part.appendWithReplacedSubscripts(res, i, j);
        return res;
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1251
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		for (int i = 0, n = getNumFQNamePart(); i < n; i++) {
			p.print(getFQNamePart(i), str, indent);
			if (i < n - 1)
				str.print(".");
		}    	
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2025
     */
    public void removeFromUses() {
		for (FQNamePart p : getFQNameParts())
			if (p.hasFArraySubscripts())
				for (FSubscript s : p.getFArraySubscripts().getFSubscripts())
					s.removeFromUses();
	}
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:614
     */
    public void preventEvents() {
        for (FQNamePart part : getFQNameParts())
            if (part.hasFArraySubscripts())
                for (FSubscript s : part.getFArraySubscripts().getFSubscripts())
                    s.preventEvents();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:905
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        for (FQNamePart part : getFQNameParts())
            if (part.hasFArraySubscripts())
                part.getFArraySubscripts().inlineFunctions(fi);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1585
     */
    public FQName copyWithNonLiteralSubscriptsAsColon() {
        FQNameFull res = new FQNameFull();
        for (FQNamePart p : getFQNameParts()) {
            res.addFQNamePartNoTransform(p.copyWithNonLiteralSubscriptsAsColon());
        }
        return res;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1634
     */
    public FArraySubscripts copyNonLiteralSubscripts() {
        FArraySubscripts fas = new FArraySubscripts();
        for (FQNamePart p : getFQNameParts()) {
            p.copyNonLiteralSubscriptsTo(fas);
        }
        return fas;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1118
     */
    public FExp scalarRecordFExpForCon(Map<String,FExp> indexMap, FRecordConstructor con) {
		FQNamePart first = getFQNamePart(0);
        FExp arg = con.component(first.getName());
		if (first.hasFArraySubscripts())
		    arg = arg.extractArrayCell(indexMap, first.getFArraySubscripts().asIndex());
		return copySuffix().scalarRecordFExp(indexMap, arg);
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1568
     */
    public FQName scalarize(Map<String,FExp> indexMap) {
		FQNameFull fqn = new FQNameFullScalarize(new List());
		for (FQNamePart fqnp : getFQNameParts()) 
			fqn.addFQNamePart(fqnp.scalarize(indexMap));
		fqn.scalarized = true;
		return fqn;
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:467
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		for (FQNamePart np : getFQNameParts())
			np.prettyPrint_XML(str,p.indent(indent));
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:149
     */
    @Override
	public String genRecordUse_var_CAD(CodePrinter p, FAbstractVariable fv, String type) {
		FQNamePart part = getFQNamePart(0);
		FArraySubscripts fas = part.hasFArraySubscripts() ? part.getFArraySubscripts() : null;
		String res = fv.genUse_var_CAD(p, fas, C_ARRAY_RECORD);
		for (int i = 1, n = getNumFQNamePart(); i < n; i++) {
			part = getFQNamePart(i);
			res = res + "->" + part.getName();
			if (part.hasFArraySubscripts()) {
				String curType = (n - i > 1 ? C_ARRAY_RECORD : type);
				res = part.getFArraySubscripts().genFunctionArrayUse_C(p, res, curType);
			}
		}
		return res;
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:172
     */
    @Override
	public String genRecordUse_der_CAD(CodePrinter p, FAbstractVariable fv, String type) {
		FQNamePart part = getFQNamePart(0);
		FArraySubscripts fas = part.hasFArraySubscripts() ? part.getFArraySubscripts() : null;
		String res = fv.genUse_der_CAD(p, fas, C_ARRAY_RECORD);
		for (int i = 1, n = getNumFQNamePart(); i < n; i++) {
			part = getFQNamePart(i);
			res = res + "->" + part.getName();
			if (part.hasFArraySubscripts()) {
				String curType = (n - i > 1 ? C_ARRAY_RECORD : type);
				res = part.getFArraySubscripts().genFunctionArrayUse_C(p, res, curType);
			}
		}
		return res;
	}
    /**
     * Helper, generates an record variable use
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:579
     */
    @Override
    public String genRecordUse_C(CodePrinter p, FAbstractVariable fv, String type) {
        FQNamePart part = getFQNamePart(0);
        FArraySubscripts fas = part.hasFArraySubscripts() ? part.getFArraySubscripts() : null;
        String res = fv.genUse_C(p, fas, C_ARRAY_RECORD);
        for (int i = 1, n = getNumFQNamePart(); i < n; i++) {
            part = getFQNamePart(i);
            res = res + "->" + part.getName();
            if (part.hasFArraySubscripts()) {
                String curType = (n - i > 1 ? C_ARRAY_RECORD : type);
                res = part.getFArraySubscripts().genFunctionArrayUse_C(p, res, curType);
            }
        }
        return res;
    }
    /**
     * @declaredat ASTNode:1
     */
    public FQNameFull() {
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
    public FQNameFull(List<FQNamePart> p0) {
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
        size_reset();
        name_reset();
        resolvedName_reset();
        derName_int_reset();
        dynDerName_int_reset();
        preName_reset();
        nameUnderscore_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:51
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public FQNameFull clone() throws CloneNotSupportedException {
        FQNameFull node = (FQNameFull) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public FQNameFull copy() {
        try {
            FQNameFull node = (FQNameFull) clone();
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
     * @declaredat ASTNode:83
     */
    public FQNameFull fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public FQNameFull treeCopyNoTransform() {
        FQNameFull tree = (FQNameFull) copy();
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
     * @declaredat ASTNode:112
     */
    public FQNameFull treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:119
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FQNamePart list.
     * @param list The new list node to be used as the FQNamePart list.
     * @apilevel high-level
     */
    public void setFQNamePartList(List<FQNamePart> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FQNamePart list.
     * @return Number of children in the FQNamePart list.
     * @apilevel high-level
     */
    public int getNumFQNamePart() {
        return getFQNamePartList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FQNamePart list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FQNamePart list.
     * @apilevel low-level
     */
    public int getNumFQNamePartNoTransform() {
        return getFQNamePartListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FQNamePart list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FQNamePart list.
     * @apilevel high-level
     */
    public FQNamePart getFQNamePart(int i) {
        return (FQNamePart) getFQNamePartList().getChild(i);
    }
    /**
     * Check whether the FQNamePart list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFQNamePart() {
        return getFQNamePartList().getNumChild() != 0;
    }
    /**
     * Append an element to the FQNamePart list.
     * @param node The element to append to the FQNamePart list.
     * @apilevel high-level
     */
    public void addFQNamePart(FQNamePart node) {
        List<FQNamePart> list = (parent == null || state == null) ? getFQNamePartListNoTransform() : getFQNamePartList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFQNamePartNoTransform(FQNamePart node) {
        List<FQNamePart> list = getFQNamePartListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FQNamePart list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFQNamePart(FQNamePart node, int i) {
        List<FQNamePart> list = getFQNamePartList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FQNamePart list.
     * @return The node representing the FQNamePart list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FQNamePart")
    public List<FQNamePart> getFQNamePartList() {
        List<FQNamePart> list = (List<FQNamePart>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FQNamePart list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FQNamePart list.
     * @apilevel low-level
     */
    public List<FQNamePart> getFQNamePartListNoTransform() {
        return (List<FQNamePart>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FQNamePart list.
     * @return The node representing the FQNamePart list.
     * @apilevel high-level
     */
    public List<FQNamePart> getFQNameParts() {
        return getFQNamePartList();
    }
    /**
     * Retrieves the FQNamePart list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FQNamePart list.
     * @apilevel low-level
     */
    public List<FQNamePart> getFQNamePartsNoTransform() {
        return getFQNamePartListNoTransform();
    }
    /**
     * Get array dimensions.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:498
     */
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        try {
        		// Only look at the array subscripts for the last FQNamePart,
        		// all other array subscripts has been expanded in the instantiation.
        		FQNamePart last = getFQNamePart(getNumFQNamePart() - 1);
        		if (last.hasFArraySubscripts()) {
        			return last.getFArraySubscripts().ndims(); 
        		} else {
        			return 0;
        		}
        	}
        finally {
        }
    }
    /**
     * Get array dimensions of an identifier when used in an identifier.
     * 
     * Here it is not sufficient to check the number of subscripts; the 
     * identifier x[1] has the dimension 0, not 1.
     * 
     * A value > 0 indicates an array, 0 indicates a scalar and -1 indicates
     * an error in computation of the array dimensions.
     * 
     * @return Array dimension.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:521
     */
    @ASTNodeAnnotation.Attribute
    public int accessNdims() {
        ASTNode$State state = state();
        try {
                int res = 0;
                for (FQNamePart fqnp : getFQNameParts()) {
                    res = res + fqnp.accessNdims();
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = size_compute();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    private Size size_compute() {
    		FQNamePart last = getFQNamePart(getNumFQNamePart()-1);
    		if (last.hasFArraySubscripts()) {
    			return last.getFArraySubscripts().declarationSize(); 
    		} else {
    			return Size.SCALAR;
    		}
    	}
    /**
     * @attribute syn
     * @aspect CircularExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4772
     */
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        try {
        		for (FQNamePart part : getFQNameParts())
        			if (part.isCircular())
        				return true;
        		return false;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2452
     */
    @ASTNodeAnnotation.Attribute
    public FAttribute findHierarchicalAttribute(FQNameFull prefix, FVariable var, int n) {
        ASTNode$State state = state();
        try {
                int i = prefix.numMatchingParts(this);
                if (i >= n)
                    return null;
                FAttribute attr = var.findAttribute(getFQNamePart(i).getName());
                for (i++; i < n && attr != null; i++)
                    attr = attr.findAttribute(getFQNamePart(i).getName());
                return attr;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FQNamePart lastFQNamePart() {
        ASTNode$State state = state();
        FQNamePart lastFQNamePart_value = getFQNamePart(getNumFQNamePart()-1);

        return lastFQNamePart_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = lastFQNamePart().hasFArraySubscripts();

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = lastFQNamePart().getFArraySubscripts();

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String partName(int i) {
        ASTNode$State state = state();
        String partName_int_value = getFQNamePart(i).getName();

        return partName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String prefixActualPartName() {
        ASTNode$State state = state();
        String prefixActualPartName_value = prefixName(-1, null, false, -1);

        return prefixActualPartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numParts() {
        ASTNode$State state = state();
        int numParts_value = getNumFQNamePart();

        return numParts_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDots() {
        ASTNode$State state = state();
        int numDots_value = getNumFQNamePart() - 1;

        return numDots_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:236
     */
    @ASTNodeAnnotation.Attribute
    public int numMatchingParts(FQNameFull fqn) {
        ASTNode$State state = state();
        try {
                int n = getNumFQNamePart();
                for (int i = 0; i < n; i++)
                    if (!getFQNamePart(i).getName().equals(fqn.getFQNamePart(i).getName()))
                        return i;
                return n;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean name_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_value;
    /**
     * @apilevel internal
     */
    private void name_reset() {
        name_computed = false;
        name_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        if(name_computed) {
            return name_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_value = prefixName(0, null, false, -1);
        if (isFinal && num == state().boundariesCrossed) {
            name_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean resolvedName_computed = false;
    /**
     * @apilevel internal
     */
    protected String resolvedName_value;
    /**
     * @apilevel internal
     */
    private void resolvedName_reset() {
        resolvedName_computed = false;
        resolvedName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String resolvedName() {
        if(resolvedName_computed) {
            return resolvedName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        resolvedName_value = prefixName(0, null, true, -1);
        if (isFinal && num == state().boundariesCrossed) {
            resolvedName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return resolvedName_value;
    }
    protected Map derName_int_values;
    /**
     * @apilevel internal
     */
    private void derName_int_reset() {
        derName_int_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public String derName(int index) {
        Object _parameters = Integer.valueOf(index);
        if (derName_int_values == null) derName_int_values = new HashMap(4);
        if(derName_int_values.containsKey(_parameters)) {
            return (String)derName_int_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        String derName_int_value = prefixName(0, DER, false, index);
        if (isFinal && num == state().boundariesCrossed) {
            derName_int_values.put(_parameters, derName_int_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derName_int_value;
    }
    protected Map dynDerName_int_values;
    /**
     * @apilevel internal
     */
    private void dynDerName_int_reset() {
        dynDerName_int_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public String dynDerName(int index) {
        Object _parameters = Integer.valueOf(index);
        if (dynDerName_int_values == null) dynDerName_int_values = new HashMap(4);
        if(dynDerName_int_values.containsKey(_parameters)) {
            return (String)dynDerName_int_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        String dynDerName_int_value = prefixName(0, DYN_DER, false, index);
        if (isFinal && num == state().boundariesCrossed) {
            dynDerName_int_values.put(_parameters, dynDerName_int_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dynDerName_int_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean preName_computed = false;
    /**
     * @apilevel internal
     */
    protected String preName_value;
    /**
     * @apilevel internal
     */
    private void preName_reset() {
        preName_computed = false;
        preName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String preName() {
        if(preName_computed) {
            return preName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        preName_value = prefixName(0, PRE, false, -1);
        if (isFinal && num == state().boundariesCrossed) {
            preName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return preName_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:313
     */
    @ASTNodeAnnotation.Attribute
    public String scalarName(boolean eval) {
        ASTNode$State state = state();
        try {
                boolean scalar = scalarized;
                scalarized = true;
                String res = prefixName(0, null, eval, -1);
                scalarized = scalar;
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean nameUnderscore_computed = false;
    /**
     * @apilevel internal
     */
    protected String nameUnderscore_value;
    /**
     * @apilevel internal
     */
    private void nameUnderscore_reset() {
        nameUnderscore_computed = false;
        nameUnderscore_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        if(nameUnderscore_computed) {
            return nameUnderscore_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        nameUnderscore_value = nameUnderscore_compute();
        if (isFinal && num == state().boundariesCrossed) {
            nameUnderscore_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return nameUnderscore_value;
    }
    /**
     * @apilevel internal
     */
    private String nameUnderscore_compute() {
            StringBuilder str = new StringBuilder();
            int i = 0;
            int last = getNumFQNamePart() - 1;
            String sep = "";
            for (FQNamePart part : getFQNameParts()) {
                str.append(sep);
                sep = "_";
                str.append(part.nameUnderscore());
                if ((i < last || isScalarized()) && part.hasFArraySubscripts()) {
                    for (FSubscript fs : part.getFArraySubscripts().getFSubscripts()) {
                        str.append(sep);
                        str.append(fs.prettyPrint(""));
                    }
                }
            }
            return str.toString();
        }
    @ASTNodeAnnotation.Attribute
    public boolean isSimple() {
        ASTNode$State state = state();
        boolean isSimple_value = false;

        return isSimple_value;
    }
    /**
     * Check if this name has any expression or colon array subscripts. 
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:518
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        try {
                for (FQNamePart part : getFQNameParts())
                    if (part.hasNonLiteralSubscripts())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:57
     */
    @ASTNodeAnnotation.Attribute
    public Size calcMySize(int i) {
        ASTNode$State state = state();
        try {
                if (numParts() > 1) {
                    int j;
                    FAbstractVariable fv = null;
                    FQNameFull fqn = new FQNameFull();
                    fqn.parent = this;
                    for (j = 0; j < i; j++) {
                        fqn.addFQNamePart(getFQNamePart(j).copyFirstElement());
                        fv = lookupFV(fqn);
                        if (!fv.isUnknown()) {
                            break;
                        }
                    }
                    return fv.lookupHierarchicalSize(this, j, i);
                }
                return super.calcMySize(i);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:178
     */
    @ASTNodeAnnotation.Attribute
    public List<FQNamePart> buildAccessContext() {
        ASTNode$State state = state();
        try {
                FQNamePart last = getFQNamePart(getNumFQNamePart()-1);
                return last.buildAccessContext(last.name(), null);
            }
        finally {
        }
    }
    /**
     * Return a new name that has index instead of the first array subscript with ndims() > 1.
     * 
     * If name has no subscripts, a set of subscripts with all colons is first created.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1454
     */
    @ASTNodeAnnotation.Attribute
    public FQName splitArrayAccess(int index) {
        ASTNode$State state = state();
        try {
                FQNameFull res = fullCopy();
                int i = getNumFQNamePart();
                res.setFQNamePart(getFQNamePart(i - 1).splitArrayAccess(index, ndims()), i - 1);
                return res;
            }
        finally {
        }
    }
    /**
     * Check if this is a slice operation.
     * @attribute syn
     * @aspect Slices
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1087
     */
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        try {
            	int n = getNumFQNamePart() - 1;
            	for (int i = 0; i < n; i++) {
            		FQNamePart part = getFQNamePart(i);
            		if (part.hasFArraySubscripts())
            			for (FSubscript fs : part.getFArraySubscripts().getFSubscripts())
            				if (fs.ndims() > 0)
            					return true;
            	}
        		FQNamePart part = getFQNamePart(n);
                return part.hasFArraySubscripts() && part.getFArraySubscripts().isSlice();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:655
     */
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        try {
                for (FQNamePart part : getFQNameParts())
                    if (part.hasFArraySubscripts())
                        for (FSubscript s : part.getFArraySubscripts().getFSubscripts())
                            if (s.generatesEvents())
                                return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:719
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        try {
                for (FQNamePart part : getFQNameParts())
                    if (part.hasFArraySubscripts())
                        for (FSubscript sub : part.getFArraySubscripts().getFSubscripts())
                            if (sub.hasInlinableFunctions(fi))
                                return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4121
     * @apilevel internal
     */
    public CommonNamePart Define_nextNamePart(ASTNode caller, ASTNode child) {
        if (caller == getFQNamePartListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getNumFQNamePart() > i + 1 ? getFQNamePart(i + 1) : null;
        }
        else {
            return getParent().Define_nextNamePart(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:871
     * @apilevel internal
     */
    public FQName Define_partialName(ASTNode caller, ASTNode child) {
        if (caller == getFQNamePartListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == getNumFQNamePart() - 1) ? this : copyPrefix();
        }
        else {
            return getParent().Define_partialName(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:51
     * @apilevel internal
     */
    public Size Define_mySize(ASTNode caller, ASTNode child) {
        if (caller == getFQNamePartListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return calcMySize(i+1);
        }
        else {
            return getParent().Define_mySize(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:215
     * @apilevel internal
     */
    public List<FQNamePart> Define_accessContextFlat(ASTNode caller, ASTNode child) {
        if (caller == getFQNamePartListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i == 0 ? new List<FQNamePart>() : getFQNamePart(i-1).buildAccessContext();
        }
        else {
            return getParent().Define_accessContextFlat(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
