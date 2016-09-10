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
 * Base class for variability type prefixes.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:140
 * @production FTypePrefixVariability : {@link FTypePrefix};

 */
public abstract class FTypePrefixVariability extends FTypePrefix implements Cloneable {
    /**
     * An ordering of the variability types.
     * 
     * To be used by methods for comparing variabilities. 
     * Should <em>never</em> be compared to literals, only to the return value from other 
     * FTypePrefixVariability objects. This simplifies adding new variabilities.
     * 
     * Also used to determine the behaviour of {@link #combine(FTypePrefixVariability)}.
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:79
     */
    abstract protected int variabilityLevel();
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:560
     */
    public FTypePrefixVariability combine(FTypePrefixVariability other) {
        return (other.combineLevel() > combineLevel()) ? other : this;
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:569
     */
    public FTypePrefixVariability combineDown(FTypePrefixVariability other) {
        return (other.combineLevel() < combineLevel()) ? other : this;
    }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:579
     */
    
        protected static abstract class Combiner {
            public abstract FTypePrefixVariability combine(FTypePrefixVariability v1, FTypePrefixVariability v2);
        }
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:599
     */
    public FTypePrefixVariability combine(FTypePrefixVariability other, Combiner combiner) {
        return combiner.combine(this, other);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:910
     */
    
        public enum VariabilityCausality_C {
            CI("ci"),
            CD("cd"),
            PI("pi"),
            PS("ps"),
            PF("pf"),
            PE("pe"),
            PD("pd");
            
            private String s;
            
            private VariabilityCausality_C(String s) {
                this.s = s;
            }
            
            public String toString() {
                return s;
            }
        }
    /**
     * @declaredat ASTNode:1
     */
    public FTypePrefixVariability() {
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
    public FTypePrefixVariability clone() throws CloneNotSupportedException {
        FTypePrefixVariability node = (FTypePrefixVariability) super.clone();
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
    public abstract FTypePrefixVariability fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract FTypePrefixVariability treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract FTypePrefixVariability treeCopy();
    /**
     * @attribute syn
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2008
     */
    @ASTNodeAnnotation.Attribute
    public abstract String toString();
    /**
     * @attribute syn
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2020
     */
    @ASTNodeAnnotation.Attribute
    public abstract String toStringLiteral();
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3124
     */
    @ASTNodeAnnotation.Attribute
    public abstract String genJMIVariabilityConstant_C();
    @ASTNodeAnnotation.Attribute
    public boolean constantVariability() {
        ASTNode$State state = state();
        boolean constantVariability_value = false;

        return constantVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean structParameterVariability() {
        ASTNode$State state = state();
        boolean structParameterVariability_value = false;

        return structParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean evalParameterVariability() {
        ASTNode$State state = state();
        boolean evalParameterVariability_value = false;

        return evalParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean finalParameterVariability() {
        ASTNode$State state = state();
        boolean finalParameterVariability_value = false;

        return finalParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean knownParameterVariability() {
        ASTNode$State state = state();
        boolean knownParameterVariability_value = false;

        return knownParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean indexParameterVariability() {
        ASTNode$State state = state();
        boolean indexParameterVariability_value = false;

        return indexParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fixedParameterVariability() {
        ASTNode$State state = state();
        boolean fixedParameterVariability_value = false;

        return fixedParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean initialParameterVariability() {
        ASTNode$State state = state();
        boolean initialParameterVariability_value = false;

        return initialParameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean parameterVariability() {
        ASTNode$State state = state();
        boolean parameterVariability_value = false;

        return parameterVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean discreteVariability() {
        ASTNode$State state = state();
        boolean discreteVariability_value = false;

        return discreteVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean continuousVariability() {
        ASTNode$State state = state();
        boolean continuousVariability_value = false;

        return continuousVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compositeVariability() {
        ASTNode$State state = state();
        boolean compositeVariability_value = false;

        return compositeVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public int compareTo(FTypePrefixVariability other) {
        ASTNode$State state = state();
        int compareTo_FTypePrefixVariability_value = variabilityLevel() - other.variabilityLevel();

        return compareTo_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean equals(FTypePrefixVariability other) {
        ASTNode$State state = state();
        boolean equals_FTypePrefixVariability_value = compareTo(other) == 0;

        return equals_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean lessOrEqual(FTypePrefixVariability other) {
        ASTNode$State state = state();
        boolean lessOrEqual_FTypePrefixVariability_value = compareTo(other) <= 0;

        return lessOrEqual_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean evalOrLess() {
        ASTNode$State state = state();
        boolean evalOrLess_value = lessOrEqual(fEvalParameter());

        return evalOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean knownParameterOrLess() {
        ASTNode$State state = state();
        boolean knownParameterOrLess_value = lessOrEqual(fFinalParameter());

        return knownParameterOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean parameterOrLess() {
        ASTNode$State state = state();
        boolean parameterOrLess_value = lessOrEqual(fInitialParameter());

        return parameterOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean indexParameterOrLess() {
        ASTNode$State state = state();
        boolean indexParameterOrLess_value = lessOrEqual(fIndexParameter());

        return indexParameterOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fixedParameterOrLess() {
        ASTNode$State state = state();
        boolean fixedParameterOrLess_value = lessOrEqual(fFixedParameter());

        return fixedParameterOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean discreteOrLess() {
        ASTNode$State state = state();
        boolean discreteOrLess_value = lessOrEqual(fDiscrete());

        return discreteOrLess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean continuousOrLess() {
        ASTNode$State state = state();
        boolean continuousOrLess_value = lessOrEqual(fContinuous());

        return continuousOrLess_value;
    }
    /**
     * Combines (up) component variabilities to a single primitive variability.
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:103
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combine() {
        ASTNode$State state = state();
        try {
                return this;
            }
        finally {
        }
    }
    /**
     * Combines (down) component variabilities to a single primitive variability.
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:118
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combineDown() {
        ASTNode$State state = state();
        try {
                return this;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability component(String name) {
        ASTNode$State state = state();
        FTypePrefixVariability component_String_value = this;

        return component_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public int combineLevel() {
        ASTNode$State state = state();
        int combineLevel_value = variabilityLevel() * 10;

        return combineLevel_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combinePropagate(FTypePrefixVariability other) {
        ASTNode$State state = state();
        FTypePrefixVariability combinePropagate_FTypePrefixVariability_value = other;

        return combinePropagate_FTypePrefixVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability combineInherit(FTypePrefixVariability other) {
        ASTNode$State state = state();
        FTypePrefixVariability combineInherit_FTypePrefixVariability_value = other.combineDown(this);

        return combineInherit_FTypePrefixVariability_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1498
     */
    @ASTNodeAnnotation.Attribute
    public boolean aliasCompatible(FTypePrefixVariability that) {
        ASTNode$State state = state();
        try {
                return this.equals(that);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public List<FAbstractEquation> selectEquations(List<FAbstractEquation> iEqus, List<FAbstractEquation> pEqus, List<FAbstractEquation> equs) {
        ASTNode$State state = state();
        List<FAbstractEquation> selectEquations_List_FAbstractEquation__List_FAbstractEquation__List_FAbstractEquation__value = equs;

        return selectEquations_List_FAbstractEquation__List_FAbstractEquation__List_FAbstractEquation__value;
    }
    /**
     * @attribute syn
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:933
     */
    @ASTNodeAnnotation.Attribute
    public VariabilityCausality_C variabilityCausality_C(FVariable fv) {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
