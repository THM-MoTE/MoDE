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
 * Record constructor in instance trees.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1194
 * @production InstRecordConstructor : {@link FAbstractFunctionCall} ::= <span class="component">Record:{@link InstAccess}</span> <span class="component">Arg:{@link InstFunctionArgument}*</span> <span class="component">{@link InstComponentDecl}*</span> <span class="component">{@link InstExtends}*</span> <span class="component">{@link InstModification}*</span>;

 */
public class InstRecordConstructor extends FAbstractFunctionCall implements Cloneable, AllInstComponentSource {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1116
     */
    public InstRecordConstructor createEmptyNode()   { return new InstRecordConstructor();   }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1792
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
        str.print(getRecord().name());
        str.print("(");
        getArgs().prettyPrintWithSep(p, str, "", ", ");
        str.print(")");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:213
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        getRecord().flattenMyRecord(fc);
        getArgs().flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2667
     */
    public FRecordConstructor flatten(FQName prefix) {
        List<FExp> args = new List();
        for (InstFunctionArgument ifa : getArgs()) {
            args.add(ifa.flatten(prefix));
        }
        return new FRecordConstructor(getRecord().flattenRecordName(), args);
    }
    /**
     * Add a new argument to list of arguments.
     * 
     * This implementation adds the argument to the original arguments 
     * and the expression from the argument as a child.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:218
     */
    public void addArgument(InstFunctionArgument arg) {
		addArg(arg);
	}
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:619
     */
    public void populateInstRecordModificationList(
            List<InstRecordModification> list, InstValueModification org) {
        Modification mod = org.modification();
        int i = 0;
        for (InstComponentDecl icd : getRecord().myInstClassDecl().allInstComponentDecls()) {
            list.add(getArg(i++).createInstRecordModification(mod, icd.name()));
        }
    }
    /**
     * Iterate over all components in this node and all InstExtends (recursively).
     * 
     * @return  an Iterable over the components
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2175
     */
    public Iterable<InstComponentDecl> allInstComponentDecls() {
        return new AllInstComponentIterable(this);
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:829
     */
    public FExp extractRecordFExp(String suffix) {
        InstLookupResult<InstComponentDecl> res = localLookupInstComponent(suffix);
        if (res.successful()) {
            int i = res.target().argIndexInRecordConstructor();
            if (i >= 0 && i < getNumArg()) {
                return getArg(i).getFExp().fullCopy();
            }
        }
        return super.extractRecordFExp(suffix);
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstRecordConstructor() {
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
        children = new ASTNode[6];
        setChild(new List(), 1);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
    }
    /**
     * @declaredat ASTNode:17
     */
    public InstRecordConstructor(InstAccess p0, List<InstFunctionArgument> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:24
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        genericLookupInstComponent_String_reset();
        localLookupInstComponent_String_reset();
        type_reset();
        getMergedEnvironment_reset();
        myEnvironment_def_String_reset();
        getInstComponentDeclList_reset();
        getInstExtendsList_reset();
        getInstModificationList_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:56
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public InstRecordConstructor clone() throws CloneNotSupportedException {
        InstRecordConstructor node = (InstRecordConstructor) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:69
     */
    public InstRecordConstructor copy() {
        try {
            InstRecordConstructor node = (InstRecordConstructor) clone();
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
     * @declaredat ASTNode:88
     */
    public InstRecordConstructor fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:97
     */
    public InstRecordConstructor treeCopyNoTransform() {
        InstRecordConstructor tree = (InstRecordConstructor) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
                    tree.children[i] = null;
                    continue;
                case 3:
                case 4:
                case 5:
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
     * @declaredat ASTNode:127
     */
    public InstRecordConstructor treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:134
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Record child.
     * @param node The new node to replace the Record child.
     * @apilevel high-level
     */
    public void setRecord(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Record child.
     * @return The current node used as the Record child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Record")
    public InstAccess getRecord() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the Record child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Record child.
     * @apilevel low-level
     */
    public InstAccess getRecordNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<InstFunctionArgument> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Arg list.
     * @return Number of children in the Arg list.
     * @apilevel high-level
     */
    public int getNumArg() {
        return getArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Arg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Arg list.
     * @apilevel low-level
     */
    public int getNumArgNoTransform() {
        return getArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Arg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Arg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getArg(int i) {
        return (InstFunctionArgument) getArgList().getChild(i);
    }
    /**
     * Check whether the Arg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasArg() {
        return getArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the Arg list.
     * @param node The element to append to the Arg list.
     * @apilevel high-level
     */
    public void addArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<InstFunctionArgument> getArgList() {
        List<InstFunctionArgument> list = (List<InstFunctionArgument>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgsNoTransform() {
        return getArgListNoTransform();
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
     * Retrieves the number of children in the InstComponentDecl list.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel high-level
     */
    public int getNumInstComponentDecl() {
        return getInstComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel low-level
     */
    public int getNumInstComponentDeclNoTransform() {
        return getInstComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstComponentDecl list.
     * @apilevel high-level
     */
    public InstComponentDecl getInstComponentDecl(int i) {
        return (InstComponentDecl) getInstComponentDeclList().getChild(i);
    }
    /**
     * Check whether the InstComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstComponentDecl() {
        return getInstComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstComponentDecl list.
     * @param node The element to append to the InstComponentDecl list.
     * @apilevel high-level
     */
    public void addInstComponentDecl(InstComponentDecl node) {
        List<InstComponentDecl> list = (parent == null || state == null) ? getInstComponentDeclListNoTransform() : getInstComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstComponentDeclNoTransform(InstComponentDecl node) {
        List<InstComponentDecl> list = getInstComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node, int i) {
        List<InstComponentDecl> list = getInstComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstComponentDecl list.
     * @return The the child position of the InstComponentDecl list.
     * @apilevel low-level
     */
    protected int getInstComponentDeclListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InstComponentDecl list.
     * @return The node representing the InstComponentDecl list.
     * @apilevel high-level
     */
    public List<InstComponentDecl> getInstComponentDecls() {
        return getInstComponentDeclList();
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclsNoTransform() {
        return getInstComponentDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * @return Number of children in the InstExtends list.
     * @apilevel high-level
     */
    public int getNumInstExtends() {
        return getInstExtendsList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstExtends list.
     * @apilevel low-level
     */
    public int getNumInstExtendsNoTransform() {
        return getInstExtendsListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstExtends list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstExtends list.
     * @apilevel high-level
     */
    public InstExtends getInstExtends(int i) {
        return (InstExtends) getInstExtendsList().getChild(i);
    }
    /**
     * Check whether the InstExtends list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstExtends() {
        return getInstExtendsList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstExtends list.
     * @param node The element to append to the InstExtends list.
     * @apilevel high-level
     */
    public void addInstExtends(InstExtends node) {
        List<InstExtends> list = (parent == null || state == null) ? getInstExtendsListNoTransform() : getInstExtendsList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstExtendsNoTransform(InstExtends node) {
        List<InstExtends> list = getInstExtendsListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstExtends list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstExtends(InstExtends node, int i) {
        List<InstExtends> list = getInstExtendsList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstExtends list.
     * @return The the child position of the InstExtends list.
     * @apilevel low-level
     */
    protected int getInstExtendsListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(4);
    }
    /**
     * Retrieves the InstExtends list.
     * @return The node representing the InstExtends list.
     * @apilevel high-level
     */
    public List<InstExtends> getInstExtendss() {
        return getInstExtendsList();
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendssNoTransform() {
        return getInstExtendsListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstModification list.
     * @return Number of children in the InstModification list.
     * @apilevel high-level
     */
    public int getNumInstModification() {
        return getInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstModification list.
     * @apilevel low-level
     */
    public int getNumInstModificationNoTransform() {
        return getInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstModification list.
     * @apilevel high-level
     */
    public InstModification getInstModification(int i) {
        return (InstModification) getInstModificationList().getChild(i);
    }
    /**
     * Check whether the InstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstModification() {
        return getInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstModification list.
     * @param node The element to append to the InstModification list.
     * @apilevel high-level
     */
    public void addInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getInstModificationListNoTransform() : getInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstModification(InstModification node, int i) {
        List<InstModification> list = getInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstModification list.
     * @return The the child position of the InstModification list.
     * @apilevel low-level
     */
    protected int getInstModificationListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InstModification list.
     * @return The node representing the InstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getInstModifications() {
        return getInstModificationList();
    }
    /**
     * Retrieves the InstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getInstModificationsNoTransform() {
        return getInstModificationListNoTransform();
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
                CValueRecord res = new CValueRecord((FRecordType) type());
                int i = 0;
                for (InstComponentDecl icd : getRecord().myInstClassDecl().allInstComponentDecls()) {
                    CValue val;
                    if (icd.isModifiable()) {
                        val = getArg(i).getFExp().ceval(evaluator);
                    } else {
                        val = icd.ceval(evaluator);
                    }
                    res.setMember(i++, val);
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getRecordNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> myCallInputs() {
        ASTNode$State state = state();
        ArrayList<CommonVariableDecl> myCallInputs_value = new ArrayList<CommonVariableDecl>();

        return myCallInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> myCallOutputs() {
        ASTNode$State state = state();
        ArrayList<CommonVariableDecl> myCallOutputs_value = new ArrayList<CommonVariableDecl>();

        return myCallOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public String functionCallDecription() {
        ASTNode$State state = state();
        String functionCallDecription_value = "Record constructor for " + name();

        return functionCallDecription_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = getRecord().myInstClassDecl();

        return myInstClassDecl_value;
    }
    protected Map genericLookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstComponent_String_reset() {
        genericLookupInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstComponent(String name) {
        Object _parameters = name;
        if (genericLookupInstComponent_String_values == null) genericLookupInstComponent_String_values = new HashMap(4);
        if(genericLookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)genericLookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> genericLookupInstComponent_String_value = genericLookupInstComponent_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstComponent_String_values.put(_parameters, genericLookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstComponent_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> genericLookupInstComponent_compute(String name) {
            InstLookupResult<InstComponentDecl> res = localLookupInstComponent(name);
            return res.successful() ? res : lookupInstComponent(name);
        }
    protected Map localLookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void localLookupInstComponent_String_reset() {
        localLookupInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> localLookupInstComponent(String name) {
        Object _parameters = name;
        if (localLookupInstComponent_String_values == null) localLookupInstComponent_String_values = new HashMap(4);
        if(localLookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)localLookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> localLookupInstComponent_String_value = localLookupInstComponent_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            localLookupInstComponent_String_values.put(_parameters, localLookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return localLookupInstComponent_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> localLookupInstComponent_compute(String name) {
            for (InstComponentDecl icd : getInstComponentDecls()) {
                if (icd.matches(name)) {
                    return InstLookupResult.<InstComponentDecl>found(icd);
                }
            }
            for (InstExtends ie : getInstExtendss()) {
                InstLookupResult<InstComponentDecl> res = ie.memberInstComponent(name);
                if (res.successful()) {
                    return res;
                }
            }
            return InstLookupResult.notFound();
        }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl declarationInstComponent(String name) {
        ASTNode$State state = state();
        InstComponentDecl declarationInstComponent_String_value = myInstClassDecl().memberInstComponent(name).target(INST_UNKNOWN_COMPONENT, this);

        return declarationInstComponent_String_value;
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
        type_value = getRecord().recordType();
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
    protected boolean getMergedEnvironment_computed = false;
    /**
     * @apilevel internal
     */
    protected Environment getMergedEnvironment_value;
    /**
     * @apilevel internal
     */
    private void getMergedEnvironment_reset() {
        getMergedEnvironment_computed = false;
        getMergedEnvironment_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment getMergedEnvironment() {
        if(getMergedEnvironment_computed) {
            return getMergedEnvironment_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getMergedEnvironment_value = myInstClassDecl().getMergedEnvironment().mergeOuterClone(getInstModifications());
        if (isFinal && num == state().boundariesCrossed) {
            getMergedEnvironment_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getMergedEnvironment_value;
    }
    protected Map myEnvironment_def_String_values;
    /**
     * @apilevel internal
     */
    private void myEnvironment_def_String_reset() {
        myEnvironment_def_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironment_def(String name) {
        Object _parameters = name;
        if (myEnvironment_def_String_values == null) myEnvironment_def_String_values = new HashMap(4);
        if(myEnvironment_def_String_values.containsKey(_parameters)) {
            return (Environment)myEnvironment_def_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        Environment myEnvironment_def_String_value = declarationInstComponent(name).filteredEnvironment().mergeOuterClone(getMergedEnvironment().filter(name));
        if (isFinal && num == state().boundariesCrossed) {
            myEnvironment_def_String_values.put(_parameters, myEnvironment_def_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myEnvironment_def_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl getInstComponentDeclNoTransform(int i) {
        ASTNode$State state = state();
        InstComponentDecl getInstComponentDeclNoTransform_int_value = getInstComponentDeclListNoTransform().getChildNoTransform(i);

        return getInstComponentDeclNoTransform_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstExtends getInstExtendsNoTransform(int i) {
        ASTNode$State state = state();
        InstExtends getInstExtendsNoTransform_int_value = getInstExtendsListNoTransform().getChildNoTransform(i);

        return getInstExtendsNoTransform_int_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstComponentDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List<InstComponentDecl> getInstComponentDeclList_value;
    /**
     * @apilevel internal
     */
    private void getInstComponentDeclList_reset() {
        getInstComponentDeclList_computed = false;
        getInstComponentDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstComponentDecl> getInstComponentDeclList() {
        if(getInstComponentDeclList_computed) {
            return (List<InstComponentDecl>) getChild(getInstComponentDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstComponentDeclList_value = getInstComponentDeclList_compute();
        setChild(getInstComponentDeclList_value, getInstComponentDeclListChildPosition());
        if (true) {
            getInstComponentDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List<InstComponentDecl> node = (List<InstComponentDecl>) this.getChild(getInstComponentDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<InstComponentDecl> getInstComponentDeclList_compute() {
            InstClassDecl rec = getRecord().myInstClassDecl().actualInstClass();
            List<InstComponentDecl> l = new List<InstComponentDecl>();
            for (ComponentDecl cd : rec.components()) 
                l.add(rec.createInstComponentDecl(cd));
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getInstExtendsList_computed = false;
    /**
     * @apilevel internal
     */
    protected List<InstExtends> getInstExtendsList_value;
    /**
     * @apilevel internal
     */
    private void getInstExtendsList_reset() {
        getInstExtendsList_computed = false;
        getInstExtendsList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstExtends> getInstExtendsList() {
        if(getInstExtendsList_computed) {
            return (List<InstExtends>) getChild(getInstExtendsListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstExtendsList_value = getInstExtendsList_compute();
        setChild(getInstExtendsList_value, getInstExtendsListChildPosition());
        if (true) {
            getInstExtendsList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List<InstExtends> node = (List<InstExtends>) this.getChild(getInstExtendsListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<InstExtends> getInstExtendsList_compute() {
            InstClassDecl rec = getRecord().myInstClassDecl().actualInstClass();
            List l = new List();
            InstNode lookup = myInstClassDecl().instLookupNodeForShortClassExtends();
            for (ExtendsClause e : rec.superClasses()) 
                l.add(rec.createInstExtends(e, lookup));
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getInstModificationList_computed = false;
    /**
     * @apilevel internal
     */
    protected List<InstModification> getInstModificationList_value;
    /**
     * @apilevel internal
     */
    private void getInstModificationList_reset() {
        getInstModificationList_computed = false;
        getInstModificationList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstModification> getInstModificationList() {
        if(getInstModificationList_computed) {
            return (List<InstModification>) getChild(getInstModificationListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstModificationList_value = getInstModificationList_compute();
        setChild(getInstModificationList_value, getInstModificationListChildPosition());
        if (true) {
            getInstModificationList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List<InstModification> node = (List<InstModification>) this.getChild(getInstModificationListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<InstModification> getInstModificationList_compute() {
            List<InstModification> res = new List<InstModification>();
            for (InstFunctionArgument ifa : getArgs()) {
                ifa.populateInstModifications(res);
            }
            return res;
        }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2020
     */
    @ASTNodeAnnotation.Attribute
    public boolean canInlineConstant() {
        ASTNode$State state = state();
        boolean canInlineConstant_value = getParent().Define_canInlineConstant(this, null);

        return canInlineConstant_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:543
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);

        return lookupInstComponent_String_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:478
     * @apilevel internal
     */
    public int Define_retrieveArrayCompNdims(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_inRecord(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2349
     * @apilevel internal
     */
    public boolean Define_inRecordConstructor(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_inRecordConstructor(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:194
     * @apilevel internal
     */
    public boolean Define_isForAttributeOnOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:640
     * @apilevel internal
     */
    public boolean Define_inInstComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1201
     * @apilevel internal
     */
    public boolean Define_inExternalObject(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:194
     * @apilevel internal
     */
    public boolean Define_isFlattened(ASTNode caller, ASTNode child, InstValueModification ivm) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:736
     * @apilevel internal
     */
    public FQName Define_expandedFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FQNameFull();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1576
     * @apilevel internal
     */
    public InstValueModification Define_parentInstValueMod(ASTNode caller, ASTNode child) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return null;
        }
        else {
            return getParent().Define_parentInstValueMod(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1611
     * @apilevel internal
     */
    public boolean Define_inModWithEach(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1695
     * @apilevel internal
     */
    public boolean Define_isOnPrimitiveTypeDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1927
     * @apilevel internal
     */
    public int Define_argIndexInRecordConstructor(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return argIndexInRecordConstructorImpl(i, getInstExtendss());
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return argIndexInRecordConstructorImpl(-1, getInstExtendss()) + i;
        }
        else {
            return getParent().Define_argIndexInRecordConstructor(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return canInlineConstant();
        }
        else {
            return super.Define_canInlineConstant(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:89
     * @apilevel internal
     */
    public boolean Define_isInstRecordConstructorArg(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_isInstRecordConstructorArg(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:107
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupRecordConstructorVirtualInstComponentDecl(ASTNode caller, ASTNode child, String name) {
        if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            {
                    return localLookupInstComponent(name).targetOrNull();
                }
        }
        else {
            return super.Define_lookupRecordConstructorVirtualInstComponentDecl(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:63
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromMod(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClassDecl().genericLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClassFromMod(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClassDecl().genericLookupInstClass(name);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClassDecl().genericLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:121
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassInChain(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClassDecl().genericLookupInstClass(name);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstClassDecl().genericLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClassInChain(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstComponent(name);
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return lookupInstComponent(name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:287
     * @apilevel internal
     */
    public InstModification Define_retrieveModificationLackingEach(ASTNode caller, ASTNode child, Size s) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:37
     * @apilevel internal
     */
    public FTypePrefixVariability Define_overrideVariability(ASTNode caller, ASTNode child, FTypePrefixVariability var, FTypePrefixVariability bexpVar) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return var.combineDown(bexpVar);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return var.combineDown(bexpVar);
        }
        else {
            return getParent().Define_overrideVariability(this, caller, var, bexpVar);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:488
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getMergedEnvironment().clone();
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getMergedEnvironment().clone();
        }
        else {
            return getParent().Define_myEnvironment(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:517
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myEnvironment_def(name);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myEnvironment_def(name);
        }
        else {
            return getParent().Define_myEnvironment(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2410
     * @apilevel internal
     */
    public int Define_myDimension(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2418
     * @apilevel internal
     */
    public boolean Define_isTopDimension(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2463
     * @apilevel internal
     */
    public Index Define_parentIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1131
     * @apilevel internal
     */
    public boolean Define_inProtectedComponent(ASTNode caller, ASTNode child) {
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
