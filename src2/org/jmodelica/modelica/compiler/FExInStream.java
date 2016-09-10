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
 * Expanded version of FInStream, used temporarily during symbolic manipulations.
 * 
 * Var list contains triples of: 
 * - flow var access
 * - stream contribution (inStream() expression or var access)
 * - is this connection to an outside connector (bool literal)
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1752
 * @production FExInStream : {@link FBuiltInFunctionCall} ::= <span class="component">Default:{@link FExp}</span> <span class="component">Eps:{@link FExp}</span> <span class="component">Var:{@link FExp}*</span>;

 */
public class FExInStream extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1169
     */
    public FExInStream createEmptyNode()      { return new FExInStream();      }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:120
     */
    public void enableExpandedInStreamRewrite() {
        super.enableExpandedInStreamRewrite();
        rewriteExpandedInStream = true;
        is$Final = false;
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:132
     */
    protected boolean rewriteExpandedInStream = false;
    /**
     * An iterable over all stream/flow pairs that contribute to this inStream().
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:194
     */
    
        /**
         * An iterable over all stream/flow pairs that contribute to this inStream().
         */
        public Iterable<InStreamPart> contributors() {
            return new ContributorIterable();
        }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:198
     */
    
        
        public class InStreamPart {
            public final FExp flow;
            public final FExp stream;
            public final boolean outside;

            public InStreamPart(int i) {
                flow = flowExp(i);
                stream = streamExp(i);
                outside = isOutside(i);
            }

            public boolean contributes() {
                if (outside) {
                    return flow.maxRealValue() > 0;
                } else {
                    return flow.minRealValue() < 0;
                }
            }
        }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:218
     */
    

        private class ContributorIterable implements Iterable<InStreamPart> {
            private int n = numVars();
            
            public Iterator<InStreamPart> iterator() {
                return new ContributorIterator();
            }

            private class ContributorIterator implements Iterator<InStreamPart> {
                private int i;
                private InStreamPart next;

                public ContributorIterator() {
                    i = -1;
                    step();
                }

                public boolean hasNext() {
                    return i < n;
                }

                public InStreamPart next() {
                    InStreamPart res = next;
                    step();
                    return res;
                }
                
                public void remove() {
                    throw new UnsupportedOperationException();
                }

                private void step() {
                    do {
                        i++;
                        next = (i < n) ? new InStreamPart(i) : null;
                    } while (i < n && !next.contributes());
                }
            }
        }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1860
     */
    public FExInStream scalarizeExp(Map<String,FExp> indexMap) {
        FExInStream res = new FExInStream(getDefault().scalarize(indexMap), getEps().scalarize(indexMap), new List<FExp>());
        for (FExp e : getVars()) {
            res.addVarNoTransform(e.scalarize(indexMap));
        }
        return res;
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:478
     */
    public FExp diff(String name) {
        if (name.equals(FExp.TIME)) {
            return new FDerStream(copySymbolic());
        }
        return super.diff(name);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FExInStream() {
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
        children = new ASTNode[5];
        setChild(new List(), 2);
        setChild(new List(), 4);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FExInStream(FExp p0, FExp p1, List<FExp> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:51
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public FExInStream clone() throws CloneNotSupportedException {
        FExInStream node = (FExInStream) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public FExInStream copy() {
        try {
            FExInStream node = (FExInStream) clone();
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
     * @declaredat ASTNode:83
     */
    public FExInStream fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public FExInStream treeCopyNoTransform() {
        FExInStream tree = (FExInStream) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 3:
                    tree.children[i] = null;
                    continue;
                case 4:
                    tree.children[i] = new List();
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
     * @declaredat ASTNode:120
     */
    public FExInStream treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:127
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Default child.
     * @param node The new node to replace the Default child.
     * @apilevel high-level
     */
    public void setDefault(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Default child.
     * @return The current node used as the Default child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Default")
    public FExp getDefault() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Default child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Default child.
     * @apilevel low-level
     */
    public FExp getDefaultNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the Eps child.
     * @param node The new node to replace the Eps child.
     * @apilevel high-level
     */
    public void setEps(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Eps child.
     * @return The current node used as the Eps child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Eps")
    public FExp getEps() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the Eps child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Eps child.
     * @apilevel low-level
     */
    public FExp getEpsNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Replaces the Var list.
     * @param list The new list node to be used as the Var list.
     * @apilevel high-level
     */
    public void setVarList(List<FExp> list) {
        setChild(list, 2);
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
    public FExp getVar(int i) {
        return (FExp) getVarList().getChild(i);
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
    public void addVar(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getVarListNoTransform() : getVarList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addVarNoTransform(FExp node) {
        List<FExp> list = getVarListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Var list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setVar(FExp node, int i) {
        List<FExp> list = getVarList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Var list.
     * @return The node representing the Var list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Var")
    public List<FExp> getVarList() {
        List<FExp> list = (List<FExp>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Var list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Var list.
     * @apilevel low-level
     */
    public List<FExp> getVarListNoTransform() {
        return (List<FExp>) getChildNoTransform(2);
    }
    /**
     * Retrieves the Var list.
     * @return The node representing the Var list.
     * @apilevel high-level
     */
    public List<FExp> getVars() {
        return getVarList();
    }
    /**
     * Retrieves the Var list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Var list.
     * @apilevel low-level
     */
    public List<FExp> getVarsNoTransform() {
        return getVarListNoTransform();
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 3;
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
        return 4;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(4);
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
        ndims_value = expDefiningSize().ndims();
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp expDefiningSize() {
        ASTNode$State state = state();
        FExp expDefiningSize_value = (numVars() > 0) ? streamExp(0) : getDefault();

        return expDefiningSize_value;
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
        size_value = expDefiningSize().size();
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
            if (!isArray()) {
                return super.getArray();
            }
            Array arr = new Array(indices());
            for (Index i : arr.indices()) {
                FExInStream cell = new FExInStream(getDefault().getArray().get(i).treeCopy(), getEps().treeCopy(), new List<FExp>());
                for (FExp e : getVars()) {
                    Index j = (e.ndims() < i.ndims()) ? i.partIndex(0, e.ndims()) : i;
                    cell.addVarNoTransform(e.getArray().get(j).treeCopy());
                }
                arr.set(i, cell);
            }
            return arr;
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
                int n = 0;
                for (InStreamPart cont : contributors()) {
                    n++;
                    break;
                }
                if (n == 0) {
                    return getDefault().ceval(evaluator);
                } else if (n == 1) {
                    return contributors().iterator().next().stream.ceval(evaluator);
                } else {
                    double eps = -1.0;
                    double val = 0.0;
                    double sum = 0.0;
                    double div = 0.0;
                    for (InStreamPart cont : contributors()) {
                        double flow = cont.flow.ceval(evaluator).realValue();
                        if (!cont.outside) {
                            flow = -flow;
                        }
                        if (eps < 0.0) {
                            eps = getEps().ceval(evaluator).realValue();
                        }
                        flow = Math.max(flow, eps);
                        sum += flow * cont.stream.ceval(evaluator).realValue();
                        div += flow;
                    }
                    return new CValueReal(sum / div);
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String builtInName() {
        ASTNode$State state = state();
        String builtInName_value = "inStreamExpansion";

        return builtInName_value;
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
        type_value = fRealType(size());
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
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
                FTypePrefixVariability stream = getDefault().variability();
                FTypePrefixVariability total = fConstant();
                int n = 0;
                for (InStreamPart cont : contributors()) {
                    stream = cont.stream.variability();
                    total = total.combine(stream).combine(cont.flow.variability());
                    n++;
                }
                if (n < 2) {
                    return stream;
                } else {
                    return total;
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsLaterInStreamRewrite() {
        ASTNode$State state = state();
        boolean needsLaterInStreamRewrite_value = true;

        return needsLaterInStreamRewrite_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numVars() {
        ASTNode$State state = state();
        int numVars_value = getNumVar() / 3;

        return numVars_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp flowExp(int i) {
        ASTNode$State state = state();
        FExp flowExp_int_value = getVar(i * 3);

        return flowExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp streamExp(int i) {
        ASTNode$State state = state();
        FExp streamExp_int_value = getVar(i * 3 + 1);

        return streamExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp isOutsideExp(int i) {
        ASTNode$State state = state();
        FExp isOutsideExp_int_value = getVar(i * 3 + 2);

        return isOutsideExp_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutside(int i) {
        ASTNode$State state = state();
        boolean isOutside_int_value = isOutsideExp(i).ceval().booleanValue();

        return isOutside_int_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:148
        if (rewriteExpandedInStream) {
            state().duringConnections++;
            ASTNode result = rewriteRule0();
            state().duringConnections--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:148
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            FExp stream = getDefault().treeCopy();
            FExp sum = null;
            FExp div = null;
            FExp eps = getEps();
            int n = 0;
            for (InStreamPart cont : contributors()) {
                stream = cont.stream.treeCopy();
                FExp flow = cont.flow.treeCopy();
                if (!cont.outside) {
                    flow = new FNegExp(flow);
                }
                FExp divP = new FMaxExp(flow, new Opt(eps.treeCopyNoTransform()));
                FExp sumP = new FMulExp(divP.treeCopyNoTransform(), stream);
                if (sum == null) {
                    sum = sumP;
                    div = divP;
                } else {
                    sum = new FAddExp(sum, sumP);
                    div = new FAddExp(div, divP);
                }
                n++;
            }
            if (n < 2) {
                return stream;
            } else {
                return new FDivExp(sum, div);
            }
        }    }
}
