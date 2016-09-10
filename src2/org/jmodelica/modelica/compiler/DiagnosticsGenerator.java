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
 * @aspect DiagnosticsGeneration
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/DiagnosticsGenerator.jrag:30
 */
public class DiagnosticsGenerator extends Object {
    

    private String modelName;

    
    private String modelNameUnderscore;

    
    private String diagnosticsDirString;

    

    private IndexFile indexFile;

    
    private FlattenedModelFile flattenedModelFile;

    
    private TransformedModelFile transformedModelFile;

    
    private ProblemsFile problemsFile;

    
    private BLTFile bltFile;

    
    private BLTTableFile bltTableFile;

    
    private AliasFile aliasFile;

    
    private ConnectionsFile connectionsFile;

    
    private IVFile ivFile;

    

    // This is not optimal and shouldn't be located here, will do for now!
    private int numErrors = -1;

    
    private int numComplianceErrors = -1;

    
    private int numWarnings = -1;

    

    /**
     * Default constructor for the Diagnostics generator.
     *
     * The diagnostics generator generates a number of HTML files containing
     * diagnostics for the compilation of a model.
     */
    public DiagnosticsGenerator(String modelName) {
        this.modelName = modelName;
        this.modelNameUnderscore = modelName;
        int pos = modelNameUnderscore.indexOf('(');
        if (pos >= 0)
            this.modelNameUnderscore = this.modelNameUnderscore.substring(0, pos);
        this.modelNameUnderscore = this.modelNameUnderscore.replace('.', '_');
        
        // Create directory containing the diagnostics files
        File currDir = new File(".");
        String currDirString = currDir.getAbsolutePath().substring(0,currDir.getAbsolutePath().length()-2);
        File diagnosticsDir = new File(currDirString,this.modelNameUnderscore + "_html_diagnostics");
        diagnosticsDir.mkdir();
        diagnosticsDirString = diagnosticsDir.getAbsolutePath();
        
        indexFile = new IndexFile();
        flattenedModelFile = new FlattenedModelFile();
        transformedModelFile = new TransformedModelFile();
        problemsFile = new ProblemsFile();
        bltFile = new BLTFile();
        bltTableFile = new BLTTableFile();
        aliasFile = new AliasFile();
        connectionsFile = new ConnectionsFile();
        ivFile = new IVFile();
        
        DiagnosticsFile<?>[] files = new DiagnosticsFile[] {
                flattenedModelFile,
                transformedModelFile,
                problemsFile,
                bltFile,
                bltTableFile,
                aliasFile,
                connectionsFile,
                ivFile
        };
        
        for (DiagnosticsFile<?> file : files)
            file.clear();
    }

    

    public abstract class DiagnosticsFile<T> {

        protected String title;
        protected String fileName;
        protected File path;
        protected boolean addTitle;

        protected DiagnosticsFile(String title, String suffix, boolean addTitle) {
            this(title, String.format("%s.html", suffix));
            this.addTitle = addTitle;
        }

        protected DiagnosticsFile(String title, String fileName) {
            this.title = title;
            this.fileName = fileName;
            path = new File(diagnosticsDirString, fileName).getAbsoluteFile();
            addTitle = false;
        }

        public void write(T obj) {
            CodeStream out = null;
            try {
                out = new CodeStream(new PrintStream(path, "UTF-8"));
                out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
                out.println("<html>");
                out.println("<head>");
                writeHead(out);
                out.println("</head>");
                out.println("<body>");
                if (addTitle) {
                    if (title != null)
                        out.format("<h2>%s: %s</h2>\n", title, modelName);
                    else
                        out.format("<h2>%s</h2>\n", modelName);
                }
                writeContents(obj, out);
                out.println("</body>");
                out.println("</html>");
            } catch(FileNotFoundException e) {
            } catch(UnsupportedEncodingException e) {
            } finally {
                if (out != null)
                    out.close();
            }
        }

