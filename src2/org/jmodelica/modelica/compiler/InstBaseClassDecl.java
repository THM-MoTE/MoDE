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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:44
 * @production InstBaseClassDecl : {@link InstClassDecl} ::= <span class="component">[{@link InstConstrainingClass}]</span> <span class="component">{@link InstRestriction}</span>;

 */
public abstract class InstBaseClassDecl extends InstClassDecl implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3561
     */
    public void prepareForFunctionEval(FAlgorithm fab) {
        for (InstComponentDecl var : allInstComponentDecls())
            var.clearLocalCachedEvaluationValue();
        for (InstComponentDecl var : allInstComponentDecls())
            var.prepareForFunctionEval();
        fab.prepareForFunctionEval();
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3569
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        // We assume that this class is a function
        
        FAlgorithm fab = findFunctionAlgorithm();
        if (fab == null) {
            InstExternal ie = findFunctionExternal();
            if (ie == null) {
                values.clear();
                return;
            }
            fab = ie.getFAlgorithm();
        }
        
        Map<CommonVariableDecl, CValue> oldVal = currentEvaluationValues;
        currentEvaluationValues = values;
        prepareForFunctionEval(fab);
        
        AlgorithmEvaluator algoEvaluator = evaluator.createAlgorithmEvaluator(values);
        try {
            for (InstComponentDecl var : myInputs())
              var.readEvaluationValue(values);
            for (InstComponentDecl var : myNonInputs())
              var.readEvaluationValue(values);
        
            fab.getFStatements().evaluateList(algoEvaluator);
        } catch (ConstantEvaluationException e) {
            algoEvaluator.failed(qualifiedName(), myOutputs(), e);
        } finally {
            prepareForFunctionEval(fab);
            if (oldVal != null)
                for (CommonVariableDecl var : oldVal.keySet())
                    var.setLocalCachedEvaluationValue(oldVal.get(var));
            currentEvaluationValues = oldVal;
        }
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3604
     */
    private Map<CommonVariableDecl, CValue> currentEvaluationValues = null;
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:655
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!errorChecked) {
            super.collectErrors(checkType);
            errorChecked = true;
            for (InstImport ii : getInstImports()) {
                ii.collectErrors(checkType);
            }
            if (hasInstConstrainingClass()) {
                getInstConstrainingClass().collectErrors(checkType);
            }
            getInstRestriction().collectErrors(checkType);
            getInstGeneratedInners().collectErrors(checkType);
            if (getBaseClassDecl() instanceof FullClassDecl) {
                FullClassDecl fcd = (FullClassDecl) getBaseClassDecl();
                if (!(fcd.getName().getID().equals(fcd.getEndDecl().getEndID()))) {
                    error("The declaration and end names of a class should be the same");
                }
            }
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:729
     */
    public void errorCheckDerivativeAnnotations(ErrorCheckType checkType) {
        errorCheckDerivativeAnnotations(checkType, findDerivativeAnnotationRoot());
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:733
     */
    private void errorCheckDerivativeAnnotations(ErrorCheckType checkType, AnnotationNode src) {
        for (AnnotationNode derivative : src.allFor("derivative")) {
            errorCheckDerivativeAnnotation(checkType, derivative);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:739
     */
    private void errorCheckDerivativeAnnotation(ErrorCheckType checkType, AnnotationNode derivative) {
        // TODO: Check that inputs/outputs of target function matches this function
        if (!derivative.isValue()) {
            derivative.ast().error("Function name is missing in derivative annotation declaration");
            return;
        }
        String name = derivative.string();
        if (name == null) {
            derivative.ast().error("Invalid derivative function reference");
            return;
        }
        InstLookupResult<InstClassDecl> lr = lookupDerivativeFunction(name);
        if (lr.isProblem()) {
            lr.problem(derivative.ast(), "function", name);
            if (lr.isError()) {
                return;
            }
        }
        InstClassDecl icd = lr.target();
        if (!icd.isFunction()) {
            derivative.ast().error("The class " + name + " is not a function");
            return;
        }
        icd.collectErrors(checkType);
        boolean orderFound = false;
        Set<String> noAndZeroDerivatives = new HashSet<String>();
        for (AnnotationNode attrNode : derivative) {
            if ("noDerivative".equals(attrNode.name()) || "zeroDerivative".equals(attrNode.name())) {
                if (!attrNode.isStringValue()) {
                    attrNode.ast().error("Expecting variable reference for " + attrNode.name() + " annotation");
                    continue;
                }
                String varName = attrNode.string();
                if (!noAndZeroDerivatives.add(varName))
                    attrNode.ast().error("Multiple noDerivative or zeroDerivative declarations for " + varName);
                InstLookupResult<InstComponentDecl> res = genericLookupInstComponent(varName);
                if (res.isNotFound())
                    attrNode.ast().error("Unable to find " + varName);
                else if (!res.target().isInput())
                    attrNode.ast().error(attrNode.name() + " annotation may only reference input variables");
            } else if ("order".equals(attrNode.name())) {
                if (orderFound)
                    attrNode.ast().error("Multiple declarations of the order attribute");
                orderFound = true;
                if (!attrNode.isIntegerValue())
                    attrNode.ast().error("Expecting integer typed expression for order attribute");
                else if (attrNode.integer() < 1)
                    attrNode.ast().error("Order attribute must be greater or equal to one");
            }
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:849
     */
    public void checkRestriction(ErrorCheckType checkType) {
        if (!errorChecked)
            getInstRestriction().collectErrors(checkType);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:275
     */
    public void flattenFunction(FClass fc) {
        getInstRestriction().flattenFunction(fc, this);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:289
     */
    public void flattenThisFunction(FClass fc) {
        if (fc.lookupFunc(qualifiedName()) == null) {
            FFunctionDecl ffd = createFFunction(fc, findFunctionExternal());
            copyDerivativeAnnotations(fc, ffd.annotation());
            ffd.copyInlineAnnotation(findInlineAnnotationRoot());
            ffd.smoothOrder(smoothOrder());
            
            ffd.ensureFQNamesFull();
            addLocalFunctionConstants(ffd, fc);
            flattenUsedFuncsAndEnums(fc);
            ffd.updateRecordArraySizes();
            
            contribute(ffd);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:305
     */
    private FFunctionDecl createFFunctionDecl() {
        FFunctionDecl res;
        if (isConstructor()) {
            res = new FConstructorDecl();
        } else if (isDestructor()) {
            res = new FDestructorDecl();
        } else {
            res = new FFunctionDecl();
        }
        
        res.setFAlgorithm(new FAlgorithm(new List<FStatement>()));
        return res;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:319
     */
    protected FFunctionDecl createFFunction(FClass fc, InstExternal ie) {
        FFunctionDecl ffd = createFFunctionDecl();
        ffd.setFQName(new FQNameString(qualifiedName()));
        fc.addFFunctionDecl(ffd);
        
        flattenComponentsInFunction(ffd, fc, new HashSet<String>(), FUNC_AND_REC_MOD_LEVEL);
        
        if (ie != null) {
            flattenExternal(ffd.getFAlgorithm(), fc, ie);
        } else {
            FStatement.flattenFStatementList(findFunctionAlgorithm().getFStatements(),
                ffd.getFAlgorithm().getFStatements(), fc, new FQNameEmpty());
        }
        
        ffd.getFAlgorithm().ensureReturn();
        
        return ffd;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:340
     */
    protected void flattenExternal(FAlgorithm fab, FClass fc, InstExternal ie) {
        List<FStatement> stmts = new List<FStatement>();
        ie.flatten(stmts, fc, new FQNameEmpty());
        for (FStatement stmt : stmts) {
            fab.addFStatement(stmt);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:348
     */
    private void copyDerivativeAnnotations(FClass fc, AnnotationNode dest) {
        copyDerivativeAnnotations(fc, findDerivativeAnnotationRoot(), dest);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:361
     */
    @Override
    protected AnnotationNode findAnnotationRoot(boolean lookInExternal, boolean lookInExtends, String ... subPaths) {
        for (String subPath : subPaths) {
            AnnotationNode node = annotation(subPath);
            if (node.exists()) {
                return annotation();
            }
        }
        if (lookInExternal) {
            InstExternal ie = findFunctionExternal();
            if (ie != null) {
                for (String subPath : subPaths) {
                    AnnotationNode node = ie.annotation(subPath);
                    if (node.exists()) {
                        return ie.annotation();
                    }
                }
            }
        }
        if (lookInExtends) {
            for (InstExtends instExtends : getInstExtendss()) {
                AnnotationNode node = instExtends.myInstClass().findAnnotationRoot(lookInExternal, lookInExtends, subPaths);
                if (node.exists()) {
                    return node;
                }
            }
        }
        return super.findAnnotationRoot(lookInExternal, lookInExtends, subPaths);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:408
     */
    private void copyDerivativeAnnotations(FClass fc, AnnotationNode src, AnnotationNode dest) {
        for (AnnotationNode derSrcNode : src.allFor("derivative")) {
            String derName = derSrcNode.string();
            InstClassDecl fd_decl = lookupDerivativeFunction(derName).target();
            AnnotationNode derDestNode = dest.addNode("derivative");
            fd_decl.flattenFunction(fc);
            FExp derNameExp = new FIdUseExp(new FQNameString(fd_decl.qualifiedName()));
            derDestNode.setValue(derNameExp);
            for (AnnotationNode attrSrcNode : derSrcNode) {
                if ("noDerivative".equals(attrSrcNode.name()) && attrSrcNode.isStringValue()) {
                    AnnotationNode noDer = derDestNode.addNode("noDerivative");
                    noDer.setValue(new FIdUseExp(attrSrcNode.string()));
                } else if ("zeroDerivative".equals(attrSrcNode.name()) && attrSrcNode.isStringValue()) {
                    AnnotationNode zeroDer = derDestNode.addNode("zeroDerivative");
                    zeroDer.setValue(new FIdUseExp(attrSrcNode.string()));
                } else if ("order".equals(attrSrcNode.name()) && attrSrcNode.isIntegerValue()) {
                    AnnotationNode order = derDestNode.addNode("order");
                    order.setValue(new FIntegerLitExp(attrSrcNode.integer()));
                }
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:440
     */
    private void addLocalFunctionConstants(FFunctionDecl ffd, FClass fc) {
        Set<InstAssignable> added = new HashSet<InstAssignable>();
        Set<InstAssignable> all = localFunctionConstantList();
        List<FFunctionVariable> ffvs = ffd.getFFunctionVariableListNoTransform();
        ffd.setFFunctionVariableList(new List());
        List<FStatement> stmts = ffd.getFAlgorithmNoTransform().getFStatementsNoTransform();
        ffd.getFAlgorithmNoTransform().setFStatementList(new List());
        int n = 0;
        while (n < all.size()) {
            n = all.size();
            // We need a copy of all since it can be modified during iteration
            for (InstAssignable cons : all.toArray(new InstAssignable[n])) {
                if (added.add(cons)) {
                    cons.flattenInFunction(ffd, fc, true, this);
                    cons.flattenUsedFuncsAndEnums(fc);
                    all.remove(cons);
                }
            }
        }
        for (FFunctionVariable ffv : ffvs.noTransform())
            ffd.addFFunctionVariable(ffv);
        for (FStatement stmt : stmts.noTransform())
            ffd.getFAlgorithmNoTransform().addFStatement(stmt);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:543
     */
    public void flattenRecord(FClass fc) {
        getInstRestriction().flattenRecord(fc, this);
    }
    /**
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3377
     */
    
        public <N extends FFunctionDecl> N contribute(N function) {
            for (AttributeContributer contributer : attributeContributers())
                contributer.contribute(this, function);
            return function;
        }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1190
     */
    public InstComponentDecl newInstComponentDecl(ComponentDecl cd) {
		return newInstComponentDecl(cd,cd.getClassName());		
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1204
     */
    public InstComponentDecl newInstComponentDecl(ComponentDecl cd, Access className) {
        InstComponentDecl icd = emptyInstComponentDecl(cd, className.newInstAccess());
        if (cd.hasVarArraySubscripts()) 
            icd.setLocalFArraySubscripts(cd.getVarArraySubscripts().instantiate());
        if (cd.hasConditionalAttribute())
            icd.setConditionalAttribute(cd.getConditionalAttribute().getExp().instantiate());
        if (cd.hasModification())
            icd.setInstModification(cd.getModification().newInstModification());
        icd.setInstConstrainingComponentOpt(cd.newInstConstrainingComponentOpt(null));
        icd.setLocation(cd);
        return icd;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1221
     */
    public InstComponentDecl emptyInstComponentDecl(ComponentDecl cd, InstAccess name) {
		if (isRecord()) 
			return new InstRecord(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
		else if (extendsEnum()) 
			return new InstEnum(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
		else if (isExternalObject())
			return new InstExternalObject(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
		else if (extendsPrimitive()) 
			return new InstPrimitive(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
		else if (isExpandableConnector())
		    return new InstExpandableConnectorDecl(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
        else if (isPartialFunction())
            return new InstPartialFunction(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
		else
			return new InstComposite(name, new Opt(), cd, new Opt(), new Opt(), new Opt());
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1263
     */
    public InstComponentDecl newInstReplacingComponent(
            ComponentDecl replacingDecl, ComponentDecl originalDecl, 
            InstComponentRedeclare icr, InstComponentRedeclare cicr) {
        Opt fas_opt = new Opt();
        if (replacingDecl.hasVarArraySubscripts()) {
            fas_opt.setChild(replacingDecl.getVarArraySubscripts().instantiate(), 0);
        }
        Opt cond_attr_opt = new Opt();
        if (originalDecl.hasConditionalAttribute()) {
            cond_attr_opt.setChild(originalDecl.getConditionalAttribute().getExp().instantiate(), 0);
        }
        ComponentDecl constrainingDecl = (cicr == null) ? originalDecl : cicr.getComponentRedeclare().getComponentDecl();
        
        if (isOrExtendsPrimitive()) {
            InstReplacingPrimitive icd = new InstReplacingPrimitive(replacingDecl.newInstClassAccess(), 
                    fas_opt, replacingDecl, new Opt(), new Opt(), cond_attr_opt, originalDecl, icr);
            icd.setInstConstrainingComponentOpt(constrainingDecl.newInstConstrainingComponentOpt(cicr));
            icd.setLocation(originalDecl);
            return icd;
        } else if (isRecord()) {
            InstReplacingRecord icd = new InstReplacingRecord(replacingDecl.newInstClassAccess(), 
                    fas_opt, replacingDecl, new Opt(), new Opt(), cond_attr_opt, originalDecl, icr);
            icd.setInstConstrainingComponentOpt(constrainingDecl.newInstConstrainingComponentOpt(cicr));
            icd.setLocation(originalDecl);
            return icd;
        } else {
            InstReplacingComposite icd;
            if (isExpandableConnector())
                icd = new InstReplacingExpandableConnectorDecl(replacingDecl.newInstClassAccess(), 
                        fas_opt, replacingDecl, new Opt(), new Opt(), cond_attr_opt, originalDecl, icr);
            else
                icd = new InstReplacingComposite(replacingDecl.newInstClassAccess(), 
                        fas_opt, replacingDecl, new Opt(), new Opt(), cond_attr_opt, originalDecl, icr);
            icd.setInstConstrainingComponentOpt(constrainingDecl.newInstConstrainingComponentOpt(cicr));
            icd.setLocation(originalDecl);
            return icd;
        }
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2580
     */
    public void dumpTree(String indent) {
		System.out.println(indent + dump()
		                      + ": " + 
		                      getBaseClassDecl().name());
		System.out.println(toString(indent+"|"));

		//getComponentDecl().dumpTree("");
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
    public InstBaseClassDecl() {
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
        children = new ASTNode[12];
        setChild(new Opt(), 0);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new Opt(), 10);
    }
    /**
     * @declaredat ASTNode:22
     */
    public InstBaseClassDecl(ClassDecl p0, Opt<InstConstrainingClass> p1, InstRestriction p2) {
        setClassDecl(p0);
        setChild(p1, 0);
        setChild(p2, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:30
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        qualifiedName_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:49
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:55
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public InstBaseClassDecl clone() throws CloneNotSupportedException {
        InstBaseClassDecl node = (InstBaseClassDecl) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:72
     */
    public abstract InstBaseClassDecl fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:79
     */
    public abstract InstBaseClassDecl treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:87
     */
    public abstract InstBaseClassDecl treeCopy();
    /**
     * Replaces the lexeme ClassDecl.
     * @param value The new value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    public void setClassDecl(ClassDecl value) {
        tokenClassDecl_ClassDecl = value;
    }
    /**
     * Retrieves the value for the lexeme ClassDecl.
     * @return The value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ClassDecl")
    public ClassDecl getClassDecl() {
        return tokenClassDecl_ClassDecl;
    }
    /**
     * Replaces the optional node for the InstConstrainingClass child. This is the <code>Opt</code>
     * node containing the child InstConstrainingClass, not the actual child!
     * @param opt The new node to be used as the optional node for the InstConstrainingClass child.
     * @apilevel low-level
     */
    public void setInstConstrainingClassOpt(Opt<InstConstrainingClass> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) InstConstrainingClass child.
     * @param node The new node to be used as the InstConstrainingClass child.
     * @apilevel high-level
     */
    public void setInstConstrainingClass(InstConstrainingClass node) {
        getInstConstrainingClassOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional InstConstrainingClass child exists.
     * @return {@code true} if the optional InstConstrainingClass child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInstConstrainingClass() {
        return getInstConstrainingClassOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) InstConstrainingClass child.
     * @return The InstConstrainingClass child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public InstConstrainingClass getInstConstrainingClass() {
        return (InstConstrainingClass) getInstConstrainingClassOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the InstConstrainingClass child. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * @return The optional node for child the InstConstrainingClass child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="InstConstrainingClass")
    public Opt<InstConstrainingClass> getInstConstrainingClassOpt() {
        return (Opt<InstConstrainingClass>) getChild(0);
    }
    /**
     * Retrieves the optional node for child InstConstrainingClass. This is the <code>Opt</code> node containing the child InstConstrainingClass, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child InstConstrainingClass.
     * @apilevel low-level
     */
    public Opt<InstConstrainingClass> getInstConstrainingClassOptNoTransform() {
        return (Opt<InstConstrainingClass>) getChildNoTransform(0);
    }
    /**
     * Replaces the InstRestriction child.
     * @param node The new node to replace the InstRestriction child.
     * @apilevel high-level
     */
    public void setInstRestriction(InstRestriction node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the InstRestriction child.
     * @return The current node used as the InstRestriction child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="InstRestriction")
    public InstRestriction getInstRestriction() {
        return (InstRestriction) getChild(1);
    }
    /**
     * Retrieves the InstRestriction child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the InstRestriction child.
     * @apilevel low-level
     */
    public InstRestriction getInstRestrictionNoTransform() {
        return (InstRestriction) getChildNoTransform(1);
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
        return 2;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(2);
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
        return 3;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(3);
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
        return 4;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(4);
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
        return 5;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(5);
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
        return 6;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(6);
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
        return 7;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(7);
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
        return 8;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(8);
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
        return (FQName) getChildNoTransform(9);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 9;
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
        return (Opt<InstClassModification>) getChildNoTransform(10);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 10;
    }
    /**
     * Retrieves the FunctionType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FunctionType child.
     * @apilevel low-level
     */
    public FType getFunctionTypeNoTransform() {
        return (FType) getChildNoTransform(11);
    }
    /**
     * Retrieves the child position of the optional child FunctionType.
     * @return The the child position of the optional child FunctionType.
     * @apilevel low-level
     */
    protected int getFunctionTypeChildPosition() {
        return 11;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupDerivativeFunction(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupDerivativeFunction_String_value = lookupInstClassQualified(name);

        return lookupDerivativeFunction_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String kindDescription() {
        ASTNode$State state = state();
        String kindDescription_value = getInstRestriction().toString();

        return kindDescription_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = name().equals(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordType createEmptyFRecordType(Size s) {
        ASTNode$State state = state();
        FRecordType createEmptyFRecordType_Size_value = getInstRestriction().createEmptyFRecordType(s);

        return createEmptyFRecordType_Size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConnector() {
        ASTNode$State state = state();
        boolean isConnector_value = getInstRestriction().isConnector();

        return isConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnector() {
        ASTNode$State state = state();
        boolean isExpandableConnector_value = getInstRestriction().isExpandableConnector();

        return isExpandableConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = getInstRestriction().isOperatorRecord();

        return isOperatorRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperator() {
        ASTNode$State state = state();
        boolean isOperator_value = getInstRestriction().isOperator();

        return isOperator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunction() {
        ASTNode$State state = state();
        boolean isFunction_value = getInstRestriction().isFunction();

        return isFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = getInstRestriction().isRecord();

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCallable() {
        ASTNode$State state = state();
        boolean isCallable_value = getInstRestriction().isCallable();

        return isCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPackage() {
        ASTNode$State state = state();
        boolean isPackage_value = getInstRestriction().isPackage();

        return isPackage_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isModel() {
        ASTNode$State state = state();
        boolean isModel_value = getInstRestriction().isModel();

        return isModel_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBlock() {
        ASTNode$State state = state();
        boolean isBlock_value = getInstRestriction().isBlock();

        return isBlock_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClass() {
        ASTNode$State state = state();
        boolean isClass_value = getInstRestriction().isClass();

        return isClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstRestriction() {
        ASTNode$State state = state();
        boolean hasInstRestriction_value = true;

        return hasInstRestriction_value;
    }
    /**
     * A connector class inheriting a record class is both connector and record, 
     * this method finds any inherited restriction that should be kept.
     * @attribute syn
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1440
     */
    @ASTNodeAnnotation.Attribute
    public InstRestriction inheritedRestriction(boolean checkMine) {
        ASTNode$State state = state();
        try {
                if (checkMine)
                    return getInstRestriction().inheritedRestriction();
                for (InstExtends ie : getInstExtendss()) {
                    InstRestriction ir = ie.myInstClass().inheritedRestriction(true);
                    if (ir != null)
                        return ir;
                }
                return null;
            }
        finally {
        }
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
        String name_value = getBaseClassDecl().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public BaseClassDecl getBaseClassDecl() {
        ASTNode$State state = state();
        BaseClassDecl getBaseClassDecl_value = (BaseClassDecl)getClassDecl();

        return getBaseClassDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean qualifiedName_computed = false;
    /**
     * @apilevel internal
     */
    protected String qualifiedName_value;
    /**
     * @apilevel internal
     */
    private void qualifiedName_reset() {
        qualifiedName_computed = false;
        qualifiedName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedName() {
        if(qualifiedName_computed) {
            return qualifiedName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        qualifiedName_value = getInstRestriction().qualifiedClassName();
        if (isFinal && num == state().boundariesCrossed) {
            qualifiedName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return qualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = getBaseClassDecl().components();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = getBaseClassDecl().superClasses();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = getBaseClassDecl().classes();

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = getBaseClassDecl().imports();

        return imports_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Modification> elementModifications() {
        ASTNode$State state = state();
        Iterable<Modification> elementModifications_value = getBaseClassDecl().elementModifications();

        return elementModifications_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstConstraining() {
        ASTNode$State state = state();
        boolean hasInstConstraining_value = hasInstConstrainingClass();

        return hasInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstConstraining getInstConstraining() {
        ASTNode$State state = state();
        InstConstraining getInstConstraining_value = getInstConstrainingClass();

        return getInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public OperatorMatches matchOverloadedOperators(FType a, FType b, boolean aIsLeft) {
        ASTNode$State state = state();
        OperatorMatches matchOverloadedOperators_FType_FType_boolean_value = getInstRestriction().matchOverloadedOperators(a, b, aIsLeft);

        return matchOverloadedOperators_FType_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstClassDecl> operatorFunctions() {
        ASTNode$State state = state();
        java.util.List<InstClassDecl> operatorFunctions_value = getInstRestriction().operatorFunctions();

        return operatorFunctions_value;
    }
    @ASTNodeAnnotation.Attribute
    public String primitiveName() {
        ASTNode$State state = state();
        String primitiveName_value = name();

        return primitiveName_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:710
     */
    @ASTNodeAnnotation.Attribute
    public String packageName() {
        ASTNode$State state = state();
        String packageName_value = getParent().Define_packageName(this, null);

        return packageName_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3222
     * @apilevel internal
     */
    public boolean Define_duringFunctionEval(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return currentEvaluationValues != null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1601
     * @apilevel internal
     */
    public boolean Define_inFunction(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isFunction();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1616
     * @apilevel internal
     */
    public boolean Define_extendsInFunction(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isFunction();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:696
     * @apilevel internal
     */
    public InstClassDecl Define_myInstClassDecl(ASTNode caller, ASTNode child) {
        if (caller == getInstRestrictionNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_myInstClassDecl(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return Kind.AMBIGUOUS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1433
     * @apilevel internal
     */
    public InstRestriction Define_inheritedRestriction(ASTNode caller, ASTNode child) {
        if (caller == getInstRestrictionNoTransform()) {
            return inheritedRestriction(false);
        }
        else {
            return getParent().Define_inheritedRestriction(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1862
     * @apilevel internal
     */
    public String Define_instClassNamePrefix(ASTNode caller, ASTNode child, boolean sup) {
        int childIndex = this.getIndexOfChild(caller);
        return qualifiedName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:709
     * @apilevel internal
     */
    public String Define_packageName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isPackage() ? qualifiedName() : packageName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:835
     * @apilevel internal
     */
    public InstClassDecl Define_enclosingInstClassDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
