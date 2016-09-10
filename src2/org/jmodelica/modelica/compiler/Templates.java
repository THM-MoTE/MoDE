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
 * @aspect CompilationHelpers
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCompiler/src/jastadd/ModelicaCompiler.jrag:2159
 */
public class Templates extends Object {
    
    
    private static final int XML = 0;

    
    private static final int C   = 1;

    
    
    private ModelicaCompiler.TargetType type;

    
    
    private String[] templates;

    
    private String templatePathPrefix;

    
    private boolean fmuTemplate;

    
    
    protected static final String[] DEBUG_TEMPLATE_IN_SRC = new String[] {
        "Compiler/ModelicaCBackEnd/templates",
        "Compiler/ModelicaFMUXBackEnd/templates",
        "Compiler/OptimicaCBackEnd/templates",
        "Compiler/OptimicaFMUXBackEnd/templates",
    };

    


    public Templates(ModelicaCompiler.TargetType type, OptionRegistry options) {
        switch (type) {
        case FMUME10:
            templates = new String[] { null, "fmi1_me_modelica_template.c" };
            fmuTemplate = true;
            break;
        case FMUCS10:
            templates = new String[] { null, "fmi1_cs_modelica_template.c" };
            fmuTemplate = true;
            break;
        case FMUME20:
        case FMUCS20:
        case FMUMECS20:
            templates = new String[] { null, "fmi2_master_modelica_template.c" };
            fmuTemplate = true;
            break;
        case JMU:
            templates = new String[] { "jmodelica_model_description.tpl", "jmi_modelica_template.c" };
            break;
        case FMUX:
            templates = new String[] { "jmodelica_model_description.tpl" };
            break;
        case CEVAL:
            templates = new String[] { null, "ceval_external_template.c" };
            break;
        case NULL:
            templates = null;
            break;
        }
        
        this.type = type;
        
        if (CONTRIBUTORS != null) {
            for (TemplateContributor contributor : CONTRIBUTORS) {
                contributor.addTemplates(this, options);
            }
        }
    }

    

    private String template(int i) {
        return (i < templates.length) ? templates[i] : null;
    }

    
    
    private String templatePath(String fileName, boolean debugSrcIsHome) {
        if (fileName == null) {
            return null;
        }
        
        String home = ModelicaCompiler.getJModelicaHome();
        if (debugSrcIsHome) {
            for (String dir : DEBUG_TEMPLATE_IN_SRC) {
                File f = new File(new File(home, dir), fileName);
                if (f.exists())
                    return f.getAbsolutePath();
            }
        } 
        return new File(templateDir(), fileName).getAbsolutePath();
    }

    
    
    private File templateDir() {
        return new File(ModelicaCompiler.getJModelicaHome(), "CodeGenTemplates");
    }

    
    
    public void generateXMLFiles(ModelicaCompiler mc, FClass fc, AbstractGenerator gen, File sourceDir, String name)
            throws FileNotFoundException {
        mc.generateFile(templatePath(getXMLTemplateName(fc), mc.debugSrcIsHome), gen, sourceDir, name + ".xml", "");
    }

    
    
    public void generateCFiles(ModelicaCompiler mc, FClass fc, AbstractGenerator gen, File sourceDir, String name)
            throws FileNotFoundException {
        String header = "";
        
        if (fmuTemplate) {
            if (C_HEADER_TEMPLATES != null) {
                for (String tpl : C_HEADER_TEMPLATES) {
                    header = header + "#include \"" + name + "_" + tpl + ".h\"\n";
                }
            }
        }
        
        generateCFiles(mc, fc, gen, sourceDir, name, header);
        
        if (fmuTemplate) {
            if (C_HEADER_TEMPLATES != null) {
                for (String tpl : C_HEADER_TEMPLATES) {
                    String filename = tpl + ".h";
                    String path = new File("FMIBase", filename).toString();
                    
                    mc.generateFile(templatePath(path, mc.debugSrcIsHome), gen, sourceDir, name + "_" + filename, "");
                }
            }

            if (C_SOURCE_TEMPLATES != null) { 
                for (String tpl : C_SOURCE_TEMPLATES) {
                    String filename = tpl + ".c";
                    String path = new File("FMIBase", filename).toString();
                    
                    mc.generateFile(templatePath(path, mc.debugSrcIsHome), gen, sourceDir, name + "_" + filename, header);
                }
            }
        }
    }

    
    
    public String createExtraCFlagsString(OptionRegistry options, String name) {
        
        if (C_SOURCE_TEMPLATES == null) {
            return "";
        }
        
        String applies_to = options.getStringOption("cc_extra_flags_applies_to");
        String flags = options.getStringOption("cc_extra_flags");
        StringBuilder sb = new StringBuilder();
        if (applies_to.equals(OptionRegistry.CCompilerFiles.ALL)) {
            sb.append("%");
            sb.append(flags);
        } else if (applies_to.equals(OptionRegistry.CCompilerFiles.FUNCTIONS)) {
            sb.append(name);
            sb.append("_");
            sb.append("funcs");
            sb.append(flags);
        }
        return sb.toString();
    }

    
    
    private void generateCFiles(ModelicaCompiler mc, FClass fc, AbstractGenerator gen, File sourceDir, String name, String header)
            throws FileNotFoundException {
        mc.generateFile(templatePath(getCTemplateName(fc), mc.debugSrcIsHome), gen, sourceDir, name + ".c", header);
    }

    
   
    private static ArrayList<TemplateContributor> CONTRIBUTORS;

    
    private static LinkedHashSet<String> XML_TEMPLATES;

    
    private static LinkedHashSet<String> C_HEADER_TEMPLATES;

    
    private static LinkedHashSet<String> C_SOURCE_TEMPLATES;

        
    
    public abstract static class TemplateContributor {
        public void addTemplates(Templates templates, OptionRegistry options) { }
    }

    

    public static <T extends TemplateContributor> T addContributor(T contributor) {
        if (CONTRIBUTORS == null) { CONTRIBUTORS = new ArrayList<TemplateContributor>(); }
        
        CONTRIBUTORS.add(contributor);
        
        return contributor;
    }

    
    
    public void addXMLTemplates(String ...template) {
        if (XML_TEMPLATES == null) { XML_TEMPLATES = new LinkedHashSet<String>(); }
        
        for (String tmpl : template) {
            XML_TEMPLATES.add(tmpl);
        }
    }

    
    
    public void addCSourceTemplates(String ...template) {
        if (C_SOURCE_TEMPLATES == null) { C_SOURCE_TEMPLATES = new LinkedHashSet<String>(); }
        
        for (String tmpl : template) {
            C_SOURCE_TEMPLATES.add(tmpl);
        }
    }

    
    
    public void addCHeaderTemplates(String ...template) {
        if (C_HEADER_TEMPLATES == null) { C_HEADER_TEMPLATES = new LinkedHashSet<String>(); }
        
        for (String tmpl : template) {
            C_HEADER_TEMPLATES.add(tmpl);
        }
    }

    private String getCTemplateName(FClass fc) {
    return template(C);
}

    private String getXMLTemplateName(FClass fc) {
    return template(XML);
}


}
