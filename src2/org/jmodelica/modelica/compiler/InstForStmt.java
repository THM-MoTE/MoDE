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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:170
 * @production InstForStmt : {@link FStatement} ::= <span class="component">{@link InstForIndex}*</span> <span class="component">ForStmt:{@link FStatement}*</span>;

 */
public class InstForStmt extends FStatement implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4306
     */
    @Override
  public int evaluate(AlgorithmEvaluator evaluator) {
	  return getInstForIndex(0).evaluateInFunc(evaluator, getInstForIndexList(), 0, getForStmts());
  }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1430
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print("for ");
		getInstForIndexList().prettyPrintWithSep(p, str, indent, ", ");
		str.print(" loop\n");
		getForStmts().prettyPrintWithIndent(p, str, p.indent(indent), ";");
		str.print(indent);
		str.print("end for");
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1214
     */
    public void collectErrors(ErrorCheckType checkType) {
	    collectErrorsInFor(getForStmtList(), getInstForIndexList(), checkType);
	}
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:134
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        if (inFunction()) {
            List fsl = new List();
            FStatement.flattenFStatementList(getForStmts(), fsl, fc, prefix);
            int i = getNumInstForIndex() - 1;
            FForStmt res = new FForStmt(getInstForIndex(i).flatten(prefix), fsl);
            for (i--; i >= 0; i--) {
                fsl = new List().add(res);
                res = new FForStmt(getInstForIndex(i).flatten(prefix), fsl);
            }
            sl.add(res);
        } else {
            ArrayList<CommonForIndex> forIndices = new ArrayList<CommonForIndex>();
            for (InstForIndex ifi : getInstForIndexs()) {
                forIndices.add(ifi);
            }
            Indices ind = Indices.create(forIndices);
            if (!ind.size().isZero()) {
                FVariable tempVar = null;
                boolean hasBreak = getForStmts().containsBreakStmt();
                if (hasBreak) {
                    tempVar = new FBooleanVariable(new FTemporaryVisibilityType(), fDiscrete(),
                            prefix.copyAndAppend(myTempVarName()));
                    fc.addFVariableNoTransform(tempVar);
                    new FAssignStmt(tempVar.createUseExp(), new FBooleanLitExpTrue()).flatten(sl, fc, prefix);
                }
                
                List<FStatement> inner = sl;
                for (Index i : ind) {
                    if (hasBreak) {
                        inner = FStatement.breakBlock(sl, tempVar.createUseExp());
                    }
                    ind.translate(i).setValues(forIndices);
                    getForStmts().flushAllRecursive();
                    FStatement.flattenFStatementList(getForStmts(), inner, fc, prefix);
                }
                for (InstForIndex ifi : getInstForIndexs()) {
                    ifi.clearEvaluationValue();
                }
            }
        }
        return false;
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstForStmt() {
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
    public InstForStmt(List<InstForIndex> p0, List<FStatement> p1) {
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
        myTempVarName_reset();
        lookupInstComponent_String_reset();
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
    public InstForStmt clone() throws CloneNotSupportedException {
        InstForStmt node = (InstForStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public InstForStmt copy() {
        try {
            InstForStmt node = (InstForStmt) clone();
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
    public InstForStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public InstForStmt treeCopyNoTransform() {
        InstForStmt tree = (InstForStmt) copy();
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
    public InstForStmt treeCopy() {
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
     * Replaces the InstForIndex list.
     * @param list The new list node to be used as the InstForIndex list.
     * @apilevel high-level
     */
    public void setInstForIndexList(List<InstForIndex> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the InstForIndex list.
     * @return Number of children in the InstForIndex list.
     * @apilevel high-level
     */
    public int getNumInstForIndex() {
        return getInstForIndexList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstForIndex list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstForIndex list.
     * @apilevel low-level
     */
    public int getNumInstForIndexNoTransform() {
        return getInstForIndexListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstForIndex list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstForIndex list.
     * @apilevel high-level
     */
    public InstForIndex getInstForIndex(int i) {
        return (InstForIndex) getInstForIndexList().getChild(i);
    }
    /**
     * Check whether the InstForIndex list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstForIndex() {
        return getInstForIndexList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstForIndex list.
     * @param node The element to append to the InstForIndex list.
     * @apilevel high-level
     */
    public void addInstForIndex(InstForIndex node) {
        List<InstForIndex> list = (parent == null || state == null) ? getInstForIndexListNoTransform() : getInstForIndexList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstForIndexNoTransform(InstForIndex node) {
        List<InstForIndex> list = getInstForIndexListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstForIndex list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstForIndex(InstForIndex node, int i) {
        List<InstForIndex> list = getInstForIndexList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the InstForIndex list.
     * @return The node representing the InstForIndex list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="InstForIndex")
    public List<InstForIndex> getInstForIndexList() {
        List<InstForIndex> list = (List<InstForIndex>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the InstForIndex list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstForIndex list.
     * @apilevel low-level
     */
    public List<InstForIndex> getInstForIndexListNoTransform() {
        return (List<InstForIndex>) getChildNoTransform(0);
    }
    /**
     * Retrieves the InstForIndex list.
     * @return The node representing the InstForIndex list.
     * @apilevel high-level
     */
    public List<InstForIndex> getInstForIndexs() {
        return getInstForIndexList();
    }
    /**
     * Retrieves the InstForIndex list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstForIndex list.
     * @apilevel low-level
     */
    public List<InstForIndex> getInstForIndexsNoTransform() {
        return getInstForIndexListNoTransform();
    }
    /**
     * Replaces the ForStmt list.
     * @param list The new list node to be used as the ForStmt list.
     * @apilevel high-level
     */
    public void setForStmtList(List<FStatement> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the ForStmt list.
     * @return Number of children in the ForStmt list.
     * @apilevel high-level
     */
    public int getNumForStmt() {
        return getForStmtList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ForStmt list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ForStmt list.
     * @apilevel low-level
     */
    public int getNumForStmtNoTransform() {
        return getForStmtListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ForStmt list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ForStmt list.
     * @apilevel high-level
     */
    public FStatement getForStmt(int i) {
        return (FStatement) getForStmtList().getChild(i);
    }
    /**
     * Check whether the ForStmt list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasForStmt() {
        return getForStmtList().getNumChild() != 0;
    }
    /**
     * Append an element to the ForStmt list.
     * @param node The element to append to the ForStmt list.
     * @apilevel high-level
     */
    public void addForStmt(FStatement node) {
        List<FStatement> list = (parent == null || state == null) ? getForStmtListNoTransform() : getForStmtList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addForStmtNoTransform(FStatement node) {
        List<FStatement> list = getForStmtListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ForStmt list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setForStmt(FStatement node, int i) {
        List<FStatement> list = getForStmtList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ForStmt list.
     * @return The node representing the ForStmt list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ForStmt")
    public List<FStatement> getForStmtList() {
        List<FStatement> list = (List<FStatement>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ForStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ForStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getForStmtListNoTransform() {
        return (List<FStatement>) getChildNoTransform(1);
    }
    /**
     * Retrieves the ForStmt list.
     * @return The node representing the ForStmt list.
     * @apilevel high-level
     */
    public List<FStatement> getForStmts() {
        return getForStmtList();
    }
    /**
     * Retrieves the ForStmt list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ForStmt list.
     * @apilevel low-level
     */
    public List<FStatement> getForStmtsNoTransform() {
        return getForStmtListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "For";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:183
     */
    @ASTNodeAnnotation.Attribute
    public String myTempVarName() {
        if(myTempVarName_computed) {
            return myTempVarName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myTempVarName_value = getParent().Define_myTempVarName(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myTempVarName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myTempVarName_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myTempVarName_computed = false;
    /**
     * @apilevel internal
     */
    protected String myTempVarName_value;
    /**
     * @apilevel internal
     */
    private void myTempVarName_reset() {
        myTempVarName_computed = false;
        myTempVarName_value = null;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:526
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        Object _parameters = name;
        if (lookupInstComponent_String_values == null) lookupInstComponent_String_values = new HashMap(4);
        if(lookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)lookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);
        if (isFinal && num == state().boundariesCrossed) {
            lookupInstComponent_String_values.put(_parameters, lookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return lookupInstComponent_String_value;
    }
    protected Map lookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void lookupInstComponent_String_reset() {
        lookupInstComponent_String_values = null;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:180
     * @apilevel internal
     */
    public ASTNode Define_nameCollisionScope(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:191
     * @apilevel internal
     */
    public String Define_breakCondName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myTempVarName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
                for (InstForIndex ifi : getInstForIndexs()) 
                    if (ifi.matches(name))
                        return InstLookupResult.<InstComponentDecl>found(ifi.getInstPrimitive());
                return lookupInstComponent(name);
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:862
     * @apilevel internal
     */
    public FStatement Define_enclosingLoop(ASTNode caller, ASTNode child) {
        if (caller == getForStmtListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else {
            return getParent().Define_enclosingLoop(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
