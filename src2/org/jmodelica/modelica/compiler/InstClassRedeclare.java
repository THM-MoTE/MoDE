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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:195
 * @production InstClassRedeclare : {@link InstElementRedeclare} ::= <span class="component">{@link InstClassDecl}</span>;

 */
public class InstClassRedeclare extends InstElementRedeclare implements Cloneable, InstRedeclareClassNode {
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1104
     */
    public void collectErrors(ErrorCheckType checkType) {
		super.collectErrors(checkType);
//		if (!inInstComponent())
//			getInstClassDecl().collectErrors(checkType);	
	}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1668
     */
    public void collectAttributes(
            List<FAttribute> attrs, FQName prefix, AttributeExpRetriever aer, boolean cls) {}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1154
     */
    public InstExtends createInstReplacingExtends(ExtendsClause ec, InstNode lookup) {
        for (InstExtends ie : getInstClassDecl().actualInstClass().getInstExtendss())
            return ie.createInstReplacingExtends(ec, lookup);
        return ec.newInstExtends(lookup);
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstClassRedeclare() {
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
    public InstClassRedeclare(Modification p0, boolean p1, boolean p2, InstAccess p3) {
        setModification(p0);
        setEach(p1);
        setFinal(p2);
        setChild(p3, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getInstClassDecl_reset();
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
    public InstClassRedeclare clone() throws CloneNotSupportedException {
        InstClassRedeclare node = (InstClassRedeclare) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public InstClassRedeclare copy() {
        try {
            InstClassRedeclare node = (InstClassRedeclare) clone();
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
    public InstClassRedeclare fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public InstClassRedeclare treeCopyNoTransform() {
        InstClassRedeclare tree = (InstClassRedeclare) copy();
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
     * @declaredat ASTNode:113
     */
    public InstClassRedeclare treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:120
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenModification_Modification == ((InstClassRedeclare)node).tokenModification_Modification) && (tokenboolean_Each == ((InstClassRedeclare)node).tokenboolean_Each) && (tokenboolean_Final == ((InstClassRedeclare)node).tokenboolean_Final);    
    }
    /**
     * Replaces the lexeme Modification.
     * @param value The new value for the lexeme Modification.
     * @apilevel high-level
     */
    public void setModification(Modification value) {
        tokenModification_Modification = value;
    }
    /**
     * Retrieves the value for the lexeme Modification.
     * @return The value for the lexeme Modification.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Modification")
    public Modification getModification() {
        return tokenModification_Modification;
    }
    /**
     * Replaces the lexeme Each.
     * @param value The new value for the lexeme Each.
     * @apilevel high-level
     */
    public void setEach(boolean value) {
        tokenboolean_Each = value;
    }
    /**
     * Retrieves the value for the lexeme Each.
     * @return The value for the lexeme Each.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Each")
    public boolean getEach() {
        return tokenboolean_Each;
    }
    /**
     * Replaces the lexeme Final.
     * @param value The new value for the lexeme Final.
     * @apilevel high-level
     */
    public void setFinal(boolean value) {
        tokenboolean_Final = value;
    }
    /**
     * Retrieves the value for the lexeme Final.
     * @return The value for the lexeme Final.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Final")
    public boolean getFinal() {
        return tokenboolean_Final;
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public InstAccess getName() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public InstAccess getNameNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Retrieves the InstClassDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstClassDecl child.
     * @apilevel low-level
     */
    public InstClassDecl getInstClassDeclNoTransform() {
        return (InstClassDecl) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child InstClassDecl.
     * @return The the child position of the optional child InstClassDecl.
     * @apilevel low-level
     */
    protected int getInstClassDeclChildPosition() {
        return 1;
    }
    @ASTNodeAnnotation.Attribute
    public ClassRedeclare getClassRedeclare() {
        ASTNode$State state = state();
        ClassRedeclare getClassRedeclare_value = (ClassRedeclare)        modification();

        return getClassRedeclare_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:387
     */
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsFromConstrainingType() {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstClassDecl> repl = lookupInstClassInInstElement(name());
                if (repl.successful()) 
                    return repl.target().instModificationsFromConstrainingType();
                else
                    return Collections.<InstModification>emptyList();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstClassModification() {
        ASTNode$State state = state();
        boolean hasInstClassModification_value = getClassRedeclare().getBaseClassDecl().hasClassModification();

        return hasInstClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasConstrainingModification() {
        ASTNode$State state = state();
        boolean hasConstrainingModification_value = getClassRedeclare().getBaseClassDecl().hasConstrainingModification();

        return hasConstrainingModification_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:568
     */
    @ASTNodeAnnotation.Attribute
    public InstModification matchInstModification(String name) {
        ASTNode$State state = state();
        try {
                if (name().equals(name) && hasConstrainingModification())
                    return getInstClassDecl().getInstConstrainingClass().getInstClassModification();
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:691
     */
    @ASTNodeAnnotation.Attribute
    public InstClassRedeclare matchInstClassRedeclare(String name) {
        ASTNode$State state = state();
        try {
        		if (getName().name().equals(name))
        			return this;
        		else
        			return null;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstNode instLookupNodeForShortClassExtends() {
        ASTNode$State state = state();
        InstNode instLookupNodeForShortClassExtends_value = myInstNode();

        return instLookupNodeForShortClassExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl redeclaringClassDecl() {
        ASTNode$State state = state();
        ClassDecl redeclaringClassDecl_value = getClassRedeclare().getBaseClassDecl();

        return redeclaringClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl redeclaringInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl redeclaringInstClassDecl_value = getInstClassDecl();

        return redeclaringInstClassDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstClassDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected InstClassDecl getInstClassDecl_value;
    /**
     * @apilevel internal
     */
    private void getInstClassDecl_reset() {
        getInstClassDecl_computed = false;
        getInstClassDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl getInstClassDecl() {
        if(getInstClassDecl_computed) {
            return (InstClassDecl) getChild(getInstClassDeclChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstClassDecl_value = getInstClassDecl_compute();
        setChild(getInstClassDecl_value, getInstClassDeclChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstClassDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        InstClassDecl node = (InstClassDecl) this.getChild(getInstClassDeclChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private InstClassDecl getInstClassDecl_compute() {
    		return getClassRedeclare().getBaseClassDecl().newInstClassDecl();
    	}
    @ASTNodeAnnotation.Attribute
    public boolean isThisClass(InstNode node) {
        ASTNode$State state = state();
        boolean isThisClass_InstNode_value = getInstClassDecl().isThisClass(node);

        return isThisClass_InstNode_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:640
     */
    @ASTNodeAnnotation.Attribute
    public boolean inInstComponent() {
        ASTNode$State state = state();
        boolean inInstComponent_value = getParent().Define_inInstComponent(this, null);

        return inInstComponent_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClassesInModifications
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:608
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassInInstElement(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassInInstElement_String_value = getParent().Define_lookupInstClassInInstElement(this, null, name);

        return lookupInstClassInInstElement_String_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:518
     */
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironment(String name) {
        ASTNode$State state = state();
        Environment myEnvironment_String_value = getParent().Define_myEnvironment(this, null, name);

        return myEnvironment_String_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getNameNoTransform()) {
            return lookupInstClassInInstElement(name);
        }
        else {
            return getParent().Define_lookupInstClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getNameNoTransform()) {
            return Kind.CLASS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:517
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstClassDeclNoTransform()) {
            return myEnvironment(name).mergeInnerClone(instModificationsFromConstrainingType());
        }
        else {
            return getParent().Define_myEnvironment(this, caller, name);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
