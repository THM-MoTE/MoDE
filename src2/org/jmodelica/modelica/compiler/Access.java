/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.11 */
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
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:391
 * @production Access : {@link SourceBaseNode};

 */
public abstract class Access extends SourceBaseNode implements Cloneable {
    /**
     * Create an access from a class name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:402
     */
    public static Access fromClassName(String name) {
		String[] parts = name.split("\\.");
		if (parts.length == 1) {
			return new ClassAccess(parts[0]);
		} else {
			List<Access> l = new List<Access>();
			for (String part : parts)
				l.add(new ClassAccess(part));
			return new Dot(l);
		}
	}
    /**
     * @aspect InstantiatedExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3050
     */
    public InstAccess instantiate() { 
        return copyLocationTo(newInstAccess());
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1492
     */
    public abstract InstAccess newInstAccess();
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:489
     */
    public Dot buildDot(Dot dot) {
    	dot.addAccessNoTransform(this);
    	return dot;
    }
    /**
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:31
     */
    protected boolean duringFindClassDecl = false;
    /**
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:61
     */
    public void dumpTree(String indent) {
  		String s = indent + dump() +": "+qualifiedName() + " at line: " + beginLine();
  		System.out.println(s);
   	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1115
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		printStream.print(name());
	}
    /**
     * stripFirstAccess removes the first access in a qualified
     * name. If the name is not qualified, null is returned. 
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:931
     */
    public Access stripFirstAccess() {
        return null;
    }
    /**
     * @declaredat ASTNode:1
     */
    public Access() {
        super();
    }
    /**
     * Initializes the child array to the correct size.
     * Initializes List and Opt nta children.
     * @apilevel internal
     * @ast method
     * @declaredat ASTNode:10
     */
    public void init$Children() {
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:15
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:21
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:39
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:45
     */
    public Access clone() throws CloneNotSupportedException {
        Access node = (Access) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:56
     */
    public abstract Access fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract Access treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract Access treeCopy();
    /**
     * @attribute syn
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:35
     */
    @ASTNodeAnnotation.Attribute
    public abstract ClassDecl findClassDecl();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:565
     */
    @ASTNodeAnnotation.Attribute
    public abstract String name();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:596
     */
    @ASTNodeAnnotation.Attribute
    public abstract String qualifiedName();
    @ASTNodeAnnotation.Attribute
    public boolean isArrayAccess() {
        ASTNode$State state = state();
        boolean isArrayAccess_value = false;

        return isArrayAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public ArraySubscripts arraySubscripts() {
        ASTNode$State state = state();
        ArraySubscripts arraySubscripts_value = null;

        return arraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String toString() {
        ASTNode$State state = state();
        String toString_value = prettyPrint("");

        return toString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isNamed() {
        ASTNode$State state = state();
        boolean isNamed_value = false;

        return isNamed_value;
    }
    /**
     * @attribute syn
     * @aspect SourceUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:239
     */
    @ASTNodeAnnotation.Attribute
    public String asID() {
        ASTNode$State state = state();
        try {
        		throw new UnsupportedOperationException();
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String lastName() {
        ASTNode$State state = state();
        String lastName_value = name();

        return lastName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Access getLastAccess() {
        ASTNode$State state = state();
        Access getLastAccess_value = this;

        return getLastAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public Access getFirstAccess() {
        ASTNode$State state = state();
        Access getFirstAccess_value = this;

        return getFirstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isQualified() {
        ASTNode$State state = state();
        boolean isQualified_value = false;

        return isQualified_value;
    }
    @ASTNodeAnnotation.Attribute
    public Access getTopAccess() {
        ASTNode$State state = state();
        Access getTopAccess_value = retrieveTopAccess(this);

        return getTopAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = name().equals(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public File findOutermostLibraryDirForWithin(File f) {
        ASTNode$State state = state();
        File findOutermostLibraryDirForWithin_File_value = null;

        return findOutermostLibraryDirForWithin_File_value;
    }
    /**
     * @attribute inh
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:51
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClass(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClass_String_value = getParent().Define_simpleLookupClass(this, null, name);

        return simpleLookupClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:88
     */
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassGlobalScope(String name) {
        ASTNode$State state = state();
        ClassDecl simpleLookupClassGlobalScope_String_value = getParent().Define_simpleLookupClassGlobalScope(this, null, name);

        return simpleLookupClassGlobalScope_String_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:895
     */
    @ASTNodeAnnotation.Attribute
    public Access getNextAccess() {
        ASTNode$State state = state();
        Access getNextAccess_value = getParent().Define_getNextAccess(this, null);

        return getNextAccess_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:958
     */
    @ASTNodeAnnotation.Attribute
    public Access retrieveTopAccess(Access pre) {
        ASTNode$State state = state();
        Access retrieveTopAccess_Access_value = getParent().Define_retrieveTopAccess(this, null, pre);

        return retrieveTopAccess_Access_value;
    }
    /**
     * Check if this access is a name part of a qualified access.
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:976
     */
    @ASTNodeAnnotation.Attribute
    public boolean inQualified() {
        ASTNode$State state = state();
        boolean inQualified_value = getParent().Define_inQualified(this, null);

        return inQualified_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
