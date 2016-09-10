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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:70
 * @production InstRestriction : {@link BaseNode};

 */
public abstract class InstRestriction extends BaseNode implements Cloneable {
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:515
     */
    public void checkIfAllowedInOperator(ErrorCheckType checkType) {
        error("Classes other than operators, operator functions, functions and packages are not allowed in operator record classes");
    }
    /**
     * Perform content checks that are common to 'operator' and 'operator function'.
     * 
     * @param checkType  the kind of error checking being done
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:535
     */
    public void contentCheckAsOperator(ErrorCheckType checkType) {
        InstClassDecl rec = myInstClassDecl().myOperatorRecord();
        String name = myInstClassDecl().name();
        if (rec == null)
            error("Operator classes are only allowed in operator records and packages in operator records");
        else
            for (InstClassDecl f : operatorFunctions())
                f.contentCheckAsOperatorFunction(checkType, rec.recordType(), name);
        if (name.equals(FExp.OP_ZERO) && operatorFunctions().size() > 1)
            error("The '0' operator may not contain more than one function, but has %d", operatorFunctions().size());
        if (!FExp.OPERATORS.contains(name))
            error("Invalid name for operator class: %s", name);
        if (!myInstClassDecl().isEncapsulated())
            error("Operator classes must be encapsulated");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:283
     */
    public void flattenFunction(FClass fc, InstBaseClassDecl icd) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:547
     */
    public void flattenRecord(FClass fc, InstBaseClassDecl icd) {}
    /**
     * @declaredat ASTNode:1
     */
    public InstRestriction() {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:39
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public InstRestriction clone() throws CloneNotSupportedException {
        InstRestriction node = (InstRestriction) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:56
     */
    public abstract InstRestriction fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract InstRestriction treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract InstRestriction treeCopy();
    /**
     * @attribute syn
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2044
     */
    @ASTNodeAnnotation.Attribute
    public abstract String toString();
    @ASTNodeAnnotation.Attribute
    public FRecordType createEmptyFRecordType(Size s) {
        ASTNode$State state = state();
        FRecordType createEmptyFRecordType_Size_value = null;

        return createEmptyFRecordType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConnector() {
        ASTNode$State state = state();
        boolean isConnector_value = false;

        return isConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnector() {
        ASTNode$State state = state();
        boolean isExpandableConnector_value = false;

        return isExpandableConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = false;

        return isOperatorRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperator() {
        ASTNode$State state = state();
        boolean isOperator_value = false;

        return isOperator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunction() {
        ASTNode$State state = state();
        boolean isFunction_value = false;

        return isFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = false;

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCallable() {
        ASTNode$State state = state();
        boolean isCallable_value = false;

        return isCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPackage() {
        ASTNode$State state = state();
        boolean isPackage_value = false;

        return isPackage_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isModel() {
        ASTNode$State state = state();
        boolean isModel_value = false;

        return isModel_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBlock() {
        ASTNode$State state = state();
        boolean isBlock_value = false;

        return isBlock_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClass() {
        ASTNode$State state = state();
        boolean isClass_value = false;

        return isClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstRestriction inheritedRestriction() {
        ASTNode$State state = state();
        InstRestriction inheritedRestriction_value = null;

        return inheritedRestriction_value;
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedClassName() {
        ASTNode$State state = state();
        String qualifiedClassName_value = myInstClassDecl().buildQualifiedName();

        return qualifiedClassName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Map<String,InstClassDecl> operatorMap() {
        ASTNode$State state = state();
        Map<String,InstClassDecl> operatorMap_value = null;

        return operatorMap_value;
    }
    @ASTNodeAnnotation.Attribute
    public OperatorMatches matchOverloadedOperators(FType a, FType b, boolean aIsLeft) {
        ASTNode$State state = state();
        OperatorMatches matchOverloadedOperators_FType_FType_boolean_value = OperatorMatches.EMPTY;

        return matchOverloadedOperators_FType_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstClassDecl> operatorFunctions() {
        ASTNode$State state = state();
        java.util.List<InstClassDecl> operatorFunctions_value = Collections.emptyList();

        return operatorFunctions_value;
    }
    /**
     * Get the class this restriction is attached to.
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:696
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = getParent().Define_myInstClassDecl(this, null);

        return myInstClassDecl_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
