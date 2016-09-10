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
 * Enumeration literal expression.
 * 
 * All accesses to enumeration literals should be replaced by FEnumLitExps in flat tree.
 * Note that Type may be unset in the flat tree - use type().
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1069
 * @production FEnumLitExp : {@link FLitExp} ::= <span class="component">&lt;Enum:String&gt;</span> <span class="component">&lt;Value:String&gt;</span> <span class="component">[Type:{@link FEnumType}]</span>;

 */
public class FEnumLitExp extends FLitExp implements Cloneable {
    /**
     * Constructs a enumeration literal expression from a type and an ordinal.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:217
     */
    public FEnumLitExp(FEnumType type, int val) {
		this(type.getName(), type.getFEnumLiteralType(val - 1).getName(), new Opt(type.unboundCopy()));
	}
    /**
     * Constructs a enumeration literal expression from a type and a literal name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:224
     */
    public FEnumLitExp(FEnumType type, String val) {
		this(type.getName(), val, new Opt(type.unboundCopy()));
	}
    /**
     * Constructs a enumeration literal expression from an enum name and a value name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:231
     */
    public FEnumLitExp(String name, String val) {
		this(name, val, new Opt());
	}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1062
     */
    public FEnumLitExp createEmptyNode()         { return new FEnumLitExp();         }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1661
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print(getEnum());
		str.print('.');
		str.print(getValue());
	}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2468
     */
    public FExp flatten(FQName prefix) { return new FEnumLitExp(getEnum(), getValue(), null); }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1744
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) { 
	    return inArraySubscripts() ? new FIntegerLitExp(ceval().intValue()) : super.scalarizeExp(indexMap);
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:208
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		open_XML(str, indent);
		p.print(new FQNameFull(getEnum(), getValue()), str, p.indent(indent));
		close_XML(str, indent);
	}
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:130
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        boolean wrap = inIfCondition();
        if (wrap) {
            str.print(FLitExp.macro_C);
            str.print("(");
        }
        str.print(ceval().intValue());
        if (wrap) {
            str.print(")");
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FEnumLitExp() {
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
    }
    /**
     * @declaredat ASTNode:14
     */
    public FEnumLitExp(String p0, String p1, Opt<FEnumType> p2) {
        setEnum(p0);
        setValue(p1);
        setChild(p2, 0);
    }
    /**
     * @declaredat ASTNode:19
     */
    public FEnumLitExp(Symbol p0, Symbol p1, Opt<FEnumType> p2) {
        setEnum(p0);
        setValue(p1);
        setChild(p2, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:27
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myFEnumDecl_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:52
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FEnumLitExp clone() throws CloneNotSupportedException {
        FEnumLitExp node = (FEnumLitExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FEnumLitExp copy() {
        try {
            FEnumLitExp node = (FEnumLitExp) clone();
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
     * @declaredat ASTNode:84
     */
    public FEnumLitExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FEnumLitExp treeCopyNoTransform() {
        FEnumLitExp tree = (FEnumLitExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
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
     * @declaredat ASTNode:118
     */
    public FEnumLitExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:125
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_Enum == ((FEnumLitExp)node).tokenString_Enum) && (tokenString_Value == ((FEnumLitExp)node).tokenString_Value);    
    }
    /**
     * Replaces the lexeme Enum.
     * @param value The new value for the lexeme Enum.
     * @apilevel high-level
     */
    public void setEnum(String value) {
        tokenString_Enum = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Enum;
    /**
     */
    public int Enumstart;
    /**
     */
    public int Enumend;
    /**
     * JastAdd-internal setter for lexeme Enum using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Enum
     * @apilevel internal
     */
    public void setEnum(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setEnum is only valid for String lexemes");
        tokenString_Enum = (String)symbol.value;
        Enumstart = symbol.getStart();
        Enumend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Enum.
     * @return The value for the lexeme Enum.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Enum")
    public String getEnum() {
        return tokenString_Enum != null ? tokenString_Enum : "";
    }
    /**
     * Replaces the lexeme Value.
     * @param value The new value for the lexeme Value.
     * @apilevel high-level
     */
    public void setValue(String value) {
        tokenString_Value = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Value;
    /**
     */
    public int Valuestart;
    /**
     */
    public int Valueend;
    /**
     * JastAdd-internal setter for lexeme Value using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Value
     * @apilevel internal
     */
    public void setValue(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setValue is only valid for String lexemes");
        tokenString_Value = (String)symbol.value;
        Valuestart = symbol.getStart();
        Valueend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Value.
     * @return The value for the lexeme Value.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Value")
    public String getValue() {
        return tokenString_Value != null ? tokenString_Value : "";
    }
    /**
     * Replaces the optional node for the Type child. This is the <code>Opt</code>
     * node containing the child Type, not the actual child!
     * @param opt The new node to be used as the optional node for the Type child.
     * @apilevel low-level
     */
    public void setTypeOpt(Opt<FEnumType> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) Type child.
     * @param node The new node to be used as the Type child.
     * @apilevel high-level
     */
    public void setType(FEnumType node) {
        getTypeOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Type child exists.
     * @return {@code true} if the optional Type child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasType() {
        return getTypeOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Type child.
     * @return The Type child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FEnumType getType() {
        return (FEnumType) getTypeOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Type child. This is the <code>Opt</code> node containing the child Type, not the actual child!
     * @return The optional node for child the Type child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Type")
    public Opt<FEnumType> getTypeOpt() {
        return (Opt<FEnumType>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Type. This is the <code>Opt</code> node containing the child Type, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Type.
     * @apilevel low-level
     */
    public Opt<FEnumType> getTypeOptNoTransform() {
        return (Opt<FEnumType>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 1;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = new CValueEnum(type(), getValue());

        return cevalCalc_VariableEvaluator_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFEnumDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FEnumDecl myFEnumDecl_value;
    /**
     * @apilevel internal
     */
    private void myFEnumDecl_reset() {
        myFEnumDecl_computed = false;
        myFEnumDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FEnumDecl myFEnumDecl() {
        if(myFEnumDecl_computed) {
            return myFEnumDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFEnumDecl_value = lookupFEnum(getEnum());
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        FType type_value = hasType() ? getType() : myFEnumDecl().type();

        return type_value;
    }
    /**
     * @attribute syn
     * @aspect ExpressionSimplification
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:530
     */
    @ASTNodeAnnotation.Attribute
    public boolean equalsSymbolic(FExp other) {
        ASTNode$State state = state();
        try {
                if (!(other instanceof FEnumLitExp))
                    return false;
                FEnumLitExp o = (FEnumLitExp) other;
                return getValue() == o.getValue(); 
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Identifier";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect FlatEnumBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:611
     */
    @ASTNodeAnnotation.Attribute
    public FEnumDecl lookupFEnum(String name) {
        ASTNode$State state = state();
        FEnumDecl lookupFEnum_String_value = getParent().Define_lookupFEnum(this, null, name);

        return lookupFEnum_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
