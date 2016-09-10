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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:139
 * @production InstGeneratedInner : {@link BaseNode} ::= <span class="component">{@link InstComponentDecl}</span> <span class="component">&lt;CopiedOuter:InstComponentDecl&gt;</span> <span class="component">&lt;MatchingNonInner:InstComponentDecl&gt;</span>;

 */
public class InstGeneratedInner extends BaseNode implements Cloneable {
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:686
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!checkType.allowBadGeneratedInner()) {
            boolean error = false;
            if (getMatchingNonInner() != null) {
                getCopiedOuter().error("Can not generate missing inner declaration for %s, due to presence of component with same name on top level", name());
                error = true;
            } else {
                ListMap<String, String> map = new LinkedHashListMap<String, String>();
                for (InstComponentDecl outer : outers) {
                    if (outer.myInstClass().isPartial()) {
                        outer.error("Can not generate missing inner declaration for outer component %s of partial type %s", 
                                outer.name(), outer.myInstClass().qualifiedName());
                        error = true;
                    } else {
                        map.add(outer.myInstClass().actualInstClass().qualifiedName(), outer.qualifiedName());
                    }
                }
                if (map.size() > 1) {
                    StringBuilder sb = new StringBuilder();
                    java.util.List<String> classes = new ArrayList<String>(map.keySet());
                    Collections.sort(classes);
                    for (String cls : classes) {
                        java.util.List<String> components = map.get(cls);
                        Collections.sort(components);
                        for (String outer : components) {
                            sb.append("\n    ");
                            sb.append(cls);
                            sb.append(" ");
                            sb.append(outer);
                        }
                    }
                    getCopiedOuter().error("Can't generate missing inner declaration for %s, due to the outer declarations being of different types: %s", name(), sb);
                    error = true;
                }
            }
            if (!error) {
                getInstComponentDecl().collectErrors(checkType);
                // TODO: Use missingInnerMessage annotation
                getCopiedOuter().warning("Generated missing inner declaration for '%s'", getCopiedOuter());
            }
        }
    }
    /**
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:98
     */
    public InstGeneratedInner(InstClassDecl parent, InstComponentDecl outer, InstComponentDecl nonInner) {
        this(parent.createInstComponentDecl(outer.getComponentDecl()), outer, nonInner);
        addOuter(outer);
    }
    /**
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:105
     */
    private Set<InstComponentDecl> outers = new HashSet<InstComponentDecl>();
    /**
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:107
     */
    public void addOuter(InstComponentDecl outer) {
        outers.add(outer);
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstGeneratedInner() {
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
    }
    /**
     * @declaredat ASTNode:13
     */
    public InstGeneratedInner(InstComponentDecl p0, InstComponentDecl p1, InstComponentDecl p2) {
        setChild(p0, 0);
        setCopiedOuter(p1);
        setMatchingNonInner(p2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 1;
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
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:45
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public InstGeneratedInner clone() throws CloneNotSupportedException {
        InstGeneratedInner node = (InstGeneratedInner) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public InstGeneratedInner copy() {
        try {
            InstGeneratedInner node = (InstGeneratedInner) clone();
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
     * @declaredat ASTNode:77
     */
    public InstGeneratedInner fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public InstGeneratedInner treeCopyNoTransform() {
        InstGeneratedInner tree = (InstGeneratedInner) copy();
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
     * @declaredat ASTNode:106
     */
    public InstGeneratedInner treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:113
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenInstComponentDecl_CopiedOuter == ((InstGeneratedInner)node).tokenInstComponentDecl_CopiedOuter) && (tokenInstComponentDecl_MatchingNonInner == ((InstGeneratedInner)node).tokenInstComponentDecl_MatchingNonInner);    
    }
    /**
     * Replaces the InstComponentDecl child.
     * @param node The new node to replace the InstComponentDecl child.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the InstComponentDecl child.
     * @return The current node used as the InstComponentDecl child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstComponentDecl")
    public InstComponentDecl getInstComponentDecl() {
        return (InstComponentDecl) getChild(0);
    }
    /**
     * Retrieves the InstComponentDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstComponentDecl child.
     * @apilevel low-level
     */
    public InstComponentDecl getInstComponentDeclNoTransform() {
        return (InstComponentDecl) getChildNoTransform(0);
    }
    /**
     * Replaces the lexeme CopiedOuter.
     * @param value The new value for the lexeme CopiedOuter.
     * @apilevel high-level
     */
    public void setCopiedOuter(InstComponentDecl value) {
        tokenInstComponentDecl_CopiedOuter = value;
    }
    /**
     * @apilevel internal
     */
    protected InstComponentDecl tokenInstComponentDecl_CopiedOuter;
    /**
     * Retrieves the value for the lexeme CopiedOuter.
     * @return The value for the lexeme CopiedOuter.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="CopiedOuter")
    public InstComponentDecl getCopiedOuter() {
        return tokenInstComponentDecl_CopiedOuter;
    }
    /**
     * Replaces the lexeme MatchingNonInner.
     * @param value The new value for the lexeme MatchingNonInner.
     * @apilevel high-level
     */
    public void setMatchingNonInner(InstComponentDecl value) {
        tokenInstComponentDecl_MatchingNonInner = value;
    }
    /**
     * @apilevel internal
     */
    protected InstComponentDecl tokenInstComponentDecl_MatchingNonInner;
    /**
     * Retrieves the value for the lexeme MatchingNonInner.
     * @return The value for the lexeme MatchingNonInner.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="MatchingNonInner")
    public InstComponentDecl getMatchingNonInner() {
        return tokenInstComponentDecl_MatchingNonInner;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = getCopiedOuter().matches(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getCopiedOuter().name();

        return name_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:488
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new Environment();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:517
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return new Environment();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:111
     * @apilevel internal
     */
    public boolean Define_isGeneratedInner(ASTNode caller, ASTNode child) {
        if (caller == getInstComponentDeclNoTransform()) {
            return true;
        }
        else {
            return super.Define_isGeneratedInner(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return getCopiedOuter().lookupInstClass(name);
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