        protected void writeHead(CodeStream out) {
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
            out.println("<title>Model diagnosis</title>\n");
        }

        public void clear() {
            PrintStream out;
            try {
                out = new PrintStream(path, "UTF-8");
                out.close();
            } catch(FileNotFoundException e) {
            } catch(UnsupportedEncodingException e) {
            }
        }

        public void writeLink(CodeStream out) {
            writeLink(out, "");
        }

        public void writeLink(CodeStream out, String suffix) {
            out.println("<p>");
            out.formatln("<a href=\"%s\">%s</a>%s", fileName, title, suffix);
            out.println("</p>\n");
        }

        protected abstract void writeContents(T obj, CodeStream out);

    }

    

    public abstract class FClassDiagnosticsFile extends DiagnosticsFile<FClass> {

        protected FClassDiagnosticsFile(String title, String suffix) {
            super(title, suffix);
        }

        protected FClassDiagnosticsFile(String title, String suffix, boolean addTitle) {
            super(title, suffix, addTitle);
        }

    }

    

    /**
     *  Write a file containing the raw flattened model.
     */
    public void writeRawFlattenedModel(FClass fc) {
        flattenedModelFile.write(fc);
    }

    

    public class FlattenedModelFile extends FClassDiagnosticsFile {

        public FlattenedModelFile() {
            super("Flattened model", "flattened", true);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            // Dump model to file
            out.print("<pre>\n");
            fc.prettyPrint(out, "");
            out.print("</pre>\n");
        }
    }

    

    /**
     *  Write a file containing the transformed scalarized model..
     */
    public void writeTransformedFlattenedModel(FClass fc) {
        transformedModelFile.write(fc);
    }

    

    public class TransformedModelFile extends FClassDiagnosticsFile {

        public TransformedModelFile() {
            super("Transformed model", "transformed", true);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            // Dump model to file
            out.print("<pre>\n");
            fc.prettyPrint(out, "");
            out.print("</pre>\n");
        }
    }

    

    /**
     *  Write a file containing BLT information
     */
    public void writeBLTFile(FClass fc) {
        bltFile.write(fc);
    }

    

    public class BLTFile extends FClassDiagnosticsFile {

        public BLTFile() {
            super("BLT diagnostics", "blt", false);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            if (!fc.myOptions().getBooleanOption("equation_sorting"))
                return;
            out.print("<h2>BLT for initialization system </h2>\n");
            for (AbstractEquationBlock eb : fc.getDAEInitBLT()) {
                out.print("<pre>\n");
                eb.prettyPrint(out);
                out.print("</pre>\n");
            }
            out.print("<h2>BLT for DAE system </h2>\n");
            out.print("<h3> ODE blocks </h3>\n");
            // Loop over all derivatives
            for (AbstractEquationBlock eb : fc.getDAEStructuredBLT().getOdeBlocks()) {
                out.print("<pre>\n");
                eb.prettyPrint(out);
                out.print("</pre>\n");
            }
            out.print("<h3> Real output blocks </h3>\n");
            for (AbstractEquationBlock eb : fc.getDAEStructuredBLT().getRealOutputBlocks()) {
                out.print("<pre>\n");
                eb.prettyPrint(out);
                out.print("</pre>\n");
            }
            out.print("<h3> Integer and boolean output blocks </h3>\n");
            for (AbstractEquationBlock eb : fc.getDAEStructuredBLT().getIntegerBooleanOutputBlocks()) {
                out.print("<pre>\n");
                eb.prettyPrint(out);
                out.print("</pre>\n");
            }
            out.print("<h3> Other output blocks </h3>\n");
            for (AbstractEquationBlock eb : fc.getDAEStructuredBLT().getOtherBlocks()) {
                out.print("<pre>\n");
                eb.prettyPrint(out);
                out.print("</pre>\n");
            }
        }
    }

    

    public void writeIVFile(FClass fc) {
        ivFile.write(fc);
    }

    

    public class IVFile extends FClassDiagnosticsFile {

