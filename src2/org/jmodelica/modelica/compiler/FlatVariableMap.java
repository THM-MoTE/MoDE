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
 * @aspect FlatNameBinding
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:208
 */
public class FlatVariableMap extends Object {
    
		
        private Map<String,FAbstractVariable> flatMap;

    
        private ArrayList<OnDemandMap> aliasMaps = new ArrayList<OnDemandMap>();

    
		private Map<String,HierarchicalMapNode> hierMap;

    
		private boolean scalar;

    
		
		public FlatVariableMap() {
			this(false);
		}

    
		
		public FlatVariableMap(boolean scalarized) {
			scalar = scalarized;
		}

    
		
		public FlatVariableMap(Iterable<? extends FAbstractVariable>... fvs) {
			this(false, fvs);
		}

    
		
		public FlatVariableMap(boolean scalarized, Iterable<? extends FAbstractVariable>... fvs) {
			this(scalarized);
			for (Iterable<? extends FAbstractVariable> fvi : fvs)
				addVariables(fvi);
		}

    
		
		public void addVariable(FAbstractVariable fv) {
			fv.addToVariableMap(this);
		}

    
		
		public void addVariables(Iterable<? extends FAbstractVariable> fvs) {
			for (FAbstractVariable fv : fvs)
				addVariable(fv);
		}

    
		
        public void addAliasVariables(Iterable<? extends FAbstractVariable> fvs) {
            aliasMaps.add(new OnDemandMap(fvs));
        }

    
		
		public void addVariableFlat(FAbstractVariable fv) {
			if (flatMap == null)
				flatMap = new HashMap<String,FAbstractVariable>();
			flatMap.put(fv.name(), fv);
		}

    
		
		public void addVariableHierarchical(FAbstractVariable fv) {
			if (hierMap == null)
				hierMap = new HashMap<String,HierarchicalMapNode>();
			FQName fqn = fv.getFQName().asFQNameFull();
			String pn = fqn.partName(0);
			HierarchicalMapNode n = hierMap.get(pn);
			if (n != null)
				n.addHierarchical(fv, fqn, 1);
			else
				hierMap.put(pn, (fqn.numParts() > 1) ? new HierarchicalMap(fv, fqn, 1) : fv);
		}

    

		public FAbstractVariable lookup(String name) {
			FAbstractVariable res = null;
			if (flatMap != null) 
				res = flatMap.get(name);
            if (doLookupAlias(res)) {
                res = lookupAlias(name);
            }
			if (res == null && hierMap != null) {
				HierarchicalMapNode n = hierMap.get(name);
				if (n instanceof FAbstractVariable)
					res = (FAbstractVariable) n;
			}
			return res;
		}

    

		public FAbstractVariable lookup(FQName name) {
			FAbstractVariable res = null;
			if (flatMap != null) 
				res = flatMap.get(name.resolvedName());
            if (doLookupAlias(res)) {
                res = lookupAlias(name.resolvedName());
            }
			if (res == null && hierMap != null) {
				name = name.asFQNameFull();
				HierarchicalMapNode n = hierMap.get(name.partName(0));
				if (n != null)
					res = n.lookupHierarchical(name, 1, false);
			}
			return res;
		}

    

		public FAbstractVariable lookupOutermost(FQName name) {
			FAbstractVariable res = null;
			if (res == null && hierMap != null) {
				HierarchicalMapNode n = hierMap.get(name.partName(0));
				if (n != null)
					res = n.lookupHierarchical(name, 1, true);
			}
			if (flatMap != null) 
				res = flatMap.get(name.name());
            if (doLookupAlias(res)) {
                res = lookupAlias(name.name());
            }
			return res;
		}

    
		
        public boolean doLookupAlias(FAbstractVariable res) {
            return res == null && aliasMaps.size() > 0;
        }

    
        
        public FAbstractVariable lookupAlias(String name) {
            FAbstractVariable res = null;
            for (FlatVariableMap fvm : aliasMaps) {
                res = fvm.lookup(name);
                if (res != null) {
                    break;
                }
            }
            return res;
        }

    
        
        private static class OnDemandMap extends FlatVariableMap {
            
            Iterable<? extends FAbstractVariable> fvs;
            boolean init = false;
            
            public OnDemandMap(Iterable<? extends FAbstractVariable> fvs) {
                this.fvs = fvs;
            }
            
            @Override
            public FAbstractVariable lookup(String name) {
                if (!init) {
                    addVariables(fvs);
                    init = true;
                }
                return super.lookup(name);
            }
        }

    
        
		public interface HierarchicalMapNode {
			public FAbstractVariable lookupHierarchical(FQName name, int part, boolean outermost);
			public void addHierarchical(FAbstractVariable fv, FQName name, int part);
		}

    
		
		private static class HierarchicalMap implements HierarchicalMapNode {
			
			private Map<String,HierarchicalMapNode> map;
			
			public HierarchicalMap(FAbstractVariable fv, FQName name, int part) {
				map = new HashMap<String,HierarchicalMapNode>();
				String pn = name.partName(part++);
				map.put(pn, (name.numParts() > part) ? new HierarchicalMap(fv, name, part) : fv);
			}
			
			public FAbstractVariable lookupHierarchical(FQName name, int part, boolean outermost) {
				if (name.numParts() <= part)
					return null;
				String pn = name.partName(part++);
				HierarchicalMapNode n = map.get(pn);
				return (n != null) ? n.lookupHierarchical(name, part, outermost) : null;
			}
			
			public void addHierarchical(FAbstractVariable fv, FQName name, int part) {
				String pn = name.partName(part++);
				if (name.numParts() <= part) {
					map.put(pn, fv);
				} else {
					HierarchicalMapNode n = map.get(pn);
					if (n != null)
						n.addHierarchical(fv, name, part);
					else
						map.put(pn, new HierarchicalMap(fv, name, part));
				}
			}
			
		}

    
         
         public static class NameIndexCache extends java.util.EnumMap<GeneratedVarType,Enumerator> {
             public NameIndexCache() {
                 super(GeneratedVarType.class);
             }
             
             public int nextIndex(GeneratedVarType gvt) {
                 int res;
                 if (!containsKey(gvt)) {
                     put(gvt, new Enumerator(1));
                 }
                 return get(gvt).next();
             }
         }

    
         
         public enum GeneratedVarType {
             TEMP("temp_"),
             INDICATOR("_eventIndicator_");
             
             private String prefix;
             
             private GeneratedVarType(String prefix) {
                 this.prefix = prefix;
             }
             
             public String name(NameIndexCache nic) {
                 return prefix + nic.nextIndex(this);
             }
         }

    public String nextGeneratedVarName(NameIndexCache nic, GeneratedVarType gvt) {
         String name;
         do {
             name = gvt.name(nic);
         } while (lookup(name) != null);
         return name;
     }

    public String nextGeneratedVarName(NameIndexCache nic, GeneratedVarType gvt, FlatVariableMap other) {
         String name;
         do {
             name = gvt.name(nic);
         } while (lookup(name) != null || other.lookup(name) != null);
         return name;
     }

    public Set<String> flatNameSet() {
	return flatMap.keySet();
}


}
