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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:194
 * @production InstComponentModification : {@link InstElementModification};

 */
public class InstComponentModification extends InstElementModification implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2976
     */
    public FExp findAttribute(String name) {
        if (getName().name().equals(name) && getInstModification().hasInstValueMod())
            return getInstModification().getInstValueMod().instValueMod();
        return null;
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:185
     */
    public boolean contentCheckExtendsOperatorRecord(ErrorCheckType checkType) {
        if (!hasValue() || isForAttributeOnOperatorRecordDeclarationMember()) {
            return super.contentCheckExtendsOperatorRecord(checkType);
        } else {
            error("Short class declarations extending an operator record may only modify attributes of members of the record");
            return false;
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:264
     */
    public void typeCheckAttribute(InstNode owner) {
        if (hasInstModification() && getInstModification().hasInstValueMod()) {
            FExp valMod = getInstModification().instValueMod();
            if (!type().isUnknown() && !valMod.type().isUnknown()) {
                Size attrSize = expectedSize();
                if (!type().typeCompatible(valMod.type().scalarType())) {
                    TYPE_MISMATCH_IN_ATTRIBUTE_MODIFICATION.invoke(this, name(), owner.kindDescription(), owner.name());
                } else if (!attrSize.equivalent(valMod.size(), true)) {
                    InstModification im = findModificationLackingEach(valMod.size());
                    if (im != null) {
                        ASSUMING_EACH.invoke(im, im);
                    } else {
                        ErrorProducerUnlessDisabled producer;
                        if (hasEach()) {
                            producer = ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION_DUE_TO_EACH;
                        } else {
                            producer = ARRAY_SIZE_MISMATCH_IN_ATTRIBUTE_MODIFICATION;
                        }
                        producer.invokeWithCondition(this, attrSize.ndims() != valMod.ndims(), name(),
                                owner.kindDescription(), owner.name(), attrSize, name(), valMod.size());
                    }
                } else {
                    if (name().equals("nominal")) {
                        checkNominalAttribute(owner, valMod);
                    }
                }
            }
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:301
     */
    public void checkNominalAttribute(InstNode owner, FExp valMod) {
        try {
            CValue val = valMod.ceval();
            if (val.isArray()) {
                CValueArray arr = (CValueArray) val;
                for (Index i : arr.indices()) {
                    if (arr.getCell(i).realValue() == 0.0) {
                        NOMINAL_ELEMENT_EQUAL_TO_ZERO.invoke(this, owner.kindDescription(), owner.name(), valMod, i);
                        break;
                    }
                }
            } else {
                if (val.realValue() == 0.0) {
                    NOMINAL_EQUAL_TO_ZERO.invoke(this, owner.kindDescription(), owner.name(), valMod);
                }
            }
        } catch (ConstantEvaluationException e) {}
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1671
     */
    public void collectAttributes(
            List<FAttribute> attrs, FQName prefix, AttributeExpRetriever aer, boolean cls) {
        if (hasInstModification()) {
            InstModification im = getInstModification();
            boolean attr_set = findMatching(attrs, getName().name()) != null;
            // If attribute is not set, add to list
            if (!attr_set && (cls || !im.isOnPrimitiveTypeDecl())) {
                FIdUse typeName = new FIdUse(getName().myInstComponentDecl().myInstClass().name());
                FIdDecl name = new FIdDecl(new FQNameString(getName().name()));
                FAttribute a = new FAttribute(typeName, name, true, modificationLevel());
                if (getInstModification().hasInstValueMod()) {
                    InstValueModification ivm = im.getInstValueMod();
                    a.setValue(aer.retrieve(ivm, ivm.hasEach()).flatten(prefix));
                }
                if (getComponentModification().hasEach())
                    a.setFEach(new FEach());
                if (getComponentModification().hasFinal())
                    a.setFFinal(new FFinal());
                im.collectAttributes(a.getFAttributes(), prefix, aer, cls);
                attrs.add(a);
            }
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstComponentModification() {
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
        children = new ASTNode[3];
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
    }
    /**
     * @declaredat ASTNode:15
     */
    public InstComponentModification(Modification p0, boolean p1, boolean p2, InstAccess p3, Opt<InstModification> p4) {
        setModification(p0);
        setEach(p1);
        setFinal(p2);
        setChild(p3, 0);
        setChild(p4, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:49
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public InstComponentModification clone() throws CloneNotSupportedException {
        InstComponentModification node = (InstComponentModification) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public InstComponentModification copy() {
        try {
            InstComponentModification node = (InstComponentModification) clone();
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
     * @declaredat ASTNode:81
     */
    public InstComponentModification fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public InstComponentModification treeCopyNoTransform() {
        InstComponentModification tree = (InstComponentModification) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
                    tree.children[i] = new Opt();
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
     * @declaredat ASTNode:115
     */
    public InstComponentModification treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenModification_Modification == ((InstComponentModification)node).tokenModification_Modification) && (tokenboolean_Each == ((InstComponentModification)node).tokenboolean_Each) && (tokenboolean_Final == ((InstComponentModification)node).tokenboolean_Final);    
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
     * Replaces the optional node for the InstModification child. This is the <code>Opt</code>
     * node containing the child InstModification, not the actual child!
     * @param opt The new node to be used as the optional node for the InstModification child.
     * @apilevel low-level
     */
    public void setInstModificationOpt(Opt<InstModification> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) InstModification child.
     * @param node The new node to be used as the InstModification child.
     * @apilevel high-level
     */
    public void setInstModification(InstModification node) {
        getInstModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstModification child exists.
     * @return {@code true} if the optional InstModification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstModification() {
        return getInstModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstModification child.
     * @return The InstModification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstModification getInstModification() {
        return (InstModification) getInstModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstModification child. This is the <code>Opt</code> node containing the child InstModification, not the actual child!
     * @return The optional node for child the InstModification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstModification")
    public Opt<InstModification> getInstModificationOpt() {
        return (Opt<InstModification>) getChild(1);
    }
    /**
     * Retrieves the optional node for child InstModification. This is the <code>Opt</code> node containing the child InstModification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstModification.
     * @apilevel low-level
     */
    public Opt<InstModification> getInstModificationOptNoTransform() {
        return (Opt<InstModification>) getChildNoTransform(1);
    }
    /**
     * Replaces the (optional) Annotation child.
     * @param node The new node to be used as the Annotation child.
     * @apilevel high-level
     */
    public void setAnnotation(InstClassModification node) {
        getAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Annotation child exists.
     * @return {@code true} if the optional Annotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasAnnotation() {
        return getAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Annotation child.
     * @return The Annotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getAnnotation() {
        return (InstClassModification) getAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child Annotation. This is the <code>Opt</code> node containing the child Annotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Annotation.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getAnnotationOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child Annotation.
     * @return The the child position of the optional child Annotation.
     * @apilevel low-level
     */
    protected int getAnnotationOptChildPosition() {
        return 2;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasValue() {
        ASTNode$State state = state();
        boolean hasValue_value = hasInstModification() && getInstModification().hasValue();

        return hasValue_value;
    }
    /**
     * @attribute syn
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:28
     */
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        try {
                if (getName().myInstComponentDecl().isAssignable()) {
                    InstAssignable ip = ((InstAssignable)getName().myInstComponentDecl());
                    return ip.type();
                } else {
                    return fUnknownType();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public ComponentModification getComponentModification() {
        ASTNode$State state = state();
        ComponentModification getComponentModification_value = (ComponentModification) modification();

        return getComponentModification_value;
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
                if (name().equals(name))
                    return hasInstModification() ? getInstModification() : null;
                return null;
            }
        finally {
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getNameNoTransform()) {
            return hasValue() ? Kind.COMPONENT_ACCESS : Kind.AMBIGUOUS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
