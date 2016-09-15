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
 * A flat variable in a function.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:89
 * @production FFunctionVariable : {@link FAbstractVariable} ::= <span class="component">[{@link FTypePrefixInputOutput}]</span> <span class="component">{@link FAttribute}*</span> <span class="component">Type:{@link FType}</span> <span class="component">[BindingExp:{@link FExp}]</span> <span class="component">{@link FQName}</span> <span class="component">&lt;Order:int&gt;</span>;

 */
public class FFunctionVariable extends FAbstractVariable implements Cloneable, FCallable, FlatLookupNode {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3507
     */
    public void evaluate(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        evaluationValue.evaluateFunction(evaluator, myFCallable(), values);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3651
     */
    protected CValue cevalFunctionBindingExp(VariableEvaluator evaluator) {
        if (hasBindingExp()) {
            return getBindingExp().ceval(evaluator);
        } else if (isArray()) {
            return CValue.UNKNOWN;
        } else {
            return type().zeroCValue();
        }
    }
    /**
     * Create an FFunctionVariable with the given name and type. 
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:884
     */
    public FFunctionVariable(FType type, String name) {
		this(new Opt(), new List<FAttribute>(), type, new Opt(), new FQNameString(name), 0);
	}
    /**
     * Create an FFunctionVariable with the given name, type and input/output prefix. 
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:891
     */
    public FFunctionVariable(FType type, String name, FTypePrefixInputOutput inputOutput) {
        this(new Opt<FTypePrefixInputOutput>(inputOutput), new List<FAttribute>(), type, new Opt<FExp>(), new FQNameString(name), 0);
    }
    /**
     * Create an FFunctionVariable with everything but order and attributes given.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:898
     */
    public FFunctionVariable(Opt<FTypePrefixInputOutput> inputOutput, FType type, Opt<FExp> bindingExp, FQName name) {
        this(inputOutput, new List<FAttribute>(), type, bindingExp, name, 0);
    }
    /**
     * Create new node of same class as this, with the specified children.
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1417
     */
    public FFunctionVariable createNode(Opt<FTypePrefixInputOutput> prefix, FType type, Opt<FExp> bindingExp, FQName name, int order) {
        FFunctionVariable node = createEmptyNode();
        node.setFTypePrefixInputOutputOpt(prefix);
        node.setType(type);
        node.setBindingExpOpt(bindingExp);
        node.setFQName(name);
        node.setOrder(order);
        return node;
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1427
     */
    public FFunctionVariable createEmptyNode() { return new FFunctionVariable(); }
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:390
     */
    public FAbstractVariable lookupHierarchical(FQName name, int part, boolean outermost) {
		if (outermost || name.numParts() <= part)
			return this;
		else
			return isRecord() ? myFRecordDecl().lookupHierarchical(name, part) : null;
	}
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:422
     */
    public void addToVariableMap(FlatVariableMap map) {
		map.addVariableHierarchical(this);
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1061
     */
    public FIdUse createFIdUse() {
         return getFQName().createUseFQName().createFIdUse();
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1084
     */
    public FIdUseExp createUseExp() {
         return getFQName().createUseFQName().createFIdUseExp();
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1213
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
    	if (hasFTypePrefixInputOutput()) {
    		str.print(getFTypePrefixInputOutput());
    		str.print(" ");
    	}
        str.print(getType().scalarType());
        if (isArray()) {
            str.print("[");
            for (int i = 0; i < ndims(); i++) {
                str.print(":");
                if (i < ndims()-1) {
                    str.print(",");
                }
            }
            str.print("]");
        }
    	str.print(" ");
    	str.print(name());
    	getFAttributeList().prettyPrintFAttributeList(str, p);
    	if (hasBindingExp()) {
    		str.print(" := ");
    		p.print(getBindingExp(), str, indent);
    	}
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:470
     */
    public void updateRecordArraySizes() {
        // TODO: this should probably be in attributes as well
        // TODO: if exp is access to input with unknown array sizes, handle that
        if (hasBindingExp() && isRecord())
            getType().updateRecordArraySizes(getBindingExp().type());
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3980
     */
    @Override
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        super.markUsedFunctionsAndRecords(type);
        if (type().isFunction()) {
            myFCallable().markUsedFunctionsAndRecords(type);
        }
    }
    /**
     * Keep reference to function inliner during inlining for size lookup.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1264
     */
    public AbstractFunctionInliner functionInliner = null;
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1303
     */
    public void inline(AbstractFunctionInliner fi, List<FExp> args) {
        throw new UnsupportedOperationException();
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:270
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		String indent3 = p.indent(indent2);
		open_XML(str, indent, attr_XML("type", getType().scalarType().toString()));
		enclose_XML(p, str, indent2, "Name", getFQName());
		
		Size s = size();
		for (int i = 0; i < s.ndims(); i++) {
			open_XML(str, indent2, "Size");
			if (s.hasValue(i))
				p.print(s.createFExp(i), str, indent3);
			else
				str.format("%s<exp:UndefinedDimension/>", indent3);
			close_XML(str, indent2, "Size");
		}

		if (hasBindingExp())
			enclose_XML(p, str, indent2, "BindingExpression", getBindingExp());
		close_XML(str, indent);
    }
    /**
     * Currently unsopported functionality. 
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream 
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1717
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        if (!shouldBeDifferentiated()) {
            genVarDecls_C(p, str, indent);
        } else if (!isInput()) {
            String suffix = (isOutput() && isComposite()) ? C_SUFFIX_NULL : "";
            TypePrinter_C dp = p.createDeclPrinter(str);
            dp.setSubDecls(true);
            print(dp, varName_CAD() + suffix, indent);
            dp.setSubDecls(false);
            print(dp, derName_CAD() + suffix, indent);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2309
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
        FInitArrayStmt.genInit_C(p, str, indent, varName_CAD(), this, type());
        FInitArrayStmt.genInit_C(p, str, indent, derName_CAD(), this, type());
    }
    /**
     * Prints code that checks whether the variables corresponding return varible was set as
     * NULL, if not the return variable is set to this variables value. Is used to handle NULL
     * inputs in functions. 
     * 
     * @param str  the c-code is written to this stream 
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2347
     */
    public void printReturnWrite_CAD(CodeStream str, String indent) {
        if (!isRecord()) {
            str.print(indent);
            str.print("if (");
            str.print(varReturnName_CAD());
            str.print(" != NULL) *");
            str.print(varReturnName_CAD());
            str.print(" = ");
            str.print(varName_CAD());
            str.print(";\n");
            str.print(indent);
            str.print("if (");
            str.print(derReturnName_CAD());
            str.print(" != NULL) *");
            str.print(derReturnName_CAD());
            str.print(" = ");
            str.print(derName_CAD());
            str.print(";\n");
        }
    }
    /**
     * Prints the argument's C type and name for this variable, used when generating function headers. 
     * 
     * @param str  the c-code is written to this stream
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2437
     */
    public void printArgument_var_CAD(CodeStream str) {
        str.print(type_C());
        str.print(" "  + varName_CAD());
    }
    /**
     * Prints the derivative argument's C type and name for this variable, used when generating function headers.
     * It is assumed that this function is called for real arguments only, since discrete lack derivatives. Thus
     * no explicit check is made for the non-real scenario.
     * 
     * @param str  the c-code is written to this stream
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2449
     */
    public void printArgument_der_CAD(CodeStream str) {
        str.print(type_C());
        str.print(" ");
        str.print(derName_CAD());
    }
    /**
     * Prints variables return argument, used when generating function headers.
     * 
     * @param str  the c-code is written to this stream
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2460
     */
    public void printReturnArgument_var_CAD(CodeStream str) {
        str.print(typeReturn_C());
        str.print(" ");
        str.print(varReturnName_CAD());
    }
    /**
     * Prints derivative variables return argument, used when generating function headers.
     * When calling a function with derivative outputs for non real variables this return
     * argument should be set to NULL, in that case no derivative will be set for this variable
     * (see printReturnWrite_CAD) 
     * 
     * @param str  the c-code is written to this stream
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:2474
     */
    public void printReturnArgument_der_CAD(CodeStream str) {
        str.print(typeReturn_C());
        str.print(" ");
        str.print(derReturnName_CAD());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:405
     */
    @Override
    public void prettyPrintCall_C(CodePrinter p, CodeStream str, String indent, FFunctionCall call) {
        boolean exp = call.functionCallIsExp();
        String out = "NULL";
        if (!exp) {
            out = call.tempName_C();
            str.formatln("%s%s.n = %s;", indent, out, call.myLefts().size());
            out = "&" +out;
            str.print(indent);
        }
        str.format("%s->fpcl(%s, %s", name_C(), name_C(), out);
        String sep = ", ";
        for (FExp arg : call.getArgs()) {
            str.format("%s(%s)(", sep, arg.type().type_C());
            arg.genArgument_C(p, str, indent);
            str.print(")");
        }
        str.print(")");
        if (!exp)
            str.print(";\n");
        if (!exp) {
            int tot = myOutputs().size();
            int lefts = call.myLefts().size();
            for (int i = 0; i < tot; i++) {
                if (i < lefts) {
                    String n = call.myLefts().get(i).prettyPrint_C(indent);
                    str.formatln("%s%s = %s.%s;", indent, n, call.tempName_C(), n);
                }
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1070
     */
    public void printReturnArgument_C(CodeStream str) {
		str.print(typeReturn_C());
		str.print(" ");
		str.print(nameReturn_C());
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1076
     */
    public void printReturnWrite_C(CodeStream str, String indent) {
		if (!isRecord()) {
			getType().printReturn_C(str, indent, nameReturn_C(), name_C());
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1089
     */
    public void printArgument_C(CodeStream str) {
		str.print(type_C());
		str.print(" ");
		str.print(name_C());
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1095
     */
    private FExp dummyFExp = null;
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1097
     */
    public void setDummyExp() {
		if (dummyFExp == null) 
			dummyFExp = new FNoExp();
		setBindingExp(dummyFExp);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1103
     */
    public void resetDummyExp() {
		if (dummyFExp != null)
			setBindingExpOpt(new Opt());
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1108
     */
    public void print(TypePrinter_C tp, String name, String indent) {
        setDummyExp();
        tp.reset(name, getBindingExp(), size().isUnknown(), false, indent);
        type().print(tp);
        resetDummyExp();
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1115
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        FInitArrayStmt.genInit_C(p, str, indent, name_C(), this, type());
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1620
     */
    @Override
	public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
		if (!isInput()) {
			String suffix = (isOutput() && isComposite() && !isString()) ? C_SUFFIX_NULL : "";
			print(p.createDeclPrinter(str), name_C() + suffix, indent);
		}
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:134
     */
    public void exportWrapperDecl_C(CodeStream str) {
		str.format("%s %s", exportWrapperType_C(), name_C());
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:138
     */
    public void exportWrapperTypeDecl_C(CodeStream str) {
		str.print(exportWrapperType_C());
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:142
     */
    public void exportWrapperCall_C(CodeStream str) {
		str.print(name_C());
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:166
     */
    public void exportWrapperDeclareTemp_C(CodeStream str, String ind) {
	}
    /**
     * @aspect ExportFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExportFunctions.jadd:169
     */
    public void exportWrapperInitTemp_C(CodeStream str, String ind) {
	}
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionVariable() {
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
        children = new ASTNode[5];
        setChild(new Opt(), 0);
        setChild(new List(), 1);
        setChild(new Opt(), 3);
    }
    /**
     * @declaredat ASTNode:16
     */
    public FFunctionVariable(Opt<FTypePrefixInputOutput> p0, List<FAttribute> p1, FType p2, Opt<FExp> p3, FQName p4, int p5) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setOrder(p5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:27
     */
    protected int numChildren() {
        return 5;
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
        myFRecordDecl_reset();
        myFEnumDecl_reset();
        type_reset();
        varName_CAD_reset();
        derName_CAD_reset();
        name_C_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FFunctionVariable_assigningUses_computed = false;
        FFunctionVariable_assigningUses_value = null;
        FFunctionVariable_assigningUses_contributors = null;
    }
    /**
     * @api internal
     * @declaredat ASTNode:60
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:66
     */
    public FFunctionVariable clone() throws CloneNotSupportedException {
        FFunctionVariable node = (FFunctionVariable) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:73
     */
    public FFunctionVariable copy() {
        try {
            FFunctionVariable node = (FFunctionVariable) clone();
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
     * @declaredat ASTNode:92
     */
    public FFunctionVariable fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:101
     */
    public FFunctionVariable treeCopyNoTransform() {
        FFunctionVariable tree = (FFunctionVariable) copy();
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
     * @declaredat ASTNode:121
     */
    public FFunctionVariable treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:128
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenint_Order == ((FFunctionVariable)node).tokenint_Order);    
    }
    /**
     * Replaces the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child FTypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setFTypePrefixInputOutputOpt(Opt<FTypePrefixInputOutput> opt) {
        setChild(opt, 0);
    }
    /**
     * Replaces the (optional) FTypePrefixInputOutput child.
     * @param node The new node to be used as the FTypePrefixInputOutput child.
     * @apilevel high-level
     */
    public void setFTypePrefixInputOutput(FTypePrefixInputOutput node) {
        getFTypePrefixInputOutputOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FTypePrefixInputOutput child exists.
     * @return {@code true} if the optional FTypePrefixInputOutput child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFTypePrefixInputOutput() {
        return getFTypePrefixInputOutputOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FTypePrefixInputOutput child.
     * @return The FTypePrefixInputOutput child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FTypePrefixInputOutput getFTypePrefixInputOutput() {
        return (FTypePrefixInputOutput) getFTypePrefixInputOutputOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * @return The optional node for child the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FTypePrefixInputOutput")
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOpt() {
        return (Opt<FTypePrefixInputOutput>) getChild(0);
    }
    /**
     * Retrieves the optional node for child FTypePrefixInputOutput. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FTypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOptNoTransform() {
        return (Opt<FTypePrefixInputOutput>) getChildNoTransform(0);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * @return Number of children in the FAttribute list.
     * @apilevel high-level
     */
    public int getNumFAttribute() {
        return getFAttributeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAttribute list.
     * @apilevel low-level
     */
    public int getNumFAttributeNoTransform() {
        return getFAttributeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAttribute list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAttribute list.
     * @apilevel high-level
     */
    public FAttribute getFAttribute(int i) {
        return (FAttribute) getFAttributeList().getChild(i);
    }
    /**
     * Check whether the FAttribute list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAttribute() {
        return getFAttributeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAttribute list.
     * @param node The element to append to the FAttribute list.
     * @apilevel high-level
     */
    public void addFAttribute(FAttribute node) {
        List<FAttribute> list = (parent == null || state == null) ? getFAttributeListNoTransform() : getFAttributeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAttributeNoTransform(FAttribute node) {
        List<FAttribute> list = getFAttributeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAttribute list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAttribute(FAttribute node, int i) {
        List<FAttribute> list = getFAttributeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAttribute")
    public List<FAttribute> getFAttributeList() {
        List<FAttribute> list = (List<FAttribute>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributeListNoTransform() {
        return (List<FAttribute>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    public List<FAttribute> getFAttributes() {
        return getFAttributeList();
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributesNoTransform() {
        return getFAttributeListNoTransform();
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FType node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FType getType() {
        return (FType) getChild(2);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FType getTypeNoTransform() {
        return (FType) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the BindingExp child. This is the <code>Opt</code>
     * node containing the child BindingExp, not the actual child!
     * @param opt The new node to be used as the optional node for the BindingExp child.
     * @apilevel low-level
     */
    public void setBindingExpOpt(Opt<FExp> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) BindingExp child.
     * @param node The new node to be used as the BindingExp child.
     * @apilevel high-level
     */
    public void setBindingExp(FExp node) {
        getBindingExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional BindingExp child exists.
     * @return {@code true} if the optional BindingExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasBindingExp() {
        return getBindingExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) BindingExp child.
     * @return The BindingExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getBindingExp() {
        return (FExp) getBindingExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the BindingExp child. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * @return The optional node for child the BindingExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="BindingExp")
    public Opt<FExp> getBindingExpOpt() {
        return (Opt<FExp>) getChild(3);
    }
    /**
     * Retrieves the optional node for child BindingExp. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child BindingExp.
     * @apilevel low-level
     */
    public Opt<FExp> getBindingExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(3);
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(4);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(4);
    }
    /**
     * Replaces the lexeme Order.
     * @param value The new value for the lexeme Order.
     * @apilevel high-level
     */
    public void setOrder(int value) {
        tokenint_Order = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Order;
    /**
     * Retrieves the value for the lexeme Order.
     * @return The value for the lexeme Order.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Order")
    public int getOrder() {
        return tokenint_Order;
    }
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:36
     */
    private FType refined_FlatTypeAnalysis_FFunctionVariable_type()
{ return getType(); }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = 0;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = evaluationValue(evaluator);

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = evaluationValue(evaluator).array().getCell(i);

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue evaluatePartial(Map<CommonVariableDecl, CValue> values) {
        ASTNode$State state = state();
        CValue evaluatePartial_Map_CommonVariableDecl__CValue__value = evaluationValue.evaluatePartialFunction(this, values);

        return evaluatePartial_Map_CommonVariableDecl__CValue__value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFFunctionVariable() {
        ASTNode$State state = state();
        boolean isFFunctionVariable_value = true;

        return isFFunctionVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public FCallable myFCallable() {
        ASTNode$State state = state();
        FCallable myFCallable_value = lookupFCallable(type().name());

        return myFCallable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFRecordDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FRecordDecl myFRecordDecl_value;
    /**
     * @apilevel internal
     */
    private void myFRecordDecl_reset() {
        myFRecordDecl_computed = false;
        myFRecordDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordDecl myFRecordDecl() {
        if(myFRecordDecl_computed) {
            return myFRecordDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFRecordDecl_value = type().myFRecordDecl();
        if (isFinal && num == state().boundariesCrossed) {
            myFRecordDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFRecordDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFEnumDecl_computed = false;
    /**
     * @apilevel internal
     */
    protected FEnumDecl myFEnumDecl_value;
    /**
     * @apilevel internal
     */
    private void myFEnumDecl_reset() {
        myFEnumDecl_computed = false;
        myFEnumDecl_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FEnumDecl myFEnumDecl() {
        if(myFEnumDecl_computed) {
            return myFEnumDecl_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFEnumDecl_value = type().myFEnumDecl();
        if (isFinal && num == state().boundariesCrossed) {
            myFEnumDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFEnumDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFQNameNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = getFQName().nameUnderscore();

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameUnderscore(String suffix) {
        ASTNode$State state = state();
        String funcNameUnderscore_String_value = myFCallable().funcNameUnderscore(suffix);

        return funcNameUnderscore_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public int functionIndex() {
        ASTNode$State state = state();
        int functionIndex_value = -1;

        return functionIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl asFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl asFFunctionDecl_value = null;

        return asFFunctionDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl actualFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl actualFFunctionDecl_value = myFCallable().actualFFunctionDecl();

        return actualFFunctionDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunction() {
        ASTNode$State state = state();
        boolean isPartialFunction_value = type().isFunction();

        return isPartialFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = hasFTypePrefixInputOutput() && getFTypePrefixInputOutput().inputCausality();

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = hasFTypePrefixInputOutput() && getFTypePrefixInputOutput().outputCausality();

        return isOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myInputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myInputs_value = myFCallable().myInputs();

        return myInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable myInput(int i) {
        ASTNode$State state = state();
        FFunctionVariable myInput_int_value = myInputs().get(i);

        return myInput_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myOutputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myOutputs_value = myFCallable().myOutputs();

        return myOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOutputs() {
        ASTNode$State state = state();
        boolean hasOutputs_value = !myOutputs().isEmpty();

        return hasOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable expOutput() {
        ASTNode$State state = state();
        FFunctionVariable expOutput_value = myOutputs().get(0);

        return expOutput_value;
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
        type_value = type_compute();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    /**
     * @apilevel internal
     */
    private FType type_compute() {
            FType res = null;
            if (functionInliner != null) {
                res = functionInliner.lookupType(name());
            }
            return res == null ? refined_FlatTypeAnalysis_FFunctionVariable_type() : res;
        }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructor() {
        ASTNode$State state = state();
        boolean isDestructor_value = false;

        return isDestructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstructor() {
        ASTNode$State state = state();
        boolean isConstructor_value = false;

        return isConstructor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = delegateShouldBeDifferentiated();

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinable(AbstractFunctionInliner fi, FFunctionCall call) {
        ASTNode$State state = state();
        boolean isInlinable_AbstractFunctionInliner_FFunctionCall_value = false;

        return isInlinable_AbstractFunctionInliner_FFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTrivialInlinable(boolean late, FFunctionCall call) {
        ASTNode$State state = state();
        boolean isTrivialInlinable_boolean_FFunctionCall_value = false;

        return isTrivialInlinable_boolean_FFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public int smoothOrder() {
        ASTNode$State state = state();
        int smoothOrder_value = myFCallable().smoothOrder();

        return smoothOrder_value;
    }
    /**
     * @attribute syn
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:966
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable createDerivative() {
        ASTNode$State state = state();
        try {
                return createNode(getFTypePrefixInputOutputOpt().fullCopy(), getType().fullCopy(), new Opt<FExp>(), 
                        getFQName().createDerPrefixedName(1), order() + 1);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = getOrder();

        return order_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = isOutput() ? "OutputVariable" : (isInput() ? "InputVariable" : "ProtectedVariable");

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "fun";

        return xmlNamespace_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean varName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String varName_CAD_value;
    /**
     * @apilevel internal
     */
    private void varName_CAD_reset() {
        varName_CAD_computed = false;
        varName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String varName_CAD() {
        if(varName_CAD_computed) {
            return varName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        varName_CAD_value = nameUnderscore() + "_var_" + C_SUFFIX_VARIABLE;
        if (isFinal && num == state().boundariesCrossed) {
            varName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return varName_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean derName_CAD_computed = false;
    /**
     * @apilevel internal
     */
    protected String derName_CAD_value;
    /**
     * @apilevel internal
     */
    private void derName_CAD_reset() {
        derName_CAD_computed = false;
        derName_CAD_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String derName_CAD() {
        if(derName_CAD_computed) {
            return derName_CAD_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derName_CAD_value = nameUnderscore() + "_der_" + C_SUFFIX_VARIABLE;
        if (isFinal && num == state().boundariesCrossed) {
            derName_CAD_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String varReturnName_CAD() {
        ASTNode$State state = state();
        String varReturnName_CAD_value = isRecord() ? varName_CAD() : (getFQName().nameUnderscore() + "_var_" + C_SUFFIX_RETURN);

        return varReturnName_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public String derReturnName_CAD() {
        ASTNode$State state = state();
        String derReturnName_CAD_value = isRecord() ? derName_CAD() : (getFQName().nameUnderscore() + "_der_" + C_SUFFIX_RETURN);

        return derReturnName_CAD_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean name_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_C_value;
    /**
     * @apilevel internal
     */
    private void name_C_reset() {
        name_C_computed = false;
        name_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        if(name_C_computed) {
            return name_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_C_value = name_C(null, C_SUFFIX_VARIABLE);
        if (isFinal && num == state().boundariesCrossed) {
            name_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameReturn_C() {
        ASTNode$State state = state();
        String nameReturn_C_value = isRecord() ? name_C() : name_C(null, C_SUFFIX_RETURN);

        return nameReturn_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String typeReturn_C() {
        ASTNode$State state = state();
        String typeReturn_C_value = isRecord() ? type_C() : (type_C() + "*");

        return typeReturn_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String exportWrapperType_C() {
        ASTNode$State state = state();
        String exportWrapperType_C_value = type().exportWrapperType_C();

        return exportWrapperType_C_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:534
     */
    @ASTNodeAnnotation.Attribute
    public FCallable lookupFCallable(String name) {
        ASTNode$State state = state();
        FCallable lookupFCallable_String_value = getParent().Define_lookupFCallable(this, null, name);

        return lookupFCallable_String_value;
    }
    /**
     * @attribute inh
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:307
     */
    @ASTNodeAnnotation.Attribute
    public boolean delegateShouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean delegateShouldBeDifferentiated_value = getParent().Define_delegateShouldBeDifferentiated(this, null);

        return delegateShouldBeDifferentiated_value;
    }
    /**
     * @attribute inh
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:312
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated(AnnotationNode derNode) {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_AnnotationNode_value = getParent().Define_shouldBeDifferentiated(this, null, derNode);

        return shouldBeDifferentiated_AnnotationNode_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    /**
     * All uses of this variable that are the left-hand side of an assignment or 
     * function call statement. 
     * @attribute coll
     * @aspect FVariableUses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2858
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<FIdUseExp> assigningUses() {
        if(FFunctionVariable_assigningUses_computed) {
            return FFunctionVariable_assigningUses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FFunctionVariable_assigningUses_value = assigningUses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FFunctionVariable_assigningUses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FFunctionVariable_assigningUses_value;
    }
    Collection FFunctionVariable_assigningUses_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for assigningUses
     */
    public Collection FFunctionVariable_assigningUses_contributors() {
        if(FFunctionVariable_assigningUses_contributors == null)
            FFunctionVariable_assigningUses_contributors  = new LinkedList();
        return FFunctionVariable_assigningUses_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<FIdUseExp> assigningUses_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FFunctionDecl)) {
            node = node.getParent();
        }
        FFunctionDecl root = (FFunctionDecl) node;
        root.collect_contributors_FFunctionVariable_assigningUses();
        FFunctionVariable_assigningUses_value = new HashSet<FIdUseExp>();
        if(FFunctionVariable_assigningUses_contributors != null)
        for (Iterator iter = FFunctionVariable_assigningUses_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FFunctionVariable_FFunctionVariable_assigningUses(FFunctionVariable_assigningUses_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FFunctionVariable_assigningUses_contributors = null;
        return FFunctionVariable_assigningUses_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FFunctionVariable_assigningUses_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<FIdUseExp> FFunctionVariable_assigningUses_value;
    /**
     * @apilevel internal
     */
    private void FFunctionVariable_assigningUses_reset() {
        FFunctionVariable_assigningUses_computed = false;
        FFunctionVariable_assigningUses_value = null;
    }
    protected void collect_contributors_FClass_myFFunctionDeclsPartial() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:750
     */
        if (type().isFunction()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myFFunctionDeclsPartial_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_myFFunctionDeclsPartial();
    }
    protected void contributeTo_FClass_FClass_myFFunctionDeclsPartial(LinkedHashSet<FFunctionDecl> collection) {
        super.contributeTo_FClass_FClass_myFFunctionDeclsPartial(collection);
        if (type().isFunction())
            collection.add(myFCallable().actualFFunctionDecl());
    }

}
