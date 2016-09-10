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
 * @aspect Environment
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:28
 */
public class Environment extends ArrayList<InstModification> {
    public Iterable<InstComponentRedeclare> reverseComponentRedeclares(String name) {
        Set<Modification> seen = new HashSet<Modification>();
        ArrayList<InstComponentRedeclare> list = new ArrayList<InstComponentRedeclare>();
        
        for (InstModification im : this) {
            InstComponentRedeclare red = im.matchInstComponentRedeclare(name);
            if (red != null) {
                Modification mod = red.getModification();
                if (!seen.contains(mod)) {
                    seen.add(mod);
                    list.add(red);
                }
            }
        }
        
        return new ReverseListIterable(list);
    }

    
        
        public Environment() {
        }

    
        
        public Environment(Iterable<InstModification>... sets) {
            for (Iterable<InstModification> set : sets) {
                for (InstModification mod : set) {
                    addAll(mod.expand());
                }
            }
        }

    

        /**
         * Merge an outer modification into the environment: add it at the beginning.
         * 
         * @return <code>this</code>, for convenience
         */
        public Environment mergeOuter(InstModification outerMod) {
            addAll(0, outerMod.expand());
            return this;
        }

    

        /**
         * Merge an inner modification into the environment: add it last.
         * 
         * @return <code>this</code>, for convenience
         */
        public Environment mergeInner(InstModification innerMod) {
            addAll(innerMod.expand());
            return this;
        }

    

        /**
         * Merge outer sets of modifications: add them at the beginning.
         * 
         * @return if there are no modifications to merge, <code>this</code>; 
         *         otherwise a clone with the modifications merged
         */
        public Environment mergeOuterClone(Iterable<InstModification>... sets) {
            ArrayList<InstModification> mods = new ArrayList<InstModification>();
            for (Iterable<InstModification> set : sets)
                for (InstModification mod : set)
                    mods.addAll(mod.expand());
            Environment env = this;
            if (!mods.isEmpty()) {
                env = clone();
                env.addAll(0, mods);
            }
            return env;
        }

    

        /**
         * Merge inner sets of modifications: add them last.
         * 
         * @return if there are no modifications to merge, <code>this</code>; 
         *         otherwise a clone with the modifications merged
         */
        public Environment mergeInnerClone(Iterable<InstModification>... sets) {
            ArrayList<InstModification> mods = new ArrayList<InstModification>();
            for (Iterable<InstModification> set : sets)
                for (InstModification mod : set)
                    mods.addAll(mod.expand());
            Environment env = this;
            if (!mods.isEmpty()) {
                env = clone();
                env.addAll(mods);
            }
            return env;
        }

    

        /** 
         * Creates a new environment that is a copy of this one, filtered for a named class or component.
         * 
         * When filtering the environment, the result consists only of modifications with a matching prefix. 
         * In effect, this results in a "peeling" operation, where the first name in a qualified name is removed, 
         * and the rest of the modification is added to the new Environment. 
         * 
         * Redeclares are not taken into account.
         */
        public Environment filter(String name) {
            return filter(name, null, null);
        }

    

        /** 
         * Creates a new environment that is a copy of this one, filtered for a named class or component.
         * 
         * When filtering the environment, the result consists only of modifications with a matching prefix. 
         * In effect, this results in a "peeling" operation, where the first name in a qualified name is removed, 
         * and the rest of the modification is added to the new Environment. 
         * 
         * Any given redeclares are taken into account.
         */
        public Environment filter(String name, InstComponentRedeclare icr, InstRedeclareClassNode ircn) {
            Environment env = new Environment();
            boolean componentRedeclareFound = false;
            boolean classRedeclareFound = false;
            for (InstModification im : this) {
                // If a first component redeclare modification is found, add modifiers
                if (!componentRedeclareFound && im == icr) {
                    if (icr.getInstComponentDecl().hasInstModification()) 
                        env.mergeInner(icr.getInstComponentDecl().getInstModification());
                    componentRedeclareFound = true;
                }
                // If a first class redeclare modification is found, add modifiers
                if (!classRedeclareFound && im == ircn) {
                    InstClassRedeclare iclr = (InstClassRedeclare) im;
                    if (iclr.hasInstClassModification()) 
                        env.mergeInner(iclr.getInstClassDecl().getInstClassModification());
                    classRedeclareFound = true;
                }
                
                InstModification match = im.matchInstModification(name);
                if (match != null) {
                    env.mergeInner(match);
                }
            }
            return env;
        }

    

        public Environment clone() {
        	Environment env = new Environment();
        	env.addAll(this);
        	return env;
        }

    
    	
    	/**
    	 * TODO: implement!
    	 */
        public Environment peel(String name) {
        	return new Environment();
        }

    

        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("{");
            for (InstModification im : this) {
                str.append("  " + im.modification().prettyPrint("") + ",");
                str.append(im.myInstNode().toString());
                str.append("\n");
            }
            str.append("}\n");
            return str.toString();
        }

    

        public String toString(String indent) {
            StringBuilder str = new StringBuilder();
            str.append(indent + "{");
            for (int i = 0; i < size(); i++) {
                InstModification im = get(i);
                if (i==0) {
                    str.append(im.modification().prettyPrint(""));
                } else {
                    str.append(indent + " " + im.modification().prettyPrint(""));
                }
                str.append(": ");
                str.append(im.myInstNode().name());
                
                if (i != size() - 1) {
                    str.append(",\n");
                }
            }
            str.append("}\n");
            return str.toString();
        }


}
