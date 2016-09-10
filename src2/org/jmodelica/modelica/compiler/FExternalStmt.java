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
 * An external function interface in the flat tree. Implemented as a statement.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:802
 * @production FExternalStmt : {@link FStatement} ::= <span class="component">{@link FExternalLanguage}</span> <span class="component">[ReturnVar:{@link FIdUseExp}]</span> <span class="component">&lt;Name:String&gt;</span> <span class="component">Arg:{@link FExp}*</span>;

 */
public class FExternalStmt extends FStatement implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4221
     */
    @Override
  public int evaluate(AlgorithmEvaluator evaluator) {
      if (!canEvaluate()) {
          evaluator.clear();
          return EVAL_RETURN;
      }
      return evaluateExternal(evaluator.getValues());
  }
    /**
     * Evaluate this statement as an external function constructor call. Stores evaluated
     * inputs in a CValueExternalObject.
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:106
     */
    public int evaluateConstructor(Map<CommonVariableDecl, CValue> values) {
        ArrayList<FExp> args = myConstructorArgs();
        CValue[] vals = new CValue[args.size()];
        for (int i = 0; i < args.size(); i++)
            vals[i] = args.get(i).ceval();
        values.put(myConstructorOutput(), new CValueExternalObject(vals));
        return EVAL_CONT;
    }
    /**
     * Retrieve {@link ExternalFunction} object which represents the external function
     * this statement refers to.
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:129
     */
    public ExternalFunctionCache.ExternalFunction myExternalFunction() {
        ExternalFunctionCache efc = root().getUtilInterface().getExternalFunctionCache();
        if (efc == null) {
            return ExternalFunctionCache.failedEval(this, "external function cache unavailable");
        }
        return efc.getExternalFunction(this);
    }
    /**
     * Evaluate this external statement.
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:148
     */
    public int evaluateExternal(Map<CommonVariableDecl, CValue> values) {
        
        if (isConstructorStmt()) {
            return evaluateConstructor(values);
        }
        
        int res = 0;
        int timeout = myOptions().getIntegerOption("external_constant_evaluation");
        ExternalFunctionCache.ExternalFunction ef = myExternalFunction();
        String error = null;
        try {
            res = ef.evaluate(this, values, timeout);
            if (res != 0) {
                error = "process returned '" + res + "'";
            }
        } catch (IOException e) {
            error = "error in process communication: '"+ e.getMessage() + "'";
        }
        
        if (error != null) {
            throw new ConstantEvaluationException(null, ExternalFunctionCache.failedEvalMsg(this, error));
        }
        
        return EVAL_CONT;
    }
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3862
     */
    private String[] library;
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3863
     */
    private String include;
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3864
     */
    private String libraryDir;
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3865
     */
    private String includeDir;
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3867
     */
    public void extractLibrary(FExternalStmt n) {
        this.library = n.library;
        this.include = n.include;
        this.libraryDir = n.libraryDir;
        this.includeDir = n.includeDir;
    }
    /**
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3874
     */
    public void extractLibrary(InstExternal n) {
        library = n.annotation("Library").asStringVector();
        include = n.annotation("Include").string();
        libraryDir = n.annotation("LibraryDirectory").string();
        includeDir = n.annotation("IncludeDirectory").string();
        
        if (libraryDir == null || includeDir == null) {
            String libraryName = n.libraryName();
            if (libraryName != null) {
                String defDir = "modelica://" + libraryName + "/Resources";
                libraryDir = (libraryDir == null && library != null) ? 
                        defDir + "/Library" : libraryDir;
                includeDir = (includeDir == null && include != null) ? 
                        defDir + "/Include" : includeDir;
            }
        }
        
        if (includeDir != null) 
            includeDir = n.resolve(includeDir);
        if (libraryDir != null) {
            libraryDir = n.resolve(libraryDir);
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1448
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print("external ");
		p.print(getFExternalLanguage(), str, indent);
		str.print(" ");
		if (hasReturnVar()) {
			p.print(getReturnVar(), str, indent);
			str.print(" = ");
		}
		str.print(getName());
		str.print("(");
		getArgs().prettyPrintWithSep(p, str, indent, ", ");
		str.print(")");
	}
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:67
     */
    public ArrayList<FExp> myConstructorArgs() {
        ArrayList<FExp> res = new ArrayList<FExp>();
        for (FExp arg : getArgs()) {
            if (arg.isConstructorTypeArg()) {
                res.add(arg);
            }
        }
        return res;
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:409
     */
    public void complianceCheck(ErrorCheckType checkType) {
        getFExternalLanguage().complianceCheck(checkType, this);
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:628
     */
    public void contentCheck(ErrorCheckType checkType) {
        getFExternalLanguage().contentCheck(checkType, this);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:647
     */
    public boolean flatten(List<FStatement> sl, FClass fc, FQName prefix) {
        List<FExp> args = new List<FExp>();
        for (FExp arg : getArgs()) {
            args.add(arg.flatten(prefix));
        }
        Opt<FIdUseExp> ret = hasReturnVar() ? 
                new Opt<FIdUseExp>((FIdUseExp)getReturnVar().flatten(prefix)) : 
                new Opt<FIdUseExp>();
                
        FExternalStmt stmt = new FExternalStmt(getFExternalLanguage().treeCopy(), ret, getName(), args);
        stmt.extractLibrary(this);
        sl.add(stmt);
        return false;
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1682
     */
    @Override
	public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
		FExternalLanguage lang = getFExternalLanguage();
		lang.genVarDecls_C(p, str, indent, this);
		lang.genFuncDecl(p, str, indent, this);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2055
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {		
		// Generate temp arrays for all array inputs and outputs
		// and transpose array for if array is input (Fortran 77 only)
		getFExternalLanguage().prepExternalArg(p, str, indent, this, false);
		
		str.print(indent);
		// return variable?
		if(hasReturnVar()) {
            String name = getReturnVar().type().isRecord() ?
                    "*"+getReturnVar().tempName_C() :
                    getReturnVar().getFIdUse().name_C();
            str.print(getCodeGenContext().alias(name));
            str.print(" = ");
		}
		
		// print function call
		getFExternalLanguage().genFuncCall(p, str, indent, this);
		
		// If there are any output arrays, transpose these before returning (Fortran 77 only)
		getFExternalLanguage().prepExternalArg(p, str, indent, this, true);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2320
     */
    private CodeGenContext codeGenContext = null;
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2321
     */
    public void setCodeGenContext(CodeGenContext cgc) { codeGenContext = cgc; }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2322
     */
    public CodeGenContext getCodeGenContext() { return codeGenContext == null ? myCodeGenContext() : codeGenContext; }
    /**
     * Generate all C-declarations necessary for an external evaluation
     * 
     * @param p       ASTNode code generation visitor
     * @param str     output code stream
     * @param indent  indentation string
     * @param cgc     context for generating temporaries
     * @param tempMap maps expressions that should be replaced with temporaries
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:166
     */
    public void genSerialize_C(TypePrinter_C tp, String indent,
            CodeGenContext cgc, Map<String,String> tempMap, Iterable<CommonVariableDecl> cvds) {
        for (CommonVariableDecl cvd : cvds) {
             tp.reset(cvd.name_C(), null, cvd.size().isUnknown(), false, indent);
             cvd.type().print(tp);
        }
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:174
     */
    public void genSerializeComps_C(TypePrinter_C tp, String indent,
            CodeGenContext cgc, Map<String,String> tempMap, Iterable<CommonVariableDecl> cvds) {
        for (CommonVariableDecl cvd : cvds) {
             tp.reset(cvd.name_C(), null, cvd.size().isUnknown(), false, indent);
             tp.printComps((FExternalObjectType)cvd.type());
        }
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:182
     */
    public void genSerializeNoComps_C(TypePrinter_C tp, String indent,
            CodeGenContext cgc, Map<String,String> tempMap, Iterable<CommonVariableDecl> cvds) {
        for (CommonVariableDecl cvd : cvds) {
             tp.reset(cvd.name_C(), null, cvd.size().isUnknown(), false, indent);
             tp.printExt((FExternalObjectType)cvd.type());
        }
    }
    /**
     * Generate statements for type conversions, calling the external function,
     * and printing return values on stdout.
     * 
     * For parameters {@link FExternalStmt.genSerializeDecl_C}
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:196
     */
    public void genSerializeCalc_C(CodePrinter p, CodeStream str, String indent,
            CodeGenContext cgc, Map<String,String> tempMap) {
        prettyPrint_C(p, str, indent);
        genCheckPoint(str, indent, "DONE");
        for (CommonVariableDecl cvd : varsToDeserialize())
            cvd.type().genSerialize_C(str, indent, cvd.name_C(), false);
        str.println();
    }
    /**
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:205
     */
    public void genCheckPoint(CodeStream str, String indent, String token) {
        str.print(indent);
        str.print("JMCEVAL_check(\"");
        str.print(token);
        str.print("\");\n");
    }
    /**
     * CommonVariableDecls from enclosing function
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:305
     */
    private ArrayList<CommonVariableDecl> myCommonVarDecls() {
        FFunctionDecl decl = containingFFunctionDecl();
        if (decl != null)
            return new ArrayList<CommonVariableDecl>(decl.getFFunctionVariables().toArrayList());
        else
            return new ArrayList<CommonVariableDecl>(enclosingInstClassDecl().getInstComponentDecls().toArrayList());
    }
    /**
     * @declaredat ASTNode:1
     */
    public FExternalStmt() {
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
        setChild(new List(), 2);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FExternalStmt(FExternalLanguage p0, Opt<FIdUseExp> p1, String p2, List<FExp> p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setName(p2);
        setChild(p3, 2);
    }
    /**
     * @declaredat ASTNode:21
     */
    public FExternalStmt(FExternalLanguage p0, Opt<FIdUseExp> p1, Symbol p2, List<FExp> p3) {
        setChild(p0, 0);
        setChild(p1, 1);
        setName(p2);
        setChild(p3, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:30
     */
    protected int numChildren() {
        return 3;
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
        myFClass_reset();
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
    public FExternalStmt clone() throws CloneNotSupportedException {
        FExternalStmt node = (FExternalStmt) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public FExternalStmt copy() {
        try {
            FExternalStmt node = (FExternalStmt) clone();
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
     * @declaredat ASTNode:87
     */
    public FExternalStmt fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public FExternalStmt treeCopyNoTransform() {
        FExternalStmt tree = (FExternalStmt) copy();
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
     * @declaredat ASTNode:116
     */
    public FExternalStmt treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:123
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_Name == ((FExternalStmt)node).tokenString_Name);    
    }
    /**
     * Replaces the FExternalLanguage child.
     * @param node The new node to replace the FExternalLanguage child.
     * @apilevel high-level
     */
    public void setFExternalLanguage(FExternalLanguage node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FExternalLanguage child.
     * @return The current node used as the FExternalLanguage child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FExternalLanguage")
    public FExternalLanguage getFExternalLanguage() {
        return (FExternalLanguage) getChild(0);
    }
    /**
     * Retrieves the FExternalLanguage child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FExternalLanguage child.
     * @apilevel low-level
     */
    public FExternalLanguage getFExternalLanguageNoTransform() {
        return (FExternalLanguage) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the ReturnVar child. This is the <code>Opt</code>
     * node containing the child ReturnVar, not the actual child!
     * @param opt The new node to be used as the optional node for the ReturnVar child.
     * @apilevel low-level
     */
    public void setReturnVarOpt(Opt<FIdUseExp> opt) {
        setChild(opt, 1);
    }
    /**
     * Replaces the (optional) ReturnVar child.
     * @param node The new node to be used as the ReturnVar child.
     * @apilevel high-level
     */
    public void setReturnVar(FIdUseExp node) {
        getReturnVarOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ReturnVar child exists.
     * @return {@code true} if the optional ReturnVar child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasReturnVar() {
        return getReturnVarOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ReturnVar child.
     * @return The ReturnVar child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FIdUseExp getReturnVar() {
        return (FIdUseExp) getReturnVarOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ReturnVar child. This is the <code>Opt</code> node containing the child ReturnVar, not the actual child!
     * @return The optional node for child the ReturnVar child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ReturnVar")
    public Opt<FIdUseExp> getReturnVarOpt() {
        return (Opt<FIdUseExp>) getChild(1);
    }
    /**
     * Retrieves the optional node for child ReturnVar. This is the <code>Opt</code> node containing the child ReturnVar, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ReturnVar.
     * @apilevel low-level
     */
    public Opt<FIdUseExp> getReturnVarOptNoTransform() {
        return (Opt<FIdUseExp>) getChildNoTransform(1);
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
     * Replaces the Arg list.
     * @param list The new list node to be used as the Arg list.
     * @apilevel high-level
     */
    public void setArgList(List<FExp> list) {
        setChild(list, 2);
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
        List<FExp> list = (List<FExp>) getChild(2);
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
        return (List<FExp>) getChildNoTransform(2);
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
     * Check if this external function can be evaluated.
     * @attribute syn
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:34
     */
    @ASTNodeAnnotation.Attribute
    public boolean canEvaluate() {
        ASTNode$State state = state();
        try {
                if (myOptions().getIntegerOption("external_constant_evaluation") == 0)
                    return false;
                for (FExp arg : getArgs()) {
                    if (!arg.type().externalValid()) {
                        return false;
                    }
                }
                if (hasReturnVar() && !getReturnVar().type().externalValid()) {
                    return false;
                }
                return true;
            }
        finally {
        }
    }
    /**
     * Check if this external function should be cached as a live process.
     * @attribute syn
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:51
     */
    @ASTNodeAnnotation.Attribute
    public boolean shouldCacheExternalObject() {
        ASTNode$State state = state();
        try {
                return cachedExternalObject() != null && 
                    myOptions().getIntegerOption("external_constant_evaluation_max_proc") > 0;
            }
        finally {
        }
    }
    /**
     * Returns a single scalar external object which can be cached. If there is not exactly
     * one scalar external object, return null.
     * @attribute syn
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:60
     */
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl cachedExternalObject() {
        ASTNode$State state = state();
        try {
                CommonVariableDecl eo = null;
                for (CommonVariableDecl cvd : varsToSerialize()) {
                    if (cvd.type().isExternalObject() && cvd.type().isScalar()) {
                        if (eo != null) {
                            return null;
                        } else {
                            eo = cvd;
                        }
                    }
                }
                return eo;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String[] library() {
        ASTNode$State state = state();
        String[] library_value = library;

        return library_value;
    }
    @ASTNodeAnnotation.Attribute
    public String include() {
        ASTNode$State state = state();
        String include_value = include;

        return include_value;
    }
    @ASTNodeAnnotation.Attribute
    public String libraryDirectory() {
        ASTNode$State state = state();
        String libraryDirectory_value = libraryDir;

        return libraryDirectory_value;
    }
    @ASTNodeAnnotation.Attribute
    public String includeDirectory() {
        ASTNode$State state = state();
        String includeDirectory_value = includeDir;

        return includeDirectory_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canDifferentiate() {
        ASTNode$State state = state();
        boolean canDifferentiate_value = false;

        return canDifferentiate_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "External";

        return xmlTag_value;
    }
    /**
     * List of CommonVariableDecl which has to be sent to the process
     * when evaluating an external function.
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:238
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> varsToSerialize() {
        ASTNode$State state = state();
        try {
                if (!hasArg() && !hasReturnVar())
                    return myCommonVarDecls();
                
                ArrayList<CommonVariableDecl> res = new ArrayList<CommonVariableDecl>();
                if (hasReturnVar())
                    res.add(getReturnVar().myCommonVarDecl());
                for (FExp e : getArgs()) {
                    e.varsToSerialize(res);
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:266
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> externalObjectsToSerialize() {
        ASTNode$State state = state();
        try {
                ArrayList<CommonVariableDecl> externalObjects = new ArrayList<CommonVariableDecl>();
        
                for (CommonVariableDecl var : varsToSerialize()) {
                    if (var.type().isExternalObject()) {
                        externalObjects.add(var);
                    }
                }
        
                return externalObjects;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:278
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> functionArgsToSerialize() {
        ASTNode$State state = state();
        try {
                ArrayList<CommonVariableDecl> functionArgs = new ArrayList<CommonVariableDecl>();
        
                for (CommonVariableDecl var : varsToSerialize()) {
                    if (!var.type().isExternalObject()) {
                        functionArgs.add(var);
                    }
                }
        
                return functionArgs;
            }
        finally {
        }
    }
    /**
     * List of CommonVariableDecl which has to be read from the process
     * when evaluating an external function.
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:294
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<CommonVariableDecl> varsToDeserialize() {
        ASTNode$State state = state();
        try {
                ArrayList<CommonVariableDecl> res = new ArrayList<CommonVariableDecl>();
                for (CommonVariableDecl cvd : varsToSerialize())
                    if (cvd.isOutput())
                        res.add(cvd);
                return res;
            }
        finally {
        }
    }
    /**
     * Declarations of records used in this function
     * @attribute syn
     * @aspect Serialize
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/ExternalConstantEvaluationCodeGen.jrag:316
     */
    @ASTNodeAnnotation.Attribute
    public Map<String,FType> usedTypes() {
        ASTNode$State state = state();
        try {
                Map<String,FType> res = new LinkedHashMap<String,FType>();
                for (CommonVariableDecl cvd : varsToSerialize()) {
                    cvd.type().usedTypes(res);
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:115
     */
    @ASTNodeAnnotation.Attribute
    public boolean isConstructorStmt() {
        ASTNode$State state = state();
        boolean isConstructorStmt_value = getParent().Define_isConstructorStmt(this, null);

        return isConstructorStmt_value;
    }
    /**
     * @attribute inh
     * @aspect ExternalConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ExternalConstantEvaluation.jrag:120
     */
    @ASTNodeAnnotation.Attribute
    public boolean isDestructorStmt() {
        ASTNode$State state = state();
        boolean isDestructorStmt_value = getParent().Define_isDestructorStmt(this, null);

        return isDestructorStmt_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1575
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        if(myFClass_computed) {
            return myFClass_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFClass_value = getParent().Define_myFClass(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            myFClass_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFClass_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFClass_computed = false;
    /**
     * @apilevel internal
     */
    protected FClass myFClass_value;
    /**
     * @apilevel internal
     */
    private void myFClass_reset() {
        myFClass_computed = false;
        myFClass_value = null;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1628
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl containingFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl containingFFunctionDecl_value = getParent().Define_containingFFunctionDecl(this, null);

        return containingFFunctionDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:62
     */
    @ASTNodeAnnotation.Attribute
    public CommonVariableDecl myConstructorOutput() {
        ASTNode$State state = state();
        CommonVariableDecl myConstructorOutput_value = getParent().Define_myConstructorOutput(this, null);

        return myConstructorOutput_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2321
     */
    @ASTNodeAnnotation.Attribute
    public InstNode containingInstClassDecl() {
        ASTNode$State state = state();
        InstNode containingInstClassDecl_value = getParent().Define_containingInstClassDecl(this, null);

        return containingInstClassDecl_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2326
     */
    @ASTNodeAnnotation.Attribute
    public CodeGenContext myCodeGenContext() {
        ASTNode$State state = state();
        CodeGenContext myCodeGenContext_value = getParent().Define_myCodeGenContext(this, null);

        return myCodeGenContext_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        if (caller == getArgListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return false;
        }
        else {
            return super.Define_canInlineConstant(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        if (caller == getReturnVarOptNoTransform()) {
            return getReturnVar().isSlice();
        }
        else if (caller == getArgListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getArg(i).isSlice();
        }
        else {
            return super.Define_flattenFASContext(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2324
     * @apilevel internal
     */
    public CodeGenContext Define_myCodeGenContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getCodeGenContext();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_myExternals() {
    /**
     * @attribute coll
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3821
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myExternals_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_myExternals();
    }
    protected void contributeTo_FClass_FClass_myExternals(HashSet<FExternalStmt> collection) {
        super.contributeTo_FClass_FClass_myExternals(collection);
        collection.add(this);
    }

}
