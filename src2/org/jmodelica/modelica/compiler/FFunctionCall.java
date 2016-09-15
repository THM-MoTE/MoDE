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
 * Generic function call expression in flat tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1284
 * @production FFunctionCall : {@link CommonFunctionCall} ::= <span class="component">Name:{@link FIdUse}</span> <span class="component">Arg:{@link FExp}*</span> <span class="component">{@link FType}</span>;

 */
public class FFunctionCall extends CommonFunctionCall implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3342
     */
    @Override
    public void evaluateCell(VariableEvaluator evaluator, Map<CommonVariableDecl, CValue> values) {
        myCommonCallable().evaluate(evaluator, values);
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3462
     */
    public void flushUnknownSizes() {}
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1112
     */
    public FFunctionCall createEmptyNode()           { return new FFunctionCall();           }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1773
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		str.print(getName().name());
		str.print("(");
		getArgs().prettyPrintWithSep(p, str, "", ", ");
		str.print(")");
	}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:901
     */
    public FExp affixExpression(FExp exp) {
        // can't use dynamicExp(), since this node might not be in tree (InstFunctionCall.flatten())
        // TODO: if InstFunctionCall.flatten() is changed so that the size is flattened in a 
        //       rewrite on FFunctionCall instead, then dynamicExp() can be used here
        exp.parent = this;
        return exp;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2691
     */
    public FFunctionCall flatten(FQName prefix) {
        List args = new List();
        for (FExp e : getArgs()) 
            args.add(e.flatten(prefix));
        getFTypeNoTransform().clearFlattened();
        return new FFunctionCall(getName().flatten(new FQNameEmpty()), args, getFType().flatten(new FQNameEmpty(), null, true));
    }
    /**
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:66
     */
    public void sanityCheckFIdUseConsistency(FClass fc) {
        sanityCheckFIdUseConsistencyInChildren(fc);
        
        if (myFCallable() == null) {
            fc.sanityProblem(this, "Function not found in function call:\n    %s", this);
        }
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3951
     */
    @Override
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        myFCallable().markUsedFunctionsAndRecords(type);
        super.markUsedFunctionsAndRecords(type);
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:110
     */
    public void findBlockFunctionExtraction(AbstractEquationBlock block, ArrayList<FFunctionCall> functions) {
        for (FExp exp: getArgs())
            if (exp.dependsOnBlock(block)) {
                for (FExp expr: getArgs()) 
                    expr.findBlockFunctionExtraction(block, functions);
                return;
            }
        functions.add(this);
    }
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:157
     */
    public boolean dependsOnBlock(AbstractEquationBlock block) {
        for (FExp exp: getArgs()) {
            if (exp.dependsOnBlock(block)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:163
     */
    public void collectFunctionCalls(FClass.commonSubexpressionEliminationIfSet m) {
        /* We dont try to eliminate nested function call expressions to avoid some complicated cases */
        m.add(this);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:489
     */
    public void addInliningVarsAndEqns(AbstractFunctionInliner fi, String oldName, boolean noEvent) {
        if (isComposite()) {
            FTypePrefixVariability v = fi.contextVariability(this);
            if (v.constantVariability()) {
                try {
                    dynamicFExp(ceval().buildLiteral()).addInliningVarsAndEqns(fi, oldName, noEvent);
                    return;
                } catch (ConstantEvaluationException e) {
                    
                }
            }
            String tempName = fi.nextTempVarName();
            FExp exp = type().addInliningVarsAndEqns(fi, oldName, noEvent, this, tempName);
            List<FFunctionCallLeft> l = new List<FFunctionCallLeft>();
            l.add(new FFunctionCallLeft(new Opt<FExp>(exp)));
            fi.addEquation(new FFunctionCallEquation(l, fullCopy()), v);
        } else {
            super.addInliningVarsAndEqns(fi, oldName, noEvent);
        }
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:599
     */
    public FExp preventEvents() {
        for (FExp e : getArgs())
            e.preventEvents();
        return this;
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:836
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        if (isInlinableFunctionCall(fi)) {
            inline(fi);
            replaceMe(type().replaceInlined(fi, myCallOutputs().get(0).name()));
        } else {
            super.inlineFunctions(fi);
        }
    }
    /**
     * Inline this function call. 
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:938
     */
    public void inline(AbstractFunctionInliner fi) {
        myFCallable().inline(fi, getArgs());
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1772
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
        if (extractTemp())
            return tempExp();
        else
            return scalarizeFunction(indexMap);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1805
     */
    public FFunctionCall scalarizeFunction(Map<String,FExp> indexMap) {
		List<FExp> args = new List<FExp>();
        for (FExp arg : getArgs()) {
            args.add(arg.scalarize(indexMap));
        }
        return createScalarized(getName().fullCopy(), args, getFType().scalarType());
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1813
     */
    protected FFunctionCall createScalarized(FIdUse name, List<FExp> args, FType type) {
        return new FFunctionCall(name, args, type); 
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:232
     */
    public void createArrayTemporaries(Scalarizer s) {
        // No names available as a function call arg.
        boolean b = !extractTemp();
        if (b)
            s.getNames().addLayer(0);
        super.createArrayTemporaries(s);
        if (b)
            s.getNames().removeLayer();
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:272
     */
    public void knownArrayTemporaries(Scalarizer s) {
        s.addTempVar(this);
        s.createScalarizedFunctionCallClause(this, this);
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:319
     */
    public void unknownFunctionArrayTemporaries(Scalarizer s) {
        s.createScalarizedFunctionCallClause(this, this);
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:721
     */
    public void addArrayUsesToIndexMap(FExp[] names) {
        // No names available as a function call arg.
        super.addArrayUsesToIndexMap(extractTemp() ? names : new FExp[0]);
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:552
     */
    private int order = 0;
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:554
     */
    public FExp diff(String name) {
        // If the function does not have an argument that matches name,
        // and the name is not 'time', then the derivative is zero.
        if (!name.equals(TIME)) {
            boolean isIndependent = true;
            FQName fqn = new FQNameString(name);
            FIdUseExp fid = (FIdUseExp) dynamicFExp(fqn.createFIdUseExp());
            FAbstractVariable fv = fid.myFV();
            if (fv != null) {
                HashSet<FVariable> s = new HashSet<FVariable>();
                s.add((FVariable) fv);
                for (FExp e : getArgs()) {
                    if (!e.isIndependent(s)) {
                        isIndependent = false;
                        break;
                    }
                }
                if (isIndependent) {
                    return new FRealLitExp(0);
                }
            }
        }
        
        FFunctionDecl myDecl = myFCallable().asFFunctionDecl();
        if (myDecl == null)
            throw new FunctionDifferentiationException(this);
        AnnotationNode derNode = derivativeAnnotation();
        
        FCallable myDiffDecl = myDecl.diff(derNode, inFunction());
        if (myDiffDecl == null)
            throw new FunctionDifferentiationException(this);
        List args = new List();
        for (FExp e : getArgs()) {
            args.add(e.copySymbolic());
        }
        int i = 0;
        for (FExp e : getArgs()) {
            FFunctionVariable fv = myDecl.myInput(i);
            if (fv.shouldBeDifferentiated(derNode))
                args.add(e.diff(name));
            i++;
        }
        FFunctionCall der_f = new FFunctionCall(new FIdUse(myDiffDecl.name()), args, getFType().treeCopy());
        der_f.order = order + 1;
        return dynamicFExp(der_f);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:220
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String indent2 = p.indent(indent);
		open_XML(str, indent);
		enclose_XML(p, str, indent2, "Name", getName().getFQName());
		enclose_XML(p, str, indent2, "Arguments", getArgs());
		close_XML(str, indent);
	}
    /**
     * General method used to print function calls.
     * Assumes that a function is called as: f(<inputs>,<outputs>) where inputs and outputs are ordered as
     * variables first and then derivatives (only if the variable is of type real, if not inputs will be ommitted
     * and outputs will be called with NULL argument). 
     * Scenarios:
     * x = f(y) The function is an expression. If the function has more then one output then then unused outputs
     * will be filled with NULL arguments,
     * <outs> = f(<ins>). The function is not an expression. The input arguments are then generated from the 
     * FFunctionCallLeft belonging to this function. For unused outputs NULL argument is used.  
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:723
     */
    @Override
	public void genADStatement_CAD(CodePrinter p, CodeStream str, String indent) {
		boolean exp = functionCallIsExp();
		
		str.print(indent);
		str.print(funcNameUnderscore("der_AD"));
		str.print("(");
		String sep = "";
		for (FExp arg : getArgs()) {
			str.print(sep);
			arg.genArgument_var_CAD(str);
			sep = ", ";
		}
		for (FExp arg : getArgs()) {
            if (arg.myCorrespondingInput().asFAbstractVariable().shouldBeDifferentiated()) {
				str.print(sep);
				arg.genArgument_der_CAD(str);
				sep = ", ";
			}
		}
        ArrayList<FFunctionVariable> outputs = myCallOutputs();
		if (!exp){
			// The function is not an expression, generate arguments from my FFunctionCallLeft
			int lefts = myLefts().size();
			for (int i = 0; i < outputs.size(); i++) {
				str.print(sep);
				if (i < lefts) {
					if (outputs.get(i).shouldBeDifferentiated())
						myLefts().get(i).genArgument_var_CAD(str);
					else
						myLefts().get(i).genArgument_C(str);
                } else if (i == 0 && lefts == 0 && isFunctionCallArg()) {
                    if (outputs.get(i).shouldBeDifferentiated())
                        str.print(tempName_var_CAD());
                    else
                        str.print(tempName_C());
				} else {
					str.print("NULL");
				}
				sep = ", ";
			}
			for (int i = 0; i < outputs.size(); i++) {
				if (!outputs.get(i).shouldBeDifferentiated())
					continue;
				str.print(sep);
				if (i < lefts)
					myLefts().get(i).genArgument_der_CAD(str);
                else if (i == 0 && lefts == 0 && isFunctionCallArg())
                    str.print(tempName_der_CAD());
				else
					str.print("NULL");
				sep = ", ";
			}
		} else {
			boolean first = true;
			for (FFunctionVariable output : outputs) {
				str.print(sep);
				sep = ", ";
				if (first) {
					str.print("&");
					genVar_CAD(p, str, indent);
				} else {
					str.print("NULL");
				}
				first = false;
			}
			first = true;
			for (FFunctionVariable output : outputs) {
				if (!output.shouldBeDifferentiated())
					continue;
				str.print(sep);
				sep = ", ";
				if (first && shouldBeDifferentiated()) {
					str.print("&");
					genDer_CAD(p, str, indent);
				} else {
					str.print("NULL");
				}
				first = false;
			}
		}
		str.print(");\n");
	}
    /**
     * Used to generate expressions in the argument of a function call. Also used to
     * generate temporary records and arrays used as inputs. 
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * 
     * @param p       use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str     the c-code is written to this stream
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1485
     */
    @Override
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {
        for (FExp arg : getArgs())
            arg.genTempInputs_CAD(p, str, indent);
        p.printPreSteps(getArgs(), str, indent);
        genADStatement_CAD(p, str, indent);
        p.printPostSteps(getArgs(), str, indent);
    }
    /**
     * Generates temporary input variables for arrays and records.
     * 
     * TODO: This method is a duplicate from c-codegen. Should be refactored!
     * TODO: Declare in genTempForFunc instead.
     * 
     * @param p  use CADPrettyPrinter for p.print to call prettyPrint_CAD
     * @param str  the c-code is written to this stream 
     * @param indent  used to getAll a consistently formated c-code
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1685
     */
    @Override
    public void genVarDecls_CAD(CodePrinter p, CodeStream str, String indent) {
        if (functionCallIsExp()) {
            str.print(indent);
            str.print("jmi_ad_var_t ");
            str.println(varName_CAD() + ";");
            if (shouldBeDifferentiated()) {
                str.print(indent);
                str.print("jmi_ad_var_t ");
                str.println(derName_CAD() + ";");
            }
        }
        for (FExp arg : getArgs()) {
            arg.genTempIODecls_CAD(p, str, indent, false);
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1870
     */
    @Override
    public void genTempInputAssigns_CAD(CodePrinter p, CodeStream str, String indent) {
        if (!isComposite()) {
            super.genTempInputAssigns_CAD(p, str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:315
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        p.printVarDecls(getArgs(), str, indent);
        if (!functionCallIsExp() && myFCallable().isPartialFunction() && !isPartialFunctionCall()) {
            str.formatln("%s%s %s;", indent, myFCallable().actualFFunctionDecl().funcNameUnderscore(C_SUFFIX_FPOUT), tempName_C());
        }
        for (FExp arg : getArgs()) 
            arg.genTempInputDecl_C(p, str, indent);
        if (isStringExp()) {
            type().printScalarDecl_C(str, indent, false, tempName_C());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:328
     */
    @Override
    public void genTempVars_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(getArgs(), str, indent);
        for (FExp arg : getArgs()) 
            arg.genTempInput_C(p, str, indent);
        if (isStringExp()) {
            str.print(indent);
            str.print(tempName_C());
            str.print(" = ");
            myFCallable().prettyPrintCall_C(p, str, indent, this);
            str.println(";");
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:342
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        if (isStringExp()) {
            str.print(tempName_C());
        } else {
            myFCallable().prettyPrintCall_C(p, str, indent, this);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:351
     */
    @Override
    public void genTempFree_C(CodePrinter p, CodeStream str, String indent) {
        p.printPostSteps(getArgs(), str, indent);
        if (isStringExp()) {
            type().printFree_C(str, indent, false, tempName_C());
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2369
     */
    @Override
    public void genTempInputAssigns_C(CodePrinter p, CodeStream str, String indent) {
        if (isComposite()) {
            myFCallable().prettyPrintCall_C(p, str, indent, this);
        } else {
            super.genTempInputAssigns_C(p, str, indent);
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FFunctionCall() {
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
    public FFunctionCall(FIdUse p0, List<FExp> p1, FType p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        ndims_reset();
        size_reset();
        getArray_reset();
        cevalFunction_VariableEvaluator_reset();
        type_reset();
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
    public FFunctionCall clone() throws CloneNotSupportedException {
        FFunctionCall node = (FFunctionCall) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:64
     */
    public FFunctionCall copy() {
        try {
            FFunctionCall node = (FFunctionCall) clone();
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
    public FFunctionCall fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:92
     */
    public FFunctionCall treeCopyNoTransform() {
        FFunctionCall tree = (FFunctionCall) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
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
     * @declaredat ASTNode:117
     */
    public FFunctionCall treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:124
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public FIdUse getName() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public FIdUse getNameNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<FExp> list) {
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
    public FExp getArg(int i) {
        return (FExp) getArgList().getChild(i);
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
    public void addArg(FExp node) {
        List<FExp> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addArgNoTransform(FExp node) {
        List<FExp> list = getArgListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Arg list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setArg(FExp node, int i) {
        List<FExp> list = getArgList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Arg")
    public List<FExp> getArgList() {
        List<FExp> list = (List<FExp>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgListNoTransform() {
        return (List<FExp>) getChildNoTransform(1);
    }
    /**
     * Retrieves the Arg list.
     * @return The node representing the Arg list.
     * @apilevel high-level
     */
    public List<FExp> getArgs() {
        return getArgList();
    }
    /**
     * Retrieves the Arg list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Arg list.
     * @apilevel low-level
     */
    public List<FExp> getArgsNoTransform() {
        return getArgListNoTransform();
    }
    /**
     * Replaces the FType child.
     * @param node The new node to replace the FType child.
     * @apilevel high-level
     */
    public void setFType(FType node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the FType child.
     * @return The current node used as the FType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FType")
    public FType getFType() {
        return (FType) getChild(2);
    }
    /**
     * Retrieves the FType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FType child.
     * @apilevel low-level
     */
    public FType getFTypeNoTransform() {
        return (FType) getChildNoTransform(2);
    }
    /**
     * Retrieves the Array child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Array child.
     * @apilevel low-level
     */
    public Array getArrayNoTransform() {
        return (Array) getChildNoTransform(3);
    }
    /**
     * Retrieves the child position of the optional child Array.
     * @return The the child position of the optional child Array.
     * @apilevel low-level
     */
    protected int getArrayChildPosition() {
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
            FClass fc = myFClass();
            if (!isComposite() || fc == null) {
                return super.getArray();
            }
            
            if (isArray() && variability().knownParameterOrLess() && inKeptBExp()) {
                Array arr = new Array(indices());
                CValueArray carr = (CValueArray) cevalArray(Index.NULL);
                for (Index i : arr.indices()) {
                    arr.set(i, carr.getCell(i).buildLiteral());
                }
                return arr;
            }
            
            if (isFunctionCallArg()) {
                return super.getArray();
            }
            
            FArraySubscripts fas = collectIterExpSubscripts();
            Array arr = new Array(indices());
            for (Index i : arr.indices()) {
                FArraySubscripts fas2 = fas.fullCopy();
                fas2.addFSubscripts(i);
                arr.set(i, new FIdUseExp(tempVarName(), fas2));
            }
            return arr;
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
        CValue cevalCalc_VariableEvaluator_value = evaluate(evaluator)[0];

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
        FExp argument_int_value = getArg(i);

        return argument_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOnlyLiterals() {
        ASTNode$State state = state();
        boolean hasOnlyLiterals_value = false;

        return hasOnlyLiterals_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasCompositeFunc() {
        ASTNode$State state = state();
        boolean hasCompositeFunc_value = type().isArray() || type().isRecord() || super.hasCompositeFunc();

        return hasCompositeFunc_value;
    }
    @ASTNodeAnnotation.Attribute
    public FCallable myFCallable() {
        ASTNode$State state = state();
        FCallable myFCallable_value = getName().myFCallable();

        return myFCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getNameNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String funcNameUnderscore(String suffix) {
        ASTNode$State state = state();
        String funcNameUnderscore_String_value = getName().funcNameUnderscore(suffix) + functionIndex();

        return funcNameUnderscore_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public int functionIndex() {
        ASTNode$State state = state();
        int functionIndex_value = myFCallable().functionIndex();

        return functionIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonCallable myCommonCallable() {
        ASTNode$State state = state();
        CommonCallable myCommonCallable_value = myFCallable();

        return myCommonCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunctionCall() {
        ASTNode$State state = state();
        boolean isPartialFunctionCall_value = false;

        return isPartialFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myCallInputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myCallInputs_value = myFCallable().myInputs();

        return myCallInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FFunctionVariable> myCallOutputs() {
        ASTNode$State state = state();
        ArrayList<FFunctionVariable> myCallOutputs_value = myFCallable().myOutputs();

        return myCallOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOutputs() {
        ASTNode$State state = state();
        boolean hasOutputs_value = !myCallOutputs().isEmpty();

        return hasOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public FFunctionVariable expOutput() {
        ASTNode$State state = state();
        FFunctionVariable expOutput_value = myCallOutputs().get(0);

        return expOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType typeOfOutput(int i) {
        ASTNode$State state = state();
        FType typeOfOutput_int_value = getFType().component(i);

        return typeOfOutput_int_value;
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
    public boolean isConstructorCall() {
        ASTNode$State state = state();
        boolean isConstructorCall_value = myFCallable().isConstructor();

        return isConstructorCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDestructorCall() {
        ASTNode$State state = state();
        boolean isDestructorCall_value = myFCallable().isDestructor();

        return isDestructorCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability expVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability expVariability_value = inputVariability().combineDown(type().funcOutputVariability());

        return expVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability inputVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability inputVariability_value = super.expVariability();

        return inputVariability_value;
    }
    /**
     * Return the derivative annotation matching this function call.
     * @attribute syn
     * @aspect DerivativeFunctions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:246
     */
    @ASTNodeAnnotation.Attribute
    public AnnotationNode derivativeAnnotation() {
        ASTNode$State state = state();
        try {
                FFunctionDecl myDecl = myFCallable().asFFunctionDecl();
                if (myDecl == null)
                    return null;
                
                Set<String> zeroDer = new HashSet<String>();
                for (int i = 0, n = getNumArg(); i < n; i++) {
                    if (getArg(i).variability().parameterOrLess()) {
                        zeroDer.add(myDecl.myInput(i).name());
                    }
                }
                return myDecl.derivativeAnnotation(order + 1, zeroDer);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotationExp() {
        ASTNode$State state = state();
        boolean isAnnotationExp_value = true;

        return isAnnotationExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<? extends ASTNode> annotationList() {
        ASTNode$State state = state();
        Iterable<? extends ASTNode> annotationList_value = getArgs();

        return annotationList_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = isInlinableFunctionCall(fi) || super.hasInlinableFunctions(fi);

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInlinableFunctionCall(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean isInlinableFunctionCall_AbstractFunctionInliner_value = myFCallable().isInlinable(fi, this);

        return isInlinableFunctionCall_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOkTrivialInline() {
        ASTNode$State state = state();
        boolean isOkTrivialInline_value = true;

        return isOkTrivialInline_value;
    }
    /**
     * @attribute syn
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:117
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability potentialPartialVariability() {
        ASTNode$State state = state();
        try {
                for (FExp exp : getArgs()) {
                    if (exp.variability().knownParameterOrLess()) {
                        return fConstant();
                    }
                }
                return super.potentialPartialVariability();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizeExpanded() {
        ASTNode$State state = state();
        boolean scalarizeExpanded_value = ((useTempVar && !inFunction()) || isVectorized()) && super.scalarizeExpanded();

        return scalarizeExpanded_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isVectorized() {
        ASTNode$State state = state();
        boolean isVectorized_value = false;

        return isVectorized_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNonVectorizedFunctionCall() {
        ASTNode$State state = state();
        boolean isNonVectorizedFunctionCall_value = true;

        return isNonVectorizedFunctionCall_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extractTemp() {
        ASTNode$State state = state();
        boolean extractTemp_value = (isFVectorFunctionCallArg() || !isFunctionCallArg()) &&
                    isComposite() && !isFunctionCallClause();

        return extractTemp_value;
    }
    /**
     * @attribute syn
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:69
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAssert> sizeAsserts() {
        ASTNode$State state = state();
        try {
                ArrayList<FAssert> a = new ArrayList<FAssert>();
                Iterator<FFunctionVariable> inputs = myCallInputs().iterator();
                for (FExp arg : getArgs()) {
                    inputs.next().size().sizeAsserts(a, arg.size(), arg);
                }
                return a;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int smoothOrder() {
        ASTNode$State state = state();
        int smoothOrder_value = myFCallable().smoothOrder();

        return smoothOrder_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "FunctionCall";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildADStatements_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildADStatements_CAD_value = false;

        return autoGenChildADStatements_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inlineVar_CAD() {
        ASTNode$State state = state();
        boolean inlineVar_CAD_value = false;

        return inlineVar_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inlineDer_CAD() {
        ASTNode$State state = state();
        boolean inlineDer_CAD_value = false;

        return inlineDer_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStringExp() {
        ASTNode$State state = state();
        boolean isStringExp_value = functionCallIsExp() && type().isString();

        return isStringExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isKnownStringLength() {
        ASTNode$State state = state();
        boolean isKnownStringLength_value = false;

        return isKnownStringLength_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1645
     */
    @ASTNodeAnnotation.Attribute
    public boolean inAlgorithm() {
        ASTNode$State state = state();
        boolean inAlgorithm_value = getParent().Define_inAlgorithm(this, null);

        return inAlgorithm_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2122
     */
    @ASTNodeAnnotation.Attribute
    public FExp findArgOfNestledFunctionCall(int index, int depth) {
        ASTNode$State state = state();
        FExp findArgOfNestledFunctionCall_int_int_value = getParent().Define_findArgOfNestledFunctionCall(this, null, index, depth);

        return findArgOfNestledFunctionCall_int_int_value;
    }
    /**
     * @attribute inh
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:885
     */
    @ASTNodeAnnotation.Attribute
    public boolean expandWithIterExp() {
        ASTNode$State state = state();
        boolean expandWithIterExp_value = getParent().Define_expandWithIterExp(this, null);

        return expandWithIterExp_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2831
     * @apilevel internal
     */
    public boolean Define_inFunctionCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2836
     * @apilevel internal
     */
    public boolean Define_isFunctionCallArg(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_isFunctionCallArg(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2844
     * @apilevel internal
     */
    public CommonVariableDecl Define_myCorrespondingInput(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return myFCallable().myInput(i);
        }
        else {
            return getParent().Define_myCorrespondingInput(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3151
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return !getArg(i).isComposite();
        }
        else {
            return super.Define_functionCallIsExp(caller, child);
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        if (caller == getArrayNoTransform()) {
            return tempVarName();
        }
        else {
            return getParent().Define_calcGeneratedVarName(this, caller, gvt);
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2122
     * @apilevel internal
     */
    public FExp Define_findArgOfNestledFunctionCall(ASTNode caller, ASTNode child, int index, int depth) {
        int childIndex = this.getIndexOfChild(caller);
        return (depth == 0) ? getArg(index) : findArgOfNestledFunctionCall(index, depth - 1);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:324
     * @apilevel internal
     */
    public boolean Define_inNonDiffArg(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            {
                    FFunctionDecl myDecl = myFCallable().asFFunctionDecl();
                    if (myDecl == null)
                        return false;
                    if (!myDecl.getFFunctionVariable(i).shouldBeDifferentiated(derivativeAnnotation()))
                        return true;
                    return inNonDiffArg();
                }
        }
        else {
            return getParent().Define_inNonDiffArg(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:75
     * @apilevel internal
     */
    public boolean Define_isFunctionCallIO(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return super.Define_isFunctionCallIO(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:92
     * @apilevel internal
     */
    public boolean Define_inUnknownSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FStatement_sizeAssertsColl() {
    /**
     * @attribute coll
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:44
     */
            {
                FStatement ref = (FStatement) (myFStatement());
                if (ref != null) {
                    ref.FStatement_sizeAssertsColl_contributors().add(this);
                }
            }
        super.collect_contributors_FStatement_sizeAssertsColl();
    }
    protected void contributeTo_FStatement_FStatement_sizeAssertsColl(ArrayList<FAssert> collection) {
        super.contributeTo_FStatement_FStatement_sizeAssertsColl(collection);
        collection.addAll(sizeAsserts());
    }

}
