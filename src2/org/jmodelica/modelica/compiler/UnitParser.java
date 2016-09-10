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
 * @aspect UnitParser
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/units/Units.jrag:500
 */
public class UnitParser extends Object {
    
        
        private static final Map<String, Unit> unitSymbols = UnitDefinitions.unitSymbols;

    
        private static final Map<String, Double> prefixScales = UnitDefinitions.prefixScales;

    
        
        private static UnitParser PARSER = null;

    
        
        public static UnitParser getParser() {
            if (PARSER == null) {
                return PARSER = new UnitParser();
            }
            return PARSER; 
        }

    
        
        public UnitParser() { this(true); }

    
        public UnitParser(boolean renameUnits) {
            this.renameUnits = renameUnits;
        }

    
        
        // Rename units to the string used to parse it if parse was successful.
        // Defaults to true.
        final boolean renameUnits;

    
        
        public Unit parse(String input) {
            Unit u = parse(new Scanner(input));
            if (renameUnits) {
                u = u.rename(input);
            } 
            return u;
        }

    
        
        private Unit parse(Scanner s) {
            Unit u = unit_expression(s);
            if (u == null || !s.eof()) {
                s.error();
            }
            return u;
        }

    
        
        private Unit unit_expression(Scanner s) {
            // unit_expression:
            //     unit_numerator [ "/" unit_denominator ]
            
            Unit u = unit_numerator(s);
            
            // Check for optional
            if (!s.skip("/")) {
                return u;
            }
            // Optional
            Unit v = unit_denominator(s);
            return u.divideBy(v);
        }

    
        
        private Unit unit_numerator(Scanner s) {
            // unit_numerator:
            //     "1" | unit_factors | "(" unit_expression ")"
            
            // First branch
            if (s.skip("1")) {
                return Unit.UNIT;
            }
            // Second branch
            Unit u = unit_factors(s);
            if (u != null) {
                return u;
            }
            // Third branch
            s.require("(");
            u = unit_expression(s);
            s.require(")");
            return u;
        }

    
        
        private Unit unit_denominator(Scanner s) {
            // unit_denominator:
            //      unit_factor | "(" unit_expression ")"
            
            // First branch
            Unit u = unit_factor(s);
            if (u != null) {
                return u;
            }
            // Second branch
            s.require("(");
            u = unit_expression(s);
            s.require(")");
            return u;
        }

    
        
        private Unit unit_factors(Scanner s) {
            // unit_factors:
            //      unit_factor [ unit_mulop unit_factors ]
            
            Unit u = unit_factor(s);
            if (u == null) {
                return null;
            }
            while(unit_mulop(s)) {
                Unit v = unit_factor(s);
                if (v == null) {
                    s.error();
                }
                u = u.multiply(v);
            }
            return u;
        }

    
        
        private boolean unit_mulop(Scanner s) {
            // unit_mulop:
            //      "."
            return s.skip(".");
        }

    
        
        private Unit unit_factor(Scanner s) {
            // unit_factor:
            //      unit_operand [ unit_exponent ]
            
            Unit u = unit_operand(s);
            if (u == null) {
                return null;
            }
            int e = unit_exponent(s);
            return u.power(e);
        }

    
        
        private int unit_exponent(Scanner s) {
            // unit_exponent:
            //      [ "+" | "-" ] integer
            
            if(s.hasNextUnitExponent()) {
                return Integer.valueOf(s.nextUnitExponent());
            }
            return 1;
        }

    
        
        private Unit unit_operand(Scanner s) {
            // unit_operand:
            //      unit_symbol | unit_prefix unit_symbol
            
            // First branch
            Unit u = unit_symbol(s);
            if (u != null) {
                return u;
            }
            int mark = s.mark();
            // Second branch
            String prefix = unit_prefix(s);
            if (prefix == null) {
                s.reset(mark);
                return null;
            }
            u = unit_symbol(s);
            if (u == null) {
                s.reset(mark);
                return null;
            }
            return u.multiply(prefixScales.get(prefix), prefix);
        }

    
        
        private Unit unit_symbol(Scanner s) {
            // unit_symbol
            //      /[^.+-\\0-9()]+/
            
            // Lookup symbol in set of known unit symbols
            int mark = s.mark();
            if (!s.hasNextUnitSymbol()) {
                // If not found, reset and return null.
                s.reset(mark);
                return null;
            }
            
            // Get unit symbol token and check against known definitions
            String tok = s.nextUnitSymbol();
            if (!unitSymbols.containsKey(tok)) {
                // If not found, reset and return null.
                s.reset(mark);
                return null;
            }
            // Get the unit.
            return unitSymbols.get(tok);
        }

    
        
        private String unit_prefix(Scanner s) {
            // unit_prefix:
            //      Y | Z | E | P | T | G | M | k | h | da | d | c | m | u | p | f | a | z | y
            if (s.hasNextSIPrefix()) {
                return s.nextSIPrefix();
            }
            return null;
        }

    
        
