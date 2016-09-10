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
 * Dynamic resolver used during index reduction. Variables and equations are
 * temporarily inserted into this node.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1782
 * @production FIndexReductionResolver : {@link FDynamicResolver} ::= <span class="component">&lt;FClass:FClass&gt;</span> <span class="component">[{@link FVariable}]</span> <span class="component">[{@link FAbstractEquation}]</span>;

 */
public class FIndexReductionResolver extends FDynamicResolver implements Cloneable {
    /**
     * @aspect JastAddHacks
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2150
     */
    
        
        private final Map<String, FVariable> lookupMap = new HashMap<String, FVariable>();
    /**
     * This method takes a variable and adds it to the tree. This is done by
     * settings its parent to the same parent as this node.
     * It also adds it to the list of variables to resolve when myFV is called.
     * @aspect JastAddHacks
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2156
     */
    
        /**
         * This method takes a variable and adds it to the tree. This is done by
         * settings its parent to the same parent as this node.
         * It also adds it to the list of variables to resolve when myFV is called.
         */
        public <V extends FVariable> V dynamicVariable(V var) {
            lookupMap.put(var.name(), var);
            getFVariableOpt().setChild(var, 0);
            return (V) getFVariableOpt().getChild(0);
        }
    /**
     * This method takes an equation and adds it to the tree. This is done by
     * settings its parent to the same parent as this node.
     * @aspect JastAddHacks
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2166
     */
    
        
        /**
         * This method takes an equation and adds it to the tree. This is done by
         * settings its parent to the same parent as this node.
         */
        public <V extends FAbstractEquation> V dynamicEquation(V eqn) {
            getFAbstractEquationOpt().setChild(eqn, 0);
            return (V) getFAbstractEquationOpt().getChild(0);
        }
    /**
     * @declaredat ASTNode:1
     */
    public FIndexReductionResolver() {
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
        setChild(new Opt(), 0);
        setChild(new Opt(), 1);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FIndexReductionResolver(FClass p0) {
        setFClass(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 0;
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
        getFVariableOpt_reset();
        getFAbstractEquationOpt_reset();
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
    public FIndexReductionResolver clone() throws CloneNotSupportedException {
        FIndexReductionResolver node = (FIndexReductionResolver) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FIndexReductionResolver copy() {
        try {
            FIndexReductionResolver node = (FIndexReductionResolver) clone();
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
    public FIndexReductionResolver fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public FIndexReductionResolver treeCopyNoTransform() {
        FIndexReductionResolver tree = (FIndexReductionResolver) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 0:
                case 1:
                    tree.children[i] = new Opt();
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
     * @declaredat ASTNode:114
     */
    public FIndexReductionResolver treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:121
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenFClass_FClass == ((FIndexReductionResolver)node).tokenFClass_FClass);    
    }
    /**
     * Replaces the lexeme FClass.
     * @param value The new value for the lexeme FClass.
     * @apilevel high-level
     */
    public void setFClass(FClass value) {
        tokenFClass_FClass = value;
    }
    /**
     * @apilevel internal
     */
    protected FClass tokenFClass_FClass;
    /**
     * Retrieves the value for the lexeme FClass.
     * @return The value for the lexeme FClass.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="FClass")
    public FClass getFClass() {
        return tokenFClass_FClass;
    }
    /**
     * Replaces the (optional) FVariable child.
     * @param node The new node to be used as the FVariable child.
     * @apilevel high-level
     */
    public void setFVariable(FVariable node) {
        getFVariableOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FVariable child exists.
     * @return {@code true} if the optional FVariable child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFVariable() {
        return getFVariableOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FVariable child.
     * @return The FVariable child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FVariable getFVariable() {
        return (FVariable) getFVariableOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child FVariable. This is the <code>Opt</code> node containing the child FVariable, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FVariable.
     * @apilevel low-level
     */
    public Opt<FVariable> getFVariableOptNoTransform() {
        return (Opt<FVariable>) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child FVariable.
     * @return The the child position of the optional child FVariable.
     * @apilevel low-level
     */
    protected int getFVariableOptChildPosition() {
        return 0;
    }
    /**
     * Replaces the (optional) FAbstractEquation child.
     * @param node The new node to be used as the FAbstractEquation child.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node) {
        getFAbstractEquationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FAbstractEquation child exists.
     * @return {@code true} if the optional FAbstractEquation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FAbstractEquation child.
     * @return The FAbstractEquation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FAbstractEquation getFAbstractEquation() {
        return (FAbstractEquation) getFAbstractEquationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child FAbstractEquation. This is the <code>Opt</code> node containing the child FAbstractEquation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FAbstractEquation.
     * @apilevel low-level
     */
    public Opt<FAbstractEquation> getFAbstractEquationOptNoTransform() {
        return (Opt<FAbstractEquation>) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child FAbstractEquation.
     * @return The the child position of the optional child FAbstractEquation.
     * @apilevel low-level
     */
    protected int getFAbstractEquationOptChildPosition() {
        return 1;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFVariableOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getFVariableOpt_value;
    /**
     * @apilevel internal
     */
    private void getFVariableOpt_reset() {
        getFVariableOpt_computed = false;
        getFVariableOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getFVariableOpt() {
        if(getFVariableOpt_computed) {
            return (Opt) getChild(getFVariableOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFVariableOpt_value = new DynamicOpt();
        setChild(getFVariableOpt_value, getFVariableOptChildPosition());
        if (true) {
            getFVariableOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt node = (Opt) this.getChild(getFVariableOptChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFAbstractEquationOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getFAbstractEquationOpt_value;
    /**
     * @apilevel internal
     */
    private void getFAbstractEquationOpt_reset() {
        getFAbstractEquationOpt_computed = false;
        getFAbstractEquationOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getFAbstractEquationOpt() {
        if(getFAbstractEquationOpt_computed) {
            return (Opt) getChild(getFAbstractEquationOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFAbstractEquationOpt_value = new DynamicOpt();
        setChild(getFAbstractEquationOpt_value, getFAbstractEquationOptChildPosition());
        if (true) {
            getFAbstractEquationOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt node = (Opt) this.getChild(getFAbstractEquationOptChildPosition());
        return node;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:31
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        {
                FVariable var = lookupMap.get(fqn.name());
                if (var != null)
                    return var;
                return getFClass().lookupFV(fqn);
            }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
