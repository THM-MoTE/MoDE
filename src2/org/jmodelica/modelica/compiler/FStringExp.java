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
 * String conversion operator.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1686
 * @production FStringExp : {@link FBuiltInFunctionCall} ::= <span class="component">Value:{@link FExp}</span> <span class="component">[MinimumLength:{@link FExp}]</span> <span class="component">[LeftJustified:{@link FExp}]</span> <span class="component">[SignificantDigits:{@link FExp}]</span> <span class="component">[Format:{@link FExp}]</span>;

 */
public class FStringExp extends FBuiltInFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2622
     */
    public static final int DEFAULT_PRECISION = 6;
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1140
     */
    public FStringExp createEmptyNode()       { return new FStringExp();       }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:299
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        if (hasMinimumLength()) {
            getMinimumLength().markAsStructuralParameter(checkType);
            if (!getMinimumLength().variability().parameterOrLess())
                UNSUPPORTED_NON_FIXED_STRING_ARGUMENT.invoke(getMinimumLength(), "minimumLength");
        }
        if (hasLeftJustified()) {
            getLeftJustified().markAsStructuralParameter(checkType);
           if (!getLeftJustified().variability().parameterOrLess())
               UNSUPPORTED_NON_FIXED_STRING_ARGUMENT.invoke(getLeftJustified(), "leftJustified");
        }
        if (hasSignificantDigits()) {
            getSignificantDigits().markAsStructuralParameter(checkType);
            if (!getSignificantDigits().variability().parameterOrLess())
                UNSUPPORTED_NON_FIXED_STRING_ARGUMENT.invoke(getSignificantDigits(), "significantDigits");
       }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1057
     */
    public void typeCheck(ErrorCheckType checkType) {
		FType valueType = getValue().type();
		if (hasSignificantDigits() && !valueType.isReal())
			error("Calling function String(): named argument significantDigits can only be used when first argument is real");
		if (hasFormat() && (hasMinimumLength() || hasLeftJustified() || hasSignificantDigits()))
			error("Calling function String(): named argument format can not be used together with minimumLength, leftJustified or significantDigits");
	}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2576
     */
    public FStringExp flatten(FQName prefix) {
        FStringExp flattened = new FStringExp();
        flattened.setValue(getValue().flatten(prefix));
        if (hasMinimumLength())
            flattened.setMinimumLength(getMinimumLength().flatten(prefix));
        if (hasLeftJustified())
            flattened.setLeftJustified(getLeftJustified().flatten(prefix));
        if (hasSignificantDigits())
            flattened.setSignificantDigits(getSignificantDigits().flatten(prefix));
        if (hasFormat())
            flattened.setFormat(getFormat().flatten(prefix));
        return flattened;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1758
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap)  {
		FStringExp scalarized = new FStringExp();
		scalarized.setValue(getValue().scalarize(indexMap));
		if (hasMinimumLength())
			scalarized.setMinimumLength(getMinimumLength().scalarize(indexMap));
		if (hasLeftJustified())
			scalarized.setLeftJustified(getLeftJustified().scalarize(indexMap));
		if (hasSignificantDigits())
			scalarized.setSignificantDigits(getSignificantDigits().scalarize(indexMap));
		if (hasFormat())
			scalarized.setFormat(getFormat().scalarize(indexMap));
		return scalarized;
	}
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:851
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        super.genVarDecls_C(p, str, indent);
        genTopStringDecl(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:857
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        super.genTempVars_C(p, str, indent);
        genTopStringInit(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:863
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print(tempName_C());
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:868
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        super.genTempFree_C(p, str, indent);
        genTopStringFree(p, str, indent);
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:874
     */
    @Override
    public void genMaxStringLength_C(CodePrinter p, CodeStream str, String indent) {
        if (hasFormat()) {
            str.print(getValue().type().maxNumericStringLength_C(DEFAULT_PRECISION));
        } else {
            if (hasMinimumLength()) {
                str.print("jmi_max(");
            }
            str.print(getValue().type().maxStringLength_C(0));
            if (getValue().type().isReal()) {
                str.print(" + ");
                if (hasSignificantDigits()) {
                    p.print(getSignificantDigits(), str, indent);
                } else {
                    str.print(significantDigits());
                }
            }
            if (hasMinimumLength()) {
                str.print(", ");
                p.print(getMinimumLength(), str, indent);
                str.print(")");
            }
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:952
     */
    @Override
    public void genStringFormat_C(CodePrinter p, CodeStream str, String indent) {
        if (hasFormat()) {
            p.print(getFormat(), str, indent);
        } else {
            if (hasLeftJustified()) {
                str.print("COND_EXP_EQ(");
                p.print(getLeftJustified(), str, indent);
                str.print(", JMI_TRUE, ");
            }
            
            genStringFormat_C(str, true);
            
            if (hasLeftJustified()) {
                str.print(", ");
                genStringFormat_C(str, false);
                str.print(")");
            }
            
            if (hasMinimumLength()) {
                str.print(", (int) ");
                p.print(getMinimumLength(), str, indent);
            }
            
            if (getValue().type().isReal()) {
                str.print(", (int) ");
                if (hasSignificantDigits()) {
                    p.print(getSignificantDigits(), str, indent);
                } else {
                    str.print(significantDigits());
                }
            }
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:987
     */
    public void genStringFormat_C(CodeStream str, boolean justifyLeft) {
        str.print("\"%");
        if (justifyLeft)
            str.print("-");
        if (hasMinimumLength())
            str.print("*");
        if (getValue().type().isReal())
            str.print(".*");
        str.print(getValue().type().formatSpecifier());
        str.print("\"");
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:1018
     */
    @Override
    public void genStringParts_C(CodePrinter p, CodeStream str, String indent) {
        getValue().genStringParts_C(p, str, indent);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FStringExp() {
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
        children = new ASTNode[7];
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new List(), 6);
    }
    /**
     * @declaredat ASTNode:18
     */
    public FStringExp(FExp p0, Opt<FExp> p1, Opt<FExp> p2, Opt<FExp> p3, Opt<FExp> p4) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:28
     */
    protected int numChildren() {
        return 5;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:54
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FStringExp clone() throws CloneNotSupportedException {
        FStringExp node = (FStringExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public FStringExp copy() {
        try {
            FStringExp node = (FStringExp) clone();
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
     * @declaredat ASTNode:86
     */
    public FStringExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public FStringExp treeCopyNoTransform() {
        FStringExp tree = (FStringExp) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 5:
                    tree.children[i] = null;
                    continue;
                case 6:
                    tree.children[i] = new List();
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
     * @declaredat ASTNode:123
     */
    public FStringExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:130
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Value child.
     * @param node The new node to replace the Value child.
     * @apilevel high-level
     */
    public void setValue(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Value child.
     * @return The current node used as the Value child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Value")
    public FExp getValue() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the Value child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Value child.
     * @apilevel low-level
     */
    public FExp getValueNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the MinimumLength child. This is the <code>Opt</code>
     * node containing the child MinimumLength, not the actual child!
     * @param opt The new node to be used as the optional node for the MinimumLength child.
     * @apilevel low-level
     */
    public void setMinimumLengthOpt(Opt<FExp> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) MinimumLength child.
     * @param node The new node to be used as the MinimumLength child.
     * @apilevel high-level
     */
    public void setMinimumLength(FExp node) {
        getMinimumLengthOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional MinimumLength child exists.
     * @return {@code true} if the optional MinimumLength child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasMinimumLength() {
        return getMinimumLengthOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) MinimumLength child.
     * @return The MinimumLength child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getMinimumLength() {
        return (FExp) getMinimumLengthOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the MinimumLength child. This is the <code>Opt</code> node containing the child MinimumLength, not the actual child!
     * @return The optional node for child the MinimumLength child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="MinimumLength")
    public Opt<FExp> getMinimumLengthOpt() {
        return (Opt<FExp>) getChild(1);
    }
    /**
     * Retrieves the optional node for child MinimumLength. This is the <code>Opt</code> node containing the child MinimumLength, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child MinimumLength.
     * @apilevel low-level
     */
    public Opt<FExp> getMinimumLengthOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the LeftJustified child. This is the <code>Opt</code>
     * node containing the child LeftJustified, not the actual child!
     * @param opt The new node to be used as the optional node for the LeftJustified child.
     * @apilevel low-level
     */
    public void setLeftJustifiedOpt(Opt<FExp> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) LeftJustified child.
     * @param node The new node to be used as the LeftJustified child.
     * @apilevel high-level
     */
    public void setLeftJustified(FExp node) {
        getLeftJustifiedOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional LeftJustified child exists.
     * @return {@code true} if the optional LeftJustified child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasLeftJustified() {
        return getLeftJustifiedOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) LeftJustified child.
     * @return The LeftJustified child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getLeftJustified() {
        return (FExp) getLeftJustifiedOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the LeftJustified child. This is the <code>Opt</code> node containing the child LeftJustified, not the actual child!
     * @return The optional node for child the LeftJustified child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="LeftJustified")
    public Opt<FExp> getLeftJustifiedOpt() {
        return (Opt<FExp>) getChild(2);
    }
    /**
     * Retrieves the optional node for child LeftJustified. This is the <code>Opt</code> node containing the child LeftJustified, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child LeftJustified.
     * @apilevel low-level
     */
    public Opt<FExp> getLeftJustifiedOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the SignificantDigits child. This is the <code>Opt</code>
     * node containing the child SignificantDigits, not the actual child!
     * @param opt The new node to be used as the optional node for the SignificantDigits child.
     * @apilevel low-level
     */
    public void setSignificantDigitsOpt(Opt<FExp> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) SignificantDigits child.
     * @param node The new node to be used as the SignificantDigits child.
     * @apilevel high-level
     */
    public void setSignificantDigits(FExp node) {
        getSignificantDigitsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional SignificantDigits child exists.
     * @return {@code true} if the optional SignificantDigits child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasSignificantDigits() {
        return getSignificantDigitsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) SignificantDigits child.
     * @return The SignificantDigits child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getSignificantDigits() {
        return (FExp) getSignificantDigitsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the SignificantDigits child. This is the <code>Opt</code> node containing the child SignificantDigits, not the actual child!
     * @return The optional node for child the SignificantDigits child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="SignificantDigits")
    public Opt<FExp> getSignificantDigitsOpt() {
        return (Opt<FExp>) getChild(3);
    }
    /**
     * Retrieves the optional node for child SignificantDigits. This is the <code>Opt</code> node containing the child SignificantDigits, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child SignificantDigits.
     * @apilevel low-level
     */
    public Opt<FExp> getSignificantDigitsOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Format child. This is the <code>Opt</code>
     * node containing the child Format, not the actual child!
     * @param opt The new node to be used as the optional node for the Format child.
     * @apilevel low-level
     */
    public void setFormatOpt(Opt<FExp> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) Format child.
     * @param node The new node to be used as the Format child.
     * @apilevel high-level
     */
    public void setFormat(FExp node) {
        getFormatOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Format child exists.
     * @return {@code true} if the optional Format child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFormat() {
        return getFormatOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Format child.
     * @return The Format child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getFormat() {
        return (FExp) getFormatOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Format child. This is the <code>Opt</code> node containing the child Format, not the actual child!
     * @return The optional node for child the Format child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Format")
    public Opt<FExp> getFormatOpt() {
        return (Opt<FExp>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Format. This is the <code>Opt</code> node containing the child Format, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Format.
     * @apilevel low-level
     */
    public Opt<FExp> getFormatOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(4);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(5);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 5;
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * @return Number of children in the OriginalArg list.
     * @apilevel high-level
     */
    public int getNumOriginalArg() {
        return getOriginalArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the OriginalArg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the OriginalArg list.
     * @apilevel low-level
     */
    public int getNumOriginalArgNoTransform() {
        return getOriginalArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the OriginalArg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the OriginalArg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getOriginalArg(int i) {
        return (InstFunctionArgument) getOriginalArgList().getChild(i);
    }
    /**
     * Check whether the OriginalArg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasOriginalArg() {
        return getOriginalArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the OriginalArg list.
     * @param node The element to append to the OriginalArg list.
     * @apilevel high-level
     */
    public void addOriginalArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getOriginalArgListNoTransform() : getOriginalArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addOriginalArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getOriginalArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the OriginalArg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setOriginalArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getOriginalArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the OriginalArg list.
     * @return The the child position of the OriginalArg list.
     * @apilevel low-level
     */
    protected int getOriginalArgListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(6);
    }
    /**
     * Retrieves the OriginalArg list.
     * @return The node representing the OriginalArg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getOriginalArgs() {
        return getOriginalArgList();
    }
    /**
     * Retrieves the OriginalArg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the OriginalArg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getOriginalArgsNoTransform() {
        return getOriginalArgListNoTransform();
    }
    /**
     * @apilevel internal
     */
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = getValue().size();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * Delegate attribute for ceval().
     * 
     * This needs to be overridden for subclasses of FExp.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2131
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
                Object value;
                if (getValue().type().isReal())
                  value = getValue().ceval(evaluator).realValue();
                else if (getValue().type().isInteger())
                  value = getValue().ceval(evaluator).intValue();
                else if (getValue().type().isBoolean() || getValue().type().isEnum())
                  value = getValue().ceval(evaluator).stringValue();
                else
                  return CValue.UNKNOWN;
                return new CValueString(String.format((Locale) null, formatString(), value));
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String formatString() {
        ASTNode$State state = state();
        String formatString_value = "%" + formatFlags() + formatWidth() + formatPrecision() + formatSpecifier();

        return formatString_value;
    }
    @ASTNodeAnnotation.Attribute
    public String formatWidth() {
        ASTNode$State state = state();
        String formatWidth_value = minimumLength() > 0 ? String.valueOf(minimumLength()) : "";

        return formatWidth_value;
    }
    @ASTNodeAnnotation.Attribute
    public String formatFlags() {
        ASTNode$State state = state();
        String formatFlags_value = leftJustified() && minimumLength() > 0 ? "-" : "";

        return formatFlags_value;
    }
    @ASTNodeAnnotation.Attribute
    public String formatPrecision() {
        ASTNode$State state = state();
        String formatPrecision_value = getValue().type().isReal() ? "." + significantDigits() : "";

        return formatPrecision_value;
    }
    @ASTNodeAnnotation.Attribute
    public String formatSpecifier() {
        ASTNode$State state = state();
        String formatSpecifier_value = getValue().type().formatSpecifier();

        return formatSpecifier_value;
    }
    @ASTNodeAnnotation.Attribute
    public int minimumLength() {
        ASTNode$State state = state();
        int minimumLength_value = hasMinimumLength() ? getMinimumLength().ceval().intValue() : 0;

        return minimumLength_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean leftJustified() {
        ASTNode$State state = state();
        boolean leftJustified_value = hasLeftJustified() ? getLeftJustified().ceval().booleanValue() : true;

        return leftJustified_value;
    }
    @ASTNodeAnnotation.Attribute
    public int significantDigits() {
        ASTNode$State state = state();
        int significantDigits_value = hasSignificantDigits() ? getSignificantDigits().ceval().intValue() : DEFAULT_PRECISION;

        return significantDigits_value;
    }
    @ASTNodeAnnotation.Attribute
    public String builtInName() {
        ASTNode$State state = state();
        String builtInName_value = "String";

        return builtInName_value;
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
        type_value = fStringScalarType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public String operatorName() {
        ASTNode$State state = state();
        String operatorName_value = OP_STR;

        return operatorName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isKnownStringLength() {
        ASTNode$State state = state();
        boolean isKnownStringLength_value = (!hasSignificantDigits() || getSignificantDigits().variability().knownParameterOrLess())
                    && (!hasMinimumLength() || getMinimumLength().variability().knownParameterOrLess());

        return isKnownStringLength_value;
    }
    @ASTNodeAnnotation.Attribute
    public int maxStringLength_C() {
        ASTNode$State state = state();
        int maxStringLength_C_value = hasFormat() ? type().maxNumericStringLength_C(significantDigits()) :
                    Math.max(getValue().type().maxStringLength_C(significantDigits()), minimumLength());

        return maxStringLength_C_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1294
     * @apilevel internal
     */
    public boolean Define_argumentDefinedTypeValid(ASTNode caller, ASTNode child) {
        if (caller == getOriginalArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i > 0;
        }
        else {
            return super.Define_argumentDefinedTypeValid(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1326
     * @apilevel internal
     */
    public boolean Define_argumentTypeValid(ASTNode caller, ASTNode child, FType type) {
        int childIndex = this.getIndexOfChild(caller);
        return type.isScalar() && (type.isReal() || type.isInteger() || type.isBoolean() || type.isEnum());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1362
     * @apilevel internal
     */
    public String Define_expectedArgumentType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return "scalar Real, Integer, Boolean or enumeration";
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
