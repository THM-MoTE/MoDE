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
 * A flat Modelica model containing variables, initial equations,
 * DAE equations and functions.
 * 
 * FClass corresponds to a flattened Modelica model and contains essentially
 * a list of variables and variables, a list of functions and a list of equations, 
 * of which some are initial equations.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:30
 * @production FClass : {@link BaseNode} ::= <span class="component">{@link FQName}</span> <span class="component">{@link FVariable}*</span> <span class="component">AliasVariable:{@link FVariable}*</span> <span class="component">AliasConstant:{@link FVariable}*</span> <span class="component">FInitialEquation:{@link FAbstractEquation}*</span> <span class="component">FParameterEquation:{@link FAbstractEquation}*</span> <span class="component">{@link FAbstractEquation}*</span> <span class="component">{@link FFunctionDecl}*</span> <span class="component">{@link FRecordDecl}*</span> <span class="component">{@link FEnumDecl}*</span> <span class="component">{@link FDerivedType}*</span> <span class="component">{@link UnknownFVariable}</span> <span class="component">{@link FResidualPair}*</span> <span class="component">{@link FAttribute}*</span> <span class="component">[{@link FDynamicResolver}]</span> <span class="component">{@link DynamicStateManager}</span>;

 */
public class FClass extends BaseNode implements Cloneable {
    /** Set if constant evaluation should consider simulation to be during initialization or not. 
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2375
     */
    public void setIsInitial(boolean initial) {
          FInitialExp.setIsInitial(initial);
    }
    /**
     * Calculates and holds value references for all variables.
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:43
     */
    
        /**
         * Calculates and holds value references for all variables.
         */
        private class ValueReferenceMap {
            private int index = 0;
            private int type = 0;
            private HashMap<FVariable, Integer> map = new HashMap<FVariable, Integer>();
            
            /**
             * Start a new variable vector, i.e. reset the index part to 0.
             */
            public void resetIndex() {
                index = 0;
            }

            /**
             * Increase the index counter by one.
             */
            public void incIndex() {
                index++;
            }
            
            /**
             * Set the value to use for the type bits.
             */
            public void setType(int t) {
                type = t << 28;
            }
            
            /**
             * Calculate indices for the variables in a list and add them to the map.
             * 
             * Indices are assigned in the order variable lists are added. Within a list, 
             * they are assigned in iterator order.
             */
            public void add(Iterable<? extends FVariable> list) {
                for (FVariable fv : list) {
                    map.put(fv, new Integer(index + type));
                    index++;
                }
            }
            
            /**
             * Get the index for a variable.
             * 
             * If it is not in the map, -1 is returned.
             */
            public int get(FVariable fv) {
                Integer i = map.get(fv);
                return (i == null) ? -1 : i.intValue();
            }
        }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:288
     */
    
        public static <T1, T2 extends T1> Collection<T2> filterCollection(Collection<T1> input, Criteria<T1> filter) {
            Collection<T2> res = new ArrayList<T2>();
            for (T1 elm : input) {
                if (filter.test(elm))
                    res.add((T2)elm);
            }
            return res;
        }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:297
     */
    
        
        public static <T extends FVariable, C extends Set<T>> C intersectFVSet(
                C a, Collection<? extends FVariable> b) {
            try {
                // To avoid having to have different versions for different collections
                C res = (C) a.getClass().newInstance();
                res.addAll(a);
                res.retainAll(b);
                return res;
            } catch (IllegalAccessException e) {
            } catch (InstantiationException e) {
            }
            throw new IllegalArgumentException("First argument must be of class with public default constructor.");
        }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:311
     */
    
        
        public static final Criteria<FVariable> REAL_VARIABLE_FILTER = new Criteria<FVariable>() {
            @Override
            public boolean test(FVariable var) {
                return var.isReal();
            }
        };
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:318
     */
    
        
        public static final Criteria<FVariable> INTEGER_VARIABLE_FILTER = new Criteria<FVariable>() {
            @Override
            public boolean test(FVariable var) {
                return var.isInteger();
            }
        };
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:325
     */
    
        
        public static final Criteria<FVariable> BOOLEAN_VARIABLE_FILTER = new Criteria<FVariable>() {
            @Override
            public boolean test(FVariable var) {
                return var.isBoolean();
            }
        };
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:332
     */
    
        
        public static final Criteria<FVariable> STRING_VARIABLE_FILTER = new Criteria<FVariable>() {
            @Override
            public boolean test(FVariable var) {
                return var.isString();
            }
        };
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:339
     */
    
        
        public static final Criteria<FVariable> ENUM_VARIABLE_FILTER = new Criteria<FVariable>() {
            @Override
            public boolean test(FVariable var) {
                return var.isEnum();
            }
        };
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3293
     */
    public String modelDiagnostics() {
        StringBuilder str = new StringBuilder();
        modelDiagnosticsPrintRow(str, "Number of independent constants:", independentConstants());
        modelDiagnosticsPrintRow(str, "  Number of Real independent constants:", independentRealConstants());
        modelDiagnosticsPrintRow(str, "  Number of Real independent constants:", independentRealConstants());
        modelDiagnosticsPrintRow(str, "  Number of Integer independent constants:", independentIntegerConstants());
        modelDiagnosticsPrintRow(str, "  Number of Enum independent constants:", independentEnumConstants());
        modelDiagnosticsPrintRow(str, "  Number of Boolean independent constants:", independentBooleanConstants());
        modelDiagnosticsPrintRow(str, "  Number of String independent constants:", independentStringConstants());

        modelDiagnosticsPrintRow(str, "Number of dependent constants:", dependentConstants());
        modelDiagnosticsPrintRow(str, "  Number of Real dependent constants:", dependentRealConstants());
        modelDiagnosticsPrintRow(str, "  Number of Integer dependent constants:", dependentIntegerConstants());
        modelDiagnosticsPrintRow(str, "  Number of Enum dependent constants:", dependentEnumConstants());
        modelDiagnosticsPrintRow(str, "  Number of Boolean dependent constants:", dependentBooleanConstants());
        modelDiagnosticsPrintRow(str, "  Number of String dependent constants:", dependentStringConstants());

        modelDiagnosticsPrintRow(str, "Number of independent parameters:", independentParameters());
        modelDiagnosticsPrintRow(str, "  Number of Real independent parameters:", independentRealParameters());
        modelDiagnosticsPrintRow(str, "  Number of Integer independent parameters:", independentIntegerParameters());
        modelDiagnosticsPrintRow(str, "  Number of Enum independent parameters:", independentEnumParameters());
        modelDiagnosticsPrintRow(str, "  Number of Boolean independent parameters:", independentBooleanParameters());
        modelDiagnosticsPrintRow(str, "  Number of String independent parameters:", independentStringParameters());
                  
        modelDiagnosticsPrintRow(str, "Number of dependent parameters:", dependentParameters());
        modelDiagnosticsPrintRow(str, "  Number of Real dependent parameters:", dependentRealParameters());
        modelDiagnosticsPrintRow(str, "  Number of Integer dependent parameters:", dependentIntegerParameters());
        modelDiagnosticsPrintRow(str, "  Number of Enum dependent parameters:", dependentEnumParameters());
        modelDiagnosticsPrintRow(str, "  Number of Boolean dependent parameters:", dependentBooleanParameters());
        modelDiagnosticsPrintRow(str, "  Number of String dependent parameters:", dependentStringParameters());
        
        modelDiagnosticsPrintRow(str, "Number of variables:", variables());
        modelDiagnosticsPrintRow(str, "  Number of Real variables:", realVariables());
        modelDiagnosticsPrintRow(str, "  Number of Integer variables:", integerVariables());
        modelDiagnosticsPrintRow(str, "  Number of Enum variables:", enumVariables());
        modelDiagnosticsPrintRow(str, "  Number of Boolean variables:", booleanVariables());
        modelDiagnosticsPrintRow(str, "  Number of String variables:", stringVariables());

        modelDiagnosticsPrintRow(str, "Number of Real differentiated variables:", differentiatedRealVariables()); 
        modelDiagnosticsPrintRow(str, "Number of Real derivative variables:", derivativeVariables()); 
        modelDiagnosticsPrintRow(str, "Number of Real continous algebraic variables:", algebraicContinousRealVariables());

        modelDiagnosticsPrintRow(str, "Number of inputs:", inputs());
        modelDiagnosticsPrintRow(str, "  Number of Real inputs:", realInputs());
        modelDiagnosticsPrintRow(str, "  Number of Integer inputs:", integerInputs());
        modelDiagnosticsPrintRow(str, "  Number of Enum inputs:", enumInputs());
        modelDiagnosticsPrintRow(str, "  Number of Boolean inputs:", booleanInputs());
        modelDiagnosticsPrintRow(str, "  Number of String inputs:", stringInputs());
        
        modelDiagnosticsPrintRow(str, "Number of discrete variables:", discreteVariables());
        modelDiagnosticsPrintRow(str, "  Number of Real discrete variables:", discreteRealVariables());
        modelDiagnosticsPrintRow(str, "  Number of Integer discrete variables:", discreteIntegerVariables());
        modelDiagnosticsPrintRow(str, "  Number of Enum discrete variables:", discreteEnumVariables());
        modelDiagnosticsPrintRow(str, "  Number of Boolean discrete variables:", discreteBooleanVariables());
        modelDiagnosticsPrintRow(str, "  Number of String discrete variables:", discreteStringVariables());
        
        modelDiagnosticsPrintRow(str, "Number of equations:", equations());
        
        modelDiagnosticsPrintRow(str, "Number of variables with binding expression:", variablesWithBindingExp());
        modelDiagnosticsPrintRow(str, "  Number of Real variables with binding exp:", realVariablesWithBindingExp());
        modelDiagnosticsPrintRow(str, "  Number of Integer variables binding exp:", integerVariablesWithBindingExp());
        modelDiagnosticsPrintRow(str, "  Number of Enum variables binding exp:", enumVariablesWithBindingExp());
        modelDiagnosticsPrintRow(str, "  Number of Boolean variables binding exp:", booleanVariablesWithBindingExp());
        modelDiagnosticsPrintRow(str, "  Number of String variables binding exp:", stringVariablesWithBindingExp());
            
        modelDiagnosticsPrintRow(str, "Total number of equations:", equations(), variablesWithBindingExp());
    
        modelDiagnosticsPrintRow(str, "Number of initial equations:", initialEquations());

        str.append(String.format("Number of event indicators in equations:      %6d\n", numEventIndicators()));
        str.append(String.format("Number of event indicators in init equations: %6d\n", numRelExpInInitialEquations()));


        return str.toString();
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3369
     */
    private static void modelDiagnosticsPrintRow(StringBuilder sb, String label, Collection<? extends FDiagnosticsNode> ... lists) {
        int num = 0;
        int numScalar = 0;
        for (Collection<? extends FDiagnosticsNode> list : lists) {
            num += list.size();
            numScalar += countNumScalars(list);
        }
        sb.append(String.format("%-46s%6d(%5d scalars)\n", label, num, numScalar));
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3379
     */
    private static int countNumScalars(Collection<? extends FDiagnosticsNode> nodes) {
        int num = 0;
        for (FDiagnosticsNode node : nodes)
            num += node.numScalars();
        return num;
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3395
     */
    public String aliasDiagnostics() {
        StringBuilder str = new StringBuilder();
        str.append("Alias sets:\n");
        if (getAliasManager()!=null) {
            str.append(getAliasManager());
            int n_elim = 0;
            for (AliasManager.AliasSet aliasSet : getAliasManager().getAliasSets()) {
                n_elim += aliasSet.numAliases() - 1;
            }
            str.append(n_elim + " variables can be eliminated\n");
                
        } else {
            str.append("  Alias sets not computed.\n");
        }
        return str.toString();  
        
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3413
     */
    public String aliasDiagnosticsShort() {
        StringBuilder str = new StringBuilder();
        if (getAliasManager()!=null) {
            int n_elim = 0;
            Set<AliasManager.AliasSet> aliasSets = getAliasManager().getAliasSets();
            for (AliasManager.AliasSet aliasSet : aliasSets) {
                n_elim += aliasSet.numAliases() - 1;
            }
            str.append(aliasSets.size());
            str.append(" sets, ");
            str.append(n_elim);
            str.append(" eliminated variables");
        } else {
            str.append("Alias sets not computed");
        }
        return str.toString();  
        
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3432
     */
    public String variableDiagnostics() {
        
        StringBuilder str = new StringBuilder();
        
        str.append("Independent constants: \n");
        for (FVariable fv : independentConstants()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
                str.append("\n");
        }
        str.append("\n");
        
        str.append("Dependent constants: \n");
        for (FVariable fv : dependentConstants()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
                str.append("\n");
        }
        str.append("\n");
        
        str.append("Independent parameters: \n");
        for (FVariable fv : independentParameters()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
            if (fv.hasBindingExp()) {
                str.append(", evaluated binding exp: ");
                str.append(fv.getBindingExp().ceval());
            }
            str.append("\n");
        }
        str.append("\n");
        
        str.append("Dependent parameters: \n");
        for (FVariable fv : dependentParameters()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
                str.append("\n");
        }

        str.append("\n");  
        str.append("Differentiated variables: \n");
        for (FVariable fv : differentiatedRealVariables()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
            str.append("\n");
        }

        str.append("\n");  
        str.append("Derivative variables: \n");
        for (FVariable fv : derivativeVariables()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
                str.append("\n");
        }
        str.append("\n");  

        str.append("Discrete variables: \n");
        for (FVariable fv : discreteVariables()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
            str.append(", alias: ");
            if (!fv.isAlias()) {
                str.append("no");
            } else {
                if (fv.isNegated()) {
                    str.append("-");
                }
                str.append(fv.alias().valueReference());
            }
            str.append("\n");
        }
        str.append("\n");
        
        str.append("Algebraic real variables: \n");
        for (FVariable fv : algebraicContinousRealVariables()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
            str.append(", alias: ");
            if (!fv.isAlias()) {
                str.append("no");
            } else {
                if (fv.isNegated()) {
                    str.append("-");
                }
                str.append(fv.alias().valueReference());
            }
            str.append("\n");
        }
        str.append("\n");
        
        str.append("Input variables: \n");
        for (FVariable fv : inputs()) {
            str.append(" " + fv.name());
            str.append(": number of uses: " + fv.uses().size() + ", isLinear: " 
                    + fv.isLinear());
                str.append("\n");
        }

        return str.toString();
        
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3542
     */
    public String dependencyDiagnostics() {
        
        StringBuilder str = new StringBuilder();
            
        if (myOptions().getBooleanOption("equation_sorting")) {
            
            str.append("Variable dependencies:\n");
            
            if (getNumFVariable() > myOptions().getIntegerOption("diagnostics_limit")) {
                str.append("Oh dear, the model has way to many variables (" + getNumFVariable() + ")!\n");
                str.append("Current limit is set to " + myOptions().getIntegerOption("diagnostics_limit") + ", you can change this by changing the option 'diagnostics_limit'.\n");
                return str.toString();
            }
            
            str.append("Derivative variables: \n");
            for (FVariable fv : derivativeVariables()) {
                str.append(" " + fv.name() + "\n");
                for (FVariable d : fv.dependsOn()) {
                    str.append("    " + d.name() + "\n");
                }
            }
            str.append("\n");
            str.append("Differentiated variables: \n");
            for (FVariable fv : differentiatedRealVariables()) {
                str.append(" " + fv.name() + "\n");
                for (FVariable d : fv.dependsOn()) {
                    str.append("    " + d.name() + "\n");
                }
            }
            str.append("\n");
            str.append("Algebraic real variables: \n");
            for (FVariable fv : algebraicContinousRealVariables()) {
                str.append(" " + fv.name() + "\n");
                for (FVariable d : fv.dependsOn()) {
                    str.append("    " + d.name() + "\n");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3584
     */
    public String directDependencyDiagnostics() {
        StringBuilder sb = new StringBuilder();
        for (FVariable output : realOutputs()) {
            sb.append(output.name());
            sb.append("\n");
            for (FVariable input : output.directDependencies()) {
                sb.append("    ");
                sb.append(input.name());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3608
     */
    public String incidence() {
        StringBuilder str = new StringBuilder();
        
        LinkedHashSet<FVariable> h;
        LinkedHashSet<FDerivativeVariable> dh;
        
        str.append("Incidence:\n");
        
        int i = 0;
        for (FAbstractEquation fe : equations()) {
            str.append(" eq " + i + ": ");
            dh = fe.derivativeVariables();
            for (FVariable fv : dh) {
                str.append(fv.name() + " ");
            }
            h = fe.algebraicVariables();
            for (FVariable fv : h) {
                str.append(fv.name() + " ");
            }
            str.append("\n");
//          str.append(fe.getClass().getName() + " " + fe.prettyPrint(""));
//          str.append("\n");
            i++;
        }
        
        return str.toString();
        
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3637
     */
    public String dersAndDiffs() {
        StringBuilder str = new StringBuilder();
        str.append("Derivatives and differentiated variables:\n");
        for (FDerivativeVariable fdv : derivativeVariables()) {
            if (fdv.myDifferentiatedVariable()!=null) {
                str.append(" " + fdv.name() + ", " + fdv.myDifferentiatedVariable().name() + "\n");
            }
        }   
        str.append("Differentiated variables and derivatives:\n");
        for (FVariable fv : differentiatedRealVariables()) {
            if (fv.myDerivativeVariable()!=null) {
                str.append(" " + fv.name() + ", " + fv.myDerivativeVariable().name() + "\n");
            }
        }
        return str.toString();
        
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3655
     */
    public String printDAEBLT() {
        return getDAEBLT() == null ? "" : getDAEBLT().toString();
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3659
     */
    public String printDAEInitBLT() {
        return getDAEInitBLT().toString();
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3663
     */
    public String printMatchedDAE() {
        return computeMatchedDAEBiPGraph().toString();
    }
    /**
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3762
     */
    private int generatedFunctionNumber = 1;
    /**
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3763
     */
    public String generateFunctionName() {
        String name, part;
        do {
            part = "algorithm_" + generatedFunctionNumber;
            name = name() + "." + part;
            generatedFunctionNumber++;
        } while (lookupFunc(name) != null || variablesMap().lookup(part) != null);
        return name;
    }
    /**
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:191
     */
    public void clearFlatNameBinding() {
	    variablesMap_computed = false;
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:435
     */
    public static String removeModifiersFromClassName(String name) {
        int p = name.indexOf('(');
        if (p >= 0)
            name = name.substring(0, p);
        return name;
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:442
     */
    public static String convertClassNameToUnderscore(String name) {
        return removeModifiersFromClassName(name).replace(".", "_");
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:495
     */
    private int nextForIndexIndex = 0;
    /**
     * Add an equation to the first equation block.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1220
     */
    public void addFEquation(FAbstractEquation feq) {
        addFAbstractEquationNoTransform(feq);
    }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1797
     */
    private FlatVariableMap.NameIndexCache nameIndexCache = new FlatVariableMap.NameIndexCache();
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1800
     */
    public String nextTempVarName() {
         return nextGeneratedVarName(FlatVariableMap.GeneratedVarType.TEMP);
     }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1804
     */
    public String nextGeneratedVarName(FlatVariableMap.GeneratedVarType gvt) {
         return variablesMap().nextGeneratedVarName(nameIndexCache, gvt);
     }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1816
     */
    public String nextTempVarName(FFunctionDecl func) {
         return variablesMap().nextGeneratedVarName(nameIndexCache, FlatVariableMap.GeneratedVarType.TEMP, func.variablesMap());
     }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1869
     */
    public String nextTempFuncName() {
        String name;
        do {
            name = "temp_" + nextTempFuncIndex++;
        } while (lookupFunc(name) != null);
        return name;
    }
    /**
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1876
     */
    private int nextTempFuncIndex = 1;
    /**
     * @aspect DefaultExperiment
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1993
     */
    
        
        public Experiment experiment = null;
    /**
     * Create an experiment description from an experiment annotation, if it exists.
     * @aspect DefaultExperiment
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1998
     */
    
        
        /**
         * Create an experiment description from an experiment annotation, if it exists.
         */
        public void createExperiment(AnnotationNode a) {
            if (a.exists())
                experiment = new Experiment(a);
        }
    /**
     * Represents an experiment annotation.
     * @aspect DefaultExperiment
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2006
     */
    
        
        /**
         * Represents an experiment annotation.
         */
        public static class Experiment {
            
            public boolean hasStart = false;
            public double start;
            public boolean hasStop = false;
            public double stop;
            public boolean hasInterval = false;
            public double interval;
            public boolean hasTolerance = false;
            public double tolerance;
            
            public Experiment(AnnotationNode expr) {
                for (AnnotationNode val : expr) {
                    if (val.isRealValue()) {
                        if (val.name().equals("StartTime")) {
                            hasStart = true;
                            start = val.real();
                        } else if (val.name().equals("StopTime")) {
                            hasStop = true;
                            stop = val.real();
                        } else if (val.name().equals("Interval")) {
                            hasInterval = true;
                            interval = val.real();
                        } else if (val.name().equals("Tolerance")) {
                            hasTolerance = true;
                            tolerance = val.real();
                        }
                    }
                }
            }
            
        }
    /**
     * @aspect JastAddHacks
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2134
     */
    
        public <V extends FDynamicResolver> V dynamicResolver(V res) {
            getFDynamicResolverOpt().setChild(res, 0);
            return (V) getFDynamicResolverOpt().getChild(0);
        }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:971
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        String nextInd = p.indent(indent);
        str.print(indent + "fclass " + name() + "\n");
        ArrayList<FVariable> protectedVars = new ArrayList<FVariable>();
        for (FVariable fv : getFVariables()) {
            if (!fv.isDerivativeVariable() && !fv.isPreVariable() &&
                    !fv.getFVisibilityType().isRuntimeOptionVisibility()) {
                if (fv.isProtected()) {
                  protectedVars.add(fv);
                } else {
                    p.print(fv, str, nextInd);
                    str.print(";\n");
                }
            }
        }
        if (!protectedVars.isEmpty()) {
            str.print(indent + "protected\n");
            for (FVariable fv : protectedVars) {
                p.print(fv, str, nextInd);
                str.print(";\n");
            }
        }

        if (getNumFInitialEquation()>0)
            str.print(indent + "initial equation \n");
        getFInitialEquations().prettyPrintWithFix(p, str, nextInd, "", ";\n");

        if (getNumFParameterEquation()>0)
            str.print(indent + "parameter equation\n");
        getFParameterEquations().prettyPrintWithFix(p, str, nextInd, "", ";\n");
    
        boolean wroteEquation = false;
        for (FAbstractEquation e : getFAbstractEquations()) {
            if (e instanceof FAlgorithm) {
                p.print(e, str, indent);
                wroteEquation = false;
            } else {
                if (!e.isIgnored()) {
                    if (!wroteEquation) {
                        str.print(indent);
                        str.print("equation\n");
                        wroteEquation = true;
                    }
                    p.print(e, str, nextInd);
                    str.print(";\n");
                }
            }
        }
        
        if (getNumFFunctionDecl() > 0 || getNumFRecordDecl() > 0 || 
                getNumFEnumDecl() > 0 || getNumFDerivedType() > 0) {
            str.print("\n" + indent + "public\n");
            p.print(getFFunctionDecls(), str, nextInd);
            p.print(getFRecordDecls(), str, nextInd);
            p.print(getFEnumDecls(), str, nextInd);
            p.print(getFDerivedTypes(), str, nextInd);
        }
        
        getFAttributeList().prettyPrintFAnnotationAttributeList(str, p, indent, ";\n");

        str.print(indent);
        str.print("end ");
        str.print(name());
        str.print(";\n");
    }
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2156
     */
    public void prettyPrint_MC(Printer p, CodeStream str, String indent) {
		String nextInd = p.indent(indent);
	
	    p.print(getFFunctionDecls(), str, indent);
    	p.print(getFRecordDecls(), str, indent);
    	p.print(getFEnumDecls(), str, indent);
    	p.print(getFDerivedTypes(), str, indent);
	
		str.print(indent + "model " + nameUnderscore() + "\n");
		for (FVariable fv : getFVariables()) {
	  		if (!fv.isDerivativeVariable() && !fv.isPreVariable()) {
	  			p.print(fv, str, nextInd);
	  			str.print(";\n");  
	  		}
		}

		if (getNumFInitialEquation()>0)
			str.print(indent + "initial equation \n");
		getFInitialEquations().prettyPrintWithFix(p, str, nextInd, "", ";\n");

	/*
		if (getNumFParameterEquation()>0)
			str.print(indent + "parameter equation\n");
		getFParameterEquations().prettyPrintWithFix(p, str, nextInd, "", ";\n");
	*/
	    boolean wroteEquation = false;
    	for (FAbstractEquation e : getFAbstractEquations()) {
    		if (e instanceof FAlgorithm) {
    			p.print(e, str, indent);
    			wroteEquation = false;
    		} else {
    			if (!e.isIgnored()) {
	    			if (!wroteEquation) {
	    				str.print(indent);
	    				str.print("equation\n");
	    				wroteEquation = true;
	    			}
	    			p.print(e, str, nextInd);
		    		str.print(";\n");
    			}
    		}
    	}
	        	
  		str.print(indent);
  		str.print("end ");
  		str.print(nameUnderscore());
  		str.print(";\n");
	}
    /**
     * Convert all continous variables that are assigned in when equations into discrete variables.
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:233
     */
    public void updateVariabilityForVariablesInWhen() {
        beginStep("updateVariabilityForVariablesInWhen()");
        getFAbstractEquations().updateVariabilityForVariablesInWhen(false);
        checkDiscreteOperations();
        endStep("updateVariabilityForVariablesInWhen()");
    }
    /**
     * Evaluate asserts with constant tests, generate errors for failing ones, 
     * and eliminate all evaluated assets.
     * @aspect AssertEval
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1515
     */
    
        /**
         * Evaluate asserts with constant tests, generate errors for failing ones, 
         * and eliminate all evaluated assets.
         */
        public class evaluateAsserts extends Transformation {
            public void perform() {
                List<FAbstractEquation> l = new List<FAbstractEquation>();
                for (FAbstractEquation eqn : getFAbstractEquations()) {
                    if (!eqn.evaluateAsserts(true)) {
                        l.add(eqn);
                    }
                }
                setFAbstractEquationList(l);
            }
        }
    /**
     * Check errors that can only be detected after scalarization.
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1600
     */
    public void scalarizationErrorCheck() {
        checkMultipleReinit();
        breakOnErrors();
    }
    /**
     * Check for variables with multiple reinits.
     * @aspect ScalarizationErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1608
     */
    public void checkMultipleReinit() {
        Map<FAbstractVariable, Set<FReinit>> reinitMap = collectReinits();
        for (FAbstractVariable fv : reinitMap.keySet()) {
            if (!fv.isUnknown()) {
                Set<FWhenEquation> whens = new HashSet<FWhenEquation>();
                Set<FReinit> reinits = reinitMap.get(fv);
                for (FReinit r : reinits) {
                    FWhenEquation w = r.myWhen();
                    if (!whens.contains(w))
                        whens.add(w);
                }
                if (whens.size() > 1) {
                    StringBuilder buf = new StringBuilder();
                    buf.append("The variable ");
                    buf.append(fv.name());
                    buf.append(" is assigned in reinit() clauses in more than one when clause:\n");
                    for (FReinit r : reinits) {
                        buf.append("    ");
                        buf.append(r);
                        buf.append(";\n");
                    }
                    fv.error(buf.toString());
                }
            }
        }
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:34
     */
    public ConnectionSetManager connectionSetManager = new ConnectionSetManager();
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:36
     */
    public ConnectionSetManager getConnectionSetManager() {
		return connectionSetManager;
	}
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:40
     */
    public void genConnectionEquations() {
        beginStep("genConnectionEquations()");
		log.debug("<<<FClass.genConnectionEquations()");
		ArrayList<ConnectionSet> l = connectionSetManager.getConnectionSetList();
		log.debug("<<<FClass.genConnectionEquations(): "+ l.size() + " sets in manager");
		//getConnectionSetManager().printConnectionSets();
		//System.out.println(connectionSetManager.printConnectionSets());
		
        List<FAbstractEquation> equationList = getFAbstractEquations();
        int numBefore = equationList.getNumChild();
        for (ConnectionSet set : l) 
            set.generateEquations(equationList);
        int count = 0;
        for (FAbstractEquation eqn : equationList) {
            if (count >= numBefore) {
//                eqn.annotation("src").setValue(new FStringLitExp("Connect #" + (count - numBefore)));
            }
            count++;
        }
		connectionSetManager.generateEqualityConstraints(this);
		connectionSetManager.disconnectFromInstanceTree();
        endStep("genConnectionEquations()");
	}
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:78
     */
    
        public class enableStreamsRewrite extends Transformation {
            // Depends on enableIfEquationElimination being done
            public void perform() {
                enableStreamsRewrite();
                change();
            }
        }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:135
     */
    
        public class enableExpandedInStreamRewrite extends Transformation {
            // Depends on variabilityPropagationIfSet and the following aliasEliminationIfSet being done
            public void perform() {
                enableExpandedInStreamRewrite();
                change();
            }
        }
    /**
     * Create a correctly set up FClass.
     * 
     * Also creates a FlatRoot and sets its fields.
     * 
     * @param icl   the class being flattened
     * @param file  the path to the file to report errors on
     * @aspect FlatTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:35
     */
    public static FClass create(InstClassDecl icl, String flatName) {
        FlatRoot flatRoot = new FlatRoot(icl.createFClass());
        //flatRoot.setFileName(file);
        FClass fc = flatRoot.getFClass(); // make FClass final
        fc.userDefinedName = flatName;
        fc.root().transferRoot(icl.root());
        fc.setDynamicStateManager(new DynamicStateManager());
        return fc;
    }
    /**
     * Set the name of the FClass.
     * 
     * If a user-defined name has been set, use it, otherwise use the given name.
     * @aspect FlatTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:50
     */
    public void setName(String name) {
        if (userDefinedName != null) 
            name = userDefinedName;
        setFQName(new FQNameString(name));
    }
    /**
     * User-defined name for the flat class.
     * @aspect FlatTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:59
     */
    private String userDefinedName = null;
    /**
     * Perform a basic sanity check of the current flat tree.
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:24
     */
    public void sanityCheck() {
        if (myOptions().getBooleanOption("debug_sanity_check")) {
            sanityCheckFIdUseConsistency(this);
            for (FAbstractEquation eqn : getFParameterEquations()) {
                eqn.sanityCheckParameterEquations(this);
            }
            
            // Break execution and print any errors 
            breakOnErrors();
        }
    }
    /**
     * Report a sanity problem.
     * @aspect Sanity
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/SanityCheck.jrag:39
     */
    public void sanityProblem(ASTNode node, String message, Object... args) {
        DEBUG_SANITY_CHECK.invoke(node, lastCompletedTransformationStep, completedTransformationSteps, message, args);
    }
    /**
     * transformCanonicalBase contains all transformation that should be
     * done by both the Modelica and the Optimica compilers.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:84
     */
    public void transformCanonicalBase() {
        for (Transformation t : getTransformations())
            t.apply();
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:89
     */
    public void transformCanonicalCleanup() {
        removeUnusedFunctionsAndRecords();
        root().flushAllRecursive();
        for (FRecordDecl rec : getFRecordDecls())
            rec.clearBindingEquations();
    }
    /**
     * List that contains all transformations that has been registered.
     * This list is initialized by setupTransformations()
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:102
     */
    
        
        /**
         * List that contains all transformations that has been registered.
         * This list is initialized by setupTransformations()
         */
        private java.util.List<Transformation> transformations;
    /**
     * Method that initializes the transformations list. This method should
     * called before each operation on the list. Internal check prevents
     * multiple initializations.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:109
     */
    
        
        /**
         * Method that initializes the transformations list. This method should
         * called before each operation on the list. Internal check prevents
         * multiple initializations.
         */
        private void setupTransformations() {
            if (transformations != null)
                return;
            transformations = new ArrayList<Transformation>();
            transformations.add(new enableIfEquationElimination());
            transformations.add(new genAlgorithmFunctionsIfSet());
            transformations.add(new genInitArrayStatements());
            transformations.add(new scalarize());
            transformations.add(new MakeReinitedVarsStates());
            transformations.add(new enableIfEquationElimination());
            transformations.add(new enableStreamsRewrite());
            transformations.add(new extractEventGeneratingExps());
            transformations.add(new transformAlgorithms());
            transformations.add(new convertWhenToIf());
            transformations.add(new extractSampleExpressions());
            transformations.add(new FunctionInliningIfSet());
            transformations.add(new setFDerivativeVariables());
            transformations.add(new addFPreVariables());
            transformations.add(new enableIfEquationRewrite());
            transformations.add(new aliasEliminationIfSet());
            transformations.add(new variabilityPropagationIfSet());
            transformations.add(new aliasEliminationIfSet());
            transformations.add(new enableExpandedInStreamRewrite());
            transformations.add(new evaluateAsserts());
            transformations.add(new enableSemiLinearRewrite());
            transformations.add(new eliminateEqualSwitches());
            transformations.add(new genInitialEquations());
            transformations.add(new addStateInitialEquationsIfSet());
            transformations.add(new setFDerivativeVariablesPreBLT());
            transformations.add(new indexReduction());
            transformations.add(new LateFunctionInliningIfSet());
            transformations.add(new commonSubexpressionEliminationIfSet());
            transformations.add(new addFPreVariables());
            transformations.add(new aliasEliminationIfSet());
            transformations.add(new sortDependentParameters());
            transformations.add(new addRuntimeOptionParameters());
            transformations.add(new computeMatchingsAndBLT());
        }
    /**
     * This method returns the list of transformations. This method should
     * be used when retreiving the list of transformations since it ensures
     * that the list is initialized.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:153
     */
    

        /**
         * This method returns the list of transformations. This method should
         * be used when retreiving the list of transformations since it ensures
         * that the list is initialized.
         */
        private Collection<Transformation> getTransformations() {
            setupTransformations();
            return transformations;
        }
    /**
     * Adds a transformation to the list of transformations. The
     * transformation is added after each occurance of <code>after<code>.
     * The transformation is not added if no occurances of 
     * <code>after<code> is found.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:164
     */
    

        /**
         * Adds a transformation to the list of transformations. The
         * transformation is added after each occurance of <code>after<code>.
         * The transformation is not added if no occurances of 
         * <code>after<code> is found.
         */
        private <T extends Transformation> T addTransformationAfter(T transformation, String after) {
            setupTransformations();
            ListIterator<Transformation> it = transformations.listIterator();
            while (it.hasNext()) {
                Transformation other = it.next();
                if (other.name().equals(after))
                    it.add(transformation);
            }
            return transformation;
        }
    /**
     * Base class for transformations on the flat tree.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:178
     */
    

        /**
         * Base class for transformations on the flat tree.
         */
        public abstract class Transformation {

            private String option;

            /**
             * Create a transformation with default settings:
             * <ul>
             * <li>Not coupled to a compiler option.</li>
             * </ul>
             */
            public Transformation() {
                this(null);
            }

            /**
             * Create a transformation with specific settings.
             * 
             * @param option  boolean option the transfomation depends on (null for none)
             */
            public Transformation(String option) {
                this.option = option;
            }

            /**
             * Perform the transformation.
             */
            public abstract void perform();

            /**
             * Determine if this transformation should be perfomed.
             * 
             * Defaults to true if this transformation does not depend on an option or the option is true.
             */
            public boolean active() {
                return (option == null) || myOptions().getBooleanOption(option);
            }

            /**
             * The name of this transformation.
             * 
             * Defaults to the name of the class.
             */
            public String name() {
                return getClass().getSimpleName();
            }

            /**
             * Apply this transformation, if active.
             * 
             * Subclasses should not override this method.
             */
            public void apply() {
                if (active()) {
                    try {
                        beginStep(name());
                        log.info("Applying transformation: " + name() + "...");
                        perform();
                    } finally {
                        completedTransformationSteps++;
                        lastCompletedTransformationStep = name();
                        endStep(name());
                    }
                    transformationStepDebug();
                }
            }

            /**
             * Flushes tree and discards calculated information.
             * 
             * Call this method at the end of perform() if it changed the tree.
             */
            void change() {
                setDAEBLT(BLT.EMPTY_BLT);
                setDAEInitBLT(BLT.EMPTY_BLT);
                DAEBiPGraph = null;
                root().flushAllRecursiveClearFinal();
            }
        }
    /**
     * Perform transformation step debug operations that are activated.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:262
     */
    public void transformationStepDebug() {
        generateStepMof();
        sanityCheck();
    }
    /**
     * Generate a .mof file with the current flat tree.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:270
     */
    public void generateStepMof() {
        String value = myOptions().getStringOption("debug_transformation_steps");
        if ("full".equals(value)) {
            TRANSFORMATION_STEP_DIR.mkdir();
            String fileName = String.format("%02d_%s.mof", completedTransformationSteps, lastCompletedTransformationStep);
            File file = new File(TRANSFORMATION_STEP_DIR, fileName);
            log.debug("Writing flat tree after step " + lastCompletedTransformationStep + " to " + fileName);
            try {
                CodeStream out = new CodeStream(file);
                prettyPrint(out, "");
                out.close();
            } catch (FileNotFoundException e) {
                log.warning("Failed to write step info to file " + file);
            }
        }
        if ("full".equals(value) || "diag".equals(value)) {
            TRANSFORMATION_STEP_DIR.mkdir();
            String fileName = String.format("%02d_%s.txt", completedTransformationSteps, lastCompletedTransformationStep);
            File file = new File(TRANSFORMATION_STEP_DIR, fileName);
            log.debug("Writing diag after step " + lastCompletedTransformationStep + " to " + fileName);
            try {
                CodeStream out = new CodeStream(file);
                out.print(modelDiagnostics());
                out.close();
            } catch (FileNotFoundException e) {
                log.warning("Failed to write step info to file " + file);
            }
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:300
     */
    private static final File TRANSFORMATION_STEP_DIR = new File("transformation_steps");
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:302
     */
    private int completedTransformationSteps = 0;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:303
     */
    private String lastCompletedTransformationStep = "flattening";
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:314
     */
    protected boolean doneTransformCanonical = false;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:316
     */
    public void transformCanonical() {
        if (doneTransformCanonical)
            return;
        doneTransformCanonical = true;
        beginStep("transformCanonical()");

        transformCanonicalBase();
        

        root().flushAllRecursive();	
        transformCanonicalCleanup();
        getDAEBLT().errorCheck(this);
        getDAEInitBLT().errorCheck(this);

        endStep("transformCanonical()");
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:350
     */
    private HashMap<FVariable, AbstractEquationBlock> daeFVariableEquationBlockMap =
            new HashMap<FVariable, AbstractEquationBlock>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:358
     */
    private HashMap<FAbstractEquation, AbstractEquationBlock> daeEquationEquationBlockMap =
            new HashMap<FAbstractEquation, AbstractEquationBlock>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:369
     */
    private HashMap<FVariable,AbstractEquationBlock> daeInitFVariableEquationBlockMap = new HashMap<FVariable,AbstractEquationBlock>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:375
     */
    private HashMap<FAbstractEquation,AbstractEquationBlock> daeInitEquationEquationBlockMap = new HashMap<FAbstractEquation,AbstractEquationBlock>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:381
     */
    private ArrayList<FAbstractEquation> daeUnmatchedEquations = new ArrayList<FAbstractEquation>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:387
     */
    private ArrayList<FVariable> daeUnmatchedVariables = new ArrayList<FVariable>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:393
     */
    private ArrayList<FAbstractEquation> daeInitUnmatchedEquations = new ArrayList<FAbstractEquation>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:399
     */
    private ArrayList<FVariable> daeInitUnmatchedVariables = new ArrayList<FVariable>();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:405
     */
    private BLT daeBLT = BLT.EMPTY_BLT;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:406
     */
    public BLT getDAEBLT() {
        transformCanonical();
        return daeBLT;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:411
     */
    public void setDAEBLT(BLT newBLT) {
        daeBLT = newBLT;
        daeFVariableEquationBlockMap = new HashMap<FVariable, AbstractEquationBlock>();
        daeEquationEquationBlockMap = new HashMap<FAbstractEquation, AbstractEquationBlock>();

        for (AbstractEquationBlock eb : daeBLT) {
            for (FVariable fv : eb.allVariables()) {
                daeFVariableEquationBlockMap.put(fv,eb);
            }

            for (FAbstractEquation equation : eb.allEquations()) {
            	daeEquationEquationBlockMap.put(equation, eb);
            }
        }

        if (newBLT == BLT.EMPTY_BLT)
            daeStructuredBLT = BLT.EMPTY_BLT;
        else
            daeStructuredBLT = new StructuredBLT(this, daeBLT);
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:432
     */
    private StructuredBLT daeStructuredBLT = BLT.EMPTY_BLT;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:434
     */
    public StructuredBLT getDAEStructuredBLT() {
        transformCanonical();
        return daeStructuredBLT;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:439
     */
    private BLT daeInitBLT = BLT.EMPTY_BLT;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:441
     */
    public BLT getDAEInitBLT() {
        transformCanonical();
        return daeInitBLT;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:446
     */
    public void setDAEInitBLT(BLT newBLT) {
        daeInitBLT = newBLT;
        daeInitFVariableEquationBlockMap = new HashMap<FVariable, AbstractEquationBlock>();
        daeInitEquationEquationBlockMap = new HashMap<FAbstractEquation, AbstractEquationBlock>();

        for (AbstractEquationBlock eb : daeInitBLT) {
            for (FVariable fv : eb.allVariables()) {
                daeInitFVariableEquationBlockMap.put(fv,eb);
            }

            for (FAbstractEquation equation : eb.allEquations()) {
                daeInitEquationEquationBlockMap.put(equation, eb);
            }
        }
        daeInitBLT.computeDependencies();
    }
    /**
     * Run matchings and BLT.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:471
     */
    
        /**
         * Run matchings and BLT.
         */
        public class computeMatchingsAndBLT extends Transformation {
            public computeMatchingsAndBLT() {
                super("automatic_add_initial_equations");
            }

            @Override
            public boolean active() {
                return super.active() && shouldPerformMatchingsAndBLT();
            }

            @Override
            public void perform() {
                computeMatchingsAndBLT();
                complianceCheckBLT();
                breakOnErrors();
            }
        }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:490
     */
    public void complianceCheckBLT() {
        getDAEBLT().complianceCheck(ErrorCheckType.COMPILE, myOptions());
        getDAEInitBLT().complianceCheck(ErrorCheckType.COMPILE, myOptions());
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:495
     */
    private static final EnumSet<BiPGraph.VarType> VAR_TYPES_NORMAL = 
            EnumSet.of(BiPGraph.VarType.DERIVATIVE_VARIABLES, 
                    BiPGraph.VarType.ALGEBRAIC_VARIABLES);
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:499
     */
    private static final EnumSet<BiPGraph.VarType> VAR_TYPES_REAL = 
            EnumSet.of(BiPGraph.VarType.DERIVATIVE_VARIABLES, 
                    BiPGraph.VarType.CONTINUOUS_ALGEBRAIC_VARIABLES);
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:503
     */
    private static final EnumSet<BiPGraph.VarType> VAR_TYPES_INIT = 
            EnumSet.of(BiPGraph.VarType.DIFFERENTIATED_VARIABLES, 
                    BiPGraph.VarType.DISCRETE_PRE_VARIABLES, 
                    BiPGraph.VarType.NON_FIXED_PARAMETERS);
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:508
     */
    private static final EnumSet<BiPGraph.VarType> VAR_TYPES_ALL = 
            EnumSet.of(BiPGraph.VarType.DERIVATIVE_VARIABLES, 
                    BiPGraph.VarType.ALGEBRAIC_VARIABLES, 
                    BiPGraph.VarType.DIFFERENTIATED_VARIABLES, 
                    BiPGraph.VarType.DISCRETE_PRE_VARIABLES, 
                    BiPGraph.VarType.NON_FIXED_PARAMETERS);
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:515
     */
    private BiPGraph computeMatchedDAEBiPGraph() {
        BiPGraph g = new BiPGraph();
        g.addVariables(this, VAR_TYPES_NORMAL);
        g.addEquations(equations(), VAR_TYPES_NORMAL);
        g.maximumMatching(true);
        daeUnmatchedVariables.clear();
        for (Var var : g.getUnmatchedVariables())
            daeUnmatchedVariables.add(var.getVariable());
        daeUnmatchedEquations.clear();
        for (Eq ee : g.getUnmatchedEquations())
            daeUnmatchedEquations.add(ee.getEquation());
        return g;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:529
     */
    private BiPGraph DAEBiPGraph = null;
    /**
     * The symbolic equation sorting and canonicalization proceeds in the
     * following steps:
     * 
     * - The DAE system consisting of the DAE equations with algebraics and
     * derivatives treated as unknowns is matched to obtain a pairing
     * between equations and variables. Discrete and continuous algebraic
     * variables are treated equally in this respect.
     * 
     * - If a perfect matching is found, i.e., if there are no unmatched
     * equations or variables, the BLT algoritm is applied to compute
     * a sequence of stron components, corresponding to systems of equations.
     * 
     * - Having computed a matching and transformed the DAE into BLT form, 
     * the DAE initialization system is analyzed:
     * - The differentiated variables are added to the set of unknown 
     * variables of the system.
     * - The pre variables are added to the set of unknown variables of the
     * system.
     * - The initial equations are added to the set of equations of the 
     * system. This includes equations resulting from start values with
     * a corresonding fixed attribute set to true.
     * - When clauses are analyzed: if a when clause is explicitly enabled by
     * the initial() operator (whatever this means...), the when clause 
     * is excluded, otherwhise the equation pre(x) = x is added, where x 
     * is the variable that is solved for in the when clause.
     * 
     * - The matching algoritm is applied to the updated graph. Notice that it
     * is important that the result of the DAE matching is used as a starting
     * point: using this approach, derivatives and algebraics will remain
     * matched if possible and additional equations are added, if needed,
     * for differentiated variables. If there are 
     * unmatched equations, the transformation sequence terminates. If there
     * are unmatched variables, then additional initial equations are added 
     * in order to obtained a balanced system. For continuous variables, 
     * equations such as x = x.start are added, whereas for discrete variables
     * equations such as pre(x) = x.start are added.
     * 
     * - Finally, the BLT algorithm is applied to the resulting perfect
     * matchibng for the DAE initialization system.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:572
     */
    private void computeMatchingsAndBLT() {
        // Make sure that we don't do this if any errors have been reported
        breakOnErrors();

        log.verbose("Flat tree before matching and BLT:");
        log.verbose(this);

        BiPGraph g;
        if (DAEBiPGraph == null) {
            g = computeMatchedDAEBiPGraph();
            log.verbose("DAE BiPGraph");
            log.verbose(g);
            log.verbose("DAE BiPGraph matching");
            log.verbose(g.printMatchingObj());
        } else {
            g = DAEBiPGraph;
            DAEBiPGraph = null;
        }
		
        log.verbose(g);
        
        // If no complete matching found, then fail
        if (!g.isComplete()) {
            checkStructure();
            breakOnErrors();
        } 

        // Perform BLT
        if (myOptions().getBooleanOption("equation_sorting") &&
                !myOptions().getBooleanOption("generate_only_initial_system") &&
                g.isComplete()) {
            BLT daeBLT;
            try {
                daeBLT = g.computeBLT(myOptions(), Arrays.<AbstractBiPGraph.SCCContributor>asList(AbstractBiPGraph.PRE_VARIABLE_CONTRIBUTOR));
                if (blockFunctionExtraction(daeBLT, g)) {
                    daeBLT = g.computeBLT(myOptions(), Arrays.<AbstractBiPGraph.SCCContributor>asList(AbstractBiPGraph.PRE_VARIABLE_CONTRIBUTOR));
                }
            } catch (BLTException e) {
                error(e.getMessage());
                return;
            }
            setDAEBLT(daeBLT);
            log.verbose(getDAEStructuredBLT());
            log.verbose(getDAEBLT());
        } else {
            setDAEBLT(BLT.EMPTY_BLT);
        }
        
        g.removeVariables(dynamicAlgebraicVariables());
        
        // Find matching for the initialization system
        g.addVariables(this, VAR_TYPES_INIT);
        g.addEquations(equations(), VAR_TYPES_INIT);
        g.setAsInitialSystem();
        
        // Replace when equations
        java.util.List<FAbstractEquation> equationsToReplace = new ArrayList<FAbstractEquation>();
        for (FAbstractEquation e : equations()) {
            if (e.replacedAtInitialization()) {
                equationsToReplace.add(e);
            }
        }
        
        Set<FAbstractVariable> existingPrePropagationLikeInitialEquations = new HashSet<FAbstractVariable>();
        for (FAbstractEquation eqn : initialEquations()) {
            FAbstractVariable var = eqn.isPrePropagationEquation();
            if (var != null)
                existingPrePropagationLikeInitialEquations.add(var);
        }
        
        Map<FAbstractVariable, FAbstractEquation> prePropagationEquations = new HashMap<FAbstractVariable, FAbstractEquation>();
        // Loop over all equations to replace
        for (FAbstractEquation equationToReplace : equationsToReplace) {
            
            // How many equations are there in this when clause?
            List<FAbstractEquation> newEquations = equationToReplace.getInitialEquations();
            
            // Put the Equations in an ArrayList rather than a List
            // TODO: There are probably more elegant ways to do this...
            java.util.List<FAbstractEquation> newEquations_ = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : newEquations) {
                FAbstractVariable var = e.isPrePropagationEquation();
                if (var == null) {
                    newEquations_.add(e);
                } else {
                    if (existingPrePropagationLikeInitialEquations.contains(var))
                        continue;
                    boolean hasOthers = false;
                    boolean assignedInAllBranches = false;
                    for (FIdUseExp exp : var.uses()) {
                        FAbstractEquation eqn = exp.myFEquation();
                        if (eqn == null || eqn == e || eqn == equationToReplace || !(eqn.inEquationSection() || eqn.inInitialEquationSection()))
                            continue;
                        hasOthers = true;
                        if (eqn.assignedInAllBranches(var))
                            assignedInAllBranches = true;
                    }
                    
                    if (!hasOthers || assignedInAllBranches)
                        prePropagationEquations.put(var, e);
                    else
                        newEquations_.add(e);
                }
            }
            
            // - equationToReplace is an FAbstractEquation that should be replaced
            // - newEquations contains the new equations that replaces the equationToReplace
            // - Note that newEquations may contain several equations
            
            java.util.List<Eq> eq_list = new ArrayList<Eq>(g.getEquations(equationToReplace));
            
            for (Eq eqq : eq_list) {
                g.removeEquation(eqq);
            }
            
            if (!eq_list.isEmpty())
                g.addEquations(newEquations_, VAR_TYPES_ALL, eq_list.get(0).getName() + "_init_", new Enumerator(1));
        }
        
        log.verbose(g);
        
        g.addEquations(initialEquations(), VAR_TYPES_ALL);
        
        g.maximumMatching(false, prePropagationEquations.keySet());
        log.verbose("Init DAE BiPGraph");
        log.verbose(g);
        log.verbose("Init BiPGraph matching");
        log.verbose(g.printMatchingObj());
        
        g = overdeterminedInitialSystem(g);
        
        // Add initial equations if needed
        if (g.getUnmatchedEquations().isEmpty() && myOptions().getBooleanOption("automatic_add_initial_equations")) {
            for (Var var : g.getUnmatchedVariables()) {
                FVariable fv = var.getVariable();
                FAbstractEquation fe = prePropagationEquations.remove(fv);
                if (fe == null && fv.isPreVariable())
                    fe = prePropagationEquations.remove(fv.myNonPreVariable());
                if (fe == null) {
                    FIdUseExp lhs = fv.isPreVariable() ? fv.createFPreExp() : fv.createUseExp();
                    FExp rhs = fv.startAttributeSet() ? fv.startAttributeExp() : fv.type().zeroLiteral();
                    fe = new FEquation(lhs, rhs);
                    addFInitialEquation(fe);
                }
                g.addEquations(Collections.singletonList(fe), VAR_TYPES_ALL);
            }
            root().flushAllRecursive();
            
            g.maximumMatching(false);
            log.verbose("Init DAE BiPGraph after addition of initial equations");
            log.verbose(g);
            log.verbose("Init BiPGraph matching after addition of initial equations");
            log.verbose(g.printMatchingObj());
        }
        
        numIgnoredPrePropagationEquations = prePropagationEquations.size() 
                + existingPrePropagationLikeInitialEquations.size();
        
        for (Var var : g.getUnmatchedVariables()) {
            daeInitUnmatchedVariables.add(var.getVariable());
        }
        
        for (Eq ee : g.getUnmatchedEquations()) {
            daeInitUnmatchedEquations.add(ee.getEquation());
        }
        
        collectErrors(ErrorCheckType.COMPILE);
        breakOnErrors();
        
        if (myOptions().getBooleanOption("equation_sorting") && g.isComplete()) {
            g.tarjanReset();
            BLT daeInitBLT;
            try {
                daeInitBLT = g.computeBLT(myOptions());
                if (blockFunctionExtraction(daeInitBLT, g)) {
                    daeInitBLT = g.computeBLT(myOptions());
                }
            } catch (BLTException e) {
                error(e.getMessage());
                return;
            }
            setDAEInitBLT(daeInitBLT);
            log.verbose(daeInitBLT);
        } else {
            setDAEInitBLT(BLT.EMPTY_BLT);
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:769
     */
    public void checkStructure() {
		if (myOptions().getBooleanOption("enable_structural_diagnosis")) {
			StringBuffer err_str = new StringBuffer("The system is structurally singular. ");
			if (writeUnmatchedElements(err_str, getDAEUnmatchedVariables(), getDAEUnmatchedEquations())) 
				error(err_str.toString());
			err_str = new StringBuffer("The initialization system is structurally singular. ");
			if (writeUnmatchedElements(err_str, getDAEInitUnmatchedVariables(), getDAEInitUnmatchedEquations())) 
				error(err_str.toString());
		}
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:780
     */
    public static boolean writeUnmatchedElements(StringBuffer str, Collection<FVariable> unmatchedVariables, Collection<FAbstractEquation> unmatchedEquations) {
		boolean unbalanced = false;
		if (!unmatchedVariables.isEmpty()) {
			str.append("The following varible(s) could not be matched to any equation:\n");
			for (FVariable fv : unmatchedVariables) {
				str.append("     " + fv.name());
				str.append("\n");
			}
			unbalanced = true;
		}
		
		if (!unmatchedEquations.isEmpty()) {
			if (unbalanced) 
				str.append("\n  ");
			str.append("The following equation(s) could not be matched to any variable:\n");
			for (FAbstractEquation ee : unmatchedEquations) {
				str.append(ee.prettyPrint("    "));
				str.append("\n");
			}
			unbalanced = true;
		}
		return unbalanced;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:865
     */
    
        public class genAlgorithmFunctionsIfSet extends Transformation {
            public genAlgorithmFunctionsIfSet() {
                super("algorithms_as_functions");
            }
            
            public void perform() {
                genAlgorithmFunctions();
            }
        }
    /**
     * Generate functions from algorithms.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:879
     */
    public void genAlgorithmFunctions() {
		for (FAlgorithm alg : myAlgorithms()) {
			// Create function declaration
			List<FFunctionVariable> vars = new List<FFunctionVariable>();
			FQName funcName = new FQNameString(alg.generateFunctionName());
			
			// - Find inputs
			ArrayList<FVariable> inVars = new ArrayList<FVariable>();
			ArrayList<FFunctionVariable> bothInVars = new ArrayList<FFunctionVariable>();
			for (FIdUseExp use : alg.FIdUseExpsInRHS()) {
				FAbstractVariable fv = use.myFV();
				if (!fv.isUnknown() && !inVars.contains(fv) && !fv.isForIndex()) {
					inVars.add((FVariable) fv);
					bothInVars.add(null);
				}
			}
			
			// - Create outputs, add to vars and locate those that are inputs as well
			ArrayList<FVariable> outVars = new ArrayList<FVariable>();
			for (FIdUseExp use : alg.FIdUseExpsInLHS()) {
				if (!use.myFV().isUnknown() && !outVars.contains(use.myFV())) {
					FVariable fv = (FVariable) use.myFV();
					FFunctionVariable ffv = fv.createFFunctionOutput();
					vars.add(ffv);
					outVars.add(fv);
					int i = inVars.indexOf(fv);
					if (i >= 0) 
						bothInVars.set(i, ffv);
				}
			}
			
			// - Create inputs, add to vars and update inputs and outputs that are the same
			ArrayList<FVariable> allVars = new ArrayList<FVariable>();
			allVars.addAll(inVars);
			allVars.addAll(outVars);
			
            List<FStatement> stmts = new List<FStatement>();
			for (int i = 0; i < inVars.size(); i++) {
				FVariable fv = inVars.get(i);
				FFunctionVariable ffv = fv.createFFunctionInput();
				vars.add(ffv);
				if (bothInVars.get(i) != null) {
					
					// Generate a new (unique) name for variable
					boolean nameExists = true;
					String name = null;
					for (int j = 0; nameExists; j++) {
						name = fv.name() + "_" + j;
						nameExists = false;
						for (FVariable fv2 : allVars)
							if (fv2.name().equals(name))
								nameExists = true;
					}
					
					// Rename input
					FQName fqn = new FQNameString(name);
					ffv.setFQName(fqn);
					
					// Create and add binding expression for output
                    stmts.add(new FAssignStmt(bothInVars.get(i).createUseExp(), fqn.createFIdUseExp()));
				}
			}
			
            for (FStatement stmt : alg.getFStatements()) {
                stmts.add(stmt);
            }
            alg.setFStatementList(stmts);
			
			// Create function call equation and replace algorithm
			List<FExp> args = new List<FExp>();
			for (int i = 0; i < inVars.size(); i++) 
				args.add(inVars.get(i).createAlgorithmArgument(bothInVars.get(i) != null));
			Size[] sizes = new Size[outVars.size()];
			for (int i = 0; i < outVars.size(); i++)
				sizes[i] = outVars.get(i).size();
            FType type = FFunctionType.create(funcName.name(), outVars, this);
            FFunctionCall call = new FFunctionCall(funcName.createFIdUse(), args, type);
			List<FFunctionCallLeft> lefts = new List<FFunctionCallLeft>();
			for (FVariable fv : outVars)
				lefts.add(fv.getFQName().createFFunctionCallLeft());
			replaceEquation(alg, new FFunctionCallEquation(lefts, call));
			
			// Add return statement, create function declaration and add it to FClass 
			alg.addFStatement(new FReturnStmt());
			addFFunctionDecl(new FFunctionDecl(funcName, vars, alg, new List<FAttribute>()));
		}
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:968
     */
    
		public class transformAlgorithms extends Transformation {
			public void perform() {
				AlgorithmTransformer.visit(algorithms(), new IndicatorAlgoTransformer());
				flushAllRecursive();
			}
		}
    /**
     * Replace one equation with another.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1133
     */
    public void replaceEquation(FAbstractEquation oldEq, FAbstractEquation newEq) {
		getFAbstractEquations().replaceChild(oldEq, newEq);
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1189
     */
    
        
        public setFDerivativeVariables setFDerivativeVariables = new setFDerivativeVariables();
    /**
     * Remake all FDerivativeVariables.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1194
     */
    
        
        /**
         * Remake all FDerivativeVariables.
         */
        public class setFDerivativeVariables extends Transformation {
            protected Set<FVariable> variablesToVisit() {
                return new LinkedHashSet<FVariable>(differentiatedRealVariablesFilteredSet());
            }
            
            public void perform() {
                ArrayList<FVariable> l = new ArrayList<FVariable>();
                for (FVariable fv : getFVariables()) {
                    if (!fv.isDerivativeVariable()) {
                        l.add(fv);
                    }
                }
                for (FVariable fv : variablesToVisit()) {
                    if (fv.isDiscrete()) {
                        DIFFERENTIATED_DISCRETE_VARIALBE.invoke(fv, fv.name());
                    }
                    l.add(fv.createFDerivativeVariable());
                }
                setFVariableList(new List<FVariable>(l));
                root().flushAllRecursive();
                breakOnErrors();
            }
        }
    /**
     * Used by index reduction when removing derivatives of state select
     * prefer variables.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1222
     */
    
        
        /**
         * Used by index reduction when removing derivatives of state select
         * prefer variables.
         */
        private Set<FVariable> ssPreferVars = null;
    /**
     * Add derivative variables to the list of FVariables.
     * Derivative variable is added for a variable of either of the following is true:
     * - Occurres differentiated
     * - Have StateSelect always or prefer
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1230
     */
    
        
        /**
         * Add derivative variables to the list of FVariables.
         * Derivative variable is added for a variable of either of the following is true:
         *  - Occurres differentiated
         *  - Have StateSelect always or prefer
         */
        public class setFDerivativeVariablesPreBLT extends setFDerivativeVariables {
            @Override
            protected Set<FVariable> variablesToVisit() {
                ssPreferVars = new HashSet<FVariable>();
                Set<FVariable> fvsToVisit = super.variablesToVisit();
                for (FVariable fv : variables()) {
                    if (!fv.isReal())
                        continue;
                    FRealVariable.StateSelect ss = ((FRealVariable)fv).stateSelectAttribute();
                    if (ss != FRealVariable.StateSelect.ALWAYS && ss != FRealVariable.StateSelect.PREFER)
                        continue;
                    if (ss == FRealVariable.StateSelect.PREFER && !fvsToVisit.contains(fv))
                        ssPreferVars.add(fv);
                    fvsToVisit.add(fv);
                }
                return fvsToVisit;
            }
        }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1250
     */
    public void addFDerivativeVariables(Collection<FVariable> fvs) {
        for (FVariable fv : fvs)
            addFVariable(fv);
        root().flushAllRecursive();
    }
    /**
     * Add pre variables to the list of FVariables, one for each
     * discrete variable and one for each continuous variable that is 
     * used in a pre() expression in an initial equation.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1292
     */
    
        /**
         * Add pre variables to the list of FVariables, one for each
         * discrete variable and one for each continuous variable that is 
         * used in a pre() expression in an initial equation.
         */
        public class addFPreVariables extends Transformation {
            public void perform() {
                ArrayList<FVariable> l = new ArrayList<FVariable>();
                for (FVariable fv : discreteVariables()) 
                    if (fv.myPreVariable().isUnknown())
                        l.add(fv.createPreVariable());
                for (FVariable fv : continuousVariablesUsedInPreInInitial())
                    if (fv.myPreVariable().isUnknown())
                        l.add(fv.createPreVariable());
                for (FVariable fv : l) 
                    addFVariableNoTransform(fv);
                root().flushAllRecursive();
            }
        }
    /**
     * Generate initial equations from variables with fixed start
     * attributes.
     * 
     * Intitial equations corresponding to explicitly set start attributes of 
     * differentiated variables are also generated, without taking the fixed
     * attribute into account.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1369
     */
    
        /**
         * Generate initial equations from variables with fixed start
         * attributes.
         * 
         * Intitial equations corresponding to explicitly set start attributes of 
         * differentiated variables are also generated, without taking the fixed
         * attribute into account.
         */
        public class genInitialEquations extends Transformation {
            public void perform() {
                // TODO: Isn't there always a value for fv.startAttributeExp() now?
                for (FVariable fv : variables()) {
                    boolean generate = false;
                    if (!myOptions().getBooleanOption("state_initial_equations") &&
                            fv.isDifferentiatedVariable() && (fv.isFixed() ||
                            myOptions().getBooleanOption("state_start_values_fixed")))
                        generate = true;
                    else if (!myOptions().getBooleanOption("state_initial_equations") &&
                            fv.isAlgebraicContinousRealVariable() && fv.isFixed())
                        generate = true;
                    else if (fv.isDiscrete() && !fv.isString() && fv.isFixed())
                        generate = true;
                    
                    if (generate) {
                        FExp lhs = fv.isDiscrete() ? fv.createFPreExp() : fv.createUseExp();
                        FExp rhs = fv.startAttributeSet() ? fv.startAttributeExp().fullCopy() : fv.type().zeroLiteral();
                        addFInitialEquation(new FEquation(lhs, rhs));
                    }
                }
                root().flushAllRecursive();
            }
        }
    /**
     * Perform alias elimination if it is activated.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1399
     */
    
        /**
         * Perform alias elimination if it is activated.
         */
        public class aliasEliminationIfSet extends Transformation {
            public aliasEliminationIfSet() {
                super("eliminate_alias_variables");
            }
            
            public void perform() {
                genAlias();
                eliminateAliasVariables();
                removeUnusedTemporaries();
                mergeEquivalentRecords();
                insertTempsInLHS();
                remoteRedundantInitialEquations();
                change();
            }
        }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1415
     */
    
        
        public aliasEliminationIfSet aliasElimination = new aliasEliminationIfSet();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1418
     */
    ArrayList<String> aliasErrors = new ArrayList<String>();
    /**
     * Generate alias information and remove alias equations.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1556
     */
    public void genAlias() {
		if (aliasManager == null) {
			aliasManager = new AliasManager();
		}
		for (FAbstractEquation equation : getFAbstractEquations()) {
			// Iterate over all equations
			// If the equation is an alias equation, then register
			// the alias variables in the alias manager.
			// Check all alias equations, also those that that have been
			// checked before.
			equation.aliasClassified = false; 
			if (equation.isAliasEquation()) 
				aliasManager.addAliasVariables(equation.aliasVariables());
		}
        if (myOptions().getBooleanOption("eliminate_alias_parameters")) {
            for (FAbstractEquation equation : getFParameterEquations()) {
                equation.aliasClassified = false; 
                if (equation.isAliasEquation()) 
                    aliasManager.addAliasVariables(equation.aliasVariables());
            }
        }
        if (myOptions().getBooleanOption("eliminate_alias_constants")) {
            Map<String, FVariable> firstOccurencesReal = new HashMap<String, FVariable>();
            Map<String, FVariable> firstOccurencesNonReal = new HashMap<String, FVariable>();
            for (FVariable fv : getFVariables()) {
                fv.classifyAliasConstant(aliasManager, firstOccurencesReal, firstOccurencesNonReal);
            }
        }
		aliasManager.reportAliasErrors(this);
		//flush();
		root().flushAllRecursive(); // TODO: is this really needed? the tree isn't changed
	}
    /**
     * Flag indicating if alias variables have been eliminated from the
     * model.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1608
     */
    public boolean aliasVariablesEliminated = false;
    /**
     * Eliminate alias variables from the flat model.
     * 
     * The non-alias variables are kept in the list FClass.FVariableList but the
     * alias variables are moved to FClass.AliasVariablesList.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1616
     */
    public void eliminateAliasVariables() {
		ArrayList<FVariable> nonAliasVars = new ArrayList<FVariable>();
		ArrayList<FVariable> aliasVars    = new ArrayList<FVariable>();
		ArrayList<FAbstractEquation> eqns = new ArrayList<FAbstractEquation>();
        ArrayList<FAbstractEquation> pEqns = new ArrayList<FAbstractEquation>();
		
		//log.debug("FClass.eliminateAliasVariables(): l1 " + nonAliasVars + " l2 " + aliasVars);
		
		// Go through all variables and insert in correct list
		for (FVariable fv : getAliasVariables()) {
				aliasVars.add(fv);
		}
		for (FVariable fv : getFVariables()) {
            fv.aliasSort(nonAliasVars, aliasVars);
		}
		
		// Remove alias equations.
		for (FAbstractEquation equation : getFAbstractEquations()) 
			if (!equation.isAliasEquation()) 
				eqns.add(equation);
        if (myOptions().getBooleanOption("eliminate_alias_parameters")) {
            for (FAbstractEquation equation : getFParameterEquations()) { 
                if (!equation.isAliasEquation()) {
                    pEqns.add(equation);
                }
            }
        }
        
        // Collect derivative binding equations, however only if we are going
        // to perform index reduction!
        if (myOptions().getBooleanOption("propagate_derivatives")) {
            for (FAbstractEquation eqn : eqns) {
                eqn.propagateDerivativeBindings();
            }
        }

		setFVariableList(new List(nonAliasVars));
		setAliasVariableList(new List(aliasVars));
		setFAbstractEquationList(new List(eqns));
        if (myOptions().getBooleanOption("eliminate_alias_parameters")) {
            setFParameterEquationList(new List(pEqns));
        }
		
		aliasVariablesEliminated = true;
		enableAliasRewrite();
		
		flush();
	}
    /**
     * Remove all unused temporary variables, and inline temporaries only used once.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1872
     */
    public void removeUnusedTemporaries() {
        ArrayList<FVariable> temps = tempVariables();
        Collection<FVariable> tempsToRemove = new ArrayList<FVariable>();
        int oldSize = Integer.MAX_VALUE;
        while (temps.size() < oldSize) {
            ArrayList<FVariable> temps2 = new ArrayList<FVariable>(temps.size());
            for (FVariable fv : temps) {
                if (!fv.inlineUses()) {
                    temps2.add(fv);
                } else {
                    tempsToRemove.add(fv);
                }
            }
            oldSize = temps.size();
            temps = temps2;
        }
        
        ArrayList<FVariable> vars = new ArrayList<FVariable>();
        for (FVariable fv : getFVariables())
            if (!fv.isTemporary())
                vars.add(fv);
        for (FVariable fv : temps)
            vars.add(fv);
        
        removeMarkedEqns();
        setFVariableList(new List(vars));
        
        Set<FVariable> aliasVarsToRemove = new HashSet<FVariable>();
        
        for (FVariable fv : tempsToRemove) {
            aliasVarsToRemove.addAll(getAliasManager().removeTemporaryVariableSet(fv));
        }
        
        ArrayList<FVariable> newAliasVars = new ArrayList<FVariable>();
        for (FVariable fv : getAliasVariables()) {
            if (!aliasVarsToRemove.contains(fv)) {
                newAliasVars.add(fv);
            }
        }
        setAliasVariableList(new List(newAliasVars));
    }
    /**
     * Remove all equations with <code>markedForRemoval == true</code>. 
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2047
     */
    public void removeMarkedEqns() {
		setFInitialEquationList(removeMarkedEqns(getFInitialEquations()));
		setFParameterEquationList(removeMarkedEqns(getFParameterEquations()));
		setFAbstractEquationList(removeMarkedEqns(getFAbstractEquations()));
	}
    /**
     * Remove records that are equivalent, and update uses. 
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2089
     */
    public void mergeEquivalentRecords() {
		computeEquivalentRecords();
		activateEquivalentRecordUseRewrite();
		List<FRecordDecl> list = new List<FRecordDecl>();
		for (FRecordDecl rec : getFRecordDecls())
			if (rec.equivalentRecordToKeep)
				list.add(rec);
		setFRecordDeclList(list);
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2099
     */
    public void computeEquivalentRecords() {
		ArrayList<FType> distinctTypes = new ArrayList<FType>();
		ArrayList<FRecordDecl> keptDecl = new ArrayList<FRecordDecl>();
		for (FRecordDecl rec : getFRecordDecls()) {
			boolean found = false;
			FType type = rec.type();
			for (int i = 0; !found && i < distinctTypes.size(); i++) {
				if (type.typeCompatible(distinctTypes.get(i))) {
					found = true;
					rec.equivalentRecordGroup = i;
				}
			}
			if (!found) {
				rec.equivalentRecordToKeep = true;
				rec.equivalentRecordGroup = distinctTypes.size();
				distinctTypes.add(type);
				keptDecl.add(rec);
			}
		}
		equivalentRecordMap = new HashMap<String,FRecordDecl>();
		for (FRecordDecl rec : getFRecordDecls())
			equivalentRecordMap.put(rec.name(), keptDecl.get(rec.equivalentRecordGroup));
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2123
     */
    protected Map<String,FRecordDecl> equivalentRecordMap;
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2182
     */
    public FQName createEquivalentRecordFQName(FQName old) {
		FRecordDecl rec = equivalentRecordMap.get(old.name());
		return (rec != null) ? rec.getFQName().fullCopy() : old;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2187
     */
    public FType createEquivalentRecordType(FType old) {
        FRecordDecl rec = equivalentRecordMap.get(old.name());
        if (rec == null) {
            return old;
        }
        FType t = rec.type().fullCopy();
        t.transferSizes(old);
        return t;
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2213
     */
    public void insertTempsInLHS() {
        for (FAbstractEquation equation : getFParameterEquations()) {
            equation.insertTempsInLHS(this, true);
        }
        for (FAbstractEquation equation : getFAbstractEquations()) {
            equation.insertTempsInLHS(this, false);
        }
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2279
     */
    public void remoteRedundantInitialEquations() {
        ArrayList<FAbstractEquation> eqns = new ArrayList<FAbstractEquation>();
        // Remove alias equations.
        for (FAbstractEquation equation : getFInitialEquations()) {
            if (!equation.isSameVariableEquality()) {
                eqns.add(equation);
            }
        }
        setFInitialEquationList(new List(eqns));
    }
    /**
     * Rewrites when clauses to if clauses.
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2302
     */
    
        /**
         * Rewrites when clauses to if clauses.
         */
        public class extractSampleExpressions extends Transformation {
            public void perform() {
                extractSampleExpressions();
                flushAllRecursiveClearFinal();
            }
        }
    /**
     * @aspect ExtractSampleExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2310
     */
    public void extractSampleExpressions() {
        Collection<FEquation> newEqns = new ArrayList<FEquation>();
        Collection<FVariable> newVars = new ArrayList<FVariable>();
        extractSampleExpressions(newEqns, newVars);
        for (FEquation eqn : newEqns)
            addFAbstractEquation(eqn);
        for (FVariable var : newVars)
            addFVariable(var);
    }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2367
     */
    
        public class enableIfEquationElimination extends Transformation {
            // Depends on MakeReinitedVarsStates when invoked after scalarize
            
            public void perform() {
                enableIfEquationElimination();
                
                // Workaround for JastAdd bug
                setFInitialEquationList(cleanEmptyElse(getFInitialEquations()));
                setFAbstractEquationList(cleanEmptyElse(getFAbstractEquations()));
                
                // Remove orphaned temporaries
                flushAllRecursive();
                removeUnusedTemporaries();
            }
        }
    /**
     * @aspect IfEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2470
     */
    
        public class enableIfEquationRewrite extends Transformation {
            public void perform() {
                enableIfEquationRewrite();
                checkIfEquationCompliance();
            }
        }
    /**
     * Sort dependent parameter equations.
     * 
     * This is a simple implementation of Kahn's topological sorting algorithm.
     * This implementation will most likely be replaced by other graph 
     * algorithms later on.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2781
     */
    
        /**
         * Sort dependent parameter equations.
         * 
         * This is a simple implementation of Kahn's topological sorting algorithm.
         * This implementation will most likely be replaced by other graph 
         * algorithms later on.
         */
        public class sortDependentParameters extends Transformation {
            public void perform() {
                sortDependentParameters();
            }
        }
    /**
     * Sort dependent parameter equations.
     * 
     * This is a simple implementation of Kahn's topological sorting algorithm.
     * This implementation will most likely be replaced by other graph 
     * algorithms later on.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2795
     */
    public void sortDependentParameters() {
		// Check that all independent parameters can be evaluated.
		for (FVariable var : getFVariables()) {
			FTypePrefixVariability variability = var.variability();
			if (variability.parameterVariability()) {
				if (var.hasBindingExp() && !var.getBindingExp().isLiteralExp() && !var.isExternalObject()) {
					try {
						var.setBindingExp(var.getBindingExp().ceval().buildLiteral());
					} catch (ConstantEvaluationException e) {
                        FAbstractEquation fae = new FEquation(var.createUseExp(), var.getBindingExp());
                        getFParameterEquations().add(fae);
                        var.removeBindingExp();
                        parameterEquationsMap().put(var,fae);
					}
				}
			}
		}
		// Get the list of parameter equations and set up preliminary data.
		ArrayList<FAbstractEquation> eqns = getFParameterEquations().toArrayList();
		
		// Check if there is any dependent parameters that can be made independent.
		Iterator<FAbstractEquation> it = eqns.iterator();
		while (it.hasNext()) {
			FAbstractEquation eqn = it.next();
			if (eqn != null && eqn.isIndependentParameterEquation()) {
				try {
					eqn.revertToBindingExp();
					it.remove();
				} catch (ConstantEvaluationException e) {
					// Doh, we were unable to evaluate the expression
				}
			}
		}
		int n_eqns = eqns.size();
		List<FVariable> vars = getFVariables();
		int n_vars = getNumFVariable();
		for (int i = 0; i < n_eqns; i++)
			eqns.get(i).sortingIndex = i;
		for (FVariable fv : vars)
			fv.parameterEquation();  // Calculate these before changing anything
		
		
		// Set up data structures for the adjacency graph.
		ArrayList<HashSet<FAbstractEquation>> toNodes = new ArrayList<HashSet<FAbstractEquation>>(n_eqns);
		ArrayList<HashSet<FAbstractEquation>> fromNodes = new ArrayList<HashSet<FAbstractEquation>>(n_eqns);
		for (int i = 0; i < n_eqns; i++) {
			toNodes.add(new HashSet<FAbstractEquation>());
			fromNodes.add(new HashSet<FAbstractEquation>());
		}
		
		// For each equation
		for (FAbstractEquation eqn : eqns) {
			// Retrieve all variables referenced in right hand side
            Set<FVariable> deps = eqn.variableDependenciesRHS();
			// Build the actual adjacency graph.
			for (FVariable fv : deps) {
				FAbstractEquation depEqn = fv.parameterEquation();
				if (depEqn != null && depEqn.sortingIndex >= 0) {
					toNodes.get(depEqn.sortingIndex).add(eqn);		
					fromNodes.get(eqn.sortingIndex).add(depEqn);
				}
			}
		}	
				
		// Sort using algorithm described at
		// http://en.wikipedia.org/wiki/Topological_sorting
		List<FAbstractEquation> L = new List<FAbstractEquation>();
		Queue<FAbstractEquation> S = new ArrayDeque<FAbstractEquation>();
		
		// Add all nodes without incoming edges to S
		for (int i = 0; i < n_eqns; i++) 
			if (fromNodes.get(i).isEmpty()) 
				S.add(eqns.get(i));
		
		// Repeat while S is not empty
		int si = 0;
		int n_indep = 0;
		while (S.size() > 0) {
			// Remove a node n from S
			FAbstractEquation n = S.remove();
			L.add(n);
			// For each node m with an edge e from n to m (in original order)
			Set<FAbstractEquation> nodes = FAbstractEquation.sortingSet();
			nodes.addAll(toNodes.get(n.sortingIndex));
			for (FAbstractEquation m : nodes) {
				// Remove edge e from fromNodes
				fromNodes.get(m.sortingIndex).remove(n);
				// If m has no incoming edges add m to S
				if (fromNodes.get(m.sortingIndex).isEmpty()) 
					S.add(m);
			}
			// Remove e from toNodes
			toNodes.get(n.sortingIndex).clear();
			// Done with n - update sortingIndex
			n.sortingIndex = si++;
		}
		
		// Not possible to find an ordering without cycles?
		if (L.getNumChild() != eqns.size() - n_indep) {
			error("The model "+ name() +" contains cyclic parameter dependencies.");
		} else {
			// Replace old parameter equation list
			setFParameterEquationList(L);
			
			// Rearrange parameters in same order as parameter equations
			ArrayList<FVariable> depParams = new ArrayList<FVariable>(n_eqns);
            for (FAbstractEquation fae : L) {
                depParams.addAll(fae.referencedFVariablesInLHS());
            }
			ArrayList<Integer> depParamIndices = new ArrayList<Integer>(n_eqns);
			for (int i = 0; i < n_vars; i++) {
				FVariable fv = vars.getChild(i);
				if (fv.hasParameterEquation()) {
                    depParamIndices.add(new Integer(i));
                }
            }
            
			for (int i = 0; i < depParams.size(); i++)
				vars.setChild(depParams.get(i), depParamIndices.get(i).intValue());
	
			// Flush AST since the structure has changed.
				root().flushAllRecursive();
			
			// Remove any binding expressions of variables with parameter equations
			for (FAbstractEquation eqn : L)
				eqn.removeBindingExpOfAssignedVars();
		}
	}
    /**
     * This field is populated by computeMatchingsAndBLT, there are some models
     * where the initial system is defined so that pre propgation equations
     * such as x = pre(x) can't be inserted. These equations are then ignored
     * which must be accounted for during balance computations.
     * @aspect TransformCanonicalErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3052
     */
    private int numIgnoredPrePropagationEquations = 0;
    /**
     * @aspect TransformCanonicalErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3071
     */
    public void checkFClassDimensions() {
               // Check dimensions of DAE
		int n_eq_F = numDAEEquations();
		int n_vars_F = numDAEVariables();
		if (n_eq_F != n_vars_F) 
			error("The DAE system has " + n_eq_F + " equations and " + n_vars_F + " free variables.");
		
		// Check dimensions of DAE initialization system
		int n_eq_F0 = numDAEInitEquations();
		int n_vars_F0 = numDAEInitVariables();
		if (n_eq_F0 > n_vars_F0) 
			error("The DAE initialization system has " + n_eq_F0 + " equations and " + n_vars_F0 + " free variables.");
		
	}
    /**
     * @aspect TransformCanonicalErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3086
     */
    public void collectErrors(ErrorCheckType checkType) {
		checkFClassDimensions();
		checkStructure();
		allChecks(checkType);
	}
    /**
     * Flush model AST and enable rewrites of FIdUseExps and FDerExps
     * after alias elimination.
     * @aspect FlushFClass
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3136
     */
    public void flush() {
		flushAllRecursiveClearFinal();
		//is$Final = true;
	}
    /**
     * @aspect StateInitialEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3162
     */
    
        public class addStateInitialEquationsIfSet extends Transformation {
            // Constraints: after alias elimination (see #), before BLT
            
            public addStateInitialEquationsIfSet() {
                super("state_initial_equations");
            }
            
            public void perform() {
                addStateInitialEquations();
            }
        }
    /**
     * @aspect StateInitialEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3175
     */
    public void addStateInitialEquations() {
        setFInitialEquationList(new List());
        
        for (FRealVariable fv : differentiatedRealVariables()) {
            FQName nameToAdd = fv.getFQName().copyAndAddPrefix("_start_");
            FRealVariable fvToAdd = new FRealVariable(new FPublicVisibilityType(), fFixedParameter(), nameToAdd);
            if (fv.startAttributeSet())
                fvToAdd.setBindingExp(fv.startAttributeExp().ceval().buildLiteral());
            else
                fvToAdd.setBindingExp(fv.type().zeroLiteral());
            addFVariable(fvToAdd);
            FEquation eqnToAdd = new FEquation(fv.createUseExp(), fvToAdd.createUseExp());
            addFInitialEquation(eqnToAdd);
            flushAllRecursive();
        }
    }
    /**
     * Add parameters for all defined runtime options.
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3201
     */
    
        /**
         * Add parameters for all defined runtime options.
         */
        public class addRuntimeOptionParameters extends Transformation {
            public boolean active() {
                OptionRegistry opt = myOptions();
                return opt.getBooleanOption("generate_runtime_option_parameters") && opt.getBooleanOption("generate_ode");
            }
            
            public void perform() {
                OptionRegistry opt = myOptions();
                for (String key : opt.getRuntimeOptionKeys()) {
                    FVariable v = null;
                    String name = "_" + key;
                    if (opt.isBooleanOption(key))
                        v = createBooleanRuntimeOptionParameter(name, opt.getBooleanOption(key));
                    else if (opt.isStringOption(key))
                        v = createStringRuntimeOptionParameter(name, opt.getStringOption(key));
                    else if (opt.isIntegerOption(key))
                        v = createIntegerRuntimeOptionParameter(name, opt.getIntegerOption(key));
                    else if (opt.isRealOption(key))
                        v = createRealRuntimeOptionParameter(name, opt.getRealOption(key));
                    addFVariable(v);
                }
            }
        }
    /**
     * Create a parameter for a boolean runtime option. 
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3229
     */
    public FVariable createBooleanRuntimeOptionParameter(String name, boolean val) {
		return commonCreateRuntimeOptionParameter(new FBooleanVariable(), name, FBooleanLitExp.create(val));
	}
    /**
     * Create a parameter for a string runtime option. 
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3236
     */
    public FVariable createStringRuntimeOptionParameter(String name, String val) {
		return commonCreateRuntimeOptionParameter(new FStringVariable(), name, new FStringLitExp(val));
	}
    /**
     * Create a parameter for a integer runtime option. 
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3243
     */
    public FVariable createIntegerRuntimeOptionParameter(String name, int val) {
		return commonCreateRuntimeOptionParameter(new FIntegerVariable(), name, new FIntegerLitExp(val));
	}
    /**
     * Create a parameter for a real runtime option. 
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3250
     */
    public FVariable createRealRuntimeOptionParameter(String name, double val) {
		return commonCreateRuntimeOptionParameter(new FRealVariable(), name, new FRealLitExp(val));
	}
    /**
     * Set the children of a runtime option parameter.
     * 
     * @param v     the variable to set fields on
     * @param name  the name of the variable
     * @param bExp  the burrent value of the option
     * @return  <code>v</code>, for convenience
     * @aspect RuntimeOptions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3262
     */
    public FVariable commonCreateRuntimeOptionParameter(FVariable v, String name, FExp bExp) {
		v.setFVisibilityType(new FRuntimeOptionVisibilityType());
		v.setFTypePrefixVariability(fFixedParameter());
		v.setBindingExp(bExp);
		v.setFQName(new FQNameString(name));
		return v;
	}
    /**
     * Extracts event generating expressions into if expressions
     * and replaces the exp with a temp var.
     * @aspect EventGeneratingExps
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3295
     */
    
        /**
         * Extracts event generating expressions into if expressions
         * and replaces the exp with a temp var.
         */
        public class extractEventGeneratingExps extends Transformation {
            public void perform() {
                HashSet<FAlgorithm> algs = new HashSet<FAlgorithm>();
                ArrayList<FEventGenExp> eventExps = eventGenExps();
                Collections.reverse(eventExps);
                
                // Equations
                for (FEventGenExp exp: eventExps) {
                	FVariable fv = exp.type().createFVariable(new FPublicVisibilityType(), 
							new FQNameFull(exp.tempVarName()), exp.variability());
					addFVariable(fv);
					addFInitialEquation(new FEquation(exp.tempPreExp(), fv.createStartAttributeExp()));
                	if (exp.inAlgorithm()) {
                		algs.add((FAlgorithm) exp.myFEquation());
                		continue;
                	}
                    exp.replaceMe(exp.tempUseExp());
                    addFEquation(new FEquation(exp.tempUseExp(), exp.asIfExp(exp.tempPreExp())));
                }
                
                // Algorithms
                AlgorithmTransformer.visit(algs, new EventAlgoTransformer());
                
                root().flushAllRecursive();
            }
        }
    /**
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3409
     */
    
        public class enableSemiLinearRewrite extends Transformation {
            private boolean changed = false;
            
            public void perform() {
                setFAbstractEquationList(transform(getFAbstractEquations()));
                setFInitialEquationList(transform(getFInitialEquations()));
                setFParameterEquationList(transform(getFParameterEquations()));
                
                // Change all remaining semiLinear exps to if exps.
                Set<FSemiLinearExp> fsls = collectSemiLinearExps();
                changed = changed || fsls.size() > 0;
                for (FSemiLinearExp exp: fsls)
                    exp.replaceMe(exp.asIfExp());
                
                if (changed) {
                    change();
                }
            }
            
            /**
             * Applies zero flow transformations to a list of equations.
             */
            private List<FAbstractEquation> transform(List<FAbstractEquation> equations) {
                ListMap<String, FEquation> rule1 = new LinkedHashListMap<String, FEquation>();
                ArrayList<FEquation> rule2 = new ArrayList<FEquation>();
                List<FAbstractEquation> newEquations = new List<FAbstractEquation>();
                
                // Find zero flow equations
                for (FAbstractEquation equation : equations) {
                    if (equation.isConstantZeroFlow()) {
                        rule2.add((FEquation) equation);
                    } else if (equation.isZeroFlowForm()) {
                        FEquation e = (FEquation) equation;
                        rule1.add(e.zeroFlowGetKey(), e);
                    }
                }
                
                // Chained zero flow transformations (Rule 1)
                for (java.util.List<FEquation> l : rule1.values()) {
                    if (l.size() > 1) {
                        transformChain(newEquations, buildChain(l));
                        changed = true;
                    }
                }
                
                changed = changed || rule2.size() > 0;
                
                // Constant zero flow transformations (Rule 2)
                for (FEquation equation : rule2) {
                    equation.setLeft(equation.zeroFlowGetPos());
                    equation.setRight(equation.zeroFlowGetNeg());
                }
                
                List<FAbstractEquation> res = removeMarkedEqns(equations);
                res.addAll(newEquations);
                return res;
            }
            
            /**
             * Order the equations in <code>l</code> by matching the slopes in
             * the semiLinear expressions. If any equation cannot be ordered an
             * error is given.
             */
            private ArrayList<FEquation> buildChain(java.util.List<FEquation> l) {
                ArrayList<FEquation> chain = new ArrayList<FEquation>();
                FEquation eq1 = l.remove(0);
                chain.add(eq1);
                
                boolean change = true;
                while (change) {
                    change = false;
                    Iterator<FEquation> it = l.iterator();
                    while (it.hasNext()) {
                        FEquation eq2 = it.next();
                        if (addToChain(chain, eq2)) {
                            change = true;
                            it.remove();
                        }
                    }
                }
                
                if (l.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not construct zero flow chain for a set of semilinear equations."
                            + " This leads to an undetermined system. Involved equations:\n");
                    
                    for (FEquation e : chain) {
                        sb.append(e.prettyPrint(""));
                        sb.append("\n");
                    }
                    for (FEquation e : l) {
                        sb.append(e.prettyPrint(""));
                        sb.append("\n");
                    }
                    
                    l.get(0).error(sb.toString());
                }
                return chain;
            }
            
            /**
             * Add an equation to the chain if the slopes match
             */
            private boolean addToChain(ArrayList<FEquation> chain, FEquation equation) {
                FExp pos = equation.zeroFlowGetPos();
                FExp neg = equation.zeroFlowGetNeg();
                FExp chainNeg = chain.get(chain.size()-1).zeroFlowGetNeg();
                FExp chainPos = chain.get(0).zeroFlowGetPos();
                
                if (chainNeg.prettyPrint("").equals(pos.prettyPrint(""))) {
                    chain.add(equation);
                    return true;
                } else if (chainPos.prettyPrint("").equals(neg.prettyPrint(""))) {
                    chain.add(0, equation);
                    return true;
                }
                return false;
            }
            
            /**
             * Build new equations to represent the chain of semiLinears
             */
            private void transformChain(List<FAbstractEquation> newEquations, ArrayList<FEquation> chain) {
                for (FEquation e : chain)
                    e.markedForRemoval = true;
                
                FEquation first = chain.get(0);
                FEquation last  = chain.remove(chain.size()-1);
                FExp chainPos   = first.zeroFlowGetPos();
                FExp chainNeg   = last.zeroFlowGetNeg();
                FExp chainX     = chain.get(0).zeroFlowGetX();
                
                // S(1) = if X >= 0 SA else SB
                newEquations.add(new FEquation(
                        first.zeroFlowGetNeg().fullCopy(), 
                        new FIfExp(new FGeqExp(chainX.fullCopy(), new FIntegerLitExp(0)),
                                chainPos.fullCopy(),
                                chainNeg.fullCopy()
                                )));
                
                // S(n+1) = S(n)
                FEquation pre_e = null;
                for (FEquation e : chain) {
                    if (pre_e != null)
                        newEquations.add(new FEquation(e.zeroFlowGetNeg().fullCopy(), pre_e.zeroFlowGetNeg().fullCopy()));
                    pre_e = e;
                }
                
                // Y = semiLinear(X,SA,SB)
                FExp slExp = new FSemiLinearExp(chainX.fullCopy(), chainPos.fullCopy(), chainNeg.fullCopy());
                newEquations.add(new FEquation(
                        first.zeroFlowGetLeft().fullCopy(),
                        slExp.negated(first.zeroFlowNegated())
                        ));
            }
        }
    /**
     * Transformation for marking up variables that have reinit() applied on them as states
     * (by setting stateSelect=always).
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3662
     */
    
        /**
         * Transformation for marking up variables that have reinit() applied on them as states
         * (by setting stateSelect=always).
         */
        public class MakeReinitedVarsStates extends Transformation {
            public void perform() {
                for (FAbstractEquation eqn : getFAbstractEquations())
                    eqn.makeReinitedVarsStates();
            }
        }
    /**
     * Reduce the number of event indicators by eliminating relative
     * operators that are equal. This is done by traversing the normal
     * equation system and the initial equation system and storing all
     * relative operations in a map that translate toString() to a list
     * of relative operators that are equal.
     * Operatorns are then eliminating by setting the originalFRelExp
     * field in the redundant operators.
     * The normal operator should be used if equal operators exists in
     * both the normal and initial blocks. This is achived by inserting all
     * normal equations into the map before the initial equations and then
     * selecting the first in the list as the original operator.
     * @aspect EliminateEqualSwitches
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3753
     */
    
        /**
         * Reduce the number of event indicators by eliminating relative
         * operators that are equal. This is done by traversing the normal
         * equation system and the initial equation system and storing all
         * relative operations in a map that translate toString() to a list
         * of relative operators that are equal.
         * Operatorns are then eliminating by setting the originalFRelExp
         * field in the redundant operators.
         * The normal operator should be used if equal operators exists in
         * both the normal and initial blocks. This is achived by inserting all
         * normal equations into the map before the initial equations and then
         * selecting the first in the list as the original operator.
         */
        public class eliminateEqualSwitches extends Transformation {
            public void perform() {
                Map<String, Collection<FRelExp>> candidates = new HashMap<String, Collection<FRelExp>>();
                for (FRelExp exp : relExpsWithEvent()) {
                    exp.collectEqualSwitches(candidates);
                    exp.setOriginalFExp(exp);
                } 
                for (FRelExp exp : eventExpInInitialEquations()) {
                    exp.collectEqualSwitches(candidates);
                    exp.setOriginalFExp(exp);
                }
                for (Entry<String, Collection<FRelExp>> entry : candidates.entrySet()) {
                    if (entry.getValue().size() < 2)
                        continue;
                    log.verbose("Eliminated %d equal switches: %s", entry.getValue().size() - 1, entry.getKey());
                    FRelExp original = null;
                    for (FRelExp exp : entry.getValue()) {
                        if (!exp.hasBrancher()) {
                            original = exp;
                            break;
                        }
                    }
                    if (original != null) {
                        for (FRelExp exp : entry.getValue()) {
                            exp.setOriginalFExp(original);
                        }
                    }
                }
                root().flushAllRecursive();
            }
        }
    /**
     * Copies all files included by loadResource() to Resource folder.
     * @aspect LoadResource
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3806
     */
    public void loadResources(File resourcePath) {
        ArrayList<String> list = resourcesToLoad();
        for (int i = 0; i < list.size(); i++) {
            File src  = new File(list.get(i));
            File dest = new File(resourcePath, String.format("%d_%s", i, src.getName()));
            if (!src.exists() || !src.isFile()) {
                error(String.format("loadResource(): Resource file '%s' does not exist", src.getAbsolutePath()));
                continue;
            }
            try {
                copyFile(src, dest);
            } catch (IOException e) {
                error("loadResource(): Could not copy resource: " + src.getAbsolutePath() + " to destination: '" + dest.getAbsolutePath() + "'");
            }
        }
        breakOnErrors();
    }
    /**
     * Remove unused function and record declarations from the flat model.
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3851
     */
    public void removeUnusedFunctionsAndRecords() {
        beginStep("removeUnusedFunctionsAndRecords()");
        for (FFunctionDecl decl : getFFunctionDecls())
            decl.resetUsedIndicator();
        for (FRecordDecl decl : getFRecordDecls())
            decl.resetUsedIndicator();
        getFVariables().markUsedFunctionsAndRecords();
        getFInitialEquations().markUsedFunctionsAndRecords();
        getFParameterEquations().markUsedFunctionsAndRecords();
        getFAbstractEquations().markUsedFunctionsAndRecords();
        getDynamicStateManager().markUsedFunctionsAndRecords();
        List<FFunctionDecl> funcs = new List<FFunctionDecl>();
        for (FFunctionDecl func : getFFunctionDecls())
            if (func.functionIsUsed())
                funcs.add(func);
        setFFunctionDeclList(funcs);
        List<FRecordDecl> records = new List<FRecordDecl>();
        for (FRecordDecl decl : getFRecordDecls())
            if (decl.isRecordUsed())
                records.add(decl);
        setFRecordDeclList(records);
        endStep("removeUnusedFunctionsAndRecords()");
    }
    /**
     * An FClass has an alias manager.
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:132
     */
    private AliasManager aliasManager = new AliasManager();
    /**
     * Get the alias manager.
     * 
     * @return the alias manager.
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:139
     */
    public AliasManager getAliasManager() {
		return aliasManager;
	}
    /**
     * @aspect BlockFunctionExtraction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/BlockFunctionExtraction.jrag:20
     */
    public boolean blockFunctionExtraction(BLT blt, BiPGraph g) {
        if (!myOptions().getBooleanOption("enable_block_function_extraction"))
            return false;
            
        ArrayList<FFunctionCall> functions = new ArrayList<FFunctionCall>();
        HashMap<String,FVariable> newVars = new HashMap<String, FVariable>();
        
        // Find functions to extract from current block
        for (AbstractEquationBlock block: blt)
            if (!block.isSimple())
                for (FAbstractEquation equation: block.allEquations())
                    equation.findBlockFunctionExtraction(block, functions);
                    
        // If no functions are found do not proceed
        if (functions.isEmpty())
            return false;
        
        // If functions are found replace them with new variables and add equations: new_var = func()
        ArrayList<FAbstractEquation> newEqs = new ArrayList<FAbstractEquation>();
        for (FFunctionCall fCall: functions) {
            FVariable funcRepVariable = null;
            if ((funcRepVariable = newVars.get(fCall.toString())) == null) { // If funcCall hasn't been processed before
                // Create new temp. variable and add it to the variable list and the BiPGraph
                String newTempName = fCall.calcTempVarName();
                Collection<Eq> eqs = g.getEquations(fCall.myFEquation());
                funcRepVariable = fCall.type().createTempFVariable(new FQNameFull(newTempName), fCall.variability().fullCopy());
                addFVariable(funcRepVariable);
                if (!fCall.variability().parameterOrLess()) {
                    Var var = g.addVariable(newTempName, funcRepVariable);
                    for (Eq eqn : eqs) {
                        eqn.addVariable(var);
                    }
                }
                newVars.put(fCall.toString(), funcRepVariable);
                // Create new equation "temp = funcCall()" and add it to the equation list and list for BiPGraph
                
                FEquation newEq = new FEquation(funcRepVariable.createUseExp(), fCall.fullCopy());
                if (!fCall.variability().parameterOrLess()) {
                    addFEquation(newEq);
                    newEqs.add(newEq);
                } else {
                    addFParameterEquation(newEq);
                }
            }
            // Replace the functionCall with a use of the corresponding temp variable
            fCall.replaceMe(funcRepVariable.createUseExp());
        }
        // Add the equations to the BiPGraph and make new matchings
        root().flushAllRecursive();
        g.addEquations(newEqs, VAR_TYPES_ALL);
        g.maximumMatching(true);
            
        return true;
    }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:21
     */
    
        public class commonSubexpressionEliminationIfSet extends Transformation {
            
            Map<String, CSESet> m;
            
            public commonSubexpressionEliminationIfSet() {
                super("common_subexp_elim");
            }
            
            public void perform() {
                m = new LinkedHashMap<String, CSESet>();
                
                getFAbstractEquations().collectFunctionCalls(this);
                
                boolean changed = false;
                for (CSESet s : m.values()) {
                    boolean res = s.eliminate();
                    changed = changed || res;
                }
                
                m = null;
                
                if (changed) {
                    List<FAbstractEquation> l = new List<FAbstractEquation>();
                    for (FAbstractEquation fae : getFAbstractEquations()) {
                        if (!fae.markedForRemoval) {
                            l.add(fae);
                        }
                    }
                    
                    setFAbstractEquationList(l);
                    
                    change();
                }
            }
            
            public void add(FFunctionCall fc) {
                String s = fc.prettyPrint("");
                CSESet l = m.get(s);
                if (l == null) {
                    l = new CSESet();
                    m.put(s,l);
                }
                l.add(fc);
            }
            
            public class CSESet extends ArrayList<FFunctionCall> {
                private FExp repl = null;
                private List<FFunctionCallLeft> res = null;
                
                public boolean eliminate() {
                    if (size() > 1) {
                        FFunctionCall fc = get(0);
                        FFunctionCall fcCopy = (FFunctionCall) fc.copySymbolic();
                        res = new List<FFunctionCallLeft>();
                        res.setParent(fc);
                        
                        merge();
                        
                        FAbstractEquation fae;
                        if (res.getNumChild() != 1 || fc.isComposite()) {
                            add(new FFunctionCallEquation(res, fcCopy));
                        } else {
                            add(new FEquation(res.getChild(0).getFExp(), fcCopy));
                        }
                        return true;
                    }
                    return false;
                }
                
                public void merge() {
                    for (FFunctionCall ffc : this) {
                        if (ffc.isFunctionCallClause()) {
                            FFunctionCallEquation fce = (FFunctionCallEquation) ffc.myFEquation();
                            for (int i = 0; i < fce.getNumLeft(); i++) {
                                if (fce.getLeft(i).hasFExp()) {
                                    merge(i, fce.getLeft(i).getFExp());
                                }
                            }
                            ffc.myFEquation().markForRemoval();
                        } else {
                            ffc.replaceMe(getRepl().fullCopy());
                        }
                    }
                }
                
                public void merge(int i, FExp other) {
                    if (i >= res.getNumChild()) {
                        res.add(new FFunctionCallLeft());
                    }
                    res.getChild(i).merge(this, other);
                }
                
                public void add(FAbstractEquation fae) {
                    fae.parent = getFAbstractEquationListNoTransform();
                    if (fae.variability().parameterOrLess()) {
                        addFParameterEquationNoTransform(fae);
                    } else {
                        addFAbstractEquationNoTransform(fae);
                    }
                }
                
                public FExp getRepl() {
                    if (repl == null) {
                        FFunctionCall fc = get(0);
                        final String name = fc.tempVarName();
                        final FTypePrefixVariability v = fc.variability().combine(ASTNode.fFixedParameter());
                        ExpFromTypeBuilder b = new ExpFromTypeBuilder() {
                            public FExp build(String suffix, FType type) {
                                String n = name + suffix;
                                FVariable var = type.createTempFVariable(new FQNameString(n), v.combineDown(type.funcOutputVariability()));
                                addFVariable(var);
                                variablesMap().addVariable(var);
                                return new FIdUseExp(name + suffix);
                            }
                        };
                        repl = fc.type().buildFExp(b, "");
                        merge(0, repl);
                    }
                    return repl;
                }
                
            }
        }
    /**
     * If function inlining is enabled, inline all function calls that we can.
     * 
     * Then remove functions that aren't needed anymore. Functions with <code>LateInline=true</code> 
     * or <code>InlineAfterIndexReduction=true</code> are excepted.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:28
     */
    
        /**
         * If function inlining is enabled, inline all function calls that we can.
         * 
         * Then remove functions that aren't needed anymore. Functions with <code>LateInline=true</code> 
         * or <code>InlineAfterIndexReduction=true</code> are excepted.
         */
        public class FunctionInliningIfSet extends Transformation {
            protected String opt;
            protected boolean late;

            /**
             * Creates a transformation for function inlining.
             */
            public FunctionInliningIfSet() {
                this.late = false;
            }

            public boolean active() {
                opt = myOptions().getStringOption("inline_functions");
                return opt != OptionRegistry.Inlining.NONE;
            }

            public void perform() {
                new FunctionInliner(FClass.this, opt, late).inline();
                root().flushAllRecursive();
                removeUnusedTemporaries();
                change();
            }
        }
    /**
     * If function inlining is enabled, inline all function calls that we can.
     * 
     * Then remove functions that aren't needed anymore. Functions with <code>LateInline=true</code> 
     * or <code>InlineAfterIndexReduction=true</code> are included.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:59
     */
    

        
        /**
         * If function inlining is enabled, inline all function calls that we can.
         * 
         * Then remove functions that aren't needed anymore. Functions with <code>LateInline=true</code> 
         * or <code>InlineAfterIndexReduction=true</code> are included.
         */
        public class LateFunctionInliningIfSet extends FunctionInliningIfSet {
            /**
             * Creates a transformation for late function inlining.
             */
            public LateFunctionInliningIfSet() {
                this.late = true;
            }
        }
    /**
     * Runs variability propagation if option is set.
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:164
     */
    
        /**
         * Runs variability propagation if option is set.
         */
        public class variabilityPropagationIfSet extends Transformation {
            public variabilityPropagationIfSet() {
                super("variability_propagation");
            }
            
            public void perform() {
                variabilityPropagation();
                enableConstantFolding();
                forceRewrites();
                root().flushAllRecursiveClearFinal(); // Enable expression rewrites
            }
        }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:177
     */
    
        
        public class VariabilityPropagator {
            private LinkedHashSet<FAbstractEquation> worklist;
            private List<FAbstractEquation> initialEquations;
            private List<FAbstractEquation> parameterEquations;
            private boolean splitAliasParameters = !(myOptions().getBooleanOption("eliminate_alias_variables") 
                    && myOptions().getBooleanOption("eliminate_alias_parameters"));
            private boolean splitAliasConstants  = !(myOptions().getBooleanOption("eliminate_alias_variables") 
                    && myOptions().getBooleanOption("eliminate_alias_constants"));
            
            public VariabilityPropagator(LinkedHashSet<FAbstractEquation> worklist, 
                    List<FAbstractEquation> initialEquations, List<FAbstractEquation> parameterEquations) {
                this.worklist = worklist;
                this.initialEquations = initialEquations;
                this.parameterEquations = parameterEquations;
            }
            
            public void addEquation(FTypePrefixVariability v, FAbstractEquation fae) {
                v.selectEquations(initialEquations, parameterEquations, null).add(fae);
            }
            
            public void addWorkEq(FAbstractEquation fae) {
                worklist.add(fae);
            }
            
            public boolean splitAliasParameters() {
                return splitAliasParameters;
            }
            
            public boolean splitAliasConstants() {
                return splitAliasConstants;
            }
            
        }
    /**
     * Runs variability propagation.
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:227
     */
    public void variabilityPropagation() {

		List<FAbstractEquation> parameterEquations = getFParameterEquations();
		LinkedHashSet<FAbstractEquation> worklist = new LinkedHashSet<FAbstractEquation>();
		List<FAbstractEquation> equations = getFAbstractEquations();
        VariabilityPropagator propagator = new VariabilityPropagator(worklist, getFInitialEquations(), parameterEquations);

		// Build worklist
		for (FAbstractEquation equation: equations) {
            equation.addEquationsToWorkList(worklist);
		}

		// Work
		while (!worklist.isEmpty()) {
			FAbstractEquation equation = worklist.iterator().next();
            if (equation.canPropagate()) {
                equation.variabilityPropagation(propagator);
            }
			worklist.remove(equation);
		}

		// Clean variables
        ArrayList<FVariable> newVariables = new ArrayList<FVariable>();
        ArrayList<FVariable> newAliases   = new ArrayList<FVariable>();
        AliasManager am = getAliasManager();
        for (FVariable fVariable: getFVariables()) {
            if (!fVariable.taggedByVProp) {
                newVariables.add(fVariable);
            }
        }
        for (FVariable fVariable: getAliasVariables()) {
            if (am.getAliasSet(fVariable) != null) {
                newAliases.add(fVariable);
            } else if (!fVariable.isTemporary()) {
                newVariables.add(fVariable);
            }
        }
        setFVariableList(new List<FVariable>(newVariables));
        setAliasVariableList(new List<FVariable>(newAliases));

		// Clean equations
		ArrayList<FAbstractEquation> newEquations = new ArrayList<FAbstractEquation>();
		for (FAbstractEquation equation: equations) {
			equation.cleanEquations(newEquations);
		}
		setFAbstractEquationList(new List<FAbstractEquation>(newEquations));
		
		// Clean initial equations
		newEquations = new ArrayList<FAbstractEquation>();
		for (FAbstractEquation equation: initialEquations()) {
			if (!equation.taggedByVProp) {
				newEquations.add(equation);
			}
		}
		setFInitialEquationList(new List<FAbstractEquation>(newEquations));
	}
    /**
     * Transforms when clauses to if clauses.
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:23
     */
    
        /**
         * Transforms when clauses to if clauses.
         */
        public class convertWhenToIf extends Transformation {
            public void perform() {
                Collection<FAbstractEquation> newEqns = new ArrayList<FAbstractEquation>();
                for (FAbstractEquation eqn : getFAbstractEquations()) {
                    newEqns.add(eqn.convertWhenEqnToIfEqn(newEqns, FClass.this));
                }
                setFAbstractEquationList(new List<FAbstractEquation>(newEqns));
                flushAllRecursive();
            }
        }
    /**
     * Flag indicating if a flat class is scalarized.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:234
     */
    boolean scalarized = false;
    /**
     * Scalarize all variables and equations in the flat model.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:243
     */
    
        /**
         * Scalarize all variables and equations in the flat model.
         */
        public class scalarize extends Transformation {
            public void perform() {
                List<FVariable> vars = new List<FVariable>();
                scalarizeVars(vars);
                replaceScalarizedVars(vars);
                scalarizeFuncs();
                scalarizeTypes();
                scalarizeAttributes();
                getConnectionSetManager().scalarize();
                scalarized = true;
                scalarizationCleanup();
                scalarizationErrorCheck();
            }
        }
    /**
     * Scalarize variable declarations and equations.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:262
     */
    protected void scalarizeVars(List<FVariable> vars) {
        List<FAbstractEquation> iEqus = new List<FAbstractEquation>();
        List<FAbstractEquation> pEqus = new List<FAbstractEquation>();
        List<FAbstractEquation> equs = new List<FAbstractEquation>();
        
        Scalarizer.Variable sv = new Scalarizer.Variable(vars, iEqus, pEqus, equs);
        
        FAbstractEquation.scalarizeList(sv.sc, getFAbstractEquations());
        FAbstractEquation.scalarizeList(sv.si, getFInitialEquations());
        FAbstractEquation.scalarizeList(sv.sp, getFParameterEquations());
        
        for (FVariable fv : getFVariables()) {
            fv.scalarize(sv);
        }
        
        setFAbstractEquationList(equs);
        setFInitialEquationList(iEqus);
        setFParameterEquationList(pEqus);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:282
     */
    protected void replaceScalarizedVars(List<FVariable> vars) {
        setFVariableList(vars);
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:286
     */
    protected void scalarizeFuncs() {
		for (FFunctionDecl f : getFFunctionDecls()) 
			f.scalarize();
	}
    /**
     * Handles scalarization of the FAttributes that are declared in the FClass
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:294
     */
    private void scalarizeAttributes() {
        List<FAttribute> attrs = new List<FAttribute>();
        for (FAttribute a : getFAttributes())
            a.scalarize(attrs, Index.NULL, Collections.<String,FExp>emptyMap());
        setFAttributeList(attrs);
    }
    /**
     * Scalarize type declarations by removing array-valued attributes. 
     * They have been copied to the variables when the variables were scalarized. 
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:305
     */
    protected void scalarizeTypes() {
		for (FDerivedType t : getFDerivedTypes())
			t.removeArrayValuedAttributes();
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:349
     */
    protected void scalarizationCleanup() {
        flush();  // Must flush before traversing
    }
    /**
     * @aspect DynamicStateSelect
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/DynamicStates.jrag:214
     */
    public void applyDynamicStateResult(IndexReductionResult result) {
        if (result.hasDSFailed()) {
            warning("Unable to use dynamic states since there are too big sets. Using static states instead");
            return;
        }
        DynamicStateManager manager = getDynamicStateManager();
        for (IndexReductionBiPGraph.DSSet resSet : result.getDSSets()) {
            List<FIdUseExp> varList = new List<FIdUseExp>();
            for (IndexReductionVar var : resSet.vars) {
                FVariable fVar = var.getVariable();
                if (fVar.order() == 1)
                    varList.add(fVar.getMeIntegrated().createUseExp());
                else
                    varList.add(new FIdUseExp(fVar.getFQName().createDerPrefixedName(fVar.order() - 1)));
            }
            List<DynamicStateCoefficient> coffList = new List<DynamicStateCoefficient>();
            for (int eqn = 0; eqn < resSet.coefficients.length; eqn++) {
                for (int var = 0; var < resSet.coefficients[eqn].length; var++) {
                    if (resSet.coefficients[eqn][var] != null)
                        coffList.add(new DynamicStateCoefficient(eqn, var, resSet.coefficients[eqn][var]));
                }
            }
            DynamicStateSet set = new DynamicStateSet(manager.nextId(), resSet.eqns.size(), varList, coffList, null, null);
            FDynamicAlgebraicVariable[] algebraicVars = new FDynamicAlgebraicVariable[set.numAlgebraics()];
            for (int i = 1; i <= set.numAlgebraics(); i++) {
                FDynamicAlgebraicVariable var = new FDynamicAlgebraicVariable(set, i);
                algebraicVars[i - 1] = var;
                addFVariable(var);
            }
            set.setAlgebraicVars(algebraicVars);
            FDynamicStateVariable[] stateVars = new FDynamicStateVariable[set.numStates()];
            for (int i = 1; i <= set.numStates(); i++) {
                FDynamicStateVariable var = new FDynamicStateVariable(set, i);
                stateVars[i - 1] = var;
                addFVariable(var);
                addFEquation(new FEquation(new FDerExp(var.createFIdUse()), new FDSDerExp(set.id(), i)));
            }
            set.setStateVars(stateVars);
            manager.addSet(set);
        }
        enableDynamicStateRewrite();
    }
    /**
     * Generate array initialization statements for unknown function arrays.
     * @aspect GenInitArrayStatements
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/GenInitArrayStatements.jrag:23
     */
    
        /**
         * Generate array initialization statements for unknown function arrays.
         */
        public class genInitArrayStatements extends Transformation {
            public void perform() {
                for (FFunctionDecl ffd : getFFunctionDecls()) {
                    ffd.sortBindingAssignments();
                }
            }
        }
    /**
     * Generate array initialization statements for unknown function arrays.
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:36
     */
    
        /**
         * Generate array initialization statements for unknown function arrays.
         */
        public class indexReduction extends Transformation {
            public indexReduction() {
                super("index_reduction");
            }
            
            public void perform() {
                try {
                    // Make sure that we don't do this if any errors have been reported previously
                    breakOnErrors();
                    
                    DAEBiPGraph = computeMatchedDAEBiPGraph();
                    if (shouldReduceIndex(DAEBiPGraph))
                        reduceIndex();
                } catch (IndexReductionException e) {
                    if (indexReductionErrorsAsWarnings())
                        warning(e.getMessage());
                    else
                        error(e.getMessage());
                    // We need to check structure and give warning since a bad system can affect index reduction
                    checkStructure();
                } catch (EquationDifferentiationException e) {
                    error(e.getMessage());
                }
                breakOnErrors();
            }
        }
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:64
     */
    private boolean shouldReduceIndex(BiPGraph g) {
        return !g.isComplete() && continuousEquations().size() > 0 && derivativeVariables().size() > 0;
    }
    /**
     * Perform index reduction on model.
     * 
     * @return  the new graph
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:73
     */
    private void reduceIndex() {
        log.verbose("Flat tree before index reduction");
        log.verbose(this);
        log.verbose("Index reduction starts...");
        IndexReductionResult result;
        while (true) {
            IndexReductionBiPGraph g = new IndexReductionBiPGraph();
            // Only do index reduction based on real variables and equations
            g.addVariables(this, VAR_TYPES_REAL);
            g.addEquations(continuousNonMetaEquations(), VAR_TYPES_REAL);
            log.verbose(g);
            g.maximumMatching(true);
            log.verbose("DAE system real variables only");
            log.verbose(g.printMatchingObj());
            
            try {
                boolean printPantelidesSteps = g.getEquations().size() <= myOptions().getIntegerOption("diagnostics_limit");
                if (!printPantelidesSteps) {
                    log.verbose("The BiPGraph will not be printed during pantelides, the model is too big. "
                            + "Limit, compiler option 'diagnostics_limit', is set to %d and model size is %d. ",
                            myOptions().getIntegerOption("diagnostics_limit"), g.getEquations().size());
                }
                result = g.reduceIndex(new IndexReductionFunctionInliner(this),
                        myOptions().getBooleanOption("dynamic_states"),
                        myOptions().getIntegerOption("munkres_max_incidences"),
                        printPantelidesSteps);
                break;
            } catch (EquationDifferentiationException e) {
                ASTNode.log.verbose("Unable to differentiate equation:\n%s", e.equation);
                if (ssPreferVars == null || ssPreferVars.isEmpty())
                    throw e;
                Set<FVariable> removableVars = g.removablePreferDerivatives(ssPreferVars);
                if (removableVars.isEmpty())
                    throw e;
                log.verbose("Retrying index reduction without the following state select prefer derivatives:");
                for (FVariable var : removableVars) {
                    log.verbose("  %s", var.name());
                    ssPreferVars.remove(var.getMeIntegrated());
                }
                log.verbose("");
                
                // Remove SS=prefer derivatives
                List<FVariable> vars = new List<FVariable>();
                for (FVariable var : getFVariableListNoTransform()) {
                    if (!removableVars.contains(var))
                        vars.add(var);
                }
                setFVariableList(vars);
                root().flushAllRecursive();
            }
        }
        
        // Add the new equations
        // Replace selected dummy derivatives with algebraics
        // Enable rewrite of identifiers? (not necessary?)
        for (FAbstractEquation fe : result.getEquations()) {
            if (fe.variability().parameterOrLess())
                addFParameterEquation(fe);
            else
                addFEquation(fe);
        }
        
        getAliasManager().stopCollectingDerivativeBindings();
        
        Collection<FVariable> l = new ArrayList<FVariable>();
        
        for (FVariable fv : getFVariables()) {
            if (fv.isDerivativeVariable()) {
                if (result.getDummyDerivatives().contains(fv)) {
                    FDummyDerivativeVariable fdv = new FDummyDerivativeVariable(fv.getFVisibilityType().fullCopy(),
                        fv.getFTypePrefixVariability().fullCopy(), fv.getFQName().fullCopy(), fv.order());
                    l.add(fdv);
                } else if (fv.order() > 1) {
                    // Convert higher order derivative variables into
                    // first order derivatives, generating variables for each step
                    FQName fqnPrev = fv.getFQName().fullCopy();
                    for (int i = 1; i < fv.order(); i++) {
                        FQName fqn = fv.getFQName().createDerPrefixedName(i);
                        l.add(new FRealVariable(new FPublicVisibilityType(),
                                fv.getFTypePrefixVariability().fullCopy(), fqn.fullCopy()));
                        // Derivative variable is added later
                        addFEquation(new FEquation(new FIdUseExp(fqn), new FDerExp(fqnPrev.fullCopy())));
                        fqnPrev = fqn;
                    }
                }
            } else {
                l.add(fv);
            }
        }

        setFVariableList(new List<FVariable>(l));

        applyDynamicStateResult(result);
        
        log.verbose(this);
        
        enableFHDerRewrite();

        // flushAllRecursiveClearFinal must be used here in order to
        // trigger rewrites of FDerExp -> FDummyDerExp
        root().flushAllRecursiveClearFinal();

        aliasElimination.apply();
        // Add derivative variables
        setFDerivativeVariables.apply();

        root().flushAllRecursive();

        log.verbose(this);
        log.verbose(aliasManager);

        // Produce errors and warnings:
        Set<FVariable> stateSelectAlwaysVars = new HashSet<FVariable>();
        for (FVariable fv : variables()) {
            if (fv.aliasSet() != null) {
                for (AliasManager.AliasVariable av : fv.aliasSet()) {
                    if (av.getFVariable().stateSelectAttribute() == FRealVariable.StateSelect.ALWAYS)
                        stateSelectAlwaysVars.add(av.getFVariable());
                }
            } else if (fv.stateSelectAttribute() == FRealVariable.StateSelect.ALWAYS) {
                stateSelectAlwaysVars.add(fv);
            }
        }
        for (FVariable fv : differentiatedRealVariables()) {
            if (fv.stateSelectAttribute() == FRealVariable.StateSelect.NEVER)
                fv.warning(fv.name() + " has stateSelect=never, but must be selected as state");
            stateSelectAlwaysVars.remove(fv);
        }
        for (FVariable fv : stateSelectAlwaysVars) 
            if (fv.isSetInReinit())
                fv.error(fv.name() + " is assigned in reinit(), but could not be selected as state");
            else
                fv.warning(fv.name() + " has stateSelect=always, but could not be selected as state");

        log.info(stateDiagnosticsObj());
        
        DAEBiPGraph = computeMatchedDAEBiPGraph();
        log.verbose("BiPGraph after index reduction");
        log.verbose(DAEBiPGraph);
        log.verbose("BiPGraph matching after index reduction");
        log.verbose(DAEBiPGraph.printMatchingObj());

        if (!DAEBiPGraph.isComplete()) {
            // If we get here, index reduction failed
            throw new IndexReductionException();
        }
    }
    /**
     * @aspect IndexReduction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/IndexReduction.jrag:221
     */
    public Object stateDiagnosticsObj() {
        return new Object() {
            public String toString() {
                if (differentiatedRealVariables().isEmpty())
                    return "There are no states in the model";
                StringBuilder sb = new StringBuilder();
                sb.append("States:\n");
                for (FVariable fv : differentiatedRealVariables()) {
                    if (fv.isDynamicState())
                        continue;
                    if (fv.isFDynamicStateVariable()) {
                        FDynamicStateVariable var = fv.asFDynamicStateVariable();
                        if (var.getNumber() != 1)
                            continue;
                        DynamicStateSet set = var.getSet();
                        sb.append(String.format("  Set of dynamic states with %d states and %d algebraics:\n", set.numStates(), set.numAlgebraics()));
                        for (FVariable state : set.fVars()) {
                            sb.append(state.prettyPrint("    "));
                            sb.append('\n');
                        }
                    } else {
                        sb.append(fv.prettyPrint("  "));
                        sb.append('\n');
                    }
                }
                return sb.toString();
            }
        };
    }
    /**
     * Given a BiPGraph, this method remove all redundant unmatched initial
     * equations.
     * Returns a BiPGraph with no unmatched equations on success (might be the
     * same as inputed to the method).
     * @aspect OverdeterminedInitialSystem
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/OverdeterminedInitialSystem.jrag:27
     */
    public BiPGraph overdeterminedInitialSystem(BiPGraph g) {
        AbstractBiPGraph<Eq, Var, ?>.OISResult res = g.overdeterminedInitialSystem();
        if (res == null)
            return g;
        
        Set<FAbstractEquation> eqnsToRemove = new HashSet<FAbstractEquation>();
        for (Eq e : res.redundentEquations) {
            g.removeEquation(e);
            eqnsToRemove.add(e.getEquation());
        }
        
        List<FAbstractEquation> newInitList = new List<FAbstractEquation>();
        for (FAbstractEquation eqn : getFInitialEquations()) {
            if (!eqnsToRemove.contains(eqn))
                newInitList.add(eqn);
        }
        setFInitialEquationList(newInitList);
        
        for (FVariable var : res.visitedParameters) {
            if (!var.isParameter())
                continue;
            var.setFTypePrefixVariability(new FStructParameter());
        }
        
        return g;
    }
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:107
     */
    private int adIndex = 0;
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:110
     */
    public int nextADIndex() {
		return adIndex++;
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1810
     */
    private int tmpNbr_var = 0;
    /**
     * Is called when assigning unique temporary variables. Increment index by one for each expression. 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1815
     */
    public int nextTempNbr_var_CAD() {
		return tmpNbr_var++;
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1819
     */
    private int tmpNbr_der = 0;
    /**
     * Is called when assigning unique temporary derivative variables. Increment index by one for each expression. 
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:1824
     */
    public int nextTempNbr_der_CAD() {
		return tmpNbr_der++;
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2318
     */
    private CodeGenContext codeGenContext = new CodeGenContext();
    /**
     * @declaredat ASTNode:1
     */
    public FClass() {
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
        children = new ASTNode[16];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
        setChild(new List(), 7);
        setChild(new List(), 8);
        setChild(new List(), 9);
        setChild(new List(), 10);
        setChild(new List(), 11);
        setChild(new List(), 12);
        setChild(new Opt(), 15);
    }
    /**
     * @declaredat ASTNode:26
     */
    public FClass(FQName p0, List<FVariable> p1, List<FVariable> p2, List<FVariable> p3, List<FAbstractEquation> p4, List<FAbstractEquation> p5, List<FAbstractEquation> p6, List<FFunctionDecl> p7, List<FRecordDecl> p8, List<FEnumDecl> p9, List<FDerivedType> p10, List<FResidualPair> p11, List<FAttribute> p12, DynamicStateManager p13) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
        setChild(p6, 6);
        setChild(p7, 7);
        setChild(p8, 8);
        setChild(p9, 9);
        setChild(p10, 10);
        setChild(p11, 11);
        setChild(p12, 12);
        setChild(p13, 13);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:45
     */
    protected int numChildren() {
        return 14;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:57
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        valueReferenceMap_reset();
        independentRealConstants_reset();
        independentIntegerConstants_reset();
        independentEnumConstants_reset();
        independentBooleanConstants_reset();
        independentStringConstants_reset();
        dependentRealConstants_reset();
        dependentIntegerConstants_reset();
        dependentEnumConstants_reset();
        dependentBooleanConstants_reset();
        dependentStringConstants_reset();
        independentParameters_reset();
        independentIntegerEnumParameters_reset();
        independentRealParameters_reset();
        independentIntegerParameters_reset();
        independentEnumParameters_reset();
        independentBooleanParameters_reset();
        independentStringParameters_reset();
        regularIndependentRealParameters_reset();
        regularIndependentIntegerParameters_reset();
        regularIndependentEnumParameters_reset();
        regularIndependentBooleanParameters_reset();
        regularIndependentStringParameters_reset();
        structuralIndependentRealParameters_reset();
        structuralIndependentIntegerParameters_reset();
        structuralIndependentEnumParameters_reset();
        structuralIndependentBooleanParameters_reset();
        structuralIndependentStringParameters_reset();
        finalIndependentRealParameters_reset();
        finalIndependentIntegerParameters_reset();
        finalIndependentEnumParameters_reset();
        finalIndependentBooleanParameters_reset();
        finalIndependentStringParameters_reset();
        evalIndependentRealParameters_reset();
        evalIndependentIntegerParameters_reset();
        evalIndependentEnumParameters_reset();
        evalIndependentBooleanParameters_reset();
        evalIndependentStringParameters_reset();
        dependentRealParameters_reset();
        dependentIntegerParameters_reset();
        dependentEnumParameters_reset();
        dependentBooleanParameters_reset();
        dependentStringParameters_reset();
        discreteRealVariables_reset();
        discreteIntegerVariables_reset();
        discreteEnumVariables_reset();
        discreteBooleanVariables_reset();
        discreteStringVariables_reset();
        differentiatedRealVariablesList_reset();
        differentiatedRealVariables_reset();
        discretePreVariables_reset();
        allVariables_reset();
        realVariables_reset();
        integerVariables_reset();
        enumVariables_reset();
        booleanVariables_reset();
        stringVariables_reset();
        algebraicContinousRealVariables_reset();
        normalAlgebraicContinousRealVariables_reset();
        algebraicVariables_reset();
        normalAlgebraicVariables_reset();
        realVariablesWithBindingExp_reset();
        integerVariablesWithBindingExp_reset();
        enumVariablesWithBindingExp_reset();
        booleanVariablesWithBindingExp_reset();
        stringVariablesWithBindingExp_reset();
        realInputs_reset();
        integerInputs_reset();
        enumInputs_reset();
        booleanInputs_reset();
        stringInputs_reset();
        realOutputs_reset();
        integerOutputs_reset();
        enumOutputs_reset();
        booleanOutputs_reset();
        stringOutputs_reset();
        numScalarEquationsAtInitialization_reset();
        equations_reset();
        continuousEquations_reset();
        continuousNonMetaEquations_reset();
        switchExps_reset();
        stateEventExps_reset();
        timeEventExps_reset();
        numInitialScalarEquations_reset();
        initialEquations_reset();
        guid_reset();
        freeParametersEquationSparsity_n_nz_reset();
        freeParametersEquationSparsity_reset();
        derivativeVariablesEquationSparsity_n_nz_reset();
        derivativeVariablesEquationSparsity_reset();
        differentiatedRealVariablesEquationSparsity_n_nz_reset();
        differentiatedRealVariablesEquationSparsity_reset();
        realInputsEquationSparsity_n_nz_reset();
        realInputsEquationSparsity_reset();
        algebraicRealVariablesEquationSparsity_n_nz_reset();
        algebraicRealVariablesEquationSparsity_reset();
        variablesMap_reset();
        parameterEquationsMap_reset();
        getUnknownFVariable_reset();
        getFDynamicResolverOpt_reset();
        stateSelectType_reset();
        collectReinits_reset();
        continuousVariablesUsedInPreInInitial_reset();
        runtimeOptionParameters_reset();
        resourcesToLoad_reset();
        exportWrapperGroups_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:169
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FClass_reals_computed = false;
        FClass_reals_value = null;
        FClass_reals_contributors = null;
        FClass_integers_computed = false;
        FClass_integers_value = null;
        FClass_integers_contributors = null;
        FClass_enums_computed = false;
        FClass_enums_value = null;
        FClass_enums_contributors = null;
        FClass_booleans_computed = false;
        FClass_booleans_value = null;
        FClass_booleans_contributors = null;
        FClass_strings_computed = false;
        FClass_strings_value = null;
        FClass_strings_contributors = null;
        FClass_independentConstants_computed = false;
        FClass_independentConstants_value = null;
        FClass_independentConstants_contributors = null;
        FClass_externalObjectVariables_computed = false;
        FClass_externalObjectVariables_value = null;
        FClass_externalObjectVariables_contributors = null;
        FClass_regularIndependentParameters_computed = false;
        FClass_regularIndependentParameters_value = null;
        FClass_regularIndependentParameters_contributors = null;
        FClass_structuralIndependentParameters_computed = false;
        FClass_structuralIndependentParameters_value = null;
        FClass_structuralIndependentParameters_contributors = null;
        FClass_finalIndependentParameters_computed = false;
        FClass_finalIndependentParameters_value = null;
        FClass_finalIndependentParameters_contributors = null;
        FClass_evalIndependentParameters_computed = false;
        FClass_evalIndependentParameters_value = null;
        FClass_evalIndependentParameters_contributors = null;
        FClass_dependentParameters_computed = false;
        FClass_dependentParameters_value = null;
        FClass_dependentParameters_contributors = null;
        FClass_allDifferentiatedRealVariables_computed = false;
        FClass_allDifferentiatedRealVariables_value = null;
        FClass_allDifferentiatedRealVariables_contributors = null;
        FClass_dynamicStates_computed = false;
        FClass_dynamicStates_value = null;
        FClass_dynamicStates_contributors = null;
        FClass_dynamicStateVariables_computed = false;
        FClass_dynamicStateVariables_value = null;
        FClass_dynamicStateVariables_contributors = null;
        FClass_dynamicAlgebraicVariables_computed = false;
        FClass_dynamicAlgebraicVariables_value = null;
        FClass_dynamicAlgebraicVariables_contributors = null;
        FClass_differentiatedRealVariablesFilteredSet_computed = false;
        FClass_differentiatedRealVariablesFilteredSet_value = null;
        FClass_differentiatedRealVariablesFilteredSet_contributors = null;
        FClass_myFFunctionDeclsPartial_computed = false;
        FClass_myFFunctionDeclsPartial_value = null;
        FClass_myFFunctionDeclsPartial_contributors = null;
        FClass_myFFunctionDeclsPartialCalled_computed = false;
        FClass_myFFunctionDeclsPartialCalled_value = null;
        FClass_myFFunctionDeclsPartialCalled_contributors = null;
        FClass_myDelayExps_computed = false;
        FClass_myDelayExps_value = null;
        FClass_myDelayExps_contributors = null;
        FClass_mySpatialDistExps_computed = false;
        FClass_mySpatialDistExps_value = null;
        FClass_mySpatialDistExps_contributors = null;
        FClass_derivativeVariables_computed = false;
        FClass_derivativeVariables_value = null;
        FClass_derivativeVariables_contributors = null;
        FClass_variables_computed = false;
        FClass_variables_value = null;
        FClass_variables_contributors = null;
        FClass_discreteVariables_computed = false;
        FClass_discreteVariables_value = null;
        FClass_discreteVariables_contributors = null;
        FClass_initialParameters_computed = false;
        FClass_initialParameters_value = null;
        FClass_initialParameters_contributors = null;
        FClass_aliasVariables_computed = false;
        FClass_aliasVariables_value = null;
        FClass_aliasVariables_contributors = null;
        FClass_tempVariables_computed = false;
        FClass_tempVariables_value = null;
        FClass_tempVariables_contributors = null;
        FClass_variablesWithBindingExp_computed = false;
        FClass_variablesWithBindingExp_value = null;
        FClass_variablesWithBindingExp_contributors = null;
        FClass_inputs_computed = false;
        FClass_inputs_value = null;
        FClass_inputs_contributors = null;
        FClass_outputs_computed = false;
        FClass_outputs_value = null;
        FClass_outputs_contributors = null;
        FClass_algorithms_computed = false;
        FClass_algorithms_value = null;
        FClass_algorithms_contributors = null;
        FClass_sampleExpsWithTimeEvent_computed = false;
        FClass_sampleExpsWithTimeEvent_value = null;
        FClass_sampleExpsWithTimeEvent_contributors = null;
        FClass_spatialDistExpsWithStateEvent_computed = false;
        FClass_spatialDistExpsWithStateEvent_value = null;
        FClass_spatialDistExpsWithStateEvent_contributors = null;
        FClass_delayExpsWithStateEvent_computed = false;
        FClass_delayExpsWithStateEvent_value = null;
        FClass_delayExpsWithStateEvent_contributors = null;
        FClass_guardExpInEquations_computed = false;
        FClass_guardExpInEquations_value = null;
        FClass_guardExpInEquations_contributors = null;
        FClass_guardExpInInitialEquations_computed = false;
        FClass_guardExpInInitialEquations_value = null;
        FClass_guardExpInInitialEquations_contributors = null;
        FClass_relExpsWithEvent_computed = false;
        FClass_relExpsWithEvent_value = null;
        FClass_relExpsWithEvent_contributors = null;
        FClass_relExpInInitialEquations_computed = false;
        FClass_relExpInInitialEquations_value = null;
        FClass_relExpInInitialEquations_contributors = null;
        FClass_myAlgorithms_computed = false;
        FClass_myAlgorithms_value = null;
        FClass_myAlgorithms_contributors = null;
        FClass_myExternals_computed = false;
        FClass_myExternals_value = null;
        FClass_myExternals_contributors = null;
        FClass_collectInstAccesses_computed = false;
        FClass_collectInstAccesses_value = null;
        FClass_collectInstAccesses_contributors = null;
        FClass_eventGenExps_computed = false;
        FClass_eventGenExps_value = null;
        FClass_eventGenExps_contributors = null;
        FClass_collectSemiLinearExps_computed = false;
        FClass_collectSemiLinearExps_value = null;
        FClass_collectSemiLinearExps_contributors = null;
        collect_contributors_FClass_reals = false;
        collect_contributors_FClass_integers = false;
        collect_contributors_FClass_enums = false;
        collect_contributors_FClass_booleans = false;
        collect_contributors_FClass_strings = false;
        collect_contributors_FClass_independentConstants = false;
        collect_contributors_FClass_externalObjectVariables = false;
        collect_contributors_FClass_regularIndependentParameters = false;
        collect_contributors_FClass_structuralIndependentParameters = false;
        collect_contributors_FClass_finalIndependentParameters = false;
        collect_contributors_FClass_evalIndependentParameters = false;
        collect_contributors_FClass_dependentParameters = false;
        collect_contributors_FClass_allDifferentiatedRealVariables = false;
        collect_contributors_FClass_dynamicStates = false;
        collect_contributors_FClass_dynamicStateVariables = false;
        collect_contributors_FClass_dynamicAlgebraicVariables = false;
        collect_contributors_FClass_differentiatedRealVariablesFilteredSet = false;
        collect_contributors_FClass_myFFunctionDeclsPartial = false;
        collect_contributors_FClass_myFFunctionDeclsPartialCalled = false;
        collect_contributors_FClass_myDelayExps = false;
        collect_contributors_FClass_mySpatialDistExps = false;
        collect_contributors_FClass_derivativeVariables = false;
        collect_contributors_FClass_variables = false;
        collect_contributors_FClass_discreteVariables = false;
        collect_contributors_FClass_initialParameters = false;
        collect_contributors_FClass_aliasVariables = false;
        collect_contributors_FClass_tempVariables = false;
        collect_contributors_FClass_variablesWithBindingExp = false;
        collect_contributors_FClass_inputs = false;
        collect_contributors_FClass_outputs = false;
        collect_contributors_FClass_algorithms = false;
        collect_contributors_FClass_sampleExpsWithTimeEvent = false;
        collect_contributors_FClass_spatialDistExpsWithStateEvent = false;
        collect_contributors_FClass_delayExpsWithStateEvent = false;
        collect_contributors_FClass_relExpsWithEvent = false;
        collect_contributors_FClass_relExpInInitialEquations = false;
        collect_contributors_FClass_myAlgorithms = false;
        collect_contributors_FClass_myExternals = false;
        collect_contributors_FClass_collectInstAccesses = false;
        collect_contributors_FClass_eventGenExps = false;
        collect_contributors_FClass_collectSemiLinearExps = false;
        collect_contributors_FAbstractVariable_uses = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:346
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:352
     */
    public FClass clone() throws CloneNotSupportedException {
        FClass node = (FClass) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:359
     */
    public FClass copy() {
        try {
            FClass node = (FClass) clone();
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
     * @declaredat ASTNode:378
     */
    public FClass fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:387
     */
    public FClass treeCopyNoTransform() {
        FClass tree = (FClass) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 14:
                    tree.children[i] = null;
                    continue;
                case 15:
                    tree.children[i] = new Opt();
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
     * @declaredat ASTNode:415
     */
    public FClass treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:422
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(0);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(0);
    }
    /**
     * Replaces the FVariable list.
     * @param list The new list node to be used as the FVariable list.
     * @apilevel high-level
     */
    public void setFVariableList(List<FVariable> list) {
        setChild(list, 1);
    }
    /**
     * Retrieves the number of children in the FVariable list.
     * @return Number of children in the FVariable list.
     * @apilevel high-level
     */
    public int getNumFVariable() {
        return getFVariableList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FVariable list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FVariable list.
     * @apilevel low-level
     */
    public int getNumFVariableNoTransform() {
        return getFVariableListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FVariable list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FVariable list.
     * @apilevel high-level
     */
    public FVariable getFVariable(int i) {
        return (FVariable) getFVariableList().getChild(i);
    }
    /**
     * Check whether the FVariable list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFVariable() {
        return getFVariableList().getNumChild() != 0;
    }
    /**
     * Append an element to the FVariable list.
     * @param node The element to append to the FVariable list.
     * @apilevel high-level
     */
    public void addFVariable(FVariable node) {
        List<FVariable> list = (parent == null || state == null) ? getFVariableListNoTransform() : getFVariableList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFVariableNoTransform(FVariable node) {
        List<FVariable> list = getFVariableListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FVariable list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFVariable(FVariable node, int i) {
        List<FVariable> list = getFVariableList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FVariable list.
     * @return The node representing the FVariable list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FVariable")
    public List<FVariable> getFVariableList() {
        List<FVariable> list = (List<FVariable>) getChild(1);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FVariable list.
     * @apilevel low-level
     */
    public List<FVariable> getFVariableListNoTransform() {
        return (List<FVariable>) getChildNoTransform(1);
    }
    /**
     * Retrieves the FVariable list.
     * @return The node representing the FVariable list.
     * @apilevel high-level
     */
    public List<FVariable> getFVariables() {
        return getFVariableList();
    }
    /**
     * Retrieves the FVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FVariable list.
     * @apilevel low-level
     */
    public List<FVariable> getFVariablesNoTransform() {
        return getFVariableListNoTransform();
    }
    /**
     * Replaces the AliasVariable list.
     * @param list The new list node to be used as the AliasVariable list.
     * @apilevel high-level
     */
    public void setAliasVariableList(List<FVariable> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the AliasVariable list.
     * @return Number of children in the AliasVariable list.
     * @apilevel high-level
     */
    public int getNumAliasVariable() {
        return getAliasVariableList().getNumChild();
    }
    /**
     * Retrieves the number of children in the AliasVariable list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the AliasVariable list.
     * @apilevel low-level
     */
    public int getNumAliasVariableNoTransform() {
        return getAliasVariableListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the AliasVariable list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the AliasVariable list.
     * @apilevel high-level
     */
    public FVariable getAliasVariable(int i) {
        return (FVariable) getAliasVariableList().getChild(i);
    }
    /**
     * Check whether the AliasVariable list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAliasVariable() {
        return getAliasVariableList().getNumChild() != 0;
    }
    /**
     * Append an element to the AliasVariable list.
     * @param node The element to append to the AliasVariable list.
     * @apilevel high-level
     */
    public void addAliasVariable(FVariable node) {
        List<FVariable> list = (parent == null || state == null) ? getAliasVariableListNoTransform() : getAliasVariableList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAliasVariableNoTransform(FVariable node) {
        List<FVariable> list = getAliasVariableListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the AliasVariable list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAliasVariable(FVariable node, int i) {
        List<FVariable> list = getAliasVariableList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the AliasVariable list.
     * @return The node representing the AliasVariable list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="AliasVariable")
    public List<FVariable> getAliasVariableList() {
        List<FVariable> list = (List<FVariable>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the AliasVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AliasVariable list.
     * @apilevel low-level
     */
    public List<FVariable> getAliasVariableListNoTransform() {
        return (List<FVariable>) getChildNoTransform(2);
    }
    /**
     * Retrieves the AliasVariable list.
     * @return The node representing the AliasVariable list.
     * @apilevel high-level
     */
    public List<FVariable> getAliasVariables() {
        return getAliasVariableList();
    }
    /**
     * Retrieves the AliasVariable list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AliasVariable list.
     * @apilevel low-level
     */
    public List<FVariable> getAliasVariablesNoTransform() {
        return getAliasVariableListNoTransform();
    }
    /**
     * Replaces the AliasConstant list.
     * @param list The new list node to be used as the AliasConstant list.
     * @apilevel high-level
     */
    public void setAliasConstantList(List<FVariable> list) {
        setChild(list, 3);
    }
    /**
     * Retrieves the number of children in the AliasConstant list.
     * @return Number of children in the AliasConstant list.
     * @apilevel high-level
     */
    public int getNumAliasConstant() {
        return getAliasConstantList().getNumChild();
    }
    /**
     * Retrieves the number of children in the AliasConstant list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the AliasConstant list.
     * @apilevel low-level
     */
    public int getNumAliasConstantNoTransform() {
        return getAliasConstantListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the AliasConstant list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the AliasConstant list.
     * @apilevel high-level
     */
    public FVariable getAliasConstant(int i) {
        return (FVariable) getAliasConstantList().getChild(i);
    }
    /**
     * Check whether the AliasConstant list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAliasConstant() {
        return getAliasConstantList().getNumChild() != 0;
    }
    /**
     * Append an element to the AliasConstant list.
     * @param node The element to append to the AliasConstant list.
     * @apilevel high-level
     */
    public void addAliasConstant(FVariable node) {
        List<FVariable> list = (parent == null || state == null) ? getAliasConstantListNoTransform() : getAliasConstantList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAliasConstantNoTransform(FVariable node) {
        List<FVariable> list = getAliasConstantListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the AliasConstant list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAliasConstant(FVariable node, int i) {
        List<FVariable> list = getAliasConstantList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the AliasConstant list.
     * @return The node representing the AliasConstant list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="AliasConstant")
    public List<FVariable> getAliasConstantList() {
        List<FVariable> list = (List<FVariable>) getChild(3);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the AliasConstant list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AliasConstant list.
     * @apilevel low-level
     */
    public List<FVariable> getAliasConstantListNoTransform() {
        return (List<FVariable>) getChildNoTransform(3);
    }
    /**
     * Retrieves the AliasConstant list.
     * @return The node representing the AliasConstant list.
     * @apilevel high-level
     */
    public List<FVariable> getAliasConstants() {
        return getAliasConstantList();
    }
    /**
     * Retrieves the AliasConstant list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the AliasConstant list.
     * @apilevel low-level
     */
    public List<FVariable> getAliasConstantsNoTransform() {
        return getAliasConstantListNoTransform();
    }
    /**
     * Replaces the FInitialEquation list.
     * @param list The new list node to be used as the FInitialEquation list.
     * @apilevel high-level
     */
    public void setFInitialEquationList(List<FAbstractEquation> list) {
        setChild(list, 4);
    }
    /**
     * Retrieves the number of children in the FInitialEquation list.
     * @return Number of children in the FInitialEquation list.
     * @apilevel high-level
     */
    public int getNumFInitialEquation() {
        return getFInitialEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FInitialEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FInitialEquation list.
     * @apilevel low-level
     */
    public int getNumFInitialEquationNoTransform() {
        return getFInitialEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FInitialEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FInitialEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFInitialEquation(int i) {
        return (FAbstractEquation) getFInitialEquationList().getChild(i);
    }
    /**
     * Check whether the FInitialEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFInitialEquation() {
        return getFInitialEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FInitialEquation list.
     * @param node The element to append to the FInitialEquation list.
     * @apilevel high-level
     */
    public void addFInitialEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFInitialEquationListNoTransform() : getFInitialEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFInitialEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFInitialEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FInitialEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFInitialEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFInitialEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FInitialEquation list.
     * @return The node representing the FInitialEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FInitialEquation")
    public List<FAbstractEquation> getFInitialEquationList() {
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(4);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FInitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FInitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(4);
    }
    /**
     * Retrieves the FInitialEquation list.
     * @return The node representing the FInitialEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFInitialEquations() {
        return getFInitialEquationList();
    }
    /**
     * Retrieves the FInitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FInitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFInitialEquationsNoTransform() {
        return getFInitialEquationListNoTransform();
    }
    /**
     * Replaces the FParameterEquation list.
     * @param list The new list node to be used as the FParameterEquation list.
     * @apilevel high-level
     */
    public void setFParameterEquationList(List<FAbstractEquation> list) {
        setChild(list, 5);
    }
    /**
     * Retrieves the number of children in the FParameterEquation list.
     * @return Number of children in the FParameterEquation list.
     * @apilevel high-level
     */
    public int getNumFParameterEquation() {
        return getFParameterEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FParameterEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FParameterEquation list.
     * @apilevel low-level
     */
    public int getNumFParameterEquationNoTransform() {
        return getFParameterEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FParameterEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FParameterEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFParameterEquation(int i) {
        return (FAbstractEquation) getFParameterEquationList().getChild(i);
    }
    /**
     * Check whether the FParameterEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFParameterEquation() {
        return getFParameterEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FParameterEquation list.
     * @param node The element to append to the FParameterEquation list.
     * @apilevel high-level
     */
    public void addFParameterEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFParameterEquationListNoTransform() : getFParameterEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFParameterEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFParameterEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FParameterEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFParameterEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFParameterEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FParameterEquation list.
     * @return The node representing the FParameterEquation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FParameterEquation")
    public List<FAbstractEquation> getFParameterEquationList() {
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(5);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FParameterEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FParameterEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFParameterEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(5);
    }
    /**
     * Retrieves the FParameterEquation list.
     * @return The node representing the FParameterEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFParameterEquations() {
        return getFParameterEquationList();
    }
    /**
     * Retrieves the FParameterEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FParameterEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFParameterEquationsNoTransform() {
        return getFParameterEquationListNoTransform();
    }
    /**
     * Replaces the FAbstractEquation list.
     * @param list The new list node to be used as the FAbstractEquation list.
     * @apilevel high-level
     */
    public void setFAbstractEquationList(List<FAbstractEquation> list) {
        setChild(list, 6);
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
        List<FAbstractEquation> list = (List<FAbstractEquation>) getChild(6);
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
        return (List<FAbstractEquation>) getChildNoTransform(6);
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
     * Replaces the FFunctionDecl list.
     * @param list The new list node to be used as the FFunctionDecl list.
     * @apilevel high-level
     */
    public void setFFunctionDeclList(List<FFunctionDecl> list) {
        setChild(list, 7);
    }
    /**
     * Retrieves the number of children in the FFunctionDecl list.
     * @return Number of children in the FFunctionDecl list.
     * @apilevel high-level
     */
    public int getNumFFunctionDecl() {
        return getFFunctionDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FFunctionDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FFunctionDecl list.
     * @apilevel low-level
     */
    public int getNumFFunctionDeclNoTransform() {
        return getFFunctionDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FFunctionDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FFunctionDecl list.
     * @apilevel high-level
     */
    public FFunctionDecl getFFunctionDecl(int i) {
        return (FFunctionDecl) getFFunctionDeclList().getChild(i);
    }
    /**
     * Check whether the FFunctionDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFFunctionDecl() {
        return getFFunctionDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the FFunctionDecl list.
     * @param node The element to append to the FFunctionDecl list.
     * @apilevel high-level
     */
    public void addFFunctionDecl(FFunctionDecl node) {
        List<FFunctionDecl> list = (parent == null || state == null) ? getFFunctionDeclListNoTransform() : getFFunctionDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFFunctionDeclNoTransform(FFunctionDecl node) {
        List<FFunctionDecl> list = getFFunctionDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FFunctionDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFFunctionDecl(FFunctionDecl node, int i) {
        List<FFunctionDecl> list = getFFunctionDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FFunctionDecl list.
     * @return The node representing the FFunctionDecl list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FFunctionDecl")
    public List<FFunctionDecl> getFFunctionDeclList() {
        List<FFunctionDecl> list = (List<FFunctionDecl>) getChild(7);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FFunctionDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FFunctionDecl list.
     * @apilevel low-level
     */
    public List<FFunctionDecl> getFFunctionDeclListNoTransform() {
        return (List<FFunctionDecl>) getChildNoTransform(7);
    }
    /**
     * Retrieves the FFunctionDecl list.
     * @return The node representing the FFunctionDecl list.
     * @apilevel high-level
     */
    public List<FFunctionDecl> getFFunctionDecls() {
        return getFFunctionDeclList();
    }
    /**
     * Retrieves the FFunctionDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FFunctionDecl list.
     * @apilevel low-level
     */
    public List<FFunctionDecl> getFFunctionDeclsNoTransform() {
        return getFFunctionDeclListNoTransform();
    }
    /**
     * Replaces the FRecordDecl list.
     * @param list The new list node to be used as the FRecordDecl list.
     * @apilevel high-level
     */
    public void setFRecordDeclList(List<FRecordDecl> list) {
        setChild(list, 8);
    }
    /**
     * Retrieves the number of children in the FRecordDecl list.
     * @return Number of children in the FRecordDecl list.
     * @apilevel high-level
     */
    public int getNumFRecordDecl() {
        return getFRecordDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FRecordDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FRecordDecl list.
     * @apilevel low-level
     */
    public int getNumFRecordDeclNoTransform() {
        return getFRecordDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FRecordDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FRecordDecl list.
     * @apilevel high-level
     */
    public FRecordDecl getFRecordDecl(int i) {
        return (FRecordDecl) getFRecordDeclList().getChild(i);
    }
    /**
     * Check whether the FRecordDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFRecordDecl() {
        return getFRecordDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the FRecordDecl list.
     * @param node The element to append to the FRecordDecl list.
     * @apilevel high-level
     */
    public void addFRecordDecl(FRecordDecl node) {
        List<FRecordDecl> list = (parent == null || state == null) ? getFRecordDeclListNoTransform() : getFRecordDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFRecordDeclNoTransform(FRecordDecl node) {
        List<FRecordDecl> list = getFRecordDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FRecordDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFRecordDecl(FRecordDecl node, int i) {
        List<FRecordDecl> list = getFRecordDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FRecordDecl list.
     * @return The node representing the FRecordDecl list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FRecordDecl")
    public List<FRecordDecl> getFRecordDeclList() {
        List<FRecordDecl> list = (List<FRecordDecl>) getChild(8);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FRecordDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FRecordDecl list.
     * @apilevel low-level
     */
    public List<FRecordDecl> getFRecordDeclListNoTransform() {
        return (List<FRecordDecl>) getChildNoTransform(8);
    }
    /**
     * Retrieves the FRecordDecl list.
     * @return The node representing the FRecordDecl list.
     * @apilevel high-level
     */
    public List<FRecordDecl> getFRecordDecls() {
        return getFRecordDeclList();
    }
    /**
     * Retrieves the FRecordDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FRecordDecl list.
     * @apilevel low-level
     */
    public List<FRecordDecl> getFRecordDeclsNoTransform() {
        return getFRecordDeclListNoTransform();
    }
    /**
     * Replaces the FEnumDecl list.
     * @param list The new list node to be used as the FEnumDecl list.
     * @apilevel high-level
     */
    public void setFEnumDeclList(List<FEnumDecl> list) {
        setChild(list, 9);
    }
    /**
     * Retrieves the number of children in the FEnumDecl list.
     * @return Number of children in the FEnumDecl list.
     * @apilevel high-level
     */
    public int getNumFEnumDecl() {
        return getFEnumDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FEnumDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FEnumDecl list.
     * @apilevel low-level
     */
    public int getNumFEnumDeclNoTransform() {
        return getFEnumDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FEnumDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FEnumDecl list.
     * @apilevel high-level
     */
    public FEnumDecl getFEnumDecl(int i) {
        return (FEnumDecl) getFEnumDeclList().getChild(i);
    }
    /**
     * Check whether the FEnumDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFEnumDecl() {
        return getFEnumDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the FEnumDecl list.
     * @param node The element to append to the FEnumDecl list.
     * @apilevel high-level
     */
    public void addFEnumDecl(FEnumDecl node) {
        List<FEnumDecl> list = (parent == null || state == null) ? getFEnumDeclListNoTransform() : getFEnumDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFEnumDeclNoTransform(FEnumDecl node) {
        List<FEnumDecl> list = getFEnumDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FEnumDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFEnumDecl(FEnumDecl node, int i) {
        List<FEnumDecl> list = getFEnumDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FEnumDecl list.
     * @return The node representing the FEnumDecl list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FEnumDecl")
    public List<FEnumDecl> getFEnumDeclList() {
        List<FEnumDecl> list = (List<FEnumDecl>) getChild(9);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FEnumDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FEnumDecl list.
     * @apilevel low-level
     */
    public List<FEnumDecl> getFEnumDeclListNoTransform() {
        return (List<FEnumDecl>) getChildNoTransform(9);
    }
    /**
     * Retrieves the FEnumDecl list.
     * @return The node representing the FEnumDecl list.
     * @apilevel high-level
     */
    public List<FEnumDecl> getFEnumDecls() {
        return getFEnumDeclList();
    }
    /**
     * Retrieves the FEnumDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FEnumDecl list.
     * @apilevel low-level
     */
    public List<FEnumDecl> getFEnumDeclsNoTransform() {
        return getFEnumDeclListNoTransform();
    }
    /**
     * Replaces the FDerivedType list.
     * @param list The new list node to be used as the FDerivedType list.
     * @apilevel high-level
     */
    public void setFDerivedTypeList(List<FDerivedType> list) {
        setChild(list, 10);
    }
    /**
     * Retrieves the number of children in the FDerivedType list.
     * @return Number of children in the FDerivedType list.
     * @apilevel high-level
     */
    public int getNumFDerivedType() {
        return getFDerivedTypeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FDerivedType list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FDerivedType list.
     * @apilevel low-level
     */
    public int getNumFDerivedTypeNoTransform() {
        return getFDerivedTypeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FDerivedType list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FDerivedType list.
     * @apilevel high-level
     */
    public FDerivedType getFDerivedType(int i) {
        return (FDerivedType) getFDerivedTypeList().getChild(i);
    }
    /**
     * Check whether the FDerivedType list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFDerivedType() {
        return getFDerivedTypeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FDerivedType list.
     * @param node The element to append to the FDerivedType list.
     * @apilevel high-level
     */
    public void addFDerivedType(FDerivedType node) {
        List<FDerivedType> list = (parent == null || state == null) ? getFDerivedTypeListNoTransform() : getFDerivedTypeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFDerivedTypeNoTransform(FDerivedType node) {
        List<FDerivedType> list = getFDerivedTypeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FDerivedType list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFDerivedType(FDerivedType node, int i) {
        List<FDerivedType> list = getFDerivedTypeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FDerivedType list.
     * @return The node representing the FDerivedType list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FDerivedType")
    public List<FDerivedType> getFDerivedTypeList() {
        List<FDerivedType> list = (List<FDerivedType>) getChild(10);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FDerivedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FDerivedType list.
     * @apilevel low-level
     */
    public List<FDerivedType> getFDerivedTypeListNoTransform() {
        return (List<FDerivedType>) getChildNoTransform(10);
    }
    /**
     * Retrieves the FDerivedType list.
     * @return The node representing the FDerivedType list.
     * @apilevel high-level
     */
    public List<FDerivedType> getFDerivedTypes() {
        return getFDerivedTypeList();
    }
    /**
     * Retrieves the FDerivedType list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FDerivedType list.
     * @apilevel low-level
     */
    public List<FDerivedType> getFDerivedTypesNoTransform() {
        return getFDerivedTypeListNoTransform();
    }
    /**
     * Replaces the FResidualPair list.
     * @param list The new list node to be used as the FResidualPair list.
     * @apilevel high-level
     */
    public void setFResidualPairList(List<FResidualPair> list) {
        setChild(list, 11);
    }
    /**
     * Retrieves the number of children in the FResidualPair list.
     * @return Number of children in the FResidualPair list.
     * @apilevel high-level
     */
    public int getNumFResidualPair() {
        return getFResidualPairList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FResidualPair list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FResidualPair list.
     * @apilevel low-level
     */
    public int getNumFResidualPairNoTransform() {
        return getFResidualPairListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FResidualPair list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FResidualPair list.
     * @apilevel high-level
     */
    public FResidualPair getFResidualPair(int i) {
        return (FResidualPair) getFResidualPairList().getChild(i);
    }
    /**
     * Check whether the FResidualPair list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFResidualPair() {
        return getFResidualPairList().getNumChild() != 0;
    }
    /**
     * Append an element to the FResidualPair list.
     * @param node The element to append to the FResidualPair list.
     * @apilevel high-level
     */
    public void addFResidualPair(FResidualPair node) {
        List<FResidualPair> list = (parent == null || state == null) ? getFResidualPairListNoTransform() : getFResidualPairList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFResidualPairNoTransform(FResidualPair node) {
        List<FResidualPair> list = getFResidualPairListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FResidualPair list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFResidualPair(FResidualPair node, int i) {
        List<FResidualPair> list = getFResidualPairList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FResidualPair list.
     * @return The node representing the FResidualPair list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FResidualPair")
    public List<FResidualPair> getFResidualPairList() {
        List<FResidualPair> list = (List<FResidualPair>) getChild(11);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FResidualPair list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FResidualPair list.
     * @apilevel low-level
     */
    public List<FResidualPair> getFResidualPairListNoTransform() {
        return (List<FResidualPair>) getChildNoTransform(11);
    }
    /**
     * Retrieves the FResidualPair list.
     * @return The node representing the FResidualPair list.
     * @apilevel high-level
     */
    public List<FResidualPair> getFResidualPairs() {
        return getFResidualPairList();
    }
    /**
     * Retrieves the FResidualPair list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FResidualPair list.
     * @apilevel low-level
     */
    public List<FResidualPair> getFResidualPairsNoTransform() {
        return getFResidualPairListNoTransform();
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 12);
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
        List<FAttribute> list = (List<FAttribute>) getChild(12);
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
        return (List<FAttribute>) getChildNoTransform(12);
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
     * Replaces the DynamicStateManager child.
     * @param node The new node to replace the DynamicStateManager child.
     * @apilevel high-level
     */
    public void setDynamicStateManager(DynamicStateManager node) {
        setChild(node, 13);
    }
    /**
     * Retrieves the DynamicStateManager child.
     * @return The current node used as the DynamicStateManager child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="DynamicStateManager")
    public DynamicStateManager getDynamicStateManager() {
        return (DynamicStateManager) getChild(13);
    }
    /**
     * Retrieves the DynamicStateManager child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the DynamicStateManager child.
     * @apilevel low-level
     */
    public DynamicStateManager getDynamicStateManagerNoTransform() {
        return (DynamicStateManager) getChildNoTransform(13);
    }
    /**
     * Retrieves the UnknownFVariable child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the UnknownFVariable child.
     * @apilevel low-level
     */
    public UnknownFVariable getUnknownFVariableNoTransform() {
        return (UnknownFVariable) getChildNoTransform(14);
    }
    /**
     * Retrieves the child position of the optional child UnknownFVariable.
     * @return The the child position of the optional child UnknownFVariable.
     * @apilevel low-level
     */
    protected int getUnknownFVariableChildPosition() {
        return 14;
    }
    /**
     * Replaces the (optional) FDynamicResolver child.
     * @param node The new node to be used as the FDynamicResolver child.
     * @apilevel high-level
     */
    public void setFDynamicResolver(FDynamicResolver node) {
        getFDynamicResolverOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FDynamicResolver child exists.
     * @return {@code true} if the optional FDynamicResolver child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFDynamicResolver() {
        return getFDynamicResolverOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FDynamicResolver child.
     * @return The FDynamicResolver child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FDynamicResolver getFDynamicResolver() {
        return (FDynamicResolver) getFDynamicResolverOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child FDynamicResolver. This is the <code>Opt</code> node containing the child FDynamicResolver, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FDynamicResolver.
     * @apilevel low-level
     */
    public Opt<FDynamicResolver> getFDynamicResolverOptNoTransform() {
        return (Opt<FDynamicResolver>) getChildNoTransform(15);
    }
    /**
     * Retrieves the child position of the optional child FDynamicResolver.
     * @return The the child position of the optional child FDynamicResolver.
     * @apilevel low-level
     */
    protected int getFDynamicResolverOptChildPosition() {
        return 15;
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:352
     */
        private boolean collect_contributors_FClass_reals = false;
    protected void collect_contributors_FClass_reals() {
        if(collect_contributors_FClass_reals) return;
        super.collect_contributors_FClass_reals();
        collect_contributors_FClass_reals = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:357
     */
        private boolean collect_contributors_FClass_integers = false;
    protected void collect_contributors_FClass_integers() {
        if(collect_contributors_FClass_integers) return;
        super.collect_contributors_FClass_integers();
        collect_contributors_FClass_integers = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:362
     */
        private boolean collect_contributors_FClass_enums = false;
    protected void collect_contributors_FClass_enums() {
        if(collect_contributors_FClass_enums) return;
        super.collect_contributors_FClass_enums();
        collect_contributors_FClass_enums = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:367
     */
        private boolean collect_contributors_FClass_booleans = false;
    protected void collect_contributors_FClass_booleans() {
        if(collect_contributors_FClass_booleans) return;
        super.collect_contributors_FClass_booleans();
        collect_contributors_FClass_booleans = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:372
     */
        private boolean collect_contributors_FClass_strings = false;
    protected void collect_contributors_FClass_strings() {
        if(collect_contributors_FClass_strings) return;
        super.collect_contributors_FClass_strings();
        collect_contributors_FClass_strings = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:377
     */
        private boolean collect_contributors_FClass_independentConstants = false;
    protected void collect_contributors_FClass_independentConstants() {
        if(collect_contributors_FClass_independentConstants) return;
        super.collect_contributors_FClass_independentConstants();
        collect_contributors_FClass_independentConstants = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:384
     */
        private boolean collect_contributors_FClass_externalObjectVariables = false;
    protected void collect_contributors_FClass_externalObjectVariables() {
        if(collect_contributors_FClass_externalObjectVariables) return;
        super.collect_contributors_FClass_externalObjectVariables();
        collect_contributors_FClass_externalObjectVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:513
     */
        private boolean collect_contributors_FClass_regularIndependentParameters = false;
    protected void collect_contributors_FClass_regularIndependentParameters() {
        if(collect_contributors_FClass_regularIndependentParameters) return;
        super.collect_contributors_FClass_regularIndependentParameters();
        collect_contributors_FClass_regularIndependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:540
     */
        private boolean collect_contributors_FClass_structuralIndependentParameters = false;
    protected void collect_contributors_FClass_structuralIndependentParameters() {
        if(collect_contributors_FClass_structuralIndependentParameters) return;
        super.collect_contributors_FClass_structuralIndependentParameters();
        collect_contributors_FClass_structuralIndependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:567
     */
        private boolean collect_contributors_FClass_finalIndependentParameters = false;
    protected void collect_contributors_FClass_finalIndependentParameters() {
        if(collect_contributors_FClass_finalIndependentParameters) return;
        super.collect_contributors_FClass_finalIndependentParameters();
        collect_contributors_FClass_finalIndependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:594
     */
        private boolean collect_contributors_FClass_evalIndependentParameters = false;
    protected void collect_contributors_FClass_evalIndependentParameters() {
        if(collect_contributors_FClass_evalIndependentParameters) return;
        super.collect_contributors_FClass_evalIndependentParameters();
        collect_contributors_FClass_evalIndependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:621
     */
        private boolean collect_contributors_FClass_dependentParameters = false;
    protected void collect_contributors_FClass_dependentParameters() {
        if(collect_contributors_FClass_dependentParameters) return;
        super.collect_contributors_FClass_dependentParameters();
        collect_contributors_FClass_dependentParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:669
     */
        private boolean collect_contributors_FClass_allDifferentiatedRealVariables = false;
    protected void collect_contributors_FClass_allDifferentiatedRealVariables() {
        if(collect_contributors_FClass_allDifferentiatedRealVariables) return;
        super.collect_contributors_FClass_allDifferentiatedRealVariables();
        collect_contributors_FClass_allDifferentiatedRealVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:702
     */
        private boolean collect_contributors_FClass_dynamicStates = false;
    protected void collect_contributors_FClass_dynamicStates() {
        if(collect_contributors_FClass_dynamicStates) return;
        super.collect_contributors_FClass_dynamicStates();
        collect_contributors_FClass_dynamicStates = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:713
     */
        private boolean collect_contributors_FClass_dynamicStateVariables = false;
    protected void collect_contributors_FClass_dynamicStateVariables() {
        if(collect_contributors_FClass_dynamicStateVariables) return;
        super.collect_contributors_FClass_dynamicStateVariables();
        collect_contributors_FClass_dynamicStateVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:723
     */
        private boolean collect_contributors_FClass_dynamicAlgebraicVariables = false;
    protected void collect_contributors_FClass_dynamicAlgebraicVariables() {
        if(collect_contributors_FClass_dynamicAlgebraicVariables) return;
        super.collect_contributors_FClass_dynamicAlgebraicVariables();
        collect_contributors_FClass_dynamicAlgebraicVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:733
     */
        private boolean collect_contributors_FClass_differentiatedRealVariablesFilteredSet = false;
    protected void collect_contributors_FClass_differentiatedRealVariablesFilteredSet() {
        if(collect_contributors_FClass_differentiatedRealVariablesFilteredSet) return;
        super.collect_contributors_FClass_differentiatedRealVariablesFilteredSet();
        collect_contributors_FClass_differentiatedRealVariablesFilteredSet = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:747
     */
        private boolean collect_contributors_FClass_myFFunctionDeclsPartial = false;
    protected void collect_contributors_FClass_myFFunctionDeclsPartial() {
        if(collect_contributors_FClass_myFFunctionDeclsPartial) return;
        super.collect_contributors_FClass_myFFunctionDeclsPartial();
        collect_contributors_FClass_myFFunctionDeclsPartial = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:756
     */
        private boolean collect_contributors_FClass_myFFunctionDeclsPartialCalled = false;
    protected void collect_contributors_FClass_myFFunctionDeclsPartialCalled() {
        if(collect_contributors_FClass_myFFunctionDeclsPartialCalled) return;
        super.collect_contributors_FClass_myFFunctionDeclsPartialCalled();
        collect_contributors_FClass_myFFunctionDeclsPartialCalled = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:760
     */
        private boolean collect_contributors_FClass_myDelayExps = false;
    protected void collect_contributors_FClass_myDelayExps() {
        if(collect_contributors_FClass_myDelayExps) return;
        super.collect_contributors_FClass_myDelayExps();
        collect_contributors_FClass_myDelayExps = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:766
     */
        private boolean collect_contributors_FClass_mySpatialDistExps = false;
    protected void collect_contributors_FClass_mySpatialDistExps() {
        if(collect_contributors_FClass_mySpatialDistExps) return;
        super.collect_contributors_FClass_mySpatialDistExps();
        collect_contributors_FClass_mySpatialDistExps = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:785
     */
        private boolean collect_contributors_FClass_derivativeVariables = false;
    protected void collect_contributors_FClass_derivativeVariables() {
        if(collect_contributors_FClass_derivativeVariables) return;
        super.collect_contributors_FClass_derivativeVariables();
        collect_contributors_FClass_derivativeVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:792
     */
        private boolean collect_contributors_FClass_variables = false;
    protected void collect_contributors_FClass_variables() {
        if(collect_contributors_FClass_variables) return;
        super.collect_contributors_FClass_variables();
        collect_contributors_FClass_variables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:799
     */
        private boolean collect_contributors_FClass_discreteVariables = false;
    protected void collect_contributors_FClass_discreteVariables() {
        if(collect_contributors_FClass_discreteVariables) return;
        super.collect_contributors_FClass_discreteVariables();
        collect_contributors_FClass_discreteVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:818
     */
        private boolean collect_contributors_FClass_initialParameters = false;
    protected void collect_contributors_FClass_initialParameters() {
        if(collect_contributors_FClass_initialParameters) return;
        super.collect_contributors_FClass_initialParameters();
        collect_contributors_FClass_initialParameters = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:870
     */
        private boolean collect_contributors_FClass_aliasVariables = false;
    protected void collect_contributors_FClass_aliasVariables() {
        if(collect_contributors_FClass_aliasVariables) return;
        super.collect_contributors_FClass_aliasVariables();
        collect_contributors_FClass_aliasVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:889
     */
        private boolean collect_contributors_FClass_tempVariables = false;
    protected void collect_contributors_FClass_tempVariables() {
        if(collect_contributors_FClass_tempVariables) return;
        super.collect_contributors_FClass_tempVariables();
        collect_contributors_FClass_tempVariables = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:982
     */
        private boolean collect_contributors_FClass_variablesWithBindingExp = false;
    protected void collect_contributors_FClass_variablesWithBindingExp() {
        if(collect_contributors_FClass_variablesWithBindingExp) return;
        super.collect_contributors_FClass_variablesWithBindingExp();
        collect_contributors_FClass_variablesWithBindingExp = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1009
     */
        private boolean collect_contributors_FClass_inputs = false;
    protected void collect_contributors_FClass_inputs() {
        if(collect_contributors_FClass_inputs) return;
        super.collect_contributors_FClass_inputs();
        collect_contributors_FClass_inputs = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1039
     */
        private boolean collect_contributors_FClass_outputs = false;
    protected void collect_contributors_FClass_outputs() {
        if(collect_contributors_FClass_outputs) return;
        super.collect_contributors_FClass_outputs();
        collect_contributors_FClass_outputs = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1100
     */
        private boolean collect_contributors_FClass_algorithms = false;
    protected void collect_contributors_FClass_algorithms() {
        if(collect_contributors_FClass_algorithms) return;
        super.collect_contributors_FClass_algorithms();
        collect_contributors_FClass_algorithms = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1272
     */
        private boolean collect_contributors_FClass_sampleExpsWithTimeEvent = false;
    protected void collect_contributors_FClass_sampleExpsWithTimeEvent() {
        if(collect_contributors_FClass_sampleExpsWithTimeEvent) return;
        super.collect_contributors_FClass_sampleExpsWithTimeEvent();
        collect_contributors_FClass_sampleExpsWithTimeEvent = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1278
     */
        private boolean collect_contributors_FClass_spatialDistExpsWithStateEvent = false;
    protected void collect_contributors_FClass_spatialDistExpsWithStateEvent() {
        if(collect_contributors_FClass_spatialDistExpsWithStateEvent) return;
        super.collect_contributors_FClass_spatialDistExpsWithStateEvent();
        collect_contributors_FClass_spatialDistExpsWithStateEvent = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1284
     */
        private boolean collect_contributors_FClass_delayExpsWithStateEvent = false;
    protected void collect_contributors_FClass_delayExpsWithStateEvent() {
        if(collect_contributors_FClass_delayExpsWithStateEvent) return;
        super.collect_contributors_FClass_delayExpsWithStateEvent();
        collect_contributors_FClass_delayExpsWithStateEvent = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1391
     */
        private boolean collect_contributors_FClass_relExpsWithEvent = false;
    protected void collect_contributors_FClass_relExpsWithEvent() {
        if(collect_contributors_FClass_relExpsWithEvent) return;
        super.collect_contributors_FClass_relExpsWithEvent();
        collect_contributors_FClass_relExpsWithEvent = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1468
     */
        private boolean collect_contributors_FClass_relExpInInitialEquations = false;
    protected void collect_contributors_FClass_relExpInInitialEquations() {
        if(collect_contributors_FClass_relExpInInitialEquations) return;
        super.collect_contributors_FClass_relExpInInitialEquations();
        collect_contributors_FClass_relExpInInitialEquations = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3736
     */
        private boolean collect_contributors_FClass_myAlgorithms = false;
    protected void collect_contributors_FClass_myAlgorithms() {
        if(collect_contributors_FClass_myAlgorithms) return;
        super.collect_contributors_FClass_myAlgorithms();
        collect_contributors_FClass_myAlgorithms = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3819
     */
        private boolean collect_contributors_FClass_myExternals = false;
    protected void collect_contributors_FClass_myExternals() {
        if(collect_contributors_FClass_myExternals) return;
        super.collect_contributors_FClass_myExternals();
        collect_contributors_FClass_myExternals = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1783
     */
        private boolean collect_contributors_FClass_collectInstAccesses = false;
    protected void collect_contributors_FClass_collectInstAccesses() {
        if(collect_contributors_FClass_collectInstAccesses) return;
        super.collect_contributors_FClass_collectInstAccesses();
        collect_contributors_FClass_collectInstAccesses = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3326
     */
        private boolean collect_contributors_FClass_eventGenExps = false;
    protected void collect_contributors_FClass_eventGenExps() {
        if(collect_contributors_FClass_eventGenExps) return;
        super.collect_contributors_FClass_eventGenExps();
        collect_contributors_FClass_eventGenExps = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3647
     */
        private boolean collect_contributors_FClass_collectSemiLinearExps = false;
    protected void collect_contributors_FClass_collectSemiLinearExps() {
        if(collect_contributors_FClass_collectSemiLinearExps) return;
        super.collect_contributors_FClass_collectSemiLinearExps();
        collect_contributors_FClass_collectSemiLinearExps = true;
    }

    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2774
     */
        private boolean collect_contributors_FAbstractVariable_uses = false;
    protected void collect_contributors_FAbstractVariable_uses() {
        if(collect_contributors_FAbstractVariable_uses) return;
        super.collect_contributors_FAbstractVariable_uses();
        collect_contributors_FAbstractVariable_uses = true;
    }

    /**
     * @apilevel internal
     */
    protected boolean valueReferenceMap_computed = false;
    /**
     * @apilevel internal
     */
    protected ValueReferenceMap valueReferenceMap_value;
    /**
     * @apilevel internal
     */
    private void valueReferenceMap_reset() {
        valueReferenceMap_computed = false;
        valueReferenceMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ValueReferenceMap valueReferenceMap() {
        if(valueReferenceMap_computed) {
            return valueReferenceMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        valueReferenceMap_value = valueReferenceMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            valueReferenceMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return valueReferenceMap_value;
    }
    /**
     * @apilevel internal
     */
    private ValueReferenceMap valueReferenceMap_compute() {
            ValueReferenceMap map = new ValueReferenceMap();
            map.setType(0);
            map.add(independentRealConstants());
            map.add(dependentRealConstants());
            map.add(independentRealParameters());
            map.add(dependentRealParameters());
            
            map.setType(1);
            // Handle enums as Integers
            map.add(independentIntegerConstants());
            map.add(independentEnumConstants());
            map.add(dependentIntegerConstants());
            map.add(dependentEnumConstants());
            map.add(independentIntegerEnumParameters());
            map.add(dependentIntegerParameters());
            map.add(dependentEnumParameters());
            
            map.setType(2);
            map.add(independentBooleanConstants());
            map.add(dependentBooleanConstants());
            map.add(independentBooleanParameters());
            map.add(dependentBooleanParameters());
            
            map.setType(0);
            map.add(derivativeVariables());
            map.add(differentiatedRealVariables());
            map.add(realInputs());
            map.add(algebraicContinousRealVariables());
            
            // Need to increase the index counter by one since the
            // 'time' variable is stored in this position
            map.incIndex();
            
            // Need to increase the index counter by one since the
            // '_homotopy_lambda' variable is stored in this position
            map.incIndex();
            
            map.add(discreteRealVariables());
            
            map.setType(1);
            // Handle enums as Integers
            map.add(discreteIntegerVariables());
            map.add(discreteEnumVariables());
            map.add(integerInputs());
            map.add(enumInputs());
            
            map.setType(2);
            map.add(discreteBooleanVariables());
            map.add(booleanInputs());
            
            map.resetIndex();
            map.setType(3);
            map.add(independentStringConstants());
            map.add(dependentStringConstants());
            map.add(independentStringParameters());
            map.add(dependentStringParameters());
            map.add(stringInputs());
            map.add(discreteStringVariables());
            
            return map;
        }
    @ASTNodeAnnotation.Attribute
    public int independentRealConstantsOffset() {
        ASTNode$State state = state();
        int independentRealConstantsOffset_value = 0;

        return independentRealConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentIntegerConstantsOffset() {
        ASTNode$State state = state();
        int independentIntegerConstantsOffset_value = numIndependentRealConstants();

        return independentIntegerConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentEnumConstantsOffset() {
        ASTNode$State state = state();
        int independentEnumConstantsOffset_value = independentIntegerConstantsOffset() +     
                numIndependentIntegerConstants();

        return independentEnumConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentBooleanConstantsOffset() {
        ASTNode$State state = state();
        int independentBooleanConstantsOffset_value = independentEnumConstantsOffset() +    
                numIndependentEnumConstants();

        return independentBooleanConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentRealConstantsOffset() {
        ASTNode$State state = state();
        int dependentRealConstantsOffset_value = independentBooleanConstantsOffset() + 
                numIndependentBooleanConstants();

        return dependentRealConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentIntegerConstantsOffset() {
        ASTNode$State state = state();
        int dependentIntegerConstantsOffset_value = dependentRealConstantsOffset() +     
                numDependentRealConstants();

        return dependentIntegerConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentEnumConstantsOffset() {
        ASTNode$State state = state();
        int dependentEnumConstantsOffset_value = dependentIntegerConstantsOffset() +       
                numDependentIntegerConstants();

        return dependentEnumConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentBooleanConstantsOffset() {
        ASTNode$State state = state();
        int dependentBooleanConstantsOffset_value = dependentEnumConstantsOffset() +      
                numDependentEnumConstants();

        return dependentBooleanConstantsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentRealParametersOffset() {
        ASTNode$State state = state();
        int independentRealParametersOffset_value = dependentBooleanConstantsOffset() + 
                numDependentBooleanConstants();

        return independentRealParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentIntegerParametersOffset() {
        ASTNode$State state = state();
        int independentIntegerParametersOffset_value = independentRealParametersOffset() +      
                numIndependentRealParameters();

        return independentIntegerParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentEnumParametersOffset() {
        ASTNode$State state = state();
        int independentEnumParametersOffset_value = independentIntegerParametersOffset() +    
                numIndependentIntegerParameters();

        return independentEnumParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int independentBooleanParametersOffset() {
        ASTNode$State state = state();
        int independentBooleanParametersOffset_value = independentEnumParametersOffset() +       
                numIndependentEnumParameters();

        return independentBooleanParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentRealParametersOffset() {
        ASTNode$State state = state();
        int dependentRealParametersOffset_value = independentBooleanParametersOffset() + 
                numIndependentBooleanParameters();

        return dependentRealParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentIntegerParametersOffset() {
        ASTNode$State state = state();
        int dependentIntegerParametersOffset_value = dependentRealParametersOffset() +    
                numDependentRealParameters();

        return dependentIntegerParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentEnumParametersOffset() {
        ASTNode$State state = state();
        int dependentEnumParametersOffset_value = dependentIntegerParametersOffset() +      
                numDependentIntegerParameters();

        return dependentEnumParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int dependentBooleanParametersOffset() {
        ASTNode$State state = state();
        int dependentBooleanParametersOffset_value = dependentEnumParametersOffset() +     
                numDependentEnumParameters();

        return dependentBooleanParametersOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int derivativeVariablesOffset() {
        ASTNode$State state = state();
        int derivativeVariablesOffset_value = dependentBooleanParametersOffset() + 
                numDependentBooleanParameters();

        return derivativeVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int differentiatedRealVariablesOffset() {
        ASTNode$State state = state();
        int differentiatedRealVariablesOffset_value = derivativeVariablesOffset() + 
                numDerivativeVariables();

        return differentiatedRealVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int realInputsOffset() {
        ASTNode$State state = state();
        int realInputsOffset_value = differentiatedRealVariablesOffset() + 
                numDifferentiatedRealVariables();

        return realInputsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int algebraicContinousRealVariablesOffset() {
        ASTNode$State state = state();
        int algebraicContinousRealVariablesOffset_value = realInputsOffset() + 
                numRealInputs();

        return algebraicContinousRealVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int timeOffset() {
        ASTNode$State state = state();
        int timeOffset_value = algebraicContinousRealVariablesOffset() + 
                numAlgebraicContinousRealVariables();

        return timeOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int homotopyLambdaOffset() {
        ASTNode$State state = state();
        int homotopyLambdaOffset_value = timeOffset() + 1;

        return homotopyLambdaOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int discreteRealVariablesOffset() {
        ASTNode$State state = state();
        int discreteRealVariablesOffset_value = homotopyLambdaOffset() + 1;

        return discreteRealVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int discreteIntegerVariablesOffset() {
        ASTNode$State state = state();
        int discreteIntegerVariablesOffset_value = discreteRealVariablesOffset() + 
                numDiscreteRealVariables();

        return discreteIntegerVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int discreteEnumVariablesOffset() {
        ASTNode$State state = state();
        int discreteEnumVariablesOffset_value = discreteIntegerVariablesOffset() + 
                numDiscreteIntegerVariables();

        return discreteEnumVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int integerInputsOffset() {
        ASTNode$State state = state();
        int integerInputsOffset_value = discreteEnumVariablesOffset() + 
                numDiscreteEnumVariables();

        return integerInputsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int enumInputsOffset() {
        ASTNode$State state = state();
        int enumInputsOffset_value = integerInputsOffset() + 
                numIntegerInputs();

        return enumInputsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int discreteBooleanVariablesOffset() {
        ASTNode$State state = state();
        int discreteBooleanVariablesOffset_value = enumInputsOffset() + 
                numEnumInputs();

        return discreteBooleanVariablesOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int booleanInputsOffset() {
        ASTNode$State state = state();
        int booleanInputsOffset_value = discreteBooleanVariablesOffset() + 
                numDiscreteBooleanVariables();

        return booleanInputsOffset_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numReals() {
        ASTNode$State state = state();
        int numReals_value = reals().size();

        return numReals_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIntegers() {
        ASTNode$State state = state();
        int numIntegers_value = integers().size();

        return numIntegers_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEnums() {
        ASTNode$State state = state();
        int numEnums_value = enums().size();

        return numEnums_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numBooleans() {
        ASTNode$State state = state();
        int numBooleans_value = booleans().size();

        return numBooleans_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStrings() {
        ASTNode$State state = state();
        int numStrings_value = strings().size();

        return numStrings_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentConstants() {
        ASTNode$State state = state();
        int numIndependentConstants_value = independentConstants().size();

        return numIndependentConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numExternalObjectVariables() {
        ASTNode$State state = state();
        int numExternalObjectVariables_value = externalObjectVariables().size();

        return numExternalObjectVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentRealConstants() {
        ASTNode$State state = state();
        int numIndependentRealConstants_value = independentRealConstants().size();

        return numIndependentRealConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentRealConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> independentRealConstants_value;
    /**
     * @apilevel internal
     */
    private void independentRealConstants_reset() {
        independentRealConstants_computed = false;
        independentRealConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> independentRealConstants() {
        if(independentRealConstants_computed) {
            return independentRealConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentRealConstants_value = filterCollection(independentConstants(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            independentRealConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentRealConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentIntegerConstants() {
        ASTNode$State state = state();
        int numIndependentIntegerConstants_value = independentIntegerConstants().size();

        return numIndependentIntegerConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentIntegerConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> independentIntegerConstants_value;
    /**
     * @apilevel internal
     */
    private void independentIntegerConstants_reset() {
        independentIntegerConstants_computed = false;
        independentIntegerConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> independentIntegerConstants() {
        if(independentIntegerConstants_computed) {
            return independentIntegerConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentIntegerConstants_value = filterCollection(independentConstants(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            independentIntegerConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentIntegerConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentEnumConstants() {
        ASTNode$State state = state();
        int numIndependentEnumConstants_value = independentEnumConstants().size();

        return numIndependentEnumConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentEnumConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> independentEnumConstants_value;
    /**
     * @apilevel internal
     */
    private void independentEnumConstants_reset() {
        independentEnumConstants_computed = false;
        independentEnumConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> independentEnumConstants() {
        if(independentEnumConstants_computed) {
            return independentEnumConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentEnumConstants_value = filterCollection(independentConstants(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            independentEnumConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentEnumConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentBooleanConstants() {
        ASTNode$State state = state();
        int numIndependentBooleanConstants_value = independentBooleanConstants().size();

        return numIndependentBooleanConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentBooleanConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> independentBooleanConstants_value;
    /**
     * @apilevel internal
     */
    private void independentBooleanConstants_reset() {
        independentBooleanConstants_computed = false;
        independentBooleanConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> independentBooleanConstants() {
        if(independentBooleanConstants_computed) {
            return independentBooleanConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentBooleanConstants_value = filterCollection(independentConstants(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            independentBooleanConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentBooleanConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentStringConstants() {
        ASTNode$State state = state();
        int numIndependentStringConstants_value = independentStringConstants().size();

        return numIndependentStringConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentStringConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> independentStringConstants_value;
    /**
     * @apilevel internal
     */
    private void independentStringConstants_reset() {
        independentStringConstants_computed = false;
        independentStringConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> independentStringConstants() {
        if(independentStringConstants_computed) {
            return independentStringConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentStringConstants_value = filterCollection(independentConstants(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            independentStringConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentStringConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentConstants() {
        ASTNode$State state = state();
        int numDependentConstants_value = dependentConstants().size();

        return numDependentConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> dependentConstants() {
        ASTNode$State state = state();
        ArrayList<FVariable> dependentConstants_value = new ArrayList<FVariable>(0);

        return dependentConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentRealConstants() {
        ASTNode$State state = state();
        int numDependentRealConstants_value = dependentRealConstants().size();

        return numDependentRealConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentRealConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> dependentRealConstants_value;
    /**
     * @apilevel internal
     */
    private void dependentRealConstants_reset() {
        dependentRealConstants_computed = false;
        dependentRealConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> dependentRealConstants() {
        if(dependentRealConstants_computed) {
            return dependentRealConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentRealConstants_value = filterCollection(dependentConstants(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentRealConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentRealConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentIntegerConstants() {
        ASTNode$State state = state();
        int numDependentIntegerConstants_value = dependentIntegerConstants().size();

        return numDependentIntegerConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentIntegerConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> dependentIntegerConstants_value;
    /**
     * @apilevel internal
     */
    private void dependentIntegerConstants_reset() {
        dependentIntegerConstants_computed = false;
        dependentIntegerConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> dependentIntegerConstants() {
        if(dependentIntegerConstants_computed) {
            return dependentIntegerConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentIntegerConstants_value = filterCollection(dependentConstants(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentIntegerConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentIntegerConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentEnumConstants() {
        ASTNode$State state = state();
        int numDependentEnumConstants_value = dependentEnumConstants().size();

        return numDependentEnumConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentEnumConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> dependentEnumConstants_value;
    /**
     * @apilevel internal
     */
    private void dependentEnumConstants_reset() {
        dependentEnumConstants_computed = false;
        dependentEnumConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> dependentEnumConstants() {
        if(dependentEnumConstants_computed) {
            return dependentEnumConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentEnumConstants_value = filterCollection(dependentConstants(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentEnumConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentEnumConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentBooleanConstants() {
        ASTNode$State state = state();
        int numDependentBooleanConstants_value = dependentBooleanConstants().size();

        return numDependentBooleanConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentBooleanConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> dependentBooleanConstants_value;
    /**
     * @apilevel internal
     */
    private void dependentBooleanConstants_reset() {
        dependentBooleanConstants_computed = false;
        dependentBooleanConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> dependentBooleanConstants() {
        if(dependentBooleanConstants_computed) {
            return dependentBooleanConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentBooleanConstants_value = filterCollection(dependentConstants(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentBooleanConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentBooleanConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentStringConstants() {
        ASTNode$State state = state();
        int numDependentStringConstants_value = dependentStringConstants().size();

        return numDependentStringConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentStringConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> dependentStringConstants_value;
    /**
     * @apilevel internal
     */
    private void dependentStringConstants_reset() {
        dependentStringConstants_computed = false;
        dependentStringConstants_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> dependentStringConstants() {
        if(dependentStringConstants_computed) {
            return dependentStringConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentStringConstants_value = filterCollection(dependentConstants(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentStringConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentStringConstants_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIndependentParameters() {
        ASTNode$State state = state();
        int numIndependentParameters_value = independentParameters().size();

        return numIndependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> independentParameters_value;
    /**
     * @apilevel internal
     */
    private void independentParameters_reset() {
        independentParameters_computed = false;
        independentParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> independentParameters() {
        if(independentParameters_computed) {
            return independentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentParameters_value = independentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> independentParameters_compute() {
            ArrayList<FVariable> l = new ArrayList<FVariable>();
            l.addAll(regularIndependentParameters());
            l.addAll(structuralIndependentParameters());
            l.addAll(finalIndependentParameters());
            l.addAll(evalIndependentParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentIntegerEnumParameters() {
        ASTNode$State state = state();
        int numIndependentIntegerEnumParameters_value = independentIntegerEnumParameters().size();

        return numIndependentIntegerEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentIntegerEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> independentIntegerEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void independentIntegerEnumParameters_reset() {
        independentIntegerEnumParameters_computed = false;
        independentIntegerEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> independentIntegerEnumParameters() {
        if(independentIntegerEnumParameters_computed) {
            return independentIntegerEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentIntegerEnumParameters_value = independentIntegerEnumParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentIntegerEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentIntegerEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> independentIntegerEnumParameters_compute() {
            ArrayList<FVariable> l = new ArrayList<FVariable>();
            l.addAll(regularIndependentIntegerParameters());
            l.addAll(regularIndependentEnumParameters());
            l.addAll(structuralIndependentIntegerParameters());
            l.addAll(structuralIndependentEnumParameters());
            l.addAll(finalIndependentIntegerParameters());
            l.addAll(finalIndependentEnumParameters());
            l.addAll(evalIndependentIntegerParameters());
            l.addAll(evalIndependentEnumParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentRealParameters() {
        ASTNode$State state = state();
        int numIndependentRealParameters_value = independentRealParameters().size();

        return numIndependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRealVariable> independentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void independentRealParameters_reset() {
        independentRealParameters_computed = false;
        independentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRealVariable> independentRealParameters() {
        if(independentRealParameters_computed) {
            return independentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentRealParameters_value = independentRealParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FRealVariable> independentRealParameters_compute() {
            ArrayList<FRealVariable> l = new ArrayList<FRealVariable>();
            l.addAll(regularIndependentRealParameters());
            l.addAll(structuralIndependentRealParameters());
            l.addAll(finalIndependentRealParameters());
            l.addAll(evalIndependentRealParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentIntegerParameters() {
        ASTNode$State state = state();
        int numIndependentIntegerParameters_value = independentIntegerParameters().size();

        return numIndependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FIntegerVariable> independentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void independentIntegerParameters_reset() {
        independentIntegerParameters_computed = false;
        independentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FIntegerVariable> independentIntegerParameters() {
        if(independentIntegerParameters_computed) {
            return independentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentIntegerParameters_value = independentIntegerParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FIntegerVariable> independentIntegerParameters_compute() {
            ArrayList<FIntegerVariable> l = new ArrayList<FIntegerVariable>();
            l.addAll(regularIndependentIntegerParameters());
            l.addAll(structuralIndependentIntegerParameters());
            l.addAll(finalIndependentIntegerParameters());
            l.addAll(evalIndependentIntegerParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentEnumParameters() {
        ASTNode$State state = state();
        int numIndependentEnumParameters_value = independentEnumParameters().size();

        return numIndependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FEnumVariable> independentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void independentEnumParameters_reset() {
        independentEnumParameters_computed = false;
        independentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FEnumVariable> independentEnumParameters() {
        if(independentEnumParameters_computed) {
            return independentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentEnumParameters_value = independentEnumParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FEnumVariable> independentEnumParameters_compute() {
            ArrayList<FEnumVariable> l = new ArrayList<FEnumVariable>();
            l.addAll(regularIndependentEnumParameters());
            l.addAll(structuralIndependentEnumParameters());
            l.addAll(finalIndependentEnumParameters());
            l.addAll(evalIndependentEnumParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentBooleanParameters() {
        ASTNode$State state = state();
        int numIndependentBooleanParameters_value = independentBooleanParameters().size();

        return numIndependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FBooleanVariable> independentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void independentBooleanParameters_reset() {
        independentBooleanParameters_computed = false;
        independentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FBooleanVariable> independentBooleanParameters() {
        if(independentBooleanParameters_computed) {
            return independentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentBooleanParameters_value = independentBooleanParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FBooleanVariable> independentBooleanParameters_compute() {
            ArrayList<FBooleanVariable> l = new ArrayList<FBooleanVariable>();
            l.addAll(regularIndependentBooleanParameters());
            l.addAll(structuralIndependentBooleanParameters());
            l.addAll(finalIndependentBooleanParameters());
            l.addAll(evalIndependentBooleanParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numIndependentStringParameters() {
        ASTNode$State state = state();
        int numIndependentStringParameters_value = independentStringParameters().size();

        return numIndependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean independentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FStringVariable> independentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void independentStringParameters_reset() {
        independentStringParameters_computed = false;
        independentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FStringVariable> independentStringParameters() {
        if(independentStringParameters_computed) {
            return independentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        independentStringParameters_value = independentStringParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            independentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return independentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FStringVariable> independentStringParameters_compute() {
            ArrayList<FStringVariable> l = new ArrayList<FStringVariable>();
            l.addAll(regularIndependentStringParameters());
            l.addAll(structuralIndependentStringParameters());
            l.addAll(finalIndependentStringParameters());
            l.addAll(evalIndependentStringParameters());
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentParameters() {
        ASTNode$State state = state();
        int numRegularIndependentParameters_value = regularIndependentParameters().size();

        return numRegularIndependentParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentRealParameters() {
        ASTNode$State state = state();
        int numRegularIndependentRealParameters_value = regularIndependentRealParameters().size();

        return numRegularIndependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean regularIndependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> regularIndependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void regularIndependentRealParameters_reset() {
        regularIndependentRealParameters_computed = false;
        regularIndependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> regularIndependentRealParameters() {
        if(regularIndependentRealParameters_computed) {
            return regularIndependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        regularIndependentRealParameters_value = filterCollection(regularIndependentParameters(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            regularIndependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return regularIndependentRealParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentIntegerParameters() {
        ASTNode$State state = state();
        int numRegularIndependentIntegerParameters_value = regularIndependentIntegerParameters().size();

        return numRegularIndependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean regularIndependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> regularIndependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void regularIndependentIntegerParameters_reset() {
        regularIndependentIntegerParameters_computed = false;
        regularIndependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> regularIndependentIntegerParameters() {
        if(regularIndependentIntegerParameters_computed) {
            return regularIndependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        regularIndependentIntegerParameters_value = filterCollection(regularIndependentParameters(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            regularIndependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return regularIndependentIntegerParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentEnumParameters() {
        ASTNode$State state = state();
        int numRegularIndependentEnumParameters_value = regularIndependentEnumParameters().size();

        return numRegularIndependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean regularIndependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> regularIndependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void regularIndependentEnumParameters_reset() {
        regularIndependentEnumParameters_computed = false;
        regularIndependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> regularIndependentEnumParameters() {
        if(regularIndependentEnumParameters_computed) {
            return regularIndependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        regularIndependentEnumParameters_value = filterCollection(regularIndependentParameters(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            regularIndependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return regularIndependentEnumParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentBooleanParameters() {
        ASTNode$State state = state();
        int numRegularIndependentBooleanParameters_value = regularIndependentBooleanParameters().size();

        return numRegularIndependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean regularIndependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> regularIndependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void regularIndependentBooleanParameters_reset() {
        regularIndependentBooleanParameters_computed = false;
        regularIndependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> regularIndependentBooleanParameters() {
        if(regularIndependentBooleanParameters_computed) {
            return regularIndependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        regularIndependentBooleanParameters_value = filterCollection(regularIndependentParameters(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            regularIndependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return regularIndependentBooleanParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRegularIndependentStringParameters() {
        ASTNode$State state = state();
        int numRegularIndependentStringParameters_value = regularIndependentStringParameters().size();

        return numRegularIndependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean regularIndependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> regularIndependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void regularIndependentStringParameters_reset() {
        regularIndependentStringParameters_computed = false;
        regularIndependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> regularIndependentStringParameters() {
        if(regularIndependentStringParameters_computed) {
            return regularIndependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        regularIndependentStringParameters_value = filterCollection(regularIndependentParameters(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            regularIndependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return regularIndependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentParameters_value = structuralIndependentParameters().size();

        return numStructuralIndependentParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentRealParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentRealParameters_value = structuralIndependentRealParameters().size();

        return numStructuralIndependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean structuralIndependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> structuralIndependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void structuralIndependentRealParameters_reset() {
        structuralIndependentRealParameters_computed = false;
        structuralIndependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> structuralIndependentRealParameters() {
        if(structuralIndependentRealParameters_computed) {
            return structuralIndependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        structuralIndependentRealParameters_value = filterCollection(structuralIndependentParameters(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            structuralIndependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return structuralIndependentRealParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentIntegerParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentIntegerParameters_value = structuralIndependentIntegerParameters().size();

        return numStructuralIndependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean structuralIndependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> structuralIndependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void structuralIndependentIntegerParameters_reset() {
        structuralIndependentIntegerParameters_computed = false;
        structuralIndependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> structuralIndependentIntegerParameters() {
        if(structuralIndependentIntegerParameters_computed) {
            return structuralIndependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        structuralIndependentIntegerParameters_value = filterCollection(structuralIndependentParameters(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            structuralIndependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return structuralIndependentIntegerParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentEnumParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentEnumParameters_value = structuralIndependentEnumParameters().size();

        return numStructuralIndependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean structuralIndependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> structuralIndependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void structuralIndependentEnumParameters_reset() {
        structuralIndependentEnumParameters_computed = false;
        structuralIndependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> structuralIndependentEnumParameters() {
        if(structuralIndependentEnumParameters_computed) {
            return structuralIndependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        structuralIndependentEnumParameters_value = filterCollection(structuralIndependentParameters(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            structuralIndependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return structuralIndependentEnumParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentBooleanParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentBooleanParameters_value = structuralIndependentBooleanParameters().size();

        return numStructuralIndependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean structuralIndependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> structuralIndependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void structuralIndependentBooleanParameters_reset() {
        structuralIndependentBooleanParameters_computed = false;
        structuralIndependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> structuralIndependentBooleanParameters() {
        if(structuralIndependentBooleanParameters_computed) {
            return structuralIndependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        structuralIndependentBooleanParameters_value = filterCollection(structuralIndependentParameters(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            structuralIndependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return structuralIndependentBooleanParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStructuralIndependentStringParameters() {
        ASTNode$State state = state();
        int numStructuralIndependentStringParameters_value = structuralIndependentStringParameters().size();

        return numStructuralIndependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean structuralIndependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> structuralIndependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void structuralIndependentStringParameters_reset() {
        structuralIndependentStringParameters_computed = false;
        structuralIndependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> structuralIndependentStringParameters() {
        if(structuralIndependentStringParameters_computed) {
            return structuralIndependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        structuralIndependentStringParameters_value = filterCollection(structuralIndependentParameters(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            structuralIndependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return structuralIndependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentParameters() {
        ASTNode$State state = state();
        int numFinalIndependentParameters_value = finalIndependentParameters().size();

        return numFinalIndependentParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentRealParameters() {
        ASTNode$State state = state();
        int numFinalIndependentRealParameters_value = finalIndependentRealParameters().size();

        return numFinalIndependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean finalIndependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> finalIndependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void finalIndependentRealParameters_reset() {
        finalIndependentRealParameters_computed = false;
        finalIndependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> finalIndependentRealParameters() {
        if(finalIndependentRealParameters_computed) {
            return finalIndependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        finalIndependentRealParameters_value = filterCollection(finalIndependentParameters(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            finalIndependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return finalIndependentRealParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentIntegerParameters() {
        ASTNode$State state = state();
        int numFinalIndependentIntegerParameters_value = finalIndependentIntegerParameters().size();

        return numFinalIndependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean finalIndependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> finalIndependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void finalIndependentIntegerParameters_reset() {
        finalIndependentIntegerParameters_computed = false;
        finalIndependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> finalIndependentIntegerParameters() {
        if(finalIndependentIntegerParameters_computed) {
            return finalIndependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        finalIndependentIntegerParameters_value = filterCollection(finalIndependentParameters(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            finalIndependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return finalIndependentIntegerParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentEnumParameters() {
        ASTNode$State state = state();
        int numFinalIndependentEnumParameters_value = finalIndependentEnumParameters().size();

        return numFinalIndependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean finalIndependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> finalIndependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void finalIndependentEnumParameters_reset() {
        finalIndependentEnumParameters_computed = false;
        finalIndependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> finalIndependentEnumParameters() {
        if(finalIndependentEnumParameters_computed) {
            return finalIndependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        finalIndependentEnumParameters_value = filterCollection(finalIndependentParameters(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            finalIndependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return finalIndependentEnumParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentBooleanParameters() {
        ASTNode$State state = state();
        int numFinalIndependentBooleanParameters_value = finalIndependentBooleanParameters().size();

        return numFinalIndependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean finalIndependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> finalIndependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void finalIndependentBooleanParameters_reset() {
        finalIndependentBooleanParameters_computed = false;
        finalIndependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> finalIndependentBooleanParameters() {
        if(finalIndependentBooleanParameters_computed) {
            return finalIndependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        finalIndependentBooleanParameters_value = filterCollection(finalIndependentParameters(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            finalIndependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return finalIndependentBooleanParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFinalIndependentStringParameters() {
        ASTNode$State state = state();
        int numFinalIndependentStringParameters_value = finalIndependentStringParameters().size();

        return numFinalIndependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean finalIndependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> finalIndependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void finalIndependentStringParameters_reset() {
        finalIndependentStringParameters_computed = false;
        finalIndependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> finalIndependentStringParameters() {
        if(finalIndependentStringParameters_computed) {
            return finalIndependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        finalIndependentStringParameters_value = filterCollection(finalIndependentParameters(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            finalIndependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return finalIndependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentParameters() {
        ASTNode$State state = state();
        int numEvalIndependentParameters_value = evalIndependentParameters().size();

        return numEvalIndependentParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentRealParameters() {
        ASTNode$State state = state();
        int numEvalIndependentRealParameters_value = evalIndependentRealParameters().size();

        return numEvalIndependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean evalIndependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> evalIndependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void evalIndependentRealParameters_reset() {
        evalIndependentRealParameters_computed = false;
        evalIndependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> evalIndependentRealParameters() {
        if(evalIndependentRealParameters_computed) {
            return evalIndependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        evalIndependentRealParameters_value = filterCollection(evalIndependentParameters(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            evalIndependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return evalIndependentRealParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentIntegerParameters() {
        ASTNode$State state = state();
        int numEvalIndependentIntegerParameters_value = evalIndependentIntegerParameters().size();

        return numEvalIndependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean evalIndependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> evalIndependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void evalIndependentIntegerParameters_reset() {
        evalIndependentIntegerParameters_computed = false;
        evalIndependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> evalIndependentIntegerParameters() {
        if(evalIndependentIntegerParameters_computed) {
            return evalIndependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        evalIndependentIntegerParameters_value = filterCollection(evalIndependentParameters(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            evalIndependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return evalIndependentIntegerParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentEnumParameters() {
        ASTNode$State state = state();
        int numEvalIndependentEnumParameters_value = evalIndependentEnumParameters().size();

        return numEvalIndependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean evalIndependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> evalIndependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void evalIndependentEnumParameters_reset() {
        evalIndependentEnumParameters_computed = false;
        evalIndependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> evalIndependentEnumParameters() {
        if(evalIndependentEnumParameters_computed) {
            return evalIndependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        evalIndependentEnumParameters_value = filterCollection(evalIndependentParameters(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            evalIndependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return evalIndependentEnumParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentBooleanParameters() {
        ASTNode$State state = state();
        int numEvalIndependentBooleanParameters_value = evalIndependentBooleanParameters().size();

        return numEvalIndependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean evalIndependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> evalIndependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void evalIndependentBooleanParameters_reset() {
        evalIndependentBooleanParameters_computed = false;
        evalIndependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> evalIndependentBooleanParameters() {
        if(evalIndependentBooleanParameters_computed) {
            return evalIndependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        evalIndependentBooleanParameters_value = filterCollection(evalIndependentParameters(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            evalIndependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return evalIndependentBooleanParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEvalIndependentStringParameters() {
        ASTNode$State state = state();
        int numEvalIndependentStringParameters_value = evalIndependentStringParameters().size();

        return numEvalIndependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean evalIndependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> evalIndependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void evalIndependentStringParameters_reset() {
        evalIndependentStringParameters_computed = false;
        evalIndependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> evalIndependentStringParameters() {
        if(evalIndependentStringParameters_computed) {
            return evalIndependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        evalIndependentStringParameters_value = filterCollection(evalIndependentParameters(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            evalIndependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return evalIndependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentParameters() {
        ASTNode$State state = state();
        int numDependentParameters_value = dependentParameters().size();

        return numDependentParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentRealParameters() {
        ASTNode$State state = state();
        int numDependentRealParameters_value = dependentRealParameters().size();

        return numDependentRealParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentRealParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> dependentRealParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentRealParameters_reset() {
        dependentRealParameters_computed = false;
        dependentRealParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> dependentRealParameters() {
        if(dependentRealParameters_computed) {
            return dependentRealParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentRealParameters_value = filterCollection(dependentParameters(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentRealParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentRealParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentIntegerParameters() {
        ASTNode$State state = state();
        int numDependentIntegerParameters_value = dependentIntegerParameters().size();

        return numDependentIntegerParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentIntegerParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> dependentIntegerParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentIntegerParameters_reset() {
        dependentIntegerParameters_computed = false;
        dependentIntegerParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> dependentIntegerParameters() {
        if(dependentIntegerParameters_computed) {
            return dependentIntegerParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentIntegerParameters_value = filterCollection(dependentParameters(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentIntegerParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentIntegerParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentEnumParameters() {
        ASTNode$State state = state();
        int numDependentEnumParameters_value = dependentEnumParameters().size();

        return numDependentEnumParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentEnumParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> dependentEnumParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentEnumParameters_reset() {
        dependentEnumParameters_computed = false;
        dependentEnumParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> dependentEnumParameters() {
        if(dependentEnumParameters_computed) {
            return dependentEnumParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentEnumParameters_value = filterCollection(dependentParameters(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentEnumParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentEnumParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentBooleanParameters() {
        ASTNode$State state = state();
        int numDependentBooleanParameters_value = dependentBooleanParameters().size();

        return numDependentBooleanParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentBooleanParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> dependentBooleanParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentBooleanParameters_reset() {
        dependentBooleanParameters_computed = false;
        dependentBooleanParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> dependentBooleanParameters() {
        if(dependentBooleanParameters_computed) {
            return dependentBooleanParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentBooleanParameters_value = filterCollection(dependentParameters(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentBooleanParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentBooleanParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDependentStringParameters() {
        ASTNode$State state = state();
        int numDependentStringParameters_value = dependentStringParameters().size();

        return numDependentStringParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean dependentStringParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> dependentStringParameters_value;
    /**
     * @apilevel internal
     */
    private void dependentStringParameters_reset() {
        dependentStringParameters_computed = false;
        dependentStringParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> dependentStringParameters() {
        if(dependentStringParameters_computed) {
            return dependentStringParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependentStringParameters_value = filterCollection(dependentParameters(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            dependentStringParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependentStringParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteRealVariables() {
        ASTNode$State state = state();
        int numDiscreteRealVariables_value = discreteRealVariables().size();

        return numDiscreteRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> discreteRealVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteRealVariables_reset() {
        discreteRealVariables_computed = false;
        discreteRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> discreteRealVariables() {
        if(discreteRealVariables_computed) {
            return discreteRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteRealVariables_value = filterCollection(discreteVariables(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            discreteRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteRealVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteIntegerVariables() {
        ASTNode$State state = state();
        int numDiscreteIntegerVariables_value = discreteIntegerVariables().size();

        return numDiscreteIntegerVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteIntegerVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> discreteIntegerVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteIntegerVariables_reset() {
        discreteIntegerVariables_computed = false;
        discreteIntegerVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> discreteIntegerVariables() {
        if(discreteIntegerVariables_computed) {
            return discreteIntegerVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteIntegerVariables_value = filterCollection(discreteVariables(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            discreteIntegerVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteIntegerVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteEnumVariables() {
        ASTNode$State state = state();
        int numDiscreteEnumVariables_value = discreteEnumVariables().size();

        return numDiscreteEnumVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteEnumVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> discreteEnumVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteEnumVariables_reset() {
        discreteEnumVariables_computed = false;
        discreteEnumVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> discreteEnumVariables() {
        if(discreteEnumVariables_computed) {
            return discreteEnumVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteEnumVariables_value = filterCollection(discreteVariables(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            discreteEnumVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteEnumVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteBooleanVariables() {
        ASTNode$State state = state();
        int numDiscreteBooleanVariables_value = discreteBooleanVariables().size();

        return numDiscreteBooleanVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteBooleanVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> discreteBooleanVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteBooleanVariables_reset() {
        discreteBooleanVariables_computed = false;
        discreteBooleanVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> discreteBooleanVariables() {
        if(discreteBooleanVariables_computed) {
            return discreteBooleanVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteBooleanVariables_value = filterCollection(discreteVariables(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            discreteBooleanVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteBooleanVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteStringVariables() {
        ASTNode$State state = state();
        int numDiscreteStringVariables_value = discreteStringVariables().size();

        return numDiscreteStringVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discreteStringVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> discreteStringVariables_value;
    /**
     * @apilevel internal
     */
    private void discreteStringVariables_reset() {
        discreteStringVariables_computed = false;
        discreteStringVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> discreteStringVariables() {
        if(discreteStringVariables_computed) {
            return discreteStringVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discreteStringVariables_value = filterCollection(discreteVariables(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            discreteStringVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discreteStringVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDifferentiatedRealVariables() {
        ASTNode$State state = state();
        int numDifferentiatedRealVariables_value = differentiatedRealVariables().size();

        return numDifferentiatedRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean differentiatedRealVariablesList_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRealVariable> differentiatedRealVariablesList_value;
    /**
     * @apilevel internal
     */
    private void differentiatedRealVariablesList_reset() {
        differentiatedRealVariablesList_computed = false;
        differentiatedRealVariablesList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRealVariable> differentiatedRealVariablesList() {
        if(differentiatedRealVariablesList_computed) {
            return differentiatedRealVariablesList_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        differentiatedRealVariablesList_value = differentiatedRealVariablesList_compute();
        if (isFinal && num == state().boundariesCrossed) {
            differentiatedRealVariablesList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return differentiatedRealVariablesList_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FRealVariable> differentiatedRealVariablesList_compute() {
            ArrayList<FRealVariable> l = new ArrayList<FRealVariable>();
            for (FRealVariable fv : differentiatedRealVariables()) 
                l.add(fv);
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean differentiatedRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FRealVariable> differentiatedRealVariables_value;
    /**
     * @apilevel internal
     */
    private void differentiatedRealVariables_reset() {
        differentiatedRealVariables_computed = false;
        differentiatedRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FRealVariable> differentiatedRealVariables() {
        if(differentiatedRealVariables_computed) {
            return differentiatedRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        differentiatedRealVariables_value = differentiatedRealVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            differentiatedRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return differentiatedRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    private LinkedHashSet<FRealVariable> differentiatedRealVariables_compute() {
            LinkedHashSet<FRealVariable> set = new LinkedHashSet<FRealVariable>(allDifferentiatedRealVariables());
            set.removeAll(dynamicStates());
            return set;
        }
    @ASTNodeAnnotation.Attribute
    public int numDynamicStates() {
        ASTNode$State state = state();
        int numDynamicStates_value = dynamicStates().size();

        return numDynamicStates_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDynamicStateVariables() {
        ASTNode$State state = state();
        int numDynamicStateVariables_value = dynamicStateVariables().size();

        return numDynamicStateVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDynamicAlgebraicVariables() {
        ASTNode$State state = state();
        int numDynamicAlgebraicVariables_value = dynamicAlgebraicVariables().size();

        return numDynamicAlgebraicVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDerivativeVariables() {
        ASTNode$State state = state();
        int numDerivativeVariables_value = derivativeVariables().size();

        return numDerivativeVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numVariables() {
        ASTNode$State state = state();
        int numVariables_value = variables().size();

        return numVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscreteVariables() {
        ASTNode$State state = state();
        int numDiscreteVariables_value = discreteVariables().size();

        return numDiscreteVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numInitialParameters() {
        ASTNode$State state = state();
        int numInitialParameters_value = initialParameters().size();

        return numInitialParameters_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDiscretePreVariables() {
        ASTNode$State state = state();
        int numDiscretePreVariables_value = discretePreVariables().size();

        return numDiscretePreVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean discretePreVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> discretePreVariables_value;
    /**
     * @apilevel internal
     */
    private void discretePreVariables_reset() {
        discretePreVariables_computed = false;
        discretePreVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> discretePreVariables() {
        if(discretePreVariables_computed) {
            return discretePreVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        discretePreVariables_value = discretePreVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            discretePreVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return discretePreVariables_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> discretePreVariables_compute() {
            ArrayList<FVariable> l = new ArrayList<FVariable>();
            for (FVariable fv : discreteVariables()) {
                l.add((FVariable) lookupFV(fv.getFQName().preName()));
            }
            for (FVariable fv : continuousVariablesUsedInPreInInitial()) {
                l.add((FVariable) lookupFV(fv.getFQName().preName()));
            }
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numAliasVariables() {
        ASTNode$State state = state();
        int numAliasVariables_value = aliasVariables().size();

        return numAliasVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numAllVariables() {
        ASTNode$State state = state();
        int numAllVariables_value = allVariables().size();

        return numAllVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean allVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> allVariables_value;
    /**
     * @apilevel internal
     */
    private void allVariables_reset() {
        allVariables_computed = false;
        allVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> allVariables() {
        if(allVariables_computed) {
            return allVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        allVariables_value = allVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            allVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return allVariables_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> allVariables_compute() {
              ArrayList<FVariable> set = new ArrayList<FVariable>();
              for (FVariable fv : getFVariables()) {
                      set.add(fv);
                  }
              for (FVariable fv : getAliasVariables()) {
                      set.add(fv);
                  }
              return set;
        }
    @ASTNodeAnnotation.Attribute
    public int numTempVariables() {
        ASTNode$State state = state();
        int numTempVariables_value = tempVariables().size();

        return numTempVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRealVariables() {
        ASTNode$State state = state();
        int numRealVariables_value = realVariables().size();

        return numRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean realVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> realVariables_value;
    /**
     * @apilevel internal
     */
    private void realVariables_reset() {
        realVariables_computed = false;
        realVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> realVariables() {
        if(realVariables_computed) {
            return realVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realVariables_value = filterCollection(variables(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            realVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIntegerVariables() {
        ASTNode$State state = state();
        int numIntegerVariables_value = integerVariables().size();

        return numIntegerVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean integerVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FIntegerVariable> integerVariables_value;
    /**
     * @apilevel internal
     */
    private void integerVariables_reset() {
        integerVariables_computed = false;
        integerVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FIntegerVariable> integerVariables() {
        if(integerVariables_computed) {
            return integerVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        integerVariables_value = filterCollection(variables(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            integerVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return integerVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEnumVariables() {
        ASTNode$State state = state();
        int numEnumVariables_value = enumVariables().size();

        return numEnumVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean enumVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FEnumVariable> enumVariables_value;
    /**
     * @apilevel internal
     */
    private void enumVariables_reset() {
        enumVariables_computed = false;
        enumVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FEnumVariable> enumVariables() {
        if(enumVariables_computed) {
            return enumVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        enumVariables_value = filterCollection(variables(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            enumVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return enumVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numBooleanVariables() {
        ASTNode$State state = state();
        int numBooleanVariables_value = booleanVariables().size();

        return numBooleanVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean booleanVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FBooleanVariable> booleanVariables_value;
    /**
     * @apilevel internal
     */
    private void booleanVariables_reset() {
        booleanVariables_computed = false;
        booleanVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FBooleanVariable> booleanVariables() {
        if(booleanVariables_computed) {
            return booleanVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        booleanVariables_value = filterCollection(variables(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            booleanVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return booleanVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStringVariables() {
        ASTNode$State state = state();
        int numStringVariables_value = stringVariables().size();

        return numStringVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean stringVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FStringVariable> stringVariables_value;
    /**
     * @apilevel internal
     */
    private void stringVariables_reset() {
        stringVariables_computed = false;
        stringVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FStringVariable> stringVariables() {
        if(stringVariables_computed) {
            return stringVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stringVariables_value = filterCollection(variables(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            stringVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stringVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numAlgebraicContinousRealVariables() {
        ASTNode$State state = state();
        int numAlgebraicContinousRealVariables_value = algebraicContinousRealVariables().size();

        return numAlgebraicContinousRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean algebraicContinousRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> algebraicContinousRealVariables_value;
    /**
     * @apilevel internal
     */
    private void algebraicContinousRealVariables_reset() {
        algebraicContinousRealVariables_computed = false;
        algebraicContinousRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> algebraicContinousRealVariables() {
        if(algebraicContinousRealVariables_computed) {
            return algebraicContinousRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicContinousRealVariables_value = algebraicContinousRealVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            algebraicContinousRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicContinousRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    private Collection<FRealVariable> algebraicContinousRealVariables_compute() {
            Collection<FRealVariable> set = new LinkedHashSet<FRealVariable>(realVariables());
            set.removeAll(differentiatedRealVariables());
            set.removeAll(derivativeVariables());
            set.removeAll(discreteVariables());
            set.removeAll(inputs());
            return set;
        }
    @ASTNodeAnnotation.Attribute
    public int numNormalAlgebraicContinousRealVariables() {
        ASTNode$State state = state();
        int numNormalAlgebraicContinousRealVariables_value = normalAlgebraicContinousRealVariables().size();

        return numNormalAlgebraicContinousRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean normalAlgebraicContinousRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FRealVariable> normalAlgebraicContinousRealVariables_value;
    /**
     * @apilevel internal
     */
    private void normalAlgebraicContinousRealVariables_reset() {
        normalAlgebraicContinousRealVariables_computed = false;
        normalAlgebraicContinousRealVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FRealVariable> normalAlgebraicContinousRealVariables() {
        if(normalAlgebraicContinousRealVariables_computed) {
            return normalAlgebraicContinousRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        normalAlgebraicContinousRealVariables_value = normalAlgebraicContinousRealVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            normalAlgebraicContinousRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return normalAlgebraicContinousRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    private Collection<FRealVariable> normalAlgebraicContinousRealVariables_compute() {
            Collection<FRealVariable> set = new LinkedHashSet<FRealVariable>(algebraicContinousRealVariables());
            set.removeAll(dynamicStates());
            return set;
        }
    /**
     * @apilevel internal
     */
    protected boolean algebraicVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> algebraicVariables_value;
    /**
     * @apilevel internal
     */
    private void algebraicVariables_reset() {
        algebraicVariables_computed = false;
        algebraicVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> algebraicVariables() {
        if(algebraicVariables_computed) {
            return algebraicVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicVariables_value = algebraicVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            algebraicVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicVariables_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> algebraicVariables_compute() {
            ArrayList<FVariable> set = new ArrayList<FVariable>();
            set.addAll(algebraicContinousRealVariables());
            set.addAll(discreteVariables());
            return set;
        }
    /**
     * @apilevel internal
     */
    protected boolean normalAlgebraicVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> normalAlgebraicVariables_value;
    /**
     * @apilevel internal
     */
    private void normalAlgebraicVariables_reset() {
        normalAlgebraicVariables_computed = false;
        normalAlgebraicVariables_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> normalAlgebraicVariables() {
        if(normalAlgebraicVariables_computed) {
            return normalAlgebraicVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        normalAlgebraicVariables_value = normalAlgebraicVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            normalAlgebraicVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return normalAlgebraicVariables_value;
    }
    /**
     * @apilevel internal
     */
    private Collection<FVariable> normalAlgebraicVariables_compute() {
            Collection<FVariable> set = new LinkedHashSet<FVariable>(algebraicVariables());
            set.removeAll(dynamicStates());
            return set;
        }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:947
     */
    @ASTNodeAnnotation.Attribute
    public int numFreeParameters() {
        ASTNode$State state = state();
        try {
                return 0;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numVariablesWithBindingExp_value = variablesWithBindingExp().size();

        return numVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRealVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numRealVariablesWithBindingExp_value = realVariablesWithBindingExp().size();

        return numRealVariablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean realVariablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> realVariablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void realVariablesWithBindingExp_reset() {
        realVariablesWithBindingExp_computed = false;
        realVariablesWithBindingExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> realVariablesWithBindingExp() {
        if(realVariablesWithBindingExp_computed) {
            return realVariablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realVariablesWithBindingExp_value = filterCollection(variablesWithBindingExp(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            realVariablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIntegerVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numIntegerVariablesWithBindingExp_value = integerVariablesWithBindingExp().size();

        return numIntegerVariablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean integerVariablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> integerVariablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void integerVariablesWithBindingExp_reset() {
        integerVariablesWithBindingExp_computed = false;
        integerVariablesWithBindingExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> integerVariablesWithBindingExp() {
        if(integerVariablesWithBindingExp_computed) {
            return integerVariablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        integerVariablesWithBindingExp_value = filterCollection(variablesWithBindingExp(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            integerVariablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return integerVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEnumVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numEnumVariablesWithBindingExp_value = enumVariablesWithBindingExp().size();

        return numEnumVariablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean enumVariablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> enumVariablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void enumVariablesWithBindingExp_reset() {
        enumVariablesWithBindingExp_computed = false;
        enumVariablesWithBindingExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> enumVariablesWithBindingExp() {
        if(enumVariablesWithBindingExp_computed) {
            return enumVariablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        enumVariablesWithBindingExp_value = filterCollection(variablesWithBindingExp(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            enumVariablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return enumVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numBooleanVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numBooleanVariablesWithBindingExp_value = booleanVariablesWithBindingExp().size();

        return numBooleanVariablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean booleanVariablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> booleanVariablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void booleanVariablesWithBindingExp_reset() {
        booleanVariablesWithBindingExp_computed = false;
        booleanVariablesWithBindingExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> booleanVariablesWithBindingExp() {
        if(booleanVariablesWithBindingExp_computed) {
            return booleanVariablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        booleanVariablesWithBindingExp_value = filterCollection(variablesWithBindingExp(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            booleanVariablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return booleanVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStringVariablesWithBindingExp() {
        ASTNode$State state = state();
        int numStringVariablesWithBindingExp_value = stringVariablesWithBindingExp().size();

        return numStringVariablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean stringVariablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> stringVariablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void stringVariablesWithBindingExp_reset() {
        stringVariablesWithBindingExp_computed = false;
        stringVariablesWithBindingExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> stringVariablesWithBindingExp() {
        if(stringVariablesWithBindingExp_computed) {
            return stringVariablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stringVariablesWithBindingExp_value = filterCollection(variablesWithBindingExp(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            stringVariablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stringVariablesWithBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numInputs() {
        ASTNode$State state = state();
        int numInputs_value = inputs().size();

        return numInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRealInputs() {
        ASTNode$State state = state();
        int numRealInputs_value = realInputs().size();

        return numRealInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean realInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> realInputs_value;
    /**
     * @apilevel internal
     */
    private void realInputs_reset() {
        realInputs_computed = false;
        realInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> realInputs() {
        if(realInputs_computed) {
            return realInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realInputs_value = filterCollection(inputs(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            realInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIntegerInputs() {
        ASTNode$State state = state();
        int numIntegerInputs_value = integerInputs().size();

        return numIntegerInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean integerInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> integerInputs_value;
    /**
     * @apilevel internal
     */
    private void integerInputs_reset() {
        integerInputs_computed = false;
        integerInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> integerInputs() {
        if(integerInputs_computed) {
            return integerInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        integerInputs_value = filterCollection(inputs(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            integerInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return integerInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEnumInputs() {
        ASTNode$State state = state();
        int numEnumInputs_value = enumInputs().size();

        return numEnumInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean enumInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> enumInputs_value;
    /**
     * @apilevel internal
     */
    private void enumInputs_reset() {
        enumInputs_computed = false;
        enumInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> enumInputs() {
        if(enumInputs_computed) {
            return enumInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        enumInputs_value = filterCollection(inputs(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            enumInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return enumInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numBooleanInputs() {
        ASTNode$State state = state();
        int numBooleanInputs_value = booleanInputs().size();

        return numBooleanInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean booleanInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> booleanInputs_value;
    /**
     * @apilevel internal
     */
    private void booleanInputs_reset() {
        booleanInputs_computed = false;
        booleanInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> booleanInputs() {
        if(booleanInputs_computed) {
            return booleanInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        booleanInputs_value = filterCollection(inputs(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            booleanInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return booleanInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStringInputs() {
        ASTNode$State state = state();
        int numStringInputs_value = stringInputs().size();

        return numStringInputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean stringInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> stringInputs_value;
    /**
     * @apilevel internal
     */
    private void stringInputs_reset() {
        stringInputs_computed = false;
        stringInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> stringInputs() {
        if(stringInputs_computed) {
            return stringInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stringInputs_value = filterCollection(inputs(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            stringInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stringInputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numOutputs() {
        ASTNode$State state = state();
        int numOutputs_value = outputs().size();

        return numOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRealOutputs() {
        ASTNode$State state = state();
        int numRealOutputs_value = realOutputs().size();

        return numRealOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean realOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> realOutputs_value;
    /**
     * @apilevel internal
     */
    private void realOutputs_reset() {
        realOutputs_computed = false;
        realOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> realOutputs() {
        if(realOutputs_computed) {
            return realOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realOutputs_value = filterCollection(outputs(), REAL_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            realOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numIntegerOutputs() {
        ASTNode$State state = state();
        int numIntegerOutputs_value = integerOutputs().size();

        return numIntegerOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean integerOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> integerOutputs_value;
    /**
     * @apilevel internal
     */
    private void integerOutputs_reset() {
        integerOutputs_computed = false;
        integerOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> integerOutputs() {
        if(integerOutputs_computed) {
            return integerOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        integerOutputs_value = filterCollection(outputs(), INTEGER_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            integerOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return integerOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEnumOutputs() {
        ASTNode$State state = state();
        int numEnumOutputs_value = enumOutputs().size();

        return numEnumOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean enumOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> enumOutputs_value;
    /**
     * @apilevel internal
     */
    private void enumOutputs_reset() {
        enumOutputs_computed = false;
        enumOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> enumOutputs() {
        if(enumOutputs_computed) {
            return enumOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        enumOutputs_value = filterCollection(outputs(), ENUM_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            enumOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return enumOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numBooleanOutputs() {
        ASTNode$State state = state();
        int numBooleanOutputs_value = booleanOutputs().size();

        return numBooleanOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean booleanOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> booleanOutputs_value;
    /**
     * @apilevel internal
     */
    private void booleanOutputs_reset() {
        booleanOutputs_computed = false;
        booleanOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> booleanOutputs() {
        if(booleanOutputs_computed) {
            return booleanOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        booleanOutputs_value = filterCollection(outputs(), BOOLEAN_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            booleanOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return booleanOutputs_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStringOutputs() {
        ASTNode$State state = state();
        int numStringOutputs_value = stringOutputs().size();

        return numStringOutputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean stringOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> stringOutputs_value;
    /**
     * @apilevel internal
     */
    private void stringOutputs_reset() {
        stringOutputs_computed = false;
        stringOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> stringOutputs() {
        if(stringOutputs_computed) {
            return stringOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stringOutputs_value = filterCollection(outputs(), STRING_VARIABLE_FILTER);
        if (isFinal && num == state().boundariesCrossed) {
            stringOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stringOutputs_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1065
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        ASTNode$State state = state();
        try {
               int res = 0;
               for (FAbstractEquation e : equations())
                       res += e.numScalarEquations();
                for (FVariable fv : getFVariables())
                    if (!fv.variability().parameterOrLess() && fv.hasBindingExp())
                        res += fv.getBindingExp().type().numScalarElements();
               return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean numScalarEquationsAtInitialization_computed = false;
    /**
     * @apilevel internal
     */
    protected int numScalarEquationsAtInitialization_value;
    /**
     * @apilevel internal
     */
    private void numScalarEquationsAtInitialization_reset() {
        numScalarEquationsAtInitialization_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarEquationsAtInitialization() {
        if(numScalarEquationsAtInitialization_computed) {
            return numScalarEquationsAtInitialization_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        numScalarEquationsAtInitialization_value = numScalarEquationsAtInitialization_compute();
        if (isFinal && num == state().boundariesCrossed) {
            numScalarEquationsAtInitialization_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return numScalarEquationsAtInitialization_value;
    }
    /**
     * @apilevel internal
     */
    private int numScalarEquationsAtInitialization_compute() {
            int res = 0;
            for (FAbstractEquation e : equations())
                res += e.numScalarEquations();
            return res;
        }
    @ASTNodeAnnotation.Attribute
    public int numEquations() {
        ASTNode$State state = state();
        int numEquations_value = equations().size();

        return numEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean equations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAbstractEquation> equations_value;
    /**
     * @apilevel internal
     */
    private void equations_reset() {
        equations_computed = false;
        equations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> equations() {
        if(equations_computed) {
            return equations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        equations_value = equations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            equations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return equations_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FAbstractEquation> equations_compute() {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : getFAbstractEquations()) {
                if (!e.isIgnored()) {
                    l.add(e);
                }
            }
            return l;
        }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1092
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> allEquations() {
        ASTNode$State state = state();
        try {
                ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
                l.addAll(equations());
                l.addAll(initialEquations());
                l.addAll(getFParameterEquations().toArrayList());
                return l;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numContinuousEquations() {
        ASTNode$State state = state();
        int numContinuousEquations_value = continuousEquations().size();

        return numContinuousEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean continuousEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAbstractEquation> continuousEquations_value;
    /**
     * @apilevel internal
     */
    private void continuousEquations_reset() {
        continuousEquations_computed = false;
        continuousEquations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> continuousEquations() {
        if(continuousEquations_computed) {
            return continuousEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        continuousEquations_value = continuousEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            continuousEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return continuousEquations_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FAbstractEquation> continuousEquations_compute() {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : getFAbstractEquations()) {
                if (!e.isIgnored() && e.isContinuous()) {
                    l.add(e);
                }
            }
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public int numContinuousNonMetaEquations() {
        ASTNode$State state = state();
        int numContinuousNonMetaEquations_value = continuousNonMetaEquations().size();

        return numContinuousNonMetaEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean continuousNonMetaEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAbstractEquation> continuousNonMetaEquations_value;
    /**
     * @apilevel internal
     */
    private void continuousNonMetaEquations_reset() {
        continuousNonMetaEquations_computed = false;
        continuousNonMetaEquations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> continuousNonMetaEquations() {
        if(continuousNonMetaEquations_computed) {
            return continuousNonMetaEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        continuousNonMetaEquations_value = continuousNonMetaEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            continuousNonMetaEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return continuousNonMetaEquations_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FAbstractEquation> continuousNonMetaEquations_compute() {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : continuousEquations()) {
                if (!e.isMetaEquation()) {
                    l.add(e);
                }
            }
            return l;
        }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1127
     */
    @ASTNodeAnnotation.Attribute
    public int numScalarVariables() {
        ASTNode$State state = state();
        try {
                int res = 0;
                for (FVariable fv : getFVariables())
                    if (!fv.variability().parameterOrLess())
                        res += fv.type().numScalarElements();
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numSwitches() {
        ASTNode$State state = state();
        int numSwitches_value = numStateSwitches() + numTimeSwitches();

        return numSwitches_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numStateSwitches() {
        ASTNode$State state = state();
        int numStateSwitches_value = relExpsWithStateEvent().size() + numSpatialDistSwitches() + numDelaySwitches();

        return numStateSwitches_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numTimeSwitches() {
        ASTNode$State state = state();
        int numTimeSwitches_value = relExpsWithTimeEvent().size();

        return numTimeSwitches_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numEventIndicators() {
        ASTNode$State state = state();
        int numEventIndicators_value = numStateSwitches();

        return numEventIndicators_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean switchExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> switchExps_value;
    /**
     * @apilevel internal
     */
    private void switchExps_reset() {
        switchExps_computed = false;
        switchExps_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> switchExps() {
        if(switchExps_computed) {
            return switchExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        switchExps_value = switchExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            switchExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return switchExps_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FExp> switchExps_compute() {
            ArrayList<FExp> res = new ArrayList<FExp>();
            res.addAll(stateEventExps());
            res.addAll(relExpsWithTimeEvent());
            return res;
        }
    /**
     * @apilevel internal
     */
    protected boolean stateEventExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> stateEventExps_value;
    /**
     * @apilevel internal
     */
    private void stateEventExps_reset() {
        stateEventExps_computed = false;
        stateEventExps_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> stateEventExps() {
        if(stateEventExps_computed) {
            return stateEventExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stateEventExps_value = stateEventExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            stateEventExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stateEventExps_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FExp> stateEventExps_compute() {
            ArrayList<FExp> res = new ArrayList<FExp>();
            res.addAll(relExpsWithStateEvent());
            res.addAll(spatialDistExpsWithStateEvent());
            res.addAll(delayExpsWithStateEvent());
            return res;
        }
    /**
     * @apilevel internal
     */
    protected boolean timeEventExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> timeEventExps_value;
    /**
     * @apilevel internal
     */
    private void timeEventExps_reset() {
        timeEventExps_computed = false;
        timeEventExps_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> timeEventExps() {
        if(timeEventExps_computed) {
            return timeEventExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        timeEventExps_value = timeEventExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            timeEventExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return timeEventExps_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FExp> timeEventExps_compute() {
            ArrayList<FExp> res = new ArrayList<FExp>();
            res.addAll(sampleExpsWithTimeEvent());
            res.addAll(relExpsWithTimeEvent());
            return res;
        }
    @ASTNodeAnnotation.Attribute
    public int numSpatialDistSwitches() {
        ASTNode$State state = state();
        int numSpatialDistSwitches_value = spatialDistExpsWithStateEvent().size();

        return numSpatialDistSwitches_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDelaySwitches() {
        ASTNode$State state = state();
        int numDelaySwitches_value = 2*delayExpsWithStateEvent().size();

        return numDelaySwitches_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numGuardExpInEquations() {
        ASTNode$State state = state();
        int numGuardExpInEquations_value = guardExpInEquations().size();

        return numGuardExpInEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numGuardExpInInitialEquations() {
        ASTNode$State state = state();
        int numGuardExpInInitialEquations_value = guardExpInInitialEquations().size();

        return numGuardExpInInitialEquations_value;
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1396
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpsWithStateEvent() {
        ASTNode$State state = state();
        try {
                ArrayList<FRelExp> res = new ArrayList<FRelExp>();
                for (FRelExp exp : relExpsWithEvent()) {
                    if (!exp.isTimeEventGenerating()) {
                        res.add(exp);
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1406
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpsWithTimeEvent() {
        ASTNode$State state = state();
        try {
                ArrayList<FRelExp> res = new ArrayList<FRelExp>();
                for (FRelExp exp : relExpsWithEvent()) {
                    if (exp.isTimeEventGenerating()) {
                        res.add(exp);
                    }
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numInitialEquations() {
        ASTNode$State state = state();
        int numInitialEquations_value = initialEquations().size();

        return numInitialEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean numInitialScalarEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected int numInitialScalarEquations_value;
    /**
     * @apilevel internal
     */
    private void numInitialScalarEquations_reset() {
        numInitialScalarEquations_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int numInitialScalarEquations() {
        if(numInitialScalarEquations_computed) {
            return numInitialScalarEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        numInitialScalarEquations_value = numInitialScalarEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            numInitialScalarEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return numInitialScalarEquations_value;
    }
    /**
     * @apilevel internal
     */
    private int numInitialScalarEquations_compute() {
            int res = 0;
            for (FAbstractEquation e : initialEquations())
                res += e.numScalarEquations();
            return res;
        }
    /**
     * @apilevel internal
     */
    protected boolean initialEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAbstractEquation> initialEquations_value;
    /**
     * @apilevel internal
     */
    private void initialEquations_reset() {
        initialEquations_computed = false;
        initialEquations_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> initialEquations() {
        if(initialEquations_computed) {
            return initialEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        initialEquations_value = initialEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            initialEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return initialEquations_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FAbstractEquation> initialEquations_compute() {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            for (FAbstractEquation e : getFInitialEquations()) {
                l.add(e);
            }
            return l;
        }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1453
     */
    @ASTNodeAnnotation.Attribute
    public int numInitialGuessEquations() {
        ASTNode$State state = state();
        try {
                int n_eq = 0;
                for (FRealVariable fv : realVariables()) {
                    if (!fv.isFixed()) {
                        n_eq++;
                    }
                }
                return n_eq;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numInitialEventIndicators() {
        ASTNode$State state = state();
        int numInitialEventIndicators_value = numRelExpInInitialEquations();

        return numInitialEventIndicators_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> eventExpInInitialEquations() {
        ASTNode$State state = state();
        ArrayList<FRelExp> eventExpInInitialEquations_value = relExpInInitialEquations();

        return eventExpInInitialEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRelExpInInitialEquations() {
        ASTNode$State state = state();
        int numRelExpInInitialEquations_value = relExpInInitialEquations().size();

        return numRelExpInInitialEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean guid_computed = false;
    /**
     * @apilevel internal
     */
    protected String guid_value;
    /**
     * @apilevel internal
     */
    private void guid_reset() {
        guid_computed = false;
        guid_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String guid() {
        if(guid_computed) {
            return guid_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        guid_value = guid_compute();
        if (isFinal && num == state().boundariesCrossed) {
            guid_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return guid_value;
    }
    /**
     * @apilevel internal
     */
    private String guid_compute() {
            try {
                PipedInputStream in = new PipedInputStream();
                PipedOutputStream out = new PipedOutputStream(in);
                
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                new StreamGobbler(in).start();
                prettyPrint(new CodeStream(new DigestOutputStream(out, md5)), "");
                out.close();
                
                return new BigInteger(1,md5.digest()).toString(16);
                
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    /**
     * @attribute syn
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3260
     */
    @ASTNodeAnnotation.Attribute
    public String diagnostics() {
        ASTNode$State state = state();
        try {
                StringBuilder str = new StringBuilder();
                str.append("Diagnostics for flattened class " + name() + "\n");
        
                str.append(modelDiagnostics());
                
                str.append("\n");
                
                str.append(variableDiagnostics());
                
                str.append("\n");  
        
                str.append(aliasDiagnostics());
                
                str.append("\n");  
                
                str.append(incidence());
        
                str.append("\n");  
                
                str.append(dependencyDiagnostics());
        
                str.append("\n");
                
        //      str.append(dersAndDiffs());
                
                str.append("\n");  
                
                str.append(getConnectionSetManager().printConnectionSets());
                
                return str.toString();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3668
     */
    @ASTNodeAnnotation.Attribute
    public String attributeLevels() {
        ASTNode$State state = state();
        try {
                StringBuilder str = new StringBuilder();
                str.append("Variables:\n");
                for (FVariable v : getFVariables())
                    v.attributeLevels(str);
                for (FVariable v : getAliasVariables())
                    v.attributeLevels(str);
                if (getNumFDerivedType() > 0) {
                    str.append("\nTypes:\n");
                    for (FDerivedType t : getFDerivedTypes())
                        t.attributeLevels(str);
                }
                return str.toString();
            }
        finally {
        }
    }
    /**
     * Gives the arguments to pass to gcc required by external functions.
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3780
     */
    @ASTNodeAnnotation.Attribute
    public String externalCompilerArgs() {
        ASTNode$State state = state();
        try {
                StringBuilder buf = new StringBuilder();
                for (String lib : externalLibraries()) {
                    buf.append(" -l");
                    buf.append(lib);
                }
                for (String dir : externalLibraryDirectories()) {
                    buf.append(" -L");
                    buf.append(dir);
                }
                for (String dir : externalIncludeDirectories()) {
                    buf.append(" -I");
                    buf.append(dir);
                }
                return buf.toString();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3797
     */
    @ASTNodeAnnotation.Attribute
    public String externalLibArgs() {
        ASTNode$State state = state();
        try {
                StringBuilder buf = new StringBuilder();
                for (String lib : externalLibraries()) {
                    buf.append(" -l");
                    buf.append(lib);
                }
                for (String dir : externalLibraryDirectories()) {
                    buf.append(" -L");
                    buf.append(dir);
                }
                return buf.toString();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3810
     */
    @ASTNodeAnnotation.Attribute
    public String externalIncludeArgs() {
        ASTNode$State state = state();
        try {
                StringBuilder buf = new StringBuilder();
                for (String dir : externalIncludeDirectories()) {
                    buf.append(" -I");
                    buf.append(dir);
                }
                return buf.toString();
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3824
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<String> externalLibraries() {
        ASTNode$State state = state();
        try {
                HashSet<String> res = new LinkedHashSet<String>();
                for (FExternalStmt ext : myExternals())
                    if (ext.library() != null)
                        for (String lib : ext.library())
                            res.add(lib);
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3833
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<String> externalIncludes() {
        ASTNode$State state = state();
        try {
                HashSet<String> res = new LinkedHashSet<String>();
                for (FExternalStmt ext : myExternals())
                    if (ext.include() != null)
                        res.add(ext.include());
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3841
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<String> externalLibraryDirectories() {
        ASTNode$State state = state();
        try {
                HashSet<String> res = new LinkedHashSet<String>();
                for (FExternalStmt ext : myExternals())
                    if (ext.libraryDirectory() != null)
                        res.add(ext.libraryDirectory());
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3849
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<String> externalIncludeDirectories() {
        ASTNode$State state = state();
        try {
                HashSet<String> res = new LinkedHashSet<String>();
                for (FExternalStmt ext : myExternals())
                    if (ext.includeDirectory() != null)
                        res.add(ext.includeDirectory());
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean freeParametersEquationSparsity_n_nz_computed = false;
    /**
     * @apilevel internal
     */
    protected int freeParametersEquationSparsity_n_nz_value;
    /**
     * @apilevel internal
     */
    private void freeParametersEquationSparsity_n_nz_reset() {
        freeParametersEquationSparsity_n_nz_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int freeParametersEquationSparsity_n_nz() {
        if(freeParametersEquationSparsity_n_nz_computed) {
            return freeParametersEquationSparsity_n_nz_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        freeParametersEquationSparsity_n_nz_value = freeParametersEquationSparsity_n_nz_compute();
        if (isFinal && num == state().boundariesCrossed) {
            freeParametersEquationSparsity_n_nz_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return freeParametersEquationSparsity_n_nz_value;
    }
    /**
     * @apilevel internal
     */
    private int freeParametersEquationSparsity_n_nz_compute() {
            return 0;
        }
    /**
     * @apilevel internal
     */
    protected boolean freeParametersEquationSparsity_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<Integer>[] freeParametersEquationSparsity_value;
    /**
     * @apilevel internal
     */
    private void freeParametersEquationSparsity_reset() {
        freeParametersEquationSparsity_computed = false;
        freeParametersEquationSparsity_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<Integer>[] freeParametersEquationSparsity() {
        if(freeParametersEquationSparsity_computed) {
            return freeParametersEquationSparsity_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        freeParametersEquationSparsity_value = freeParametersEquationSparsity_compute();
        if (isFinal && num == state().boundariesCrossed) {
            freeParametersEquationSparsity_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return freeParametersEquationSparsity_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<Integer>[] freeParametersEquationSparsity_compute() {
            ArrayList<Integer>[] sp = (ArrayList<Integer>[]) new ArrayList[numFreeParameters()];
            
            for (int i=0; i<numFreeParameters(); i++) {
                sp[i] = new ArrayList<Integer>();
            }
                    
            return sp;
            
        }
    /**
     * @apilevel internal
     */
    protected boolean derivativeVariablesEquationSparsity_n_nz_computed = false;
    /**
     * @apilevel internal
     */
    protected int derivativeVariablesEquationSparsity_n_nz_value;
    /**
     * @apilevel internal
     */
    private void derivativeVariablesEquationSparsity_n_nz_reset() {
        derivativeVariablesEquationSparsity_n_nz_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int derivativeVariablesEquationSparsity_n_nz() {
        if(derivativeVariablesEquationSparsity_n_nz_computed) {
            return derivativeVariablesEquationSparsity_n_nz_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derivativeVariablesEquationSparsity_n_nz_value = derivativeVariablesEquationSparsity_n_nz_compute();
        if (isFinal && num == state().boundariesCrossed) {
            derivativeVariablesEquationSparsity_n_nz_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derivativeVariablesEquationSparsity_n_nz_value;
    }
    /**
     * @apilevel internal
     */
    private int derivativeVariablesEquationSparsity_n_nz_compute() {
            int n_nz = 0;
            ArrayList<Integer>[] sp = derivativeVariablesEquationSparsity();
            for (int j=0; j<numDerivativeVariables(); j++) {
                n_nz += sp[j].size();
            }
            return n_nz;        
        }
    /**
     * @apilevel internal
     */
    protected boolean derivativeVariablesEquationSparsity_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<Integer>[] derivativeVariablesEquationSparsity_value;
    /**
     * @apilevel internal
     */
    private void derivativeVariablesEquationSparsity_reset() {
        derivativeVariablesEquationSparsity_computed = false;
        derivativeVariablesEquationSparsity_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<Integer>[] derivativeVariablesEquationSparsity() {
        if(derivativeVariablesEquationSparsity_computed) {
            return derivativeVariablesEquationSparsity_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derivativeVariablesEquationSparsity_value = derivativeVariablesEquationSparsity_compute();
        if (isFinal && num == state().boundariesCrossed) {
            derivativeVariablesEquationSparsity_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derivativeVariablesEquationSparsity_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<Integer>[] derivativeVariablesEquationSparsity_compute() {
            
            ArrayList<Integer>[] sp = (ArrayList<Integer>[]) new ArrayList[numDerivativeVariables()];
            
            for (int i=0; i<numDerivativeVariables(); i++) {
                sp[i] = new ArrayList<Integer>();
            }
            
            int i = 0;
            for (FAbstractEquation fe : equations()) {
                fe.derivativeVariablesEquationSparsity(sp,i);
                i += fe.numScalarEquations();
            }
            return sp;      
        }
    /**
     * @apilevel internal
     */
    protected boolean differentiatedRealVariablesEquationSparsity_n_nz_computed = false;
    /**
     * @apilevel internal
     */
    protected int differentiatedRealVariablesEquationSparsity_n_nz_value;
    /**
     * @apilevel internal
     */
    private void differentiatedRealVariablesEquationSparsity_n_nz_reset() {
        differentiatedRealVariablesEquationSparsity_n_nz_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int differentiatedRealVariablesEquationSparsity_n_nz() {
        if(differentiatedRealVariablesEquationSparsity_n_nz_computed) {
            return differentiatedRealVariablesEquationSparsity_n_nz_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        differentiatedRealVariablesEquationSparsity_n_nz_value = differentiatedRealVariablesEquationSparsity_n_nz_compute();
        if (isFinal && num == state().boundariesCrossed) {
            differentiatedRealVariablesEquationSparsity_n_nz_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return differentiatedRealVariablesEquationSparsity_n_nz_value;
    }
    /**
     * @apilevel internal
     */
    private int differentiatedRealVariablesEquationSparsity_n_nz_compute() {
            int n_nz = 0;
            ArrayList<Integer>[] sp = differentiatedRealVariablesEquationSparsity();
            for (int j=0; j<numDifferentiatedRealVariables(); j++) {
                n_nz += sp[j].size();
            }
            return n_nz;        
        }
    /**
     * @apilevel internal
     */
    protected boolean differentiatedRealVariablesEquationSparsity_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<Integer>[] differentiatedRealVariablesEquationSparsity_value;
    /**
     * @apilevel internal
     */
    private void differentiatedRealVariablesEquationSparsity_reset() {
        differentiatedRealVariablesEquationSparsity_computed = false;
        differentiatedRealVariablesEquationSparsity_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<Integer>[] differentiatedRealVariablesEquationSparsity() {
        if(differentiatedRealVariablesEquationSparsity_computed) {
            return differentiatedRealVariablesEquationSparsity_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        differentiatedRealVariablesEquationSparsity_value = differentiatedRealVariablesEquationSparsity_compute();
        if (isFinal && num == state().boundariesCrossed) {
            differentiatedRealVariablesEquationSparsity_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return differentiatedRealVariablesEquationSparsity_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<Integer>[] differentiatedRealVariablesEquationSparsity_compute() {
            
            ArrayList<Integer>[] sp = (ArrayList<Integer>[]) new ArrayList[numDifferentiatedRealVariables()];
            
            for (int i=0; i<numDifferentiatedRealVariables(); i++) {
                sp[i] = new ArrayList<Integer>();
            }
            
            int i = 0;
            for (FAbstractEquation fe : equations()) {
                fe.differentiatedRealVariablesEquationSparsity(sp,i);
                i += fe.numScalarEquations();
            }
            return sp;      
        }
    /**
     * @apilevel internal
     */
    protected boolean realInputsEquationSparsity_n_nz_computed = false;
    /**
     * @apilevel internal
     */
    protected int realInputsEquationSparsity_n_nz_value;
    /**
     * @apilevel internal
     */
    private void realInputsEquationSparsity_n_nz_reset() {
        realInputsEquationSparsity_n_nz_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int realInputsEquationSparsity_n_nz() {
        if(realInputsEquationSparsity_n_nz_computed) {
            return realInputsEquationSparsity_n_nz_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realInputsEquationSparsity_n_nz_value = realInputsEquationSparsity_n_nz_compute();
        if (isFinal && num == state().boundariesCrossed) {
            realInputsEquationSparsity_n_nz_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realInputsEquationSparsity_n_nz_value;
    }
    /**
     * @apilevel internal
     */
    private int realInputsEquationSparsity_n_nz_compute() {
            int n_nz = 0;
            ArrayList<Integer>[] sp = realInputsEquationSparsity();
            for (int j=0; j<numRealInputs(); j++) {
                n_nz += sp[j].size();
            }
            return n_nz;        
        }
    /**
     * @apilevel internal
     */
    protected boolean realInputsEquationSparsity_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<Integer>[] realInputsEquationSparsity_value;
    /**
     * @apilevel internal
     */
    private void realInputsEquationSparsity_reset() {
        realInputsEquationSparsity_computed = false;
        realInputsEquationSparsity_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<Integer>[] realInputsEquationSparsity() {
        if(realInputsEquationSparsity_computed) {
            return realInputsEquationSparsity_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        realInputsEquationSparsity_value = realInputsEquationSparsity_compute();
        if (isFinal && num == state().boundariesCrossed) {
            realInputsEquationSparsity_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return realInputsEquationSparsity_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<Integer>[] realInputsEquationSparsity_compute() {
            
            ArrayList<Integer>[] sp = (ArrayList<Integer>[]) new ArrayList[numRealInputs()];
            
            for (int i=0; i<numRealInputs(); i++) {
                sp[i] = new ArrayList<Integer>();
            }
            
            int i = 0;
            for (FAbstractEquation fe : equations()) {
                fe.realInputsEquationSparsity(sp,i);
                i += fe.numScalarEquations();
            }
            return sp;      
        }
    /**
     * @apilevel internal
     */
    protected boolean algebraicRealVariablesEquationSparsity_n_nz_computed = false;
    /**
     * @apilevel internal
     */
    protected int algebraicRealVariablesEquationSparsity_n_nz_value;
    /**
     * @apilevel internal
     */
    private void algebraicRealVariablesEquationSparsity_n_nz_reset() {
        algebraicRealVariablesEquationSparsity_n_nz_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int algebraicRealVariablesEquationSparsity_n_nz() {
        if(algebraicRealVariablesEquationSparsity_n_nz_computed) {
            return algebraicRealVariablesEquationSparsity_n_nz_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicRealVariablesEquationSparsity_n_nz_value = algebraicRealVariablesEquationSparsity_n_nz_compute();
        if (isFinal && num == state().boundariesCrossed) {
            algebraicRealVariablesEquationSparsity_n_nz_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicRealVariablesEquationSparsity_n_nz_value;
    }
    /**
     * @apilevel internal
     */
    private int algebraicRealVariablesEquationSparsity_n_nz_compute() {
            int n_nz = 0;
            ArrayList<Integer>[] sp = algebraicRealVariablesEquationSparsity();
            for (int j=0; j<numAlgebraicContinousRealVariables(); j++) {
                n_nz += sp[j].size();
            }
            return n_nz;        
        }
    /**
     * @apilevel internal
     */
    protected boolean algebraicRealVariablesEquationSparsity_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<Integer>[] algebraicRealVariablesEquationSparsity_value;
    /**
     * @apilevel internal
     */
    private void algebraicRealVariablesEquationSparsity_reset() {
        algebraicRealVariablesEquationSparsity_computed = false;
        algebraicRealVariablesEquationSparsity_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<Integer>[] algebraicRealVariablesEquationSparsity() {
        if(algebraicRealVariablesEquationSparsity_computed) {
            return algebraicRealVariablesEquationSparsity_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        algebraicRealVariablesEquationSparsity_value = algebraicRealVariablesEquationSparsity_compute();
        if (isFinal && num == state().boundariesCrossed) {
            algebraicRealVariablesEquationSparsity_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return algebraicRealVariablesEquationSparsity_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<Integer>[] algebraicRealVariablesEquationSparsity_compute() {
            
            ArrayList<Integer>[] sp = (ArrayList<Integer>[]) new ArrayList[numAlgebraicContinousRealVariables()];
            
            for (int i=0; i<numAlgebraicContinousRealVariables(); i++) {
                sp[i] = new ArrayList<Integer>();
            }
            
            int i = 0;
            for (FAbstractEquation fe : equations()) {
                fe.algebraicRealVariablesEquationSparsity(sp,i);
                i += fe.numScalarEquations();
            }
            return sp;      
        }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_FQName_value = nullUnknown(variablesMap().lookup(fqn));

        return lookupFV_FQName_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupFV(String name) {
        ASTNode$State state = state();
        FAbstractVariable lookupFV_String_value = nullUnknown(variablesMap().lookup(name));

        return lookupFV_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAbstractVariable lookupOutermostFV(FQName fqn) {
        ASTNode$State state = state();
        FAbstractVariable lookupOutermostFV_FQName_value = nullUnknown(variablesMap().lookupOutermost(fqn));

        return lookupOutermostFV_FQName_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean variablesMap_computed = false;
    /**
     * @apilevel internal
     */
    protected FlatVariableMap variablesMap_value;
    /**
     * @apilevel internal
     */
    private void variablesMap_reset() {
        variablesMap_computed = false;
        variablesMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FlatVariableMap variablesMap() {
        if(variablesMap_computed) {
            return variablesMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        variablesMap_value = variablesMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            variablesMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return variablesMap_value;
    }
    /**
     * @apilevel internal
     */
    private FlatVariableMap variablesMap_compute() {
    		FlatVariableMap map = new FlatVariableMap();
    		map.addVariables(getFVariables());
            map.addVariables(getAliasVariables());
    		return map;
    	}
    /**
     * @apilevel internal
     */
    protected boolean parameterEquationsMap_computed = false;
    /**
     * @apilevel internal
     */
    protected Map<FAbstractVariable,FAbstractEquation> parameterEquationsMap_value;
    /**
     * @apilevel internal
     */
    private void parameterEquationsMap_reset() {
        parameterEquationsMap_computed = false;
        parameterEquationsMap_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Map<FAbstractVariable,FAbstractEquation> parameterEquationsMap() {
        if(parameterEquationsMap_computed) {
            return parameterEquationsMap_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        parameterEquationsMap_value = parameterEquationsMap_compute();
        if (isFinal && num == state().boundariesCrossed) {
            parameterEquationsMap_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return parameterEquationsMap_value;
    }
    /**
     * @apilevel internal
     */
    private Map<FAbstractVariable,FAbstractEquation> parameterEquationsMap_compute() {
    		Map<FAbstractVariable,FAbstractEquation> map = new HashMap<FAbstractVariable,FAbstractEquation>();
    		for (FAbstractEquation equ : getFParameterEquations())
    			equ.addToParameterEquationsMap(map);
    		return map;
    	}
    /**
     * @attribute syn
     * @aspect FlatFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:539
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl lookupFunc(String name) {
        ASTNode$State state = state();
        try {
        		for (FFunctionDecl f : getFFunctionDecls())
        			if (f.name().equals(name))
        				return f;
        		return null;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatRecordBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:582
     */
    @ASTNodeAnnotation.Attribute
    public FRecordDecl lookupFRec(String name) {
        ASTNode$State state = state();
        try {
        		for (FRecordDecl r : getFRecordDecls())
        			if (r.name().equals(name))
        				return r;
        		return null;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatEnumBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:615
     */
    @ASTNodeAnnotation.Attribute
    public FEnumDecl lookupFEnum(String name) {
        ASTNode$State state = state();
        try {
        		for (FEnumDecl r : getFEnumDecls()) {
        			if (r.name().equals(name))
        				return r;
        		}
        		return null;
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean getUnknownFVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected UnknownFVariable getUnknownFVariable_value;
    /**
     * @apilevel internal
     */
    private void getUnknownFVariable_reset() {
        getUnknownFVariable_computed = false;
        getUnknownFVariable_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public UnknownFVariable getUnknownFVariable() {
        if(getUnknownFVariable_computed) {
            return (UnknownFVariable) getChild(getUnknownFVariableChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getUnknownFVariable_value = new UnknownFVariable();
        setChild(getUnknownFVariable_value, getUnknownFVariableChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getUnknownFVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        UnknownFVariable node = (UnknownFVariable) this.getChild(getUnknownFVariableChildPosition());
        return node;
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
    /**
     * Check if this FClass contains any active annotation attributes.
     * @attribute syn
     * @aspect AttributeUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2068
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsActiveAnnotations() {
        ASTNode$State state = state();
        try {
                if (getNumFAttribute() == 0)
                    return false;
                for (AttributeContributer contributer : attributeContributers())
                    if (contributer.containsActiveAttributes(this))
                        return true;
                return false;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean getFDynamicResolverOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getFDynamicResolverOpt_value;
    /**
     * @apilevel internal
     */
    private void getFDynamicResolverOpt_reset() {
        getFDynamicResolverOpt_computed = false;
        getFDynamicResolverOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getFDynamicResolverOpt() {
        if(getFDynamicResolverOpt_computed) {
            return (Opt) getChild(getFDynamicResolverOptChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFDynamicResolverOpt_value = new DynamicOpt();
        setChild(getFDynamicResolverOpt_value, getFDynamicResolverOptChildPosition());
        if (true) {
            getFDynamicResolverOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        Opt node = (Opt) this.getChild(getFDynamicResolverOptChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean stateSelectType_computed = false;
    /**
     * @apilevel internal
     */
    protected FType stateSelectType_value;
    /**
     * @apilevel internal
     */
    private void stateSelectType_reset() {
        stateSelectType_computed = false;
        stateSelectType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType stateSelectType() {
        if(stateSelectType_computed) {
            return stateSelectType_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        stateSelectType_value = stateSelectType_compute();
        if (isFinal && num == state().boundariesCrossed) {
            stateSelectType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return stateSelectType_value;
    }
    /**
     * @apilevel internal
     */
    private FType stateSelectType_compute() {
            FEnumType type = new FEnumType(Size.SCALAR, "StateSelect", new List());
            for (String el : new String[] { "never", "avoid", "default", "prefer", "always" }) 
                type.addFEnumLiteralType(new FEnumLiteralType(Size.SCALAR, el));
            return type;
        }
    /**
     * @apilevel internal
     */
    protected boolean collectReinits_computed = false;
    /**
     * @apilevel internal
     */
    protected Map<FAbstractVariable,Set<FReinit>> collectReinits_value;
    /**
     * @apilevel internal
     */
    private void collectReinits_reset() {
        collectReinits_computed = false;
        collectReinits_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Map<FAbstractVariable,Set<FReinit>> collectReinits() {
        if(collectReinits_computed) {
            return collectReinits_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        collectReinits_value = collectReinits_compute();
        if (isFinal && num == state().boundariesCrossed) {
            collectReinits_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return collectReinits_value;
    }
    /**
     * @apilevel internal
     */
    private Map<FAbstractVariable,Set<FReinit>> collectReinits_compute() {
            Map<FAbstractVariable,Set<FReinit>> reinitMap = new HashMap<FAbstractVariable,Set<FReinit>>();
            for (FAbstractEquation e : getFAbstractEquations())
                e.collectReinits(reinitMap);
            return reinitMap;
        }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = new FAttributeListAnnotationNode(getFAttributes());

        return annotation_value;
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:353
     */
    @ASTNodeAnnotation.Attribute
    public HashMap<FVariable,AbstractEquationBlock> getDAEFVariableEquationBlockMap() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeFVariableEquationBlockMap;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:361
     */
    @ASTNodeAnnotation.Attribute
    public HashMap<FAbstractEquation,AbstractEquationBlock> getDAEFEquationEquationBlockMap() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeEquationEquationBlockMap;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:370
     */
    @ASTNodeAnnotation.Attribute
    public HashMap<FVariable,AbstractEquationBlock> getDAEInitFVariableEquationBlockMap() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeInitFVariableEquationBlockMap;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:376
     */
    @ASTNodeAnnotation.Attribute
    public HashMap<FAbstractEquation,AbstractEquationBlock> getDAEInitEquationEquationBlockMap() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeInitEquationEquationBlockMap;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:382
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> getDAEUnmatchedEquations() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeUnmatchedEquations;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:388
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> getDAEUnmatchedVariables() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeUnmatchedVariables;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:394
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAbstractEquation> getDAEInitUnmatchedEquations() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeInitUnmatchedEquations;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:400
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> getDAEInitUnmatchedVariables() {
        ASTNode$State state = state();
        try {
                transformCanonical();
                return daeInitUnmatchedVariables;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean onlyInitBLT() {
        ASTNode$State state = state();
        boolean onlyInitBLT_value = getDAEBLT() == BLT.EMPTY_BLT && getDAEInitBLT() != BLT.EMPTY_BLT;

        return onlyInitBLT_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldPerformMatchingsAndBLT() {
        ASTNode$State state = state();
        boolean shouldPerformMatchingsAndBLT_value = true;

        return shouldPerformMatchingsAndBLT_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean continuousVariablesUsedInPreInInitial_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<FVariable> continuousVariablesUsedInPreInInitial_value;
    /**
     * @apilevel internal
     */
    private void continuousVariablesUsedInPreInInitial_reset() {
        continuousVariablesUsedInPreInInitial_computed = false;
        continuousVariablesUsedInPreInInitial_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> continuousVariablesUsedInPreInInitial() {
        if(continuousVariablesUsedInPreInInitial_computed) {
            return continuousVariablesUsedInPreInInitial_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        continuousVariablesUsedInPreInInitial_value = continuousVariablesUsedInPreInInitial_compute();
        if (isFinal && num == state().boundariesCrossed) {
            continuousVariablesUsedInPreInInitial_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return continuousVariablesUsedInPreInInitial_value;
    }
    /**
     * @apilevel internal
     */
    private Collection<FVariable> continuousVariablesUsedInPreInInitial_compute() {
            Set<FVariable> res = new LinkedHashSet<FVariable>();
            getFInitialEquations().gatherContinuousVariablesUsedInPre(res);
            return new ArrayList<FVariable>(res);
        }
    @ASTNodeAnnotation.Attribute
    public int numDAEEquations() {
        ASTNode$State state = state();
        int numDAEEquations_value = numScalarEquations();

        return numDAEEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDAEEquationsAtInitialization() {
        ASTNode$State state = state();
        int numDAEEquationsAtInitialization_value = numScalarEquationsAtInitialization();

        return numDAEEquationsAtInitialization_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDAEVariables() {
        ASTNode$State state = state();
        int numDAEVariables_value = numNormalAlgebraicContinousRealVariables() + 
        		numDerivativeVariables() + numDiscreteVariables();

        return numDAEVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDAEInitEquations() {
        ASTNode$State state = state();
        int numDAEInitEquations_value = numDAEEquationsAtInitialization() + 
                numInitialScalarEquations() - numIgnoredPrePropagationEquations;

        return numDAEInitEquations_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numDAEInitVariables() {
        ASTNode$State state = state();
        int numDAEInitVariables_value = numDAEVariables() +
                       numDifferentiatedRealVariables() + numDiscretePreVariables() +
                       numInitialParameters() + numDynamicStates() - numDynamicAlgebraicVariables();

        return numDAEInitVariables_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numRuntimeOptionParameters() {
        ASTNode$State state = state();
        int numRuntimeOptionParameters_value = runtimeOptionParameters().size();

        return numRuntimeOptionParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean runtimeOptionParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> runtimeOptionParameters_value;
    /**
     * @apilevel internal
     */
    private void runtimeOptionParameters_reset() {
        runtimeOptionParameters_computed = false;
        runtimeOptionParameters_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> runtimeOptionParameters() {
        if(runtimeOptionParameters_computed) {
            return runtimeOptionParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        runtimeOptionParameters_value = runtimeOptionParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            runtimeOptionParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return runtimeOptionParameters_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> runtimeOptionParameters_compute() {
    		ArrayList<FVariable> res = new ArrayList<FVariable>();
    		for (FVariable fv : independentParameters())  // They are always independent
    			if (fv.isRuntimeOption())
    				res.add(fv);
    		return res;
    	}
    /**
     * @apilevel internal
     */
    protected boolean resourcesToLoad_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<String> resourcesToLoad_value;
    /**
     * @apilevel internal
     */
    private void resourcesToLoad_reset() {
        resourcesToLoad_computed = false;
        resourcesToLoad_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<String> resourcesToLoad() {
        if(resourcesToLoad_computed) {
            return resourcesToLoad_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        resourcesToLoad_value = resourcesToLoad_compute();
        if (isFinal && num == state().boundariesCrossed) {
            resourcesToLoad_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return resourcesToLoad_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<String> resourcesToLoad_compute() {
            LinkedHashSet<String> s = new LinkedHashSet<String>();
            collectResourcesToLoad(s);
            return new ArrayList<String>(s);
        }
    @ASTNodeAnnotation.Attribute
    public boolean indexReductionErrorsAsWarnings() {
        ASTNode$State state = state();
        boolean indexReductionErrorsAsWarnings_value = false;

        return indexReductionErrorsAsWarnings_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean exportWrapperGroups_computed = false;
    /**
     * @apilevel internal
     */
    protected java.util.List<java.util.List<FFunctionDecl>> exportWrapperGroups_value;
    /**
     * @apilevel internal
     */
    private void exportWrapperGroups_reset() {
        exportWrapperGroups_computed = false;
        exportWrapperGroups_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<java.util.List<FFunctionDecl>> exportWrapperGroups() {
        if(exportWrapperGroups_computed) {
            return exportWrapperGroups_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        exportWrapperGroups_value = exportWrapperGroups_compute();
        if (isFinal && num == state().boundariesCrossed) {
            exportWrapperGroups_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return exportWrapperGroups_value;
    }
    /**
     * @apilevel internal
     */
    private java.util.List<java.util.List<FFunctionDecl>> exportWrapperGroups_compute() {
            ListMap<String,FFunctionDecl> map = new LinkedHashListMap<String,FFunctionDecl>();
            for (FFunctionDecl f : getFFunctionDecls()) {
                if (f.hasExportWrapper_C()) {
                    map.add(f.signatureString(), f);
                }
            }
            
            java.util.List<java.util.List<FFunctionDecl>> res = new ArrayList<java.util.List<FFunctionDecl>>();
            for (java.util.List<FFunctionDecl> list : map.values()) {
                Collections.sort(list, FFunctionDecl.UNAME_COMPARATOR);
                res.add(list);
            }
            return res;
        }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:805
     * @apilevel internal
     */
    public boolean Define_inIterExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:813
     * @apilevel internal
     */
    public Size Define_expandSizeForIterExp(ASTNode caller, ASTNode child, Size s) {
        int childIndex = this.getIndexOfChild(caller);
        return s;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1859
     * @apilevel internal
     */
    public FArraySubscripts Define_collectIterExpSubscripts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FArraySubscripts();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1889
     * @apilevel internal
     */
    public int Define_iterExpDepth(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2600
     * @apilevel internal
     */
    public String Define_calcInstanceName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                throw new UnsupportedOperationException("The getInstanceName() operator is not allowed in the flat tree.");
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3222
     * @apilevel internal
     */
    public boolean Define_duringFunctionEval(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:172
     * @apilevel internal
     */
    public int Define_valueReference(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return -1;
        }
        else if (caller == getAliasConstantListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getAliasConstant(i).aliasValueReference();
        }
        else if (caller == getAliasVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getAliasVariable(i).aliasValueReference();
        }
        else if (caller == getFVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return valueReferenceMap().get(getFVariable(i));
        }
        else {
            return getParent().Define_valueReference(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:773
     * @apilevel internal
     */
    public boolean Define_inDeadIfBranch(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1787
     * @apilevel internal
     */
    public FClass Define_myFClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1664
     * @apilevel internal
     */
    public boolean Define_isParameterEquation(ASTNode caller, ASTNode child) {
        if (caller == getFParameterEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_isParameterEquation(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1668
     * @apilevel internal
     */
    public boolean Define_isNormalEquation(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return false;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1674
     * @apilevel internal
     */
    public List<FAbstractEquation> Define_myFAbstractEquationList(ASTNode caller, ASTNode child) {
        if (caller == getFParameterEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getFParameterEquations();
        }
        else if (caller == getFInitialEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getFInitialEquations();
        }
        else if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return getFAbstractEquations();
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return null;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2408
     * @apilevel internal
     */
    public FDerivedType Define_findFDerivedType(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return findMatching(getFDerivedTypes(), name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2662
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2672
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child, FVariable fv) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2682
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2692
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child, FDerivedType t) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2817
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeft(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2822
     * @apilevel internal
     */
    public boolean Define_inFunctionCallLeftTop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2831
     * @apilevel internal
     */
    public boolean Define_inFunctionCall(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2844
     * @apilevel internal
     */
    public CommonVariableDecl Define_myCorrespondingInput(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
                throw new UnsupportedOperationException();
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:31
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFV(fqn);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:25
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupDerFV(ASTNode caller, ASTNode child, FQName fqn, int index) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFV(fqn.derName(index));
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:26
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupOutermostFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupOutermostFV(fqn);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:436
     * @apilevel internal
     */
    public boolean Define_isForIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:451
     * @apilevel internal
     */
    public FAbstractEquation Define_parameterEquation(ASTNode caller, ASTNode child) {
        if (caller == getAliasVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return parameterEquationsMap().get(getAliasVariable(i));
        }
        else if (caller == getFVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return parameterEquationsMap().get(getFVariable(i));
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return null;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:508
     * @apilevel internal
     */
    public boolean Define_inParameterEquation(ASTNode caller, ASTNode child) {
        if (caller == getFParameterEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return false;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:517
     * @apilevel internal
     */
    public boolean Define_inAttributeValue(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:531
     * @apilevel internal
     */
    public FCallable Define_lookupFCallable(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFunc(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:579
     * @apilevel internal
     */
    public FRecordDecl Define_lookupFRec(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFRec(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:612
     * @apilevel internal
     */
    public FEnumDecl Define_lookupFEnum(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFEnum(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:657
     * @apilevel internal
     */
    public FAbstractVariable Define_lookupPreFV(ASTNode caller, ASTNode child, FQName fqn) {
        int childIndex = this.getIndexOfChild(caller);
        return lookupFV(fqn.preName());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     * @apilevel internal
     */
    public FQName Define_retrieveFQName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:470
     * @apilevel internal
     */
    public int Define_functionIndex(ASTNode caller, ASTNode child) {
        if (caller == getFFunctionDeclListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i;
        }
        else {
            return getParent().Define_functionIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:483
     * @apilevel internal
     */
    public int Define_findVariableIndex(ASTNode caller, ASTNode child) {
        if (caller == getAliasVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return getNumFVariable() + i;
        }
        else if (caller == getFVariableListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return -1;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:491
     * @apilevel internal
     */
    public int Define_forIndexIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return nextForIndexIndex++;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:497
     * @apilevel internal
     */
    public int Define_recordIndex(ASTNode caller, ASTNode child) {
        if (caller == getFRecordDeclListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i;
        }
        else {
            return getParent().Define_recordIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:500
     * @apilevel internal
     */
    public int Define_enumIndex(ASTNode caller, ASTNode child) {
        if (caller == getFEnumDeclListNoTransform()) {
            int i = caller.getIndexOfChild(child);
            return i;
        }
        else {
            return getParent().Define_enumIndex(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1488
     * @apilevel internal
     */
    public FunctionReturnDefinition Define_returnDefinition(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1645
     * @apilevel internal
     */
    public boolean Define_inAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new ArrayList<FFunctionCallLeft>();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        int childIndex = this.getIndexOfChild(caller);
        return nextGeneratedVarName(gvt);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1882
     * @apilevel internal
     */
    public boolean Define_inEquationSection(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_inEquationSection(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1887
     * @apilevel internal
     */
    public boolean Define_inInitialEquationSection(ASTNode caller, ASTNode child) {
        if (caller == getFInitialEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_inInitialEquationSection(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1897
     * @apilevel internal
     */
    public boolean Define_inNoEventExp(ASTNode caller, ASTNode child) {
        if (caller == getFParameterEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_inNoEventExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1943
     * @apilevel internal
     */
    public boolean Define_isInitial(ASTNode caller, ASTNode child) {
        if (caller == getFInitialEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return false;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:372
     * @apilevel internal
     */
    public FAbstractEquation Define_surroundingFAbstractEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1683
     * @apilevel internal
     */
    public FWhenEquation Define_myWhen(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1693
     * @apilevel internal
     */
    public FWhenEquation Define_findTopWhen(ASTNode caller, ASTNode child, FWhenEquation last) {
        int childIndex = this.getIndexOfChild(caller);
        return last;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2095
     * @apilevel internal
     */
    public InstComponentDecl Define_findComponentWithThisBindingExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2104
     * @apilevel internal
     */
    public int Define_findDepthOfNestledFunctionCalls(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1838
     * @apilevel internal
     */
    public boolean Define_isElse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:106
     * @apilevel internal
     */
    public boolean Define_canPropagateContext(ASTNode caller, ASTNode child) {
        if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return true;
        }
        else {
            return getParent().Define_canPropagateContext(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1288
     * @apilevel internal
     */
    public FIfWhenEquation Define_surroundingIfOrElse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2324
     * @apilevel internal
     */
    public CodeGenContext Define_myCodeGenContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return codeGenContext;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:519
     * @apilevel internal
     */
    public boolean Define_isAssignUse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:352
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRealVariable> reals() {
        if(FClass_reals_computed) {
            return FClass_reals_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_reals_value = reals_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_reals_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_reals_value;
    }
    Collection FClass_reals_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for reals
     */
    public Collection FClass_reals_contributors() {
        if(FClass_reals_contributors == null)
            FClass_reals_contributors  = new LinkedList();
        return FClass_reals_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRealVariable> reals_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_reals();
        FClass_reals_value = new ArrayList<FRealVariable>();
        if(FClass_reals_contributors != null)
        for (Iterator iter = FClass_reals_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_reals(FClass_reals_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_reals_contributors = null;
        return FClass_reals_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_reals_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRealVariable> FClass_reals_value;
    /**
     * @apilevel internal
     */
    private void FClass_reals_reset() {
        FClass_reals_computed = false;
        FClass_reals_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:357
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FIntegerVariable> integers() {
        if(FClass_integers_computed) {
            return FClass_integers_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_integers_value = integers_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_integers_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_integers_value;
    }
    Collection FClass_integers_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for integers
     */
    public Collection FClass_integers_contributors() {
        if(FClass_integers_contributors == null)
            FClass_integers_contributors  = new LinkedList();
        return FClass_integers_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FIntegerVariable> integers_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_integers();
        FClass_integers_value = new ArrayList<FIntegerVariable>();
        if(FClass_integers_contributors != null)
        for (Iterator iter = FClass_integers_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_integers(FClass_integers_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_integers_contributors = null;
        return FClass_integers_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_integers_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FIntegerVariable> FClass_integers_value;
    /**
     * @apilevel internal
     */
    private void FClass_integers_reset() {
        FClass_integers_computed = false;
        FClass_integers_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:362
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FEnumVariable> enums() {
        if(FClass_enums_computed) {
            return FClass_enums_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_enums_value = enums_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_enums_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_enums_value;
    }
    Collection FClass_enums_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for enums
     */
    public Collection FClass_enums_contributors() {
        if(FClass_enums_contributors == null)
            FClass_enums_contributors  = new LinkedList();
        return FClass_enums_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FEnumVariable> enums_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_enums();
        FClass_enums_value = new ArrayList<FEnumVariable>();
        if(FClass_enums_contributors != null)
        for (Iterator iter = FClass_enums_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_enums(FClass_enums_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_enums_contributors = null;
        return FClass_enums_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_enums_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FEnumVariable> FClass_enums_value;
    /**
     * @apilevel internal
     */
    private void FClass_enums_reset() {
        FClass_enums_computed = false;
        FClass_enums_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:367
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FBooleanVariable> booleans() {
        if(FClass_booleans_computed) {
            return FClass_booleans_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_booleans_value = booleans_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_booleans_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_booleans_value;
    }
    Collection FClass_booleans_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for booleans
     */
    public Collection FClass_booleans_contributors() {
        if(FClass_booleans_contributors == null)
            FClass_booleans_contributors  = new LinkedList();
        return FClass_booleans_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FBooleanVariable> booleans_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_booleans();
        FClass_booleans_value = new ArrayList<FBooleanVariable>();
        if(FClass_booleans_contributors != null)
        for (Iterator iter = FClass_booleans_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_booleans(FClass_booleans_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_booleans_contributors = null;
        return FClass_booleans_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_booleans_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FBooleanVariable> FClass_booleans_value;
    /**
     * @apilevel internal
     */
    private void FClass_booleans_reset() {
        FClass_booleans_computed = false;
        FClass_booleans_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:372
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FStringVariable> strings() {
        if(FClass_strings_computed) {
            return FClass_strings_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_strings_value = strings_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_strings_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_strings_value;
    }
    Collection FClass_strings_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for strings
     */
    public Collection FClass_strings_contributors() {
        if(FClass_strings_contributors == null)
            FClass_strings_contributors  = new LinkedList();
        return FClass_strings_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FStringVariable> strings_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_strings();
        FClass_strings_value = new ArrayList<FStringVariable>();
        if(FClass_strings_contributors != null)
        for (Iterator iter = FClass_strings_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_strings(FClass_strings_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_strings_contributors = null;
        return FClass_strings_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_strings_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FStringVariable> FClass_strings_value;
    /**
     * @apilevel internal
     */
    private void FClass_strings_reset() {
        FClass_strings_computed = false;
        FClass_strings_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:377
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> independentConstants() {
        if(FClass_independentConstants_computed) {
            return FClass_independentConstants_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_independentConstants_value = independentConstants_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_independentConstants_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_independentConstants_value;
    }
    Collection FClass_independentConstants_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for independentConstants
     */
    public Collection FClass_independentConstants_contributors() {
        if(FClass_independentConstants_contributors == null)
            FClass_independentConstants_contributors  = new LinkedList();
        return FClass_independentConstants_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> independentConstants_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_independentConstants();
        FClass_independentConstants_value = new ArrayList<FVariable>();
        if(FClass_independentConstants_contributors != null)
        for (Iterator iter = FClass_independentConstants_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_independentConstants(FClass_independentConstants_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_independentConstants_contributors = null;
        return FClass_independentConstants_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_independentConstants_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_independentConstants_value;
    /**
     * @apilevel internal
     */
    private void FClass_independentConstants_reset() {
        FClass_independentConstants_computed = false;
        FClass_independentConstants_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:384
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExternalObjectVariable> externalObjectVariables() {
        if(FClass_externalObjectVariables_computed) {
            return FClass_externalObjectVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_externalObjectVariables_value = externalObjectVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_externalObjectVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_externalObjectVariables_value;
    }
    Collection FClass_externalObjectVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for externalObjectVariables
     */
    public Collection FClass_externalObjectVariables_contributors() {
        if(FClass_externalObjectVariables_contributors == null)
            FClass_externalObjectVariables_contributors  = new LinkedList();
        return FClass_externalObjectVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FExternalObjectVariable> externalObjectVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_externalObjectVariables();
        FClass_externalObjectVariables_value = new ArrayList<FExternalObjectVariable>();
        if(FClass_externalObjectVariables_contributors != null)
        for (Iterator iter = FClass_externalObjectVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_externalObjectVariables(FClass_externalObjectVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_externalObjectVariables_contributors = null;
        return FClass_externalObjectVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_externalObjectVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExternalObjectVariable> FClass_externalObjectVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_externalObjectVariables_reset() {
        FClass_externalObjectVariables_computed = false;
        FClass_externalObjectVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:513
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> regularIndependentParameters() {
        if(FClass_regularIndependentParameters_computed) {
            return FClass_regularIndependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_regularIndependentParameters_value = regularIndependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_regularIndependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_regularIndependentParameters_value;
    }
    Collection FClass_regularIndependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for regularIndependentParameters
     */
    public Collection FClass_regularIndependentParameters_contributors() {
        if(FClass_regularIndependentParameters_contributors == null)
            FClass_regularIndependentParameters_contributors  = new LinkedList();
        return FClass_regularIndependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> regularIndependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_regularIndependentParameters();
        FClass_regularIndependentParameters_value = new ArrayList<FVariable>();
        if(FClass_regularIndependentParameters_contributors != null)
        for (Iterator iter = FClass_regularIndependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_regularIndependentParameters(FClass_regularIndependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_regularIndependentParameters_contributors = null;
        return FClass_regularIndependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_regularIndependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_regularIndependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_regularIndependentParameters_reset() {
        FClass_regularIndependentParameters_computed = false;
        FClass_regularIndependentParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:540
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> structuralIndependentParameters() {
        if(FClass_structuralIndependentParameters_computed) {
            return FClass_structuralIndependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_structuralIndependentParameters_value = structuralIndependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_structuralIndependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_structuralIndependentParameters_value;
    }
    Collection FClass_structuralIndependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for structuralIndependentParameters
     */
    public Collection FClass_structuralIndependentParameters_contributors() {
        if(FClass_structuralIndependentParameters_contributors == null)
            FClass_structuralIndependentParameters_contributors  = new LinkedList();
        return FClass_structuralIndependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> structuralIndependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_structuralIndependentParameters();
        FClass_structuralIndependentParameters_value = new ArrayList<FVariable>();
        if(FClass_structuralIndependentParameters_contributors != null)
        for (Iterator iter = FClass_structuralIndependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_structuralIndependentParameters(FClass_structuralIndependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_structuralIndependentParameters_contributors = null;
        return FClass_structuralIndependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_structuralIndependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_structuralIndependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_structuralIndependentParameters_reset() {
        FClass_structuralIndependentParameters_computed = false;
        FClass_structuralIndependentParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:567
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> finalIndependentParameters() {
        if(FClass_finalIndependentParameters_computed) {
            return FClass_finalIndependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_finalIndependentParameters_value = finalIndependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_finalIndependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_finalIndependentParameters_value;
    }
    Collection FClass_finalIndependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for finalIndependentParameters
     */
    public Collection FClass_finalIndependentParameters_contributors() {
        if(FClass_finalIndependentParameters_contributors == null)
            FClass_finalIndependentParameters_contributors  = new LinkedList();
        return FClass_finalIndependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> finalIndependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_finalIndependentParameters();
        FClass_finalIndependentParameters_value = new ArrayList<FVariable>();
        if(FClass_finalIndependentParameters_contributors != null)
        for (Iterator iter = FClass_finalIndependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_finalIndependentParameters(FClass_finalIndependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_finalIndependentParameters_contributors = null;
        return FClass_finalIndependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_finalIndependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_finalIndependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_finalIndependentParameters_reset() {
        FClass_finalIndependentParameters_computed = false;
        FClass_finalIndependentParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:594
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> evalIndependentParameters() {
        if(FClass_evalIndependentParameters_computed) {
            return FClass_evalIndependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_evalIndependentParameters_value = evalIndependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_evalIndependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_evalIndependentParameters_value;
    }
    Collection FClass_evalIndependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for evalIndependentParameters
     */
    public Collection FClass_evalIndependentParameters_contributors() {
        if(FClass_evalIndependentParameters_contributors == null)
            FClass_evalIndependentParameters_contributors  = new LinkedList();
        return FClass_evalIndependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> evalIndependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_evalIndependentParameters();
        FClass_evalIndependentParameters_value = new ArrayList<FVariable>();
        if(FClass_evalIndependentParameters_contributors != null)
        for (Iterator iter = FClass_evalIndependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_evalIndependentParameters(FClass_evalIndependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_evalIndependentParameters_contributors = null;
        return FClass_evalIndependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_evalIndependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_evalIndependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_evalIndependentParameters_reset() {
        FClass_evalIndependentParameters_computed = false;
        FClass_evalIndependentParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:621
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> dependentParameters() {
        if(FClass_dependentParameters_computed) {
            return FClass_dependentParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_dependentParameters_value = dependentParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_dependentParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_dependentParameters_value;
    }
    Collection FClass_dependentParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dependentParameters
     */
    public Collection FClass_dependentParameters_contributors() {
        if(FClass_dependentParameters_contributors == null)
            FClass_dependentParameters_contributors  = new LinkedList();
        return FClass_dependentParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> dependentParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_dependentParameters();
        FClass_dependentParameters_value = new ArrayList<FVariable>();
        if(FClass_dependentParameters_contributors != null)
        for (Iterator iter = FClass_dependentParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_dependentParameters(FClass_dependentParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_dependentParameters_contributors = null;
        return FClass_dependentParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_dependentParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_dependentParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_dependentParameters_reset() {
        FClass_dependentParameters_computed = false;
        FClass_dependentParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:669
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FRealVariable> allDifferentiatedRealVariables() {
        if(FClass_allDifferentiatedRealVariables_computed) {
            return FClass_allDifferentiatedRealVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_allDifferentiatedRealVariables_value = allDifferentiatedRealVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_allDifferentiatedRealVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_allDifferentiatedRealVariables_value;
    }
    Collection FClass_allDifferentiatedRealVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for allDifferentiatedRealVariables
     */
    public Collection FClass_allDifferentiatedRealVariables_contributors() {
        if(FClass_allDifferentiatedRealVariables_contributors == null)
            FClass_allDifferentiatedRealVariables_contributors  = new LinkedList();
        return FClass_allDifferentiatedRealVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FRealVariable> allDifferentiatedRealVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_allDifferentiatedRealVariables();
        FClass_allDifferentiatedRealVariables_value = new LinkedHashSet<FRealVariable>();
        if(FClass_allDifferentiatedRealVariables_contributors != null)
        for (Iterator iter = FClass_allDifferentiatedRealVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_allDifferentiatedRealVariables(FClass_allDifferentiatedRealVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_allDifferentiatedRealVariables_contributors = null;
        return FClass_allDifferentiatedRealVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_allDifferentiatedRealVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FRealVariable> FClass_allDifferentiatedRealVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_allDifferentiatedRealVariables_reset() {
        FClass_allDifferentiatedRealVariables_computed = false;
        FClass_allDifferentiatedRealVariables_value = null;
    }
    /**
     * Collection that contains all differentiated variables that has been
     * found to be dynamic states. All of these variables originates from
     * the original model.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:702
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FRealVariable> dynamicStates() {
        if(FClass_dynamicStates_computed) {
            return FClass_dynamicStates_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_dynamicStates_value = dynamicStates_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_dynamicStates_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_dynamicStates_value;
    }
    Collection FClass_dynamicStates_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dynamicStates
     */
    public Collection FClass_dynamicStates_contributors() {
        if(FClass_dynamicStates_contributors == null)
            FClass_dynamicStates_contributors  = new LinkedList();
        return FClass_dynamicStates_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FRealVariable> dynamicStates_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_dynamicStates();
        FClass_dynamicStates_value = new LinkedHashSet<FRealVariable>();
        if(FClass_dynamicStates_contributors != null)
        for (Iterator iter = FClass_dynamicStates_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_dynamicStates(FClass_dynamicStates_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_dynamicStates_contributors = null;
        return FClass_dynamicStates_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_dynamicStates_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FRealVariable> FClass_dynamicStates_value;
    /**
     * @apilevel internal
     */
    private void FClass_dynamicStates_reset() {
        FClass_dynamicStates_computed = false;
        FClass_dynamicStates_value = null;
    }
    /**
     * Collection that contains all dynamic state variables introduced by the
     * compiler. This collection differs from dynamicStates() in that it 
     * contains all the actual states.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:713
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FDynamicStateVariable> dynamicStateVariables() {
        if(FClass_dynamicStateVariables_computed) {
            return FClass_dynamicStateVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_dynamicStateVariables_value = dynamicStateVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_dynamicStateVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_dynamicStateVariables_value;
    }
    Collection FClass_dynamicStateVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dynamicStateVariables
     */
    public Collection FClass_dynamicStateVariables_contributors() {
        if(FClass_dynamicStateVariables_contributors == null)
            FClass_dynamicStateVariables_contributors  = new LinkedList();
        return FClass_dynamicStateVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FDynamicStateVariable> dynamicStateVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_dynamicStateVariables();
        FClass_dynamicStateVariables_value = new LinkedHashSet<FDynamicStateVariable>();
        if(FClass_dynamicStateVariables_contributors != null)
        for (Iterator iter = FClass_dynamicStateVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_dynamicStateVariables(FClass_dynamicStateVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_dynamicStateVariables_contributors = null;
        return FClass_dynamicStateVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_dynamicStateVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FDynamicStateVariable> FClass_dynamicStateVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_dynamicStateVariables_reset() {
        FClass_dynamicStateVariables_computed = false;
        FClass_dynamicStateVariables_value = null;
    }
    /**
     * Collection that contains all dynamic algebraic variables introduced by the
     * compiler.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:723
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FDynamicAlgebraicVariable> dynamicAlgebraicVariables() {
        if(FClass_dynamicAlgebraicVariables_computed) {
            return FClass_dynamicAlgebraicVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_dynamicAlgebraicVariables_value = dynamicAlgebraicVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_dynamicAlgebraicVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_dynamicAlgebraicVariables_value;
    }
    Collection FClass_dynamicAlgebraicVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for dynamicAlgebraicVariables
     */
    public Collection FClass_dynamicAlgebraicVariables_contributors() {
        if(FClass_dynamicAlgebraicVariables_contributors == null)
            FClass_dynamicAlgebraicVariables_contributors  = new LinkedList();
        return FClass_dynamicAlgebraicVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FDynamicAlgebraicVariable> dynamicAlgebraicVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_dynamicAlgebraicVariables();
        FClass_dynamicAlgebraicVariables_value = new LinkedHashSet<FDynamicAlgebraicVariable>();
        if(FClass_dynamicAlgebraicVariables_contributors != null)
        for (Iterator iter = FClass_dynamicAlgebraicVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_dynamicAlgebraicVariables(FClass_dynamicAlgebraicVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_dynamicAlgebraicVariables_contributors = null;
        return FClass_dynamicAlgebraicVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_dynamicAlgebraicVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FDynamicAlgebraicVariable> FClass_dynamicAlgebraicVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_dynamicAlgebraicVariables_reset() {
        FClass_dynamicAlgebraicVariables_computed = false;
        FClass_dynamicAlgebraicVariables_value = null;
    }
    /**
     * Returns the same set as differentiatedRealVariablesSet, except derivatives with no
     * uses that were not introduced because of stateselect.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:733
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FRealVariable> differentiatedRealVariablesFilteredSet() {
        if(FClass_differentiatedRealVariablesFilteredSet_computed) {
            return FClass_differentiatedRealVariablesFilteredSet_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_differentiatedRealVariablesFilteredSet_value = differentiatedRealVariablesFilteredSet_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_differentiatedRealVariablesFilteredSet_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_differentiatedRealVariablesFilteredSet_value;
    }
    Collection FClass_differentiatedRealVariablesFilteredSet_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for differentiatedRealVariablesFilteredSet
     */
    public Collection FClass_differentiatedRealVariablesFilteredSet_contributors() {
        if(FClass_differentiatedRealVariablesFilteredSet_contributors == null)
            FClass_differentiatedRealVariablesFilteredSet_contributors  = new LinkedList();
        return FClass_differentiatedRealVariablesFilteredSet_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FRealVariable> differentiatedRealVariablesFilteredSet_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_differentiatedRealVariablesFilteredSet();
        FClass_differentiatedRealVariablesFilteredSet_value = new LinkedHashSet<FRealVariable>();
        if(FClass_differentiatedRealVariablesFilteredSet_contributors != null)
        for (Iterator iter = FClass_differentiatedRealVariablesFilteredSet_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_differentiatedRealVariablesFilteredSet(FClass_differentiatedRealVariablesFilteredSet_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_differentiatedRealVariablesFilteredSet_contributors = null;
        return FClass_differentiatedRealVariablesFilteredSet_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_differentiatedRealVariablesFilteredSet_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FRealVariable> FClass_differentiatedRealVariablesFilteredSet_value;
    /**
     * @apilevel internal
     */
    private void FClass_differentiatedRealVariablesFilteredSet_reset() {
        FClass_differentiatedRealVariablesFilteredSet_computed = false;
        FClass_differentiatedRealVariablesFilteredSet_value = null;
    }
    /**
     * \brief Collection of all callables called by a partial function call
     * or kept as a component.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:747
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FFunctionDecl> myFFunctionDeclsPartial() {
        if(FClass_myFFunctionDeclsPartial_computed) {
            return FClass_myFFunctionDeclsPartial_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_myFFunctionDeclsPartial_value = myFFunctionDeclsPartial_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_myFFunctionDeclsPartial_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_myFFunctionDeclsPartial_value;
    }
    Collection FClass_myFFunctionDeclsPartial_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for myFFunctionDeclsPartial
     */
    public Collection FClass_myFFunctionDeclsPartial_contributors() {
        if(FClass_myFFunctionDeclsPartial_contributors == null)
            FClass_myFFunctionDeclsPartial_contributors  = new LinkedList();
        return FClass_myFFunctionDeclsPartial_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FFunctionDecl> myFFunctionDeclsPartial_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_myFFunctionDeclsPartial();
        FClass_myFFunctionDeclsPartial_value = new LinkedHashSet<FFunctionDecl>();
        if(FClass_myFFunctionDeclsPartial_contributors != null)
        for (Iterator iter = FClass_myFFunctionDeclsPartial_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_myFFunctionDeclsPartial(FClass_myFFunctionDeclsPartial_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_myFFunctionDeclsPartial_contributors = null;
        return FClass_myFFunctionDeclsPartial_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_myFFunctionDeclsPartial_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FFunctionDecl> FClass_myFFunctionDeclsPartial_value;
    /**
     * @apilevel internal
     */
    private void FClass_myFFunctionDeclsPartial_reset() {
        FClass_myFFunctionDeclsPartial_computed = false;
        FClass_myFFunctionDeclsPartial_value = null;
    }
    /**
     * \brief Collection of all FFunctionDecls called by a partial function call.
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:756
     */
    @ASTNodeAnnotation.Attribute
    public LinkedHashSet<FFunctionDecl> myFFunctionDeclsPartialCalled() {
        if(FClass_myFFunctionDeclsPartialCalled_computed) {
            return FClass_myFFunctionDeclsPartialCalled_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_myFFunctionDeclsPartialCalled_value = myFFunctionDeclsPartialCalled_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_myFFunctionDeclsPartialCalled_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_myFFunctionDeclsPartialCalled_value;
    }
    Collection FClass_myFFunctionDeclsPartialCalled_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for myFFunctionDeclsPartialCalled
     */
    public Collection FClass_myFFunctionDeclsPartialCalled_contributors() {
        if(FClass_myFFunctionDeclsPartialCalled_contributors == null)
            FClass_myFFunctionDeclsPartialCalled_contributors  = new LinkedList();
        return FClass_myFFunctionDeclsPartialCalled_contributors;
    }

    /**
     * @apilevel internal
     */
    private LinkedHashSet<FFunctionDecl> myFFunctionDeclsPartialCalled_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_myFFunctionDeclsPartialCalled();
        FClass_myFFunctionDeclsPartialCalled_value = new LinkedHashSet<FFunctionDecl>();
        if(FClass_myFFunctionDeclsPartialCalled_contributors != null)
        for (Iterator iter = FClass_myFFunctionDeclsPartialCalled_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_myFFunctionDeclsPartialCalled(FClass_myFFunctionDeclsPartialCalled_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_myFFunctionDeclsPartialCalled_contributors = null;
        return FClass_myFFunctionDeclsPartialCalled_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_myFFunctionDeclsPartialCalled_computed = false;
    /**
     * @apilevel internal
     */
    protected LinkedHashSet<FFunctionDecl> FClass_myFFunctionDeclsPartialCalled_value;
    /**
     * @apilevel internal
     */
    private void FClass_myFFunctionDeclsPartialCalled_reset() {
        FClass_myFFunctionDeclsPartialCalled_computed = false;
        FClass_myFFunctionDeclsPartialCalled_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:760
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FDelayExp> myDelayExps() {
        if(FClass_myDelayExps_computed) {
            return FClass_myDelayExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_myDelayExps_value = myDelayExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_myDelayExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_myDelayExps_value;
    }
    Collection FClass_myDelayExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for myDelayExps
     */
    public Collection FClass_myDelayExps_contributors() {
        if(FClass_myDelayExps_contributors == null)
            FClass_myDelayExps_contributors  = new LinkedList();
        return FClass_myDelayExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FDelayExp> myDelayExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_myDelayExps();
        FClass_myDelayExps_value = new ArrayList<FDelayExp>();
        if(FClass_myDelayExps_contributors != null)
        for (Iterator iter = FClass_myDelayExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_myDelayExps(FClass_myDelayExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_myDelayExps_contributors = null;
        return FClass_myDelayExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_myDelayExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FDelayExp> FClass_myDelayExps_value;
    /**
     * @apilevel internal
     */
    private void FClass_myDelayExps_reset() {
        FClass_myDelayExps_computed = false;
        FClass_myDelayExps_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:766
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FSpatialDistExp> mySpatialDistExps() {
        if(FClass_mySpatialDistExps_computed) {
            return FClass_mySpatialDistExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_mySpatialDistExps_value = mySpatialDistExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_mySpatialDistExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_mySpatialDistExps_value;
    }
    Collection FClass_mySpatialDistExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for mySpatialDistExps
     */
    public Collection FClass_mySpatialDistExps_contributors() {
        if(FClass_mySpatialDistExps_contributors == null)
            FClass_mySpatialDistExps_contributors  = new LinkedList();
        return FClass_mySpatialDistExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FSpatialDistExp> mySpatialDistExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_mySpatialDistExps();
        FClass_mySpatialDistExps_value = new ArrayList<FSpatialDistExp>();
        if(FClass_mySpatialDistExps_contributors != null)
        for (Iterator iter = FClass_mySpatialDistExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_mySpatialDistExps(FClass_mySpatialDistExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_mySpatialDistExps_contributors = null;
        return FClass_mySpatialDistExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_mySpatialDistExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FSpatialDistExp> FClass_mySpatialDistExps_value;
    /**
     * @apilevel internal
     */
    private void FClass_mySpatialDistExps_reset() {
        FClass_mySpatialDistExps_computed = false;
        FClass_mySpatialDistExps_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:785
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FDerivativeVariable> derivativeVariables() {
        if(FClass_derivativeVariables_computed) {
            return FClass_derivativeVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_derivativeVariables_value = derivativeVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_derivativeVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_derivativeVariables_value;
    }
    Collection FClass_derivativeVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for derivativeVariables
     */
    public Collection FClass_derivativeVariables_contributors() {
        if(FClass_derivativeVariables_contributors == null)
            FClass_derivativeVariables_contributors  = new LinkedList();
        return FClass_derivativeVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FDerivativeVariable> derivativeVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_derivativeVariables();
        FClass_derivativeVariables_value = new ArrayList<FDerivativeVariable>();
        if(FClass_derivativeVariables_contributors != null)
        for (Iterator iter = FClass_derivativeVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_derivativeVariables(FClass_derivativeVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_derivativeVariables_contributors = null;
        return FClass_derivativeVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_derivativeVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FDerivativeVariable> FClass_derivativeVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_derivativeVariables_reset() {
        FClass_derivativeVariables_computed = false;
        FClass_derivativeVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:792
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> variables() {
        if(FClass_variables_computed) {
            return FClass_variables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_variables_value = variables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_variables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_variables_value;
    }
    Collection FClass_variables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for variables
     */
    public Collection FClass_variables_contributors() {
        if(FClass_variables_contributors == null)
            FClass_variables_contributors  = new LinkedList();
        return FClass_variables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> variables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_variables();
        FClass_variables_value = new ArrayList<FVariable>();
        if(FClass_variables_contributors != null)
        for (Iterator iter = FClass_variables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_variables(FClass_variables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_variables_contributors = null;
        return FClass_variables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_variables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_variables_value;
    /**
     * @apilevel internal
     */
    private void FClass_variables_reset() {
        FClass_variables_computed = false;
        FClass_variables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:799
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> discreteVariables() {
        if(FClass_discreteVariables_computed) {
            return FClass_discreteVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_discreteVariables_value = discreteVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_discreteVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_discreteVariables_value;
    }
    Collection FClass_discreteVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for discreteVariables
     */
    public Collection FClass_discreteVariables_contributors() {
        if(FClass_discreteVariables_contributors == null)
            FClass_discreteVariables_contributors  = new LinkedList();
        return FClass_discreteVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> discreteVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_discreteVariables();
        FClass_discreteVariables_value = new ArrayList<FVariable>();
        if(FClass_discreteVariables_contributors != null)
        for (Iterator iter = FClass_discreteVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_discreteVariables(FClass_discreteVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_discreteVariables_contributors = null;
        return FClass_discreteVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_discreteVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_discreteVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_discreteVariables_reset() {
        FClass_discreteVariables_computed = false;
        FClass_discreteVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:818
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> initialParameters() {
        if(FClass_initialParameters_computed) {
            return FClass_initialParameters_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_initialParameters_value = initialParameters_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_initialParameters_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_initialParameters_value;
    }
    Collection FClass_initialParameters_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for initialParameters
     */
    public Collection FClass_initialParameters_contributors() {
        if(FClass_initialParameters_contributors == null)
            FClass_initialParameters_contributors  = new LinkedList();
        return FClass_initialParameters_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> initialParameters_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_initialParameters();
        FClass_initialParameters_value = new ArrayList<FVariable>();
        if(FClass_initialParameters_contributors != null)
        for (Iterator iter = FClass_initialParameters_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_initialParameters(FClass_initialParameters_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_initialParameters_contributors = null;
        return FClass_initialParameters_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_initialParameters_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_initialParameters_value;
    /**
     * @apilevel internal
     */
    private void FClass_initialParameters_reset() {
        FClass_initialParameters_computed = false;
        FClass_initialParameters_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:870
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> aliasVariables() {
        if(FClass_aliasVariables_computed) {
            return FClass_aliasVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_aliasVariables_value = aliasVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_aliasVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_aliasVariables_value;
    }
    Collection FClass_aliasVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for aliasVariables
     */
    public Collection FClass_aliasVariables_contributors() {
        if(FClass_aliasVariables_contributors == null)
            FClass_aliasVariables_contributors  = new LinkedList();
        return FClass_aliasVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> aliasVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_aliasVariables();
        FClass_aliasVariables_value = new ArrayList<FVariable>();
        if(FClass_aliasVariables_contributors != null)
        for (Iterator iter = FClass_aliasVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_aliasVariables(FClass_aliasVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_aliasVariables_contributors = null;
        return FClass_aliasVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_aliasVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_aliasVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_aliasVariables_reset() {
        FClass_aliasVariables_computed = false;
        FClass_aliasVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:889
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> tempVariables() {
        if(FClass_tempVariables_computed) {
            return FClass_tempVariables_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_tempVariables_value = tempVariables_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_tempVariables_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_tempVariables_value;
    }
    Collection FClass_tempVariables_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for tempVariables
     */
    public Collection FClass_tempVariables_contributors() {
        if(FClass_tempVariables_contributors == null)
            FClass_tempVariables_contributors  = new LinkedList();
        return FClass_tempVariables_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> tempVariables_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_tempVariables();
        FClass_tempVariables_value = new ArrayList<FVariable>();
        if(FClass_tempVariables_contributors != null)
        for (Iterator iter = FClass_tempVariables_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_tempVariables(FClass_tempVariables_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_tempVariables_contributors = null;
        return FClass_tempVariables_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_tempVariables_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_tempVariables_value;
    /**
     * @apilevel internal
     */
    private void FClass_tempVariables_reset() {
        FClass_tempVariables_computed = false;
        FClass_tempVariables_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:982
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> variablesWithBindingExp() {
        if(FClass_variablesWithBindingExp_computed) {
            return FClass_variablesWithBindingExp_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_variablesWithBindingExp_value = variablesWithBindingExp_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_variablesWithBindingExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_variablesWithBindingExp_value;
    }
    Collection FClass_variablesWithBindingExp_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for variablesWithBindingExp
     */
    public Collection FClass_variablesWithBindingExp_contributors() {
        if(FClass_variablesWithBindingExp_contributors == null)
            FClass_variablesWithBindingExp_contributors  = new LinkedList();
        return FClass_variablesWithBindingExp_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> variablesWithBindingExp_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_variablesWithBindingExp();
        FClass_variablesWithBindingExp_value = new ArrayList<FVariable>();
        if(FClass_variablesWithBindingExp_contributors != null)
        for (Iterator iter = FClass_variablesWithBindingExp_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_variablesWithBindingExp(FClass_variablesWithBindingExp_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_variablesWithBindingExp_contributors = null;
        return FClass_variablesWithBindingExp_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_variablesWithBindingExp_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_variablesWithBindingExp_value;
    /**
     * @apilevel internal
     */
    private void FClass_variablesWithBindingExp_reset() {
        FClass_variablesWithBindingExp_computed = false;
        FClass_variablesWithBindingExp_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1009
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> inputs() {
        if(FClass_inputs_computed) {
            return FClass_inputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_inputs_value = inputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_inputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_inputs_value;
    }
    Collection FClass_inputs_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for inputs
     */
    public Collection FClass_inputs_contributors() {
        if(FClass_inputs_contributors == null)
            FClass_inputs_contributors  = new LinkedList();
        return FClass_inputs_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> inputs_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_inputs();
        FClass_inputs_value = new ArrayList<FVariable>();
        if(FClass_inputs_contributors != null)
        for (Iterator iter = FClass_inputs_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_inputs(FClass_inputs_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_inputs_contributors = null;
        return FClass_inputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_inputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_inputs_value;
    /**
     * @apilevel internal
     */
    private void FClass_inputs_reset() {
        FClass_inputs_computed = false;
        FClass_inputs_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1039
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FVariable> outputs() {
        if(FClass_outputs_computed) {
            return FClass_outputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_outputs_value = outputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_outputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_outputs_value;
    }
    Collection FClass_outputs_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for outputs
     */
    public Collection FClass_outputs_contributors() {
        if(FClass_outputs_contributors == null)
            FClass_outputs_contributors  = new LinkedList();
        return FClass_outputs_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FVariable> outputs_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_outputs();
        FClass_outputs_value = new ArrayList<FVariable>();
        if(FClass_outputs_contributors != null)
        for (Iterator iter = FClass_outputs_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_outputs(FClass_outputs_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_outputs_contributors = null;
        return FClass_outputs_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_outputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FVariable> FClass_outputs_value;
    /**
     * @apilevel internal
     */
    private void FClass_outputs_reset() {
        FClass_outputs_computed = false;
        FClass_outputs_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1100
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAlgorithm> algorithms() {
        if(FClass_algorithms_computed) {
            return FClass_algorithms_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_algorithms_value = algorithms_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_algorithms_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_algorithms_value;
    }
    Collection FClass_algorithms_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for algorithms
     */
    public Collection FClass_algorithms_contributors() {
        if(FClass_algorithms_contributors == null)
            FClass_algorithms_contributors  = new LinkedList();
        return FClass_algorithms_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FAlgorithm> algorithms_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_algorithms();
        FClass_algorithms_value = new ArrayList<FAlgorithm>();
        if(FClass_algorithms_contributors != null)
        for (Iterator iter = FClass_algorithms_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_algorithms(FClass_algorithms_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_algorithms_contributors = null;
        return FClass_algorithms_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_algorithms_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAlgorithm> FClass_algorithms_value;
    /**
     * @apilevel internal
     */
    private void FClass_algorithms_reset() {
        FClass_algorithms_computed = false;
        FClass_algorithms_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1272
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FSampleExp> sampleExpsWithTimeEvent() {
        if(FClass_sampleExpsWithTimeEvent_computed) {
            return FClass_sampleExpsWithTimeEvent_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_sampleExpsWithTimeEvent_value = sampleExpsWithTimeEvent_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_sampleExpsWithTimeEvent_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_sampleExpsWithTimeEvent_value;
    }
    Collection FClass_sampleExpsWithTimeEvent_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for sampleExpsWithTimeEvent
     */
    public Collection FClass_sampleExpsWithTimeEvent_contributors() {
        if(FClass_sampleExpsWithTimeEvent_contributors == null)
            FClass_sampleExpsWithTimeEvent_contributors  = new LinkedList();
        return FClass_sampleExpsWithTimeEvent_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FSampleExp> sampleExpsWithTimeEvent_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_sampleExpsWithTimeEvent();
        FClass_sampleExpsWithTimeEvent_value = new ArrayList<FSampleExp>();
        if(FClass_sampleExpsWithTimeEvent_contributors != null)
        for (Iterator iter = FClass_sampleExpsWithTimeEvent_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_sampleExpsWithTimeEvent(FClass_sampleExpsWithTimeEvent_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_sampleExpsWithTimeEvent_contributors = null;
        return FClass_sampleExpsWithTimeEvent_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_sampleExpsWithTimeEvent_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FSampleExp> FClass_sampleExpsWithTimeEvent_value;
    /**
     * @apilevel internal
     */
    private void FClass_sampleExpsWithTimeEvent_reset() {
        FClass_sampleExpsWithTimeEvent_computed = false;
        FClass_sampleExpsWithTimeEvent_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1278
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FSpatialDistExp> spatialDistExpsWithStateEvent() {
        if(FClass_spatialDistExpsWithStateEvent_computed) {
            return FClass_spatialDistExpsWithStateEvent_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_spatialDistExpsWithStateEvent_value = spatialDistExpsWithStateEvent_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_spatialDistExpsWithStateEvent_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_spatialDistExpsWithStateEvent_value;
    }
    Collection FClass_spatialDistExpsWithStateEvent_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for spatialDistExpsWithStateEvent
     */
    public Collection FClass_spatialDistExpsWithStateEvent_contributors() {
        if(FClass_spatialDistExpsWithStateEvent_contributors == null)
            FClass_spatialDistExpsWithStateEvent_contributors  = new LinkedList();
        return FClass_spatialDistExpsWithStateEvent_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FSpatialDistExp> spatialDistExpsWithStateEvent_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_spatialDistExpsWithStateEvent();
        FClass_spatialDistExpsWithStateEvent_value = new ArrayList<FSpatialDistExp>();
        if(FClass_spatialDistExpsWithStateEvent_contributors != null)
        for (Iterator iter = FClass_spatialDistExpsWithStateEvent_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_spatialDistExpsWithStateEvent(FClass_spatialDistExpsWithStateEvent_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_spatialDistExpsWithStateEvent_contributors = null;
        return FClass_spatialDistExpsWithStateEvent_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_spatialDistExpsWithStateEvent_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FSpatialDistExp> FClass_spatialDistExpsWithStateEvent_value;
    /**
     * @apilevel internal
     */
    private void FClass_spatialDistExpsWithStateEvent_reset() {
        FClass_spatialDistExpsWithStateEvent_computed = false;
        FClass_spatialDistExpsWithStateEvent_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1284
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FDelayExp> delayExpsWithStateEvent() {
        if(FClass_delayExpsWithStateEvent_computed) {
            return FClass_delayExpsWithStateEvent_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_delayExpsWithStateEvent_value = delayExpsWithStateEvent_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_delayExpsWithStateEvent_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_delayExpsWithStateEvent_value;
    }
    Collection FClass_delayExpsWithStateEvent_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for delayExpsWithStateEvent
     */
    public Collection FClass_delayExpsWithStateEvent_contributors() {
        if(FClass_delayExpsWithStateEvent_contributors == null)
            FClass_delayExpsWithStateEvent_contributors  = new LinkedList();
        return FClass_delayExpsWithStateEvent_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FDelayExp> delayExpsWithStateEvent_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_delayExpsWithStateEvent();
        FClass_delayExpsWithStateEvent_value = new ArrayList<FDelayExp>();
        if(FClass_delayExpsWithStateEvent_contributors != null)
        for (Iterator iter = FClass_delayExpsWithStateEvent_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_delayExpsWithStateEvent(FClass_delayExpsWithStateEvent_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_delayExpsWithStateEvent_contributors = null;
        return FClass_delayExpsWithStateEvent_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_delayExpsWithStateEvent_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FDelayExp> FClass_delayExpsWithStateEvent_value;
    /**
     * @apilevel internal
     */
    private void FClass_delayExpsWithStateEvent_reset() {
        FClass_delayExpsWithStateEvent_computed = false;
        FClass_delayExpsWithStateEvent_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1298
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> guardExpInEquations() {
        if(FClass_guardExpInEquations_computed) {
            return FClass_guardExpInEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_guardExpInEquations_value = guardExpInEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_guardExpInEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_guardExpInEquations_value;
    }
    Collection FClass_guardExpInEquations_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for guardExpInEquations
     */
    public Collection FClass_guardExpInEquations_contributors() {
        if(FClass_guardExpInEquations_contributors == null)
            FClass_guardExpInEquations_contributors  = new LinkedList();
        return FClass_guardExpInEquations_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FExp> guardExpInEquations_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FlatRoot)) {
            node = node.getParent();
        }
        FlatRoot root = (FlatRoot) node;
        root.collect_contributors_FClass_guardExpInEquations();
        FClass_guardExpInEquations_value = new ArrayList<FExp>();
        if(FClass_guardExpInEquations_contributors != null)
        for (Iterator iter = FClass_guardExpInEquations_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_guardExpInEquations(FClass_guardExpInEquations_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_guardExpInEquations_contributors = null;
        return FClass_guardExpInEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_guardExpInEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> FClass_guardExpInEquations_value;
    /**
     * @apilevel internal
     */
    private void FClass_guardExpInEquations_reset() {
        FClass_guardExpInEquations_computed = false;
        FClass_guardExpInEquations_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1305
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FExp> guardExpInInitialEquations() {
        if(FClass_guardExpInInitialEquations_computed) {
            return FClass_guardExpInInitialEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_guardExpInInitialEquations_value = guardExpInInitialEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_guardExpInInitialEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_guardExpInInitialEquations_value;
    }
    Collection FClass_guardExpInInitialEquations_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for guardExpInInitialEquations
     */
    public Collection FClass_guardExpInInitialEquations_contributors() {
        if(FClass_guardExpInInitialEquations_contributors == null)
            FClass_guardExpInInitialEquations_contributors  = new LinkedList();
        return FClass_guardExpInInitialEquations_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FExp> guardExpInInitialEquations_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FlatRoot)) {
            node = node.getParent();
        }
        FlatRoot root = (FlatRoot) node;
        root.collect_contributors_FClass_guardExpInInitialEquations();
        FClass_guardExpInInitialEquations_value = new ArrayList<FExp>();
        if(FClass_guardExpInInitialEquations_contributors != null)
        for (Iterator iter = FClass_guardExpInInitialEquations_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_guardExpInInitialEquations(FClass_guardExpInInitialEquations_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_guardExpInInitialEquations_contributors = null;
        return FClass_guardExpInInitialEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_guardExpInInitialEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FExp> FClass_guardExpInInitialEquations_value;
    /**
     * @apilevel internal
     */
    private void FClass_guardExpInInitialEquations_reset() {
        FClass_guardExpInInitialEquations_computed = false;
        FClass_guardExpInInitialEquations_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1391
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpsWithEvent() {
        if(FClass_relExpsWithEvent_computed) {
            return FClass_relExpsWithEvent_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_relExpsWithEvent_value = relExpsWithEvent_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_relExpsWithEvent_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_relExpsWithEvent_value;
    }
    Collection FClass_relExpsWithEvent_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for relExpsWithEvent
     */
    public Collection FClass_relExpsWithEvent_contributors() {
        if(FClass_relExpsWithEvent_contributors == null)
            FClass_relExpsWithEvent_contributors  = new LinkedList();
        return FClass_relExpsWithEvent_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRelExp> relExpsWithEvent_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_relExpsWithEvent();
        FClass_relExpsWithEvent_value = new ArrayList<FRelExp>();
        if(FClass_relExpsWithEvent_contributors != null)
        for (Iterator iter = FClass_relExpsWithEvent_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_relExpsWithEvent(FClass_relExpsWithEvent_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_relExpsWithEvent_contributors = null;
        return FClass_relExpsWithEvent_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_relExpsWithEvent_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRelExp> FClass_relExpsWithEvent_value;
    /**
     * @apilevel internal
     */
    private void FClass_relExpsWithEvent_reset() {
        FClass_relExpsWithEvent_computed = false;
        FClass_relExpsWithEvent_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1468
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FRelExp> relExpInInitialEquations() {
        if(FClass_relExpInInitialEquations_computed) {
            return FClass_relExpInInitialEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_relExpInInitialEquations_value = relExpInInitialEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_relExpInInitialEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_relExpInInitialEquations_value;
    }
    Collection FClass_relExpInInitialEquations_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for relExpInInitialEquations
     */
    public Collection FClass_relExpInInitialEquations_contributors() {
        if(FClass_relExpInInitialEquations_contributors == null)
            FClass_relExpInInitialEquations_contributors  = new LinkedList();
        return FClass_relExpInInitialEquations_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FRelExp> relExpInInitialEquations_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_relExpInInitialEquations();
        FClass_relExpInInitialEquations_value = new ArrayList<FRelExp>();
        if(FClass_relExpInInitialEquations_contributors != null)
        for (Iterator iter = FClass_relExpInInitialEquations_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_relExpInInitialEquations(FClass_relExpInInitialEquations_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_relExpInInitialEquations_contributors = null;
        return FClass_relExpInInitialEquations_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_relExpInInitialEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FRelExp> FClass_relExpInInitialEquations_value;
    /**
     * @apilevel internal
     */
    private void FClass_relExpInInitialEquations_reset() {
        FClass_relExpInInitialEquations_computed = false;
        FClass_relExpInInitialEquations_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3736
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FAlgorithm> myAlgorithms() {
        if(FClass_myAlgorithms_computed) {
            return FClass_myAlgorithms_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_myAlgorithms_value = myAlgorithms_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_myAlgorithms_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_myAlgorithms_value;
    }
    Collection FClass_myAlgorithms_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for myAlgorithms
     */
    public Collection FClass_myAlgorithms_contributors() {
        if(FClass_myAlgorithms_contributors == null)
            FClass_myAlgorithms_contributors  = new LinkedList();
        return FClass_myAlgorithms_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FAlgorithm> myAlgorithms_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_myAlgorithms();
        FClass_myAlgorithms_value = new ArrayList<FAlgorithm>();
        if(FClass_myAlgorithms_contributors != null)
        for (Iterator iter = FClass_myAlgorithms_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_myAlgorithms(FClass_myAlgorithms_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_myAlgorithms_contributors = null;
        return FClass_myAlgorithms_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_myAlgorithms_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FAlgorithm> FClass_myAlgorithms_value;
    /**
     * @apilevel internal
     */
    private void FClass_myAlgorithms_reset() {
        FClass_myAlgorithms_computed = false;
        FClass_myAlgorithms_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatExternalFunctionAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3819
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<FExternalStmt> myExternals() {
        if(FClass_myExternals_computed) {
            return FClass_myExternals_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_myExternals_value = myExternals_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_myExternals_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_myExternals_value;
    }
    Collection FClass_myExternals_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for myExternals
     */
    public Collection FClass_myExternals_contributors() {
        if(FClass_myExternals_contributors == null)
            FClass_myExternals_contributors  = new LinkedList();
        return FClass_myExternals_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<FExternalStmt> myExternals_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_myExternals();
        FClass_myExternals_value = new LinkedHashSet<FExternalStmt>();
        if(FClass_myExternals_contributors != null)
        for (Iterator iter = FClass_myExternals_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_myExternals(FClass_myExternals_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_myExternals_contributors = null;
        return FClass_myExternals_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_myExternals_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<FExternalStmt> FClass_myExternals_value;
    /**
     * @apilevel internal
     */
    private void FClass_myExternals_reset() {
        FClass_myExternals_computed = false;
        FClass_myExternals_value = null;
    }
    /**
     * @attribute coll
     * @aspect FlatteningDebug
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1783
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<InstAccess> collectInstAccesses() {
        if(FClass_collectInstAccesses_computed) {
            return FClass_collectInstAccesses_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_collectInstAccesses_value = collectInstAccesses_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_collectInstAccesses_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_collectInstAccesses_value;
    }
    Collection FClass_collectInstAccesses_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for collectInstAccesses
     */
    public Collection FClass_collectInstAccesses_contributors() {
        if(FClass_collectInstAccesses_contributors == null)
            FClass_collectInstAccesses_contributors  = new LinkedList();
        return FClass_collectInstAccesses_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<InstAccess> collectInstAccesses_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_collectInstAccesses();
        FClass_collectInstAccesses_value = new HashSet<InstAccess>();
        if(FClass_collectInstAccesses_contributors != null)
        for (Iterator iter = FClass_collectInstAccesses_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_collectInstAccesses(FClass_collectInstAccesses_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_collectInstAccesses_contributors = null;
        return FClass_collectInstAccesses_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_collectInstAccesses_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<InstAccess> FClass_collectInstAccesses_value;
    /**
     * @apilevel internal
     */
    private void FClass_collectInstAccesses_reset() {
        FClass_collectInstAccesses_computed = false;
        FClass_collectInstAccesses_value = null;
    }
    /**
     * Collects all event generating expressions
     * @attribute coll
     * @aspect EventGeneratingExps
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3326
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FEventGenExp> eventGenExps() {
        if(FClass_eventGenExps_computed) {
            return FClass_eventGenExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_eventGenExps_value = eventGenExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_eventGenExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_eventGenExps_value;
    }
    Collection FClass_eventGenExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for eventGenExps
     */
    public Collection FClass_eventGenExps_contributors() {
        if(FClass_eventGenExps_contributors == null)
            FClass_eventGenExps_contributors  = new LinkedList();
        return FClass_eventGenExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private ArrayList<FEventGenExp> eventGenExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_eventGenExps();
        FClass_eventGenExps_value = new ArrayList<FEventGenExp>();
        if(FClass_eventGenExps_contributors != null)
        for (Iterator iter = FClass_eventGenExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_eventGenExps(FClass_eventGenExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_eventGenExps_contributors = null;
        return FClass_eventGenExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_eventGenExps_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<FEventGenExp> FClass_eventGenExps_value;
    /**
     * @apilevel internal
     */
    private void FClass_eventGenExps_reset() {
        FClass_eventGenExps_computed = false;
        FClass_eventGenExps_value = null;
    }
    /**
     * Collects semiLinear expressions.
     * @attribute coll
     * @aspect SemiLinear
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3647
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<FSemiLinearExp> collectSemiLinearExps() {
        if(FClass_collectSemiLinearExps_computed) {
            return FClass_collectSemiLinearExps_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FClass_collectSemiLinearExps_value = collectSemiLinearExps_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FClass_collectSemiLinearExps_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FClass_collectSemiLinearExps_value;
    }
    Collection FClass_collectSemiLinearExps_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for collectSemiLinearExps
     */
    public Collection FClass_collectSemiLinearExps_contributors() {
        if(FClass_collectSemiLinearExps_contributors == null)
            FClass_collectSemiLinearExps_contributors  = new LinkedList();
        return FClass_collectSemiLinearExps_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<FSemiLinearExp> collectSemiLinearExps_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FClass)) {
            node = node.getParent();
        }
        FClass root = (FClass) node;
        root.collect_contributors_FClass_collectSemiLinearExps();
        FClass_collectSemiLinearExps_value = new HashSet<FSemiLinearExp>();
        if(FClass_collectSemiLinearExps_contributors != null)
        for (Iterator iter = FClass_collectSemiLinearExps_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FClass_FClass_collectSemiLinearExps(FClass_collectSemiLinearExps_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FClass_collectSemiLinearExps_contributors = null;
        return FClass_collectSemiLinearExps_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FClass_collectSemiLinearExps_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<FSemiLinearExp> FClass_collectSemiLinearExps_value;
    /**
     * @apilevel internal
     */
    private void FClass_collectSemiLinearExps_reset() {
        FClass_collectSemiLinearExps_computed = false;
        FClass_collectSemiLinearExps_value = null;
    }
}
