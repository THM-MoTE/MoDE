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
 * A record type.
 * 
 * In the instance tree, the components are stored alphabetically, 
 * but in the flat tree they are in the order declared. 
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:348
 * @production FRecordType : {@link FType} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">Component:{@link FRecordComponentType}*</span> <span class="component">&lt;FClass:FClass&gt;</span>;

 */
public class FRecordType extends FType implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4132
     */
    public CValue assignToPartInFuncEval(
		  CommonNamePart name, CValue left, CValue right) {
	  CommonNamePart next = name.nextNamePart();
	  if (next == null) 
		  return assignToLastInFuncEval(name, left, right);

	  FType nextType = componentType(next.name(), getComponents());
	  if (isArray()) {
          if (left.isUnknown()) {
              left = new CValueArray(size()).markAsCached();
          }
		  CValueArray arr = left.array();
		  if (name.isArray()) {
			  Indices ind = name.indices();
			  int rdims = right.size().ndims();
			  Size ns = right.size().promote(rdims - ind.ndims());
			  Indices nind = Indices.create(ns);
			  CValueArray ra = right.array();
			  for (Index i : ind) {
				  if (ns != Size.SCALAR) {
					  CValueArray ra2 = new CValueArray(ns);
					  for (Index j : nind) 
						  ra2.setCell(j, ra.getCell(i.expand(j)));
					  right = ra2;
				  } else {
					  right = ra.getCell(i);
				  }
				  Index j = ind.translate(i);
				  arr.setCell(j, assignToRecPartInFuncEval(next, nextType, arr.getCell(j), right));
			  }
		  } else {
			  Index i = name.getFArraySubscripts().createIndex();
			  arr.setCell(i, assignToRecPartInFuncEval(next, nextType, arr.getCell(i), right));
		  }
	  } else {
		  left = assignToRecPartInFuncEval(next, nextType, left, right);
	  }
	  return left;
  }
    /**
     * Handle one part of the left access of an assignment during function evaluation.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4175
     */
    public CValue assignToRecPartInFuncEval(
		  CommonNamePart next, FType nextType, CValue left, CValue right) {
      if (left.isUnknown()) {
          left = new CValueRecord(this).markAsCached();
      }
	  CValue val = left.record().getMember(next.name());
	  val = nextType.assignToPartInFuncEval(next, val, right);
	  left.record().setMember(next.name(), val);
	  return left;
  }
    /**
     * @aspect ExternalProcessCommunication
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:859
     */
    public CValue deserializeScalar(ProcessCommunicator com) throws IOException {
        CValueRecord res = new CValueRecord(this);
        for (FRecordComponentType frct : getComponents()) {
            res.setMember(frct.getName(), frct.getFType().deserialize(com));
        }
        return res;
    }
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:632
     */
    public FType lookupHierarchical(FQName name, int part, int last) {
        if (part == last) {
            return this;
        }
        FAbstractVariable res = null;
        String pn = name.partName(part);
        for (FRecordComponentType frct : getComponents())
            if (frct.getName().equals(pn))
                return frct.getFType().lookupHierarchical(name, part + 1, last);
        return null;
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1044
     */
    protected boolean recursiveTypeCheck(TypeChecker ch) {
        for (FRecordComponentType c : getComponents())
            if (!c.getFType().recursiveTypeCheck(ch))
                return false;
        return true;
    }
    /**
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1144
     */
    public FExp zeroLiteral()  {
        List<FExp> args = new List<FExp>();
        for (FRecordComponentType t : getComponents())
            args.add(t.getFType().zeroLiteral());
        return new FRecordConstructor(new FIdUse(getName()), args); 
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:649
     */
    public void contentCheckFortranArg(ErrorCheckType checkType, FExternalStmt stmt) {
        stmt.error("Passing records to external fortran functions is not allowed");
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:671
     */
    public void contentCheckCArg(ErrorCheckType checkType, FExternalStmt stmt) {
        if (!externalValid()) {
            stmt.error("Record type used as input or output to external function can only contain scalar record or scalar simple types");
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:481
     */
    public void updateRecordArraySizes(FType from) {
        super.updateRecordArraySizes(from);
        FRecordType rfrom = (FRecordType) from;
        for (FRecordComponentType comp : getComponents())
            comp.getFType().updateRecordArraySizes(componentType(comp.getName(), rfrom.getComponents()));
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:816
     */
    @Override
    public FType flatten(FQName prefix, InstAssignable ia, boolean keepSizeExpressions) {
        List<FRecordComponentType> comps = new List<FRecordComponentType>();
        for (FRecordComponentType frct : getComponents()) {
            comps.add(frct.flatten(prefix, ia, keepSizeExpressions));
        }
        FRecordType res = new FRecordType(getSize(), getName(), comps, getFClass());
        res.setSize(getSize().flatten(prefix, res, keepSizeExpressions));
        res.flattened = true;
        return res;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:851
     */
    private boolean flattened = false;
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2704
     */
    public void clearFlattened() { flattened = false; super.clearFlattened(); }
    /**
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:140
     */
    public FType componentType(String name) {
        FType res = componentType(name, getComponents());
        return res == null ? super.componentType(name) : res;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2133
     */
    public void activateEquivalentRecordUseRewrite() {
        super.activateEquivalentRecordUseRewrite();
        rewriteEquivalentRecord = true;
        is$Final = false;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2151
     */
    private boolean rewriteEquivalentRecord        = false;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2203
     */
    public void transferSizes(FType t) {
        super.transferSizes(t);
        if (!t.isUnknown() && !t.isNoType()) {
            FRecordType rt = (FRecordType) t;
            for (int i = 0; i < getNumComponent(); i++) {
                getComponent(i).getFType().transferSizes(rt.getComponent(i).getFType());
            }
        }
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:4005
     */
    @Override
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        super.markUsedFunctionsAndRecords(type);
        myFRecordDecl().markUsedFunctionsAndRecords(type);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:882
     */
    public FExp buildFExpCell(ExpFromTypeBuilder b, String suffix) {
         FRecordConstructor frc = new FRecordConstructor(getName());
         for (FRecordComponentType frct : getComponents()) {
             frc.addArg(frct.getFType().buildFExp(b, suffix + "." + frct.getName()));
         }
         return frc;
     }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1715
     */
    public FType replaceReferences(AbstractFunctionInliner fi) {
        super.replaceReferences(fi);
        for (FRecordComponentType frct : getComponents()) {
            frct.getFType().replaceReferences(fi);
        }
        return this;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:991
     */
    @Override
    public void scalarRecordClauses(Scalarizer s, FQName suffix, FExp left, FExp right) {
        for (FRecordComponentType comp : getComponents()) {
            FQName next = suffix.copyAndAppend(comp.getName()).asFQNameFull();
            comp.getFType().scalarRecordComponentClauses(s, next, left, right);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1257
     */
    public void addDummyEqnsForTemp(List<FAbstractEquation> l, String name) {
        if (isArray()) {
            super.addDummyEqnsForTemp(l, name);
        } else {
            for (FRecordComponentType comp : getComponents())
                comp.getFType().addDummyEqnsForTemp(l, name + '.' + comp.getName());
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1349
     */
    public FExp createRecordConstructorCell(Map<String,FExp> indexMap, FExp exp) {
		FRecordConstructor rc = new FRecordConstructor(new FIdUse(getName()), new List());
		for (FRecordComponentType comp : getComponents()) {
             FExp next = exp.scalarRecordFExp(indexMap, comp.getName());
             if (exp.type().isUnknown()) {
                 // Work around for expanding FIdTempExp which doesnt know its type
                 next = comp.getFType().createRecordConstructor(indexMap, exp.dynamicFExp(next));
             }
             rc.addArg(next);
		}
		return rc;
	}
    /**
     * Creates temporary variables for a record with the given name.
     * 
     * @param vars         list of variable to add the new variable to
     * @param name         the name of the new variable
     * @param variability  the variability of the new variable
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1404
     */
    public void createTempCellFVariables(List vars, FQName name, FTypePrefixVariability variability) {
        for (FRecordComponentType comp : getComponents()) {
            FQName next = name.copyAndAppend(comp.getName());
            comp.getFType().createTempFVariables(vars, next, variability);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1454
     */
    public FVariable createFVariable(FVisibilityType fvt, FQName name, 
			FTypePrefixVariability variability) {
		return new FRecordVariable(fvt, variability, name, new FQNameString(getName()));
	}
    /**
     * @aspect AssignmentScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeAlgorithms.jrag:220
     */
    protected void scalarizeScalarAssignment(Scalarizer.Algorithm s, FAssignableExp left, FExp right) {
        scalarRecordClauses(s, new FQNameEmpty(), left, right);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:849
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        // Scalar type
        printStruct_C(p, str, indent, false);
        
        //Array type
		str.print(indent);
		str.print("JMI_ARRAY_TYPE(");
        str.print(nameScalar_C());
		str.print(", ");
		str.print(nameArray_C());
		str.print(")\n\n");
        
        // External type
        if (externalValid()) {
            printStruct_C(p, str, indent, true);
        }
        str.print("\n");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:869
     */
    public void printStruct_C(CodePrinter p, CodeStream str, String indent, boolean ext) {
        String name = ext ? nameScalarExt_C() : nameScalar_C();
        FFunctionDecl.beginStruct_C(str, indent, name);
        String next = p.indent(indent);
        for (FRecordComponentType frct : getComponents()) {
            str.print(next);
            str.print(ext ? frct.getFType().nameScalarExt_C() : frct.getFType().type_C());
            str.print(" ");
            str.print(frct.getName());
            str.print(";\n");
        }
        if (getNumComponent() == 0) {
            // always generate default field so that C struct is not empty
            str.print(next + "char dummy;\n");
        }
        FFunctionDecl.endStruct_C(str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1142
     */
    public void print(TypePrinter_C p)         { p.print(this); }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2141
     */
    @Override
    public void printAssignExt_C(CodePrinter p, CodeStream str, String indent, String dst, String src, 
            boolean wb, boolean first) {
        dst = dst + (first ? "->" : ".");
        src = src + "->";
        for (FRecordComponentType frct : getComponents()) {
            frct.getFType().printAssignExt_C(p, str, indent, dst + frct.getName(), src + frct.getName(), wb, false);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3698
     */
    @Override
    public void printScalarDecl_C(CodeStream str, String indent, boolean external, String name) {
        str.formatln("%sJMI_RECORD_STATIC(%s, %s)", indent, nameScalar_C(external), name);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4682
     */
    @Override
    public void genFuncCallCellInOutArg_C(CodeFuncCallInOutArgPrinter p, CodeStream str, String indent, String name, FExp exp) {
        if (exp.isNoExp()) {
            return;
        }
        for (FRecordComponentType comp : getComponents()) {
            String compName = name + "->" + comp.getName();
            FExp compExp = exp.extractRecordComponentExp(comp.getName());
            comp.getFType().genFuncCallInOutArg_C(p, str, indent, compName, compExp);
        }
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:225
     */
    public void genSerialize_C(CodeStream str, String indent, String name, boolean parse) {
        name = name + "->";
        for (FRecordComponentType frct : getComponents()) {
            if (!frct.getFType().isRecord() || !parse) {
                frct.getFType().genSerialize_C(str, indent, name + frct.getName(), parse);
            }
        }
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:330
     */
    public void usedTypes(Map<String,FType> res) {
        if (res.containsKey(name())) {
            return;
        }
        for (FRecordComponentType frct : getComponents()) {
            frct.getFType().usedTypes(res);
        }
        res.put(name(), this);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FRecordType() {
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
        children = new ASTNode[1];
        setChild(new List(), 0);
    }
    /**
     * @declaredat ASTNode:14
     */
    public FRecordType(Size p0, String p1, List<FRecordComponentType> p2, FClass p3) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setFClass(p3);
    }
    /**
     * @declaredat ASTNode:20
     */
    public FRecordType(Size p0, Symbol p1, List<FRecordComponentType> p2, FClass p3) {
        setSize(p0);
        setName(p1);
        setChild(p2, 0);
        setFClass(p3);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:29
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myFRecordDecl_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:54
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FRecordType clone() throws CloneNotSupportedException {
        FRecordType node = (FRecordType) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public FRecordType copy() {
        try {
            FRecordType node = (FRecordType) clone();
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
     * @declaredat ASTNode:86
     */
    public FRecordType fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public FRecordType treeCopyNoTransform() {
        FRecordType tree = (FRecordType) copy();
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
     * @declaredat ASTNode:115
     */
    public FRecordType treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenSize_Size == ((FRecordType)node).tokenSize_Size) && (tokenString_Name == ((FRecordType)node).tokenString_Name) && (tokenFClass_FClass == ((FRecordType)node).tokenFClass_FClass);    
    }
    /**
     * Replaces the lexeme Size.
     * @param value The new value for the lexeme Size.
     * @apilevel high-level
     */
    public void setSize(Size value) {
        tokenSize_Size = value;
    }
    /**
     * Retrieves the value for the lexeme Size.
     * @return The value for the lexeme Size.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Size")
    public Size getSize() {
        return tokenSize_Size;
    }
    /**
     * Replaces the lexeme Name.
     * @param value The new value for the lexeme Name.
     * @apilevel high-level
     */
    public void setName(String value) {
        tokenString_Name = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Name;
    /**
     */
    public int Namestart;
    /**
     */
    public int Nameend;
    /**
     * JastAdd-internal setter for lexeme Name using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Name
     * @apilevel internal
     */
    public void setName(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setName is only valid for String lexemes");
        tokenString_Name = (String)symbol.value;
        Namestart = symbol.getStart();
        Nameend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Name.
     * @return The value for the lexeme Name.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Name")
    public String getName() {
        return tokenString_Name != null ? tokenString_Name : "";
    }
    /**
     * Replaces the Component list.
     * @param list The new list node to be used as the Component list.
     * @apilevel high-level
     */
    public void setComponentList(List<FRecordComponentType> list) {
        setChild(list, 0);
    }
    /**
     * Retrieves the number of children in the Component list.
     * @return Number of children in the Component list.
     * @apilevel high-level
     */
    public int getNumComponent() {
        return getComponentList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Component list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Component list.
     * @apilevel low-level
     */
    public int getNumComponentNoTransform() {
        return getComponentListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Component list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Component list.
     * @apilevel high-level
     */
    public FRecordComponentType getComponent(int i) {
        return (FRecordComponentType) getComponentList().getChild(i);
    }
    /**
     * Check whether the Component list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasComponent() {
        return getComponentList().getNumChild() != 0;
    }
    /**
     * Append an element to the Component list.
     * @param node The element to append to the Component list.
     * @apilevel high-level
     */
    public void addComponent(FRecordComponentType node) {
        List<FRecordComponentType> list = (parent == null || state == null) ? getComponentListNoTransform() : getComponentList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addComponentNoTransform(FRecordComponentType node) {
        List<FRecordComponentType> list = getComponentListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Component list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setComponent(FRecordComponentType node, int i) {
        List<FRecordComponentType> list = getComponentList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Component")
    public List<FRecordComponentType> getComponentList() {
        List<FRecordComponentType> list = (List<FRecordComponentType>) getChild(0);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getComponentListNoTransform() {
        return (List<FRecordComponentType>) getChildNoTransform(0);
    }
    /**
     * Retrieves the Component list.
     * @return The node representing the Component list.
     * @apilevel high-level
     */
    public List<FRecordComponentType> getComponents() {
        return getComponentList();
    }
    /**
     * Retrieves the Component list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Component list.
     * @apilevel low-level
     */
    public List<FRecordComponentType> getComponentsNoTransform() {
        return getComponentListNoTransform();
    }
    /**
     * Replaces the lexeme FClass.
     * @param value The new value for the lexeme FClass.
     * @apilevel high-level
     */
    public void setFClass(FClass value) {
        tokenFClass_FClass = value;
    }
    /**
     * @apilevel internal
     */
    protected FClass tokenFClass_FClass;
    /**
     * Retrieves the value for the lexeme FClass.
     * @return The value for the lexeme FClass.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="FClass")
    public FClass getFClass() {
        return tokenFClass_FClass;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1135
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarElements() {
        ASTNode$State state = state();
        try {
                int res = 0;
                for (FRecordComponentType c : getComponents())
                    res += c.getFType().numScalarElements();
                return res * super.numScalarElements();
            }
        finally {
        }
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
        myFRecordDecl_value = (getFClass() != null) ? getFClass().lookupFRec(getName()) : lookupFRec(getName());
        if (isFinal && num == state().boundariesCrossed) {
            myFRecordDecl_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFRecordDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String signatureString() {
        ASTNode$State state = state();
        String signatureString_value = String.format("(%s)%d", getName(), ndims());

        return signatureString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean typeCompatible(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean typeCompatible_FType_boolean_value = typeMatches(type, true, allowUnknown);

        return typeCompatible_FType_boolean_value;
    }
    /**
     * @attribute syn
     * @aspect FTypeCompatibility
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:814
     */
    @ASTNodeAnnotation.Attribute
    public boolean typeMatches(FType type, boolean compatible, boolean allowUnknown) {
        ASTNode$State state = state();
        try {
                if (!dimensionCompatible(type, allowUnknown) || !type.isRecord())
                    return false;
                FRecordType rec = (FRecordType) type;
                if (getName().equals(rec.getName())) 
                    return true;
                if (getNumComponent() != rec.getNumComponent())
                    return false;
                TreeSet<FRecordComponentType> comps1 = new TreeSet<FRecordComponentType>();
                TreeSet<FRecordComponentType> comps2 = new TreeSet<FRecordComponentType>();
                for (FRecordComponentType t : getComponents())
                    comps1.add(t);
                for (FRecordComponentType t : rec.getComponents())
                    comps2.add(t);
                return typeMatches(comps1, comps2, compatible, true);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean equivalentTo(FType type, boolean allowUnknown) {
        ASTNode$State state = state();
        boolean equivalentTo_FType_boolean_value = typeMatches(type, false, allowUnknown);

        return equivalentTo_FType_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecord() {
        ASTNode$State state = state();
        boolean isRecord_value = true;

        return isRecord_value;
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:992
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsReal() {
        ASTNode$State state = state();
        try {
                for (FRecordComponentType component : getComponents())
                    if (component.getFType().containsReal())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:999
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsInteger() {
        ASTNode$State state = state();
        try {
                for (FRecordComponentType component : getComponents())
                    if (component.getFType().containsInteger())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1006
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsBoolean() {
        ASTNode$State state = state();
        try {
                for (FRecordComponentType component : getComponents())
                    if (component.getFType().containsBoolean())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1014
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsEnum() {
        ASTNode$State state = state();
        try {
                for (FRecordComponentType component : getComponents())
                    if (component.getFType().containsEnum())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect BuiltInFlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:1021
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsExternalObject() {
        ASTNode$State state = state();
        try {
                for (FRecordComponentType component : getComponents())
                    if (component.getFType().containsExternalObject())
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:212
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability funcOutputVariability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability var = fConstant();
                for (FRecordComponentType component : getComponents()) {
                    var = var.combine(component.getFType().funcOutputVariability());
                }
                return var;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:678
     */
    @ASTNodeAnnotation.Attribute
    public boolean externalValid(boolean rec) {
        ASTNode$State state = state();
        try {
                if (isArray()) {
                    return false;
                }
                for (FRecordComponentType frct : getComponents()) {
                    if (!frct.getFType().externalValid(true)) {
                        return false;
                    }
                }
                return true;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String scalarType_C() {
        ASTNode$State state = state();
        String scalarType_C_value = nameScalar_C() + "*";

        return scalarType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String scalarExternalType_C() {
        ASTNode$State state = state();
        String scalarExternalType_C_value = nameScalarExt_C() + "*";

        return scalarExternalType_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalar_C() {
        ASTNode$State state = state();
        String nameScalar_C_value = (getFClass() != null ? myFRecordDecl().name_C() : 
                ASTNode.underScore(getName())) + "_" + C_SUFFIX_REC;

        return nameScalar_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameArray_C() {
        ASTNode$State state = state();
        String nameArray_C_value = nameScalar_C() + C_SUFFIX_ARRAY;

        return nameArray_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameScalarExt_C() {
        ASTNode$State state = state();
        String nameScalarExt_C_value = nameScalar_C() +  C_SUFFIX_EXT;

        return nameScalarExt_C_value;
    }
    /**
     * @attribute inh
     * @aspect FlatRecordBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:578
     */
    @ASTNodeAnnotation.Attribute
    public FRecordDecl lookupFRec(String name) {
        ASTNode$State state = state();
        FRecordDecl lookupFRec_String_value = getParent().Define_lookupFRec(this, null, name);

        return lookupFRec_String_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:853
        if (flattened) {
            state().duringFlattening++;
            ASTNode result = rewriteRule0();
            state().duringFlattening--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2156
        if (rewriteEquivalentRecord) {
            state().duringTransformCanonical++;
            ASTNode result = rewriteRule1();
            state().duringTransformCanonical--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:853
     * @apilevel internal
     */
    private FRecordType rewriteRule0() {
{
            setFClass(myFClass());
            flattened = false;
            return this;
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2156
     * @apilevel internal
     */
    private FType rewriteRule1() {
{
            return myFClass().createEquivalentRecordType(this);
		}    }
}
