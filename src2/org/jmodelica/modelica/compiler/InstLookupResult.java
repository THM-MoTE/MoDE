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
 * @aspect Flattening
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:773
 */
public abstract class InstLookupResult<T extends InstLookupResult.Item> extends Object {
    
        /**
         * Check if lookup found a target that is not the same as the given one.
         */
        public boolean foundOther(T t) {
            return successful() && target() != t;
        }

    

        public interface Item {
            public InstLookupResult<InstComponentDecl> memberInstComponent(String name);
            public InstCallable asCallable();
        }

    
        
        /**
         * Indicates that the target was not found.
         */
        public static <T extends Item> InstLookupResult<T> notFound() {
            return (InstLookupResult<T>) NOT_FOUND;
        }

    

        /**
         * Indicates that the target was found.
         * 
         * Includes the found class or component.
         */
        public static <T extends Item> InstLookupResult<T> found(T target) {
            return new Found(target);
        }

    

        /**
         * Indicates that the target was found, but not accessible due to a constrainedby clause.
         * 
         * Includes the declaration with the limiting constrainedby clause.
         */
        public static <T extends Item> InstLookupResult<T> constrained(T target, InstNode constr) {
            return new Constrained(target, constr);
        }

    

        /**
         * Indicates that the target was found, but not accessible due to a constrainedby clause.
         * 
         * Includes the declaration with the limiting constrainedby clause.
         */
        public static <T extends Item> InstLookupResult<T> constrained(InstLookupResult<T> res, InstNode constr) {
            return new Constrained(res.target(), constr);
        }

    
        
        /**
         * Indicates that the target was found as an outer, target() returns the corresponding inner.
         */
        public static InstLookupResult<InstComponentDecl> outer(InstComponentDecl outer) {
            return new Outer(outer);
        }

    

        /**
         * Did the lookup succeed?
         */
        public boolean successful() {
            return false;
        }

    

        /**
         * Is this a "not found" result?
         */
        public boolean isNotFound() {
            return false;
        }

    

        /**
         * Is this a result that should generate an error?
         */
        public boolean isError() { return false; }

    
        
        /**
         * Is this a result that should generate an error or warning?
         */
        public boolean isProblem() { return false; }

    

        /**
         * Get the found class or component, if any.
         * 
         * Returns <code>null</code> if lookup was not successful.
         */
        public T targetOrNull() {
            return null;
        }

    
        
        /**
         * Returns the outer for outer lookup results, this for rest.
         */
        public InstLookupResult<T> unresolved() {
            return this;
        }

    
        
        /**
         * @param target The new target
         * @return a copy of this InstLookupResult with a new target.
         */
        public abstract <NT extends Item> InstLookupResult<NT> create(NT target);

    
        
        /**
         * @param name Name of target subcomponent
         * @return <code>this</code> if <code>this</code> is an error, else lookup 
         *         result of member <code>name</code> in <code>target()</code>
         */
        public abstract InstLookupResult<InstComponentDecl> memberInstComponent(String name);

    
        
        /**
         * Get the found class or component, if any.
         * 
         * @throws UnsupportedOperationException  if lookup was not successful.
         */
        public T target() {
            throw new UnsupportedOperationException("Trying to use result of failed name lookup");
        }

    

        /**
         * Get the found class or component, or a default value.
         * 
         * Returns <code>gen.generate(src)</code> if lookup was not successful.
         */
        public T target(DefaultGenerator<T> gen, ASTNode src) {
            return successful() ? target() : gen.generate(src);
        }

    

        /**
         * Generate warnings and errors for unsuccessful lookup result.
         * 
         * @param src   node to generate problem on
         * @param kind  how to describe the declaration being sought, e.g. "component"
         * @param name  the name being sought
         */
        public boolean problem(ASTNode src, String kind, String name) {
            return false;
        }

    

        /**
         * Generates a default value for {@link #target(DefaultGenerator, ASTNode)}.
         */
        public static interface DefaultGenerator<T extends Item> {
            public T generate(ASTNode src);
        }

    

