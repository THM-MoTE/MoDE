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
 * An FQName that is a simple string, used for scalarized names and simple names. 
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:445
 * @production FQNameString : {@link FQName} ::= <span class="component">&lt;Name:String&gt;</span>;

 */
public class FQNameString extends FQName implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4057
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right, FIdUse context) {
	  FFunctionVariable var = (FFunctionVariable) context.lookupFV(this);
	  var.setEvaluationValue(evaluator, right);
  }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:308
     */
    private String applyOpToName(String name, String op, int index) {
        return op + '(' + name + (index > 1 ? "," + index : "") + ')';
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:556
     */
    public FQNameString append(String name) {
        setName(getName() + '.' + name);
        return this;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:598
     */
    protected FQNameFull appendTo(FQNameFull fqn) {
        return fqn.append(getName());
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:621
     */
    public FQNameString copyAndAppend(String name) {
        return new FQNameString(getName() + '.' + name);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:665
     */
    public FQNameFull copyAsFQNameFull() {
        return new FQNameFull(getName());
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:695
     */
    public FQNameString copyAndPrepend(String name) {
        return new FQNameString(name + '.' + getName());
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:725
     */
    public FQNameString copyAndAddPrefix(String prefix, boolean removeUnderscore) {
        String name = getName();
        if (removeUnderscore && name.startsWith("_")) {
            name = name.substring(1);
        }
        return new FQNameString(prefix + name);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:752
     */
    public FQName copyAndAppend(FQName name) {
        return name.copyAndPrepend(getName());
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:769
     */
    public FQName copyAndAddSubscript(FSubscript s) {
        return new FQNameFull(getName()).addSubscript(s);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:814
     */
    public FQName copyAndAddFas(FArraySubscripts fas) {
        if (fas == null)
            return fullCopy();
        return new FQNameFull(getName()).addFArraySubscripts(fas);
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:941
     */
    public FQName copyPart(int first, int last) {
        if (last < first)
            return new FQNameEmpty();
        int fp = -1;
        String name = getName();
        for (int i = 0; i < first && (i == 0 || fp >= 0); i++)
            fp = name.indexOf('.', fp + 1);
        if (fp < 0 && first > 0)
            throw new ArrayIndexOutOfBoundsException(first);
        int lp = (fp < 0) ? 0 : fp;
        for (int i = first; i < last && lp >= 0; i++)
            lp = name.indexOf('.', lp + 1);
        if (lp < 0 && last > 0)
            throw new ArrayIndexOutOfBoundsException(last);
        lp = name.indexOf('.', lp + 1);
        return new FQNameString((lp < 0) ? name.substring(fp + 1) : name.substring(fp + 1, lp));
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1247
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(getName());
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:436
     */
    public void ensureFQNamesFull() {
        replaceMe(copyAsFQNameFull());
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1113
     */
    public FExp scalarRecordFExpForCon(Map<String,FExp> indexMap, FRecordConstructor con) {
        FExp arg = con.component(getName());
		return arg.scalarize(indexMap);
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1564
     */
    public FQName scalarize(Map<String,FExp> indexMap) {
		return new FQNameString(getName());
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:461
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		// TODO: Should probably be changed in schema, a simple string should be enough here
		for (String part : getName().split("\\."))
			str.println("<exp:QualifiedNamePart name=\"" + part + "\"/>");
	}
    /**
     * @declaredat ASTNode:1
     */
    public FQNameString() {
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
     * @declaredat ASTNode:12
     */
    public FQNameString(String p0) {
        setName(p0);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FQNameString(Symbol p0) {
        setName(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 0;
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
        derName_int_reset();
        dynDerName_int_reset();
        preName_reset();
        nameUnderscore_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:49
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FQNameString clone() throws CloneNotSupportedException {
        FQNameString node = (FQNameString) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FQNameString copy() {
        try {
            FQNameString node = (FQNameString) clone();
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
     * @declaredat ASTNode:81
     */
    public FQNameString fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public FQNameString treeCopyNoTransform() {
        FQNameString tree = (FQNameString) copy();
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
     * @declaredat ASTNode:110
     */
    public FQNameString treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:117
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_Name == ((FQNameString)node).tokenString_Name);    
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
    @ASTNodeAnnotation.Attribute
    public String partName(int i) {
        ASTNode$State state = state();
        String partName_int_value = (i == 0) ? getName() : super.partName(i);

        return partName_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastActualPartName() {
        ASTNode$State state = state();
        String lastActualPartName_value = getName().substring(getName().lastIndexOf('.') + 1);

        return lastActualPartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastActualTypePartName() {
        ASTNode$State state = state();
        String lastActualTypePartName_value = getName().substring(Math.max(getName().lastIndexOf('.'), getName().lastIndexOf(':')) + 1);

        return lastActualTypePartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String prefixActualPartName() {
        ASTNode$State state = state();
        String prefixActualPartName_value = getName().lastIndexOf('.') < 0 ? "" : getName().substring(0, getName().lastIndexOf('.'));

        return prefixActualPartName_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numParts() {
        ASTNode$State state = state();
        int numParts_value = 1;

        return numParts_value;
    }
    /**
     * The number of dots in the name.
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:227
     */
    @ASTNodeAnnotation.Attribute
    public int numDots() {
        ASTNode$State state = state();
        try {
                String name = getName();
                int n = 0;
                for (int i = name.indexOf('.'); i >= 0; n++, i = name.indexOf('.', i + 1));
                return n;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numMatchingParts(FQNameFull fqn) {
        ASTNode$State state = state();
        int numMatchingParts_FQNameFull_value = fqn.getFQNamePart(0).getName().equals(getName()) ? 1 : 0;

        return numMatchingParts_FQNameFull_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String resolvedName() {
        ASTNode$State state = state();
        String resolvedName_value = getName();

        return resolvedName_value;
    }
    protected Map derName_int_values;
    /**
     * @apilevel internal
     */
    private void derName_int_reset() {
        derName_int_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public String derName(int index) {
        Object _parameters = Integer.valueOf(index);
        if (derName_int_values == null) derName_int_values = new HashMap(4);
        if(derName_int_values.containsKey(_parameters)) {
            return (String)derName_int_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        String derName_int_value = applyOpToName(getName(), DER, index);
        if (isFinal && num == state().boundariesCrossed) {
            derName_int_values.put(_parameters, derName_int_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derName_int_value;
    }
    protected Map dynDerName_int_values;
    /**
     * @apilevel internal
     */
    private void dynDerName_int_reset() {
        dynDerName_int_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public String dynDerName(int index) {
        Object _parameters = Integer.valueOf(index);
        if (dynDerName_int_values == null) dynDerName_int_values = new HashMap(4);
        if(dynDerName_int_values.containsKey(_parameters)) {
            return (String)dynDerName_int_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        String dynDerName_int_value = applyOpToName(getName(), DYN_DER, index);
        if (isFinal && num == state().boundariesCrossed) {
            dynDerName_int_values.put(_parameters, dynDerName_int_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dynDerName_int_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean preName_computed = false;
    /**
     * @apilevel internal
     */
    protected String preName_value;
    /**
     * @apilevel internal
     */
    private void preName_reset() {
        preName_computed = false;
        preName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String preName() {
        if(preName_computed) {
            return preName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        preName_value = applyOpToName(getName(), PRE, -1);
        if (isFinal && num == state().boundariesCrossed) {
            preName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return preName_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean nameUnderscore_computed = false;
    /**
     * @apilevel internal
     */
    protected String nameUnderscore_value;
    /**
     * @apilevel internal
     */
    private void nameUnderscore_reset() {
        nameUnderscore_computed = false;
        nameUnderscore_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        if(nameUnderscore_computed) {
            return nameUnderscore_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        nameUnderscore_value = ASTNode.underScore(getName().replaceAll("]", ""));
        if (isFinal && num == state().boundariesCrossed) {
            nameUnderscore_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return nameUnderscore_value;
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:178
     */
    @ASTNodeAnnotation.Attribute
    public List<FQNamePart> buildAccessContext() {
        ASTNode$State state = state();
        try {
                List<FQNamePart> l = new List<FQNamePart>();
                l.add(new FQNamePart(name()));
                return l;
            }
        finally {
        }
    }
    /**
     * Return a new name that has index instead of the first array subscript with ndims() > 1.
     * 
     * If name has no subscripts, a set of subscripts with all colons is first created.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1454
     */
    @ASTNodeAnnotation.Attribute
    public FQName splitArrayAccess(int index) {
        ASTNode$State state = state();
        try {
                FQNameFull res = new FQNameFull(getName());
                int i = res.getNumFQNamePart();
                res.setFQNamePart(res.getFQNamePart(i - 1).splitArrayAccess(index, ndims()), i - 1);
                return res;
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
