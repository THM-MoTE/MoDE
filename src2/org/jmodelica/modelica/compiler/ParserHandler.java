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
 * @aspect Parsers
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:69
 */
public abstract class ParserHandler extends Object {
    public static SourceRoot parseModel(UtilInterface uif, String name) 
      throws FileNotFoundException, IOException, beaver.Parser.Exception, CompilerException{
        ModelicaCompiler.log.info("Parsing " + name + "...");
        SourceRoot sr;
        try {
            sr = ParserHandler.parseFile(uif, name);
        } catch (ParserException e) {
            CompilerException ce = new CompilerException();
            ce.addProblem(e.getProblem());
            throw ce;
        }
        //loadOptions(sr);
        for (StoredDefinition sd : sr.getProgram().getUnstructuredEntitys()) {
            sd.setFileName(name);
        }
        return sr;
    }

    public static SourceRoot parseModel(UtilInterface uif, String[] names) 
            throws FileNotFoundException, IOException, beaver.Parser.Exception, CompilerException{
        SourceRoot sr = new SourceRoot(new Program());
        uif.transferRoot(sr);
        for (String name : names) {
            File f = new File(name);
            String name_tmp = name;
            if (f.isDirectory()) 
                name_tmp = LibNode.packageFile(f);
            SourceRoot sr_tmp = (name_tmp != null) ? parseModel(uif, name_tmp) : null;
            if (!uif.getOptionRegistry().getBooleanOption("ignore_within")) {
                String lib = null;
                if (sr_tmp != null && sr_tmp.isFileInLibrary()) 
                    lib = sr_tmp.findOutermostLibraryDir();
                else if (LibNode.isPackageFile(f))
                    lib = f.getParent();
                if (lib != null) {
                    String type = f.isDirectory() ? "Directory" : "File";
                    ModelicaCompiler.log.warning("%s '%s' is part of library at '%s', using library instead.", type, name, lib);
                    name = lib;
                    f = new File(name);
                }
            }
            if (f.isDirectory()) {
                if (!sr.getProgram().getLibraryList().addLibrary(name, LibNode.LoadReason.COMMANDLINE)) 
                    ModelicaCompiler.log.error(String.format("Error: The directory '%s' is not a Modelica library.", name));
            } else {
                for (StoredDefinition sd : sr_tmp.getProgram().getUnstructuredEntitys()) 
                    sr.getProgram().addUnstructuredEntity(sd);
            }
        }
        return sr;
    }

    public static beaver.Parser createModelicaParser(AbstractModelicaScanner scanner, String fileName) {
        org.jmodelica.modelica.parser.ModelicaParser parser = 
            new org.jmodelica.modelica.parser.ModelicaParser();
        parser.setLineBreakMap(scanner.getLineBreakMap());
        parser.setFormattingInfo(scanner.getFormattingInfo());
        parser.setFileName(fileName);
        return parser;
    }

    public static AbstractModelicaScanner createModelicaScanner(Reader in) {
        return new org.jmodelica.modelica.parser.ModelicaScanner(in);
    }

    public static AbstractFlatModelicaScanner createModelicaFlatScanner(Reader in) {
        return new org.jmodelica.modelica.parser.FlatModelicaScanner(in);
    }

    public static short expModelicaGoal() {
        return org.jmodelica.modelica.parser.ModelicaParser.AltGoals.exp;
    }

    public static short anonymousClassModelicaGoal() {
        return org.jmodelica.modelica.parser.ModelicaParser.AltGoals.anonymous_short_class;
    }

    public static SourceRoot parseFile(UtilInterface uif, String fileName) 
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        return parseModelicaFile(uif, fileName);
    }

    public static SourceRoot parseString(UtilInterface uif, String str, String fileName) 
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        return parseModelicaString(uif, str,fileName);
    }

    public static Exp parseExpString(String str)
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        return parseModelicaExpString(str);
    }

    public static BaseClassDecl parseAnonymousClassString(String code, Restriction restriction, String targetName)
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        return parseModelicaAnonymousClassString(code, restriction, targetName);
    }

    public static SourceRoot parseModelicaFile(UtilInterface uif, String fileName) 
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        Reader reader = fileReader(uif, fileName);
        AbstractModelicaScanner scanner = createModelicaScanner(new BufferedReader(reader));
        beaver.Parser parser = createModelicaParser(scanner, fileName);
        SourceRoot sr = (SourceRoot) parser.parse(scanner);
        sr.setUtilInterface(uif);
        sr.setFileName(fileName);
        reader.close();
        return sr;
    }

    public static SourceRoot parseModelicaString(UtilInterface uif, String str, String fileName) 
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        AbstractModelicaScanner scanner = createModelicaScanner(new StringReader(str));
        beaver.Parser parser = createModelicaParser(scanner, fileName);
        SourceRoot sr = (SourceRoot) parser.parse(scanner);
        sr.setUtilInterface(uif);
        sr.setFileName(fileName);
        return sr;
    }

    public static final String EXP_FILENAME = "<predefined string>";

    public static Exp parseModelicaExpString(String str)
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        AbstractModelicaScanner scanner = createModelicaScanner(new StringReader(str));
        beaver.Parser parser = createModelicaParser(scanner, EXP_FILENAME);
        return (Exp) parser.parse(scanner, expModelicaGoal());
    }

    public static final String ANONYMOUS_CLASS_FILENAME = "<command line argument>";

    public static BaseClassDecl parseModelicaAnonymousClassString(String code, Restriction restriction, String targetName)
            throws ParserException, beaver.Parser.Exception, FileNotFoundException, IOException {
        AbstractModelicaScanner scanner = createModelicaScanner(new StringReader(code));
        beaver.Parser parser = createModelicaParser(scanner, ANONYMOUS_CLASS_FILENAME);
        BaseClassDecl cl = (BaseClassDecl) parser.parse(scanner, anonymousClassModelicaGoal());
        cl.setRestriction(restriction);
        cl.setName(new IdDecl(targetName));
        return cl;
    }

    public static Reader fileReader(UtilInterface uif, File file) throws FileNotFoundException {
        return new InputStreamReader(new FileInputStream(file), ASTNode.UTF8);
    }

    public static Reader fileReader(UtilInterface uif, String path) throws FileNotFoundException {
        return fileReader(uif, new File(path));
    }


}
