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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:108
 * @production InstAssignable : {@link InstComponentDecl} ::= <span class="component">BindingFExp:{@link FExp}</span>;

 */
public abstract class InstAssignable extends InstComponentDecl implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3421
     */
    public void prepareForFunctionEval() {
	  super.prepareForFunctionEval();
	  if (hasBindingFExp())
		  myBindingInstExp().prepareForFunctionEval();
	  size();
  }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3665
     */
    protected CValue cevalFunctionBindingExp(VariableEvaluator evaluator) {
        return hasBindingFExp() ? myBindingInstExp().ceval(evaluator) : type().zeroCValue();
    }
    /**
     * Set to a class to make all children behave as if this was declared in that function.
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1591
     */
    private InstClassDecl temporarilyInFunction = null;
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:234
     */
    public void contentCheck(ErrorCheckType checkType) {
        super.contentCheck(checkType);
        if (isDeclaredInput() || isDeclaredOutput()) {
            InstComponentDecl inherit = inheritsInputOutputFrom();
            if (inherit != null)
                inherit.error("Can't declare %s as %s, since it contains a component declared as input or output", 
                        name(), (isDeclaredInput() ? "input" : "output"));
        }
        if (isDeclaredFlow()) {
            InstComponentDecl inherit = inheritsFlowFrom();
            if (inherit != null)
                inherit.error("Can't declare %s as flow, since it contains a component declared as flow", name());
        }
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:723
     */
    private FTypePrefixVariability forcedVariability = fContinuous();
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:779
     */
    public void forceVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        if (forcedVariability.lessOrEqual(v)) {
            return;
        }
        FTypePrefixVariability currentVariability = variability().combine();
        if (!currentVariability.parameterVariability() || inFunction() || isForIndex())
            return;
        // TODO: hierarchical check for records?
        if (indices().numElements() > 0 && currentVariability.initialParameterVariability()) {
            compliance("Parameters with fixed=false can not be used as structural parameters");
            return;
        }
        forcedVariability = forcedVariability.combineDown(v);
        // Flush cache for variability()
        setVariabilityNotCalculated();
        if (hasBindingFExp()) {
            if (v.structParameterVariability()) {
                getBindingFExp().checkConstantExpression(checkType, forcedVariability.toStringLiteral(), qualifiedName());
            }
            getBindingFExp().forceUsesVariability(checkType, v);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:911
     */
    public void collectErrors(ErrorCheckType checkType) {
        //log.debug(toString());
        if (!errorChecked) {
            super.collectErrors(checkType);
            errorChecked = true;

            // Check binding expression
            FExp bexp = myBindingInstExp();
            if (bexp != null) {
                String type = isParameter() ? "parameter" : "constant";
                // TODO: Check structural parameters as well
                if (myInstValueMod().collectErrorsInBindingExp()) {
                    bexp.collectErrors(checkType);
                }
                // Check if the binding expression of constants can be evaluated
                if (isConstant() && !bexp.type().isUnknown()) 
                    bexp.checkConstantExpression(checkType, "constant", qualifiedName());
                else if (isParameter() && bexp.isCircular())
                    bexp.error("Circularity in binding expression of parameter: %s = %s", 
                            qualifiedName(), bexp);
            } else {
                // Warn if constant or parameter does not have a binding expression (start is used)
                if (variability().fixedParameterOrLess() && !isForIndex() && !isRecord() && 
                        !hasParentRecordWithBindingExp() && !inFunction()) {
                    if (isParameter()) {
                        PARAMETER_MISSING_BINDING_EXPRESSION.invoke(this, qualifiedName());
                    } else {
                        CONSTANT_MISSING_BINDING_EXPRESSION.invoke(this, qualifiedName());
                    }
                }
            }
            
            FTypePrefixVariability v = variability().combine();
            // Mark parameters with Evaluate=true as structural
            if (v.parameterVariability() && isEvalAnnotated()) {
                if (v.fixedParameterOrLess()) {
                    forceVariability(checkType, fEvalParameter());
                } else {
                    warning("Evaluate annotation is ignored for parameters with fixed=false");
                }
            }
            
            // Check array indices
            getClassName().collectErrors(checkType);
            getLocalFArraySubscriptsOpt().collectErrors(checkType);
            
            // Check attributes for primitive variables
            checkAttributes(checkType);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:962
     */
    public void checkAttributes(ErrorCheckType checkType) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:180
     */
    public void typeCheck(ErrorCheckType checkType) {
        FExp bexp = myBindingInstExp();
        boolean function = inFunction();
        boolean record = inRecordDecl();
        boolean output = isOutput();
        boolean incompleteAllowed = (function && !output) || record;
        boolean unknownAllowed = function || record;
        Size componentSize = size();
        if (!componentSize.isComplete() && !incompleteAllowed && !checkType.allowIncompleteSizes()) {
            if (function && output) {
                CANNOT_INFER_ARRAY_SIZE_OF_FUNCTION_OUTPUT.invoke(surroundingInstClass(), qualifiedName());
            } else {
                CANNOT_INFER_ARRAY_SIZE_OF_VARIABLE.invoke(this, name());
            }
        }
        if (bexp != null && !inRecordWithBindingExp() && !bexp.type().isUnknown()) {
            InstValueModification ivm = myInstValueMod();
            FType expectedBT = bindingType();
            FType actualBT = bexp.type();
            if (!expectedBT.typeCompatible(actualBT, unknownAllowed) && !expectedBT.isUnknown()) {
                InstModification needsEach = ivm.findModificationLackingEach(actualBT.size());
                if (needsEach != null) {
                    ASSUMING_EACH.invoke(needsEach, needsEach);
                } else if (!expectedBT.scalarType().typeCompatible(actualBT.scalarType())) {
                    BINDING_EXPRESSION_TYPE_MISMATCH.invoke(bexp, name());
                } else {
                    ErrorProducerUnlessDisabled reporter;
                    if (ivm.myInstNode() == this) {
                        reporter = ARRAY_SIZE_MISMATCH_IN_DECLARATION;
                    } else if (ivm.hasEach()) {
                        reporter = ARRAY_SIZE_MISMATCH_IN_MODIFICATION_DUE_TO_EACH;
                    } else {
                        reporter = ARRAY_SIZE_MISMATCH_IN_MODIFICATION;
                    }
                    reporter.invokeWithCondition(bexp, expectedBT.ndims() == actualBT.ndims(), name(), expectedBT.size(), actualBT.size());
                }
            }
        }
        
        if (hasConditionalAttribute()) {
            FExp cond = getConditionalAttribute();
            if (!cond.type().isUnknown()) {
                if (!cond.type().isScalar()) 
                    NON_SCALAR_CONDITIONAL_GUARD.invoke(this);
                if (!cond.type().isBoolean()) 
                    NON_BOOLEAN_CONDITIONAL_GUARD.invoke(this);
                if (!cond.variability().parameterOrLess()) {
                    NON_FIXED_CONDITIONAL_GUARD.invoke(this);
                } else {
                    cond.markAsStructuralParameter(checkType);
                }
            }
        }
        
        typeCheckAttributes();
        super.typeCheck(checkType);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:245
     */
    public void typeCheckAttributes() {}
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1263
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
        if (useInFlattening() && hasBindingFExp())
            getBindingFExp().buildConnectionSets(prefix, csm, connect);
        if (isOperatorRecord())
            buildConnectionSetsAsPrimitive(prefix, csm, connect);
        else
            super.buildConnectionSets(prefix, csm, connect);
    }
    /**
     * Name of equality constraint function.
     * @aspect OverconstrainedConnections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1412
     */
    public static final String EQUALITY_CONSTRAINT_NAME = "equalityConstraint";
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:632
     */
    public void addExternalArg(List<FExp> args) {
        FIdUseExp use = new FIdUseExp(new FIdUseInstAccess(new InstComponentAccess(name())));
        args.add(use);
        for (int i = 0; i < ndims(); i++) {
            args.add(new FSizeExp(use.treeCopy(), new Opt(new FIntegerLitExp(i + 1))));
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:671
     */
    @Override
    public void flattenInFunction(
            FFunctionDecl ffd, FClass fc, boolean useConstant, InstClassDecl func) {
        if (useConstant || !flattenAsFunctionConstant()) {
            InstClassDecl old = temporarilyInFunction;
            temporarilyInFunction = func;
            if (hasInstValueMod())
                getBindingFExp().flattenUsedFuncsAndEnums(fc);
            Opt eo = new Opt();
            FQName fqn = createFQNameForFuncVar(func);
            fqn.removeFArraySubscripts();
            FFunctionVariable ffv = createFFunctionVariable(eo, fqn);
            if (isInput())
                ffv.setFTypePrefixInputOutput(new FInput());
            if (isOutput())
                ffv.setFTypePrefixInputOutput(new FOutput());
            ffd.addFFunctionVariable(ffv);
            if (!isInput()) {
                List<FStatement> stmts = ffd.getFAlgorithm().getFStatements();
                addFInitArrayStmt(stmts);
                addBindingAssignments(stmts);
            }
            myInstClass().flattenRecord(fc);
            temporarilyInFunction = old;
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:702
     */
    public void addFInitArrayStmt(List<FStatement> l) {
        if (isArray()) {
            FInitArrayStmt stmt = new FInitArrayStmt(new FIdUseExp(expandedFQNameCalc()));
            stmt.shouldBeSorted = true;
            l.add(stmt);
        } else {
            super.addFInitArrayStmt(l);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:718
     */
    public void addBindingAssignments(List<FStatement> l) {
        if (hasBindingFExp()) {
            FStatement stmt = new FAssignStmt(new FIdUseExp(expandedFQNameCalc()), getBindingFExp().flatten(new FQNameEmpty()));
            stmt.shouldBeSorted = true;
            l.add(stmt);
        } else {
            super.addBindingAssignments(l);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:791
     */
    public FQName createFQNameForFuncUse(InstClassDecl func) {
        return createFQNameForFuncVar(func).asFQNameFull().addFArraySubscripts(null);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:795
     */
    public FFunctionVariable createFFunctionVariable(Opt eo, FQName fqn) {
        // TODO: if we need separate variable class for records, override this
        FType type = type().flatten(new FQNameEmpty(), this, !isInput());
        FFunctionVariable ffv;
        if (isArray())
            ffv = new FFunctionArray(new Opt(), type, eo, fqn);
        else
            ffv = new FFunctionVariable(new Opt(), type, eo, fqn);
        return ffv;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:977
     */
    public void flattenInRecord(FRecordDecl frd, FClass fc, Set<String> names) {
        if (names.add(name())) {
            FVariable fv = createFVariable(getFQName().copyLastSuffix(), true);
            fv.modifiableInRecord = isModifiable();
            frd.addFVariableNoTransform(fv);
            flattenMyType(fc);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1007
     */
    public void flatten(FClass fc, FQName name, boolean excludeBinding, int level) {
        if (useInFlattening()) {
            HashMap<InstNode,Integer> oldLevels = setModificationLevel(level);
            fc.addFVariableNoTransform(createFVariable(name, excludeBinding));
            flattenMyType(fc);
            clearModificationLevel(oldLevels);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1016
     */
    public abstract void flattenMyType(FClass fc);
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1116
     */
    public abstract FVariable createEmptyFVariable();
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1179
     */
    @Override
    public void addAttributesToFV(List<FAttribute> attr, Stack<Integer> indexStack,
            boolean excludeBinding, boolean isBound) {
        if (!variability().knownParameterOrLess()) {
            AttributeExpRetriever mut = new AttributeExpRetriever() {
                public FExp retrieve(InstValueModification im, boolean isEach) {
                    FExp exp = super.retrieve(im, isEach);
                    InstNode decl = im.myInstNode();
                    InstNode ancestor = InstAssignable.this.matchingAncestor(decl);
                    return (isEach || decl == InstAssignable.this || !exp.isArray()) ? 
                            exp : exp.dynamicFExp(splitBindingFExp(exp, ancestor));
                }
            };
            addAttributes(attr, totalMergedEnvironment(), mut, false);
        }
        super.addAttributesToFV(attr, indexStack, excludeBinding, isBound);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1202
     */
    @Override
    public void generateAdditionalAttributes(List<FAttribute> attr, Stack<Integer> indexStack,
            boolean excludeBinding, boolean isBound) {
        FAttribute a = findMatching(attr, name());
        boolean create = (a == null);
        boolean canBind = hasBindingFExp() || variability().knownParameterOrLess();
        isBound = isBound || (a != null && a.hasValue());
        List<FAttribute> list = create ? new List<FAttribute>() : a.getFAttributes();
        if (!excludeBinding && declaredSizeCalc().isUnknownNoEval()) {
            FInternalAttribute ia = (FInternalAttribute)findMatching(list, "size()");
            if (ia == null) {
                ia = new FInternalAttribute(FAttribute.SIZE, new FArray(new List<FExp>()));
                list.add(ia);
            }
            ia.setValue(size().createFExp().addInDim(indexStack, 0, (FArray)ia.getValue()));
        }
        if (!excludeBinding) {
            HashMap<InstNode,Integer> m = setModificationLevel(FUNC_AND_REC_MOD_LEVEL+1);
            addAttributesToFV(list, indexStack, excludeBinding, isBound || canBind);
            clearModificationLevel(m);
        }
        if (create && (list.getNumChild() > 0 || (!isBound && canBind))) {
            a = new FAttribute(new FIdUse(getClassName().flatten(new FQNameEmpty())), 
                    new FIdDecl(new FQNameString(name())), 
                    new Opt(), true, 0, new Opt(), new Opt(), list);
            attr.add(a);
        }
        
        if (!isBound && canBind) {
            a.setValue(flattenBindingFExp());
            if (indexStack.size() > 0) {
                a.setFEach(new FEach());
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1272
     */
    public FVariable createFVariable() {
        return createFVariable(getFQName(), false);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1276
     */
    public FVariable createFVariable(FQName name, boolean excludeBinding) {
        FVariable fv = createEmptyFVariable();
        
        fv.setFVisibilityType(isPublicVar() ? new FPublicVisibilityType() : new FProtectedVisibilityType());
        
        fv.setFTypePrefixVariability(variability().fullCopy());
        
        // Only set input/output prefix for top level inputs and outputs
        if (isTopLevelInputOutput()) 
            fv.setFTypePrefixInputOutput(isInput() ? new FInput() : new FOutput());

        if (myInstClass().extendsPrimitive())
            fv.setDerivedType(myInstClass().actualInstClass().qualifiedName());

        addAttributesToFV(fv.getFAttributes(), new Stack<Integer>(), excludeBinding,
                excludeBinding || hasBindingFExp() || variability().knownParameterOrLess());
        if (!excludeBinding) {
            FExp e = flattenBindingFExp();
            if (e != null)
                fv.setBindingExp(e);
        }

        if (getComponentDecl().getComment().hasStringComment())
            fv.setFStringComment(new FStringComment(getComponentDecl().getComment().getStringComment().getComment()));

        fv.setFQName(name);

        contribute(fv);

        return fv;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1345
     */
    public FExp flattenBindingFExp() {
        try {
            if (variability().knownParameterOrLess()) {
                return ceval().buildLiteral();
            }
        } catch (ConstantEvaluationException e) {
            
        }
        if (hasInstValueMod()) {
            InstValueModification im = myInstValueMod();
            return getBindingFExp().flatten(im.myInstNode().getFQNamePrefix());
        }
        return null;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1966
     */
    public FExp flattenAccess(FQName prefix, FIdUseExp iae) {
        // If the FInstAccess refers to a constant or string parameter, then inline expression
        // Checks in the instance tree ensures that constants always
        // have binding expressions, however, array subscripts may need to be 
        // flattened during error checks, when using qualifiedName()
        InstAccess ia = iae.asInstAccess();
        if (variability().indexParameterOrLess()) {
            try {
                if (!size().isEmpty() && iae.canInlineConstant()) {
                    // Check if we have non-constant array subscripts
                    if (ia.hasUnknownIndices()) {
                        // If this is a package constant, then the variable will not be available in the flattened model 
                        if (!ia.inFunction() && variability().constantVariability()) {
                            // Inline entire array wrapped in an FSubscriptedExp, and resolve index later
                            FExp exp = getBindingFExp().getArray().buildLiteral(isReal());
                            FArraySubscripts fas = ia.getFArraySubscripts().flatten(prefix);
                            return new FSubscriptedExp(exp, fas);
                        }
                    } else {
                        // Inline value
                        CValue cval = iae.ceval();
                        if (isReal())
                            cval = cval.convertReal();
                        return cval.buildLiteral();
                    }
                }
            } catch (ConstantEvaluationException e) {
                // In this case, simply don't inline value if we aren't in a function
                // TODO: Really? isn't this an error?
            }
            if (ia.inFunction() && flattenAsFunctionConstant())
                return ia.topInstAssignable().flattenAccessToConstInFunction(prefix, ia);
        }
        return super.flattenAccess(prefix, iae);
    }
    /**
     * Flatten an access to this constant in a function.
     * 
     * Used when the access can't be constant evaluated. The constant is added to the function.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2033
     */
    public FExp flattenAccessToConstInFunction(FQName prefix, InstAccess ia) {
        ia.functionConstantList().add(this);
        FQName name = getFQName();
        FQName use = ia.flattenAssignablePart(prefix);
        if (name.numParts() > 1 || ia.localLookupInstComponent(name.name()).foundOther(this)) {
            // TODO: this should probably be a helper function on FQName
            FQNameFull fullUse = use.asFQNameFull();
            fullUse.getFQNamePart(0).setName(ia.findTempVarName(this));
            use = fullUse;
        }
        return new FIdUseExp(use);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2679
     */
    public FExp flattenInRecordConstructor(FQName prefix) {
        if (hasBindingFExp()) {
            return flattenBindingFExp();
        } else {
            return cevalNoBExp(defaultVariableEvaluator(), Index.NULL).buildLiteral();
        }
    }
    /**
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3369
     */
    
        public <N extends FVariable> N contribute(N variable) {
            for (AttributeContributer contributer : attributeContributers())
                contributer.contribute(this, variable);
            return variable;
        }
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:183
     */
    public InstFunctionArgument createInstDefaultArgument() {
		InstFunctionArgument arg = null;
		if (hasBindingFExp()) {
            arg = new InstDefaultArgument(myBindingInstExp());
        } else if (!isModifiable() && surroundingInstClass().isRecord()) {
            arg = new InstPositionalArgument(cevalNoBExp(ASTNode.defaultVariableEvaluator(), Index.NULL).buildLiteral(), -1);
        } else {
			arg = new InstMissingArgument();
		}
		arg.setBoundInput(this);
		return arg;
	}
    /**
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:135
     */
    private boolean circularVariability = false;
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2632
     */
    public void dumpTree(String indent) {
		System.out.println(indent + dump()
							  + ": " + 
		                      myInstClass().name() + " "+
		                      getComponentDecl().name());
	    getClassName().dumpTree(indent + "|");
		System.out.println(toString(indent+"|"));

		for (InstNode n : getInstClassDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstComponentDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstExtendss())
			n.dumpTree(indent + " ");


	}
    /**
     * @declaredat ASTNode:1
     */
    public InstAssignable() {
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
        children = new ASTNode[17];
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
    public InstAssignable(InstAccess p0, Opt<FArraySubscripts> p1, ComponentDecl p2, Opt<InstModification> p3, Opt<InstConstrainingComponent> p4, Opt<FExp> p5) {
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
        equalityConstraint_reset();
        getBindingFExp_reset();
        myInstValueMod_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:66
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public InstAssignable clone() throws CloneNotSupportedException {
        InstAssignable node = (InstAssignable) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:83
     */
    public abstract InstAssignable fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public abstract InstAssignable treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:98
     */
    public abstract InstAssignable treeCopy();
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
    /**
     * Retrieves the BindingFExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the BindingFExp child.
     * @apilevel low-level
     */
    public FExp getBindingFExpNoTransform() {
        return (FExp) getChildNoTransform(16);
    }
    /**
     * Retrieves the child position of the optional child BindingFExp.
     * @return The the child position of the optional child BindingFExp.
     * @apilevel low-level
     */
    protected int getBindingFExpChildPosition() {
        return 16;
    }
    /**
     * @attribute syn
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:37
     */
    @ASTNodeAnnotation.Attribute
    public abstract FType type();
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
        size_value = size_compute();
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
    private Size size_compute() {
            Size s = super.size();
            if (s.isUnknown() && hasBindingFExp() && 
                    (!inRecordDecl() || !isModifiable()) && 
                    (!isInput() || !inFunction()) &&
                    !getBindingFExp().isCircular()) {
                s = s.createKnown(getBindingFExp());
            }
            return s;
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
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = ceval(evaluator, Index.NULL);

        return ceval_VariableEvaluator_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2690
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                CValue val = CValue.UNKNOWN;
                if (hasEvaluationValue(evaluator)) {
                    val = evaluationValue(evaluator);
                } else if ((variability().fixedParameterOrLess() || (inFunction() && !isInput())) && !isForIndex()) {
                    boolean func = inFunction();
                    i = func ? i : Index.NULL;
                    if (hasBindingFExp()) {
                        FExp bexp = getBindingFExp();
                        if (!bexp.type().isUnknown())
                            val = bexp.ceval(evaluator, i);
                    } else if (!func && !inRecordDecl()) {
                        val = cevalNoBExp(evaluator, i);
                    }
                    if (!func) {
                        setEvaluationValue(evaluator, val);
                    }
                }
                return val;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2757
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalNoBExp(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                CValue val = startAttributeCValue(evaluator);
                if (i != Index.NULL) 
                    val = val.array().getCell(i);
                if (isInteger() || isReal() || isEnum()) {
                    try {
                        CValue min = minAttributeCValue(evaluator);
                        if (i != Index.NULL) 
                            min = min.array().getCell(i);
                        CValue max = maxAttributeCValue(evaluator);
                        if (i != Index.NULL) 
                            max = max.array().getCell(i);
                        val =  val.constrainWithin(min, max);
                    } catch (ConstantEvaluationException e) {}
                }
                return val;
            }
        finally {
        }
    }
    /**
     * Find and evaluate the attribute <code>name</code>. If it is not found, use default value.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2867
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueGeneric(VariableEvaluator evaluator, String name) {
        ASTNode$State state = state();
        try {
                
                CValue val = attributeCValueSet(evaluator, name);
                if (val != null) {
                    return val;
                }
                
                CValue res = attributeCValueDefault(name);
                if (isArray()) {
                    res = arrayCValue(res);
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2882
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueSet(VariableEvaluator evaluator, String name) {
        ASTNode$State state = state();
        try {
                for (InstModification im : totalMergedEnvironment()) {
                    FExp exp = im.findAttribute(name);
                    if (exp != null) {
                        CValue val = exp.ceval(evaluator);
                        if (im.hasEach()) {
                            val = arrayCValue(val);
                        }
                        return val;
                    }
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2896
     */
    @ASTNodeAnnotation.Attribute
    public CValueArray arrayCValue(CValue val) {
        ASTNode$State state = state();
        try {
                CValueArray array = new CValueArray(size());
                for (Index i : indices()) {
                    array.setCell(i, val);
                }
                return array;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean equalityConstraint_computed = false;
    /**
     * @apilevel internal
     */
    protected InstClassDecl equalityConstraint_value;
    /**
     * @apilevel internal
     */
    private void equalityConstraint_reset() {
        equalityConstraint_computed = false;
        equalityConstraint_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl equalityConstraint() {
        if(equalityConstraint_computed) {
            return equalityConstraint_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        equalityConstraint_value = equalityConstraint_compute();
        if (isFinal && num == state().boundariesCrossed) {
            equalityConstraint_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return equalityConstraint_value;
    }
    /**
     * @apilevel internal
     */
    private InstClassDecl equalityConstraint_compute() {
            InstLookupResult<InstClassDecl> res = memberInstClass(EQUALITY_CONSTRAINT_NAME);
            if (!res.successful())
                res = myInstClass().memberInstClass(EQUALITY_CONSTRAINT_NAME);
            if (res.successful()) {
                InstClassDecl icd = res.target().actualInstClass();
                if (icd.isEqualityConstraint(type()))
                    return icd;
            }
            return null;
        }
    @ASTNodeAnnotation.Attribute
    public boolean canBeExternalReturn(FExternalLanguage lang) {
        ASTNode$State state = state();
        boolean canBeExternalReturn_FExternalLanguage_value = !isArray() && lang.canBeReturn(type());

        return canBeExternalReturn_FExternalLanguage_value;
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:728
     */
    @ASTNodeAnnotation.Attribute
    public FQName expandedFQNameCalc() {
        ASTNode$State state = state();
        try {
                if (temporarilyInFunction != null) {
                    return createFQNameForFuncUse(temporarilyInFunction);
                } else {
                    return expandedFQName().append(name());
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp myBindingInstExp() {
        ASTNode$State state = state();
        FExp myBindingInstExp_value = hasInstValueMod() ? myInstValueMod().getFExp() : null;

        return myBindingInstExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasBindingFExp() {
        ASTNode$State state = state();
        boolean hasBindingFExp_value = myBindingInstExp() != null;

        return hasBindingFExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getBindingFExp_computed = false;
    /**
     * @apilevel internal
     */
    protected FExp getBindingFExp_value;
    /**
     * @apilevel internal
     */
    private void getBindingFExp_reset() {
        getBindingFExp_computed = false;
        getBindingFExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getBindingFExp() {
        if(getBindingFExp_computed) {
            return (FExp) getChild(getBindingFExpChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getBindingFExp_value = getBindingFExp_compute();
        setChild(getBindingFExp_value, getBindingFExpChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getBindingFExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FExp node = (FExp) this.getChild(getBindingFExpChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private FExp getBindingFExp_compute() {
            //log.debug("In file: " + fileName() + " at line: " + beginLine() + ": " + prettyPrint(""));
            if (hasInstValueMod()) {
                InstValueModification im = myInstValueMod();
                FExp fe = im.getFExp();
                boolean hasEach = im.hasEach() || 
                    (!declaredSize().isUnknown() && type().typeCompatible(fe.type()));  // Assume each if types match
                InstNode decl = im.myInstNode();
                if (!hasEach && decl != this) {
                    decl = matchingAncestor(decl);
                    fe = splitBindingFExp(fe, decl);
                }
                return fe.unboundCopy();
            }
            return null;
        }
    @ASTNodeAnnotation.Attribute
    public boolean hasBindingExp() {
        ASTNode$State state = state();
        boolean hasBindingExp_value = hasInstValueMod();

        return hasBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInstValueMod_computed = false;
    /**
     * @apilevel internal
     */
    protected InstValueModification myInstValueMod_value;
    /**
     * @apilevel internal
     */
    private void myInstValueMod_reset() {
        myInstValueMod_computed = false;
        myInstValueMod_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstValueModification myInstValueMod() {
        if(myInstValueMod_computed) {
            return myInstValueMod_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInstValueMod_value = myInstValueMod_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myInstValueMod_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInstValueMod_value;
    }
    /**
     * @apilevel internal
     */
    private InstValueModification myInstValueMod_compute() {
            if (inRecord()) {
                InstValueModification ivm = parentInstValueMod();
                if (ivm != null)
                    return ivm.matchInstRecordModification(name());
            }
            for (InstModification im : totalMergedEnvironment()) 
                if (im.hasInstValueMod()) 
                    return im.getInstValueMod();
            return null;
        }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstValueModTop() {
        ASTNode$State state = state();
        boolean hasInstValueModTop_value = myInstValueModTop() != null;

        return hasInstValueModTop_value;
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1588
     */
    @ASTNodeAnnotation.Attribute
    public InstValueModification myInstValueModTop() {
        ASTNode$State state = state();
        try {
                InstValueModification top = inheritedInstValueModTop();
                if (top == null)
                    top = myInstValueMod();
                return top;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean flattenAsFunctionConstant() {
        ASTNode$State state = state();
        boolean flattenAsFunctionConstant_value = !isInput() && !isOutput() && variability().knownParameterOrLess();

        return flattenAsFunctionConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType bindingType() {
        ASTNode$State state = state();
        FType bindingType_value = type().sizedType(myInstValueMod().expectedSize());

        return bindingType_value;
    }
    /**
     * @attribute syn
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:62
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability calcVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability v =  super.calcVariability();
                if (v.parameterVariability()) {
                    
                    if (isSetAsInitial()) {
                        v = fInitialParameter();
                    } else if (!isRecord() && isEvalAnnotated()) {
                        v = fEvalParameter();
                    } else if (isFinalIndependent()) {
                        v = fFinalParameter();
                    }
                    
                    v = v.combineDown(forcedVariability);
                    v = bExpVariability().combinePropagate(v);
                }
                return v;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:100
     */
    @ASTNodeAnnotation.Attribute
    public boolean isFinalIndependent() {
        ASTNode$State state = state();
        try {
                InstValueModification mod = myInstValueMod();
                return mod != null && mod.isFinal() && mod.getFExp().isIndependentParameterExp();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEvalAnnotated() {
        ASTNode$State state = state();
        boolean isEvalAnnotated_value = annotation().forPath("Evaluate").bool() || inEvalAnnotated();

        return isEvalAnnotated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSetAsInitial() {
        ASTNode$State state = state();
        boolean isSetAsInitial_value = isPrimitive() && 
                    attributeCValueSet(defaultVariableEvaluator(), FAttribute.FIXED) != null && 
                    !fixedAttributeCValue().reduceBooleanAnd();

        return isSetAsInitial_value;
    }
    /**
     * @attribute syn
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:137
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability bExpVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability v = super.bExpVariability();
                if (!circularVariability) {
                    InstValueModification ivm = myInstValueMod();
                    if (ivm != null && !ivm.getFExp().type().isUnknown()) {
                        circularVariability = true;
                        v = ivm.getFExp().variability();
                        circularVariability = false;
                    }
                }
                return v;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignable() {
        ASTNode$State state = state();
        boolean isAssignable_value = true;

        return isAssignable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublicVar() {
        ASTNode$State state = state();
        boolean isPublicVar_value = isPublic() && !inProtectedComponent();

        return isPublicVar_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:756
     */
    @ASTNodeAnnotation.Attribute
    public Set<InstAssignable> functionConstantList() {
        ASTNode$State state = state();
        Set<InstAssignable> functionConstantList_value = getParent().Define_functionConstantList(this, null);

        return functionConstantList_value;
    }
    /**
     * Retrieve the InstModification setting the binding expression of 
     * the parent component. 
     * 
     * If the parent component is not an assignable, or is an assignable that does 
     * not have a binding expression, return <code>null</code>.
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1575
     */
    @ASTNodeAnnotation.Attribute
    public InstValueModification parentInstValueMod() {
        ASTNode$State state = state();
        InstValueModification parentInstValueMod_value = getParent().Define_parentInstValueMod(this, null);

        return parentInstValueMod_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1595
     */
    @ASTNodeAnnotation.Attribute
    public InstValueModification inheritedInstValueModTop() {
        ASTNode$State state = state();
        InstValueModification inheritedInstValueModTop_value = getParent().Define_inheritedInstValueModTop(this, null);

        return inheritedInstValueModTop_value;
    }
    /**
     * Is this a member of an array component?
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:354
     */
    @ASTNodeAnnotation.Attribute
    public boolean inArrayComponent() {
        ASTNode$State state = state();
        boolean inArrayComponent_value = getParent().Define_inArrayComponent(this, null);

        return inArrayComponent_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2547
     * @apilevel internal
     */
    public boolean Define_hasParentRecordWithBindingExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isRecord() && (hasBindingFExp() || hasParentRecordWithBindingExp());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2342
     * @apilevel internal
     */
    public boolean Define_inRecordDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inRecordDecl();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2883
     * @apilevel internal
     */
    public boolean Define_inBindingExp(ASTNode caller, ASTNode child) {
        if (caller == getBindingFExpNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_inBindingExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1601
     * @apilevel internal
     */
    public boolean Define_inFunction(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return (temporarilyInFunction != null) || inFunction();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:551
     * @apilevel internal
     */
    public InstComponentDecl Define_errorEnclosingComponent(ASTNode caller, ASTNode child) {
        if (caller == getBindingFExpNoTransform()) {
            return myInstValueMod().errorEnclosingComponent();
        }
        else {
            return super.Define_errorEnclosingComponent(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:194
     * @apilevel internal
     */
    public boolean Define_isFlattened(ASTNode caller, ASTNode child, InstValueModification ivm) {
        int childIndex = this.getIndexOfChild(caller);
        return !inRecordDecl() && myInstValueMod() == ivm;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:736
     * @apilevel internal
     */
    public FQName Define_expandedFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                if (temporarilyInFunction != null) {
                    return createFQNameForFuncUse(temporarilyInFunction);
                }
                if (size().isUnknown()) {
                    return expandedFQName().append(name(), size().flattenSubscript());
                } else {
                    return expandedFQName().append(name());
                }
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:755
     * @apilevel internal
     */
    public Set<InstAssignable> Define_functionConstantList(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return (temporarilyInFunction != null) ? 
                        temporarilyInFunction.localFunctionConstantList() : 
                        functionConstantList();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1596
     * @apilevel internal
     */
    public InstValueModification Define_inheritedInstValueModTop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myInstValueModTop();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2095
     * @apilevel internal
     */
    public InstComponentDecl Define_findComponentWithThisBindingExp(ASTNode caller, ASTNode child) {
        if (caller == getInstModificationOptNoTransform()) {
            return this;
        }
        else {
            return super.Define_findComponentWithThisBindingExp(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getBindingFExpNoTransform()) {
            return myInstValueMod().lookupInstClass(name);
        }
        else {
            return super.Define_lookupInstClass(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        if (caller == getBindingFExpNoTransform()) {
            return myInstValueMod().lookupInstComponentForBindingExp(name);
        }
        else {
            return super.Define_lookupInstComponent(caller, child, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:105
     * @apilevel internal
     */
    public boolean Define_inEvalAnnotated(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isEvalAnnotated();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2600
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        if (caller == getBindingFExpNoTransform()) {
            return buildInstanceName(surroundingInstClass(), getFQNamePrefix());
        }
        else {
            return super.Define_calcInstanceName(caller, child);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
