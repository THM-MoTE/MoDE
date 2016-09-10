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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:84
 * @production InstExternal : {@link BaseNode} ::= <span class="component">&lt;ExternalClause:ExternalClause&gt;</span> <span class="component">[{@link FExternalLanguage}]</span> <span class="component">[{@link InstExternalCall}]</span>;

 */
public class InstExternal extends BaseNode implements Cloneable {
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1480
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print("external ");
		p.print(getFExternalLanguage(), str, indent);
		str.print(" ");
		p.print(getInstExternalCall(), str, indent);
	}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:76
     */
    public void contentCheck(ErrorCheckType checkType) {
		if (!inFunction())
			error("External function declarations are only allowed in functions");
	}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:589
     */
    public void flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        getFAlgorithm().getFStatement(0).flatten(sl, fc, prefix);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:599
     */
    public FExternalStmt createStmt() {
        InstClassDecl func = surroundingInstClass();
        FExternalStmt stmt = new FExternalStmt();
        stmt.setFExternalLanguage(hasFExternalLanguage() ? 
                (FExternalLanguage) getFExternalLanguage().fullCopy() : 
                new FCExternalLanguage());
        stmt.extractLibrary(this);
        if (hasInstExternalCall()) {
            InstExternalCall call = getInstExternalCall();
            if (call.hasReturnVar()) {
                stmt.setReturnVar(new FIdUseExp(new FIdUseInstAccess(call.getReturnVar().fullCopy())));
            }
            stmt.setName(call.getName());
            for (FExp arg : call.getArgs()) {
                stmt.addArg(arg.treeCopy());
            }
        } else {
            boolean hasReturn = func.myOutputs().size() == 1 && 
                    func.myOutputs().get(0).canBeExternalReturn(stmt.getFExternalLanguage());
            if (hasReturn) {
                stmt.setReturnVar(new FIdUseExp(new FIdUseInstAccess(new InstComponentAccess(func.myOutputs().get(0).name()))));
            }
            stmt.setName(func.name());
            for (InstComponentDecl arg : func.allInstComponentDecls()) {
                if (!hasReturn || !arg.isOutput()) {
                    arg.addExternalArg(stmt.getArgs());
                }
            }
        }
        return stmt;
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2788
     */
    public String toString() {
    	return getExternalClause().toString();
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstExternal() {
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
    public InstExternal(ExternalClause p0, Opt<FExternalLanguage> p1, Opt<InstExternalCall> p2) {
        setExternalClause(p0);
        setChild(p1, 0);
        setChild(p2, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getFAlgorithm_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:48
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public InstExternal clone() throws CloneNotSupportedException {
        InstExternal node = (InstExternal) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public InstExternal copy() {
        try {
            InstExternal node = (InstExternal) clone();
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
     * @declaredat ASTNode:80
     */
    public InstExternal fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public InstExternal treeCopyNoTransform() {
        InstExternal tree = (InstExternal) copy();
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
     * @declaredat ASTNode:109
     */
    public InstExternal treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:116
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenExternalClause_ExternalClause == ((InstExternal)node).tokenExternalClause_ExternalClause);    
    }
    /**
     * Replaces the lexeme ExternalClause.
     * @param value The new value for the lexeme ExternalClause.
     * @apilevel high-level
     */
    public void setExternalClause(ExternalClause value) {
        tokenExternalClause_ExternalClause = value;
    }
    /**
     * @apilevel internal
     */
    protected ExternalClause tokenExternalClause_ExternalClause;
    /**
     * Retrieves the value for the lexeme ExternalClause.
     * @return The value for the lexeme ExternalClause.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ExternalClause")
    public ExternalClause getExternalClause() {
        return tokenExternalClause_ExternalClause;
    }
    /**
     * Replaces the optional node for the FExternalLanguage child. This is the <code>Opt</code>
     * node containing the child FExternalLanguage, not the actual child!
     * @param opt The new node to be used as the optional node for the FExternalLanguage child.
     * @apilevel low-level
     */
    public void setFExternalLanguageOpt(Opt<FExternalLanguage> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FExternalLanguage child.
     * @param node The new node to be used as the FExternalLanguage child.
     * @apilevel high-level
     */
    public void setFExternalLanguage(FExternalLanguage node) {
        getFExternalLanguageOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FExternalLanguage child exists.
     * @return {@code true} if the optional FExternalLanguage child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFExternalLanguage() {
        return getFExternalLanguageOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FExternalLanguage child.
     * @return The FExternalLanguage child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExternalLanguage getFExternalLanguage() {
        return (FExternalLanguage) getFExternalLanguageOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FExternalLanguage child. This is the <code>Opt</code> node containing the child FExternalLanguage, not the actual child!
     * @return The optional node for child the FExternalLanguage child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FExternalLanguage")
    public Opt<FExternalLanguage> getFExternalLanguageOpt() {
        return (Opt<FExternalLanguage>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FExternalLanguage. This is the <code>Opt</code> node containing the child FExternalLanguage, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FExternalLanguage.
     * @apilevel low-level
     */
    public Opt<FExternalLanguage> getFExternalLanguageOptNoTransform() {
        return (Opt<FExternalLanguage>) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the InstExternalCall child. This is the <code>Opt</code>
     * node containing the child InstExternalCall, not the actual child!
     * @param opt The new node to be used as the optional node for the InstExternalCall child.
     * @apilevel low-level
     */
    public void setInstExternalCallOpt(Opt<InstExternalCall> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) InstExternalCall child.
     * @param node The new node to be used as the InstExternalCall child.
     * @apilevel high-level
     */
    public void setInstExternalCall(InstExternalCall node) {
        getInstExternalCallOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstExternalCall child exists.
     * @return {@code true} if the optional InstExternalCall child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstExternalCall() {
        return getInstExternalCallOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstExternalCall child.
     * @return The InstExternalCall child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstExternalCall getInstExternalCall() {
        return (InstExternalCall) getInstExternalCallOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstExternalCall child. This is the <code>Opt</code> node containing the child InstExternalCall, not the actual child!
     * @return The optional node for child the InstExternalCall child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstExternalCall")
    public Opt<InstExternalCall> getInstExternalCallOpt() {
        return (Opt<InstExternalCall>) getChild(1);
    }
    /**
     * Retrieves the optional node for child InstExternalCall. This is the <code>Opt</code> node containing the child InstExternalCall, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstExternalCall.
     * @apilevel low-level
     */
    public Opt<InstExternalCall> getInstExternalCallOptNoTransform() {
        return (Opt<InstExternalCall>) getChildNoTransform(1);
    }
    /**
     * @apilevel internal
     */
    protected boolean getFAlgorithm_computed = false;
    /**
     * @apilevel internal
     */
    protected FAlgorithm getFAlgorithm_value;
    /**
     * @apilevel internal
     */
    private void getFAlgorithm_reset() {
        getFAlgorithm_computed = false;
        getFAlgorithm_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FAlgorithm getFAlgorithm() {
        if(getFAlgorithm_computed) {
            return getFAlgorithm_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFAlgorithm_value = getFAlgorithm_compute();
        getFAlgorithm_value.setParent(this);
        getFAlgorithm_value.is$Final = true;
        if (true) {
            getFAlgorithm_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getFAlgorithm_value;
    }
    /**
     * @apilevel internal
     */
    private FAlgorithm getFAlgorithm_compute() {
            FAlgorithm fab = new FAlgorithm(new List());
            fab.addFStatement(createStmt());
            return fab;
        }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getExternalClause().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public String libraryName() {
        ASTNode$State state = state();
        String libraryName_value = findLibraryName();

        return libraryName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1599
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:346
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl surroundingInstClass() {
        ASTNode$State state = state();
        InstClassDecl surroundingInstClass_value = getParent().Define_surroundingInstClass(this, null);

        return surroundingInstClass_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:709
     */
    @ASTNodeAnnotation.Attribute
    public String packageName() {
        ASTNode$State state = state();
        String packageName_value = getParent().Define_packageName(this, null);

        return packageName_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:721
     */
    @ASTNodeAnnotation.Attribute
    public String findLibraryName() {
        ASTNode$State state = state();
        String findLibraryName_value = getParent().Define_findLibraryName(this, null);

        return findLibraryName_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
