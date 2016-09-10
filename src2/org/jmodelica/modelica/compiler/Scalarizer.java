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
 * @aspect Scalarization
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:26
 */
public abstract class Scalarizer extends Object {
    
        
        private List vars;

    
        private List clauses;

    
        private ForNames forNames;

    
        private Map<String,FExp> indexMap;

    
        private FTypePrefixVariability variability;

    
        
        public Scalarizer(List vars, List clauses, Map<String,FExp> indexMap, ForNames forNames, FTypePrefixVariability variability) {
            this.vars = vars;
            this.clauses = clauses;
            this.indexMap = indexMap;
            this.forNames = forNames;
            this.variability = variability;
        }

    
        
        public void add(ASTNode clause) {
            clauses.add(clause);
        }

    
        
        public void add(FAbstractVariable fv) {
            vars.add(fv);
        }

    
        
        public List getVars() {
            return vars;
        }

    
        
        public List getClauses() {
            return clauses;
        }

    
        
        public Map<String,FExp> map() {
            return indexMap;
        }

    
        
        public ForNames getNames() {
            return forNames;
        }

    
        
        public List createForLoops(FExp exp) {
            return forNames.createForLoops(clauses, exp);
        }

    
        
        public abstract void createScalarizedFunctionCallClause(FExp left, FFunctionCall right);

    
        public abstract void add(FExp left, FExp right);

    
        
        public void add(List v) {
            vars.addAll(v);
        }

    
        
        public void addTempVar(FType type, String name) {
            type.createTempFVariables(getVars(), new FQNameString(name), variability);
        }

    
        
        public void addTempVar(FExp source) {
            addTempVar(source.type(), source.tempVarName());
        }

    
        
        public abstract<T extends Scalarizer> T block(List clauses);

    
        public abstract<T extends Scalarizer> T block(List vars, List clauses);

    
        
        public FTypePrefixVariability getVariability() {
            return variability;
        }

    
        
        private boolean wb = false;

    
        public void setWriteBack(boolean wb) {
            this.wb = wb;
        }

    
        public boolean getWriteBack() {
            return wb;
        }

    
        
        public static class Variable {
            
            public Equation si;
            public Equation sp;
            public Equation sc;
            
            public Variable(List vars, List iEqus, List pEqus, List equs) {
                si = new Equation(vars, iEqus, ASTNode.fInitialParameter());
                sp = new Equation(vars, pEqus, ASTNode.fFixedParameter());
                sc = new Equation(vars, equs,  ASTNode.fContinuous());
            }
            
            public Equation select(FTypePrefixVariability variability) {
                switch (variability.variabilityLevel()) {
                    case FFixedParameter.VARIABILITY_LEVEL: return sp;
                    case FInitialParameter.VARIABILITY_LEVEL: return si;
                    default: return sc;
                }
            }
        }

    
        
        public static class Equation extends Scalarizer {
            
            public Equation(List vars, List equs, FTypePrefixVariability variability) {
                this(vars, equs, new HashMap<String,FExp>(), new ForNames(), variability);
            }
            
            public Equation(List vars, List equs, Map<String,FExp> indexMap, ForNames forNames, FTypePrefixVariability variability) {
                super(vars, equs, indexMap, forNames, variability);
            }
            
            public Equation block(List clauses) {
                return block(getVars(), clauses);
            }
            
            public Equation block(List vars, List clauses) {
                return new Equation(vars, clauses, map(), getNames(), getVariability());
            }
            
            public void add(FExp left, FExp right) {
                add(new FEquation(left, right));
            }
            
            public void createScalarizedFunctionCallClause(FExp left, FFunctionCall right) {
                right.getArgs().createArrayTemporaries(this);
                right.useTempVar = true;
                List lefts = new List().add(new FFunctionCallLeft(new Opt(left.scalarize(this))));
                add(new FFunctionCallEquation(lefts, right.scalarizeFunction(map())));
            }
            
            @Override
            public void addTempVar(FExp source) {
                super.addTempVar(source);
                source.notifyIfWhenEquationsOfTemporaryVar();
            }
        }

    
        
        public Algorithm algorithm(List<FStatement> stmts) {
            return new Algorithm(getVars(), stmts, map(), getNames(), false, variability);
        }

    
        
        public static Algorithm function(List<FFunctionVariable> vars, List<FStatement> stmts) {
            return new Algorithm(vars, stmts, new HashMap<String,FExp>(), new ForNames(), true, ASTNode.fDiscrete());
        }

    
        
        public static class Algorithm extends Scalarizer {
            private boolean func;
            
            public Algorithm(List vars, List clauses, Map<String,FExp> indexMap, ForNames forNames, boolean func, FTypePrefixVariability variability) {
                super(vars, clauses, indexMap, forNames, variability);
                this.func = func;
            }
            
            public Algorithm block(List clauses) {
                return block(getVars(), clauses);
            }
            
            public Algorithm block(List vars, List clauses) {
                return new Algorithm(vars, clauses, map(), getNames(), func, getVariability());
            }
            
            public void add(FExp left, FExp right) {
                add(new FAssignStmt((FAssignableExp)left, right));
            }
            
            public void createScalarizedFunctionCallClause(FExp left, FFunctionCall right) {
                right.getArgs().createArrayTemporaries(this);
                right.useTempVar = true;
                List lefts = new List().add(new FFunctionCallLeft(new Opt(left.scalarize(this))));
                add(new FFunctionCallStmt(lefts, right.scalarizeFunction(map())));
            }
            
            @Override
            public void addTempVar(FType type, String name) {
                if (!getWriteBack()) {
                    if (func) {
                        type = type.treeCopy();
                        FFunctionVariable v = type.isArray() ?
                                new FFunctionArray(type, name) :
                                new FFunctionVariable(type, name);
                        if (type.isArray()) {
                            FInitArrayStmt stmt = new FInitArrayStmt(new FIdUseExp(name));
                            add(stmt);
                            type.scalarizeInitArray(this, stmt);
                        }
                        add(v);
                    } else {
                        super.addTempVar(type, name);
                    }
                }
            }
            
            public void addTempVar(FAssignStmt source) {
                FType type = source.getLeft().size().isUnknown() ? source.getLeft().type() : source.getRight().type();
                addTempVar(type, source.tempVarName());
            }
        }


}
