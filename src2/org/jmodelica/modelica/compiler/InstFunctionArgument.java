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
 * Base class for function call arguments in the instance tree.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:1314
 * @production InstFunctionArgument : {@link BaseNode};

 */
public abstract class InstFunctionArgument extends BaseNode implements Cloneable {
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:331
     */
    public void sizeOfOutput(Map<InstComponentDecl, InstFunctionArgument> varMap, InstComponentDecl icd) {
        getFExp().size();      // Cash sizes to prevent false circularity in nested function calls
        varMap.put(icd, this);
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:378
     */
    public FExp createSizeFExp(FExp.FunctionSizeContextReplacer crp) {
        // TODO: Should use a copy, since this is a create method, but that gives circularity when calculating size(),
        //       see InstFunctionArgument.sizeOfOutput(). We need a copy, but with the pre-calculated size. 
        return getFExp();
    }
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:521
     */
    public InstFunctionArgument copyReplaceAccess(FExp.ContextReplacer crp) {
        return fullCopy();
    }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1393
     */
    public boolean generateUnbindableError(String desc, boolean genForPos) {
		return genForPos;
	}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1153
     */
    public void typeCheck(ErrorCheckType checkType) {
        boolean typeOk = true;
        FType type = getFExp().type();
        if (!type.isUnknown()) {
            if (argumentDefinedTypeValid()) {
                FType boundType = getBoundInput().type();
                if (!boundType.isUnknown()) {
                    if (isVectorized()) 
                        boundType = boundType.sizedType(boundType.size().expand(vectorizedSize()));
                    else if (isDestructorArgument())
                        boundType = boundType.sizedType(type.size());
                    typeOk = boundType.typeCompatible(type, true);
                }
            } else {
                typeOk = argumentTypeValid(type);
            }
        }
        if (!typeOk) {
            if (getBoundInput() == null) {
                error(nonBoundArgumentTypeError());
            } else {
                String msg = argumentTypeError();
                if (msg != null)
                    error(msg);
                else
                    error("%s: types of %s and input %s are not compatible\n" + 
                          "    type of '%s' is %s\n" + 
                          "    expected type is %s", 
                          functionCallDecription(), argumentDesc(), getBoundInput().name(), 
                          getFExp(), getFExp().type(),
                          argumentDefinedTypeValid() ? getBoundInput().type().toString() : expectedArgumentType());
            }
        }
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2765
     */
    public FExp flatten(FQName prefix) {
        return getFExp().flatten(prefix);
    }
    /**
     * Return an InstMultipleBoundArgument containing both <code>this</code> and <code>arg</code>.
     * 
     * If <code>this</code> is an InstMultipleBoundArgument, <code>arg</code> is simply added to it.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:32
     */
    protected InstMultipleBoundArgument addMultipleBoundArgument(InstFunctionArgument arg) {
		return new InstMultipleBoundArgument(new List().add(this).add(arg));
	}
    /**
     * The input component this argument is bound to.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:65
     */
    protected InstComponentDecl boundInput = null;
    /**
     * Set the input component this argument is bound to.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:70
     */
    public void setBoundInput(InstComponentDecl input) {
		boundInput = input;
	}
    /**
     * Argument nodes representing arguments that are missing or given multiple times do 
     * not get a location set when they are created. Set the location for those nodes, do nothing 
     * for other nodes.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:135
     */
    public void setErrorArgLocation(ASTNode node) {}
    /**
     * Check if this argument can be a vectorized argument, given the 
     * results to calls to this function for previous arguments.
     * 
     * The argument <code>dims</code> is the result from calls on other 
     * parameters. If -1, then the return value should be -1. If 0, then 
     * no vectorized arguments have been found so far. If greater than 0, 
     * then it is the number of dimensions of the vectorization size.
     * 
     * If this argument matches the size of the input, <code>dims</code> 
     * is returned. If the number of dimensions in the vectorization size 
     * that would be required for this to be a correctly vectorized argument 
     * differs from <code>dims</code>, then function is definately not a 
     * correctly vectorized function, and -1 is returned. Otherwise the 
     * vectorization size is returned.
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:871
     */
    public int findVectorizationNdims(int dims) {
		return dims;
	}
    /**
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:879
     */
    protected int combineVectorizationSize(int pre, int exp, int var) {
		int res = exp - var;
		if (pre < 0 || res == 0)
			return pre;
		if (res < 0 || (pre > 0 && pre != res))
			return -1;
		return res;
	}
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:628
     */
    public InstRecordModification createInstRecordModification(Modification mod, String name) {
        return new InstValueRecordModification(mod, name, getFExp());
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1027
     */
    public void populateInstModifications(List<InstModification> res) {}
    /**
     * Returns the FExp associated with this argument, if any.
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1569
     */
    public FExp getFExp() { return null; }
    /**
     * Returns the FExp associated with this argument, if any, without triggering rewrites.
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1574
     */
    public FExp getFExpNoTransform() { return null; }
    /**
     * @declaredat ASTNode:1
     */
    public InstFunctionArgument() {
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
        isVectorized_reset();
        getModification_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:41
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:47
     */
    public InstFunctionArgument clone() throws CloneNotSupportedException {
        InstFunctionArgument node = (InstFunctionArgument) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:58
     */
    public abstract InstFunctionArgument fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:65
     */
    public abstract InstFunctionArgument treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:73
     */
    public abstract InstFunctionArgument treeCopy();
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = -1;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        ASTNode$State state = state();
        boolean isCircular_value = false;

        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = null;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public String argumentDesc() {
        ASTNode$State state = state();
        String argumentDesc_value = null;

        return argumentDesc_value;
    }
    @ASTNodeAnnotation.Attribute
    public int findArgumentPosition(ArrayList<InstComponentDecl> inputs) {
        ASTNode$State state = state();
        int findArgumentPosition_ArrayList_InstComponentDecl__value = -1;

        return findArgumentPosition_ArrayList_InstComponentDecl__value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isGiven() {
        ASTNode$State state = state();
        boolean isGiven_value = false;

        return isGiven_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl getBoundInput() {
        ASTNode$State state = state();
        InstComponentDecl getBoundInput_value = isInstRecordConstructorArg() ? myRecordConstructorVirtualInstComponentDecl() : boundInput;

        return getBoundInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myRecordConstructorVirtualInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myRecordConstructorVirtualInstComponentDecl_value = lookupRecordConstructorVirtualInstComponentDecl(boundInput.name());

        return myRecordConstructorVirtualInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOKArg() {
        ASTNode$State state = state();
        boolean isOKArg_value = true;

        return isOKArg_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isVectorized_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isVectorized_value;
    /**
     * @apilevel internal
     */
    private void isVectorized_reset() {
        isVectorized_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isVectorized() {
        if(isVectorized_computed) {
            return isVectorized_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isVectorized_value = false;
        if (isFinal && num == state().boundariesCrossed) {
            isVectorized_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isVectorized_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstModification newInstModification() {
        ASTNode$State state = state();
        InstModification newInstModification_value = new InstComponentModification(getModification(), false, false,
                            boundInput.createInstAccess(),
                            new Opt<InstModification>(getModification().newInstModification()));

        return newInstModification_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getModification_computed = false;
    /**
     * @apilevel internal
     */
    protected Modification getModification_value;
    /**
     * @apilevel internal
     */
    private void getModification_reset() {
        getModification_computed = false;
        getModification_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Modification getModification() {
        if(getModification_computed) {
            return getModification_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getModification_value = getModification_compute();
        getModification_value.setParent(this);
        getModification_value.is$Final = true;
        if (true) {
            getModification_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getModification_value;
    }
    /**
     * @apilevel internal
     */
    private Modification getModification_compute() {
            DummyModification res = new DummyModification();
            copyLocationTo(res);
            return res;
        }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1493
     */
    @ASTNodeAnnotation.Attribute
    public String funcName() {
        ASTNode$State state = state();
        String funcName_value = getParent().Define_funcName(this, null);

        return funcName_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1597
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:463
     */
    @ASTNodeAnnotation.Attribute
    public Size vectorizedSize() {
        ASTNode$State state = state();
        Size vectorizedSize_value = getParent().Define_vectorizedSize(this, null);

        return vectorizedSize_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:656
     */
    @ASTNodeAnnotation.Attribute
    public boolean accessToModelOK() {
        ASTNode$State state = state();
        boolean accessToModelOK_value = getParent().Define_accessToModelOK(this, null);

        return accessToModelOK_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1147
     */
    @ASTNodeAnnotation.Attribute
    public String functionCallDecription() {
        ASTNode$State state = state();
        String functionCallDecription_value = getParent().Define_functionCallDecription(this, null);

        return functionCallDecription_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1197
     */
    @ASTNodeAnnotation.Attribute
    public boolean isDestructorArgument() {
        ASTNode$State state = state();
        boolean isDestructorArgument_value = getParent().Define_isDestructorArgument(this, null);

        return isDestructorArgument_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1207
     */
    @ASTNodeAnnotation.Attribute
    public String nonBoundArgumentTypeError() {
        ASTNode$State state = state();
        String nonBoundArgumentTypeError_value = getParent().Define_nonBoundArgumentTypeError(this, null);

        return nonBoundArgumentTypeError_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1214
     */
    @ASTNodeAnnotation.Attribute
    public String argumentTypeError() {
        ASTNode$State state = state();
        String argumentTypeError_value = getParent().Define_argumentTypeError(this, null);

        return argumentTypeError_value;
    }
    /**
     * Check if the type defined for this argument in the built-in function list 
     * is valid.
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1294
     */
    @ASTNodeAnnotation.Attribute
    public boolean argumentDefinedTypeValid() {
        ASTNode$State state = state();
        boolean argumentDefinedTypeValid_value = getParent().Define_argumentDefinedTypeValid(this, null);

        return argumentDefinedTypeValid_value;
    }
    /**
     * Check if the type supplied is valid for this argument.
     * 
     * Only used if argumentDefinedTypeValid() returns <code>false</code>.
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1326
     */
    @ASTNodeAnnotation.Attribute
    public boolean argumentTypeValid(FType type) {
        ASTNode$State state = state();
        boolean argumentTypeValid_FType_value = getParent().Define_argumentTypeValid(this, null, type);

        return argumentTypeValid_FType_value;
    }
    /**
     * Description of expexted type of argument.
     * 
     * Should be defined for cases where argumentDefinedTypeValid() returns and 
     * argumentTypeValid() both return false.
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1362
     */
    @ASTNodeAnnotation.Attribute
    public String expectedArgumentType() {
        ASTNode$State state = state();
        String expectedArgumentType_value = getParent().Define_expectedArgumentType(this, null);

        return expectedArgumentType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2019
     */
    @ASTNodeAnnotation.Attribute
    public boolean canInlineConstant() {
        ASTNode$State state = state();
        boolean canInlineConstant_value = getParent().Define_canInlineConstant(this, null);

        return canInlineConstant_value;
    }
    /**
     * Is this an argument to a record constructor in the instance tree?
     * @attribute inh
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:89
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInstRecordConstructorArg() {
        ASTNode$State state = state();
        boolean isInstRecordConstructorArg_value = getParent().Define_isInstRecordConstructorArg(this, null);

        return isInstRecordConstructorArg_value;
    }
    /**
     * Lookup the virtual component instance that should be connected to an argument of a given name.
     * 
     * Only valid for arguments to record constructors in the instance tree.
     * @attribute inh
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:107
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupRecordConstructorVirtualInstComponentDecl(String name) {
        ASTNode$State state = state();
        InstComponentDecl lookupRecordConstructorVirtualInstComponentDecl_String_value = getParent().Define_lookupRecordConstructorVirtualInstComponentDecl(this, null, name);

        return lookupRecordConstructorVirtualInstComponentDecl_String_value;
    }
    /**
     * Check if this is an argument to a vectorized function call.
     * @attribute inh
     * @aspect InstFunctionBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstFunctionBinding.jrag:892
     */
    @ASTNodeAnnotation.Attribute
    public boolean inVectorizedCall() {
        ASTNode$State state = state();
        boolean inVectorizedCall_value = getParent().Define_inVectorizedCall(this, null);

        return inVectorizedCall_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:656
     * @apilevel internal
     */
    public boolean Define_accessToModelOK(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return accessToModelOK();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2018
     * @apilevel internal
     */
    public boolean Define_canInlineConstant(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return canInlineConstant();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     * @apilevel internal
     */
    public boolean Define_flattenFASContext(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return !inFunction() || getFExp().isSlice();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2661
     * @apilevel internal
     */
    public FExp Define_myFExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
