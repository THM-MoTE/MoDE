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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:177
 * @production InstModification : {@link BaseNode} ::= <span class="component">&lt;Modification:Modification&gt;</span>;

 */
public abstract class InstModification extends BaseNode implements Cloneable, InstLookupRedirectNode {
    /**
     * Find the expression for the attribute <code>name</code>.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2972
     */
    public FExp findAttribute(String name) { 
        return null;
    }
    /**
     * Check if this is a valid modification on a short class declaration extending an operator record.
     * 
     * Will only generate one error message, iven if there are several problems.
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:152
     */
    public boolean contentCheckExtendsOperatorRecord(ErrorCheckType checkType) {
        return true;
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:854
     */
    public void checkModificationNames(ErrorCheckType checkType) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:252
     */
    public void typeCheckAttribute(InstNode owner) {}
    /**
     * @aspect InstModifications
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:200
     */
    public ArrayList<InstModification> expand() {
		ArrayList<InstModification> l = new ArrayList<InstModification>();
		l.add(this);
		return l;
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1150
     */
    public InstExtends createInstReplacingExtends(ExtendsClause ec, InstNode lookup) {
        return ec.newInstExtends(lookup);
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2780
     */
    public String toString(String indent) {
        return modification().prettyPrint(indent);
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2800
     */
    public String toString() {
        return modification().toString();
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstModification() {
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
    public InstModification(Modification p0) {
        setModification(p0);
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
        lookupInstComponent_String_reset();
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
    public InstModification clone() throws CloneNotSupportedException {
        InstModification node = (InstModification) super.clone();
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
    public abstract InstModification fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:67
     */
    public abstract InstModification treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:75
     */
    public abstract InstModification treeCopy();
    /**
     * Replaces the lexeme Modification.
     * @param value The new value for the lexeme Modification.
     * @apilevel high-level
     */
    public void setModification(Modification value) {
        tokenModification_Modification = value;
    }
    /**
     * @apilevel internal
     */
    protected Modification tokenModification_Modification;
    /**
     * Retrieves the value for the lexeme Modification.
     * @return The value for the lexeme Modification.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Modification")
    public Modification getModification() {
        return tokenModification_Modification;
    }
    @ASTNodeAnnotation.Attribute
    public boolean collectErrorsInBindingExp() {
        ASTNode$State state = state();
        boolean collectErrorsInBindingExp_value = true;

        return collectErrorsInBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasEach() {
        ASTNode$State state = state();
        boolean hasEach_value = inModWithEach();

        return hasEach_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstValueMod() {
        ASTNode$State state = state();
        boolean hasInstValueMod_value = false;

        return hasInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp instValueMod() {
        ASTNode$State state = state();
        FExp instValueMod_value = null;

        return instValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstValueModification getInstValueMod() {
        ASTNode$State state = state();
        InstValueModification getInstValueMod_value = null;

        return getInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDefaultRecordMod() {
        ASTNode$State state = state();
        boolean isDefaultRecordMod_value = false;

        return isDefaultRecordMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassRedirect(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassRedirect_String_value = lookupInstClass(name);

        return lookupInstClassRedirect_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualified(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassQualified_String_value = myInstNode().lookupInstClassQualified(name);

        return lookupInstClassQualified_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasValue() {
        ASTNode$State state = state();
        boolean hasValue_value = false;

        return hasValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size expectedSize() {
        ASTNode$State state = state();
        Size expectedSize_value = expectedSizeFromParent();

        return expectedSize_value;
    }
    /**
     * Find the modification, if any, on which 'each' could be added to make all contained array sizes fit.
     * 
     * @param s  the size to be matched to this modification
     * @return  the matching modification, or <code>null</code> if none is found.
     * @attribute syn
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:253
     */
    @ASTNodeAnnotation.Attribute
    public InstModification findModificationLackingEach(Size s) {
        ASTNode$State state = state();
        try {
                Size es = expectedSize();
                if (s.ndims() < es.ndims() && es.contractLeft(s.ndims()).equivalent(s, true)) 
                    return findOrRetrieveModificationLackingEach(s);
                else
                    return null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstModification findOrRetrieveModificationLackingEach(Size s) {
        ASTNode$State state = state();
        InstModification findOrRetrieveModificationLackingEach_Size_value = retrieveModificationLackingEach(s);

        return findOrRetrieveModificationLackingEach_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean allModificationsMatchesSize(Size s) {
        ASTNode$State state = state();
        boolean allModificationsMatchesSize_Size_value = true;

        return allModificationsMatchesSize_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFinal() {
        ASTNode$State state = state();
        boolean isFinal_value = inheritsFinal();

        return isFinal_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstModification matchInstModification(String name) {
        ASTNode$State state = state();
        InstModification matchInstModification_String_value = null;

        return matchInstModification_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public Modification modification() {
        ASTNode$State state = state();
        Modification modification_value = getModification();

        return modification_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentRedeclare matchInstComponentRedeclare(String name) {
        ASTNode$State state = state();
        InstComponentRedeclare matchInstComponentRedeclare_String_value = null;

        return matchInstComponentRedeclare_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassRedeclare matchInstClassRedeclare(String name) {
        ASTNode$State state = state();
        InstClassRedeclare matchInstClassRedeclare_String_value = null;

        return matchInstClassRedeclare_String_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:131
     */
    @ASTNodeAnnotation.Attribute
    public FQName retrieveFQNameFromModification() {
        ASTNode$State state = state();
        FQName retrieveFQNameFromModification_value = getParent().Define_retrieveFQNameFromModification(this, null);

        return retrieveFQNameFromModification_value;
    }
    /**
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:194
     */
    @ASTNodeAnnotation.Attribute
    public boolean isForAttributeOnOperatorRecordDeclarationMember() {
        ASTNode$State state = state();
        boolean isForAttributeOnOperatorRecordDeclarationMember_value = getParent().Define_isForAttributeOnOperatorRecordDeclarationMember(this, null);

        return isForAttributeOnOperatorRecordDeclarationMember_value;
    }
    /**
     * Check if this modification is in another modification that is declared "each".
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1611
     */
    @ASTNodeAnnotation.Attribute
    public boolean inModWithEach() {
        ASTNode$State state = state();
        boolean inModWithEach_value = getParent().Define_inModWithEach(this, null);

        return inModWithEach_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1695
     */
    @ASTNodeAnnotation.Attribute
    public boolean isOnPrimitiveTypeDecl() {
        ASTNode$State state = state();
        boolean isOnPrimitiveTypeDecl_value = getParent().Define_isOnPrimitiveTypeDecl(this, null);

        return isOnPrimitiveTypeDecl_value;
    }
    /**
     * Get the modification level that is set for containing InstNode.
     * 
     * @throws UnsupportedOperationException  if setModificationLevel() has not been called on surrounding InstNode
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1706
     */
    @ASTNodeAnnotation.Attribute
    public int modificationLevel() {
        ASTNode$State state = state();
        int modificationLevel_value = getParent().Define_modificationLevel(this, null);

        return modificationLevel_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClass_String_value = getParent().Define_lookupInstClass(this, null, name);

        return lookupInstClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        Object _parameters = name;
        if (lookupInstComponent_String_values == null) lookupInstComponent_String_values = new HashMap(4);
        if(lookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)lookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);
        if (isFinal && num == state().boundariesCrossed) {
            lookupInstComponent_String_values.put(_parameters, lookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return lookupInstComponent_String_value;
    }
    protected Map lookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void lookupInstComponent_String_reset() {
        lookupInstComponent_String_values = null;
    }
    /**
     * The size that a value expression of the parent this modification should have.
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:238
     */
    @ASTNodeAnnotation.Attribute
    public Size expectedSizeFromParent() {
        ASTNode$State state = state();
        Size expectedSizeFromParent_value = getParent().Define_expectedSizeFromParent(this, null);

        return expectedSizeFromParent_value;
    }
    /**
     * Look upwards in tree for a modification that could be lacking each.
     * 
     * @param s  the size to match against
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:287
     */
    @ASTNodeAnnotation.Attribute
    public InstModification retrieveModificationLackingEach(Size s) {
        ASTNode$State state = state();
        InstModification retrieveModificationLackingEach_Size_value = getParent().Define_retrieveModificationLackingEach(this, null, s);

        return retrieveModificationLackingEach_Size_value;
    }
    /**
     * Is this modification within another modification or component that is declared final?
     * @attribute inh
     * @aspect InstModificationType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:651
     */
    @ASTNodeAnnotation.Attribute
    public boolean inheritsFinal() {
        ASTNode$State state = state();
        boolean inheritsFinal_value = getParent().Define_inheritsFinal(this, null);

        return inheritsFinal_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:760
     */
    @ASTNodeAnnotation.Attribute
    public InstNode myInstNode() {
        ASTNode$State state = state();
        InstNode myInstNode_value = getParent().Define_myInstNode(this, null);

        return myInstNode_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:194
     * @apilevel internal
     */
    public boolean Define_isFlattened(ASTNode caller, ASTNode child, InstValueModification ivm) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2104
     * @apilevel internal
     */
    public int Define_findDepthOfNestledFunctionCalls(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:238
     * @apilevel internal
     */
    public Size Define_expectedSizeFromParent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return expectedSize();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:651
     * @apilevel internal
     */
    public boolean Define_inheritsFinal(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isFinal();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:677
     * @apilevel internal
     */
    public InstModification Define_surroundingInstModification(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1180
     * @apilevel internal
     */
    public boolean Define_isInInstModification(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