        public IVFile() {
            super("Iteration Variables", "iv", false);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            if (!fc.myOptions().getBooleanOption("equation_sorting"))
                return;
            out.print("<h2>Alias sets of iteration variables:</h2>\n");
            out.print("<pre>\n");
            Set<FVariable> vars = new HashSet<FVariable>();
            for (AbstractEquationBlock eb : fc.getDAEStructuredBLT())
                if (eb instanceof TornEquationBlock)
                    vars.addAll(eb.unsolvedVariables());
            for (AliasManager.AliasSet as : fc.getAliasManager().getAliasSets())
                if (vars.contains(as.getModelVariable().getFVariable()))
                    out.println(as.toStringWithStart());
            out.print("</pre>\n");
        }
    }

    

    /**
     *  Write a file containing the alias elimination information
     */
    public void writeAliasFile(FClass fc) {
        aliasFile.write(fc);
    }

    

    public class AliasFile extends FClassDiagnosticsFile {

        public AliasFile() {
            super("Alias sets", "alias", true);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            out.print("<pre>\n");
            out.print(fc.aliasDiagnostics());
            out.print("</pre>\n");
        }
    }

    

    /**
     *  Write a file containing the alias elimination information
     */
    public void writeConnectionsFile(FClass fc) {
        connectionsFile.write(fc);
    }

    

    public class ConnectionsFile extends FClassDiagnosticsFile {

        public ConnectionsFile() {
            super("Connection sets", "connections", true);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            out.print("<pre>\n");
            out.print(fc.getConnectionSetManager().printConnectionSets());
            out.print("</pre>\n");
        }
    }

    

	/**
     *  Write a file containing the problems in the model.
     */
    public void writeProblems(Collection<Problem> newProblems) {
        problemsFile.write(newProblems);
    }

    

    public class ProblemsFile extends DiagnosticsFile<Collection<Problem>> {

        private Collection<Problem> problems = new TreeSet<Problem>();

        public ProblemsFile() {
            super("Problems", "errors", true);
        }

        @Override
        protected void writeContents(Collection<Problem> newProblems, CodeStream out) {
            // Add the problems to our set of problems
            problems.addAll(newProblems);
            
            out.print("<pre>\n");
            StringBuffer errs = new StringBuffer();
            StringBuffer compErrs = new StringBuffer();
            StringBuffer warns = new StringBuffer();
            numErrors = 0;
            numComplianceErrors = 0;
            numWarnings = 0;
            for (Problem p : problems) {
                if (p.severity() == ProblemSeverity.ERROR &&
                    p.kind() != ProblemKind.COMPLIANCE) {
                    errs.append(p.toString() + "\n");
                    numErrors++;
                } else if (p.severity() == ProblemSeverity.ERROR &&
                           p.kind() == ProblemKind.COMPLIANCE) {
                    compErrs.append(p.toString() + "\n");
                    numComplianceErrors++;
                } else if (p.severity() == ProblemSeverity.WARNING) {
                    warns.append(p.toString() + "\n");
                    numWarnings++;
                }
            }
            out.print(errs.toString());
            out.print(compErrs.toString());
            out.print(warns.toString());
            out.print("</pre>\n");
            
            // Update index file
            indexFile.write(null);
        }
    }

    

    private String modelDiagnosticsBeforeTransform;

    

    public void setModelDiagnosticsBeforeTransform(String s) {
        modelDiagnosticsBeforeTransform = s;
    }

    

    /**
     *  Write index.html.
     */
    public void writeDiagnostics(FClass fc) {
        
        writeIndexFile(fc);
        
        // Create BLT diagnostics file (if equation_sorting is true)
        writeBLTFile(fc);
        
        // Create BLT table diagnostics file (if equation_sorting is true)
        writeBLTTableFile(fc);
        
        // Create connection set information file
        writeConnectionsFile(fc);
        
        // Create a file for alias information
        writeAliasFile(fc);
    }

    

