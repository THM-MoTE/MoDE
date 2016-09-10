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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:160
 * @production InstComponentAccess : {@link InstScalarAccess};

 */
public class InstComponentAccess extends InstScalarAccess implements Cloneable {
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3433
     */
    public void prepareForFunctionEval() {
        super.prepareForFunctionEval();
        myInstLookup_reset();
    }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3886
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        return super.collectEvaluationValues(myInstComponentDecl().collectMyEvaluationValue(map));
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1127
     */
    public void collectErrors(ErrorCheckType checkType) {
	    super.collectErrors(checkType);
	    if (!myInstComponentDecl().isUnknown() && !isModificationName())
	    	myInstComponentDecl().collectErrors(checkType);
	}
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:64
     */
    public void nameCheck(ErrorCheckType checkType) {
        nameCheckComponentAccess(checkType);
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:588
     */
    protected void typeError(InstAccess top) {
	  InstComponentDecl icd = myInstComponentDecl();
	  if (!icd.isUnknown() && !icd.myInstClass().isUnknown() && !inCardinality()) {
		  if (icd.isOrExtendsPrimitive() || icd.isRecord())
			  top.error("Could not calculate type of " + top.name());
		  else
			  top.error("Accesses to composite components other than records are not allowed: " + top.name());
	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:852
     */
    public void typeCheck(ErrorCheckType checkType) {
	//  log.debug("InstComponentAccess.typeCheck: " + printSlice());
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1242
     */
    public void checkAccessCompInClassLeft(InstAccess right, ErrorCheckType checkType) {
	  if (myInstComponentDecl().isPrimitive()) {
		  InstAccess top = getTopInstAccess();
		  top.error("Can not access attribute of primitive with dot notation: " + top.name());
	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1258
     */
    public void checkAccessCompInClassRight(InstClassDecl icd, ErrorCheckType checkType) {
	  String type = null;
	  if (icd.extendsEnum()) {
		  if (!myInstComponentDecl().isEnumLiteral())
			  type = "attribute of primitive with dot notation";
	  } else if (icd.isPackage()) {
		  icd.checkRestriction(checkType);
	  } else if (!icd.isOkPackage()) {
		  type = "component in non-package class";
	  }
	  if (type != null) {
		  InstAccess top = getTopInstAccess();
		  top.error("Can not access " + type + ": " + top.name());
	  }
  }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2066
     */
    public void extractNonParameterIndices(List<FSubscript> sub, FTypePrefixVariability v) {
        if (isArray()) {
            for (int i = 0, n = ndims(); i < n; i++) {
                sub.add(size().rangeFSubscript(i));
            }
        }
    }
    /**
     * @aspect InstDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:157
     */
    public void dumpTree(String indent) {
    	String s = indent + dump() +": "+getID() + " at line: " + beginLine()+ ", ComponentDecl at: ";
/*    	if (myComponentDecl().isUnknown())
    		s+="Unknown";
    	else
    		s+=	myComponentDecl().beginLine();
    	*/	
    	System.out.println(s);
    	for(int i = 0; i < getNumChild(); i++)
      		getChild(i).dumpTree(indent + "  ");
    	
   }
    /**
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1029
     */
    public InstAccess createPartToAppend(String id) {
    	return new InstComponentAccess(id);
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstComponentAccess() {
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
        children = new ASTNode[1];
    }
    /**
     * @declaredat ASTNode:13
     */
    public InstComponentAccess(String p0) {
        setID(p0);
    }
    /**
     * @declaredat ASTNode:16
     */
    public InstComponentAccess(Symbol p0) {
        setID(p0);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:22
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:28
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:34
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        myInstLookup_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:41
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:47
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:53
     */
    public InstComponentAccess clone() throws CloneNotSupportedException {
        InstComponentAccess node = (InstComponentAccess) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public InstComponentAccess copy() {
        try {
            InstComponentAccess node = (InstComponentAccess) clone();
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
     * @declaredat ASTNode:79
     */
    public InstComponentAccess fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:88
     */
    public InstComponentAccess treeCopyNoTransform() {
        InstComponentAccess tree = (InstComponentAccess) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 0:
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
     * @declaredat ASTNode:113
     */
    public InstComponentAccess treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:120
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenString_ID == ((InstComponentAccess)node).tokenString_ID);    
    }
    /**
     * Replaces the lexeme ID.
     * @param value The new value for the lexeme ID.
     * @apilevel high-level
     */
    public void setID(String value) {
        tokenString_ID = value;
    }
    /**
     * JastAdd-internal setter for lexeme ID using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme ID
     * @apilevel internal
     */
    public void setID(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setID is only valid for String lexemes");
        tokenString_ID = (String)symbol.value;
        IDstart = symbol.getStart();
        IDend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme ID.
     * @return The value for the lexeme ID.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="ID")
    public String getID() {
        return tokenString_ID != null ? tokenString_ID : "";
    }
    /**
     * Retrieves the ExpandedSubscripts child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ExpandedSubscripts child.
     * @apilevel low-level
     */
    public FArraySubscripts getExpandedSubscriptsNoTransform() {
        return (FArraySubscripts) getChildNoTransform(0);
    }
    /**
     * Retrieves the child position of the optional child ExpandedSubscripts.
     * @return The the child position of the optional child ExpandedSubscripts.
     * @apilevel low-level
     */
    protected int getExpandedSubscriptsChildPosition() {
        return 0;
    }
    @ASTNodeAnnotation.Attribute
    public InstArrayAccess getArrayCopy(FArraySubscripts fas) {
        ASTNode$State state = state();
        InstArrayAccess getArrayCopy_FArraySubscripts_value = new InstComponentArrayAccess(getID(), fas);

        return getArrayCopy_FArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConditional() {
        ASTNode$State state = state();
        boolean isConditional_value = myInstLookup().unresolved().target().hasConditionalAttribute();

        return isConditional_value;
    }
    /**
     * @attribute syn
     * @aspect ExpandableConnectors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:2845
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findReferencedExpandableConnector() {
        ASTNode$State state = state();
        try {
                InstComponentDecl icd = myInstComponentDecl();
                return icd.isExpandableConnector() ? icd : null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> qualifiedLookupInstClassUnconstrained(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> qualifiedLookupInstClassUnconstrained_String_value = lookupArrayElement(myInstComponentDecl()).memberInstClass(name);

        return qualifiedLookupInstClassUnconstrained_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> qualifiedLookupInstComponentUnconstrained(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> qualifiedLookupInstComponentUnconstrained_String_value = lookupArrayElement(myInstLookup()).memberInstComponent(name);

        return qualifiedLookupInstComponentUnconstrained_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode lookupConstrainingInstNode() {
        ASTNode$State state = state();
        InstNode lookupConstrainingInstNode_value = lookupArrayElement(inQualified() ? lookupConstrainingInstComponent(name()) : lookupConstrainingInstComponentHelper(null, name()));

        return lookupConstrainingInstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode closestConstrainingDecl() {
        ASTNode$State state = state();
        InstNode closestConstrainingDecl_value = myInstComponentDecl().isConstrained() ? myInstComponentDecl().myConstrainingDecl() : findClosestConstrainingInstNode();

        return closestConstrainingDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myInstComponentDecl_value = myInstLookup().target(INST_UNKNOWN_COMPONENT, this);

        return myInstComponentDecl_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInstLookup_computed = false;
    /**
     * @apilevel internal
     */
    protected InstLookupResult<InstComponentDecl> myInstLookup_value;
    /**
     * @apilevel internal
     */
    private void myInstLookup_reset() {
        myInstLookup_computed = false;
        myInstLookup_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> myInstLookup() {
        if(myInstLookup_computed) {
            return myInstLookup_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInstLookup_value = myInstLookupComponent();
        if (isFinal && num == state().boundariesCrossed) {
            myInstLookup_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInstLookup_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = myInstComponentDecl().isUnknown();

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentAccess() {
        ASTNode$State state = state();
        boolean isComponentAccess_value = true;

        return isComponentAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDisabled() {
        ASTNode$State state = state();
        boolean isDisabled_value = myInstComponentDecl().isDisabled();

        return isDisabled_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
