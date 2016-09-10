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
 * @ast node
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> extends Symbol implements Cloneable, ReporterNode, Iterable<T> {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:382
     */
    
        public static <T> ArrayList<T> concatenation(java.util.List<T>... lists) {
			int size = 0;
			for (java.util.List<T> list : lists)
				size += list.size();
			ArrayList<T> res = new ArrayList<T>(size);
			for (java.util.List<T> list : lists)
				res.addAll(list);
			return res;
		}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1169
     */
    public void flushForScalarization(boolean removeTempNames) {
        flushAllRecursive();
        if (removeTempNames) {
            flushTempVarNames();
        }
    }
    /**
     * Replaces all uses of indices in <code>indexMap</code> with the respective expressions.
     * 
     * May alter the tree below this.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1181
     */
    protected ASTNode replaceIndices(Map<String,FExp> indexMap) {
		ASTNode res = replaceFromIndexMap(indexMap);
		if (this == res) {
			for (int i = 0, n = getNumChild(); i < n; i++) {
				ASTNode sub = getChild(i);
				ASTNode repl = sub.replaceIndices(indexMap);
				if (repl != sub)
					setChild(repl, i);
			}
		}
		return res;
	}
    /**
     * If this node is a use of an index in <code>indexMap</code>, return the 
     * respective expression, otherwise return <code>this</code>.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1202
     */
    protected ASTNode replaceFromIndexMap(Map<String,FExp> indexMap) {
		return this;
	}
    /**
     * @aspect ArrayHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:4503
     */
    public static int[] range(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i + 1;
        }
        return res;
    }
    /**
     * Prepare a function fro being function evaluation.
     * 
     * This entails: 
     * <ul>
     * <li>Make sure all size() attributes are calculated.</li>
     * <li>Clear cached getArray() values for expressions with unknown size.</li>
     * </ul>
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3416
     */
    public void prepareForFunctionEval() {
	  for (ASTNode n : this)
		  n.prepareForFunctionEval();
  }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3880
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        for (ASTNode n : this)
            map = n.collectEvaluationValues(map);
        return map;
    }
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4904
     */
    public static VariableEvaluator defaultVariableEvaluator() {
        return VariableEvaluator.instance;
    }
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:557
     */
    
        public static <T> T[] arr(T... args) { 
            return args;
        }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2042
     */
    public Set<FIdUseExp> findFIdUseExpsInTree() {
        return findFIdUseExpsInTree(DefaultFidUseExpLookupVisitor.instance);
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2046
     */
    public Set<FIdUseExp> findFIdUseExpsInTree(FIdUseExpLookupVisitor visitor) {
        Set<FIdUseExp> set = new LinkedHashSet<FIdUseExp>();
        visitor.visit(this, set);
        return set;
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2052
     */
    public void findFIdUseExpsInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        for (ASTNode n : this) {
            visitor.visit(n, set);
        }
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2174
     */
    public static Set<FVariable> lookupFVariablesInSet(Set<FIdUseExp> set) {
        Set<FVariable> res = new LinkedHashSet<FVariable>();
        for (FIdUseExp use : set)
            if (use.myFV() instanceof FVariable)
                res.add((FVariable) use.myFV());
        return res;
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2203
     */
    public static Set<FVariable> parametersInSet(Set<? extends FVariable> set) {
        Set<FVariable> res = new LinkedHashSet<FVariable>();
        for (FVariable fv : set)
            if (fv.isParameter())
                res.add(fv);
        return res;
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3708
     */
    public static void attributeLevelsForList(List<FAttribute> l, StringBuilder str) {
        if (l.getNumChild() > 0) {
            str.append("(");
            String sep = ", ";
            String pref = "";
            for (FAttribute a : l) {
                str.append(pref);
                a.attributeLevels(str);
                pref = sep;
            }
            str.append(")");
        }
    }
    /**
     * Return unknown if variable is null, variable otherwise.
     * 
     * Convenience method to facilitate one-liners.
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:187
     */
    public FAbstractVariable nullUnknown(FAbstractVariable variable) {
		return (variable == null) ? unknownFVariable() : variable;
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:395
     */
    public static String underScore(String s) {
        return s.replaceAll("[^0-9a-zA-Z_]", "_");
    }
    /**
     * Throw away calculated temp names.
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1788
     */
    public void flushTempVarNames() {
         for (ASTNode n : this)
             n.flushTempVarNames();
     }
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:129
     */
    static PrettyPrinter prettyPrinter = new PrettyPrinter();
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:131
     */
    public void _dumpTree(CodeStream str, String indent) {
 		_dumpTree(new DumpTreePrinter(),str,indent);
	}
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:136
     */
    public void _dumpTree(Printer p, CodeStream str, String indent) {
      str.print(indent + getClass().getSimpleName());
      if(this instanceof StringComment) {
        str.print(": " + ((StringComment)this).tokenString_Comment);
      }
      str.print("\n");
 		for(int i = 0; i < getNumChild(); i++)
   			p.print(getChild(i),str,p.indent(indent)); // distpatch through Printer
	}
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:142
     */
    public String prettyPrint(String indent) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new NotNullCodeStream(os);
		prettyPrint(str, indent);
		return os.toString();
	}
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:154
     */
    public void prettyPrint(CodeStream str,String indent) {
 		prettyPrint(prettyPrinter,str,indent);
	}
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:167
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
  		for (ASTNode n : this)
   			p.print(n, str, indent);
	}
    /**
     * Prints an ArrayList of any type of ASTNode, adding <code>sep</code> between nodes.
     * 
     * Typical use: <code>prettyPrintWithSep(list, p, str, indent, ", ");</code> 
     * (Prints comma-separated list.)
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:200
     */
    public static void prettyPrintWithSep(java.util.List<? extends ASTNode> l, Printer p, CodeStream str, String indent, String sep) {
		String prefix = "";
		for (ASTNode n : l) {
			str.print(prefix);
			p.print(n, str, indent);
			prefix = sep;
		}
	}
    /**
     * Prints an ArrayList of any type of ASTNode, adding <code>prefix</code> before each node and 
     * <code>suffix</code> after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:225
     */
    public static void prettyPrintWithFix(java.util.List<? extends ASTNode> l, Printer p, CodeStream str, String indent, String prefix, String suffix) {
		for (ASTNode n : l) {
			str.print(prefix);
			p.print(n, str, indent);
			str.print(suffix);
		}
	}
    /**
     * Prints an ArrayList of any type of ASTNode, adding <code>indent</code> before each node and 
     * <code>suffix</code> plus a line break after after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:245
     */
    public static void prettyPrintWithIndent(java.util.List<? extends ASTNode> l, Printer p, CodeStream str, String indent, String suffix) {
		prettyPrintWithFix(l, p, str, indent, indent, suffix + "\n");
	}
    /**
     * Prints an ArrayList of any type of ASTNode, adding <code>indent</code> before each node and 
     * a line break after after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:261
     */
    public static void prettyPrintWithIndent(java.util.List<? extends ASTNode> l, Printer p, CodeStream str, String indent) {
		prettyPrintWithFix(l, p, str, indent, indent, "\n");
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2077
     */
    static MCPrettyPrinter printer_MC = new MCPrettyPrinter();
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2079
     */
    public String prettyPrint_MC(String indent) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new CodeStream(os);
		prettyPrint(str,indent);
		return os.toString();
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2206
     */
    public void prettyPrint_MC(CodeStream str, String indent) {
 		prettyPrint_MC(printer_MC, str, indent);
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2210
     */
    public void prettyPrint_MC(Printer p, CodeStream str, String indent) {
 		prettyPrint(p, str, indent);
	}
    /**
     * @aspect AnnotationPrettyPrinting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2243
     */
    public static PrettyPrinter AnnotationPrettyPrinter = new AnnotationPrettyPrinter();
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:277
     */
    public void replaceSizeFExp(InstFunctionCall call) {
        for (ASTNode n : this) {
            n.replaceSizeFExp(call);
        }
    }
    /**
     * Create a copy of this FExp with variable uses and function calls replaced with expressions 
     * that allow calculations of unknown sizes.
     * 
     * For non-FExp nodes, this simply makes a full copy.
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:485
     */
    public ASTNode copyReplaceAccess(FExp.ContextReplacer crp) {
        return treeCopy();
    }
    /**
     * Convert all continous variables that are assigned in when equations and statements into discrete variables.
     * 
     * @param inWhen  is this node in a when equation?
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:245
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        for (ASTNode n : this) {
            n.updateVariabilityForVariablesInWhen(inWhen);
        }
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:654
     */
    public static FContinuous fContinuous() {
        return FContinuous.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:658
     */
    public static FDiscrete fDiscrete() {
        return FDiscrete.instance;
    }
    /**
     * @deprecated Delegates to fFixedParameter(). Use correct specific parameter sub-variability.
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:665
     */
    public static FParameter fParameter() {
        return fFixedParameter();
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:669
     */
    public static FParameter fInitialParameter() {
        return FInitialParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:673
     */
    public static FParameter fFixedParameter() {
        return FFixedParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:677
     */
    public static FParameter fIndexParameter() {
        return FIndexParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:681
     */
    public static FFinalParameter fFinalParameter() {
        return FFinalParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:685
     */
    public static FEvalParameter fEvalParameter() {
        return FEvalParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:689
     */
    public static FStructParameter fStructParameter() {
        return FStructParameter.instance;
    }
    /**
     * @aspect VariabilitySingletons
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:693
     */
    public static FConstant fConstant() {
        return FConstant.instance;
    }
    /**
     * Check for code that is not allowed in its current context.
     * 
     * Examples would be checking that classes follow the requirements of 
     * their restriction. 
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:31
     */
    public void complianceCheck(ErrorCheckType checkType) {}
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:46
     */
    private static ErrorChecker COMPLIANCE_CHECKER = addErrorChecker(new ErrorChecker.ComplianceChecker());
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:48
     */
    public static final SimpleProblemProducer ONLY_FMU_IF_STATEMENTS =
            new ComplianceFMUOnlyProducer("ONLY_FMU_IF_STATEMENTS", "Using if statements is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:57
     */
    public static final SimpleProblemProducer ONLY_FMU_WHILE_STATEMENTS =
            new ComplianceFMUOnlyProducer("ONLY_FMU_WHILE_STATEMENTS", "Using while statements is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:66
     */
    public static final SimpleProblemProducer UNSUPPORTED_EVENT_GENERATING_EXPRESSION_IN_WHILE_STATEMENT =
            new SimpleErrorProducer("UNSUPPORTED_EVENT_GENERATING_EXPRESSION_IN_WHILE_STATEMENT", ProblemKind.COMPLIANCE, "Event generating expressions are not supported in while statements");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:75
     */
    public static final SimpleProblemProducer ONLY_FMU_FUNCTION_LIKE_OPERATOR =
            new ComplianceFMUOnlyProducer("ONLY_FMU_FUNCTION_LIKE_OPERATOR", "The %s() function-like operator is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:91
     */
    public static final SimpleProblemProducer ONLY_FMU_NON_FIXED_RECORD_ARRAY_INDEX =
            new ComplianceFMUOnlyProducer("ONLY_FMU_NON_FIXED_RECORD_ARRAY_INDEX", "Using arrays of records with indices of higher than parameter variability is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:93
     */
    public static final SimpleProblemProducer EXTERNAL_OBJECT_CONSTANT_FROM_FUNCTION =
            new SimpleErrorProducer("EXTERNAL_OBJECT_CONSTANT_FROM_FUNCTION", ProblemKind.COMPLIANCE, "Access to external object constants is not supported in functions");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:109
     */
    public static final SimpleProblemProducer ONLY_FMU_WHEN_EQUATIONS =
            new ComplianceFMUOnlyProducer("ONLY_FMU_WHEN_EQUATIONS", "When equations are");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:116
     */
    @Deprecated
    public void complianceOnlyFMU(String message) {
        if (!myOptions().getBooleanOption("generate_ode"))
            compliance(message + " currently only supported when compiling FMUs");
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:122
     */
    public static final SimpleProblemProducer UNSUPPORTED_EQUATION_TYPE =
            new SimpleErrorProducer("UNSUPPORTED_EQUATION_TYPE", ProblemKind.COMPLIANCE, "Unsupported equation type");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:129
     */
    public static final SimpleProblemProducer UNSUPPORTED_EXPRESSION_TYPE =
            new SimpleErrorProducer("UNSUPPORTED_EXPRESSION_TYPE", ProblemKind.COMPLIANCE, "Unsupported expression type");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:136
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTION_LIKE_OPERATOR =
            new SimpleErrorProducer("UNSUPPORTED_FUNCTION_LIKE_OPERATOR", ProblemKind.COMPLIANCE, "The %s() function-like operator is not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:171
     */
    public static final SimpleProblemProducer DEPRECATED_DECOUPLE =
            new SimpleWarningProducer("DEPRECATED_DECOUPLE", ProblemKind.SEMANTIC, "The Subtask.decouple() function-like operator is removed as of Modelica version 3.2r2");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:178
     */
    public static final SimpleProblemProducer DEPRECATED_CARDINALITY =
            new SimpleWarningProducer("DEPRECATED_CARDINALITY", ProblemKind.SEMANTIC, "The cardinality() function-like operator is deprecated, and will be removed in a future version of Modelica");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:181
     */
    public static final SimpleProblemProducer INCORRECT_USE_OF_CARDINALITY =
            new SimpleErrorProducer("INCORRECT_USE_OF_CARDINALITY", ProblemKind.COMPLIANCE, "The cardinality() function-like operator is only supported in asserts and in the tests of if clauses that do not contain connect()");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:194
     */
    public static final SimpleProblemProducer INCORRECT_USE_OF_SPATIAL_DISTRIBUTION =
            new SimpleErrorProducer("INCORRECT_USE_OF_SPATIAL_DISTRIBUTION", ProblemKind.COMPLIANCE, "The spatialDistribution() function-like operator is not supported vectorized in function call equations");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:229
     */
    public static final SimpleProblemProducer UNSUPPORTED_IN_FUNCTION_UNKNOWN_SIZE_OPERATOR =
            new SimpleErrorProducer("UNSUPPORTED_IN_FUNCTION_UNKNOWN_SIZE_OPERATOR", ProblemKind.COMPLIANCE, "Unknown sizes in operator %s is not supported in functions");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:242
     */
    public static final SimpleProblemProducer UNSUPPORTED_IN_FUNCTION_UNKNOWN_SIZE_ARRAY_FOR_INDEX =
            new SimpleErrorProducer("UNSUPPORTED_IN_FUNCTION_UNKNOWN_SIZE_ARRAY_FOR_INDEX", ProblemKind.COMPLIANCE, "Unknown size array as a for index is not supported in functions");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:245
     */
    public static final SimpleProblemProducer UNSUPPORTED_FOR_INDEX_WITHOUT_EXPRESSION =
            new SimpleErrorProducer("UNSUPPORTED_FOR_INDEX_WITHOUT_EXPRESSION", ProblemKind.COMPLIANCE, "For index without in expression isn't supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:248
     */
    public static final SimpleProblemProducer UNSUPPORTED_NON_FIXED_FOR_INDEX =
            new SimpleErrorProducer("UNSUPPORTED_NON_FIXED_FOR_INDEX", ProblemKind.COMPLIANCE, "For index with higher than parameter variability is not supported in equations and algorithms");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:274
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTION_LIKE_OPERATOR_IGNORED =
            new SimpleWarningProducer("UNSUPPORTED_FUNCTION_LIKE_OPERATOR_IGNORED", ProblemKind.COMPLIANCE, "The %s() function-like operator is not supported, and is currently ignored");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:281
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTION_LIKE_OPERATOR_EVAL_FALSE =
            new SimpleWarningProducer("UNSUPPORTED_FUNCTION_LIKE_OPERATOR_EVAL_FALSE", ProblemKind.COMPLIANCE, "The %s() function-like operator is not supported, and is currently evaluated to false");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:296
     */
    public static final SimpleProblemProducer UNSUPPORTED_NON_FIXED_STRING_ARGUMENT =
            new SimpleErrorProducer("UNSUPPORTED_NON_FIXED_STRING_ARGUMENT", ProblemKind.COMPLIANCE, "%s with higher than parameter variability is not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:318
     */
    public static final SimpleProblemProducer PARTIALLY_SUPPORTED_STRING_ARGUMENTS =
            new SimpleWarningProducer("PARTIALLY_SUPPORTED_STRING_ARGUMENTS", ProblemKind.COMPLIANCE, "String arguments in functions are only partially supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:320
     */
    public static final SimpleProblemProducer PARTIALLY_SUPPORTED_STRING_PARAMETERS =
            new SimpleWarningProducer("PARTIALLY_SUPPORTED_STRING_PARAMETERS", ProblemKind.COMPLIANCE, "String parameters are only partially supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:322
     */
    public static final SimpleProblemProducer UNSUPPORTED_STRING_VARIABLES =
            new SimpleErrorProducer("UNSUPPORTED_STRING_VARIABLES", ProblemKind.COMPLIANCE, "String variables are not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:324
     */
    public static final SimpleProblemProducer ONLY_FMU_INTEGER_VARIABLES =
            new ComplianceFMUOnlyProducer("ONLY_FMU_INTEGER_VARIABLES", "Integer variables of discrete variability is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:326
     */
    public static final SimpleProblemProducer ONLY_FMU_BOOLEAN_VARIABLES =
            new ComplianceFMUOnlyProducer("ONLY_FMU_BOOLEAN_VARIABLES", "Boolean variables of discrete variability is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:350
     */
    public static final SimpleProblemProducer ONLY_FMU_ENUMERATION_VARIABLES =
            new ComplianceFMUOnlyProducer("ONLY_FMU_ENUMERATION_VARIABLES", "Enumeration variables of discrete variability is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:359
     */
    public static final SimpleProblemProducer ONLY_FMU_FUNCTIONAL_INPUT =
            new ComplianceFMUOnlyProducer("ONLY_FMU_FUNCTIONAL_INPUT", "Using functional input arguments is");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:361
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTIONAL_INPUT_FROM_FUNCTION_DEFAULT =
            new SimpleErrorProducer("UNSUPPORTED_FUNCTIONAL_INPUT_FROM_FUNCTION_DEFAULT", ProblemKind.COMPLIANCE, "Creating functional input arguments from functions with default input arguments is currently not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:363
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTIONAL_INPUT_COMPOSITE =
            new SimpleErrorProducer("UNSUPPORTED_FUNCTIONAL_INPUT_COMPOSITE", ProblemKind.COMPLIANCE, "Functional input arguments with record/array inputs/outputs is currently not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:365
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTIONAL_INPUT_DEFAULT =
            new SimpleErrorProducer("UNSUPPORTED_FUNCTIONAL_INPUT_DEFAULT", ProblemKind.COMPLIANCE, "Default values of functional input arguments is currently not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:367
     */
    public static final SimpleProblemProducer UNSUPPORTED_FUNCTIONAL_ARRAY_INPUT =
            new SimpleErrorProducer("UNSUPPORTED_FUNCTIONAL_ARRAY_INPUT", ProblemKind.COMPLIANCE, "Arrays of functional input arguments is currently not supported");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:397
     */
    public static final SimpleProblemProducer UNSUPPORTED_EXTERNAL_OBJECT_CONSTRUCTORS =
            new SimpleErrorProducer("UNSUPPORTED_EXTERNAL_OBJECT_CONSTRUCTORS", ProblemKind.COMPLIANCE, "Constructors for external objects is not supported in functions");
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:406
     */
    public static final SimpleProblemProducer UNSUPPORTED_EXTERNAL_FUNCTION_RECORD_RETURN_VALUE =
            new SimpleErrorProducer("UNSUPPORTED_EXTERNAL_FUNCTION_RECORD_RETURN_VALUE", ProblemKind.COMPLIANCE, "Using records as return value from external functions is not supported");
    /**
     * Check for code that is not allowed in its current context.
     * 
     * Examples would be checking that classes follow the requirements of 
     * their restriction. 
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:30
     */
    public void contentCheck(ErrorCheckType checkType) {}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:45
     */
    private static ErrorChecker CONTENT_CHECKER = addErrorChecker(new ErrorChecker.ContentChecker());
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:321
     */
    private static final String OK_ESCAPES = "'\"?\\abfnrtv";
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:323
     */
    public void checkEscapeSequences(ASTNode node, String str, String type) {
        for (int p = str.indexOf('\\'); p > -1 && p < str.length(); p = str.indexOf('\\', p + 2))
            if (OK_ESCAPES.indexOf(str.charAt(p + 1)) == -1)
                node.error("Illegal escape sequence at position %d in %s: '\\%c'", p + 1, type, str.charAt(p + 1));
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:329
     */
    public void checkQuotedIdentifier(ASTNode node, String str) {
        if (str.charAt(0) == '\'')
            checkEscapeSequences(node, str, "quoted identifier");
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:747
     */
    public void forceUsesVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        for (ASTNode n : this)
            n.forceUsesVariability(checkType, v);
    }
    /**
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:221
     */
    public void breakOnErrors() throws CompilerException {
		root().getErrorHandler().breakOnErrors();
	}
    /**
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:247
     */
    public ArrayList<Problem> collectWarnings() {
        return root().getErrorHandler().collectWarnings();
    }
    /**
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:284
     */
    public void reportProblem(Problem problem) {
      root().getErrorHandler().problem(problem);
  }
    /**
     * Register an error. Delegates to an {@link IErrorHandler}.
     * @param s	the error message.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:294
     */
    @Deprecated
  public void error(String s) {
	  root().getErrorHandler().error(s, this);
  }
    /**
     * Register an error. Delegates to an {@link IErrorHandler}.
     * 
     * Builds error message using <code>format</code> as format string.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:304
     */
    @Deprecated
  public void error(String format, Object... args) {
	  error(String.format(format, args));
  }
    /**
     * Register a compliance error. Delegates to an {@link IErrorHandler}.
     * @param s	the error message.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:313
     */
    @Deprecated
  public void compliance(String s) {
	  root().getErrorHandler().compliance(s, this);
  }
    /**
     * Register a compliance error. Delegates to an {@link IErrorHandler}.
     * 
     * Builds error message using <code>format</code> as format string.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:323
     */
    @Deprecated
  public void compliance(String format, Object... args) {
	  compliance(String.format(format, args));
  }
    /**
     * Register a warning. Delegates to an {@link IErrorHandler}.
     * @param s	the warning message.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:332
     */
    @Deprecated
  public void warning(String s) {
	  root().getErrorHandler().warning(s, this);
  }
    /**
     * Register a warning. Delegates to an {@link IErrorHandler}.
     * 
     * Builds warning message using <code>format</code> as format string.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:342
     */
    @Deprecated
  public void warning(String format, Object... args) {
	  warning(String.format(format, args));
  }
    /**
     * Register a problem. Delegates to an {@link IErrorHandler}.
     * @param p   the problem.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:351
     */
    @Deprecated
  public void problem(Problem p) {
      root().getErrorHandler().problem(p);
  }
    /**
     * If this node is in a disabled conditional component, generate a warning, otherwise generate an error.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:359
     */
    @Deprecated
    public void errorUnlessDisabled(String s) {
        if (inDisabledComponent()) {
            warning("Found error in disabled conditional:\n  " + s);
        } else {
            error(s);
        }
    }
    /**
     * If this node is in a disabled conditional component, generate a warning, otherwise generate an error.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:371
     */
    @Deprecated
    public void errorUnlessDisabled(String format, Object... args) {
        if (inDisabledComponent()) {
            warning("Found error in disabled conditional:\n  " + format, args);
        } else {
            error(format, args);
        }
    }
    /**
     * If this node is in a disabled conditional component and <code>condition</code> is <code>true</code>, 
     * generate a warning, otherwise generate an error.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:384
     */
    @Deprecated
    public void errorUnlessDisabledAnd(boolean condition, String s) {
        if (condition) {
            errorUnlessDisabled(s);
        } else {
            error(s);
        }
    }
    /**
     * If this node is in a disabled conditional component and <code>condition</code> is <code>true</code>, 
     * generate a warning, otherwise generate an error.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:397
     */
    @Deprecated
    public void errorUnlessDisabledAnd(boolean condition, String format, Object... args) {
        if (condition) {
            errorUnlessDisabled(format, args);
        } else {
            error(format, args);
        }
    }
    /**
     * A list that contains all error checkers. New error checkers are added
     * dynamically during static evaluation by calling addErrorChecker().
     * 
     * @see ASTNode.addErrorChecker(ErrorChecker)
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:513
     */
    private static Collection<ErrorChecker> ERROR_CHECKERS;
    /**
     * Add ErrorChecker checker to the list of error checkers. This method
     * should only be called from ASTnode in order to ensure that the checker
     * is added corretly during static evaluation, hence the private
     * visibility.
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:521
     */
    private static ErrorChecker addErrorChecker(ErrorChecker checker) {
        if (ERROR_CHECKERS == null)
            ERROR_CHECKERS = new ArrayList<ErrorChecker>();
        ERROR_CHECKERS.add(checker);
        return checker;
    }
    /**
     * A helper method that calls all registered error checkers.
     * 
     * @see ASTNode#addErrorChecker(ErrorChecker)
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:533
     */
    protected void allChecks(ErrorCheckType checkType) {
        for (ErrorChecker checker : ERROR_CHECKERS)
            checker.check(this, checkType);
    }
    /**
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:538
     */
    public void collectErrors(ErrorCheckType checkType) {
	  for(int i = 0; i < getNumChild(); i++) {
		  getChild(i).collectErrors(checkType);
	  }
        allChecks(checkType);
  }
    /**
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:546
     */
    public void errorCheck(ErrorCheckType checkType) {
		collectErrors(checkType);
		breakOnErrors();
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:598
     */
    public void resetCollectErrors() {
		for (ASTNode n : noTransform())
			n.resetCollectErrors();
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:603
     */
    public static void resetCollectErrorsOn(ASTNode n) {
		if (n != null)
			n.resetCollectErrors();
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:903
     */
    public static final SimpleProblemProducer PARAMETER_MISSING_BINDING_EXPRESSION =
            new SimpleWarningProducer("PARAMETER_MISSING_BINDING_EXPRESSION", ProblemKind.SEMANTIC, "The parameter %s does not have a binding expression");
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:905
     */
    public static final SimpleProblemProducer CONSTANT_MISSING_BINDING_EXPRESSION =
            new SimpleWarningProducer("CONSTANT_MISSING_BINDING_EXPRESSION", ProblemKind.SEMANTIC, "The constant %s does not have a binding expression");
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1222
     */
    public void collectErrorsInFor(
            ASTNode iterChild, List<? extends CommonForIndex> indices, ErrorCheckType checkType) {
        // Do the checks on the for itself
        allChecks(checkType);
        
        // Check everything except iterChild once
        for (ASTNode ch : this)
            if (ch != iterChild)
                ch.collectErrors(checkType);
        
        // Check array bounds in iterChild for each index combination
        try {
            indices.getChild(0).collectErrorsForAllIndices(indices, 0, iterChild, checkType);
        } catch (ConstantEvaluationException e) {
            // Do "general" check if we are unable to determine the indices.
            // Will probably give incorrect errors. However this is better than
            // passing along errors and then crash!
            iterChild.collectErrors(checkType);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1326
     */
    public static final SimpleProblemProducer NEGATIVE_SIZE_FILL =
        new SimpleErrorProducer("NEGATIVE_SIZE_FILL", ProblemKind.SEMANTIC, "The dimension arguments of the fill()"
                + " operator may not be negative");
    /**
     * @aspect SourceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:21
     */
    public void nameCheck(ErrorCheckType checkType) {}
    /**
     * @aspect SourceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:36
     */
    private static ErrorChecker NAME_CHECKERS = addErrorChecker(new ErrorChecker.NameChecker());
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:108
     */
    public static final SimpleProblemProducer NOT_IN_CONSTRAINING_TYPE =
            new SimpleWarningProducer("NOT_IN_CONSTRAINING_TYPE", ProblemKind.SEMANTIC, 
                    "Access to %s %s not recommended, it is not present in "
                    + "constraining type of declaration '%s'");
    /**
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:186
     */
    public static final SimpleProblemProducer UNABLE_TO_INFER_EQUALITY_FOR_DUPLICATES =
            new SimpleWarningProducer("UNABLE_TO_INFER_EQUALITY_FOR_DUPLICATES", ProblemKind.SEMANTIC,
                    "The component %s is declared multiple times and can not be verified to be identical to other declaration(s) with the same name.");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:30
     */
    public void typeCheck(ErrorCheckType checkType) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:45
     */
    private static ErrorChecker TYPE_CHECKER = addErrorChecker(new ErrorChecker.TypeChecker());
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:47
     */
    public static final SimpleProblemProducer CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS =
            new SimpleErrorProducer("CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS", ProblemKind.SEMANTIC,
                    "In the declaration '%s', the declared class is not a subtype of the constraining class");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:50
     */
    public static final SimpleProblemProducer REPLACING_CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS =
            new SimpleErrorProducer("REPLACING_CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS", ProblemKind.SEMANTIC,
                    "In the declaration '%s', the replacing class is not a subtype of the constraining class from the declaration '%s'");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:53
     */
    public static final SimpleProblemProducer PREV_REDECLARE_NOT_REPLACEABLE =
            new SimpleWarningProducer("PREV_REDECLARE_NOT_REPLACEABLE", ProblemKind.SEMANTIC,
                    "In the declaration '%s', %s can't be redeclared since it has already been redeclared without 'replaceable'");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:150
     */
    public static final SimpleProblemProducer CANNOT_INFER_ARRAY_SIZE_OF_VARIABLE =
            new SimpleErrorProducer("CANNOT_INFER_ARRAY_SIZE_OF_VARIABLE", ProblemKind.SEMANTIC,
                    "Can not infer array size of the variable %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:153
     */
    public static final SimpleProblemProducer CANNOT_INFER_ARRAY_SIZE_OF_FUNCTION_OUTPUT =
            new SimpleErrorProducer("CANNOT_INFER_ARRAY_SIZE_OF_FUNCTION_OUTPUT", ProblemKind.COMPLIANCE,
                    "Can not infer array size of the function output %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:156
     */
    public static final SimpleProblemProducer BINDING_EXPRESSION_TYPE_MISMATCH =
            new SimpleErrorProducer("BINDING_EXPRESSION_TYPE_MISMATCH", ProblemKind.SEMANTIC,
                    "The binding expression of the variable %s does not match the declared type of the variable");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:159
     */
    public static final SimpleProblemProducer ASSUMING_EACH =
            new SimpleWarningProducer("ASSUMING_EACH", ProblemKind.SEMANTIC, "Assuming 'each' for the modification '%s'");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:161
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_DECLARATION =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_DECLARATION", ProblemKind.SEMANTIC,
                    "Array size mismatch in declaration of %s, size of declaration is %s and size of binding expression is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:164
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_MODIFICATION =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_MODIFICATION", ProblemKind.SEMANTIC,
                    "Array size mismatch in modification of %s, expected size is %s and size of binding expression is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:167
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_MODIFICATION_DUE_TO_EACH =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_MODIFICATION_DUE_TO_EACH", ProblemKind.SEMANTIC,
                    "Array size mismatch in modification of %s, expected size is (due to 'each') %s and size of binding expression is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:170
     */
    public static final SimpleProblemProducer NON_SCALAR_CONDITIONAL_GUARD =
            new SimpleErrorProducer("NON_SCALAR_CONDITIONAL_GUARD", ProblemKind.SEMANTIC,
                    "The guard expression of a conditional component should be a scalar expression");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:173
     */
    public static final SimpleProblemProducer NON_BOOLEAN_CONDITIONAL_GUARD =
            new SimpleErrorProducer("NON_BOOLEAN_CONDITIONAL_GUARD", ProblemKind.SEMANTIC,
                    "The guard expression of a conditional component should be a boolean expression");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:176
     */
    public static final SimpleProblemProducer NON_FIXED_CONDITIONAL_GUARD =
            new SimpleErrorProducer("NON_FIXED_CONDITIONAL_GUARD", ProblemKind.SEMANTIC,
                    "The guard expression of a conditional component should have parameter or constant variability");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:254
     */
    public static final SimpleProblemProducer TYPE_MISMATCH_IN_ATTRIBUTE_MODIFICATION =
            new SimpleErrorProducer("TYPE_MISMATCH_IN_ATTRIBUTE_MODIFICATION", ProblemKind.SEMANTIC,
                    "The type of the binding expression of the attribute %s for the %s %s does not match the declared type of the variable");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:257
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION", ProblemKind.SEMANTIC,
                    "Array size mismatch in modification of the attribute %s for the %s %s, expected size is %s and size of %s expression is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:260
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION_DUE_TO_EACH =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION_DUE_TO_EACH", ProblemKind.SEMANTIC,
                    "Array size mismatch in modification of the attribute %s for the %s %s, expected size is (due to 'each') %s and size of %s expression is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:294
     */
    public static final SimpleProblemProducer NOMINAL_EQUAL_TO_ZERO =
            new SimpleErrorProducer("NOMINAL_EQUAL_TO_ZERO", ProblemKind.SEMANTIC,
                    "The attribute nominal for the %s %s is set to %s, evaluating to 0.0. A nominal value of zero is not meaningful. Please set the nominal value to the expected magnitude of the variable.");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:297
     */
    public static final SimpleProblemProducer NOMINAL_ELEMENT_EQUAL_TO_ZERO =
            new SimpleErrorProducer("NOMINAL_ELEMENT_EQUAL_TO_ZERO", ProblemKind.SEMANTIC,
                    "The attribute nominal for the %s %s is set to %s, where element %s evaluates to 0.0. A nominal value of zero is not meaningful. Please set the nominal value to the expected magnitude of the variable.");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:327
     */
    public static final SimpleProblemProducer EACH_APPLIED_ON_SCALAR =
            new SimpleWarningProducer("EACH_APPLIED_ON_SCALAR", ProblemKind.SEMANTIC,
                    "The 'each' keyword should not be applied to a modification of a scalar component: %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:342
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_EQUATION =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_EQUATION", ProblemKind.SEMANTIC,
                    "The array sizes of right and left hand side of equation are not compatible, size of left-hand side is %s, and size of right-hand side is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:345
     */
    public static final SimpleProblemProducer TYPE_MISMATCH_IN_EQUATION =
            new SimpleErrorProducer("TYPE_MISMATCH_IN_EQUATION", ProblemKind.SEMANTIC,
                    "The right and left expression types of equation are not compatible, type of left-hand side is %s, and type of right-hand side is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:365
     */
    public static final SimpleProblemProducer CONNECT_WITH_INVALID_TYPE =
            new SimpleErrorProducer("CONNECT_WITH_INVALID_TYPE", ProblemKind.SEMANTIC,
                    "Connecting to an instance of a non-connector type is not allowed");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:368
     */
    public static final SimpleProblemProducer CONNECT_EXPANDABLE_AND_NON_EXPANDABLE_TYPE =
            new SimpleErrorProducer("CONNECT_EXPANDABLE_AND_NON_EXPANDABLE_TYPE", ProblemKind.SEMANTIC,
                    "Connecting an expandable connector to a non-expandable connector is not allowed");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:371
     */
    public static final SimpleProblemProducer TYPE_MISMATCH_IN_CONNECT =
            new SimpleErrorProducer("TYPE_MISMATCH_IN_CONNECT", ProblemKind.SEMANTIC,
                    "Types of connected components do not match");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:374
     */
    public static final ErrorProducerUnlessDisabled ARRAY_SIZE_MISMATCH_IN_CONNECT =
            new ErrorProducerUnlessDisabled("ARRAY_SIZE_MISMATCH_IN_CONNECT", ProblemKind.SEMANTIC,
                    "Sizes do not match in connection, size of '%s' is %s and size of '%s' is %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:463
     */
    public static final FExp.ExpTypeErrorProducer TYPE_MISMATCH_IN_EXPRESSION =
            new FExp.ExpTypeErrorProducer("TYPE_MISMATCH_IN_EXPRESSION", "Type error in expression");
    /**
     * The message to use in default type error.
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:503
     */
    public static final FExp.ExpTypeErrorProducer EQUALITY_COMPARISON_OF_REAL =
            new FExp.ExpTypeErrorProducer("EQUALITY_COMPARISON_OF_REALS", "Equality comparisons do not allow real operands");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1094
     */
    public static final SimpleProblemProducer CANNOT_INFER_ARRAY_SIZE_OF_OUTPUT =
            new SimpleErrorProducer("CANNOT_INFER_ARRAY_SIZE_OF_OUTPUT", ProblemKind.SEMANTIC,
                    "Could not evaluate array size of output %s");
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1423
     */
    protected static void typeCheckEnabled(ErrorCheckType checkType, FExp enabledExp, FType parentType, boolean eachSet) {
        enabledExp.collectErrors(checkType);
        if (!enabledExp.type().isBoolean() && !enabledExp.type().isUnknown()) {
            enabledExp.error("The type of the enabled expression is not boolean");
        } else if (!eachSet && !parentType.dimensionCompatible(enabledExp.type())) { 
            if (enabledExp.ndims() == 0) {
                enabledExp.warning("Assuming 'each' for enabled expression");
            } else {
                enabledExp.errorUnlessDisabledAnd(parentType.ndims() == enabledExp.ndims(), 
                        "Array size mismatch for the enabled attribute, " + 
                        "size of component declaration is %s and size of expression is %s", 
                        parentType.size(), enabledExp.size());
            }
        } else if (eachSet) { 
            if (parentType.ndims() == 0) {
                enabledExp.warning("The 'each' keyword should not be applied to attributes of scalar components");
            } else if (enabledExp.ndims() > 0) {
                enabledExp.error("The enabled attribute is declared 'each' and the expression is not scalar");
            }
        }
    }
    /**
     * Check operations that are allowed on discrete expressions or variables, 
     * but not on continuous ones or vice-versa.
     * 
     * Also breaks connections back to instance tree that was added during flattening 
     * to be able to report these errors in the correct place.
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1481
     */
    public void checkDiscreteOperations() {
        for (ASTNode n : this)
            n.checkDiscreteOperations();
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:64
     */
    public void enableStreamsRewrite() {
        for (ASTNode n : this)
            n.enableStreamsRewrite();
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:115
     */
    public void enableExpandedInStreamRewrite() {
        for (ASTNode n : this)
            n.enableExpandedInStreamRewrite();
    }
    /**
     * Traverse tree and build connection sets and overconstranined connection graph from relevant constructs.
     * 
     * @param prefix   the prefix to use when flattening names
     * @param csm      the connection set manager to add variables to
     * @param connect  if false, then we are in a dead branch, and shouldn't change sets or graph
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1240
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
		for (ASTNode n : this) 
			n.buildConnectionSets(prefix, csm, connect);
	}
    /**
     * Find functions, record and enumeration declarations that need to be flattened.
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:126
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        for (ASTNode n : this) 
            n.flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:431
     */
    public void ensureFQNamesFull() {
        for (ASTNode n : this)
            n.ensureFQNamesFull();
    }
    /**
     * Affix the given expression to the tree.
     * 
     * Where supported, adds it to dynamicFExp(), otherwise throws UnsupportedOperationException.
     * 
     * @return the expression, possibly rewritten
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:893
     */
    public FExp affixExpression(FExp exp) {
        throw new UnsupportedOperationException("Method affixExpression(FExp) not supported by class " + getClass().getSimpleName());
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:916
     */
    public void flatten(FClass fc, boolean excludeBinding, int level) {
        for (ASTNode n : this) {
            n.flatten(fc, excludeBinding, level);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1660
     */
    public void collectAttributes(
            List<FAttribute> attrs, FQName prefix, AttributeExpRetriever aer, boolean cls) {
        for (int i = 0; i < getNumChild(); i++)
            getChild(i).collectAttributes(attrs, prefix, aer, cls);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1939
     */
    protected static int argIndexInRecordConstructorImpl(int nExt, List<InstExtends> exts) {
        int res = 0;
        for (int i = 0, n = (nExt < 0) ? exts.getNumChild() : nExt; i < n; i++) {
            res += exts.getChild(i).countInstComponentDecls();
        }
        return res;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2699
     */
    public void clearFlattened() {
        for (ASTNode n : noTransform()) {
            n.clearFlattened();
        }
    }
    /**
     * A list that contains all attribute contributers. New contributers are added
     * dynamically during static evaluation by calling addAttributeContributer().
     * 
     * @see ASTNode.addAttributeContributer()
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3341
     */
    private static Collection<AttributeContributer> ATTRIBUTE_CONTRIBUTES;
    /**
     * Add InstantiationContributer to the list of contributers. This method
     * should only be called from AbstractEquation in order to ensure that the
     * checker is added corretly during static evaluation, hence the private
     * visibility.
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3349
     */
    private static AttributeContributer addAttributeContributer(AttributeContributer contributer) {
        if (ATTRIBUTE_CONTRIBUTES == null)
            ATTRIBUTE_CONTRIBUTES = new ArrayList<AttributeContributer>();
        ATTRIBUTE_CONTRIBUTES.add(contributer);
        return contributer;
    }
    /**
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3356
     */
    public static Collection<AttributeContributer> attributeContributers() {
        return Collections.unmodifiableCollection(ATTRIBUTE_CONTRIBUTES);
    }
    /**
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:20
     */
    protected static final InstLookupResult.DefaultGenerator<InstClassDecl> INST_UNKNOWN_CLASS = 
            new InstLookupResult.DefaultGenerator<InstClassDecl>() {
        public InstClassDecl generate(ASTNode src) {
            return src.unknownInstClassDecl();
        }
    };
    /**
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:565
     */
    protected static final InstLookupResult.DefaultGenerator<InstCallable> INST_UNKNOWN_CALLABLE = 
            new InstLookupResult.DefaultGenerator<InstCallable>() {
        public InstCallable generate(ASTNode src) {
            return src.unknownInstClassDecl();
        }
    };
    /**
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:310
     */
    protected static final InstLookupResult.DefaultGenerator<InstComponentDecl> INST_UNKNOWN_COMPONENT = 
            new InstLookupResult.DefaultGenerator<InstComponentDecl>() {
        public InstComponentDecl generate(ASTNode src) {
            return src.unknownInstComponentDecl();
        }
    };
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2217
     */
    

        protected static class AllInstComponentIterable implements Iterable<InstComponentDecl> {

            private AllInstComponentSource src;

            public AllInstComponentIterable(AllInstComponentSource src) {
                this.src = src;
            }

            public Iterator<InstComponentDecl> iterator() {
                return new AllInstComponentIterator(src);
            }

        }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2231
     */
    

        protected static class AllInstClassIterable implements Iterable<InstClassDecl> {

            private AllInstClassSource src;

            public AllInstClassIterable(AllInstClassSource src) {
                this.src = src;
            }

            public Iterator<InstClassDecl> iterator() {
                return new AllInstClassIterator(src);
            }

        }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2245
     */
    

        protected static class AllInstComponentIterator extends AllInstNodeIterator<InstComponentDecl> {

            public AllInstComponentIterator(AllInstComponentSource src) {
                super(src.getInstExtendss(), src.getInstComponentDecls());
            }

            protected Iterator<InstComponentDecl> subIterator(InstExtends ie) {
                return ie.allInstComponentDeclsIterator();
            }

        }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2257
     */
    

        protected static class AllInstClassIterator extends AllInstNodeIterator<InstClassDecl> {

            public AllInstClassIterator(AllInstClassSource src) {
                super(src.getInstExtendss(), src.getInstClassDecls());
            }

            protected Iterator<InstClassDecl> subIterator(InstExtends ie) {
                return ie.allInstClassDeclsIterator();
            }

        }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2269
     */
    

        private static abstract class AllInstNodeIterator<T extends InstNode> implements Iterator<T> {

            private Iterator<T> current;
            private Iterator<InstExtends> exts;
            private Iterator<T> last;

            public AllInstNodeIterator(List<InstExtends> extList, List<T> lastList) {
                exts = extList.iterator();
                last = lastList.iterator();
                if (exts.hasNext()) {
                    current = subIterator(exts.next());
                } else {
                    current = last;
                }
                update();
            }

            protected abstract Iterator<T> subIterator(InstExtends ie);

            public boolean hasNext() {
                return current.hasNext();
            }

            public T next() {
                T res = current.next();
                update();
                return res;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            private void update() {
                while (!current.hasNext() && exts.hasNext()) {
                    current = subIterator(exts.next());
                }
                if (!current.hasNext()) {
                    current = last;
                }
            }

        }
    /**
     * @aspect SourceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2347
     */
    
        protected static final Criteria<ASTNode> NOT_ERROR_NODE_CRITERIA = new Criteria<ASTNode>() {
            public boolean test(ASTNode elem) {
                return !elem.isError();
            }
        };
    /**
     * @aspect SourceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2353
     */
    
    
        public static <N extends ASTNode> Iterable<N> filterErrorNodes(final Iterable<N> parent) {
            return new Iterable<N>() {
                public Iterator<N> iterator() {
                    return new FilteredIterator<N>(parent.iterator(), NOT_ERROR_NODE_CRITERIA);
                }
            };
        }
    /**
     * Convenience method for looking up a class in a List of ClassDecls.
     * 
     * Unlike the other lookup methods, this one returns null when the class isn't found.
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:217
     */
    public static ClassDecl simpleLookupInClassList(List<? extends ClassDecl> list, String name) {
		for (ClassDecl cd : list)
			if (cd.matches(name))
				return cd;
		return null;
	}
    /**
     * Convenience method for looking up a class in a List of ClassDecls.
     * 
     * Unlike the other lookup methods, this one returns null when the class isn't found.
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:230
     */
    public static ClassDecl simpleLookupInLibNodeList(List<LibNode> list, String name) {
		for (LibNode ln : list)
			if (ln.matches(name))
				return (ClassDecl) ln.getStoredDefinition().getElement(0);
		return null;
	}
    /**
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:26
     */
    public void dumpTree(String indent) {
     	//log.debug("*** ASTNode.dumpTree(): " + toString());
    	System.out.println(indent + dump() + " at line: " + beginLine());
    	for(int i = 0; i < getNumChild(); i++)
    		if (getChild(i) instanceof ASTNode)
	      		getChild(i).dumpTree(indent + "  ");
  	}
    /**
     * 
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:37
     */
    public String dump() {
    	//log.debug("*** ASTNode.dump(): " + toString());
    	String str = getClass().getName();
		return str.substring(str.lastIndexOf('.')+1);
  	}
    /**
     * @aspect DumpTreeBasic
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:193
     */
    public void dumpTreeBasic(String indent) {
    System.out.println(indent + dumpBasic() + " at line: " + getLine(getStart()));
    for(int i = 0; i < getNumChild(); i++) 
   		if (getChild(i) instanceof ASTNode)
      		getChild(i).dumpTreeBasic(indent + "  ");
  }
    /**
     * @aspect DumpTreeBasic
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:234
     */
    public String dumpBasic() {
    String str = getClass().getName();
	return str.substring(str.lastIndexOf('.')+1);
  }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:91
     */
    static FormattedPrettyPrinter formattedPrettyPrinter = new FormattedPrettyPrinter();
    /**
     * Propagates the formatting information downwards in the AST if this has not already been done.
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:109
     */
    public void propagateFormatting() {
		getParent().propagateFormatting();
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:139
     */
    protected void propagateFormatting(FormattingInfo formattingInfo) {
		addFormattingInformation(formattingInfo);
		addFormattingRest(formattingInfo);
	}
    /**
     * Adds formatting information to this AST node and all its children, which can then be used by the method
     * <code>prettyPrintFormatted</code>.
     * @param formattingInfo the information to use to format this AST node.
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:149
     */
    protected void addFormattingInformation(FormattingInfo formattingInfo) {
		for (ASTNode node : this)
			node.addFormattingInformation(formattingInfo);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:210
     */
    public void addFormattingRest(FormattingInfo formattingInfo) {
		for (ASTNode childNode : this) {
			childNode.addFormattingRest(formattingInfo);
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:525
     */
    protected void setDefaultFormatting(DefaultFormattingIndentation indentation) {
		for (ASTNode node : this) {
			node.setDefaultFormatting(indentation);
		}
	}
    /**
     * Pretty prints this AST node and all its children, with preserved formatting.
     * @return a string, consisting of the formatted code printed from this AST node.
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:989
     */
    public String prettyPrintFormatted() {
		OutputStream outputStream = new ByteArrayOutputStream();
		CodeStream printStream = new CodeStream(outputStream);
		prettyPrintFormatted(formattedPrettyPrinter, printStream);

		return outputStream.toString();
	}
    /**
     * Pretty prints this AST node and all its childred, with preserved formatting.
     * @param printer the printer to use when pretty printing.
     * @param printStream the stream, to which the AST node should be printed.
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1003
     */
    public void prettyPrintFormatted(Printer printer, CodeStream printStream) {
		propagateFormatting();
		doPrettyPrintFormatted(printer, printStream);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1008
     */
    void doPrettyPrintFormatted(Printer printer, CodeStream printStream) {
		for (ASTNode childNode: this) {
			childNode.doPrettyPrintFormatted(printer, printStream);
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2017
     */
    void copyFormattingFrom(ASTNode node) {
		if (this.getClass() != node.getClass())
			return;
		if (numChildren() != node.numChildren())
			return;
		for (int i = 0; i < numChildren(); i++) {
			getChild(i).copyFormattingFrom(node.getChild(i));
		}
	}
    /**
     * @aspect Options
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Options.jrag:21
     */
    public OptionRegistry myOptions() {
        return root().getUtilInterface().getOptionRegistry();
    }
    /**
     * @aspect RootAccess
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:45
     */
    public static String JMODELICA_VENDOR_NAME = "JModelica.org";
    /**
     * @aspect RootAccess
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:46
     */
    public static String vendorName() {
        return ASTNode.JMODELICA_VENDOR_NAME;
    }
    /**
     * @aspect RootAccess
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:59
     */
    public static final ArrayList EMPTY_ARRAY_LIST = new ArrayList(0);
    /**
     * @aspect RootAccess
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:62
     */
    public boolean hasRoot() { return (getParent() == null) ? false : getParent().hasRoot(); }
    /**
     * @aspect Parsers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:223
     */
    public static final Charset UTF8 = Charset.forName("UTF-8");
    /**
     * @aspect Logging
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:247
     */
    public static ModelicaLogger log = ModelicaCompiler.log;
    /**
     * Copies the member variables defining the location within 
     * the source to another node.
     * 
     * @param n  the node to copy the location to
     * @return   the node given as <code>n</code>, for convenience
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:261
     */
    
        /**
         * Copies the member variables defining the location within 
         *        the source to another node.
         *        
         * @param n  the node to copy the location to
         * @return   the node given as <code>n</code>, for convenience
         */
        public <N extends ASTNode> N copyLocationTo(N n) {
      	    n.setLocation(this, this);
            return n;
        }
    /**
     * Sets the member variables defining the location of the node within 
     * the source to values copied another node.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:271
     */
    public void setLocation(ASTNode node) {
  	    setLocation(node, node);
    }
    /**
     * Sets the member variables defining the location of the node within 
     * the source to values copied from two other nodes.
     * 
     * @param start  the node to copy the <code>start</code> member from.
     * @param end    the node to copy the <code>end</code> member from.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:282
     */
    public void setLocation(ASTNode start, ASTNode end) {
        this.start = start.start;
        this.end = end.end;
    }
    /**
     * Sets the member variables defining the location of the node within 
     * the source to values copied another node, that might not be in a 
     * proper AST.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:305
     */
    public void setLocationNoTree(ASTNode node) {
  	    setLocationNoTree(node, node);
    }
    /**
     * Sets the member variables defining the location of the node within 
     * the source to values copied from two other nodes, that might not be 
     * in a proper AST.
     * 
     * @param start  the node to copy the <code>start</code> member from.
     * @param end    the node to copy the <code>end</code> member from.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:317
     */
    public void setLocationNoTree(ASTNode start, ASTNode end) {
        setLocation(start, end);
    }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:348
     */
    public int beginLine()   { return getLine(getStart()); }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:349
     */
    public int beginColumn() { return getColumn(getStart()); }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:350
     */
    public int endLine()     { return getLine(getEnd()); }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:351
     */
    public int endColumn()   { return getColumn(getEnd()); }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:353
     */
    public String getNodeName() {
        return dump();
    }
    /**
     * Return a copy of node that is not in any tree.
     * 
     * Returns <code>this</code> if node has no parent, <code>fullCopy()</code> otherwise.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:428
     */
    public ASTNode unboundCopy() {
        return (parent == null) ? this : fullCopy();
    }
    /**
     * Check if this node is a direct child (only List/Opt between) of <code>parent</code>.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:435
     */
    public boolean isChildOf(BaseNode parent) {
        ASTNode par = getParent();
        return par != null && par.isChildOfHelper(parent);
    }
    /**
     * Helper method for {@link #isChildOf(BaseNode parent)}, should not be called directly.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:443
     */
    protected boolean isChildOfHelper(BaseNode parent) {
        return isChildOf(parent);
    }
    /**
     * @aspect FileNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:529
     */
    public String fileName() { 
    	return retrieveFileName(); 
    }
    /**
     * Compose a dotted name of two components.
     * 
     * Each component can be a dotted name, a single name or empty.
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:669
     */
    public static String combineName(String first, String second) {
        if (first.isEmpty())
            return second;
        if (second.isEmpty())
            return first;
        return first + "." + second;
    }
    /**
     * Converts an URI to a file-system path.
     * 
     * Only modelica:// and file:// URIs are supported. 
     * If the string is a simple path, then it is interpreted as relative to the 
     * top level package this node is in, or if that path does not exist, relative 
     * to the parent directory the file this node is in.
     * 
     * @param str  the string to interpret as an URI
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:759
     */
    public String resolveInPackage(String str) {
        String path = resolveURI(str, true);
        if (path != null) {
            return path;
        } else {
            String pack = topPackagePath();
            if (pack != null) {
                File f = new File(pack, str);
                if (f.exists())
                    return canonicalPath(f);
                File dir = new File(fileName()).getParentFile();
                return canonicalPath(new File(dir, str));
            }
        }
        return null;
    }
    /**
     * Resolves <code>str</code> to an absolute file path.
     * Supports file URI, modelica URI, absolute file path and 
     * relative file path (w.r.t. current working directory)
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:781
     */
    public String resolve(String str) {
        String path = resolveURI(str, true);
        if (path != null) {
            return path;
        } else {
            return canonicalPath(new File(str));
        }
    }
    /**
     * Resolves <code>str</code> to an absolute file path.
     * 
     * Supports file URI and modelica URI only.
     * Returns null for unsupported schemes and malformed URIs.
     * If error is true, also generate an error for unsupported schemes.
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:797
     */
    public String resolveURI(String str, boolean error) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme() != null) {
                if (uri.getScheme().equals("file")) {
                    return uri.getPath();
                } else if (uri.getScheme().equals("modelica")) {
                    String pack = packagePath(uri.getAuthority());
                    if (pack != null) {
                        return canonicalPath(new File(pack + uri.getPath()));
                    }
                } else if (error) {
                    error("Unsupported URI scheme '%s'.", uri.getScheme());
                }
            }
        } catch (URISyntaxException e) {
        }
        return null;
    }
    /**
     * Convert file to a canonical path, if possible.
     * 
     * On Windows, backslash is converted to forward slash, to make testing easier.
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:822
     */
    public static String canonicalPath(File path) {
        String res;
        try {
            res = path.getCanonicalPath();
        } catch (IOException e) {
            res = path.getAbsolutePath();
        }
        if (File.separatorChar == '\\') {
            res = res.replace('\\', '/');
        }
        return res;
    }
    /**
     * Convert to string. Primarily useful for debugging.
     * 
     * Default implementation uses prettyPrint().
     * @aspect DebugHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1110
     */
    public String toString() {
        return prettyPrint("");
    }
    /**
     * Searches <code>set</code> for a node that returns <code>true</code> for 
     * <code>node.matches(str)</code>.
     * 
     * @param set  the container to search for a matching node
     * @param str  the string to match nodes to
     * @return     a matching node if one is found, <code>null</code> otherwise
     * @aspect NodeSearch
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1659
     */
    
        
        /**
         * Searches <code>set</code> for a node that returns <code>true</code> for 
         * <code>node.matches(str)</code>.
         * 
         * @param set  the container to search for a matching node
         * @param str  the string to match nodes to
         * @return     a matching node if one is found, <code>null</code> otherwise
         */
        public static <T extends ASTNode> T findMatching(Iterable<T> set, String str) {
            for (T node : set) 
                if (node.matches(str)) 
                    return node;
            return null;
        }
    /**
     * Replace all escape sequences with their actual meaning.
     * @aspect Strings
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1682
     */
    public static String unEscape(String str) {
		StringBuffer buf = new StringBuffer();
		Matcher m = ESCAPE_PATTERN.matcher(str);
		Map<String,String> repl = escapeReplacements();
		while (m.find())
			m.appendReplacement(buf, repl.get(m.group(1)));
		m.appendTail(buf);
		return buf.toString();
	}
    /**
     * @aspect Strings
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1692
     */
    private static Pattern ESCAPE_PATTERN = Pattern.compile("\\\\(.)");
    /**
     * @aspect Strings
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1694
     */
    private static Map<String,String> escapeReplacements() {
		if (ESCAPE_REPLACEMENTS == null) {
			ESCAPE_REPLACEMENTS = new HashMap<String,String>();
			ESCAPE_REPLACEMENTS.put("'", "'");
			ESCAPE_REPLACEMENTS.put("\"", "\"");
			ESCAPE_REPLACEMENTS.put("?", "?");
			ESCAPE_REPLACEMENTS.put("\\", Matcher.quoteReplacement("\\"));
			ESCAPE_REPLACEMENTS.put("a", "\007");
			ESCAPE_REPLACEMENTS.put("b", "\b");
			ESCAPE_REPLACEMENTS.put("f", "\f");
			ESCAPE_REPLACEMENTS.put("n", "\n");
			ESCAPE_REPLACEMENTS.put("r", "\r");
			ESCAPE_REPLACEMENTS.put("v", "\013");
			ESCAPE_REPLACEMENTS.put("t", "\t");
		}
		return ESCAPE_REPLACEMENTS;
	}
    /**
     * @aspect Strings
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1712
     */
    private static Map<String,String> ESCAPE_REPLACEMENTS = null;
    /**
     * @aspect Sorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1746
     */
    public static final Comparator<ASTNode> CHILD_ORDER_COMPARATOR =
		    new Comparator<ASTNode>() {
				public int compare(ASTNode n1, ASTNode n2) {
			    	return childIndex(n1) - childIndex(n2);
			    }
				
				private int childIndex(ASTNode n) {
					return (n.parent == null) ? 0 : n.parent.getIndexOfChild(n);
				}
			    
				public boolean equals(Object obj) { 
			    	return obj == this; 
			    }
			};
    /**
     * @aspect Sorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1761
     */
    public static final Comparator<ASTNode> TOSTRING_COMPARATOR =
		    new Comparator<ASTNode>() {
				public int compare(ASTNode n1, ASTNode n2) {
			    	return n1.toString().compareTo(n2.toString());
			    }
			    
				public boolean equals(Object obj) { 
			    	return obj == this; 
			    }
			};
    /**
     * Used to iterate over the children of an AST node without triggering rewrites.
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1795
     */
    
		
		/**
		 * Used to iterate over the children of an AST node without triggering rewrites.
		 */
		public Iterable<T> noTransform() { 
			return new Iterable<T>() {
				public Iterator<T> iterator() {
					return new NoTransformIterator();
				}
			};
		}
    /**
     * Used to iterate over the children of an AST node without triggering rewrites.
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1806
     */
    
		
		/**
		 * Used to iterate over the children of an AST node without triggering rewrites.
		 */
		public class NoTransformIterator implements Iterator<T> {
			
			private int i = 0;
			private int n = getNumChildNoTransform();
			
			public boolean hasNext() {
				return i < n;
			}
			
			public T next() {
				return getChildNoTransform(i++);
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		}
    /**
     * Adds all children to a Collection.
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1830
     */
    public void addAllTo(Collection<? super T> col) {
		for (T n : this)
			col.add(n);
	}
    /**
     * Round a number to 2 decimals if it is < 10, 1 decimal otherwise.
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1847
     */
    public static double roundFriendly(double val) {
		double round = val < 10.0 ? 100.0 : 10.0;
		return Math.round(val * round) / round;
	}
    /**
     * Create a human-readable memory size string (e.g. 2.34 kB).
     * 
     * @param mem  size to format, in bytes. May be negative.
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1857
     */
    public static String formatMem(long mem) {
		int i = 0;
		double scaledMem = Math.abs(mem);
		for (; i < 4 && scaledMem >= 1000.0; i++)
			scaledMem /= 1024.0;
		StringBuilder buf = new StringBuilder();
		if (i == 0) {
			buf.append(mem);
		} else {
			if (mem < 0)
				buf.append('-');
			buf.append(roundFriendly(scaledMem));
		}
		buf.append(memUnits[i]);
		return buf.toString();
	}
    /**
     * Parse a human-readable memory size string (e.g. 2.34 kB).
     * 
     * @param str  string to parse
     * @return  the amount of memory described by the string
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1880
     */
    public static long parseMem(String str) {
		Matcher m = memPattern.matcher(str);
		if (m.matches()) {
			double val = Double.parseDouble(m.group(1));
			String suff = m.group(4);
			if (suff != null && !suff.isEmpty()) {
				char sc = Character.toLowerCase(suff.charAt(0));
				for (int i = 0; i < memUnits.length && Character.toLowerCase(memUnits[i].charAt(1)) != sc; i++)
					val *= 1024.0;
			}
			if (val < Long.MAX_VALUE && val > Long.MIN_VALUE)
				return (long) val;
		}
		throw new IllegalArgumentException(str);
	}
    /**
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1896
     */
    private static final String[] memUnits = { 
		" B", " kB", " MB", " GB", " TB" , " PB" , " EB" };
    /**
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1898
     */
    private static final Pattern memPattern = 
			Pattern.compile("([0-9]+(\\.[0-9]*)?)(([kKmMgGtTpPeE])?[bB]?)?");
    /**
     * Copies a file from src to dst. Destination file is overwritten if it already exisits
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1904
     */
    public static void copyFile(File src, File dst) throws IOException {
        if (dst.exists())
            dst.delete();
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1)
            out.write(buf, 0, len);
        in.close();
        out.close();
    }
    /**
     * @aspect LightProfiling
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:36
     */
    private static StepInfo stepInfo = new StepInfo();
    /**
     * @aspect LightProfiling
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:38
     */
    public static StepInfo getStepInfo() {
		return stepInfo;
	}
    /**
     * @aspect LightProfiling
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:42
     */
    public static void beginStep(String name) {
		stepInfo.begin(name);
	}
    /**
     * @aspect LightProfiling
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:46
     */
    public static void endStep(String name) {
		stepInfo.end(name);
	}
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:385
     */
    public Iterable<ASTNode> profilingChildren() {
        LinkedHashSet<ASTNode> res = new LinkedHashSet<ASTNode>(children != null ? children.length * 2 : 4);
        if (children != null)
            for (ASTNode ch : children)
                if (ch != null && ch.parent == this)
                    res.add(ch);
        for (Field f : Profiler.GET_FIELDS.perform(getClass())) {
            if ((f.getModifiers() & Modifier.STATIC) == 0 && ASTNode.class.isAssignableFrom(f.getType())) {
                try {
                    ASTNode val = (ASTNode) Profiler.GET_VALUE.perform(f, this);
                    if (val != null && val.parent == this)
                        res.add(val);
                } catch (Exception e) {}
            }
        }
        return res;
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:403
     */
    private static Map<Class,Counter> buildNodeCountMap = null;
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:405
     */
    private static NodeCountExtra[] nodeCountExtra = new NodeCountExtra[] { };
    /**
     * Output a list of the number of instances of each node class.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:415
     */
    public static void dumpNodeCount(String file) 
            throws FileNotFoundException {
        ArrayList<Counter> list = new ArrayList<Counter>();
        list.addAll(buildNodeCountMap.values());
        Collections.sort(list);
        CodeStream out = new CodeStream(file);
        for (Counter c : list)
            out.println(c);
        for (NodeCountExtra nce : nodeCountExtra)
            nce.printResult(out);
        out.close();
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:428
     */
    public void buildNodeCount() {
        Profiler.clear();
        if (buildNodeCountMap == null)
            buildNodeCountMap = new HashMap<Class,Counter>();
        buildNodeCount(buildNodeCountMap);
        Profiler.clear();
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:436
     */
    private void buildNodeCount(Map<Class,Counter> map) {
        addToNodeCount(map, getClass(), Profiler.getNodeSize(this, false), Profiler.getNodeSize(this, true));
        for (NodeCountExtra nce : nodeCountExtra)
            nce.count(this);
        
        for (ASTNode n : profilingChildren())
            n.buildNodeCount(map);
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:445
     */
    private void addToNodeCount(Map<Class,Counter> map, Class cls, long local, long deep) {
        if (map.containsKey(cls))
            map.get(cls).inc(local, deep);
        else
            map.put(cls, new Counter(cls.getSimpleName(), local, deep));
        if (cls != ASTNode.class)
            addToNodeCount(map, cls.getSuperclass(), local, deep);
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:455
     */
    
        public static class Counter implements Comparable<Counter> {
            private int n;
            private long sizeLocal;
            private long sizeDeep;
            private String s;
            
            private static int l = 0;
            private static String fmt = null;
            
            public Counter(String name, long local, long deep) {
                s = name;
                sizeLocal = 0;
                sizeDeep = 0;
                n = 0;
                if (s.length() > l)
                    l = s.length();
                inc(local, deep);
            }
            
            public void inc(long local, long deep) {
                n++;
                sizeLocal += local;
                sizeDeep += deep;
            }
            
            public int compareTo(Counter c) {
                return c.n - n;
            }
            
            public String toString() {
                if (fmt == null)
                    fmt = "%-" + l + "s : %9d (%8s / %8s)";
                return String.format(fmt, s, n, ASTNode.formatMem(sizeDeep), ASTNode.formatMem(sizeLocal));
            }
        }
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * As {@link #dumpMemoryUse(PrintStream, boolean, int, long)}, with <code>deep = false</code>, 
     * <code>maxDepth = -1</code>, <code>minSize = 0</code>, and saving the output to a file.
     * 
     * @param file     filename to save output as
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:501
     */
    public void dumpMemoryUse(String file) throws FileNotFoundException {
		dumpMemoryUse(file, false);
	}
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * As {@link #dumpMemoryUse(PrintStream, boolean, int, long)}, with <code>maxDepth = -1</code>, 
     * <code>minSize = 0</code>, and saving the output to a file.
     * 
     * @param file     filename to save output as
     * @param deep     if the memory calculation should include the contents of non-ASTNode members
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:515
     */
    public void dumpMemoryUse(String file, boolean deep) throws FileNotFoundException {
		dumpMemoryUse(file, deep, -1, 0);
	}
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * As {@link #dumpMemoryUse(PrintStream, boolean, int, long)}, but saving the output to a file.
     * 
     * @param file     filename to save output as
     * @param deep     if the memory calculation should include the contents of non-ASTNode members
     * @param maxDepth the maximum depth to display nodes from, -1 means infinite depth
     * @param minSize  the minimum memory size to display a node
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:530
     */
    public void dumpMemoryUse(String file, boolean deep, int maxDepth, long minSize) 
			throws FileNotFoundException {
		dumpMemoryUse(new PrintStream(file), deep, maxDepth, minSize);
	}
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * As {@link #dumpMemoryUse(PrintStream, boolean, int, long)}, with <code>deep = false</code>, 
     * <code>maxDepth = -1</code> and <code>minSize = 0</code>.
     * 
     * @param out      stream to use for output
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:545
     */
    public void dumpMemoryUse(PrintStream out) {
		dumpMemoryUse(out, false, -1, 0);
	}
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * As {@link #dumpMemoryUse(PrintStream, boolean, int, long)}, with <code>maxDepth = -1</code> and 
     * <code>minSize = 0</code>.
     * 
     * @param out      stream to use for output
     * @param deep     if the memory calculation should include the contents of non-ASTNode members
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:559
     */
    public void dumpMemoryUse(PrintStream out, boolean deep) {
		dumpMemoryUse(out, deep, -1, 0);
	}
    /**
     * Output a view of an AST, showing the classname and approximate memory footprint 
     * of the subtree.
     * 
     * @param out      stream to use for output
     * @param deep     if the memory calculation should include the contents of non-ASTNode members
     * @param maxDepth the maximum depth to display nodes from, -1 means infinite depth
     * @param minSize  the minimum memory size to display a node
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:572
     */
    public void dumpMemoryUse(PrintStream out, boolean deep, int maxDepth, long minSize) {
		Profiler.clear();   // Remove any stale data from profiler
		gatherMemoryUse(out, "", deep, maxDepth, minSize, 0);
		Profiler.clear();   // Free any memory used by the profiler's cache
	}
    /**
     * Calculate the memory weight of a subtree.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:581
     */
    public long subTreeSize() {
		Profiler.clear();   // Remove any stale data from profiler
		long res = subTreeSizeNoClear();
		Profiler.clear();   // Free any memory used by the profiler's cache
		return res;
	}
    /**
     * Calculate the memory weight of a subtree, without clearing cache.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:591
     */
    private long subTreeSizeNoClear() {
		return gatherMemoryUse(NullStream.PRINT, "", true, 0, 0, 1);
	}
    /**
     * Calclulate memory weight of all subtrees fulfilling a specific criteria.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:598
     */
    public long filteredTreeSize(Criteria<ASTNode> filter) {
		Profiler.clear();   // Remove any stale data from profiler
		long res = filteredTreeSizeNoClear(filter);
		Profiler.clear();   // Free any memory used by the profiler's cache
		return res;
	}
    /**
     * Calclulate memory weight of all subtrees fulfilling a specific criteria, without clearing cache.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:608
     */
    private long filteredTreeSizeNoClear(Criteria<ASTNode> filter) {
        if (filter.test(this)) {
            return subTreeSizeNoClear();
        } else {
            long res = 0;
            for (ASTNode ch : profilingChildren()) 
                res += ch.filteredTreeSizeNoClear(filter);
            return res;
        }
    }
    /**
     * Calculate total memory weight of all nodes (including subtrees) of a specific class.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:622
     */
    public long specificNodeClassTreeSize(String name) {
		try {
			final Class cls = Class.forName(ASTNode.class.getName().replace("ASTNode", name));
			return filteredTreeSize(new ClassCriteria<ASTNode>(cls));
		} catch (ClassNotFoundException e) {
			return -1;
		}
	}
    /**
     * Traversal method for {@link #dumpMemoryUse(PrintStream, boolean, int, long)}.
     * 
     * @return approximation of the memory footprint for the subtree
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:636
     */
    protected long gatherMemoryUse(
            PrintStream out, String indent, boolean deep, int maxDepth, long minSize, int depth) {
        long local = Profiler.getNodeSize(this, deep);
        long mem = local;
        String nextInd = indent + " ";
        for (ASTNode ch : profilingChildren())
            mem += ch.gatherMemoryUse(out, nextInd, deep, maxDepth, minSize, depth+1);
        if ((depth == 0 || mem >= minSize) && (maxDepth < 0 || depth < maxDepth))
            addMemoryUseRow(out, indent, mem, local);
        return mem;
    }
    /**
     * Output method for {@link #dumpMemoryUse(PrintStream, boolean, int, long)}.
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:659
     */
    protected void addMemoryUseRow(PrintStream out, String indent, long mem, long local) {
		out.println(indent + getClass().getSimpleName() + extraMemoryUseInfo() + ": " + 
				formatMem(mem) + " (" + formatMem(local) + ")");
	}
    /**
     * Visit each node in tree (depth-first).
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:679
     */
    public void visitAll(ASTVisitor v) {
        for (ASTNode ch : profilingChildren())
            ch.visitAll(v);
        v.visit(this);
    }
    /**
     * @aspect MemoryUse
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/Profiling.jrag:937
     */
    public boolean recognizedByParent() {
		return parent != null && 
				parent.children != null && 
				childIndex >= 0 && childIndex < parent.children.length &&
				parent.children[childIndex] == this;
	}
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:43
     */
    public static final SanityProblemProducer DEBUG_SANITY_CHECK = new SanityProblemProducer();
    /**
     * Check that all relevant names can be looked up in the flat tree.
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:48
     */
    public void sanityCheckFIdUseConsistency(FClass fc) {
        sanityCheckFIdUseConsistencyInChildren(fc);
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:52
     */
    public void sanityCheckFIdUseConsistencyInChildren(FClass fc) {
        for (ASTNode n : this) {
            n.sanityCheckFIdUseConsistency(fc);
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1183
     */
    public static final SimpleProblemProducer DIFFERENTIATED_DISCRETE_VARIALBE =
            new SimpleErrorProducer("DIFFERENTIATED_DISCRETE_VARIALBE", ProblemKind.SEMANTIC,
                    "Unable to differentiate the variable %s which is declared or infered to be discrete");
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1314
     */
    public void gatherContinuousVariablesUsedInPre(Set<FVariable> res) {
        for (ASTNode n : this) 
            n.gatherContinuousVariablesUsedInPre(res);
    }
    /**
     * Determine if two expressions would form an alias pair if on the left and right sides of 
     * an equation.
     * 
     * @param e1    an expression that would form one side of the equation
     * @param e2    an expression that would form the other side of the equation
     * @param sign  alias sign is multiplied with this - useful for e.g. 0 = x + y
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1472
     */
    public static AliasPair aliasVariables(FExp e1, FExp e2, int sign, boolean checkVariables) {
        FVariable fv1 = e1.variableThatCanBeAlias();
        FVariable fv2 = e2.variableThatCanBeAlias();
        if (fv1 != null && fv2 != null) {  // x = y, etc.
            if (!checkVariables || e1.canBeAlias() && e2.canBeAlias() 
                    && e1.type().typeAliasCompatible(e2.type()) 
                    && e1.variability().aliasCompatible(e2.variability())) {
                boolean negated = e1.aliasSign() * e2.aliasSign() * sign < 0;
                return new AliasPair(fv1, fv2, negated);
            } else {
                return null;
            }
        } else {                          // 0 = x + y, etc
            FExp eqZero = null;
            if (e1.isLiteralZero()) {
                eqZero = e2;
            } else if (e2.isLiteralZero()) {
                eqZero = e1;
            } if (eqZero != null) {
                return eqZero.aliasVariables(checkVariables);
            } else {
                return null;
            }
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1703
     */
    public void enableAliasRewrite() {
		for (ASTNode n : this)
			n.enableAliasRewrite();
	}
    /**
     * Create a copy of the list with all equations with <code>markedForRemoval == true</code> removed. 
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2056
     */
    protected static List<FAbstractEquation> removeMarkedEqns(List<FAbstractEquation> list) {
		List<FAbstractEquation> res = new List<FAbstractEquation>();
		for (FAbstractEquation eqn : list) {
			if (!eqn.markedForRemoval) {
				eqn.removeMarkedEqns();
				res.add(eqn);
			}
		}
		return res;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2128
     */
    public void activateEquivalentRecordUseRewrite() {
		for (ASTNode n : this)
			n.activateEquivalentRecordUseRewrite();
	}
    /**
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2320
     */
    public void extractSampleExpressions(Collection<FEquation> newEqns, Collection<FVariable> newVars) {
        for (ASTNode n : this)
            n.extractSampleExpressions(newEqns, newVars);
    }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2384
     */
    public void enableIfEquationElimination() {
		for (ASTNode n : this)
			n.enableIfEquationElimination();
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2464
     */
    public void enableIfEquationRewrite() {
		for (ASTNode n : this)
			n.enableIfEquationRewrite();
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2486
     */
    public void checkIfEquationCompliance() {
        for (ASTNode n : this)
            n.checkIfEquationCompliance();
    }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2565
     */
    public static List<FAbstractEquation> cleanEmptyElse(List<FAbstractEquation> oldList) {
		List<FAbstractEquation> newList = new List<FAbstractEquation>();
		for (FAbstractEquation eqn : oldList)
			if (!(eqn instanceof FElseEquation))
				newList.add(eqn);
		return newList;
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2586
     */
    
		
		public static <K, V> Set<V> valuesOfUnNamedKeys(Map<K, V> map, Set<K> namedKeys) {
			Set<V> res = new HashSet<V>();
			for (Entry<K,V> e : map.entrySet())
				if (!namedKeys.contains(e.getKey()))
					res.add(e.getValue());
			return res;
		}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2594
     */
    
		
		public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
			// TODO: use runtime type of a instead - problematic if it is something like HashMap.KeySet
			Set<T> res = new HashSet<T>();
			res.addAll(a);
			res.retainAll(b);
			return res;
		}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2602
     */
    
		
		public static <T> ArrayList<T> toSortedList(Collection<T> elems, Comparator<? super T> cmp) {
			ArrayList<T> res = new ArrayList<T>(elems.size());
			res.addAll(elems);
			Collections.sort(res, cmp);
			return res;
		}
    /**
     * @aspect DummyDerivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2994
     */
    public void enableFHDerRewrite() {
        for (ASTNode n : this)
            n.enableFHDerRewrite();
    }
    /**
     * Flush all caches, including collection attributes.
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3097
     */
    public void flushAll() {
		flushCache();
		flushCollectionCache();
	}
    /**
     * Flush all caches, including collection attributes, and also
     * flush all children. In addition, the is$final attribute is set to false
     * for FExps in order to enable rewrites of such nodes after elimination 
     * of alias variables and after function inlining.
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3108
     */
    public void flushAllRecursiveClearFinal() {
		flushAll();
		//is$Final = false;
		for (ASTNode n : noTransform()) {
			n.flushAllRecursiveClearFinal();
		}
	}
    /**
     * Flush all caches, including collection attributes, and also
     * flush all children. 
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3125
     */
    public void flushAllRecursive() {
		flushAll();
		for (ASTNode n : noTransform()) {
			n.flushAllRecursive();
		}
	}
    /**
     * Traverse entire tree, forcing any pending rewrites to occur.
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3144
     */
    public void forceRewrites() {
        for (ASTNode n : this) 
            n.forceRewrites();
	}
    /**
     * @aspect LoadResource
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3829
     */
    public void collectResourcesToLoad(LinkedHashSet<String> list) {
        for (ASTNode n : this)
            n.collectResourcesToLoad(list);
    }
    /**
     * Mark all called functions as used.
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3928
     */
    public final void markUsedFunctionsAndRecords() {
        markUsedFunctionsAndRecords(FFunctionDecl.UseType.DIRECT);
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3931
     */
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        for (ASTNode node : this)
            node.markUsedFunctionsAndRecords(type);
    }
    /**
     * @aspect LocalIteration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/extentions/LocalIteration.jrag:70
     */
    private static AttributeContributer LOCAL_ITERATION_CONTRIBUTER =
            addAttributeContributer(new AttributeContributer.LocalIterationContributer());
    /**
     * Add function calls in this sub tree to <code>m</code>
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:149
     */
    public void collectFunctionCalls(FClass.commonSubexpressionEliminationIfSet m) {
        for (ASTNode n : this) {
            n.collectFunctionCalls(m);
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:953
     */
    private static final String REPLACE_UNKNOWN_CHILD_MSG = 
        "Trying to replace a child that is not found in the given position.";
    /**
     * Replace a child of this node.
     * 
     * @param child  the child to replace
     * @param repl   the node to replace it with
     * @throws IllegalArgumentException  if <code>child</code> is not a child of this node
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:963
     */
    private void replaceChild(ASTNode child, ASTNode repl) {
        int i = getIndexOfChild(child);
        if (i < 0)
            throw new IllegalArgumentException(REPLACE_UNKNOWN_CHILD_MSG);
        setChild(repl, i);
    }
    /**
     * Replace a child of this node with a list of new nodes.
     * 
     * @param child  the child to replace
     * @param repl   the node to replace it with
     * @throws IllegalArgumentException  if <code>child</code> is not a child of this node
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:977
     */
    private void replaceChildWithList(ASTNode child, Iterable<? extends ASTNode> repl) {
        int i = getIndexOfChild(child);
        if (i < 0)
            throw new IllegalArgumentException(REPLACE_UNKNOWN_CHILD_MSG);
        Iterator<? extends ASTNode> it = repl.iterator();
        if (it.hasNext()) {
            setChild(it.next(), i);
            while (it.hasNext())
                insertChild(it.next(), ++i);
        } else {
            removeChild(i);
        }
    }
    /**
     * Replace this node in the tree.
     * 
     * @param repl  the node to replace it with
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:996
     */
    protected void replaceMe(ASTNode repl) {
        ASTNode p = getParent();
        if (p != null) { 
            if (p instanceof DynamicOpt)
                p.setChild(repl, 0);
            else
                p.replaceChild(this, repl);
        }
    }
    /**
     * Replace this node in the tree with a list of new nodes.
     * 
     * @param repl  the list of nodes to replace it with
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1011
     */
    protected void replaceMeWithList(Iterable<? extends ASTNode> repl) {
        ASTNode p = getParent();
        if (p != null)
            p.replaceChildWithList(this, repl);
    }
    /**
     * Helper method to check if a list of statements are all inlinable.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1231
     */
    public static boolean isAllInlinable(Iterable<? extends FStatement> list) {
        for (FStatement stmt : list)
            if (!stmt.isInlinable())
                return false;
        return true;
    }
    /**
     * Replace all variable references according to the inlining helper.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1510
     */
    public ASTNode replaceReferences(AbstractFunctionInliner fi) {
        for (ASTNode n : this)
            n.replaceReferences(fi);
        return this;
    }
    /**
     * Replace all variable references in array subscripts according to the inlining helper.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1687
     */
    public void replaceReferencesInSubscripts(AbstractFunctionInliner fi) {
        for (ASTNode n : this)
            n.replaceReferencesInSubscripts(fi);
    }
    /**
     * Enables constant folding
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:645
     */
    public void enableConstantFolding() {
	    for (ASTNode n : this)
	        n.enableConstantFolding();
	}
    /**
     * Post processing FFunctionDecls after scalarization.
     * Clear the scalarized flag for all FQNames.
     * Rewrite FIdTempExp to FIdUseExp
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:38
     */
    public void clearScalarized() {
        for (ASTNode node : this)
            node.clearScalarized();
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:122
     */
    public void usesInScalarizedExp(Set<FAbstractVariable> res) {
        for (ASTNode n : this)
            n.usesInScalarizedExp(res);
    }
    /**
     * Traverser for {@link FExp#createArrayTemporaries(Scalarizer s)}.
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:144
     */
    public void createArrayTemporaries(Scalarizer s) {
        for (ASTNode n : this)
            n.createArrayTemporaries(s);
    }
    /**
     * Wrapper for {@link ASTNode#addArrayUsesToIndexMap(FExp[] names)}.
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:650
     */
    public void addArrayUsesToIndexMap(Scalarizer s) {
        addArrayUsesToIndexMap(s.getNames().createFExpArray());
    }
    /**
     * Traverser for {@link FExp#addArrayUsesToIndexMap(FExp[] names)}.
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:657
     */
    public void addArrayUsesToIndexMap(FExp[] names) {
        for (ASTNode n : this)
            n.addArrayUsesToIndexMap(names);
    }
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:500
     */
    public Set<FIdUseExp> homotopySimplifiedVarUseLookupVisitor() {
        return findFIdUseExpsInTree(HomotopySimplifiedVarUseLookupVisitor.instance);
    }
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:504
     */
    public void homotopySimplifiedVarUseLookupVisitor(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        findFIdUseExpsInTree(set, visitor);
    }
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:1750
     */
    public static final AbstractEquationBlock.BlockProblemProducer NESTED_NON_SCALAR_BLOCK =
            new AbstractEquationBlock.BlockProblemProducer("NESTED_NON_SCALAR_BLOCK", "Nested non scalar blocks are not allowed since option 'allow_non_scalar_nested_blocks' is set to false.");
    /**
     * @aspect BLTPrettyPrinting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:2719
     */
    public static BLTPrettyPrinter BLTPrettyPrinter = new BLTPrettyPrinter();
    /**
     * @aspect SmoothOrder
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:795
     */
    public static final int SMOOTH_ORDER_ANNOTATION_DEFAULT = -1;
    /**
     * @aspect SmoothOrder
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:797
     */
    public static int readSmoothOrderAnnotation(AnnotationNode a) {
        AnnotationNode smoothOrder = a.forPath("smoothOrder");
        if (smoothOrder.isIntegerValue())
            return smoothOrder.integer();
        else
            return SMOOTH_ORDER_ANNOTATION_DEFAULT;
    }
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:92
     */
    public void enableDynamicStateRewrite() {
        for (ASTNode n : this)
            n.enableDynamicStateRewrite();
    }
    /**
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:189
     */
    public Set<String> sortingAddNamesUsed(Set<String> set) {
        for (ASTNode n : this)
            n.sortingAddNamesUsed(set);
        return set;
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:1533
     */
    public void findDAEVarUsesInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        findFIdUseExpsInTree(set, visitor);
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:1542
     */
    public void findInitDAEVarUsesInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        findFIdUseExpsInTree(set, visitor);
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:1546
     */
    public Set<FIdUseExp> findInitUniqueDAEVarUsesInTree() {
        return findFIdUseExpsInTree(InitUniqueDAEVarUseLookupVisitor.instance);
    }
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:1550
     */
    public void findInitUniqueDAEVarUsesInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        for (ASTNode n : this) {
            visitor.visit(n, set);
        }
    }
    /**
     * This method is used when the original node has been discarded and the
     * orignal references in FRelExp and FSampleExp needs to be reset.
     * 
     * It is also used when it is known that original expression doesn't
     * produce events but the new does. For example the derivative of
     * smooot(1, ...).
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:370
     */
    protected void resetOriginalReferences() {
        for (int i = 0; i < getNumChildNoTransform(); i++) {
            getChildNoTransform(i).resetOriginalReferences();
        }
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:400
     */
    protected void traverseSymbolic(ASTNode e) {
		for (int i = 0; i < getNumChildNoTransform(); i++) {
			getChildNoTransform(i).traverseSymbolic(e.getChildNoTransform(i));
		}
	}
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:430
     */
    public ASTNode copySymbolic() {
		ASTNode res = fullCopy();
		res.traverseSymbolic(this);
		return res;
	}
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:19
     */
    public boolean collectTestCases(TestSuite ts, String className) {
        for (ASTNode n : this)
            if (n.collectTestCases(ts, className))
                return true;
        return false;
    }
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:40
     */
    public void collectTestCases(TestSuite ts) {
        for (ASTNode n : this)
            n.collectTestCases(ts);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:38
     */
    public String prettyPrint_XML(String indent) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new CodeStream(os);
		prettyPrint_XML(str, indent);
		return os.toString();
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:45
     */
    public void prettyPrint_XML(CodeStream str, String indent) {
 		prettyPrint_XML(new XMLPrettyPrinter(), str, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:49
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		prettyPrint(p, str, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:56
     */
    private static final String XML_TAG_OPEN_FORMAT    = "%s<%s:%s>";
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:57
     */
    private static final String XML_TAG_OPEN_FORMAT_NL = "%s<%s:%s>\n";
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:58
     */
    private static final String XML_TAG_CLOSE_FORMAT   = "%s</%s:%s>\n";
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:59
     */
    private static final String XML_TAG_SINGLE_FORMAT  = "%s<%s:%s/>\n";
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:61
     */
    public void tag_XML(CodeStream str, String format, String indent) {
		str.format(format, indent, xmlNamespace(), xmlTag());
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:65
     */
    public void tag_XML(CodeStream str, String format, String indent, String tag) {
		str.format(format, indent, xmlNamespace(), tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:69
     */
    public void tag_XML(CodeStream str, String format, String indent, Map<String, String> attr) {
		str.format(format, indent, xmlNamespace(), addAttrs_XML(xmlTag(), attr));
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:73
     */
    public void tag_XML(CodeStream str, String format, String indent, String tag, Map<String, String> attr) {
		str.format(format, indent, xmlNamespace(), addAttrs_XML(tag, attr));
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:77
     */
    private static String addAttrs_XML(String tag, Map<String, String> attr) {
		StringBuilder buf = new StringBuilder(tag);
		for (String name : attr.keySet()) {
			buf.append(' ');
			buf.append(name);
			buf.append('=');
			buf.append(attr.get(name));
		}
		return buf.toString();
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:88
     */
    public void open_XML(CodeStream str, String indent) {
		tag_XML(str, XML_TAG_OPEN_FORMAT_NL, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:92
     */
    public void open_XML(CodeStream str, String indent, String tag) {
		tag_XML(str, XML_TAG_OPEN_FORMAT_NL, indent, tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:96
     */
    public void open_XML(CodeStream str, String indent, Map<String, String> attr) {
		tag_XML(str, XML_TAG_OPEN_FORMAT_NL, indent, attr);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:100
     */
    public void open_XML(CodeStream str, String indent, String tag, Map<String, String> attr) {
		tag_XML(str, XML_TAG_OPEN_FORMAT_NL, indent, tag, attr);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:104
     */
    public void openLine_XML(CodeStream str, String indent) {
		tag_XML(str, XML_TAG_OPEN_FORMAT, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:108
     */
    public void openLine_XML(CodeStream str, String indent, Map<String, String> attr) {
		tag_XML(str, XML_TAG_OPEN_FORMAT, indent, attr);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:112
     */
    public void close_XML(CodeStream str) {
		close_XML(str, "");
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:116
     */
    public void close_XML(CodeStream str, String indent) {
		tag_XML(str, XML_TAG_CLOSE_FORMAT, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:120
     */
    public void close_XML(CodeStream str, String indent, String tag) {
		tag_XML(str, XML_TAG_CLOSE_FORMAT, indent, tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:124
     */
    public void single_XML(CodeStream str, String indent) {
		tag_XML(str, XML_TAG_SINGLE_FORMAT, indent);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:128
     */
    public void single_XML(CodeStream str, String indent, String tag) {
		tag_XML(str, XML_TAG_SINGLE_FORMAT, indent, tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:132
     */
    public void single_XML(CodeStream str, String indent,  Map<String, String> attr) {
		tag_XML(str, XML_TAG_SINGLE_FORMAT, indent, attr);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:136
     */
    public void single_XML(CodeStream str, String indent, String tag, Map<String, String> attr) {
		tag_XML(str, XML_TAG_SINGLE_FORMAT, indent, tag, attr);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:140
     */
    public void enclose_XML(Printer p, CodeStream str, String indent, String tag, ASTNode node) {
		open_XML(str, indent, tag);
		p.print(node, str, indent);
		close_XML(str, indent, tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:146
     */
    public void enclose_XML(Printer p, CodeStream str, String indent, String tag, ASTNode node, Map<String, String> attr) {
		open_XML(str, indent, tag, attr);
		p.print(node, str, indent);
		close_XML(str, indent, tag);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:152
     */
    public static Map<String,String> attr_XML(String... args) {
		switch (args.length / 2) {
		case 0:
			return Collections.emptyMap();
		case 1:
			return Collections.singletonMap(args[0], args[1]);
		default:
			Map<String,String> res = new LinkedHashMap<String,String>();
			for (int i = 0; i < args.length - 1; i += 2)
				res.put(args[i], args[i + 1]);
			return res;
		}
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:89
     */
    static CADPrettyPrinter printer_CAD = new CADPrettyPrinter();
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:91
     */
    public String prettyPrint_CAD(String indent) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new CodeStream(os);
		prettyPrint_CAD(str,indent);
		return os.toString();
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:98
     */
    public void prettyPrint_CAD(CodeStream str, String indent) {
 		prettyPrint_CAD(printer_CAD, str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:103
     */
    public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
 		prettyPrint_C(p, str, indent);
	}
    /**
     * Iterates over the ASTNode:s and generates temporary AD variables 
     * in arrays etc. which are currently not supported in AD. 
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD 
     * @param str     the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1429
     */
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this){
            p.printPreSteps(node, str, indent);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1435
     */
    public void genTempFree_CAD(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this){
            p.printPostSteps(node, str, indent);
        }
    }
    /**
     * Iterates over the ASTNode:s and generates variable declarations. 
     * Can be called at e.g. the start of functions for c89-compliance. 
     * Note that the methods used to print the regular AD code typically
     * assumes that variables are already declared.  
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1562
     */
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this)
            node.genVarDecls_CAD(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:277
     */
    static CPrettyPrinter printer_C = new CPrettyPrinter();
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:278
     */
    static CPrettyPrinter blockPrinter_C = new CPrettyPrinter(true);
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:280
     */
    public String prettyPrint_C(String indent) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new CodeStream(os);
		prettyPrint_C(str,indent);
		return os.toString();
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:287
     */
    public void prettyPrint_C(CodeStream str, String indent) {
 		prettyPrint_C(printer_C, str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:291
     */
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this)
            node.genVarDecls_C(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:296
     */
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this)
            p.printPreSteps(node, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:301
     */
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
 		prettyPrint(p, str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:305
     */
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        for (ASTNode node : this)
            p.printPostSteps(node, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:888
     */
    public static final String C_SUFFIX_DEF      = "def";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:889
     */
    public static final String C_SUFFIX_EXP      = "exp";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:890
     */
    public static final String C_SUFFIX_REC      = "r";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:891
     */
    public static final String C_SUFFIX_EXT      = "_ext";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:892
     */
    public static final String C_SUFFIX_ENUM     = "e";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:893
     */
    public static final String C_SUFFIX_INDEX    = "i";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:894
     */
    public static final String C_SUFFIX_VARIABLE = "v";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:895
     */
    public static final String C_SUFFIX_ARRAY    = "a";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:896
     */
    public static final String C_SUFFIX_RETURN   = "o";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:897
     */
    public static final String C_SUFFIX_NULL     = "n";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:899
     */
    public static final String C_ARRAY_RECORD    = "rec";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:900
     */
    public static final String C_ARRAY_REFERENCE = "ref";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:901
     */
    public static final String C_ARRAY_VALUE     = "val";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:904
     */
    public static final String C_SUFFIX_FP       = "fp";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:905
     */
    public static final String C_SUFFIX_FPCL     = "fpcl";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:906
     */
    public static final String C_SUFFIX_FPCR     = "fpcr";
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:907
     */
    public static final String C_SUFFIX_FPOUT    = "fpout";
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:69
     */
    public static final String C_SUFFIX_EXPORT = "export";
    /**
     * @aspect DiagnosticsGeneration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/DiagnosticsGenerator.jrag:897
     */
    protected static String escapeHTML(Object o) {
    return escapeHTML(o.toString());
}
    /**
     * @aspect DiagnosticsGeneration
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/DiagnosticsGenerator.jrag:901
     */
    protected static String escapeHTML(String str) {
    str = str.replace("&", "&amp;");
    str = str.replace("\"", "&quot;");
    str = str.replace("\'", "&039;");
    str = str.replace("<", "&lt;");
    str = str.replace(">", "&gt;");
    return str;
}
    /**
     * @declaredat ASTNode:1
     */
    public ASTNode() {
        super();
        init$Children();
    }
    /**
     * Initializes the child array to the correct size.
     * Initializes List and Opt nta children.
     * @apilevel internal
     * @ast method
     * @declaredat ASTNode:11
     */
    public void init$Children() {
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:16
     */
    private int childIndex;
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    public int getIndexOfChild(ASTNode node) {
        if (node == null) {
            return -1;
        }
        if (node.childIndex < numChildren && node == children[node.childIndex]) {
            return node.childIndex;
        }
        for(int i = 0; children != null && i < children.length; i++) {
            if(children[i] == node) {
                node.childIndex = i;
                return i;
            }
        }
        return -1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public static final boolean generatedWithCacheCycle = true;
    /**
     * @apilevel internal
     * @declaredat ASTNode:44
     */
    public static final boolean generatedWithComponentCheck = false;
    /**
     * Parent pointer
     * @apilevel low-level
     * @declaredat ASTNode:50
     */
    protected ASTNode parent;
    /**
     * Child array
     * @apilevel low-level
     * @declaredat ASTNode:56
     */
    protected ASTNode[] children;
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    protected static ASTNode$State state = new ASTNode$State();
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public final ASTNode$State state() {
        return state;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:74
     */
    public boolean in$Circle = false;
    /**
     * @apilevel internal
     * @declaredat ASTNode:79
     */
    public boolean in$Circle() {
        return in$Circle;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:86
     */
    public void in$Circle(boolean b) {
        in$Circle = b;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:93
     */
    public boolean is$Final = false;
    /**
     * @apilevel internal
     * @declaredat ASTNode:97
     */
    public boolean is$Final() { return is$Final; }
    /**
     * @apilevel internal
     * @declaredat ASTNode:101
     */
    public void is$Final(boolean b) { is$Final = b; }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:106
     */
    public T getChild(int i) {

        ASTNode node = this.getChildNoTransform(i);
        if(node == null) {
            return null;
        }
        if(node.is$Final()) {
            return (T) node;
        }
        if(!node.mayHaveRewrite()) {
            node.is$Final(this.is$Final());
            return (T) node;
        }
        if(!node.in$Circle()) {
            int rewriteState;
            int num = this.state().boundariesCrossed;
            do {
                this.state().push(ASTNode$State.REWRITE_CHANGE);
                ASTNode oldNode = node;
                oldNode.in$Circle(true);
                node = node.rewriteTo();
                if(node != oldNode) {
                    this.setChild(node, i);
                }
                oldNode.in$Circle(false);
                rewriteState = this.state().pop();
            } while(rewriteState == ASTNode$State.REWRITE_CHANGE);
            if(rewriteState == ASTNode$State.REWRITE_NOCHANGE && this.is$Final()) {
                node.is$Final(true);
                this.state().boundariesCrossed = num;
            } else {
            }
        } else if(this.is$Final() != node.is$Final()) {
            this.state().boundariesCrossed++;
        } else {
        }
        return (T) node;


    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:149
     */
    public void addChild(T node) {
        setChild(node, getNumChildNoTransform());
    }
    /**
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @apilevel low-level
     * @declaredat ASTNode:156
     */
    public final T getChildNoTransform(int i) {
        if (children == null) {
            return null;
        }
        T child = (T)children[i];
        return child;
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:166
     */
    protected int numChildren;
    /**
     * @apilevel low-level
     * @declaredat ASTNode:171
     */
    protected int numChildren() {
        return numChildren;
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:178
     */
    public int getNumChild() {
        return numChildren();
    }
    /**
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @apilevel low-level
     * @declaredat ASTNode:186
     */
    public final int getNumChildNoTransform() {
        return numChildren();
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:192
     */
    public void setChild(ASTNode node, int i) {
        if(children == null) {
            children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
        } else if (i >= children.length) {
            ASTNode c[] = new ASTNode[i << 1];
            System.arraycopy(children, 0, c, 0, children.length);
            children = c;
        }
        children[i] = node;
        if(i >= numChildren) {
            numChildren = i+1;
        }
        if(node != null) {
            node.setParent(this);
            node.childIndex = i;
        }
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:212
     */
    public void insertChild(ASTNode node, int i) {
        if(children == null) {
            children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
            children[i] = node;
        } else {
            ASTNode c[] = new ASTNode[children.length + 1];
            System.arraycopy(children, 0, c, 0, i);
            c[i] = node;
            if(i < children.length) {
                System.arraycopy(children, i, c, i+1, children.length-i);
                for(int j = i+1; j < c.length; ++j) {
                    if(c[j] != null) {
                        c[j].childIndex = j;
                    }
                }
            }
            children = c;
        }
        numChildren++;
        if(node != null) {
            node.setParent(this);
            node.childIndex = i;
        }
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:239
     */
    public void removeChild(int i) {
        if(children != null) {
            ASTNode child = (ASTNode) children[i];
            if(child != null) {
                child.parent = null;
                child.childIndex = -1;
            }
            // Adding a check of this instance to make sure its a List, a move of children doesn't make
            // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
            // and siblings are moved one step to the right, with null at the end.
            if (this instanceof List || this instanceof Opt) {
                System.arraycopy(children, i+1, children, i, children.length-i-1);
                children[children.length-1] = null;
                numChildren--;
                // fix child indices
                for(int j = i; j < numChildren; ++j) {
                    if(children[j] != null) {
                        child = (ASTNode) children[j];
                        child.childIndex = j;
                    }
                }
            } else {
                children[i] = null;
            }
        }
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:268
     */
    public ASTNode getParent() {
        if(parent != null && ((ASTNode) parent).is$Final() != is$Final()) {
            state().boundariesCrossed++;
        }
        ;
        return (ASTNode) parent;
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:278
     */
    public void setParent(ASTNode node) {
        parent = node;
    }
    /**
     * @declaredat ASTNode:317
     */
    protected boolean duringTransformCanonical() {
    if(state().duringTransformCanonical == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:327
     */
    protected boolean duringFlattening() {
    if(state().duringFlattening == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:337
     */
    protected boolean duringScalarization() {
    if(state().duringScalarization == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:347
     */
    protected boolean duringIfEquations() {
    if(state().duringIfEquations == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:357
     */
    protected boolean duringConstantFolding() {
    if(state().duringConstantFolding == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:367
     */
    protected boolean duringExpressionSimplification() {
    if(state().duringExpressionSimplification == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:377
     */
    protected boolean duringFlatAPI() {
    if(state().duringFlatAPI == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:387
     */
    protected boolean duringDynamicStateSelect() {
    if(state().duringDynamicStateSelect == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:397
     */
    protected boolean duringFunctionScalarization() {
    if(state().duringFunctionScalarization == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:407
     */
    protected boolean duringDummyDerivatives() {
    if(state().duringDummyDerivatives == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:417
     */
    protected boolean duringAlgorithmDifferentiation() {
    if(state().duringAlgorithmDifferentiation == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:427
     */
    protected boolean duringInstFunctionBinding() {
    if(state().duringInstFunctionBinding == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:437
     */
    protected boolean duringFlatExpressions() {
    if(state().duringFlatExpressions == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:447
     */
    protected boolean duringExtractSampleExpressions() {
    if(state().duringExtractSampleExpressions == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:457
     */
    protected boolean duringConnections() {
    if(state().duringConnections == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:467
     */
    protected boolean duringInstanceTreeConstruction() {
    if(state().duringInstanceTreeConstruction == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:477
     */
    protected boolean duringInstNameClassification() {
    if(state().duringInstNameClassification == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:487
     */
    protected boolean duringInstResolveAmbiguousNames() {
    if(state().duringInstResolveAmbiguousNames == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:497
     */
    protected boolean duringInitialTransformations() {
    if(state().duringInitialTransformations == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @declaredat ASTNode:507
     */
    protected boolean duringPredefinedTypes() {
    if(state().duringPredefinedTypes == 0) {
        return false;
    } else {
        state().pop();
        state().push(ASTNode$State.REWRITE_INTERRUPT);
        return true;
    }
}
    /**
     * @apilevel low-level
     * @declaredat ASTNode:610
     */
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int counter = 0;
            public boolean hasNext() {
                return counter < getNumChild();
            }
            public T next() {
                if(hasNext())
                    return (T)getChild(counter++);
                else
                    return null;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:630
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:636
     */
    public void flushTreeCache() {
        flushCache();
        if (children == null) {
            return;
        }
        for (int i = 0; i < children.length; i++) {
            if (children[i] != null && ((ASTNode)children[i]).is$Final) {
                ((ASTNode)children[i]).flushTreeCache();
            }
        }
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:650
     */
    public void flushCache() {
        flushAttrAndCollectionCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:656
     */
    public void flushAttrAndCollectionCache() {
        flushAttrCache();
        flushCollectionCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:663
     */
    public void flushAttrCache() {
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:668
     */
    public void flushCollectionCache() {
    }
    /**
     * @api internal
     * @declaredat ASTNode:673
     */
    public void flushRewriteCache() {
        in$Circle(false);
        is$Final(false);
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:680
     */
    public ASTNode<T> clone() throws CloneNotSupportedException {
        ASTNode node = (ASTNode) super.clone();
        if (node.is$Final()) {
            node.flushAttrAndCollectionCache();
        }
        node.in$Circle(false);
        // flush rewrites
        node.is$Final(false);
    SymbolValueFixer.fix(node);
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:693
     */
    public ASTNode<T> copy() {
        try {
            ASTNode node = (ASTNode) clone();
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
     * @declaredat ASTNode:712
     */
    public ASTNode<T> fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:721
     */
    public ASTNode<T> treeCopyNoTransform() {
        ASTNode tree = (ASTNode) copy();
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
     * @declaredat ASTNode:741
     */
    public ASTNode<T> treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * Performs a full traversal of the tree using getChild to trigger rewrites
     * @apilevel low-level
     * @declaredat ASTNode:749
     */
    public void doFullTraversal() {
        for (int i = 0; i < getNumChild(); i++) {
            getChild(i).doFullTraversal();
        }
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:757
     */
    protected boolean is$Equal(ASTNode n1, ASTNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return n1.is$Equal(n2);
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:765
     */
    protected boolean is$Equal(ASTNode node) {
        if (getClass() != node.getClass()) {
            return false;
        }
        if (numChildren != node.numChildren) {
            return false;
        }
        for (int i = 0; i < numChildren; i++) {
            if (children[i] == null && node.children[i] != null) {
                return false;
            }
            if (!((ASTNode)children[i]).is$Equal(((ASTNode)node.children[i]))) {
                return false;
            }
        }
        return true;
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:352
     */
        protected void collect_contributors_FClass_reals() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_reals();
        }
    }
    protected void contributeTo_FClass_FClass_reals(ArrayList<FRealVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:357
     */
        protected void collect_contributors_FClass_integers() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_integers();
        }
    }
    protected void contributeTo_FClass_FClass_integers(ArrayList<FIntegerVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:362
     */
        protected void collect_contributors_FClass_enums() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_enums();
        }
    }
    protected void contributeTo_FClass_FClass_enums(ArrayList<FEnumVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:367
     */
        protected void collect_contributors_FClass_booleans() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_booleans();
        }
    }
    protected void contributeTo_FClass_FClass_booleans(ArrayList<FBooleanVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:372
     */
        protected void collect_contributors_FClass_strings() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_strings();
        }
    }
    protected void contributeTo_FClass_FClass_strings(ArrayList<FStringVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:377
     */
        protected void collect_contributors_FClass_independentConstants() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_independentConstants();
        }
    }
    protected void contributeTo_FClass_FClass_independentConstants(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:384
     */
        protected void collect_contributors_FClass_externalObjectVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_externalObjectVariables();
        }
    }
    protected void contributeTo_FClass_FClass_externalObjectVariables(ArrayList<FExternalObjectVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:513
     */
        protected void collect_contributors_FClass_regularIndependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_regularIndependentParameters();
        }
    }
    protected void contributeTo_FClass_FClass_regularIndependentParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:540
     */
        protected void collect_contributors_FClass_structuralIndependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_structuralIndependentParameters();
        }
    }
    protected void contributeTo_FClass_FClass_structuralIndependentParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:567
     */
        protected void collect_contributors_FClass_finalIndependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_finalIndependentParameters();
        }
    }
    protected void contributeTo_FClass_FClass_finalIndependentParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:594
     */
        protected void collect_contributors_FClass_evalIndependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_evalIndependentParameters();
        }
    }
    protected void contributeTo_FClass_FClass_evalIndependentParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:621
     */
        protected void collect_contributors_FClass_dependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_dependentParameters();
        }
    }
    protected void contributeTo_FClass_FClass_dependentParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:669
     */
        protected void collect_contributors_FClass_allDifferentiatedRealVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_allDifferentiatedRealVariables();
        }
    }
    protected void contributeTo_FClass_FClass_allDifferentiatedRealVariables(LinkedHashSet<FRealVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:702
     */
        protected void collect_contributors_FClass_dynamicStates() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_dynamicStates();
        }
    }
    protected void contributeTo_FClass_FClass_dynamicStates(LinkedHashSet<FRealVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:713
     */
        protected void collect_contributors_FClass_dynamicStateVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_dynamicStateVariables();
        }
    }
    protected void contributeTo_FClass_FClass_dynamicStateVariables(LinkedHashSet<FDynamicStateVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:723
     */
        protected void collect_contributors_FClass_dynamicAlgebraicVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_dynamicAlgebraicVariables();
        }
    }
    protected void contributeTo_FClass_FClass_dynamicAlgebraicVariables(LinkedHashSet<FDynamicAlgebraicVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:733
     */
        protected void collect_contributors_FClass_differentiatedRealVariablesFilteredSet() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_differentiatedRealVariablesFilteredSet();
        }
    }
    protected void contributeTo_FClass_FClass_differentiatedRealVariablesFilteredSet(LinkedHashSet<FRealVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:747
     */
        protected void collect_contributors_FClass_myFFunctionDeclsPartial() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_myFFunctionDeclsPartial();
        }
    }
    protected void contributeTo_FClass_FClass_myFFunctionDeclsPartial(LinkedHashSet<FFunctionDecl> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:756
     */
        protected void collect_contributors_FClass_myFFunctionDeclsPartialCalled() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_myFFunctionDeclsPartialCalled();
        }
    }
    protected void contributeTo_FClass_FClass_myFFunctionDeclsPartialCalled(LinkedHashSet<FFunctionDecl> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:760
     */
        protected void collect_contributors_FClass_myDelayExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_myDelayExps();
        }
    }
    protected void contributeTo_FClass_FClass_myDelayExps(ArrayList<FDelayExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:766
     */
        protected void collect_contributors_FClass_mySpatialDistExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_mySpatialDistExps();
        }
    }
    protected void contributeTo_FClass_FClass_mySpatialDistExps(ArrayList<FSpatialDistExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:785
     */
        protected void collect_contributors_FClass_derivativeVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_derivativeVariables();
        }
    }
    protected void contributeTo_FClass_FClass_derivativeVariables(ArrayList<FDerivativeVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:792
     */
        protected void collect_contributors_FClass_variables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_variables();
        }
    }
    protected void contributeTo_FClass_FClass_variables(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:799
     */
        protected void collect_contributors_FClass_discreteVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_discreteVariables();
        }
    }
    protected void contributeTo_FClass_FClass_discreteVariables(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:818
     */
        protected void collect_contributors_FClass_initialParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_initialParameters();
        }
    }
    protected void contributeTo_FClass_FClass_initialParameters(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:870
     */
        protected void collect_contributors_FClass_aliasVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_aliasVariables();
        }
    }
    protected void contributeTo_FClass_FClass_aliasVariables(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:889
     */
        protected void collect_contributors_FClass_tempVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_tempVariables();
        }
    }
    protected void contributeTo_FClass_FClass_tempVariables(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:982
     */
        protected void collect_contributors_FClass_variablesWithBindingExp() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_variablesWithBindingExp();
        }
    }
    protected void contributeTo_FClass_FClass_variablesWithBindingExp(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1009
     */
        protected void collect_contributors_FClass_inputs() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_inputs();
        }
    }
    protected void contributeTo_FClass_FClass_inputs(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1039
     */
        protected void collect_contributors_FClass_outputs() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_outputs();
        }
    }
    protected void contributeTo_FClass_FClass_outputs(ArrayList<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1100
     */
        protected void collect_contributors_FClass_algorithms() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_algorithms();
        }
    }
    protected void contributeTo_FClass_FClass_algorithms(ArrayList<FAlgorithm> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1272
     */
        protected void collect_contributors_FClass_sampleExpsWithTimeEvent() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_sampleExpsWithTimeEvent();
        }
    }
    protected void contributeTo_FClass_FClass_sampleExpsWithTimeEvent(ArrayList<FSampleExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1278
     */
        protected void collect_contributors_FClass_spatialDistExpsWithStateEvent() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_spatialDistExpsWithStateEvent();
        }
    }
    protected void contributeTo_FClass_FClass_spatialDistExpsWithStateEvent(ArrayList<FSpatialDistExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1284
     */
        protected void collect_contributors_FClass_delayExpsWithStateEvent() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_delayExpsWithStateEvent();
        }
    }
    protected void contributeTo_FClass_FClass_delayExpsWithStateEvent(ArrayList<FDelayExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1298
     */
        protected void collect_contributors_FClass_guardExpInEquations() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_guardExpInEquations();
        }
    }
    protected void contributeTo_FClass_FClass_guardExpInEquations(ArrayList<FExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1305
     */
        protected void collect_contributors_FClass_guardExpInInitialEquations() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_guardExpInInitialEquations();
        }
    }
    protected void contributeTo_FClass_FClass_guardExpInInitialEquations(ArrayList<FExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1391
     */
        protected void collect_contributors_FClass_relExpsWithEvent() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_relExpsWithEvent();
        }
    }
    protected void contributeTo_FClass_FClass_relExpsWithEvent(ArrayList<FRelExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1468
     */
        protected void collect_contributors_FClass_relExpInInitialEquations() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_relExpInInitialEquations();
        }
    }
    protected void contributeTo_FClass_FClass_relExpInInitialEquations(ArrayList<FRelExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3736
     */
        protected void collect_contributors_FClass_myAlgorithms() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_myAlgorithms();
        }
    }
    protected void contributeTo_FClass_FClass_myAlgorithms(ArrayList<FAlgorithm> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3819
     */
        protected void collect_contributors_FClass_myExternals() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_myExternals();
        }
    }
    protected void contributeTo_FClass_FClass_myExternals(HashSet<FExternalStmt> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1783
     */
        protected void collect_contributors_FClass_collectInstAccesses() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_collectInstAccesses();
        }
    }
    protected void contributeTo_FClass_FClass_collectInstAccesses(HashSet<InstAccess> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3326
     */
        protected void collect_contributors_FClass_eventGenExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_eventGenExps();
        }
    }
    protected void contributeTo_FClass_FClass_eventGenExps(ArrayList<FEventGenExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3647
     */
        protected void collect_contributors_FClass_collectSemiLinearExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FClass_collectSemiLinearExps();
        }
    }
    protected void contributeTo_FClass_FClass_collectSemiLinearExps(HashSet<FSemiLinearExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2774
     */
        protected void collect_contributors_FAbstractVariable_uses() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractVariable_uses();
        }
    }
    protected void contributeTo_FAbstractVariable_FAbstractVariable_uses(HashSet<FIdUseExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2912
     */
        protected void collect_contributors_FAbstractVariable_dependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractVariable_dependentParameters();
        }
    }
    protected void contributeTo_FAbstractVariable_FAbstractVariable_dependentParameters(HashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2858
     */
        protected void collect_contributors_FFunctionVariable_assigningUses() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FFunctionVariable_assigningUses();
        }
    }
    protected void contributeTo_FFunctionVariable_FFunctionVariable_assigningUses(HashSet<FIdUseExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1214
     */
        protected void collect_contributors_FExpSubscript_collectForIndices() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FExpSubscript_collectForIndices();
        }
    }
    protected void contributeTo_FExpSubscript_FExpSubscript_collectForIndices(HashSet<CommonForIndex> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1312
     */
        protected void collect_contributors_FAbstractEquation_transformedGuards() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_transformedGuards();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(Set<FExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1416
     */
        protected void collect_contributors_FAbstractEquation_relExpInEquation() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_relExpInEquation();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_relExpInEquation(ArrayList<FRelExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1426
     */
        protected void collect_contributors_FAbstractEquation_delayExpInEquation() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_delayExpInEquation();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_delayExpInEquation(ArrayList<FDelayExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1473
     */
        protected void collect_contributors_FAbstractEquation_relExpInInitialEquation() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_relExpInInitialEquation();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_relExpInInitialEquation(ArrayList<FRelExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1681
     */
        protected void collect_contributors_FAbstractEquation_replacedAtInitialExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_replacedAtInitialExps();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_replacedAtInitialExps(ArrayList<FExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2939
     */
        protected void collect_contributors_FAbstractEquation_retrieveInputs() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_retrieveInputs();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_retrieveInputs(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2973
     */
        protected void collect_contributors_FAbstractEquation_algebraicVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_algebraicVariables();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_algebraicVariables(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3010
     */
        protected void collect_contributors_FAbstractEquation_derivativeVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_derivativeVariables();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_derivativeVariables(LinkedHashSet<FDerivativeVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3020
     */
        protected void collect_contributors_FAbstractEquation_differentiatedRealVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_differentiatedRealVariables();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_differentiatedRealVariables(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3030
     */
        protected void collect_contributors_FAbstractEquation_dependentParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_dependentParameters();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_dependentParameters(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3040
     */
        protected void collect_contributors_FAbstractEquation_parameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_parameters();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_parameters(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3050
     */
        protected void collect_contributors_FAbstractEquation_discreteVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_discreteVariables();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_discreteVariables(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3060
     */
        protected void collect_contributors_FAbstractEquation_initialParameters() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_initialParameters();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_initialParameters(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3070
     */
        protected void collect_contributors_FAbstractEquation_discretePreVariables() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_discretePreVariables();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_discretePreVariables(LinkedHashSet<FVariable> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3175
     */
        protected void collect_contributors_FAbstractEquation_collectUses() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_collectUses();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_collectUses(Set<FIdUseExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:192
     */
        protected void collect_contributors_FAbstractEquation_timeExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FAbstractEquation_timeExps();
        }
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_timeExps(Set<FExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1421
     */
        protected void collect_contributors_FStatement_relExpInStmt() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FStatement_relExpInStmt();
        }
    }
    protected void contributeTo_FStatement_FStatement_relExpInStmt(ArrayList<FRelExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3336
     */
        protected void collect_contributors_FStatement_eventGenExps() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FStatement_eventGenExps();
        }
    }
    protected void contributeTo_FStatement_FStatement_eventGenExps(ArrayList<FEventGenExp> collection) {
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:38
     */
        protected void collect_contributors_FStatement_sizeAssertsColl() {
        for(int i = 0; i < getNumChild(); i++) {
            getChild(i).collect_contributors_FStatement_sizeAssertsColl();
        }
    }
    protected void contributeTo_FStatement_FStatement_sizeAssertsColl(ArrayList<FAssert> collection) {
    }

    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:831
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsFTimeExp() {
        ASTNode$State state = state();
        try {
                for (ASTNode child : this)
                    if (child.containsFTimeExp())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:840
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsFHomotopyExp() {
        ASTNode$State state = state();
        try {
                for (ASTNode child : this)
                    if (child.containsFHomotopyExp())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * Check if tree contains a function call returning an array or a record.
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1888
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasCompositeFunc() {
        ASTNode$State state = state();
        try {
                for (ASTNode n : this)
                    if (n.hasCompositeFunc())
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public UnknownFVariable unknownFVariable() {
        ASTNode$State state = state();
        UnknownFVariable unknownFVariable_value = root().unknownFVariable();

        return unknownFVariable_value;
    }
    /**
     * Counts the total number of FExp nodes in this ASTNode.
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1965
     */
    @ASTNodeAnnotation.Attribute
    public int numFExp() {
        ASTNode$State state = state();
        try {
                int n = 0;
                for (int i=0;i<getNumChild();i++)
                    n += getChild(i).numFExp();
                return n;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FType fUnknownType() {
        ASTNode$State state = state();
        FType fUnknownType_value = FUnknownType.SCALAR;

        return fUnknownType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType fNoType() {
        ASTNode$State state = state();
        FType fNoType_value = FNoType.SCALAR;

        return fNoType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fRealScalarType() {
        ASTNode$State state = state();
        FPrimitiveType fRealScalarType_value = FRealType.SCALAR;

        return fRealScalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fIntegerScalarType() {
        ASTNode$State state = state();
        FPrimitiveType fIntegerScalarType_value = FIntegerType.SCALAR;

        return fIntegerScalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fBooleanScalarType() {
        ASTNode$State state = state();
        FPrimitiveType fBooleanScalarType_value = FBooleanType.SCALAR;

        return fBooleanScalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fStringScalarType() {
        ASTNode$State state = state();
        FPrimitiveType fStringScalarType_value = FStringType.SCALAR;

        return fStringScalarType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fRealArrayType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fRealArrayType_Size_value = new FRealType(size);

        return fRealArrayType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fIntegerArrayType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fIntegerArrayType_Size_value = new FIntegerType(size);

        return fIntegerArrayType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fBooleanArrayType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fBooleanArrayType_Size_value = new FBooleanType(size);

        return fBooleanArrayType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fStringArrayType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fStringArrayType_Size_value = new FStringType(size);

        return fStringArrayType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fRealType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fRealType_Size_value = (size == Size.SCALAR) ? fRealScalarType() : fRealArrayType(size);

        return fRealType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fIntegerType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fIntegerType_Size_value = (size == Size.SCALAR) ? fIntegerScalarType() : fIntegerArrayType(size);

        return fIntegerType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fBooleanType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fBooleanType_Size_value = (size == Size.SCALAR) ? fBooleanScalarType() : fBooleanArrayType(size);

        return fBooleanType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPrimitiveType fStringType(Size size) {
        ASTNode$State state = state();
        FPrimitiveType fStringType_Size_value = (size == Size.SCALAR) ? fStringScalarType() : fStringArrayType(size);

        return fStringType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public ProblemOptionsProvider myProblemOptionsProvider() {
        ASTNode$State state = state();
        ProblemOptionsProvider myProblemOptionsProvider_value = root().getUtilInterface();

        return myProblemOptionsProvider_value;
    }
    @ASTNodeAnnotation.Attribute
    public int lineNumber() {
        ASTNode$State state = state();
        int lineNumber_value = (start != 0 || getParent()==null)? beginLine() : getParent().lineNumber();

        return lineNumber_value;
    }
    @ASTNodeAnnotation.Attribute
    public int columnNumber() {
        ASTNode$State state = state();
        int columnNumber_value = (start != 0 || getParent()==null)? beginColumn() : getParent().columnNumber();

        return columnNumber_value;
    }
    /**
     * @attribute syn
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:567
     */
    @ASTNodeAnnotation.Attribute
    public String errorComponentName() {
        ASTNode$State state = state();
        try {
                InstComponentDecl parent = errorEnclosingComponent();
                return parent == null ? null : parent.getFQName().scalarName(false);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isError() {
        ASTNode$State state = state();
        boolean isError_value = false;

        return isError_value;
    }
    @ASTNodeAnnotation.Attribute
    public String classErrorType() {
        ASTNode$State state = state();
        String classErrorType_value = null;

        return classErrorType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String classErrorName() {
        ASTNode$State state = state();
        String classErrorName_value = null;

        return classErrorName_value;
    }
    /**
     * @attribute syn
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:45
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsBreakStmt() {
        ASTNode$State state = state();
        try {
                for (ASTNode n : this)
                    if (n.containsBreakStmt())
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public UnknownClassDecl unknownClassDecl() {
        ASTNode$State state = state();
        UnknownClassDecl unknownClassDecl_value = root().unknownClassDecl();

        return unknownClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownComponentDecl unknownComponentDecl() {
        ASTNode$State state = state();
        UnknownComponentDecl unknownComponentDecl_value = root().unknownComponentDecl();

        return unknownComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstClassDecl unknownInstClassDecl() {
        ASTNode$State state = state();
        UnknownInstClassDecl unknownInstClassDecl_value = root().unknownInstClassDecl();

        return unknownInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstComponentDecl unknownInstComponentDecl() {
        ASTNode$State state = state();
        UnknownInstComponentDecl unknownInstComponentDecl_value = root().unknownInstComponentDecl();

        return unknownInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = AnnotationNode.NO_ANNOTATION;

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation(String path) {
        ASTNode$State state = state();
        AnnotationNode annotation_String_value = annotation().forPath(path);

        return annotation_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode createNullAnnotationNode() {
        ASTNode$State state = state();
        AnnotationNode createNullAnnotationNode_value = AnnotationNode.NO_ANNOTATION;

        return createNullAnnotationNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotationNode() {
        ASTNode$State state = state();
        AnnotationNode annotationNode_value = createNullAnnotationNode();

        return annotationNode_value;
    }
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2049
     */
    @ASTNodeAnnotation.Attribute
    public int numberOfDefaultFormattingItems() {
        ASTNode$State state = state();
        try {
        		int result = 0;
        		for (ASTNode node : this) {
        			result += node.numberOfDefaultFormattingItems();
        		}
        		return result;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2074
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<SourceBaseNode> nonScannedNodes() {
        ASTNode$State state = state();
        try {
        		ArrayList<SourceBaseNode> result = new ArrayList<SourceBaseNode>();
        		for (ASTNode node : this) {
        			result.addAll(node.nonScannedNodes());
        		}
        		return result;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2097
     */
    @ASTNodeAnnotation.Attribute
    public SourceBaseNode ownsFormattingItem(int startLine, int startColumn) {
        ASTNode$State state = state();
        try {
        		SourceBaseNode owner = null;
        		for (ASTNode node : this) {
        			owner = node.ownsFormattingItem(startLine, startColumn);
        			if (owner != null) {
        				return owner;
        			}
        		}
        
        		return null;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Root root() {
        ASTNode$State state = state();
        Root root_value = retrieveRoot();

        return root_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList emptyArrayList() {
        ASTNode$State state = state();
        ArrayList emptyArrayList_value = EMPTY_ARRAY_LIST;

        return emptyArrayList_value;
    }
    @ASTNodeAnnotation.Attribute
    public String dirName() {
        ASTNode$State state = state();
        String dirName_value = fileName().replaceFirst("^[^\\\\/]*$", ".").replaceFirst("[\\\\/][^\\\\/]*$", "");

        return dirName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = false;

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = "";

        return extraMemoryUseInfo_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:324
     */
    @ASTNodeAnnotation.Attribute
    public int nbrUses(String name) {
        ASTNode$State state = state();
        try {
        		int n = 0;
        		for (int i=0;i<getNumChild();i++) {
        			n += getChild(i).nbrUses(name);
        		}
        		return n;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = null;

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = null;

        return xmlNamespace_value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4217
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasEventIndicator() {
        ASTNode$State state = state();
        try {
                for (ASTNode n : this) {
                    if (n.hasEventIndicator()) {
                        return true;
                    }
                }
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:551
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl errorEnclosingComponent() {
        ASTNode$State state = state();
        InstComponentDecl errorEnclosingComponent_value = getParent().Define_errorEnclosingComponent(this, null);

        return errorEnclosingComponent_value;
    }
    /**
     * Can <code>node</code> be replaced as seen from here?
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1351
     */
    @ASTNodeAnnotation.Attribute
    public boolean canBeReplacedForMe(InstNode node) {
        ASTNode$State state = state();
        boolean canBeReplacedForMe_InstNode_value = getParent().Define_canBeReplacedForMe(this, null, node);

        return canBeReplacedForMe_InstNode_value;
    }
    /**
     * @attribute inh
     * @aspect RootAccess
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:50
     */
    @ASTNodeAnnotation.Attribute
    public Root retrieveRoot() {
        ASTNode$State state = state();
        Root retrieveRoot_value = getParent().Define_retrieveRoot(this, null);

        return retrieveRoot_value;
    }
    /**
     * @attribute inh
     * @aspect FileNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:554
     */
    @ASTNodeAnnotation.Attribute
    public String retrieveFileName() {
        ASTNode$State state = state();
        String retrieveFileName_value = getParent().Define_retrieveFileName(this, null);

        return retrieveFileName_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:727
     */
    @ASTNodeAnnotation.Attribute
    public String packagePath(String name) {
        ASTNode$State state = state();
        String packagePath_String_value = getParent().Define_packagePath(this, null, name);

        return packagePath_String_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:738
     */
    @ASTNodeAnnotation.Attribute
    public String topPackagePath() {
        ASTNode$State state = state();
        String topPackagePath_value = getParent().Define_topPackagePath(this, null);

        return topPackagePath_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:835
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl enclosingInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl enclosingInstClassDecl_value = getParent().Define_enclosingInstClassDecl(this, null);

        return enclosingInstClassDecl_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:848
     */
    @ASTNodeAnnotation.Attribute
    public BaseClassDecl enclosingClassDecl() {
        ASTNode$State state = state();
        BaseClassDecl enclosingClassDecl_value = getParent().Define_enclosingClassDecl(this, null);

        return enclosingClassDecl_value;
    }
    /**
     * Check if this node is in a disabled condition component.
     * 
     * Only valid in instance tree.
     * @attribute inh
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1458
     */
    @ASTNodeAnnotation.Attribute
    public boolean inDisabledComponent() {
        ASTNode$State state = state();
        boolean inDisabledComponent_value = getParent().Define_inDisabledComponent(this, null);

        return inDisabledComponent_value;
    }
    /**
     * @attribute inh
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1782
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFirst() {
        ASTNode$State state = state();
        boolean isFirst_value = getParent().Define_isFirst(this, null);

        return isFirst_value;
    }
    /**
     * @attribute inh
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1786
     */
    @ASTNodeAnnotation.Attribute
    public boolean isLast() {
        ASTNode$State state = state();
        boolean isLast_value = getParent().Define_isLast(this, null);

        return isLast_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1045
     * @apilevel internal
     */
    public Size Define_defaultSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return Size.SCALAR;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1053
     * @apilevel internal
     */
    public Size Define_defaultSizeCalc(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return Size.SCALAR;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2346
     * @apilevel internal
     */
    public boolean Define_inArray(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2355
     * @apilevel internal
     */
    public FType Define_inferredType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1662
     * @apilevel internal
     */
    public boolean Define_isFunctionCallClause(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1538
     * @apilevel internal
     */
    public int Define_retrieveParentPrecedence(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return FExp.PRECEDENCE_LOWEST;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:454
     * @apilevel internal
     */
    public boolean Define_isTopWhenIfEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:958
     * @apilevel internal
     */
    public Access Define_retrieveTopAccess(ASTNode caller, ASTNode child, Access pre) {
        int childIndex = this.getIndexOfChild(caller);
        return pre;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1782
     * @apilevel internal
     */
    public boolean Define_isFirst(ASTNode caller, ASTNode child) {
        int i = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1786
     * @apilevel internal
     */
    public boolean Define_isLast(ASTNode caller, ASTNode child) {
        int i = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        if(state().peek() == ASTNode$State.REWRITE_CHANGE) {
            state().pop();
            state().push(ASTNode$State.REWRITE_NOCHANGE);
        }
        return this;
    }
    /**
     * @apilevel internal
     */
    public CValue Define_cevalRecordMember(ASTNode caller, ASTNode child, VariableEvaluator evaluator, InstNamedAccess access) {
        return getParent().Define_cevalRecordMember(this, caller, evaluator, access);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isFunctionCallArg(ASTNode caller, ASTNode child) {
        return getParent().Define_isFunctionCallArg(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isLeftHandSide(ASTNode caller, ASTNode child) {
        return getParent().Define_isLeftHandSide(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isAssignedTo(ASTNode caller, ASTNode child) {
        return getParent().Define_isAssignedTo(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldhaveParenthesis(ASTNode caller, ASTNode child) {
        return getParent().Define_shouldhaveParenthesis(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isModificationName(ASTNode caller, ASTNode child) {
        return getParent().Define_isModificationName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isExpandableConnectorMemberInConnect(ASTNode caller, ASTNode child) {
        return getParent().Define_isExpandableConnectorMemberInConnect(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inConnectWithExistingComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_inConnectWithExistingComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_accessToModelOK(ASTNode caller, ASTNode child) {
        return getParent().Define_accessToModelOK(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isDestructorArgument(ASTNode caller, ASTNode child) {
        return getParent().Define_isDestructorArgument(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isMultipliedWith(ASTNode caller, ASTNode child, FVariable v) {
        return getParent().Define_isMultipliedWith(this, caller, v);
    }
    /**
     * @apilevel internal
     */
    public InstValueModification Define_inheritedInstValueModTop(ASTNode caller, ASTNode child) {
        return getParent().Define_inheritedInstValueModTop(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        return getParent().Define_canInlineConstant(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        return getParent().Define_flattenFASContext(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isGeneratedInner(ASTNode caller, ASTNode child) {
        return getParent().Define_isGeneratedInner(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInstRecordConstructorArg(ASTNode caller, ASTNode child) {
        return getParent().Define_isInstRecordConstructorArg(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupRecordConstructorVirtualInstComponentDecl(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupRecordConstructorVirtualInstComponentDecl(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_lookupConstrainingInstClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupConstrainingInstClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupConstrainingInstComponent(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupConstrainingInstComponent(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_findClosestConstrainingInstNode(ASTNode caller, ASTNode child) {
        return getParent().Define_findClosestConstrainingInstNode(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inheritsFinal(ASTNode caller, ASTNode child) {
        return getParent().Define_inheritsFinal(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_annotationName(ASTNode caller, ASTNode child) {
        return getParent().Define_annotationName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldNotBeFormatted(ASTNode caller, ASTNode child) {
        return getParent().Define_shouldNotBeFormatted(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldOnlyFormatChildren(ASTNode caller, ASTNode child) {
        return getParent().Define_shouldOnlyFormatChildren(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_retrieveFileName(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveFileName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_enclosingInstComponentDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingInstComponentDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstAccess Define_getNextInstAccess(ASTNode caller, ASTNode child) {
        return getParent().Define_getNextInstAccess(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstAccess Define_retrieveTopInstAccess(ASTNode caller, ASTNode child, InstAccess pre) {
        return getParent().Define_retrieveTopInstAccess(this, caller, pre);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inQualified(ASTNode caller, ASTNode child) {
        return getParent().Define_inQualified(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FIdUseExp Define_inlineUsesFunctionCallLeft(ASTNode caller, ASTNode child) {
        return getParent().Define_inlineUsesFunctionCallLeft(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldExtract(ASTNode caller, ASTNode child) {
        return getParent().Define_shouldExtract(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_myTopFactorFExp(ASTNode caller, ASTNode child) {
        return getParent().Define_myTopFactorFExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isFunctionCallIO(ASTNode caller, ASTNode child) {
        return getParent().Define_isFunctionCallIO(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isFVectorFunctionCallArg(ASTNode caller, ASTNode child) {
        return getParent().Define_isFVectorFunctionCallArg(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldRewriteToDSRef(ASTNode caller, ASTNode child) {
        return getParent().Define_shouldRewriteToDSRef(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_parentXmlNamespace(ASTNode caller, ASTNode child) {
        return getParent().Define_parentXmlNamespace(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inlineVar_CAD(ASTNode caller, ASTNode child) {
        return getParent().Define_inlineVar_CAD(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inlineDer_CAD(ASTNode caller, ASTNode child) {
        return getParent().Define_inlineDer_CAD(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isTopStringOp(ASTNode caller, ASTNode child) {
        return getParent().Define_isTopStringOp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inArraySubscripts(ASTNode caller, ASTNode child) {
        return getParent().Define_inArraySubscripts(this, caller);
    }
    /**
     * @apilevel internal
     */
    public ArrayList<FArraySubscripts> Define_surroundingFArraySubscripts(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingFArraySubscripts(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CommonVariableDecl Define_surroundingVariableDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingVariableDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExpSubscript Define_surroundingFExpSubscript(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingFExpSubscript(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_hasParentRecordWithBindingExp(ASTNode caller, ASTNode child) {
        return getParent().Define_hasParentRecordWithBindingExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CValue Define_cevalParentRecord(ASTNode caller, ASTNode child, VariableEvaluator evaluator) {
        return getParent().Define_cevalParentRecord(this, caller, evaluator);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_duringFunctionEval(ASTNode caller, ASTNode child) {
        return getParent().Define_duringFunctionEval(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_myDims(ASTNode caller, ASTNode child) {
        return getParent().Define_myDims(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isConstructorStmt(ASTNode caller, ASTNode child) {
        return getParent().Define_isConstructorStmt(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isDestructorStmt(ASTNode caller, ASTNode child) {
        return getParent().Define_isDestructorStmt(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_valueReference(ASTNode caller, ASTNode child) {
        return getParent().Define_valueReference(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FStatement Define_myFStatement(ASTNode caller, ASTNode child) {
        return getParent().Define_myFStatement(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Set<FVariable> Define_boundParameters(ASTNode caller, ASTNode child) {
        return getParent().Define_boundParameters(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_inFEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractEquation Define_myFEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_myFEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FClass Define_myFClass(ASTNode caller, ASTNode child) {
        return getParent().Define_myFClass(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractEquation Define_enclosingEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isParameterEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_isParameterEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isNormalEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_isNormalEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public List<FAbstractEquation> Define_myFAbstractEquationList(ASTNode caller, ASTNode child) {
        return getParent().Define_myFAbstractEquationList(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        return getParent().Define_inRecord(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inRecordConstructor(ASTNode caller, ASTNode child) {
        return getParent().Define_inRecordConstructor(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FRecordDecl Define_containingRecordDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_containingRecordDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FDerivedType Define_findFDerivedType(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_findFDerivedType(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inBindingExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inBindingExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isBound(ASTNode caller, ASTNode child) {
        return getParent().Define_isBound(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inParamBindingExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inParamBindingExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FTypePrefixVariability Define_bindingExpVariability(ASTNode caller, ASTNode child) {
        return getParent().Define_bindingExpVariability(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAlgorithm Define_myFAlgorithm(ASTNode caller, ASTNode child) {
        return getParent().Define_myFAlgorithm(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        return getParent().Define_useIsAssignment(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupFV(ASTNode caller, ASTNode child, FQName fqn) {
        return getParent().Define_lookupFV(this, caller, fqn);
    }
    /**
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupDerFV(ASTNode caller, ASTNode child, FQName fqn, int index) {
        return getParent().Define_lookupDerFV(this, caller, fqn, index);
    }
    /**
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupOutermostFV(ASTNode caller, ASTNode child, FQName fqn) {
        return getParent().Define_lookupOutermostFV(this, caller, fqn);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inParameterEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_inParameterEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inAttributeValue(ASTNode caller, ASTNode child) {
        return getParent().Define_inAttributeValue(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FCallable Define_lookupFCallable(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupFCallable(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public FRecordDecl Define_lookupFRec(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupFRec(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public FEnumDecl Define_lookupFEnum(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupFEnum(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupPreFV(ASTNode caller, ASTNode child, FQName fqn) {
        return getParent().Define_lookupPreFV(this, caller, fqn);
    }
    /**
     * @apilevel internal
     */
    public FQName Define_retrieveFQNameFromModification(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveFQNameFromModification(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_forIndexIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_forIndexIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFunction(ASTNode caller, ASTNode child) {
        return getParent().Define_inFunction(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_extendsInFunction(ASTNode caller, ASTNode child) {
        return getParent().Define_extendsInFunction(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FFunctionDecl Define_containingFFunctionDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_containingFFunctionDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_containingEntity(ASTNode caller, ASTNode child) {
        return getParent().Define_containingEntity(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_insideBlockStmt(ASTNode caller, ASTNode child) {
        return getParent().Define_insideBlockStmt(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_insideBranchedStmt(ASTNode caller, ASTNode child) {
        return getParent().Define_insideBranchedStmt(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractFunctionCall Define_myFunctionCall(ASTNode caller, ASTNode child) {
        return getParent().Define_myFunctionCall(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inEquationSection(ASTNode caller, ASTNode child) {
        return getParent().Define_inEquationSection(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inInitialEquationSection(ASTNode caller, ASTNode child) {
        return getParent().Define_inInitialEquationSection(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_inEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Size Define_mySize(ASTNode caller, ASTNode child) {
        return getParent().Define_mySize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FIdUseExp Define_buildAccessContextSizeExp(ASTNode caller, ASTNode child) {
        return getParent().Define_buildAccessContextSizeExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public List<InstAccess> Define_accessContextInst(ASTNode caller, ASTNode child) {
        return getParent().Define_accessContextInst(this, caller);
    }
    /**
     * @apilevel internal
     */
    public List<FQNamePart> Define_accessContextFlat(ASTNode caller, ASTNode child) {
        return getParent().Define_accessContextFlat(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CommonVariableDecl Define_myConstructorOutput(ASTNode caller, ASTNode child) {
        return getParent().Define_myConstructorOutput(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inWhile(ASTNode caller, ASTNode child) {
        return getParent().Define_inWhile(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inAssert(ASTNode caller, ASTNode child) {
        return getParent().Define_inAssert(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inIfTestWithoutConnect(ASTNode caller, ASTNode child) {
        return getParent().Define_inIfTestWithoutConnect(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isForOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        return getParent().Define_isForOperatorRecordDeclarationMember(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_iterExpUseOK(ASTNode caller, ASTNode child) {
        return getParent().Define_iterExpUseOK(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_myOperatorRecord(ASTNode caller, ASTNode child) {
        return getParent().Define_myOperatorRecord(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_myAccessExists(ASTNode caller, ASTNode child) {
        return getParent().Define_myAccessExists(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_canBeReplacedForMe(ASTNode caller, ASTNode child, InstNode node) {
        return getParent().Define_canBeReplacedForMe(this, caller, node);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_canBeReplacedInHelper(ASTNode caller, ASTNode child, InstNode ancestor) {
        return getParent().Define_canBeReplacedInHelper(this, caller, ancestor);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isWithin(ASTNode caller, ASTNode child, InstClassDecl icd) {
        return getParent().Define_isWithin(this, caller, icd);
    }
    /**
     * @apilevel internal
     */
    public ASTNode Define_nameCollisionScope(ASTNode caller, ASTNode child) {
        return getParent().Define_nameCollisionScope(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inRecordWithBindingExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inRecordWithBindingExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInRedeclareMod(ASTNode caller, ASTNode child) {
        return getParent().Define_isInRedeclareMod(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inCardinality(ASTNode caller, ASTNode child) {
        return getParent().Define_inCardinality(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_iterExpMustBeScalar(ASTNode caller, ASTNode child) {
        return getParent().Define_iterExpMustBeScalar(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FType Define_myIndexType(ASTNode caller, ASTNode child, int i) {
        return getParent().Define_myIndexType(this, caller, i);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_myFlowVar(ASTNode caller, ASTNode child) {
        return getParent().Define_myFlowVar(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_findCellUp(ASTNode caller, ASTNode child, Index i, int j, InstComponentDecl src) {
        return getParent().Define_findCellUp(this, caller, i, j, src);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_findExpandableAncestor(ASTNode caller, ASTNode child) {
        return getParent().Define_findExpandableAncestor(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_ancestorChild(ASTNode caller, ASTNode child, InstComponentDecl a, InstComponentDecl c) {
        return getParent().Define_ancestorChild(this, caller, a, c);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isFlattened(ASTNode caller, ASTNode child, InstValueModification ivm) {
        return getParent().Define_isFlattened(this, caller, ivm);
    }
    /**
     * @apilevel internal
     */
    public Set<InstAssignable> Define_functionConstantList(ASTNode caller, ASTNode child) {
        return getParent().Define_functionConstantList(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_splitBindingFExp(ASTNode caller, ASTNode child, FExp fe, InstNode node) {
        return getParent().Define_splitBindingFExp(this, caller, fe, node);
    }
    /**
     * @apilevel internal
     */
    public InstValueModification Define_parentInstValueMod(ASTNode caller, ASTNode child) {
        return getParent().Define_parentInstValueMod(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_modificationLevel(ASTNode caller, ASTNode child) {
        return getParent().Define_modificationLevel(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_parentNodeToSetModLevelFor(ASTNode caller, ASTNode child) {
        return getParent().Define_parentNodeToSetModLevelFor(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_expandSize(ASTNode caller, ASTNode child) {
        return getParent().Define_expandSize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_argIndexInRecordConstructor(ASTNode caller, ASTNode child) {
        return getParent().Define_argIndexInRecordConstructor(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FQName Define_sizeFlatteningPrefix(ASTNode caller, ASTNode child) {
        return getParent().Define_sizeFlatteningPrefix(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_myFExp(ASTNode caller, ASTNode child) {
        return getParent().Define_myFExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_myTempVarName(ASTNode caller, ASTNode child) {
        return getParent().Define_myTempVarName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_breakCondName(ASTNode caller, ASTNode child) {
        return getParent().Define_breakCondName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inOuter(ASTNode caller, ASTNode child) {
        return getParent().Define_inOuter(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inInner(ASTNode caller, ASTNode child) {
        return getParent().Define_inInner(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_surroundingOuterComponentDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingOuterComponentDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupInnerInstComponent(ASTNode caller, ASTNode child, InstComponentDecl outer, boolean firstScope) {
        return getParent().Define_lookupInnerInstComponent(this, caller, outer, firstScope);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInnerInstClass(ASTNode caller, ASTNode child, String name, boolean firstScope) {
        return getParent().Define_lookupInnerInstClass(this, caller, name, firstScope);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInInnerInstClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInInnerInstClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromMod(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstClassFromMod(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromTop(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstClassFromTop(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupRedeclareExtendsInstClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupTopRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupTopRedeclareExtendsInstClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInSurrounding(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstComponentInSurrounding(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstConstant(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstConstant(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstReplacingComponent(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstReplacingComponent(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public Size Define_expectedSizeFromParent(ASTNode caller, ASTNode child) {
        return getParent().Define_expectedSizeFromParent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_findInheritingNode(ASTNode caller, ASTNode child) {
        return getParent().Define_findInheritingNode(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_surroundingInstClass(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingInstClass(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FTypePrefixVariability Define_overrideVariability(ASTNode caller, ASTNode child, FTypePrefixVariability var, FTypePrefixVariability bexpVar) {
        return getParent().Define_overrideVariability(this, caller, var, bexpVar);
    }
    /**
     * @apilevel internal
     */
    public FTypePrefixVariability Define_parentBExpVariability(ASTNode caller, ASTNode child) {
        return getParent().Define_parentBExpVariability(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FTypePrefixVariability Define_parentDefaultVariability(ASTNode caller, ASTNode child) {
        return getParent().Define_parentDefaultVariability(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Environment Define_myEnvironmentNoClass(ASTNode caller, ASTNode child) {
        return getParent().Define_myEnvironmentNoClass(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Environment Define_myEnvironmentClass(ASTNode caller, ASTNode child) {
        return getParent().Define_myEnvironmentClass(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child) {
        return getParent().Define_myEnvironment(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_myEnvironment(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstModification Define_surroundingInstModification(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingInstModification(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstRedeclareClassNode Define_lookupReplacingClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupReplacingClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_myInstNode(ASTNode caller, ASTNode child) {
        return getParent().Define_myInstNode(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInInstModification(ASTNode caller, ASTNode child) {
        return getParent().Define_isInInstModification(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_instClassNamePrefix(ASTNode caller, ASTNode child, boolean sup) {
        return getParent().Define_instClassNamePrefix(this, caller, sup);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_isInClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInComponentDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_isInComponentDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_enclosedBy(ASTNode caller, ASTNode child, InstNode node) {
        return getParent().Define_enclosedBy(this, caller, node);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_instNodeParent(ASTNode caller, ASTNode child) {
        return getParent().Define_instNodeParent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_containingInstComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_containingInstComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_containingInstNode(ASTNode caller, ASTNode child) {
        return getParent().Define_containingInstNode(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstNode Define_containingInstClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_containingInstClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_instComponentDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_instComponentDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_delegateShouldBeDifferentiated(ASTNode caller, ASTNode child) {
        return getParent().Define_delegateShouldBeDifferentiated(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_shouldBeDifferentiated(ASTNode caller, ASTNode child, AnnotationNode derNode) {
        return getParent().Define_shouldBeDifferentiated(this, caller, derNode);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inNonDiffArg(ASTNode caller, ASTNode child) {
        return getParent().Define_inNonDiffArg(this, caller);
    }
    /**
     * @apilevel internal
     */
    public VisibilityType Define_visibility(ASTNode caller, ASTNode child) {
        return getParent().Define_visibility(this, caller);
    }
    /**
     * @apilevel internal
     */
    public List Define_getPredefinedType(ASTNode caller, ASTNode child) {
        return getParent().Define_getPredefinedType(this, caller);
    }
    /**
     * @apilevel internal
     */
    public ClassDecl Define_lookupBuiltInFunction(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupBuiltInFunction(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public Root Define_retrieveRoot(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveRoot(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_classNamePrefix(ASTNode caller, ASTNode child) {
        return getParent().Define_classNamePrefix(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_packageName(ASTNode caller, ASTNode child) {
        return getParent().Define_packageName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_findLibraryName(ASTNode caller, ASTNode child) {
        return getParent().Define_findLibraryName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_packagePath(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_packagePath(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public String Define_topPackagePath(ASTNode caller, ASTNode child) {
        return getParent().Define_topPackagePath(this, caller);
    }
    /**
     * @apilevel internal
     */
    public BaseClassDecl Define_enclosingClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FStatement Define_enclosingLoop(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingLoop(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Access Define_getNextAccess(ASTNode caller, ASTNode child) {
        return getParent().Define_getNextAccess(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstAccess Define_myInstAccess(ASTNode caller, ASTNode child) {
        return getParent().Define_myInstAccess(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inProtectedComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_inProtectedComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsInputOutputFrom(ASTNode caller, ASTNode child) {
        return getParent().Define_inheritsInputOutputFrom(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isTopLevel(ASTNode caller, ASTNode child) {
        return getParent().Define_isTopLevel(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsFlowFrom(ASTNode caller, ASTNode child) {
        return getParent().Define_inheritsFlowFrom(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inDisabledComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_inDisabledComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_needsIndicatorInit(ASTNode caller, ASTNode child) {
        return getParent().Define_needsIndicatorInit(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_duringFunctionInlining(ASTNode caller, ASTNode child) {
        return getParent().Define_duringFunctionInlining(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_canPropagateContext(ASTNode caller, ASTNode child) {
        return getParent().Define_canPropagateContext(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inKeptBExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inKeptBExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_expandWithIterExp(ASTNode caller, ASTNode child) {
        return getParent().Define_expandWithIterExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FIfWhenEquation Define_surroundingIfOrElse(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingIfOrElse(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        return getParent().Define_inUnknownSize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_enclosingIfExpCond(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingIfExpCond(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isNegativeTerm(ASTNode caller, ASTNode child) {
        return getParent().Define_isNegativeTerm(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInvertedFactor(ASTNode caller, ASTNode child) {
        return getParent().Define_isInvertedFactor(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CodeGenContext Define_myCodeGenContext(ASTNode caller, ASTNode child) {
        return getParent().Define_myCodeGenContext(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_hasBrancher(ASTNode caller, ASTNode child) {
        return getParent().Define_hasBrancher(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_parentFExp(ASTNode caller, ASTNode child) {
        return getParent().Define_parentFExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFunctionArg(ASTNode caller, ASTNode child) {
        return getParent().Define_inFunctionArg(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Size Define_parentTotalSize(ASTNode caller, ASTNode child) {
        return getParent().Define_parentTotalSize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FArraySubscripts Define_parentExpandedSubscripts(ASTNode caller, ASTNode child) {
        return getParent().Define_parentExpandedSubscripts(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inAlgebraicAccessLocation(ASTNode caller, ASTNode child) {
        return getParent().Define_inAlgebraicAccessLocation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child) {
        return getParent().Define_isLinear(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        return getParent().Define_isLinear(this, caller, vars);
    }
    /**
     * @apilevel internal
     */
    public FEnumDecl Define_retrieveFEnumDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveFEnumDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inNoEventExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inNoEventExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inSmoothExp(ASTNode caller, ASTNode child, int order) {
        return getParent().Define_inSmoothExp(this, caller, order);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inConnectClause(ASTNode caller, ASTNode child) {
        return getParent().Define_inConnectClause(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inIfCondition(ASTNode caller, ASTNode child) {
        return getParent().Define_inIfCondition(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_errorEnclosingComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_errorEnclosingComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inInstComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_inInstComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inUnknownAccess(ASTNode caller, ASTNode child) {
        return getParent().Define_inUnknownAccess(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        return getParent().Define_isInstComponentSize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FExp Define_findArgOfNestledFunctionCall(ASTNode caller, ASTNode child, int index, int depth) {
        return getParent().Define_findArgOfNestledFunctionCall(this, caller, index, depth);
    }
    /**
     * @apilevel internal
     */
    public String Define_findTempVarName(ASTNode caller, ASTNode child, InstComponentDecl var) {
        return getParent().Define_findTempVarName(this, caller, var);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassInInstElement(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstClassInInstElement(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstBuiltInClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstBuiltInClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_localLookupInstComponent(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_localLookupInstComponent(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstComponent(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInInstElement(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstComponentInInstElement(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        return getParent().Define_kind(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inArrayComponent(ASTNode caller, ASTNode child) {
        return getParent().Define_inArrayComponent(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstEnumClassDecl Define_myInstEnumClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_myInstEnumClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_myIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_myIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_dimensionLength(ASTNode caller, ASTNode child, int i) {
        return getParent().Define_dimensionLength(this, caller, i);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_enclosingInstClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_enclosingInstClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inForLoop(ASTNode caller, ASTNode child) {
        return getParent().Define_inForLoop(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inIterExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inIterExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Size Define_expandSizeForIterExp(ASTNode caller, ASTNode child, Size s) {
        return getParent().Define_expandSizeForIterExp(this, caller, s);
    }
    /**
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_myForIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FArraySubscripts Define_collectIterExpSubscripts(ASTNode caller, ASTNode child) {
        return getParent().Define_collectIterExpSubscripts(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_iterExpDepth(ASTNode caller, ASTNode child) {
        return getParent().Define_iterExpDepth(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        return getParent().Define_calcInstanceName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inDeadIfBranch(ASTNode caller, ASTNode child) {
        return getParent().Define_inDeadIfBranch(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child) {
        return getParent().Define_isInFV(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child, FVariable fv) {
        return getParent().Define_isInFV(this, caller, fv);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child) {
        return getParent().Define_isInDerivedType(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child, FDerivedType t) {
        return getParent().Define_isInDerivedType(this, caller, t);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeft(ASTNode caller, ASTNode child) {
        return getParent().Define_inFunctionCallLeft(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeftTop(ASTNode caller, ASTNode child) {
        return getParent().Define_inFunctionCallLeftTop(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inFunctionCall(ASTNode caller, ASTNode child) {
        return getParent().Define_inFunctionCall(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CommonVariableDecl Define_myCorrespondingInput(ASTNode caller, ASTNode child) {
        return getParent().Define_myCorrespondingInput(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isForIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_isForIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractEquation Define_parameterEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_parameterEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveFQName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_functionIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_functionIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_findVariableIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_findVariableIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_recordIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_recordIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_enumIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_enumIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FunctionReturnDefinition Define_returnDefinition(ASTNode caller, ASTNode child) {
        return getParent().Define_returnDefinition(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inAlgorithm(ASTNode caller, ASTNode child) {
        return getParent().Define_inAlgorithm(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        return getParent().Define_functionCallIsExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        return getParent().Define_myLefts(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        return getParent().Define_calcGeneratedVarName(this, caller, gvt);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        return getParent().Define_inWhen(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isInitial(ASTNode caller, ASTNode child) {
        return getParent().Define_isInitial(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FAbstractEquation Define_surroundingFAbstractEquation(ASTNode caller, ASTNode child) {
        return getParent().Define_surroundingFAbstractEquation(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_lockBranch(ASTNode caller, ASTNode child, ErrorCheckType checkType) {
        return getParent().Define_lockBranch(this, caller, checkType);
    }
    /**
     * @apilevel internal
     */
    public FWhenEquation Define_myWhen(ASTNode caller, ASTNode child) {
        return getParent().Define_myWhen(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FWhenEquation Define_findTopWhen(ASTNode caller, ASTNode child, FWhenEquation last) {
        return getParent().Define_findTopWhen(this, caller, last);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_findComponentWithThisBindingExp(ASTNode caller, ASTNode child) {
        return getParent().Define_findComponentWithThisBindingExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_findDepthOfNestledFunctionCalls(ASTNode caller, ASTNode child) {
        return getParent().Define_findDepthOfNestledFunctionCalls(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isElse(ASTNode caller, ASTNode child) {
        return getParent().Define_isElse(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isAssignUse(ASTNode caller, ASTNode child) {
        return getParent().Define_isAssignUse(this, caller);
    }
    /**
     * @apilevel internal
     */
    public CommonNamePart Define_nextNamePart(ASTNode caller, ASTNode child) {
        return getParent().Define_nextNamePart(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FQName Define_partialName(ASTNode caller, ASTNode child) {
        return getParent().Define_partialName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inSubscriptedExp(ASTNode caller, ASTNode child) {
        return getParent().Define_inSubscriptedExp(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_myDim(ASTNode caller, ASTNode child) {
        return getParent().Define_myDim(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Size Define_size(ASTNode caller, ASTNode child) {
        return getParent().Define_size(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_funcName(ASTNode caller, ASTNode child) {
        return getParent().Define_funcName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_prevIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_prevIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstComponentDecl Define_myOutput(ASTNode caller, ASTNode child) {
        return getParent().Define_myOutput(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FType Define_type(ASTNode caller, ASTNode child) {
        return getParent().Define_type(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_functionCallDecription(ASTNode caller, ASTNode child) {
        return getParent().Define_functionCallDecription(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_argumentDefinedTypeValid(ASTNode caller, ASTNode child) {
        return getParent().Define_argumentDefinedTypeValid(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_argumentTypeValid(ASTNode caller, ASTNode child, FType type) {
        return getParent().Define_argumentTypeValid(this, caller, type);
    }
    /**
     * @apilevel internal
     */
    public String Define_expectedArgumentType(ASTNode caller, ASTNode child) {
        return getParent().Define_expectedArgumentType(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_argumentTypeError(ASTNode caller, ASTNode child) {
        return getParent().Define_argumentTypeError(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_getKeyword(ASTNode caller, ASTNode child) {
        return getParent().Define_getKeyword(this, caller);
    }
    /**
     * @apilevel internal
     */
    public String Define_nonBoundArgumentTypeError(ASTNode caller, ASTNode child) {
        return getParent().Define_nonBoundArgumentTypeError(this, caller);
    }
    /**
     * @apilevel internal
     */
    public int Define_retrieveArrayCompNdims(ASTNode caller, ASTNode child) {
        return getParent().Define_retrieveArrayCompNdims(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isForAttributeOnOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        return getParent().Define_isForAttributeOnOperatorRecordDeclarationMember(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inExternalObject(ASTNode caller, ASTNode child) {
        return getParent().Define_inExternalObject(this, caller);
    }
    /**
     * @apilevel internal
     */
    public FQName Define_expandedFQName(ASTNode caller, ASTNode child) {
        return getParent().Define_expandedFQName(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inModWithEach(ASTNode caller, ASTNode child) {
        return getParent().Define_inModWithEach(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isOnPrimitiveTypeDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_isOnPrimitiveTypeDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassInChain(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_lookupInstClassInChain(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public InstModification Define_retrieveModificationLackingEach(ASTNode caller, ASTNode child, Size s) {
        return getParent().Define_retrieveModificationLackingEach(this, caller, s);
    }
    /**
     * @apilevel internal
     */
    public int Define_myDimension(ASTNode caller, ASTNode child) {
        return getParent().Define_myDimension(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_isTopDimension(ASTNode caller, ASTNode child) {
        return getParent().Define_isTopDimension(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Index Define_parentIndex(ASTNode caller, ASTNode child) {
        return getParent().Define_parentIndex(this, caller);
    }
    /**
     * @apilevel internal
     */
    public Size Define_vectorizedSize(ASTNode caller, ASTNode child) {
        return getParent().Define_vectorizedSize(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inVectorizedCall(ASTNode caller, ASTNode child) {
        return getParent().Define_inVectorizedCall(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inRecordDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_inRecordDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public boolean Define_inEvalAnnotated(ASTNode caller, ASTNode child) {
        return getParent().Define_inEvalAnnotated(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstClassDecl Define_myInstClassDecl(ASTNode caller, ASTNode child) {
        return getParent().Define_myInstClassDecl(this, caller);
    }
    /**
     * @apilevel internal
     */
    public InstRestriction Define_inheritedRestriction(ASTNode caller, ASTNode child) {
        return getParent().Define_inheritedRestriction(this, caller);
    }
    /**
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClass(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_simpleLookupClass(this, caller, name);
    }
    /**
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClassGlobalScope(ASTNode caller, ASTNode child, String name) {
        return getParent().Define_simpleLookupClassGlobalScope(this, caller, name);
    }
}