        private final static InstLookupResult NOT_FOUND = new NotFound();

     

        private static class NotFound<T extends Item> extends InstLookupResult<T> {
            
            public <NT extends Item> InstLookupResult<NT> create(NT target) {
                return notFound();
            }
            
            public boolean isNotFound() {
                return true;
            }
            
            @Override
            public boolean isError() { return true; }
            
            @Override
            public boolean isProblem() { return true; }
            
            @Override
            public boolean problem(ASTNode src, String kind, String name) {
                src.error("Cannot findBasePackage %s declaration for %s", kind, name);
                return true;
            }
            
            public InstLookupResult<InstComponentDecl> memberInstComponent(String name) {
                return (InstLookupResult<InstComponentDecl>) this;
            }
        }

    

        private static class Found<T extends Item> extends InstLookupResult<T> {
            private T target;

            public <NT extends Item> InstLookupResult<NT> create(NT target) {
                return new Found(target);
            }
            
            public Found(T target) {
                this.target = target;
            }

            public boolean successful() {
                return true;
            }

            public T target() {
                return target;
            }

            public T targetOrNull() {
                return target;
            }
            
            public InstLookupResult<InstComponentDecl> memberInstComponent(String name) {
                return target().memberInstComponent(name);
            }
        }

    

        private static class Constrained<T extends Item> extends Found<T> {
            private InstNode constr;

            public <NT extends Item> InstLookupResult<NT> create(NT target) {
                return new Constrained(target, constr);
            }
            
            public Constrained(T target, InstNode constr) {
                super(target);
                this.constr = constr;
            }
            
            @Override
            public boolean isError() { return true; }
            
            @Override
            public boolean isProblem() { return true; }
            
            @Override
            public boolean problem(ASTNode src, String kind, String name) {
                ASTNode.NOT_IN_CONSTRAINING_TYPE.invoke(src, kind, name, constr);
                return false;
            }
            
        }

    
        
        private static class Outer extends Found<InstComponentDecl> {
            
            private InstLookupResult<InstComponentDecl> outer;
            
            public InstLookupResult<InstComponentDecl> create(InstComponentDecl target) {
                return new Outer(target);
            }
            
            public Outer(InstComponentDecl target) {
                super(target);
                this.outer = InstLookupResult.found(target);
            }
            
            public InstComponentDecl target() {
                InstComponentDecl inner = outer.target().myInnerInstComponentDecl();
                if (inner == null) {
                    return outer.target().unknownInstComponentDecl();
                }
                return inner;
            }

            public InstComponentDecl targetOrNull() {
                return target();
            }
            
            public InstLookupResult<InstComponentDecl> unresolved() {
                return outer;
            }
            
            public InstLookupResult<InstComponentDecl> memberInstComponent(String name) {
                InstLookupResult<InstComponentDecl> res = super.memberInstComponent(name);
                if (!res.isError() && !outer.target().memberInstComponent(name).successful())
                    return new OuterError(res.target());
                return res;
            }
            
            private class OuterError extends Found<InstComponentDecl> {
                
                public InstLookupResult<InstComponentDecl> create(InstComponentDecl target) {
                    return new OuterError(target);
                }
                
                public OuterError(InstComponentDecl target) {
                    super(target);
                }
                
                @Override
                public boolean isError() { return true; }
                
                @Override
                public boolean isProblem() { return true; }
                
                @Override
                public boolean problem(ASTNode src, String kind, String name) {
                    src.error("Cannot use %s %s in inner '%s', because it is not present in outer '%s'", kind, name, Outer.this.target(), outer.target());
                    return true;
                }
            }
        }

    public InstLookupResult<InstCallable> asCallable() {
        if (isNotFound()) {
            return InstLookupResult.<InstCallable>notFound();
        }
        InstCallable ic = target().asCallable();
        if (ic == null) {
            return InstLookupResult.<InstCallable>notFound();
        }
        return create(ic);
    }


}
