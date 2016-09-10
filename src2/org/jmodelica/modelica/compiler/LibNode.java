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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:116
 * @production LibNode : {@link SourceBaseNode} ::= <span class="component">&lt;FileName:String&gt;</span> <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Structured:boolean&gt;</span> <span class="component">&lt;Version:String&gt;</span> <span class="component">&lt;Reason:LibNode.LoadReason&gt;</span> <span class="component">{@link StoredDefinition}</span>;

 */
public class LibNode extends SourceBaseNode implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:539
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.format("%s%structured library '%s' at '%s'\n", indent, 
				(getStructured() ? "S" : "Uns"), getName(), getFileName());
	}
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:32
     */
    
        public enum LoadReason { COMMANDLINE, MODELICAPATH }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:32
     */
    ;
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:45
     */
    public static final String PACKAGE_FILE = "package.mo";
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:46
     */
    public static final String PACKAGE_ORDER_FILE = "package.order";
    /**
     * Check if a path points to a structured library.
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:119
     */
    public static boolean isStructuredLib(File f) {
        return f.isDirectory() && new File(f, PACKAGE_FILE).isFile();
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:123
     */
    public static boolean isUnstructuredLib(File f) {
        String name = f.getName();
        return f.isFile() && LibNode.isUnstructuredLibName(name);
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:128
     */
    private static boolean isUnstructuredLibName(String name) {
        return name.endsWith(".mo") && !name.equals(PACKAGE_FILE);
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:132
     */
    private File myPackageFile() {
        return new File(getFileName(), myPackageFileName());
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:136
     */
    private String myPackageFileName() {
        return LibNode.PACKAGE_FILE;
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:140
     */
    public static String packageFile(File f) {
        File l = new File(f,LibNode.PACKAGE_FILE);
        if (!l.exists()) {
             return null;
        }
        return l.getPath();
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:148
     */
    static boolean isPackageFile(File f) {
        return f.getName().equals(LibNode.PACKAGE_FILE);
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:161
     */
    private StoredDefinition createErrorStoredDefinition() {
        StoredDefinition sd = new StoredDefinition(new Opt(), new List());
        sd.addElement(createErrorClass());
        return sd;
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:167
     */
    private BadClassDecl createErrorClass() {
        BadClassDecl bcd = new BadClassDecl();
        bcd.setName(new IdDecl("_ErrorClassDecl_in_lib"));
        return bcd;
    }
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:173
     */
    public LibNode(File file, String name, boolean structured, LoadReason reason) {
        this(file.getPath(), name, structured, "", reason);
    }
    /**
     * @aspect FileNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:540
     */
    public String fileName() {
        return getFileName();
    }
    /**
     * @declaredat ASTNode:1
     */
    public LibNode() {
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
    public LibNode(String p0, String p1, boolean p2, String p3, LoadReason p4) {
        setFileName(p0);
        setName(p1);
        setStructured(p2);
        setVersion(p3);
        setReason(p4);
    }
    /**
     * @declaredat ASTNode:20
     */
    public LibNode(Symbol p0, Symbol p1, boolean p2, Symbol p3, LoadReason p4) {
        setFileName(p0);
        setName(p1);
        setStructured(p2);
        setVersion(p3);
        setReason(p4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:30
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getStoredDefinition_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:55
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public LibNode clone() throws CloneNotSupportedException {
        LibNode node = (LibNode) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public LibNode copy() {
        try {
            LibNode node = (LibNode) clone();
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
     * @declaredat ASTNode:87
     */
    public LibNode fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public LibNode treeCopyNoTransform() {
        LibNode tree = (LibNode) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 0:
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
     * @declaredat ASTNode:121
     */
    public LibNode treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:128
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_FileName == ((LibNode)node).tokenString_FileName) && (tokenString_Name == ((LibNode)node).tokenString_Name) && (tokenboolean_Structured == ((LibNode)node).tokenboolean_Structured) && (tokenString_Version == ((LibNode)node).tokenString_Version) && (tokenLibNode_LoadReason_Reason == ((LibNode)node).tokenLibNode_LoadReason_Reason);    
    }
    /**
     * Replaces the lexeme FileName.
     * @param value The new value for the lexeme FileName.
     * @apilevel high-level
     */
    public void setFileName(String value) {
        tokenString_FileName = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_FileName;
    /**
     */
    public int FileNamestart;
    /**
     */
    public int FileNameend;
    /**
     * JastAdd-internal setter for lexeme FileName using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme FileName
     * @apilevel internal
     */
    public void setFileName(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setFileName is only valid for String lexemes");
        tokenString_FileName = (String)symbol.value;
        FileNamestart = symbol.getStart();
        FileNameend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme FileName.
     * @return The value for the lexeme FileName.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="FileName")
    public String getFileName() {
        return tokenString_FileName != null ? tokenString_FileName : "";
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
     * @apilevel internal
     */
    protected String tokenString_Name;
    /**
     */
    public int Namestart;
    /**
     */
    public int Nameend;
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
     * Replaces the lexeme Structured.
     * @param value The new value for the lexeme Structured.
     * @apilevel high-level
     */
    public void setStructured(boolean value) {
        tokenboolean_Structured = value;
    }
    /**
     * @apilevel internal
     */
    protected boolean tokenboolean_Structured;
    /**
     * Retrieves the value for the lexeme Structured.
     * @return The value for the lexeme Structured.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Structured")
    public boolean getStructured() {
        return tokenboolean_Structured;
    }
    /**
     * Replaces the lexeme Version.
     * @param value The new value for the lexeme Version.
     * @apilevel high-level
     */
    public void setVersion(String value) {
        tokenString_Version = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Version;
    /**
     */
    public int Versionstart;
    /**
     */
    public int Versionend;
    /**
     * JastAdd-internal setter for lexeme Version using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Version
     * @apilevel internal
     */
    public void setVersion(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setVersion is only valid for String lexemes");
        tokenString_Version = (String)symbol.value;
        Versionstart = symbol.getStart();
        Versionend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Version.
     * @return The value for the lexeme Version.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Version")
    public String getVersion() {
        return tokenString_Version != null ? tokenString_Version : "";
    }
    /**
     * Replaces the lexeme Reason.
     * @param value The new value for the lexeme Reason.
     * @apilevel high-level
     */
    public void setReason(LoadReason value) {
        tokenLibNode_LoadReason_Reason = value;
    }
    /**
     * @apilevel internal
     */
    protected LoadReason tokenLibNode_LoadReason_Reason;
    /**
     * Retrieves the value for the lexeme Reason.
     * @return The value for the lexeme Reason.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Reason")
    public LibNode.LoadReason getReason() {
        return tokenLibNode_LoadReason_Reason;
    }
    /**
     * Retrieves the StoredDefinition child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the StoredDefinition child.
     * @apilevel low-level
     */
    public StoredDefinition getStoredDefinitionNoTransform() {
        return (StoredDefinition) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child StoredDefinition.
     * @return The the child position of the optional child StoredDefinition.
     * @apilevel low-level
     */
    protected int getStoredDefinitionChildPosition() {
        return 0;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fromCommandLine() {
        ASTNode$State state = state();
        boolean fromCommandLine_value = getReason() == LoadReason.COMMANDLINE;

        return fromCommandLine_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fromModelicaPath() {
        ASTNode$State state = state();
        boolean fromModelicaPath_value = getReason() == LoadReason.MODELICAPATH;

        return fromModelicaPath_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getStoredDefinition_computed = false;
    /**
     * @apilevel internal
     */
    protected StoredDefinition getStoredDefinition_value;
    /**
     * @apilevel internal
     */
    private void getStoredDefinition_reset() {
        getStoredDefinition_computed = false;
        getStoredDefinition_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public StoredDefinition getStoredDefinition() {
        if(getStoredDefinition_computed) {
            return (StoredDefinition) getChild(getStoredDefinitionChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getStoredDefinition_value = getStoredDefinition_compute();
        setChild(getStoredDefinition_value, getStoredDefinitionChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getStoredDefinition_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        StoredDefinition node = (StoredDefinition) this.getChild(getStoredDefinitionChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private StoredDefinition getStoredDefinition_compute() {
            /* If structured
                    a. Read all files
                    b. Check for package.mo
                    c. Parse package.mo
                    d. Read all .mo files
                    e. Add LibNodes to the LibClassDecl
                    f. Return the LibClassDecl
               If unstructured
                    a. Parse the .mo file
                    b. Return the resulting FullClassDecl
            */
            
            String fileName = getFileName();
            String dirName = null;
            File baseDir = null;
            boolean isStructured = getStructured();
            if (isStructured) {
                dirName = getFileName();
                baseDir = new File(dirName);
                fileName = myPackageFile().getPath();
            }
            try {
                log.info("Reading file: " + fileName);
                SourceRoot sr = ParserHandler.parseFile(root().getUtilInterface(), fileName);
                StoredDefinition entity = sr.getProgram().getUnstructuredEntity(0);
                if (entity == null) {
                    if (isStructured) {
                        warning("Empty structured entity, package is omitted", sr);
                    }
                    return new StoredDefinition();
                }
                entity.setFileName(fileName);
                if (isStructured) {
                    FullClassDecl fcd = (FullClassDecl)entity.getElement(0);
                    LibClassDecl lcd = new LibClassDecl(fcd);
                    
                    LibraryList ll = new LibraryList();
                    ll.addLibraryDirectory(dirName, getReason());
                    lcd.setLibNodeList(ll.createLibNodeList());
                    
                    File orderFile = new File(baseDir, PACKAGE_ORDER_FILE);
                    if (orderFile.isFile()) {
                        BufferedReader in = new BufferedReader(ParserHandler.fileReader(root().getUtilInterface(), orderFile));
                        java.util.List<String> order = new ArrayList<String>();
                        String line;
                        while ((line = in.readLine()) != null)
                            order.add(line);
                        lcd.setOrder(order);
                    }
                    
                    entity.setElement(lcd, 0);
                }
                return entity;
            } catch (ParserException e) {
                problem(e.getProblem());
                return createErrorStoredDefinition();
            } catch (Exception e) {
                String msg = "Error when parsing file: '" + fileName + "':\n" + 
                        "   " + e.getClass().getName() + "\n";
                if (e.getMessage() != null)
                    msg = msg + "   " + e.getMessage();
                error(msg);
                log.debug(e);
                return createErrorStoredDefinition();
            } 
        }
    @ASTNodeAnnotation.Attribute
    public ClassDecl classDecl() {
        ASTNode$State state = state();
        ClassDecl classDecl_value = (getStoredDefinition().getNumElement() > 0) ? (ClassDecl) getStoredDefinition().getElement(0) : createErrorClass();

        return classDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = getName().equals(str);

        return matches_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
