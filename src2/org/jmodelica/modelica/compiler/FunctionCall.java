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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:365
 * @production FunctionCall : {@link Exp} ::= <span class="component">Name:{@link Access}</span> <span class="component">[{@link FunctionArguments}]</span>;

 */
public class FunctionCall extends Exp implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:809
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		p.print(getName(),str,indent);
		str.print("("); 
		p.print(getFunctionArgumentsOpt(),str,indent);
		str.print(")");
	}
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3216
     */
    protected FAbstractFunctionCall createInstNode(InstAccess name, List<InstFunctionArgument> args) {
        return new InstFunctionCall(name, args);
    }
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3224
     */
    public FAbstractFunctionCall instantiate() {
        // Instantiate arguments
        List<InstFunctionArgument> args = new List<InstFunctionArgument>();
        if (hasFunctionArguments()) {
            int i = 0;
            for (Exp arg : getFunctionArguments().getExpList()) {
                InstPositionalArgument iarg = new InstPositionalArgument(arg.instantiate(), i++);
                iarg.setLocation(arg);
                args.add(iarg);
            }
            for (NamedArgument arg : getFunctionArguments().getNamedArguments())
                args.add(arg.instantiate());
        }
        
        // Create InstFunctionCall
        return copyLocationTo(createInstNode(getName().newInstAccess(), args));
    }
    /**
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:137
     */
    public void dumpTree(String indent) {
  	log.debug("** FunctionCall.dumpTree");
  	super.dumpTree(indent);
  }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1673
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		getName().doPrettyPrintFormatted(printer, printStream);
		printStream.print("(");
		if (hasFunctionArguments()) {
			getFunctionArguments().doPrettyPrintFormatted(printer, printStream);
		}
		printStream.print(")");
	}
    /**
     * @declaredat ASTNode:1
     */
    public FunctionCall() {
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
        setChild(new Opt(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FunctionCall(Access p0, Opt<FunctionArguments> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 2;
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
        annotationNode_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:46
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:52
     */
    public FunctionCall clone() throws CloneNotSupportedException {
        FunctionCall node = (FunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FunctionCall copy() {
        try {
            FunctionCall node = (FunctionCall) clone();
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
     * @declaredat ASTNode:78
     */
    public FunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public FunctionCall treeCopyNoTransform() {
        FunctionCall tree = (FunctionCall) copy();
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
     * @declaredat ASTNode:107
     */
    public FunctionCall treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:114
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(Access node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public Access getName() {
        return (Access) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public Access getNameNoTransform() {
        return (Access) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the FunctionArguments child. This is the <code>Opt</code>
     * node containing the child FunctionArguments, not the actual child!
     * @param opt The new node to be used as the optional node for the FunctionArguments child.
     * @apilevel low-level
     */
    public void setFunctionArgumentsOpt(Opt<FunctionArguments> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) FunctionArguments child.
     * @param node The new node to be used as the FunctionArguments child.
     * @apilevel high-level
     */
    public void setFunctionArguments(FunctionArguments node) {
        getFunctionArgumentsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FunctionArguments child exists.
     * @return {@code true} if the optional FunctionArguments child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFunctionArguments() {
        return getFunctionArgumentsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FunctionArguments child.
     * @return The FunctionArguments child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FunctionArguments getFunctionArguments() {
        return (FunctionArguments) getFunctionArgumentsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FunctionArguments child. This is the <code>Opt</code> node containing the child FunctionArguments, not the actual child!
     * @return The optional node for child the FunctionArguments child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FunctionArguments")
    public Opt<FunctionArguments> getFunctionArgumentsOpt() {
        return (Opt<FunctionArguments>) getChild(1);
    }
    /**
     * Retrieves the optional node for child FunctionArguments. This is the <code>Opt</code> node containing the child FunctionArguments, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FunctionArguments.
     * @apilevel low-level
     */
    public Opt<FunctionArguments> getFunctionArgumentsOptNoTransform() {
        return (Opt<FunctionArguments>) getChildNoTransform(1);
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
        annotationNode_value = new FCAnnotationNode(this);
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
        boolean isFunctionCall_value = true;

        return isFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotationExp() {
        ASTNode$State state = state();
        boolean isAnnotationExp_value = true;

        return isAnnotationExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<? extends ASTNode> annotationList() {
        ASTNode$State state = state();
        Iterable<? extends ASTNode> annotationList_value = Collections.singletonList(this);

        return annotationList_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getNameNoTransform().name();

        return name_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
