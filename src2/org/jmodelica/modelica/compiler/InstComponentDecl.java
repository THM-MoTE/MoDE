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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:98
 * @production InstComponentDecl : {@link InstBaseNode} ::= <span class="component">ClassName:{@link InstAccess}</span> <span class="component">[LocalFArraySubscripts:{@link FArraySubscripts}]</span> <span class="component">&lt;ComponentDecl:ComponentDecl&gt;</span> <span class="component">[{@link InstModification}]</span> <span class="component">[{@link InstConstrainingComponent}]</span> <span class="component">{@link FArraySubscripts}</span> <span class="component">[ConditionalAttribute:{@link FExp}]</span> <span class="component">[Annotation:{@link InstClassModification}]</span> <span class="component">[ClassAnnotation:{@link InstClassModification}]</span>;

 */
public abstract class InstComponentDecl extends InstBaseNode implements Cloneable, CommonVariableDecl, InstLookupResult.Item {
    /**
     * Create an FArraySubscripts that spans all array cells of this component.
     * 
     * If this is a scalar component, an empty FArraySubscripts is returned.
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:451
     */
    public FArraySubscripts expandedSubscripts() {
		return size().createExpandedFArraySubscripts();
	}
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2788
     */
    public void cevalNoBExpArray(VariableEvaluator evaluator, InstRecord top, CValueArray a, int ndims) {
        if (ndims > 0) {
            for (InstComponentDecl icd : allInstComponentDecls()) {
                icd.cevalNoBExpArray(evaluator, top, a, ndims-1);
            }
        } else {
            a.addCell(top.cevalNoBExpCell(evaluator, allInstComponentDecls()));
        }
    }
    /**
     * Read current function evaluation value from map.
     * 
     * If this variable isn't in the map, set to value of binding expression.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3634
     */
    public void readEvaluationValue(Map<CommonVariableDecl, CValue> map) {
        CValue val = map.get(this);
        if (val == null) {
            val = cevalFunctionBindingExp(ASTNode.defaultVariableEvaluator());
        }
        if (!isInput()) {
            val = val.cached();
        }
        map.put(this, val);
        setLocalCachedEvaluationValue(val);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3661
     */
    protected CValue cevalFunctionBindingExp(VariableEvaluator evaluator) {
        return CValue.UNKNOWN;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3684
     */
    protected void cevalBindingExpForRecordArray(VariableEvaluator evaluator, FRecordType type, CValueArray arr, int ndims) {
        throw new UnsupportedOperationException("Only valid for InstArrayComponentDecls.");
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3698
     */
    protected CValue cevalBindingExpForRecord(VariableEvaluator evaluator, FRecordType type) {
        CValueRecord res = new CValueRecord(type);
        evaluationValue = res;
        for (InstComponentDecl ch : allInstComponentDecls())
            res.setMember(ch.name(), ch.cevalFunctionBindingExp(evaluator));
        return res;
    }
    /**
     * Set the current function evaluation value.
     * 
     * Also updates value map.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3758
     */
    public void setEvaluationValue(VariableEvaluator evaluator, CValue val) {
        evaluator.setEvaluationValue(this, val.cached());
    }
    /**
     * Check if this variable has a current function evaluation value.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3772
     */
    public boolean hasEvaluationValue(VariableEvaluator evaluator) {
	  return evaluator.hasEvaluationValue(this);
  }
    /**
     * Get the current evaluation value.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3786
     */
    public CValue evaluationValue(VariableEvaluator evaluator) {
	  return evaluator.evaluationValue(this);
  }
    /**
     * Remove the current evaluation value
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3800
     */
    public void clearEvaluationValue(VariableEvaluator evaluator) {
        evaluator.clearEvaluationValue(this);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3805
     */
    protected CValue evaluationValue = null;
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3811
     */
    public CValue getLocalCachedEvaluationValue() {
        return evaluationValue;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3819
     */
    public void setLocalCachedEvaluationValue(CValue value) {
        evaluationValue = value;
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3827
     */
    public void clearLocalCachedEvaluationValue() {
        evaluationValue = null;
    }
    /**
     * Kept for legacy reasons.
     * @deprecated Use {@link #setLocalCachedEvaluationValue} instead.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3843
     */
    public void setEvaluationValue(CValue value) {
        setLocalCachedEvaluationValue(value);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3890
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        return super.collectEvaluationValues(collectMyEvaluationValue(map));
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3914
     */
    public Map<CommonVariableDecl,CValue> collectMyEvaluationValue(Map<CommonVariableDecl,CValue> map) {
        if (evaluationValue != null) {
            if (map == null)
                map = new HashMap<CommonVariableDecl,CValue>();
            map.put(this, evaluationValue);
        }
        return map;
    }
    /**
     * Create an access to this variable, from a scope where it can be accessed unqualified.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1099
     */
    public FIdUseExp createUseExp() {
        return new FIdUseExp(new FIdUseInstAccess(createInstAccess()));
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:228
     */
    public void contentCheck(ErrorCheckType checkType) {
        if (!inFunction()) // Array sizes outside functions should be structural parameters
            size().forceVariability(checkType, fStructParameter());
        checkQuotedIdentifier(getComponentDecl(), getComponentDecl().getName().getID());
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:775
     */
    public void forceVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        // TODO: should probably do something constructive here?
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:812
     */
    public void setVariabilityNotCalculated() {
        if (!variability_computed) {
            return;
        }
        InstComponentDecl icd = enclosingInstComponentDecl();
        if (icd != null) {
            icd.setVariabilityNotCalculated();
        }
        variability_computed = false;
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:811
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!errorChecked) {
            errorChecked = true;
            if (isRecursed()) {
                error("Recursive class structure");
            } else if (isOuter()) {
                myInnerInstComponentDecl().collectErrors(checkType);
            } else {
                collectErrorsInClassName(checkType);
                myInstClass().checkRestriction(checkType);
                if (hasFArraySubscripts()) {
                    getFArraySubscripts().collectErrors(checkType);
                }
                if (hasConditionalAttribute())  {
                    getConditionalAttribute().collectErrors(checkType);
                }
                if (!isDisabled() && hasInstModification()) {
                    getInstModification().collectErrors(checkType);
                }
                for (InstModification im : getMergedEnvironment()) {
                    im.checkModificationNames(checkType);
                }
                
                if (shouldCheckInto(checkType)) {
                    errorChecked = false;
                    super.collectErrors(checkType);
                    if (hasInstConstrainingComponent()) {
                        getInstConstrainingComponent().collectErrors(checkType);
                    }
                }
            }
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:863
     */
    public void collectErrorsInClassName(ErrorCheckType checkType) {
		getClassName().collectErrors(checkType);
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1092
     */
    public void checkRedeclares(ErrorCheckType checkType) {
        if (!isDisabled() && hasInstModification()) {
            getInstModification().collectErrors(checkType);
        }
        if (shouldCheckInto(checkType)) {
            if (hasInstConstrainingComponent()) {
                getInstConstrainingComponent().collectErrors(checkType);
            }
            super.checkRedeclares(checkType);
        }
    }
    /**
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:153
     */
    private boolean duplicateOfCalculated = false;
    /**
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:154
     */
    private InstComponentDecl duplicateOfValue = null;
    /**
     * Update duplicate information for this component.
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:168
     */
    public void calculateDuplicate(Map<String,InstComponentDecl> map) {
        if (map.containsKey(name()))
            duplicateOfValue = map.get(name());
        else
            map.put(name(), this);
        duplicateOfCalculated = true;
    }
    /**
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:190
     */
    public void nameCheck(ErrorCheckType checkType) {
        // TODO: check for duplicate classes and for class and component with same name
        if (isDuplicate()) {
            InstComponentDecl other = duplicateOf();
            if (other.nameCollisionScope() == nameCollisionScope()) {
                error("Duplicate component in same class: " + this);
            } else {
                // TODO: check if they are identical
                UNABLE_TO_INFER_EQUALITY_FOR_DUPLICATES.invoke(this, name());
            }
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:85
     */
    public void typeCheckReplacingComponent(InstComponentDecl declaredType, ErrorCheckType checkType) {
        super.typeCheck(checkType);
        
        // Type check the original component
        InstComponentDecl superType = declaredType.constrainingInstComponentDecl();
        if (declaredType.hasInstConstrainingComponent() && !declaredType.subType(superType))
            CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS.invoke(superType.getComponentDecl(), declaredType.getComponentDecl());

        // The environment should be traversed backwards in order to perform correct
        // subtype tests in redeclaration chains.
        InstComponentRedeclare prevRedeclare = null;
        for (InstComponentRedeclare redeclare : myEnvironment().reverseComponentRedeclares(name())) {
            InstComponentDecl declaredSubType = redeclare.getInstComponentDecl();
            InstComponentDecl constrainingSubType = declaredSubType.constrainingInstComponentDecl();
                
            // Check consistency of the redeclaring component
            if (declaredSubType.hasInstConstrainingComponent() && !declaredSubType.subType(constrainingSubType))
                CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS.invoke(declaredSubType.getComponentDecl(), declaredSubType.getComponentDecl());

            // It is ok to check against the constrainingSubType, since the declaredSubType is a subtype
            // of the constrainingSubType. Then if constrainingSubType is a subtype of superType, then it
            // follows that declaredSubType is a subtype of superType by transitivity.
            if (!constrainingSubType.subType(superType))
                REPLACING_CLASS_NOT_SUBTYPE_OF_CONSTRAINING_CLASS.invoke(constrainingSubType.getComponentDecl(), 
                        constrainingSubType.getComponentDecl(), superType.getComponentDecl());
        
            // If the redeclaring declaration has a constraining clause, the constraining
            // type of the redeclaring declaration of should be used in following subtype-test 
            // instead of the constraining type of the original declaration.
            if (declaredSubType.hasInstConstrainingComponent()) 
                superType = constrainingSubType;
            
            // If the previous redeclare is declared without "replaceable", then it is illegal 
            // to redeclare further. The check on commonAncestor() checks that this redeclare actually 
            // replaces the previous one. 
            InstNode containingNode = redeclare.myInstNode();
            if (prevRedeclare != null && !prevRedeclare.getInstComponentDecl().isReplaceable() && 
                    prevRedeclare.myInstNode().commonAncestor(containingNode) == containingNode) {
                PREV_REDECLARE_NOT_REPLACEABLE.invoke(declaredSubType, 
                        declaredSubType.getComponentDecl(), declaredSubType.name());
            }
            
            prevRedeclare = redeclare;
        }
    }
    /**
     * Connect the variables referenced in a connect or branch statement in the connection set manager.
     * 
     * @param left        describes current part of the left access
     * @param right       describes current part of the right access
     * @param prefix      the prefix to use when flattening names
     * @param csm         the connection set manager to add variables to
     * @param source      the originating connect or branch statement
     * @param buildGraph  if true, pass instances of overconstrained types to overconstrained connection graph
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1116
     */
    public void connectTo(ConnectionSetEntry left, ConnectionSetEntry right, 
            FQName prefix, ConnectionSetManager csm, ConnectionEdge source, boolean buildGraph) {
        if (!isDisabled() && !right.getVar().isDisabled()) {
            if (buildGraph && isOverconstrainedConnection(right.getVar())) {
                csm.getGraph().addConnection(left, right, prefix, source);
            } else if (isArray()) {
                for (Index i : indices()) {
                    ConnectionSetEntry leftEntry = left.specifyCell(i);
                    ConnectionSetEntry rightEntry = right.specifyCell(i);
                    leftEntry.getVar().connectTo(leftEntry, rightEntry, prefix, csm, source, buildGraph);
                }
            } else if (isOperatorRecord()) {
                connectToAsPrimitive(left, right, prefix, csm, source, buildGraph);
            } else {
                SortedSet<InstComponentDecl> rightChildren = right.getVar().containedInstComponents();
                for (InstComponentDecl leftComp : containedInstComponents()) {
                    SortedSet<InstComponentDecl> rightTail = rightChildren.tailSet(leftComp);
                    if (rightTail.size() > 0) {
                        InstComponentDecl rightComp = rightTail.first();
                        FQName leftName  = leftComp.flattenedAccess(left.getFQName());
                        FQName rightName = rightComp.flattenedAccess(right.getFQName());
                        ConnectionSetEntry leftEntry = ConnectionSetEntry.create(leftComp, left.isOutside(), leftName);
                        ConnectionSetEntry rightEntry = ConnectionSetEntry.create(rightComp, right.isOutside(), rightName);
                        leftComp.connectTo(leftEntry, rightEntry, prefix, csm, source, buildGraph);
                    }
                }
            }
            csm.countCardinality(left.getFQName().scalarName());
            csm.countCardinality(right.getFQName().scalarName());
        }
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1154
     */
    public void connectToAsPrimitive(ConnectionSetEntry left, ConnectionSetEntry right, 
            FQName prefix, ConnectionSetManager csm, ConnectionEdge source, boolean buildGraph) {
        left.redirectInner();
        right.redirectInner();
        if (left.equals(right)) {
            source.warning("Ignored connection from connector to itself");
        } else {
            if (buildGraph && isOverconstrainedConnection(right.getVar())) {
                csm.getGraph().addConnection(left, right, prefix, source);
            } else {
                // In the special case of members of expandable connectors, we need each cell separately.
                if (isArray() && (isExpandableConnectorMember() || right.getVar().isExpandableConnectorMember()) && 
                        !left.getFQName().hasScalarSubscripts()) 
                    for (Index i : indices())
                        csm.addVars(left.specifyCell(i), right.specifyCell(i));
                else
                    csm.addVars(left, right);
            }
            csm.countCardinality(left.getFQName().scalarName());
            csm.countCardinality(right.getFQName().scalarName());
        }
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1258
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
		if (useInFlattening()) 
			super.buildConnectionSets(prefix, csm, connect);
	}
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1277
     */
    public void buildConnectionSetsAsPrimitive(FQName prefix, ConnectionSetManager csm, boolean connect) {
        if (useInFlattening() && (isFlow() || isStream())) {
            FQName name = flattenedAccess(getFQNamePrefix());
            csm.addInsideFlowVar(this, name);
        }
    }
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2678
     */
    public void expandConnector(List<InstComponentDecl> members) {
        throw new UnsupportedOperationException();
    }
    /**
     * Check that this component would be allowed as a member of an expandable connector.
     * 
     * @param errorNode  node to report any errors found on
     * @return  <code>true</code> if the component is OK
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2754
     */
    public boolean checkAsExpandableMemberTemplate(ASTNode errorNode) {
        for (InstComponentDecl child : getInstComponentDecls()) {
            if (child.isExpandableConnector()) {
                errorNode.compliance("Expandable connectors containing a non-expandable connector component, that in turn contains an expandable connector, is not supported");
                return false;
            } else if (!child.checkAsExpandableMemberTemplate(errorNode))
                return false;
        }
        return true;
    }
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2790
     */
    public void buildConnectionSetsForExpandableConnector(FQName prefix, ConnectionSetManager csm, boolean connect) {
        if (useInFlattening()) {
            if (isArray()) {
                super.buildConnectionSets(prefix, csm, connect);
            } else if (csm.isExpandableConnectorsDone()) {
                for (InstComponentDecl icd : getInstComponentDecls()) {
                    if (icd.isArray()) {
                        FQName name = icd.getFQName();
                        for (Index i : icd.indices()) {
                            FQName cellName = name.copyAndAddFas(i.createFArraySubscripts());
                            icd.addExpandableArrayMembers(csm, cellName);
                        }
                    }
                }
            } else {
                csm.getExpandable().addConnector(this);
                super.buildConnectionSets(prefix, csm, connect);
            }
        }
    }
    /**
     * Add all variables to connection set manager, to getAll "= 0" equations if they are not connected.
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2818
     */
    public void addExpandableArrayMembers(ConnectionSetManager csm, FQName name) {
        InstComponentDecl me = this;
        while (me.isArray())
            me = me.getInstComponentDecl(0);
        for (InstComponentDecl icd : me.allInstComponentDecls()) {
            if (icd.isArray()) {
                for (Index i : icd.indices()) {
                    FQName cellName = name.copyAndAppend(icd.name(), i.createFArraySubscripts());
                    icd.addExpandableArrayMembers(csm, cellName);
                }
            } else {
                icd.addExpandableArrayMembers(csm, name.copyAndAppend(icd.name()));
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:140
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        if (useInFlattening()) {
            super.flattenUsedFuncsAndEnums(fc);
            if (isOperatorRecord() && isFlow())
                type().matchOverloadedZero().flattenFunction(fc);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:171
     */
    public void flattenOverloadedOperatorsForFlow(FClass fc) {
        if (useInFlattening()) {
            if (isOperatorRecord() && isFlow())
                type().flattenOverloadedOperatorsForFlow(fc);
            else
                super.flattenOverloadedOperatorsForFlow(fc);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:631
     */
    public void addExternalArg(List<FExp> args) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:668
     */
    public void flattenInFunction(
            FFunctionDecl ffd, FClass fc, boolean useConstant, InstClassDecl func) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:698
     */
    public void addFInitArrayStmt(List<FStatement> l) {
        
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:712
     */
    public void addBindingAssignments(List<FStatement> l) {
        for (InstComponentDecl icd : allInstComponentDecls()) {
            icd.addBindingAssignments(l);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:782
     */
    public FQName createFQNameForFuncVar(InstClassDecl func) {
        FQName name = getFQName();
        if (func != null) {
            if (name.numParts() > 1 || func.memberInstComponent(name.name()).foundOther(this))
                return new FQNameString(func.localTempVarName(this));
        }
        return name.fullCopy();
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:953
     */
    public void flatten(FClass fc, FQName name, boolean excludeBinding, int level) {
        if (useInFlattening()) 
            super.flatten(fc, name, excludeBinding, level);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:974
     */
    public void flattenInRecord(FRecordDecl frd, FClass fc, Set<String> names) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1162
     */
    public void addAttributesToFV(List<FAttribute> attr, Stack<Integer> indexStack,
            boolean excludeBinding, boolean isBound) {
        if (isArray()) {
            int i = 0;
            for (InstComponentDecl icd : allInstComponentDecls()) {
                indexStack.push(i++);
                icd.addAttributesToFV(attr, indexStack, excludeBinding, isBound);
                indexStack.pop();
                isBound = true;
            }
        } else {
            for (InstComponentDecl icd : allInstComponentDecls()) {
                icd.generateAdditionalAttributes(attr, indexStack, excludeBinding, isBound);
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1197
     */
    public void generateAdditionalAttributes(List<FAttribute> attr, Stack<Integer> indexStack,
            boolean excludeBinding, boolean isBound) {
        
    }
    /**
     * Flatten an access expression to this component.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1958
     */
    public FExp flattenAccess(FQName prefix, FIdUseExp exp) {
        if (isEnumLiteral())
            return new FIdUseExp(getFQName().fullCopy());
        InstAccess ia = exp.asInstAccess();
        FQName fqn = inOrIsInner() ? ia.flattenOuterAccess(prefix) : ia.flatten(prefix);
        return new FIdUseExp(fqn);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2675
     */
    public FExp flattenInRecordConstructor(FQName prefix) {
        return null;
    }
    /**
     * Creates a flattened access to this component.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2787
     */
    public FQName flattenedAccess() {
        return flattenedAccess(getFQNamePrefix());
    }
    /**
     * Creates a flattened access to this component.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2794
     */
    public FQName flattenedAccess(FQName prefix) {
        if (expandedSubscripts().getNumFSubscript() > 0)
            return prefix.copyAndAppend(name(), expandedSubscripts());
        else 
            return prefix.copyAndAppend(name());
    }
    /**
     * Called for inputs that no argument was bound to. Creates an InstDefaultArgument 
     * if the input has a default value and an InstMissingArgument otherwise.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:179
     */
    public InstFunctionArgument createInstDefaultArgument() {
		throw new UnsupportedOperationException();
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:933
     */
    public InstComponentDecl createInstArrayComponentDecl(int i) {
	    return new InstArrayComponentDecl(new InstClassAccess("ArrayDecl"), new Opt(), 
                getComponentDecl(), new Opt(), new Opt(), new Opt(), i);
	}
    /**
     * @aspect InstArrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2501
     */
    public void addLocalFArraySubscriptsTo(java.util.List<FSubscript> l) {
        if (hasLocalFArraySubscripts())
            getLocalFArraySubscripts().getFSubscripts().addAllTo(l);
        else
            addFSubscriptsFromOriginalDeclTo(l);
	}
    /**
     * @aspect InstArrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2508
     */
    public void addFSubscriptsFromOriginalDeclTo(java.util.List<FSubscript> l) {}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2684
     */
    public String toString(String indent) {
	   StringBuilder str = new StringBuilder();
	   str.append(indent+"InstComponent:\n");
	   str.append(indent+" Original decl:  " + getComponentDecl().prettyPrint("") + "\n");
       str.append(indent+ " "+ getClassName().toString());
	   appendEnvironment(str, indent);
	   //str.append(" Declared type:\n");
	   //str.append(declaredType().toString());
	   return str.toString();	
	}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2792
     */
    public String toString() {
    	return getComponentDecl().toString();
    }
    /**
     * @aspect Types
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:99
     */
    public static final Comparator<InstComponentDecl> NAME_COMPARATOR = 
        new Comparator<InstComponentDecl>() {
        public int compare(InstComponentDecl o1, InstComponentDecl o2) {
            return o1.name().compareTo(o2.name());
        }
    };
    /**
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:369
     */
    public String getNodeName() {
        return dump() + ": '" + getComponentDecl().getClassName().qualifiedName() + " " + getComponentDecl().getName().getID() + "'";
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:370
     */
    public String name_C() {
        StringBuilder buf = new StringBuilder();
        buf.append(getFQName().nameUnderscore());
        buf.append('_');
        buf.append(type().isArray() ? C_SUFFIX_ARRAY : C_SUFFIX_VARIABLE);
        return buf.toString();
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstComponentDecl() {
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
        children = new ASTNode[16];
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new List(), 9);
        setChild(new List(), 10);
        setChild(new List(), 11);
        setChild(new Opt(), 14);
        setChild(new Opt(), 15);
    }
    /**
     * @declaredat ASTNode:26
     */
    public InstComponentDecl(InstAccess p0, Opt<FArraySubscripts> p1, ComponentDecl p2, Opt<InstModification> p3, Opt<InstConstrainingComponent> p4, Opt<FExp> p5) {
        setChild(p0, 0);
        setChild(p1, 1);
        setComponentDecl(p2);
        setChild(p3, 2);
        setChild(p4, 3);
        setChild(p5, 4);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:37
     */
    protected int numChildren() {
        return 5;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:43
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        indices_reset();
        isCircular_int_reset();
        getFQName_reset();
        myInnerInstComponentDecl_reset();
        type_reset();
        definedVariability_reset();
        localDefinedVariability_reset();
        variability_reset();
        getInstComponentDeclList_reset();
        getFAbstractEquationList_reset();
        myFSubscripts_reset();
        getFArraySubscripts_reset();
        getClassAnnotationOpt_reset();
        getAnnotationOpt_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:70
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:76
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:82
     */
    public InstComponentDecl clone() throws CloneNotSupportedException {
        InstComponentDecl node = (InstComponentDecl) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:93
     */
    public abstract InstComponentDecl fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:100
     */
    public abstract InstComponentDecl treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:108
     */
    public abstract InstComponentDecl treeCopy();
    /**
     * Replaces the ClassName child.
     * @param node The new node to replace the ClassName child.
     * @apilevel high-level
     */
    public void setClassName(InstAccess node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the ClassName child.
     * @return The current node used as the ClassName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ClassName")
    public InstAccess getClassName() {
        return (InstAccess) getChild(0);
    }
    /**
     * Retrieves the ClassName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ClassName child.
     * @apilevel low-level
     */
    public InstAccess getClassNameNoTransform() {
        return (InstAccess) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the LocalFArraySubscripts child. This is the <code>Opt</code>
     * node containing the child LocalFArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the LocalFArraySubscripts child.
     * @apilevel low-level
     */
    public void setLocalFArraySubscriptsOpt(Opt<FArraySubscripts> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) LocalFArraySubscripts child.
     * @param node The new node to be used as the LocalFArraySubscripts child.
     * @apilevel high-level
     */
    public void setLocalFArraySubscripts(FArraySubscripts node) {
        getLocalFArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional LocalFArraySubscripts child exists.
     * @return {@code true} if the optional LocalFArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasLocalFArraySubscripts() {
        return getLocalFArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) LocalFArraySubscripts child.
     * @return The LocalFArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FArraySubscripts getLocalFArraySubscripts() {
        return (FArraySubscripts) getLocalFArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the LocalFArraySubscripts child. This is the <code>Opt</code> node containing the child LocalFArraySubscripts, not the actual child!
     * @return The optional node for child the LocalFArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="LocalFArraySubscripts")
    public Opt<FArraySubscripts> getLocalFArraySubscriptsOpt() {
        return (Opt<FArraySubscripts>) getChild(1);
    }
    /**
     * Retrieves the optional node for child LocalFArraySubscripts. This is the <code>Opt</code> node containing the child LocalFArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child LocalFArraySubscripts.
     * @apilevel low-level
     */
    public Opt<FArraySubscripts> getLocalFArraySubscriptsOptNoTransform() {
        return (Opt<FArraySubscripts>) getChildNoTransform(1);
    }
    /**
     * Replaces the lexeme ComponentDecl.
     * @param value The new value for the lexeme ComponentDecl.
     * @apilevel high-level
     */
    public void setComponentDecl(ComponentDecl value) {
        tokenComponentDecl_ComponentDecl = value;
    }
    /**
     * @apilevel internal
     */
    protected ComponentDecl tokenComponentDecl_ComponentDecl;
    /**
     * Retrieves the value for the lexeme ComponentDecl.
     * @return The value for the lexeme ComponentDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ComponentDecl")
    public ComponentDecl getComponentDecl() {
        return tokenComponentDecl_ComponentDecl;
    }
    /**
     * Replaces the optional node for the InstModification child. This is the <code>Opt</code>
     * node containing the child InstModification, not the actual child!
     * @param opt The new node to be used as the optional node for the InstModification child.
     * @apilevel low-level
     */
    public void setInstModificationOpt(Opt<InstModification> opt) {
        setChild(opt, 2);
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
        return (Opt<InstModification>) getChild(2);
    }
    /**
     * Retrieves the optional node for child InstModification. This is the <code>Opt</code> node containing the child InstModification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstModification.
     * @apilevel low-level
     */
    public Opt<InstModification> getInstModificationOptNoTransform() {
        return (Opt<InstModification>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the InstConstrainingComponent child. This is the <code>Opt</code>
     * node containing the child InstConstrainingComponent, not the actual child!
     * @param opt The new node to be used as the optional node for the InstConstrainingComponent child.
     * @apilevel low-level
     */
    public void setInstConstrainingComponentOpt(Opt<InstConstrainingComponent> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) InstConstrainingComponent child.
     * @param node The new node to be used as the InstConstrainingComponent child.
     * @apilevel high-level
     */
    public void setInstConstrainingComponent(InstConstrainingComponent node) {
        getInstConstrainingComponentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstConstrainingComponent child exists.
     * @return {@code true} if the optional InstConstrainingComponent child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstConstrainingComponent() {
        return getInstConstrainingComponentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstConstrainingComponent child.
     * @return The InstConstrainingComponent child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstConstrainingComponent getInstConstrainingComponent() {
        return (InstConstrainingComponent) getInstConstrainingComponentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstConstrainingComponent child. This is the <code>Opt</code> node containing the child InstConstrainingComponent, not the actual child!
     * @return The optional node for child the InstConstrainingComponent child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstConstrainingComponent")
    public Opt<InstConstrainingComponent> getInstConstrainingComponentOpt() {
        return (Opt<InstConstrainingComponent>) getChild(3);
    }
    /**
     * Retrieves the optional node for child InstConstrainingComponent. This is the <code>Opt</code> node containing the child InstConstrainingComponent, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstConstrainingComponent.
     * @apilevel low-level
     */
    public Opt<InstConstrainingComponent> getInstConstrainingComponentOptNoTransform() {
        return (Opt<InstConstrainingComponent>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the ConditionalAttribute child. This is the <code>Opt</code>
     * node containing the child ConditionalAttribute, not the actual child!
     * @param opt The new node to be used as the optional node for the ConditionalAttribute child.
     * @apilevel low-level
     */
    public void setConditionalAttributeOpt(Opt<FExp> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) ConditionalAttribute child.
     * @param node The new node to be used as the ConditionalAttribute child.
     * @apilevel high-level
     */
    public void setConditionalAttribute(FExp node) {
        getConditionalAttributeOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConditionalAttribute child exists.
     * @return {@code true} if the optional ConditionalAttribute child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConditionalAttribute() {
        return getConditionalAttributeOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConditionalAttribute child.
     * @return The ConditionalAttribute child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getConditionalAttribute() {
        return (FExp) getConditionalAttributeOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConditionalAttribute child. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * @return The optional node for child the ConditionalAttribute child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConditionalAttribute")
    public Opt<FExp> getConditionalAttributeOpt() {
        return (Opt<FExp>) getChild(4);
    }
    /**
     * Retrieves the optional node for child ConditionalAttribute. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConditionalAttribute.
     * @apilevel low-level
     */
    public Opt<FExp> getConditionalAttributeOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(4);
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel high-level
     */
    public int getNumInstComponentDecl() {
        return getInstComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel low-level
     */
    public int getNumInstComponentDeclNoTransform() {
        return getInstComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstComponentDecl list.
     * @apilevel high-level
     */
    public InstComponentDecl getInstComponentDecl(int i) {
        return (InstComponentDecl) getInstComponentDeclList().getChild(i);
    }
    /**
     * Check whether the InstComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstComponentDecl() {
        return getInstComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstComponentDecl list.
     * @param node The element to append to the InstComponentDecl list.
     * @apilevel high-level
     */
    public void addInstComponentDecl(InstComponentDecl node) {
        List<InstComponentDecl> list = (parent == null || state == null) ? getInstComponentDeclListNoTransform() : getInstComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstComponentDeclNoTransform(InstComponentDecl node) {
        List<InstComponentDecl> list = getInstComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node, int i) {
        List<InstComponentDecl> list = getInstComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstComponentDecl list.
     * @return The the child position of the InstComponentDecl list.
     * @apilevel low-level
     */
    protected int getInstComponentDeclListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(5);
    }
    /**
     * Retrieves the InstComponentDecl list.
     * @return The node representing the InstComponentDecl list.
     * @apilevel high-level
     */
    public List<InstComponentDecl> getInstComponentDecls() {
        return getInstComponentDeclList();
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclsNoTransform() {
        return getInstComponentDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * @return Number of children in the InstClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstClassDecl() {
        return getInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstClassDeclNoTransform() {
        return getInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstClassDecl(int i) {
        return (InstClassDecl) getInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstClassDecl() {
        return getInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstClassDecl list.
     * @param node The element to append to the InstClassDecl list.
     * @apilevel high-level
     */
    public void addInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstClassDeclListNoTransform() : getInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstClassDecl list.
     * @return The the child position of the InstClassDecl list.
     * @apilevel low-level
     */
    protected int getInstClassDeclListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(6);
    }
    /**
     * Retrieves the InstClassDecl list.
     * @return The node representing the InstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstClassDecls() {
        return getInstClassDeclList();
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclsNoTransform() {
        return getInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * @return Number of children in the InstExtends list.
     * @apilevel high-level
     */
    public int getNumInstExtends() {
        return getInstExtendsList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstExtends list.
     * @apilevel low-level
     */
    public int getNumInstExtendsNoTransform() {
        return getInstExtendsListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstExtends list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstExtends list.
     * @apilevel high-level
     */
    public InstExtends getInstExtends(int i) {
        return (InstExtends) getInstExtendsList().getChild(i);
    }
    /**
     * Check whether the InstExtends list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstExtends() {
        return getInstExtendsList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstExtends list.
     * @param node The element to append to the InstExtends list.
     * @apilevel high-level
     */
    public void addInstExtends(InstExtends node) {
        List<InstExtends> list = (parent == null || state == null) ? getInstExtendsListNoTransform() : getInstExtendsList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstExtendsNoTransform(InstExtends node) {
        List<InstExtends> list = getInstExtendsListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstExtends list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstExtends(InstExtends node, int i) {
        List<InstExtends> list = getInstExtendsList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstExtends list.
     * @return The the child position of the InstExtends list.
     * @apilevel low-level
     */
    protected int getInstExtendsListChildPosition() {
        return 7;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(7);
    }
    /**
     * Retrieves the InstExtends list.
     * @return The node representing the InstExtends list.
     * @apilevel high-level
     */
    public List<InstExtends> getInstExtendss() {
        return getInstExtendsList();
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendssNoTransform() {
        return getInstExtendsListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * @return Number of children in the InstImport list.
     * @apilevel high-level
     */
    public int getNumInstImport() {
        return getInstImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstImport list.
     * @apilevel low-level
     */
    public int getNumInstImportNoTransform() {
        return getInstImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstImport list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstImport list.
     * @apilevel high-level
     */
    public InstImport getInstImport(int i) {
        return (InstImport) getInstImportList().getChild(i);
    }
    /**
     * Check whether the InstImport list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstImport() {
        return getInstImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstImport list.
     * @param node The element to append to the InstImport list.
     * @apilevel high-level
     */
    public void addInstImport(InstImport node) {
        List<InstImport> list = (parent == null || state == null) ? getInstImportListNoTransform() : getInstImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstImportNoTransform(InstImport node) {
        List<InstImport> list = getInstImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstImport list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstImport(InstImport node, int i) {
        List<InstImport> list = getInstImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstImport list.
     * @return The the child position of the InstImport list.
     * @apilevel low-level
     */
    protected int getInstImportListChildPosition() {
        return 8;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(8);
    }
    /**
     * Retrieves the InstImport list.
     * @return The node representing the InstImport list.
     * @apilevel high-level
     */
    public List<InstImport> getInstImports() {
        return getInstImportList();
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportsNoTransform() {
        return getInstImportListNoTransform();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public int getNumRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public int getNumRedeclaredInstClassDeclNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the RedeclaredInstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getRedeclaredInstClassDecl(int i) {
        return (InstClassDecl) getRedeclaredInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the RedeclaredInstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the RedeclaredInstClassDecl list.
     * @param node The element to append to the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public void addRedeclaredInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getRedeclaredInstClassDeclListNoTransform() : getRedeclaredInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addRedeclaredInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the RedeclaredInstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setRedeclaredInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the RedeclaredInstClassDecl list.
     * @return The the child position of the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    protected int getRedeclaredInstClassDeclListChildPosition() {
        return 9;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(9);
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDecls() {
        return getRedeclaredInstClassDeclList();
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclsNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the FAbstractEquation list.
     * @return The the child position of the FAbstractEquation list.
     * @apilevel low-level
     */
    protected int getFAbstractEquationListChildPosition() {
        return 10;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(10);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * @return Number of children in the ElementInstModification list.
     * @apilevel high-level
     */
    public int getNumElementInstModification() {
        return getElementInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementInstModification list.
     * @apilevel low-level
     */
    public int getNumElementInstModificationNoTransform() {
        return getElementInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementInstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementInstModification list.
     * @apilevel high-level
     */
    public InstModification getElementInstModification(int i) {
        return (InstModification) getElementInstModificationList().getChild(i);
    }
    /**
     * Check whether the ElementInstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementInstModification() {
        return getElementInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementInstModification list.
     * @param node The element to append to the ElementInstModification list.
     * @apilevel high-level
     */
    public void addElementInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getElementInstModificationListNoTransform() : getElementInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getElementInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementInstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementInstModification(InstModification node, int i) {
        List<InstModification> list = getElementInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the ElementInstModification list.
     * @return The the child position of the ElementInstModification list.
     * @apilevel low-level
     */
    protected int getElementInstModificationListChildPosition() {
        return 11;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(11);
    }
    /**
     * Retrieves the ElementInstModification list.
     * @return The node representing the ElementInstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getElementInstModifications() {
        return getElementInstModificationList();
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationsNoTransform() {
        return getElementInstModificationListNoTransform();
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(12);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 12;
    }
    /**
     * Retrieves the FArraySubscripts child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FArraySubscripts child.
     * @apilevel low-level
     */
    public FArraySubscripts getFArraySubscriptsNoTransform() {
        return (FArraySubscripts) getChildNoTransform(13);
    }
    /**
     * Retrieves the child position of the optional child FArraySubscripts.
     * @return The the child position of the optional child FArraySubscripts.
     * @apilevel low-level
     */
    protected int getFArraySubscriptsChildPosition() {
        return 13;
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
        return (Opt<InstClassModification>) getChildNoTransform(14);
    }
    /**
     * Retrieves the child position of the optional child Annotation.
     * @return The the child position of the optional child Annotation.
     * @apilevel low-level
     */
    protected int getAnnotationOptChildPosition() {
        return 14;
    }
    /**
     * Replaces the (optional) ClassAnnotation child.
     * @param node The new node to be used as the ClassAnnotation child.
     * @apilevel high-level
     */
    public void setClassAnnotation(InstClassModification node) {
        getClassAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ClassAnnotation child exists.
     * @return {@code true} if the optional ClassAnnotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasClassAnnotation() {
        return getClassAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ClassAnnotation child.
     * @return The ClassAnnotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstClassModification getClassAnnotation() {
        return (InstClassModification) getClassAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child ClassAnnotation. This is the <code>Opt</code> node containing the child ClassAnnotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ClassAnnotation.
     * @apilevel low-level
     */
    public Opt<InstClassModification> getClassAnnotationOptNoTransform() {
        return (Opt<InstClassModification>) getChildNoTransform(15);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 15;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = hasFArraySubscripts() ? getFArraySubscripts().ndims() : 0;

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
        size_value = declaredSize();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size declaredSize() {
        ASTNode$State state = state();
        Size declaredSize_value = hasFArraySubscripts() ? getFArraySubscripts().declarationSize() : defaultSize();

        return declaredSize_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size declaredSizeCalc() {
        ASTNode$State state = state();
        Size declaredSizeCalc_value = hasFArraySubscripts() ? FArraySubscripts.declarationSize(getFArraySubscripts().getFSubscripts()) : defaultSizeCalc();

        return declaredSizeCalc_value;
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
    public CValue ceval() {
        ASTNode$State state = state();
        CValue ceval_value = ceval(defaultVariableEvaluator());

        return ceval_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = (evaluationValue == null) ? CValue.UNKNOWN : evaluationValue;

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = CValue.UNKNOWN;

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue startAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue startAttributeCValue_VariableEvaluator_value = CValue.UNKNOWN;

        return startAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue fixedAttributeCValue() {
        ASTNode$State state = state();
        CValue fixedAttributeCValue_value = fixedAttributeCValue(defaultVariableEvaluator());

        return fixedAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue fixedAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue fixedAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.FIXED);

        return fixedAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue quantityAttributeCValue() {
        ASTNode$State state = state();
        CValue quantityAttributeCValue_value = quantityAttributeCValue(defaultVariableEvaluator());

        return quantityAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue quantityAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue quantityAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.QUANTITY);

        return quantityAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue unitAttributeCValue() {
        ASTNode$State state = state();
        CValue unitAttributeCValue_value = unitAttributeCValue(defaultVariableEvaluator());

        return unitAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue unitAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue unitAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.UNIT);

        return unitAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue displayUnitAttributeCValue() {
        ASTNode$State state = state();
        CValue displayUnitAttributeCValue_value = displayUnitAttributeCValue(defaultVariableEvaluator());

        return displayUnitAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue displayUnitAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue displayUnitAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.DISPLAY_UNIT);

        return displayUnitAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue minAttributeCValue() {
        ASTNode$State state = state();
        CValue minAttributeCValue_value = minAttributeCValue(defaultVariableEvaluator());

        return minAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue minAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue minAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.MIN);

        return minAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue maxAttributeCValue() {
        ASTNode$State state = state();
        CValue maxAttributeCValue_value = maxAttributeCValue(defaultVariableEvaluator());

        return maxAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue maxAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue maxAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.MAX);

        return maxAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue nominalAttributeCValue() {
        ASTNode$State state = state();
        CValue nominalAttributeCValue_value = nominalAttributeCValue(defaultVariableEvaluator());

        return nominalAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue nominalAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue nominalAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.NOMINAL);

        return nominalAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue stateSelectAttributeCValue() {
        ASTNode$State state = state();
        CValue stateSelectAttributeCValue_value = stateSelectAttributeCValue(defaultVariableEvaluator());

        return stateSelectAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue stateSelectAttributeCValue(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue stateSelectAttributeCValue_VariableEvaluator_value = attributeCValueGeneric(evaluator, FAttribute.STATE_SELECT);

        return stateSelectAttributeCValue_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueGeneric(VariableEvaluator evaluator, String name) {
        ASTNode$State state = state();
        CValue attributeCValueGeneric_VariableEvaluator_String_value = CValue.UNKNOWN;

        return attributeCValueGeneric_VariableEvaluator_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueDefault(String name) {
        ASTNode$State state = state();
        CValue attributeCValueDefault_String_value = CValue.UNKNOWN;

        return attributeCValueDefault_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable asFAbstractVariable() {
        ASTNode$State state = state();
        FAbstractVariable asFAbstractVariable_value = null;

        return asFAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVar() {
        ASTNode$State state = state();
        boolean isUnknownSizeVar_value = type().size().isUnknown();

        return isUnknownSizeVar_value;
    }
    /**
     * @apilevel internal
     */
    private void isCircular_int_reset() {
        isCircular_int_values = null;
    }
    protected Map isCircular_int_values;
    @ASTNodeAnnotation.Attribute
    public boolean isCircular(int dim) {
        Object _parameters = Integer.valueOf(dim);
        if (isCircular_int_values == null) isCircular_int_values = new HashMap(4);
        ASTNode$State.CircularValue _value;
        if(isCircular_int_values.containsKey(_parameters)) {
            Object _o = isCircular_int_values.get(_parameters);
            if(!(_o instanceof ASTNode$State.CircularValue)) {
                return ((Boolean)_o).booleanValue();
            } else {
                _value = (ASTNode$State.CircularValue) _o;
            }
        } else {
            _value = new ASTNode$State.CircularValue();
            isCircular_int_values.put(_parameters, _value);
            _value.value = Boolean.valueOf(true);
        }
        ASTNode$State state = state();
        boolean new_isCircular_int_value;
        if (!state.IN_CIRCLE) {
            state.IN_CIRCLE = true;
            int num = state.boundariesCrossed;
            boolean isFinal = this.is$Final();
            // TODO: fixme
            // state().CIRCLE_INDEX = 1;
            do {
                _value.visited = new Integer(state.CIRCLE_INDEX);
                state.CHANGE = false;
                new_isCircular_int_value = false;
                if (new_isCircular_int_value != ((Boolean)_value.value).booleanValue()) {
                    state.CHANGE = true;
                    _value.value = Boolean.valueOf(new_isCircular_int_value);
                }
                state.CIRCLE_INDEX++;
            } while (state.CHANGE);
            if (isFinal && num == state().boundariesCrossed) {
                isCircular_int_values.put(_parameters, new_isCircular_int_value);
                state.LAST_CYCLE = true;
                boolean $tmp = false;
                state.LAST_CYCLE = false;
            } else {
                isCircular_int_values.remove(_parameters);
                state.RESET_CYCLE = true;
                boolean $tmp = false;
                state.RESET_CYCLE = false;
            }
            state.IN_CIRCLE = false;
            state.INTERMEDIATE_VALUE = false;
            return new_isCircular_int_value;
        }
        if (!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
            _value.visited = new Integer(state.CIRCLE_INDEX);
            new_isCircular_int_value = false;
            if (state.LAST_CYCLE) {
                isCircular_int_values.put(_parameters, Boolean.valueOf(new_isCircular_int_value));
            }
            if (state.RESET_CYCLE) {
                isCircular_int_values.remove(_parameters);
            }
            else if (new_isCircular_int_value != ((Boolean)_value.value).booleanValue()) {
                state.CHANGE = true;
                _value.value = new_isCircular_int_value;
            }
            state.INTERMEDIATE_VALUE = true;
            return new_isCircular_int_value;
        }
        state.INTERMEDIATE_VALUE = true;
        return ((Boolean)_value.value).booleanValue();
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInitialParameter() {
        ASTNode$State state = state();
        boolean isInitialParameter_value = variability().initialParameterVariability();

        return isInitialParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComposite() {
        ASTNode$State state = state();
        boolean isComposite_value = isArray() || isRecord();

        return isComposite_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFQName_computed = false;
    /**
     * @apilevel internal
     */
    protected FQName getFQName_value;
    /**
     * @apilevel internal
     */
    private void getFQName_reset() {
        getFQName_computed = false;
        getFQName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FQName getFQName() {
        if(getFQName_computed) {
            return (FQName) getChild(getFQNameChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFQName_value = appendMyName(retrieveFQName());
        setChild(getFQName_value, getFQNameChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFQName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FQName node = (FQName) this.getChild(getFQNameChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public FQName appendMyName(FQName prefix) {
        ASTNode$State state = state();
        FQName appendMyName_FQName_value = (isAssignable() && isArrayDecl()) ? 
                        prefix.copyAndAppend(name(), size().flattenFArraySubscripts()) :
                        prefix.copyAndAppend(name());

        return appendMyName_FQName_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess createInstAccess() {
        ASTNode$State state = state();
        InstAccess createInstAccess_value = new InstComponentAccess(name());

        return createInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isModifiable() {
        ASTNode$State state = state();
        boolean isModifiable_value = !(definedVariability().constantVariability() && hasBindingExp()) &&
                     !(definedVariability().parameterVariability() && getComponentDecl().hasFinal());

        return isModifiable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldCheckInto(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean shouldCheckInto_ErrorCheckType_value = !isDisabled() || checkType.checkInactiveComponents() || myOptions().getBooleanOption("check_inactive_contitionals");

        return shouldCheckInto_ErrorCheckType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecursed() {
        ASTNode$State state = state();
        boolean isRecursed_value = !isPrimitive() && isWithin(myInstClass());

        return isRecursed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOfInstClassDecl(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isOfInstClassDecl_InstClassDecl_value = icd == myInstClass() && !icd.isUnknown();

        return isOfInstClassDecl_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDuplicate() {
        ASTNode$State state = state();
        boolean isDuplicate_value = duplicateOf() != null;

        return isDuplicate_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl duplicateOriginal() {
        ASTNode$State state = state();
        InstComponentDecl duplicateOriginal_value = isDuplicate() ? duplicateOf() : this;

        return duplicateOriginal_value;
    }
    /**
     * Get the component that this component is a duplicate of, if any.
     * @attribute syn
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:145
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl duplicateOf() {
        ASTNode$State state = state();
        try {
                if (!duplicateOfCalculated) 
                    containingEntity().calculateDuplicates();
                return duplicateOfValue;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String kindDescription() {
        ASTNode$State state = state();
        String kindDescription_value = myInstClass().kindDescription() + " instance";

        return kindDescription_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:792
     */
    @ASTNodeAnnotation.Attribute
    public FType myIndexType(int dim) {
        ASTNode$State state = state();
        try {
            FArraySubscripts fas = getFArraySubscripts();
            if (fas != null && fas.getNumFSubscript() > dim)
                return fas.getFSubscript(dim).type().scalarType();
            else
                return fUnknownType();
          }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOverconstrainedConnection(InstComponentDecl right) {
        ASTNode$State state = state();
        boolean isOverconstrainedConnection_InstComponentDecl_value = isOverconstrainedType() && right.isOverconstrainedType();

        return isOverconstrainedConnection_InstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findCell(Index i, int j) {
        ASTNode$State state = state();
        InstComponentDecl findCell_Index_int_value = ((j > 0) ? findCellUp(i, j, this) : this).findCellDown(i, j);

        return findCell_Index_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findCellDown(Index i, int j) {
        ASTNode$State state = state();
        InstComponentDecl findCellDown_Index_int_value = (j < i.ndims()) ? getInstComponentDecl(i.get(j) - 1).findCellDown(i, j + 1) : this;

        return findCellDown_Index_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOverconstrainedType() {
        ASTNode$State state = state();
        boolean isOverconstrainedType_value = equalityConstraint() != null;

        return isOverconstrainedType_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl equalityConstraint() {
        ASTNode$State state = state();
        InstClassDecl equalityConstraint_value = null;

        return equalityConstraint_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeExternalReturn(FExternalLanguage lang) {
        ASTNode$State state = state();
        boolean canBeExternalReturn_FExternalLanguage_value = false;

        return canBeExternalReturn_FExternalLanguage_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPresent() {
        ASTNode$State state = state();
        boolean isPresent_value = !isDisabled() && !isDuplicate();

        return isPresent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean useInFlattening() {
        ASTNode$State state = state();
        boolean useInFlattening_value = isPresent() && !(isOuter() && !isInner());

        return useInFlattening_value;
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1039
     */
    @ASTNodeAnnotation.Attribute
    public String qualifiedTypeName() {
        ASTNode$State state = state();
        try {
                if (flattenRedeclaredType()) {
                    return surroundingInstClass().qualifiedName() + ":" + qualifiedName();
                } else {
                    return myInstClass().qualifiedName();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean flattenRedeclaredType() {
        ASTNode$State state = state();
        boolean flattenRedeclaredType_value = InstNode.containsRedeclared(this);

        return flattenRedeclaredType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp myBindingInstExp() {
        ASTNode$State state = state();
        FExp myBindingInstExp_value = null;

        return myBindingInstExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasBindingFExp() {
        ASTNode$State state = state();
        boolean hasBindingFExp_value = false;

        return hasBindingFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getBindingFExp() {
        ASTNode$State state = state();
        FExp getBindingFExp_value = null;

        return getBindingFExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstValueMod() {
        ASTNode$State state = state();
        boolean hasInstValueMod_value = (myInstValueMod() != null);

        return hasInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasBindingExp() {
        ASTNode$State state = state();
        boolean hasBindingExp_value = false;

        return hasBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstValueModification myInstValueMod() {
        ASTNode$State state = state();
        InstValueModification myInstValueMod_value = null;

        return myInstValueMod_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(true, myInstClass());

        return extraNodesToSetModLevelFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArraySubscripts arraySubscripts() {
        ASTNode$State state = state();
        ArraySubscripts arraySubscripts_value = getComponentDecl().arraySubscripts()!=null?
                    getComponentDecl().arraySubscripts(): null;

        return arraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inOrIsOuter() {
        ASTNode$State state = state();
        boolean inOrIsOuter_value = isOuter() || inOuter();

        return inOrIsOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inOrIsInner() {
        ASTNode$State state = state();
        boolean inOrIsInner_value = isInner() || inInner();

        return inOrIsInner_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInnerInstComponentDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected InstComponentDecl myInnerInstComponentDecl_value;
    /**
     * @apilevel internal
     */
    private void myInnerInstComponentDecl_reset() {
        myInnerInstComponentDecl_computed = false;
        myInnerInstComponentDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInnerInstComponentDecl() {
        if(myInnerInstComponentDecl_computed) {
            return myInnerInstComponentDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInnerInstComponentDecl_value = myInnerInstComponentDecl_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myInnerInstComponentDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInnerInstComponentDecl_value;
    }
    /**
     * @apilevel internal
     */
    private InstComponentDecl myInnerInstComponentDecl_compute() {
            InstComponentDecl res = null;
            if (isOuter()) {
                res = lookupInnerInstComponent(this, true);
            }
            return (res == null) ? unknownInstComponentDecl() : res;
        }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:393
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> genericLookupInstClass(String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstClassDecl> res = memberInstClass(name);
                if (res.successful())
                    return res;
                
                for (InstImport ii : getInstImports()) {
                    res = ii.lookupInstClassInImport(name);
                    if (res.successful())
                        return res;
                }
                
                return myInstClass().lookupInstClassInSurrounding(name);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:411
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassInComponent(String name) {
        ASTNode$State state = state();
        try {
                // TODO: Why do we do this? Seems to be needed, as tests fail without it
                if (myInstClass().isRedeclaredNonSimple())
                    return myInstClass().lookupInstClassInInstClassRedeclare(name);
                
                for (InstImport ii : getInstImports()) {
                    InstLookupResult<InstClassDecl> res = ii.lookupInstClassInImport(name);
                    if (res.successful())
                        return res;
                }
                
                for (InstClassDecl icd : getInstClassDecls()) 
                    if (icd.matches(name)) 
                        return InstLookupResult.found(icd);
            
                return myInstClass().superLookupInstClass(name);
            }
        finally {
        }
    }
    /**
     * Returns the InstComponentDecl representing the first cell of the array.
     * 
     * @param ndims  the number of dimensions of the array.
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:491
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl arrayCellInstComponent(int ndims) {
        ASTNode$State state = state();
        try {
                if (ndims == 0) 
                    return this;
                if (getNumInstComponentDecl() == 0)
                    return unknownInstComponentDecl();
                return getInstComponentDecl(0).arrayCellInstComponent(ndims - 1);
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:453
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> memberInstClass(String name) {
        ASTNode$State state = state();
        try {
                if (isArray() && !isPrimitive()) {
                    return arrayCellInstComponent(ndims()).memberInstClass(name);
                } else {
                    for (InstClassDecl icd : getInstClassDecls()) 
                        if (icd.matches(name)) 
                            return InstLookupResult.found(findInnerClassIfAny(icd));
                    
                    for (InstExtends ie : getInstExtendss()) {
                        InstLookupResult<InstClassDecl> res = ie.memberInstClass(name);
                        if (res.successful())
                            return res;
                    }
                    
                    return InstLookupResult.notFound();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClass() {
        ASTNode$State state = state();
        InstClassDecl myInstClass_value = getClassName().myInstClassDecl();

        return myInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstConstant(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> genericLookupInstConstant_String_value = myInstClass().lookupInstConstant(name);

        return genericLookupInstConstant_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = name().equals(str);

        return matches_String_value;
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
        type_value = fUnknownType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * Check if node is the same as this or the class of this component (if this is a component).
     * @attribute syn
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:321
     */
    @ASTNodeAnnotation.Attribute
    public boolean isMeOrMyClass(InstNode node) {
        ASTNode$State state = state();
        try {
                InstNode inherit = node.inheritingNode();
                return inherit == this || inherit == myInstClass();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConnector() {
        ASTNode$State state = state();
        boolean isConnector_value = myInstClass().isConnector();

        return isConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnector() {
        ASTNode$State state = state();
        boolean isExpandableConnector_value = myInstClass().isExpandableConnector();

        return isExpandableConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = false;

        return isOperatorRecord_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean definedVariability_computed = false;
    /**
     * @apilevel internal
     */
    protected FTypePrefixVariability definedVariability_value;
    /**
     * @apilevel internal
     */
    private void definedVariability_reset() {
        definedVariability_computed = false;
        definedVariability_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability definedVariability() {
        if(definedVariability_computed) {
            return definedVariability_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        definedVariability_value = overrideVariability(localDefinedVariability(), bExpVariability());
        if (isFinal && num == state().boundariesCrossed) {
            definedVariability_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return definedVariability_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean localDefinedVariability_computed = false;
    /**
     * @apilevel internal
     */
    protected FTypePrefixVariability localDefinedVariability_value;
    /**
     * @apilevel internal
     */
    private void localDefinedVariability_reset() {
        localDefinedVariability_computed = false;
        localDefinedVariability_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability localDefinedVariability() {
        if(localDefinedVariability_computed) {
            return localDefinedVariability_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        localDefinedVariability_value = localDefinedVariability_compute();
        if (isFinal && num == state().boundariesCrossed) {
            localDefinedVariability_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return localDefinedVariability_value;
    }
    /**
     * @apilevel internal
     */
    private FTypePrefixVariability localDefinedVariability_compute() {
            ComponentDecl cd = getComponentDecl();
            return cd.hasTypePrefixVariability() ? cd.getTypePrefixVariability().flatten() : noDefinedVariability();
        }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability noDefinedVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability noDefinedVariability_value = fContinuous();

        return noDefinedVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = variability().constantVariability();

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameter() {
        ASTNode$State state = state();
        boolean isParameter_value = variability().parameterVariability();

        return isParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscrete() {
        ASTNode$State state = state();
        boolean isDiscrete_value = variability().discreteVariability();

        return isDiscrete_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isContinuous() {
        ASTNode$State state = state();
        boolean isContinuous_value = variability().continuousVariability();

        return isContinuous_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean variability_computed = false;
    /**
     * @apilevel internal
     */
    protected FTypePrefixVariability variability_value;
    /**
     * @apilevel internal
     */
    private void variability_reset() {
        variability_computed = false;
        variability_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        if(variability_computed) {
            return variability_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        variability_value = calcVariability();
        if (isFinal && num == state().boundariesCrossed) {
            variability_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability calcVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability calcVariability_value = definedVariability().combineDown(defaultVariability());

        return calcVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability defaultVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability defaultVariability_value = fContinuous();

        return defaultVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability bExpVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability bExpVariability_value = fContinuous();

        return bExpVariability_value;
    }
    /**
     * All local modifications except those from any target class.
     * 
     * Used for extends within components.
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:295
     */
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsNoClass() {
        ASTNode$State state = state();
        try {
                ArrayList<InstModification> l = new ArrayList<InstModification>();
                if (hasInstModification() && !isGeneratedInner()) {
                    l.add(getInstModification());
                }
                l.addAll(instModificationsFromConstrainingType());
                if (myInstClass().isRedeclared()) {
                    l.addAll(myInstClass().instModificationsFromConstrainingType());
                }
                return l;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsClass() {
        ASTNode$State state = state();
        Collection<InstModification> localInstModificationsClass_value = myInstClass().classInstModifications();

        return localInstModificationsClass_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:344
     */
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsForConstraining() {
        ASTNode$State state = state();
        try {
                if (!isGeneratedInner()) {
                    if (hasInstConstrainingComponent()) {
                        if (getInstConstrainingComponent().hasInstClassModification())
                            return Collections.singletonList((InstModification) getInstConstrainingComponent().getInstClassModification());
                    } else if (hasInstModification()) {
                        return Collections.singletonList(getInstModification());
                    }
                }
                return Collections.<InstModification>emptyList();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsFromConstrainingType() {
        ASTNode$State state = state();
        java.util.List<InstModification> instModificationsFromConstrainingType_value = instModificationsForConstraining();

        return instModificationsFromConstrainingType_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstComponentDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstComponentDeclList_value;
    /**
     * @apilevel internal
     */
    private void getInstComponentDeclList_reset() {
        getInstComponentDeclList_computed = false;
        getInstComponentDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstComponentDeclList() {
        if(getInstComponentDeclList_computed) {
            return (List) getChild(getInstComponentDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstComponentDeclList_value = getInstComponentDeclList_compute();
        setChild(getInstComponentDeclList_value, getInstComponentDeclListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstComponentDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstComponentDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstComponentDeclList_compute() {
            //System.out.println( " : " + getClass().getName() + " : "+ myFSubscripts().size());
            if (isArray()) { // Take care of array declarations separately
                // Loop over indices and create new InstArrayComponentDecls
                List l = new List();
                // Only one FSubscript is used to create the one layer of InstArrayComponentDecls.
                // For a zero length or unknown length, create a dummy node with index 0.
                int n = childDimensionLength();
                for (int i = (n < 1) ? 0 : 1; i <= n || i == 0; i++)
                    l.add(createInstArrayComponentDecl(i));
                return l;
            } else { // If not array, then proceed as usual
                return super.getInstComponentDeclList();
            }
        }
    @ASTNodeAnnotation.Attribute
    public boolean shouldHaveInstExtendsList() {
        ASTNode$State state = state();
        boolean shouldHaveInstExtendsList_value = !isArrayDecl();

        return shouldHaveInstExtendsList_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnectorMember() {
        ASTNode$State state = state();
        boolean isExpandableConnectorMember_value = false;

        return isExpandableConnectorMember_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFAbstractEquationList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getFAbstractEquationList_value;
    /**
     * @apilevel internal
     */
    private void getFAbstractEquationList_reset() {
        getFAbstractEquationList_computed = false;
        getFAbstractEquationList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getFAbstractEquationList() {
        if(getFAbstractEquationList_computed) {
            return (List) getChild(getFAbstractEquationListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFAbstractEquationList_value = isArrayParent() ? new List() : buildFAbstractEquationList();
        setChild(getFAbstractEquationList_value, getFAbstractEquationListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFAbstractEquationList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getFAbstractEquationListChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArrayParent() {
        ASTNode$State state = state();
        boolean isArrayParent_value = getNumInstComponentDecl() > 0 && getInstComponentDecl(0).isArrayChild();

        return isArrayParent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArrayChild() {
        ASTNode$State state = state();
        boolean isArrayChild_value = false;

        return isArrayChild_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean nameScope() {
        ASTNode$State state = state();
        boolean nameScope_value = true;

        return nameScope_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getComponentDecl().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        ASTNode$State state = state();
        String qualifiedName_value = getFQName().name();

        return qualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String baseClassName() {
        ASTNode$State state = state();
        String baseClassName_value = myInstClass().baseClassName();

        return baseClassName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<AbstractEquation> equations() {
        ASTNode$State state = state();
        Iterable<AbstractEquation> equations_value = myInstClass().equations();

        return equations_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Algorithm> algorithms() {
        ASTNode$State state = state();
        Iterable<Algorithm> algorithms_value = myInstClass().algorithms();

        return algorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<FAlgorithm> fAlgorithms() {
        ASTNode$State state = state();
        Iterable<FAlgorithm> fAlgorithms_value = myInstClass().fAlgorithms();

        return fAlgorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = myInstClass().components();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = myInstClass().superClasses();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = myInstClass().classes();

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = myInstClass().imports();

        return imports_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Modification> elementModifications() {
        ASTNode$State state = state();
        Iterable<Modification> elementModifications_value = myInstClass().elementModifications();

        return elementModifications_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstConstraining() {
        ASTNode$State state = state();
        boolean hasInstConstraining_value = hasInstConstrainingComponent();

        return hasInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstConstraining getInstConstraining() {
        ASTNode$State state = state();
        InstConstraining getInstConstraining_value = getInstConstrainingComponent();

        return getInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReplaceable() {
        ASTNode$State state = state();
        boolean isReplaceable_value = getComponentDecl().hasReplaceable();

        return isReplaceable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentDecl() {
        ASTNode$State state = state();
        boolean isComponentDecl_value = true;

        return isComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isThisClass(InstNode node) {
        ASTNode$State state = state();
        boolean isThisClass_InstNode_value = myInstClass().isThisClass(node);

        return isThisClass_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public int myDimensionLength() {
        ASTNode$State state = state();
        int myDimensionLength_value = size().get(0);

        return myDimensionLength_value;
    }
    @ASTNodeAnnotation.Attribute
    public int childDimensionLength() {
        ASTNode$State state = state();
        int childDimensionLength_value = size().get(0);

        return childDimensionLength_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArrayDecl() {
        ASTNode$State state = state();
        boolean isArrayDecl_value = hasFArraySubscripts() && 
        		getFArraySubscripts().getNumFSubscript()>0;

        return isArrayDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFSubscripts_computed = false;
    /**
     * @apilevel internal
     */
    protected java.util.List<FSubscript> myFSubscripts_value;
    /**
     * @apilevel internal
     */
    private void myFSubscripts_reset() {
        myFSubscripts_computed = false;
        myFSubscripts_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FSubscript> myFSubscripts() {
        if(myFSubscripts_computed) {
            return myFSubscripts_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFSubscripts_value = myFSubscripts_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myFSubscripts_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFSubscripts_value;
    }
    /**
     * @apilevel internal
     */
    private java.util.List<FSubscript> myFSubscripts_compute() {
    		java.util.List<FSubscript> l = new ArrayList<FSubscript>();
    		addLocalFArraySubscriptsTo(l);
    		l.addAll(myInstClass().myFSubscripts());
    		return l;
    	}
    /**
     * @apilevel internal
     */
    protected boolean getFArraySubscripts_computed = false;
    /**
     * @apilevel internal
     */
    protected FArraySubscripts getFArraySubscripts_value;
    /**
     * @apilevel internal
     */
    private void getFArraySubscripts_reset() {
        getFArraySubscripts_computed = false;
        getFArraySubscripts_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        if(getFArraySubscripts_computed) {
            return (FArraySubscripts) getChild(getFArraySubscriptsChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFArraySubscripts_value = getFArraySubscripts_compute();
        setChild(getFArraySubscripts_value, getFArraySubscriptsChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFArraySubscripts_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FArraySubscripts node = (FArraySubscripts) this.getChild(getFArraySubscriptsChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private FArraySubscripts getFArraySubscripts_compute() {
    	    if (myFSubscripts().isEmpty())
    	        return null;
    		FArraySubscripts fas = new FArraySubscripts();
    		for (FSubscript fs : myFSubscripts()) 
    			fas.addFSubscript(fs.deferredCopy());
    		return fas;
    	}
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = getFArraySubscripts()!=null;

        return hasFArraySubscripts_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getClassAnnotationOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt<InstClassModification> getClassAnnotationOpt_value;
    /**
     * @apilevel internal
     */
    private void getClassAnnotationOpt_reset() {
        getClassAnnotationOpt_computed = false;
        getClassAnnotationOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt<InstClassModification> getClassAnnotationOpt() {
        if(getClassAnnotationOpt_computed) {
            return (Opt<InstClassModification>) getChild(getClassAnnotationOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getClassAnnotationOpt_value = new Opt<InstClassModification>();
        setChild(getClassAnnotationOpt_value, getClassAnnotationOptChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getClassAnnotationOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt<InstClassModification> node = (Opt<InstClassModification>) this.getChild(getClassAnnotationOptChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean getAnnotationOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt<InstClassModification> getAnnotationOpt_value;
    /**
     * @apilevel internal
     */
    private void getAnnotationOpt_reset() {
        getAnnotationOpt_computed = false;
        getAnnotationOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt<InstClassModification> getAnnotationOpt() {
        if(getAnnotationOpt_computed) {
            return (Opt<InstClassModification>) getChild(getAnnotationOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getAnnotationOpt_value = new Opt<InstClassModification>();
        setChild(getAnnotationOpt_value, getAnnotationOptChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getAnnotationOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt<InstClassModification> node = (Opt<InstClassModification>) this.getChild(getAnnotationOptChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignable() {
        ASTNode$State state = state();
        boolean isAssignable_value = false;

        return isAssignable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = false;

        return isRecord_value;
    }
    /**
     * @attribute syn
     * @aspect Types
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:116
     */
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingInstType() {
        ASTNode$State state = state();
        try { 
                InstComponentDecl forCmp = constrainingInstComponentDecl();
                InstNode forClass = forCmp.constrainingTypeOfMyClass();
                return (forClass != forCmp.myInstClass()) ? forClass : forCmp;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl constrainingInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl constrainingInstComponentDecl_value = hasInstConstrainingComponent() ? (InstComponentDecl) getInstConstrainingComponent().getInstNode() : this;

        return constrainingInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingTypeOfMyClass() {
        ASTNode$State state = state();
        InstNode constrainingTypeOfMyClass_value = getClassName().constrainingTypeOfClass();

        return constrainingTypeOfMyClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean connectableTo(InstComponentDecl other) {
        ASTNode$State state = state();
        boolean connectableTo_InstComponentDecl_value = other.connectableTypes(this) && typePrefixesMatch(other);

        return connectableTo_InstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean connectableSizes(InstComponentDecl other) {
        ASTNode$State state = state();
        boolean connectableSizes_InstComponentDecl_value = size().equivalent(other.size(), false);

        return connectableSizes_InstComponentDecl_value;
    }
    /**
     * Check if two components are of types that can be connected given that they have matching type prefixes.
     * @attribute syn
     * @aspect ConnectorTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:170
     */
    @ASTNodeAnnotation.Attribute
    public boolean connectableTypes(InstComponentDecl other) {
        ASTNode$State state = state();
        try {
                // TODO: in array case, we should make sure that all connected elements match, since array elements can be of different structure
                if (isArray())
                    return getInstComponentDecl(0).connectableTypes(other);
                while (other.isArray())
                    other = other.getInstComponentDecl(0);
                Map<String,InstComponentDecl> componentMap = new HashMap<String,InstComponentDecl>();
                for (InstComponentDecl oicd : other.allInstComponentDecls())
                    if (!oicd.definedVariability().constantVariability())
                        componentMap.put(oicd.name(), oicd);
                boolean expandable = isExpandableConnector();
                for (InstComponentDecl icd : allInstComponentDecls()) {
                    if (!icd.definedVariability().constantVariability()) {
                        InstComponentDecl oicd = componentMap.remove(icd.name());
                        boolean match = oicd != null && icd.connectableTo(oicd) && icd.connectableSizes(oicd);
                        if (!match && (oicd != null || !expandable))
                            return false;
                    }
                }
                return other.isExpandableConnector() || componentMap.size() == 0;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean typePrefixesMatch(InstComponentDecl other) {
        ASTNode$State state = state();
        boolean typePrefixesMatch_InstComponentDecl_value = (isDeclaredFlow() == other.isDeclaredFlow()) && (isStream() == other.isStream()) && (isParameter() == other.isParameter());

        return typePrefixesMatch_InstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getComponentDecl().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublic() {
        ASTNode$State state = state();
        boolean isPublic_value = getComponentDecl().isPublic();

        return isPublic_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isProtected() {
        ASTNode$State state = state();
        boolean isProtected_value = getComponentDecl().isProtected();

        return isProtected_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = isDeclaredInput() || inheritsInput();

        return isInput_value;
    }
    /**
     * Check if this component inherits input from the surrounding component.
     * @attribute syn
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1242
     */
    @ASTNodeAnnotation.Attribute
    public boolean inheritsInput() {
        ASTNode$State state = state();
        try {
                InstComponentDecl source = inheritsInputOutputFrom();
                return source != null && source.isDeclaredInput();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDeclaredInput() {
        ASTNode$State state = state();
        boolean isDeclaredInput_value = isComponentDeclaredInput() || myInstClass().isInput();

        return isDeclaredInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentDeclaredInput() {
        ASTNode$State state = state();
        boolean isComponentDeclaredInput_value = getComponentDecl().isInput();

        return isComponentDeclaredInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = isDeclaredOutput() || inheritsOutput();

        return isOutput_value;
    }
    /**
     * Check if this component inherits output from the surrounding component.
     * @attribute syn
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1282
     */
    @ASTNodeAnnotation.Attribute
    public boolean inheritsOutput() {
        ASTNode$State state = state();
        try {
                InstComponentDecl source = inheritsInputOutputFrom();
                return source != null && source.isDeclaredOutput();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDeclaredOutput() {
        ASTNode$State state = state();
        boolean isDeclaredOutput_value = getComponentDecl().isOutput() || myInstClass().isOutput();

        return isDeclaredOutput_value;
    }
    /**
     * Check if this component is or is part of a component that is declared input or output on the top level.
     * @attribute syn
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1319
     */
    @ASTNodeAnnotation.Attribute
    public boolean isTopLevelInputOutput() {
        ASTNode$State state = state();
        try {
                if (isTopLevel())
                    return isDeclaredInput() || isDeclaredOutput();
                InstComponentDecl source = inheritsInputOutputFrom();
                return source != null && source.isTopLevel();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFlow() {
        ASTNode$State state = state();
        boolean isFlow_value = isDeclaredFlow() || inheritsFlow();

        return isFlow_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inheritsFlow() {
        ASTNode$State state = state();
        boolean inheritsFlow_value = inheritsFlowFrom() != null;

        return inheritsFlow_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDeclaredFlow() {
        ASTNode$State state = state();
        boolean isDeclaredFlow_value = getComponentDecl().isFlow();

        return isDeclaredFlow_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStream() {
        ASTNode$State state = state();
        boolean isStream_value = getComponentDecl().isStream();

        return isStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInner() {
        ASTNode$State state = state();
        boolean isInner_value = getComponentDecl().isInner() || isGeneratedInner();

        return isInner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOuter() {
        ASTNode$State state = state();
        boolean isOuter_value = getComponentDecl().isOuter() && !isGeneratedInner();

        return isOuter_value;
    }
    /**
     * Check if this component is disabled by a conditional clause
     * @attribute syn
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1434
     */
    @ASTNodeAnnotation.Attribute
    public boolean isDisabled() {
        ASTNode$State state = state();
        try {
                try {
                    return hasConditionalAttribute() && !getConditionalAttribute().ceval().booleanValue();
                } catch (ConstantEvaluationException e) {
                    return false;
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstCallable asCallable() {
        ASTNode$State state = state();
        InstCallable asCallable_value = null;

        return asCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnumLiteral() {
        ASTNode$State state = state();
        boolean isEnumLiteral_value = false;

        return isEnumLiteral_value;
    }
    @ASTNodeAnnotation.Attribute
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = " \"" + name() + "\"";

        return extraMemoryUseInfo_value;
    }
    /**
     * Find the declared size for a component that does not have any array subscripts in the declaration. 
     * For all components except the NTA of InstComponentRedeclare, this is simply scalar.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1045
     */
    @ASTNodeAnnotation.Attribute
    public Size defaultSize() {
        ASTNode$State state = state();
        Size defaultSize_value = getParent().Define_defaultSize(this, null);

        return defaultSize_value;
    }
    /**
     * Find the declared calculated size for a component that does not have any array subscripts in the declaration. 
     * For all components except the NTA of InstComponentRedeclare, this is simply scalar.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1053
     */
    @ASTNodeAnnotation.Attribute
    public Size defaultSizeCalc() {
        ASTNode$State state = state();
        Size defaultSizeCalc_value = getParent().Define_defaultSizeCalc(this, null);

        return defaultSizeCalc_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     */
    @ASTNodeAnnotation.Attribute
    public CommonForIndex myForIndex() {
        ASTNode$State state = state();
        CommonForIndex myForIndex_value = getParent().Define_myForIndex(this, null);

        return myForIndex_value;
    }
    /**
     * Check if there is a parent record that has a binding expression.
     * @attribute inh
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2547
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasParentRecordWithBindingExp() {
        ASTNode$State state = state();
        boolean hasParentRecordWithBindingExp_value = getParent().Define_hasParentRecordWithBindingExp(this, null);

        return hasParentRecordWithBindingExp_value;
    }
    /**
     * Perform constant evaluation of a record member.
     * @attribute inh
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2565
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalParentRecord(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalParentRecord_VariableEvaluator_value = getParent().Define_cevalParentRecord(this, null, evaluator);

        return cevalParentRecord_VariableEvaluator_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2331
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecord() {
        ASTNode$State state = state();
        boolean inRecord_value = getParent().Define_inRecord(this, null);

        return inRecord_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2348
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecordConstructor() {
        ASTNode$State state = state();
        boolean inRecordConstructor_value = getParent().Define_inRecordConstructor(this, null);

        return inRecordConstructor_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:436
     */
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = getParent().Define_isForIndex(this, null);

        return isForIndex_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1598
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:421
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockBranch(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean lockBranch_ErrorCheckType_value = getParent().Define_lockBranch(this, null, checkType);

        return lockBranch_ErrorCheckType_value;
    }
    /**
     * Check if <code>icd</code> is an ancestor of this node or any ancestor is an 
     * instance of <code>icd</code>.
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1491
     */
    @ASTNodeAnnotation.Attribute
    public boolean isWithin(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isWithin_InstClassDecl_value = getParent().Define_isWithin(this, null, icd);

        return isWithin_InstClassDecl_value;
    }
    /**
     * The node containing the scope in which two components with identical names 
     * constitute a collision, even if the components are also identical.
     * @attribute inh
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:180
     */
    @ASTNodeAnnotation.Attribute
    public ASTNode nameCollisionScope() {
        ASTNode$State state = state();
        ASTNode nameCollisionScope_value = getParent().Define_nameCollisionScope(this, null);

        return nameCollisionScope_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:238
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecordWithBindingExp() {
        ASTNode$State state = state();
        boolean inRecordWithBindingExp_value = getParent().Define_inRecordWithBindingExp(this, null);

        return inRecordWithBindingExp_value;
    }
    /**
     * Find the flow variable corresponding to this stream variable.
     * 
     * Only valid for stream variables.
     * @attribute inh
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:582
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myFlowVar() {
        ASTNode$State state = state();
        InstComponentDecl myFlowVar_value = getParent().Define_myFlowVar(this, null);

        return myFlowVar_value;
    }
    /**
     * @attribute inh
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1208
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findCellUp(Index i, int j, InstComponentDecl src) {
        ASTNode$State state = state();
        InstComponentDecl findCellUp_Index_int_InstComponentDecl_value = getParent().Define_findCellUp(this, null, i, j, src);

        return findCellUp_Index_int_InstComponentDecl_value;
    }
    /**
     * Find the closest ancestor component that is an expandable connector, if any.
     * @attribute inh
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2701
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findExpandableAncestor() {
        ASTNode$State state = state();
        InstComponentDecl findExpandableAncestor_value = getParent().Define_findExpandableAncestor(this, null);

        return findExpandableAncestor_value;
    }
    /**
     * Find the ancestor component that is a direct child of the given component.
     * 
     * @param a  the ancestor to findBasePackage child of
     * @param c  the child being considered, always use <code>this</code>
     * @attribute inh
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2714
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl ancestorChild(InstComponentDecl a, InstComponentDecl c) {
        ASTNode$State state = state();
        InstComponentDecl ancestorChild_InstComponentDecl_InstComponentDecl_value = getParent().Define_ancestorChild(this, null, a, c);

        return ancestorChild_InstComponentDecl_InstComponentDecl_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:736
     */
    @ASTNodeAnnotation.Attribute
    public FQName expandedFQName() {
        ASTNode$State state = state();
        FQName expandedFQName_value = getParent().Define_expandedFQName(this, null);

        return expandedFQName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1926
     */
    @ASTNodeAnnotation.Attribute
    public int argIndexInRecordConstructor() {
        ASTNode$State state = state();
        int argIndexInRecordConstructor_value = getParent().Define_argIndexInRecordConstructor(this, null);

        return argIndexInRecordConstructor_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:33
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl surroundingOuterComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl surroundingOuterComponentDecl_value = getParent().Define_surroundingOuterComponentDecl(this, null);

        return surroundingOuterComponentDecl_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:111
     */
    @ASTNodeAnnotation.Attribute
    public boolean isGeneratedInner() {
        ASTNode$State state = state();
        boolean isGeneratedInner_value = getParent().Define_isGeneratedInner(this, null);

        return isGeneratedInner_value;
    }
    /**
     * @attribute inh
     * @aspect InstModificationType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:652
     */
    @ASTNodeAnnotation.Attribute
    public boolean inheritsFinal() {
        ASTNode$State state = state();
        boolean inheritsFinal_value = getParent().Define_inheritsFinal(this, null);

        return inheritsFinal_value;
    }
    /**
     * @attribute inh
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:105
     */
    @ASTNodeAnnotation.Attribute
    public boolean inEvalAnnotated() {
        ASTNode$State state = state();
        boolean inEvalAnnotated_value = getParent().Define_inEvalAnnotated(this, null);

        return inEvalAnnotated_value;
    }
    /**
     * @attribute inh
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:151
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability parentBExpVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability parentBExpVariability_value = getParent().Define_parentBExpVariability(this, null);

        return parentBExpVariability_value;
    }
    /**
     * The variability of the surrounding component, if any (null otherwise).
     * @attribute inh
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:196
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability parentDefaultVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability parentDefaultVariability_value = getParent().Define_parentDefaultVariability(this, null);

        return parentDefaultVariability_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:841
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl enclosingInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl enclosingInstComponentDecl_value = getParent().Define_enclosingInstComponentDecl(this, null);

        return enclosingInstComponentDecl_value;
    }
    /**
     * Find the component that this component inherits input or output from, if any.
     * @attribute inh
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1306
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl inheritsInputOutputFrom() {
        ASTNode$State state = state();
        InstComponentDecl inheritsInputOutputFrom_value = getParent().Define_inheritsInputOutputFrom(this, null);

        return inheritsInputOutputFrom_value;
    }
    /**
     * Check if this component is declared at the top level, i.e. not part of any other component.
     * @attribute inh
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1329
     */
    @ASTNodeAnnotation.Attribute
    public boolean isTopLevel() {
        ASTNode$State state = state();
        boolean isTopLevel_value = getParent().Define_isTopLevel(this, null);

        return isTopLevel_value;
    }
    /**
     * Find the component that this component inherits input or output from, if any.
     * @attribute inh
     * @aspect ComponentDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1359
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl inheritsFlowFrom() {
        ASTNode$State state = state();
        InstComponentDecl inheritsFlowFrom_value = getParent().Define_inheritsFlowFrom(this, null);

        return inheritsFlowFrom_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:632
     * @apilevel internal
     */
    public CommonVariableDecl Define_surroundingVariableDecl(ASTNode caller, ASTNode child) {
        if (caller == getFArraySubscriptsNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_surroundingVariableDecl(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        if (caller == getInstModificationOptNoTransform()) {
            return retrieveFQName();
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return getFQName().copyAndAddFas(null);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:131
     * @apilevel internal
     */
    public FQName Define_retrieveFQNameFromModification(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return retrieveFQName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1636
     * @apilevel internal
     */
    public InstNode Define_containingEntity(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:31
     * @apilevel internal
     */
    public boolean Define_inSubscriptedExp(ASTNode caller, ASTNode child) {
        if (caller == getLocalFArraySubscriptsOptNoTransform()) {
            return false;
        }
        else if (caller == getFArraySubscriptsNoTransform()) {
            return false;
        }
        else {
            return getParent().Define_inSubscriptedExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:713
     * @apilevel internal
     */
    public InstClassDecl Define_myOperatorRecord(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:421
     * @apilevel internal
     */
    public boolean Define_lockBranch(ASTNode caller, ASTNode child, ErrorCheckType checkType) {
        int childIndex = this.getIndexOfChild(caller);
        return isDisabled() || lockBranch(checkType);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:551
     * @apilevel internal
     */
    public InstComponentDecl Define_errorEnclosingComponent(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            {
                    if (isRedeclared() || getComponentDecl().hasRedeclare()) {
                        return errorEnclosingComponent();
                    } else {
                        return containingInstComponent();
                    }
                }
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:640
     * @apilevel internal
     */
    public boolean Define_inInstComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1492
     * @apilevel internal
     */
    public boolean Define_isWithin(ASTNode caller, ASTNode child, InstClassDecl icd) {
        int childIndex = this.getIndexOfChild(caller);
        return isOfInstClassDecl(icd) || isWithin(icd);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:238
     * @apilevel internal
     */
    public boolean Define_inRecordWithBindingExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        if (caller == getFArraySubscriptsNoTransform()) {
            return true;
        }
        else if (caller == getLocalFArraySubscriptsOptNoTransform()) {
            return true;
        }
        else {
            return super.Define_isInstComponentSize(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:582
     * @apilevel internal
     */
    public InstComponentDecl Define_myFlowVar(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isConnector() ? findFlowVar() : null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1208
     * @apilevel internal
     */
    public InstComponentDecl Define_findCellUp(ASTNode caller, ASTNode child, Index i, int j, InstComponentDecl src) {
        int childIndex = this.getIndexOfChild(caller);
        {
                if (j > 0) {
                    if (isArray()) {
                        return findCellUp(i, j - 1, this).getInstComponentDecl(i.get(j - 1) - 1);
                    } else {
                        return findCellUp(i, j, this).memberInstComponent(src.name()).target();
                    }
                }
                return src;
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2701
     * @apilevel internal
     */
    public InstComponentDecl Define_findExpandableAncestor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return (isExpandableConnector() && !isArray()) ? this : findExpandableAncestor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2714
     * @apilevel internal
     */
    public InstComponentDecl Define_ancestorChild(ASTNode caller, ASTNode child, InstComponentDecl a, InstComponentDecl c) {
        int childIndex = this.getIndexOfChild(caller);
        return (this == a) ? c : ancestorChild(a, this);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:736
     * @apilevel internal
     */
    public FQName Define_expandedFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return expandedFQName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1576
     * @apilevel internal
     */
    public InstValueModification Define_parentInstValueMod(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myInstValueMod();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:21
     * @apilevel internal
     */
    public boolean Define_inOuter(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inOrIsOuter();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:27
     * @apilevel internal
     */
    public boolean Define_inInner(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inOrIsInner();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:33
     * @apilevel internal
     */
    public InstComponentDecl Define_surroundingOuterComponentDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isOuter() ? this : surroundingOuterComponentDecl();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:146
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInInnerInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return myInnerInstComponentDecl().memberInstClass(name).targetOrNull();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return superLookupInstClassInComponent(name);
        }
        else {
            return super.Define_lookupInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:63
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromMod(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else {
            return super.Define_lookupInstClassFromMod(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:149
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return myInstClass().lookupRedeclareExtendsInstClassFromComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:608
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassInInstElement(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstModificationOptNoTransform()) {
            return memberInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClassInInstElement(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getLocalFArraySubscriptsOptNoTransform()) {
            return lookupInstComponent(name);
        }
        else if (caller == getFArraySubscriptsNoTransform()) {
            return lookupInstComponent(name);
        }
        else if (caller == getConditionalAttributeOptNoTransform()) {
            return lookupInstComponent(name);
        }
        else if (caller == getInstConstrainingComponentOptNoTransform()) {
            return lookupInstComponent(name);
        }
        else if (caller == getInstModificationOptNoTransform()) {
            return lookupInstComponent(name);
        }
        else {
            return super.Define_lookupInstComponent(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:431
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_localLookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return memberInstComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:732
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInInstElement(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstModificationOptNoTransform()) {
            return memberInstComponent(name).unresolved();
        }
        else {
            return super.Define_lookupInstComponentInInstElement(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getConditionalAttributeOptNoTransform()) {
            return Kind.AMBIGUOUS_ACCESS;
        }
        else if (caller == getClassNameNoTransform()) {
            return Kind.CLASS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:238
     * @apilevel internal
     */
    public Size Define_expectedSizeFromParent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return size();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:337
     * @apilevel internal
     */
    public InstNode Define_findInheritingNode(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else {
            return getParent().Define_findInheritingNode(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:651
     * @apilevel internal
     */
    public boolean Define_inheritsFinal(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getComponentDecl().hasFinal() || inheritsFinal();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:37
     * @apilevel internal
     */
    public FTypePrefixVariability Define_overrideVariability(ASTNode caller, ASTNode child, FTypePrefixVariability var, FTypePrefixVariability bexpVar) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return var.combineDown(definedVariability());
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return var.combineDown(definedVariability());
        }
        else {
            return super.Define_overrideVariability(caller, child, var, bexpVar);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:105
     * @apilevel internal
     */
    public boolean Define_inEvalAnnotated(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:152
     * @apilevel internal
     */
    public FTypePrefixVariability Define_parentBExpVariability(ASTNode caller, ASTNode child) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return bExpVariability();
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return bExpVariability();
        }
        else {
            return super.Define_parentBExpVariability(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:196
     * @apilevel internal
     */
    public FTypePrefixVariability Define_parentDefaultVariability(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return variability();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:468
     * @apilevel internal
     */
    public Environment Define_myEnvironmentNoClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return filteredEnvironment().mergeInnerClone(getElementInstModifications(), localInstModificationsNoClass());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:469
     * @apilevel internal
     */
    public Environment Define_myEnvironmentClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new Environment(localInstModificationsClass());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1862
     * @apilevel internal
     */
    public String Define_instClassNamePrefix(ASTNode caller, ASTNode child, boolean sup) {
        int childIndex = this.getIndexOfChild(caller);
        return buildQualifiedName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2059
     * @apilevel internal
     */
    public boolean Define_isInComponentDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2146
     * @apilevel internal
     */
    public InstComponentDecl Define_containingInstComponent(ASTNode caller, ASTNode child) {
        if (caller == getFArraySubscriptsNoTransform()) {
            return containingInstComponent();
        }
        else if (caller == getLocalFArraySubscriptsOptNoTransform()) {
            return containingInstComponent();
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return this;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2441
     * @apilevel internal
     */
    public int Define_dimensionLength(ASTNode caller, ASTNode child, int i) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return size().get(i);
        }
        else {
            return getParent().Define_dimensionLength(this, caller, i);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2463
     * @apilevel internal
     */
    public Index Define_parentIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new Index(new int[ndims()]);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2472
     * @apilevel internal
     */
    public InstComponentDecl Define_instComponentDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2600
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        if (caller == getInstModificationOptNoTransform()) {
            return buildInstanceName(surroundingInstClass(), getFQNamePrefix());
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return buildInstanceName(surroundingInstClass(), getFQName());
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:835
     * @apilevel internal
     */
    public InstClassDecl Define_enclosingInstClassDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myInstClass();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:842
     * @apilevel internal
     */
    public InstComponentDecl Define_enclosingInstComponentDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1131
     * @apilevel internal
     */
    public boolean Define_inProtectedComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isProtected() || inProtectedComponent();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1306
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsInputOutputFrom(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                return (isDeclaredInput() || isDeclaredOutput()) ? this : inheritsInputOutputFrom();
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1329
     * @apilevel internal
     */
    public boolean Define_isTopLevel(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1359
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsFlowFrom(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isDeclaredFlow() ? this : inheritsFlowFrom();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1458
     * @apilevel internal
     */
    public boolean Define_inDisabledComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isDisabled() || inDisabledComponent();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
