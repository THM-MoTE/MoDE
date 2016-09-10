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
 * Expression subscript.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:537
 * @production FExpSubscript : {@link FSubscript} ::= <span class="component">{@link FExp}</span> <span class="component">AccessContextSizeExp:{@link FExp}</span>;

 */
public class FExpSubscript extends FSubscript implements Cloneable {
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:611
     */
    public void addDeclarationSize(MutableSize s) {
		FExp e = getFExp();
		if (e.ndims() == 0)
			s.append(e);
		else
			s.append(e.size(), 0);
	}
    /**
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2046
     */
    public FSubscript createSpecified(Index i, int[] dim) {
		if (ndims() == 0)
			return fullCopy();
		
		int index = i.get(dim[0]++) - 1;
		return new FExpSubscript(getFExp().getArray().getFExp(index));
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:262
     */
    public FSubscript createEvaluated() {
        try {
            CValue val = getFExp().ceval();
            if (val.isArray())
                val = val.array().getCell(0);
            return val.createFSubscript();
        } catch (ConstantEvaluationException e) {
            return fullCopy();
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1279
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		p.print(getFExp(),str,indent);
	}
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:557
     */
    public FSubscript copyReplaceAccess(FExp.ContextReplacer crp) {
        return new FExpSubscript(getFExp().copyReplaceAccess(crp));
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:742
     */
    public void forceVariability(ErrorCheckType checkType,  FTypePrefixVariability v) {
        getFExp().forceVariability(checkType, v);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:738
     */
    public void typeCheckAsSize(ErrorCheckType checkType) {
	  if (ndims() > 0) { 
		  error("Array size must be scalar expression: " + getFExp());
      } else if (!type().isUnknown() && !getFExp().canBeComponentSize()) {
          error("Array size must be Integer expression, Boolean type or enumeration type: " + getFExp());
	  } else if (!inFunction()) { 
		  if (!getFExp().variability().parameterOrLess()) {
			  error("Array size must be constant or parameter: " + getFExp());
		  } else if (!checkType.allowIncompleteSizes()) {
			  try {
				  getFExp().ceval().intValue();
			  } catch (ConstantEvaluationException e) {
				  error("Could not evaluate array size expression: " + getFExp());
			  }
		  }
	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:756
     */
    public void typeCheckAsIndex(ErrorCheckType checkType) {
        if (ndims() > 1) { 
            error("Array index must be scalar or vector expression: " + getFExp());
        } else if (!type().isUnknown() && !type().canBeIndex()) {
            error("Array index must be Integer, Boolean, or enumeration expression: " + getFExp());
        } else if (!type().isUnknown() && !myIndexType().isUnknown() && !type().scalarType().typeCompatible(myIndexType())) {
            error("Expected array index of type '%s' found '%s'", myIndexType().name(), type().scalarType().name());
        } else if (!inFunction()) { 
              if (!getFExp().variability().fixedParameterOrLess()) {
                warning("Variable array index in equation can result in slow simulation time");
            } else if (!reportedOutOfBound && !inUnknownAccess()) {
                // Check array bounds
                // TODO: Perform bounds check in functions if index has parameter variability or lower?
                try {
                    int max = mySize().get(0);
                    for (FExp e : getFExp().getArray().iterable()) {
                        int i = e.ceval().intValue();
                        if (i < 1 || i > max) {
                            if (!lockBranch(checkType))
                                errorUnlessDisabled("Array index out of bounds: " + i + ", index expression: " + getFExp());
                            reportedOutOfBound = true;
                            return;
                        }
                    }
                } catch (ConstantEvaluationException e) {
                }
            }
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:800
     */
    private boolean reportedOutOfBound = false;
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:803
     */
    public void typeCheck(ErrorCheckType checkType) {
	  if (isInstComponentSize()) 
		  typeCheckAsSize(checkType);
	  else 
		  typeCheckAsIndex(checkType);
  }
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2722
     */
    private static final BinaryOperation<CValue> INT_MAX_OP = new BinaryOperation<CValue>() {
        public CValue op(CValue a, CValue b) { 
            return (a.intValue() >= b.intValue()) ? a : b;
        }
    };
    /**
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2730
     */
    public boolean calculateExpandableConnectorSize(MutableSize s, int i, int len) {
        CValue val = ceval();
        if (ndims() > 0) 
            val = val.reduce(INT_MAX_OP, new CValueInteger(1));
        s.set(i, val.intValue());
        return ndims() == 0 || size().get(0) == len;
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1879
     */
    public FSubscript flatten(FQName name) {
        return new FExpSubscript(getFExp().flatten(name));
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2311
     */
    public FSubscript flattenAndResolveIndices(FQName prefix) {
        return getFExp().ceval().createFSubscript();
    }
    /**
     * @aspect DeferredSubscripts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2544
     */
    public FSubscript deferredCopy() {
        return copyLocationTo(new FDeferExpSubscript(getFExp().fullCopy(), this));
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2040
     */
    public void removeFromUses() {
		getFExp().removeFromUses();
	}
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:625
     */
    public void preventEvents() {
        getFExp().preventEvents();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:922
     */
    public void inlineFunctions(AbstractFunctionInliner fi) {
        getFExp().inlineFunctions(fi);
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1613
     */
    public FSubscript copyWithNonLiteralSubscriptsAsColon() {
        return new FColonSubscript();
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1658
     */
    public void copyNonLiteralSubscriptsTo(FArraySubscripts fas) {
        fas.addFSubscriptNoTransform(treeCopyNoTransform());
    }
    /**
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1692
     */
    public void replaceReferencesInSubscripts(AbstractFunctionInliner fi) {
        getFExp().replaceReferences(fi);
        if (isConstant()) {
            try {
                replaceMe(getFExp().ceval().createFSubscript());
            } catch (ConstantEvaluationException e) {}
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1538
     */
    public FSubscript scalarize(Map<String,FExp> indexMap) {
		return new FExpSubscript(getFExp().scalarize(indexMap));
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:514
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent){
		String namespace = "exp";
		String tag = this.xmlTag();
		
		str.println(indent + "<" + namespace + ":" + tag +  ">");
		this.getFExp().prettyPrint_XML(str,p.indent(indent));
		str.println(indent + "</" + namespace + ":" + tag +  ">");
			
	}
    /**
     * @aspect CADCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CADCodeGen.jrag:253
     */
    @Override
	public void prettyPrint_CAD(CodePrinter p, CodeStream str, String indent) {
		getFExp().prettyPrint_C(p,str,indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FExpSubscript() {
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
        children = new ASTNode[2];
    }
    /**
     * @declaredat ASTNode:13
     */
    public FExpSubscript(FExp p0) {
        setChild(p0, 0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:19
     */
    protected int numChildren() {
        return 1;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:25
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getAccessContextSizeExp_reset();
        type_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:39
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        FExpSubscript_collectForIndices_computed = false;
        FExpSubscript_collectForIndices_value = null;
        FExpSubscript_collectForIndices_contributors = null;
        collect_contributors_FExpSubscript_collectForIndices = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:49
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public FExpSubscript clone() throws CloneNotSupportedException {
        FExpSubscript node = (FExpSubscript) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:62
     */
    public FExpSubscript copy() {
        try {
            FExpSubscript node = (FExpSubscript) clone();
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
     * @declaredat ASTNode:81
     */
    public FExpSubscript fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:90
     */
    public FExpSubscript treeCopyNoTransform() {
        FExpSubscript tree = (FExpSubscript) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 1:
                    tree.children[i] = null;
                    continue;
                }
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
     * @declaredat ASTNode:115
     */
    public FExpSubscript treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the FExp child.
     * @param node The new node to replace the FExp child.
     * @apilevel high-level
     */
    public void setFExp(FExp node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FExp child.
     * @return The current node used as the FExp child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FExp")
    public FExp getFExp() {
        return (FExp) getChild(0);
    }
    /**
     * Retrieves the FExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FExp child.
     * @apilevel low-level
     */
    public FExp getFExpNoTransform() {
        return (FExp) getChildNoTransform(0);
    }
    /**
     * Retrieves the AccessContextSizeExp child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the AccessContextSizeExp child.
     * @apilevel low-level
     */
    public FExp getAccessContextSizeExpNoTransform() {
        return (FExp) getChildNoTransform(1);
    }
    /**
     * Retrieves the child position of the optional child AccessContextSizeExp.
     * @return The the child position of the optional child AccessContextSizeExp.
     * @apilevel low-level
     */
    protected int getAccessContextSizeExpChildPosition() {
        return 1;
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1214
     */
        private boolean collect_contributors_FExpSubscript_collectForIndices = false;
    protected void collect_contributors_FExpSubscript_collectForIndices() {
        if(collect_contributors_FExpSubscript_collectForIndices) return;
        super.collect_contributors_FExpSubscript_collectForIndices();
        collect_contributors_FExpSubscript_collectForIndices = true;
    }

    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = getFExp().ndims();

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = getFExp().indices();

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public int[] myIndices() {
        ASTNode$State state = state();
        int[] myIndices_value = getFExp().myIndices();

        return myIndices_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript resolveSubscripts(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        FSubscript resolveSubscripts_VariableEvaluator_value = new FExpSubscript(ceval(evaluator).buildLiteral());

        return resolveSubscripts_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = getFExp().ceval(evaluator);

        return ceval_VariableEvaluator_value;
    }
    /**
     * Returns the set of array indices spanned by a component declared with this subscript.
     * @attribute syn
     * @aspect ArrayConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4628
     */
    @ASTNodeAnnotation.Attribute
    public int[] arrayIndices(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        try {
        		int s = numIndices(evaluator);
        		if (s < 0)
        			s = 0;
        		int ind[] = new int[s];
        		for (int i = 0; i < s; i++) 
        			ind[i] = i + 1;
        		return ind;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int numIndices(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        int numIndices_VariableEvaluator_value = getFExp().ceval(evaluator).intValue();

        return numIndices_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = getFExp().isCircular();

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpSubscript() {
        ASTNode$State state = state();
        boolean isExpSubscript_value = true;

        return isExpSubscript_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExpSubscript asExpSubscript() {
        ASTNode$State state = state();
        FExpSubscript asExpSubscript_value = this;

        return asExpSubscript_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasNonLiteralSubscripts() {
        ASTNode$State state = state();
        boolean hasNonLiteralSubscripts_value = true;

        return hasNonLiteralSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = getFExp().size();

        return size_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getAccessContextSizeExp_computed = false;
    /**
     * @apilevel internal
     */
    protected FExp getAccessContextSizeExp_value;
    /**
     * @apilevel internal
     */
    private void getAccessContextSizeExp_reset() {
        getAccessContextSizeExp_computed = false;
        getAccessContextSizeExp_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FExp getAccessContextSizeExp() {
        if(getAccessContextSizeExp_computed) {
            return (FExp) getChild(getAccessContextSizeExpChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getAccessContextSizeExp_value = mySize().buildAccessContextSizeExp(this);
        setChild(getAccessContextSizeExp_value, getAccessContextSizeExpChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getAccessContextSizeExp_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FExp node = (FExp) this.getChild(getAccessContextSizeExpChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript buildAccessContext() {
        ASTNode$State state = state();
        FSubscript buildAccessContext_value = getFExp().isArray() ? 
                    new FExpSubscript(getFExp().createFirstIndexExp()) : super.buildAccessContext();

        return buildAccessContext_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean type_computed = false;
    /**
     * @apilevel internal
     */
    protected FType type_value;
    /**
     * @apilevel internal
     */
    private void type_reset() {
        type_computed = false;
        type_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FType type() {
        if(type_computed) {
            return type_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        type_value = getFExp().type();
        if (isFinal && num == state().boundariesCrossed) {
            type_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return type_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = getFExp().isConstantExp();

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = getFExp().variability();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public FType myIndexType() {
        ASTNode$State state = state();
        FType myIndexType_value = myIndexType(myDim());

        return myIndexType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FSubscript specify(int index) {
        ASTNode$State state = state();
        FSubscript specify_int_value = new FExpSubscript(getFExp().getArray().getFExp(index - 1).fullCopy());

        return specify_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownIndex() {
        ASTNode$State state = state();
        boolean isUnknownIndex_value = !getFExp().canCeval();

        return isUnknownIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        boolean isSlice_value = getFExp().isSliceFAS(mySize());

        return isSlice_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = getFExp().generatesEvents();

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInlinableFunctions(AbstractFunctionInliner fi) {
        ASTNode$State state = state();
        boolean hasInlinableFunctions_AbstractFunctionInliner_value = getFExp().hasInlinableFunctions(fi);

        return hasInlinableFunctions_AbstractFunctionInliner_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "IndexExpression";

        return xmlTag_value;
    }
    /**
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1236
     */
    @ASTNodeAnnotation.Attribute
    public FExpSubscript surroundingFExpSubscript() {
        ASTNode$State state = state();
        FExpSubscript surroundingFExpSubscript_value = getParent().Define_surroundingFExpSubscript(this, null);

        return surroundingFExpSubscript_value;
    }
    /**
     * @attribute inh
     * @aspect ErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:419
     */
    @ASTNodeAnnotation.Attribute
    public boolean lockBranch(ErrorCheckType checkType) {
        ASTNode$State state = state();
        boolean lockBranch_ErrorCheckType_value = getParent().Define_lockBranch(this, null, checkType);

        return lockBranch_ErrorCheckType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:787
     */
    @ASTNodeAnnotation.Attribute
    public FType myIndexType(int i) {
        ASTNode$State state = state();
        FType myIndexType_int_value = getParent().Define_myIndexType(this, null, i);

        return myIndexType_int_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:829
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInstComponentSize() {
        ASTNode$State state = state();
        boolean isInstComponentSize_value = getParent().Define_isInstComponentSize(this, null);

        return isInstComponentSize_value;
    }
    /**
     * @attribute inh
     * @aspect DeferredSubscripts
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2548
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);

        return lookupInstComponent_String_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1235
     * @apilevel internal
     */
    public FExpSubscript Define_surroundingFExpSubscript(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:51
     * @apilevel internal
     */
    public Size Define_mySize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return accessContextSize();
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    /**
     * Collect all ForIndexs used in the expression of this FExpSubscript.
     * @attribute coll
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1214
     */
    @ASTNodeAnnotation.Attribute
    public HashSet<CommonForIndex> collectForIndices() {
        if(FExpSubscript_collectForIndices_computed) {
            return FExpSubscript_collectForIndices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FExpSubscript_collectForIndices_value = collectForIndices_compute();
        if (isFinal && num == state().boundariesCrossed) {
            FExpSubscript_collectForIndices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return FExpSubscript_collectForIndices_value;
    }
    Collection FExpSubscript_collectForIndices_contributors;

    /**
     * @apilevel internal
     * @return the contributor set for collectForIndices
     */
    public Collection FExpSubscript_collectForIndices_contributors() {
        if(FExpSubscript_collectForIndices_contributors == null)
            FExpSubscript_collectForIndices_contributors  = new LinkedList();
        return FExpSubscript_collectForIndices_contributors;
    }

    /**
     * @apilevel internal
     */
    private HashSet<CommonForIndex> collectForIndices_compute() {
        ASTNode node = this;
        while(node.getParent() != null && !(node instanceof FExpSubscript)) {
            node = node.getParent();
        }
        FExpSubscript root = (FExpSubscript) node;
        root.collect_contributors_FExpSubscript_collectForIndices();
        FExpSubscript_collectForIndices_value = new HashSet<CommonForIndex>();
        if(FExpSubscript_collectForIndices_contributors != null)
        for (Iterator iter = FExpSubscript_collectForIndices_contributors.iterator(); iter.hasNext(); ) {
            ASTNode contributor = (ASTNode) iter.next();
            contributor.contributeTo_FExpSubscript_FExpSubscript_collectForIndices(FExpSubscript_collectForIndices_value);
        }
        // TODO: disabled temporarily since collections may not be cached
        //FExpSubscript_collectForIndices_contributors = null;
        return FExpSubscript_collectForIndices_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean FExpSubscript_collectForIndices_computed = false;
    /**
     * @apilevel internal
     */
    protected HashSet<CommonForIndex> FExpSubscript_collectForIndices_value;
    /**
     * @apilevel internal
     */
    private void FExpSubscript_collectForIndices_reset() {
        FExpSubscript_collectForIndices_computed = false;
        FExpSubscript_collectForIndices_value = null;
    }
}
