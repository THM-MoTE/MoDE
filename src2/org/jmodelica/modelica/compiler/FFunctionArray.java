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
 * An array variable in a function. 
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:99
 * @production FFunctionArray : {@link FFunctionVariable};

 */
public class FFunctionArray extends FFunctionVariable implements Cloneable {
    /**
     * Create an FFunctionArray with the given name and type. 
     * Extracts array subscripts from type.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:877
     */
    public FFunctionArray(FType type, String name) {
        this(new Opt(), type, new Opt(), new FQNameFull(name));
	}
    /**
     * Create an FFunctionArray with everything but order and attributes given.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:905
     */
    public FFunctionArray(Opt<FTypePrefixInputOutput> inputOutput, FType type, Opt<FExp> bindingExp, FQName name) {
        this(inputOutput, new List<FAttribute>(), type, bindingExp, name, 0);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1428
     */
    public FFunctionArray createEmptyNode()    { return new FFunctionArray(); }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:218
     */
    @Override
	public String genUse_var_CAD(CodePrinter p, FArraySubscripts fas, String type) {
		if (fas == null)
			return varName_CAD();
		else
			return fas.genFunctionArrayUse_var_CAD(p, varName_CAD(), type);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:226
     */
    @Override
	public String genUse_der_CAD(CodePrinter p, FArraySubscripts fas, String type) {
		if (fas == null)
			return derName_CAD();
		else
			return fas.genFunctionArrayUse_der_CAD(p, derName_CAD(), type);
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2368
     */
    @Override
    public void printReturnWrite_CAD(CodeStream str, String indent) {}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1082
     */
    @Override
    public void printReturnWrite_C(CodeStream str, String indent) {
        if (isString()) {
            getType().printReturn_C(str, indent, nameReturn_C(), name_C());
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:543
     */
    @Override
    public String genUse_C(CodePrinter p, FArraySubscripts fas, String type) {
        if (fas == null)
            return name_C();
        else
            return fas.genFunctionArrayUse_C(p, name_C(), type);
    }
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:146
     */
    public void exportWrapperDecl_C(CodeStream str) {
		String name = name_C();
		str.format("%s* %sp", exportWrapperType_C(), name);
		for (int i = 0; i < ndims(); i++) 
			str.format(", int %s%d", name, i);
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:153
     */
    public void exportWrapperTypeDecl_C(CodeStream str) {
		str.format("%s*", exportWrapperType_C());
		for (int i = 0; i < ndims(); i++) 
			str.print(", int");
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:159
     */
    public void exportWrapperCall_C(CodeStream str) {
		String name = name_C();
		str.format("%sp", name);
		for (int i = 0; i < ndims(); i++) 
			str.format(", %s%d", name, i);
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:172
     */
    public void exportWrapperDeclareTemp_C(CodeStream str, String ind) {
		// NB: makes assumptions about definitions in jmi_array_none.h
		String name = name_C();
		str.format("%sint %s_size[%d];\n", ind, name, ndims());
		str.format("%sjmi_array_t %s_obj;\n", ind, name);
		str.format("%sjmi_array_t* %s = &%s_obj;\n", ind, name, name);
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:180
     */
    public void exportWrapperInitTemp_C(CodeStream str, String ind) {
		// NB: makes assumptions about definitions in jmi_array_none.h
		String name = name_C();
		str.format("%s%s_obj.var = %sp;\n", ind, name, name);
		str.format("%s%s_obj.size = %s_size;\n", ind, name, name);
		str.format("%s%s_obj.num_dims = %d;\n", ind, name, ndims());
		str.format("%s%s_obj.num_elems = 1", ind, name);
		for (int i = 0; i < ndims(); i++)
			str.format(" * %s%d", name, i);
		str.print(";\n");
		for (int i = 0; i < ndims(); i++)
			str.format("%s%s_size[%d] = %s%d;\n", ind, name, i, name, i);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionArray() {
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
        children = new ASTNode[5];
        setChild(new Opt(), 0);
        setChild(new List(), 1);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:16
     */
    public FFunctionArray(Opt<FTypePrefixInputOutput> p0, List<FAttribute> p1, FType p2, Opt<FExp> p3, FQName p4, int p5) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setOrder(p5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:27
     */
    protected int numChildren() {
        return 5;
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
        size_reset();
        indices_reset();
        varName_CAD_reset();
        derName_CAD_reset();
        name_C_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:50
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:56
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FFunctionArray clone() throws CloneNotSupportedException {
        FFunctionArray node = (FFunctionArray) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:69
     */
    public FFunctionArray copy() {
        try {
            FFunctionArray node = (FFunctionArray) clone();
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
     * @declaredat ASTNode:88
     */
    public FFunctionArray fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:97
     */
    public FFunctionArray treeCopyNoTransform() {
        FFunctionArray tree = (FFunctionArray) copy();
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
     * @declaredat ASTNode:117
     */
    public FFunctionArray treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:124
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_Order == ((FFunctionArray)node).tokenint_Order);    
    }
    /**
     * Replaces the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child FTypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setFTypePrefixInputOutputOpt(Opt<FTypePrefixInputOutput> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FTypePrefixInputOutput child.
     * @param node The new node to be used as the FTypePrefixInputOutput child.
     * @apilevel high-level
     */
    public void setFTypePrefixInputOutput(FTypePrefixInputOutput node) {
        getFTypePrefixInputOutputOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FTypePrefixInputOutput child exists.
     * @return {@code true} if the optional FTypePrefixInputOutput child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFTypePrefixInputOutput() {
        return getFTypePrefixInputOutputOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FTypePrefixInputOutput child.
     * @return The FTypePrefixInputOutput child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FTypePrefixInputOutput getFTypePrefixInputOutput() {
        return (FTypePrefixInputOutput) getFTypePrefixInputOutputOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * @return The optional node for child the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FTypePrefixInputOutput")
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOpt() {
        return (Opt<FTypePrefixInputOutput>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FTypePrefixInputOutput. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FTypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOptNoTransform() {
        return (Opt<FTypePrefixInputOutput>) getChildNoTransform(0);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * @return Number of children in the FAttribute list.
     * @apilevel high-level
     */
    public int getNumFAttribute() {
        return getFAttributeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAttribute list.
     * @apilevel low-level
     */
    public int getNumFAttributeNoTransform() {
        return getFAttributeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAttribute list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAttribute list.
     * @apilevel high-level
     */
    public FAttribute getFAttribute(int i) {
        return (FAttribute) getFAttributeList().getChild(i);
    }
    /**
     * Check whether the FAttribute list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAttribute() {
        return getFAttributeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAttribute list.
     * @param node The element to append to the FAttribute list.
     * @apilevel high-level
     */
    public void addFAttribute(FAttribute node) {
        List<FAttribute> list = (parent == null || state == null) ? getFAttributeListNoTransform() : getFAttributeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAttributeNoTransform(FAttribute node) {
        List<FAttribute> list = getFAttributeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAttribute list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAttribute(FAttribute node, int i) {
        List<FAttribute> list = getFAttributeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAttribute")
    public List<FAttribute> getFAttributeList() {
        List<FAttribute> list = (List<FAttribute>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributeListNoTransform() {
        return (List<FAttribute>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    public List<FAttribute> getFAttributes() {
        return getFAttributeList();
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributesNoTransform() {
        return getFAttributeListNoTransform();
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FType node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FType getType() {
        return (FType) getChild(2);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FType getTypeNoTransform() {
        return (FType) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the BindingExp child. This is the <code>Opt</code>
     * node containing the child BindingExp, not the actual child!
     * @param opt The new node to be used as the optional node for the BindingExp child.
     * @apilevel low-level
     */
    public void setBindingExpOpt(Opt<FExp> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) BindingExp child.
     * @param node The new node to be used as the BindingExp child.
     * @apilevel high-level
     */
    public void setBindingExp(FExp node) {
        getBindingExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional BindingExp child exists.
     * @return {@code true} if the optional BindingExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasBindingExp() {
        return getBindingExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) BindingExp child.
     * @return The BindingExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getBindingExp() {
        return (FExp) getBindingExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the BindingExp child. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * @return The optional node for child the BindingExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="BindingExp")
    public Opt<FExp> getBindingExpOpt() {
        return (Opt<FExp>) getChild(3);
    }
    /**
     * Retrieves the optional node for child BindingExp. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child BindingExp.
     * @apilevel low-level
     */
    public Opt<FExp> getBindingExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(3);
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(4);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(4);
    }
    /**
     * Replaces the lexeme Order.
     * @param value The new value for the lexeme Order.
     * @apilevel high-level
     */
    public void setOrder(int value) {
        tokenint_Order = value;
    }
    /**
     * Retrieves the value for the lexeme Order.
     * @return The value for the lexeme Order.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Order")
    public int getOrder() {
        return tokenint_Order;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = getType().ndims();

        return ndims_value;
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
        size_value = type().size();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean indices_computed = false;
    /**
     * @apilevel internal
     */
    protected Indices indices_value;
    /**
     * @apilevel internal
     */
    private void indices_reset() {
        indices_computed = false;
        indices_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        if(indices_computed) {
            return indices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        indices_value = Indices.create(size());
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVar() {
        ASTNode$State state = state();
        boolean isUnknownSizeVar_value = getType().size().isUnknown();

        return isUnknownSizeVar_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean varName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String varName_CAD_value;
    /**
     * @apilevel internal
     */
    private void varName_CAD_reset() {
        varName_CAD_computed = false;
        varName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        if(varName_CAD_computed) {
            return varName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        varName_CAD_value = nameUnderscore() + "_var_" + C_SUFFIX_ARRAY;
        if (isFinal && num == state().boundariesCrossed) {
            varName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return varName_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean derName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String derName_CAD_value;
    /**
     * @apilevel internal
     */
    private void derName_CAD_reset() {
        derName_CAD_computed = false;
        derName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        if(derName_CAD_computed) {
            return derName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derName_CAD_value = nameUnderscore() + "_der_" + C_SUFFIX_ARRAY;
        if (isFinal && num == state().boundariesCrossed) {
            derName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String varReturnName_CAD() {
        ASTNode$State state = state();
        String varReturnName_CAD_value = varName_CAD();

        return varReturnName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derReturnName_CAD() {
        ASTNode$State state = state();
        String derReturnName_CAD_value = derName_CAD();

        return derReturnName_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean name_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_C_value;
    /**
     * @apilevel internal
     */
    private void name_C_reset() {
        name_C_computed = false;
        name_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        if(name_C_computed) {
            return name_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_C_value = name_C(null, C_SUFFIX_ARRAY);
        if (isFinal && num == state().boundariesCrossed) {
            name_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameReturn_C() {
        ASTNode$State state = state();
        String nameReturn_C_value = isString() ? name_C(null, C_SUFFIX_RETURN) : name_C();

        return nameReturn_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String typeReturn_C() {
        ASTNode$State state = state();
        String typeReturn_C_value = type_C();

        return typeReturn_C_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
