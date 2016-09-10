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
 * Common base class for FMinExp & FMaxExp.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1681
 * @production FMinMaxExp : {@link FBuiltInFunctionCall} ::= <span class="component">X:{@link FExp}</span> <span class="component">[Y:{@link FExp}]</span>;

 */
public abstract class FMinMaxExp extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1020
     */
    public abstract FMinMaxExp createEmptyNode();
    /**
     * Create new node of same class as this, with the specified 
     * children. For missing y, use null.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1306
     */
    public FMinMaxExp createNode(FExp x, FExp y) {
		FMinMaxExp node = createEmptyNode();
		node.setX(x);
		if (y != null)
			node.setY(y);
		return node;
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1382
     */
    public FExp createNodeBinary(FExp a, FExp b) { return createNode(a, b); }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2595
     */
    public FMinMaxExp flatten(FQName prefix) { 
        return createNode(getX().flatten(prefix), hasY() ? getY().flatten(prefix) : null); 
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1669
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
		if (hasY())
			return createNode(getX().scalarize(indexMap), getY().scalarize(indexMap));
		else
			return getX().reduceToScalarized(this, indexMap);
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:581
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        // Set up names and create for loop(s)
        ForNames names = s.getNames();
        FExp exp = getX();
        names.addLayer(exp.ndims());
        names.fillLayer(this);
        
        FIdUseExp reducer = tempExp();
        
        FStatement initStmt = new FAssignStmt(reducer, scalarReduceStartValue().buildLiteral());
        
        List clauses = unknownReductionSub(s, exp, initStmt);
        
        // Add statement updating temp var to loop
        FExp scalarizedExp = scalarReduceExp(reducer, exp.scalarize(s));
        clauses.add(new FAssignStmt(reducer.fullCopy(), scalarizedExp));
        
        names.removeLayer();
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:393
     */
    public FExp diff(String name) {
        return dynamicFExp(new FNoEventExp(new FIfExp(createCompareNode(getX().copySymbolic(), getY().copySymbolic()), getX().diff(name), getY().diff(name))));
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:403
     */
    @Override
    public void genDerExp_CAD(CodePrinter p, CodeStream str, String indent) {
        getX().genVar_CAD(p, str, indent);
        str.format(" %s ", compareSign_CAD());
        getY().genVar_CAD(p, str, indent);
        str.print(" ? ");
        getX().genDer_CAD(p, str, indent);
        str.print(" : ");
        getY().genDer_CAD(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:217
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print("jmi_" + builtInName() + "(");
        p.print(getX(), str, indent);
        str.print(", ");
        p.print(getY(), str, indent);
        str.print(")");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FMinMaxExp() {
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
        children = new ASTNode[4];
        setChild(new Opt(), 1);
        setChild(new List(), 3);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FMinMaxExp(FExp p0, Opt<FExp> p1) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
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
    public FMinMaxExp clone() throws CloneNotSupportedException {
        FMinMaxExp node = (FMinMaxExp) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:64
     */
    public abstract FMinMaxExp fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract FMinMaxExp treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:79
     */
    public abstract FMinMaxExp treeCopy();
    /**
     * Replaces the X child.
     * @param node The new node to replace the X child.
     * @apilevel high-level
     */
    public void setX(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the X child.
     * @return The current node used as the X child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="X")
    public FExp getX() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the X child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the X child.
     * @apilevel low-level
     */
    public FExp getXNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the Y child. This is the <code>Opt</code>
     * node containing the child Y, not the actual child!
     * @param opt The new node to be used as the optional node for the Y child.
     * @apilevel low-level
     */
    public void setYOpt(Opt<FExp> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) Y child.
     * @param node The new node to be used as the Y child.
     * @apilevel high-level
     */
    public void setY(FExp node) {
        getYOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Y child exists.
     * @return {@code true} if the optional Y child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasY() {
        return getYOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Y child.
     * @return The Y child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getY() {
        return (FExp) getYOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Y child. This is the <code>Opt</code> node containing the child Y, not the actual child!
     * @return The optional node for child the Y child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Y")
    public Opt<FExp> getYOpt() {
        return (Opt<FExp>) getChild(1);
    }
    /**
     * Retrieves the optional node for child Y. This is the <code>Opt</code> node containing the child Y, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Y.
     * @apilevel low-level
     */
    public Opt<FExp> getYOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 2;
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * @return Number of children in the OriginalArg list.
     * @apilevel high-level
     */
    public int getNumOriginalArg() {
        return getOriginalArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the OriginalArg list.
     * @apilevel low-level
     */
    public int getNumOriginalArgNoTransform() {
        return getOriginalArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the OriginalArg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the OriginalArg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getOriginalArg(int i) {
        return (InstFunctionArgument) getOriginalArgList().getChild(i);
    }
    /**
     * Check whether the OriginalArg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasOriginalArg() {
        return getOriginalArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the OriginalArg list.
     * @param node The element to append to the OriginalArg list.
     * @apilevel high-level
     */
    public void addOriginalArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getOriginalArgListNoTransform() : getOriginalArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addOriginalArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getOriginalArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the OriginalArg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setOriginalArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getOriginalArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the OriginalArg list.
     * @return The the child position of the OriginalArg list.
     * @apilevel low-level
     */
    protected int getOriginalArgListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(3);
    }
    /**
     * Retrieves the OriginalArg list.
     * @return The node representing the OriginalArg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getOriginalArgs() {
        return getOriginalArgList();
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgsNoTransform() {
        return getOriginalArgListNoTransform();
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2344
     */
    @ASTNodeAnnotation.Attribute
    public abstract CValue scalarReduceStartValue();
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2382
     */
    @ASTNodeAnnotation.Attribute
    public abstract boolean selectLesser();
    /**
     * @attribute syn
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1454
     */
    @ASTNodeAnnotation.Attribute
    public abstract FRelExp createCompareNode(FExp x, FExp y);
    /**
     * @attribute syn
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:601
     */
    @ASTNodeAnnotation.Attribute
    public abstract FExp scalarReduceExp(FExp reducer, FExp scalar);
    /**
     * @attribute syn
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:414
     */
    @ASTNodeAnnotation.Attribute
    public abstract String compareSign_CAD();
    /**
     * Delegate attribute for ceval().
     * 
     * This needs to be overridden for subclasses of FExp.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2131
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                if (hasY()) {
                  CValue x = getX().ceval(evaluator);
                  CValue y = getY().ceval(evaluator);
                  boolean selectX = type().lt(x, y).booleanValue() ^ !selectLesser();
                  return selectX ? x : y;
                } else {
                    if (getX().size().evaluated().isUnknown())
                        return CValue.UNKNOWN;
                  Iterator<FExp> it = getX().getArray().iteratorFExp();
                  boolean less = selectLesser();
                  CValue sel = it.next().ceval(evaluator);
                  while (it.hasNext()) {
                      CValue val = it.next().ceval(evaluator);
                      if (type().lt(val, sel).booleanValue() ^ !less)
                          sel = val;
                  }
                  return sel;
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = hasY() ? FExp.nominalMax(getX(), getY()) : getX().nominal();

        return nominal_value;
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
        type_value = hasY() ? 
                    getX().type().scalarType().typePromotion(getY().type().scalarType()) : 
                    getX().type().scalarType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean checkTypeAsExpression() {
        ASTNode$State state = state();
        boolean checkTypeAsExpression_value = true;

        return checkTypeAsExpression_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = getX().size().isUnknown();

        return extractTemp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractAsUnknown() {
        ASTNode$State state = state();
        boolean extractAsUnknown_value = getX().size().isUnknown();

        return extractAsUnknown_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:303
     * @apilevel internal
     */
    public boolean Define_iterExpUseOK(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:666
     * @apilevel internal
     */
    public boolean Define_iterExpMustBeScalar(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1294
     * @apilevel internal
     */
    public boolean Define_argumentDefinedTypeValid(ASTNode caller, ASTNode child) {
        if (caller == getOriginalArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return false;
        }
        else {
            return super.Define_argumentDefinedTypeValid(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1326
     * @apilevel internal
     */
    public boolean Define_argumentTypeValid(ASTNode caller, ASTNode child, FType type) {
        if (caller == getOriginalArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return hasY() != getOriginalArg(i).getFExp().isArray() && type.isPrimitive();
        }
        else {
            return super.Define_argumentTypeValid(caller, child, type);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1362
     * @apilevel internal
     */
    public String Define_expectedArgumentType(ASTNode caller, ASTNode child) {
        if (caller == getOriginalArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return (hasY() ? "scalar" : "array of") + " Real, Integer, Boolean, String or enumeration";
        }
        else {
            return super.Define_expectedArgumentType(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
