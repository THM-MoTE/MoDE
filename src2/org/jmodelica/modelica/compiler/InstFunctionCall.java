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
 * Generic function call expression in instance trees.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1299
 * @production InstFunctionCall : {@link CommonFunctionCall} ::= <span class="component">Name:{@link InstAccess}</span> <span class="component">Arg:{@link InstFunctionArgument}*</span> <span class="component">{@link FType}</span>;

 */
public class InstFunctionCall extends CommonFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3347
     */
    @Override
    public void evaluateCell(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        myCommonCallable().evaluate(evaluator, values);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1113
     */
    public InstFunctionCall createEmptyNode()        { return new InstFunctionCall();        }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1785
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print(getName().name());
		str.print("(");
		getArgs().prettyPrintWithSep(p, str, "", ", ");
		str.print(")");
	}
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:516
     */
    public FExp copyReplaceAccess(FExp.ContextReplacer crp) {
        InstAccess name = InstAccess.fromName(getName().myInstCallable().actualInstCallable().qualifiedName());
        return new InstFunctionCall(name, getArgs().copyReplaceAccess(crp));
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:400
     */
    public void complianceCheck(ErrorCheckType checkType) {
        if (isConstructorCall() && isBound() && inFunction()) {
            UNSUPPORTED_EXTERNAL_OBJECT_CONSTRUCTORS.invoke(this);
        }
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:210
     */
    public void contentCheck(ErrorCheckType checkType) {
       if (generated) {
           if (isConstructorCall()) {
               if (!isBound()) {
                   error("Constructors for external objects can only be used as binding expressions");
               }
           }
       } else {
			InstClassDecl target = getName().myInstClassDecl();
			if (target.isConstructor() || target.isDestructor())
				error("Constructors and destructors for ExternalObjects can not be used directly");
		}
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1279
     */
    public void collectErrors(ErrorCheckType checkType) {
        if (!errorChecked) {
            errorChecked = true;
            // Check that the function exists
            InstLookupResult<InstCallable> lp = getName().myInstLookupCallable();
            InstCallable func = getName().myInstCallable();
            String name = getName().name();
            if (lp.isError()) {
                // Function does not exist or can't be used due to constraining classes, or name refers to component
                getName().generateClassLookupProblems(lp, this);
            } else if (!func.isCallable()) {
                if (func.isExternalObject()) {
                    // Something is be wrong with constructor
                    name += ".constructor";
                    func = func.asInstClassDecl().myConstructor();
                    if (func.isUnknown()) {
                        // The constructor does not exist
                        error("Cannot find function declaration for " + name + "()");
                    }
                    // Constructor exists, but is not a function - delegate to default case
                }
                if (!func.isUnknown()) {
                    // Not a function
                    error("The class " + name + " is not a function");
                }
            } else if (!func.isRecord() && !func.isCompleteFunction()) {
                // TODO: add check if function is partial?
                if (!checkType.allowIncompleteReplaceableFunc() || !canBeReplacedForMe(func.asInstNode()))
                    error("Calling function " + getName().name() + 
                            "(): can only call functions that have one algorithm section or external function specification");
            } else {
                // Function exists, check everything
                errorChecked = false; // super also uses errorChecked
                super.collectErrors(checkType);
                
                // We need to check the function definition as well.
                func.collectErrors(checkType);
                
                // Check if there were any unbindable args
                boolean pos = true;
                String desc = functionCallDecription();
                for (InstFunctionArgument arg : unbindableArgs) 
                    pos = arg.generateUnbindableError(desc, pos);
            }
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1098
     */
    public void typeCheck(ErrorCheckType checkType) {
        if (!isFunctionCallClause() && !getName().myInstClassDecl().isRecord() && !hasOutputs() && !isPartialFunctionCall()) {
            error("Function " + getName().name() + "() has no outputs, but is used in expression");
        } else if (!isFunctionCallClause() && !inFunction() && size().isUnknown()) {
            CANNOT_INFER_ARRAY_SIZE_OF_OUTPUT.invoke(this, expOutput().name());
        }
        if (myCallOutputs().size() < myLefts().size()) {
            error("Too many components assigned from function call: " + getName().name() + 
                    "() has " + myCallOutputs().size() + " output(s)");
        }
        if (!inFunction()) {
            if (isFunctionCallClause()) {
                for (int i = 0, n = myCallOutputs().size(); i < n; i++) {
                    sizeOfOutput(i).markAsStructuralParameter(checkType);
                }
            } else {
                size().markAsStructuralParameter(checkType);
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:202
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        InstCallable target = myInstCallable();
        target.flattenFunction(fc);
        getArgs().flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2707
     */
    public FFunctionCall flatten(FQName prefix) {
        List args = new List();
        for (InstFunctionArgument e : getArgs()) 
            args.add(e.flatten(prefix));
        InstCallable target = myInstCallable().actualInstCallable();
        FIdUse name = new FIdUse(new FQNameString(target.qualifiedName()));
        return createFFunctionCall(name, args, getFType().flatten(new FQNameEmpty(), null, true));
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2716
     */
    public FFunctionCall createFFunctionCall(FIdUse name, List args, FType type) {
        return new FFunctionCall(name, args, type);
    }
    /**
     * List of arguments that could not be bound to inputs.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:150
     */
    private java.util.List<InstFunctionArgument> unbindableArgs     = Collections.emptyList();
    /**
     * Add a new argument to list of arguments.
     * 
     * This implementation adds the argument as a child.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:208
     */
    public void addArgument(InstFunctionArgument arg) {
		addArg(arg);
	}
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:224
     */
    

        private static BuiltInTranslator builtInTranslator = new BuiltInTranslator();
    /**
     * Helper class for rewrite InstFunctionCall -> FAbstractFunctionCall. 
     * 
     * Creates an instance of the specific subclass of FBuiltInFunctionCall matching 
     * the name of the function, if one matches. 
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:232
     */
    
        
        /**
         * Helper class for rewrite InstFunctionCall -> FAbstractFunctionCall. 
         * 
         * Creates an instance of the specific subclass of FBuiltInFunctionCall matching 
         * the name of the function, if one matches. 
         */
        private static class BuiltInTranslator {

            private HashMap<String, BuiltInCreator> map;
            private static final String MATH_PREF = "Modelica.Math.";
            private static final int MATH_LEN = MATH_PREF.length();

            /* Built-In-Type*/
            public enum BIT {
                NONE, MATH
            }

            public FBuiltInFunctionCall create(String name, InstFunctionArgument[] args) {
                boolean math = name.startsWith(MATH_PREF);
                if (math) 
                    name = name.substring(MATH_LEN);
                BuiltInCreator creator = map.get(name);
                if (creator == null || (math && !creator.match(BIT.MATH)))
                    return null;
                FBuiltInFunctionCall res = creator.create(args);
                if (res != null)
                    for (InstFunctionArgument arg : args)
                        res.addToOriginalArgs(arg);
                return res;
            }

            public boolean isInfArgs(String name) {
                BuiltInCreator creator = map.get(name);
                return creator != null && creator.isInfArgs();
            }


            public BuiltInTranslator() {
                map = new HashMap<String, BuiltInCreator>();
                //       name                                 math       node                # args
                map.put("abs",             new BuiltInCreator(BIT.NONE, new FAbsExp(),          1));
                map.put("sign",            new BuiltInCreator(BIT.NONE, new FSignExp(),         1));
                map.put("sqrt",            new BuiltInCreator(BIT.NONE, new FSqrtExp(),         1));
                map.put("Integer",         new BuiltInCreator(BIT.NONE, new FEnumIntegerExp(),  1));
                map.put("div",             new BuiltInCreator(BIT.NONE, new FDivFuncExp(),      2));
                map.put("mod",             new BuiltInCreator(BIT.NONE, new FModFuncExp(),      2));
                map.put("rem",             new BuiltInCreator(BIT.NONE, new FRemFuncExp(),      2));
                map.put("ceil",            new BuiltInCreator(BIT.NONE, new FCeilFuncExp(),     1));
                map.put("floor",           new BuiltInCreator(BIT.NONE, new FFloorFuncExp(),    1));
                map.put("integer",         new BuiltInCreator(BIT.NONE, new FIntegerFuncExp(),  1));
                map.put("sin",             new BuiltInCreator(BIT.MATH, new FSinExp(),          1));
                map.put("cos",             new BuiltInCreator(BIT.MATH, new FCosExp(),          1));
                map.put("tan",             new BuiltInCreator(BIT.MATH, new FTanExp(),          1));
                map.put("asin",            new BuiltInCreator(BIT.MATH, new FAsinExp(),         1));
                map.put("acos",            new BuiltInCreator(BIT.MATH, new FAcosExp(),         1));
                map.put("atan",            new BuiltInCreator(BIT.MATH, new FAtanExp(),         1));
                map.put("atan2",           new BuiltInCreator(BIT.MATH, new FAtan2Exp(),        2));
                map.put("sinh",            new BuiltInCreator(BIT.MATH, new FSinhExp(),         1));
                map.put("cosh",            new BuiltInCreator(BIT.MATH, new FCoshExp(),         1));
                map.put("tanh",            new BuiltInCreator(BIT.MATH, new FTanhExp(),         1));
                map.put("exp",             new BuiltInCreator(BIT.MATH, new FExpExp(),          1));
                map.put("log",             new BuiltInCreator(BIT.MATH, new FLogExp(),          1));
                map.put("log10",           new BuiltInCreator(BIT.MATH, new FLog10Exp(),        1));
                map.put("noEvent",         new BuiltInCreator(BIT.NONE, new FNoEventExp(),      1));
                map.put("smooth",          new BuiltInCreator(BIT.NONE, new FSmoothExp(),       2));
                map.put("pre",             new BuiltInCreator(BIT.NONE, new InstPreExp(),       1));
                map.put("edge",            new BuiltInCreator(BIT.NONE, new FEdgeExp(),         1));
                map.put("change",          new BuiltInCreator(BIT.NONE, new FChangeExp(),       1));
                map.put("sample",          new BuiltInCreator(BIT.NONE, new FSampleExp(),       2));
                map.put("initial",         new BuiltInCreator(BIT.NONE, new FInitialExp(),      0));
                map.put("terminal",        new BuiltInCreator(BIT.NONE, new FTerminalExp(),     0));
                map.put("terminate",       new BuiltInCreator(BIT.NONE, new FTerminate(),       1));
                map.put("reinit",          new BuiltInCreator(BIT.NONE, new FReinit(),          2));
                map.put("identity",        new BuiltInCreator(BIT.NONE, new FIdentity(),        1));
                map.put("diagonal",        new BuiltInCreator(BIT.NONE, new FDiagonal(),        1));
                map.put("scalar",          new BuiltInCreator(BIT.NONE, new FScalarExp(),       1));
                map.put("vector",          new BuiltInCreator(BIT.NONE, new FVectorExp(),       1));
                map.put("matrix",          new BuiltInCreator(BIT.NONE, new FMatrixExp(),       1));
                map.put("transpose",       new BuiltInCreator(BIT.NONE, new FTranspose(),       1));
                map.put("symmetric",       new BuiltInCreator(BIT.NONE, new FSymmetric(),       1));
                map.put("cross",           new BuiltInCreator(BIT.NONE, new FCross(),           2));
                map.put("skew",            new BuiltInCreator(BIT.NONE, new FSkew(),            1));
                map.put("outerProduct",    new BuiltInCreator(BIT.NONE, new FOuterProduct(),    2));
                map.put("sum",             new BuiltInCreator(BIT.NONE, new FSumExp(),          1));
                map.put("product",         new BuiltInCreator(BIT.NONE, new FProductExp(),      1));
                map.put("ndims",           new BuiltInCreator(BIT.NONE, new FNdimsExp(),        1));
                map.put("linspace",        new BuiltInCreator(BIT.NONE, new FLinspace(),        3));
                map.put("homotopy",        new BuiltInCreator(BIT.NONE, new FHomotopyExp(),     2));
                map.put("semiLinear",      new BuiltInCreator(BIT.NONE, new FSemiLinearExp(),   3));
                map.put("inStream",        new BuiltInCreator(BIT.NONE, new FInStream(),        1));
                map.put("actualStream",    new BuiltInCreator(BIT.NONE, new FActualStream(),    1));
                map.put("cardinality",     new BuiltInCreator(BIT.NONE, new FCardinality(),     1));
                map.put("getInstanceName", new BuiltInCreator(BIT.NONE, new FGetInstanceName(), 0));
                map.put("Subtask.decouple", 
                        new BuiltInCreator(BIT.NONE, new FDecouple(),     1));
                map.put("Modelica.Utilities.Files.loadResource", 
                        new BuiltInCreator(BIT.NONE, new FLoadResource(), 1));
                map.put("ModelicaServices.ExternalReferences.loadResource", 
                        new BuiltInCreator(BIT.NONE, new FLoadResource(), 1));
                //       name                                            node           # fixed args
                map.put("array",           new InfArgsBuiltInCreator(new FParseArray(), 0));
                map.put("ones",            new InfArgsBuiltInCreator(new FOnes(),       0));
                map.put("zeros",           new InfArgsBuiltInCreator(new FZeros(),      0));
                map.put("fill",            new InfArgsBuiltInCreator(new FFillExp(),    1));
                map.put("cat",             new InfArgsBuiltInCreator(new FCatExp(),     1));
                //       name                                            node          min/max # args
                map.put("size",            new VarArgsBuiltInCreator(new FSizeExp(),   1, 2));
                map.put("String",          new VarArgsBuiltInCreator(new FStringExp(), 1, 5));
                map.put("min",             new VarArgsBuiltInCreator(new FMinExp(),    1, 2));
                map.put("max",             new VarArgsBuiltInCreator(new FMaxExp(),    1, 2));
                map.put("assert",          new VarArgsBuiltInCreator(new FAssert(),    2, 3));
                map.put("delay",           new VarArgsBuiltInCreator(new FDelayExp(),  2, 3));
                map.put("spatialDistribution", new VarArgsBuiltInCreator(new FSpatialDistExp(), 4, 6, true));
                //       name                                    math       node              # args
                map.put("Connections.branch", new BuiltInCreator(BIT.NONE, new FConnBranch(),    2));
                map.put("Connections.root",   new BuiltInCreator(BIT.NONE, new FConnRoot(),      1));
                map.put("Connections.isRoot", new BuiltInCreator(BIT.NONE, new FConnIsRoot(),    1));
                map.put("Connections.rooted", new BuiltInCreator(BIT.NONE, new FConnRooted(),    1));
                map.put("rooted",             new BuiltInCreator(BIT.NONE, new FConnRootedDep(), 1));
                //       name                                                      node                  min/max # args
                map.put("Connections.potentialRoot", new VarArgsBuiltInCreator(new FConnPotentialRoot(), 1, 2));
                
                String[] unsupported = new String[] { 
                        // Ticket 664: Support all function-like operators
                    };
                for (String name : unsupported)
                    if (!map.containsKey(name))
                        map.put(name, new UnsupportedBuiltInCreator(name));
                
                // Not used anymore, but left for possible future needs
                String[] ignored = new String[] {};
                for (String name : ignored)
                    if (!map.containsKey(name))
                        map.put(name, new IgnoredBuiltInCreator(name));
            }

			private static class BuiltInCreator {
				
                protected BIT type;
				protected FBuiltInFunctionCall template;
				protected int numArgs;
				
                public BuiltInCreator(BIT t, FBuiltInFunctionCall tmpl, int nArgs) { 
                    type = t;
					template = tmpl;
					numArgs = nArgs;
				}
				
				public FBuiltInFunctionCall create(InstFunctionArgument[] args) {
					if (args.length < numArgs)
						return null;
					FBuiltInFunctionCall res = template.createEmptyNode();
					setArguments(res, args);
					return res;
				}
				
				protected void setArguments(FBuiltInFunctionCall res, InstFunctionArgument[] args) {
					for (int i = 0; i < numArgs; i++)
						res.setChild(extractFExp(args[i]), i);
				}
				
				public boolean isInfArgs() {
					return false;
				}
				
				protected static FExp extractFExp(InstFunctionArgument arg) {
					return arg.getFExpNoTransform().fullCopy();
				}
				
                public boolean match(BIT t) {
                    return type == t;
                }
				
			}
			
			private static class InfArgsBuiltInCreator extends BuiltInCreator {
				
				public InfArgsBuiltInCreator(FBuiltInFunctionCall tmpl, int nFixed) {
				    super(BIT.NONE, tmpl, nFixed);
				}
				
				protected void setArguments(FBuiltInFunctionCall res, InstFunctionArgument[] args) {
					List<FExp> exps = new List<FExp>();
					for (int i = numArgs; i < args.length; i++)
						exps.add(extractFExp(args[i]));
					res.setChild(exps, 0);
					for (int i = 0; i < numArgs; i++)
						res.setChild(extractFExp(args[i]), i + 1);
				}
				
				public boolean isInfArgs() {
					return true;
				}
				
			}
			
			private static class VarArgsBuiltInCreator extends BuiltInCreator {
                private int maxArgs;
                public boolean generateMissing = false;
                
                public VarArgsBuiltInCreator(FBuiltInFunctionCall tmpl, int minArgs, int maxArgs) {
                    this(tmpl, minArgs, maxArgs, false);
                }
                
                public VarArgsBuiltInCreator(FBuiltInFunctionCall tmpl, int minArgs, int maxArgs, boolean generateMissing) {
                    super(BIT.NONE, tmpl, minArgs);
                    this.maxArgs = maxArgs;
                    this.generateMissing = generateMissing;
                }
                
                protected void setArguments(FBuiltInFunctionCall res, InstFunctionArgument[] args) {
                    super.setArguments(res, args);
                    for (int i = numArgs; i < maxArgs; i++) {
                        if (generateMissing) {
                            res.setChild(extractFExp(args[i]), i);
                        } else {
                            res.setChild(args[i].isGiven() ? new Opt(extractFExp(args[i])) : new Opt(), i);
                        }
                    }
                }
			}
			
			private static class UnsupportedBuiltInCreator extends InfArgsBuiltInCreator {
				
				private static final FUnsupportedBuiltIn tmpl = new FUnsupportedBuiltIn();
				
				private String name;
				
				public UnsupportedBuiltInCreator(String name) {
					this(name, tmpl);
				}
				
				protected UnsupportedBuiltInCreator(String name, FUnsupportedBuiltIn tmpl2) {
					super(tmpl2, 0);
					this.name = name;
				}
				
				protected void setArguments(FBuiltInFunctionCall res, InstFunctionArgument[] args) {
					((FUnsupportedBuiltIn) res).setName(name);
				}
				
			}
			
			private static class IgnoredBuiltInCreator extends UnsupportedBuiltInCreator {
				
				private static final FIgnoredBuiltIn tmpl = new FIgnoredBuiltIn();
				
				public IgnoredBuiltInCreator(String name) {
					super(name, tmpl);
				}
				
			}
			
		}
    /**
     * Select the function in the given operator for the given type that best fits this call, and 
     * create an argument binding for it.
     * 
     * Returns null if the type does not have any functions for that operator.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:677
     */
    public ArgumentBinding matchOverloadedFunctionCall(FType type, String operator) {
        ArgumentBinding binding = null;
        InstClassDecl op = type.getOperators().get(operator);
        if (op != null) {
            int score = Integer.MAX_VALUE;
            for (InstClassDecl func : op.operatorFunctions()) {
                ArgumentBinding binding2 = new ArgumentBinding(func, this, false);
                int score2 = binding2.typeMatchScore();
                if (score2 < score) {
                    score = score2;
                    binding = binding2;
                }
            }
            if (binding != null)
                binding.updateBoundInputs();
        }
        return binding;
    }
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:791
     */
    private boolean bound = false;
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:792
     */
    public boolean generated = false;
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:853
     */
    private boolean vectorizationChecked = false;
    /**
     * @declaredat ASTNode:1
     */
    public InstFunctionCall() {
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
        children = new ASTNode[4];
        setChild(new List(), 1);
    }
    /**
     * @declaredat ASTNode:14
     */
    public InstFunctionCall(InstAccess p0, List<InstFunctionArgument> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 2;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        cevalFunction_VariableEvaluator_reset();
        type_reset();
        getFType_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:51
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public InstFunctionCall clone() throws CloneNotSupportedException {
        InstFunctionCall node = (InstFunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public InstFunctionCall copy() {
        try {
            InstFunctionCall node = (InstFunctionCall) clone();
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
     * @declaredat ASTNode:83
     */
    public InstFunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public InstFunctionCall treeCopyNoTransform() {
        InstFunctionCall tree = (InstFunctionCall) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 2:
                case 3:
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
     * @declaredat ASTNode:118
     */
    public InstFunctionCall treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:125
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
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
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<InstFunctionArgument> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the Arg list.
     * @return Number of children in the Arg list.
     * @apilevel high-level
     */
    public int getNumArg() {
        return getArgList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Arg list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Arg list.
     * @apilevel low-level
     */
    public int getNumArgNoTransform() {
        return getArgListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Arg list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Arg list.
     * @apilevel high-level
     */
    public InstFunctionArgument getArg(int i) {
        return (InstFunctionArgument) getArgList().getChild(i);
    }
    /**
     * Check whether the Arg list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasArg() {
        return getArgList().getNumChild() != 0;
    }
    /**
     * Append an element to the Arg list.
     * @param node The element to append to the Arg list.
     * @apilevel high-level
     */
    public void addArg(InstFunctionArgument node) {
        List<InstFunctionArgument> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(InstFunctionArgument node) {
        List<InstFunctionArgument> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(InstFunctionArgument node, int i) {
        List<InstFunctionArgument> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<InstFunctionArgument> getArgList() {
        List<InstFunctionArgument> list = (List<InstFunctionArgument>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgListNoTransform() {
        return (List<InstFunctionArgument>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<InstFunctionArgument> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<InstFunctionArgument> getArgsNoTransform() {
        return getArgListNoTransform();
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(2);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
        return 2;
    }
    /**
     * Retrieves the FType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FType child.
     * @apilevel low-level
     */
    public FType getFTypeNoTransform() {
        return (FType) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child FType.
     * @return The the child position of the optional child FType.
     * @apilevel low-level
     */
    protected int getFTypeChildPosition() {
        return 3;
    }
    /**
     * @apilevel internal
     */
    protected boolean ndims_computed = false;
    /**
     * @apilevel internal
     */
    protected int ndims_value;
    /**
     * @apilevel internal
     */
    private void ndims_reset() {
        ndims_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        if(ndims_computed) {
            return ndims_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ndims_value = hasOutputs() ? expOutput().ndims() : -1;
        if (isFinal && num == state().boundariesCrossed) {
            ndims_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

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
        size_value = hasOutputs() ? sizeOfOutput(0) : Size.SCALAR;
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
    protected boolean getArray_computed = false;
    /**
     * @apilevel internal
     */
    protected Array getArray_value;
    /**
     * @apilevel internal
     */
    private void getArray_reset() {
        getArray_computed = false;
        getArray_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Array getArray() {
        if(getArray_computed) {
            return (Array) getChild(getArrayChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getArray_value = getArray_compute();
        setChild(getArray_value, getArrayChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getArray_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Array node = (Array) this.getChild(getArrayChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private Array getArray_compute() {
            if (!isArray())
                return super.getArray();
            if (variability().knownParameterOrLess()) {
                Array arr = new Array(indices());
                CValueArray carr = (CValueArray) cevalArray(Index.NULL);
                for (Index i : arr.indices()) {
                    arr.set(i, carr.getCell(i).buildInstLiteral());
                }
                return arr;
            }
            return super.getArray();
        }
    @ASTNodeAnnotation.Attribute
    public CValue cevalArray(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue cevalArray_VariableEvaluator_Index_value = cevalCalc(evaluator);

        return cevalArray_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = hasOutputs() ? evaluate(evaluator)[0] : CValue.UNKNOWN;

        return cevalCalc_VariableEvaluator_value;
    }
    protected Map cevalFunction_VariableEvaluator_values;
    /**
     * @apilevel internal
     */
    private void cevalFunction_VariableEvaluator_reset() {
        cevalFunction_VariableEvaluator_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public CValue[] cevalFunction(VariableEvaluator evaluator) {
        Object _parameters = evaluator;
        if (cevalFunction_VariableEvaluator_values == null) cevalFunction_VariableEvaluator_values = new HashMap(4);
        if(cevalFunction_VariableEvaluator_values.containsKey(_parameters)) {
            return (CValue[])cevalFunction_VariableEvaluator_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        CValue[] cevalFunction_VariableEvaluator_value = evaluate(evaluator);
        if (isFinal && num == state().boundariesCrossed) {
            cevalFunction_VariableEvaluator_values.put(_parameters, cevalFunction_VariableEvaluator_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return cevalFunction_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp argument(int i) {
        ASTNode$State state = state();
        FExp argument_int_value = getArg(i).getFExp();

        return argument_int_value;
    }
    /**
     * @attribute syn
     * @aspect CircularExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4682
     */
    @ASTNodeAnnotation.Attribute
    public boolean isCircularCalc() {
        ASTNode$State state = state();
        try {
        		for (InstFunctionArgument a : getArgs())
        			if (a.isCircular())
        				return true;
        		return false;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasCompositeFunc() {
        ASTNode$State state = state();
        boolean hasCompositeFunc_value = type().isArray() || type().isRecord() || super.hasCompositeFunc();

        return hasCompositeFunc_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getNameNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonCallable myCommonCallable() {
        ASTNode$State state = state();
        CommonCallable myCommonCallable_value = myInstCallable();

        return myCommonCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myCallInputs() {
        ASTNode$State state = state();
        ArrayList<InstComponentDecl> myCallInputs_value = myInstCallable().myCallInputs();

        return myCallInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myCallOutputs() {
        ASTNode$State state = state();
        ArrayList<InstComponentDecl> myCallOutputs_value = myInstCallable().myOutputs();

        return myCallOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOutputs() {
        ASTNode$State state = state();
        boolean hasOutputs_value = !myCallOutputs().isEmpty();

        return hasOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl expOutput() {
        ASTNode$State state = state();
        InstComponentDecl expOutput_value = myCallOutputs().get(0);

        return expOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findOutput(int i) {
        ASTNode$State state = state();
        InstComponentDecl findOutput_int_value = (i >= myCallOutputs().size()) ? unknownInstComponentDecl() : myCallOutputs().get(i);

        return findOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType typeOfOutput(int i) {
        ASTNode$State state = state();
        FType typeOfOutput_int_value = getFType().component(i);

        return typeOfOutput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructorCall() {
        ASTNode$State state = state();
        boolean isConstructorCall_value = getName().myInstClassDecl().isConstructor();

        return isConstructorCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructorCall() {
        ASTNode$State state = state();
        boolean isDestructorCall_value = getName().myInstClassDecl().isDestructor();

        return isDestructorCall_value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:375
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability total = fConstant();
                for (InstFunctionArgument arg : getArgs()) 
                    if (arg.isOKArg())
                        total = total.combine(arg.getFExp().variability().combine());
                return total;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String functionCallDecription() {
        ASTNode$State state = state();
        String functionCallDecription_value = getName().myInstClassDecl().isRecord() ? 
        			"Record constructor for " + name() : super.functionCallDecription();

        return functionCallDecription_value;
    }
    @ASTNodeAnnotation.Attribute
    public String classErrorType() {
        ASTNode$State state = state();
        String classErrorType_value = "function";

        return classErrorType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String classErrorName() {
        ASTNode$State state = state();
        String classErrorName_value = name() + "()";

        return classErrorName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunctionCall() {
        ASTNode$State state = state();
        boolean isPartialFunctionCall_value = false;

        return isPartialFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myInputsToBind(InstCallable target) {
        ASTNode$State state = state();
        ArrayList<InstComponentDecl> myInputsToBind_InstCallable_value = target.myCallInputs();

        return myInputsToBind_InstCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = getName().myInstClassDecl();

        return myInstClassDecl_value;
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
        type_value = hasOutputs() ? typeOfOutput(0) : fUnknownType();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionType declType() {
        ASTNode$State state = state();
        FFunctionType declType_value = myInstCallable().actualInstClassDecl().functionType();

        return declType_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFType_computed = false;
    /**
     * @apilevel internal
     */
    protected FType getFType_value;
    /**
     * @apilevel internal
     */
    private void getFType_reset() {
        getFType_computed = false;
        getFType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType getFType() {
        if(getFType_computed) {
            return (FType) getChild(getFTypeChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFType_value = declType().removeInputs().createSizeFExp(this);
        setChild(getFType_value, getFTypeChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FType node = (FType) this.getChild(getFTypeChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public InstCallable myInstCallable() {
        ASTNode$State state = state();
        InstCallable myInstCallable_value = getName().myInstCallable();

        return myInstCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonVectorizedFunctionCall() {
        ASTNode$State state = state();
        boolean isNonVectorizedFunctionCall_value = true;

        return isNonVectorizedFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public int smoothOrder() {
        ASTNode$State state = state();
        int smoothOrder_value = myInstClassDecl().smoothOrder();

        return smoothOrder_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2844
     * @apilevel internal
     */
    public CommonVariableDecl Define_myCorrespondingInput(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return myInstCallable().myCallInputs().get(i);
        }
        else {
            return getParent().Define_myCorrespondingInput(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2891
     * @apilevel internal
     */
    public boolean Define_isBound(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return false;
        }
        else {
            return getParent().Define_isBound(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1738
     * @apilevel internal
     */
    public FAbstractFunctionCall Define_myFunctionCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1197
     * @apilevel internal
     */
    public boolean Define_isDestructorArgument(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return isDestructorCall();
        }
        else {
            return super.Define_isDestructorArgument(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2104
     * @apilevel internal
     */
    public int Define_findDepthOfNestledFunctionCalls(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 1 + findDepthOfNestledFunctionCalls();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     * @apilevel internal
     */
    public Kind Define_kind(ASTNode caller, ASTNode child) {
        if (caller == getNameNoTransform()) {
            return Kind.AMBIGUOUS_ACCESS;
        }
        else {
            return getParent().Define_kind(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:709
        if (!bound) {
            state().duringInstFunctionBinding++;
            ASTNode result = rewriteRule0();
            state().duringInstFunctionBinding--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:830
        if (bound && !vectorizationChecked) {
            state().duringInstFunctionBinding++;
            ASTNode result = rewriteRule1();
            state().duringInstFunctionBinding--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:709
     * @apilevel internal
     */
    private FAbstractFunctionCall rewriteRule0() {
{
            // Make sure we only do this once.
            bound = true;

            // Get info
            boolean generated = this.generated;
            InstCallable target = getName().myInstCallable();
            InstCallable namedTarget = target;
            String name = target.qualifiedName();
            ArgumentBinding binding = null;

            // Handle special cases
            if (target.isPrimitive()) {
                // Check if this is an overloaded version of String()
                // TODO: Error if several perfect matches
                // TODO: Make toString() match original decl
                if (target.name().equals("String") && getNumArg() > 0) 
                    binding = matchOverloadedFunctionCall(getArg(0).getFExp().type(), FExp.OP_STR);
                if (binding != null) {
                    target = binding.target();
                    name = target.qualifiedName();
                    generated = true;
                } else {
                    // If not, look for conversion operator with same name as primitive class (if one exists)
                    InstLookupResult<InstClassDecl> icd = getName().lookupInstClass("!" + target.name());
                    if (icd.successful())
                        target = icd.target();
                }
            } else if (target.isExternalObject()) {
                // Use the external object constructor
                InstClassDecl icd = target.asInstClassDecl().myConstructor();
                if (icd.isFunction())
                    target = icd;
                generated = true;
            } else if (target.isOperatorRecord()) {
                // If the operator record defines constructors, find the one that matches the best
                // TODO: Error if several perfect matches
                // TODO: Make toString() match original decl
                // TODO: handle vectorized constructors
                binding = matchOverloadedFunctionCall(target.asInstClassDecl().recordType(), FExp.OP_CON);
                if (binding != null) {
                    target = binding.target();
                    generated = true;
                }
            }

            /* If we can't resolve the name as a function or record, don't try to bind arguments, 
             * just leave it for the error check. */
            if (!target.isCallable())
                return this;

            // Bind arguments
            boolean infArgs = builtInTranslator.isInfArgs(name);
            if (binding == null)
                binding = new ArgumentBinding(target, this, infArgs);

            // Create replacement node.
            FAbstractFunctionCall n = null;
            if (binding.isOK()) 
                n = builtInTranslator.create(name, binding.bound());
            if (n == null) {
                if (target.isRecord() && binding.isOK()) {
                    n = new InstRecordConstructor(getName(), new List());
                } else {
                    InstAccess accessName = generated ? target.asInstClassDecl().retargetFrom(namedTarget.asInstClassDecl(), getName()) : getName();
                    InstFunctionCall ifc = createEmptyNode();
                    ifc.setName(accessName);
                    ifc.generated = generated;
                    ifc.unbindableArgs = binding.unbindable();
                    ifc.bound = true;
                    n = ifc;
                }
                for (InstFunctionArgument arg : binding.bound())
                    n.addArgument(arg);
            } else if (infArgs) {
                n.setUnbindableArgsList(binding.unbindable());
            }
            n.setLocation(this);

            return n;
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:830
     * @apilevel internal
     */
    private InstFunctionCall rewriteRule1() {
{
            vectorizationChecked = true;
            
            if (isFunctionCallClause() && myLefts().size() != 1)
                return this;
            if (getName().myInstClassDecl().isUnknown() || !unbindableArgs.isEmpty())
                return this;
            if (!hasOutputs() || !myCallOutputs().get(0).isAssignable())
                return this;
            
            int dims = 0;
            for (InstFunctionArgument arg : getArgs()) 
                dims = arg.findVectorizationNdims(dims);
            if (dims <= 0)
                return this;
            
            InstFunctionCall res = new InstVectorFunctionCall(getName(), getArgs(), dims);
            res.vectorizationChecked = res.bound = true;
            res.generated = generated;
            res.setLocation(this);
            return res;
        }    }
}
