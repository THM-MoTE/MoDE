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
 * A name part without array subscripts.
 * 
 * To be used in FQName:s.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:462
 * @production FQNamePart : {@link BaseNode} ::= <span class="component">&lt;Name:String&gt;</span>;

 */
public class FQNamePart extends BaseNode implements Cloneable, CommonNamePart {
    /**
     * Create a copy with all array subscripts replaced by literals.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2434
     */
    public FQNamePart resolveSubscripts(VariableEvaluator evaluator) {
        return fullCopy();
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4098
     */
    public Indices indices() {
	  return Indices.createFromFas(getFArraySubscripts());
  }
    /**
     * Add an array subscript to this name part, if necessary creating a new name part.
     * 
     * This name part might or might not be altered - replace it with the return value.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:791
     */
    public FQNamePartArray addSubscript(FSubscript s) {
        return new FQNamePartArray(getName(), new FArraySubscripts(new List(s)));
    }
    /**
     * Create an FQName containing only a copy of this part.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:981
     */
    public FQName createFQName() {
        return new FQNameString(getName());
    }
    /**
     * Append this name part to <code>name</code>, but with 
     * all array subscripts replaced with indices from <code>i</code>.
     * 
     * The first index in <code>i</code> to use should be given in <code>j</code>, and 
     * the new value for <code>j</code> is returned.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1030
     */
    public int appendWithReplacedSubscripts(FQNameFull name, Index i, int j) {
        name.append(getName());
        return j;
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1238
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
    	str.print(getName());
		if (hasFArraySubscripts())
			p.print(getFArraySubscripts(),str,indent);				    	
    }
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:199
     */
    public List<FQNamePart> buildAccessContext(String name, FArraySubscripts fas) {
        List<FQNamePart> res = accessContextFlat();
        if (fas == null) {
            res.add(new FQNamePart(name));
        } else {
            res.add(new FQNamePartArray(name, fas));
        }
        return res;
    }
    /**
     * @aspect FlatDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:401
     */
    public void dumpTree(String indent) {
		String s = indent + dump() +": " + name() + " at line: " + beginLine();
		System.out.println(s);
		for(int i = 0; i < getNumChild(); i++)
      		getChild(i).dumpTree(indent + "  ");
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1593
     */
    public FQNamePart copyWithNonLiteralSubscriptsAsColon() {
        return treeCopyNoTransform();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1642
     */
    public void copyNonLiteralSubscriptsTo(FArraySubscripts fas) {
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1550
     */
    public FQNamePart scalarize(Map<String,FExp> indexMap) {
		return new FQNamePart(getName());
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:472
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		String namespace = "exp";
		String tag = this.xmlTag();
		String nameAttr = " name=\"" + this.getName() + "\"";
		
		if (this.hasFArraySubscripts()){
			str.println(indent + "<" + namespace + ":" + tag + nameAttr + ">");
			this.getFArraySubscripts().prettyPrint_XML(str,p.indent(indent));	
			str.println(indent + "</" + namespace + ":" + tag + ">");
		}else{
			str.println(indent + "<" + namespace + ":" + tag + nameAttr + "/>");
		}

	}
    /**
     * @declaredat ASTNode:1
     */
    public FQNamePart() {
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
     * @declaredat ASTNode:12
     */
    public FQNamePart(String p0) {
        setName(p0);
    }
    /**
     * @declaredat ASTNode:15
     */
    public FQNamePart(Symbol p0) {
        setName(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:21
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:27
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:33
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:45
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:51
     */
    public FQNamePart clone() throws CloneNotSupportedException {
        FQNamePart node = (FQNamePart) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:58
     */
    public FQNamePart copy() {
        try {
            FQNamePart node = (FQNamePart) clone();
            node.parent = null;
            if(children != null) {
                node.children = (ASTNode[]) children.clone();
            }
            return node;
        } catch (CloneNotSupportedException e) {
            throw new Error("Error: clone not supported for " + getClass().getName());
        }
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:77
     */
    public FQNamePart fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:86
     */
    public FQNamePart treeCopyNoTransform() {
        FQNamePart tree = (FQNamePart) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                ASTNode child = (ASTNode) children[i];
                if(child != null) {
                    child = child.treeCopyNoTransform();
                    tree.setChild(child, i);
                }
            }
        }
        return tree;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:106
     */
    public FQNamePart treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:113
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_Name == ((FQNamePart)node).tokenString_Name);    
    }
    /**
     * Replaces the lexeme Name.
     * @param value The new value for the lexeme Name.
     * @apilevel high-level
     */
    public void setName(String value) {
        tokenString_Name = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_Name;
    /**
     */
    public int Namestart;
    /**
     */
    public int Nameend;
    /**
     * JastAdd-internal setter for lexeme Name using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme Name
     * @apilevel internal
     */
    public void setName(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setName is only valid for String lexemes");
        tokenString_Name = (String)symbol.value;
        Namestart = symbol.getStart();
        Nameend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme Name.
     * @return The value for the lexeme Name.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Name")
    public String getName() {
        return tokenString_Name != null ? tokenString_Name : "";
    }
    @ASTNodeAnnotation.Attribute
    public int accessNdims() {
        ASTNode$State state = state();
        int accessNdims_value = 0;

        return accessNdims_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numFSubscripts() {
        ASTNode$State state = state();
        int numFSubscripts_value = hasFArraySubscripts() ? getFArraySubscripts().getNumFSubscript() : 0;

        return numFSubscripts_value;
    }
    /**
     * Check if this name part accesses an array.
     * 
     * Note that the check is based only on the array subscripts, and a name part 
     * without array subscripts is assumed to be scalar. Thus this method should 
     * only be used for name parts with array subscripts.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4109
     */
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        try {
        	  if (hasFArraySubscripts()) 
        		  for (FSubscript fs : getFArraySubscripts().getFSubscripts())
        			  if (fs.ndims() > 0)
        				  return true;
        	  return false;
          }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = false;

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = false;

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = null;

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = ASTNode.underScore(getName());

        return nameUnderscore_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = false;

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FQNamePart copyFirstElement() {
        ASTNode$State state = state();
        FQNamePart copyFirstElement_value = new FQNamePart(getName());

        return copyFirstElement_value;
    }
    @ASTNodeAnnotation.Attribute
    public List<FQNamePart> buildAccessContext() {
        ASTNode$State state = state();
        List<FQNamePart> buildAccessContext_value = buildAccessContext(name(), accessContextFAS());

        return buildAccessContext_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts accessContextFAS() {
        ASTNode$State state = state();
        FArraySubscripts accessContextFAS_value = null;

        return accessContextFAS_value;
    }
    /**
     * Return a new name part that has index instead of the first array subscript with ndims() > 1.
     * 
     * If name part has no subscripts, a set of subscripts with all colons and ndims subscripts 
     * is first added to the new part.
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1475
     */
    @ASTNodeAnnotation.Attribute
    public FQNamePart splitArrayAccess(int index, int ndims) {
        ASTNode$State state = state();
        try {
                FArraySubscripts fas = FArraySubscripts.createFColonSubscripts(ndims);
                fas.specifyNext(index);
                return new FQNamePartArray(getName(), fas);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "QualifiedNamePart";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4121
     */
    @ASTNodeAnnotation.Attribute
    public CommonNamePart nextNamePart() {
        ASTNode$State state = state();
        CommonNamePart nextNamePart_value = getParent().Define_nextNamePart(this, null);

        return nextNamePart_value;
    }
    /**
     * Return the prefix name of the name this part belongs to, up to and including this part.
     * 
     * Creates a copy only if needed.
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:871
     */
    @ASTNodeAnnotation.Attribute
    public FQName partialName() {
        ASTNode$State state = state();
        FQName partialName_value = getParent().Define_partialName(this, null);

        return partialName_value;
    }
    /**
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:215
     */
    @ASTNodeAnnotation.Attribute
    public List<FQNamePart> accessContextFlat() {
        ASTNode$State state = state();
        List<FQNamePart> accessContextFlat_value = getParent().Define_accessContextFlat(this, null);

        return accessContextFlat_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:169
     * @apilevel internal
     */
    public FIdUseExp Define_buildAccessContextSizeExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new FIdUseExp(new FIdUse(new FQNameFull(buildAccessContext(name(), null))));
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:827
     * @apilevel internal
     */
    public boolean Define_isInstComponentSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
