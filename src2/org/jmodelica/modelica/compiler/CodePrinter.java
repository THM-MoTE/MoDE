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
 * @aspect CCodeGen
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:34
 */
public abstract class CodePrinter extends Printer {
    
        
        /**
         * A list of code generator providers. Each provider in this list is
         * called in the constructor of CodePrinter.
         */
        private static Collection<CodeGeneratorProvider> providers = null;

    
        
        /**
         * Adds a CodeGeneratorProvider to the list of providers.
         */
        private <T extends CodeGeneratorProvider> T addProvider(T provider) {
            if (providers == null)
                providers = new PriorityQueue<CodeGeneratorProvider>();
            providers.add(provider);
            return provider;
        }

    
        
        /**
         * Returns the list of CodeGeneratorProvider providers.
         */
        public Collection<CodeGeneratorProvider> getProviders() {
            if (providers == null)
                return Collections.emptyList();
            else
                return providers;
        }

    
        
        private final boolean inBlock;

    
        private final boolean inInitialSystem;

    
        private final Homotopy homotopyType;

    
        private final boolean writeSwitches;

    

        public CodePrinter(boolean inBlock, boolean inInitialSystem, Homotopy homotopyType, boolean writeSwitches) {
            super("    ");
            for (CodeGeneratorProvider provider : getProviders())
                provider.provide(this);
            this.inBlock = inBlock;
            this.inInitialSystem = inInitialSystem;
            this.homotopyType = homotopyType;
            this.writeSwitches = writeSwitches;
        }

    
        
        /**
         * Abstract base class for code generator providers. Features that
         * needs to affect the code gen process should extend this object and
         * add it to the list of providers.
         */
        private abstract static class CodeGeneratorProvider implements Comparable<CodeGeneratorProvider> {
            private final int priority;
            
            /**
             * Constructs a new provider.
             * The argument priority controls the order of wich providers are
             * called. Providers are called in ascending order.
             * 
             * @param priority Denotes the priority of this provider.
             */
            private CodeGeneratorProvider(int priority) {
                this.priority = priority;
            }
            
            @Override
            public int compareTo(CodeGeneratorProvider other) {
                return Integer.valueOf(priority).compareTo(Integer.valueOf(other.priority));
            }
            
            /**
             * Abstract method that should be implemented by sub classes.
             * The provider is then free to modify the CodePrinter object
             * and redefine code generators.
             */
            public abstract void provide(CodePrinter p);
        }

    
        

        @Override
        public abstract void print(ASTNode node, CodeStream str, String indent);

    

        public abstract void printVarDecls(ASTNode node, CodeStream str, String indent);

    

        public abstract void printPreSteps(ASTNode node, CodeStream str, String indent);

    
        
        public abstract void printPostSteps(ASTNode node, CodeStream str, String indent);

    

        public boolean inBlock() {
            return inBlock;
        }

    

        protected abstract CodePrinter createPrinter(boolean inBlock, boolean inInitialSystem, Homotopy homotopyType,
                boolean writeSwitches);

    

        public final CodePrinter initialSystemPrinter() {
            if (inInitialSystem())
                return this;
            else
                return createPrinter(inBlock, true, homotopyType, writeSwitches);
        }

    

        public final CodePrinter homotopySimplifiedPrinter() {
            if (homotopyType == Homotopy.SIMPLIFIED)
                return this;
            else
                return createPrinter(inBlock, inInitialSystem, Homotopy.SIMPLIFIED, writeSwitches);
        }

    
        
        public final CodePrinter eventIndicatorPrinter() {
            if (writeSwitches) {
                return createPrinter(inBlock, inInitialSystem, homotopyType, false);
            }
            return this;
        }

    
        
        public boolean inInitialSystem() {
            return inInitialSystem;
        }

    
        
        public boolean writeSwitches() {
            return writeSwitches;
        }

    
        
        protected static enum Homotopy {
            HOMOTOPY, SIMPLIFIED, ACTUAL
        }

    
        
