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
 * A qualifed identifier in an expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1127
 * @production FIdUseExp : {@link FAssignableExp} ::= <span class="component">{@link FIdUse}</span> <span class="component">&lt;OriginalVariable:String&gt;</span>;

 */
public class FIdUseExp extends FAssignableExp implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1206
     */
    protected ASTNode replaceFromIndexMap(Map<String,FExp> indexMap) {
		FExp res = indexMap.get(name());
		return (res == null) ? this : res;
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1933
     */
    public void setScalarizedFlag() {
		getFIdUse().getFQName().scalarized = true;
	}
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @param right     the CValue to assign
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4013
     */
    @Override
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right) {
        getFIdUse().assignToInFuncEval(evaluator, right);
    }
    /**
     * @aspect VariableEvaluator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:5084
     */
    public void mapComponents(Map<FIdUseExp, Set<FIdUseExp>> res, CValue val) {
        Set<FIdUseExp> s = new HashSet<FIdUseExp>();
        s.addAll(val.getDependencies());
        res.put(this, s);
    }
    /**
     * Constructs a flat FIdUseExp that refers to the variable with the given FIdUse.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:307
     */
    public FIdUseExp(FIdUse name) {
		this(name, (String)null);
	}
    /**
     * Constructs a flat FIdUseExp that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:314
     */
    public FIdUseExp(String name) {
		this(new FIdUse(name));
	}
    /**
     * Constructs an FIdUseExp that refers to the variable with the given name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:321
     */
    public FIdUseExp(FQName name) {
		this(new FIdUse(name));
	}
    /**
     * Constructs an FIdUseExp that refers to a cell of the variable with the given name.
     * 
     * @param fas  the array subscripts to set for the last name part
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:330
     */
    public FIdUseExp(String name, FArraySubscripts fas) {
		this(new FIdUse(name, fas));
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1084
     */
    public FIdUseExp createEmptyNode()      { return new FIdUseExp();      }
    /**
     * Create new node of same class as this, with the specified children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1204
     */
    public FIdUseExp createNode(FIdUse use) {
		FIdUseExp node = createEmptyNode();
		node.setFIdUse(use);
		return node;
	}
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2058
     */
    @Override
    public void findFIdUseExpsInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
        set.add(this);
        super.findFIdUseExpsInTree(set, visitor);
    }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2235
     */
    @Override
    public void assignedInAllBranchesVariables(Set<String> res) {
        res.add(name());
    }
    /**
     * @aspect ParameterEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:493
     */
    public void addToParameterEquationsMap(
			Map<FAbstractVariable,FAbstractEquation> map, FAbstractEquation equ) {
        getFIdUse().myFV().addToParameterEquationsMap(map, equ);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1698
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		p.print(getFIdUse(), str, indent);
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2214
     */
    public void prettyPrint_MC(Printer p, CodeStream str, String indent) {
		str.print(nameUnderscore());
	}
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:533
     */
    public FExp copyReplaceAccess(FExp.ContextReplacer crp) {
        return crp.copyReplaceAccess(getFIdUse());
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:312
     */
    public void makeContinuousVariablesDiscrete() {
        myFV().makeContinuousVariableDiscrete();
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:636
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (!getFIdUse().isUnknown() && type().isUnknown() && !accessToModelOK())
            getFIdUse().typeError(checkType, this);
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1895
     */
    public FExp flatten(FQName prefix) {
        return getFIdUse().flatten(prefix, this);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2502
     */
    public FExp createFPreExp() {
        return new FPreExp(getFIdUseNoTransform());
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2612
     */
    public FDerExp flattenDer(FQName prefix, int order) {
         return new FDerExp(getFIdUse().flatten(prefix), order);
     }
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:645
     */
    public void populateInstRecordModificationList(
			List<InstRecordModification> list, InstValueModification org) {
		getFIdUse().populateInstRecordModificationList(list, org, this);
	}
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:58
     */
    public void sanityCheckFIdUseConsistency(FClass fc) {
        sanityCheckFIdUseConsistencyInChildren(fc);
        
        if (!getFIdUse().hasNonLiteralSubscripts() && myFV().isUnknown()) {
            fc.sanityProblem(this, "Variable not found: '%s'", name());
        }
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:119
     */
    public void sanityCheckParameterEquationLeft(FClass fc, FAbstractEquation eqn) {
        FAbstractVariable fv = getFIdUse().myFV();
        if (!fv.isParameter()) {
            fc.sanityProblem(this, "Non-parameter set in parameter equation: %s", this);
        } else if (fv.variability().initialParameterVariability()) {
            fc.sanityProblem(this, "Initial parameter set in parameter equation: %s", this);
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:813
     */
    public FExp extractRecordFExp(String suffix) {
        return new FIdUseExp(getFIdUse().extractRecordFExp(suffix));
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1708
     */
    public void enableAliasRewrite() {
		super.enableAliasRewrite();
		rewriteAlias = true;
		is$Final = false;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1729
     */
    boolean rewriteAlias = false;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1839
     */
    public void setOriginalVariable(FIdUseExp oldExp, FAbstractVariable var) {
        setOriginalVariable(computeOriginalVariable(oldExp, var));
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1842
     */
    private static String computeOriginalVariable(FIdUseExp oldExp, FAbstractVariable var) {
        if (!oldExp.getOriginalVariable().isEmpty()) {
            return oldExp.getOriginalVariable();
        }
        while (var.isTemporary()) {
            AliasManager.AliasVariable av = var.asFVariable().myFClass().getAliasManager().getAliasVariable(var.asFVariable());
            if (av.getTempAssignRight() != null) {
                var = av.getTempAssignRight();
            } else {
                return null;
            }
            
        }
        return var.name();
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2009
     */
    public void removeFromUses() {
		FAbstractVariable var = myFV();
		var.uses().remove(this);
		var.definingUses().remove(this);
		var.nonDefiningUses().remove(this);
		getFIdUse().getFQName().removeFromUses();
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2260
     */
    @Override
    public void insertTempsInLHS(FClass fClass, boolean param) {
        
    }
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2947
     */
    public void removeBindingExpOfReferencedVars() {
		getFIdUse().myFV().removeBindingExp();
	}
    /**
     * Mark referenced variable as state.
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3714
     */
    public void markReferencedVarAsState() {
        myFV().markAsState();
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:166
     */
    public boolean dependsOnBlock(AbstractEquationBlock block) {
        return block.allVariables().contains(myFV());
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:544
     */
    public FExp createInlineVars(
            AbstractFunctionInliner fi, FExp bExp, FTypePrefixVariability variability) {
        FVariable var = fi.addVar(scalarName(), variability, type());
        if (bExp != null) {
            var.setBindingExp(bExp);
            fi.setReplacementExp(scalarName(), bExp);
        }
        return var.createUseExp();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:605
     */
    public FExp preventEvents() {
        getFIdUse().getFQName().preventEvents();
        return this;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:891
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        getFIdUse().getFQName().inlineFunctions(fi);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1539
     */
    public FExp replaceReferences(AbstractFunctionInliner fi) {
        replaceReferencesInSubscripts(fi);
        if (fi.isReplacementVar(name())) {
            return this;
        }
        FExp exp = null;
        if (getFIdUse().hasNonLiteralSubscripts()) {
            exp = dynamicFExp(copyWithNonLiteralSubscriptsAsColon());
            exp = exp.getArray().buildWithReplacedReferences(fi, this);
            exp = new FSubscriptedExp(exp, getFIdUse().copyNonLiteralSubscripts());
        } else {
            exp = fi.getReplacementExp(scalarName());
            if (exp != null) {
                exp = dynamicFExp(exp.treeCopyNoTransform());
            } else {
                if (isArray() && !size().isUnknown()) { 
                    exp = getArray().buildWithReplacedReferences(fi, this);
                } else if (type().isRecord()) {
                    exp = dynamicFExp(type().createRecordConstructor(Collections.<String,FExp>emptyMap(), this));
                    exp = exp.replaceReferences(fi);
                } else {
                    exp = type().zeroLiteral();
                }
            }
        }
        replaceMe(exp);
        return exp;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1569
     */
    public FIdUseExp copyWithNonLiteralSubscriptsAsColon() {
        return createNode(getFIdUse().copyWithNonLiteralSubscriptsAsColon());
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1618
     */
    public FArraySubscripts copyNonLiteralSubscripts() {
        return getFIdUse().copyNonLiteralSubscripts();
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:479
     */
    @Override
    public boolean variabilityPropagation(
            FClass.VariabilityPropagator propagator,
            CValue value,
            FTypePrefixVariability variability) {
        
        if (taggedByVProp) {
            return taggedByVProp;
        }
        
        FExp bexp = null;
        if (!value.isUnknown()) {
            try {
                bexp = value.buildLiteral();
                variability = fConstant();
            } catch (ConstantEvaluationException e) {
                variability = variability.combine(fFixedParameter());
            }
        } else {
            variability = variability.combine(fFixedParameter());
        }
        
        if (variability.parameterOrLess()) {
            myFV().variabilityPropagation(propagator, variability, bexp);
        }
        
        taggedByVProp = variability.knownParameterOrLess();
        return taggedByVProp;
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:691
     */
    public void enableConstantFolding() {
		if (type().isString()) {
			constantFoldingEnabled = true;
			is$Final = false;
			return;
		}
		super.enableConstantFolding();
	}
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:166
     */
    public FExp asGuard(Collection<FAbstractEquation> outerEqnList, Collection<FStatement> stmtList, FClass fclass) {
        if (shouldExtractGuard())
            return super.asGuard(outerEqnList, stmtList, fclass);
        else
            return new FAndExp(fullCopy(), new FNotExp(new FPreExp(getFIdUse().fullCopy())));
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:898
     */
    public FIdUseExp createUseFas(String name) {
        if (indexNames != null && indexNames.length > 0) {
            return new FIdUseExp(name, createIndexNameFas());
        } else {
            return new FIdUseExp(name);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:906
     */
    public FArraySubscripts createIndexNameFas() {
        List<FSubscript> l = new List<FSubscript>();
        for (FExp e : indexNames) {
            l.add(new FExpSubscript(e.fullCopy()));
        }
        return new FArraySubscripts(l);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1057
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, FQName suffix) {
      FQName fqn = getFIdUse().getFQName();
      if (indexMap.containsKey(name())) {
          fqn = ((FIdUseExp) indexMap.get(name())).getFIdUse().getFQName();
      }
      if (indexNames != null) {
          fqn = fqn.copyAndAddFas(createIndexNameFas());
      }
      fqn = fqn.asFQNameFull().copyAndAppend(suffix);
      fqn.scalarized = false;
      FExp res = createNode(new FIdUse(fqn));
      res = dynamicFExp(res).scalarize(indexMap);
      return res;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1153
     */
    public FExp extractArrayCell(Map<String,FExp> indexMap, Index i) {
        return dynamicFExp(createNode(new FIdUse(getFIdUse().getFQName().specify(i, true))));
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1586
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
        if (indexMap.containsKey(name())) {
            return indexMap.get(name()).fullCopy();
        }
        if (indexNames != null)
            return createUseFas(name());
        return new FIdUseExp(getFIdUse().scalarize(indexMap));
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:133
     */
    public void usesInScalarizedExp(Set<FAbstractVariable> res) {
        res.add(myFV());
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:680
     */
    public void addArrayUsesToIndexMap(FExp[] names) {
        if (!hasFArraySubscripts() && isArray())
            indexNames = names;
        super.addArrayUsesToIndexMap(names);
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:397
     */
    public FExp diff(String name) {
        return dynamicFExp(diffUseOrDerExp(name, name()));
    }
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:91
     */
    private boolean dynamicStateRewriteEnabled = false;
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:97
     */
    @Override
    public void enableDynamicStateRewrite() {
        super.enableDynamicStateRewrite();
        dynamicStateRewriteEnabled = true;
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:191
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {	
		p.print(getFIdUse(), str, p.indent(indent));
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:391
     */
    @Override
    public void genVarExp_CAD(CodePrinter p, CodeStream str, String indent) {
        str.print(varName_CAD());
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:396
     */
    @Override
    public void genDerExp_CAD(CodePrinter p, CodeStream str, String indent) {
        str.print(derName_CAD());
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1299
     */
    public void genWriteBackAssignment_var_CAD(CodeStream str, String indent, String name, Collection<FVariable> forVariables) {
        if (forVariables != null && !forVariables.contains(myFV()))
            return; // This variable is not in the set of variables to generate code for.
        str.print(indent);
        str.print(varName_CAD());
        str.print(" = ");
        str.print(name + ";\n");
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1308
     */
    public void genWriteBackAssignment_der_CAD(CodeStream str, String indent, String name, Collection<FVariable> forVariables) {
        if (forVariables != null && !forVariables.contains(myFV()) || !shouldBeDifferentiated())
            return; // This variable is not in the set of variables to generate code for.
        str.print(indent);
        str.print(derName_CAD());
        str.print(" = ");
        str.print(name + ";\n");
    }
    /**
     * No variables should be declared for this expression. 
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1601
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2021
     */
    public void genWriteBackResidual_var_CAD(CodeStream str, String indent, String name, Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
        int index = indexCounter.next();
        if (forIndices.size() == 0 || forIndices.contains(index)) {
            // This variable is in the set of variables to generate code for.
            str.print(indent);
            str.print("(*res)[");
            str.print(enumerator.next());
            str.print("] = ");
            str.print(name);
            str.print(" - (");
            str.print(varName_CAD());
            str.print(");\n");
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2036
     */
    public void genWriteBackResidual_der_CAD(CodeStream str, String indent, String name, Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
        int index = indexCounter.next();
        if ((forIndices.size() == 0 || forIndices.contains(index)) && shouldBeDifferentiated()) {
            str.print(indent);
            str.print("(*dF)[");
            str.print(enumerator.next());
            str.print("] = ");
            str.print(name);
            str.print(" - (");
            str.print(derName_CAD());
            str.print(");\n");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2151
     */
    @Override
    public void prepExternalArg(CodePrinter p, CodeStream str, String indent, FExternalLanguage lang, boolean writeback) {
        if (!writeback || myCommonVarDecl().isOutput()) {
            if (isArray() && !writeback) {
                type().print(p.createInitPrinter(str), indent, tempName_C(), this, true);
            }
            super.prepExternalArg(p, str, indent, lang, writeback);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2211
     */
    @Override
	public void genExternalCFuncArgs(CodePrinter p, CodeStream str, String indent) {
        if (myCommonVarDecl().isOutput() && !isComposite())
            str.print("&");
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2397
     */
    @Override
	public FExp extractRecordComponentExp(String name) {
		FQName fqn = getFIdUse().getFQName().copyAndAppend(name);
		return dynamicFExp(new FIdUseExp(fqn));
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3845
     */
    @Override
    public void genFuncCallOutArg_C(CPrettyPrinter.FuncCallOutArgPrinter p, CodeStream str, String indent, String name) {
        p.printUse(str, indent, this, name);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3892
     */
    public void genWriteBackResidual_C(CodeStream str, String indent, String name, Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
        int index = indexCounter.next();
        if (forIndices == null || forIndices.contains(index)) {
            if (!myFV().isReal()) 
                throw new UnsupportedOperationException("Cannot generate real residual write back for non real variable " + myFV().name());

            // This variable is in the set of variables to generate code for.
            str.print(indent);
            str.print("(*res)[");
            str.print(enumerator.next());
            str.print("] = ");
            str.print(name);
            str.print(" - (");
            prettyPrint_C(str, "");
            str.print(");\n");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4006
     */
    public void genWriteBackAssignment_C(CodeStream str, String indent, String name, Collection<FVariable> forVariables) {
        if (forVariables != null && !forVariables.contains(myFV()))
            return; // This variable is not in the set of variables to generate code for.
        if (type().isString()) {
            str.format("%sJMI_ASG(STR, ", indent);
            genAssignedRef_C(ASTNode.printer_C, str, indent);
            str.print(", ");
            str.print(name);
            str.println(")");
            return;
        }
        str.print(indent);
        genAssignedRef_C(ASTNode.printer_C, str, indent);
        str.print(" = (");
        str.print(name);
        str.print(")");
        if (myFV().isReal() && myOptions().getBooleanOption("enable_variable_scaling") && !inFunction()) {
            str.print("/sf(");
            str.print(myFV().valueReference());
            str.print(")");
        }
        str.print(";\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4030
     */
    public void genArrayWriteBackAssignment_C(CodeStream str, String indent, String name, int n) {
        str.print(indent);
        str.print("memcpy(&");
        genAssignedRef_C(ASTNode.printer_C, str, indent);
        str.print(", &");
        str.print(name);
        str.print(", ");
        str.print(n);
        str.print(" * sizeof(jmi_real_t));\n");
    }
    /**
     * Helper method that prints the variable reference for assignment (LHS).
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:452
     */
    public void genAssignedRef_C(CodePrinter p, CodeStream str, String indent) {
        p.print(getFIdUse(), str, "");
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:461
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        if (type().isReal() && !inFunction() && myOptions().getBooleanOption("enable_variable_scaling")) {
            str.print("(");
            genAssignedRef_C(p, str, indent);
            str.print("*sf(");
            str.print(myFV().valueReference());
            str.print("))");
        } else {
            genAssignedRef_C(p, str, indent);
        }
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:255
     */
    public void varsToSerialize(ArrayList<CommonVariableDecl> decls) {
        CommonVariableDecl cvd = myCommonVarDecl();
        if (!decls.contains(cvd))
            decls.add(cvd);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIdUseExp() {
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
        children = new ASTNode[2];
    }
    /**
     * @declaredat ASTNode:13
     */
    public FIdUseExp(FIdUse p0, String p1) {
        setChild(p0, 0);
        setOriginalVariable(p1);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FIdUseExp(FIdUse p0, Symbol p1) {
        setChild(p0, 0);
        setOriginalVariable(p1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        indices_reset();
        myFV_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:54
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FIdUseExp clone() throws CloneNotSupportedException {
        FIdUseExp node = (FIdUseExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public FIdUseExp copy() {
        try {
            FIdUseExp node = (FIdUseExp) clone();
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
     * @declaredat ASTNode:86
     */
    public FIdUseExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public FIdUseExp treeCopyNoTransform() {
        FIdUseExp tree = (FIdUseExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
                    tree.children[i] = null;
                    continue;
                }
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
     * @declaredat ASTNode:120
     */
    public FIdUseExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:127
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_OriginalVariable == ((FIdUseExp)node).tokenString_OriginalVariable);    
    }
    /**
     * Replaces the FIdUse child.
     * @param node The new node to replace the FIdUse child.
     * @apilevel high-level
     */
    public void setFIdUse(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FIdUse child.
     * @return The current node used as the FIdUse child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FIdUse")
    public FIdUse getFIdUse() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the FIdUse child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FIdUse child.
     * @apilevel low-level
     */
    public FIdUse getFIdUseNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the lexeme OriginalVariable.
     * @param value The new value for the lexeme OriginalVariable.
     * @apilevel high-level
     */
    public void setOriginalVariable(String value) {
        tokenString_OriginalVariable = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_OriginalVariable;
    /**
     */
    public int OriginalVariablestart;
    /**
     */
    public int OriginalVariableend;
    /**
     * JastAdd-internal setter for lexeme OriginalVariable using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme OriginalVariable
     * @apilevel internal
     */
    public void setOriginalVariable(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setOriginalVariable is only valid for String lexemes");
        tokenString_OriginalVariable = (String)symbol.value;
        OriginalVariablestart = symbol.getStart();
        OriginalVariableend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme OriginalVariable.
     * @return The value for the lexeme OriginalVariable.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="OriginalVariable")
    public String getOriginalVariable() {
        return tokenString_OriginalVariable != null ? tokenString_OriginalVariable : "";
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 1;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1502
     */
    private boolean refined_Scalarization_FIdUseExp_scalarizeExpanded()
{ return !inFunction() && super.scalarizeExpanded(); }
    /**
     * @apilevel internal
     */
    protected boolean ndims_computed = false;
    /**
     * @apilevel internal
     */
    protected int ndims_value;
    /**
     * @apilevel internal
     */
    private void ndims_reset() {
        ndims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        if(ndims_computed) {
            return ndims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ndims_value = getFIdUse().ndims();
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return ndims_value;
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
        size_value = getFIdUse().size();
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
    		if (isArray()) {
    			/*
    			 * Based on an array access, say x, corresponding to the declaration
    			 * Real x[2], the array {x[1],x[2]} is generated. 
    			 */
    			Array array = new Array(indices());
    			for (Index i : array.indices()) 
    				array.set(i, createNode(getFIdUse().specify(i, false)));
    			return array;
    		} else {
    			return new ScalarAsArray(this);
    		}
    	}
    /**
     * @apilevel internal
     */
    protected boolean indices_computed = false;
    /**
     * @apilevel internal
     */
    protected Indices indices_value;
    /**
     * @apilevel internal
     */
    private void indices_reset() {
        indices_computed = false;
        indices_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        if(indices_computed) {
            return indices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        indices_value = getFIdUse().indices();
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalArray(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue cevalArray_VariableEvaluator_Index_value = isSlice() ? super.cevalArray(evaluator, i) : cevalCalc(evaluator);

        return cevalArray_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = evaluator.cevalUse(this);

        return cevalCalc_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalUse(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalUse_VariableEvaluator_value = getFIdUse().ceval(evaluator);

        return cevalUse_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue extractCValue(CValue val, FVariable fv) {
        ASTNode$State state = state();
        CValue extractCValue_CValue_FVariable_value = getFIdUse().myFV() == fv ? val : null;

        return extractCValue_CValue_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOnlyLiterals() {
        ASTNode$State state = state();
        boolean hasOnlyLiterals_value = false;

        return hasOnlyLiterals_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircularCalc() {
        ASTNode$State state = state();
        boolean isCircularCalc_value = getFIdUse().isCircular(-1);

        return isCircularCalc_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVarUse() {
        ASTNode$State state = state();
        boolean isUnknownSizeVarUse_value = getFIdUse().isUnknownSizeVarUse();

        return isUnknownSizeVarUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConsecutiveInZ(FIdUseExp use) {
        ASTNode$State state = state();
        boolean isConsecutiveInZ_FIdUseExp_value = myFV().isConsecutiveInZ(use.myFV());

        return isConsecutiveInZ_FIdUseExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public double maxRealValue() {
        ASTNode$State state = state();
        double maxRealValue_value = myFV().maxRealValue();

        return maxRealValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public double minRealValue() {
        ASTNode$State state = state();
        double minRealValue_value = myFV().minRealValue();

        return minRealValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = myFV().nominal();

        return nominal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlgebraicVariableAccess() {
        ASTNode$State state = state();
        boolean isAlgebraicVariableAccess_value = inAlgebraicAccessLocation() && myFV().isAlgebraicVariable();

        return isAlgebraicVariableAccess_value;
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
                return getFIdUse().isIndependent(set);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FAlgorithm myFAlgorithm() {
        ASTNode$State state = state();
        FAlgorithm myFAlgorithm_value = getFIdUse().myFAlgorithm();

        return myFAlgorithm_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFV_computed = false;
    /**
     * @apilevel internal
     */
    protected FAbstractVariable myFV_value;
    /**
     * @apilevel internal
     */
    private void myFV_reset() {
        myFV_computed = false;
        myFV_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFV() {
        if(myFV_computed) {
            return myFV_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFV_value = getFIdUse().myFV();
        if (isFinal && num == state().boundariesCrossed) {
            myFV_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myFVForUse() {
        ASTNode$State state = state();
        FAbstractVariable myFVForUse_value = myFV();

        return myFVForUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable myFuncVar() {
        ASTNode$State state = state();
        FFunctionVariable myFuncVar_value = getFIdUse().myFuncVar();

        return myFuncVar_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCommonVarDecl() {
        ASTNode$State state = state();
        CommonVariableDecl myCommonVarDecl_value = getFIdUse().myCommonVarDecl();

        return myCommonVarDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = getFIdUse().isForIndex();

        return isForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = getFIdUse().hasFArraySubscripts();

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = getFIdUse().getFArraySubscripts();

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFIdUse().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derName(int order) {
        ASTNode$State state = state();
        String derName_int_value = getFIdUseNoTransform().derName(order);

        return derName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String preName() {
        ASTNode$State state = state();
        String preName_value = getFIdUseNoTransform().preName();

        return preName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarName() {
        ASTNode$State state = state();
        String scalarName_value = getFIdUse().scalarName();

        return scalarName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = getFIdUse().nameUnderscore();

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructorTypeArg() {
        ASTNode$State state = state();
        boolean isConstructorTypeArg_value = !myCommonVarDecl().isOutput();

        return isConstructorTypeArg_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean type_computed = false;
    /**
     * @apilevel internal
     */
    protected FType type_value;
    /**
     * @apilevel internal
     */
    private void type_reset() {
        type_computed = false;
        type_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        if(type_computed) {
            return type_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        type_value = getFIdUse().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable assignedFV() {
        ASTNode$State state = state();
        FAbstractVariable assignedFV_value = myFV();

        return assignedFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = getFIdUse().variability();

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability indexVariability_value = getFIdUse().indexVariability();

        return indexVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccess() {
        ASTNode$State state = state();
        boolean isAccess_value = true;

        return isAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUse asFIdUse() {
        ASTNode$State state = state();
        FIdUse asFIdUse_value = getFIdUse();

        return asFIdUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp asFIdUseExp() {
        ASTNode$State state = state();
        FIdUseExp asFIdUseExp_value = this;

        return asFIdUseExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess asInstAccess() {
        ASTNode$State state = state();
        InstAccess asInstAccess_value = getFIdUse().asInstAccess();

        return asInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccessToStream() {
        ASTNode$State state = state();
        boolean isAccessToStream_value = getFIdUse().isAccessToStream();

        return isAccessToStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeComponentSize() {
        ASTNode$State state = state();
        boolean canBeComponentSize_value = type().isInteger() || getFIdUse().isComponentSizeClass();

        return canBeComponentSize_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentReference(Criteria<InstComponentDecl> criteria) {
        ASTNode$State state = state();
        boolean isComponentReference_Criteria_InstComponentDecl__value = getFIdUse().isComponentReference(criteria);

        return isComponentReference_Criteria_InstComponentDecl__value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMultiplicationOf(FVariable v) {
        ASTNode$State state = state();
        boolean isMultiplicationOf_FVariable_value = v == myFV();

        return isMultiplicationOf_FVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public int cardinalityValue() {
        ASTNode$State state = state();
        int cardinalityValue_value = getFIdUse().cardinalityValue();

        return cardinalityValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp splitArrayExp(int index) {
        ASTNode$State state = state();
        FExp splitArrayExp_int_value = createNode(getFIdUse().splitArrayAccess(index));

        return splitArrayExp_int_value;
    }
    /**
     * Check if this access is in the binding expression of an input to a function 
     * or component in a record class, and refers to an input in the same function 
     * or component in the same record class.
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2085
     */
    @ASTNodeAnnotation.Attribute
    public boolean inDefaultArgument() {
        ASTNode$State state = state();
        try {
                InstComponentDecl target = asInstAccess().myInstComponentDecl();
                InstComponentDecl holder = findComponentWithThisBindingExp();
                return holder != null && target.containingEntity() == holder.containingEntity() && 
                       ((inFunction() && holder.isInput() && target.isInput()) || holder.inRecordConstructor());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> accessedVarSet() {
        ASTNode$State state = state();
        Set<InstComponentDecl> accessedVarSet_value = getFIdUse().accessedVarSet();

        return accessedVarSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = isArray() && getFIdUse().isSlice();

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = myFV().canBeAlias();

        return canBeAlias_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1533
     */
    @ASTNodeAnnotation.Attribute
    public FVariable variableThatCanBeAlias() {
        ASTNode$State state = state();
        try {
                FAbstractVariable fav = myFV();
                if (fav.isFVariable()) {
                    return fav.asFVariable();
                } else {
                    return null;
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable myOriginalFV() {
        ASTNode$State state = state();
        FAbstractVariable myOriginalFV_value = myFClass().lookupFV(getOriginalVariable());

        return myOriginalFV_value;
    }
    @ASTNodeAnnotation.Attribute
    public FIdUseExp getEquationLeftInlineUse() {
        ASTNode$State state = state();
        FIdUseExp getEquationLeftInlineUse_value = this;

        return getEquationLeftInlineUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFlatParameterUse() {
        ASTNode$State state = state();
        boolean isFlatParameterUse_value = getFIdUse().isFlatParameterUse();

        return isFlatParameterUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isZeroFlowForm(FExp other) {
        ASTNode$State state = state();
        boolean isZeroFlowForm_FExp_value = other.isSemiLinear();

        return isZeroFlowForm_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSmoothInSemiLinear() {
        ASTNode$State state = state();
        boolean isSmoothInSemiLinear_value = true;

        return isSmoothInSemiLinear_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = getFIdUse().getFQName().generatesEvents();

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = getFIdUse().getFQName().hasInlinableFunctions(fi);

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInlineInFor() {
        ASTNode$State state = state();
        boolean isOkTrivialInlineInFor_value = myFV().size().isUnknown();

        return isOkTrivialInlineInFor_value;
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
        		return myFV().canPropagate();
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldExtractGuard() {
        ASTNode$State state = state();
        boolean shouldExtractGuard_value = false;

        return shouldExtractGuard_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizeExpanded() {
        ASTNode$State state = state();
        boolean scalarizeExpanded_value = duringFunctionInlining() ? isComposite() : refined_Scalarization_FIdUseExp_scalarizeExpanded();

        return scalarizeExpanded_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = super.extractTemp() && isSlice();

        return extractTemp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = 0;

        return order_value;
    }
    /**
     * @attribute syn
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:515
     */
    @ASTNodeAnnotation.Attribute
    public FExp createDerExp(int order) {
        ASTNode$State state = state();
        try {
                FExp exp = getFIdUse().createDerExp(order() + order);
                if (exp instanceof FIdUseExp) {
                    ((FIdUseExp)exp).setOriginalVariable(getOriginalVariable());
                }
                return exp;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDynamicState() {
        ASTNode$State state = state();
        boolean isDynamicState_value = myFV().isDynamicState();

        return isDynamicState_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingAssignedNames() {
        ASTNode$State state = state();
        Set<String> sortingAssignedNames_value = Collections.singleton(name());

        return sortingAssignedNames_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIdentifier(String name) {
        ASTNode$State state = state();
        boolean isIdentifier_String_value = name.equals(name());

        return isIdentifier_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public int nbrUses(String name) {
        ASTNode$State state = state();
        int nbrUses_String_value = name.equals(name())? 1: 0;

        return nbrUses_String_value;
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
                if (!(other instanceof FIdUseExp))
                    return false;
                FIdUseExp o = (FIdUseExp) other;
                return toString().equals(o.toString());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Identifier";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        ASTNode$State state = state();
        String varName_CAD_value = inFunction() ? getFIdUse().varName_CAD() : prettyPrint_C("");

        return varName_CAD_value;
    }
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:119
     */
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        ASTNode$State state = state();
        try {
        		if (inFunction())
        			return getFIdUse().derName_CAD();
        		else if (!shouldBeDifferentiated())
        			return zeroValue_CAD();
        		else
        			return String.format("%s[jmi_get_index_from_value_ref(%d)-jmi->offs_real_dx]", getSeedName(), myFV().valueReference());
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasADStatement_CAD() {
        ASTNode$State state = state();
        boolean hasADStatement_CAD_value = false;

        return hasADStatement_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inlineVar_CAD() {
        ASTNode$State state = state();
        boolean inlineVar_CAD_value = true;

        return inlineVar_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inlineDer_CAD() {
        ASTNode$State state = state();
        boolean inlineDer_CAD_value = true;

        return inlineDer_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean replaceWithTemp(boolean output) {
        ASTNode$State state = state();
        boolean replaceWithTemp_boolean_value = isSlice() || (output && (!inFunction() || alsoInRHS() || type().isString()));

        return replaceWithTemp_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1664
     */
    @ASTNodeAnnotation.Attribute
    public boolean alsoInRHS() {
        ASTNode$State state = state();
        try {
                FAbstractFunctionCall call = myFunctionCall();
                FAbstractVariable var = myFV();
                for (FExp exp : call.childFExps()) {
                    if (exp.isAccess() && exp.asFIdUseExp().myFV() == var) {
                        return true;
                    }
                }
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean extShouldArgConvert(boolean fortran) {
        ASTNode$State state = state();
        boolean extShouldArgConvert_boolean_value = type().isInteger() || type().isBoolean() || type().isEnum() || type().isRecord() ||
                    (fortran && type().isReal() && ndims() > 1);

        return extShouldArgConvert_boolean_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2981
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAlgebraicAccessLocation() {
        ASTNode$State state = state();
        boolean inAlgebraicAccessLocation_value = getParent().Define_inAlgebraicAccessLocation(this, null);

        return inAlgebraicAccessLocation_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:655
     */
    @ASTNodeAnnotation.Attribute
    public boolean accessToModelOK() {
        ASTNode$State state = state();
        boolean accessToModelOK_value = getParent().Define_accessToModelOK(this, null);

        return accessToModelOK_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:828
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInstComponentSize() {
        ASTNode$State state = state();
        boolean isInstComponentSize_value = getParent().Define_isInstComponentSize(this, null);

        return isInstComponentSize_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2016
     */
    @ASTNodeAnnotation.Attribute
    public boolean canInlineConstant() {
        ASTNode$State state = state();
        boolean canInlineConstant_value = getParent().Define_canInlineConstant(this, null);

        return canInlineConstant_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2226
     */
    @ASTNodeAnnotation.Attribute
    public boolean flattenFASContext() {
        ASTNode$State state = state();
        boolean flattenFASContext_value = getParent().Define_flattenFASContext(this, null);

        return flattenFASContext_value;
    }
    /**
     * @attribute inh
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1980
     */
    @ASTNodeAnnotation.Attribute
    public FIdUseExp inlineUsesFunctionCallLeft() {
        ASTNode$State state = state();
        FIdUseExp inlineUsesFunctionCallLeft_value = getParent().Define_inlineUsesFunctionCallLeft(this, null);

        return inlineUsesFunctionCallLeft_value;
    }
    /**
     * @attribute inh
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:86
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldRewriteToDSRef() {
        ASTNode$State state = state();
        boolean shouldRewriteToDSRef_value = getParent().Define_shouldRewriteToDSRef(this, null);

        return shouldRewriteToDSRef_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isInstComponentSize();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return flattenFASContext();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1742
        if (rewriteAlias) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule0();
            state().duringTransformCanonical--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:721
        if (constantFoldingEnabled && type().isString()) {
            state().duringConstantFolding++;
            ASTNode result = rewriteRule1();
            state().duringConstantFolding--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:104
        if (dynamicStateRewriteEnabled && isDynamicState() && shouldRewriteToDSRef()) {
            state().duringDynamicStateSelect++;
            ASTNode result = rewriteRule2();
            state().duringDynamicStateSelect--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1742
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            if (myFV().isFVariable() && myFV().isAlias()) {
                FVariable fv = (FVariable) myFV();
                FIdUseExp new_exp = fv.alias().createUseExp();
                new_exp.setOriginalVariable(this, fv);
                new_exp.rewriteAlias = true;
                if (fv.isNegated()) 
                    return new FNegExp(new_exp);
                else
                    return new_exp;
            }
            FAbstractEquation eqn = myFEquation();
            if (eqn != null && !eqn.potentialAliasEquation()
                    && myFV().derivativeEquivalent() != null
                    && order() == 0 && inEquationSection()
                    && !inWhen() && !inFunctionCallLeft()) {
                FVariable var = myFV().derivativeEquivalent();
                FIdUseExp exp =  var.getMeDifferentiated().createUseExp();
                exp.setOriginalVariable(this, var);
                if (var.isAlias())
                    exp.rewriteAlias = true;
                return exp;
            } else {
                rewriteAlias = false;
                return this;
            }
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:721
     * @apilevel internal
     */
    private FExp rewriteRule1() {
{
			try {
				CValue value = ceval();
				if (!value.size().isEmpty()) 
					return value.buildLiteral();
			} catch (ConstantEvaluationException e) {
				compliance("Could not evaluate string variable " + name());
			}
			constantFoldingEnabled = false;
			return this;
		}    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:104
     * @apilevel internal
     */
    private FDSRefExp rewriteRule2() {
{
            dynamicStateRewriteEnabled = false;
            return new FDSRefExp(myFV().dynamicStateSet().id(), this);
        }    }
    protected void collect_contributors_FAbstractVariable_uses() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2777
     */
            {
                FAbstractVariable ref = (FAbstractVariable) (myFV());
                if (ref != null) {
                    ref.FAbstractVariable_uses_contributors().add(this);
                }
            }
        super.collect_contributors_FAbstractVariable_uses();
    }
    protected void collect_contributors_FFunctionVariable_assigningUses() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2860
     */
        if (isAssignedTo() && myFuncVar() != null) {
            {
                FFunctionVariable ref = (FFunctionVariable) (myFuncVar());
                if (ref != null) {
                    ref.FFunctionVariable_assigningUses_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FFunctionVariable_assigningUses();
    }
    protected void collect_contributors_FAbstractVariable_dependentParameters() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2916
     */
        if (myFV().isParameter()) {
            {
                FAbstractVariable ref = (FAbstractVariable) (myFV());
                if (ref != null) {
                    ref.FAbstractVariable_dependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractVariable_dependentParameters();
    }
    protected void collect_contributors_FAbstractEquation_retrieveInputs() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2942
     */
        if (myFV().isFVariable() && myFV().isInput()) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_retrieveInputs_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_retrieveInputs();
    }
    protected void collect_contributors_FAbstractEquation_algebraicVariables() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2976
     */
        if (isAlgebraicVariableAccess()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_algebraicVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_algebraicVariables();
    }
    protected void collect_contributors_FAbstractEquation_differentiatedRealVariables() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3023
     */
        if (myFV().isDifferentiatedVariable()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_differentiatedRealVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_differentiatedRealVariables();
    }
    protected void collect_contributors_FAbstractEquation_dependentParameters() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3033
     */
        if (myFV().isDependentParameter()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_dependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_dependentParameters();
    }
    protected void collect_contributors_FAbstractEquation_parameters() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3043
     */
        if (myFV().isParameter()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_parameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_parameters();
    }
    protected void collect_contributors_FAbstractEquation_discreteVariables() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3053
     */
        if (myFV().isDiscreteVariable()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_discreteVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_discreteVariables();
    }
    protected void collect_contributors_FAbstractEquation_initialParameters() {
    /**
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3063
     */
        if (myFV().isInitialParameter()) {
            for(Iterator iter = (enclosingEquationsIterator()).iterator(); iter.hasNext(); ) {
                FAbstractEquation ref = (FAbstractEquation) iter.next();
                if (ref != null) {
                    ref.FAbstractEquation_initialParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_initialParameters();
    }
    protected void collect_contributors_FAbstractEquation_collectUses() {
    /**
     * @attribute coll
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3178
     */
        if (!myFV().isUnknown()) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_collectUses_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_collectUses();
    }
    protected void contributeTo_FAbstractVariable_FAbstractVariable_uses(HashSet<FIdUseExp> collection) {
        super.contributeTo_FAbstractVariable_FAbstractVariable_uses(collection);
        collection.add(this);
    }

    protected void contributeTo_FFunctionVariable_FFunctionVariable_assigningUses(HashSet<FIdUseExp> collection) {
        super.contributeTo_FFunctionVariable_FFunctionVariable_assigningUses(collection);
        if (isAssignedTo() && myFuncVar() != null)
            collection.add(this);
    }

    protected void contributeTo_FAbstractVariable_FAbstractVariable_dependentParameters(HashSet<FVariable> collection) {
        super.contributeTo_FAbstractVariable_FAbstractVariable_dependentParameters(collection);
        if (myFV().isParameter())
            collection.addAll(boundParameters());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_retrieveInputs(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_retrieveInputs(collection);
        if (myFV().isFVariable() && myFV().isInput())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_algebraicVariables(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_algebraicVariables(collection);
        if (isAlgebraicVariableAccess())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_differentiatedRealVariables(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_differentiatedRealVariables(collection);
        if (myFV().isDifferentiatedVariable())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_dependentParameters(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_dependentParameters(collection);
        if (myFV().isDependentParameter())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_parameters(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_parameters(collection);
        if (myFV().isParameter())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_discreteVariables(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_discreteVariables(collection);
        if (myFV().isDiscreteVariable())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_initialParameters(LinkedHashSet<FVariable> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_initialParameters(collection);
        if (myFV().isInitialParameter())
            collection.add((FVariable) myFV());
    }

    protected void contributeTo_FAbstractEquation_FAbstractEquation_collectUses(Set<FIdUseExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_collectUses(collection);
        if (!myFV().isUnknown())
            collection.add(this);
    }

}
