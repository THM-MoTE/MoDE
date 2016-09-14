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
 * @aspect UnitDefinitions
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/units/UnitDefinitions.jrag:9
 */
abstract class UnitDefinitions extends Object {
    
        
        public static final Map<String, Unit> unitSymbols;

    
        public static final Map<String, Double> prefixScales;

    
        
        static {
            // The parser tests for each prefix in the order below.
            // for example if d was before da it would always findBasePackage d and never check da.
            // Thankfully that is the only such overlap.
            // I use a LinkedHashMap to preserve the order.
            LinkedHashMap<String, Double> ps = new LinkedHashMap<String, Double>();
            
            // Add all the prefixes
            ps.put("Y", 1e24);
            ps.put("Z", 1e21);
            ps.put("E", 1e18);
            ps.put("P", 1e15);
            ps.put("T", 1e12);
            ps.put("G", 1e9);
            ps.put("M", 1e6);
            ps.put("k", 1e3);
            ps.put("h", 1e2);
            ps.put("da", 1e1);
            ps.put("d", 1e-1);
            ps.put("c", 1e-2);
            ps.put("m", 1e-3);
            ps.put("u", 1e-6);
            ps.put("n", 1e-9);
            ps.put("p", 1e-12);
            ps.put("f", 1e-15);
            ps.put("a", 1e-18);
            ps.put("z", 1e-21);
            ps.put("y", 1e-24);
            
            // Make constant
            prefixScales = Collections.unmodifiableMap(ps);
            
            // Create map of units symbols.
            Map<String, Unit> sym = new HashMap<String, Unit>();
            
            // SI 'base'-units
            Unit meter      = Unit.fromDimension(Dimension.Length, "m");
            Unit second     = Unit.fromDimension(Dimension.Time, "s");
            Unit kilogram   = Unit.fromDimension(Dimension.Mass, "kg");
            Unit gram       = Unit.fromDimension(Dimension.Mass, 0.001, "g");
            Unit ampere     = Unit.fromDimension(Dimension.Current, "A");
            Unit kelvin     = Unit.fromDimension(Dimension.Temperature, "K");
            Unit mole       = Unit.fromDimension(Dimension.SubstanceAmount, "mol");
            Unit candela    = Unit.fromDimension(Dimension.LuminousIntensity, "cd");
            
            sym.put("m", meter);
            sym.put("s", second);
            sym.put("g", gram);
            sym.put("A", ampere);
            sym.put("K", kelvin);
            sym.put("mol", mole);
            sym.put("cd", candela);
            
            // add derived SI units, such as Newton, Joule, Watt, Volt, etc.
            Unit meter2     = meter.power(2);
            Unit radian     = Unit.UNIT;
            Unit steradian  = Unit.UNIT;
            Unit hertz      = second.power(-1);
            Unit newton     = kilogram.multiply(meter).divideBy(second.power(2));
            Unit pascal     = newton.divideBy(meter2);
            Unit joule      = newton.multiply(meter);
            Unit watt       = joule.divideBy(second);
            Unit coloumb    = ampere.multiply(second);
            Unit volt       = watt.divideBy(ampere);
            Unit weber      = volt.multiply(second);
            Unit lumen      = candela.multiply(steradian);
            Unit becquerel  = hertz;
            Unit gray       = joule.divideBy(kilogram);
            Unit sievert    = gray;
            
            sym.put("rad",  Unit.UNIT);
            sym.put("sr",   Unit.UNIT);
            sym.put("Hz",   second.power(-1));
            sym.put("N",    newton);
            sym.put("Pa",   pascal);
            sym.put("J",    joule);
            sym.put("W",    watt);
            sym.put("C",    coloumb);
            sym.put("V",    volt);
            sym.put("F",    coloumb.divideBy(volt));
            sym.put("Ohm",  volt.divideBy(ampere));
            sym.put("S",    ampere.divideBy(volt));
            sym.put("Wb",   weber);
            sym.put("T",    weber.divideBy(meter2));
            sym.put("H",    weber.divideBy(ampere));
            sym.put("degC", kelvin.offset(273.15));
            sym.put("lm",   lumen);
            sym.put("lx",   lumen.divideBy(meter2));
            sym.put("Bq",   becquerel);
            sym.put("Gy",   gray);
            sym.put("Sv",   sievert);
            sym.put("kat",  mole.divideBy(second));
            
            //TODO add common non-SI units
            Unit minute = second.multiply(60);
            Unit hour   = minute.multiply(60);
            Unit day    = hour.multiply(24);
            
            sym.put("min",  minute);
            sym.put("h",    hour);
            sym.put("d",    day);
            
            sym.put("deg",  radian.multiply(Math.PI/180));
            sym.put("r",    radian.multiply(2*Math.PI));   // "revolution" as in "revolutions per minute" [r/min]
            sym.put("l",    meter.multiply(0.1).power(3)); // dm3, decimeter cubed. 
            sym.put("dB",   Unit.UNIT);
            sym.put("eV",   joule.multiply(0.160218e-18)); // 0.160218 aJ
            sym.put("bar",  pascal.multiply(1e5));         // 0.1 MPa
            sym.put("phon", Unit.UNIT);
            sym.put("sone", Unit.UNIT);
            
            sym.put("degF", kelvin.multiply(5.0/9.0).offset(459.67));
            
            // Rename units to their defined name
            for (Entry<String, Unit> e: sym.entrySet()) {
                e.setValue(e.getValue().rename(e.getKey()));
            }
            
            // Make constant
            unitSymbols = Collections.unmodifiableMap(sym);
        }


}
