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
 * Expressions of the form "(exp) for i in (exp)" in instance and flat tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1075
 * @production FIterExp : {@link FAbstractArrayExp} ::= <span class="component">{@link FExp}</span> <span class="component">ForIndex:{@link CommonForIndex}*</span>;

 */
public class FIterExp extends FAbstractArrayExp implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1549
     */
    public FExp extract(Index i) {
		FExp exp = getFExp().getArray().get(i).fullCopy();
		List fil = (List) getForIndexList().fullCopy();
		return new FIterExp(exp, fil);
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1109
     */
    public FIterExp createEmptyNode()        { return new FIterExp();        }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1976
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		p.print(getFExp(), str, indent);
		str.print(" for ");
		for (int i = getNumForIndex() - 1; i >= 0; i--) {
			p.print(getForIndex(i), str, indent);
			if (i > 0)
				str.print(", ");
		}
	}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:311
     */
    public void contentCheck(ErrorCheckType checkType) {
		if (!iterExpUseOK())
			error("Reduction-expressions are only allowed with sum(), min(), max() and product()");
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1218
     */
    public void collectErrors(ErrorCheckType checkType) {
	    collectErrorsInFor(getFExp(), getForIndexList(), checkType);
	}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:685
     */
    public void typeCheck(ErrorCheckType checkType) {
	  super.typeCheck(checkType);
	  if (iterExpMustBeScalar() && !getFExp().type().isUnknown() && getFExp().ndims() != 0)
		  error("The expression of a reduction-expression must be scalar, except for sum(): " +
				  getFExp() + " has " + getFExp().ndims() + " dimension(s)");
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2341
     */
    public FArray flattenArray(FQName prefix) {
        Iterable<CommonForIndex> forIndices = getForIndexs();
        Indices ind = Indices.create(forIndices);
        FArray res = flattenArray(prefix, forIndices, ind, ind.iterator(), ind.size(), 0);
        for (CommonForIndex fi : forIndices) {
            fi.clearEvaluationValue();
        }
        return res;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2351
     */
    public FArray flattenArray(FQName prefix, Iterable<CommonForIndex> forIndices, Indices ind, Iterator<Index> indIt, Size s, int dim) {
        List<FExp> l = new List<FExp>();
        if (dim == s.ndims() - 1) {
            for (int i = 0; i < s.get(dim); i++) {
                ind.translate(indIt.next()).setValues(forIndices);
                getFExp().flushAllRecursive();
                l.add(getFExp().flatten(prefix));
            }
        } else {
            for (int i = 0; i < s.get(dim); i++) {
                l.add(flattenArray(prefix, forIndices, ind, indIt, s, dim+1));
            }
        }
        return new FArray(l);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2378
     */
    public FExp flatten(FQName prefix) {
        List<CommonForIndex> fil = new List<CommonForIndex>();
        for (CommonForIndex fi : getForIndexList())
            fil.add(fi.flatten(prefix));
        return new FIterExp(getFExp().flatten(prefix), fil);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1687
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
		return getFExp().scalarize(indexMap);
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:633
     */
    public boolean editNamesIter(Scalarizer s) {
        ForNames names = s.getNames();
        Map<String,FExp> indexMap = s.map();
        int i = 0;
        for (; i < getNumForIndex(); i++) {
            indexMap.put(getForIndex(i).name(), new FIdUseExp(names.get(i)));
        }
        names.addLayer(getFExp().ndims());
        for (; i < getFExp().ndims() + getNumForIndex(); i++) {
            names.promote(i);
        }
        return true;
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:734
     */
    public FExp diff(String name) {
        return dynamicFExp(new FIterExp(getFExp().diff(name), getForIndexs().treeCopy()));
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIterExp() {
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
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FIterExp(FExp p0, List<CommonForIndex> p1) {
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
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        localSize_reset();
        createArray_reset();
        getArray_reset();
        type_reset();
        lookupInstComponent_String_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:52
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FIterExp clone() throws CloneNotSupportedException {
        FIterExp node = (FIterExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FIterExp copy() {
        try {
            FIterExp node = (FIterExp) clone();
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
     * @declaredat ASTNode:84
     */
    public FIterExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FIterExp treeCopyNoTransform() {
        FIterExp tree = (FIterExp) copy();
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
     * @declaredat ASTNode:118
     */
    public FIterExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:125
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FExp child.
     * @param node The new node to replace the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FExp child.
     * @return The current node used as the FExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FExp")
    public FExp getFExp() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the FExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FExp child.
     * @apilevel low-level
     */
    public FExp getFExpNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the ForIndex list.
     * @param list The new list node to be used as the ForIndex list.
     * @apilevel high-level
     */
    public void setForIndexList(List<CommonForIndex> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the ForIndex list.
     * @return Number of children in the ForIndex list.
     * @apilevel high-level
     */
    public int getNumForIndex() {
        return getForIndexList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ForIndex list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ForIndex list.
     * @apilevel low-level
     */
    public int getNumForIndexNoTransform() {
        return getForIndexListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ForIndex list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ForIndex list.
     * @apilevel high-level
     */
    public CommonForIndex getForIndex(int i) {
        return (CommonForIndex) getForIndexList().getChild(i);
    }
    /**
     * Check whether the ForIndex list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasForIndex() {
        return getForIndexList().getNumChild() != 0;
    }
    /**
     * Append an element to the ForIndex list.
     * @param node The element to append to the ForIndex list.
     * @apilevel high-level
     */
    public void addForIndex(CommonForIndex node) {
        List<CommonForIndex> list = (parent == null || state == null) ? getForIndexListNoTransform() : getForIndexList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addForIndexNoTransform(CommonForIndex node) {
        List<CommonForIndex> list = getForIndexListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ForIndex list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setForIndex(CommonForIndex node, int i) {
        List<CommonForIndex> list = getForIndexList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ForIndex list.
     * @return The node representing the ForIndex list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ForIndex")
    public List<CommonForIndex> getForIndexList() {
        List<CommonForIndex> list = (List<CommonForIndex>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ForIndex list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ForIndex list.
     * @apilevel low-level
     */
    public List<CommonForIndex> getForIndexListNoTransform() {
        return (List<CommonForIndex>) getChildNoTransform(1);
    }
    /**
     * Retrieves the ForIndex list.
     * @return The node representing the ForIndex list.
     * @apilevel high-level
     */
    public List<CommonForIndex> getForIndexs() {
        return getForIndexList();
    }
    /**
     * Retrieves the ForIndex list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ForIndex list.
     * @apilevel low-level
     */
    public List<CommonForIndex> getForIndexsNoTransform() {
        return getForIndexListNoTransform();
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
    		int exp = getFExp().ndims();
    		return (exp >= 0) ? exp + localNdims() : -1;
    	}
    @ASTNodeAnnotation.Attribute
    public int localNdims() {
        ASTNode$State state = state();
        int localNdims_value = getNumForIndex();

        return localNdims_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = size_compute();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    private Size size_compute() {
    		if (ndims() <= 0)
    			return Size.SCALAR;
    		MutableSize s = new MutableSize(ndims());
    		s.append(localSize());
    		s.append(getFExp().size());
    		return s;
    	}
    /**
     * @apilevel internal
     */
    protected boolean localSize_computed = false;
    /**
     * @apilevel internal
     */
    protected Size localSize_value;
    /**
     * @apilevel internal
     */
    private void localSize_reset() {
        localSize_computed = false;
        localSize_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size localSize() {
        if(localSize_computed) {
            return localSize_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        localSize_value = localSize_compute();
        if (isFinal && num == state().boundariesCrossed) {
            localSize_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return localSize_value;
    }
    /**
     * @apilevel internal
     */
    private Size localSize_compute() {
    		MutableSize s = new MutableSize(localNdims());
    		for (CommonForIndex fi : getForIndexList())
    			if (fi.hasFExp() && fi.getFExp().ndims() == 1)
    				s.append(fi.getFExp().size());
    		return s;
    	}
    /**
     * @apilevel internal
     */
    protected boolean createArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array createArray_value;
    /**
     * @apilevel internal
     */
    private void createArray_reset() {
        createArray_computed = false;
        createArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array createArray() {
        if(createArray_computed) {
            return createArray_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        createArray_value = getFExp().getArray().createExpanded(getForIndexList(), getFExp().myFClass() != null);
        if (isFinal && num == state().boundariesCrossed) {
            createArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return createArray_value;
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
        getArray_value = copyArray();
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
     * @attribute syn
     * @aspect CircularExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4682
     */
    @ASTNodeAnnotation.Attribute
    public boolean isCircularCalc() {
        ASTNode$State state = state();
        try {
        		if (getFExp().isCircular()) 
        			return true;
        		for (CommonForIndex i : getForIndexList()) 
        			if (i.hasFExp() && i.getFExp().isCircular()) 
        				return true;
        		return false;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:170
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable localLookupFV(FQName fqn) {
        ASTNode$State state = state();
        try {
        		String name = fqn.name();
        		for (CommonForIndex fi : getForIndexs()) {
        			if (fi instanceof FForIndex) {
        				FForIndex ffi = (FForIndex) fi;
        				if (ffi.getFVariable().name().equals(name)) 
        					return ffi.getFVariable();
        			}
        		}
        		return null;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIterExp() {
        ASTNode$State state = state();
        boolean isIterExp_value = true;

        return isIterExp_value;
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
            if (ndims() < 0)
                return fUnknownType();
            return getFExp().type().arrayType(size());
        }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:375
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability total;
                if (size().isUnknown())
                    total = getFExp().variability();
                else if (size().isEmpty())
                    total = fConstant();
                else
                    total = getArray().iteratorFExp().next().variability();
                
                for (CommonForIndex ind : getForIndexList())
                    if (ind.hasFExp())
                        total = total.combine(ind.getFExp().variability());
                return total;
            }
        finally {
        }
    }
    /**
     * \Return the expression corresponding to the given index in this array expression. 
     * 
     * Will not create new nodes unless necessary.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1402
     */
    @ASTNodeAnnotation.Attribute
    public FExp splitArrayExp(int index) {
        ASTNode$State state = state();
        try {
                Map<String,FExp> repl = new HashMap<String,FExp>();
                repl.put(getForIndex(0).name(), new FIntegerLitExp(index));
                FExp res = getFExp().fullCopy().replaceIndices(repl);
                if (getNumForIndex() > 1) {
                    List<CommonForIndex> indices = new List<CommonForIndex>();
                    for (int i = 1, n = getNumForIndex(); i < n; i++)
                        indices.add(getForIndex(i).fullCopy());
                    res = new FArray(new List(new FIterExp(res, indices)));
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1890
     */
    @ASTNodeAnnotation.Attribute
    public int iterExpDepth() {
        ASTNode$State state = state();
        int iterExpDepth_value = getParent().Define_iterExpDepth(this, null);

        return iterExpDepth_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:120
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_FQName_value = getParent().Define_lookupFV(this, null, fqn);

        return lookupFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:137
     */
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupOutermostFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupOutermostFV_FQName_value = getParent().Define_lookupOutermostFV(this, null, fqn);

        return lookupOutermostFV_FQName_value;
    }
    /**
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:303
     */
    @ASTNodeAnnotation.Attribute
    public boolean iterExpUseOK() {
        ASTNode$State state = state();
        boolean iterExpUseOK_value = getParent().Define_iterExpUseOK(this, null);

        return iterExpUseOK_value;
    }
    /**
     * Check if the FExp of this FIterExp must be scalar.
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:666
     */
    @ASTNodeAnnotation.Attribute
    public boolean iterExpMustBeScalar() {
        ASTNode$State state = state();
        boolean iterExpMustBeScalar_value = getParent().Define_iterExpMustBeScalar(this, null);

        return iterExpMustBeScalar_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:534
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
     * @attribute inh
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:886
     */
    @ASTNodeAnnotation.Attribute
    public boolean expandWithIterExp() {
        ASTNode$State state = state();
        boolean expandWithIterExp_value = getParent().Define_expandWithIterExp(this, null);

        return expandWithIterExp_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:805
     * @apilevel internal
     */
    public boolean Define_inIterExp(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_inIterExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:813
     * @apilevel internal
     */
    public Size Define_expandSizeForIterExp(ASTNode caller, ASTNode child, Size s) {
        if (caller == getFExpNoTransform()) {
            return expandSizeForIterExp(s.expand(localSize()));
        }
        else {
            return getParent().Define_expandSizeForIterExp(this, caller, s);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1859
     * @apilevel internal
     */
    public FArraySubscripts Define_collectIterExpSubscripts(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            {
            		FArraySubscripts res = collectIterExpSubscripts();
            		for (CommonForIndex i : getForIndexs())
            			res.addFSubscript(i.iterExpSubscript());
            		return res;
            	}
        }
        else {
            return getParent().Define_collectIterExpSubscripts(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1889
     * @apilevel internal
     */
    public int Define_iterExpDepth(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            return iterExpDepth() + 1;
        }
        else {
            return getParent().Define_iterExpDepth(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:31
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        {
        		FAbstractVariable res = localLookupFV(fqn);
        		return (res == null) ? lookupFV(fqn) : res;
        	}
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:26
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupOutermostFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        {
        		FAbstractVariable res = localLookupFV(fqn);
        		return (res == null) ? lookupOutermostFV(fqn) : res;
        	}
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
                for (CommonForIndex fi : getForIndexs()) 
                    if (fi.matches(name) && fi instanceof InstForIndex)
                        return InstLookupResult.<InstComponentDecl>found(((InstForIndex) fi).getInstPrimitive());
                return lookupInstComponent(name);
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:885
     * @apilevel internal
     */
    public boolean Define_expandWithIterExp(ASTNode caller, ASTNode child) {
        if (caller == getFExpNoTransform()) {
            return !size().isUnknown() || expandWithIterExp();
        }
        else {
            return getParent().Define_expandWithIterExp(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
