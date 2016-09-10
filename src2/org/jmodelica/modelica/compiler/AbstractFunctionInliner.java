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
 * @ast class
 * @aspect FunctionInlining
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:152
 */
public abstract class AbstractFunctionInliner extends Object {
    

        private FFunctionDecl func;

    
        private Map<String,FExp> replMap;

    
        private FlatVariableMap lookupMap;

    
        private Map<String,FType> typeMap;

    
        private Queue<FAbstractEquation> outerMostWorklist = null;

    
        public FTypePrefixVariability contextVariability = ASTNode.fContinuous();

    
        
        /**
         * Inline all function calls that we can from a specific list of equations.
         */
        public List<FAbstractEquation> inline(List<FAbstractEquation> oldEquationList) {
            List<FAbstractEquation> newEquationList = new List();
            inline(oldEquationList, newEquationList);
            return newEquationList;
        }

    

        /**
         * Inline all function calls that we can from a specific list of equations.
         */
        public void inline(List<FAbstractEquation> oldEquationList, List<FAbstractEquation> newEquationList) {
            Queue<FAbstractEquation> worklist = new ArrayDeque<FAbstractEquation>(oldEquationList.getNumChild());
            if (outerMostWorklist == null) {
                outerMostWorklist = worklist;
            }
            for (FAbstractEquation eqn : oldEquationList) {
                worklist.add(eqn);
            }
            while (!worklist.isEmpty()) {
                inline(worklist.poll(), newEquationList);
            }
            if (outerMostWorklist == worklist) {
                outerMostWorklist = null;
            }
        }

    

        private void inline(FAbstractEquation eqn, List newEquationList) {
            if (eqn.hasInlinableFunctions(this)) {
                Collection<FAbstractEquation> res = eqn.inlineFunctions(this);
                for (FAbstractEquation inlinedEqn : res) {
                    inline(inlinedEqn, newEquationList);
                }
            } else {
                newEquationList.add(eqn);
            }
        }

    
        
        public void setContextVariability(FTypePrefixVariability v) {
            contextVariability = v;
        }

    
        
        public FTypePrefixVariability contextVariability(FExp e) {
            return contextVariability.combineDown(e.variability());
        }

    

        /**
         * Check if a given function should be inlined under the current inlining level.
         */
        public abstract boolean isInlinable(FFunctionDecl func, FFunctionCall call);

    

        /**
         * Prepare for inlining a new function call.
         * 
         * @return  the map to use for lookups in the function during inlining.
         */
        public FlatVariableMap startFunction(FFunctionDecl f) {
            replMap = new HashMap<String,FExp>();
            lookupMap = new FlatVariableMap();
            typeMap = new HashMap<String,FType>();
            return lookupMap;
        }

    

        public void setTypeOf(String name, FType type) {
            typeMap.put(name, type);
        }

    

        /**
         * Get the expression to use for a specific variable of the function 
         * currently being inlined.
         * 
         * @param name  the name of the variable
         */
        public FExp getReplacementExp(String name) {
            return replMap.get(name);
        }

    

        /**
         * Set the expression to use for a specific variable of the function 
         * currently being inlined.
         * 
         * @param name  the name of the variable
         * @param exp   the expression to use
         */
        public void setReplacementExp(String name, FExp exp) {
            replMap.put(name, exp);
        }

    

        /**
         * Check if this function inliner has created a temporary variable of the specified name.
         * 
         * @param name  the name of the temporary variable
         */
        public boolean isReplacementVar(String name) {
            return lookupMap.lookup(name) != null;
        }

    

        /**
         * Find the size of a specific variable of the function currently being inlined.
         * 
         * @param name  the name of the variable
         */
        public FType lookupType(String name) {
            return typeMap.get(name);
        }

    

        /**
         * Add a variable and (if not constant) an equation for an assignment.
         * 
         * @param oldName  the name of the variable that was assigned in the function
         * @param value    the right-hand side of the equation
         * @param noEvent  if true, make sure no events are generated for the equation
         */
        public void addVarAndEqn(String oldName, FExp value, boolean noEvent) {
            addVarAndEqn(oldName, value, noEvent, value.type(), contextVariability(value));
        }

    
        
        public void addVarAndEqn(String oldName, FExp value, boolean noEvent, FType type,
                FTypePrefixVariability variability) {
            if (type.isNoType()) {
                replMap.put(oldName, value);
                return;
            }
            FVariable var = addVar(oldName, variability, type);
            if (variability.constantVariability()) {
                try {
                    value = value.ceval().buildLiteral();
                    var.setBindingExp(value);
                    replMap.put(oldName, value);
                    return;
                } catch (ConstantEvaluationException e) {
                    
                }
            }
            if (noEvent)
                value = value.preventEvents();
            FEquation eqn = new FEquation(var.createUseExp(), value);
            addEquation(eqn, variability);
        }

    

        /**
         * Add variables and (if not constant) an equation for a function call statement.
         * 
         * @param lefts  the lefts of the function call statement
         * @param call   the new function call
         */
        public void addVarsAndFCEqn(List<FFunctionCallLeft> lefts, FAbstractFunctionCall call) {
            int nLefts = lefts.getNumChild();
            FTypePrefixVariability variability = (nLefts == 0) ? ASTNode.fContinuous() : contextVariability(call).fullCopy();
            FExp[] exps = null;
            if (variability.constantVariability()) {
                try {
                    CValue[] values = call.evaluate(ASTNode.defaultVariableEvaluator());
                    exps = new FExp[values.length];
                    for (int i = 0; i < values.length; i++)
                        exps[i] = values[i].buildLiteral();
                } catch (ConstantEvaluationException e) {
                    exps = null;
                }
            }

            if (exps == null)
                exps = new FExp[nLefts];
            FExp[] lExps = new FExp[nLefts];
            for (int i = 0; i < nLefts; i++) 
                lExps[i] = lefts.getChild(i).createInlineVars(this, exps[i], variability);

            if (!variability.constantVariability()) {
                call = (FAbstractFunctionCall) call.preventEvents();
                FFunctionCallEquation eqn = 
                    new FFunctionCallEquation(new FNormalEquation(), new List(), call);
                for (FExp exp : lExps) {
                    FFunctionCallLeft left = new FFunctionCallLeft();
                    if (exp != null)
                        left.setFExp(exp);
                    eqn.addLeft(left);
                }
                addEquation(eqn, variability);
            }
        }

    

        protected void addEquation(FAbstractEquation eqn, FTypePrefixVariability variability) {
            outerMostWorklist.add(eqn);
        }

    
        
        protected abstract String nextTempVarName();

    
        
        protected abstract void addVar(FVariable var);

    
        
        protected FVariable addVar(String oldName, FTypePrefixVariability variability, FType type) {
            String n = nextTempVarName();
            FQName name = type.isArray() ? 
                    new FQNameFull(n, type.size().createFArraySubscripts()) : 
                    new FQNameString(n);
            FVariable var = addVar(name, variability, type);
            setTypeOf(oldName, type);
            replMap.put(oldName, var.createUseExp());
            return var;
        }

    
        
        protected FVariable addVar(FQName name, FTypePrefixVariability variability, FType type) {
            FVariable var = type.createTempFVariable(name, variability);
            lookupMap.addVariable(var);
            addVar(var);
            return var;
        }

    
        
        protected Collection<FAbstractEquation> handleInlinedFunctionCallEquation(FFunctionCallEquation original, Collection<FAbstractEquation> result) {
            return result;
        }


}
