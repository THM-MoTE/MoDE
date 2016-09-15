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
 * A class representing a flattened Modelica variable.
 * 
 * FVariable contains information about the variable's visibility (public
 * or protected), variability (parameter, discrete or continuous) and causality
 * (input or output). In addition, FVariable contains a list of attributes
 * and, optionally, a binding expression. FVariables may represent both array
 * variables and scalar variables: this information is embedded in the 
 * FQName class.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:116
 * @production FVariable : {@link FAbstractVariable} ::= <span class="component">{@link FVisibilityType}</span> <span class="component">{@link FTypePrefixVariability}</span> <span class="component">[{@link FTypePrefixInputOutput}]</span> <span class="component">{@link FAttribute}*</span> <span class="component">&lt;DerivedType:String&gt;</span> <span class="component">[BindingExp:{@link FExp}]</span> <span class="component">[{@link FStringComment}]</span> <span class="component">{@link FQName}</span>;

 */
public abstract class FVariable extends FAbstractVariable implements Cloneable, FDiagnosticsNode {
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1400
     */
    public abstract FVariable createEmptyNode();
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1983
     */
    private FVariable meDifferentiated = null;
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1984
     */
    private FVariable meIntegrated = null;
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1994
     */
    public void setMeDifferentiated(FVariable var) {
        this.meDifferentiated = var;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1998
     */
    public FVariable getMeDifferentiated() {
        return this.meDifferentiated;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2010
     */
    public void setMeIntegrated(FVariable var) {
        this.meIntegrated = var;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2014
     */
    public FVariable getMeIntegrated() {
        return this.meIntegrated;
    }
    /**
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2018
     */
    public FVariable getTopIntegrated() {
        FVariable fv = this;
        while (fv.meIntegrated != null)
            fv = fv.meIntegrated;
        return fv;
    }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2484
     */
    public void setAttribute(String name, String type, FExp exp) {
        setAttribute(name, type, exp, 0);
    }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2488
     */
    public void setAttribute(String name, String type, FExp exp, int level) {
        FAttribute attr = findMatching(getFAttributes(), name);
        if (attr == null) {
            attr = new FAttribute(new FIdUse(type), new FIdDecl(name), exp, true, level);
            addFAttribute(attr);
        } else {
            attr.setValue(exp);
            attr.setLevel(level);
        }
    }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2499
     */
    public void unsetAttribute(String name) {
        List<FAttribute> newList = new List<FAttribute>();
        for (FAttribute attr : getFAttributes()) {
            if (!attr.matches(name))
                newList.add(attr);
        }
        setFAttributeList(newList);
        flushCache();
    }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2577
     */
    public void setFixedAttribute(boolean value) { setFixedAttribute(FBooleanLitExp.create(value)); }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2578
     */
    public void setFixedAttribute(FExp value)    { setAttribute(FAttribute.FIXED, "Boolean", value); }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2596
     */
    public void warnStartAttributeNotSet() {
        if (!ASTNode.printer_C.C_blockResidualAttributePrinter.attributeSet(this, "start"))
            warning("Iteration variable \"" + name() + "\" is missing start value!");
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3598
     */
    public Set<FVariable> directDependencies() {
        Set<FVariable> res = new LinkedHashSet<FVariable>();
        for (FVariable dv : dependsOn()) {
            if (dv.isInput()) {
                res.add(dv);
            }
        }
        return res;
    }
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3683
     */
    public void attributeLevels(StringBuilder str) {
        str.append("  ");
        str.append(name());
        attributeLevelsForList(getFAttributes(), str);
        str.append("\n");
    }
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1057
     */
    public FIdUse createFIdUse() {
         return getFQName().createUseFQName().createFIdUse();
    }
    /**
     * Create an access expression to this variable.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1068
     */
    public FIdUseExp createUseExp() {
         return getFQName().createUseFQName().createFIdUseExp();
    }
    /**
     * Create a pre() expression for this variable.
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1121
     */
    public FPreExp createFPreExp() {
        return new FPreExp(createFIdUse());
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1050
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);
		
		str.print(getFTypePrefixVariability());
		
		if (hasFTypePrefixInputOutput()) {
			str.print(getFTypePrefixInputOutput());
			str.print(" ");
		}
		
		str.print(prettyPrintType());
		str.print(" ");
		str.print(displayName());
	
		getFAttributeList().prettyPrintFAttributeList(str, p);
		
		if (hasBindingExp()) {
			str.print(" = ");
			FExp bindingExp = getBindingExp();
			p.print(bindingExp,str,indent);
			
		}
		
		p.print(getFStringCommentOpt(),str,indent);
		
		getFAttributeList().prettyPrintFAnnotationAttributeList(str, p);

		if (isIndependentParameter() && hasBindingExp()) {
			str.print(" /* ");
			try {
				str.print(getBindingExp().ceval());
			} catch (ConstantEvaluationException e){
                str.print("evaluation error");
			}
			str.print(" */");
		}
	}
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1088
     */
    public void printFAttributes(CodeStream str, String ... attributes) {
		boolean first = true;
		for (String attribute : attributes) {
			if (attributeSet(attribute)) {
				if (!first)
					str.print(',');
				first = false;
				str.print(attribute);
				str.print('=');
				str.print(attributeExp(attribute));
			}
		}
	}
    /**
     * @aspect PrettyPrint_MC
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:2115
     */
    public void prettyPrint_MC(Printer p, CodeStream str, String indent) {
			str.print(indent);
			
			str.print(getFTypePrefixVariability());
						
			if (hasFTypePrefixInputOutput()) {
				str.print(getFTypePrefixInputOutput());
				str.print(" ");
			}
			
			str.print(prettyPrintType());
			str.print(" ");
			str.print(nameUnderscore());
//			p.print(getFQName(),str,"");
		
	    	getFAttributeList().prettyPrintFAttributeList_MC(str,p);
	    	
	   if (hasBindingExp()) {
				str.print(" = ");
				FExp bindingExp = getBindingExp();
				p.print(bindingExp,str,indent);		
		} else if (hasParameterEquation()) {
				str.print(" = ");
				FExp bindingExp = ((FEquation)parameterEquation()).getRight();
				p.print(bindingExp,str,indent);				
		}
	    	
		p.print(getFStringCommentOpt(),str,indent);

	    if (isIndependentParameter() && hasBindingExp()) {
	    	str.print(" /* ");
	    	try {
				str.print(getBindingExp().ceval());
			} catch (ConstantEvaluationException e){
                str.print("evaluation error");
			}
	    	str.print(" */");
	    }
	}
    /**
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:335
     */
    public void makeContinuousVariableDiscrete() {
        if (getFTypePrefixVariability().continuousVariability())
            setFTypePrefixVariability(fDiscrete());
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:976
     */
    public boolean modifiableInRecord = true;
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:877
     */
    public FVariable dynamicFVariable(FVariable fv) {
        if (fv == this)
            return fv;
        if (fv.parent != null) {
            int i = fv.parent.getIndexOfChild(fv);
            if (i >= 0)
                return (FVariable) fv.parent.getChild(i);
        }
        getDynamicFVariableOpt().setChild(fv, 0);
        return (FVariable) getDynamicFVariableOpt().getChild(0);
    }
    /**
     * @aspect FlatDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:254
     */
    public void dumpTree(String indent) {
		super.dumpTree(indent);
		System.out.print(indent + indent + "** Evaluated attributes: ");
		dumpAttributes();
		System.out.println("\n");
	}
    /**
     * @aspect FlatDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:261
     */
    public void dumpAttributes() {
		
	}
    /**
     * Create an expression to serve as argument to a generated algorithm function.
     * 
     * @param init  <code>true</code> if the argument is to initialize an assigned variable
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1151
     */
    public FExp createAlgorithmArgument(boolean init) {
		if (init) {
			if (isDiscrete())
				return createFPreExp();
			if (isContinuous())
				return createStartAttributeExp();
		}
		return createUseExp();
	}
    /**
     * Create an input representing this variable in a generated algorithm function.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1164
     */
    public FFunctionVariable createFFunctionOutput() {
		return createFFunctionVariable(new FOutput());
	}
    /**
     * Create an output representing this variable in a generated algorithm function.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1171
     */
    public FFunctionVariable createFFunctionInput() {
		return createFFunctionVariable(new FInput());
	}
    /**
     * Create an function variable representing this variable in a generated algorithm function.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1178
     */
    public FFunctionVariable createFFunctionVariable(FTypePrefixInputOutput io) {
		FType type = (FType) type().fullCopy();
		return new FFunctionVariable(new Opt(io), type, new Opt(), getFQName().fullCopy());
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1256
     */
    public FAbstractDerivativeVariable createFDerivativeVariable() {
	    throw new UnsupportedOperationException("Trying to create a derivative variable from the non real variable " + name() + "! Java class type: '" + getClass().getSimpleName() + "'");
	}
    /**
     * Create a pre variable for this variable.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1329
     */
    abstract public FVariable createPreVariable();
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1589
     */
    public void classifyAliasConstant(AliasManager aliasManager, 
            Map<String, FVariable> firstOccurencesReal, 
            Map<String, FVariable> firstOccurencesNonReal) {
        if (variability().knownParameterOrLess() && hasBindingExp()) {
            Map<String, FVariable> firstOccurences = isReal() ? firstOccurencesReal : firstOccurencesNonReal;
            String s = getBindingExp().prettyPrint("");
            FVariable first = firstOccurences.get(s);
            if (first != null) {
                aliasManager.addAliasVariables(new AliasPair(first, this, false));
            } else {
                firstOccurences.put(s, this);
            }
        }
    }
    /**
     * Adds this variable to <code>aliasVars</code>, if it is an alias, or 
     * <code>nonAliasVars</code>, if it is not.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1669
     */
    public void aliasSort(ArrayList<FVariable> nonAliasVars, ArrayList<FVariable> aliasVars) {
        if (isAlias()) {
            aliasVars.add(this);
        } else if (aliasSortKeep()) { 
            nonAliasVars.add(this);
            this.propagateAttributesFromAlias();
        }
    }
    /**
     * Inline all non-defining uses of variable, and remove equation defining it.
     * 
     * NB: This assumes that the variable and any equations marked for removal will be removed.
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1930
     */
    public boolean inlineUses() {
        if (!shouldEliminateTemporary()) {
            return false;
        }
		FExp value;
		if (hasBindingExp()) {
			value = getBindingExp();
		} else {
			if (definingUses().isEmpty())
                return nonDefiningUses().isEmpty();
			FAbstractEquation eqn = definingUses().iterator().next().myFEquation();
            if (eqn instanceof FEquation) {
                value = ((FEquation) eqn).getRight();
                eqn.markForRemoval();
            } else if (eqn instanceof FFunctionCallEquation) {
                return inlineUsesFunctionCallLeft();
            } else {
                return false;
            }
		}
		
		if (nonDefiningUses().isEmpty())
			value.removeFromUses();
		value.parent = null;
		
		for (FIdUseExp use : nonDefiningUses())
			use.replaceMe(value.unboundCopy());
        return true;
	}
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1960
     */
    public boolean inlineUsesFunctionCallLeft() {
        FIdUseExp defineUse = definingUses().iterator().next();
        FExp value;
        if (nonDefiningUses().size() > 0) {
            List<FAbstractEquation> defineEqnList = defineUse.myFEquation().myFAbstractEquationList();
            FIdUseExp nonDefineUse = nonDefiningUses().iterator().next();
            value = nonDefineUse.inlineUsesFunctionCallLeft();
            if (value == null || defineEqnList == null || defineEqnList != value.myFEquation().myFAbstractEquationList()) {
                return false;
            }
            value.myFEquation().markForRemoval();
        } else {
            value = new FNoExp();
        }
        
        definingUses().remove(defineUse);
        defineUse.replaceMe(value);
        return true;
    }
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2752
     */
    
		public static class SortingIndexComparator implements Comparator<FVariable> {
			public int compare(FVariable o1, FVariable o2) {
				return o1.parameterEquation().sortingIndex - o2.parameterEquation().sortingIndex;
			}
		}
    /** 
     * Sorts a list of FVariables according to the sortingIndex of their equation.
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2769
     */
    public static void sortParameters(java.util.List<FVariable> vars) {
		Collections.sort(vars, new SortingIndexComparator());
	}
    /**
     * @aspect ParameterSorting
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:2956
     */
    public void removeBindingExp() {
		if (hasBindingExp())
			setBindingExpOpt(new Opt());
	}
    /**
     * @aspect ReinitStates
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3725
     */
    public void markAsState() {
        FAttribute newA = new FInternalAttribute(FAttribute.STATE_SELECT, new FEnumLitExp(FAttribute.STATE_SELECT_TYPE, "always"));
        FAttribute oldA = findAttributeLocal(FAttribute.STATE_SELECT);
        if (oldA != null) {
            oldA.replaceMe(newA);
            addFAttribute(oldA);
        } else {
            addFAttribute(newA);
        }
    }
    /**
     * @aspect FunctionAndRecordCleanup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3936
     */
    @Override
    public void markUsedFunctionsAndRecords(FFunctionDecl.UseType type) {
        AliasManager.AliasSet set = aliasSet();
        if (type != FFunctionDecl.UseType.ALIAS_ATTRIBUTE_USE && set != null)
            for (AliasManager.AliasVariable alias : set)
                if (alias.getFVariable() != this)
                    alias.getFVariable().markUsedFunctionsAndRecords(FFunctionDecl.UseType.ALIAS_ATTRIBUTE_USE);
        super.markUsedFunctionsAndRecords(type);
    }
    /**
     * Set each attribute of this variable to the most relevant version from the 
     * variables of the alias set.
     * 
     * What is most relevant depends on the attribute, see respective subclass of 
     * AliasManager.AttributePropagator.
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:108
     */
    public void propagateAttributesFromAlias() {
        AliasManager.AliasSet aliasSet = aliasSet();
        if (aliasSet != null) {
            AliasManager.AliasVariable myAv = aliasSet.getModelVariable();
            if (myAv.getFVariable() == this && shouldPropagateAttributesForAlias()) {
                AliasManager.AttributePropagatorMap map = new AliasManager.AttributePropagatorMap(myAv);
                for (AliasManager.AliasVariable av : aliasSet) 
                    if (av.getFVariable() != this) 
                        map.addAlias(av);
                map.propagate();
            }
        }
    }
    /**
     * Create a use exp for non-constant variables, and a literal for constant variables.
     * @aspect FunctionInlining
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:945
     */
    public FExp createInlineUseFExp() {
        try {
            return isConstant() ? ceval().buildLiteral() : createUseExp();
        } catch (ConstantEvaluationException e) {
            return createUseExp();
        }
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:518
     */
    @Override
    public void variabilityPropagation(
            FClass.VariabilityPropagator propagator,
            FTypePrefixVariability variability,
            FExp bindingExp) {
        
        FAbstractEquation equation;
        boolean wasDiscrete = isDiscrete();
        boolean isZero = variability.constantVariability() && bindingExp.isLiteralZero();
        
        // Declaration
        // TODO: after we have added "dependent parameter that is evaluated" variability, this exception should use that instead
        if (variability.evalParameterVariability())
            variability = fStructParameter();
        setFTypePrefixVariability(variability);
        if (variability.knownParameterOrLess()) {
            setBindingExp(bindingExp.fullCopy());
        }
        if (variability.fixedParameterVariability()) {
            if (fixedAttributeSet()) {
                setFixedAttribute(true);
            }
        }
        
        // Uses
        for (FIdUseExp use : uses()) {
            if (use.inFEquation()) {
                equation = use.myFEquation();
                equation.variables().remove(this);
                
                if (isZero) {
                    // Adjust variable set for special case y = 0 * z
                    FExp topFactorExp = use.myTopFactorFExp();
                    if (topFactorExp != null) {
                        Set<FIdUseExp> usesInEq = equation.findFIdUseExpsInTree();
                        Set<FIdUseExp> usesInTop = topFactorExp.findFIdUseExpsInTree();
                        usesInEq.removeAll(usesInTop);
                        Set<FVariable> fvsInEq = lookupFVariablesInSet(usesInEq);
                        Set<FVariable> fvsInTop = lookupFVariablesInSet(usesInTop);
                        
                        for (FVariable tFV : fvsInTop) {
                            if (!fvsInEq.contains(tFV)) {
                                equation.variables().remove(tFV);
                            }
                        }
                        
                        topFactorExp.taggedByVProp = true;
                    }
                }
                
                propagator.addWorkEq(equation);
                if (equation.inInitialEquationSection() && equation.variables().size() == 0
                        && equation.initialParameters().size() == 0) {
                    equation.taggedByVProp = true; // Initial equation
                }
            }
        }
        
        // Pre var
        if (wasDiscrete) {
            FAbstractVariable pre = myPreVariable();
            pre.taggedByVProp = true;
            pre.variabilityPropagation(propagator, variability, bindingExp);
        }
        
        // Derivative
        if (isDifferentiatedVariable()) {
            FDerivativeVariable fDerivativeVariable = myDerivativeVariable();
            fDerivativeVariable.taggedByVProp = true;
            fDerivativeVariable.variabilityPropagation(propagator, FTypePrefixVariability.fConstant(), new FIntegerLitExp(0));
        }
        
        // Alias variables
        if (aliasSet() != null) {
            boolean unAlias = (variability.knownParameterOrLess() && propagator.splitAliasConstants()) ||
                    (variability.parameterVariability() && propagator.splitAliasParameters());
            AliasManager.AliasVariable thisAlias = aliasSet().getModelVariable();
            for (AliasManager.AliasVariable av : aliasSet()) {
                FVariable fv = av.getFVariable();
                boolean neg = av.isNegated() ^ thisAlias.isNegated();
                if (fv != this) {
                    fv.setFTypePrefixVariability(variability);
                    if (variability.knownParameterOrLess()) {
                        fv.setBindingExp(bindingExp.negated(neg));
                    } else if (unAlias && variability.parameterVariability() && !fv.isTemporary()) {
                        propagator.addEquation(variability, new FEquation(fv.createUseExp(), createUseExp().negated(neg)));
                    }
                }
            }
            if (unAlias) {
                myFClass().getAliasManager().unAlias(this);
            }
        }
    }
    /**
     * Scalarize the FVariable and put all scalarized variables in the
     * list vars.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:363
     */
    public void scalarize(Scalarizer.Variable s) {
        try {
            if (size().isZero())
                return;
            
            createArrayTemporaries(s);
            
            if (isRecord()) {
                scalarRecordFVariables(s, new ScalarizingVariableInstance(this));
            } else {
                Scalarizer.Equation se = s.select(variability());
                for (Index i : indices()) {
                    createScalarFVariable(se, i);
                }
            }
        } catch (ModelicaException e) {
            throw e;
        } catch (Exception e) {
            throw new InternalCompilerError("Exception caught while scalarizing component'" + name() + "'", e);
        }
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:385
     */
    public void createArrayTemporaries(Scalarizer.Variable s) {
        if (hasBindingExp()) {
            getBindingExp().createArrayTemporaries(s.select(variability()));
        }
        for (FAttribute fab : getFAttributes()) {
            fab.createArrayTemporaries(s, variability(), type());
        }
    }
    /**
     * Create a scalar FVariable for a single cell or an already scalar FVariable.
     * 
     * @param i  the Index of the cell to create an FVariable for. Should be Index.NULL for 
     * already scalar FVariables.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:415
     */
    protected FVariable createScalarFVariable(Scalarizer.Equation s, Index i) {
		// Create new variable and copy fields that should be same
		FVariable fv = createEmptyNode();
		fv.setFVisibilityType((FVisibilityType) getFVisibilityType().fullCopy());
		fv.setFTypePrefixVariability(getFTypePrefixVariability().fullCopy());
		if (hasFTypePrefixInputOutput())
			fv.setFTypePrefixInputOutput((FTypePrefixInputOutput) getFTypePrefixInputOutput().fullCopy());
		if (hasFStringComment())
			fv.setFStringComment(getFStringComment().fullCopy());
		
        // Copy name and replace last array subscripts
        FQName name = (i == Index.NULL) ? 
                getFQName().fullCopy() : 
                getFQName().copyAndAddFas(i.createFArraySubscripts());
        name.scalarized = true;
        fv.setFQName(name);
        
        // Scalarize binding expressions
        if (hasBindingExp()) {
            FExp bexp = getBindingExp().getArray().get(i).scalarize(s);
            if (keepBExp(variability(), getBindingExp())) {
                fv.setBindingExp(bexp);
            } else {
                s.add(new FIdUseExp(name), bexp);
            }
		}
		
		// Iterate over all attributes and scalarize.
        for (FAttribute a : getFAttributes()) {
            a.scalarize(fv.getFAttributes(), i, Collections.<String,FExp>emptyMap());
        }
		fv.setDerivedType(getDerivedType());
		fv.addArrayAttributesFromType(i, myFDerivedType());

        s.add(fv);
        return fv;
	}
    /**
     * Copy any attributes with array values from type, selecting the scalar value corresponding 
     * to the given index. 
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:471
     */
    protected void addArrayAttributesFromType(Index i, FDerivedType t) {
		if (t != null && i != Index.NULL)
			for (FAttribute a : t.getFAttributes())
				a.addArrayAttributesTo(i, getFAttributes());
	}
    /**
     * Generate scalar FVariables for this record or record component.
     * 
     * @param s Scalarization visitor
     * @param bes        Instance representation of this variable
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:523
     */
    public void scalarRecordFVariables(Scalarizer.Variable s, ScalarizingVariableInstance bes) {
        try {
            for (Index i : bes.indices(this)) {
                scalarRecordCellFVariables(s, bes.create(s, i));
            }
        } catch (ModelicaException e) {
            throw e;
        } catch (Exception e) {
            throw new InternalCompilerError("Exception caught while scalarizing component'" + bes.name() + "'", e);
        }
    }
    /**
     * Generate scalar FVariables for a single array cell of this record or record component.
     * 
     * @param s Scalarization visitor
     * @param bes        Instance representation of this variable
     * @param i          the index of this scalar variable in an array, or Index.NULL for scalar components
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:546
     */
    public void scalarRecordCellFVariables(Scalarizer.Variable s, ScalarizingVariableInstance bes) {
        bes.createScalarized(s, this);
    }
    /**
     * Create a copy of the variable with a specific name.
     * 
     * The new variable is marked as scalarized, and if it refers to a specific cell in an array, 
     * then attributes are updated accordingly.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:709
     */
    public FVariable copyForName(FQName name) {
		FVariable fv = createEmptyNode();
		fv.setFQName(name.fullCopy());
		fv.getFQName().scalarized = true;
		fv.setFVisibilityType(getFVisibilityType().fullCopy());
		fv.setFTypePrefixVariability(getFTypePrefixVariability().fullCopy());
		if (hasFTypePrefixInputOutput())
			fv.setFTypePrefixInputOutput(getFTypePrefixInputOutput().fullCopy());
		fv.setDerivedType(getDerivedType());
		if (hasBindingExp())
			fv.setBindingExp(getBindingExp().fullCopy());
		if (hasFStringComment())
			fv.setFStringComment(getFStringComment().fullCopy());
		
        Index myCell = Index.NULL;
		if (name.hasFArraySubscripts()) 
			myCell = name.getFArraySubscripts().asIndex();
		for (FAttribute a : getFAttributes())
			if (!a.isInternal())
				fv.addFAttribute(a.copyForCell(myCell));
		return fv;
	}
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:574
     */
    public void genDecl_XML(XMLGenerator gen, CodeStream str) {
        throw new IllegalArgumentException("FVariable.genDecl_XML() is not implemented for " + getClass().getSimpleName() + "!");
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:967
     */
    protected String name_C(String prefix) {
		return name_C(prefix, Integer.toString(variableIndex()));
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1753
     */
    public String algorithmInit_C() {
		if (isDiscrete()) {
			return myPreVariable().name_C();
		} else if (isParameter() && hasBindingExp()) {
			return getBindingExp().prettyPrint_C("");
		} else {
			FExp e = startAttributeExp();
			return (e == null) ? "0.0" : e.prettyPrint("");
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2864
     */
    public void genBlockResidualValuref_C(CodePrinter p, CodeStream str, String indent, 
	        Map<FVariable,String> solverArrayMap) {
		if (valueReference() != -1) 
			str.format("%s%s = %d;\n", indent, solverArrayMap.get(this), valueReference());
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2870
     */
    public void genBlockResidualBoundsCall_C(CodePrinter p, CodeStream str, String indent,
	        String func, String msg, Map<FVariable,String> solverArrayMap) {
		boolean min = minAttributeSet();
		boolean max = maxAttributeSet();
		if (min || max) {
			String type = (min && max) ? "bounds" : (max ? "ubound" : "lbound");
			str.format("%s%s_%s(%s, ", indent, func, type, solverArrayMap.get(this));
			if (min)
				str.format("%s, ", attributeExp(FAttribute.MIN).ceval());
			if (max)
				str.format("%s, ", attributeExp(FAttribute.MAX).ceval());
			str.format("\"%s for variable %s\");\n", msg, name());
		}
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2885
     */
    public void genBlockResidualInit_C(CodePrinter p, CodeStream str, String indent,
	        Map<FVariable,String> solverArrayMap) {
		str.format("%s%s = %s;\n", indent, solverArrayMap.get(this), name_C());
		genBlockResidualBoundsCall_C(p, str, indent, "init_with", "Resetting initial value", solverArrayMap);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2891
     */
    public void genBlockResidualEvalInit_C(CodePrinter p, CodeStream str, String indent,
	        Map<FVariable,String> solverArrayMap) {
		genBlockResidualBoundsCall_C(p, str, indent, "check", "Out of bounds", solverArrayMap);
		genBlockResidualWriteback_C(p, str, indent, solverArrayMap);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2897
     */
    public void genBlockResidualWriteback_C(CodePrinter p, CodeStream str, String indent,
	        Map<FVariable,String> solverArrayMap) {
		str.format("%s%s = %s;\n", indent, name_C(), solverArrayMap.get(this));
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:4457
     */
    public void genStartValue_C(CodePrinter p, CodeStream str, String indent) {
        p.printPreSteps(this, str, indent);
		str.print(indent + name_C() + " = ");
		FExp exp = useBindingExpAsStart() ? getBindingExp() : startAttributeExp();
		boolean noExp = exp == null;
		if (noExp)
			setBindingExp(exp = type().zeroLiteral());
		OptionRegistry opt = myOptions();
		str.print("(");
        p.print(exp, str, indent);
		str.print(")");
		if (isReal() && opt.getBooleanOption("enable_variable_scaling"))
			str.format("/sf(%d)", valueReference());
		if (noExp)
			setBindingExpOpt(new Opt());
		str.print(";\n");
        p.printPostSteps(this, str, indent);
	}
    /**
     * @declaredat ASTNode:1
     */
    public FVariable() {
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
        children = new ASTNode[7];
        setChild(new Opt(), 2);
        setChild(new List(), 3);
        setChild(new Opt(), 4);
        setChild(new Opt(), 5);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FVariable(FVisibilityType p0, FTypePrefixVariability p1, Opt<FTypePrefixInputOutput> p2, List<FAttribute> p3, String p4, Opt<FExp> p5, Opt<FStringComment> p6, FQName p7) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setDerivedType(p4);
        setChild(p5, 4);
        setChild(p6, 5);
        setChild(p7, 6);
    }
    /**
     * @declaredat ASTNode:27
     */
    public FVariable(FVisibilityType p0, FTypePrefixVariability p1, Opt<FTypePrefixInputOutput> p2, List<FAttribute> p3, Symbol p4, Opt<FExp> p5, Opt<FStringComment> p6, FQName p7) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setDerivedType(p4);
        setChild(p5, 4);
        setChild(p6, 5);
        setChild(p7, 6);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:40
     */
    protected int numChildren() {
        return 7;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:52
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        size_reset();
        indices_reset();
        isCircular_reset();
        myParameterDependencies_reset();
        isIndependentConstant_reset();
        isDependentConstant_reset();
        isDependentParameter_reset();
        isIndependentParameter_reset();
        isRegularIndependentParameter_reset();
        isStructuralIndependentParameter_reset();
        isFinalIndependentParameter_reset();
        isEvalIndependentParameter_reset();
        isDifferentiatedVariable_reset();
        isAlgebraicVariable_reset();
        isDiscreteVariable_reset();
        isAlgebraicContinousRealVariable_reset();
        myFDerivedType_reset();
        findAttribute_String_reset();
        isLinear_reset();
        getDynamicFVariableOpt_reset();
        initDependsOn_reset();
        dependsOn_reset();
        myDAEEquationBlock_reset();
        myDAEInitEquationBlock_reset();
        aliasVariable_reset();
        derivativeEquivalent_reset();
        name_C_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:85
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:91
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:97
     */
    public FVariable clone() throws CloneNotSupportedException {
        FVariable node = (FVariable) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:108
     */
    public abstract FVariable fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:115
     */
    public abstract FVariable treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:123
     */
    public abstract FVariable treeCopy();
    /**
     * Replaces the FVisibilityType child.
     * @param node The new node to replace the FVisibilityType child.
     * @apilevel high-level
     */
    public void setFVisibilityType(FVisibilityType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the FVisibilityType child.
     * @return The current node used as the FVisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FVisibilityType")
    public FVisibilityType getFVisibilityType() {
        return (FVisibilityType) getChild(0);
    }
    /**
     * Retrieves the FVisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FVisibilityType child.
     * @apilevel low-level
     */
    public FVisibilityType getFVisibilityTypeNoTransform() {
        return (FVisibilityType) getChildNoTransform(0);
    }
    /**
     * Replaces the FTypePrefixVariability child.
     * @param node The new node to replace the FTypePrefixVariability child.
     * @apilevel high-level
     */
    public void setFTypePrefixVariability(FTypePrefixVariability node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the FTypePrefixVariability child.
     * @return The current node used as the FTypePrefixVariability child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FTypePrefixVariability")
    public FTypePrefixVariability getFTypePrefixVariability() {
        return (FTypePrefixVariability) getChild(1);
    }
    /**
     * Retrieves the FTypePrefixVariability child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FTypePrefixVariability child.
     * @apilevel low-level
     */
    public FTypePrefixVariability getFTypePrefixVariabilityNoTransform() {
        return (FTypePrefixVariability) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child FTypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setFTypePrefixInputOutputOpt(Opt<FTypePrefixInputOutput> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) FTypePrefixInputOutput child.
     * @param node The new node to be used as the FTypePrefixInputOutput child.
     * @apilevel high-level
     */
    public void setFTypePrefixInputOutput(FTypePrefixInputOutput node) {
        getFTypePrefixInputOutputOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FTypePrefixInputOutput child exists.
     * @return {@code true} if the optional FTypePrefixInputOutput child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFTypePrefixInputOutput() {
        return getFTypePrefixInputOutputOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FTypePrefixInputOutput child.
     * @return The FTypePrefixInputOutput child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FTypePrefixInputOutput getFTypePrefixInputOutput() {
        return (FTypePrefixInputOutput) getFTypePrefixInputOutputOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FTypePrefixInputOutput child. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * @return The optional node for child the FTypePrefixInputOutput child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FTypePrefixInputOutput")
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOpt() {
        return (Opt<FTypePrefixInputOutput>) getChild(2);
    }
    /**
     * Retrieves the optional node for child FTypePrefixInputOutput. This is the <code>Opt</code> node containing the child FTypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FTypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<FTypePrefixInputOutput> getFTypePrefixInputOutputOptNoTransform() {
        return (Opt<FTypePrefixInputOutput>) getChildNoTransform(2);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 3);
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * @return Number of children in the FAttribute list.
     * @apilevel high-level
     */
    public int getNumFAttribute() {
        return getFAttributeList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAttribute list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAttribute list.
     * @apilevel low-level
     */
    public int getNumFAttributeNoTransform() {
        return getFAttributeListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAttribute list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAttribute list.
     * @apilevel high-level
     */
    public FAttribute getFAttribute(int i) {
        return (FAttribute) getFAttributeList().getChild(i);
    }
    /**
     * Check whether the FAttribute list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAttribute() {
        return getFAttributeList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAttribute list.
     * @param node The element to append to the FAttribute list.
     * @apilevel high-level
     */
    public void addFAttribute(FAttribute node) {
        List<FAttribute> list = (parent == null || state == null) ? getFAttributeListNoTransform() : getFAttributeList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAttributeNoTransform(FAttribute node) {
        List<FAttribute> list = getFAttributeListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAttribute list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAttribute(FAttribute node, int i) {
        List<FAttribute> list = getFAttributeList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FAttribute")
    public List<FAttribute> getFAttributeList() {
        List<FAttribute> list = (List<FAttribute>) getChild(3);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributeListNoTransform() {
        return (List<FAttribute>) getChildNoTransform(3);
    }
    /**
     * Retrieves the FAttribute list.
     * @return The node representing the FAttribute list.
     * @apilevel high-level
     */
    public List<FAttribute> getFAttributes() {
        return getFAttributeList();
    }
    /**
     * Retrieves the FAttribute list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAttribute list.
     * @apilevel low-level
     */
    public List<FAttribute> getFAttributesNoTransform() {
        return getFAttributeListNoTransform();
    }
    /**
     * Replaces the lexeme DerivedType.
     * @param value The new value for the lexeme DerivedType.
     * @apilevel high-level
     */
    public void setDerivedType(String value) {
        tokenString_DerivedType = value;
    }
    /**
     * @apilevel internal
     */
    protected String tokenString_DerivedType;
    /**
     */
    public int DerivedTypestart;
    /**
     */
    public int DerivedTypeend;
    /**
     * JastAdd-internal setter for lexeme DerivedType using the Beaver parser.
     * @param symbol Symbol containing the new value for the lexeme DerivedType
     * @apilevel internal
     */
    public void setDerivedType(Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
        throw new UnsupportedOperationException("setDerivedType is only valid for String lexemes");
        tokenString_DerivedType = (String)symbol.value;
        DerivedTypestart = symbol.getStart();
        DerivedTypeend = symbol.getEnd();
    }
    /**
     * Retrieves the value for the lexeme DerivedType.
     * @return The value for the lexeme DerivedType.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="DerivedType")
    public String getDerivedType() {
        return tokenString_DerivedType != null ? tokenString_DerivedType : "";
    }
    /**
     * Replaces the optional node for the BindingExp child. This is the <code>Opt</code>
     * node containing the child BindingExp, not the actual child!
     * @param opt The new node to be used as the optional node for the BindingExp child.
     * @apilevel low-level
     */
    public void setBindingExpOpt(Opt<FExp> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) BindingExp child.
     * @param node The new node to be used as the BindingExp child.
     * @apilevel high-level
     */
    public void setBindingExp(FExp node) {
        getBindingExpOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional BindingExp child exists.
     * @return {@code true} if the optional BindingExp child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasBindingExp() {
        return getBindingExpOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) BindingExp child.
     * @return The BindingExp child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getBindingExp() {
        return (FExp) getBindingExpOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the BindingExp child. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * @return The optional node for child the BindingExp child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="BindingExp")
    public Opt<FExp> getBindingExpOpt() {
        return (Opt<FExp>) getChild(4);
    }
    /**
     * Retrieves the optional node for child BindingExp. This is the <code>Opt</code> node containing the child BindingExp, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child BindingExp.
     * @apilevel low-level
     */
    public Opt<FExp> getBindingExpOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the FStringComment child. This is the <code>Opt</code>
     * node containing the child FStringComment, not the actual child!
     * @param opt The new node to be used as the optional node for the FStringComment child.
     * @apilevel low-level
     */
    public void setFStringCommentOpt(Opt<FStringComment> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) FStringComment child.
     * @param node The new node to be used as the FStringComment child.
     * @apilevel high-level
     */
    public void setFStringComment(FStringComment node) {
        getFStringCommentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FStringComment child exists.
     * @return {@code true} if the optional FStringComment child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFStringComment() {
        return getFStringCommentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FStringComment child.
     * @return The FStringComment child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FStringComment getFStringComment() {
        return (FStringComment) getFStringCommentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FStringComment child. This is the <code>Opt</code> node containing the child FStringComment, not the actual child!
     * @return The optional node for child the FStringComment child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FStringComment")
    public Opt<FStringComment> getFStringCommentOpt() {
        return (Opt<FStringComment>) getChild(5);
    }
    /**
     * Retrieves the optional node for child FStringComment. This is the <code>Opt</code> node containing the child FStringComment, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FStringComment.
     * @apilevel low-level
     */
    public Opt<FStringComment> getFStringCommentOptNoTransform() {
        return (Opt<FStringComment>) getChildNoTransform(5);
    }
    /**
     * Replaces the FQName child.
     * @param node The new node to replace the FQName child.
     * @apilevel high-level
     */
    public void setFQName(FQName node) {
        setChild(node, 6);
    }
    /**
     * Retrieves the FQName child.
     * @return The current node used as the FQName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="FQName")
    public FQName getFQName() {
        return (FQName) getChild(6);
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(6);
    }
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = isScalarized()? 0 : getFQName().ndims();

        return ndims_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean size_computed = false;
    /**
     * @apilevel internal
     */
    protected Size size_value;
    /**
     * @apilevel internal
     */
    private void size_reset() {
        size_computed = false;
        size_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        if(size_computed) {
            return size_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        size_value = isScalarized()? Size.SCALAR: getFQName().size();
        if (isFinal && num == state().boundariesCrossed) {
            size_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return size_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean indices_computed = false;
    /**
     * @apilevel internal
     */
    protected Indices indices_value;
    /**
     * @apilevel internal
     */
    private void indices_reset() {
        indices_computed = false;
        indices_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        if(indices_computed) {
            return indices_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        indices_value = isScalarized() ? null : Indices.create(size());
        if (isFinal && num == state().boundariesCrossed) {
            indices_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = ceval(evaluator, isParameter());

        return ceval_VariableEvaluator_value;
    }
    /**
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2999
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, boolean inParameterRecord) {
        ASTNode$State state = state();
        try {
        		CValue val;
        		if (isForIndex())
        			val = evaluationValue(evaluator);
        		else if (hasParameterEquation())
        			val = parameterEquation().cevalParameter(evaluator, this);
        		else if (hasBindingExp())
        			val = getBindingExp().ceval(evaluator);
        		else
        			val = defaultCValue(evaluator, inParameterRecord);
                if (isReal() && !val.isUnknown()) {
                    val = val.convertReal();
                }
        		return val;
        	}
        finally {
        }
    }
    /**
     * Constant evaluation of FVariable binding expressions.
     * 
     * If an expression is evaluated in an FClass, then identifiers are 
     * referencing FVariables. The constant value of an FVariable is computed
     * by evaluating the binding expression of the variable, if any. If the
     * FVariable is not a constant or a parameter, or if it has no binding
     * expressions, then a CValueUnknown object is returned.
     * 
     * This version only evaluates a specific cell in an array, and returns 
     * the value for that specific cell.
     * 
     * @return The constant value.
     * @attribute syn
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3036
     */
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        try {
                CValue val;
                if (isForIndex())
                    val = evaluationValue(evaluator);
                else if (hasParameterEquation())
                    val = parameterEquation().cevalParameter(evaluator, this, i);
                else if (hasBindingExp())
                    val = getBindingExp().ceval(evaluator, i);
                else
                    val = startAttributeCValue();
                val = val.array().getCell(i);
                if (isReal())
                    val = val.convertReal();
                return val;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue defaultCValue(VariableEvaluator evaluator, boolean inParameterRecord) {
        ASTNode$State state = state();
        CValue defaultCValue_VariableEvaluator_boolean_value = startAttributeCValue();

        return defaultCValue_VariableEvaluator_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue defaultCValueCell(VariableEvaluator evaluator, Index i, boolean inParameterRecord) {
        ASTNode$State state = state();
        CValue defaultCValueCell_VariableEvaluator_Index_boolean_value = startAttributeCValue();

        return defaultCValueCell_VariableEvaluator_Index_boolean_value;
    }
    /**
     * @apilevel internal
     */
    protected int isCircular_visited = -1;
    /**
     * @apilevel internal
     */
    private void isCircular_reset() {
        isCircular_computed = false;
        isCircular_initialized = false;
        isCircular_visited = -1;
    }
    /**
     * @apilevel internal
     */
    protected boolean isCircular_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_initialized = false;
    /**
     * @apilevel internal
     */
    protected boolean isCircular_value;
    @ASTNodeAnnotation.Attribute
    public boolean isCircular() {
        if(isCircular_computed) {
            return isCircular_value;
        }
        ASTNode$State state = state();
        boolean new_isCircular_value;
        if (!isCircular_initialized) {
            isCircular_initialized = true;
            isCircular_value = true;
        }
        if (!state.IN_CIRCLE) {
            state.IN_CIRCLE = true;
            int num = state.boundariesCrossed;
            boolean isFinal = this.is$Final();
            do {
                isCircular_visited = state.CIRCLE_INDEX;
                state.CHANGE = false;
                new_isCircular_value = getFQName().isCircular() || (hasBindingExp() && getBindingExp().isCircular());
                if (new_isCircular_value != isCircular_value) {
                    state.CHANGE = true;
                }
                isCircular_value = new_isCircular_value;
                state.CIRCLE_INDEX++;
            } while (state.CHANGE);
            if (isFinal && num == state().boundariesCrossed) {
                isCircular_computed = true;
                state.LAST_CYCLE = true;
                boolean $tmp = getFQName().isCircular() || (hasBindingExp() && getBindingExp().isCircular());
                state.LAST_CYCLE = false;
            } else {
                state.RESET_CYCLE = true;
                boolean $tmp = getFQName().isCircular() || (hasBindingExp() && getBindingExp().isCircular());
                state.RESET_CYCLE = false;
                isCircular_computed = false;
                isCircular_initialized = false;
            }
            state.IN_CIRCLE = false;
            state.INTERMEDIATE_VALUE = false;
            return isCircular_value;
        }
        if(isCircular_visited != state.CIRCLE_INDEX) {
            isCircular_visited = state.CIRCLE_INDEX;
            if (state.LAST_CYCLE) {
                isCircular_computed = true;
                new_isCircular_value = getFQName().isCircular() || (hasBindingExp() && getBindingExp().isCircular());
                return new_isCircular_value;
            }
            if (state.RESET_CYCLE) {
                isCircular_computed = false;
                isCircular_initialized = false;
                isCircular_visited = -1;
                return isCircular_value;
            }
            new_isCircular_value = getFQName().isCircular() || (hasBindingExp() && getBindingExp().isCircular());
            if (new_isCircular_value != isCircular_value) {
                state.CHANGE = true;
            }
            isCircular_value = new_isCircular_value;
            state.INTERMEDIATE_VALUE = true;
            return isCircular_value;
        }
        state.INTERMEDIATE_VALUE = true;
        return isCircular_value;
    }
    @ASTNodeAnnotation.Attribute
    public int aliasValueReference() {
        ASTNode$State state = state();
        int aliasValueReference_value = alias()!=null? 
                alias().valueReference(): -1;

        return aliasValueReference_value;
    }
    @ASTNodeAnnotation.Attribute
    public int indexInZ() {
        ASTNode$State state = state();
        int indexInZ_value = valueReference() & 0x07FFFFFF;

        return indexInZ_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConsecutiveInZ(FAbstractVariable fv) {
        ASTNode$State state = state();
        boolean isConsecutiveInZ_FAbstractVariable_value = indexInZ() + 1 == fv.indexInZ();

        return isConsecutiveInZ_FAbstractVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldContribute() {
        ASTNode$State state = state();
        boolean shouldContribute_value = !isAlias() && !inRecord() && !isForIndex();

        return shouldContribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public int differentiatedRealVariableIndex() {
        ASTNode$State state = state();
        int differentiatedRealVariableIndex_value = myFClass().differentiatedRealVariablesList().indexOf(this);

        return differentiatedRealVariableIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFixed() {
        ASTNode$State state = state();
        boolean isFixed_value = !isInitialParameter() && fixedAttribute();

        return isFixed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInitialParameter() {
        ASTNode$State state = state();
        boolean isInitialParameter_value = variability().initialParameterVariability();

        return isInitialParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public int inputIndex() {
        ASTNode$State state = state();
        int inputIndex_value = myFClass().inputs().indexOf(this);

        return inputIndex_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myParameterDependencies_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FVariable> myParameterDependencies_value;
    /**
     * @apilevel internal
     */
    private void myParameterDependencies_reset() {
        myParameterDependencies_computed = false;
        myParameterDependencies_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> myParameterDependencies() {
        if(myParameterDependencies_computed) {
            return myParameterDependencies_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myParameterDependencies_value = myParameterDependencies_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myParameterDependencies_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myParameterDependencies_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FVariable> myParameterDependencies_compute() {
            HashSet<FVariable> varSet = new HashSet<FVariable>();
            if (hasParameterEquation()) {
                for (FVariable vv: parameterEquation().RHSVariables()) {
                    varSet.addAll(vv.myParameterDependencies());
                }
                return varSet;
            } else { //Base case
                varSet.add(this);
                return varSet;
            }
        }
    /**
     * @apilevel internal
     */
    protected boolean isIndependentConstant_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isIndependentConstant_value;
    /**
     * @apilevel internal
     */
    private void isIndependentConstant_reset() {
        isIndependentConstant_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentConstant() {
        if(isIndependentConstant_computed) {
            return isIndependentConstant_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isIndependentConstant_value = isConstant();
        if (isFinal && num == state().boundariesCrossed) {
            isIndependentConstant_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isIndependentConstant_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isDependentConstant_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isDependentConstant_value;
    /**
     * @apilevel internal
     */
    private void isDependentConstant_reset() {
        isDependentConstant_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDependentConstant() {
        if(isDependentConstant_computed) {
            return isDependentConstant_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isDependentConstant_value = false;
        if (isFinal && num == state().boundariesCrossed) {
            isDependentConstant_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isDependentConstant_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isDependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isDependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isDependentParameter_reset() {
        isDependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDependentParameter() {
        if(isDependentParameter_computed) {
            return isDependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isDependentParameter_value = isParameter() && !isIndependentParameter();
        if (isFinal && num == state().boundariesCrossed) {
            isDependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isDependentParameter_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isIndependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isIndependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isIndependentParameter_reset() {
        isIndependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isIndependentParameter() {
        if(isIndependentParameter_computed) {
            return isIndependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isIndependentParameter_value = isParameter() && !isInitialParameter() && !hasParameterEquation() && 
                    (!hasBindingExp() || getBindingExp().isIndependentParameterExp());
        if (isFinal && num == state().boundariesCrossed) {
            isIndependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isIndependentParameter_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isRegularIndependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isRegularIndependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isRegularIndependentParameter_reset() {
        isRegularIndependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRegularIndependentParameter() {
        if(isRegularIndependentParameter_computed) {
            return isRegularIndependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isRegularIndependentParameter_value = isIndependentParameter() && !variability().knownParameterOrLess();
        if (isFinal && num == state().boundariesCrossed) {
            isRegularIndependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isRegularIndependentParameter_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isStructuralIndependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isStructuralIndependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isStructuralIndependentParameter_reset() {
        isStructuralIndependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStructuralIndependentParameter() {
        if(isStructuralIndependentParameter_computed) {
            return isStructuralIndependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isStructuralIndependentParameter_value = isIndependentParameter() && variability().knownParameterOrLess();
        if (isFinal && num == state().boundariesCrossed) {
            isStructuralIndependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isStructuralIndependentParameter_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isFinalIndependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isFinalIndependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isFinalIndependentParameter_reset() {
        isFinalIndependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFinalIndependentParameter() {
        if(isFinalIndependentParameter_computed) {
            return isFinalIndependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isFinalIndependentParameter_value = false;
        if (isFinal && num == state().boundariesCrossed) {
            isFinalIndependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isFinalIndependentParameter_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isEvalIndependentParameter_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isEvalIndependentParameter_value;
    /**
     * @apilevel internal
     */
    private void isEvalIndependentParameter_reset() {
        isEvalIndependentParameter_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEvalIndependentParameter() {
        if(isEvalIndependentParameter_computed) {
            return isEvalIndependentParameter_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isEvalIndependentParameter_value = false;
        if (isFinal && num == state().boundariesCrossed) {
            isEvalIndependentParameter_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isEvalIndependentParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasParamValueExp() {
        ASTNode$State state = state();
        boolean hasParamValueExp_value = hasBindingExp() || startAttributeSet();

        return hasParamValueExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp paramValueExp() {
        ASTNode$State state = state();
        FExp paramValueExp_value = hasBindingExp() ? getBindingExp() : startAttributeExp();

        return paramValueExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isVariable() {
        ASTNode$State state = state();
        boolean isVariable_value = !isParameter() && !isConstant();

        return isVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFVariable() {
        ASTNode$State state = state();
        boolean isFVariable_value = true;

        return isFVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isDifferentiatedVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isDifferentiatedVariable_value;
    /**
     * @apilevel internal
     */
    private void isDifferentiatedVariable_reset() {
        isDifferentiatedVariable_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDifferentiatedVariable() {
        if(isDifferentiatedVariable_computed) {
            return isDifferentiatedVariable_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isDifferentiatedVariable_value = myFClass().differentiatedRealVariables().contains(this);
        if (isFinal && num == state().boundariesCrossed) {
            isDifferentiatedVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isDifferentiatedVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable asFVariable() {
        ASTNode$State state = state();
        FVariable asFVariable_value = this;

        return asFVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isAlgebraicVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isAlgebraicVariable_value;
    /**
     * @apilevel internal
     */
    private void isAlgebraicVariable_reset() {
        isAlgebraicVariable_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlgebraicVariable() {
        if(isAlgebraicVariable_computed) {
            return isAlgebraicVariable_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isAlgebraicVariable_value = myFClass().algebraicVariables().contains(this);
        if (isFinal && num == state().boundariesCrossed) {
            isAlgebraicVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isAlgebraicVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isDiscreteVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isDiscreteVariable_value;
    /**
     * @apilevel internal
     */
    private void isDiscreteVariable_reset() {
        isDiscreteVariable_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscreteVariable() {
        if(isDiscreteVariable_computed) {
            return isDiscreteVariable_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isDiscreteVariable_value = myFClass().discreteVariables().contains(this);
        if (isFinal && num == state().boundariesCrossed) {
            isDiscreteVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isDiscreteVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isAlgebraicContinousRealVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isAlgebraicContinousRealVariable_value;
    /**
     * @apilevel internal
     */
    private void isAlgebraicContinousRealVariable_reset() {
        isAlgebraicContinousRealVariable_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlgebraicContinousRealVariable() {
        if(isAlgebraicContinousRealVariable_computed) {
            return isAlgebraicContinousRealVariable_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isAlgebraicContinousRealVariable_value = myFClass().algebraicContinousRealVariables().contains(this);
        if (isFinal && num == state().boundariesCrossed) {
            isAlgebraicContinousRealVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isAlgebraicContinousRealVariable_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariablesInBindingExp() {
        ASTNode$State state = state();
        Set<FVariable> referencedFVariablesInBindingExp_value = lookupFVariablesInSet(getBindingExp().findFIdUseExpsInTree());

        return referencedFVariablesInBindingExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = hasFTypePrefixInputOutput()? getFTypePrefixInputOutput().inputCausality(): false;

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = hasFTypePrefixInputOutput()? getFTypePrefixInputOutput().outputCausality(): false;

        return isOutput_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myFDerivedType_computed = false;
    /**
     * @apilevel internal
     */
    protected FDerivedType myFDerivedType_value;
    /**
     * @apilevel internal
     */
    private void myFDerivedType_reset() {
        myFDerivedType_computed = false;
        myFDerivedType_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FDerivedType myFDerivedType() {
        if(myFDerivedType_computed) {
            return myFDerivedType_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myFDerivedType_value = findFDerivedType(getDerivedType());
        if (isFinal && num == state().boundariesCrossed) {
            myFDerivedType_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myFDerivedType_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findAttributeLocal(String name) {
        ASTNode$State state = state();
        FAttribute findAttributeLocal_String_value = findMatching(getFAttributes(), name);

        return findAttributeLocal_String_value;
    }
    protected Map findAttribute_String_values;
    /**
     * @apilevel internal
     */
    private void findAttribute_String_reset() {
        findAttribute_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findAttribute(String name) {
        Object _parameters = name;
        if (findAttribute_String_values == null) findAttribute_String_values = new HashMap(4);
        if(findAttribute_String_values.containsKey(_parameters)) {
            return (FAttribute)findAttribute_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        FAttribute findAttribute_String_value = findAttribute_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            findAttribute_String_values.put(_parameters, findAttribute_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return findAttribute_String_value;
    }
    /**
     * @apilevel internal
     */
    private FAttribute findAttribute_compute(String name) {
            FAttribute res = findAttributeLocal(name);
            if (res == null && myFDerivedType() != null)
                res = myFDerivedType().findAttribute(name);
            return res;
        }
    @ASTNodeAnnotation.Attribute
    public boolean attributeSet(FAttribute a) {
        ASTNode$State state = state();
        boolean attributeSet_FAttribute_value = (a != null) && a.getAttributeSet();

        return attributeSet_FAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp attributeExp(FAttribute a) {
        ASTNode$State state = state();
        FExp attributeExp_FAttribute_value = (a != null && a.hasValue()) ? a.getValue() : null;

        return attributeExp_FAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean attributeSet(String name) {
        ASTNode$State state = state();
        boolean attributeSet_String_value = attributeSet(findAttribute(name));

        return attributeSet_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp attributeExp(String name) {
        ASTNode$State state = state();
        FExp attributeExp_String_value = attributeExp(findAttribute(name));

        return attributeExp_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String attributeString(String name) {
        ASTNode$State state = state();
        String attributeString_String_value = attributeCValueString(name).stringValue();

        return attributeString_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findHierarchicalAttribute(FQNameFull name, int n) {
        ASTNode$State state = state();
        FAttribute findHierarchicalAttribute_FQNameFull_int_value = name.findHierarchicalAttribute(getFQName().asFQNameFull(), this, n);

        return findHierarchicalAttribute_FQNameFull_int_value;
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2463
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueString(String name) {
        ASTNode$State state = state();
        try {
                FAttribute a = findAttribute(name);
                return (attributeSet(a) ? attributeExp(a).ceval() : new CValueString("")).expandArray(size());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2467
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueBoolean(String name, boolean def) {
        ASTNode$State state = state();
        try {
                FAttribute a = findAttribute(name);
                return (attributeSet(a) ? attributeExp(a).ceval() : new CValueBoolean(def)).expandArray(size());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2471
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueReal(String name, double def) {
        ASTNode$State state = state();
        try {
                FAttribute a = findAttribute(name);
                return (attributeSet(a) ? attributeExp(a).ceval() : new CValueReal(def)).expandArray(size());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2475
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueInteger(String name, int def) {
        ASTNode$State state = state();
        try {
                FAttribute a = findAttribute(name);
                return (attributeSet(a) ? attributeExp(a).ceval() : new CValueInteger(def)).expandArray(size());
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2479
     */
    @ASTNodeAnnotation.Attribute
    public CValue attributeCValueEnum(String name, FType type, int def) {
        ASTNode$State state = state();
        try {
                FAttribute a = findAttribute(name);
                return (attributeSet(a) ? attributeExp(a).ceval() : new CValueEnum(type, def)).expandArray(size());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean quantityAttributeSet() {
        ASTNode$State state = state();
        boolean quantityAttributeSet_value = attributeSet(FAttribute.QUANTITY);

        return quantityAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp quantityAttributeExp() {
        ASTNode$State state = state();
        FExp quantityAttributeExp_value = attributeExp(FAttribute.QUANTITY);

        return quantityAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue quantityAttributeCValue() {
        ASTNode$State state = state();
        CValue quantityAttributeCValue_value = attributeCValueString(FAttribute.QUANTITY);

        return quantityAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String quantityAttribute() {
        ASTNode$State state = state();
        String quantityAttribute_value = quantityAttributeCValue().stringValue();

        return quantityAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean unitAttributeSet() {
        ASTNode$State state = state();
        boolean unitAttributeSet_value = attributeSet(FAttribute.UNIT);

        return unitAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp unitAttributeExp() {
        ASTNode$State state = state();
        FExp unitAttributeExp_value = attributeExp(FAttribute.UNIT);

        return unitAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue unitAttributeCValue() {
        ASTNode$State state = state();
        CValue unitAttributeCValue_value = attributeCValueString(FAttribute.UNIT);

        return unitAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String unitAttribute() {
        ASTNode$State state = state();
        String unitAttribute_value = unitAttributeCValue().stringValue();

        return unitAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean displayUnitAttributeSet() {
        ASTNode$State state = state();
        boolean displayUnitAttributeSet_value = attributeSet(FAttribute.DISPLAY_UNIT);

        return displayUnitAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp displayUnitAttributeExp() {
        ASTNode$State state = state();
        FExp displayUnitAttributeExp_value = attributeExp(FAttribute.DISPLAY_UNIT);

        return displayUnitAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue displayUnitAttributeCValue() {
        ASTNode$State state = state();
        CValue displayUnitAttributeCValue_value = attributeCValueString(FAttribute.DISPLAY_UNIT);

        return displayUnitAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public String displayUnitAttribute() {
        ASTNode$State state = state();
        String displayUnitAttribute_value = displayUnitAttributeCValue().stringValue();

        return displayUnitAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean minAttributeSet() {
        ASTNode$State state = state();
        boolean minAttributeSet_value = attributeSet(FAttribute.MIN);

        return minAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp minAttributeExp() {
        ASTNode$State state = state();
        FExp minAttributeExp_value = attributeExp(FAttribute.MIN);

        return minAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean maxAttributeSet() {
        ASTNode$State state = state();
        boolean maxAttributeSet_value = attributeSet(FAttribute.MAX);

        return maxAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp maxAttributeExp() {
        ASTNode$State state = state();
        FExp maxAttributeExp_value = attributeExp(FAttribute.MAX);

        return maxAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean useBindingExpAsStart() {
        ASTNode$State state = state();
        boolean useBindingExpAsStart_value = (isIndependentParameter() || variability().knownParameterOrLess()) && hasBindingExp();

        return useBindingExpAsStart_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean startAttributeSet() {
        ASTNode$State state = state();
        boolean startAttributeSet_value = attributeSet(FAttribute.START);

        return startAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp startAttributeExp() {
        ASTNode$State state = state();
        FExp startAttributeExp_value = attributeExp(FAttribute.START);

        return startAttributeExp_value;
    }
    /**
     * @attribute syn
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2553
     */
    @ASTNodeAnnotation.Attribute
    public FExp createStartAttributeExp() {
        ASTNode$State state = state();
        try {
                FExp e = startAttributeExp();
                return (e == null) ? startAttributeCValue().buildLiteral() : e.fullCopy();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public CValue startAttributeCValue() {
        ASTNode$State state = state();
        CValue startAttributeCValue_value = CValue.UNKNOWN;

        return startAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fixedAttributeSet() {
        ASTNode$State state = state();
        boolean fixedAttributeSet_value = attributeSet(FAttribute.FIXED);

        return fixedAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FExp fixedAttributeExp() {
        ASTNode$State state = state();
        FExp fixedAttributeExp_value = attributeExp(FAttribute.FIXED);

        return fixedAttributeExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue fixedAttributeCValue() {
        ASTNode$State state = state();
        CValue fixedAttributeCValue_value = attributeCValueBoolean(FAttribute.FIXED, isParameter() || isConstant());

        return fixedAttributeCValue_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean fixedAttribute() {
        ASTNode$State state = state();
        boolean fixedAttribute_value = fixedAttributeCValue().reduceBooleanOr();

        return fixedAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean stateSelectAttributeSet() {
        ASTNode$State state = state();
        boolean stateSelectAttributeSet_value = attributeSet(FAttribute.STATE_SELECT);

        return stateSelectAttributeSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FDerivativeVariable myDerivativeVariable() {
        ASTNode$State state = state();
        FDerivativeVariable myDerivativeVariable_value = (FDerivativeVariable) lookupDerFV(getFQName(), order() + 1);

        return myDerivativeVariable_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean isLinear_computed = false;
    /**
     * @apilevel internal
     */
    protected boolean isLinear_value;
    /**
     * @apilevel internal
     */
    private void isLinear_reset() {
        isLinear_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isLinear() {
        if(isLinear_computed) {
            return isLinear_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        isLinear_value = isLinear_compute();
        if (isFinal && num == state().boundariesCrossed) {
            isLinear_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return isLinear_value;
    }
    /**
     * @apilevel internal
     */
    private boolean isLinear_compute() {
            if (isParameter() || isConstant()) {
                return true;
            }
            for (FIdUseExp e : uses()) {
                if (!e.isLinear()) {
                    return false;
                }
            }
            return true;
        }
    @ASTNodeAnnotation.Attribute
    public int numScalars() {
        ASTNode$State state = state();
        int numScalars_value = type().numScalarElements();

        return numScalars_value;
    }
    /**
     * @attribute syn
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:45
     */
    @ASTNodeAnnotation.Attribute
    public String varKind() {
        ASTNode$State state = state();
        try {
                if (isIndependentConstant()) {
                    return "ci";
                } else if (isDependentConstant()) {
                    return "cd";
                } else if (isIndependentParameter()) {
                    return "pi";
                } else if (isDependentParameter()) {
                    return "pd";
                } else if (isDifferentiatedVariable()) {
                    return "x";
                } else if (isDerivativeVariable()) {
                    return "dx";
                } else if (isAlgebraicVariable()) {
                    return "w";
                } else if (isInput()) {
                    return "u";
                } else {
                    return "unknown";
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getFQNameNoTransform().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nameUnderscore() {
        ASTNode$State state = state();
        String nameUnderscore_value = getFQName().nameUnderscore();

        return nameUnderscore_value;
    }
    /**
     * Check if this FVariable contains any active annotation attributes.
     * @attribute syn
     * @aspect AttributeUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:2080
     */
    @ASTNodeAnnotation.Attribute
    public boolean containsActiveAnnotations() {
        ASTNode$State state = state();
        try {
                if (getNumFAttribute() == 0)
                    return false;
                for (AttributeContributer contributer : attributeContributers())
                    if (contributer.containsActiveAttributes(this))
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String prettyPrintType() {
        ASTNode$State state = state();
        String prettyPrintType_value = getDerivedType().isEmpty() ? type().scalarType().toString() : getDerivedType();

        return prettyPrintType_value;
    }
    @ASTNodeAnnotation.Attribute
    public String displayName() {
        ASTNode$State state = state();
        String displayName_value = getFQName().toString();

        return displayName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = variability().constantVariability();

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameter() {
        ASTNode$State state = state();
        boolean isParameter_value = variability().parameterVariability();

        return isParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscrete() {
        ASTNode$State state = state();
        boolean isDiscrete_value = variability().discreteVariability();

        return isDiscrete_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isContinuous() {
        ASTNode$State state = state();
        boolean isContinuous_value = variability().continuousVariability();

        return isContinuous_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        FTypePrefixVariability variability_value = getFTypePrefixVariability();

        return variability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReinit() {
        ASTNode$State state = state();
        boolean isReinit_value = myFClass().collectReinits().keySet().contains(this);

        return isReinit_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getDynamicFVariableOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getDynamicFVariableOpt_value;
    /**
     * @apilevel internal
     */
    private void getDynamicFVariableOpt_reset() {
        getDynamicFVariableOpt_computed = false;
        getDynamicFVariableOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getDynamicFVariableOpt() {
        if(getDynamicFVariableOpt_computed) {
            return getDynamicFVariableOpt_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getDynamicFVariableOpt_value = new DynamicOpt();
        getDynamicFVariableOpt_value.setParent(this);
        getDynamicFVariableOpt_value.is$Final = true;
        if (true) {
            getDynamicFVariableOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getDynamicFVariableOpt_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldBeDifferentiated() {
        ASTNode$State state = state();
        boolean shouldBeDifferentiated_value = variability().continuousVariability();

        return shouldBeDifferentiated_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = new FAttributeListAnnotationNode(getFAttributes());

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublic() {
        ASTNode$State state = state();
        boolean isPublic_value = getFVisibilityType().isPublic();

        return isPublic_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isProtected() {
        ASTNode$State state = state();
        boolean isProtected_value = getFVisibilityType().isProtected();

        return isProtected_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isTemporary() {
        ASTNode$State state = state();
        boolean isTemporary_value = getFVisibilityType().isTemporary();

        return isTemporary_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean initDependsOn_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FVariable> initDependsOn_value;
    /**
     * @apilevel internal
     */
    private void initDependsOn_reset() {
        initDependsOn_computed = false;
        initDependsOn_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> initDependsOn() {
        if(initDependsOn_computed) {
            return initDependsOn_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        initDependsOn_value = initDependsOn_compute();
        if (isFinal && num == state().boundariesCrossed) {
            initDependsOn_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return initDependsOn_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FVariable> initDependsOn_compute() {
            if (myDAEInitEquationBlock() != null)
                return myDAEInitEquationBlock().dependsOn();
            else
                return new LinkedHashSet<FVariable>();
        }
    /**
     * @apilevel internal
     */
    protected boolean dependsOn_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FVariable> dependsOn_value;
    /**
     * @apilevel internal
     */
    private void dependsOn_reset() {
        dependsOn_computed = false;
        dependsOn_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> dependsOn() {
        if(dependsOn_computed) {
            return dependsOn_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        dependsOn_value = dependsOn_compute();
        if (isFinal && num == state().boundariesCrossed) {
            dependsOn_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return dependsOn_value;
    }
    /**
     * @apilevel internal
     */
    private Set<FVariable> dependsOn_compute() {
            if (myDAEEquationBlock() != null)
                return myDAEEquationBlock().dependsOn();
            else
                return new LinkedHashSet<FVariable>();
        }
    /**
     * @apilevel internal
     */
    protected boolean myDAEEquationBlock_computed = false;
    /**
     * @apilevel internal
     */
    protected AbstractEquationBlock myDAEEquationBlock_value;
    /**
     * @apilevel internal
     */
    private void myDAEEquationBlock_reset() {
        myDAEEquationBlock_computed = false;
        myDAEEquationBlock_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public AbstractEquationBlock myDAEEquationBlock() {
        if(myDAEEquationBlock_computed) {
            return myDAEEquationBlock_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myDAEEquationBlock_value = myFClass().getDAEFVariableEquationBlockMap().get(this);
        if (isFinal && num == state().boundariesCrossed) {
            myDAEEquationBlock_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myDAEEquationBlock_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean myDAEInitEquationBlock_computed = false;
    /**
     * @apilevel internal
     */
    protected AbstractEquationBlock myDAEInitEquationBlock_value;
    /**
     * @apilevel internal
     */
    private void myDAEInitEquationBlock_reset() {
        myDAEInitEquationBlock_computed = false;
        myDAEInitEquationBlock_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public AbstractEquationBlock myDAEInitEquationBlock() {
        if(myDAEInitEquationBlock_computed) {
            return myDAEInitEquationBlock_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myDAEInitEquationBlock_value = myFClass().getDAEInitFVariableEquationBlockMap().get(this);
        if (isFinal && num == state().boundariesCrossed) {
            myDAEInitEquationBlock_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myDAEInitEquationBlock_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeAlias() {
        ASTNode$State state = state();
        boolean canBeAlias_value = !lookupDerFV(getFQName(), order() + 1).isDummyDerivativeVariable() 
                    && !isPreVariable() && !isAbstractDerivativeVariable()
                    && !isInput() && !isOutput();

        return canBeAlias_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean aliasSortKeep() {
        ASTNode$State state = state();
        boolean aliasSortKeep_value = !isPreVariable() || !myNonPreVariable().isAlias();

        return aliasSortKeep_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldEliminateTemporary() {
        ASTNode$State state = state();
        boolean shouldEliminateTemporary_value = isTemporary() && 
                nonDefiningUses().size() <= 1 && 
                definingUses().size() <= 1 && 
                !isPreVariable() && myPreVariable().isUnknown() && 
                (definingUses().isEmpty() || !definingUses().iterator().next().myFEquation().generatesEvents()) && 
                !isDifferentiatedVariable() && !isDerivativeVariable();

        return shouldEliminateTemporary_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRuntimeOption() {
        ASTNode$State state = state();
        boolean isRuntimeOption_value = getFVisibilityType().isRuntimeOptionVisibility();

        return isRuntimeOption_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAlias() {
        ASTNode$State state = state();
        boolean isAlias_value = aliasVariable() != null;

        return isAlias_value;
    }
    /**
     * Retreives the alias set for this variable or null if not an alias
     * 
     * @return AliasSet that this variable belongs to
     * @attribute syn
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:42
     */
    @ASTNodeAnnotation.Attribute
    public AliasManager.AliasSet aliasSet() {
        ASTNode$State state = state();
        try {
        		AliasManager aliasManager = myFClass().getAliasManager();
        		return aliasManager.getAliasSet(this);
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean aliasVariable_computed = false;
    /**
     * @apilevel internal
     */
    protected AliasManager.AliasVariable aliasVariable_value;
    /**
     * @apilevel internal
     */
    private void aliasVariable_reset() {
        aliasVariable_computed = false;
        aliasVariable_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public AliasManager.AliasVariable aliasVariable() {
        if(aliasVariable_computed) {
            return aliasVariable_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        aliasVariable_value = aliasVariable_compute();
        if (isFinal && num == state().boundariesCrossed) {
            aliasVariable_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return aliasVariable_value;
    }
    /**
     * @apilevel internal
     */
    private AliasManager.AliasVariable aliasVariable_compute() {
    		AliasManager.AliasSet aliasSet = aliasSet();
    		if (aliasSet == null || inRecord()) {
    			return null;
    		}
            AliasManager.AliasVariable av = aliasSet.getModelVariable();
    		return av.getFVariable()==this? null : av;
    	}
    /**
     * Get the model variable corresponding to the alias.
     * 
     * If the FVariable is an alias, the alias() return corresponding model
     * FVariable, else null.
     * 
     * @return The corresponding model variable if alias, otherwise null.
     * @attribute syn
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:72
     */
    @ASTNodeAnnotation.Attribute
    public FVariable alias() {
        ASTNode$State state = state();
        try {
        		if (aliasVariable() == null) {
        			return null;
        		} else {
        			return aliasVariable().getFVariable();			
        		}
        	}
        finally {
        }
    }
    /**
     * Returns true if the alias is negated otherwise false.
     * 
     * @return True if negated alias, otherwise false.
     * @attribute syn
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:87
     */
    @ASTNodeAnnotation.Attribute
    public boolean isNegated() {
        ASTNode$State state = state();
        try {
        		AliasManager aliasManager = myFClass().getAliasManager();
        		AliasManager.AliasVariable alias = aliasManager.getAliasVariable(this);
        		AliasManager.AliasSet aliasSet = alias.getSet();
        		if (alias == null) {
        			return false;
        		} else {
                    AliasManager.AliasVariable iav = aliasSet.getModelVariable();
        			return (alias.isNegated() != iav.isNegated());
        		}
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean shouldPropagateAttributesForAlias() {
        ASTNode$State state = state();
        boolean shouldPropagateAttributesForAlias_value = true;

        return shouldPropagateAttributesForAlias_value;
    }
    /**
     * Get the heuristic score for keeping this variable in an alias set.
     * 
     * The variable with the highest score should be kept. Score is always > 0.
     * @attribute syn
     * @aspect AliasVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/AliasVariables.jadd:926
     */
    @ASTNodeAnnotation.Attribute
    public long aliasHeuristicScore() {
        ASTNode$State state = state();
        try {
                long score = 0;
                
                // Temporary variables added during transformations should getAll lower priority
                if (!isTemporary())
                    score += 1;
                
                // Input
                score *= 10;
                if (isInput())
                    score += 1;
                
                // Parameter
                score *= 10;
                if (variability().parameterOrLess()) {
                    if (isConstant()) {
                        score += 3;
                    } else if (isIndependentParameter()) {
                        score += 2;
                    } else {
                        score += 1;
                    }
                }
                
                // Stateselect level
                score *= 100;
                FAttribute stateSelectAttribute = findAttribute(FAttribute.STATE_SELECT);
                if (isReal() && stateSelectAttribute != null) {
                    if (!stateSelectAttribute.isInDerivedType())
                        score += stateSelectAttribute().ordinal() * 10;
                    else
                        score += stateSelectAttribute().ordinal();
                }
                
                // Annotations
                score *= 10;
                if (containsActiveAnnotations())
                    score += 1;
                
                // Fixed attribute == true
                score *= 10;
                if (isFixed())
                    score += 1;
                
                // Start attribute set
                score *= 10;
                if (startAttributeSet())
                    score += 1;
                
                // Distance to user
                score *= 1000;
                score += 999 - Math.min(getFQName().numDots(), 999);
                
                return score;
        	}
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean derivativeEquivalent_computed = false;
    /**
     * @apilevel internal
     */
    protected FVariable derivativeEquivalent_value;
    /**
     * @apilevel internal
     */
    private void derivativeEquivalent_reset() {
        derivativeEquivalent_computed = false;
        derivativeEquivalent_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FVariable derivativeEquivalent() {
        if(derivativeEquivalent_computed) {
            return derivativeEquivalent_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        derivativeEquivalent_value = myFClass().getAliasManager().derivativeEquivalent(this);
        if (isFinal && num == state().boundariesCrossed) {
            derivativeEquivalent_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return derivativeEquivalent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        boolean canPropagate_value = !isOutput() && !containsActiveAnnotations();

        return canPropagate_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isScalarized() {
        ASTNode$State state = state();
        boolean isScalarized_value = getFQName().isScalarized();

        return isScalarized_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean keepBExp(FTypePrefixVariability variability, FExp bexp) {
        ASTNode$State state = state();
        boolean keepBExp_FTypePrefixVariability_FExp_value = variability.knownParameterOrLess() || isString() || (variability.parameterVariability() && bexp.isIndependentParameterExp());

        return keepBExp_FTypePrefixVariability_FExp_value;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<FVariable> bltDependencyVars() {
        ASTNode$State state = state();
        Collection<FVariable> bltDependencyVars_value = Collections.singletonList(this);

        return bltDependencyVars_value;
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = 0;

        return order_value;
    }
    @ASTNodeAnnotation.Attribute
    public DynamicStateSet dynamicStateSet() {
        ASTNode$State state = state();
        DynamicStateSet dynamicStateSet_value = myFClass().getDynamicStateManager().lookupSet(this);

        return dynamicStateSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRealVariable.StateSelect stateSelectAttribute() {
        ASTNode$State state = state();
        FRealVariable.StateSelect stateSelectAttribute_value = FRealVariable.StateSelect.DEFAULT;

        return stateSelectAttribute_value;
    }
    @ASTNodeAnnotation.Attribute
    public StateSelect stateSelection() {
        ASTNode$State state = state();
        StateSelect stateSelection_value = getTopIntegrated().stateSelectAttribute();

        return stateSelection_value;
    }
    /**
     * Checks if a variable should be exposed in the XML
     * 
     * @param FVariable A variable class.
     * @attribute syn
     * @aspect FmiXMLGenerator
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/FmiXMLCodeGen/src/jastadd/FmiXMLGenerator.jrag:325
     */
    @ASTNodeAnnotation.Attribute
    public boolean isXMLVariable() {
        ASTNode$State state = state();
        try {
            return !isPreVariable() && !isExternalObject() && (!isTemporary()
                    || isDifferentiatedVariable() || myOptions().getBooleanOption("expose_temp_vars_in_fmu"));
        }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String quantity_XML() {
        ASTNode$State state = state();
        String quantity_XML_value = quantityAttribute();

        return quantity_XML_value;
    }
    @ASTNodeAnnotation.Attribute
    public String unit_XML() {
        ASTNode$State state = state();
        String unit_XML_value = unitAttribute();

        return unit_XML_value;
    }
    @ASTNodeAnnotation.Attribute
    public String displayUnit_XML() {
        ASTNode$State state = state();
        String displayUnit_XML_value = displayUnitAttribute();

        return displayUnit_XML_value;
    }
    /**
     * @attribute syn
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:539
     */
    @ASTNodeAnnotation.Attribute
    public String variability_XML() {
        ASTNode$State state = state();
        try {
                if (variability().knownParameterOrLess()) {
                    return "constant";
                } else if (isParameter()) {
                    return "parameter";
                } else if (isDiscrete()) {
                    return "discrete";
                } else {
                    //default
                    return "continuous";
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:551
     */
    @ASTNodeAnnotation.Attribute
    public String causality_XML() {
        ASTNode$State state = state();
        try {
                if (isInput()) {
                    return "input";
                } else if (isOutput()) {
                    return "output";
                } else {
                    //default
                    return "internal";
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:561
     */
    @ASTNodeAnnotation.Attribute
    public String alias_XML() {
        ASTNode$State state = state();
        try {
                if (isAlias()) {
                    if (isNegated()) {
                        return "negatedAlias";
                    } else {
                        return "alias";
                    }
                } else {
                    return "noAlias";
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:624
     */
    @ASTNodeAnnotation.Attribute
    public String category_XML() {
        ASTNode$State state = state();
        try {
                if (isDerivativeVariable()) {
                    return "derivative";
                } else if (isDifferentiatedVariable()) {
                    return "state";
                } else if (isDependentConstant()) {
                    return "dependentConstant";
                } else if (isIndependentConstant()) {
                    return "independentConstant";
                } else if (isDependentParameter()) {
                    return "dependentParameter";
                } else if (isIndependentParameter()) {
                    return "independentParameter";
                } else {
                    return "algebraic";
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability.VariabilityCausality_C variabilityCausality_C() {
        ASTNode$State state = state();
        FTypePrefixVariability.VariabilityCausality_C variabilityCausality_C_value = variability().variabilityCausality_C(this);

        return variabilityCausality_C_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean name_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String name_C_value;
    /**
     * @apilevel internal
     */
    private void name_C_reset() {
        name_C_computed = false;
        name_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String name_C() {
        if(name_C_computed) {
            return name_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        name_C_value = isForIndex() ? 
        										name_C(null, variableIndex() + C_SUFFIX_INDEX) : 
        										name_C("");
        if (isFinal && num == state().boundariesCrossed) {
            name_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return name_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String preName_C() {
        ASTNode$State state = state();
        String preName_C_value = name_C("pre");

        return preName_C_value;
    }
    /**
     * @attribute inh
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2408
     */
    @ASTNodeAnnotation.Attribute
    public FDerivedType findFDerivedType(String name) {
        ASTNode$State state = state();
        FDerivedType findFDerivedType_String_value = getParent().Define_findFDerivedType(this, null, name);

        return findFDerivedType_String_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNameBinding
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:435
     */
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = getParent().Define_isForIndex(this, null);

        return isForIndex_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1627
     */
    @ASTNodeAnnotation.Attribute
    public FFunctionDecl containingFFunctionDecl() {
        ASTNode$State state = state();
        FFunctionDecl containingFFunctionDecl_value = getParent().Define_containingFFunctionDecl(this, null);

        return containingFFunctionDecl_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:632
     * @apilevel internal
     */
    public CommonVariableDecl Define_surroundingVariableDecl(ASTNode caller, ASTNode child) {
        if (caller == getFQNameNoTransform()) {
            return this;
        }
        else {
            return getParent().Define_surroundingVariableDecl(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1510
     * @apilevel internal
     */
    public Set<FVariable> Define_boundParameters(ASTNode caller, ASTNode child) {
        if (caller == getBindingExpOptNoTransform()) {
            return Collections.singleton(this);
        }
        else {
            return getParent().Define_boundParameters(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2662
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2672
     * @apilevel internal
     */
    public boolean Define_isInFV(ASTNode caller, ASTNode child, FVariable fv) {
        int childIndex = this.getIndexOfChild(caller);
        return fv == this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2682
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2692
     * @apilevel internal
     */
    public boolean Define_isInDerivedType(ASTNode caller, ASTNode child, FDerivedType t) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2883
     * @apilevel internal
     */
    public boolean Define_inBindingExp(ASTNode caller, ASTNode child) {
        if (caller == getBindingExpOptNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_inBindingExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2896
     * @apilevel internal
     */
    public boolean Define_inParamBindingExp(ASTNode caller, ASTNode child) {
        if (caller == getBindingExpOptNoTransform()) {
            return isParameter();
        }
        else {
            return getParent().Define_inParamBindingExp(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2900
     * @apilevel internal
     */
    public FTypePrefixVariability Define_bindingExpVariability(ASTNode caller, ASTNode child) {
        if (caller == getFAttributeListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return fParameter();
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return variability();
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:559
     * @apilevel internal
     */
    public boolean Define_inKeptBExp(ASTNode caller, ASTNode child) {
        if (caller == getBindingExpOptNoTransform()) {
            return keepBExp(variability(), getBindingExp());
        }
        else {
            return getParent().Define_inKeptBExp(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_independentConstants() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:379
     */
        if (isIndependentConstant() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_independentConstants_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_independentConstants();
    }
    protected void collect_contributors_FClass_regularIndependentParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:515
     */
        if (isRegularIndependentParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_regularIndependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_regularIndependentParameters();
    }
    protected void collect_contributors_FClass_structuralIndependentParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:542
     */
        if (isStructuralIndependentParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_structuralIndependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_structuralIndependentParameters();
    }
    protected void collect_contributors_FClass_finalIndependentParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:569
     */
        if (isFinalIndependentParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_finalIndependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_finalIndependentParameters();
    }
    protected void collect_contributors_FClass_evalIndependentParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:596
     */
        if (isEvalIndependentParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_evalIndependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_evalIndependentParameters();
    }
    protected void collect_contributors_FClass_dependentParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:623
     */
        if (isDependentParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_dependentParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_dependentParameters();
    }
    protected void collect_contributors_FClass_variables() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:794
     */
        if (!isParameter() && !isConstant() && !isPreVariable() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_variables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_variables();
    }
    protected void collect_contributors_FClass_initialParameters() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:820
     */
        if (isInitialParameter() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_initialParameters_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_initialParameters();
    }
    protected void collect_contributors_FClass_aliasVariables() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:872
     */
        if (!isParameter() && !isConstant() && isAlias()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_aliasVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_aliasVariables();
    }
    protected void collect_contributors_FClass_tempVariables() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:891
     */
        if (isTemporary() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_tempVariables_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_tempVariables();
    }
    protected void collect_contributors_FClass_variablesWithBindingExp() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:984
     */
        if (!isParameter() && !isConstant() && hasBindingExp() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_variablesWithBindingExp_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_variablesWithBindingExp();
    }
    protected void collect_contributors_FClass_inputs() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1011
     */
        if (isInput() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_inputs_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_inputs();
    }
    protected void collect_contributors_FClass_outputs() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1041
     */
        if (isOutput() && shouldContribute()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_outputs_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_outputs();
    }
    protected void contributeTo_FClass_FClass_independentConstants(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_independentConstants(collection);
        if (isIndependentConstant() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_regularIndependentParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_regularIndependentParameters(collection);
        if (isRegularIndependentParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_structuralIndependentParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_structuralIndependentParameters(collection);
        if (isStructuralIndependentParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_finalIndependentParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_finalIndependentParameters(collection);
        if (isFinalIndependentParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_evalIndependentParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_evalIndependentParameters(collection);
        if (isEvalIndependentParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_dependentParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_dependentParameters(collection);
        if (isDependentParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_variables(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_variables(collection);
        if (!isParameter() && !isConstant() && !isPreVariable() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_initialParameters(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_initialParameters(collection);
        if (isInitialParameter() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_aliasVariables(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_aliasVariables(collection);
        if (!isParameter() && !isConstant() && isAlias())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_tempVariables(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_tempVariables(collection);
        if (isTemporary() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_variablesWithBindingExp(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_variablesWithBindingExp(collection);
        if (!isParameter() && !isConstant() && hasBindingExp() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_inputs(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_inputs(collection);
        if (isInput() && shouldContribute())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_outputs(ArrayList<FVariable> collection) {
        super.contributeTo_FClass_FClass_outputs(collection);
        if (isOutput() && shouldContribute())
            collection.add(this);
    }

}
