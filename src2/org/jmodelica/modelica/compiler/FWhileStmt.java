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
 * Flattened while statement.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:797
 * @production FWhileStmt : {@link FStatement} ::= <span class="component">Test:{@link FExp}</span> <span class="component">WhileStmt:{@link FStatement}*</span>;

 */
public class FWhileStmt extends FStatement implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4336
     */
    @Override
  public int evaluate(AlgorithmEvaluator evaluator) {
	  int res = EVAL_CONT;
	  while (res == EVAL_CONT && getTest().ceval(evaluator).booleanValue())
		  res = getWhileStmts().evaluateList(evaluator);
	  return (res == EVAL_BREAK) ? EVAL_CONT : res;
  }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1439
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print("while ");
		p.print(getTest(), str, indent);
		str.print(" loop\n");
		getWhileStmts().prettyPrintWithIndent(p, str, p.indent(indent), ";");
		str.print(indent);
		str.print("end while");
	}
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:60
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        if (!getTest().variability().parameterOrLess())
            ONLY_FMU_WHILE_STATEMENTS.invoke(this);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:874
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (!getTest().type().isUnknown() && !fBooleanScalarType().typeCompatible(getTest().type())) 
		  error("Type of test expression of while statement is not Boolean");
  }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:127
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        List l = new List();
        boolean res = FStatement.flattenFStatementList(getWhileStmts(), l, fc, prefix);
        sl.add(new FWhileStmt(getTest().flatten(prefix), l));
        return res;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1053
     */
    public void acceptTransform(AlgorithmTransformer tf)  { tf.visit(this); }
    /**
     * @aspect AlgorithmScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:123
     */
    @Override
    public void scalarize(Scalarizer.Algorithm s) {
        getTest().createArrayTemporaries(s);
        FWhileStmt stmt = new FWhileStmt();
        stmt.setTest(getTest().scalarize(s));
        Scalarizer.Algorithm sb = s.block(stmt.getWhileStmtList());
        FStatement.scalarizeStmtList(sb, getWhileStmts());
        sb.setWriteBack(true);
        getTest().createArrayTemporaries(sb);
        sb.setWriteBack(false);
        s.add(stmt);
    }
    /**
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:958
     */
    @Override
    public void diff(List<FStatement> diffed) {
        List<FStatement> statements = new List<FStatement>();
        for (FStatement statement : getWhileStmts())
            statement.diff(statements);
        diffed.add(new FWhileStmt(getTest().fullCopy(), statements));
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:408
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
        String namespace="fun";
        String tag = this.xmlTag();
        String testTag = "Condition";
        String stmtTag = "Statements";
        
        str.println(indent + "<" + namespace + ":" + tag + ">"); 
        //test
        str.println(indent + "\t<" + namespace + ":" + testTag + ">"); 
        this.getTest().prettyPrint_XML(str,p.indent(indent+"\t"));
        str.println(indent + "\t</" + namespace + ":" + testTag + ">");  
        //statements
        str.println(indent + "\t<" + namespace + ":" + stmtTag + ">"); 
    	for (FStatement s : this.getWhileStmtList())
    		s.prettyPrint_XML(str,p.indent(indent+"\t"));
        str.println(indent + "\t</" + namespace + ":" + stmtTag + ">"); 
        
        str.println(indent + "</" + namespace + ":" + tag + ">"); 
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2066
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		getTest().genTempVars_CAD(p, str, indent);
		str.print(indent);
		str.print("while (");
		p.print(getTest(), str, indent);
		str.print(") {\n");
		p.print(getWhileStmts(), str, p.indent(indent));
		getTest().genTempVars_CAD(p, str, p.indent(indent));
		str.print(indent);
		str.print("}\n");
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1883
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		p.printPreSteps(getTest(), str, indent);
		str.print(indent);
		str.print("while (");
		p.print(getTest(), str, "");
		str.print(") {\n");
		p.print(getWhileStmts(), str, p.indent(indent));
		str.print(indent);
		str.print("}\n");
        p.printPostSteps(getTest(), str, indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FWhileStmt() {
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
    public FWhileStmt(FExp p0, List<FStatement> p1) {
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
        sortingAssignedNames_reset();
        sortingDependencies_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:47
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public FWhileStmt clone() throws CloneNotSupportedException {
        FWhileStmt node = (FWhileStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FWhileStmt copy() {
        try {
            FWhileStmt node = (FWhileStmt) clone();
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
     * @declaredat ASTNode:79
     */
    public FWhileStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public FWhileStmt treeCopyNoTransform() {
        FWhileStmt tree = (FWhileStmt) copy();
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
     * @declaredat ASTNode:108
     */
    public FWhileStmt treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:115
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
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
     * Replaces the WhileStmt list.
     * @param list The new list node to be used as the WhileStmt list.
     * @apilevel high-level
     */
    public void setWhileStmtList(List<FStatement> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the WhileStmt list.
     * @return Number of children in the WhileStmt list.
     * @apilevel high-level
     */
    public int getNumWhileStmt() {
        return getWhileStmtList().getNumChild();
    }
    /**
     * Retrieves the number of children in the WhileStmt list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the WhileStmt list.
     * @apilevel low-level
     */
    public int getNumWhileStmtNoTransform() {
        return getWhileStmtListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the WhileStmt list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the WhileStmt list.
     * @apilevel high-level
     */
    public FStatement getWhileStmt(int i) {
        return (FStatement) getWhileStmtList().getChild(i);
    }
    /**
     * Check whether the WhileStmt list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasWhileStmt() {
        return getWhileStmtList().getNumChild() != 0;
    }
    /**
     * Append an element to the WhileStmt list.
     * @param node The element to append to the WhileStmt list.
     * @apilevel high-level
     */
    public void addWhileStmt(FStatement node) {
        List<FStatement> list = (parent == null || state == null) ? getWhileStmtListNoTransform() : getWhileStmtList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addWhileStmtNoTransform(FStatement node) {
        List<FStatement> list = getWhileStmtListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the WhileStmt list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setWhileStmt(FStatement node, int i) {
        List<FStatement> list = getWhileStmtList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the WhileStmt list.
     * @return The node representing the WhileStmt list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="WhileStmt")
    public List<FStatement> getWhileStmtList() {
        List<FStatement> list = (List<FStatement>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the WhileStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the WhileStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getWhileStmtListNoTransform() {
        return (List<FStatement>) getChildNoTransform(1);
    }
    /**
     * Retrieves the WhileStmt list.
     * @return The node representing the WhileStmt list.
     * @apilevel high-level
     */
    public List<FStatement> getWhileStmts() {
        return getWhileStmtList();
    }
    /**
     * Retrieves the WhileStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the WhileStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getWhileStmtsNoTransform() {
        return getWhileStmtListNoTransform();
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
                return false;
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
        sortingAssignedNames_value = sortingAssignedNames(getWhileStmts());
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
        sortingDependencies_value = addCompoundStmtSortingDependencies(baseSortingDependencies(), getTest(), getWhileStmts());
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
        String xmlTag_value = "While";

        return xmlTag_value;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:86
     * @apilevel internal
     */
    public boolean Define_inWhile(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:862
     * @apilevel internal
     */
    public FStatement Define_enclosingLoop(ASTNode caller, ASTNode child) {
        if (caller == getWhileStmtListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else {
            return getParent().Define_enclosingLoop(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1089
     * @apilevel internal
     */
    public boolean Define_needsIndicatorInit(ASTNode caller, ASTNode child) {
        if (caller == getWhileStmtListNoTransform()) {
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
