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
 * If expression.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1090
 * @production FIfExp : {@link FAbstractArrayExp} ::= <span class="component">IfExp:{@link FExp}</span> <span class="component">ThenExp:{@link FExp}</span> <span class="component">ElseExp:{@link FExp}</span>;

 */
public class FIfExp extends FAbstractArrayExp implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1065
     */
    public FIfExp createEmptyNode()          { return new FIfExp();          }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2240
     */
    @Override
    public void assignedInAllBranchesVariables(Set<String> res) {
        getIfExp().assignedInAllBranchesVariables(res);
        Set<String> a = getThenExp().assignedInAllBranchesVariables();
        Set<String> b = getElseExp().assignedInAllBranchesVariables();
        if (a.size() > b.size()) {
            Set<String> tmp = a;
            a = b;
            b = tmp;
        }
        for (String name : a) {
            if (b.contains(name)) {
                res.add(name);
            }
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1635
     */
    protected void prettyPrintExp(Printer p, CodeStream str, String indent) {
		prettyPrintAsElseExp(p, str, indent);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1644
     */
    public void prettyPrintAsElseExp(Printer p, CodeStream str, String indent) {
		str.print("if ");
		p.print(getIfExp(), str, indent);
		str.print(" then ");
		p.print(getThenExp(), str, indent);
		str.print(" else");
		getElseExp().prettyPrintAsElseExp(p, str, indent);
	}
    /**
     * Lock this if-expression and return true if it only has only parameter-expression 
     * tests and evaluates to the branch not indicated by <code>then</code>. Otherwise 
     * delegates to {@link #lockBranch(ErrorCheckType)}.
     * 
     * Any parameters used in the test will be marked as structural.
     * 
     * @param checkType  the type of error checks to use when marking structural parameters
     * @param then       if true, we are trying to remove the then-branch, otherwise the else-branch
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:444
     */
    public boolean lockMyBranch(ErrorCheckType checkType, boolean then) {
        if (getIfExp().lockable(then)) {
		  getIfExp().markAsStructuralParameter(checkType);
		  return true;
	  } else {
		  return lockBranch(checkType);
	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:618
     */
    public void typeError(ErrorCheckType checkType) {
		FType thenType = getThenExp().type();
		FType elseType = getElseExp().type();
		FType scalar = thenType.scalarType();
		scalar = scalar.typePromotion(elseType.scalarType());
		
		if (!getIfExp().isOKTestExp() || thenType.ndims() != elseType.ndims()) {
			getIfExp().error("Test expression of if expression must be scalar boolean");
		} else if (scalar.isUnknown()) { 
			error("Branches of if expression has incompatible types");
		} else {
			if (isParameterIf())
				error("Failed to evaluate test expression in if expression with branches that have different array sizes");
			else
				error("If expression with branches that have different array sizes must have parameter test expression");
		}
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2406
     */
    public FExp flatten(FQName prefix) {
        if (getIfExpNoTransform().variability().knownParameterOrLess()) {
            try {
                return getIfExpNoTransform().ceval().booleanValue() ? 
                        getThenExp().flatten(prefix) : 
                        getElseExp().flatten(prefix);
            } catch (ConstantEvaluationException e) {
                
            }
        }
        return new FIfExp(getIfExp().flatten(prefix),
                          getThenExp().flatten(prefix),
                          getElseExp().flatten(prefix));
    }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2395
     */
    public void enableIfEquationElimination() {
		super.enableIfEquationElimination();
		eliminateIfEquation = true;
		is$Final = false;
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2402
     */
    private boolean eliminateIfEquation = false;
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1528
     */
    public FExp replaceReferences(AbstractFunctionInliner fi) {
        super.replaceReferences(fi);
        if (getIfExp().isConstantExp()) {
            boolean useThen = getIfExp().ceval().booleanValue();
            FExp exp = useThen ? getThenExp() : getElseExp();
            replaceMe(exp);
            return exp;
        }
        return this;
    }
    /**
     * @aspect ConstantFolding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:675
     */
    public void enableConstantFolding() {
		super.enableConstantFolding();
        if (!constantFoldingEnabled && getIfExp().variability().knownParameterOrLess()) {
			eliminateIfEquation = true;
			is$Final = false;
		}
	}
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:127
     */
    private boolean isWhen            = false;
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:136
     */
    public void setWhen()            { isWhen = true; }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1049
     */
    public FExp scalarRecordFExp(Map<String,FExp> indexMap, FQName suffix) {
        FIfExp res = new FIfExp();
        res.setIfExp(getIfExp().scalarize(indexMap));
        res.setThenExp(getThenExp().scalarRecordFExp(indexMap, suffix));
        res.setElseExp(getElseExp().scalarRecordFExp(indexMap, suffix));
        return res;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1157
     */
    public FExp extractArrayCell(Map<String,FExp> indexMap, Index i) {
        FIfExp res = new FIfExp();
        res.setIfExp(getIfExp().scalarize(indexMap));
        res.setThenExp(getThenExp().extractArrayCell(indexMap, i));
        res.setElseExp(getElseExp().extractArrayCell(indexMap, i));
        return dynamicFExp(res);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1595
     */
    public FExp scalarizeExp(Map<String,FExp> indexMap) {
        if (getIfExp().variability().indexParameterOrLess()) {
            try {
                return cevalSelectExp().scalarize(indexMap);
            } catch (ConstantEvaluationException e) {}
        }
        return new FIfExp(getIfExp().scalarize(indexMap),
                getThenExp().scalarize(indexMap),
                getElseExp().scalarize(indexMap));
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:170
     */
    public void createArrayTemporariesInChildren(Scalarizer s) {
        if (inFAlgorithm()) {
            List thenClauses = new List();
            List elseClauses = new List();
            getIfExp().createArrayTemporaries(s);
            getThenExp().createArrayTemporaries(s.block(thenClauses));
            getElseExp().createArrayTemporaries(s.block(elseClauses));
            if (thenClauses.getNumChild() > 0 || elseClauses.getNumChild() > 0) {
                List<FIfWhenClause> cl = new List<FIfWhenClause>();
                cl.add(new FIfClause(getIfExp().scalarize(s), thenClauses));
                ((Scalarizer.Algorithm)s).add(new FIfStmt(cl, elseClauses));
            }
        } else {
            createArrayTemporariesIfBranch(null, s);
        }
    }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:214
     */
    public void createArrayTemporariesIfBranch(FExp guard, Scalarizer s) {
        if (guard == null) {
            getIfExp().createArrayTemporaries(s);
        } else {
            getIfExp().createArrayTemporariesIfBranch(guard.treeCopyNoTransform(), s);
        }
        FExp ifExp = getIfExp().scalarize(s);
        FExp thenGuard = ifExp.treeCopyNoTransform();
        FExp elseGuard = new FNotExp(ifExp.treeCopyNoTransform());
        if (guard != null) {
            thenGuard = new FAndExp(guard.treeCopyNoTransform(), thenGuard);
            elseGuard = new FAndExp(guard.treeCopyNoTransform(), elseGuard);
        }
        getThenExp().createArrayTemporariesIfBranch(thenGuard, s);
        getElseExp().createArrayTemporariesIfBranch(elseGuard, s);
    }
    /**
     * @aspect SizeAsserts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:182
     */
    private FExp andIfExpConds(FExp e1) {
        FExp e2 = enclosingIfExpCond();
        if (e2 != null)
            e1 = new FAndExp(e2,e1);
        return e1;
    }
    /**
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:381
     */
    public FExp diff(String name) {
        FExp td = dynamicFExp((getThenExp().diff(name)));
        FExp ed = dynamicFExp((getElseExp().diff(name)));
        boolean tz = td.equalsRealValue(0);
        boolean ez = ed.equalsRealValue(0);
        if (ez && tz) {
            return new FRealLitExp(0.0);
        } 
        FExp e = getIfExp().copySymbolic();
        return dynamicFExp(new FIfExp(e, td, ed));
    }
    /**
     * If expressions need special handling during CAD since it is not possible to
     * write if expressions as a single statment.
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:661
     */
    @Override
	public void genADStatement_CAD(CodePrinter p, CodeStream str, String indent) {
		String innerIndent = p.indent(indent);
		getIfExp().genTempVars_CAD(p, str, indent);
		
		str.print(indent);
		str.print("if (");
		getIfExp().genVar_CAD(p, str, indent);
		str.print(") {\n");
		
		getThenExp().genTempVars_CAD(p, str, innerIndent);
		
		str.print(innerIndent);
		genVar_CAD(p, str, indent);
		str.print(" = ");
		getThenExp().genVar_CAD(p, str, indent);
		str.print(";\n");
		
		if (shouldBeDifferentiated()) {
			str.print(innerIndent);
			genDer_CAD(p, str, indent);
			str.print(" = ");
			getThenExp().genDer_CAD(p, str, indent);
			str.print(";\n");
		}
		str.print(indent);
		str.print("} else {\n");
		
		getElseExp().genTempVars_CAD(p, str, innerIndent);
		
		str.print(innerIndent);
		genVar_CAD(p, str, indent);
		str.print(" = ");
		getElseExp().genVar_CAD(p, str, indent);
		str.print(";\n");
		
		if (shouldBeDifferentiated()) {
			str.print(innerIndent);
			genDer_CAD(p, str, indent);
			str.print(" = ");
			getElseExp().genDer_CAD(p, str, indent);
			str.print(";\n");
		}
		
		str.print(indent);
		str.print("}\n");
	}
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:171
     */
    @Override
    public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
        str.print(FEqExp.macro_C);
        str.print("(");
        p.print(getIfExp(), str, indent);
        str.print(", JMI_TRUE, ");
        p.print(getThenExp(),str,indent);
        str.print(", ");
        p.print(getElseExp(),str,indent);
        str.print(")");
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIfExp() {
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
    }
    /**
     * @declaredat ASTNode:13
     */
    public FIfExp(FExp p0, FExp p1, FExp p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 3;
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
        type_reset();
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
    public FIfExp clone() throws CloneNotSupportedException {
        FIfExp node = (FIfExp) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FIfExp copy() {
        try {
            FIfExp node = (FIfExp) clone();
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
    public FIfExp fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public FIfExp treeCopyNoTransform() {
        FIfExp tree = (FIfExp) copy();
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
     * @declaredat ASTNode:115
     */
    public FIfExp treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the IfExp child.
     * @param node The new node to replace the IfExp child.
     * @apilevel high-level
     */
    public void setIfExp(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the IfExp child.
     * @return The current node used as the IfExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="IfExp")
    public FExp getIfExp() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the IfExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the IfExp child.
     * @apilevel low-level
     */
    public FExp getIfExpNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Replaces the ThenExp child.
     * @param node The new node to replace the ThenExp child.
     * @apilevel high-level
     */
    public void setThenExp(FExp node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the ThenExp child.
     * @return The current node used as the ThenExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ThenExp")
    public FExp getThenExp() {
        return (FExp) getChild(1);
    }
    /**
     * Retrieves the ThenExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ThenExp child.
     * @apilevel low-level
     */
    public FExp getThenExpNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Replaces the ElseExp child.
     * @param node The new node to replace the ElseExp child.
     * @apilevel high-level
     */
    public void setElseExp(FExp node) {
        setChild(node, 2);
    }
    /**
     * Retrieves the ElseExp child.
     * @return The current node used as the ElseExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ElseExp")
    public FExp getElseExp() {
        return (FExp) getChild(2);
    }
    /**
     * Retrieves the ElseExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ElseExp child.
     * @apilevel low-level
     */
    public FExp getElseExpNoTransform() {
        return (FExp) getChildNoTransform(2);
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
        ndims_value = getThenExp().ndims();
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
    		if (isParameterIf()) {
    			try {
    				return cevalSelectExp().size();
    			} catch (ConstantEvaluationException e) {
    			}
    		}
    		return getThenExp().size();
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
    		
    		if (getThenExp().size().equivalent(getElseExp().size(), inFunction())) {
    			Array arr = new Array(indices());
    			Array thenArr = getThenExp().getArray();
    			Array elseArr = getElseExp().getArray();
    			for (Index i : arr.indices()) {
    				FExp ifExp = getIfExp().fullCopy();
    				arr.set(i, new FIfExp(ifExp, thenArr.get(i), elseArr.get(i)));
    			}
    			return arr;
    		} else {
    			return cevalSelectExp().copyArray();
    		}
    	}
    @ASTNodeAnnotation.Attribute
    public FExp component(String name) {
        ASTNode$State state = state();
        FExp component_String_value = dynamicFExp(new FIfExp(getIfExp().treeCopy(), getThenExp().component(name).unboundCopy(), getElseExp().component(name).unboundCopy()));

        return component_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalArray(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue cevalArray_VariableEvaluator_Index_value = cevalSelectExp(evaluator).cevalArray(evaluator, i);

        return cevalArray_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue cevalCalc(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue cevalCalc_VariableEvaluator_value = cevalSelectExp(evaluator).ceval(evaluator);

        return cevalCalc_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp cevalSelectExp() {
        ASTNode$State state = state();
        FExp cevalSelectExp_value = cevalSelectExp(defaultVariableEvaluator());

        return cevalSelectExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp cevalSelectExp(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        FExp cevalSelectExp_VariableEvaluator_value = getIfExp().ceval(evaluator).booleanValue() ? getThenExp() : getElseExp();

        return cevalSelectExp_VariableEvaluator_value;
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
                if (getIfExp().variability().evalOrLess()) {
                    try {
                        if (getIfExp().ceval().booleanValue())
                            return getThenExp().isCircular();
                        else
                            return getElseExp().isCircular();
                    } catch (ConstantEvaluationException e) {}
                }
                return super.isCircularCalc();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FExp nominal() {
        ASTNode$State state = state();
        FExp nominal_value = FExp.nominalMax(getThenExp(), getElseExp());

        return nominal_value;
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3230
     */
    @ASTNodeAnnotation.Attribute
    public boolean isIndependent(Set<? extends CommonVariableDecl> set) {
        ASTNode$State state = state();
        try {
                // Don't check the guard exp since it is discrete and does not affect
                // linearity.
                return getThenExp().isIndependent(set) && getElseExp().isIndependent(set);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int precedence() {
        ASTNode$State state = state();
        int precedence_value = PRECEDENCE_CONDITIONAL;

        return precedence_value;
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
            FType thenType = getThenExp().type();
            FType elseType = getElseExp().type();
            if (!getIfExp().isOKTestExp() || thenType.ndims() != elseType.ndims())
                return fUnknownType();
            
            if (thenType.equivalentTo(elseType))
                return thenType.typePromotion(elseType);
            
            if (isParameterIf()) {
                try {
                    FExp sel = cevalSelectExp();
                    FType scalar = thenType.scalarType();
                    scalar = scalar.typePromotion(elseType.scalarType());
                    return scalar.arrayType(sel.size());
                } catch (ConstantEvaluationException e) {
                }
            }
            
            // Test doesn't seem to be parameter expression - require sizes to be same
            return thenType.typePromotion(elseType, inFunction(), null);
        }
    @ASTNodeAnnotation.Attribute
    public boolean isParameterIf() {
        ASTNode$State state = state();
        boolean isParameterIf_value = getIfExp().variability().parameterOrLess();

        return isParameterIf_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean eventGenerating() {
        ASTNode$State state = state();
        boolean eventGenerating_value = true;

        return eventGenerating_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isWhen() {
        ASTNode$State state = state();
        boolean isWhen_value = isWhen;

        return isWhen_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean scalarizeExpanded() {
        ASTNode$State state = state();
        boolean scalarizeExpanded_value = false;

        return scalarizeExpanded_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildADStatements_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildADStatements_CAD_value = false;

        return autoGenChildADStatements_CAD_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean autoGenChildVarDecls_CAD() {
        ASTNode$State state = state();
        boolean autoGenChildVarDecls_CAD_value = true;

        return autoGenChildVarDecls_CAD_value;
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
    public boolean isIndicatorGuard(FExp e) {
        ASTNode$State state = state();
        boolean isIndicatorGuard_FExp_value = e == getThenExp() || e == getElseExp();

        return isIndicatorGuard_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp myIndicatorGuardExp(FExp e) {
        ASTNode$State state = state();
        FExp myIndicatorGuardExp_FExp_value = getIfExp();

        return myIndicatorGuardExp_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean negateIndicatorGuard(FExp e) {
        ASTNode$State state = state();
        boolean negateIndicatorGuard_FExp_value = e == getElseExp();

        return negateIndicatorGuard_FExp_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1941
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInitial() {
        ASTNode$State state = state();
        boolean isInitial_value = getParent().Define_isInitial(this, null);

        return isInitial_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:773
     * @apilevel internal
     */
    public boolean Define_inDeadIfBranch(ASTNode caller, ASTNode child) {
        if (caller == getElseExpNoTransform()) {
            return getIfExp().inDeadIfBranchTest(true);
        }
        else if (caller == getThenExpNoTransform()) {
            return getIfExp().inDeadIfBranchTest(false);
        }
        else {
            return getParent().Define_inDeadIfBranch(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3203
     * @apilevel internal
     */
    public boolean Define_isLinear(ASTNode caller, ASTNode child, Set<FVariable> vars) {
        if (caller == getIfExpNoTransform()) {
            return !isWhen() && (!inNoEventExp() || getIfExp().isIndependent(vars));
        }
        else {
            return getParent().Define_isLinear(this, caller, vars);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1916
     * @apilevel internal
     */
    public boolean Define_inIfCondition(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        if (caller == getElseExpNoTransform()) {
            return isWhen() || inWhen();
        }
        else if (caller == getThenExpNoTransform()) {
            return isWhen() || inWhen();
        }
        else {
            return getParent().Define_inWhen(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:421
     * @apilevel internal
     */
    public boolean Define_lockBranch(ASTNode caller, ASTNode child, ErrorCheckType checkType) {
        if (caller == getElseExpNoTransform()) {
            return lockMyBranch(checkType, false);
        }
        else if (caller == getThenExpNoTransform()) {
            return lockMyBranch(checkType, true);
        }
        else {
            return getParent().Define_lockBranch(this, caller, checkType);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/SizeAsserts.jrag:177
     * @apilevel internal
     */
    public FExp Define_enclosingIfExpCond(ASTNode caller, ASTNode child) {
        if (caller == getElseExpNoTransform()) {
            return andIfExpConds(new FNotExp(getIfExp().fullCopy()));
        }
        else if (caller == getThenExpNoTransform()) {
            return andIfExpConds(getIfExp().fullCopy());
        }
        else {
            return getParent().Define_enclosingIfExpCond(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:318
     * @apilevel internal
     */
    public boolean Define_inlineVar_CAD(ASTNode caller, ASTNode child) {
        if (caller == getIfExpNoTransform()) {
            return true;
        }
        else {
            return super.Define_inlineVar_CAD(caller, child);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4141
     * @apilevel internal
     */
    public boolean Define_hasBrancher(ASTNode caller, ASTNode child) {
        if (caller == getElseExpNoTransform()) {
            return true;
        }
        else if (caller == getThenExpNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_hasBrancher(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1741
        if (isWhen() && isInitial()) {
            state().duringFlatAPI++;
            ASTNode result = rewriteRule0();
            state().duringFlatAPI--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2426
        if (eliminateIfEquation) {
            state().duringIfEquations++;
            ASTNode result = rewriteRule1();
            state().duringIfEquations--;
            return result;
        }
        // Declared at @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:510
        if (getThenExpNoTransform().equalsSymbolic(getElseExpNoTransform())) {
            state().duringExpressionSimplification++;
            ASTNode result = rewriteRule2();
            state().duringExpressionSimplification--;
            return result;
        }
        return super.rewriteTo();
    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1741
     * @apilevel internal
     */
    private FExp rewriteRule0() {
{
            if (getIfExp().isInitialGuard())
                return getThenExp();
            else
                return getElseExp();
        }    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2426
     * @apilevel internal
     */
    private FExp rewriteRule1() {
{
			eliminateIfEquation = false;
			
			try {
				if (getIfExp().isConstantExp()) 
					return getIfExp().ceval().booleanValue() ? getThenExp() : getElseExp();
			} catch (ConstantEvaluationException e) {}
			
			return this;
		}    }
    /**
     * @declaredat @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:510
     * @apilevel internal
     */    private FExp rewriteRule2() {
        return getThenExp();
    }
    protected void collect_contributors_FAbstractEquation_transformedGuards() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1314
     */
        if (isWhen()) {
            {
                FAbstractEquation ref = (FAbstractEquation) (myFEquation());
                if (ref != null) {
                    ref.FAbstractEquation_transformedGuards_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FAbstractEquation_transformedGuards();
    }
    protected void contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(Set<FExp> collection) {
        super.contributeTo_FAbstractEquation_FAbstractEquation_transformedGuards(collection);
        if (isWhen())
            collection.add(getIfExp());
    }

}
