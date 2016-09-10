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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:43
 * @production InstClassDecl : {@link InstBaseNode} ::= <span class="component">&lt;ClassDecl:ClassDecl&gt;</span> <span class="component">[ClassAnnotation:{@link InstClassModification}]</span> <span class="component">FunctionType:{@link FType}</span>;

 */
public abstract class InstClassDecl extends InstBaseNode implements Cloneable, InstLookupResult.Item, InstRedeclareClassNode, InstCallable {
    /**
     * Constant-evaluate function with given set of arguments and return value for first output.
     * 
     * @param args  arguments of the function call
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3518
     */
    public CValue evaluateFirst(VariableEvaluator evaluator, Iterable<FExp> args) {
        Map<CommonVariableDecl, CValue> values = new HashMap<CommonVariableDecl, CValue>();
        for (CommonVariableDecl var : myInputs()) 
            var.prepareForFunctionEval();
        int i = 0;
        for (FExp arg : args) {
            if (i < myInputs().size()) {
                CommonVariableDecl cvd = myInputs().get(i);
                if (cvd.type().typeCompatible(arg.type(), true)) {
                    values.put(cvd, arg.ceval(evaluator));
                } else {
                    InstClassDecl constructor = cvd.type().matchOverloadedConstructor(arg.type());
                    ArrayList<FExp> l = new ArrayList<FExp>();
                    l.add(arg);
                    CValue v = constructor.evaluateFirst(evaluator, l);
                    values.put(cvd, v);
                }
            } else {
                throw new ConstantEvaluationException();
            }
            i++;
        }
        
        evaluate(evaluator, values);
        
        CValue res = myOutputs().isEmpty() ? null : values.get(myOutputs().get(0));
        return (res == null) ? CValue.UNKNOWN : res;
    }
    /**
     * Perform constant evaluation of functions.
     * 
     * @param values  constant values for the variables. 
     * Should be filled with the values of the inputs.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3553
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        values.clear(); // Make sure evaluation returns CValue.UNKNOWN
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:249
     */
    public void contentCheck(ErrorCheckType checkType) {
        if (isExternalObject()) {
            checkContentsOKInExternalObject();
            myConstructor().checkConstructor(this);
            myDestructor().checkDestructor(this);
        }
        checkQuotedIdentifier(getClassDecl(), getClassDecl().getName().getID());
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:275
     */
    public void checkDestructor(InstClassDecl parent) {
		if (isUnknown())
			return;
		if (myOutputs().size() != 0 || myInputs().size() != 1 || !myInputs().get(0).type().compatibleDestructor(parent))
			error("An external object destructor must have exactly one input of the same type as the constructor, and no outputs");
	}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:282
     */
    public void checkConstructor(InstClassDecl parent) {
		if (isUnknown())
			return;
		if (myOutputs().size() != 1 || !myOutputs().get(0).type().compatibleConstructor(parent))
			error("An external object constructor must have exactly one output of the same type as the constructor");
	}
    /**
     * Perform content checks that are common to functions in operators and operator functions.
     * 
     * @param checkType  the kind of error checking being done
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:556
     */
    public void contentCheckAsOperatorFunction(ErrorCheckType checkType, FType type, String name) {
        boolean constr = FExp.CONSTRUCTOR_OPERATORS.contains(name);
        boolean conv   = FExp.CONVERSION_OPERATORS.contains(name);
        boolean binary = FExp.BINARY_OPERATORS.contains(name);
        boolean unary  = FExp.UNARY_OPERATORS.contains(name);
        int mandatory = 0;
        for (InstComponentDecl input : myInputs()) 
            if (!input.hasBindingFExp())
                mandatory++;
        
        String funcName = isOperator() ? "" : (name() + " ");
        if (myOutputs().size() != 1)
            error("Operator functions must have exactly one output, but %s has %d", name(), myOutputs().size());
        else if (constr && !myOutputs().get(0).type().equivalentTo(type))
            myOutputs().get(0).error("Output of operator record constructor must be of the type of the operator record the constructor belongs to");
        else if (conv) {
            FType expected = null;
            if (name.equals(FExp.OP_STR))
                expected = fStringScalarType();
            if (expected != null && !myOutputs().get(0).type().equivalentTo(expected))
                error("%s operator functions must have one output of type %s, but %sreturns %s", name, expected, funcName, myOutputs().get(0).type());
        }
        if (constr) {
            if (name.equals(FExp.OP_ZERO)) {
                if (!myInputs().isEmpty())
                    error("The '0' operator record constructor may not have any inputs, but %shas %d", funcName, myOutputs().size());
            } else if (mandatory == 1) {
                FType otherType = myInputs().get(0).type();
                if (otherType.matchOverloadedConstructor(type) != null) 
                    error("Ambiguous overloaded constructors in %s and %s", type, otherType);
            }
        } else {
            boolean typeOk = false;
            boolean orderOk = true;
            for (int i = 0, n = myInputs().size(); i < n; i++) { 
                InstComponentDecl inp = myInputs().get(i);
                if ((!conv || i == 0) && inp.type().scalarType().equivalentTo(type))
                    typeOk = true;
                if (inp.hasBindingFExp() && mandatory > i)
                    orderOk = false;
            }
            if (!typeOk)
                error((conv ? "First argument of conversion operator functions must be" : "Operator functions must have at least one argument that is") + 
                        " of the type of the operator record the function belongs to");
            if (!orderOk)
                error("All inputs without default value in operator function must be before all inputs with default value");
        }
        if (binary && unary) {
            if (mandatory < 1 || mandatory > 2)
                error("Operator functions for operators that are both unary and binary must have exactly 1 or 2 inputs without default value, but %s has %d", 
                        name(), mandatory);
        } else if (binary) {
            if (mandatory != 2)
                error("Operator functions for binary operators must have exactly 2 inputs without default value, but %s has %d", 
                        name(), mandatory);
        } else if (unary) {
            if (mandatory != 1)
                error("Operator functions for unary operators must have exactly 1 input without default value, but %s has %d", 
                        name(), mandatory);
        }
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:588
     */
    public void checkErrorsInModelInstance(String className, ErrorCheckType checkType) throws ModelicaClassNotFoundException {
        errorCheck(checkType);
    }
    /**
     * Check that the restriction of this class is fulfilled.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:848
     */
    public void checkRestriction(ErrorCheckType checkType) {}
    /**
     * Check if class has exactly one algorithm section or external function declaration.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1170
     */
    public boolean isCompleteFunction() {
        return (numFAlgorithm() == 1);
    }
    /**
     * Examine extends tree to find recursive extends nodes.
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1469
     */
    public void calcIsRecursive(HashSet<InstNode> visited) {
		for (InstExtends ie : getInstExtendss())
			ie.calcIsRecursive(visited);
	}
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1253
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
        super.buildConnectionSets(prefix, csm, connect);
        getInstGeneratedInners().buildConnectionSets(prefix, csm, connect);
    }
    /**
     * Create a new FClass object.
     * 
     * Override for subclasses needing a subclass of FClass.
     * @aspect FlatTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:66
     */
    public FClass createFClass() {
        return new FClass();
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:90
     */
    public void flattenInstClassDecl(FClass fc) {
        int level = 1;
        HashMap<InstNode,Integer> oldLevels = setModificationLevel(level);
        beginStep("flattenInstClassDecl()");
        fc.setName(qualifiedName());
        buildConnectionSets(fc);
        breakOnErrors();
        beginStep("flattenComponents()");
        flatten(fc, false, level);
        getInstGeneratedInners().flatten(fc, false, level);
        flattenUsedFuncsAndEnums(fc);
        flattenInstClassDeclExtra(fc);
        endStep("flattenComponents()");
        fc.updateVariabilityForVariablesInWhen();
        fc.genConnectionEquations();
        fc.createExperiment(annotation("experiment"));
        breakOnErrors();
        endStep("flattenInstClassDecl()");
        fc.transformationStepDebug();
        clearModificationLevel(oldLevels);
    }
    /**
     * Delegate for adding extra flattening code to top-level model.
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:121
     */
    protected void flattenInstClassDeclExtra(FClass fc) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:148
     */
    @Override
    public void flattenUsedFuncsAndEnums(FClass fc) {
        super.flattenUsedFuncsAndEnums(fc);
        getInstGeneratedInners().flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:273
     */
    public void flattenFunction(FClass fc) {}
    /**
     * Utility method for finding an annotation tree that contains one of the
     * provided subpaths. It will optionaly look in the external and the
     * annotation of extending classes.
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:357
     */
    protected AnnotationNode findAnnotationRoot(boolean lookInExternal, boolean lookInExtends, String ... subPaths) {
        return AnnotationNode.NO_ANNOTATION;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:396
     */
    protected AnnotationNode findDerivativeAnnotationRoot() {
        return findAnnotationRoot(true, true, "derivative");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:400
     */
    protected AnnotationNode findInlineAnnotationRoot() {
        return findAnnotationRoot(true, true, "Inline", "LateInline", "InlineAfterIndexReduction");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:404
     */
    protected AnnotationNode findSmoothOrderAnnotationRoot() {
        return findAnnotationRoot(true, true, "smoothOrder");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:541
     */
    public void flattenRecord(FClass fc) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:965
     */
    public void buildConnectionSets(FClass fc) {
        beginStep("buildConnectionSets()");
        ConnectionSetManager csm = fc.getConnectionSetManager();
        buildConnectionSets(new FQNameEmpty(), csm, true);
        csm.buildOverconstrainedConnectionTrees();
        csm.elaborateExpandableConnectors();
        endStep("buildConnectionSets()");
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1091
     */
    private FClass flatEnumClassDeclAddedTo = null;
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1093
     */
    public void flattenEnum(FClass fc) {      
        if (flatEnumClassDeclAddedTo != fc) {
            flatEnumClassDeclAddedTo = fc;
            // Flatten all InstEnums corresponding to FEnumLiterals
            FEnumLiteralList l = new FEnumLiteralList();
            for (InstEnumLiteral ie : enumLiterals()) 
                l.addFEnumLiteral(ie.createFEnumLiteral());
            FIdDecl id = new FIdDecl(new FQNameString(qualifiedName()));
            ClassDecl classDecl = getClassDecl();
            Opt comment = null;
            if (classDecl.hasStringComment()) 
                comment = new Opt(new FStringComment(classDecl.getStringComment().getComment()));
            else 
                comment = new Opt();
            fc.addFEnumDecl(new FEnumDecl(id, l, comment)); 
            addFDerivedType(fc);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1256
     */
    private boolean derivedTypeAdded;
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1258
     */
    public void addFDerivedType(FClass fc) {
        if (!derivedTypeAdded && extendsPrimitive()) {
            derivedTypeAdded = true;
            List<FAttribute> attr = new List<FAttribute>();
            addAttributes(attr, totalMergedEnvironment());
            FType baseType = primitiveScalarType().fullCopy();
            fc.addFDerivedType(new FDerivedType(qualifiedName(), baseType, attr));
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2136
     */
    private Map<InstComponentDecl,String> tempVarNames;
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2137
     */
    private int nextTempVarIndex = 1;
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2735
     */
    public FFunctionCall flattenOverloadedFunctionCall(FQName prefix, FExp... args) {
        FType[] argTypes = new FType[args.length];
        for (int i = 0; i < args.length; i++)
            argTypes[i] = args[i].type();
        return flattenOverloadedFunctionCall(prefix, args, argTypes);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2742
     */
    public FFunctionCall flattenOverloadedFunctionCall(FQName prefix, FExp[] args, FType[] argTypes) {
        // TODO: handle array operations (scalar * matrix, etc)
        FIdUse name = new FIdUse(new FQNameString(qualifiedName()));
        int nIn = myInputs().size();
        if (nIn > args.length)
            args = Arrays.copyOf(args, nIn);
        for (int i = 0; i < nIn; i++) {
            InstComponentDecl in = myInputs().get(i);
            if (args[i] == null) {
                InstFunctionArgument def = in.createInstDefaultArgument();
                def.parent = in;
                args[i] = def.flatten(prefix);
            } else if (!in.type().typeCompatible(argTypes[i], true)) {
                InstClassDecl constructor = in.type().matchOverloadedConstructor(argTypes[i]);
                args[i] = constructor.flattenOverloadedFunctionCall(prefix, args[i]);
            } else {
                args[i] = args[i].flatten(prefix);
            }
        }
        List<FExp> argList = new List<FExp>(args);
        return new FFunctionCall(name, argList, functionType().flatten(prefix, null, true));
    }
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:178
     */
    private static final String TEMP_VAR_PREFIX = "temp_";
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:179
     */
    private int incr = 0;
    /**
     * @aspect FlatStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:195
     */
    public boolean componentExists(String name) {
        for (InstComponentDecl decl : allInstComponentDecls()) {
            if (decl.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Change access to point to <code>this</code> class instead of <code>orig</code>.
     * 
     * Creates new access if necessary.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:488
     */
    public InstAccess retargetFrom(InstClassDecl orig, InstAccess access) {
        if (this == orig)
            return access;
        InstAccess part = new InstClassAccess(name());
        InstClassDecl parent = surroundingInstClass();
        if (parent == null)
            return part;
        access = parent.retargetFrom(orig, access);
        InstDot dot = (access instanceof InstDot) ? (InstDot) access : new InstDot(new List(access));
        dot.addInstAccess(part);
        return dot;
    }
    /**
     * Get the restriction of this class.
     * @aspect InstClassRestriction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:633
     */
    public InstRestriction getInstRestriction() {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1189
     */
    public abstract InstComponentDecl newInstComponentDecl(ComponentDecl cd);
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1202
     */
    public abstract InstComponentDecl newInstComponentDecl(ComponentDecl cd, Access className);
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1253
     */
    public InstComponentDecl newInstConstrainingComponentDecl(ComponentDecl cd, Access className) {
        InstComponentDecl icd = newInstComponentDecl(cd, className);
        icd.setInstConstrainingComponentOpt(new Opt());
        return icd;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1259
     */
    public abstract InstComponentDecl newInstReplacingComponent(
            ComponentDecl replacingDecl, ComponentDecl originalDecl, 
            InstComponentRedeclare icr, InstComponentRedeclare cicr);
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2166
     */
    public Iterable<InstComponentDecl> allInstComponentDecls() {
        return new AllInstComponentIterable(actualInstClass());
    }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2187
     */
    public Iterable<InstClassDecl> allInstClassDecls() {
        return new AllInstClassIterable(actualInstClass());
    }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2194
     */
    protected Iterator<InstComponentDecl> allInstComponentDeclsIterator() {
        return new AllInstComponentIterator(actualInstClass());
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2784
     */
    public String toString() {
    	return getClassDecl().toString();
    }
    /**
     * Add operators to operator map. Operators add themselves and packages add any contained operators.
     * @aspect OperatorRecordTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:37
     */
    public void addOperatorsToMap(Map<String,InstClassDecl> map) {
        if (isOperator()) {
            // TODO: error if already in map? see https://trac.modelica.org/Modelica/ticket/1459
            map.put(name(), this);
        } else if (isPackage()) {
            for (InstClassDecl icd : allInstClassDecls())
                icd.addOperatorsToMap(map);
        }
    }
    /**
     * @aspect ClassDeclMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1466
     */
    public boolean extendsClass(InstClassDecl icd) {
        if (equals(icd))
            return true;
        for (InstExtends ie : getInstExtendss()) {
            if (ie.myInstClass().extendsClass(icd))
                return true;
        }
        return false;
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstClassDecl() {
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
        children = new ASTNode[10];
        setChild(new List(), 0);
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new Opt(), 8);
    }
    /**
     * @declaredat ASTNode:21
     */
    public InstClassDecl(ClassDecl p0) {
        setClassDecl(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:27
     */
    protected int numChildren() {
        return 0;
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
        getFQName_reset();
        localFunctionConstantList_reset();
        getInstGeneratedInners_reset();
        recordType_reset();
        classInstModifications_reset();
        getClassAnnotationOpt_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:57
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:63
     */
    public InstClassDecl clone() throws CloneNotSupportedException {
        InstClassDecl node = (InstClassDecl) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:74
     */
    public abstract InstClassDecl fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:81
     */
    public abstract InstClassDecl treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:89
     */
    public abstract InstClassDecl treeCopy();
    /**
     * Replaces the lexeme ClassDecl.
     * @param value The new value for the lexeme ClassDecl.
     * @apilevel high-level
     */
    public void setClassDecl(ClassDecl value) {
        tokenClassDecl_ClassDecl = value;
    }
    /**
     * @apilevel internal
     */
    protected ClassDecl tokenClassDecl_ClassDecl;
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
        return 0;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(0);
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
        return 1;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(1);
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
        return 2;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(2);
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
        return 3;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(3);
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
        return 4;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(4);
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
        return 5;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(5);
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
        return 6;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(6);
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
        return (FQName) getChildNoTransform(7);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 7;
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
        return (Opt<InstClassModification>) getChildNoTransform(8);
    }
    /**
     * Retrieves the child position of the optional child ClassAnnotation.
     * @return The the child position of the optional child ClassAnnotation.
     * @apilevel low-level
     */
    protected int getClassAnnotationOptChildPosition() {
        return 8;
    }
    /**
     * Retrieves the FunctionType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FunctionType child.
     * @apilevel low-level
     */
    public FType getFunctionTypeNoTransform() {
        return (FType) getChildNoTransform(9);
    }
    /**
     * Retrieves the child position of the optional child FunctionType.
     * @return The the child position of the optional child FunctionType.
     * @apilevel low-level
     */
    protected int getFunctionTypeChildPosition() {
        return 9;
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1847
     */
    @ASTNodeAnnotation.Attribute
    public abstract String qualifiedName();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:677
     */
    @ASTNodeAnnotation.Attribute
    public abstract String primitiveName();
    @ASTNodeAnnotation.Attribute
    public CValue evaluatePartial(Map<CommonVariableDecl, CValue> values) {
        ASTNode$State state = state();
        CValue evaluatePartial_Map_CommonVariableDecl__CValue__value = CValuePartialFunction.create(this, values);

        return evaluatePartial_Map_CommonVariableDecl__CValue__value;
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
        getFQName_value = new FQNameEmpty();
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
    public ArrayList<InstComponentDecl> myCallInputs() {
        ASTNode$State state = state();
        ArrayList<InstComponentDecl> myCallInputs_value = isRecord() ? myModifiableComponents() : myInputs();

        return myCallInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExperiment() {
        ASTNode$State state = state();
        boolean isExperiment_value = annotation("experiment").exists();

        return isExperiment_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructor() {
        ASTNode$State state = state();
        boolean isDestructor_value = name().equals("destructor") && inExternalObject();

        return isDestructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructor() {
        ASTNode$State state = state();
        boolean isConstructor_value = name().equals("constructor") && inExternalObject();

        return isConstructor_value;
    }
    /**
     * Check if this class fulfills the requirements of a package.
     * @attribute syn
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:702
     */
    @ASTNodeAnnotation.Attribute
    public boolean isOkPackage() {
        ASTNode$State state = state();
        try {
                for (InstComponentDecl icd : getInstComponentDecls())
                    if (!icd.isConstant())
                        return false;
                return getNumFAbstractEquation() == 0;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstExternal() {
        ASTNode$State state = state();
        boolean hasInstExternal_value = false;

        return hasInstExternal_value;
    }
    /**
     * @attribute syn
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1177
     */
    @ASTNodeAnnotation.Attribute
    public int numInstExternal() {
        ASTNode$State state = state();
        try {
        		int n = hasInstExternal() ? 1 : 0;
        		for (InstExtends ie : getInstExtendss())
        			n += ie.myInstClass().numInstExternal();
        		return n;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1185
     */
    @ASTNodeAnnotation.Attribute
    public int numFAlgorithm() {
        ASTNode$State state = state();
        try {
        		int n = 0;
        		for (FAbstractEquation e : getFAbstractEquations())
        			if (e instanceof FAlgorithm)
        				n++;
        		for (InstExtends ie : getInstExtendss())
        			n += ie.myInstClass().numFAlgorithm();
        		return n;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOfInstClassDecl(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isOfInstClassDecl_InstClassDecl_value = icd == this;

        return isOfInstClassDecl_InstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentSizeClass() {
        ASTNode$State state = state();
        boolean isComponentSizeClass_value = isBoolean();

        return isComponentSizeClass_value;
    }
    /**
     * Check if this is an equality constraint function for the given type.
     * @attribute syn
     * @aspect OverconstrainedConnections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1433
     */
    @ASTNodeAnnotation.Attribute
    public boolean isEqualityConstraint(FType type) {
        ASTNode$State state = state();
        try {
        		ArrayList<InstComponentDecl> inputs = myInputs();
        		ArrayList<InstComponentDecl> outputs = myOutputs();
        		return isFunction() && 
        				inputs.size() == 2 && 
        				inputs.get(0).type().typeCompatible(type, true) && 
        				inputs.get(1).type().typeCompatible(type, true) && 
        				outputs.size() == 1 && 
        				outputs.get(0).ndims() == 1 && 
        				outputs.get(0).type().isReal();
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:528
     */
    @ASTNodeAnnotation.Attribute
    public InstExternal findFunctionExternal() {
        ASTNode$State state = state();
        try {
                for (InstExtends ie : getInstExtendss()) {
                    InstExternal tmp = ie.myInstClass().findFunctionExternal();
                    if (tmp != null) 
                        return tmp;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean localFunctionConstantList_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<InstAssignable> localFunctionConstantList_value;
    /**
     * @apilevel internal
     */
    private void localFunctionConstantList_reset() {
        localFunctionConstantList_computed = false;
        localFunctionConstantList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstAssignable> localFunctionConstantList() {
        if(localFunctionConstantList_computed) {
            return localFunctionConstantList_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        localFunctionConstantList_value = new LinkedHashSet<InstAssignable>();
        if (isFinal && num == state().boundariesCrossed) {
            localFunctionConstantList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return localFunctionConstantList_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsRedeclared() {
        ASTNode$State state = state();
        boolean containsRedeclared_value = false;

        return containsRedeclared_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(true);

        return extraNodesToSetModLevelFor_value;
    }
    /**
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2144
     */
    @ASTNodeAnnotation.Attribute
    public String localTempVarName(InstComponentDecl var) {
        ASTNode$State state = state();
        try {
                if (tempVarNames == null)
                    tempVarNames = new HashMap<InstComponentDecl,String>();
                if (tempVarNames.containsKey(var))
                    return tempVarNames.get(var);
                String name;
                do {
                    name = "temp_" + nextTempVarIndex++;
                } while (memberInstComponent(name).successful());
                tempVarNames.put(var, name);
                return name;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String nextTempVarName() {
        ASTNode$State state = state();
        String nextTempVarName_value = TEMP_VAR_PREFIX + ++incr;

        return nextTempVarName_value;
    }
    /**
     * Lookup upwards in tree for matching inner declaration.
     * 
     * @param outer  outer declaration we are searching for 
     * @attribute syn
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:71
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupInnerInstComponentNoLocal(InstComponentDecl outer, InstComponentDecl nonInner) {
        ASTNode$State state = state();
        try {
                String name = outer.name();
                InstGeneratedInner res = null;
                List<InstGeneratedInner> inners = getInstGeneratedInners();
                for (InstGeneratedInner node : inners) {
                    if (node.matches(name)) {
                        res = node;
                    }
                }
                
                if (res != null) {
                    res.addOuter(outer);
                } else {
                    res = new InstGeneratedInner(this, outer, nonInner);
                    inners.add(res);
                    inners.getChild(inners.getNumChild() - 1);  // Make sure res is final
                }
                return res.getInstComponentDecl();
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstGeneratedInners_computed = false;
    /**
     * @apilevel internal
     */
    protected List<InstGeneratedInner> getInstGeneratedInners_value;
    /**
     * @apilevel internal
     */
    private void getInstGeneratedInners_reset() {
        getInstGeneratedInners_computed = false;
        getInstGeneratedInners_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstGeneratedInner> getInstGeneratedInners() {
        if(getInstGeneratedInners_computed) {
            return getInstGeneratedInners_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstGeneratedInners_value = new List<InstGeneratedInner>();
        getInstGeneratedInners_value.setParent(this);
        getInstGeneratedInners_value.is$Final = true;
        if (true) {
            getInstGeneratedInners_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getInstGeneratedInners_value;
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
     * @attribute syn
     * @aspect InnerOuterClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:122
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInnerInstClassDecl() {
        ASTNode$State state = state();
        try {
                InstClassDecl res = null;
                if (isOuter()) 
                    res = lookupInnerInstClass(name(), true);
                else if (inOuter())
                    res = lookupInInnerInstClass(name());
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myConstructor() {
        ASTNode$State state = state();
        InstClassDecl myConstructor_value = memberInstClass("constructor").target(INST_UNKNOWN_CLASS, this);

        return myConstructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myDestructor() {
        ASTNode$State state = state();
        InstClassDecl myDestructor_value = memberInstClass("destructor").target(INST_UNKNOWN_CLASS, this);

        return myDestructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassRedirect(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassRedirect_String_value = actualInstClass().genericLookupInstClass(name);

        return lookupInstClassRedirect_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassInInstClassRedeclare(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassInInstClassRedeclare_String_value = InstLookupResult.notFound();

        return lookupInstClassInInstClassRedeclare_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassFromChain(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> superLookupInstClassFromChain_String_value = superLookupInstClass(name);

        return superLookupInstClassFromChain_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClassFromComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClassFromComponent_String_value = lookupLastRedeclareExtendsInstClass(name);

        return lookupRedeclareExtendsInstClassFromComponent_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl actualInstClass() {
        ASTNode$State state = state();
        InstClassDecl actualInstClass_value = this;

        return actualInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRedeclaredNonSimple() {
        ASTNode$State state = state();
        boolean isRedeclaredNonSimple_value = false;

        return isRedeclaredNonSimple_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClass() {
        ASTNode$State state = state();
        InstClassDecl myInstClass_value = this;

        return myInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = name().equals(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType primitiveScalarType() {
        ASTNode$State state = state();
        FType primitiveScalarType_value = isEnum() ? enumType() : super.primitiveScalarType();

        return primitiveScalarType_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean recordType_computed = false;
    /**
     * @apilevel internal
     */
    protected FRecordType recordType_value;
    /**
     * @apilevel internal
     */
    private void recordType_reset() {
        recordType_computed = false;
        recordType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordType recordType() {
        if(recordType_computed) {
            return recordType_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        recordType_value = recordType_compute();
        if (isFinal && num == state().boundariesCrossed) {
            recordType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return recordType_value;
    }
    /**
     * @apilevel internal
     */
    private FRecordType recordType_compute() {
            FRecordType type = createEmptyFRecordType(Size.SCALAR);
            for (InstComponentDecl icd : allInstComponentDecls()) 
                type.addComponent(new FRecordComponentType(icd.name(), (FType) icd.type().fullCopy()));
            return type;
        }
    @ASTNodeAnnotation.Attribute
    public FRecordType createEmptyFRecordType(Size s) {
        ASTNode$State state = state();
        FRecordType createEmptyFRecordType_Size_value = null;

        return createEmptyFRecordType_Size_value;
    }
    /**
     * @attribute syn
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:108
     */
    @ASTNodeAnnotation.Attribute
    public FType enumType() {
        ASTNode$State state = state();
        try {
                FEnumType type = new FEnumType(Size.SCALAR, qualifiedName(), new List());
                for (InstEnumLiteral el : enumLiterals()) 
                    type.addFEnumLiteralType(new FEnumLiteralType(Size.SCALAR, el.name()));
                return type;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionType functionType() {
        ASTNode$State state = state();
        FFunctionType functionType_value = getFunctionType();

        return functionType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionType getFunctionType() {
        ASTNode$State state = state();
        FFunctionType getFunctionType_value = getFunctionType_compute();
        setChild(getFunctionType_value, getFunctionTypeChildPosition());

        FFunctionType node = (FFunctionType) this.getChild(getFunctionTypeChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private FFunctionType getFunctionType_compute() {
            List<FRecordComponentType> inputTypes = new List();
            List<FRecordComponentType> outputTypes = new List();
            for (InstComponentDecl icd : myInputs())
                inputTypes.add(new FRecordComponentType(icd.name(), icd.type().treeCopy()));
            for (InstComponentDecl icd : myOutputs())
                outputTypes.add(new FRecordComponentType(icd.name(), icd.type().treeCopy()));
            return new FFunctionType(Size.SCALAR, actualInstClass().qualifiedName(), inputTypes, outputTypes, null);
        }
    @ASTNodeAnnotation.Attribute
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = finalClass().primitiveName().equals("Real");

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInteger() {
        ASTNode$State state = state();
        boolean isInteger_value = finalClass().primitiveName().equals("Integer");

        return isInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBoolean() {
        ASTNode$State state = state();
        boolean isBoolean_value = finalClass().primitiveName().equals("Boolean");

        return isBoolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isString() {
        ASTNode$State state = state();
        boolean isString_value = finalClass().primitiveName().equals("String");

        return isString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnum() {
        ASTNode$State state = state();
        boolean isEnum_value = extendsEnum();

        return isEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunction() {
        ASTNode$State state = state();
        boolean isPartialFunction_value = isPartial() && isFunction();

        return isPartialFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMeOrMyClass(InstNode node) {
        ASTNode$State state = state();
        boolean isMeOrMyClass_InstNode_value = node.inheritingNode() == this;

        return isMeOrMyClass_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartial() {
        ASTNode$State state = state();
        boolean isPartial_value = getClassDecl().isPartial();

        return isPartial_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEncapsulated() {
        ASTNode$State state = state();
        boolean isEncapsulated_value = getClassDecl().isEncapsulated();

        return isEncapsulated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConnector() {
        ASTNode$State state = state();
        boolean isConnector_value = false;

        return isConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnector() {
        ASTNode$State state = state();
        boolean isExpandableConnector_value = false;

        return isExpandableConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperatorRecord() {
        ASTNode$State state = state();
        boolean isOperatorRecord_value = false;

        return isOperatorRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOperator() {
        ASTNode$State state = state();
        boolean isOperator_value = false;

        return isOperator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = false;

        return isRecord_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCallable() {
        ASTNode$State state = state();
        boolean isCallable_value = false;

        return isCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPackage() {
        ASTNode$State state = state();
        boolean isPackage_value = false;

        return isPackage_value;
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
    /**
     * Is this class an external object?
     * @attribute syn
     * @aspect InstClassRestriction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:614
     */
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        try {
                for (InstExtends ie : getInstExtendss()) {
                    String name = ie.getClassName().name();
                    if (name.equals("ExternalObject"))
                        return true;
                }
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstRestriction() {
        ASTNode$State state = state();
        boolean hasInstRestriction_value = false;

        return hasInstRestriction_value;
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
                if (hasInstClassModification()) {
                    l.add(getInstClassModification());
                }
                l.addAll(instModificationsFromConstrainingType());
                return l;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsClass() {
        ASTNode$State state = state();
        Collection<InstModification> localInstModificationsClass_value = targetClassInstModifications();

        return localInstModificationsClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> targetClassInstModifications() {
        ASTNode$State state = state();
        java.util.List<InstModification> targetClassInstModifications_value = Collections.<InstModification>emptyList();

        return targetClassInstModifications_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:356
     */
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsForConstraining() {
        ASTNode$State state = state();
        try {
                if (hasInstConstrainingClass()) {
                    if (getInstConstrainingClass().hasInstClassModification())
                        return Collections.singletonList((InstModification) getInstConstrainingClass().getInstClassModification());
                } else {
                    if (hasInstClassModification())
                        return Collections.singletonList((InstModification) getInstClassModification());
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
    @ASTNodeAnnotation.Attribute
    public InstClassDecl originalInstClass() {
        ASTNode$State state = state();
        InstClassDecl originalInstClass_value = null;

        return originalInstClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstClassModification() {
        ASTNode$State state = state();
        boolean hasInstClassModification_value = false;

        return hasInstClassModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassModification getInstClassModification() {
        ASTNode$State state = state();
        InstClassModification getInstClassModification_value = null;

        return getInstClassModification_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean classInstModifications_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstModification> classInstModifications_value;
    /**
     * @apilevel internal
     */
    private void classInstModifications_reset() {
        classInstModifications_computed = false;
        classInstModifications_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstModification> classInstModifications() {
        if(classInstModifications_computed) {
            return classInstModifications_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        classInstModifications_value = getMergedEnvironment().clone();
        if (isFinal && num == state().boundariesCrossed) {
            classInstModifications_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return classInstModifications_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode instLookupNodeForShortClassExtends() {
        ASTNode$State state = state();
        InstNode instLookupNodeForShortClassExtends_value = null;

        return instLookupNodeForShortClassExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl redeclaringClassDecl() {
        ASTNode$State state = state();
        ClassDecl redeclaringClassDecl_value = getClassDecl();

        return redeclaringClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl redeclaringInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl redeclaringInstClassDecl_value = this;

        return redeclaringInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstRestriction inheritedRestriction(boolean checkMine) {
        ASTNode$State state = state();
        InstRestriction inheritedRestriction_boolean_value = null;

        return inheritedRestriction_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public String buildQualifiedOperatorName() {
        ASTNode$State state = state();
        String buildQualifiedOperatorName_value = combineName(instClassNamePrefix(true), name());

        return buildQualifiedOperatorName_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstEnumLiteral> enumLiterals() {
        ASTNode$State state = state();
        ArrayList<InstEnumLiteral> enumLiterals_value = extendsEnum() ? getInstExtends(0).myInstClass().enumLiterals() : new ArrayList<InstEnumLiteral>();

        return enumLiterals_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstConstrainingClass() {
        ASTNode$State state = state();
        boolean hasInstConstrainingClass_value = false;

        return hasInstConstrainingClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstConstrainingClass getInstConstrainingClass() {
        ASTNode$State state = state();
        InstConstrainingClass getInstConstrainingClass_value = null;

        return getInstConstrainingClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReplaceable() {
        ASTNode$State state = state();
        boolean isReplaceable_value = getClassDecl().hasReplaceable();

        return isReplaceable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClassDecl() {
        ASTNode$State state = state();
        boolean isClassDecl_value = true;

        return isClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsEnum() {
        ASTNode$State state = state();
        boolean extendsEnum_value = getNumInstExtends() == 1 && getInstExtends(0).extendsEnum();

        return extendsEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl getBaseInstClass() {
        ASTNode$State state = state();
        InstClassDecl getBaseInstClass_value = (getNumInstExtends() > 0) ? getInstExtends(0).getBaseInstClass() : this;

        return getBaseInstClass_value;
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
    @ASTNodeAnnotation.Attribute
    public OperatorMatches matchOverloadedOperators(FType a, FType b, boolean aIsLeft) {
        ASTNode$State state = state();
        OperatorMatches matchOverloadedOperators_FType_FType_boolean_value = OperatorMatches.EMPTY;

        return matchOverloadedOperators_FType_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstClassDecl> operatorFunctions() {
        ASTNode$State state = state();
        java.util.List<InstClassDecl> operatorFunctions_value = Collections.emptyList();

        return operatorFunctions_value;
    }
    /**
     * Check if this function matches the two given types as an overloaded operator.
     * 
     * @param a         an operand that is of the operator record type that contains this function
     * @param b         the other operand. If it is <code>null</code>, then the function should be unary.
     * @param aIsLeft   <code>true</code> if a is the left operand, must be true if b is <code>null</code>
     * @param indirect  if <code>true</code>, then look for a constructor that can convert b to fit this function
     * @attribute syn
     * @aspect OverloadedOperatorBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/OperatorRecords.jrag:398
     */
    @ASTNodeAnnotation.Attribute
    public boolean matchesAsOperatorFunction(FType a, FType b, boolean aIsLeft, boolean indirect) {
        ASTNode$State state = state();
        try {
                java.util.List<InstComponentDecl> inputs = myInputs();
                int n = inputs.size();
                InstComponentDecl in1 = (n > 0) ? inputs.get(0) : null;
                InstComponentDecl in2 = (n > 1) ? inputs.get(1) : null;
                InstComponentDecl ain = aIsLeft ? in1 : in2;
                InstComponentDecl bin = aIsLeft ? in2 : in1;
                
                // Check that function is unary in unary case and binary in binary case (since '-' can contain both)
                if ((n < 2 || in2.hasBindingFExp()) != (b == null))
                    return false;
                for (int i = 2; i < n; i++)
                    if (!inputs.get(i).hasBindingFExp())
                        return false;
                
                // Unary case
                if (b == null)
                    return ain != null && ain.type().typeCompatible(a);  // a matches first argument
                
                // Indirect binary case
                if (indirect) {
                    if (bin == null || !bin.type().isOperatorRecord())  // if b isn't an operator record, no indirect match
                        return false;
                    // Find constructor matching single argument
                    return ain != null && ain.type().typeCompatible(a, true) &&  // a matches its argument
                           bin.type().matchOverloadedConstructor(b) != null;     // there is a single matching constructor for b
                }
                
                // Direct binary case
                return ain != null && ain.type().typeCompatible(a, true) &&  // a matches its argument
                       bin != null && bin.type().typeCompatible(b, true);    // b matches its argument
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignable() {
        ASTNode$State state = state();
        boolean isAssignable_value = isPrimitive() || isRecord();

        return isAssignable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCompositeType() {
        ASTNode$State state = state();
        boolean isCompositeType_value = !isRecord() && !isPrimitive();

        return isCompositeType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecordType() {
        ASTNode$State state = state();
        boolean isRecordType_value = isRecord();

        return isRecordType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitiveType() {
        ASTNode$State state = state();
        boolean isPrimitiveType_value = isOrExtendsPrimitive();

        return isPrimitiveType_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingInstType() {
        ASTNode$State state = state();
        InstNode constrainingInstType_value = hasInstConstrainingClass() ? getInstConstrainingClass().getInstNode() : findConstrainingInstType();

        return constrainingInstType_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode findConstrainingInstType() {
        ASTNode$State state = state();
        InstNode findConstrainingInstType_value = this;

        return findConstrainingInstType_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getClassDecl().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublic() {
        ASTNode$State state = state();
        boolean isPublic_value = getClassDecl().isPublic();

        return isPublic_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isProtected() {
        ASTNode$State state = state();
        boolean isProtected_value = getClassDecl().isProtected();

        return isProtected_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInner() {
        ASTNode$State state = state();
        boolean isInner_value = getClassDecl().isInner();

        return isInner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOuter() {
        ASTNode$State state = state();
        boolean isOuter_value = getClassDecl().isOuter();

        return isOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl asInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl asInstClassDecl_value = this;

        return asInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstCallable actualInstCallable() {
        ASTNode$State state = state();
        InstCallable actualInstCallable_value = actualInstClass();

        return actualInstCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl actualInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl actualInstClassDecl_value = actualInstClass();

        return actualInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode asInstNode() {
        ASTNode$State state = state();
        InstNode asInstNode_value = this;

        return asInstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstCallable asCallable() {
        ASTNode$State state = state();
        InstCallable asCallable_value = this;

        return asCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl finalClass() {
        ASTNode$State state = state();
        InstClassDecl finalClass_value = this;

        return finalClass_value;
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
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = " \"" + name() + "\"";

        return extraMemoryUseInfo_value;
    }
    @ASTNodeAnnotation.Attribute
    public int smoothOrder() {
        ASTNode$State state = state();
        int smoothOrder_value = readSmoothOrderAnnotation(findSmoothOrderAnnotationRoot());

        return smoothOrder_value;
    }
    /**
     * If this class is in an operator record or in a package in an operator record, find that operator record.
     * @attribute inh
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:713
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myOperatorRecord() {
        ASTNode$State state = state();
        InstClassDecl myOperatorRecord_value = getParent().Define_myOperatorRecord(this, null);

        return myOperatorRecord_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1201
     */
    @ASTNodeAnnotation.Attribute
    public boolean inExternalObject() {
        ASTNode$State state = state();
        boolean inExternalObject_value = getParent().Define_inExternalObject(this, null);

        return inExternalObject_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:361
     * @apilevel internal
     */
    public ArrayList<FArraySubscripts> Define_surroundingFArraySubscripts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new ArrayList<FArraySubscripts>(0);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:115
     * @apilevel internal
     */
    public boolean Define_isConstructorStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isConstructor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:120
     * @apilevel internal
     */
    public boolean Define_isDestructorStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isDestructor();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2342
     * @apilevel internal
     */
    public boolean Define_inRecordDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isRecord();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FQNameEmpty();
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:202
     * @apilevel internal
     */
    public boolean Define_isForOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isOperatorRecord();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:713
     * @apilevel internal
     */
    public InstClassDecl Define_myOperatorRecord(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isOperatorRecord() ? this : (isPackage() ? myOperatorRecord() : null);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:421
     * @apilevel internal
     */
    public boolean Define_lockBranch(ASTNode caller, ASTNode child, ErrorCheckType checkType) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:640
     * @apilevel internal
     */
    public boolean Define_inInstComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:336
     * @apilevel internal
     */
    public boolean Define_isInRedeclareMod(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
        return src;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2701
     * @apilevel internal
     */
    public InstComponentDecl Define_findExpandableAncestor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2714
     * @apilevel internal
     */
    public InstComponentDecl Define_ancestorChild(ASTNode caller, ASTNode child, InstComponentDecl a, InstComponentDecl c) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:736
     * @apilevel internal
     */
    public FQName Define_expandedFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FQNameFull();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:755
     * @apilevel internal
     */
    public Set<InstAssignable> Define_functionConstantList(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return localFunctionConstantList();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1369
     * @apilevel internal
     */
    public FExp Define_splitBindingFExp(ASTNode caller, ASTNode child, FExp fe, InstNode node) {
        int childIndex = this.getIndexOfChild(caller);
        return fe;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1576
     * @apilevel internal
     */
    public InstValueModification Define_parentInstValueMod(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1742
     * @apilevel internal
     */
    public InstNode Define_parentNodeToSetModLevelFor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return hasModificationLevel() ? null : this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2139
     * @apilevel internal
     */
    public String Define_findTempVarName(ASTNode caller, ASTNode child, InstComponentDecl var) {
        int childIndex = this.getIndexOfChild(caller);
        return localTempVarName(var);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2656
     * @apilevel internal
     */
    public FQName Define_sizeFlatteningPrefix(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FQNameEmpty();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningStatements.jrag:183
     * @apilevel internal
     */
    public String Define_myTempVarName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                String sqn = "";
                while (componentExists(sqn = nextTempVarName())) {}
                return name() + "." + sqn;
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:21
     * @apilevel internal
     */
    public boolean Define_inOuter(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:27
     * @apilevel internal
     */
    public boolean Define_inInner(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:146
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInInnerInstClass(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return myInnerInstClassDecl().memberInstClass(name).targetOrNull();
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:346
     * @apilevel internal
     */
    public InstClassDecl Define_surroundingInstClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:354
     * @apilevel internal
     */
    public boolean Define_inArrayComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:196
     * @apilevel internal
     */
    public FTypePrefixVariability Define_parentDefaultVariability(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2044
     * @apilevel internal
     */
    public boolean Define_isInClassDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2146
     * @apilevel internal
     */
    public InstComponentDecl Define_containingInstComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2321
     * @apilevel internal
     */
    public InstNode Define_containingInstClassDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2600
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return buildInstanceName(this, new FQNameEmpty());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:738
     * @apilevel internal
     */
    public String Define_topPackagePath(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
        	  String path = topPackagePath();
        	  return (path == null) ? dirName() : path;
          }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1131
     * @apilevel internal
     */
    public boolean Define_inProtectedComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1306
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsInputOutputFrom(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1329
     * @apilevel internal
     */
    public boolean Define_isTopLevel(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1359
     * @apilevel internal
     */
    public InstComponentDecl Define_inheritsFlowFrom(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1458
     * @apilevel internal
     */
    public boolean Define_inDisabledComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
