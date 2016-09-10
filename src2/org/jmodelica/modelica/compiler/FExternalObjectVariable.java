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
 * An external object variable.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:242
 * @production FExternalObjectVariable : {@link FVariable} ::= <span class="component">Constructor:{@link FIdUse}</span> <span class="component">DestructorCall:{@link FFunctionCallStmt}</span>;

 */
public class FExternalObjectVariable extends FVariable implements Cloneable {
    /**
     * Create an external object variable with only the required children.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:739
     */
    public FExternalObjectVariable(FVisibilityType fvt, 
            FTypePrefixVariability variability, FQName name, FIdUse constructorName) {
        this(fvt, variability, new Opt(), new List(), (String) null, new Opt(), new Opt(), name, constructorName);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1407
     */
    public FExternalObjectVariable createEmptyNode()	{ return new FExternalObjectVariable(); }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1355
     */
    public FVariable createPreVariable() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3946
     */
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        super.markUsedFunctionsAndRecords(type);
        getDestructorCall().markUsedFunctionsAndRecords(type);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:453
     */
    @Override
    protected FExternalObjectVariable createScalarFVariable(Scalarizer.Equation s, Index i) {
        FExternalObjectVariable fex = (FExternalObjectVariable) super.createScalarFVariable(s, i);
		fex.setConstructor(getConstructor().fullCopy());
		return fex;
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:738
     */
    public FExternalObjectVariable copyForName(FQName name) {
        FExternalObjectVariable fv = (FExternalObjectVariable) super.copyForName(name);
        fv.setConstructor(getConstructor().fullCopy());
        return fv;
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3781
     */
    public void genDestructorCall_C(CodePrinter p, CodeStream str, String indent) {
        if (hasConstructorCall(Index.NULL)) {
            str.formatln("%sif (%s != NULL) {", indent, name_C());
            p.print(getDestructorCall(), str, p.indent(indent));
            str.formatln("%s%s = NULL;", p.indent(indent), name_C());
            str.formatln("%s}", indent);
        } else {
            /* Alias external objects does not call constructors so no destructor call is needed. */
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FExternalObjectVariable() {
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
        children = new ASTNode[9];
        setChild(new Opt(), 2);
        setChild(new List(), 3);
        setChild(new Opt(), 4);
        setChild(new Opt(), 5);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FExternalObjectVariable(FVisibilityType p0, FTypePrefixVariability p1, Opt<FTypePrefixInputOutput> p2, List<FAttribute> p3, String p4, Opt<FExp> p5, Opt<FStringComment> p6, FQName p7, FIdUse p8) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setDerivedType(p4);
        setChild(p5, 4);
        setChild(p6, 5);
        setChild(p7, 6);
        setChild(p8, 7);
    }
    /**
     * @declaredat ASTNode:28
     */
    public FExternalObjectVariable(FVisibilityType p0, FTypePrefixVariability p1, Opt<FTypePrefixInputOutput> p2, List<FAttribute> p3, Symbol p4, Opt<FExp> p5, Opt<FStringComment> p6, FQName p7, FIdUse p8) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setDerivedType(p4);
        setChild(p5, 4);
        setChild(p6, 5);
        setChild(p7, 6);
        setChild(p8, 7);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:42
     */
    protected int numChildren() {
        return 8;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:54
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        type_reset();
        getType_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:68
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:74
     */
    public FExternalObjectVariable clone() throws CloneNotSupportedException {
        FExternalObjectVariable node = (FExternalObjectVariable) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:81
     */
    public FExternalObjectVariable copy() {
        try {
            FExternalObjectVariable node = (FExternalObjectVariable) clone();
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
     * @declaredat ASTNode:100
     */
    public FExternalObjectVariable fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:109
     */
    public FExternalObjectVariable treeCopyNoTransform() {
        FExternalObjectVariable tree = (FExternalObjectVariable) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 8:
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
     * @declaredat ASTNode:134
     */
    public FExternalObjectVariable treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:141
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_DerivedType == ((FExternalObjectVariable)node).tokenString_DerivedType);    
    }
    /**
     * Replaces the FVisibilityType child.
     * @param node The new node to replace the FVisibilityType child.
     * @apilevel high-level
     */
    public void setFVisibilityType(FVisibilityType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FVisibilityType child.
     * @return The current node used as the FVisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FVisibilityType")
    public FVisibilityType getFVisibilityType() {
        return (FVisibilityType) getChild(0);
    }
    /**
     * Retrieves the FVisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FVisibilityType child.
     * @apilevel low-level
     */
    public FVisibilityType getFVisibilityTypeNoTransform() {
        return (FVisibilityType) getChildNoTransform(0);
    }
    /**
     * Replaces the FTypePrefixVariability child.
     * @param node The new node to replace the FTypePrefixVariability child.
     * @apilevel high-level
     */
    public void setFTypePrefixVariability(FTypePrefixVariability node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the FTypePrefixVariability child.
     * @return The current node used as the FTypePrefixVariability child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FTypePrefixVariability")
    public FTypePrefixVariability getFTypePrefixVariability() {
        return (FTypePrefixVariability) getChild(1);
    }
    /**
     * Retrieves the FTypePrefixVariability child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FTypePrefixVariability child.
     * @apilevel low-level
     */
    public FTypePrefixVariability getFTypePrefixVariabilityNoTransform() {
        return (FTypePrefixVariability) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child FTypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setFTypePrefixInputOutputOpt(Opt<FTypePrefixInputOutput> opt) {
        setChild(opt, 2);
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
        return (Opt<FTypePrefixInputOutput>) getChild(2);
    }
    /**
     * Retrieves the optional node for child FTypePrefixInputOutput. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FTypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOptNoTransform() {
        return (Opt<FTypePrefixInputOutput>) getChildNoTransform(2);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 3);
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
        List<FAttribute> list = (List<FAttribute>) getChild(3);
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
        return (List<FAttribute>) getChildNoTransform(3);
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
     * Replaces the lexeme DerivedType.
     * @param value The new value for the lexeme DerivedType.
     * @apilevel high-level
     */
    public void setDerivedType(String value) {
        tokenString_DerivedType = value;
    }
    /**
     * JastAdd-internal setter for lexeme DerivedType using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme DerivedType
     * @apilevel internal
     */
    public void setDerivedType(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setDerivedType is only valid for String lexemes");
        tokenString_DerivedType = (String)symbol.value;
        DerivedTypestart = symbol.getStart();
        DerivedTypeend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme DerivedType.
     * @return The value for the lexeme DerivedType.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="DerivedType")
    public String getDerivedType() {
        return tokenString_DerivedType != null ? tokenString_DerivedType : "";
    }
    /**
     * Replaces the optional node for the BindingExp child. This is the <code>Opt</code>
     * node containing the child BindingExp, not the actual child!
     * @param opt The new node to be used as the optional node for the BindingExp child.
     * @apilevel low-level
     */
    public void setBindingExpOpt(Opt<FExp> opt) {
        setChild(opt, 4);
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
        return (Opt<FExp>) getChild(4);
    }
    /**
     * Retrieves the optional node for child BindingExp. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child BindingExp.
     * @apilevel low-level
     */
    public Opt<FExp> getBindingExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the FStringComment child. This is the <code>Opt</code>
     * node containing the child FStringComment, not the actual child!
     * @param opt The new node to be used as the optional node for the FStringComment child.
     * @apilevel low-level
     */
    public void setFStringCommentOpt(Opt<FStringComment> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) FStringComment child.
     * @param node The new node to be used as the FStringComment child.
     * @apilevel high-level
     */
    public void setFStringComment(FStringComment node) {
        getFStringCommentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FStringComment child exists.
     * @return {@code true} if the optional FStringComment child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFStringComment() {
        return getFStringCommentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FStringComment child.
     * @return The FStringComment child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FStringComment getFStringComment() {
        return (FStringComment) getFStringCommentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FStringComment child. This is the <code>Opt</code> node containing the child FStringComment, not the actual child!
     * @return The optional node for child the FStringComment child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FStringComment")
    public Opt<FStringComment> getFStringCommentOpt() {
        return (Opt<FStringComment>) getChild(5);
    }
    /**
     * Retrieves the optional node for child FStringComment. This is the <code>Opt</code> node containing the child FStringComment, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FStringComment.
     * @apilevel low-level
     */
    public Opt<FStringComment> getFStringCommentOptNoTransform() {
        return (Opt<FStringComment>) getChildNoTransform(5);
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 6);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(6);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(6);
    }
    /**
     * Replaces the Constructor child.
     * @param node The new node to replace the Constructor child.
     * @apilevel high-level
     */
    public void setConstructor(FIdUse node) {
        setChild(node, 7);
    }
    /**
     * Retrieves the Constructor child.
     * @return The current node used as the Constructor child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Constructor")
    public FIdUse getConstructor() {
        return (FIdUse) getChild(7);
    }
    /**
     * Retrieves the Constructor child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Constructor child.
     * @apilevel low-level
     */
    public FIdUse getConstructorNoTransform() {
        return (FIdUse) getChildNoTransform(7);
    }
    /**
     * Retrieves the DestructorCall child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the DestructorCall child.
     * @apilevel low-level
     */
    public FFunctionCallStmt getDestructorCallNoTransform() {
        return (FFunctionCallStmt) getChildNoTransform(8);
    }
    /**
     * Retrieves the child position of the optional child DestructorCall.
     * @return The the child position of the optional child DestructorCall.
     * @apilevel low-level
     */
    protected int getDestructorCallChildPosition() {
        return 8;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2999
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, boolean inParameterRecord) {
        ASTNode$State state = state();
        try {
                CValue val = super.ceval(evaluator, inParameterRecord);
                val.markExternalObject(name());
                return val;
            }
        finally {
        }
    }
    /**
     * Constant evaluation of FVariable binding expressions.
     * 
     * If an expression is evaluated in an FClass, then identifiers are 
     * referencing FVariables. The constant value of an FVariable is computed
     * by evaluating the binding expression of the variable, if any. If the
     * FVariable is not a constant or a parameter, or if it has no binding
     * expressions, then a CValueUnknown object is returned.
     * 
     * This version only evaluates a specific cell in an array, and returns 
     * the value for that specific cell.
     * 
     * @return The constant value.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3036
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                CValue val = super.ceval(evaluator, i);
                val.markExternalObject(name());
                return val;
            }
        finally {
        }
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
        type_value = getType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getType_computed = false;
    /**
     * @apilevel internal
     */
    protected FType getType_value;
    /**
     * @apilevel internal
     */
    private void getType_reset() {
        getType_computed = false;
        getType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType getType() {
        if(getType_computed) {
            return getType_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getType_value = getConstructor().myFCallable().myOutputs().get(0).type().sizedType(size());
        getType_value.setParent(this);
        getType_value.is$Final = true;
        if (true) {
            getType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getType_value;
    }
    /**
     * @attribute syn
     * @aspect ExternalObjectTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1228
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasConstructorCall(Index i) {
        ASTNode$State state = state();
        try {
                if (hasBindingExp()) {
                    FExp exp = (i == Index.NULL) ? getBindingExp() : getBindingExp().getArray().get(i);
                    return exp.isConstructorCall();
                } else {
                    return hasParameterEquation() && parameterEquation().hasConstructorCall(i);
                }
                
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionCallStmt getDestructorCall() {
        ASTNode$State state = state();
        FFunctionCallStmt getDestructorCall_value = getDestructorCall_compute();
        setChild(getDestructorCall_value, getDestructorCallChildPosition());

        FFunctionCallStmt node = (FFunctionCallStmt) this.getChild(getDestructorCallChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private FFunctionCallStmt getDestructorCall_compute() {
            String strName = type().name() + ".destructor";
            FIdUse name = new FIdUse(strName);
            List<FExp> args = new List<FExp>();
            args.add(createUseExp());
            FFunctionCall call = new FFunctionCall(name, args, FFunctionType.create(strName, new ArrayList<FVariable>(), myFClass()));
            return new FFunctionCallStmt(new List<FFunctionCallLeft>(), call);
        }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_externalObjectVariables() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:386
     */
        if (shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_externalObjectVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_externalObjectVariables();
    }
    protected void contributeTo_FClass_FClass_externalObjectVariables(ArrayList<FExternalObjectVariable> collection) {
        super.contributeTo_FClass_FClass_externalObjectVariables(collection);
        if (shouldContribute())
            collection.add(this);
    }

}
