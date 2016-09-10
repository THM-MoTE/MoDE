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
 * A set of dynamic states
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1792
 * @production DynamicStateSet : {@link BaseNode} ::= <span class="component">&lt;SetId:Integer&gt;</span> <span class="component">&lt;NumAlgebraics:Integer&gt;</span> <span class="component">Var:{@link FIdUseExp}*</span> <span class="component">Coefficient:{@link DynamicStateCoefficient}*</span> <span class="component">&lt;StateVars:FDynamicStateVariable[]&gt;</span> <span class="component">&lt;AlgebraicVars:FDynamicAlgebraicVariable[]&gt;</span>;

 */
public class DynamicStateSet extends BaseNode implements Cloneable {
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:164
     */
    private static void genCombinations(Collection<FVariable[]> res, int n, int k, FVariable[] vars, int min, int index, FVariable[] current) {
        for (int i = min; i <= n - k + index && i < n; i++) {
            current[index] = vars[i];
            if (index == k - 1) {
                FVariable[] copy = new FVariable[k];
                System.arraycopy(current, 0, copy, 0, k);
                res.add(copy);
            } else {
                genCombinations(res, n, k, vars, i + 1, index + 1, current);
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4569
     */
    public void genDSCoefficientsFuncName_C(CodePrinter p, CodeStream str, String indent) {
        str.print("ds_coefficients");
        str.format("_%d", id_C());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4579
     */
    public void genDynamicStateAddCall_C(CodePrinter p, CodeStream str, String indent) {
        str.formatln("%s{", indent);
        String innerIndent = p.indent(indent);
        str.formatln("%sint* ds_var_value_refs = calloc(%d, sizeof(int));", innerIndent, numVars());
        str.formatln("%sint* ds_state_value_refs = calloc(%d, sizeof(int));", innerIndent, numStates());
        str.formatln("%sint* ds_algebraic_value_refs = calloc(%d, sizeof(int));", innerIndent, numAlgebraics());
        int i = 0;
        for (FVariable var : fVars()) {
            str.formatln("%sds_var_value_refs[%d] = %d; /* %s */", innerIndent, i, var.valueReference(), var.name());
            i++;
        }
        i = 0;
        for (FVariable var : getStateVars()) {
            str.formatln("%sds_state_value_refs[%d] = %d; /* %s */", innerIndent, i, var.valueReference(), var.name());
            i++;
        }
        i = 0;
        for (FVariable var : getAlgebraicVars()) {
            str.formatln("%sds_algebraic_value_refs[%d] = %d; /* %s */", innerIndent, i, var.valueReference(), var.name());
            i++;
        }
        str.format("%sjmi_dynamic_state_add_set(*jmi, %d, %d, %d, ds_var_value_refs, ds_state_value_refs, ds_algebraic_value_refs, ", innerIndent, id_C(), numVars(), numStates());
        genDSCoefficientsFuncName_C(p, str, indent);
        str.println(");");
        str.formatln("%sfree(ds_var_value_refs);", innerIndent);
        str.formatln("%sfree(ds_state_value_refs);", innerIndent);
        str.formatln("%sfree(ds_algebraic_value_refs);", innerIndent);
        str.formatln("%s}", indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4614
     */
    public void genDynamicStateCoefficients_C(CodePrinter p, CodeStream str, String outerIndent) {
        str.format("%sstatic void ", outerIndent);
        String indent = p.indent(outerIndent);
        genDSCoefficientsFuncName_C(p, str, indent);
        str.println("(jmi_t* jmi, jmi_real_t* res) {");
        for (DynamicStateCoefficient coff : getCoefficients())
            p.printVarDecls(coff, str, indent);
        str.format("%smemset(res, 0, %d * sizeof(jmi_real_t));\n", indent, numAlgebraics() * numVars());
        for (DynamicStateCoefficient coff : getCoefficients()) {
            p.printPreSteps(coff, str, indent);
            str.format("%sres[%d] = ", indent, coff.getEquation() + numAlgebraics() * coff.getVariable());
            p.print(coff, str, indent);
            str.println(";");
            p.printPostSteps(coff, str, indent);
        }
        
        str.formatln("%s}", outerIndent);
        str.println();
    }
    /**
     * @declaredat ASTNode:1
     */
    public DynamicStateSet() {
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
    public DynamicStateSet(Integer p0, Integer p1, List<FIdUseExp> p2, List<DynamicStateCoefficient> p3, FDynamicStateVariable[] p4, FDynamicAlgebraicVariable[] p5) {
        setSetId(p0);
        setNumAlgebraics(p1);
        setChild(p2, 0);
        setChild(p3, 1);
        setStateVars(p4);
        setAlgebraicVars(p5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:26
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:38
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        fVars_reset();
        varIndexMap_reset();
        algebraicCombinations_reset();
        stateCombinations_reset();
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
    public DynamicStateSet clone() throws CloneNotSupportedException {
        DynamicStateSet node = (DynamicStateSet) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public DynamicStateSet copy() {
        try {
            DynamicStateSet node = (DynamicStateSet) clone();
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
    public DynamicStateSet fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public DynamicStateSet treeCopyNoTransform() {
        DynamicStateSet tree = (DynamicStateSet) copy();
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
     * @declaredat ASTNode:115
     */
    public DynamicStateSet treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenInteger_SetId == ((DynamicStateSet)node).tokenInteger_SetId) && (tokenInteger_NumAlgebraics == ((DynamicStateSet)node).tokenInteger_NumAlgebraics) && (tokenFDynamicStateVariable_a_StateVars == ((DynamicStateSet)node).tokenFDynamicStateVariable_a_StateVars) && (tokenFDynamicAlgebraicVariable_a_AlgebraicVars == ((DynamicStateSet)node).tokenFDynamicAlgebraicVariable_a_AlgebraicVars);    
    }
    /**
     * Replaces the lexeme SetId.
     * @param value The new value for the lexeme SetId.
     * @apilevel high-level
     */
    public void setSetId(Integer value) {
        tokenInteger_SetId = value;
    }
    /**
     * @apilevel internal
     */
    protected Integer tokenInteger_SetId;
    /**
     * Retrieves the value for the lexeme SetId.
     * @return The value for the lexeme SetId.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="SetId")
    public Integer getSetId() {
        return tokenInteger_SetId;
    }
    /**
     * Replaces the lexeme NumAlgebraics.
     * @param value The new value for the lexeme NumAlgebraics.
     * @apilevel high-level
     */
    public void setNumAlgebraics(Integer value) {
        tokenInteger_NumAlgebraics = value;
    }
    /**
     * @apilevel internal
     */
    protected Integer tokenInteger_NumAlgebraics;
    /**
     * Retrieves the value for the lexeme NumAlgebraics.
     * @return The value for the lexeme NumAlgebraics.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="NumAlgebraics")
    public Integer getNumAlgebraics() {
        return tokenInteger_NumAlgebraics;
    }
    /**
     * Replaces the Var list.
     * @param list The new list node to be used as the Var list.
     * @apilevel high-level
     */
    public void setVarList(List<FIdUseExp> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Var list.
     * @return Number of children in the Var list.
     * @apilevel high-level
     */
    public int getNumVar() {
        return getVarList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Var list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Var list.
     * @apilevel low-level
     */
    public int getNumVarNoTransform() {
        return getVarListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Var list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Var list.
     * @apilevel high-level
     */
    public FIdUseExp getVar(int i) {
        return (FIdUseExp) getVarList().getChild(i);
    }
    /**
     * Check whether the Var list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasVar() {
        return getVarList().getNumChild() != 0;
    }
    /**
     * Append an element to the Var list.
     * @param node The element to append to the Var list.
     * @apilevel high-level
     */
    public void addVar(FIdUseExp node) {
        List<FIdUseExp> list = (parent == null || state == null) ? getVarListNoTransform() : getVarList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addVarNoTransform(FIdUseExp node) {
        List<FIdUseExp> list = getVarListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Var list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setVar(FIdUseExp node, int i) {
        List<FIdUseExp> list = getVarList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Var list.
     * @return The node representing the Var list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Var")
    public List<FIdUseExp> getVarList() {
        List<FIdUseExp> list = (List<FIdUseExp>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Var list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Var list.
     * @apilevel low-level
     */
    public List<FIdUseExp> getVarListNoTransform() {
        return (List<FIdUseExp>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Var list.
     * @return The node representing the Var list.
     * @apilevel high-level
     */
    public List<FIdUseExp> getVars() {
        return getVarList();
    }
    /**
     * Retrieves the Var list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Var list.
     * @apilevel low-level
     */
    public List<FIdUseExp> getVarsNoTransform() {
        return getVarListNoTransform();
    }
    /**
     * Replaces the Coefficient list.
     * @param list The new list node to be used as the Coefficient list.
     * @apilevel high-level
     */
    public void setCoefficientList(List<DynamicStateCoefficient> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Coefficient list.
     * @return Number of children in the Coefficient list.
     * @apilevel high-level
     */
    public int getNumCoefficient() {
        return getCoefficientList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Coefficient list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Coefficient list.
     * @apilevel low-level
     */
    public int getNumCoefficientNoTransform() {
        return getCoefficientListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Coefficient list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Coefficient list.
     * @apilevel high-level
     */
    public DynamicStateCoefficient getCoefficient(int i) {
        return (DynamicStateCoefficient) getCoefficientList().getChild(i);
    }
    /**
     * Check whether the Coefficient list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasCoefficient() {
        return getCoefficientList().getNumChild() != 0;
    }
    /**
     * Append an element to the Coefficient list.
     * @param node The element to append to the Coefficient list.
     * @apilevel high-level
     */
    public void addCoefficient(DynamicStateCoefficient node) {
        List<DynamicStateCoefficient> list = (parent == null || state == null) ? getCoefficientListNoTransform() : getCoefficientList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addCoefficientNoTransform(DynamicStateCoefficient node) {
        List<DynamicStateCoefficient> list = getCoefficientListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Coefficient list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setCoefficient(DynamicStateCoefficient node, int i) {
        List<DynamicStateCoefficient> list = getCoefficientList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Coefficient list.
     * @return The node representing the Coefficient list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Coefficient")
    public List<DynamicStateCoefficient> getCoefficientList() {
        List<DynamicStateCoefficient> list = (List<DynamicStateCoefficient>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Coefficient list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Coefficient list.
     * @apilevel low-level
     */
    public List<DynamicStateCoefficient> getCoefficientListNoTransform() {
        return (List<DynamicStateCoefficient>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Coefficient list.
     * @return The node representing the Coefficient list.
     * @apilevel high-level
     */
    public List<DynamicStateCoefficient> getCoefficients() {
        return getCoefficientList();
    }
    /**
     * Retrieves the Coefficient list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Coefficient list.
     * @apilevel low-level
     */
    public List<DynamicStateCoefficient> getCoefficientsNoTransform() {
        return getCoefficientListNoTransform();
    }
    /**
     * Replaces the lexeme StateVars.
     * @param value The new value for the lexeme StateVars.
     * @apilevel high-level
     */
    public void setStateVars(FDynamicStateVariable[] value) {
        tokenFDynamicStateVariable_a_StateVars = value;
    }
    /**
     * @apilevel internal
     */
    protected FDynamicStateVariable[] tokenFDynamicStateVariable_a_StateVars;
    /**
     * Retrieves the value for the lexeme StateVars.
     * @return The value for the lexeme StateVars.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="StateVars")
    public FDynamicStateVariable[] getStateVars() {
        return tokenFDynamicStateVariable_a_StateVars;
    }
    /**
     * Replaces the lexeme AlgebraicVars.
     * @param value The new value for the lexeme AlgebraicVars.
     * @apilevel high-level
     */
    public void setAlgebraicVars(FDynamicAlgebraicVariable[] value) {
        tokenFDynamicAlgebraicVariable_a_AlgebraicVars = value;
    }
    /**
     * @apilevel internal
     */
    protected FDynamicAlgebraicVariable[] tokenFDynamicAlgebraicVariable_a_AlgebraicVars;
    /**
     * Retrieves the value for the lexeme AlgebraicVars.
     * @return The value for the lexeme AlgebraicVars.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="AlgebraicVars")
    public FDynamicAlgebraicVariable[] getAlgebraicVars() {
        return tokenFDynamicAlgebraicVariable_a_AlgebraicVars;
    }
    @ASTNodeAnnotation.Attribute
    public int numStates() {
        ASTNode$State state = state();
        int numStates_value = getNumVar() - numAlgebraics();

        return numStates_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numAlgebraics() {
        ASTNode$State state = state();
        int numAlgebraics_value = getNumAlgebraics();

        return numAlgebraics_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numVars() {
        ASTNode$State state = state();
        int numVars_value = getNumVar();

        return numVars_value;
    }
    @ASTNodeAnnotation.Attribute
    public int id() {
        ASTNode$State state = state();
        int id_value = getSetId();

        return id_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean fVars_computed = false;
    /**
     * @apilevel internal
     */
    protected FVariable[] fVars_value;
    /**
     * @apilevel internal
     */
    private void fVars_reset() {
        fVars_computed = false;
        fVars_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable[] fVars() {
        if(fVars_computed) {
            return fVars_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        fVars_value = fVars_compute();
        if (isFinal && num == state().boundariesCrossed) {
            fVars_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return fVars_value;
    }
    /**
     * @apilevel internal
     */
    private FVariable[] fVars_compute() {
            FVariable[] vars = new FVariable[getNumVar()];
            for (int i = 1; i <= vars.length; i++)
                vars[i - 1] = getVar(i - 1).myFV().asFVariable();
            return vars;
        }
    /**
     * @apilevel internal
     */
    protected boolean varIndexMap_computed = false;
    /**
     * @apilevel internal
     */
    protected Map<FAbstractVariable, Integer> varIndexMap_value;
    /**
     * @apilevel internal
     */
    private void varIndexMap_reset() {
        varIndexMap_computed = false;
        varIndexMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Map<FAbstractVariable, Integer> varIndexMap() {
        if(varIndexMap_computed) {
            return varIndexMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        varIndexMap_value = varIndexMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            varIndexMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return varIndexMap_value;
    }
    /**
     * @apilevel internal
     */
    private Map<FAbstractVariable, Integer> varIndexMap_compute() {
            Map<FAbstractVariable, Integer> map = new HashMap<FAbstractVariable, Integer>();
            FVariable[] vars = fVars();
            for (int i = 1; i <= numVars(); i++)
                map.put(vars[i - 1], i);
            return map;
        }
    @ASTNodeAnnotation.Attribute
    public int varIndex(FAbstractVariable var) {
        ASTNode$State state = state();
        int varIndex_FAbstractVariable_value = varIndexMap().get(var);

        return varIndex_FAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> fVarsColl() {
        ASTNode$State state = state();
        Collection<FVariable> fVarsColl_value = Arrays.asList(fVars());

        return fVarsColl_value;
    }
    /**
     * @attribute syn
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:147
     */
    @ASTNodeAnnotation.Attribute
    public int numCombinations() {
        ASTNode$State state = state();
        try {
                int n = numVars();
                int k = numStates();
                if (k > n - k)
                    k = n - k;
                int r=1;
                for (int i = 1, j = n; i <= k; i++, j--)
                    r = r * j / i;
                return r;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean algebraicCombinations_computed = false;
    /**
     * @apilevel internal
     */
    protected FVariable[][] algebraicCombinations_value;
    /**
     * @apilevel internal
     */
    private void algebraicCombinations_reset() {
        algebraicCombinations_computed = false;
        algebraicCombinations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable[][] algebraicCombinations() {
        if(algebraicCombinations_computed) {
            return algebraicCombinations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicCombinations_value = algebraicCombinations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            algebraicCombinations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicCombinations_value;
    }
    /**
     * @apilevel internal
     */
    private FVariable[][] algebraicCombinations_compute() {
            Collection<FVariable[]> res = new ArrayList<FVariable[]>();
            genCombinations(res, numVars(), numAlgebraics(), fVars(), 0, 0, new FVariable[numAlgebraics()]);
            return res.toArray(new FVariable[res.size()][]);
        }
    /**
     * @apilevel internal
     */
    protected boolean stateCombinations_computed = false;
    /**
     * @apilevel internal
     */
    protected FVariable[][] stateCombinations_value;
    /**
     * @apilevel internal
     */
    private void stateCombinations_reset() {
        stateCombinations_computed = false;
        stateCombinations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable[][] stateCombinations() {
        if(stateCombinations_computed) {
            return stateCombinations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stateCombinations_value = stateCombinations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            stateCombinations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stateCombinations_value;
    }
    /**
     * @apilevel internal
     */
    private FVariable[][] stateCombinations_compute() {
            FVariable[][] algCombs = algebraicCombinations();
            FVariable[][] res = new FVariable[algCombs.length][];
            for (int i = 0; i < res.length; i++) {
                int j = 0;
                res[i] = new FVariable[numStates()];
                Set<FVariable> algs = new HashSet<FVariable>();
                for (FVariable alg : algCombs[i])
                    algs.add(alg);
                for (FVariable var : fVars())
                    if (!algs.contains(var))
                        res[i][j++] = var;
            }
            return res;
        }
    @ASTNodeAnnotation.Attribute
    public int id_C() {
        ASTNode$State state = state();
        int id_C_value = id() - 1;

        return id_C_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:86
     * @apilevel internal
     */
    public boolean Define_shouldRewriteToDSRef(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
