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
 * Composite variability. Represents variability of
 * records between flattening and scalarization.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:195
 * @production FCompositeVariability : {@link FTypePrefixVariability} ::= <span class="component">Component:{@link FComponentVariability}*</span>;

 */
public class FCompositeVariability extends FTypePrefixVariability implements Cloneable {
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:89
     */
    protected int variabilityLevel() { return combine().variabilityLevel(); }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:135
     */
    private Map<String,Integer> nameMap = null;
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:136
     */
    public FTypePrefixVariability component(String name) {
        if (nameMap==null) {
            nameMap = new HashMap<String,Integer>();
            for (int i = 0; i < getNumComponent(); i++) {
                nameMap.put(getComponent(i).getName(), i);
            }
        }
        return getComponent(nameMap.get(name)).getVariability();
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:564
     */
    @Override
    public FTypePrefixVariability combine(FTypePrefixVariability other) {
        return combine(other, upCombiner);
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:573
     */
    @Override
    public FTypePrefixVariability combineDown(FTypePrefixVariability other) {
        return combine(other, downCombiner);
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:585
     */
    
        protected static final Combiner upCombiner = new Combiner() {
            public FTypePrefixVariability combine(FTypePrefixVariability v1, FTypePrefixVariability v2) {
                return v1.combine(v2);
            }
        };
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:591
     */
    
        
        protected static final Combiner downCombiner = new Combiner() {
            public FTypePrefixVariability combine(FTypePrefixVariability v1, FTypePrefixVariability v2) {
                return v1.combineDown(v2);
            }
        };
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:603
     */
    public FTypePrefixVariability combine(FTypePrefixVariability other, Combiner combiner) {
        FTypePrefixVariability low = fContinuous();
        FTypePrefixVariability high = fConstant();
        boolean containsComposite = false;
        ArrayList<FComponentVariability> l = new ArrayList<FComponentVariability>();
        for (FComponentVariability fcv : getComponents()) {
            String name = fcv.getName();
            FTypePrefixVariability v = fcv.getVariability();
            FTypePrefixVariability nv = other.component(name);
            nv = v.combine(nv, combiner);
            l.add(new FComponentVariability(fcv.getName(), nv));
            low = low.combineDown(nv.combineDown());
            high = high.combine(nv.combine());
            containsComposite = containsComposite || nv.compositeVariability();
        }
        if (!containsComposite && low.equals(high))
            return low;
        return new FCompositeVariability(new List<FComponentVariability>(l));
    }
    /**
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:170
     */
    
        protected static Combiner propagateCombiner = new Combiner() {
            @Override
            public FTypePrefixVariability combine(FTypePrefixVariability v1, FTypePrefixVariability v2) {
                return v1.combinePropagate(v2);
            }
        };
    /**
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:185
     */
    
        protected static Combiner inheritCombiner = new Combiner() {
            @Override
            public FTypePrefixVariability combine(FTypePrefixVariability v1, FTypePrefixVariability v2) {
                return v1.combineInherit(v2);
            }
        };
    /**
     * @declaredat ASTNode:1
     */
    public FCompositeVariability() {
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
    public FCompositeVariability(List<FComponentVariability> p0) {
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
    public FCompositeVariability clone() throws CloneNotSupportedException {
        FCompositeVariability node = (FCompositeVariability) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public FCompositeVariability copy() {
        try {
            FCompositeVariability node = (FCompositeVariability) clone();
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
     * @declaredat ASTNode:76
     */
    public FCompositeVariability fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:85
     */
    public FCompositeVariability treeCopyNoTransform() {
        FCompositeVariability tree = (FCompositeVariability) copy();
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
     * @declaredat ASTNode:105
     */
    public FCompositeVariability treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:112
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Component list.
     * @param list The new list node to be used as the Component list.
     * @apilevel high-level
     */
    public void setComponentList(List<FComponentVariability> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Component list.
     * @return Number of children in the Component list.
     * @apilevel high-level
     */
    public int getNumComponent() {
        return getComponentList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Component list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Component list.
     * @apilevel low-level
     */
    public int getNumComponentNoTransform() {
        return getComponentListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Component list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Component list.
     * @apilevel high-level
     */
    public FComponentVariability getComponent(int i) {
        return (FComponentVariability) getComponentList().getChild(i);
    }
    /**
     * Check whether the Component list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasComponent() {
        return getComponentList().getNumChild() != 0;
    }
    /**
     * Append an element to the Component list.
     * @param node The element to append to the Component list.
     * @apilevel high-level
     */
    public void addComponent(FComponentVariability node) {
        List<FComponentVariability> list = (parent == null || state == null) ? getComponentListNoTransform() : getComponentList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addComponentNoTransform(FComponentVariability node) {
        List<FComponentVariability> list = getComponentListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Component list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setComponent(FComponentVariability node, int i) {
        List<FComponentVariability> list = getComponentList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Component")
    public List<FComponentVariability> getComponentList() {
        List<FComponentVariability> list = (List<FComponentVariability>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FComponentVariability> getComponentListNoTransform() {
        return (List<FComponentVariability>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    public List<FComponentVariability> getComponents() {
        return getComponentList();
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FComponentVariability> getComponentsNoTransform() {
        return getComponentListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public String toString() {
        ASTNode$State state = state();
        String toString_value = combine().toString();

        return toString_value;
    }
    @ASTNodeAnnotation.Attribute
    public String toStringLiteral() {
        ASTNode$State state = state();
        String toStringLiteral_value = combine().toStringLiteral();

        return toStringLiteral_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compositeVariability() {
        ASTNode$State state = state();
        boolean compositeVariability_value = true;

        return compositeVariability_value;
    }
    /**
     * Combines (up) component variabilities to a single primitive variability.
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:103
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combine() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability high = fConstant();
                for (FComponentVariability v : getComponents()) {
                    high = high.combine(v.getVariability().combine());
                }
                return high;
            }
        finally {
        }
    }
    /**
     * Combines (down) component variabilities to a single primitive variability.
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:118
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combineDown() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability high = fConstant();
                for (FComponentVariability v : getComponents()) {
                    high = high.combineDown(v.getVariability().combineDown());
                }
                return high;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combinePropagate(FTypePrefixVariability other) {
        ASTNode$State state = state();
        FTypePrefixVariability combinePropagate_FTypePrefixVariability_value = combine(other, propagateCombiner);

        return combinePropagate_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combineInherit(FTypePrefixVariability other) {
        ASTNode$State state = state();
        FTypePrefixVariability combineInherit_FTypePrefixVariability_value = combine(other, inheritCombiner);

        return combineInherit_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public String genJMIVariabilityConstant_C() {
        ASTNode$State state = state();
        String genJMIVariabilityConstant_C_value = null;

        return genJMIVariabilityConstant_C_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