    public class IndexFile extends FClassDiagnosticsFile {
        
        public IndexFile() {
            super(null, "index", true);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            problemsFile.writeLink(out, ":<br />" + numErrors + " errors, " + numComplianceErrors + " compliance errors, " + numWarnings + " warnings");
            if (fc != null) {
                out.println("<h3>Model before transformation</h3>");
                out.println("<p><pre>");
                // Diagnostics about model sizes
                out.print(modelDiagnosticsBeforeTransform);
                out.println("</pre></p>");
                flattenedModelFile.writeLink(out);
                connectionsFile.writeLink(out);
                
                out.println("<h3>Model after transformation</h3>");
                out.println("<p><pre>");
                // Diagnostics about model sizes
                out.print(fc.modelDiagnostics());
                out.println("</pre></p>");  
                // Model name and links to the flattened models
                transformedModelFile.writeLink(out);
                aliasFile.writeLink(out, " (" + fc.aliasDiagnosticsShort() + ")");
                bltFile.writeLink(out);
                bltTableFile.writeLink(out);
                
                if (fc.myOptions().getBooleanOption("equation_sorting")) {
                    ArrayList<Integer> unsolvedDAEInitBlockSizes =
                        fc.getDAEInitBLT().unsolvedBlockSizes(); 
                    out.print("<p>Number of unsolved equation blocks in DAE initialization system: " + 
                              unsolvedDAEInitBlockSizes.size() + ": {");   
                    int ind = 0;
                    for (Integer bs : unsolvedDAEInitBlockSizes) {
                        out.print(bs.toString());
                        if (ind<unsolvedDAEInitBlockSizes.size()-1) {
                            out.print(",");
                        }   
                        ind++;
                    }
                    out.println("}<br />");
                    if (!fc.onlyInitBLT()) {
                        ArrayList<Integer> unsolvedDAEBlockSizes =
                                fc.getDAEBLT().unsolvedBlockSizes(); 
                        out.print("Number of unsolved equation blocks in DAE system: " + 
                                unsolvedDAEBlockSizes.size() + ": {");   
                        ind = 0;
                        for (Integer bs : unsolvedDAEBlockSizes) {
                            out.print(bs.toString());
                            if (ind<unsolvedDAEBlockSizes.size()-1) {
                                out.print(",");
                            }   
                            ind++;
                        }
                        out.println("}");
                    }
                    out.println("</p>");
                    if (EquationBlockFactory.canTear(fc.myOptions())) {
                        unsolvedDAEInitBlockSizes = fc.getDAEInitBLT().unsolvedBlockIterationSizes();
                        out.print("<p>Number of unsolved equation blocks in DAE initialization system after tearing: " + 
                                  unsolvedDAEInitBlockSizes.size() + ": {");   
                        ind = 0;
                        for (Integer bs : unsolvedDAEInitBlockSizes) {
                            out.print(bs.toString());
                            if (ind<unsolvedDAEInitBlockSizes.size()-1) {
                                out.print(",");
                            }   
                            ind++;
                        }
                        out.println("}<br />");
                        if (!fc.onlyInitBLT()) {
                            ArrayList<Integer> unsolvedDAEBlockSizes = fc.getDAEBLT().unsolvedBlockIterationSizes();
                            out.print("Number of unsolved equation blocks in DAE system after tearing: " + 
                                      unsolvedDAEBlockSizes.size() + ": {");
                            ind = 0;
                            for (Integer bs : unsolvedDAEBlockSizes) {
                                out.print(bs.toString());
                                if (ind<unsolvedDAEBlockSizes.size()-1) {
                                    out.print(",");
                                }   
                                ind++;
                            }
                            out.print("}");
                        }
                        out.println("</p>");
                    }
                }
            }
        }
    }

    

    public void writeIndexFile(FClass fc) {
        indexFile.write(fc);
    }

    

    public void writeBLTTableFile(FClass fc) {
        bltTableFile.write(fc);
    }

    

