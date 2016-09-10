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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/GenericCodeGen/src/jastadd/GenericXMLGenerator.jrag:26
 */
public abstract class GenericXMLGenerator extends GenericGenerator {
    protected  String startOfBlurb() { return "<!--"; }

    protected  String endOfBlurb() { return "-->"; }

    protected  String indentStep() { return "\t"; }

    public  void generate(Reader templateReader, CodeStream genPrinter, File includeDir) {
        if (templateReader == null) {
        	generateXMLDeclaration(genPrinter);
            rootTag().generate(genPrinter);
        	
        } else {
            super.generate(templateReader, genPrinter, includeDir);
        }
    }

    protected  void generateXMLDeclaration(CodeStream printer) {
        printer.print("<?xml");
        printer.format(" %s=\"%s\"", "version", getXMLVersion());
        printer.format(" %s=\"%s\"", "encoding", getXMLEncoding());
        printer.print("?>\n");
    }

    protected  String getXMLVersion() {
    	return "1.0";
    }

    protected  String getXMLEncoding() {
    	return "UTF-8";
    }

    protected  AbstractTag rootTag() {
        return getTag(root());
    }

    protected abstract  String root();

    protected  AbstractTag[] findTags(String[] names) {
        AbstractTag[] tags = new AbstractTag[names.length];
        int i = 0;
        for (String name : names) 
            tags[i++] = getTag(name);
        return tags;
    }

    protected  void generateTagStart(String name, CodeStream printer) {
        indent(printer);
        printer.print('<');
        printer.print(name);
    }

    protected  void generateOpenEnd(CodeStream printer) {
        printer.print(">\n");
        indentation++;
    }

    protected  void generateOpenTag(String name, CodeStream printer) {
        generateTagStart(name, printer);
        generateOpenEnd(printer);
    }

    protected  void generateOneLineTag(String name, Object contents, CodeStream printer) {
        generateTagStart(name, printer);
        printer.print(">");
        printer.print(XMLUtil.escape(contents.toString()));
        printer.format("</%s>\n", name);
    }

    protected  void generateClosedEnd(CodeStream printer) {
        printer.print(" />\n");
    }

    protected  void generateClosing(String name, CodeStream printer) {
        indentation--;
        indent(printer);
        printer.format("</%s>\n", name);
    }

    protected  void generateAttribute(String name, Object value, CodeStream printer) {
        printer.format(" %s=\"%s\"", name, XMLUtil.escape(value.toString()));
    }

    private  void indent(CodeStream printer) {
        for (int i = 0; i < indentation; i++)
            printer.print(indentStep);
    }

    private  String indentStep;

    private  int indentation;

    public  interface Creator {
        public GenericXMLGenerator create(Printer expPrinter, char escapeCharacter, FClass fclass);
    }

    public  GenericXMLGenerator(Printer expPrinter, char escapeCharacter, FClass fclass) {
        super(expPrinter,escapeCharacter, fclass);
        
        indentStep = indentStep();
        indentation = 0;
    }

    protected abstract  class XMLTag extends DAETag {
        
        private AbstractTag[] childTags;
        private AbstractTag[] attributeTags;
        
        /**
         * The name to use for the xml tag or attribute.
         */
        protected String xml;
        
        /**
         * Construct a tag.
         * 
         * @param name        tag name
         * @param xml         name to use for the xml tag or attribute
         * @param myGenerator the tag's generator
         * @param fclass      an FClass to generate code for
         */
        public XMLTag(String name, String xml, AbstractGenerator myGenerator, FClass fclass) {
            super(name, myGenerator, fclass);
            this.xml = xml;
        }
        
        /**
         * Get the tags used to generate the children of this node.
         * 
         * Default implementation returns all tags named in {@link #children()}.
         */
        public AbstractTag[] childTags() {
            if (childTags == null) 
                childTags = findTags(children());
            return childTags;
        }
        
        /**
         * Get the tags used to generate the attributes of this node.
         * 
         * Default implementation returns all tags named in {@link #attributes()}.
         */
        public AbstractTag[] attributeTags() {
            if (attributeTags == null) 
                attributeTags = findTags(attributes());
            return attributeTags;
        }
        
        /**
         * Get the names of the tags used to generate the children of this node.
         * 
         * Subclasses should override if they can have any children.
         */
        public String[] children() {
            return new String[] {};
        }
        
        /**
         * Get the names of the tags used to generate the attributes of this node.
         * 
         * Subclasses should override if they can have any attributes.
         */
        public String[] attributes() {
            return new String[] {};
        }
        
        /**
         * The value of the attribute described by this tag.
         * 
         * Subclasses that represent an XML attribute should override and return non-null.
         */
        public Object value() {
            return null;
        }
        
        /**
         * Generate the children of this tag.
         */
        public void generateChildren(CodeStream printer) {
            for (AbstractTag child : childTags()) 
                child.generateTag(printer);
        }
        
        /**
         * Generate the attributes of this tag.
         */
        public void generateAttributes(CodeStream printer) {
            for (AbstractTag attribute : attributeTags()) 
                attribute.generateTag(printer);
        }
        
        /**
         * Generate the opening tag of an XML node, with attributes as defined by 
         * {@link #attributeTags()}.
         * 
         * @param name     the name of the XML tag
         * @param printer  the print stream to use
         */
        public void generateOpening(String name, CodeStream printer) {
            generateTagStart(name, printer);
            generateAttributes(printer);
            generateOpenEnd(printer);
        }
        
        /**
         * Generate an XML node, with children and/or attributes as defined by 
         * {@link #childTags()} and {@link #attributeTags()}.
         * 
         * @param name     the name of the XML tag
         * @param printer  the print stream to use
         */
        public void generateNode(String name, CodeStream printer) {
            generateOpening(name, printer);
            generateChildren(printer);
            generateClosing(name, printer);
        }
        
        /**
         * Generate a closed XML tag, with attributes as defined by {@link #attributeTags()}.
         * 
         * @param name     the name of the XML tag
         * @param printer  the print stream to use
         */
        public void generateClosed(String name, CodeStream printer) {
            generateTagStart(name, printer);
            generateAttributes(printer);
            generateClosedEnd(printer);
        }

        /**
         * Method for generating code corresponding to the tag.
         * 
         * Default implementation does:
         * <ul>
         * <li>If {@link #value()} returns non-null, generate an XML attribute with that value.
         * <li>Otherwise if {@link #childTags()} returns an empty array, generate an XML node as 
         * per {@link #generateNode(String, CodeStream)}.
         * <li>Otherwise generate a closed XML tag, as per 
         * {@link #generateClosed(String, CodeStream)}.
         * </ul>
         * 
         * @param printer A CodeStream object for output of the generated code.
         */
        public void generate(CodeStream printer) {
        	Object val = value();
            if (val != null)
                generateAttribute(xml, val, printer);
            else if (childTags().length != 0)
                generateNode(xml, printer);
            else
                generateClosed(xml, printer);
        }
        
    }


}
