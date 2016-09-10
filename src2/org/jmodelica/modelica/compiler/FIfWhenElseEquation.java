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
 * Superclass for when equations, if equations and else clause of if equations.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:673
 * @production FIfWhenElseEquation : {@link FAbstractEquation} ::= <span class="component">{@link FAbstractEquation}*</span>;

 */
public abstract class FIfWhenElseEquation extends FAbstractEquation implements Cloneable {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1391
     */
    public abstract FIfWhenElseEquation createEmptyNode();
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1301
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);
		if (isElse())
   			str.print("else");
   		prettyPrintHead(p, str, indent);
   		getFAbstractEquations().prettyPrintWithFix(p, str, p.indent(indent), "", ";\n");
   		prettyPrintTail(p, str, indent);
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1310
     */
    protected void prettyPrintHead(Printer p, CodeStream str, String indent) {
   		str.print("\n");
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1314
     */
    protected void prettyPrintTail(Printer p, CodeStream str, String indent) {
	}
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:432
     */
    protected void markTestsAsStructuralParameter(ErrorCheckType checkType) {}
    /**
     * @aspect AssertEval
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1550
     */
    @Override
    public boolean evaluateAsserts(boolean inClause) {
        boolean res = true;
        List<FAbstractEquation> l = new List<FAbstractEquation>();
        for (FAbstractEquation eqn : getFAbstractEquations()) {
            if (!eqn.evaluateAsserts(false)) {
                l.add(eqn);
                res = false;
            }
        }
        setFAbstractEquationList(l);
        return res;
    }
    /**
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1657
     */
    public void collectReinits(Map<FAbstractVariable,Set<FReinit>> map) {
        for (FAbstractEquation e : getFAbstractEquations())
            e.collectReinits(map);
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:75
     */
    public void flattenEqn(List<FAbstractEquation> l, FQName prefix, FClass fc) {
        FIfWhenElseEquation res = createEmptyNode();
        res.setType((FEquationType) getType().fullCopy());
        FAbstractEquation.flattenEqnList(res.getFAbstractEquationListNoTransform(), prefix, fc, getFAbstractEquations());
        flattenIfWhenTo(res, prefix, fc);
        if (!res.isEmpty()) {
            l.add(res);
        }
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:85
     */
    public void flattenIfWhenTo(FIfWhenElseEquation res, FQName prefix, FClass fc) {}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2076
     */
    public void removeMarkedEqns() {
		setFAbstractEquationList(removeMarkedEqns(getFAbstractEquations()));
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2514
     */
    private Map<FAbstractVariable,FEquation> assignmentEquationMap = null;
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2515
     */
    private Set<FEquation> nonAssignmentEquationSet = null;
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2516
     */
    private Set<FAbstractEquation> nonFEquationSet = null;
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2518
     */
    private void calcAssignmentEquations() {
		if (assignmentEquationMap == null || nonAssignmentEquationSet == null || nonFEquationSet == null) {
			assignmentEquationMap = new HashMap<FAbstractVariable,FEquation>();
			nonAssignmentEquationSet = new HashSet<FEquation>();
			nonFEquationSet = new HashSet<FAbstractEquation>();
			for (FAbstractEquation eqn : getFAbstractEquations()) {
				if (eqn instanceof FEquation) {
					FEquation feqn = (FEquation) eqn;
					FAbstractVariable var = feqn.assignedFV();
					if (var != null && !assignmentEquationMap.containsKey(var))
						assignmentEquationMap.put(var, feqn);
					else
						nonAssignmentEquationSet.add(feqn);
				} else {
					nonFEquationSet.add(eqn);
				}
			}
		}
	}
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2573
     */
    public void cleanEmptyElse() {
		setFAbstractEquationList(cleanEmptyElse(getFAbstractEquations()));
	}
    /**
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3675
     */
    public void makeReinitedVarsStates() {
        for (FAbstractEquation e : getFAbstractEquations())
            e.makeReinitedVarsStates();
    }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:159
     */
    public void collectFunctionCalls(FClass.commonSubexpressionEliminationIfSet m) {
        
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:795
     */
    @Override
    public Collection<FAbstractEquation> inlineFunctions(AbstractFunctionInliner fi) {
        setFAbstractEquationList(fi.inline(getFAbstractEquations()));
        return Collections.singletonList((FAbstractEquation)this);
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:32
     */
    public void cleanEquations(ArrayList<FAbstractEquation> l) {
        if (!isTempAssign() || !getFAbstractEquation(0).taggedByVProp) {
            l.add(this);
        }
        taggedByVProp = false;
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:216
     */
    public void addEquationsToWorkList(Set<FAbstractEquation> wl) {
        if (isTempAssign()) {
            for (FAbstractEquation equation: getFAbstractEquations()) {
                equation.addEquationsToWorkList(wl);
            }
        }
    }
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:39
     */
    @Override
    protected FIfWhenElseEquation convertWhenEqnToIfEqn(Collection<FAbstractEquation> outerNewList, FClass fclass) {
        Collection<FAbstractEquation> newSubList = new ArrayList<FAbstractEquation>();
        for (FAbstractEquation eqn : getFAbstractEquations()) {
            newSubList.add(eqn.convertWhenEqnToIfEqn(outerNewList, fclass));
        }
        setFAbstractEquationList(new List<FAbstractEquation>(newSubList));
        return this;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1192
     */
    @Override
    public void scalarize(Scalarizer.Equation s) {
        FIfWhenElseEquation res = createEmptyNode();
        res.setType((FEquationType) getType().fullCopy());
        scalarizeList(s.block(res.getFAbstractEquations()), getFAbstractEquations());
        scalarizeTestAndElse(s, res);
        s.add(res);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1219
     */
    public void scalarizeTestAndElse(Scalarizer.Equation s, FIfWhenElseEquation res) {}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1235
     */
    public void addDummyEqnsForTemps(ArrayList<FExp> tempsForThen, ArrayList<FExp> tempsForElse) {
        if (tempsForThen != null) 
            for (FExp e : tempsForThen)
                e.type().addDummyEqnsForTemp(getFAbstractEquations(), e.tempVarName());
	}
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:210
     */
    private boolean isTempAssign = false;
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:211
     */
    public void setIsTempAssign() { isTempAssign = true; }
    /**
     * @aspect FunctionScalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/ScalarizeFunctions.jrag:212
     */
    public boolean isTempAssign() { return isTempAssign; }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:878
     */
    @Override
    public void genResidual_CAD(Enumerator enumerator, String indent, CodeStream str, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        genIfStart_C(printer_CAD, str, indent);
        Iterator<Integer> fiIt = forIndices.iterator();
        int i = 0;
        int n = fiIt.hasNext() ? fiIt.next() : -1;
        for (FAbstractEquation equation : getFAbstractEquations()) {
            Set<Integer> fis = new HashSet<Integer>();
            while (n >= i && n < i + equation.numScalarEquations()) {
                fis.add(n - i);
                n = fiIt.hasNext() ? fiIt.next() : -1;
            }
            if (forIndices.size() == 0 || fis.size() > 0) {
                equation.genResidual_CAD(enumerator, printer_CAD.indent(indent), str, visited, fis);
            }
            i += equation.numScalarEquations();
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1221
     */
    @Override
    public void genBlock_CAD(String indent, CodeStream str, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        genIfStart_C(printer_CAD, str, indent);
        Iterator<FVariable> fvIt = forVariables.iterator();
        Iterator<Integer> fiIt = forIndices.iterator();
        int i = 0;
        int n = fiIt.hasNext() ? fiIt.next() : -1;
        for (FAbstractEquation equation : getFAbstractEquations()) {
            ArrayList<Integer> fis   = new ArrayList<Integer>();
            ArrayList<FVariable> fvs = new ArrayList<FVariable>();
            while (n >= i && n < i + equation.numScalarEquations()) {
                    fis.add(n - i);
                    fvs.add(fvIt.next());
                    n = fiIt.hasNext() ? fiIt.next() : -1;
            }
            if (forIndices.size() == 0 || fis.size() > 0) {
                equation.genBlock_CAD(indent + "  ", str, visited, fvs, fis);
            }
            i += equation.numScalarEquations();
        }
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1457
     */
    @Override
    public void genTempVars_CAD(CodePrinter p, CodeStream str, String indent) {}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1466
     */
    @Override
    public void genTempFree_CAD(CodePrinter p, CodeStream str, String indent) {}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3481
     */
    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        genIfStart_C(p, str, indent);
        if (forVariables == null) {
            for (FAbstractEquation equation : getFAbstractEquations()) {
                equation.genAssignment_C(p, str, p.indent(indent));
            }
            return;
        }
        Iterator<FVariable> fvIt = forVariables.iterator();
        Iterator<Integer> fiIt = forIndices.iterator();
        Map<Integer, FVariable> fiToFvMap = new HashMap<Integer, FVariable>();
        while (fvIt.hasNext() && fiIt.hasNext()) {
            fiToFvMap.put(fiIt.next(), fvIt.next());
        }
        int i = 0;
        for (FAbstractEquation equation : getFAbstractEquations()) {
            Collection<Integer> fis   = new ArrayList<Integer>();
            Collection<FVariable> fvs = new ArrayList<FVariable>();
            int n = equation.numScalarEquations();
            for (int k = 0; k < n; k++) {
                FVariable var = fiToFvMap.get(k + i);
                if (var != null) {
                    fis.add(k);
                    fvs.add(var);
                }
            }
            if (forIndices.size() == 0 || fis.size() > 0) {
                equation.genBlock_C(p, str, p.indent(indent), visited, fvs, fis);
            }
            i += n;
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3525
     */
    @Override
    public void genBlockEval_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        genIfStart_C(p, str, indent);
        Iterator<FVariable> fvIt = forVariables.iterator();
        Iterator<Integer> fiIt = forIndices.iterator();
        int i = 0;
        int n = fiIt.hasNext() ? fiIt.next() : -1;
        for (FAbstractEquation equation : getFAbstractEquations()) {
            Collection<Integer> fis   = new ArrayList<Integer>();
            Collection<FVariable> fvs = new ArrayList<FVariable>();
            while (n >= i && n < i + equation.numScalarEquations()) {
                    fis.add(n - i);
                    fvs.add(fvIt.next());
                    n = fiIt.hasNext() ? fiIt.next() : -1;
            }
            if (forIndices.size() == 0 || fis.size() > 0) {
                equation.genBlockEval_C(p, str, p.indent(indent), visited, fvs, fis);
            }
            i += equation.numScalarEquations();
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3595
     */
    @Override
    public void genResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        genIfStart_C(printer_C, str, indent);
        Iterator<Integer> fiIt = forIndices.iterator();
        int i = 0;
        int n = fiIt.hasNext() ? fiIt.next() : -1;
        for (FAbstractEquation equation : getFAbstractEquations()) {
            Set<Integer> fis = new HashSet<Integer>();
            while (n >= i && n < i + equation.numScalarEquations()) {
                fis.add(n - i);
                n = fiIt.hasNext() ? fiIt.next() : -1;
            }
            if (forIndices.size() == 0 || fis.size() > 0) {
                equation.genResidual_C(p, str, p.indent(indent), enumerator, visited, fis);
            }
            i += equation.numScalarEquations();
        }
    }
    /**
     * Helper for printing if equations
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3718
     */
    public void genIfStart_C(CodePrinter p, CodeStream str, String indent) {
        str.print(indent);
        str.print("} else {\n");
    }
    /**
     * Helper for printing if equations
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3736
     */
    public void genIfEnd_C(CodePrinter p, CodeStream str, String indent) {}
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:626
     */
    @Override
    public void genReinitTempDecls_C(CodePrinter p, CodeStream str, String indent) {
        for (FAbstractEquation e : getFAbstractEquations()) {
            e.genReinitTempDecls_C(p, str, indent);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:674
     */
    @Override
    public void genReinitTempInits_C(CodePrinter p, CodeStream str, String indent) {
        for (FAbstractEquation e : getFAbstractEquations()) {
            e.genReinitTempInits_C(p, str, indent);
        }
    }
    /**
     * @aspect CCodeGenExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:743
     */
    @Override
    public void collectReinits_C(Map<String, ArrayList<FReinit>> map, boolean initial) {
        for (FAbstractEquation e : getFAbstractEquations()) {
            e.collectReinits_C(map, initial);
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FIfWhenElseEquation() {
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
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new Opt(), 4);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FIfWhenElseEquation(FEquationType p0, List<FAttribute> p1, List<FAbstractEquation> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        inputs_reset();
        assignedSet_reset();
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
    public FIfWhenElseEquation clone() throws CloneNotSupportedException {
        FIfWhenElseEquation node = (FIfWhenElseEquation) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:68
     */
    public abstract FIfWhenElseEquation fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:75
     */
    public abstract FIfWhenElseEquation treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:83
     */
    public abstract FIfWhenElseEquation treeCopy();
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FEquationType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FEquationType getType() {
        return (FEquationType) getChild(0);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FEquationType getTypeNoTransform() {
        return (FEquationType) getChildNoTransform(0);
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
     * Replaces the FAbstractEquation list.
     * @param list The new list node to be used as the FAbstractEquation list.
     * @apilevel high-level
     */
    public void setFAbstractEquationList(List<FAbstractEquation> list) {
        setChild(list, 2);
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
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAbstractEquation")
    public List<FAbstractEquation> getFAbstractEquationList() {
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(2);
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
     * Retrieves the number of children in the InitialEquation list.
     * @return Number of children in the InitialEquation list.
     * @apilevel high-level
     */
    public int getNumInitialEquation() {
        return getInitialEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InitialEquation list.
     * @apilevel low-level
     */
    public int getNumInitialEquationNoTransform() {
        return getInitialEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InitialEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InitialEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getInitialEquation(int i) {
        return (FAbstractEquation) getInitialEquationList().getChild(i);
    }
    /**
     * Check whether the InitialEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInitialEquation() {
        return getInitialEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InitialEquation list.
     * @param node The element to append to the InitialEquation list.
     * @apilevel high-level
     */
    public void addInitialEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getInitialEquationListNoTransform() : getInitialEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInitialEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getInitialEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InitialEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInitialEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getInitialEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InitialEquation list.
     * @return The the child position of the InitialEquation list.
     * @apilevel low-level
     */
    protected int getInitialEquationListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InitialEquation list.
     * @return The node representing the InitialEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getInitialEquations() {
        return getInitialEquationList();
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationsNoTransform() {
        return getInitialEquationListNoTransform();
    }
    /**
     * Replaces the (optional) DynamicFAbstractEquation child.
     * @param node The new node to be used as the DynamicFAbstractEquation child.
     * @apilevel high-level
     */
    public void setDynamicFAbstractEquation(FAbstractEquation node) {
        getDynamicFAbstractEquationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional DynamicFAbstractEquation child exists.
     * @return {@code true} if the optional DynamicFAbstractEquation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDynamicFAbstractEquation() {
        return getDynamicFAbstractEquationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) DynamicFAbstractEquation child.
     * @return The DynamicFAbstractEquation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FAbstractEquation getDynamicFAbstractEquation() {
        return (FAbstractEquation) getDynamicFAbstractEquationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child DynamicFAbstractEquation. This is the <code>Opt</code> node containing the child DynamicFAbstractEquation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    public Opt<FAbstractEquation> getDynamicFAbstractEquationOptNoTransform() {
        return (Opt<FAbstractEquation>) getChildNoTransform(4);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 4;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        ASTNode$State state = state();
        int numScalarEquations_value = numScalarEqnsInList(getFAbstractEquations());

        return numScalarEquations_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1718
     */
    @ASTNodeAnnotation.Attribute
    public List<FAbstractEquation> createInitialEquationList() {
        ASTNode$State state = state();
        try {
                List<FAbstractEquation> l = new List<FAbstractEquation>();
                for (FAbstractEquation e : getFAbstractEquations()) {
                    if (e.replacedAtInitialization()) {
                        l.addAll(e.getInitialEquations());
                    } else {
                        l.add(e.copySymbolic());
                    }
                }
                return l;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2070
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FAbstractEquation fae : getFAbstractEquations())
                    res.addAll(fae.FIdUseExpsInRHS(visitor));
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2108
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FAbstractEquation fae : getFAbstractEquations())
                    res.addAll(fae.FIdUseExpsInLHS(visitor));
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean inputs_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FVariable> inputs_value;
    /**
     * @apilevel internal
     */
    private void inputs_reset() {
        inputs_computed = false;
        inputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FVariable> inputs() {
        if(inputs_computed) {
            return inputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        inputs_value = inputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            inputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return inputs_value;
    }
    /**
     * @apilevel internal
     */
    private LinkedHashSet<FVariable> inputs_compute() {
            LinkedHashSet<FVariable> s = new LinkedHashSet<FVariable>();
            s.addAll(retrieveInputs());
            for (FAbstractEquation e : getFAbstractEquations()) {
                s.addAll(e.inputs());
            }
            return s;
        }
    @ASTNodeAnnotation.Attribute
    public boolean checkLinearity(Set<FVariable> vars) {
        ASTNode$State state = state();
        boolean checkLinearity_Set_FVariable__value = false;

        return checkLinearity_Set_FVariable__value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:143
     */
    @ASTNodeAnnotation.Attribute
    public boolean isReal(boolean exclusive) {
        ASTNode$State state = state();
        try {
                boolean res = exclusive;
                for (FAbstractEquation equation : getFAbstractEquations()) {
                    boolean fvRes = equation.isReal(exclusive);
                    res = exclusive ? res && fvRes : res || fvRes;
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:146
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability var = fConstant();
                for (FAbstractEquation equation : getFAbstractEquations())
                    var = var.combine(equation.variability());
                return var;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsConnect() {
        ASTNode$State state = state();
        boolean containsConnect_value = containsConnect(getFAbstractEquations());

        return containsConnect_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBalancedEquations() {
        ASTNode$State state = state();
        boolean isBalancedEquations_value = true;

        return isBalancedEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBalancedAssignments() {
        ASTNode$State state = state();
        boolean isBalancedAssignments_value = true;

        return isBalancedAssignments_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasOnlyFixedParamTests() {
        ASTNode$State state = state();
        boolean hasOnlyFixedParamTests_value = true;

        return hasOnlyFixedParamTests_value;
    }
    /**
     * @attribute syn
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:465
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquations() {
        ASTNode$State state = state();
        try {
        		for (FAbstractEquation equ : getFAbstractEquations())
        			if (equ.hasFunctionCallEquations())
        				return true;
        		return false;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:482
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasFunctionCallEquationsWithLefts() {
        ASTNode$State state = state();
        try {
        		for (FAbstractEquation equ : getFAbstractEquations())
        			if (equ.hasFunctionCallEquationsWithLefts())
        				return true;
        		return false;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEmpty() {
        ASTNode$State state = state();
        boolean isEmpty_value = getNumFAbstractEquation() == 0;

        return isEmpty_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean assignedSet_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<InstComponentDecl> assignedSet_value;
    /**
     * @apilevel internal
     */
    private void assignedSet_reset() {
        assignedSet_computed = false;
        assignedSet_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> assignedSet() {
        if(assignedSet_computed) {
            return assignedSet_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        assignedSet_value = assignedSetFromEqns(getFAbstractEquations());
        if (isFinal && num == state().boundariesCrossed) {
            assignedSet_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return assignedSet_value;
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2499
     */
    @ASTNodeAnnotation.Attribute
    public Map<FAbstractVariable,FEquation> assignmentEquationMap() {
        ASTNode$State state = state();
        try {
        		calcAssignmentEquations();
        		return assignmentEquationMap;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2504
     */
    @ASTNodeAnnotation.Attribute
    public Set<FEquation> nonAssignmentEquationSet() {
        ASTNode$State state = state();
        try {
        		calcAssignmentEquations();
        		return nonAssignmentEquationSet;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2509
     */
    @ASTNodeAnnotation.Attribute
    public Set<FAbstractEquation> nonFEquationSet() {
        ASTNode$State state = state();
        try {
        		calcAssignmentEquations();
        		return nonFEquationSet;
        	}
        finally {
        }
    }
    /**
     * Check if an equation contains any calls to functions that we can inline.
     * @attribute syn
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:679
     */
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        try {
                if (isWhen())
                    return false;
                for (FAbstractEquation eqn : getFAbstractEquations())
                    if (eqn.hasInlinableFunctions(fi))
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:25
     */
    @ASTNodeAnnotation.Attribute
    public Solvability isSolved(FVariable var, boolean duringTearing) {
        ASTNode$State state = state();
        try {
                Set<FVariable> leftVars = referencedFVariablesInLHS();
                
                boolean inLeft = false;
                for (FVariable fv : leftVars) {
                    if (fv == var)
                        inLeft = true;
                }
                
                Set<FVariable> argVars = referencedFVariablesInRHS();
        
                boolean inArgs = false;
                for (FVariable fv : argVars) {
                    if (fv == var)
                        inArgs = true;
                }
        
                if (inLeft && !inArgs)
                    return Solvability.ANALYTICALLY_SOLVABLE;
                else
                    return Solvability.UNSOLVABLE;
            }
        finally {
        }
    }
    /**
     * Check if this when equation is the else part of another when equation.
     * @attribute inh
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1838
     */
    @ASTNodeAnnotation.Attribute
    public boolean isElse() {
        ASTNode$State state = state();
        boolean isElse_value = getParent().Define_isElse(this, null);

        return isElse_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return isWhen() || inWhen();
        }
        else {
            return getParent().Define_inWhen(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:106
     * @apilevel internal
     */
    public boolean Define_canPropagateContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isTempAssign() && canPropagateContext();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
