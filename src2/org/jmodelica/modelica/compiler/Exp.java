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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:303
 * @production Exp : {@link AbstractExp};

 */
public abstract class Exp extends AbstractExp implements Cloneable, ConstantEvaluable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:779
     */
    public void prettyPrintAsElseExp(Printer p, CodeStream str, String indent) {
        str.print(' ');
        p.print(this, str, indent);
    }
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3035
     */
    public FExp instantiate() {
        return copyLocationTo(new FUnsupportedExp());
    }
    /**
     * @declaredat ASTNode:1
     */
    public Exp() {
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
        annotationNode_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:40
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public Exp clone() throws CloneNotSupportedException {
        Exp node = (Exp) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:57
     */
    public abstract Exp fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:64
     */
    public abstract Exp treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:72
     */
    public abstract Exp treeCopy();
    @ASTNodeAnnotation.Attribute
    public CValue ceval() {
        ASTNode$State state = state();
        CValue ceval_value = CValue.UNKNOWN;

        return ceval_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = ceval();

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAddOrSub() {
        ASTNode$State state = state();
        boolean isAddOrSub_value = false;

        return isAddOrSub_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimary() {
        ASTNode$State state = state();
        boolean isPrimary_value = false;

        return isPrimary_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean annotationNode_computed = false;
    /**
     * @apilevel internal
     */
    protected AnnotationNode annotationNode_value;
    /**
     * @apilevel internal
     */
    private void annotationNode_reset() {
        annotationNode_computed = false;
        annotationNode_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotationNode() {
        if(annotationNode_computed) {
            return annotationNode_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        annotationNode_value = new EAnnotationNode(this);
        if (isFinal && num == state().boundariesCrossed) {
            annotationNode_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return annotationNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunctionCall() {
        ASTNode$State state = state();
        boolean isFunctionCall_value = false;

        return isFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotationExp() {
        ASTNode$State state = state();
        boolean isAnnotationExp_value = false;

        return isAnnotationExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<? extends ASTNode> annotationList() {
        ASTNode$State state = state();
        Iterable<? extends ASTNode> annotationList_value = new ArrayList<ASTNode>(0);

        return annotationList_value;
    }
    @ASTNodeAnnotation.Attribute
    public String avalueString() {
        ASTNode$State state = state();
        String avalueString_value = null;

        return avalueString_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<String> avalueStringList() {
        ASTNode$State state = state();
        ArrayList<String> avalueStringList_value = null;

        return avalueStringList_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccess() {
        ASTNode$State state = state();
        boolean isAccess_value = false;

        return isAccess_value;
    }
    /**
     * @attribute syn
     * @aspect SourceUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:231
     */
    @ASTNodeAnnotation.Attribute
    public Access asAccess() {
        ASTNode$State state = state();
        try {
        		throw new UnsupportedOperationException();
        	}
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:598
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl lookupBuiltInFunction(String name) {
        ASTNode$State state = state();
        ClassDecl lookupBuiltInFunction_String_value = getParent().Define_lookupBuiltInFunction(this, null, name);

        return lookupBuiltInFunction_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
