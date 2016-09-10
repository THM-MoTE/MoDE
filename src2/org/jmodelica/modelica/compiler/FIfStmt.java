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
 * Flattened if statement.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:766
 * @production FIfStmt : {@link FIfWhenStmt} ::= <span class="component">ElseStmt:{@link FStatement}*</span>;

 */
public class FIfStmt extends FIfWhenStmt implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4270
     */
    @Override
  public int evaluateElse(AlgorithmEvaluator evaluator) {
	  return getElseStmts().evaluateList(evaluator);
  }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1397
     */
    public FIfStmt createEmptyNode()   { return new FIfStmt(); }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1829
     */
    public void addAsInitial(ArrayList<FStatement> stmts, Set<FIdUseExp> usesLHS, 
            Set<FVariable> fvSet, Set<FVariable> fvUse) {
        
        if (!isWhen()) {
            super.addAsInitial(stmts, usesLHS, fvSet, fvUse);
            return;
        }
        
        boolean first = true;
        for (FIfWhenClause c : getFIfWhenClauses()) {
            if (c.getTest().isInitialGuard() && first) {
                for (FStatement s : c.getFStatements()) {
                    s.defSet(fvSet, fvUse);
                    stmts.add(s.copySymbolic());
                }
                first = false;
            } else {
                usesLHS.removeAll(c.findFIdUseExpsInTree());
            }
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1399
     */
    protected void prettyPrintElse(Printer p, CodeStream str, String indent) {
		if (getNumElseStmt() > 0) {
			str.print(indent);
			str.print("else\n");
			getElseStmts().prettyPrintWithIndent(p, str, p.indent(indent), ";");
		}
	}
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:94
     */
    protected FIfWhenStmt flattenFIfWhenStmt(FClass fc, FQName prefix, List icl) {
        List l = new List();
        FStatement.flattenFStatementList(getElseStmts(), l, fc, prefix);
        return new FIfStmt(icl, l);
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1051
     */
    public void acceptTransform(AlgorithmTransformer tf)     { tf.visit(this); }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1353
     */
    public void inline(AbstractFunctionInliner fi) {
        // Reduce to list of assignments
        List<FStatement> stmts = new List<FStatement>();
        inlinePrepare(fi, stmts);
        
        // Add assignments to tree temporarily
        List<FStatement> oldElse = getElseStmts();
        setElseStmtList((List) stmts);
        getElseStmtList();
        
        // Inline them
        for (FStatement stmt : stmts)
            stmt.inline(fi);
        
        // Restore old else branch
        setElseStmtList(oldElse);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1405
     */
    public void inlinePrepare(AbstractFunctionInliner fi, List<FStatement> stmts) {
        List<FStatement> oldElse = getElseStmts();
        
        // Prepare contents
        List<FStatement> newElse = new List<FStatement>();
        for (FStatement stmt : oldElse)
            stmt.inlinePrepare(fi, newElse);
        setElseStmtList((List) newElse);
        
        // Combine branches to assignments with if-else expressions
        for (int i = getNumFIfWhenClause() - 1; i >= 0; i--) {
            newElse = getFIfWhenClause(i).inlineCombineBranches(fi, newElse);
            setElseStmtList((List) newElse);
        }
        
        // Write result to target list
        for (FStatement stmt : newElse)
            stmts.add(stmt);
        setElseStmtList(oldElse);
    }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:99
     */
    public void scalarizeElse(Scalarizer.Algorithm s, FIfWhenStmt stmt) {
        FIfStmt ifstmt = (FIfStmt) stmt;
        FStatement.scalarizeStmtList(s.block(ifstmt.getElseStmtList()), getElseStmts());
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:320
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
        String namespace="fun";
        String tag = this.xmlTag();
        String elseIfTag = "ElseIf";
        String elseTag = "Else";
        
        //opening tag
        str.println(indent + "<" + namespace + ":" + tag + ">"); 
        
        //then branch
        this.getFIfWhenClause(0).prettyPrint_XML(str,p.indent(indent));
        
        //elseif branches
        if(this.getNumFIfWhenClause()>1){
        	for (int i=1; i< this.getNumFIfWhenClause(); i++){
        		str.println(indent + "\t<" + namespace + ":" + elseIfTag + ">");
        		this.getFIfWhenClause(i).prettyPrint_XML(str,p.indent(indent+"\t"));
        		str.println(indent + "\t</" + namespace + ":" + elseIfTag + ">");
        	}
        }
        
       //else branch
        if (this.getNumElseStmt()!=0){
            str.println(indent + "\t<" + namespace + ":" + elseTag + ">");
        	for (FStatement s : this.getElseStmtList())
        		s.prettyPrint_XML(str,p.indent(indent+"\t"));
    		str.println(indent + "\t</" + namespace + ":" + elseTag + ">");
        }
	
		//closing tag
        str.println(indent + "</" + namespace + ":" + tag + ">");        
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1867
     */
    protected void prettyPrintElse_C(CodePrinter p, CodeStream str, String indent) {
		if (getNumElseStmt() > 0) {
			str.print(indent);
			str.print("} else {\n");
			p.print(getElseStmts(), str, p.indent(indent));
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public FIfStmt() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FIfStmt(List<FIfWhenClause> p0, List<FStatement> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public FIfStmt clone() throws CloneNotSupportedException {
        FIfStmt node = (FIfStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public FIfStmt copy() {
        try {
            FIfStmt node = (FIfStmt) clone();
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
    public FIfStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public FIfStmt treeCopyNoTransform() {
        FIfStmt tree = (FIfStmt) copy();
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
    public FIfStmt treeCopy() {
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
     * Replaces the ElseStmt list.
     * @param list The new list node to be used as the ElseStmt list.
     * @apilevel high-level
     */
    public void setElseStmtList(List<FStatement> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the ElseStmt list.
     * @return Number of children in the ElseStmt list.
     * @apilevel high-level
     */
    public int getNumElseStmt() {
        return getElseStmtList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElseStmt list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElseStmt list.
     * @apilevel low-level
     */
    public int getNumElseStmtNoTransform() {
        return getElseStmtListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElseStmt list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElseStmt list.
     * @apilevel high-level
     */
    public FStatement getElseStmt(int i) {
        return (FStatement) getElseStmtList().getChild(i);
    }
    /**
     * Check whether the ElseStmt list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElseStmt() {
        return getElseStmtList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElseStmt list.
     * @param node The element to append to the ElseStmt list.
     * @apilevel high-level
     */
    public void addElseStmt(FStatement node) {
        List<FStatement> list = (parent == null || state == null) ? getElseStmtListNoTransform() : getElseStmtList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElseStmtNoTransform(FStatement node) {
        List<FStatement> list = getElseStmtListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElseStmt list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElseStmt(FStatement node, int i) {
        List<FStatement> list = getElseStmtList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ElseStmt list.
     * @return The node representing the ElseStmt list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ElseStmt")
    public List<FStatement> getElseStmtList() {
        List<FStatement> list = (List<FStatement>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ElseStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElseStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getElseStmtListNoTransform() {
        return (List<FStatement>) getChildNoTransform(1);
    }
    /**
     * Retrieves the ElseStmt list.
     * @return The node representing the ElseStmt list.
     * @apilevel high-level
     */
    public List<FStatement> getElseStmts() {
        return getElseStmtList();
    }
    /**
     * Retrieves the ElseStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElseStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getElseStmtsNoTransform() {
        return getElseStmtListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public String getKeyword() {
        ASTNode$State state = state();
        String getKeyword_value = "if";

        return getKeyword_value;
    }
    /**
     * Check if we can inline this statement.
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1241
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable() {
        ASTNode$State state = state();
        try {
                for (FIfWhenClause branch : getFIfWhenClauses())
                    if (!isAllInlinable(branch.getFStatements()))
                        return false;
                return isAllInlinable(getElseStmts());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:921
     */
    @ASTNodeAnnotation.Attribute
    public FIfWhenStmt createDifferentiated(List<FIfWhenClause> differentiatedClauses) {
        ASTNode$State state = state();
        try {
                List<FStatement> elseStatements = new List<FStatement>();
                for (FStatement statement : getElseStmts())
                    statement.diff(elseStatements);
                return new FIfStmt(differentiatedClauses, elseStatements);
            }
        finally {
        }
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
            Set<String> res = new LinkedHashSet<String>();
            for (FIfWhenClause iwc : getFIfWhenClauses())
                res.addAll(iwc.sortingAssignedNames());
            for (FStatement stmt : getElseStmts())
                res.addAll(stmt.sortingAssignedNames());
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
        sortingDependencies_value = sortingDependencies_compute();
        if (isFinal && num == state().boundariesCrossed) {
            sortingDependencies_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sortingDependencies_value;
    }
    /**
     * @apilevel internal
     */
    private Set<String> sortingDependencies_compute() {
            Set<String> res = new LinkedHashSet<String>();
            for (FIfWhenClause iwc : getFIfWhenClauses())
                res.addAll(iwc.sortingDependencies());
            for (FStatement stmt : getElseStmts())
                res.addAll(stmt.sortingDependencies());
            return res;
        }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "If";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        if (caller == getElseStmtListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return isWhen() || inWhen();
        }
        else {
            return getParent().Define_inWhen(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1089
     * @apilevel internal
     */
    public boolean Define_needsIndicatorInit(ASTNode caller, ASTNode child) {
        if (caller == getElseStmtListNoTransform()) {
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
