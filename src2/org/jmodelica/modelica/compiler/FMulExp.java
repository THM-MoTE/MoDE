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
 * Multiplicative expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:926
 * @production FMulExp : {@link FDotMulExp};

 */
public class FMulExp extends FDotMulExp implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1353
     */
    protected FExp composeMulScalarCellExp(Index i) {
		return vectorMultiplication(getLeft().getArray().leftMulIterator(i), 
		                            getRight().getArray().rightMulIterator(i), type());
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1034
     */
    public FMulExp createEmptyNode()       { return new FMulExp();       }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:673
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (type().isOperatorRecord() && !isElementWise()) {
            int left = getLeft().size().get(1);
            int inner = (left == Size.UNKNOWN) ? getRight().size().get(0) : left;
            if ((inner == 0 || inner == Size.UNKNOWN) && type().matchOverloadedZero() == null) 
                error("Matrix multiplication of operator records with an inner dimension of 0 or : requires that an '0' operator is defined");
        }
        getLeft().size().forceVariability(checkType, fStructParameter());
        getRight().size().forceVariability(checkType, fStructParameter());
        super.typeCheck(checkType);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1606
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
		if (getLeft().isArray() && !isArray()) 
			return dynamicFExp(composeMulScalarCellExp(Index.NULL)).scalarize(indexMap);
		else
			return super.scalarizeExp(indexMap);
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:412
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        ForNames names = s.getNames();
        FIdUseExp sum = new FIdUseExp(calcTempVarName());
        s.addTempVar(type().scalarType(), sum.name());
        
        names.addLayer(ndims());
        names.fillLayer(this);
        
        // Set up indices for the left operand
        FExp exp = getLeft();
        names.addLayer(exp.ndims());
        if (names.size() > 1)
            names.promote(0);
        String i = names.create(this);
        
        // Create inner loop
        FForStmt fs = new FForStmt(new FForIndex(i, getRight().size().createFExp(0)), new List());
        List<FStatement> inner = fs.getForStmts();
        
        // Scalarize left operand
        exp.createArrayTemporaries(s);
        exp.addArrayUsesToIndexMap(s);
        FExp left = exp.scalarize(s);
        names.removeLayer();
        
        // Set up indices and scalarize the right operand
        exp = getRight();
        names.addLayer(exp.ndims());
        names.add(i);
        if (names.size() > 1)
            names.promote(ndims() - 1);
        exp.createArrayTemporaries(s);
        exp.addArrayUsesToIndexMap(s);
        FExp right = exp.scalarize(s);
        names.removeLayer();
        
        // Add statement updating temp var to loop
        FExp mul = new FMulExp(left, right);
        FExp add = new FAddExp(sum.fullCopy(), mul);
        inner.add(new FAssignStmt(sum.fullCopy(), add));
        
        // Create outer loops
        List<FStatement> outer = s.createForLoops(this);
        outer.add(new FAssignStmt(sum, type().scalarType().zeroLiteral()));
        outer.add(fs);
        outer.add(new FAssignStmt(names.createUseWithSubscripts(tempVarName()), sum.fullCopy()));
        
        names.removeLayer();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FMulExp() {
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
        children = new ASTNode[3];
    }
    /**
     * @declaredat ASTNode:13
     */
    public FMulExp(FExp p0, FExp p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:20
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:26
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:32
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        getArray_reset();
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
    public FMulExp clone() throws CloneNotSupportedException {
        FMulExp node = (FMulExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FMulExp copy() {
        try {
            FMulExp node = (FMulExp) clone();
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
    public FMulExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public FMulExp treeCopyNoTransform() {
        FMulExp tree = (FMulExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
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
     * @declaredat ASTNode:113
     */
    public FMulExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:120
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Left child.
     * @param node The new node to replace the Left child.
     * @apilevel high-level
     */
    public void setLeft(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Left child.
     * @return The current node used as the Left child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Left")
    public FExp getLeft() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Left child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Left child.
     * @apilevel low-level
     */
    public FExp getLeftNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the Right child.
     * @param node The new node to replace the Right child.
     * @apilevel high-level
     */
    public void setRight(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Right child.
     * @return The current node used as the Right child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Right")
    public FExp getRight() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the Right child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Right child.
     * @apilevel low-level
     */
    public FExp getRightNoTransform() {
        return (FExp) getChildNoTransform(1);
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
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:476
     */
    private FTypePrefixVariability refined_Variability_FMulExp_expVariability()
{
        // Refined by variability propagation
        return super.expVariability();
    }
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
        ndims_value = ndims_compute();
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
    private int ndims_compute() {
            int left = getLeft().ndims();
            int right = getRight().ndims();
            if (isElementWise())
                return Math.max(left, right);
            if (left > 2 || right > 2)
                return -1;
            return left + right - 2;
        }
    @ASTNodeAnnotation.Attribute
    public boolean isElementWise() {
        ASTNode$State state = state();
        boolean isElementWise_value = (getLeft().ndims() * getRight().ndims() == 0);

        return isElementWise_value;
    }
    /**
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:676
     */
    @ASTNodeAnnotation.Attribute
    public Size sizeBase() {
        ASTNode$State state = state();
        try {
                if (!getLeft().isArray())
                    return getRight().size();
                if (!getRight().isArray())
                    return getLeft().size();
                if (!isArray())
                    return Size.SCALAR;
                MutableSize s = new MutableSize(ndims());
                if (getLeft().ndims() == 2)
                    s.append(getLeft().size(), 0);
                if (getRight().ndims() == 2)
                    s.append(getRight().size(), 1);
                return s;
            }
        finally {
        }
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
    		if (isElementWise())
    			return super.getArray();
            if (useTempVar())
                return createTempArray();
    		if (!isArray())
    			return new ScalarAsArray(composeMulScalarCellExp(Index.NULL));
    		
    		Array res = new Array(indices());
    		for (Index i : res.indices()) 
    			res.set(i, composeMulScalarCellExp(i));
    		return res;
    	}
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
                if (isElementWise() || isArray())
                  return super.cevalCalc(evaluator);
                
                FType t = type();
                CValue sum = new CValueInteger(0);
                CValueArray l = getLeft().ceval(evaluator).array();
                CValueArray r = getRight().ceval(evaluator).array();
                for (Index i : l.indices())
                  sum = t.add(sum, t.mul(l.getCell(i), r.getCell(i)));
                return sum;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDotOp() {
        ASTNode$State state = state();
        boolean isDotOp_value = false;

        return isDotOp_value;
    }
    @ASTNodeAnnotation.Attribute
    public String op() {
        ASTNode$State state = state();
        String op_value = " * ";

        return op_value;
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
        type_value = type_compute();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @apilevel internal
     */
    private FType type_compute() {
            FType res = null;
            if (ndims() < 0)
                return fUnknownType();
            if (isElementWise())
                return super.type();
            Size left = getLeft().size();
            Size right = getRight().size();
            if (shouldUseOverloadedOperator()) {
                res = getLeft().type().matchOverloadedOperatorType(getRight().type(), operatorName());
                if (!res.isUnknown())
                    return res;
            }
            if (!left.equivalentDim(right, inFunction(), left.ndims() - 1, 0))
                return fUnknownType();
            if (left.ndims() > 2 || right.ndims() > 2)
                return fUnknownType();
            if (left.ndims() == 1 && right.ndims() > 0 && shouldUseOverloadedOperator())
                return fUnknownType();
            res = getLeft().type().scalarNumericPromotion(getRight().type(), operatorName());
            if (left.ndims() == 1 && right.ndims() == 1) 
                return res;
            else
                return res.arrayType(size());
        }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = taggedByVProp ? fConstant() : refined_Variability_FMulExp_expVariability();

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public String operatorFormatted() {
        ASTNode$State state = state();
        String operatorFormatted_value = "*";

        return operatorFormatted_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = !isElementWise() && extractAsUnknown();

        return extractTemp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractAsUnknown() {
        ASTNode$State state = state();
        boolean extractAsUnknown_value = getLeft().size().isUnknown() || getRight().size().isUnknown();

        return extractAsUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Mul";

        return xmlTag_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3151
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child) {
        if (caller == getRightNoTransform()) {
            return (getLeft().isConstantExp() || getLeft().isLinearParameterExp())?
                            isLinear() : false;
        }
        else if (caller == getLeftNoTransform()) {
            return (getRight().isConstantExp() || getRight().isLinearParameterExp())?
                            isLinear() : false;
        }
        else {
            return getParent().Define_isLinear(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        if (caller == getRightNoTransform()) {
            return getLeft().isIndependent(vars) && isLinear(vars);
        }
        else if (caller == getLeftNoTransform()) {
            return getRight().isIndependent(vars) && isLinear(vars);
        }
        else {
            return getParent().Define_isLinear(this, caller, vars);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:613
     * @apilevel internal
     */
    public FExp Define_myTopFactorFExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return topFactorFExp();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
