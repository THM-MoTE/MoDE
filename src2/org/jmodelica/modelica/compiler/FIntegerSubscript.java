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
 * A literal integer subscript.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:542
 * @production FIntegerSubscript : {@link FSubscript} ::= <span class="component">&lt;Value:int&gt;</span>;

 */
public class FIntegerSubscript extends FSubscript implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:625
     */
    public void addDeclarationSize(MutableSize s) {
		s.append(getValue());
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1275
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(getValue());
	}
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2738
     */
    public boolean calculateExpandableConnectorSize(MutableSize s, int i, int len) {
        s.set(i, getValue());
        return true;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1875
     */
    public FSubscript flatten(FQName prefix) { 
        return new FIntegerSubscript(getValue());
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:524
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
		String namespace = "exp";
		String tag = this.xmlTag();
		
		str.println(indent + "<" + namespace + ":" + tag +  ">");
		
		FIntegerLitExp fi = new FIntegerLitExp(getValue());
		fi.prettyPrint_XML(str,p.indent(indent));
		str.println(indent + "</" + namespace + ":" + tag +  ">");
			
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:258
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		str.print(getValue());
	}
    /**
     * @declaredat ASTNode:1
     */
    public FIntegerSubscript() {
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
    public FIntegerSubscript(int p0) {
        setValue(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:18
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:24
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:30
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:43
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public FIntegerSubscript clone() throws CloneNotSupportedException {
        FIntegerSubscript node = (FIntegerSubscript) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:56
     */
    public FIntegerSubscript copy() {
        try {
            FIntegerSubscript node = (FIntegerSubscript) clone();
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
     * @declaredat ASTNode:75
     */
    public FIntegerSubscript fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:84
     */
    public FIntegerSubscript treeCopyNoTransform() {
        FIntegerSubscript tree = (FIntegerSubscript) copy();
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
     * @declaredat ASTNode:104
     */
    public FIntegerSubscript treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:111
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_Value == ((FIntegerSubscript)node).tokenint_Value);    
    }
    /**
     * Replaces the lexeme Value.
     * @param value The new value for the lexeme Value.
     * @apilevel high-level
     */
    public void setValue(int value) {
        tokenint_Value = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Value;
    /**
     * Retrieves the value for the lexeme Value.
     * @return The value for the lexeme Value.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Value")
    public int getValue() {
        return tokenint_Value;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = 0;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public int[] myIndices() {
        ASTNode$State state = state();
        int[] myIndices_value = new int[] { getValue() };

        return myIndices_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript resolveSubscripts(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        FSubscript resolveSubscripts_VariableEvaluator_value = fullCopy();

        return resolveSubscripts_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = new CValueInteger(getValue());

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public int value() {
        ASTNode$State state = state();
        int value_value = getValue();

        return value_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = Size.SCALAR;

        return size_value;
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
        type_value = fIntegerScalarType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript specify(int index) {
        ASTNode$State state = state();
        FSubscript specify_int_value = this;

        return specify_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "IndexExpression";

        return xmlTag_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
