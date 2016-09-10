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
 * Base class for flattened [else]if and [else]when clauses in if/when statements.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:777
 * @production FIfWhenClause : {@link BaseNode} ::= <span class="component">Test:{@link FExp}</span> <span class="component">{@link FStatement}*</span>;

 */
public abstract class FIfWhenClause extends BaseNode implements Cloneable, FunctionEvalNode {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4275
     */
    @Override
    public int evaluate(AlgorithmEvaluator evaluator) {
        CValue test = getTest().ceval(evaluator);
        boolean unknown = test.isPartlyUnknown();
        if (unknown || test.reduceBooleanOr()) {
            int res = getFStatements().evaluateList(evaluator);
            evaluator.branchIf(res);
            if (!unknown) {
                return res | FStatement.EVAL_IFHIT;
            }
        }
        return FStatement.EVAL_CONT;
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1387
     */
    public abstract FIfWhenClause createEmptyNode();
    /**
     * Create new node of same class as this, with the specified 
     * children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1434
     */
    public FIfWhenClause createNode(FExp test, List<FStatement> stmts) {
		FIfWhenClause node = createEmptyNode();
		node.setTest(test);
		node.setFStatementList(stmts);
		return node;
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1407
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(getKeyword());
		str.print(" ");
		p.print(getTest(), str, indent);
		str.print(" then\n");
		getFStatements().prettyPrintWithIndent(p, str, p.indent(indent), ";");
	}
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:51
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        if (!getTest().variability().parameterOrLess())
            ONLY_FMU_IF_STATEMENTS.invoke(this);
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:104
     */
    public boolean flatten(List cl, FClass fc, FQName prefix) {
        List l = new List();
        FExp t = getTest().flatten(prefix);
        boolean res = FStatement.flattenFStatementList(getFStatements(), l, fc, prefix);
        cl.add(flattenFIfWhenClause(t, l));
        return res;
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:112
     */
    protected abstract FIfWhenClause flattenFIfWhenClause(FExp t, List l);
    /**
     * Create a list of assign statements with if-else expressions that is the 
     * equivalent of two branches of an if-else statement.
     * 
     * @param fi         the function inliner to use
     * @param elseStmts  the else branch to combine
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1454
     */
    protected List<FStatement> inlineCombineBranches(
            AbstractFunctionInliner fi, List<FStatement> elseStmts) {
        // Prepare contents
        List<FStatement> oldStmts = getFStatements();
        List<FStatement> newStmts = new List<FStatement>();
        for (FStatement stmt : oldStmts)
            stmt.inlinePrepare(fi, newStmts);
        setFStatementList((List) newStmts);
        
        // First inefficient implementation
        List<FStatement> stmts = new List<FStatement>();
        for (FStatement stmt : newStmts)
            stmts.add(createIfElseAssignment(stmt, null));
        for (FStatement stmt : elseStmts)
            stmts.add(createIfElseAssignment(null, stmt));
        // End first implementation
        
        // Clean up
        setFStatementList(oldStmts);
        return stmts;
    }
    /**
     * Create an assign statement with an if-else exception as the right side, 
     * that is equivalent to two assignments to the the same variable. One 
     * assignment from this if branch, and one other from the next branch.
     * If one of the assignments is null, then an access to the variable being 
     * assigned is used there (i.e. a no-op). At least one must be non-null.
     * 
     * If any of the statements is not an assign statement, then 
     * IllegalArgumentException is thrown.
     * 
     * @param leftStmt   the assignment from this branch
     * @param rightStmt  the assignment from the next branch
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1489
     */
    protected FAssignStmt createIfElseAssignment(FStatement leftStmt, FStatement rightStmt) {
        try {
            FAssignStmt left = (FAssignStmt) leftStmt;
            FAssignStmt right = (FAssignStmt) rightStmt;
            FAssignableExp lhs = ((left != null) ? left : right).getLeft().fullCopy();
            FExp test = getTest().fullCopy(); // TODO: use temp var instead
            FExp leftExp = createIfElseExpBranch(left, lhs);
            FExp rightExp = createIfElseExpBranch(right, lhs);
            return new FAssignStmt(lhs, new FIfExp(test, leftExp, rightExp));
        } catch (ClassCastException e) {
            throw new IllegalArgumentException();
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1503
     */
    private FExp createIfElseExpBranch(FAssignStmt ass, FAssignableExp var) {
        return (ass != null) ? ass.getRight().fullCopy() : var.fullCopy();
    }
    /**
     * Scalarize the if or when clause.
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:107
     */
    public void scalarize(Scalarizer.Algorithm s, List<FIfWhenClause> clauses) {
        FExp test = getTest().scalarize(s);
        List<FStatement> stmts = new List<FStatement>();
        clauses.add(createNode(test, stmts));
        FStatement.scalarizeStmtList(s.block(stmts), getFStatements());
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:938
     */
    public FIfWhenClause diff() {
        List<FStatement> statements = new List<FStatement>();
        for (FStatement statement : getFStatements())
            statement.diff(statements);
        return createNode(getTest().fullCopy(), statements);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:353
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
        String namespace="fun";
        String testTag = "Condition";
        String stmtTag = "Statements";
        
        str.println(indent + "<" + namespace + ":" + testTag + ">"); 
        this.getTest().prettyPrint_XML(str,p.indent(indent));
        str.println(indent + "</" + namespace + ":" + testTag + ">");  
        
        str.println(indent + "<" + namespace + ":" + stmtTag + ">"); 
    	for (FStatement s : this.getFStatementList())
    		s.prettyPrint_XML(str,p.indent(indent));
        str.println(indent + "</" + namespace + ":" + stmtTag + ">");  
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1875
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		str.print("if (");
		p.print(getTest(), str, indent);
		str.print(") {\n");
		p.print(getFStatements(), str, p.indent(indent));
	}
    /**
     * @declaredat ASTNode:1
     */
    public FIfWhenClause() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FIfWhenClause(FExp p0, List<FStatement> p1) {
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
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:45
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public FIfWhenClause clone() throws CloneNotSupportedException {
        FIfWhenClause node = (FIfWhenClause) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:62
     */
    public abstract FIfWhenClause fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:69
     */
    public abstract FIfWhenClause treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:77
     */
    public abstract FIfWhenClause treeCopy();
    /**
     * Replaces the Test child.
     * @param node The new node to replace the Test child.
     * @apilevel high-level
     */
    public void setTest(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Test child.
     * @return The current node used as the Test child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Test")
    public FExp getTest() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Test child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Test child.
     * @apilevel low-level
     */
    public FExp getTestNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the FStatement list.
     * @param list The new list node to be used as the FStatement list.
     * @apilevel high-level
     */
    public void setFStatementList(List<FStatement> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FStatement list.
     * @return Number of children in the FStatement list.
     * @apilevel high-level
     */
    public int getNumFStatement() {
        return getFStatementList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FStatement list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FStatement list.
     * @apilevel low-level
     */
    public int getNumFStatementNoTransform() {
        return getFStatementListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FStatement list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FStatement list.
     * @apilevel high-level
     */
    public FStatement getFStatement(int i) {
        return (FStatement) getFStatementList().getChild(i);
    }
    /**
     * Check whether the FStatement list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFStatement() {
        return getFStatementList().getNumChild() != 0;
    }
    /**
     * Append an element to the FStatement list.
     * @param node The element to append to the FStatement list.
     * @apilevel high-level
     */
    public void addFStatement(FStatement node) {
        List<FStatement> list = (parent == null || state == null) ? getFStatementListNoTransform() : getFStatementList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFStatementNoTransform(FStatement node) {
        List<FStatement> list = getFStatementListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FStatement list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFStatement(FStatement node, int i) {
        List<FStatement> list = getFStatementList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FStatement list.
     * @return The node representing the FStatement list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FStatement")
    public List<FStatement> getFStatementList() {
        List<FStatement> list = (List<FStatement>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FStatement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FStatement list.
     * @apilevel low-level
     */
    public List<FStatement> getFStatementListNoTransform() {
        return (List<FStatement>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FStatement list.
     * @return The node representing the FStatement list.
     * @apilevel high-level
     */
    public List<FStatement> getFStatements() {
        return getFStatementList();
    }
    /**
     * Retrieves the FStatement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FStatement list.
     * @apilevel low-level
     */
    public List<FStatement> getFStatementsNoTransform() {
        return getFStatementListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingAssignedNames() {
        ASTNode$State state = state();
        Set<String> sortingAssignedNames_value = FStatement.sortingAssignedNames(getFStatements());

        return sortingAssignedNames_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<String> sortingDependencies() {
        ASTNode$State state = state();
        Set<String> sortingDependencies_value = FStatement.addCompoundStmtSortingDependencies(
                        new LinkedHashSet<String>(), getTest(), getFStatements());

        return sortingDependencies_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1433
     */
    @ASTNodeAnnotation.Attribute
    public FStatement myFStatement() {
        ASTNode$State state = state();
        FStatement myFStatement_value = getParent().Define_myFStatement(this, null);

        return myFStatement_value;
    }
    /**
     * @attribute inh
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1418
     */
    @ASTNodeAnnotation.Attribute
    public String getKeyword() {
        ASTNode$State state = state();
        String getKeyword_value = getParent().Define_getKeyword(this, null);

        return getKeyword_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1089
     * @apilevel internal
     */
    public boolean Define_needsIndicatorInit(ASTNode caller, ASTNode child) {
        if (caller == getFStatementListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_needsIndicatorInit(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
