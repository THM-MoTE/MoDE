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
 * For indices expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1085
 * @production FForIndex : {@link CommonForIndex} ::= <span class="component">{@link FVariable}</span>;

 */
public class FForIndex extends CommonForIndex implements Cloneable {
    /**
     * Constructs an FForIndex with a temporary index variable and a 
     * range expression starting at 1 as the in expression.
     * 
     * @param name  the name of the index
     * @param end   the upper limit for the range expression
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:436
     */
    public FForIndex(String name, FExp end) {
		this();
		setFExp(new FRangeExp(new FIntegerLitExp(1), end));
		setFVariable(new FIntegerVariable(new FTemporaryVisibilityType(), 
				fParameter(), new FQNameString(name)));
	}
    /**
     * Constructs an FForIndex with a temporary index variable and loops 
     * over the given variable.        
     * 
     * @param name  the name of the index
     * @param var   the name of the variable to loop over
     * @param dim   the dimension to loop over
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:451
     */
    public FForIndex(String name, FQName var, int dim) {
		this(name, new FSizeExp(var, dim));
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1948
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.print(getFVariable().name());
        if (hasFExp()) {
            str.print(" in ");
        p.print(getFExp(), str, indent);
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2780
     */
    public FForIndex flatten(FQName prefix) {
        return (FForIndex) fullCopy();
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1841
     */
    public FForIndex scalarize(Map<String,FExp> indexMap) {
		return new FForIndex(hasFExp() ? new Opt(getFExp().scalarizeIndexExp(indexMap)) : new Opt(), 
				(FVariable) getFVariable().fullCopy());
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:386
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
        String namespace="fun";
        String tag = "Index";      
        String varTag = "IterationVariable";
        FQName qVarName = this.getFVariable().getFQName();
        String expTag = "IterationSet";       
        
        str.println(indent + "<" + namespace + ":" + tag + ">"); 
        
        str.println(indent + "\t<" + namespace + ":" + varTag + ">"); 
        qVarName.prettyPrint_XML(str,p.indent(indent+"\t"));
        str.println(indent + "\t</" + namespace + ":" + varTag + ">"); 
        
        if (this.hasFExp()){
        	str.println(indent + "\t<" + namespace + ":" + expTag + ">");
        	this.getFExp().prettyPrint_XML(str,p.indent(indent+"\t"));
        	str.println(indent + "\t</" + namespace + ":" + expTag + ">");
        }     	
        str.println(indent + "</" + namespace + ":" + tag + ">"); 
     
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1765
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        super.genVarDecls_CAD(p, str, indent);
        String name = getFVariable().name_C();
        str.format("%sjmi_ad_var_t %s;\n", indent, name);
        if (needsForArray()) {
            str.format("%sint %si;\n", indent, name);
            str.format("%sjmi_ad_var_t %sa[%d];\n", indent, name, getFExp().size().numElements());
        } else {
            str.format("%sjmi_ad_var_t %se;\n", indent, name);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1911
     */
    @Override
	public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
		super.genVarDecls_C(p, str, indent);
		String name = getFVariable().name_C();
		str.format("%sjmi_ad_var_t %s;\n", indent, name);
		if (needsForArray()) {
			str.format("%sint %si;\n", indent, name);
			str.format("%sjmi_ad_var_t %sa[%d];\n", indent, name, getFExp().size().numElements());
		} else {
			str.format("%sjmi_ad_var_t %se;\n", indent, name);
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1924
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		getFExp().printForIndex_C(p, str, indent, getFVariable().name_C());
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1929
     */
    public void printForArrayInit_C(CodePrinter p, CodeStream str, String indent) {
		if (needsForArray()) {
			int i = 0;
			for (FExp e : getFExp().getArray().iterable()) {
				str.format("%s%sa[%d] = ", indent, getFVariable().name_C(), i++);
				p.print(e, str, indent);
				str.print(";\n");
			}
		} else {
			str.format("%s%se = ", indent, getFVariable().name_C());
			getFExp().printForEnd_C(p, str, indent);
			str.print(";\n");
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1944
     */
    public void printForArrayNext_C(CodePrinter p, CodeStream str, String indent) {
		if (needsForArray()) {
			String name = getFVariable().name_C();
			str.print(indent);
			str.print(name);
			str.print(" = ");
			str.print(name);
			str.print("a[");
			str.print(name);
			str.print("i];\n");
		}
	}
    /**
     * @declaredat ASTNode:1
     */
    public FForIndex() {
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
    public FForIndex(Opt<FExp> p0, FVariable p1) {
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
        isCircular_reset();
        forIndexIndex_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:47
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public FForIndex clone() throws CloneNotSupportedException {
        FForIndex node = (FForIndex) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FForIndex copy() {
        try {
            FForIndex node = (FForIndex) clone();
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
     * @declaredat ASTNode:79
     */
    public FForIndex fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public FForIndex treeCopyNoTransform() {
        FForIndex tree = (FForIndex) copy();
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
     * @declaredat ASTNode:108
     */
    public FForIndex treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:115
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the FExp child. This is the <code>Opt</code>
     * node containing the child FExp, not the actual child!
     * @param opt The new node to be used as the optional node for the FExp child.
     * @apilevel low-level
     */
    public void setFExpOpt(Opt<FExp> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FExp child.
     * @param node The new node to be used as the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        getFExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FExp child exists.
     * @return {@code true} if the optional FExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFExp() {
        return getFExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FExp child.
     * @return The FExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getFExp() {
        return (FExp) getFExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FExp child. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * @return The optional node for child the FExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FExp")
    public Opt<FExp> getFExpOpt() {
        return (Opt<FExp>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FExp. This is the <code>Opt</code> node containing the child FExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FExp.
     * @apilevel low-level
     */
    public Opt<FExp> getFExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(0);
    }
    /**
     * Replaces the FVariable child.
     * @param node The new node to replace the FVariable child.
     * @apilevel high-level
     */
    public void setFVariable(FVariable node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the FVariable child.
     * @return The current node used as the FVariable child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FVariable")
    public FVariable getFVariable() {
        return (FVariable) getChild(1);
    }
    /**
     * Retrieves the FVariable child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FVariable child.
     * @apilevel low-level
     */
    public FVariable getFVariableNoTransform() {
        return (FVariable) getChildNoTransform(1);
    }
    /**
     * Get the set of all values this for index spans.
     * 
     * @return an int array containing the values spanned
     * @attribute syn
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2315
     */
    @ASTNodeAnnotation.Attribute
    public int[] myIndices() {
        ASTNode$State state = state();
        try {
        		if (hasFExp())
        			return getFExp().myIndices();
        		else
        			return new int[0]; // TODO: return 1..n, where n is given by use.
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myCVD() {
        ASTNode$State state = state();
        CommonVariableDecl myCVD_value = getFVariable();

        return myCVD_value;
    }
    /**
     * @apilevel internal
     */
    protected int isCircular_visited = -1;
    /**
     * @apilevel internal
     */
    private void isCircular_reset() {
        isCircular_computed = false;
        isCircular_initialized = false;
        isCircular_visited = -1;
    }
    /**
     * @apilevel internal
     */
    protected boolean isCircular_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_initialized = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_value;
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        if(isCircular_computed) {
            return isCircular_value;
        }
        ASTNode$State state = state();
        boolean new_isCircular_value;
        if (!isCircular_initialized) {
            isCircular_initialized = true;
            isCircular_value = true;
        }
        if (!state.IN_CIRCLE) {
            state.IN_CIRCLE = true;
            int num = state.boundariesCrossed;
            boolean isFinal = this.is$Final();
            do {
                isCircular_visited = state.CIRCLE_INDEX;
                state.CHANGE = false;
                new_isCircular_value = hasFExp() && getFExp().isCircular();
                if (new_isCircular_value != isCircular_value) {
                    state.CHANGE = true;
                }
                isCircular_value = new_isCircular_value;
                state.CIRCLE_INDEX++;
            } while (state.CHANGE);
            if (isFinal && num == state().boundariesCrossed) {
                isCircular_computed = true;
                state.LAST_CYCLE = true;
                boolean $tmp = hasFExp() && getFExp().isCircular();
                state.LAST_CYCLE = false;
            } else {
                state.RESET_CYCLE = true;
                boolean $tmp = hasFExp() && getFExp().isCircular();
                state.RESET_CYCLE = false;
                isCircular_computed = false;
                isCircular_initialized = false;
            }
            state.IN_CIRCLE = false;
            state.INTERMEDIATE_VALUE = false;
            return isCircular_value;
        }
        if(isCircular_visited != state.CIRCLE_INDEX) {
            isCircular_visited = state.CIRCLE_INDEX;
            if (state.LAST_CYCLE) {
                isCircular_computed = true;
                new_isCircular_value = hasFExp() && getFExp().isCircular();
                return new_isCircular_value;
            }
            if (state.RESET_CYCLE) {
                isCircular_computed = false;
                isCircular_initialized = false;
                isCircular_visited = -1;
                return isCircular_value;
            }
            new_isCircular_value = hasFExp() && getFExp().isCircular();
            if (new_isCircular_value != isCircular_value) {
                state.CHANGE = true;
            }
            isCircular_value = new_isCircular_value;
            state.INTERMEDIATE_VALUE = true;
            return isCircular_value;
        }
        state.INTERMEDIATE_VALUE = true;
        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = hasFExp() ? getFExp().variability() : fParameter();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFVariableNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean needsForArray() {
        ASTNode$State state = state();
        boolean needsForArray_value = hasFExp() && getFExp().needsForArray();

        return needsForArray_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:491
     */
    @ASTNodeAnnotation.Attribute
    public int forIndexIndex() {
        if(forIndexIndex_computed) {
            return forIndexIndex_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        forIndexIndex_value = getParent().Define_forIndexIndex(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            forIndexIndex_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return forIndexIndex_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean forIndexIndex_computed = false;
    /**
     * @apilevel internal
     */
    protected int forIndexIndex_value;
    /**
     * @apilevel internal
     */
    private void forIndexIndex_reset() {
        forIndexIndex_computed = false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        if (caller == getFVariableNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_myForIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:436
     * @apilevel internal
     */
    public boolean Define_isForIndex(ASTNode caller, ASTNode child) {
        if (caller == getFVariableNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_isForIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:451
     * @apilevel internal
     */
    public FAbstractEquation Define_parameterEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:483
     * @apilevel internal
     */
    public int Define_findVariableIndex(ASTNode caller, ASTNode child) {
        if (caller == getFVariableNoTransform()) {
            return forIndexIndex();
        }
        else {
            return getParent().Define_findVariableIndex(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
