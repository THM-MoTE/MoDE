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
 * A flattened function call statement.
 * 
 * This covers function calls with no used return value or when using 
 * the syntax <code>(vars) := function(args);</code>. Function calls using 
 * exactly one return value are handled by FAssignStmt through FAbstractFunctionCall. 
 * (FAbstractFunctionCall inherits FExp, since it can be used in expressions).
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:730
 * @production FFunctionCallStmt : {@link FStatement} ::= <span class="component">Left:{@link FFunctionCallLeft}*</span> <span class="component">Call:{@link FAbstractFunctionCall}</span>;

 */
public class FFunctionCallStmt extends FStatement implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4236
     */
    @Override
  public int evaluate(AlgorithmEvaluator evaluator) {
	  CValue[] vals = getCall().evaluate(evaluator);
	  for (int i = 0, n = getNumLeft(); i < n; i++)
		  getLeft(i).assignToInFuncEval(evaluator, vals[i]);
	  return EVAL_CONT;
  }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1878
     */
    public void defSet(Set<FVariable> fvSet, Set<FVariable> fvUse) {
        defSetAdd(fvSet, fvUse, lookupFVariablesInSet(getCall().findFIdUseExpsInTree()));
        for (FFunctionCallLeft left : getLefts())
            if (left.hasFExp())
                defSetAdd(fvUse, fvSet, lookupFVariablesInSet(left.getFExp().findFIdUseExpsInTree()));
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1372
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		if (getNumLeft() > 0) {
			str.print("(");
			getLefts().prettyPrintWithSep(p, str, indent, ", ");
			str.print(") := ");
		}
		p.print(getCall(), str, indent);
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:297
     */
    public void updateVariabilityForVariablesInWhen(boolean inWhen) {
        if (inWhen) {
            for (FFunctionCallLeft left : getLefts()) {
                if (left.hasFExp()) {
                    left.getFExp().makeContinuousVariablesDiscrete();
                }
            }
        }
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:72
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        List<FFunctionCallLeft> l = new List<FFunctionCallLeft>();
        for (FFunctionCallLeft a : getLefts())
            l.add(a.flatten(prefix));
        sl.add(new FFunctionCallStmt(l, (FAbstractFunctionCall) getCall().flatten(prefix)));
        return false;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1323
     */
    public void inline(AbstractFunctionInliner fi) {
        // Temporarily replace lefts with scalarized versions
        Map<String,FExp> empty = Collections.emptyMap();
        List<FFunctionCallLeft> oldLefts = getLefts();
        List<FFunctionCallLeft> newLefts = new List<FFunctionCallLeft>();
        for (FFunctionCallLeft left : oldLefts)
            newLefts.add(left.scalarize(empty));
        setLeftList(newLefts);
        newLefts.clearScalarized();
        
        // Scalarize and replace references
        FExp call = getCall().scalarizeExp(empty);
        call = getCall().dynamicFExp(call);
        call.clearScalarized();
        call = call.replaceReferences(fi);
        
        fi.addVarsAndFCEqn(getLefts(), (FAbstractFunctionCall) call);
        
        // Restore old left list
        setLeftList(oldLefts);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1400
     */
    public void inlinePrepare(AbstractFunctionInliner fi, List<FStatement> stmts) {
        if (!getCall().isIgnored())
            stmts.add(fullCopy());
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:664
     */
    public void enableConstantFolding() {
        for (FExp childExp : getCall().childFExps()) {
            childExp.enableConstantFolding();
        }
    }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:64
     */
    @Override
    public void scalarize(Scalarizer.Algorithm s) {
        FFunctionCallStmt stmt = new FFunctionCallStmt();
        getCall().createArrayTemporaries(s);
        getLefts().createArrayTemporaries(s);
        s.add(stmt);
        s.setWriteBack(true);
        getLefts().createArrayTemporaries(s);
        s.setWriteBack(false);
        for (FFunctionCallLeft left : getLefts()) {
            stmt.addLeft(left.scalarize(s.map()));
        }
        stmt.setCall((FAbstractFunctionCall) getCall().scalarizeExp(s.map()));
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:907
     */
    @Override
    public void diff(List<FStatement> diffed) {
        if (order() == myFAlgorithm().order() && shouldBeDifferentiated()) {
            List<FFunctionCallLeft> lefts = new List<FFunctionCallLeft>();
            for (FFunctionCallLeft l : getLefts()) {
                Opt<FExp> lopt = l.hasFExp() ? new Opt<FExp>(l.getFExp().diff("time")) : new Opt<FExp>();
                lefts.add(new FFunctionCallLeft(lopt));
            }
            FExp diffedCall = getCall().diff("time");
            diffed.add(new FDerivativeFunctionCallStmt(lefts, (FAbstractFunctionCall) diffedCall, order() + 1));
        }
        diffed.add(fullCopy());
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:428
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		if (!getCall().isIgnored()) {
			FFunctionCall call = (FFunctionCall)this.getCall();
			String tag = this.xmlTag();
			String namespace = "fun";
			
			str.println(indent + "<" + namespace + ":" + tag  + ">");
			
			for (FFunctionCallLeft f : this.getLeftList()){
				
				str.println(indent + "\t<" + namespace + ":OutputArgument>");
				
				if(!f.hasFExp()){
					str.println(indent + "\t\t<" + namespace + ":EmptyOutputArgument/>");
				}else{
					f.getFExp().prettyPrint_XML(str,p.indent(indent+"\t"));
				}
				
				str.println(indent + "\t</" + namespace + ":OutputArgument>");
			}
			
			call.prettyPrint_XML(str,p.indent(indent+"\t"));
		
			str.println(indent + "</" + namespace + ":" + tag  + ">");
		}
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2107
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		if (!getCall().isIgnored())
			genTempVars_CAD(p, str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1789
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		if (!getCall().isIgnored()) {
			p.printPreSteps(this, str, indent);
			p.print(getCall(), str, indent);
			for (FFunctionCallLeft l : getLefts()) {
				l.genWriteBackAssignment_C(str, indent, null);
			}
            p.printPostSteps(this, str, indent);
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionCallStmt() {
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
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FFunctionCallStmt(List<FFunctionCallLeft> p0, FAbstractFunctionCall p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
        sortingAssignedNames_reset();
        sortingDependencies_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:48
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public FFunctionCallStmt clone() throws CloneNotSupportedException {
        FFunctionCallStmt node = (FFunctionCallStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public FFunctionCallStmt copy() {
        try {
            FFunctionCallStmt node = (FFunctionCallStmt) clone();
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
     * @declaredat ASTNode:80
     */
    public FFunctionCallStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public FFunctionCallStmt treeCopyNoTransform() {
        FFunctionCallStmt tree = (FFunctionCallStmt) copy();
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
     * @declaredat ASTNode:109
     */
    public FFunctionCallStmt treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:116
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Left list.
     * @param list The new list node to be used as the Left list.
     * @apilevel high-level
     */
    public void setLeftList(List<FFunctionCallLeft> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Left list.
     * @return Number of children in the Left list.
     * @apilevel high-level
     */
    public int getNumLeft() {
        return getLeftList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Left list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Left list.
     * @apilevel low-level
     */
    public int getNumLeftNoTransform() {
        return getLeftListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Left list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Left list.
     * @apilevel high-level
     */
    public FFunctionCallLeft getLeft(int i) {
        return (FFunctionCallLeft) getLeftList().getChild(i);
    }
    /**
     * Check whether the Left list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasLeft() {
        return getLeftList().getNumChild() != 0;
    }
    /**
     * Append an element to the Left list.
     * @param node The element to append to the Left list.
     * @apilevel high-level
     */
    public void addLeft(FFunctionCallLeft node) {
        List<FFunctionCallLeft> list = (parent == null || state == null) ? getLeftListNoTransform() : getLeftList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addLeftNoTransform(FFunctionCallLeft node) {
        List<FFunctionCallLeft> list = getLeftListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Left list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setLeft(FFunctionCallLeft node, int i) {
        List<FFunctionCallLeft> list = getLeftList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Left list.
     * @return The node representing the Left list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Left")
    public List<FFunctionCallLeft> getLeftList() {
        List<FFunctionCallLeft> list = (List<FFunctionCallLeft>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Left list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Left list.
     * @apilevel low-level
     */
    public List<FFunctionCallLeft> getLeftListNoTransform() {
        return (List<FFunctionCallLeft>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Left list.
     * @return The node representing the Left list.
     * @apilevel high-level
     */
    public List<FFunctionCallLeft> getLefts() {
        return getLeftList();
    }
    /**
     * Retrieves the Left list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Left list.
     * @apilevel low-level
     */
    public List<FFunctionCallLeft> getLeftsNoTransform() {
        return getLeftListNoTransform();
    }
    /**
     * Replaces the Call child.
     * @param node The new node to replace the Call child.
     * @apilevel high-level
     */
    public void setCall(FAbstractFunctionCall node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Call child.
     * @return The current node used as the Call child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Call")
    public FAbstractFunctionCall getCall() {
        return (FAbstractFunctionCall) getChild(1);
    }
    /**
     * Retrieves the Call child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Call child.
     * @apilevel low-level
     */
    public FAbstractFunctionCall getCallNoTransform() {
        return (FAbstractFunctionCall) getChildNoTransform(1);
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
        type_value = getCall().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInline() {
        ASTNode$State state = state();
        boolean isOkTrivialInline_value = getCall().isOkTrivialInline();

        return isOkTrivialInline_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable() {
        ASTNode$State state = state();
        boolean isInlinable_value = getCall().isIgnored() || !insideBranchedStmt();

        return isInlinable_value;
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = 0;

        return order_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sortingAssignedNames_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingAssignedNames_value;
    /**
     * @apilevel internal
     */
    private void sortingAssignedNames_reset() {
        sortingAssignedNames_computed = false;
        sortingAssignedNames_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingAssignedNames() {
        if(sortingAssignedNames_computed) {
            return sortingAssignedNames_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingAssignedNames_value = sortingAssignedNames_compute();
        if (isFinal && num == state().boundariesCrossed) {
            sortingAssignedNames_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingAssignedNames_value;
    }
    /**
     * @apilevel internal
     */
    private Set<String> sortingAssignedNames_compute() {
            Set<String> res = new LinkedHashSet<String>(getNumLeft());
            for (FFunctionCallLeft left : getLefts())
                left.sortingAddNamesUsed(res);
            return res;
        }
    /**
     * @apilevel internal
     */
    protected boolean sortingDependencies_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<String> sortingDependencies_value;
    /**
     * @apilevel internal
     */
    private void sortingDependencies_reset() {
        sortingDependencies_computed = false;
        sortingDependencies_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingDependencies() {
        if(sortingDependencies_computed) {
            return sortingDependencies_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sortingDependencies_value = getCall().sortingAddNamesUsed(baseSortingDependencies());
        if (isFinal && num == state().boundariesCrossed) {
            sortingDependencies_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingDependencies_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "FunctionCallStatement";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:964
     * @apilevel internal
     */
    public Size Define_size(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().sizeOfOutput(i);
        }
        else {
            return getParent().Define_size(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2876
     * @apilevel internal
     */
    public boolean Define_isAssignedTo(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_isAssignedTo(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1493
     * @apilevel internal
     */
    public String Define_funcName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getCall().name();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1662
     * @apilevel internal
     */
    public boolean Define_isFunctionCallClause(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return true;
        }
        else {
            return super.Define_isFunctionCallClause(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1685
     * @apilevel internal
     */
    public int Define_prevIndex(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (i == 0) ? -1 : getLeft(i - 1).myLastIndex();
        }
        else {
            return getParent().Define_prevIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1716
     * @apilevel internal
     */
    public InstComponentDecl Define_myOutput(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().findOutput(i);
        }
        else {
            return getParent().Define_myOutput(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return false;
        }
        else {
            return getParent().Define_functionCallIsExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        if (caller == getCallNoTransform()) {
            return getLefts().toArrayList();
        }
        else {
            return getParent().Define_myLefts(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1738
     * @apilevel internal
     */
    public FAbstractFunctionCall Define_myFunctionCall(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getCall();
        }
        else {
            return getParent().Define_myFunctionCall(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2364
     * @apilevel internal
     */
    public FType Define_type(ASTNode caller, ASTNode child) {
        if (caller == getLeftListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getCall().typeOfOutput(i);
        }
        else {
            return getParent().Define_type(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1147
     * @apilevel internal
     */
    public String Define_functionCallDecription(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getCall().functionCallDecription();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