        // Internal state of parser
        private static class Scanner {
            
            // Input is short so a string will work just fine.
            private String input;
            
            // Current position within input
            private int pos;
            
            public Scanner(String input) {
                this.input = input;
                pos = 0;
            }
            
            /**
             * Mark this position to be able to return to it if needed
             * or to use it as a reference to this point in to input.
             * @return the position in the input.
             */
            public int mark() {
                return pos;
            }
            
            /**
             * Reset to a marked position.
             * @param mark position to return to.
             */
            public void reset(int mark) {
                pos = mark;
            }
            
            /**
             * Advance the input one step (for example after peekChar).
             * Equivalent to advance(1).
             * @return true if advanced one step. False if the end was reached.
             */
            public boolean advance() {
                return advance(1);
            }
            
            /**
             * Attempt to advance n steps. If the end of input is reached it stops there.
             * @param n number of steps
             * @return true if it advanced n steps,
             * false if it reached the end in <em>less</em> than n steps.
             */
            public boolean advance(int n) {
                assert n > 0:"Cannot advance a negative about of bytes.";
                int newPos = pos + n;
                pos = Math.min(newPos, input.length());
                return pos == newPos;
            }
            
            /**
             * Make token from mark to current position.
             * @param mark marked position.
             * @return a string token.
             */
            public String token(int mark) {
                return input.substring(mark, pos);
            }
            
            /**
             * Skip expected string, but require that the string is present.
             * @param string to skip
             */
            public void require(String string) {
                if (!skip(string)) {
                    error();
                }
            }
            
            /**
             * Skip expected string. Only skips the entire string or nothing.
             * @param string to skip.
             * @returntrue if anything was skipped otherwise false
             */
            public boolean skip(String string) {
                int mark = mark();
                if (!advance(string.length())) {
                    reset(mark);
                    return false;
                }
                if(string.equals(token(mark))) {
                    return true;
                }
                reset(mark);
                return false;
            }
            
            // check if at end of input
            public boolean eof() {
                return pos >= input.length();
            }
            
            public boolean hasNextChar() {
                return !eof();
            }
            
    //        public char nextChar() {
    //            if (eof()) { error(); }
    //            char c = input.charAt(pos);
    //            advance();
    //            return c;
    //        }
            
            public char peekChar() {
                if (eof()) { error(); }
                return input.charAt(pos);
            }
            
            private boolean isUnitSymbol(char peekChar) {
                // Good enough for now.
                return Character.isLetter(peekChar);
            }
            
            public boolean hasNextUnitSymbol() {
                if (eof()) { return false; }
                return isUnitSymbol(peekChar());
            }
            
            public String nextUnitSymbol() {
                if (!hasNextUnitSymbol()) { return null; }
                int mark = mark();
                while(hasNextChar() && isUnitSymbol(peekChar())) {
                    advance();
                }
                return token(mark);
            }
            
            public String nextSIPrefix() {
                // Y | Z | E | P | T | G | M | k | h | da | d | c | m | u | p | f | a | z | y
                // Note: Preference given by order
                
                int mark = mark();
                
                for(String prefix : prefixScales.keySet()){
                    if (skip(prefix)) {
                        return prefix;
                    }
                }
                
                // Matched nothing reset
                reset(mark);
                return null;
            }
    
    
            public boolean hasNextSIPrefix() {
                int mark = mark();
                try {
                    return nextSIPrefix() != null;
                } finally {
                    reset(mark);
                }
            }
    
    
            public String nextUnitExponent() {
                int mark = mark(); 
                
                // Skip -, if there was none then skip +
                if (!skip("-")) { skip("+"); }
                
                // If there is no digit following.
                if (!hasNextChar() || !Character.isDigit(peekChar())) {
                    reset(mark);
                    return null;
                }
                
                // Find digits.
                while(hasNextChar() && Character.isDigit(peekChar())) {
                    advance();
                }
                
                return token(mark);
            }
    
    
            public boolean hasNextUnitExponent() {
                int mark = mark();
                try {
                    if (!skip("-")) { skip("+"); }
                    return hasNextChar() && Character.isDigit(peekChar());
                } finally {
                    reset(mark);
                }
            }
            
            private void error() {
                throw new Exception("Could not parse unit expression.");
            }
            
            public String toString() {
                return "(" + pos + ", \"" + input + "\")";
            }
        }

    
        
        // Note that this class should be be refered to as UnitParser.Exception
        // I felt UnitParser.UnitParserException was a bit verbose.
        public static class Exception extends RuntimeException {
            
            public Exception() {
                super();
            }
            
            public Exception(String message, Throwable cause) {
                super(message, cause);
            }
            
            public Exception(String message) {
                super(message);
            }
            
            public Exception(Throwable cause) {
                super(cause);
            }
            
        }


}