        public boolean inHomotopySimplified() {
            return homotopyType == Homotopy.SIMPLIFIED;
        }

    

        public boolean inHomotopyActual() {
            return homotopyType == Homotopy.ACTUAL;
        }

    
        
        @Override
        public String op(FBinExp e) { return e.op_C(); }

    

        public abstract TypePrinter_C createDeclPrinter(CodeStream str);

    
        public abstract TypePrinter_C createInitPrinter(CodeStream str);

    
        public abstract TypePrinter_C createInitSetPrinter(CodeStream str);

    
        
        public abstract class StepPrinter {
            public abstract void print(ASTNode n, CodeStream str, String indent);
            public void print(CodeStream str, String s) {
                
            }
        }

    
        
        public StepPrinter DeclStep  = new DeclCodePrinter();

    
        public StepPrinter PreStep   = new PreCodePrinter();

    
        public StepPrinter ExecStep  = new ExecuteCodePrinter();

    
        public StepPrinter PostStep  = new PostCodePrinter();

    
        
        private class DeclCodePrinter extends StepPrinter {
            @Override
            public void print(ASTNode n, CodeStream str, String indent) {
                CodePrinter.this.printVarDecls(n, str, indent);
            }
        }

    
        
        private class PreCodePrinter extends StepPrinter {
            @Override
            public void print(ASTNode n, CodeStream str, String indent) {
                CodePrinter.this.printPreSteps(n, str, indent);
            }
        }

    
        
        private class ExecuteCodePrinter extends StepPrinter {
            @Override
            public void print(ASTNode n, CodeStream str, String indent) {
                CodePrinter.this.print(n, str, indent);
            }
            
            @Override
            public void print(CodeStream str, String s) {
                str.print(s);
            }
        }

    
        
        private class PostCodePrinter extends StepPrinter {
            @Override
            public void print(ASTNode n, CodeStream str, String indent) {
                CodePrinter.this.printPostSteps(n, str, indent);
            }
        }

    
        protected final FuncCallInArgPrinter funcCallInArgPrinter = new FuncCallInArgPrinter();

    
        
        public class FuncCallInArgPrinter extends CodeFuncCallInOutArgPrinter {
            @Override
            public String arrayAccessConst() {
                return ASTNode.C_ARRAY_REFERENCE;
            }

            @Override
            public void printCell(CodeStream str, String indent, String name, FExp exp) {
                exp.genTempInputCellAssigns_C(CodePrinter.this, str, indent, name);
            }
        }

    

        public abstract void printTempInputAssigns(CodeStream str, String indent, FExp exp);

    public C_blockResidualAttributePrinter C_blockResidualAttributePrinter = new C_blockResidualAttributePrinter();

    
        public static class C_blockResidualAttributePrinter {
            public void print(CodePrinter p, CodeStream str, String indent, String attr, Map<FVariable, String> iterVarMap) {
                if (attr.equals(FAttribute.START))
                    return;
                for (Entry<FVariable, String> iterEntry : iterVarMap.entrySet()) {
                    FVariable iv = iterEntry.getKey();
                    FExp exp = iv.attributeExp(attr);
                    if (exp != null)
                        str.format("%s%s = %s;\n", indent, iterEntry.getValue(), exp.ceval());
                }
            }
            
            public void printSet(CodePrinter p, CodeStream str, String indent, String attr, Map<FVariable, String> iterVarMap) {
                for (Entry<FVariable, String> iterEntry : iterVarMap.entrySet()) {
                    if (attributeSet(iterEntry.getKey(),attr)) {
                        str.format("%s%s = 1;\n", indent, iterEntry.getValue());
                    }
                }
            }
            
            public boolean attributeSet(String attr, Map<FVariable, String> iterVarMap) {
                for (FVariable fv : iterVarMap.keySet()) {
                    if (attributeSet(fv, attr)) {
                        return true;
                    }
                }
                return false;
            }
            
            public boolean attributeSet(FVariable var, String attr) {
                return var.attributeSet(attr);
            }
            
