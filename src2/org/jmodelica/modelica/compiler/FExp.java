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
 * Abstract base class for all flattened expressions.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:854
 * @production FExp : {@link BaseNode} ::= <span class="component">{@link Array}</span>;

 */
public abstract class FExp extends BaseNode implements Cloneable, ConstantEvaluable, FlatLookupNode {
    /**
     * Create a new expression suitable for use in an expression calculating the 
     * array size of a range expression.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:724
     */
    public FExp makeRangeSizeExp() {
        return type().wrapRangeSizeExp(fullCopy());
    }
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1194
     */
    protected FExp replaceIndices(Map<String,FExp> indexMap) {
		return (FExp) super.replaceIndices(indexMap);
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1358
     */
    protected static FExp vectorMultiplication(Iterator<FExp> left, Iterator<FExp> right, FType type) {
		if (!left.hasNext())
			return type.zeroLiteral();
		FExp cur = new FMulExp( left.next().fullCopy(), right.next().fullCopy());
		while (left.hasNext()) 
			cur = new FAddExp(cur, new FMulExp( left.next().fullCopy(), right.next().fullCopy()));
		return cur;
	}
    /**
     * Add a copy of this expression to arr at position i. 
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1791
     */
    public void fillArray(Array arr, Index i, int level) {
		if (isArray())
            arr.set(i, getArray().get(i.subIndex(level)).copySymbolic());
		else
            arr.set(i, copySymbolic());
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1928
     */
    public void setScalarizedFlag() {
		for (FExp child : childFExps())
			child.setScalarizedFlag();
	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3428
     */
    public void prepareForFunctionEval() {
	  super.prepareForFunctionEval();
	  flushUnknownSizes();
  }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3443
     */
    public void flushUnknownSizes() {
        // Flush so that getArray() is cleared for unknown sizes, and then recalculate size and make sure it is evaluated
        if (size().flushUnknownSizes()) {
            flushCache();
            size().isUnknown();
        }
    }
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @param right     the CValue to assign
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4000
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right) {
        throw new ConstantEvaluationException();
    }
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:5058
     */
    public void mapComponents(Map<FIdUseExp, Set<FIdUseExp>> res, CValue val) {
        throw new UnsupportedOperationException("Unsupported FExp in LHS");
    }
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:5067
     */
    public void mapComponentsArray(Map<FIdUseExp, Set<FIdUseExp>> res, CValueArray val, Enumerator e) {
        mapComponents(res, val.getCell(e.next()));
    }
    /**
     * Add this expression to another.
     * 
     * Used to gradually builf up a sum, and handles special case for first term. 
     * The so far accumulated expession is then passed as exp, and this node will be 
     * the right child of the created expression. May return <code>this</code>, 
     * if exp is <code>null</code>.
     * 
     * @param exp   the first term, may be null
     * @param neg   if <code>true</code>, then this will be subtracted instead of added
     * @param type  the type of this expression (can't be calculated locally, since this 
     * is generally not in tree at this point). The result is calculated with 
     * the assumption that <code>exp</code> is of the same type. When one is 
     * Integer and the other Real, this assumption gives the correct result.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:516
     */
    public FExp appendSum(FExp exp, boolean neg, FType type) {
        if (exp == null)
            return neg ? type.createFNegExp(this) : this;
        else
            return neg ? type.createFSubExp(exp, this) : type.createFAddExp(exp, this);
    }
    /**
     * Create a new empty node.
     * 
     * Abstract method needed for abstract node classes with declared 
     * (i.e. not inherited) children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1010
     */
    public abstract FExp createEmptyNode();
    /**
     * Create new node of same class as this, with the specified 
     * children. Used to allow common algorithms to handle unrelated types.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1368
     */
    public FExp createNodeBinary(FExp a, FExp b) {
		throw new UnsupportedOperationException();
	}
    /**
     * Create new node of same class as this, with the specified 
     * child. Used to allow common algorithms to handle unrelated types.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1376
     */
    public FExp createNodeUnary(FExp a) {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1190
     */
    public void flatChildFExps(ArrayList<FExp> res) {
        res.add(this);
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1228
     */
    protected int checkIndex(int i) {
        if (i < 0) {
            throw new UnsupportedOperationException("Unknown switch index for relational operator, not in list of switches.");
        }
        return i;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1579
     */
    public Iterable<FAbstractEquation> enclosingEquationsIterator() {
        return myFEquation().enclosingEquationsIterator();
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2224
     */
    public final Set<String> assignedInAllBranchesVariables() {
        Set<String> res = new HashSet<String>();
        assignedInAllBranchesVariables(res);
        return res;
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2230
     */
    public void assignedInAllBranchesVariables(Set<String> res) {
        for (FExp exp : childFExps())
            exp.assignedInAllBranchesVariables(res);
    }
    /**
     * @aspect Nominals
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2719
     */
    public static FExp nominalMax(FExp e1, FExp e2) {
        return new FMaxExp(e1.nominal(), new Opt<FExp>(e2.nominal()));
    }
    /**
     * @aspect Nominals
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2722
     */
    public static FExp nominalDefault() {
        return new FIntegerLitExp(1);
    }
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:487
     */
    public void addToParameterEquationsMap(
			Map<FAbstractVariable,FAbstractEquation> map, FAbstractEquation equ) {
		for (FExp e : childFExps())
			e.addToParameterEquationsMap(map, equ);
	}
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1755
     */
    private String myTempVarName;
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1792
     */
    public void flushTempVarNames() {
         myTempVarName = null;
         super.flushTempVarNames();
     }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1503
     */
    public static final int PRECEDENCE_LOWEST         = 0;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1504
     */
    public static final int PRECEDENCE_CONDITIONAL    = 1;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1505
     */
    public static final int PRECEDENCE_ARRAY_RANGE    = 2;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1506
     */
    public static final int PRECEDENCE_LOGICAL_OR     = 3;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1507
     */
    public static final int PRECEDENCE_LOGICAL_AND    = 4;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1508
     */
    public static final int PRECEDENCE_UNARY          = 5;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1509
     */
    public static final int PRECEDENCE_RELATIONAL     = 6;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1510
     */
    public static final int PRECEDENCE_ADDITIVE       = 7;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1511
     */
    public static final int PRECEDENCE_MULTIPLICATIVE = 8;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1512
     */
    public static final int PRECEDENCE_EXPONENTIATION = 9;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1513
     */
    public static final int PRECEDENCE_HIGHEST        = 10;
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1566
     */
    public final void prettyPrint(Printer p, CodeStream str, String indent) {
		boolean addParenthesis = addParenthesis(parentPrecedence());
		if (addParenthesis)
			str.print('(');
		prettyPrintExp(p, str, indent);
		if (addParenthesis)
			str.print(')');
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1575
     */
    protected abstract void prettyPrintExp(Printer p, CodeStream str, String indent);
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1639
     */
    public void prettyPrintAsElseExp(Printer p, CodeStream str, String indent) {
		str.print(' ');
		p.print(this, str, indent);
	}
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:133
     */
    
        public static class SizeContextReplacer implements ContextReplacer {
            private FSubscript fs;
            public SizeContextReplacer(FSubscript fs) {
                this.fs = fs;
            }
            
            public FExp copyReplaceAccess(FIdUse use) {
                return use.buildAccessContextSizeExp(this);
            }
            
            public FExp copyReplaceAccess(FSizeExp exp) {
                return exp.copyReplaceAccessExp(this);
            }
            
            public List<InstAccess> buildContext() {
                 return fs.myInstAccess().accessContextInst();
            }
        }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:311
     */
    
        public static class FunctionSizeContextReplacer implements ContextReplacer {
            Map<InstComponentDecl, InstFunctionArgument> varMap;
            public FunctionSizeContextReplacer(Map<InstComponentDecl, InstFunctionArgument> varMap) {
                this.varMap = varMap;
            }
            
            public FExp copyReplaceAccess(FIdUse use) {
                return use.createSizeFExp(this);
            }
            
            public FExp copyReplaceAccess(FSizeExp exp) {
                return exp.createSizeFExp(this);
            }
            
            public Map<InstComponentDecl, InstFunctionArgument> getMap() {
                return varMap;
            }
        }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:400
     */
    public FExp cell(FunctionSizeContextReplacer crp, FArraySubscripts fas) {
        if (fas != null) {
            if (fas.variability().knownParameterOrLess()) {
                try {
                    return splitArrayExp(fas.createIndex());
                } catch (ConstantEvaluationException e) {
                    
                }
            }
            return new FSubscriptedExp(this, fas.copyReplaceAccess(crp));
        }
        return this;
    }
    /**
     * Create a copy of this expression suitable for when it is used to describe a size.
     * 
     * Default implementation simply returns a copy.
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:419
     */
    public FExp createSizeFExp() {
        return unboundCopy();
    }
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:473
     */
    
        public interface ContextReplacer {
            public FExp copyReplaceAccess(FIdUse use);
            public FExp copyReplaceAccess(FSizeExp exp);
        }
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:500
     */
    public FExp copyReplaceAccess(ContextReplacer crp) {
        FExp exp = copy();
        for (int i = 0; i < getNumChild(); i++) {
            exp.setChild(getChild(i).copyReplaceAccess(crp), i);
        }
        return exp;
    }
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:106
     */
    public FType promoteTypeForFExpList(Iterable<FExp> exps) {
        Iterator<FExp> it = exps.iterator();
        if (!it.hasNext())
            return fUnknownType();
        FType tot = it.next().type();
        while (it.hasNext())
            tot = tot.typePromotion(it.next().type());
        return tot;
    }
    /**
     * Convert all continous variables that this expression refers to into discrete variables.
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:310
     */
    public void makeContinuousVariablesDiscrete() {}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:387
     */
    public static FTypePrefixVariability combineFExpListVariability(Iterable<? extends FExp> exps) {
        Iterator<? extends FExp> it = exps.iterator();
        FTypePrefixVariability total = it.hasNext() ? it.next().variability() : fConstant();
        while (it.hasNext()) 
            total = total.combine(it.next().variability());
        return total;
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:725
     */
    public void markAsStructuralParameter(ErrorCheckType checkType) {
        forceVariability(checkType, fStructParameter());
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:729
     */
    public void forceVariability(ErrorCheckType checkType,  FTypePrefixVariability v) {
        if (inFunction())
            return;
        forceUsesVariability(checkType, v);
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:648
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!errorChecked) {
            errorChecked = true;
            super.collectErrors(checkType);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:872
     */
    public void checkConstantExpression(ErrorCheckType checkType, String varKind, String varName) {
		boolean failed = false;
        ConstantEvaluationException eres = null;
		try {
			if (isCircular()) {
			    if (!checkType.allowConstantNoValue())
    				error("Could not evaluate binding expression for %s '%s' due to circularity: '%s'", 
    						varKind, varName, prettyPrint(""));
			} else {
				CValue val = ceval();
				if (val.isPartlyUnknown()) {
					if (val.isUnsupported()) {
						compliance("Constant evaluation not supported for expression(s) directly or indirectly " + 
								"used by the binding expression for %s '%s': '%s'", varKind, varName, prettyPrint(""));
					} else {
						failed = true;
					}
				}
			}
		} catch (ConstantEvaluationNotReadyException e) {
			// Will be evaluatable later, ignore for now
		} catch (ConstantEvaluationException e) {
			failed = true;
			eres = e;
		}
		if (failed && !checkType.allowConstantNoValue()) {
			error("Could not evaluate binding expression for %s '%s': '%s'%s", varKind, varName, prettyPrint(""),
			        eres == null ? "" : eres.getModelicaStackTrace());
		}
	}
    /**
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1666
     */
    public void collectReinits(Map<FAbstractVariable,Set<FReinit>> map) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:408
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (type().isUnknown()) {
            for (FExp exp : childFExps())
                if (exp.type().isUnknown())
                    return;
            typeError(checkType);
        } else if (!inFunction()) {
            size().markAsStructuralParameter(checkType);
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:419
     */
    protected static boolean isUnknownFExp(ASTNode n) {
        return n instanceof FExp && ((FExp) n).type().isUnknown();
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:434
     */
    
        public static class ExpTypeErrorProducer extends AbstractErrorProducerUnlessDisabled<ReporterNode> {
            private final String message;
            
            public ExpTypeErrorProducer(String identifier, String message) {
                super(identifier, ProblemKind.SEMANTIC);
                this.message = message;
            }

            public void invoke(FExp node) {
                StringBuilder buf = new StringBuilder(message);
                buf.append(": ");
                buf.append(node);
                for (FExp exp : node.childFExps()) {
                    buf.append("\n    type of '");
                    buf.append(exp);
                    buf.append("' is ");
                    buf.append(exp.type());
                }
                super.invokeWithCondition(node, node.typeErrorOnlyLengths(), buf.toString());
            }

            @Override
            public String description() {
                return message;
            }
            
        }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:466
     */
    public void typeError(ErrorCheckType checkType) {
        TYPE_MISMATCH_IN_EXPRESSION.invoke(this);
    }
    /**
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1452
     */
    public void setInstanceTreeSource(FExp source) {}
    /**
     * Generate error for operator that got wrong variability of argument
     * @aspect VariabilityCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1501
     */
    public void discreteArgError() {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:229
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        super.flattenUsedFuncsAndEnums(fc);
        InstClassDecl oper = overloadedOperator(true);
        boolean scalar = oper == null;
        if (scalar)
            oper = overloadedOperator(false);
        if (oper != null) {
            oper.flattenFunction(fc);
            int i = 0;
            for (FExp arg : childFExps()) {
                FType inType = oper.myInputs().get(i).type();
                FType argType = arg.type();
                if (scalar) 
                    argType = argType.scalarType();
                if (!inType.typeCompatible(argType, true))
                    inType.matchOverloadedConstructor(argType).flattenFunction(fc);
                i++;
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:897
     */
    public FExp affixExpression(FExp exp) {
        return dynamicFExp(exp);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1238
     */
    public FExp addInDim(Stack<Integer> s, int d, FArray arr) {
        if (d == s.size()) {
            return this;
        } else {
            if (arr == null) {
                arr = new FArray();
            }
            int i = s.get(d);
            List<FExp> l = arr.getFExpListNoTransform();
            if (i < l.getNumChildNoTransform()) {
                l.setChild(addInDim(s, d+1, (FArray)l.getChildNoTransform(i)), i);
            } else {
                l.addChild(addInDim(s, d+1, null));
            }
            return arr;
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1883
     */
    public FExp flatten(FQName prefix) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2499
     */
    public FExp createFPreExp() {
        throw new UnsupportedOperationException("createFPreExp() is not supported for class type " + getClass().getSimpleName());
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2608
     */
    public FExp flattenDer(FQName prefix, int order) {
        return dynamicFExp(diff(TIME, order)).flatten(prefix);
    }
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:605
     */
    public void populateInstRecordModificationList(
            List<InstRecordModification> list, InstValueModification org) {
        Modification mod = org.modification();
        FType t = type();
        if (t.isRecord()) {
            FRecordType rt = (FRecordType)t;
            for (FRecordComponentType frct : rt.getComponents()) {
                String name = frct.getName();
                FExp exp = dynamicFExp(extractRecordFExp(name));
                list.add(new InstValueRecordModification(mod, name, exp));
            }
        }
    }
    /**
     * Dynamically places an FExp in the tree under this FExp.
     * 
     * If <code>exp</code> is already in tree of if <code>exp == this</code>, 
     * then <code>exp</code> is returned.
     * 
     * @return  the final version of the dynamically placed node.
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:865
     */
    public FExp dynamicFExp(FExp exp) {
		if (exp == this)
			return exp;
		if (exp.parent != null) {
			int i = exp.parent.getIndexOfChild(exp);
			if (i >= 0)
				return (FExp) exp.parent.getChild(i);
		}
		getDynamicFExpOpt().setChild(exp, 0);
		return (FExp) getDynamicFExpOpt().getChild(0);
	}
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:48
     */
    public static final String OP_CON  = "'constructor'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:49
     */
    public static final String OP_ZERO = "'0'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:50
     */
    public static final String OP_STR  = "'String'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:51
     */
    public static final String OP_ADD  = "'+'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:52
     */
    public static final String OP_SUB  = "'-'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:53
     */
    public static final String OP_MUL  = "'*'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:54
     */
    public static final String OP_DIV  = "'/'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:55
     */
    public static final String OP_POW  = "'^'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:56
     */
    public static final String OP_EQ   = "'=='";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:57
     */
    public static final String OP_NEQ  = "'<>'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:58
     */
    public static final String OP_GT   = "'>'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:59
     */
    public static final String OP_LT   = "'<'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:60
     */
    public static final String OP_GEQ  = "'>='";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:61
     */
    public static final String OP_LEQ  = "'<='";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:62
     */
    public static final String OP_AND  = "'and'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:63
     */
    public static final String OP_OR   = "'or'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:64
     */
    public static final String OP_NEG  = "'-'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:65
     */
    public static final String OP_NOT  = "'not'";
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:67
     */
    public static final Set<String> OPERATORS = new HashSet<String>(Arrays.asList(
            OP_CON, OP_ZERO, 
            OP_STR, 
            OP_ADD, OP_SUB, OP_MUL, OP_DIV, OP_POW, OP_EQ, OP_NEQ, OP_GT, OP_LT, OP_GEQ, OP_LEQ, OP_AND, OP_OR, 
            OP_NEG, OP_NOT));
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:72
     */
    public static final Set<String> CONSTRUCTOR_OPERATORS = new HashSet<String>(Arrays.asList(
            OP_CON, OP_ZERO));
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:74
     */
    public static final Set<String> CONVERSION_OPERATORS = new HashSet<String>(Arrays.asList(
            OP_STR));
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:76
     */
    public static final Set<String> BINARY_OPERATORS = new HashSet<String>(Arrays.asList(
            OP_ADD, OP_SUB, OP_MUL, OP_DIV, OP_POW, OP_EQ, OP_NEQ, OP_GT, OP_LT, OP_GEQ, OP_LEQ, OP_AND, OP_OR));
    /**
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:78
     */
    public static final Set<String> UNARY_OPERATORS = new HashSet<String>(Arrays.asList(
            OP_NEG, OP_NOT));
    /**
     * Returns an iterable, that has an iterator that iterates over all direct FExp children.
     * 
     * The iterator passes through Lists and Opts.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:456
     */
    public Iterable<FExp> childFExps() {
        return new ChildFExpIterable();
    }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:462
     */
    
        
        private class ChildFExpIterable implements Iterable<FExp> {
            public Iterator<FExp> iterator() {
                return new ChildFExpIterator();
            }
        }
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:469
     */
    
        
        
        private class ChildFExpIterator implements Iterator<FExp> {
            
            Iterator<ASTNode> it1;
            Iterator<ASTNode> it2;
            FExp next = null;

            public ChildFExpIterator() {
                it1 = iterator();
                it2 = null;
                update();
            }
            
            private void update() {
                boolean cont = true;
                ASTNode node = null;
                while (cont) {
                    node = null;
                    if (it2 == null) {
                        if (it1.hasNext())
                            node = it1.next();
                        else 
                            cont = false;
                        if (node instanceof List || node instanceof Opt)
                            it2 = node.iterator();
                    } else {
                        if (it2.hasNext()) 
                            node = it2.next();
                        else 
                            it2 = null;
                    }
                    if (node instanceof FExp) 
                        cont = false;
                }
                next = (FExp) node;
            }

            public boolean hasNext() {
                return next != null;
            }

            public FExp next() {
                FExp res = next;
                update();
                return res;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
            
        }
    /**
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1777
     */
    abstract public FExp copy();
    /**
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1780
     */
    public FExp unboundCopy() { return (FExp) super.unboundCopy(); }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:114
     */
    public void sanityCheckParameterEquationLeft(FClass fc, FAbstractEquation eqn) {
        for (FExp e : childFExps())
            e.sanityCheckParameterEquationLeft(fc, eqn);
    }
    /**
     * Create an FExp that represents a specific component of this record expression.
     * 
     * @param suffix    the suffix to add to a use of the record to access the specific component
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:809
     */
    public FExp extractRecordFExp(String suffix) {
        return new FComponentExp(treeCopy(), suffix);
	}
    /**
     * Detection of alias variables in expressions
     * 
     * Only valid when in an equation that gives that the value of this expression is always 0.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1507
     */
    public AliasPair aliasVariables(boolean checkVariables) {
        return null;
    }
    /**
     * Remove all uses in an expression from the uses lists of their respective variables.
     * 
     * Should only be used to allow iterative algorithms to use updated uses lists while 
     * removing expressions. Only valid in flat tree.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2004
     */
    public void removeFromUses() {
		for (FExp e : childFExps())
			e.removeFromUses();
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2237
     */
    public void insertTempsInLHS(FClass fClass, boolean param) {
        String tempName = calcTempVarName();
        FTypePrefixVariability v;
        if (param) {
            v = fParameter();
        } else {
            v = type().funcOutputVariability();
        }
        fClass.addFVariable(type().createTempFVariable(new FQNameString(tempName), v));
        replaceMe(new FIdUseExp(tempName));
        FEquation e = new FEquation(this, new FIdUseExp(tempName));
        if (param) {
            fClass.addFParameterEquation(e);
        } else {
            fClass.addFEquation(e);
        }
    }
    /**
     * Remove binding expression of variables referenced in this expression.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2942
     */
    public void removeBindingExpOfReferencedVars() {
		for (FExp e : childFExps())
			e.removeBindingExpOfReferencedVars();
	}
    /**
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3116
     */
    public void flushAllRecursiveClearFinal() {
		super.flushAllRecursiveClearFinal();
		is$Final = false;
	}
    /**
     * Mark referenced variable as state.
     * 
     * Only valid for variable accesses, default implementation throws exception.
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3707
     */
    public void markReferencedVarAsState() {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect EliminateEqualSwitches
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3786
     */
    public void collectEqualSwitches(Map<String, Collection<FRelExp>> candidates) {
        
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:86
     */
    public void findBlockFunctionExtraction(AbstractEquationBlock block, ArrayList<FFunctionCall> functions) {

    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:122
     */
    public boolean dependsOnBlock(AbstractEquationBlock block) {
        return true;
    }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:180
     */
    public FExp merge(FClass.commonSubexpressionEliminationIfSet.CSESet m, FExp exp) {
        if (!exp.isNoExp()) {
            m.add(new FEquation(fullCopy(), exp.fullCopy()));
        }
        return this;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:473
     */
    public void addInliningVarsAndEqns(AbstractFunctionInliner fi, String oldName, boolean noEvent) {
        if (isArray()) {
            Array arr = getArray();
            for (Index i : indices()) {
                arr.get(i).addInliningVarsAndEqns(fi, oldName + i, noEvent);
            }
        } else if (type().isRecord()) {
            oldName += ".";
            for (FRecordComponentType part : ((FRecordType) type()).getComponents()) {
                component(part.getName()).addInliningVarsAndEqns(fi, oldName + part.getName(), noEvent);
            }
        } else {
            fi.addVarAndEqn(oldName, this, noEvent);
        }
    }
    /**
     * Create temporary variable(s) for this access when inlining a function call that 
     * it is a left of, and return an access. Non-access expressions returns null.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:539
     */
    public FExp createInlineVars(
            AbstractFunctionInliner fi, FExp bExp, FTypePrefixVariability variability) {
        return null;
    }
    /**
     * Encapsulate any event-generating expressions in noEvent().
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:582
     */
    public FExp preventEvents() {
        if (eventGenerating()) {
            FNoEventExp res = new FNoEventExp();
            replaceMe(res);
            res.setFExp(this);
            return res;
        } else {
            for (FExp e : childFExps())
                e.preventEvents();
            return this;
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:801
     */
    public void createInliningOutputEquations(
            ArrayList<FAbstractEquation> list, AbstractFunctionInliner fi, FQName name) {
        FExp right = fi.getReplacementExp(name.scalarName());
        right = (right == null) ? type().zeroLiteral() : right.fullCopy();
        if (!this.isNoExp())
            list.add(new FEquation(this, right));
    }
    /**
     * Inline all calls to functions that we can inline.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:831
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        for (FExp exp : childFExps())
            exp.inlineFunctions(fi);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1516
     */
    public FExp replaceReferences(AbstractFunctionInliner fi) {
        super.replaceReferences(fi);
        return this;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:24
     */
    public boolean taggedByVProp              = false;
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:57
     */
    public FExp cleanEquations() {
        if (taggedByVProp) {
            return new FNoExp();
        } else {
            return this;
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:400
     */
    public boolean variabilityPropagation(
            FClass.VariabilityPropagator propagator,
            CValue value,
            FTypePrefixVariability variability) {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:457
     */
    public boolean variabilityPropagationArray(
            FClass.VariabilityPropagator propagator,
            CValueArray value,
            FTypePrefixVariability variability,
            Enumerator enumerator) {
        return this.variabilityPropagation(propagator,
                    value == null ? CValue.UNKNOWN : value.values[enumerator.next()], variability);
    }
    /**
     * Converts this guard expression from a when clause to a guard expression
     * to be used in an if clause.
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:142
     */
    public FExp transformGuard(Collection<FAbstractEquation> outerEqnList, Collection<FStatement> stmtList, FClass fclass) {
        Iterator<FExp> it = guards().iterator();
        FExp res = it.next().asGuard(outerEqnList, stmtList, fclass);
        while (it.hasNext())
            res = new FOrExp(res,it.next().asGuard(outerEqnList, stmtList, fclass));
        return res;
    }
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:149
     */
    public FExp asGuard(Collection<FAbstractEquation> outerEqnList, Collection<FStatement> stmtList, FClass fclass) {
        // We need to extract to temporary equation
        if (stmtList == null || !dependsOn(myFAlgorithm().referencedFVariablesInLHS())) {
            outerEqnList.add(new FEquation(tempUseExp(), fullCopy()));
        } else {
            stmtList.add(new FAssignStmt(tempUseExp(), fullCopy()));
        }
        
        fclass.addFVariable(type().createFVariable(new FPublicVisibilityType(),
                new FQNameFull(tempVarName()), variability().combine(fDiscrete())));
        return new FAndExp(tempUseExp(), new FNotExp(tempPreExp()));
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:873
     */
    public FQName tempFQName(String name) {
        FQName fqn = new FQNameString(name);
        if (expandWithIterExp())
            fqn = fqn.copyAndAddFas(collectIterExpSubscripts());
        return fqn;
    }
    /**
     * Stores FSubscripts to be uses by <code>scalarize()</code>
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:895
     */
    public FExp[] indexNames = null;
    /**
     * Create an FExp that represents a specific scalar component of this record.
     * 
     * @param indexMap  translations for indices in the expressions
     * @param suffix    the suffix to add to a use of the record to access the specific component
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1030
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, String suffix) {
        return scalarRecordFExp(indexMap, new FQNameString(suffix));
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1034
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, FQName suffix) {
        if (useTempVar) {
            return dynamicFExp(tempExp()).scalarRecordFExp(indexMap, suffix);
        }
        return scalarize(indexMap);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1135
     */
    public FExp extractArrayCell(Map<String,FExp> indexMap, Index i) {
        if (size().isUnknown()) {
            int[] ind = i.index();
            FExp[] subs = new FExp[ind.length];
            for (int k = 0; k < ind.length; k++) {
                subs[k] = new FIntegerLitExp(ind[k]);
            }
            return extractArrayCell(indexMap, subs);
        } else {
            return dynamicFExp(getArray().get(i).scalarize(indexMap));
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1148
     */
    public FExp extractArrayCell(Map<String,FExp> indexMap, FExp[] subs) {
        addArrayUsesToIndexMap(subs);
        return dynamicFExp(scalarize(indexMap));
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1266
     */
    public void notifyIfWhenEquationsOfTemporaryVar() {
	    FIfWhenEquation myIf = surroundingIfOrElse();
	    if (myIf != null) 
	        myIf.addBranchTemporary(this);
	}
    /**
     * Flag that signals that this expression should be replaced with a use of a temporary variable.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1478
     */
    protected boolean useTempVar = false;
    /**
     * Scalarize expressions, replacing array expressions with FArrays of scalarized subexpressions.
     * 
     * The FArrays are needed because function calls need arrays to be passed as arrays.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1486
     */
    public FExp scalarize(Map<String,FExp> indexMap) {
        FExp exp = useTempVar ? 
                dynamicFExp(tempExp()) :
                this;
        if (scalarizeExpanded()) {
            return type().createRecordConstructor(indexMap, exp);
        } else {
            return exp.scalarizeExp(indexMap);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1497
     */
    public FExp scalarize(Scalarizer s) {
        return scalarize(s.map());
    }
    /**
     * Scalarize expressions.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1515
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
		return fullCopy();
	}
    /**
     * Scalarize an expression by recursively scalarizing and combining the contents in its Array.
     * 
     * New nodes are created with <code>template.createNodeBinary()</code>.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1696
     */
    public FExp reduceToScalarized(FExp template, Map<String,FExp> indexMap) {
        if (isArray()) {
            List<FExp> exps = getArray().getFExps();
            java.util.List<FExp> scalarizedExps = new ArrayList<FExp>();
            Iterator<FExp> it = getArray().iteratorFExp();
            while (it.hasNext()) {
                scalarizedExps.add(it.next().scalarize(indexMap));
            }
            return createBalancedBinaryTree(template, scalarizedExps);
        } else {
            return scalarize(indexMap);
        }
    }
    /**
     * Constructs a balanced binary tree based on the expression list exps with
     * the operation as specified by template.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1714
     */
    public static FExp createBalancedBinaryTree(FExp template, java.util.List<FExp> exps) {
        return createBalancedBinaryTree(template, exps, 0, exps.size());
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1718
     */
    private static FExp createBalancedBinaryTree(FExp template, java.util.List<FExp> exps, int start, int end) {
        if (start == end) {
            return null;
        }
        if (start == end - 1) {
            return exps.get(start);
        }
        // We want a left heavy tree, hence the modulo part
        int half = (start + end) / 2 + (start + end) % 2;
        FExp left = createBalancedBinaryTree(template, exps, start, half);
        FExp right = createBalancedBinaryTree(template, exps, half, end);
        return template.createNodeBinary(left, right);
    }
    /**
     * Scalarize the expression of an FForIndex. 
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1849
     */
    public FExp scalarizeIndexExp(Map<String,FExp> indexMap) {
		return scalarize(indexMap);
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:127
     */
    public void usesInScalarizedExp(Set<FAbstractVariable> res) {
        if (!extractTemp()) {
            super.usesInScalarizedExp(res);
        }
    }
    /**
     * Finds, extracts, and replaces expressions with temporaries
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:152
     */
    public void createArrayTemporaries(Scalarizer s) {
        if (extractTemp()) {
            if (extractAsUnknown()) {
                unknownFunctionArrayTemporaries_pre(s);
            } else {
                knownArrayTemporaries(s);
            }
        } else {
            createArrayTemporariesInChildren(s);
        }
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:164
     */
    public void createArrayTemporariesInChildren(Scalarizer s) {
        for (ASTNode n : this) {
            n.createArrayTemporaries(s);
        }
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:187
     */
    public void createArrayTemporariesIfBranch(FExp ifExp, Scalarizer s) {
        List thenClauses = new List();
        List elseClauses = new List();
        List<FAbstractVariable> thenVars = new List<FAbstractVariable>();
        createArrayTemporaries(s.block(thenVars, thenClauses));
        if (thenClauses.getNumChild() > 0) {
            if (inFAlgorithm()) {
                List<FIfWhenClause> cl = new List<FIfWhenClause>();
                cl.add(new FIfClause(ifExp, thenClauses));
                s.add(new FIfStmt(cl, elseClauses));
            } else {
                for (FAbstractVariable fv : thenVars) {
                    elseClauses.add(new FEquation(fv.createUseExp(), fv.type().zeroLiteral()));
                }
                FElseEquation elseClause = new FElseEquation(new FNormalEquation(), elseClauses);
                FIfEquation equation = new FIfEquation(new FNormalEquation(), thenClauses, ifExp, new Opt<FIfWhenElseEquation>(elseClause));
                equation.setIsTempAssign();
                s.add(equation);
            }
            s.add(thenVars);
        }
    }
    /**
     * Create clauses for and replace this known size expression with a temp variable.
     * Used in both functions and equations.
     * @param s Scalarization visitor
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:261
     */
    public void knownArrayTemporaries(Scalarizer s) {
        s.addTempVar(this);
        Array arr = getArray();
        for (Index i : indices()) {
            FQName name = new FQNameFull(tempVarName(), i.createFArraySubscripts());
            name.scalarized = true;
            s.add(new FIdUseExp(name), arr.get(i).scalarize(s));
        }
        useTempVar = true;
    }
    /**
     * Wrapper for {@link FExp#unknownFunctionArrayTemporaries(Scalarizer s)}.
     * Performs some common operations
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:285
     */
    public void unknownFunctionArrayTemporaries_pre(Scalarizer s) {
        s.addTempVar(this);
        unknownFunctionArrayTemporaries(s);
        useTempVar = true;
    }
    /**
     * Create clauses for and replace this unknown size expression with a temp variable.
     * Used in functions.
     * @param s Scalarization visitor
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:296
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        /* Assumes exp is function call arg or left */
        boolean writeBack = inFunctionCallLeft();
        if (!writeBack || s.getWriteBack()) {
            FAbstractFunctionCall fc = myFunctionCall();
            FIdUseExp left = tempExp();
            FExp right;
            setParent(null); // Force dynamicFExp
            if (writeBack) {
                right = left;
                left  = (FIdUseExp) fc.dynamicFExp(this);
            } else {
                right = fc.dynamicFExp(this);
            }
            
            useTempVar = false;
            type().scalarizeAssignment((Scalarizer.Algorithm)s, left, right);
            useTempVar = true;
            left.indexNames = null;
            right.indexNames = null;
        }
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:605
     */
    protected List unknownReductionSub(Scalarizer s, FExp exp, FStatement initStmt) {
        ForNames names = s.getNames();
        List clauses = s.getClauses();
        List<FStatement> inner = new List<FStatement>();
        boolean iter = exp.editNamesIter(s);
        exp.createArrayTemporaries(s.block(inner));
        exp.addArrayUsesToIndexMap(s);
        if (iter) {
            names.removeLayer();
            clauses = names.createForLoops(clauses, exp, 0, ndims());
            clauses.add(initStmt);
            clauses = names.createForLoops(clauses, exp, ndims(), exp.ndims());
            clauses.addAll(inner);
        } else {
            clauses.addAll(inner);
            clauses.add(initStmt);
            clauses = names.createForLoops(clauses, exp);
        }
        return clauses;
    }
    /**
     * Helper for unknown size expressions containing iteration expressions.
     * Transfers some names  in <code>names</code> to <code>indexMap</code>
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:630
     */
    public boolean editNamesIter(Scalarizer s) {
        return false;
    }
    /**
     * Copies top layer in <code>names</code> to id uses and creates entries
     * in <code>indexNames</code> for expressions replaced with temps.
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:666
     */
    public void addArrayUsesToIndexMap(FExp[] names) {
        if (useTempVar) {
            if (isArray()) {
                indexNames = names;
            }
        } else {
            super.addArrayUsesToIndexMap(names);
        }
    }
    /**
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:147
     */
    public FAssert sizeAssert(FExp e, int i) {
        String dim = i < 0 ? "" : String.format("dimension %d of ", i+1);
        return new FAssert(e, new FStringLitExp(String.format("Mismatching size in %sexpression %s in function %s",
                dim, prettyPrint(""), containingFFunctionDecl().name())), new Opt<FExp>());
    }
    /**
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:170
     */
    public FExp orNotIfExpConds(FExp e1) {
        FExp e2 = enclosingIfExpCond();
        if (e2 != null)
            e1 = new FOrExp(e1, new FNotExp(e2));
        return e1;
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:144
     */
    public static final String TIME = "time";
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:146
     */
    public FExp diff(String name, int n) {
        return (n <= 1) ? diff(name) : diff(name, n - 1).diff(name);
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:150
     */
    public FExp diff(String name) {
        throw new ExpressionDifferentiationException(this);
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:490
     */
    public FExp diffUseOrDerExp(String name, String myName) {
        if (name.equals(TIME)) {
            if (variability().continuousVariability() || inFunction() && type().containsReal()) {
                return createDerExp(1);
            } else {
                return type().sizedZeroLiteral();
            }
        } else if (name.equals(myName)) {
            FExp exp = type().createSizedLiteral(1);
            if (exp == null) {
                exp = new FNoExp();
            }
            return exp;
        } else {
            return type().sizedZeroLiteral();
        }
    }
    /**
     * Generic implementation of {@link #diff(String)} for array expressions 
     * that delegates to the elements of array expansion.
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:750
     */
    protected FExp diffArray(String name) {
        return dynamicFExp(getArray().buildDiff(name));
    }
    /**
     * Generic implementation of {@link #diff(String)} for expressions that are 
     * always constant during simulation.
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:758
     */
    protected FExp diffZero() {
        return dynamicFExp(type().sizedZeroLiteral());
    }
    /**
     * Generic implementation of {@link #diff(String)} that simply differentiates 
     * each argument of the operator/function.
     * 
     * Only valid for operators/functions their arguments as direct children.
     * 
     * @param name  what variable to differentiate against - passed on to diff
     * @param exp   the arguments of the operator/function
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:771
     */
    protected FExp diffWrap(String name, FExp... exp) {
        FExp res = createEmptyNode();
        for (int i = 0; i < exp.length; i++) {
            res.setChild(exp[i].diff(name), i);
        }
        return dynamicFExp(res);
    }
    /**
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:436
     */
    public FExp copySymbolic() { return (FExp) super.copySymbolic(); }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:182
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		open_XML(str, indent);
		for (FExp child : childFExps())
			p.print(child, str, indent2);
		close_XML(str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:282
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		genVar_CAD(p, str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:295
     */
    @Override
	public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {
		if (isArray() && !size().isUnknown()) {
			getArray().genTempVars_CAD(p, str, indent);
		} else {
			if (autoGenChildADStatements_CAD())
				super.genTempVars_CAD(p, str, indent);
			genADStatement_CAD(p , str, indent);
		}
	}
    /**
     * Generates var expression or prints reference to evaluated expression
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:332
     */
    public void genVar_CAD(CodePrinter p, CodeStream str, String indent) {
		if (inlineVar_CAD())
			genVarExp_CAD(p, str, indent);
		else
			str.print(varName_CAD());
	}
    /**
     * Generates der expression or prints reference to evaluated expression
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:342
     */
    public void genDer_CAD(CodePrinter p, CodeStream str, String indent) {
		if (!shouldBeDifferentiated())
			str.print(zeroValue_CAD());
		else if (inlineDer_CAD())
			genDerExp_CAD(p, str, indent);
		else
			str.print(derName_CAD());
	}
    /**
     * Generates ad statment for this FExp
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:354
     */
    public void genADStatement_CAD(CodePrinter p, CodeStream str, String indent) {
		if (!hasADStatement_CAD())
			return;
		if (!inlineVar_CAD()) {
			str.print(indent);
			str.print(varName_CAD());
			str.print(" = ");
			genVarExp_CAD(p, str, indent);
			str.print(";\n");
		}
		if (shouldBeDifferentiated() && !inlineDer_CAD()) {
			str.print(indent);
			str.print(derName_CAD());
			str.print(" = ");
			genDerExp_CAD(p, str, indent);
			str.print(";\n");
		}
	}
    /**
     * Genereates the var expression that calculates the value of this node
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:376
     */
    public void genVarExp_CAD(CodePrinter p, CodeStream str, String indent) {
		prettyPrint_C(p, str, indent);
	}
    /**
     * Genereates the der expression that calculates the derivative value of this node
     * The default implementation will throw an error and all subclasses that are 
     * continouos must implement this method.
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:385
     */
    public void genDerExp_CAD(CodePrinter p, CodeStream str, String indent) {
		throw new UnsupportedOperationException("FExp.genADStatement_CAD() have to be overrided if type have continuous variablity, type=" + getClass().getSimpleName());
	}
    /**
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1534
     */
    public void genTempOutputs_CAD(CodePrinter p, CodeStream str, String indent) {}
    /**
     * Declares a regular and a derivate variable for this expression. jmi_ad_var_t
     * is a type that describes floating point numbers. Calls the overridden
     * method in order to continue iteration over that  ASTNode:s
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1624
     */
    @Override
	public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
		if (hasADStatement_CAD()) {
			if (!inlineVar_CAD()) {
				str.print(indent);
				str.print("jmi_ad_var_t ");
				str.println(varName_CAD() + ";");
			}
			if (shouldBeDifferentiated() && !inlineDer_CAD()) {
				str.print(indent);
				str.print("jmi_ad_var_t ");
				str.println(derName_CAD() + ";");
			}
		}
		if (autoGenChildVarDecls_CAD())
			super.genVarDecls_CAD(p, str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1731
     */
    protected void printDecls_CAD(CodePrinter p, CodeStream str, String indent, String varName, String derName) {
        TypePrinter_C dp = p.createDeclPrinter(str);
        dp.reset(varName, this, size().isUnknown(), false, indent);
        dp.setSubDecls(true);
        type().print(dp);
        dp.reset(derName, this, size().isUnknown(), false, indent);
        dp.setSubDecls(false);
        type().print(dp);
    }
    /**
     * Generates temporary input or output declarations.
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream 
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1787
     */
    public void genTempIODecls_CAD(CodePrinter p, CodeStream str, String indent, boolean output) {
        if (!output) {
            genVarDecls_CAD(p, str, indent);
        }
        if (replaceWithTemp(output)) {
            printDecls_CAD(p, str, indent, tempName_var_CAD(), tempName_der_CAD());
        }
    }
    /**
     * Functions containing expressions/records/array as arguments need
     * to handle the arguments before. For expressions this usually means AD-code
     * and for records/array temporary records/arrays are constructed and filled
     * and passed on as input.
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream 
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1858
     */
    public void genTempInputs_CAD(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp(false)) {
            type().printInit_C(p, str, indent, tempName_var_CAD(), this);
            type().printInit_C(p, str, indent, tempName_der_CAD(), this);
            genTempInputAssigns_CAD(p, str, indent);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1866
     */
    public void genTempInputAssigns_CAD(CodePrinter p, CodeStream str, String indent) {
        p.printTempInputAssigns(str, indent, this);
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1885
     */
    public void genTempInputCellAssigns_der_CAD(
            CodePrinter p, CodeStream str, String indent, String name) {
        str.print(indent + name + " = ");
        genDer_CAD(p, str, indent);
        str.print(";\n");
    }
    /**
     * Used when function calls are printed. It is used to generate input
     * variables for the function call. 
     * 
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1946
     */
    public void genArgument_var_CAD(CodeStream str) {
        if (replaceWithTemp(false)) {
            str.print(tempName_var_CAD());
        } else {
            genVar_CAD(printer_CAD, str, "");
        }
    }
    /**
     * Used when function calls are printed. It is used to generate input
     * derivative variables for the function call. 
     * 
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1960
     */
    public void genArgument_der_CAD(CodeStream str) {
        if (replaceWithTemp(false)) {
            str.print(tempName_der_CAD());
        } else {
            genDer_CAD(printer_CAD, str, "");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1446
     */
    private Map<String,String> recordChildTempNameMap = null;
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1448
     */
    public Map<String,String> recordChildTempNames() {
		if (recordChildTempNameMap == null)
			recordChildTempNameMap = new HashMap<String,String>();
		return recordChildTempNameMap;
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1675
     */
    public void genTempInputDecl_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp(false)) {
			type().printDecl_C(p, str, indent, tempName_C(), this);
        }
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1961
     */
    public void printForEnd_C(CodePrinter p, CodeStream str, String indent) {
		throw new UnsupportedOperationException(
				"Must override printForEnd_C() if needsForArray() returns false! Not done for class " + getClass().getSimpleName() + "!");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1998
     */
    public void printForIndex_C(CodePrinter p, CodeStream str, String indent, String name) {
		str.print(name);
		str.print("i = 0; ");
		str.print(name);
		str.print("i < ");
		str.print(size().numElements());
		str.print("; ");
		str.print(name);
		str.print("i++");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2111
     */
    public void prepExternalArg(CodePrinter p, CodeStream str, String indent, FExternalLanguage lang, boolean writeback) {
        String tempName = tempName_C();
        String src = myCodeGenContext().alias(prettyPrint_C(indent));
        useTempVar = true;
        if (isArray()) {
            MatrixOp op = new MatrixOp(type(), lang, writeback);
            if (writeback)
                op.genMatrixOp(p, str, indent, src, tempName, src);
            else
                op.genMatrixOp(p, str, indent, src, src, tempName);
        } else {
            type().printAssignExt_C(p, str, indent, tempName, src, writeback, true);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2193
     */
    public void genExternalFortranFuncArgs(CodePrinter p, CodeStream str, String indent) {
        if (!isArray() && !type().isString()) {
			str.print("&");
		}
        if (useTempVar) {
			str.print(tempName_C());
        } else {
            str.print(myCodeGenContext().alias(prettyPrint_C(indent)));
        }
		if (isArray()) {
			str.print("->var");
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2207
     */
    public void genExternalCFuncArgs(CodePrinter p, CodeStream str, String indent) {
        p.print(this, str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2358
     */
    public void genTempInput_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp(false)) {
            type().print(p.createInitPrinter(str), indent, tempName_C(), this, false);
            genTempInputAssigns_C(p, str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2365
     */
    public void genTempInputAssigns_C(CodePrinter p, CodeStream str, String indent) {
        p.printTempInputAssigns(str, indent, this);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2386
     */
    public void genTempInputCellAssigns_C(CodePrinter p, CodeStream str, String indent, String name) {
		str.print(indent + name + " = ");
		p.print(this, str, indent);
		str.print(";\n");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2393
     */
    public FExp extractRecordComponentExp(String name) {
		throw new UnsupportedOperationException(getClass().getSimpleName() + " shouldn't have record type.");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3836
     */
    public void genFuncCallOutArg_C(CPrettyPrinter.FuncCallOutArgPrinter p, CodeStream str, String indent, String name) {
        throw new UnsupportedOperationException("No implementation for FExp.genFuncCallOutArg_C for type '" + getClass().getName() + "'. Printer is " + p.getClass().getName());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4041
     */
    public void genArgument_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp(false)) {
			str.print(tempName_C());
        } else {
			p.print(this, str, indent);
        }
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4061
     */
    public void genEventResidualVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        throw new UnsupportedOperationException("Method not implemented for class " + getClass().getSimpleName() + "!");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4085
     */
    public void genEventResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator) {
        throw new UnsupportedOperationException("Method not implemented for class " + getClass().getSimpleName() + "!");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4188
     */
    public void printIndicatorGuard(CodePrinter.StepPrinter sp, CodeStream str, String indent) {
        FExp par = parentFExp();
        if (par != null) {
            par.printIndicatorGuard(sp, str, indent, this);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4195
     */
    public void printIndicatorGuard(CodePrinter.StepPrinter sp, CodeStream str, String indent, FExp e) {
        if (isIndicatorGuard(e)) {
            printIndicatorGuard(sp, str, indent, myIndicatorGuardExp(e), negateIndicatorGuard(e));
        } else {
            printIndicatorGuard(sp, str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4227
     */
    public void printIndicatorGuard(CodePrinter.StepPrinter sp, CodeStream str, String indent, FExp e, boolean not) {
        boolean hb = hasBrancher();
        if (hb) {
            sp.print(str, FAndExp.macro_C);
            sp.print(str, "(");
            printIndicatorGuard(sp, str, indent);
            sp.print(str, ", ");
        }
        
        if (not) {
            sp.print(str, FNotExp.macro_C);
            sp.print(str, "(");
        }
        
        sp.print(e, str, indent);
        
        if (not) {
            sp.print(str, ")");
        }
        
        if (hb) {
            sp.print(str, ")");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4252
     */
    public void genTimeEventVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        genVarDecls_C(p, str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4261
     */
    public void genTimeEvent_C(CodePrinter p, CodeStream str, String indent, String res) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4396
     */
    public void genRelExpKind(CodeStream str) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:26
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (isArray() && !size().isUnknown())
            getArray().genVarDecls_C(p, str, indent);
        else
            super.genVarDecls_C(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:34
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        if (isArray() && !size().isUnknown())
            p.printPreSteps(getArray(), str, indent);
        else
            super.genTempVars_C(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:49
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        if (isArray() && !size().isUnknown())
            p.printPostSteps(getArray(), str, indent);
        else
            super.genTempFree_C(p, str, indent);
    }
    /**
     * Helper, prints jmi guard around an operator
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:349
     */
    protected void prettyPrintGuarded_C(CodePrinter p, CodeStream str, String indent, FExp ... exps) {
        boolean func = inFunction();
        str.print("jmi_");
        str.print(guardedFunctionName_C());
        str.print(func ? "_function(" : "_equation(");
        str.print(func ? "\"" + containingFFunctionDecl().name() + "\", ": "jmi, ");
        for (FExp exp : exps) {
            p.print(exp, str, indent);
            str.print(",");
        }
        str.print('"');
        CStringCodeStream tstr = new CStringCodeStream(str);
        prettyPrint(tstr, "");
        tstr.close();
        str.print("\")");
    }
    /**
     * Produces statement which writes the string to the variable. This is the
     * default implementation, subclasses may override it.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:784
     */
    public void genStringExpWrite_C(CodePrinter p, CodeStream str, String indent, String dest) {
        str.format("%ssnprintf(JMI_STR_END(%s), JMI_STR_LEFT(%s), ", indent, dest, dest);
        genStringFormat_C(p, str, indent);
        str.print(", ");
        genStringParts_C(p, str, indent);
        str.println(");");
    }
    /**
     * Computes the maximum length of the produced string. This is the default
     * implementation, subclasses may override it.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:796
     */
    public void genMaxStringLength_C(CodePrinter p, CodeStream str, String indent) {
        str.print("JMI_LEN(");
        p.print(this, str, indent);
        str.print(")");
    }
    /**
     * Computes the format string for this expression. This is the default
     * implementation, subclasses may override it.
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:806
     */
    public void genStringFormat_C(CodePrinter p, CodeStream str, String indent) {
        str.print("\"");
        if (type().isString())
            str.print("%s");
        else
            throw new IllegalArgumentException("Trying to use expression '" + toString() + "' in string type expression!");
        str.print("\"");
    }
    /**
     * Helper?
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:915
     */
    public void genTopStringDecl(CodePrinter p, CodeStream str, String indent) {
        if (isTopStringOp()) {
            boolean k = isKnownStringLength();
            str.format("%sJMI_DEF_%s(%s", indent, k ? "STR_STAT" : "STR_DYNA", tempName_C());
            if (k) {
                str.format(", %d", maxStringLength_C());
            }
            str.println(")");
        }
    }
    /**
     * Helper?
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:929
     */
    public void genTopStringInit(CodePrinter p, CodeStream str, String indent) {
        if (isTopStringOp()) {
            boolean k = isKnownStringLength();
            str.format("%sJMI_INI_%s(%s", indent, k ? "STR_STAT" : "STR_DYNA", tempName_C());
            if (!k) {
                str.print(", ");
                genMaxStringLength_C(p, str, indent);
            }
            str.println(")");
            genStringExpWrite_C(p, str, indent, tempName_C());
        }
    }
    /**
     * Helper?
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:945
     */
    public void genTopStringFree(CodePrinter p, CodeStream str, String indent) {
        if (isTopStringOp() && !isKnownStringLength()) {
            type().printFree_C(str, indent, false, tempName_C());
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:999
     */
    public void genStringParts_C(CodePrinter p, CodeStream str, String indent) {
        // TODO: This method should dispatch to the type!
        FType t = type();
        if (t.isEnum()) {
            str.print(t.enumNames_C());
            str.print("[(int) ");
            p.print(this, str, indent);
            str.print("]");
        } else if (t.isBoolean()) {
            str.print("COND_EXP_EQ(");
            p.print(this, str, indent);
            str.print(", JMI_TRUE, \"true\", \"false\")");
        } else {
            if (t.isInteger())
                str.print("(int) ");
            p.print(this, str, indent);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1099
     */
    public static final int MAX_STRING_LENGTH_C = 16 * 1024 - 1;
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:251
     */
    public void varsToSerialize(ArrayList<CommonVariableDecl> decls) {
        
    }
    /**
     * @declaredat ASTNode:1
     */
    public FExp() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:16
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:22
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getArray_reset();
        getDynamicFExpOpt_reset();
        adIndex_reset();
        tempName_var_CAD_reset();
        tempName_der_CAD_reset();
        tempName_C_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:46
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:52
     */
    public FExp clone() throws CloneNotSupportedException {
        FExp node = (FExp) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:63
     */
    public abstract FExp fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:70
     */
    public abstract FExp treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:78
     */
    public abstract FExp treeCopy();
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 0;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1501
     */
    private boolean refined_Scalarization_FExp_scalarizeExpanded()
{ return isComposite() && indexNames == null && !(size().isUnknown() || inUnknownSize()); }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = 0;

        return ndims_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:249
     */
    @ASTNodeAnnotation.Attribute
    public int overloadNdims() {
        ASTNode$State state = state();
        try {
                if (shouldUseOverloadedOperator()) {
                    InstClassDecl oper = overloadedOperator(true);
                    if (oper != null && !oper.myOutputs().isEmpty())
                        return oper.myOutputs().get(0).ndims();
                }
                return ndimsBase();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int ndimsBase() {
        ASTNode$State state = state();
        int ndimsBase_value = -1;

        return ndimsBase_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = Size.SCALAR;

        return size_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:667
     */
    @ASTNodeAnnotation.Attribute
    public Size overloadSize() {
        ASTNode$State state = state();
        try {
                if (shouldUseOverloadedOperator()) {
                    InstClassDecl oper = overloadedOperator(true);
                    if (oper != null && !oper.myOutputs().isEmpty())
                        return oper.myOutputs().get(0).size();
                }
                return sizeBase();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Size sizeBase() {
        ASTNode$State state = state();
        Size sizeBase_value = null;

        return sizeBase_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIntegerLiteral(int v) {
        ASTNode$State state = state();
        boolean isIntegerLiteral_int_value = false;

        return isIntegerLiteral_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = ndims()>0;

        return isArray_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array getArray_value;
    /**
     * @apilevel internal
     */
    private void getArray_reset() {
        getArray_computed = false;
        getArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array getArray() {
        if(getArray_computed) {
            return (Array) getChild(getArrayChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getArray_value = getArray_compute();
        setChild(getArray_value, getArrayChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Array node = (Array) this.getChild(getArrayChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private Array getArray_compute() {
            if (!isArray())
                return new ScalarAsArray(this);
            
            if (useTempVar())
                return createTempArray();
            
            Array res = new Array(indices());
            for (Index i : res.indices())
                res.set(i, new FSubscriptedExp(unboundCopy(), i.createFArraySubscripts()));
            return res;
        }
    /**
     * Computes a generic array expansion of the temporary replacing this expression.
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1279
     */
    @ASTNodeAnnotation.Attribute
    public Array createTempArray() {
        ASTNode$State state = state();
        try {
                Array res = new Array(indices());
                for (Index i : res.indices()) {
                    res.set(i, tempExp(i.createFArraySubscripts()));
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Array copyArray() {
        ASTNode$State state = state();
        Array copyArray_value = (Array) createArray().unboundCopy();

        return copyArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public Array createArray() {
        ASTNode$State state = state();
        Array createArray_value = getArray();

        return createArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = Indices.create(size());

        return indices_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2291
     */
    @ASTNodeAnnotation.Attribute
    public int[] myIndices() {
        ASTNode$State state = state();
        try {
        		try {
        			int n = 0;
        			if (ndims() == 0)
        				n = 1;
        			else if (ndims() == 1)
        				n = size().get(0);
        			if (n > 0) {
        				int[] indices = new int[n];
        				int j = 0;
        				for (CValue val : ceval())
        					indices[j++] = val.intValue();
        				return indices;
        			}
        		} catch (ConstantEvaluationException e) {
        		}
        		return new int[0];
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FType inferType() {
        ASTNode$State state = state();
        FType inferType_value = inArray() ? inferredType() : type();

        return inferType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp component(String name) {
        ASTNode$State state = state();
        FExp component_String_value = dynamicFExp(extractRecordFExp(name));

        return component_String_value;
    }
    /** 
     * Convenience function for savely checking if an expression as a particular value.
     * 
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:1997
     */
    @ASTNodeAnnotation.Attribute
    public boolean equalsRealValue(double val) {
        ASTNode$State state = state();
        try {
            	try {
            		return variability().lessOrEqual(fConstant()) && ceval().realValue()==val;
            	} catch(Exception e) {
            		return false;
            	}
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval() {
        ASTNode$State state = state();
        CValue ceval_value = ceval(defaultVariableEvaluator());

        return ceval_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2042
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                if (isCircular()) 
                    return CValue.UNKNOWN;
                if (isArray()) {
                    if (size().evaluated().isUnknown())
                        return CValue.UNKNOWN;
                    return cevalArray(evaluator, Index.NULL);
                }
                CValue resOver = cevalOverloaded(evaluator);
                return (resOver != null) ? resOver : cevalCalc(evaluator);
            }
        finally {
        }
    }
    /**
     * Like {@link #ceval()}, but in the case of an array, only calculate 
     * the given cell, if possible. 
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2058
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                if (isCircular()) 
                    return CValue.UNKNOWN;
                if (isArray())
                    return cevalArray(evaluator, i);
                CValue resOver = cevalOverloaded(evaluator);
                return (resOver != null) ? resOver : cevalCalc(evaluator);
            }
        finally {
        }
    }
    /**
     * If this is an overloaded operator expression, evaluate it as such, otherwise return null.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2070
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalOverloaded(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                if (!shouldUseOverloadedOperator() || operatorName() == null)
                    return null;
                InstClassDecl func = overloadedOperator();
                return (func == null) ? CValue.UNKNOWN : func.evaluateFirst(evaluator, childFExps());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean canCeval() {
        ASTNode$State state = state();
        boolean canCeval_value = canCeval(defaultVariableEvaluator());

        return canCeval_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2086
     */
    @ASTNodeAnnotation.Attribute
    public boolean canCeval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                  try {
                      return !ceval(evaluator).isUnknown();
                } catch (ConstantEvaluationNotReadyException e) {
                  // Will be evaluatable later, ignore for now
                  return true;
                  } catch (Exception e) {
                      return false;
                  }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalArray(Index i) {
        ASTNode$State state = state();
        CValue cevalArray_Index_value = cevalArray(defaultVariableEvaluator(), i);

        return cevalArray_Index_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2106
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalArray(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                CValueArray res = new CValueArray(size());
                if (size().evaluated().isUnknown())
                    return CValue.UNKNOWN;
                Array arr = getArray();
                if (i == Index.NULL)
                  for (Index j : arr.indices())
                      res.setCell(j, arr.get(j).ceval(evaluator));
                else if (size().isOKIndex(i))
                  res.setCell(i, arr.get(i).ceval(evaluator));
                else
                  throw new ConstantEvaluationException();
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = CValue.UNSUPPORTED;

        return cevalCalc_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue extractCValue(CValue val, FVariable fv) {
        ASTNode$State state = state();
        CValue extractCValue_CValue_FVariable_value = null;

        return extractCValue_CValue_FVariable_value;
    }
    /**
     * @attribute syn
     * @aspect LiteralExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4650
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasOnlyLiterals() {
        ASTNode$State state = state();
        try {
                for (FExp e : childFExps())
                    if (!e.hasOnlyLiterals())
                        return false;
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = false;

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircularCalc() {
        ASTNode$State state = state();
        boolean isCircularCalc_value = false;

        return isCircularCalc_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVarUse() {
        ASTNode$State state = state();
        boolean isUnknownSizeVarUse_value = false;

        return isUnknownSizeVarUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp createNegated() {
        ASTNode$State state = state();
        FExp createNegated_value = new FNegExp(fullCopy());

        return createNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp makeNegated() {
        ASTNode$State state = state();
        FExp makeNegated_value = new FNegExp(this);

        return makeNegated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasSimpleNegation() {
        ASTNode$State state = state();
        boolean hasSimpleNegation_value = false;

        return hasSimpleNegation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inDeadIfBranchTest(boolean deadValue) {
        ASTNode$State state = state();
        boolean inDeadIfBranchTest_boolean_value = (isConstantExp() && ceval().booleanValue() == deadValue) || inDeadIfBranch();

        return inDeadIfBranchTest_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarElements() {
        ASTNode$State state = state();
        int numScalarElements_value = type().numScalarElements();

        return numScalarElements_value;
    }
    @ASTNodeAnnotation.Attribute
    public int guardExpInEquationsIndex() {
        ASTNode$State state = state();
        int guardExpInEquationsIndex_value = myFClass().guardExpInEquations().indexOf(this);

        return guardExpInEquationsIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int guardExpInInitialEquationsIndex() {
        ASTNode$State state = state();
        int guardExpInInitialEquationsIndex_value = myFClass().guardExpInInitialEquations().indexOf(this);

        return guardExpInInitialEquationsIndex_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1327
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> guards() {
        ASTNode$State state = state();
        try {
                ArrayList<FExp> l = new ArrayList<FExp>();
                l.add(this);
                return l;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvent() {
        ASTNode$State state = state();
        boolean generatesEvent_value = generatesEvent(true);

        return generatesEvent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvent(boolean checkInitialParameters) {
        ASTNode$State state = state();
        boolean generatesEvent_boolean_value = generatesEvent(false, checkInitialParameters);

        return generatesEvent_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvent(boolean ignoreVariability, boolean checkInitialParameters) {
        ASTNode$State state = state();
        boolean generatesEvent_boolean_boolean_value = inEventGeneratingLocation() && hasEventGeneratingType() &&
                    (ignoreVariability || hasEventGeneratingVariability(checkInitialParameters)) &&
                    myOptions().getBooleanOption("generate_event_switches");

        return generatesEvent_boolean_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingVariability(boolean checkInitialParameters) {
        ASTNode$State state = state();
        boolean hasEventGeneratingVariability_boolean_value = !variability().parameterOrLess() || (checkInitialParameters && variability().initialParameterVariability());

        return hasEventGeneratingVariability_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inEventGeneratingLocation() {
        ASTNode$State state = state();
        boolean inEventGeneratingLocation_value = !inFunction() && !inNoEventExp() && !inSmoothExp(myOptions().getBooleanOption("disable_smooth_events") ? 0 : 1);

        return inEventGeneratingLocation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEventGeneratingType() {
        ASTNode$State state = state();
        boolean hasEventGeneratingType_value = false;

        return hasEventGeneratingType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEventInDAE() {
        ASTNode$State state = state();
        boolean generatesEventInDAE_value = generatesEventInDAE(originalFExp());

        return generatesEventInDAE_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEventInDAE(FExp orig) {
        ASTNode$State state = state();
        boolean generatesEventInDAE_FExp_value = inEquationSection() && orig==this && generatesEvent(false);

        return generatesEventInDAE_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentParameterExp() {
        ASTNode$State state = state();
        boolean isIndependentParameterExp_value = isConstantExp() && !hasCompositeFunc();

        return isIndependentParameterExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInitialGuard() {
        ASTNode$State state = state();
        boolean isInitialGuard_value = false;

        return isInitialGuard_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariablesInFExp() {
        ASTNode$State state = state();
        Set<FVariable> referencedFVariablesInFExp_value = lookupFVariablesInSet(findFIdUseExpsInTree());

        return referencedFVariablesInFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedParametersInFExp() {
        ASTNode$State state = state();
        Set<FVariable> referencedParametersInFExp_value = parametersInSet(referencedFVariablesInFExp());

        return referencedParametersInFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComposite() {
        ASTNode$State state = state();
        boolean isComposite_value = isArray() || type().isRecord();

        return isComposite_value;
    }
    /**
     * Return the maximum numeric value that this expression can take, considering min/max values of variables.
     * 
     * Only implemented for a small subset of expressions:
     * - flat access to Real or Integer
     * - numeric literal
     * - negation
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2610
     */
    @ASTNodeAnnotation.Attribute
    public double maxRealValue() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * Return the minimum numeric value that this expression can take, considering min/max values of variables.
     * 
     * Only implemented for a small subset of expressions:
     * - flat access to Real or Integer
     * - numeric literal
     * - negation
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2622
     */
    @ASTNodeAnnotation.Attribute
    public double minRealValue() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = FExp.nominalDefault();

        return nominal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLinearParameterExp() {
        ASTNode$State state = state();
        boolean isLinearParameterExp_value = isParameterExp();

        return isLinearParameterExp_value;
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3221
     */
    @ASTNodeAnnotation.Attribute
    public boolean isIndependent(Set<? extends CommonVariableDecl> set) {
        ASTNode$State state = state();
        try {
                for (FExp e : childFExps()) {
                    if (!e.isIndependent(set)) {
                        return false;
                    }
                }
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean inFAlgorithm() {
        ASTNode$State state = state();
        boolean inFAlgorithm_value = myFAlgorithm() != null;

        return inFAlgorithm_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp stripNegations() {
        ASTNode$State state = state();
        FExp stripNegations_value = this;

        return stripNegations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegated() {
        ASTNode$State state = state();
        boolean isNegated_value = false;

        return isNegated_value;
    }
    /**
     * Return this expression negated if <code>neg</code> is true.
     * @attribute syn
     * @aspect ExpressionGeneralisation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:4085
     */
    @ASTNodeAnnotation.Attribute
    public FExp negated(boolean neg) {
        ASTNode$State state = state();
        try {
                if (neg)
                    return new FNegExp(unboundCopy());
                else
                    return unboundCopy();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFVForUse() {
        ASTNode$State state = state();
        FAbstractVariable myFVForUse_value = null;

        return myFVForUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarVars() {
        ASTNode$State state = state();
        int numScalarVars_value = 1;

        return numScalarVars_value;
    }
    /**
     * Get the name this expression should use for temporary variable.
     * 
     * Uses custom caching to avoid flushing.
     * @attribute syn
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1750
     */
    @ASTNodeAnnotation.Attribute
    public String tempVarName() {
        ASTNode$State state = state();
        try {
                 if (myTempVarName == null)
                     myTempVarName = calcTempVarName();
                 return myTempVarName;
             }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String calcTempVarName() {
        ASTNode$State state = state();
        String calcTempVarName_value = calcGeneratedVarName(FlatVariableMap.GeneratedVarType.TEMP);

        return calcTempVarName_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp tempUseExp() {
        ASTNode$State state = state();
        FIdUseExp tempUseExp_value = new FIdUseExp(tempVarName());

        return tempUseExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FPreExp tempPreExp() {
        ASTNode$State state = state();
        FPreExp tempPreExp_value = new FPreExp(new FIdUse(tempVarName()));

        return tempPreExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable tempVar() {
        ASTNode$State state = state();
        FVariable tempVar_value = tempVar(variability(), type());

        return tempVar_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable tempVar(FTypePrefixVariability variability, FType type) {
        ASTNode$State state = state();
        FVariable tempVar_FTypePrefixVariability_FType_value = type.createTempFVariable(new FQNameFull(tempVarName()), variability);

        return tempVar_FTypePrefixVariability_FType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isValidExp() {
        ASTNode$State state = state();
        boolean isValidExp_value = isValidExp(false);

        return isValidExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isValidExp(boolean allowUnknownSize) {
        ASTNode$State state = state();
        boolean isValidExp_boolean_value = true;

        return isValidExp_boolean_value;
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
                return super.numFExp() + 1;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int precedence() {
        ASTNode$State state = state();
        int precedence_value = PRECEDENCE_HIGHEST;

        return precedence_value;
    }
    @ASTNodeAnnotation.Attribute
    public int parentPrecedence() {
        ASTNode$State state = state();
        int parentPrecedence_value = parent != null ? retrieveParentPrecedence() : FExp.PRECEDENCE_LOWEST;

        return parentPrecedence_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean addParenthesis(int parentPrecedence) {
        ASTNode$State state = state();
        boolean addParenthesis_int_value = precedence() < parentPrecedence || precedence() == parentPrecedence && shouldhaveParenthesis();

        return addParenthesis_int_value;
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:250
     */
    @ASTNodeAnnotation.Attribute
    public FExp createFirstIndexExp() {
        ASTNode$State state = state();
        try {
                FArraySubscripts fas = new FArraySubscripts();
                fas.addFSubscript(new FIntegerSubscript(1));
                return new FSubscriptedExp(treeCopy(), fas);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructorTypeArg() {
        ASTNode$State state = state();
        boolean isConstructorTypeArg_value = false;

        return isConstructorTypeArg_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        FType type_value = fUnknownType();

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOKTestExp() {
        ASTNode$State state = state();
        boolean isOKTestExp_value = type().isBoolean() && type().isScalar();

        return isOKTestExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIterExp() {
        ASTNode$State state = state();
        boolean isIterExp_value = false;

        return isIterExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNoExp() {
        ASTNode$State state = state();
        boolean isNoExp_value = false;

        return isNoExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructorCall() {
        ASTNode$State state = state();
        boolean isConstructorCall_value = false;

        return isConstructorCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructorCall() {
        ASTNode$State state = state();
        boolean isDestructorCall_value = false;

        return isDestructorCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable assignedFV() {
        ASTNode$State state = state();
        FAbstractVariable assignedFV_value = null;

        return assignedFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstantExp() {
        ASTNode$State state = state();
        boolean isConstantExp_value = variability().constantVariability();

        return isConstantExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameterExp() {
        ASTNode$State state = state();
        boolean isParameterExp_value = variability().parameterVariability();

        return isParameterExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscreteExp() {
        ASTNode$State state = state();
        boolean isDiscreteExp_value = variability().discreteVariability();

        return isDiscreteExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isContinuousExp() {
        ASTNode$State state = state();
        boolean isContinuousExp_value = variability().continuousVariability();

        return isContinuousExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inDiscreteLocation() {
        ASTNode$State state = state();
        boolean inDiscreteLocation_value = inWhen() || (inFunction() && !duringFunctionInlining());

        return inDiscreteLocation_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = expVariability();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = combineFExpListVariability(childFExps());

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variabilityInNoEventExp() {
        ASTNode$State state = state();
        FTypePrefixVariability variabilityInNoEventExp_value = variabilityInNoEventExp(combineFExpListVariability(childFExps()));

        return variabilityInNoEventExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variabilityInNoEventExp(FTypePrefixVariability var) {
        ASTNode$State state = state();
        FTypePrefixVariability variabilityInNoEventExp_FTypePrefixVariability_value = inNoEventExp() ? var : var.combineDown(fDiscrete());

        return variabilityInNoEventExp_FTypePrefixVariability_value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:624
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:453
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockable(boolean then) {
        ASTNode$State state = state();
        try {
                if (variability().fixedParameterOrLess()) {
                    try {
                        return ceval().booleanValue() != then;
                    } catch (ConstantEvaluationException e) {
                        
                    }
                }
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeErrorOnlyLengths() {
        ASTNode$State state = state();
        boolean typeErrorOnlyLengths_value = typeErrorOnlyLengths(childFExps());

        return typeErrorOnlyLengths_value;
    }
    /**
     * Check if type error is only in array lengths.
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:487
     */
    @ASTNodeAnnotation.Attribute
    public boolean typeErrorOnlyLengths(Iterable<FExp> exps) {
        ASTNode$State state = state();
        try {
                FType first = null;
                for (FExp exp : exps) {
                    FType cur = exp.type();
                    if (first == null) {
                        first = cur;
                    } else if (!first.equivalentExceptLengths(cur)) {
                        return false;
                    }
                }
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccess() {
        ASTNode$State state = state();
        boolean isAccess_value = false;

        return isAccess_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:699
     */
    @ASTNodeAnnotation.Attribute
    public FIdUse asFIdUse() {
        ASTNode$State state = state();
        try {
        	  throw new UnsupportedOperationException("asFIdUse() is not supported for class type " + getClass().getSimpleName());
          }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:704
     */
    @ASTNodeAnnotation.Attribute
    public FIdUseExp asFIdUseExp() {
        ASTNode$State state = state();
        try {
              throw new UnsupportedOperationException("asFIdUseExp() is not supported for class type " + getClass().getSimpleName());
          }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:712
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess asInstAccess() {
        ASTNode$State state = state();
        try {
        		throw new UnsupportedOperationException();
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccessToStream() {
        ASTNode$State state = state();
        boolean isAccessToStream_value = false;

        return isAccessToStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeComponentSize() {
        ASTNode$State state = state();
        boolean canBeComponentSize_value = type().isInteger();

        return canBeComponentSize_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentReference(Criteria<InstComponentDecl> criteria) {
        ASTNode$State state = state();
        boolean isComponentReference_Criteria_InstComponentDecl__value = false;

        return isComponentReference_Criteria_InstComponentDecl__value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsLaterInStreamRewrite() {
        ASTNode$State state = state();
        boolean needsLaterInStreamRewrite_value = false;

        return needsLaterInStreamRewrite_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMultiplicationOf(FVariable v) {
        ASTNode$State state = state();
        boolean isMultiplicationOf_FVariable_value = false;

        return isMultiplicationOf_FVariable_value;
    }
    /**
     * @attribute syn
     * @aspect Cardinality
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2908
     */
    @ASTNodeAnnotation.Attribute
    public int cardinalityValue() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * \Return the expression corresponding to the given index in this array expression. 
     * 
     * Will not create new nodes unless necessary.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1390
     */
    @ASTNodeAnnotation.Attribute
    public FExp splitArrayExp(Index index) {
        ASTNode$State state = state();
        try {
                FExp res = this;
                for (int i : index.index())
                    res = res.splitArrayExp(i);
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp splitArrayExp(int index) {
        ASTNode$State state = state();
        FExp splitArrayExp_int_value = new FSubscriptedExp(unboundCopy(), index, ndims());

        return splitArrayExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> accessedVarSet() {
        ASTNode$State state = state();
        Set<InstComponentDecl> accessedVarSet_value = Collections.emptySet();

        return accessedVarSet_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getDynamicFExpOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getDynamicFExpOpt_value;
    /**
     * @apilevel internal
     */
    private void getDynamicFExpOpt_reset() {
        getDynamicFExpOpt_computed = false;
        getDynamicFExpOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getDynamicFExpOpt() {
        if(getDynamicFExpOpt_computed) {
            return getDynamicFExpOpt_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getDynamicFExpOpt_value = new DynamicOpt();
        getDynamicFExpOpt_value.setParent(this);
        getDynamicFExpOpt_value.is$Final = true;
        if (true) {
            getDynamicFExpOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getDynamicFExpOpt_value;
    }
    @ASTNodeAnnotation.Attribute
    public String operatorName() {
        ASTNode$State state = state();
        String operatorName_value = null;

        return operatorName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldUseOverloadedOperator() {
        ASTNode$State state = state();
        boolean shouldUseOverloadedOperator_value = false;

        return shouldUseOverloadedOperator_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl overloadedOperator() {
        ASTNode$State state = state();
        InstClassDecl overloadedOperator_value = null;

        return overloadedOperator_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl overloadedOperator(boolean useSize) {
        ASTNode$State state = state();
        InstClassDecl overloadedOperator_boolean_value = null;

        return overloadedOperator_boolean_value;
    }
    /**
     * Calculate the function to use for this operator expression involving operator records.
     * 
     * Returns null if none or more than one function matches.
     * 
     * @param left   the type of the left operand
     * @param right  the type of the right operand for binary operators, and <code>null</code> for unary operators
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:190
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl overloadedOperatorFor(FType left, FType right) {
        ASTNode$State state = state();
        try {
                String operator = operatorName();
                InstClassDecl func = overloadedOperatorFor(left, right, true);
                if (func == null && (left.isArray() || (right != null && right.isArray())))
                    func = overloadedOperatorFor(left, right, false);
                return func;
            }
        finally {
        }
    }
    /**
     * Calculate the function to use for this operator expression involving operator records, 
     * given knowledge on whether array handling should be done by the operator or by the normal rules.
     * 
     * Returns null if none or more than one function matches.
     * 
     * @param left     the type of the left operand
     * @param right    the type of the right operand for binary operators, and <code>null</code> for unary operators
     * @param useSize  if <code>false</code>, try to match a function with scalar inputs, ignoring operand sizes
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:208
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl overloadedOperatorFor(FType left, FType right, boolean useSize) {
        ASTNode$State state = state();
        try {
                String operator = operatorName();
                if (!useSize) {
                    left = left.scalarType();
                    right = right == null ? null : right.scalarType();
                }
                return left.matchOverloadedOperator(right, operator);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = type().shouldBeDifferentiated() && (inFunction() && !isConstantExp() || isContinuousExp());

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotationExp() {
        ASTNode$State state = state();
        boolean isAnnotationExp_value = false;

        return isAnnotationExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<? extends ASTNode> annotationList() {
        ASTNode$State state = state();
        Iterable<? extends ASTNode> annotationList_value = new ArrayList<ASTNode>(0);

        return annotationList_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = true;

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSliceFAS(Size size) {
        ASTNode$State state = state();
        boolean isSliceFAS_Size_value = true;

        return isSliceFAS_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteral(int i) {
        ASTNode$State state = state();
        boolean isLiteral_int_value = false;

        return isLiteral_int_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1081
     */
    @ASTNodeAnnotation.Attribute
    public boolean dependsOn(Collection<FVariable> fvs) {
        ASTNode$State state = state();
        try {
        		for (FVariable fv : lookupFVariablesInSet(findFIdUseExpsInTree()))
        			if (fvs.contains(fv))
        				return true;
        		return false;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = false;

        return canBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public int aliasSign() {
        ASTNode$State state = state();
        int aliasSign_value = 1;

        return aliasSign_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable variableThatCanBeAlias() {
        ASTNode$State state = state();
        FVariable variableThatCanBeAlias_value = null;

        return variableThatCanBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralExp() {
        ASTNode$State state = state();
        boolean isLiteralExp_value = false;

        return isLiteralExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp getEquationLeftInlineUse() {
        ASTNode$State state = state();
        FIdUseExp getEquationLeftInlineUse_value = null;

        return getEquationLeftInlineUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFSampleExp() {
        ASTNode$State state = state();
        boolean isFSampleExp_value = false;

        return isFSampleExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroLiteral() {
        ASTNode$State state = state();
        boolean isZeroLiteral_value = false;

        return isZeroLiteral_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFlatParameterUse() {
        ASTNode$State state = state();
        boolean isFlatParameterUse_value = false;

        return isFlatParameterUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroFlowForm(FExp other) {
        ASTNode$State state = state();
        boolean isZeroFlowForm_FExp_value = false;

        return isZeroFlowForm_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSemiLinear() {
        ASTNode$State state = state();
        boolean isSemiLinear_value = false;

        return isSemiLinear_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSmoothInSemiLinear() {
        ASTNode$State state = state();
        boolean isSmoothInSemiLinear_value = false;

        return isSmoothInSemiLinear_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDerAccess() {
        ASTNode$State state = state();
        boolean isDerAccess_value = false;

        return isDerAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAbstractDerAccess() {
        ASTNode$State state = state();
        boolean isAbstractDerAccess_value = false;

        return isAbstractDerAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean eventGenerating() {
        ASTNode$State state = state();
        boolean eventGenerating_value = false;

        return eventGenerating_value;
    }
    /**
     * Check if this expression or any subexpressions can cause events. 
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:643
     */
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        try {
                if (eventGenerating())
                    return true;
                for (FExp e : childFExps())
                    if (e.generatesEvents())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * Check if an expression contains any calls to functions that we can inline.
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:698
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        try {
                for (FExp exp : childFExps())
                    if (exp.hasInlinableFunctions(fi))
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinableFunctionCall(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean isInlinableFunctionCall_AbstractFunctionInliner_value = false;

        return isInlinableFunctionCall_AbstractFunctionInliner_value;
    }
    /**
     * Checks if left hand side variable(s) is eligible for var. prop.
     * @attribute syn
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:130
     */
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        try {
        		throw new UnsupportedOperationException();
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldExtractGuard() {
        ASTNode$State state = state();
        boolean shouldExtractGuard_value = true;

        return shouldExtractGuard_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdTempExp tempExp() {
        ASTNode$State state = state();
        FIdTempExp tempExp_value = tempExp(indexNames);

        return tempExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdTempExp tempExp(String name) {
        ASTNode$State state = state();
        FIdTempExp tempExp_String_value = new FIdTempExp(new FIdUse(tempFQName(name)));

        return tempExp_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdTempExp tempExp(FArraySubscripts fas) {
        ASTNode$State state = state();
        FIdTempExp tempExp_FArraySubscripts_value = new FIdTempExp(new FIdUse(tempVarName(),fas));

        return tempExp_FArraySubscripts_value;
    }
    /**
     * @attribute syn
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:860
     */
    @ASTNodeAnnotation.Attribute
    public FIdTempExp tempExp(FExp[] subs) {
        ASTNode$State state = state();
        try {
                if (subs != null && subs.length > 0) {
                    List<FSubscript> l = new List<FSubscript>();
                    for (FExp e : subs) {
                        l.add(new FExpSubscript(e.fullCopy()));
                    }
                    FArraySubscripts fas = new FArraySubscripts(l);
                    return tempExp(fas);
                } else {
                    return tempExp(tempVarName());
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean expandWithIterExp() {
        ASTNode$State state = state();
        boolean expandWithIterExp_value = false;

        return expandWithIterExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean useTempVar() {
        ASTNode$State state = state();
        boolean useTempVar_value = useTempVar;

        return useTempVar_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizeExpanded() {
        ASTNode$State state = state();
        boolean scalarizeExpanded_value = duringFunctionInlining() ? isComposite() : refined_Scalarization_FExp_scalarizeExpanded();

        return scalarizeExpanded_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonVectorizedFunctionCall() {
        ASTNode$State state = state();
        boolean isNonVectorizedFunctionCall_value = false;

        return isNonVectorizedFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = isComposite() && size().isUnknown() && isFunctionCallIO();

        return extractTemp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractAsUnknown() {
        ASTNode$State state = state();
        boolean extractAsUnknown_value = size().isUnknown();

        return extractAsUnknown_value;
    }
    /**
     * @attribute syn
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:116
     */
    @ASTNodeAnnotation.Attribute
    public Set<FAbstractVariable> usesInScalarizedExp() {
        ASTNode$State state = state();
        try {
                Set<FAbstractVariable> res = new HashSet<FAbstractVariable>();
                usesInScalarizedExp(res);
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp createDerExp(int order) {
        ASTNode$State state = state();
        FExp createDerExp_int_value = diff(TIME, order);

        return createDerExp_int_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:230
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> terms() {
        ASTNode$State state = state();
        try {
        		ArrayList<FExp> t = new ArrayList<FExp>();
        		t.add(this);
        		return t;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:251
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> factors() {
        ASTNode$State state = state();
        try {
        		ArrayList<FExp> t = new ArrayList<FExp>();
        		t.add(this);
        		return t;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIdentifier(String name) {
        ASTNode$State state = state();
        boolean isIdentifier_String_value = false;

        return isIdentifier_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public int isMulTerm(String name) {
        ASTNode$State state = state();
        int isMulTerm_String_value = 0;

        return isMulTerm_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDivTerm(String name) {
        ASTNode$State state = state();
        boolean isDivTerm_String_value = false;

        return isDivTerm_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNegTerm(String name) {
        ASTNode$State state = state();
        boolean isNegTerm_String_value = false;

        return isNegTerm_String_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:351
     */
    @ASTNodeAnnotation.Attribute
    public FExp originalFExp() {
        ASTNode$State state = state();
        try { throw new UnsupportedOperationException(); }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralZero() {
        ASTNode$State state = state();
        boolean isLiteralZero_value = false;

        return isLiteralZero_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralOne() {
        ASTNode$State state = state();
        boolean isLiteralOne_value = false;

        return isLiteralOne_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLiteralMinusOne() {
        ASTNode$State state = state();
        boolean isLiteralMinusOne_value = false;

        return isLiteralMinusOne_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsNoEvent() {
        ASTNode$State state = state();
        boolean needsNoEvent_value = true;

        return needsNoEvent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsSmooth() {
        ASTNode$State state = state();
        boolean needsSmooth_value = true;

        return needsSmooth_value;
    }
    /**
     * @attribute syn
     * @aspect ExpressionSimplification
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:530
     */
    @ASTNodeAnnotation.Attribute
    public boolean equalsSymbolic(FExp other) {
        ASTNode$State state = state();
        try {
                return super.equals(other);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIgnoredXML() {
        ASTNode$State state = state();
        boolean isIgnoredXML_value = false;

        return isIgnoredXML_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Unsupported";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "exp";

        return xmlNamespace_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean adIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int adIndex_value;
    /**
     * @apilevel internal
     */
    private void adIndex_reset() {
        adIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int adIndex() {
        if(adIndex_computed) {
            return adIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        adIndex_value = myFClass().nextADIndex();
        if (isFinal && num == state().boundariesCrossed) {
            adIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return adIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        ASTNode$State state = state();
        String varName_CAD_value = "v_" + adIndex();

        return varName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        ASTNode$State state = state();
        String derName_CAD_value = "d_" + adIndex();

        return derName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String getSeedName() {
        ASTNode$State state = state();
        String getSeedName_value = "(*dz)";

        return getSeedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String zeroValue_CAD() {
        ASTNode$State state = state();
        String zeroValue_CAD_value = type().isString() ? "\"\"" : "AD_WRAP_LITERAL(0)";

        return zeroValue_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildADStatements_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildADStatements_CAD_value = true;

        return autoGenChildADStatements_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildVarDecls_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildVarDecls_CAD_value = autoGenChildADStatements_CAD();

        return autoGenChildVarDecls_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasADStatement_CAD() {
        ASTNode$State state = state();
        boolean hasADStatement_CAD_value = type() != null;

        return hasADStatement_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean tempName_var_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String tempName_var_CAD_value;
    /**
     * @apilevel internal
     */
    private void tempName_var_CAD_reset() {
        tempName_var_CAD_computed = false;
        tempName_var_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String tempName_var_CAD() {
        if(tempName_var_CAD_computed) {
            return tempName_var_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        tempName_var_CAD_value = tempName_var_CAD_compute();
        if (isFinal && num == state().boundariesCrossed) {
            tempName_var_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return tempName_var_CAD_value;
    }
    /**
     * @apilevel internal
     */
    private String tempName_var_CAD_compute() {
    		return "tmp_var_" + myFClass().nextTempNbr_var_CAD();
    	}
    /**
     * @apilevel internal
     */
    protected boolean tempName_der_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String tempName_der_CAD_value;
    /**
     * @apilevel internal
     */
    private void tempName_der_CAD_reset() {
        tempName_der_CAD_computed = false;
        tempName_der_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String tempName_der_CAD() {
        if(tempName_der_CAD_computed) {
            return tempName_der_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        tempName_der_CAD_value = tempName_der_CAD_compute();
        if (isFinal && num == state().boundariesCrossed) {
            tempName_der_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return tempName_der_CAD_value;
    }
    /**
     * @apilevel internal
     */
    private String tempName_der_CAD_compute() {
    		return "tmp_der_" + myFClass().nextTempNbr_der_CAD();
    	}
    @ASTNodeAnnotation.Attribute
    public String argType_C(boolean ref) {
        ASTNode$State state = state();
        String argType_C_boolean_value = type().argType_C(ref);

        return argType_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean replaceWithTemp(boolean output) {
        ASTNode$State state = state();
        boolean replaceWithTemp_boolean_value = isComposite() || (output && type().isString());

        return replaceWithTemp_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extShouldArgConvert(boolean fortran) {
        ASTNode$State state = state();
        boolean extShouldArgConvert_boolean_value = false;

        return extShouldArgConvert_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsForArray() {
        ASTNode$State state = state();
        boolean needsForArray_value = true;

        return needsForArray_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean tempName_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String tempName_C_value;
    /**
     * @apilevel internal
     */
    private void tempName_C_reset() {
        tempName_C_computed = false;
        tempName_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String tempName_C() {
        if(tempName_C_computed) {
            return tempName_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        tempName_C_value = nextTempName_C();
        if (isFinal && num == state().boundariesCrossed) {
            tempName_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return tempName_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nextTempName_C() {
        ASTNode$State state = state();
        String nextTempName_C_value = myCodeGenContext().nextTempName_C();

        return nextTempName_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndicatorGuard(FExp e) {
        ASTNode$State state = state();
        boolean isIndicatorGuard_FExp_value = false;

        return isIndicatorGuard_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp myIndicatorGuardExp(FExp e) {
        ASTNode$State state = state();
        FExp myIndicatorGuardExp_FExp_value = null;

        return myIndicatorGuardExp_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean negateIndicatorGuard(FExp e) {
        ASTNode$State state = state();
        boolean negateIndicatorGuard_FExp_value = false;

        return negateIndicatorGuard_FExp_value;
    }
    /**
     * Helper, returns the specific part of the C guard function
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:369
     */
    @ASTNodeAnnotation.Attribute
    public String guardedFunctionName_C() {
        ASTNode$State state = state();
        try { throw new UnsupportedOperationException(); }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isKnownStringLength() {
        ASTNode$State state = state();
        boolean isKnownStringLength_value = variability().knownParameterOrLess();

        return isKnownStringLength_value;
    }
    /**
     * The maximum length string the representation of the value of this expression can have in C.
     * @attribute syn
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1067
     */
    @ASTNodeAnnotation.Attribute
    public int maxStringLength_C() {
        ASTNode$State state = state();
        try { 
                if (type().isString())
                    return MAX_STRING_LENGTH_C;
                else
                    throw new IllegalArgumentException("Trying to use expression '" + toString() + "' in string type expression!");
            }
        finally {
        }
    }
    /**
     * Check if an expression is inside array subscripts.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:40
     */
    @ASTNodeAnnotation.Attribute
    public boolean inArraySubscripts() {
        ASTNode$State state = state();
        boolean inArraySubscripts_value = getParent().Define_inArraySubscripts(this, null);

        return inArraySubscripts_value;
    }
    /**
     * Check if this expression is inside an iteration expression.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:805
     */
    @ASTNodeAnnotation.Attribute
    public boolean inIterExp() {
        ASTNode$State state = state();
        boolean inIterExp_value = getParent().Define_inIterExp(this, null);

        return inIterExp_value;
    }
    /**
     * Return a size that represents the given size with sizes of surrounding iteration expressions appended.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:813
     */
    @ASTNodeAnnotation.Attribute
    public Size expandSizeForIterExp(Size s) {
        ASTNode$State state = state();
        Size expandSizeForIterExp_Size_value = getParent().Define_expandSizeForIterExp(this, null, s);

        return expandSizeForIterExp_Size_value;
    }
    /**
     * Collect an FArraySubscriptss for the indexes of surrounding iteration expressions, 
     * to use in getArray() for children.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1859
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts collectIterExpSubscripts() {
        ASTNode$State state = state();
        FArraySubscripts collectIterExpSubscripts_value = getParent().Define_collectIterExpSubscripts(this, null);

        return collectIterExpSubscripts_value;
    }
    /**
     * Check if this expression is the direct child of an Array.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2346
     */
    @ASTNodeAnnotation.Attribute
    public boolean inArray() {
        ASTNode$State state = state();
        boolean inArray_value = getParent().Define_inArray(this, null);

        return inArray_value;
    }
    /**
     * Helper attribute to {@link FExp#inferType()}.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2355
     */
    @ASTNodeAnnotation.Attribute
    public FType inferredType() {
        ASTNode$State state = state();
        FType inferredType_value = getParent().Define_inferredType(this, null);

        return inferredType_value;
    }
    /**
     * Check if this node is in a function that is being evaluated.
     * @attribute inh
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3221
     */
    @ASTNodeAnnotation.Attribute
    public boolean duringFunctionEval() {
        ASTNode$State state = state();
        boolean duringFunctionEval_value = getParent().Define_duringFunctionEval(this, null);

        return duringFunctionEval_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:773
     */
    @ASTNodeAnnotation.Attribute
    public boolean inDeadIfBranch() {
        ASTNode$State state = state();
        boolean inDeadIfBranch_value = getParent().Define_inDeadIfBranch(this, null);

        return inDeadIfBranch_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1431
     */
    @ASTNodeAnnotation.Attribute
    public FStatement myFStatement() {
        ASTNode$State state = state();
        FStatement myFStatement_value = getParent().Define_myFStatement(this, null);

        return myFStatement_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1510
     */
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> boundParameters() {
        ASTNode$State state = state();
        Set<FVariable> boundParameters_value = getParent().Define_boundParameters(this, null);

        return boundParameters_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1556
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFEquation() {
        ASTNode$State state = state();
        boolean inFEquation_value = getParent().Define_inFEquation(this, null);

        return inFEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1560
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractEquation myFEquation() {
        ASTNode$State state = state();
        FAbstractEquation myFEquation_value = getParent().Define_myFEquation(this, null);

        return myFEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1566
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2379
     */
    @ASTNodeAnnotation.Attribute
    public FRecordDecl containingRecordDecl() {
        ASTNode$State state = state();
        FRecordDecl containingRecordDecl_value = getParent().Define_containingRecordDecl(this, null);

        return containingRecordDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2817
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunctionCallLeft() {
        ASTNode$State state = state();
        boolean inFunctionCallLeft_value = getParent().Define_inFunctionCallLeft(this, null);

        return inFunctionCallLeft_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2822
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunctionCallLeftTop() {
        ASTNode$State state = state();
        boolean inFunctionCallLeftTop_value = getParent().Define_inFunctionCallLeftTop(this, null);

        return inFunctionCallLeftTop_value;
    }
    /**
     * Checks if this expression is used in a function call
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2831
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunctionCall() {
        ASTNode$State state = state();
        boolean inFunctionCall_value = getParent().Define_inFunctionCall(this, null);

        return inFunctionCall_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2836
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFunctionCallArg() {
        ASTNode$State state = state();
        boolean isFunctionCallArg_value = getParent().Define_isFunctionCallArg(this, null);

        return isFunctionCallArg_value;
    }
    /**
     * Returnes the function input that this expressions corresponds to.
     * NOTICE, this method will throw exception if this exp does not reside in a function call.
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2844
     */
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCorrespondingInput() {
        ASTNode$State state = state();
        CommonVariableDecl myCorrespondingInput_value = getParent().Define_myCorrespondingInput(this, null);

        return myCorrespondingInput_value;
    }
    /**
     * Check if this is the left hand side of an equation.
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2866
     */
    @ASTNodeAnnotation.Attribute
    public boolean isLeftHandSide() {
        ASTNode$State state = state();
        boolean isLeftHandSide_value = getParent().Define_isLeftHandSide(this, null);

        return isLeftHandSide_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2883
     */
    @ASTNodeAnnotation.Attribute
    public boolean inBindingExp() {
        ASTNode$State state = state();
        boolean inBindingExp_value = getParent().Define_inBindingExp(this, null);

        return inBindingExp_value;
    }
    /**
     * Check if this is exp is bound in a declaration
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2891
     */
    @ASTNodeAnnotation.Attribute
    public boolean isBound() {
        ASTNode$State state = state();
        boolean isBound_value = getParent().Define_isBound(this, null);

        return isBound_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2896
     */
    @ASTNodeAnnotation.Attribute
    public boolean inParamBindingExp() {
        ASTNode$State state = state();
        boolean inParamBindingExp_value = getParent().Define_inParamBindingExp(this, null);

        return inParamBindingExp_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2900
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability bindingExpVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability bindingExpVariability_value = getParent().Define_bindingExpVariability(this, null);

        return bindingExpVariability_value;
    }
    /**
     * Check if a subexpression appears linearly.
     * 
     * Note that this method does not check if the expression itself is linear
     * but wheather it apperas linearly in a composite expression. For example
     * the sub expression 'sin(x)' appears linearly in '1+sin(x)'.
     * @attribute inh
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3151
     */
    @ASTNodeAnnotation.Attribute
    public boolean isLinear() {
        ASTNode$State state = state();
        boolean isLinear_value = getParent().Define_isLinear(this, null);

        return isLinear_value;
    }
    /**
     * @attribute inh
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     */
    @ASTNodeAnnotation.Attribute
    public boolean isLinear(Set<FVariable> vars) {
        ASTNode$State state = state();
        boolean isLinear_Set_FVariable__value = getParent().Define_isLinear(this, null, vars);

        return isLinear_Set_FVariable__value;
    }
    /**
     * @attribute inh
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3731
     */
    @ASTNodeAnnotation.Attribute
    public FAlgorithm myFAlgorithm() {
        ASTNode$State state = state();
        FAlgorithm myFAlgorithm_value = getParent().Define_myFAlgorithm(this, null);

        return myFAlgorithm_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:27
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_FQName_value = getParent().Define_lookupFV(this, null, fqn);

        return lookupFV_FQName_value;
    }
    /**
     * Is this expression in a parameter equation?
     * @attribute inh
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:508
     */
    @ASTNodeAnnotation.Attribute
    public boolean inParameterEquation() {
        ASTNode$State state = state();
        boolean inParameterEquation_value = getParent().Define_inParameterEquation(this, null);

        return inParameterEquation_value;
    }
    /**
     * Is this expression in the value of an attribute?
     * @attribute inh
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:517
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAttributeValue() {
        ASTNode$State state = state();
        boolean inAttributeValue_value = getParent().Define_inAttributeValue(this, null);

        return inAttributeValue_value;
    }
    /**
     * @attribute inh
     * @aspect FlatPreBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:658
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupPreFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupPreFV_FQName_value = getParent().Define_lookupPreFV(this, null, fqn);

        return lookupPreFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:109
     */
    @ASTNodeAnnotation.Attribute
    public FQName retrieveFQName() {
        ASTNode$State state = state();
        FQName retrieveFQName_value = getParent().Define_retrieveFQName(this, null);

        return retrieveFQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1602
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * Get the containing FFunctionDecl.
     * 
     * Only valid in flat tree.
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1626
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl containingFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl containingFFunctionDecl_value = getParent().Define_containingFFunctionDecl(this, null);

        return containingFFunctionDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1647
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAlgorithm() {
        ASTNode$State state = state();
        boolean inAlgorithm_value = getParent().Define_inAlgorithm(this, null);

        return inAlgorithm_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1738
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractFunctionCall myFunctionCall() {
        ASTNode$State state = state();
        FAbstractFunctionCall myFunctionCall_value = getParent().Define_myFunctionCall(this, null);

        return myFunctionCall_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     */
    @ASTNodeAnnotation.Attribute
    public String calcGeneratedVarName(FlatVariableMap.GeneratedVarType gvt) {
        ASTNode$State state = state();
        String calcGeneratedVarName_FlatVariableMap_GeneratedVarType_value = getParent().Define_calcGeneratedVarName(this, null, gvt);

        return calcGeneratedVarName_FlatVariableMap_GeneratedVarType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1882
     */
    @ASTNodeAnnotation.Attribute
    public boolean inEquationSection() {
        ASTNode$State state = state();
        boolean inEquationSection_value = getParent().Define_inEquationSection(this, null);

        return inEquationSection_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1887
     */
    @ASTNodeAnnotation.Attribute
    public boolean inInitialEquationSection() {
        ASTNode$State state = state();
        boolean inInitialEquationSection_value = getParent().Define_inInitialEquationSection(this, null);

        return inInitialEquationSection_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1893
     */
    @ASTNodeAnnotation.Attribute
    public boolean inEquation() {
        ASTNode$State state = state();
        boolean inEquation_value = getParent().Define_inEquation(this, null);

        return inEquation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1897
     */
    @ASTNodeAnnotation.Attribute
    public boolean inNoEventExp() {
        ASTNode$State state = state();
        boolean inNoEventExp_value = getParent().Define_inNoEventExp(this, null);

        return inNoEventExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1904
     */
    @ASTNodeAnnotation.Attribute
    public boolean inSmoothExp(int order) {
        ASTNode$State state = state();
        boolean inSmoothExp_int_value = getParent().Define_inSmoothExp(this, null, order);

        return inSmoothExp_int_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1910
     */
    @ASTNodeAnnotation.Attribute
    public boolean inConnectClause() {
        ASTNode$State state = state();
        boolean inConnectClause_value = getParent().Define_inConnectClause(this, null);

        return inConnectClause_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1916
     */
    @ASTNodeAnnotation.Attribute
    public boolean inIfCondition() {
        ASTNode$State state = state();
        boolean inIfCondition_value = getParent().Define_inIfCondition(this, null);

        return inIfCondition_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     */
    @ASTNodeAnnotation.Attribute
    public boolean inWhen() {
        ASTNode$State state = state();
        boolean inWhen_value = getParent().Define_inWhen(this, null);

        return inWhen_value;
    }
    /**
     * @attribute inh
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1538
     */
    @ASTNodeAnnotation.Attribute
    public int retrieveParentPrecedence() {
        ASTNode$State state = state();
        int retrieveParentPrecedence_value = getParent().Define_retrieveParentPrecedence(this, null);

        return retrieveParentPrecedence_value;
    }
    /**
     * Used if precedence is equal for node and its parent.
     * @attribute inh
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1555
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldhaveParenthesis() {
        ASTNode$State state = state();
        boolean shouldhaveParenthesis_value = getParent().Define_shouldhaveParenthesis(this, null);

        return shouldhaveParenthesis_value;
    }
    /**
     * Lock the closest surrounding if-equation or if-expression that have only 
     * parameter-expression tests and evaluates to another branch. Returns true 
     * if any such if exists. 
     * 
     * Any parameters used in the test will be marked as structural.
     * 
     * NB: This has side-effects, dispite being an inherited attribute.
     * 
     * @param checkType  the type of error checks to use when marking structural parameters
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:418
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockBranch(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean lockBranch_ErrorCheckType_value = getParent().Define_lockBranch(this, null, checkType);

        return lockBranch_ErrorCheckType_value;
    }
    /**
     * Check if this expression is multiplied with the given variable.
     * @attribute inh
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:261
     */
    @ASTNodeAnnotation.Attribute
    public boolean isMultipliedWith(FVariable v) {
        ASTNode$State state = state();
        boolean isMultipliedWith_FVariable_value = getParent().Define_isMultipliedWith(this, null, v);

        return isMultipliedWith_FVariable_value;
    }
    /**
     * Find the component that has this expression as a part of its binding expression, if any.
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2095
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findComponentWithThisBindingExp() {
        ASTNode$State state = state();
        InstComponentDecl findComponentWithThisBindingExp_value = getParent().Define_findComponentWithThisBindingExp(this, null);

        return findComponentWithThisBindingExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2105
     */
    @ASTNodeAnnotation.Attribute
    public int findDepthOfNestledFunctionCalls() {
        ASTNode$State state = state();
        int findDepthOfNestledFunctionCalls_value = getParent().Define_findDepthOfNestledFunctionCalls(this, null);

        return findDepthOfNestledFunctionCalls_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2656
     */
    @ASTNodeAnnotation.Attribute
    public FQName sizeFlatteningPrefix() {
        ASTNode$State state = state();
        FQName sizeFlatteningPrefix_value = getParent().Define_sizeFlatteningPrefix(this, null);

        return sizeFlatteningPrefix_value;
    }
    /**
     * Find the InstModification containing this expression, if any.
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:677
     */
    @ASTNodeAnnotation.Attribute
    public InstModification surroundingInstModification() {
        ASTNode$State state = state();
        InstModification surroundingInstModification_value = getParent().Define_surroundingInstModification(this, null);

        return surroundingInstModification_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2316
     */
    @ASTNodeAnnotation.Attribute
    public InstNode containingInstNode() {
        ASTNode$State state = state();
        InstNode containingInstNode_value = getParent().Define_containingInstNode(this, null);

        return containingInstNode_value;
    }
    /**
     * @attribute inh
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:324
     */
    @ASTNodeAnnotation.Attribute
    public boolean inNonDiffArg() {
        ASTNode$State state = state();
        boolean inNonDiffArg_value = getParent().Define_inNonDiffArg(this, null);

        return inNonDiffArg_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1761
     */
    @ASTNodeAnnotation.Attribute
    public boolean duringFunctionInlining() {
        ASTNode$State state = state();
        boolean duringFunctionInlining_value = getParent().Define_duringFunctionInlining(this, null);

        return duringFunctionInlining_value;
    }
    /**
     * @attribute inh
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:613
     */
    @ASTNodeAnnotation.Attribute
    public FExp myTopFactorFExp() {
        ASTNode$State state = state();
        FExp myTopFactorFExp_value = getParent().Define_myTopFactorFExp(this, null);

        return myTopFactorFExp_value;
    }
    /**
     * Check if this FExp is in an binding exp that will still be a binding exp after scalarization 
     * @attribute inh
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:559
     */
    @ASTNodeAnnotation.Attribute
    public boolean inKeptBExp() {
        ASTNode$State state = state();
        boolean inKeptBExp_value = getParent().Define_inKeptBExp(this, null);

        return inKeptBExp_value;
    }
    /**
     * Surrounding if or else equation, if any.
     * 
     * Only valid in flat tree.
     * @attribute inh
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1288
     */
    @ASTNodeAnnotation.Attribute
    public FIfWhenEquation surroundingIfOrElse() {
        ASTNode$State state = state();
        FIfWhenEquation surroundingIfOrElse_value = getParent().Define_surroundingIfOrElse(this, null);

        return surroundingIfOrElse_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:75
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFunctionCallIO() {
        ASTNode$State state = state();
        boolean isFunctionCallIO_value = getParent().Define_isFunctionCallIO(this, null);

        return isFunctionCallIO_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:80
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFVectorFunctionCallArg() {
        ASTNode$State state = state();
        boolean isFVectorFunctionCallArg_value = getParent().Define_isFVectorFunctionCallArg(this, null);

        return isFVectorFunctionCallArg_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     */
    @ASTNodeAnnotation.Attribute
    public boolean inUnknownSize() {
        ASTNode$State state = state();
        boolean inUnknownSize_value = getParent().Define_inUnknownSize(this, null);

        return inUnknownSize_value;
    }
    /**
     * @attribute inh
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:177
     */
    @ASTNodeAnnotation.Attribute
    public FExp enclosingIfExpCond() {
        ASTNode$State state = state();
        FExp enclosingIfExpCond_value = getParent().Define_enclosingIfExpCond(this, null);

        return enclosingIfExpCond_value;
    }
    /**
     * @attribute inh
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:279
     */
    @ASTNodeAnnotation.Attribute
    public boolean isNegativeTerm() {
        ASTNode$State state = state();
        boolean isNegativeTerm_value = getParent().Define_isNegativeTerm(this, null);

        return isNegativeTerm_value;
    }
    /**
     * @attribute inh
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:287
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInvertedFactor() {
        ASTNode$State state = state();
        boolean isInvertedFactor_value = getParent().Define_isInvertedFactor(this, null);

        return isInvertedFactor_value;
    }
    /**
     * The var expression for this type will be inlined if true
     * @attribute inh
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:318
     */
    @ASTNodeAnnotation.Attribute
    public boolean inlineVar_CAD() {
        ASTNode$State state = state();
        boolean inlineVar_CAD_value = getParent().Define_inlineVar_CAD(this, null);

        return inlineVar_CAD_value;
    }
    /**
     * The der expression for this type will be inlined if true
     * @attribute inh
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:325
     */
    @ASTNodeAnnotation.Attribute
    public boolean inlineDer_CAD() {
        ASTNode$State state = state();
        boolean inlineDer_CAD_value = getParent().Define_inlineDer_CAD(this, null);

        return inlineDer_CAD_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2324
     */
    @ASTNodeAnnotation.Attribute
    public CodeGenContext myCodeGenContext() {
        ASTNode$State state = state();
        CodeGenContext myCodeGenContext_value = getParent().Define_myCodeGenContext(this, null);

        return myCodeGenContext_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4140
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasBrancher() {
        ASTNode$State state = state();
        boolean hasBrancher_value = getParent().Define_hasBrancher(this, null);

        return hasBrancher_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4183
     */
    @ASTNodeAnnotation.Attribute
    public FExp parentFExp() {
        ASTNode$State state = state();
        FExp parentFExp_value = getParent().Define_parentFExp(this, null);

        return parentFExp_value;
    }
    /**
     * Check if this string concatenation or String operator is the top node in an expression consisting of 
     * one or more string concatenations, i.e. returns true if parent is not an FStringAddExp.
     * @attribute inh
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1027
     */
    @ASTNodeAnnotation.Attribute
    public boolean isTopStringOp() {
        ASTNode$State state = state();
        boolean isTopStringOp_value = getParent().Define_isTopStringOp(this, null);

        return isTopStringOp_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:632
     * @apilevel internal
     */
    public CommonVariableDecl Define_surroundingVariableDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2364
     * @apilevel internal
     */
    public FType Define_type(ASTNode caller, ASTNode child) {
        if (caller == getArrayNoTransform()) {
            return type();
        }
        else {
            return getParent().Define_type(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2822
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeftTop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new ArrayList<FFunctionCallLeft>();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1538
     * @apilevel internal
     */
    public int Define_retrieveParentPrecedence(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
        		int precedence = precedence();
        		if (precedence == PRECEDENCE_HIGHEST)
        			return PRECEDENCE_LOWEST;
        		else
        			return precedence;
        	}
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:209
     * @apilevel internal
     */
    public List<InstAccess> Define_accessContextInst(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new List<InstAccess>();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:215
     * @apilevel internal
     */
    public List<FQNamePart> Define_accessContextFlat(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new List<FQNamePart>();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:303
     * @apilevel internal
     */
    public boolean Define_iterExpUseOK(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:666
     * @apilevel internal
     */
    public boolean Define_iterExpMustBeScalar(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1207
     * @apilevel internal
     */
    public String Define_nonBoundArgumentTypeError(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                throw new UnsupportedOperationException("Method nonBoundArgumentTypeError() not implemented for type " + getClass().getSimpleName());
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1214
     * @apilevel internal
     */
    public String Define_argumentTypeError(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return size().isUnknown() || (extractTemp() && extractAsUnknown()) ||
                    inUnknownSize();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:318
     * @apilevel internal
     */
    public boolean Define_inlineVar_CAD(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:325
     * @apilevel internal
     */
    public boolean Define_inlineDer_CAD(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4183
     * @apilevel internal
     */
    public FExp Define_parentFExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
