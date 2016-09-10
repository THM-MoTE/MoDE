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
 * A class representing the root node of a source AST.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:64
 * @production SourceRoot : {@link Root} ::= <span class="component">{@link Program}</span>;

 */
public class SourceRoot extends Root implements Cloneable {
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:37
     */
    public VisibilityType computeVisibility() {
        return new PublicVisibilityType();
    }
    /**
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:19
     */
    public List computePredefinedType() {
        return getProgram().getPredefinedTypeList();
    }
    /**
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:593
     */
    public ClassDecl doLookupBuiltInFunction(String name) {
        return unknownClassDecl();
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:118
     */
    @Override
	public void propagateFormatting() {
		getProgram().propagateFormatting();
	}
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:657
     */
    public String computeClassNamePrefix() {
      return "";
  }
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:891
     */
    public Access computeNextAccess() {
        return null;
    }
    /**
     * @declaredat ASTNode:1
     */
    public SourceRoot() {
        super();
        is$Final(true);
    }
    /**
     * Initializes the child array to the correct size.
     * Initializes List and Opt nta children.
     * @apilevel internal
     * @ast method
     * @declaredat ASTNode:11
     */
    public void init$Children() {
        children = new ASTNode[1];
    }
    /**
     * @declaredat ASTNode:14
     */
    public SourceRoot(Program p0) {
        setChild(p0, 0);
        is$Final(true);
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
        getUnknownInstClassDecl_reset();
        getUnknownInstComponentDecl_reset();
        findOutermostLibraryDir_reset();
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
    public SourceRoot clone() throws CloneNotSupportedException {
        SourceRoot node = (SourceRoot) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public SourceRoot copy() {
        try {
            SourceRoot node = (SourceRoot) clone();
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
    public SourceRoot fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public SourceRoot treeCopyNoTransform() {
        SourceRoot tree = (SourceRoot) copy();
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
    public SourceRoot treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:116
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Program child.
     * @param node The new node to replace the Program child.
     * @apilevel high-level
     */
    public void setProgram(Program node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Program child.
     * @return The current node used as the Program child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Program")
    public Program getProgram() {
        return (Program) getChild(0);
    }
    /**
     * Retrieves the Program child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Program child.
     * @apilevel low-level
     */
    public Program getProgramNoTransform() {
        return (Program) getChildNoTransform(0);
    }
    @ASTNodeAnnotation.Attribute
    public UnknownClassDecl unknownClassDecl() {
        ASTNode$State state = state();
        UnknownClassDecl unknownClassDecl_value = getProgram().getUnknownClassDecl();

        return unknownClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownComponentDecl unknownComponentDecl() {
        ASTNode$State state = state();
        UnknownComponentDecl unknownComponentDecl_value = getProgram().getUnknownComponentDecl();

        return unknownComponentDecl_value;
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
            return getUnknownInstClassDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownInstClassDecl_value = getProgram().getInstProgramRoot().getUnknownInstClassDecl();
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownInstClassDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getUnknownInstClassDecl_value;
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
            return getUnknownInstComponentDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownInstComponentDecl_value = getProgram().getInstProgramRoot().getUnknownInstComponentDecl();
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownInstComponentDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getUnknownInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstClassDecl unknownInstClassDecl() {
        ASTNode$State state = state();
        UnknownInstClassDecl unknownInstClassDecl_value = getUnknownInstClassDecl();

        return unknownInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownInstComponentDecl unknownInstComponentDecl() {
        ASTNode$State state = state();
        UnknownInstComponentDecl unknownInstComponentDecl_value = getUnknownInstComponentDecl();

        return unknownInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String language() {
        ASTNode$State state = state();
        String language_value = "Modelica";

        return language_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFileInLibrary() {
        ASTNode$State state = state();
        boolean isFileInLibrary_value = findOutermostLibraryDir() != null;

        return isFileInLibrary_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean findOutermostLibraryDir_computed = false;
    /**
     * @apilevel internal
     */
    protected String findOutermostLibraryDir_value;
    /**
     * @apilevel internal
     */
    private void findOutermostLibraryDir_reset() {
        findOutermostLibraryDir_computed = false;
        findOutermostLibraryDir_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String findOutermostLibraryDir() {
        if(findOutermostLibraryDir_computed) {
            return findOutermostLibraryDir_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        findOutermostLibraryDir_value = findOutermostLibraryDir_compute();
        if (isFinal && num == state().boundariesCrossed) {
            findOutermostLibraryDir_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return findOutermostLibraryDir_value;
    }
    /**
     * @apilevel internal
     */
    private String findOutermostLibraryDir_compute() {
        if (getProgram().getNumUnstructuredEntity() != 1) 
            return null;
        else
            return getProgram().getUnstructuredEntity(0).findOutermostLibraryDir();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2981
     * @apilevel internal
     */
    public boolean Define_inAlgebraicAccessLocation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3151
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return new FQNameEmpty();
        }
        else {
            return getParent().Define_retrieveFQName(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1897
     * @apilevel internal
     */
    public boolean Define_inNoEventExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1904
     * @apilevel internal
     */
    public boolean Define_inSmoothExp(ASTNode caller, ASTNode child, int order) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1909
     * @apilevel internal
     */
    public boolean Define_inConnectClause(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1916
     * @apilevel internal
     */
    public boolean Define_inIfCondition(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:551
     * @apilevel internal
     */
    public InstComponentDecl Define_errorEnclosingComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return InstLookupResult.notFound();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return InstLookupResult.notFound();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:33
     * @apilevel internal
     */
    public VisibilityType Define_visibility(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return computeVisibility();
        }
        else {
            return super.Define_visibility(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:23
     * @apilevel internal
     */
    public List Define_getPredefinedType(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return computePredefinedType();
        }
        else {
            return super.Define_getPredefinedType(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:598
     * @apilevel internal
     */
    public ClassDecl Define_lookupBuiltInFunction(ASTNode caller, ASTNode child, String name) {
        if (caller == getProgramNoTransform()) {
            return doLookupBuiltInFunction(name);
        }
        else {
            return super.Define_lookupBuiltInFunction(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:652
     * @apilevel internal
     */
    public String Define_classNamePrefix(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return computeClassNamePrefix();
        }
        else {
            return super.Define_classNamePrefix(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:835
     * @apilevel internal
     */
    public InstClassDecl Define_enclosingInstClassDecl(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return null;
        }
        else {
            return getParent().Define_enclosingInstClassDecl(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:895
     * @apilevel internal
     */
    public Access Define_getNextAccess(ASTNode caller, ASTNode child) {
        if (caller == getProgramNoTransform()) {
            return computeNextAccess();
        }
        else {
            return super.Define_getNextAccess(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
