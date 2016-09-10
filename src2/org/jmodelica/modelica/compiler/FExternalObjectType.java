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
 * Class representing the external object type.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:353
 * @production FExternalObjectType : {@link FType} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">Constructor:{@link FIdUse}</span> <span class="component">Destructor:{@link FIdUse}</span>;

 */
public class FExternalObjectType extends FType implements Cloneable {
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:844
     */
    @Override
    public FType flatten(FQName prefix, InstAssignable ia, boolean keepSizeExpressions) {
        FType res = new FExternalObjectType(getSize(), getName(), getConstructor().flatten(prefix), getDestructor().flatten(prefix));
        res.setSize(getSize().flatten(prefix, res, keepSizeExpressions));
        return res;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1464
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
            FTypePrefixVariability variability) {
        return new FExternalObjectVariable(fvt, variability.combineDown(fParameter()), name, getConstructor().fullCopy());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1143
     */
    public void print(TypePrinter_C p) { p.print(this); }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:339
     */
    public void usedTypes(Map<String,FType> res) {
        if (res.containsKey(name())) {
            return;
        }
        res.put(name(), this);
        FExternalStmt stmt = myConstructorStmt();
        for (FExp exp : stmt.myConstructorArgs()) {
            FType t = exp.type();
            boolean par = t.getParent() == null;
            if (par) {
                t.setParent(stmt);
            }
            exp.type().usedTypes(res);
            if (par) {
                t.setParent(null);
            }
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FExternalObjectType() {
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
    }
    /**
     * @declaredat ASTNode:13
     */
    public FExternalObjectType(Size p0, String p1, FIdUse p2, FIdUse p3) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setChild(p3, 1);
    }
    /**
     * @declaredat ASTNode:19
     */
    public FExternalObjectType(Size p0, Symbol p1, FIdUse p2, FIdUse p3) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setChild(p3, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:28
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:40
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public FExternalObjectType clone() throws CloneNotSupportedException {
        FExternalObjectType node = (FExternalObjectType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:65
     */
    public FExternalObjectType copy() {
        try {
            FExternalObjectType node = (FExternalObjectType) clone();
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
    public FExternalObjectType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:93
     */
    public FExternalObjectType treeCopyNoTransform() {
        FExternalObjectType tree = (FExternalObjectType) copy();
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
     * @declaredat ASTNode:113
     */
    public FExternalObjectType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:120
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FExternalObjectType)node).tokenSize_Size) && (tokenString_Name == ((FExternalObjectType)node).tokenString_Name);    
    }
    /**
     * Replaces the lexeme Size.
     * @param value The new value for the lexeme Size.
     * @apilevel high-level
     */
    public void setSize(Size value) {
        tokenSize_Size = value;
    }
    /**
     * Retrieves the value for the lexeme Size.
     * @return The value for the lexeme Size.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Size")
    public Size getSize() {
        return tokenSize_Size;
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
    /**
     * Replaces the Constructor child.
     * @param node The new node to replace the Constructor child.
     * @apilevel high-level
     */
    public void setConstructor(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Constructor child.
     * @return The current node used as the Constructor child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Constructor")
    public FIdUse getConstructor() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the Constructor child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Constructor child.
     * @apilevel low-level
     */
    public FIdUse getConstructorNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the Destructor child.
     * @param node The new node to replace the Destructor child.
     * @apilevel high-level
     */
    public void setDestructor(FIdUse node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Destructor child.
     * @return The current node used as the Destructor child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Destructor")
    public FIdUse getDestructor() {
        return (FIdUse) getChild(1);
    }
    /**
     * Retrieves the Destructor child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Destructor child.
     * @apilevel low-level
     */
    public FIdUse getDestructorNoTransform() {
        return (FIdUse) getChildNoTransform(1);
    }
    @ASTNodeAnnotation.Attribute
    public FExternalStmt myConstructorStmt() {
        ASTNode$State state = state();
        FExternalStmt myConstructorStmt_value = getConstructor().myFExternalStmt();

        return myConstructorStmt_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExternalStmt myDestructorStmt() {
        ASTNode$State state = state();
        FExternalStmt myDestructorStmt_value = getDestructor().myFExternalStmt();

        return myDestructorStmt_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_boolean_value = typeMatches(type, true, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect FTypeCompatibility
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:814
     */
    @ASTNodeAnnotation.Attribute
    public boolean typeMatches(FType type, boolean compatible, boolean allowUnknown) {
        ASTNode$State state = state();
        try {
                if (!dimensionCompatible(type, allowUnknown) || !type.isExternalObject())
                    return false;
                FExternalObjectType obj = (FExternalObjectType) type;
                if (getName().equals(obj.getName())) 
                    return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_boolean_value = typeMatches(type, false, allowUnknown);

        return equivalentTo_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        boolean isExternalObject_value = true;

        return isExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compatibleConstructor(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean compatibleConstructor_InstClassDecl_value = getConstructor().name().equals(icd.qualifiedName() + ".constructor");

        return compatibleConstructor_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean compatibleDestructor(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean compatibleDestructor_InstClassDecl_value = getDestructor().name().equals(icd.qualifiedName() + ".destructor");

        return compatibleDestructor_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean externalValid(boolean rec) {
        ASTNode$State state = state();
        boolean externalValid_boolean_value = !rec || !isArray();

        return externalValid_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C() {
        ASTNode$State state = state();
        String nameScalar_C_value = "jmi_extobj_t";

        return nameScalar_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArray_C() {
        ASTNode$State state = state();
        String nameArray_C_value = "jmi_extobj_array_t";

        return nameArray_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argType_C(boolean ref) {
        ASTNode$State state = state();
        String argType_C_boolean_value = argTypeBase_C();

        return argType_C_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argTypeBase_C() {
        ASTNode$State state = state();
        String argTypeBase_C_value = "void*";

        return argTypeBase_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String macroTypeDeclScalar() {
        ASTNode$State state = state();
        String macroTypeDeclScalar_value = "EXO";

        return macroTypeDeclScalar_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
