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
 * @production List : {@link ASTNode};

 */
public class List<T extends ASTNode> extends ASTNode<T> implements Cloneable {
    /**
     * Evaluate a list of statements or if-else clauses in a function.
     * 
     * This must be a list of nodes implementing FunctionEvalNode, or an exception will be thrown.
     * 
     * @param values  constant values for the variables.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3947
     */
    public int evaluateList(AlgorithmEvaluator evaluator) {
	  int res = FStatement.EVAL_CONT;
	  Iterator<? extends FunctionEvalNode> it = (Iterator<? extends FunctionEvalNode>) iterator();
	  while (it.hasNext() && res == FStatement.EVAL_CONT)
		  res = it.next().evaluate(evaluator);
	  return res;
  }
    /**
     * Construct a List containing the same nodes as the given Collection.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:34
     */
    public List(Collection<T> nodes) {
		if (!nodes.isEmpty())
			setChild(null, nodes.size() - 1); // Ensure we won't need to increase size later
		int i = 0;
		for (T n : nodes)
			setChild(n, i++);
	}
    /**
     * Prints a list of any type of ASTNode, adding <code>sep</code> between nodes.
     * 
     * Typical use: <code>list.prettyPrintWithSep(p, str, indent, ", ");</code> 
     * (Prints comma-separated list.)
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:178
     */
    public void prettyPrintWithSep(Printer p, CodeStream str, String indent, String sep) {
		String prefix = "";
		for (ASTNode n : this) {
			str.print(prefix);
			p.print(n, str, indent);
			prefix = sep;
		}
	}
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:187
     */
    public String toString() {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		CodeStream str = new CodeStream(os);
		prettyPrintWithSep(prettyPrinter, str, "", ", ");
		return os.toString();
	}
    /**
     * Prints a list of any type of ASTNode, adding <code>prefix</code> before each node and 
     * <code>suffix</code> after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:213
     */
    public void prettyPrintWithFix(Printer p, CodeStream str, String indent, String prefix, String suffix) {
		for (ASTNode n : this) {
			str.print(prefix);
			p.print(n, str, indent);
			str.print(suffix);
		}
	}
    /**
     * Prints a list of any type of ASTNode, adding <code>indent</code> before each node and 
     * <code>suffix</code> plus a line break after after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:237
     */
    public void prettyPrintWithIndent(Printer p, CodeStream str, String indent, String suffix) {
		prettyPrintWithFix(p, str, indent, indent, suffix + "\n");
	}
    /**
     * Prints a list of any type of ASTNode, adding <code>indent</code> before each node and 
     * a line break after after each node.
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:253
     */
    public void prettyPrintWithIndent(Printer p, CodeStream str, String indent) {
		prettyPrintWithFix(p, str, indent, indent, "\n");
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1102
     */
    public void prettyPrintFAttributeList(CodeStream str, Printer p) {
        prettyPrintFAttributeList(str, p, "", "");
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1106
     */
    public void prettyPrintFAnnotationAttributeList(CodeStream str, Printer p) {
        prettyPrintFAnnotationAttributeList(str, p, "");
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1110
     */
    public void prettyPrintFAnnotationAttributeList(CodeStream str, Printer p, String extraEnd) {
        prettyPrintFAnnotationAttributeList(str, p, " ", extraEnd);
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1114
     */
    public void prettyPrintFAnnotationAttributeList(CodeStream str, Printer p, String extraStart, String extraEnd) {
        prettyPrintFAttributeList(str, p.annotationPrinter(), extraStart + "annotation", extraEnd);
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1118
     */
    public void prettyPrintFAttributeList(CodeStream str, Printer p, String extraStart, String extraEnd) {
        boolean firstAttr = true;
        for (ASTNode astNode : this) {
            FAttribute attr = (FAttribute)astNode;
            if (attr.shouldPrettyPrint(p)) {
                if (!firstAttr)	
                    str.print(",");
                else
                    str.print(extraStart + "(");
                firstAttr = false;
                p.print(attr, str, "");
            }
        }
        if (!firstAttr)
            str.print(")" + extraEnd);
    }
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2086
     */
    public void prettyPrintFAttributeList_MC(CodeStream str, Printer p) {
	
	    boolean attrSet = false;
	    	boolean firstAttr = true;
	    	
	    	for (int i=0;i<getNumChild();i++) {
	    		if (((FAttribute)getChild(i)).getAttributeSet() && !((FAttribute)getChild(i)).getName().name().equals("fixed")) {
					attrSet=true;
					break;
	 		   	}
	    	}
	    
	    	if (attrSet){
	    		str.print("(");
	    		for (int i=0;i<getNumChild();i++) {
	    
	    			if (((FAttribute)getChild(i)).getAttributeSet() && !((FAttribute)getChild(i)).getName().name().equals("fixed")) {
	
						if (!firstAttr)	
							str.print(",");
						p.print(((FAttribute)getChild(i)),str,"");
						
						firstAttr = false;
	 		   		}
	    		}
	    		str.print(")");
	   		}
	}
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:489
     */
    public List copyReplaceAccess(FExp.ContextReplacer crp) {
        List node = new List();
        for (ASTNode ch : this)
            node.add(ch.copyReplaceAccess(crp));
        return node;
    }
    /**
     * @aspect DumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:128
     */
    public void dumpTree(String indent) {
  	if (getNumChild()>0)
  		super.dumpTree(indent);
  }
    /**
     * @aspect DumpTreeBasic
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:224
     */
    public void dumpTreeBasic(String indent) {
  	if (getNumChild()>0)
  		super.dumpTreeBasic(indent);
  }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:2027
     */
    void copyFormattingFrom(ASTNode node) { // This code is strange...
		if (this.getClass() != node.getClass())
			return;
	}
    /**
     * Creates a new ArrayList containing all the elements in this list, in the same order.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:379
     */
    
   		
	    /**
	     * Creates a new ArrayList containing all the elements in this list, in the same order.
	     */
	    public ArrayList<T> toArrayList() {
	        ArrayList<T> l = new ArrayList<T>(getNumChild());
	        for (T e : this)
	            l.add(e);
	        return l;
	    }
    /**
     * Adds all nodes in an iterable to the list.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:389
     */
    
	    
	    /**
	     * Adds all nodes in an iterable to the list.
	     */
	    public void addAll(Iterable<? extends T> list) {
	        for (T e : list)
	            add(e);
	    }
    /**
     * Adds all nodes in an array to the list.
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:397
     */
    
	    
	    /**
	     * Adds all nodes in an array to the list.
	     */
	     public <S extends T> void addAll(S[] list) {
	         for (S e : list)
	             add(e);
	    }
    /**
     * Replace <code>from</code> with <code>to</code>.
     * 
     * Search through children after <code>from</code>. If it is found, 
     * replace it with <code>to</code> and return <code>true</code>.
     * Comparisons are done with ==, not with equals().
     * @aspect NodeMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:412
     */
    public boolean replaceChild(T oldNode, T newNode) {
    	int n = getNumChildNoTransform();
        for (int i = 0; i < n; i++) {
            if (getChildNoTransform(i) == oldNode) {
                setChild(newNode, i);
                return true;
            }
        }
        return false;
    }
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:645
     */
    public T lastChildNoTransform() {
	  return getChildNoTransform(getNumChildNoTransform() - 1);
  }
    /**
     * Check if the list contains an instance of the specified class.
     * @aspect DebugHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1925
     */
    public boolean containsInstance(Class c) {
		 for (ASTNode n : children)
			 if (c.isInstance(n))
				 return true;
		 return false;
	}
    /**
     * @declaredat ASTNode:1
     */
    public List() {
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
    public List(T... initialChildren) {
        children = new ASTNode[initialChildren.length];
        for (int i = 0; i < children.length; ++i) {
            addChild(initialChildren[i]);
        }
    }
    /**
     * @declaredat ASTNode:19
     */
    private boolean list$touched = true;
    /**
     * @declaredat ASTNode:21
     */
    public List<T> add(T node) {
        addChild(node);
        return this;
    }
    /**
     * @declaredat ASTNode:26
     */
    public List<T> addAll(Collection<? extends T> c) {
        for (T node : c) {
            addChild(node);
        }
        return this;
    }
    /**
     * @declaredat ASTNode:33
     */
    public void insertChild(ASTNode node, int i) {

        list$touched = true;

        super.insertChild(node, i);
    }
    /**
     * @declaredat ASTNode:40
     */
    public void addChild(T node) {

        list$touched = true;

        super.addChild(node);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:50
     */
    public void removeChild(int i) {

        list$touched = true;

        super.removeChild(i);
    }
    /**
     * @declaredat ASTNode:57
     */
    public int getNumChild() {

        if (list$touched) {
            for (int i = 0; i < getNumChildNoTransform(); i++) {
                getChild(i);
            }
            list$touched = false;
        }

        return getNumChildNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:71
     */
    public boolean mayHaveRewrite() {
        return true;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:77
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:83
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:89
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:95
     */
    public List<T> clone() throws CloneNotSupportedException {
        List node = (List) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:102
     */
    public List<T> copy() {
        try {
            List node = (List) clone();
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
     * @declaredat ASTNode:121
     */
    public List<T> fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:130
     */
    public List<T> treeCopyNoTransform() {
        List tree = (List) copy();
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
     * @declaredat ASTNode:150
     */
    public List<T> treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:157
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    @ASTNodeAnnotation.Attribute
    public int parentPrecedence() {
        ASTNode$State state = state();
        int parentPrecedence_value = parent != null ? retrieveParentPrecedence() : FExp.PRECEDENCE_LOWEST;

        return parentPrecedence_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = (getNumChild() > 0) ? getChild(0).annotation() : getParent().createNullAnnotationNode();

        return annotation_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2347
     */
    @ASTNodeAnnotation.Attribute
    public boolean inArray() {
        ASTNode$State state = state();
        boolean inArray_value = getParent().Define_inArray(this, null);

        return inArray_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2356
     */
    @ASTNodeAnnotation.Attribute
    public FType inferredType() {
        ASTNode$State state = state();
        FType inferredType_value = getParent().Define_inferredType(this, null);

        return inferredType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1539
     */
    @ASTNodeAnnotation.Attribute
    public int retrieveParentPrecedence() {
        ASTNode$State state = state();
        int retrieveParentPrecedence_value = getParent().Define_retrieveParentPrecedence(this, null);

        return retrieveParentPrecedence_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2346
     * @apilevel internal
     */
    public boolean Define_inArray(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inArray();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2355
     * @apilevel internal
     */
    public FType Define_inferredType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return inferredType();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1538
     * @apilevel internal
     */
    public int Define_retrieveParentPrecedence(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return parentPrecedence();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1782
     * @apilevel internal
     */
    public boolean Define_isFirst(ASTNode caller, ASTNode child) {
        int i = this.getIndexOfChild(caller);
        return i == 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1786
     * @apilevel internal
     */
    public boolean Define_isLast(ASTNode caller, ASTNode child) {
        int i = this.getIndexOfChild(caller);
        return i == getNumChild() - 1;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        if(list$touched) {
            for(int i = 0 ; i < getNumChildNoTransform(); i++) {
                getChild(i);
            }
            list$touched = false;
            return this;
        }
        return super.rewriteTo();
    }
}