    public class BLTTableFile extends FClassDiagnosticsFile {
        
        public BLTTableFile() {
            super("BLT diagnostics table", "bltTable", false);
        }

        @Override
        protected void writeContents(FClass fc, CodeStream out) {
            if (!fc.myOptions().getBooleanOption("equation_sorting"))
                return;
            out.println("<div id=\"rowHighlight\" style=\"display:none;\"></div>");
            out.println("<div id=\"colHighlight\" style=\"display:none;\"></div>");
            out.println("<div id=\"rowLockHighlight\" style=\"display:none;\"></div>");
            out.println("<div id=\"colLockHighlight\" style=\"display:none;\"></div>");

            out.println("<h1>BLT for Init DAE System</h1>");
            fc.getDAEInitBLT().diagnostics_generateBLTTable(out, true);

            if (!fc.onlyInitBLT()) {
                out.println("<h1>BLT for DAE System</h1>");
                fc.getDAEBLT().diagnostics_generateBLTTable(out, false);
            }
        }

        @Override
        protected void writeHead(CodeStream out) {
            super.writeHead(out);
            out.print(BLT_style);
        }

        private String BLT_style = "\n" +
                "<style type=\"text/css\">" + 
                "div.blt {\n" +
                "    position:relative;\n" +
                "    margin-left:200px;\n" +
                "    margin-top:200px;\n" +
                "    border:1px solid black;\n" +
                "    font-family:sans-serif;\n" +
                "    font-size:10px;\n" +
                "}\n" +
                "div.block {\n" +
                "    position:absolute;\n" +
                "    box-sizing:border-box;\n" +
                "    border:1px solid black;\n" +
                "}\n" +
                "div.incidence {\n" +
                "    position:absolute;\n" +
                "    cursor:pointer;\n" +
                "}\n" +
                "div.incidence div{\n" +
                "    width:" + AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + "px;\n" +
                "    height:" + AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + "px;\n" +
                "    overflow:hidden;\n" +
                "    display:table-cell;\n" +
                "    text-align:center;\n" +
                "    vertical-align:middle;\n" +
                "}\n" +
                "div.equation {\n" +
                "    position:absolute;\n" +
                "    left:-200px;\n" +
                "    width:200px;\n" +
                "    box-sizing:border-box;\n" +
                "    height:" + (AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + 1) + "px;\n" +
                "    border-top:1px solid black;\n" +
                "    border-bottom:1px solid black;\n" +
                "    overflow:hidden;\n" +
                "    white-space:nowrap;\n" +
                "}\n" +
                "div.variable {\n" +
                "    position:absolute;\n" +
                "    top:-109px;\n" +
                "    box-sizing:border-box;\n" +
                "    height:" + (AbstractEquationBlock.DIAGNOSTICS_CELL_SIZE + 1) + "px;\n" +
                "    width:200px;\n" +
                "    border-top:1px solid black;\n" +
                "    border-bottom:1px solid black;\n" +
                "    overflow:hidden;\n" +
                "    white-space:nowrap;\n" +
                "    transform:rotate(270deg);\n" +
                "    -ms-transform:rotate(270deg);\n" +
                "    -webkit-transform:rotate(270deg);\n" +
                "    -moz-transform:rotate(270deg);\n" +
                "}\n" +
                "table.incidenceMatrix {\n" +
                "    border-collapse:collapse;\n" +
                "}\n" +
                "\n" +
                "th.var {\n" +
                "    border-right:1px solid black;\n" +
                "    border-left:1px solid black;\n" +
                "}\n" +
                "\n" +
                "div.var {\n" +
                "    width:30px;\n" +
                "    overflow:hidden;\n" +
                "    white-space:nowrap;\n" +
                "}\n" +
                "\n" +
                "th.eqn {\n" +
                "    text-align:right;\n" +
                "    border-top:1px solid black;\n" +
                "    border-bottom:1px solid black;\n" +
                "}\n" +
                "\n" +
                "div.eqn {\n" +
                "    max-width:200px;\n" +
                "    overflow:hidden;\n" +
                "    white-space:nowrap;\n" +
                "}\n" +
                "\n" +
                "table.incidenceMatrix td {\n" +
                "text-align:center;\n" +
                "height:30px;\n" +
                "}\n" +
                "\n" +
                "div#rowHighlight,\n" +
                "div#colHighlight {\n" +
                "    position:absolute;\n" +
                "    z-index:1000;\n" +
                "    background:#999;\n" +
                "    opacity: 0.3;\n" +
                "}\n" +
                "\n" +
                "div#rowLockHighlight,\n" +
                "div#colLockHighlight {\n" +
                "    position:absolute;\n" +
                "    z-index:900;\n" +
                "    background:#999;\n" +
                "    opacity: 0.3;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "<script tyle=\"text/javascript\">\n" +
                "\n" +
                "var currentHightlight = null;\n" +
                "var currentLockHightlight = null;\n" +
                "\n" +
                "function hightlight(incidence) {\n" +
                "    var row = document.getElementById('rowHighlight');\n" +
                "    var col = document.getElementById('colHighlight');\n" +
                "    var blt = incidence.parentElement;\n" +
                "    setHighlight(incidence, blt, row, col)\n" +
                "}\n" +
                "function unhighlight(incidence) {\n" +
                "    var row = document.getElementById('rowHighlight');\n" +
                "    row.style.display = 'none';\n" +
                "    var col = document.getElementById('colHighlight');\n" +
                "    col.style.display = 'none';\n" +
                "}\n" +
                "\n" +
                "function lockHighlight(incidence) {\n" +
                "    var row = document.getElementById('rowLockHighlight');\n" +
                "    var col = document.getElementById('colLockHighlight');\n" +
                "    var blt = incidence.parentElement;\n" +
                "    setHighlight(incidence, blt, row, col)\n" +
                "}\n" +
                "\n" +
                "function setHighlight(incidence, blt, row, col) {\n" +
                "    row.style.width = blt.offsetWidth + 'px';\n" +
                "    row.style.height = (incidence.offsetHeight + 1)+ 'px';\n" +
                "    row.style.top = (offsetTop(incidence) + 1) + 'px';\n" +
                "    row.style.left = offsetLeft(blt) + 'px';\n" +
                "    row.style.display = 'block';\n" +
                "    col.style.width = (incidence.offsetWidth + 1) + 'px';\n" +
                "    col.style.height = blt.offsetHeight + 'px';\n" +
                "    col.style.top = offsetTop(blt) + 'px';\n" +
                "    col.style.left = (offsetLeft(incidence) + 1) + 'px';\n" +
                "    col.style.display = 'block';\n" +
                "}\n" +
                "\n" +
                "function offsetTop(obj) {\n" +
                "    var res = 0;\n" +
                "    while (obj != null) {\n" +
                "        res += obj.offsetTop;\n" +
                "        obj = obj.offsetParent;\n" +
                "    }\n" +
                "    return res;\n" +
                "}\n" +
                "function offsetLeft(obj) {\n" +
                "    var res = 0;\n" +
                "    while (obj != null) {\n" +
                "        res += obj.offsetLeft;\n" +
                "        obj = obj.offsetParent;\n" +
                "    }\n" +
                "    return res;\n" +
                "}\n" +
                "</script>\n";
    }

    

    protected static class TableManager {
        private int xPos = 0;
        private int yPos = 0;
        private String blockPrefix;

        protected TableManager(String blockPrefix) {
            this.blockPrefix = blockPrefix;
        }

        public String getBlockPrefix() {
            return blockPrefix;
        }

        public void newRow() {
            yPos++;
            xPos = 0;
        }

        public int getYPos() {
            return yPos;
        }

        public void newCol() {
            xPos++;
        }

        public int getXPos() {
            return xPos;
        }
    }


}
