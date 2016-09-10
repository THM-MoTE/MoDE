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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:186
 * @production InstDefaultRecordModification : {@link InstRecordModification} ::= <span class="component">&lt;Arg:InstDefaultArgument&gt;</span>;

 */
public class InstDefaultRecordModification extends InstRecordModification implements Cloneable {
    /**
     * @declaredat ASTNode:1
     */
    public InstDefaultRecordModification() {
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
        setChild(new List(), 2);
    }
    /**
     * @declaredat ASTNode:15
     */
    public InstDefaultRecordModification(Modification p0, String p1, InstDefaultArgument p2) {
        setModification(p0);
        setName(p1);
        setArg(p2);
    }
    /**
     * @declaredat ASTNode:20
     */
    public InstDefaultRecordModification(Modification p0, Symbol p1, InstDefaultArgument p2) {
        setModification(p0);
        setName(p1);
        setArg(p2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:28
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        sourceInstMod_reset();
        getFExp_reset();
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
    public InstDefaultRecordModification clone() throws CloneNotSupportedException {
        InstDefaultRecordModification node = (InstDefaultRecordModification) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public InstDefaultRecordModification copy() {
        try {
            InstDefaultRecordModification node = (InstDefaultRecordModification) clone();
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
    public InstDefaultRecordModification fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public InstDefaultRecordModification treeCopyNoTransform() {
        InstDefaultRecordModification tree = (InstDefaultRecordModification) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 0:
                    tree.children[i] = null;
                    continue;
                case 1:
                case 2:
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
     * @declaredat ASTNode:124
     */
    public InstDefaultRecordModification treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:131
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenModification_Modification == ((InstDefaultRecordModification)node).tokenModification_Modification) && (tokenString_Name == ((InstDefaultRecordModification)node).tokenString_Name) && (tokenInstDefaultArgument_Arg == ((InstDefaultRecordModification)node).tokenInstDefaultArgument_Arg);    
    }
    /**
     * Replaces the lexeme Modification.
     * @param value The new value for the lexeme Modification.
     * @apilevel high-level
     */
    public void setModification(Modification value) {
        tokenModification_Modification = value;
    }
    /**
     * Retrieves the value for the lexeme Modification.
     * @return The value for the lexeme Modification.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Modification")
    public Modification getModification() {
        return tokenModification_Modification;
    }
    /**
     * Replaces the lexeme Name.
     * @param value The new value for the lexeme Name.
     * @apilevel high-level
     */
    public void setName(String value) {
        tokenString_Name = value;
    }
    /**
     * JastAdd-internal setter for lexeme Name using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Name
     * @apilevel internal
     */
    public void setName(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setName is only valid for String lexemes");
        tokenString_Name = (String)symbol.value;
        Namestart = symbol.getStart();
        Nameend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Name.
     * @return The value for the lexeme Name.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Name")
    public String getName() {
        return tokenString_Name != null ? tokenString_Name : "";
    }
    /**
     * Replaces the lexeme Arg.
     * @param value The new value for the lexeme Arg.
     * @apilevel high-level
     */
    public void setArg(InstDefaultArgument value) {
        tokenInstDefaultArgument_Arg = value;
    }
    /**
     * @apilevel internal
     */
    protected InstDefaultArgument tokenInstDefaultArgument_Arg;
    /**
     * Retrieves the value for the lexeme Arg.
     * @return The value for the lexeme Arg.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Arg")
    public InstDefaultArgument getArg() {
        return tokenInstDefaultArgument_Arg;
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
     * Retrieves the child position of the optional child FExp.
     * @return The the child position of the optional child FExp.
     * @apilevel low-level
     */
    protected int getFExpChildPosition() {
        return 0;
    }
    /**
     * Retrieves the number of children in the InstRecordModification list.
     * @return Number of children in the InstRecordModification list.
     * @apilevel high-level
     */
    public int getNumInstRecordModification() {
        return getInstRecordModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstRecordModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstRecordModification list.
     * @apilevel low-level
     */
    public int getNumInstRecordModificationNoTransform() {
        return getInstRecordModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstRecordModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstRecordModification list.
     * @apilevel high-level
     */
    public InstRecordModification getInstRecordModification(int i) {
        return (InstRecordModification) getInstRecordModificationList().getChild(i);
    }
    /**
     * Check whether the InstRecordModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstRecordModification() {
        return getInstRecordModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstRecordModification list.
     * @param node The element to append to the InstRecordModification list.
     * @apilevel high-level
     */
    public void addInstRecordModification(InstRecordModification node) {
        List<InstRecordModification> list = (parent == null || state == null) ? getInstRecordModificationListNoTransform() : getInstRecordModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstRecordModificationNoTransform(InstRecordModification node) {
        List<InstRecordModification> list = getInstRecordModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstRecordModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstRecordModification(InstRecordModification node, int i) {
        List<InstRecordModification> list = getInstRecordModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstRecordModification list.
     * @return The the child position of the InstRecordModification list.
     * @apilevel low-level
     */
    protected int getInstRecordModificationListChildPosition() {
        return 1;
    }
    /**
     * Retrieves the InstRecordModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstRecordModification list.
     * @apilevel low-level
     */
    public List<InstRecordModification> getInstRecordModificationListNoTransform() {
        return (List<InstRecordModification>) getChildNoTransform(1);
    }
    /**
     * Retrieves the InstRecordModification list.
     * @return The node representing the InstRecordModification list.
     * @apilevel high-level
     */
    public List<InstRecordModification> getInstRecordModifications() {
        return getInstRecordModificationList();
    }
    /**
     * Retrieves the InstRecordModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstRecordModification list.
     * @apilevel low-level
     */
    public List<InstRecordModification> getInstRecordModificationsNoTransform() {
        return getInstRecordModificationListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstArrayModification list.
     * @return Number of children in the InstArrayModification list.
     * @apilevel high-level
     */
    public int getNumInstArrayModification() {
        return getInstArrayModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstArrayModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstArrayModification list.
     * @apilevel low-level
     */
    public int getNumInstArrayModificationNoTransform() {
        return getInstArrayModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstArrayModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstArrayModification list.
     * @apilevel high-level
     */
    public InstArrayModification getInstArrayModification(int i) {
        return (InstArrayModification) getInstArrayModificationList().getChild(i);
    }
    /**
     * Check whether the InstArrayModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstArrayModification() {
        return getInstArrayModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstArrayModification list.
     * @param node The element to append to the InstArrayModification list.
     * @apilevel high-level
     */
    public void addInstArrayModification(InstArrayModification node) {
        List<InstArrayModification> list = (parent == null || state == null) ? getInstArrayModificationListNoTransform() : getInstArrayModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstArrayModificationNoTransform(InstArrayModification node) {
        List<InstArrayModification> list = getInstArrayModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstArrayModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstArrayModification(InstArrayModification node, int i) {
        List<InstArrayModification> list = getInstArrayModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstArrayModification list.
     * @return The the child position of the InstArrayModification list.
     * @apilevel low-level
     */
    protected int getInstArrayModificationListChildPosition() {
        return 2;
    }
    /**
     * Retrieves the InstArrayModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstArrayModification list.
     * @apilevel low-level
     */
    public List<InstArrayModification> getInstArrayModificationListNoTransform() {
        return (List<InstArrayModification>) getChildNoTransform(2);
    }
    /**
     * Retrieves the InstArrayModification list.
     * @return The node representing the InstArrayModification list.
     * @apilevel high-level
     */
    public List<InstArrayModification> getInstArrayModifications() {
        return getInstArrayModificationList();
    }
    /**
     * Retrieves the InstArrayModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstArrayModification list.
     * @apilevel low-level
     */
    public List<InstArrayModification> getInstArrayModificationsNoTransform() {
        return getInstArrayModificationListNoTransform();
    }
    @ASTNodeAnnotation.Attribute
    public boolean collectErrorsInBindingExp() {
        ASTNode$State state = state();
        boolean collectErrorsInBindingExp_value = false;

        return collectErrorsInBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDefaultRecordMod() {
        ASTNode$State state = state();
        boolean isDefaultRecordMod_value = true;

        return isDefaultRecordMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponentForBindingExp(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> lookupInstComponentForBindingExp_String_value = (sourceInstMod() != null) ? sourceInstMod().lookupInstComponent(name) : lookupInstComponentInSurrounding(name);

        return lookupInstComponentForBindingExp_String_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean sourceInstMod_computed = false;
    /**
     * @apilevel internal
     */
    protected InstModification sourceInstMod_value;
    /**
     * @apilevel internal
     */
    private void sourceInstMod_reset() {
        sourceInstMod_computed = false;
        sourceInstMod_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstModification sourceInstMod() {
        if(sourceInstMod_computed) {
            return sourceInstMod_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        sourceInstMod_value = sourceInstMod_compute();
        if (isFinal && num == state().boundariesCrossed) {
            sourceInstMod_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return sourceInstMod_value;
    }
    /**
     * @apilevel internal
     */
    private InstModification sourceInstMod_compute() {
            InstComponentDecl cmp = getArg().getFExp().findComponentWithThisBindingExp();
            return (cmp == null || cmp.myInstValueMod() == null) ? getArg().getFExp().surroundingInstModification() : cmp.myInstValueMod();
        }
    @ASTNodeAnnotation.Attribute
    public Modification modification() {
        ASTNode$State state = state();
        Modification modification_value = (sourceInstMod() != null) ? sourceInstMod().modification() : super.modification();

        return modification_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFExp_computed = false;
    /**
     * @apilevel internal
     */
    protected FExp getFExp_value;
    /**
     * @apilevel internal
     */
    private void getFExp_reset() {
        getFExp_computed = false;
        getFExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getFExp() {
        if(getFExp_computed) {
            return (FExp) getChild(getFExpChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFExp_value = getArg().getFExp().unboundCopy();
        setChild(getFExp_value, getFExpChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FExp node = (FExp) this.getChild(getFExpChildPosition());
        return node;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:441
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponentInSurrounding(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> lookupInstComponentInSurrounding_String_value = getParent().Define_lookupInstComponentInSurrounding(this, null, name);

        return lookupInstComponentInSurrounding_String_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return (sourceInstMod() != null) ? sourceInstMod().lookupInstClass(name) : lookupInstClass(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupInstComponentForBindingExp(name);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
