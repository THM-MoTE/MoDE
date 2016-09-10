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
 * One of the left hand side variables in a function call equation. 
 * 
 * Needed because it is allowed to leave places in the variable list empty.
 * Example: (x, , z) = func(a, b);
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:599
 * @production FFunctionCallLeft : {@link BaseNode} ::= <span class="component">[{@link FExp}]</span>;

 */
public class FFunctionCallLeft extends BaseNode implements Cloneable {
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param evaluator the evaluator used to evaluate the algorithm
     * @param right     the CValue to assign
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3988
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue val) {
        if (hasFExp()) {
            getFExp().assignToInFuncEval(evaluator, val);
        }
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1184
     */
    public Iterable<FExp> flatChildFExps() {
        ArrayList<FExp> res = new ArrayList<FExp>();
        getFExp().flatChildFExps(res);
        return res;
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1122
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (hasFExp() && !myOutput().isUnknown() && !type().isUnknown()) { // Avoid duplicate error
            if (getFExp() instanceof FIdUseExp) {  // Should never be false - add check? 
                FIdUse use = getFExp().asFIdUse();
                FType useType = use.type();
                FType outType = type();
                if (use.isForIndex()) {
                    error("Can not assign a value to a for loop index");
                } else if (outType.size().isUnknown() && !inFunction()) {
                    error(functionCallDecription() + ": could not evaluate array size of output " + 
                            myOutput().name());
                } else if (!useType.typeCompatible(outType, true)) {
                    if (useType.typeCompatibleExceptLengths(outType)) {
                        if (!lockBranch(checkType))
                            errorUnlessDisabled("%s: component %s is of size %s and output %s is of size %s - they are not compatible", 
                                    functionCallDecription(), use.name(), useType.size(), myOutput().name(), outType.size());
                    } else {
                        error("%s: component %s is of type %s and output %s is of type %s - they are not compatible", 
                                functionCallDecription(), use.name(), useType, myOutput().name(), outType);
                    }
                }
            }
        }
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:123
     */
    public FFunctionCallLeft flatten(FQName prefix) {
        return new FFunctionCallLeft(hasFExp() ? new Opt(getFExp().flatten(prefix)) : new Opt());
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2231
     */
    public void insertTempsInLHS(FClass fClass, boolean param) {
        if (hasFExp()) {
            getFExp().insertTempsInLHS(fClass, param);
        }
    }
    /**
     * Merge copies of FExps found in <code>other</code> into their respective position in <code>this</code>.
     * Add equation to <code>m</code> in case of collision.
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:172
     */
    public void merge(FClass.commonSubexpressionEliminationIfSet.CSESet m, FExp other) {
        if (hasFExp()) {
            setFExp(getFExp().merge(m, other));
        } else {
            setFExp(other.fullCopy());
        }
    }
    /**
     * Create temporary variable(s) for this access when inlining a function call that 
     * it is a left of, and return an access.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:530
     */
    public FExp createInlineVars(
            AbstractFunctionInliner fi, FExp bExp, FTypePrefixVariability variability) {
        return hasFExp() ? getFExp().createInlineVars(fi, bExp, variability) : null;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:23
     */
    public boolean taggedByVProp = false;
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:48
     */
    public void cleanEquations() {
        if (taggedByVProp) {
            setFExpOpt(new Opt());
            taggedByVProp = false;
        } else if (hasFExp()){
            setFExpOpt(new Opt(getFExp().cleanEquations()));
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1297
     */
    public FFunctionCallLeft scalarize(Map<String,FExp> indexMap) {
		return new FFunctionCallLeft(hasFExp() ? new Opt(getFExp().scalarize(indexMap)) : new Opt());
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:291
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		open_XML(str, indent);
		if (hasFExp())
			p.print(getFExp(), str, p.indent(indent));
		else
			single_XML(str, p.indent(indent), "EmptyOutputArgument");
		close_XML(str, indent);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1213
     */
    private int equationIndex = -1;
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1214
     */
    public void setBaseIndex(int i) {
        equationIndex = i + myIndex();
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1217
     */
    public void setEquationIndex(int i) {
        equationIndex = i;
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1293
     */
    public void genWriteBackAssignment_CAD(CodeStream str, String indent, Collection<FVariable> forVariables){
        if (hasFExp()) {
            printer_CAD.printWriteBackAssignment(str, indent, this, forVariables);
        }
    }
    /**
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1518
     */
    @Override
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {
        if (hasFExp())
            getFExp().genTempOutputs_CAD(p, str, indent);
    }
    /**
     * Generates variable declarations for the left hand side in a function call. 
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * TODO: Declare in genTempForFunc instead.
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1585
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        if (hasFExp()) {
            getFExp().genTempIODecls_CAD(p, str, indent, true);
        }
    }
    /**
     * Used when function calls are printed. It is used to  generate outputs for the function call and the  
     * arguments are written as references to be filled (if they are not arrays or records). 
     * If it does not contain any expression print NULL (for the case: (x,,y) = f(<ins>). 
     * 
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1913
     */
    public void genArgument_var_CAD(CodeStream str) {
        if (hasFExp()) {
            if (!getFExp().isComposite())
                str.print("&");
            str.print(varName_CAD());
        } else {
            str.print("NULL");
        }
    }
    /**
     * Used when function calls are printed. It is used to generate derivative outputs for the function call and the  
     * arguments are written as references to be filled (if they are not arrays or records). 
     * If it does not contain any expression print NULL (for the case: (x,,y) = f(<ins>). 
     * 
     * @param str  the c-code is written to this stream 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1930
     */
    public void genArgument_der_CAD(CodeStream str) {
        if (hasFExp()) {
            if (!getFExp().isComposite())
                str.print("&");
            str.print(derName_CAD());
        } else {
            str.print("NULL");
        }
    }
    /**
     * Used when generating the residual for a FFunctionCallEquation. The equationindex
     * determines which entry in the residual, res[], and directional derivative, dF[], that
     * the expressions contained in this FFunctionCallLeft fills. 
     * 
     * @param str  the c-code is written to this stream
     * @param indent  used to get a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2011
     */
    public void genWriteBack_CAD(CodeStream str, String indent, Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
        if (hasFExp()) {
            if (getFExp().type().shouldBeDifferentiated()) {
                printer_CAD.printWriteBackResidual(str, indent, this, enumerator, forIndices, indexCounter);
            } else {
                printer_C.printWriteBackResidual(str, indent, this, enumerator, forIndices, indexCounter);
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1638
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp()) {
            type().printDecl_C(p, str, indent, name_C(), getFExp());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1645
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp()) {
            type().printInit_C(p, str, indent, getFExp().tempName_C(), getFExp());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1652
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        if (replaceWithTemp()) {
            type().printFree_C(str, indent, false, getFExp().tempName_C());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3809
     */
    public void genArgument_C(CodeStream str) {
		if (hasFExp()) {
			if (!getFExp().isComposite())
				str.print("&");
			str.print(name_C());
		} else {
			str.print("NULL");
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3850
     */
    public void genWriteBackAssignment_C(CodeStream str, String indent, Collection<FVariable> forVariables) {
        if (replaceWithTemp()) {
            printer_C.printWriteBackAssignment(str, indent, this, forVariables);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3887
     */
    public void genWriteBackResidual_C(CodeStream str, String indent, Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
        if (hasFExp()) 
            printer_C.printWriteBackResidual(str, indent, this, enumerator, forIndices, indexCounter);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionCallLeft() {
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
        setChild(new Opt(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FFunctionCallLeft(Opt<FExp> p0) {
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
        myIndex_reset();
        myOutput_reset();
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
    public FFunctionCallLeft clone() throws CloneNotSupportedException {
        FFunctionCallLeft node = (FFunctionCallLeft) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FFunctionCallLeft copy() {
        try {
            FFunctionCallLeft node = (FFunctionCallLeft) clone();
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
     * @declaredat ASTNode:78
     */
    public FFunctionCallLeft fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FFunctionCallLeft treeCopyNoTransform() {
        FFunctionCallLeft tree = (FFunctionCallLeft) copy();
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
     * @declaredat ASTNode:107
     */
    public FFunctionCallLeft treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:114
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the FExp child. This is the <code>Opt</code>
     * node containing the child FExp, not the actual child!
     * @param opt The new node to be used as the optional node for the FExp child.
     * @apilevel low-level
     */
    public void setFExpOpt(Opt<FExp> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FExp child.
     * @param node The new node to be used as the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        getFExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FExp child exists.
     * @return {@code true} if the optional FExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFExp() {
        return getFExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FExp child.
     * @return The FExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getFExp() {
        return (FExp) getFExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FExp child. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * @return The optional node for child the FExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FExp")
    public Opt<FExp> getFExpOpt() {
        return (Opt<FExp>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FExp. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FExp.
     * @apilevel low-level
     */
    public Opt<FExp> getFExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(0);
    }
    @ASTNodeAnnotation.Attribute
    public CValue extractCValue(CValue val, FVariable fv) {
        ASTNode$State state = state();
        CValue extractCValue_CValue_FVariable_value = hasFExp() ? getFExp().extractCValue(val, fv) : null;

        return extractCValue_CValue_FVariable_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1171
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarElements() {
        ASTNode$State state = state();
        try {
                int res = 0;
                if (hasFExp()) {
                    for (FExp exp : flatChildFExps()) {
                        res += exp.numScalarElements();
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean myIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int myIndex_value;
    /**
     * @apilevel internal
     */
    private void myIndex_reset() {
        myIndex_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int myIndex() {
        if(myIndex_computed) {
            return myIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myIndex_value = prevIndex() + (hasFExp() ? 1 : 0);
        if (isFinal && num == state().boundariesCrossed) {
            myIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int myLastIndex() {
        ASTNode$State state = state();
        int myLastIndex_value = myIndex() + (hasFExp() ? numScalarVars() - 1 : 0);

        return myLastIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarVars() {
        ASTNode$State state = state();
        int numScalarVars_value = (hasFExp() ? getFExp().numScalarVars() : 0);

        return numScalarVars_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = hasFExp() ? getFExp().shouldBeDifferentiated() : false;

        return shouldBeDifferentiated_value;
    }
    /**
     * @attribute syn
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:59
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAssert> sizeAsserts() {
        ASTNode$State state = state();
        try {
                ArrayList<FAssert> a = new ArrayList<FAssert>();
                if (hasFExp()) {
                    Size fs = getFExp().myFunctionCall().typeOfOutput(getParent().getIndexOfChild(this)).size();
                    fs.sizeAsserts(a, getFExp().size(), getFExp());
                    getFExp().size().sizeAsserts(a, fs, getFExp());
                }
                return a;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "OutputArgument";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = parentXmlNamespace();

        return xmlNamespace_value;
    }
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1892
     */
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        ASTNode$State state = state();
        try {
                if (replaceWithTemp()) {
                    return getFExp().tempName_var_CAD();
                }
                return ((FIdUseExp) getFExp()).getFIdUse().varName_CAD();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1899
     */
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        ASTNode$State state = state();
        try {
                if (replaceWithTemp()) {
                    return getFExp().tempName_der_CAD();
                }
                return ((FIdUseExp) getFExp()).getFIdUse().derName_CAD();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String type_C() {
        ASTNode$State state = state();
        String type_C_value = type().type_C();

        return type_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean replaceWithTemp() {
        ASTNode$State state = state();
        boolean replaceWithTemp_value = hasFExp() && getFExp().replaceWithTemp(true);

        return replaceWithTemp_value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3801
     */
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        ASTNode$State state = state();
        try {
                if (replaceWithTemp()) {
                    return getFExp().tempName_C();
                } else {
                    return ((FIdUseExp) getFExp()).getFIdUse().name_C();
                }
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:964
     */
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = getParent().Define_size(this, null);

        return size_value;
    }
    /**
     * @attribute inh
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2877
     */
    @ASTNodeAnnotation.Attribute
    public boolean isAssignedTo() {
        ASTNode$State state = state();
        boolean isAssignedTo_value = getParent().Define_isAssignedTo(this, null);

        return isAssignedTo_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1494
     */
    @ASTNodeAnnotation.Attribute
    public String funcName() {
        ASTNode$State state = state();
        String funcName_value = getParent().Define_funcName(this, null);

        return funcName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1607
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1685
     */
    @ASTNodeAnnotation.Attribute
    public int prevIndex() {
        ASTNode$State state = state();
        int prevIndex_value = getParent().Define_prevIndex(this, null);

        return prevIndex_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1716
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myOutput() {
        if(myOutput_computed) {
            return myOutput_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myOutput_value = getParent().Define_myOutput(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myOutput_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myOutput_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myOutput_computed = false;
    /**
     * @apilevel internal
     */
    protected InstComponentDecl myOutput_value;
    /**
     * @apilevel internal
     */
    private void myOutput_reset() {
        myOutput_computed = false;
        myOutput_value = null;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:576
     */
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        FType type_value = getParent().Define_type(this, null);

        return type_value;
    }
    /**
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:422
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockBranch(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean lockBranch_ErrorCheckType_value = getParent().Define_lockBranch(this, null, checkType);

        return lockBranch_ErrorCheckType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1148
     */
    @ASTNodeAnnotation.Attribute
    public String functionCallDecription() {
        ASTNode$State state = state();
        String functionCallDecription_value = getParent().Define_functionCallDecription(this, null);

        return functionCallDecription_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1760
     */
    @ASTNodeAnnotation.Attribute
    public boolean duringFunctionInlining() {
        ASTNode$State state = state();
        boolean duringFunctionInlining_value = getParent().Define_duringFunctionInlining(this, null);

        return duringFunctionInlining_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2817
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeft(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2822
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeftTop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2866
     * @apilevel internal
     */
    public boolean Define_isLeftHandSide(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2876
     * @apilevel internal
     */
    public boolean Define_isAssignedTo(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return isAssignedTo();
        }
        else {
            return super.Define_isAssignedTo(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_useIsAssignment(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return false;
        }
        else {
            return super.Define_canInlineConstant(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return !inFunction() || getFExp().isSlice();
        }
        else {
            return super.Define_flattenFASContext(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:75
     * @apilevel internal
     */
    public boolean Define_isFunctionCallIO(ASTNode caller, ASTNode child) {
        if (caller == getFExpOptNoTransform()) {
            return true;
        }
        else {
            return super.Define_isFunctionCallIO(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:519
     * @apilevel internal
     */
    public boolean Define_isAssignUse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FStatement_sizeAssertsColl() {
    /**
     * @attribute coll
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:42
     */
        if (hasFExp()) {
            {
                FStatement ref = (FStatement) (getFExp().myFStatement());
                if (ref != null) {
                    ref.FStatement_sizeAssertsColl_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FStatement_sizeAssertsColl();
    }
    protected void contributeTo_FStatement_FStatement_sizeAssertsColl(ArrayList<FAssert> collection) {
        super.contributeTo_FStatement_FStatement_sizeAssertsColl(collection);
        if (hasFExp())
            collection.addAll(sizeAsserts());
    }

}