            public void printVariability(CodePrinter p, CodeStream str, String indent, Collection<FVariable> iterVars) {
                str.print(ASTNode.fConstant().genJMIVariabilityConstant_C() + ", ");
            }
        }

    
        public abstract class FuncCallOutArgPrinter extends CodeFuncCallInOutArgPrinter {
            @Override
            public void printCell(CodeStream str, String indent, String name, FExp exp) {
                exp.genFuncCallOutArg_C(this, str, indent, name);
            }

            @Override
            public String arrayAccessConst() {
                return ASTNode.C_ARRAY_VALUE;
            }

            public abstract void printUse(CodeStream str, String indent, FIdUseExp use, String name);
            public void printNoExp(CodeStream str, String indent) {}
        }

    
        public class WriteBackResidualPrinter extends FuncCallOutArgPrinter {
            protected final Enumerator enumerator;
            protected final Set<Integer> forIndices;
            protected final Enumerator indexCounter;
    
            protected WriteBackResidualPrinter(Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter) {
                this.enumerator = enumerator;
                this.forIndices = forIndices;
                this.indexCounter = indexCounter;
            }

            @Override
            public void printUse(CodeStream str, String indent, FIdUseExp use, String name) {
                use.genWriteBackResidual_C(str, indent, name, enumerator, forIndices, indexCounter);
            }
        }

    

        public abstract void printWriteBackResidual(CodeStream str, String indent, FFunctionCallLeft left,
                Enumerator enumerator, Set<Integer> forIndices, Enumerator indexCounter);

    
        public class WriteBackAssignmentPrinter extends FuncCallOutArgPrinter {
            protected Collection<FVariable> forVariables;

            protected WriteBackAssignmentPrinter(Collection<FVariable> forVariables) {
                this.forVariables = forVariables;
            }

            @Override
            public void printUse(CodeStream str, String indent, FIdUseExp use, String name) {
                use.genWriteBackAssignment_C(str, indent, name, forVariables);
            }
        }

    
        
        /**
         * For array components which are consecutive in z vector this printer generates
         * memcpy writebacks instead of scalar assignments.
         */
        public class ArrayWriteBackAssignmentPrinter extends WriteBackAssignmentPrinter {
            
            FIdUseExp firstUse; // First use in component
            FIdUseExp prevUse;  // Last consecutive use in component;
            String firstName;   // Name to read from into firstUse
            int n;              // Number of consecutive elements in component
            
            public ArrayWriteBackAssignmentPrinter(Collection<FVariable> forVariables) {
                super(forVariables);
            }
            
            @Override
            public void printUse(CodeStream str, String indent, FIdUseExp use, String name) {
                if (forVariables != null && !forVariables.contains(use.myFV())) {
                    /* use not included in writeback */
                    return;
                }
                
                if (firstUse == null) {
                    /* use is the first element in this component */
                    init(use, name);
                    return;
                }
                
                if (!prevUse.isConsecutiveInZ(use)) {
                    /* use is not directly after prevUse in z-vector
                     * Write n items we have so far (firstUse to prevUse)
                     * and reinit with use as first element */
                    endComponent(str, indent);
                    init(use, name);
                    return;
                }
                
                prevUse = use;
                n++;
            }
            
            @Override
            public void printNoExp(CodeStream str, String indent) {
                endComponent(str, indent);
            }
            
            public void init(FIdUseExp use, String name) {
                firstUse = use;
                prevUse = use;
                firstName = name;
                n = 1;
            }
            
            @Override
            public void endComponent(CodeStream str, String indent) {
                if (n == 1) {
                    super.printUse(str, indent, firstUse, firstName);
                } else if (n > 1) {
                    firstUse.genArrayWriteBackAssignment_C(str, indent, firstName, n);
                }
                firstUse = null;
                prevUse = null;
                firstName = null;
                n = 0;
            }
        }

    
        
        public abstract void printWriteBackAssignment(CodeStream str, String indent, FFunctionCallLeft left,
                Collection<FVariable> forVariables);


}
