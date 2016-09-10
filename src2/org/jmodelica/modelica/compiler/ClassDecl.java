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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:83
 * @production ClassDecl : {@link Element} ::= <span class="component">Name:{@link IdDecl}</span>;

 */
public abstract class ClassDecl extends Element implements Cloneable {
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1309
     */
    public InstClassDecl newInstClassDecl() {
        return new UnknownInstClassDecl();
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1363
     */
    public InstClassDecl newInstReplacingClass(
            ClassDecl replacingClass, InstRedeclareClassNode icr, InstRedeclareClassNode cicr) {
        return replacingClass.createInstReplacingClass(this, icr, cicr);
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1375
     */
    public InstClassDecl createInstReplacingClass(
            ClassDecl replacedClass, InstRedeclareClassNode icr, InstRedeclareClassNode cicr) {
        return null;
    }
    /**
     * @aspect InstaceConstrainingClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1735
     */
    public Opt newInstConstrainingClassOpt(InstRedeclareClassNode cicr) {
        return new Opt();
    }
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:249
     */
    public void addToFullClassDecl(FullClassDecl fcd) {
        // TODO: add redeclared to ElementModifications instead of class list
    	fcd.addClassDecl(this);
    }
    /**
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:32
     */
    protected int duringFindClassDeclRevisits = 0;
    /**
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:33
     */
    protected static final int MAX_FIND_CLASS_DECL_REVISITS = 20;
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:26
     */
    public boolean collectTestCases(TestSuite ts, String className) {
        if (qualifiedName().equals(className)) {
            collectTestCases(ts);
            return true;
        }
        return false;
    }
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:45
     */
    public void collectTestCases(TestSuite ts) {
        ts.enterClass(name());
        AnnotationNode a1 = annotation("__JModelica/UnitTesting/tests");
        if (a1.exists()) {
            for (AnnotationNode a2 : a1) 
                generateTestCase(ts, a2);
        }
        ts.exitClass();
    }
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:67
     */
    public void generateTestCase(TestSuite ts, AnnotationNode a) {
        String name = a.name();
        String className = name.substring(name.lastIndexOf('.') + 1);
        String fullName = TestCase.class.getName().replace("TestCase", className);
        String attrName = null;
        try {
            // Get a class object for the test case class
            Class cl = Class.forName(fullName);
            
            // Check if it is a test case
            if (TestCase.class.isAssignableFrom(cl)) {
                // Create an object of the new test case class
                TestCase tc = (TestCase) cl.newInstance();
                
                // Add all attributes
                for (AnnotationNode attr : a) {
                    attrName = attr.name();
                    boolean isOpt = attrName.indexOf('_') >= 0;
                    String methodName = isOpt ? null : 
                        "set" + Character.toUpperCase(attrName.charAt(0)) + attrName.substring(1);
                    
                    // TODO: Use type() and ceval() instead.
                    if (attr.isStringValue()) {
                        String val = attr.string();
                        if (isOpt) {
                            tc.setStringOption(attrName, val);
                        } else {
                            Method m = cl.getMethod(methodName, String.class);
                            m.invoke(tc, val);
                        }
                    } else if (attr.isBoolValue()) {
                        boolean val = attr.bool();
                        if (isOpt) {
                            tc.setBooleanOption(attrName, val);
                        } else {
                            Method m = cl.getMethod(methodName, Boolean.TYPE);
                            m.invoke(tc, val);
                        }
                    } else if (attr.isIntegerValue()) {
                        int val = attr.integer();
                        if (isOpt) {
                            tc.setIntegerOption(attrName, val);
                        } else {
                            Method m = cl.getMethod(methodName, Integer.TYPE);
                            m.invoke(tc, val);
                        }
                    } else if (attr.isRealValue()) {
                        double val = attr.real();
                        if (isOpt) {
                            tc.setRealOption(attrName, val);
                        } else {
                            Method m = cl.getMethod(methodName, Double.TYPE);
                            m.invoke(tc, val);
                        }
                    } else {
                        testCaseError(className, "attribute '" + attrName + 
                                "' is assigned from an unsupported expression type");
                    }
                }
                
                // Set generic information of the test case and add to list
                tc.setSourceFileName(fileName());
                tc.setClassName(qualifiedName());
                ts.add(tc);
                log.debug("Created test case '" + className + "' for class '" + tc.getClassName() + "'");
            }
        } catch (ClassNotFoundException e) {
            // TODO: Maybe we should throw exceptions instead of log?
            // No such class was found - log that
            testCaseError(className, "class not found");
        } catch (NoSuchMethodException e) {
            // No such method was found - log that
            testCaseError(className, "attribute '" + attrName + "' not found or used with wrong type of expression");
        } catch (Exception e) {
            // The test case class did not behave as expected - log that
            testCaseError(className, "malformed test case class");
        }
    }
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:146
     */
    public void testCaseError(String className, String msg) {
        String[] fn = fileName().split("[/\\\\]Compiler[/\\\\]");
        log.error("%s:%d: Creating test case '%s' - %s", fn[fn.length - 1], beginLine(), className, msg);
    }
    /**
     * @declaredat ASTNode:1
     */
    public ClassDecl() {
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
        children = new ASTNode[1];
    }
    /**
     * @declaredat ASTNode:13
     */
    public ClassDecl(IdDecl p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:19
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:25
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public void flushAttrCache() {
        super.flushAttrCache();
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
    public ClassDecl clone() throws CloneNotSupportedException {
        ClassDecl node = (ClassDecl) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:60
     */
    public abstract ClassDecl fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:67
     */
    public abstract ClassDecl treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:75
     */
    public abstract ClassDecl treeCopy();
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(IdDecl node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public IdDecl getName() {
        return (IdDecl) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public IdDecl getNameNoTransform() {
        return (IdDecl) getChildNoTransform(0);
    }
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:622
     */
    @ASTNodeAnnotation.Attribute
    public abstract String name();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:649
     */
    @ASTNodeAnnotation.Attribute
    public abstract String qualifiedName();
    @ASTNodeAnnotation.Attribute
    public boolean isExperiment() {
        ASTNode$State state = state();
        boolean isExperiment_value = annotation("experiment").exists();

        return isExperiment_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartial() {
        ASTNode$State state = state();
        boolean isPartial_value = false;

        return isPartial_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEncapsulated() {
        ASTNode$State state = state();
        boolean isEncapsulated_value = false;

        return isEncapsulated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isModel() {
        ASTNode$State state = state();
        boolean isModel_value = false;

        return isModel_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBlock() {
        ASTNode$State state = state();
        boolean isBlock_value = false;

        return isBlock_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClass() {
        ASTNode$State state = state();
        boolean isClass_value = false;

        return isClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPackage() {
        ASTNode$State state = state();
        boolean isPackage_value = false;

        return isPackage_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasClassModification() {
        ASTNode$State state = state();
        boolean hasClassModification_value = false;

        return hasClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasRedeclare() {
        ASTNode$State state = state();
        boolean hasRedeclare_value = false;

        return hasRedeclare_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasTypePrefix() {
        ASTNode$State state = state();
        boolean hasTypePrefix_value = false;

        return hasTypePrefix_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasConstrainingClause() {
        ASTNode$State state = state();
        boolean hasConstrainingClause_value = false;

        return hasConstrainingClause_value;
    }
    @ASTNodeAnnotation.Attribute
    public ConstrainingClause getConstrainingClause() {
        ASTNode$State state = state();
        ConstrainingClause getConstrainingClause_value = null;

        return getConstrainingClause_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasReplaceable() {
        ASTNode$State state = state();
        boolean hasReplaceable_value = false;

        return hasReplaceable_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<AbstractEquation> equations() {
        ASTNode$State state = state();
        Iterable<AbstractEquation> equations_value = Collections.<AbstractEquation>emptyList();

        return equations_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Algorithm> algorithms() {
        ASTNode$State state = state();
        Iterable<Algorithm> algorithms_value = Collections.<Algorithm>emptyList();

        return algorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = Collections.<ExtendsClause>emptyList();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = Collections.<ComponentDecl>emptyList();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = Collections.<ClassDecl>emptyList();

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = Collections.<ImportClause>emptyList();

        return imports_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = false;

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitive() {
        ASTNode$State state = state();
        boolean isPrimitive_value = false;

        return isPrimitive_value;
    }
    /**
     * @attribute syn
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:61
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDotted(String name) {
        ASTNode$State state = state();
        try {
        		String[] parts = name.split("\\.");
        		ClassDecl cd = this;
        		for (String part : parts) {
        			cd = cd.simpleLookupClassMemberScope(part);
        			if (cd == null)
        				return null;
        		}
        		return cd;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:72
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDottedGlobal(String name) {
        ASTNode$State state = state();
        try {
                String[] parts = name.split("\\.", 2);
                ClassDecl base = simpleLookupClassGlobalScope(parts[0]);
                return (base == null || parts.length == 1) ? base : base.simpleLookupClassDotted(parts[1]);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassMemberScope(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClassMemberScope_String_value = unknownClassDecl();

        return simpleLookupClassMemberScope_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublic() {
        ASTNode$State state = state();
        boolean isPublic_value = true;

        return isPublic_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isProtected() {
        ASTNode$State state = state();
        boolean isProtected_value = false;

        return isProtected_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInner() {
        ASTNode$State state = state();
        boolean isInner_value = false;

        return isInner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOuter() {
        ASTNode$State state = state();
        boolean isOuter_value = false;

        return isOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInnerOrOuter() {
        ASTNode$State state = state();
        boolean hasInnerOrOuter_value = false;

        return hasInnerOrOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = false;

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = false;

        return isOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInputOrOutput() {
        ASTNode$State state = state();
        boolean hasInputOrOutput_value = false;

        return hasInputOrOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasStringComment() {
        ASTNode$State state = state();
        boolean hasStringComment_value = false;

        return hasStringComment_value;
    }
    @ASTNodeAnnotation.Attribute
    public StringComment getStringComment() {
        ASTNode$State state = state();
        StringComment getStringComment_value = null;

        return getStringComment_value;
    }
    @ASTNodeAnnotation.Attribute
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = " \"" + name() + "\"";

        return extraMemoryUseInfo_value;
    }
    /** 
     * This attribute is used to set the visibility of each element
     * as protected or public. All classes that can have a parent with
     * associated visibility must inherit this attribute. (At least if
     * makes sense for that particular class).
     * @attribute inh
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:32
     */
    @ASTNodeAnnotation.Attribute
    public VisibilityType visibility() {
        ASTNode$State state = state();
        VisibilityType visibility_value = getParent().Define_visibility(this, null);

        return visibility_value;
    }
    /**
     * @attribute inh
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:52
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClass(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClass_String_value = getParent().Define_simpleLookupClass(this, null, name);

        return simpleLookupClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:89
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassGlobalScope(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClassGlobalScope_String_value = getParent().Define_simpleLookupClassGlobalScope(this, null, name);

        return simpleLookupClassGlobalScope_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
