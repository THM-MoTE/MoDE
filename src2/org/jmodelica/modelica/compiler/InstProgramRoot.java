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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:31
 * @production InstProgramRoot : {@link InstRoot} ::= <span class="component">&lt;Program:Program&gt;</span> <span class="component">{@link UnknownInstClassDecl}</span> <span class="component">{@link UnknownInstComponentDecl}</span> <span class="component">InstAnonymousClass:{@link InstClassDecl}*</span> <span class="component">InstPredefinedType:{@link InstClassDecl}*</span> <span class="component">InstBuiltInType:{@link InstClassDecl}*</span> <span class="component">InstBuiltInFunction:{@link InstClassDecl}*</span> <span class="component">InstLibClassDecl:{@link InstClassDecl}*</span> <span class="component">[Dummy:{@link InstNode}]</span> <span class="component">[Dummy2:{@link InstGeneratedInner}]</span> <span class="component">[Dummy3:{@link InstConstraining}]</span>;

 */
public class InstProgramRoot extends InstRoot implements Cloneable {
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:580
     */
    public void checkErrorsInInstClass(String className, ErrorCheckType checkType) throws ModelicaClassNotFoundException {
        InstLookupResult<InstClassDecl> icd = lookupInstClassQualified(className);
        if (icd.successful()) 
            icd.target().errorCheck(checkType);
        else
            throw new ModelicaClassNotFoundException(className);
    }
    /**
     * Generic traversal method used to find a particular class instance
     * in the instance tree, and if so, flatten it.
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:78
     */
    public InstNode findFlattenInst(String className,FClass fc) throws ModelicaClassNotFoundException {
        
        InstLookupResult<InstClassDecl> icd = lookupInstClassQualified(className);
        if (icd.successful()) {
            icd.target().flattenInstClassDecl(fc);
        } else {
            throw new ModelicaClassNotFoundException(className);
        }
        
        return icd.target();
    }
    /**
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:643
     */
    public InstClassDecl simpleLookupInstClassDeclRecursive(String name) {
        String[] parts = name.split("\\.", 2);
        InstClassDecl icd = findMatching(getInstClassDecls(), parts[0]);
        if (icd == null) {
            InstLookupResult<InstClassDecl> result = lookupLibrary(parts[0]);
            if (result.successful())
                icd = result.target();
        }
        if (icd != null)
            return icd = (parts.length == 1) ? icd : icd.simpleLookupInstClassDeclRecursive(parts[1]);
        else
            return unknownInstClassDecl();
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstProgramRoot() {
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
        children = new ASTNode[18];
        setChild(new Opt(), 0);
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new List(), 9);
        setChild(new List(), 13);
        setChild(new List(), 14);
        setChild(new List(), 15);
        setChild(new List(), 16);
        setChild(new List(), 17);
    }
    /**
     * @declaredat ASTNode:28
     */
    public InstProgramRoot(Program p0, Opt<InstNode> p1, Opt<InstGeneratedInner> p2, Opt<InstConstraining> p3) {
        setProgram(p0);
        setChild(p1, 0);
        setChild(p2, 1);
        setChild(p3, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:37
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        libraryMap_reset();
        lookupLibrary_String_reset();
        genericLookupInstClass_String_reset();
        simpleLookupInstClassDecl_String_reset();
        getInstAnonymousClassList_reset();
        instantiateModel_String_reset();
        getUnknownInstClassDecl_reset();
        getUnknownInstComponentDecl_reset();
        getInstLibClassDeclList_reset();
        getInstPredefinedTypeList_reset();
        getInstBuiltInTypeList_reset();
        getInstBuiltInFunctionList_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:73
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:79
     */
    public InstProgramRoot clone() throws CloneNotSupportedException {
        InstProgramRoot node = (InstProgramRoot) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:86
     */
    public InstProgramRoot copy() {
        try {
            InstProgramRoot node = (InstProgramRoot) clone();
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
     * @declaredat ASTNode:105
     */
    public InstProgramRoot fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:114
     */
    public InstProgramRoot treeCopyNoTransform() {
        InstProgramRoot tree = (InstProgramRoot) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 10:
                case 11:
                case 12:
                    tree.children[i] = null;
                    continue;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
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
     * @declaredat ASTNode:155
     */
    public InstProgramRoot treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:162
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenProgram_Program == ((InstProgramRoot)node).tokenProgram_Program);    
    }
    /**
     * Replaces the lexeme Program.
     * @param value The new value for the lexeme Program.
     * @apilevel high-level
     */
    public void setProgram(Program value) {
        tokenProgram_Program = value;
    }
    /**
     * @apilevel internal
     */
    protected Program tokenProgram_Program;
    /**
     * Retrieves the value for the lexeme Program.
     * @return The value for the lexeme Program.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Program")
    public Program getProgram() {
        return tokenProgram_Program;
    }
    /**
     * Replaces the optional node for the Dummy child. This is the <code>Opt</code>
     * node containing the child Dummy, not the actual child!
     * @param opt The new node to be used as the optional node for the Dummy child.
     * @apilevel low-level
     */
    public void setDummyOpt(Opt<InstNode> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) Dummy child.
     * @param node The new node to be used as the Dummy child.
     * @apilevel high-level
     */
    public void setDummy(InstNode node) {
        getDummyOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Dummy child exists.
     * @return {@code true} if the optional Dummy child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDummy() {
        return getDummyOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Dummy child.
     * @return The Dummy child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstNode getDummy() {
        return (InstNode) getDummyOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Dummy child. This is the <code>Opt</code> node containing the child Dummy, not the actual child!
     * @return The optional node for child the Dummy child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Dummy")
    public Opt<InstNode> getDummyOpt() {
        return (Opt<InstNode>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Dummy. This is the <code>Opt</code> node containing the child Dummy, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Dummy.
     * @apilevel low-level
     */
    public Opt<InstNode> getDummyOptNoTransform() {
        return (Opt<InstNode>) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the Dummy2 child. This is the <code>Opt</code>
     * node containing the child Dummy2, not the actual child!
     * @param opt The new node to be used as the optional node for the Dummy2 child.
     * @apilevel low-level
     */
    public void setDummy2Opt(Opt<InstGeneratedInner> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) Dummy2 child.
     * @param node The new node to be used as the Dummy2 child.
     * @apilevel high-level
     */
    public void setDummy2(InstGeneratedInner node) {
        getDummy2Opt().setChild(node, 0);
    }
    /**
     * Check whether the optional Dummy2 child exists.
     * @return {@code true} if the optional Dummy2 child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDummy2() {
        return getDummy2Opt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Dummy2 child.
     * @return The Dummy2 child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstGeneratedInner getDummy2() {
        return (InstGeneratedInner) getDummy2Opt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Dummy2 child. This is the <code>Opt</code> node containing the child Dummy2, not the actual child!
     * @return The optional node for child the Dummy2 child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Dummy2")
    public Opt<InstGeneratedInner> getDummy2Opt() {
        return (Opt<InstGeneratedInner>) getChild(1);
    }
    /**
     * Retrieves the optional node for child Dummy2. This is the <code>Opt</code> node containing the child Dummy2, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Dummy2.
     * @apilevel low-level
     */
    public Opt<InstGeneratedInner> getDummy2OptNoTransform() {
        return (Opt<InstGeneratedInner>) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Dummy3 child. This is the <code>Opt</code>
     * node containing the child Dummy3, not the actual child!
     * @param opt The new node to be used as the optional node for the Dummy3 child.
     * @apilevel low-level
     */
    public void setDummy3Opt(Opt<InstConstraining> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Dummy3 child.
     * @param node The new node to be used as the Dummy3 child.
     * @apilevel high-level
     */
    public void setDummy3(InstConstraining node) {
        getDummy3Opt().setChild(node, 0);
    }
    /**
     * Check whether the optional Dummy3 child exists.
     * @return {@code true} if the optional Dummy3 child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDummy3() {
        return getDummy3Opt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Dummy3 child.
     * @return The Dummy3 child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstConstraining getDummy3() {
        return (InstConstraining) getDummy3Opt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Dummy3 child. This is the <code>Opt</code> node containing the child Dummy3, not the actual child!
     * @return The optional node for child the Dummy3 child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Dummy3")
    public Opt<InstConstraining> getDummy3Opt() {
        return (Opt<InstConstraining>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Dummy3. This is the <code>Opt</code> node containing the child Dummy3, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Dummy3.
     * @apilevel low-level
     */
    public Opt<InstConstraining> getDummy3OptNoTransform() {
        return (Opt<InstConstraining>) getChildNoTransform(2);
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
     * Retrieves the number of children in the InstClassDecl list.
     * @return Number of children in the InstClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstClassDecl() {
        return getInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstClassDeclNoTransform() {
        return getInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstClassDecl(int i) {
        return (InstClassDecl) getInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstClassDecl() {
        return getInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstClassDecl list.
     * @param node The element to append to the InstClassDecl list.
     * @apilevel high-level
     */
    public void addInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstClassDeclListNoTransform() : getInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstClassDecl list.
     * @return The the child position of the InstClassDecl list.
     * @apilevel low-level
     */
    protected int getInstClassDeclListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(4);
    }
    /**
     * Retrieves the InstClassDecl list.
     * @return The node representing the InstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstClassDecls() {
        return getInstClassDeclList();
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclsNoTransform() {
        return getInstClassDeclListNoTransform();
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
        return 5;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(5);
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
     * Retrieves the number of children in the InstImport list.
     * @return Number of children in the InstImport list.
     * @apilevel high-level
     */
    public int getNumInstImport() {
        return getInstImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstImport list.
     * @apilevel low-level
     */
    public int getNumInstImportNoTransform() {
        return getInstImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstImport list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstImport list.
     * @apilevel high-level
     */
    public InstImport getInstImport(int i) {
        return (InstImport) getInstImportList().getChild(i);
    }
    /**
     * Check whether the InstImport list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstImport() {
        return getInstImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstImport list.
     * @param node The element to append to the InstImport list.
     * @apilevel high-level
     */
    public void addInstImport(InstImport node) {
        List<InstImport> list = (parent == null || state == null) ? getInstImportListNoTransform() : getInstImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstImportNoTransform(InstImport node) {
        List<InstImport> list = getInstImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstImport list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstImport(InstImport node, int i) {
        List<InstImport> list = getInstImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstImport list.
     * @return The the child position of the InstImport list.
     * @apilevel low-level
     */
    protected int getInstImportListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(6);
    }
    /**
     * Retrieves the InstImport list.
     * @return The node representing the InstImport list.
     * @apilevel high-level
     */
    public List<InstImport> getInstImports() {
        return getInstImportList();
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportsNoTransform() {
        return getInstImportListNoTransform();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public int getNumRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public int getNumRedeclaredInstClassDeclNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the RedeclaredInstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getRedeclaredInstClassDecl(int i) {
        return (InstClassDecl) getRedeclaredInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the RedeclaredInstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the RedeclaredInstClassDecl list.
     * @param node The element to append to the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public void addRedeclaredInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getRedeclaredInstClassDeclListNoTransform() : getRedeclaredInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addRedeclaredInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the RedeclaredInstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setRedeclaredInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the RedeclaredInstClassDecl list.
     * @return The the child position of the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    protected int getRedeclaredInstClassDeclListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(7);
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDecls() {
        return getRedeclaredInstClassDeclList();
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclsNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the FAbstractEquation list.
     * @return The the child position of the FAbstractEquation list.
     * @apilevel low-level
     */
    protected int getFAbstractEquationListChildPosition() {
        return 8;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(8);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * @return Number of children in the ElementInstModification list.
     * @apilevel high-level
     */
    public int getNumElementInstModification() {
        return getElementInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementInstModification list.
     * @apilevel low-level
     */
    public int getNumElementInstModificationNoTransform() {
        return getElementInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementInstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementInstModification list.
     * @apilevel high-level
     */
    public InstModification getElementInstModification(int i) {
        return (InstModification) getElementInstModificationList().getChild(i);
    }
    /**
     * Check whether the ElementInstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementInstModification() {
        return getElementInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementInstModification list.
     * @param node The element to append to the ElementInstModification list.
     * @apilevel high-level
     */
    public void addElementInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getElementInstModificationListNoTransform() : getElementInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getElementInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementInstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementInstModification(InstModification node, int i) {
        List<InstModification> list = getElementInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the ElementInstModification list.
     * @return The the child position of the ElementInstModification list.
     * @apilevel low-level
     */
    protected int getElementInstModificationListChildPosition() {
        return 9;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(9);
    }
    /**
     * Retrieves the ElementInstModification list.
     * @return The node representing the ElementInstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getElementInstModifications() {
        return getElementInstModificationList();
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationsNoTransform() {
        return getElementInstModificationListNoTransform();
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(10);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 10;
    }
    /**
     * Retrieves the UnknownInstClassDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the UnknownInstClassDecl child.
     * @apilevel low-level
     */
    public UnknownInstClassDecl getUnknownInstClassDeclNoTransform() {
        return (UnknownInstClassDecl) getChildNoTransform(11);
    }
    /**
     * Retrieves the child position of the optional child UnknownInstClassDecl.
     * @return The the child position of the optional child UnknownInstClassDecl.
     * @apilevel low-level
     */
    protected int getUnknownInstClassDeclChildPosition() {
        return 11;
    }
    /**
     * Retrieves the UnknownInstComponentDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the UnknownInstComponentDecl child.
     * @apilevel low-level
     */
    public UnknownInstComponentDecl getUnknownInstComponentDeclNoTransform() {
        return (UnknownInstComponentDecl) getChildNoTransform(12);
    }
    /**
     * Retrieves the child position of the optional child UnknownInstComponentDecl.
     * @return The the child position of the optional child UnknownInstComponentDecl.
     * @apilevel low-level
     */
    protected int getUnknownInstComponentDeclChildPosition() {
        return 12;
    }
    /**
     * Retrieves the number of children in the InstAnonymousClass list.
     * @return Number of children in the InstAnonymousClass list.
     * @apilevel high-level
     */
    public int getNumInstAnonymousClass() {
        return getInstAnonymousClassList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstAnonymousClass list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstAnonymousClass list.
     * @apilevel low-level
     */
    public int getNumInstAnonymousClassNoTransform() {
        return getInstAnonymousClassListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstAnonymousClass list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstAnonymousClass list.
     * @apilevel high-level
     */
    public InstClassDecl getInstAnonymousClass(int i) {
        return (InstClassDecl) getInstAnonymousClassList().getChild(i);
    }
    /**
     * Check whether the InstAnonymousClass list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstAnonymousClass() {
        return getInstAnonymousClassList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstAnonymousClass list.
     * @param node The element to append to the InstAnonymousClass list.
     * @apilevel high-level
     */
    public void addInstAnonymousClass(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstAnonymousClassListNoTransform() : getInstAnonymousClassList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstAnonymousClassNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstAnonymousClassListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstAnonymousClass list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstAnonymousClass(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstAnonymousClassList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstAnonymousClass list.
     * @return The the child position of the InstAnonymousClass list.
     * @apilevel low-level
     */
    protected int getInstAnonymousClassListChildPosition() {
        return 13;
    }
    /**
     * Retrieves the InstAnonymousClass list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstAnonymousClass list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstAnonymousClassListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(13);
    }
    /**
     * Retrieves the InstAnonymousClass list.
     * @return The node representing the InstAnonymousClass list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstAnonymousClasss() {
        return getInstAnonymousClassList();
    }
    /**
     * Retrieves the InstAnonymousClass list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstAnonymousClass list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstAnonymousClasssNoTransform() {
        return getInstAnonymousClassListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstPredefinedType list.
     * @return Number of children in the InstPredefinedType list.
     * @apilevel high-level
     */
    public int getNumInstPredefinedType() {
        return getInstPredefinedTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstPredefinedType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstPredefinedType list.
     * @apilevel low-level
     */
    public int getNumInstPredefinedTypeNoTransform() {
        return getInstPredefinedTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstPredefinedType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstPredefinedType list.
     * @apilevel high-level
     */
    public InstClassDecl getInstPredefinedType(int i) {
        return (InstClassDecl) getInstPredefinedTypeList().getChild(i);
    }
    /**
     * Check whether the InstPredefinedType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstPredefinedType() {
        return getInstPredefinedTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstPredefinedType list.
     * @param node The element to append to the InstPredefinedType list.
     * @apilevel high-level
     */
    public void addInstPredefinedType(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstPredefinedTypeListNoTransform() : getInstPredefinedTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstPredefinedTypeNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstPredefinedTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstPredefinedType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstPredefinedType(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstPredefinedTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstPredefinedType list.
     * @return The the child position of the InstPredefinedType list.
     * @apilevel low-level
     */
    protected int getInstPredefinedTypeListChildPosition() {
        return 14;
    }
    /**
     * Retrieves the InstPredefinedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstPredefinedType list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstPredefinedTypeListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(14);
    }
    /**
     * Retrieves the InstPredefinedType list.
     * @return The node representing the InstPredefinedType list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstPredefinedTypes() {
        return getInstPredefinedTypeList();
    }
    /**
     * Retrieves the InstPredefinedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstPredefinedType list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstPredefinedTypesNoTransform() {
        return getInstPredefinedTypeListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstBuiltInType list.
     * @return Number of children in the InstBuiltInType list.
     * @apilevel high-level
     */
    public int getNumInstBuiltInType() {
        return getInstBuiltInTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstBuiltInType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstBuiltInType list.
     * @apilevel low-level
     */
    public int getNumInstBuiltInTypeNoTransform() {
        return getInstBuiltInTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstBuiltInType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstBuiltInType list.
     * @apilevel high-level
     */
    public InstClassDecl getInstBuiltInType(int i) {
        return (InstClassDecl) getInstBuiltInTypeList().getChild(i);
    }
    /**
     * Check whether the InstBuiltInType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstBuiltInType() {
        return getInstBuiltInTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstBuiltInType list.
     * @param node The element to append to the InstBuiltInType list.
     * @apilevel high-level
     */
    public void addInstBuiltInType(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstBuiltInTypeListNoTransform() : getInstBuiltInTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstBuiltInTypeNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstBuiltInTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstBuiltInType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstBuiltInType(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstBuiltInTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstBuiltInType list.
     * @return The the child position of the InstBuiltInType list.
     * @apilevel low-level
     */
    protected int getInstBuiltInTypeListChildPosition() {
        return 15;
    }
    /**
     * Retrieves the InstBuiltInType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstBuiltInType list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstBuiltInTypeListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(15);
    }
    /**
     * Retrieves the InstBuiltInType list.
     * @return The node representing the InstBuiltInType list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstBuiltInTypes() {
        return getInstBuiltInTypeList();
    }
    /**
     * Retrieves the InstBuiltInType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstBuiltInType list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstBuiltInTypesNoTransform() {
        return getInstBuiltInTypeListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstBuiltInFunction list.
     * @return Number of children in the InstBuiltInFunction list.
     * @apilevel high-level
     */
    public int getNumInstBuiltInFunction() {
        return getInstBuiltInFunctionList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstBuiltInFunction list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstBuiltInFunction list.
     * @apilevel low-level
     */
    public int getNumInstBuiltInFunctionNoTransform() {
        return getInstBuiltInFunctionListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstBuiltInFunction list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstBuiltInFunction list.
     * @apilevel high-level
     */
    public InstClassDecl getInstBuiltInFunction(int i) {
        return (InstClassDecl) getInstBuiltInFunctionList().getChild(i);
    }
    /**
     * Check whether the InstBuiltInFunction list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstBuiltInFunction() {
        return getInstBuiltInFunctionList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstBuiltInFunction list.
     * @param node The element to append to the InstBuiltInFunction list.
     * @apilevel high-level
     */
    public void addInstBuiltInFunction(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstBuiltInFunctionListNoTransform() : getInstBuiltInFunctionList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstBuiltInFunctionNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstBuiltInFunctionListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstBuiltInFunction list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstBuiltInFunction(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstBuiltInFunctionList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstBuiltInFunction list.
     * @return The the child position of the InstBuiltInFunction list.
     * @apilevel low-level
     */
    protected int getInstBuiltInFunctionListChildPosition() {
        return 16;
    }
    /**
     * Retrieves the InstBuiltInFunction list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstBuiltInFunction list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstBuiltInFunctionListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(16);
    }
    /**
     * Retrieves the InstBuiltInFunction list.
     * @return The node representing the InstBuiltInFunction list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstBuiltInFunctions() {
        return getInstBuiltInFunctionList();
    }
    /**
     * Retrieves the InstBuiltInFunction list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstBuiltInFunction list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstBuiltInFunctionsNoTransform() {
        return getInstBuiltInFunctionListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstLibClassDecl list.
     * @return Number of children in the InstLibClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstLibClassDecl() {
        return getInstLibClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstLibClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstLibClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstLibClassDeclNoTransform() {
        return getInstLibClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstLibClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstLibClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstLibClassDecl(int i) {
        return (InstClassDecl) getInstLibClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstLibClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstLibClassDecl() {
        return getInstLibClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstLibClassDecl list.
     * @param node The element to append to the InstLibClassDecl list.
     * @apilevel high-level
     */
    public void addInstLibClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstLibClassDeclListNoTransform() : getInstLibClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstLibClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstLibClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstLibClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstLibClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstLibClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstLibClassDecl list.
     * @return The the child position of the InstLibClassDecl list.
     * @apilevel low-level
     */
    protected int getInstLibClassDeclListChildPosition() {
        return 17;
    }
    /**
     * Retrieves the InstLibClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstLibClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstLibClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(17);
    }
    /**
     * Retrieves the InstLibClassDecl list.
     * @return The node representing the InstLibClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstLibClassDecls() {
        return getInstLibClassDeclList();
    }
    /**
     * Retrieves the InstLibClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstLibClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstLibClassDeclsNoTransform() {
        return getInstLibClassDeclListNoTransform();
    }
    /**
     * @apilevel internal
     */
    protected boolean libraryMap_computed = false;
    /**
     * @apilevel internal
     */
    protected HashMap<String,LibNode> libraryMap_value;
    /**
     * @apilevel internal
     */
    private void libraryMap_reset() {
        libraryMap_computed = false;
        libraryMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public HashMap<String,LibNode> libraryMap() {
        if(libraryMap_computed) {
            return libraryMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        libraryMap_value = libraryMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            libraryMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return libraryMap_value;
    }
    /**
     * @apilevel internal
     */
    private HashMap<String,LibNode> libraryMap_compute() {
            Program prog = ((SourceRoot) root()).getProgram();
            HashMap<String,LibNode> map = new HashMap<String,LibNode>(prog.getNumLibNode() * 4 / 3 + 1);
            for (LibNode ln : prog.getLibNodes()) {
                if (!map.containsKey(ln.getName())) {
                    map.put(ln.getName(), ln);
                }
            }
            return map;
        }
    protected Map lookupLibrary_String_values;
    /**
     * @apilevel internal
     */
    private void lookupLibrary_String_reset() {
        lookupLibrary_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupLibrary(String name) {
        Object _parameters = name;
        if (lookupLibrary_String_values == null) lookupLibrary_String_values = new HashMap(4);
        if(lookupLibrary_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstClassDecl>)lookupLibrary_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstClassDecl> lookupLibrary_String_value = lookupLibrary_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            lookupLibrary_String_values.put(_parameters, lookupLibrary_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return lookupLibrary_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstClassDecl> lookupLibrary_compute(String name) {
            LibNode ln = libraryMap().get(name);
            if (ln != null) {
                InstClassDecl icd = createInstClassDecl(ln.classDecl());
                if (icd instanceof InstFullClassDecl) {
                    // Add to instance tree
                    addInstLibClassDecl((InstFullClassDecl) icd);
                    // Make sure is$Final is true;
                    getInstLibClassDecl(getNumInstLibClassDecl() - 1);
                    return InstLookupResult.found(icd);
                }
            }
            return InstLookupResult.notFound();
        }
    protected Map genericLookupInstClass_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstClass_String_reset() {
        genericLookupInstClass_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> genericLookupInstClass(String name) {
        Object _parameters = name;
        if (genericLookupInstClass_String_values == null) genericLookupInstClass_String_values = new HashMap(4);
        if(genericLookupInstClass_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstClassDecl>)genericLookupInstClass_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstClassDecl> genericLookupInstClass_String_value = genericLookupInstClass_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstClass_String_values.put(_parameters, genericLookupInstClass_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstClass_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstClassDecl> genericLookupInstClass_compute(String name) {
            for (InstClassDecl bcd : getInstClassDecls()) 
                if (bcd.matches(name))
                    return InstLookupResult.found(bcd); 
            
            for (InstClassDecl bcd : getInstPredefinedTypes()) 
                if (bcd.matches(name))
                    return InstLookupResult.found(bcd); 
    
            for (InstClassDecl bcd : getInstBuiltInFunctions()) 
                if (bcd.matches(name))
                    return InstLookupResult.found(bcd); 
    
            // TODO: propagate information about the class from where
            // the lookup is requested, so that version information
            // stored in annotations can be retreived.
            return lookupLibrary(name);
        }
    protected Map simpleLookupInstClassDecl_String_values;
    /**
     * @apilevel internal
     */
    private void simpleLookupInstClassDecl_String_reset() {
        simpleLookupInstClassDecl_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl simpleLookupInstClassDecl(String name) {
        Object _parameters = name;
        if (simpleLookupInstClassDecl_String_values == null) simpleLookupInstClassDecl_String_values = new HashMap(4);
        if(simpleLookupInstClassDecl_String_values.containsKey(_parameters)) {
            return (InstClassDecl)simpleLookupInstClassDecl_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstClassDecl simpleLookupInstClassDecl_String_value = simpleLookupInstClassDeclRecursive(name);
        if (isFinal && num == state().boundariesCrossed) {
            simpleLookupInstClassDecl_String_values.put(_parameters, simpleLookupInstClassDecl_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return simpleLookupInstClassDecl_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualifiedPart(String name, boolean first, boolean global) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassQualifiedPart_String_boolean_boolean_value = genericLookupInstClass(name);

        return lookupInstClassQualifiedPart_String_boolean_boolean_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstAnonymousClassList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstAnonymousClassList_value;
    /**
     * @apilevel internal
     */
    private void getInstAnonymousClassList_reset() {
        getInstAnonymousClassList_computed = false;
        getInstAnonymousClassList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstAnonymousClassList() {
        if(getInstAnonymousClassList_computed) {
            return (List) getChild(getInstAnonymousClassListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstAnonymousClassList_value = new List();
        setChild(getInstAnonymousClassList_value, getInstAnonymousClassListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstAnonymousClassList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstAnonymousClassListChildPosition());
        return node;
    }
    protected Map instantiateModel_String_values;
    /**
     * @apilevel internal
     */
    private void instantiateModel_String_reset() {
        instantiateModel_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl instantiateModel(String className) {
        Object _parameters = className;
        if (instantiateModel_String_values == null) instantiateModel_String_values = new HashMap(4);
        if(instantiateModel_String_values.containsKey(_parameters)) {
            return (InstClassDecl)instantiateModel_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstClassDecl instantiateModel_String_value = instantiateModel_compute(className);
        if (isFinal && num == state().boundariesCrossed) {
            instantiateModel_String_values.put(_parameters, instantiateModel_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return instantiateModel_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstClassDecl instantiateModel_compute(String className) {
            int p = className.indexOf('(');
            if (p >= 0) {
                String targetName = className.substring(0, p);
                InstLookupResult<InstClassDecl> icd = lookupInstClassQualified(targetName);
                if (icd.successful()) {
                    Restriction restriction = ((BaseClassDecl) icd.target().getClassDecl()).getRestriction();
                    ClassDecl cl = sourceRoot().getProgram().anonymousClass(className, restriction, targetName);
                    if (cl != null) {
                        addInstAnonymousClass(createInstClassDecl(cl));
                        return getInstAnonymousClass(getNumInstAnonymousClass() - 1);
                    }
                }
                return unknownInstClassDecl();
            } else {
                InstLookupResult<InstClassDecl> icd = lookupInstClassQualified(className);
                return icd.successful() ? icd.target() : unknownInstClassDecl();
            }
        }
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        String qualifiedName_value = "";

        return qualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = getProgram().classes();

        return classes_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getUnknownInstClassDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected UnknownInstClassDecl getUnknownInstClassDecl_value;
    /**
     * @apilevel internal
     */
    private void getUnknownInstClassDecl_reset() {
        getUnknownInstClassDecl_computed = false;
        getUnknownInstClassDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstClassDecl getUnknownInstClassDecl() {
        if(getUnknownInstClassDecl_computed) {
            return (UnknownInstClassDecl) getChild(getUnknownInstClassDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownInstClassDecl_value = new UnknownInstClassDecl(getProgram().getUnknownClassDecl(), new Opt(), new InstMClass(), new Opt());
        setChild(getUnknownInstClassDecl_value, getUnknownInstClassDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownInstClassDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        UnknownInstClassDecl node = (UnknownInstClassDecl) this.getChild(getUnknownInstClassDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getUnknownInstComponentDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected UnknownInstComponentDecl getUnknownInstComponentDecl_value;
    /**
     * @apilevel internal
     */
    private void getUnknownInstComponentDecl_reset() {
        getUnknownInstComponentDecl_computed = false;
        getUnknownInstComponentDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstComponentDecl getUnknownInstComponentDecl() {
        if(getUnknownInstComponentDecl_computed) {
            return (UnknownInstComponentDecl) getChild(getUnknownInstComponentDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownInstComponentDecl_value = new UnknownInstComponentDecl(new InstParseAccess("Unknown"),new Opt(),getProgram().getUnknownComponentDecl(), new Opt(),new Opt(),new Opt());
        setChild(getUnknownInstComponentDecl_value, getUnknownInstComponentDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownInstComponentDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        UnknownInstComponentDecl node = (UnknownInstComponentDecl) this.getChild(getUnknownInstComponentDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstLibClassDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstLibClassDeclList_value;
    /**
     * @apilevel internal
     */
    private void getInstLibClassDeclList_reset() {
        getInstLibClassDeclList_computed = false;
        getInstLibClassDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstLibClassDeclList() {
        if(getInstLibClassDeclList_computed) {
            return (List) getChild(getInstLibClassDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstLibClassDeclList_value = new List();
        setChild(getInstLibClassDeclList_value, getInstLibClassDeclListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstLibClassDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstLibClassDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstPredefinedTypeList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstPredefinedTypeList_value;
    /**
     * @apilevel internal
     */
    private void getInstPredefinedTypeList_reset() {
        getInstPredefinedTypeList_computed = false;
        getInstPredefinedTypeList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstPredefinedTypeList() {
        if(getInstPredefinedTypeList_computed) {
            return (List) getChild(getInstPredefinedTypeListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstPredefinedTypeList_value = getInstPredefinedTypeList_compute();
        setChild(getInstPredefinedTypeList_value, getInstPredefinedTypeListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstPredefinedTypeList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstPredefinedTypeListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstPredefinedTypeList_compute() {
            List l = new List();
            for (BaseClassDecl pcd : getProgram().getPredefinedTypes()) {
                l.add(pcd.newInstClassDecl());
            }
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getInstBuiltInTypeList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstBuiltInTypeList_value;
    /**
     * @apilevel internal
     */
    private void getInstBuiltInTypeList_reset() {
        getInstBuiltInTypeList_computed = false;
        getInstBuiltInTypeList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstBuiltInTypeList() {
        if(getInstBuiltInTypeList_computed) {
            return (List) getChild(getInstBuiltInTypeListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstBuiltInTypeList_value = getInstBuiltInTypeList_compute();
        setChild(getInstBuiltInTypeList_value, getInstBuiltInTypeListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstBuiltInTypeList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstBuiltInTypeListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstBuiltInTypeList_compute() {
            List l = new List();
            for (ClassDecl pcd : getProgram().getBuiltInTypes()) {
                l.add(pcd.newInstClassDecl());
            }
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getInstBuiltInFunctionList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstBuiltInFunctionList_value;
    /**
     * @apilevel internal
     */
    private void getInstBuiltInFunctionList_reset() {
        getInstBuiltInFunctionList_computed = false;
        getInstBuiltInFunctionList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstBuiltInFunctionList() {
        if(getInstBuiltInFunctionList_computed) {
            return (List) getChild(getInstBuiltInFunctionListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstBuiltInFunctionList_value = getInstBuiltInFunctionList_compute();
        setChild(getInstBuiltInFunctionList_value, getInstBuiltInFunctionListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstBuiltInFunctionList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstBuiltInFunctionListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstBuiltInFunctionList_compute() {
            List l = new List();
            for (BaseClassDecl bcd : getProgram().getBuiltInFunctions()) {
                l.add(bcd.newInstClassDecl());
            }
            return l;
        }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1488
     * @apilevel internal
     */
    public FunctionReturnDefinition Define_returnDefinition(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstPredefinedTypeListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            {
                    for (InstClassDecl bcd : getInstPredefinedTypes()) 
                        if (bcd.matches(name))
                            return InstLookupResult.found(bcd); 
            
                    for (InstClassDecl bcd : getInstBuiltInTypes()) 
                        if (bcd.matches(name))
                            return InstLookupResult.found(bcd); 
            
                    return InstLookupResult.notFound();
                }
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return genericLookupInstClass(name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:717
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstBuiltInClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
                for (InstClassDecl bcd : getInstBuiltInTypes()) {
                    if (bcd.matches(name))
                        return InstLookupResult.found(bcd); 
                }
                
                return InstLookupResult.notFound();
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2600
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                throw new UnsupportedOperationException("Missing equation for inh calcInstanceName().");
            }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
