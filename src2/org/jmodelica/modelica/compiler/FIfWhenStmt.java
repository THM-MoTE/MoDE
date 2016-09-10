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
 * Base class for flattened if and when statements.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:761
 * @production FIfWhenStmt : {@link FStatement} ::= <span class="component">{@link FIfWhenClause}*</span>;

 */
public abstract class FIfWhenStmt extends FStatement implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4254
     */
    @Override
    public int evaluate(AlgorithmEvaluator evaluator) {
        evaluator.startIf();
        int res = getFIfWhenClauses().evaluateList(evaluator);
        if (res == EVAL_CONT) {
            res = evaluateElse(evaluator);
            evaluator.branchIf(res);
        }
        evaluator.endIf();
        return res & EVAL_MASK;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4266
     */
    public int evaluateElse(AlgorithmEvaluator evaluator) {
	  return EVAL_CONT;
  }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1396
     */
    public abstract FIfWhenStmt createEmptyNode();
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1389
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		getFIfWhenClauses().prettyPrintWithSep(p, str, indent, indent + "else");
		prettyPrintElse(p, str, indent);
		str.print(indent);
		str.print("end ");
		str.print(getKeyword());
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1397
     */
    protected void prettyPrintElse(Printer p, CodeStream str, String indent) {}
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:80
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        boolean res = false;
        boolean hasBroken = false;
        List l = new List();
        for (FIfWhenClause c : getFIfWhenClauses()) {
            hasBroken = c.flatten(l, fc, prefix) || hasBroken;
        }
        sl.add(flattenFIfWhenStmt(fc, prefix, l));
        return hasBroken;
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:91
     */
    protected abstract FIfWhenStmt flattenFIfWhenStmt(FClass fc,
        FQName prefix, List l);
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:79
     */
    @Override
    public void scalarize(Scalarizer.Algorithm s) {
        for (FIfWhenClause cl : getFIfWhenClauses()) {
            cl.getTest().createArrayTemporaries(s);
        }
        FIfWhenStmt stmt = createEmptyNode();
        for (FIfWhenClause cl : getFIfWhenClauses()) {
            cl.scalarize(s, stmt.getFIfWhenClauses());
        }
        scalarizeElse(s, stmt);
        s.add(stmt);
    }
    /**
     * Scalarize the else part of an if statement. Does nothing for when statements.
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:95
     */
    public void scalarizeElse(Scalarizer.Algorithm s, FIfWhenStmt stmt) { 
        
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:930
     */
    @Override
    public void diff(List<FStatement> diffed) {
        List<FIfWhenClause> clauses = new List<FIfWhenClause>();
        for (FIfWhenClause clause : getFIfWhenClauses())
            clauses.add(clause.diff());
        diffed.add(createDifferentiated(clauses));
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2054
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		for (FIfWhenClause clause : getFIfWhenClauses())
			clause.getTest().genTempVars_CAD(p, str, indent);
		str.print(indent);
		getFIfWhenClauses().prettyPrintWithSep(p, str, indent, indent + "} else ");
		prettyPrintElse_C(p, str, indent);
		str.print(indent);
		str.print("}\n");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1852
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		for (FIfWhenClause clause : getFIfWhenClauses())
			p.printPreSteps(clause.getTest(), str, indent);
		str.print(indent);
		getFIfWhenClauses().prettyPrintWithSep(p, str, indent, indent + "} else ");
		prettyPrintElse_C(p, str, indent);
		str.print(indent);
		str.print("}\n");
        for (FIfWhenClause clause : getFIfWhenClauses())
            p.printPostSteps(clause.getTest(), str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1865
     */
    protected void prettyPrintElse_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * @declaredat ASTNode:1
     */
    public FIfWhenStmt() {
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
    public FIfWhenStmt(List<FIfWhenClause> p0) {
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
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:44
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public FIfWhenStmt clone() throws CloneNotSupportedException {
        FIfWhenStmt node = (FIfWhenStmt) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:61
     */
    public abstract FIfWhenStmt fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:68
     */
    public abstract FIfWhenStmt treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:76
     */
    public abstract FIfWhenStmt treeCopy();
    /**
     * Replaces the FIfWhenClause list.
     * @param list The new list node to be used as the FIfWhenClause list.
     * @apilevel high-level
     */
    public void setFIfWhenClauseList(List<FIfWhenClause> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the FIfWhenClause list.
     * @return Number of children in the FIfWhenClause list.
     * @apilevel high-level
     */
    public int getNumFIfWhenClause() {
        return getFIfWhenClauseList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FIfWhenClause list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FIfWhenClause list.
     * @apilevel low-level
     */
    public int getNumFIfWhenClauseNoTransform() {
        return getFIfWhenClauseListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FIfWhenClause list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FIfWhenClause list.
     * @apilevel high-level
     */
    public FIfWhenClause getFIfWhenClause(int i) {
        return (FIfWhenClause) getFIfWhenClauseList().getChild(i);
    }
    /**
     * Check whether the FIfWhenClause list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFIfWhenClause() {
        return getFIfWhenClauseList().getNumChild() != 0;
    }
    /**
     * Append an element to the FIfWhenClause list.
     * @param node The element to append to the FIfWhenClause list.
     * @apilevel high-level
     */
    public void addFIfWhenClause(FIfWhenClause node) {
        List<FIfWhenClause> list = (parent == null || state == null) ? getFIfWhenClauseListNoTransform() : getFIfWhenClauseList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFIfWhenClauseNoTransform(FIfWhenClause node) {
        List<FIfWhenClause> list = getFIfWhenClauseListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FIfWhenClause list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFIfWhenClause(FIfWhenClause node, int i) {
        List<FIfWhenClause> list = getFIfWhenClauseList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FIfWhenClause list.
     * @return The node representing the FIfWhenClause list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FIfWhenClause")
    public List<FIfWhenClause> getFIfWhenClauseList() {
        List<FIfWhenClause> list = (List<FIfWhenClause>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FIfWhenClause list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FIfWhenClause list.
     * @apilevel low-level
     */
    public List<FIfWhenClause> getFIfWhenClauseListNoTransform() {
        return (List<FIfWhenClause>) getChildNoTransform(0);
    }
    /**
     * Retrieves the FIfWhenClause list.
     * @return The node representing the FIfWhenClause list.
     * @apilevel high-level
     */
    public List<FIfWhenClause> getFIfWhenClauses() {
        return getFIfWhenClauseList();
    }
    /**
     * Retrieves the FIfWhenClause list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FIfWhenClause list.
     * @apilevel low-level
     */
    public List<FIfWhenClause> getFIfWhenClausesNoTransform() {
        return getFIfWhenClauseListNoTransform();
    }
    /**
     * @attribute syn
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:921
     */
    @ASTNodeAnnotation.Attribute
    public abstract FIfWhenStmt createDifferentiated(List<FIfWhenClause> differentiatedClauses);
    @ASTNodeAnnotation.Attribute
    public String getKeyword() {
        ASTNode$State state = state();
        String getKeyword_value = null;

        return getKeyword_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1667
     * @apilevel internal
     */
    public boolean Define_insideBlockStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1675
     * @apilevel internal
     */
    public boolean Define_insideBranchedStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1418
     * @apilevel internal
     */
    public String Define_getKeyword(ASTNode caller, ASTNode child) {
        if (caller == getFIfWhenClauseListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getKeyword();
        }
        else {
            return getParent().Define_getKeyword(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
