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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:571
 */
public class ScalarizingVariableInstance extends Object {
    public String name() {
        return name.toString();
    }

    
        
        private FTypePrefixVariability variability;

     
        
        // Binding expression
        private FExp bExp;

    
        
        // (Mapped) attributes of this variable
        private Map<String, FAttribute> mattrs;

     
        
        // Full name of this variable
        private FQName name;

    
        
        // input/output prefix of top-level variable
        private Opt<FTypePrefixInputOutput> inputOutput;

    
        
        private Index index;

    
        
        private ScalarizingVariableInstance(FQName n, Map<String, FAttribute> mattrs, FExp be,
                FTypePrefixVariability variability, Opt<FTypePrefixInputOutput> inputOutput, Index i)  {
            bExp = be;
            name = n;
            index = i;
            this.mattrs = mattrs;
            this.variability = variability;
            this.inputOutput = inputOutput;
        }

    
        
        private ScalarizingVariableInstance(FQName n, List<FAttribute> attrs, FExp be,
                FTypePrefixVariability variability, Opt<FTypePrefixInputOutput> inputOutput, Index i)  {
            this(n, ScalarizingVariableInstance.mapped(attrs), be, variability, inputOutput, i);
        }

    
        
        public ScalarizingVariableInstance(FVariable fv) {
            this(fv.getFQName(), fv.getFAttributes(),
                    fv.hasBindingExp() ? fv.getBindingExp().dynamicFExp(fv.getBindingExp().scalarize(Collections.<String,FExp>emptyMap())) : null,
                    fv.variability(), fv.getFTypePrefixInputOutputOpt(), Index.NULL);
        }

    
        
        private static Map<String, FAttribute> mapped(List<FAttribute> as) {
            Map<String, FAttribute> m;
            if (as != null && as.getNumChild() > 0) {
                m = new LinkedHashMap<String, FAttribute>();
                for (FAttribute a : as) {
                    m.put(a.name(), a);
                }
            } else {
                m = Collections.<String, FAttribute>emptyMap();
            }
            return m;
        }

    
        
        public Indices indices(FVariable comp) {
            FAttribute sa = mattrs.get(FAttribute.SIZE);
            if (sa != null && sa.hasValue()) {
                return Indices.create(new MutableSize(sa.getValue().splitArrayExp(index)));
            } else {
                return comp.indices();
            }
        }

    
        
        public ScalarizingVariableInstance create(Scalarizer.Variable s, Index i) {
            FExp nbexp = bExp;
            Index ti = index.expand(i);
            if (nbexp != null && nbexp.isArray()) {
                Index ni = ti.subIndex(ti.ndims() - nbexp.ndims());
                nbexp = nbexp.getArray().get(ni);
            }
            return new ScalarizingVariableInstance(name.asFQNameFull().copyAndAddFas(i.createFArraySubscripts()), 
                    mattrs, nbexp, variability, inputOutput, ti);
        }

    
        
        public ScalarizingVariableInstance create(Scalarizer.Variable s, FVariable comp) {
            String cName = comp.name();
            
            FTypePrefixVariability nv = variability.component(cName);
            
            List<FAttribute> attrs = null;
            FAttribute a = mattrs.get(cName);
            if (a != null) {
                attrs = a.getFAttributes();
            }
            
            FExp nbexp = bExp;
            if (nbexp == null) {
                if (a != null) {
                    nbexp = a.getValue();
                }
                if (nbexp != null) {
                    nbexp = nbexp.dynamicFExp(nbexp.scalarize(Collections.<String,FExp>emptyMap()));
                }
            } else {
                nbexp = nbexp.component(comp.name());
            }
            
            return new ScalarizingVariableInstance(name.copyAndAppend(cName), attrs, nbexp, nv, inputOutput, index);
        }

    
        
        public void createScalarized(Scalarizer.Variable s, FVariable comp) {
            Scalarizer.Equation se = s.select(variability);
            FVariable fv = comp.copyForName(name);
            Map<String,FExp> im = Collections.<String,FExp>emptyMap();
            if (bExp != null) {
                if (comp.keepBExp(variability, bExp)) {
                    fv.setBindingExp(bExp);
                } else {
                    se.add(new FIdUseExp(name.scalarize(im)), bExp);
                    fv.setBindingExpOpt(new Opt());
                }
            } else {
                fv.setBindingExpOpt(new Opt());
            }
            fv.setFTypePrefixVariability(variability);
            fv.setFTypePrefixInputOutputOpt(inputOutput.treeCopy());
            List<FAttribute> attrs = new List<FAttribute>();
            for (FAttribute attr : mattrs.values()) {
                attr.scalarize(attrs, index, Collections.<String,FExp>emptyMap());
            }
            fv.setFAttributeList(attrs);
            fv.addArrayAttributesFromType(myCell(), comp.myFDerivedType());
            se.add(fv);
        }

    

        private Index myCell() {
            if (name.hasFArraySubscripts()) {
                return name.getFArraySubscripts().asIndex();
            } else {
                return Index.NULL;
            }
        }


}
