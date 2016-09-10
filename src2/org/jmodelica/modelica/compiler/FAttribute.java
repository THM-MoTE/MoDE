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
 * Representation of an attribute for a built-in types.
 * 
 * The attributes (start, unit etc.) of the built-in types are represented by
 * objects of the FAttribute class, which in turned are stored in the 
 * FVariables. FAttributes contain information about the attribute name and
 * type, its value, whether it is set explicitly by the user and the prefixes
 * each and final. 
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:480
 * @production FAttribute : {@link BaseNode} ::= <span class="component">Type:{@link FIdUse}</span> <span class="component">Name:{@link FIdDecl}</span> <span class="component">[Value:{@link FExp}]</span> <span class="component">&lt;AttributeSet:boolean&gt;</span> <span class="component">&lt;Level:int&gt;</span> <span class="component">[{@link FEach}]</span> <span class="component">[{@link FFinal}]</span> <span class="component">{@link FAttribute}*</span>;

 */
public class FAttribute extends BaseNode implements Cloneable {
    /**
     * Apply any binding expressions for record members to a record CValue.
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3165
     */
    public void applyToCValue(VariableEvaluator evaluator, CValueRecord rec, Index i) {
	  if (rec.members().containsKey(name())) {
		  int j = rec.members().get(name());
		  if (hasValue()) {
			  CValue val = getValue().ceval(evaluator);
			  if (i != Index.NULL && rec.getMember(j).size().ndims() + i.ndims() == val.size().ndims())
				  val = val.array().getPart(i);
			  if (!rec.getMember(j).isUnknown())
				  rec.setMember(j, val);
		  } else {
			  if (!rec.getMember(j).isUnknown())
				  rec.getMember(j).applyAttributes(getFAttributes(), i);
		  }
	  }
  }
    /**
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:3902
     */
    public Map<CommonVariableDecl,CValue> collectEvaluationValues(Map<CommonVariableDecl,CValue> map) {
        return map;
    }
    /**
     * Create an attribute with only the required children.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:842
     */
    public FAttribute(FIdUse typeName, FIdDecl name, boolean isSet, int level) {
		this(typeName, name, new Opt(), isSet, level, new Opt(), new Opt(), new List());
	}
    /**
     * Create an attribute with only the required children.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:849
     */
    public FAttribute(String typeName, String name, boolean isSet, int level) {
        this(new FIdUse(typeName), new FIdDecl(name), isSet, level);
    }
    /**
     * Create an attribute with only the required children and a value.
     * 
     * The value may be <code>null</code>, then no value is set.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:858
     */
    public FAttribute(FIdUse typeName, FIdDecl name, FExp value, boolean isSet, int level) {
		this(typeName, name, 
				(value == null ? new Opt() : new Opt(value)), 
				isSet, level, new Opt(), new Opt(), new List());
	}
    /**
     * Create an attribute with only the required children and a value.
     * 
     * The value may be <code>null</code>, then no value is set.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:869
     */
    public FAttribute(String typeName, String name, FExp value, boolean isSet, int level) {
        this(new FIdUse(typeName), new FIdDecl(name), value, isSet, level);
    }
    /**
     * @aspect InheritedFactoryMethods
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:1409
     */
    public FAttribute createEmptyNode()         { return new FAttribute(); }
    /**
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2064
     */
    @Override
    public void findFIdUseExpsInTree(Set<FIdUseExp> set, FIdUseExpLookupVisitor visitor) {
    }
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2391
     */
    public static final String QUANTITY     = "quantity";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2392
     */
    public static final String UNIT         = "unit";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2393
     */
    public static final String DISPLAY_UNIT = "displayUnit";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2394
     */
    public static final String MIN          = "min";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2395
     */
    public static final String MAX          = "max";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2396
     */
    public static final String START        = "start";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2397
     */
    public static final String FIXED        = "fixed";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2398
     */
    public static final String NOMINAL      = "nominal";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2399
     */
    public static final String STATE_SELECT = "stateSelect";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2400
     */
    public static final String SIZE         = "size()";
    /**
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2402
     */
    public static final String STATE_SELECT_TYPE = "StateSelect";
    /**
     * @aspect FlatDiagnostics
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3697
     */
    public void attributeLevels(StringBuilder str) {
        str.append(name());
        str.append(":");
        str.append(getLevel());
        attributeLevelsForList(getFAttributes(), str);
        if (hasValue()) {
            str.append("=");
            str.append(getValue());
        }
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1135
     */
    public boolean shouldPrettyPrint(Printer p) {
        if (p.inAnnotation())
            return  isAnnotation();
        return getAttributeSet() && (isModification() || isInternal());

    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1142
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
			
						if (hasFEach())
							str.print("each ");
						if (hasFFinal())
							str.print("final ");	
		    			str.print(getName().name());
		    			getFAttributeList().prettyPrintFAttributeList(str, p);
		    			if (hasValue()) {
		    				str.print(" = ");
	    					p.print(getValue(),str,"");
						}
	}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1803
     */
    public FAttribute flatten(FQName prefix) {
        FAttribute flat = createEmptyNode();
        flat.setType(getType().fullCopy());
        flat.setName(getName().fullCopy());
        if (hasValue())
            flat.setValue(getValue().flatten(prefix));
        flat.setLevel(getLevel());
        if (hasFEach())
            flat.setFEach(getFEach().fullCopy());
        if (hasFFinal())
            flat.setFFinal(getFFinal().fullCopy());
        List<FAttribute> flatAttrs = new List<FAttribute>();
        for (FAttribute attr : getFAttributes())
            flatAttrs.add(attr.flatten(prefix));
        flat.setFAttributeList(flatAttrs);
        return flat;
    }
    /**
     * Removing all array-valued attributes.
     * 
     * @return  true if the attribute should be removed
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:326
     */
    public boolean removeArrayValuedAttributes() {
		boolean keep = false;
		List<FAttribute> list = null;
		if (getNumFAttribute() > 0) {
			list = new List<FAttribute>();
			for (FAttribute a : getFAttributes())
				if (!a.removeArrayValuedAttributes())
					list.add(a);
			keep = list.getNumChild() > 0;
		}
		if (hasValue()) {
			if (getValue().isArray()) {
				if (keep)
					setValueOpt(new Opt());
			} else {
				keep = true;
			}
		}
		if (keep && list != null)
			setFAttributeList(list);
		return !keep;
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:394
     */
    public void createArrayTemporaries(Scalarizer.Variable s, FTypePrefixVariability variability, FType type) {
        type = type.componentType(name());
        if (type.isUnknown()) {
            variability = ASTNode.fParameter();
        } else {
            variability = variability.component(name());
        }
        if (hasValue()) {
            getValue().createArrayTemporaries(s.select(variability));
        }
        for (FAttribute fab : getFAttributes()) {
            fab.createArrayTemporaries(s, variability, type);
        }
    }
    /**
     * Copy any attributes with array values to the given list, selecting the scalar value corresponding 
     * to the given index. 
     * 
     * @return  true if any attribute was added to the list 
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:483
     */
    protected boolean addArrayAttributesTo(Index i, List<FAttribute> list) {
		FAttribute match = findMatching(list, getName().name());
		if (match != null) {
			list = match.getFAttributes();
			for (FAttribute a : getFAttributes())
				a.addArrayAttributesTo(i, list);
			return false;
		}
		
		boolean isArray = hasValue() && getValue().isArray();
		boolean add = isArray;
		List<FAttribute> subList = null;
		if (add || getNumFAttribute() > 0) {
			subList = new List<FAttribute>();
			for (FAttribute a : getFAttributes())
				add = a.addArrayAttributesTo(i, subList) || add;
		}
		if (add) {
			FAttribute res = new FAttribute(getType().fullCopy(), getName().fullCopy(), new Opt(), 
					getAttributeSet(), getLevel(), getFEachOpt().fullCopy(), getFFinalOpt().fullCopy(), subList);
			if (hasValue()) {
				FExp val = getValue();
				if (isArray) {
					if (val.ndims() < i.ndims())
						i = i.subIndex(i.ndims() - val.ndims());
					val = val.getArray().get(i);
				}
				res.setValue(val.scalarize(Collections.<String,FExp>emptyMap()));
			}
			list.add(res);
		}
		return add;
	}
    /**
     * Create a copy of the attibute with dimensions removed from all array expressions according 
     * to an index.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:748
     */
    public FAttribute copyForCell(Index i) {
        if (i == Index.NULL)
			return fullCopy();
		FAttribute res = createEmptyNode();
		res.setType(getType().fullCopy());
		res.setName(getName().fullCopy());
        res.setLevel(getLevel());
		if (hasValue()) {
			FExp val = getValue();
			if (val.ndims() < i.ndims() || isInternal())
				val = val.scalarize(Collections.<String,FExp>emptyMap());
			else
				val = val.dynamicFExp(val.splitArrayExp(i).unboundCopy()).scalarize(Collections.<String,FExp>emptyMap());
			res.setValue(val);
		}
		res.setAttributeSet(getAttributeSet());
		if (hasFEach())
			res.setFEach(getFEach().fullCopy());
		if (hasFFinal())
			res.setFFinal(getFFinal().fullCopy());
		for (FAttribute a : getFAttributes())
			res.addFAttribute(a.copyForCell(i));
		return res;
	}
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:773
     */
    public void scalarize(List<FAttribute> attrs, Index i, Map<String,FExp> indexMap) {
        if (!name().equals(FAttribute.SIZE)) {
            scalarizeInternal(attrs, i, indexMap);
        }
    }
    /**
     * Scalarize the attribute, picking out the specific element from an array 
     * expression or removing "each".
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:782
     */
    public FAttribute scalarizeInternal(List<FAttribute> attrs, Index i, Map<String,FExp> indexMap) {
        FAttribute attr = createEmptyNode();
        for (FAttribute a : getFAttributes())  // TODO: can they be nestled at this point?
            a.scalarize(attr.getFAttributes(), i, indexMap);            // TODO: really send i here?
        attr.setType(getType().fullCopy());
        attr.setName(getName().fullCopy());
        attr.setAttributeSet(getAttributeSet());
        attr.setLevel(getLevel());
        attr.setFFinalOpt(getFFinalOpt().fullCopy());
        if (hasValue()) 
            attr.setValue(scalarizeValue(i, indexMap));
        attrs.add(attr);
        return attr;
    }
    /**
     * Scalarize the attribute and create multiple instances for non-scalar
     * attributes.
     * An attribute is scalarized if it has no value and all its child
     * attributes have value and are of the same size.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:810
     */
    public void scalarize(List<FAttribute> attrs, Map<String,FExp> indexMap) {
        if (hasValue()) {
            scalarizeInternal(attrs, Index.NULL, indexMap);
        } else {
            Size size = null;
            boolean keepScalar = false;
            for (FAttribute attr : getFAttributes()) {
                if (!attr.hasValue())
                    keepScalar = true;
                else if (size == null)
                    size = attr.getValue().size();
                else if (!attr.hasFEach() && !attr.getValue().size().equals(size))
                    keepScalar = true;
            }
            if (size == null || keepScalar)
                size = Size.SCALAR;
            for (Index i : Indices.create(size)) {
                scalarizeInternal(attrs, i, indexMap);
            }
        }
    }
    /**
     * Scalarize the value of this attribute, picking out the specific element from an array 
     * expression.
     * 
     * Returns null if attribute has no value.
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:838
     */
    public FExp scalarizeValue(Index i, Map<String,FExp> indexMap) {
        if (!hasValue()) 
            return null;
        FExp v = getValue();
        if (inFunction())
            return v.scalarizeExp(indexMap);
        if (v.isArray()) {
            i = i.subIndex(i.ndims() - v.ndims());
            v = v.getArray().get(i);
        }
        return v.scalarize(indexMap);
    }
    /**
     * @declaredat ASTNode:1
     */
    public FAttribute() {
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
        children = new ASTNode[6];
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new List(), 5);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FAttribute(FIdUse p0, FIdDecl p1, Opt<FExp> p2, boolean p3, int p4, Opt<FEach> p5, Opt<FFinal> p6, List<FAttribute> p7) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setAttributeSet(p3);
        setLevel(p4);
        setChild(p5, 3);
        setChild(p6, 4);
        setChild(p7, 5);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:30
     */
    protected int numChildren() {
        return 6;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:36
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:42
     */
    public void flushAttrCache() {
        super.flushAttrCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:48
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:54
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:60
     */
    public FAttribute clone() throws CloneNotSupportedException {
        FAttribute node = (FAttribute) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:67
     */
    public FAttribute copy() {
        try {
            FAttribute node = (FAttribute) clone();
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
     * @declaredat ASTNode:86
     */
    public FAttribute fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:95
     */
    public FAttribute treeCopyNoTransform() {
        FAttribute tree = (FAttribute) copy();
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
     * @declaredat ASTNode:115
     */
    public FAttribute treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:122
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node) && (tokenboolean_AttributeSet == ((FAttribute)node).tokenboolean_AttributeSet) && (tokenint_Level == ((FAttribute)node).tokenint_Level);    
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FIdUse node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FIdUse getType() {
        return (FIdUse) getChild(0);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FIdUse getTypeNoTransform() {
        return (FIdUse) getChildNoTransform(0);
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(FIdDecl node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public FIdDecl getName() {
        return (FIdDecl) getChild(1);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public FIdDecl getNameNoTransform() {
        return (FIdDecl) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Value child. This is the <code>Opt</code>
     * node containing the child Value, not the actual child!
     * @param opt The new node to be used as the optional node for the Value child.
     * @apilevel low-level
     */
    public void setValueOpt(Opt<FExp> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Value child.
     * @param node The new node to be used as the Value child.
     * @apilevel high-level
     */
    public void setValue(FExp node) {
        getValueOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Value child exists.
     * @return {@code true} if the optional Value child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasValue() {
        return getValueOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Value child.
     * @return The Value child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FExp getValue() {
        return (FExp) getValueOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Value child. This is the <code>Opt</code> node containing the child Value, not the actual child!
     * @return The optional node for child the Value child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Value")
    public Opt<FExp> getValueOpt() {
        return (Opt<FExp>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Value. This is the <code>Opt</code> node containing the child Value, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Value.
     * @apilevel low-level
     */
    public Opt<FExp> getValueOptNoTransform() {
        return (Opt<FExp>) getChildNoTransform(2);
    }
    /**
     * Replaces the lexeme AttributeSet.
     * @param value The new value for the lexeme AttributeSet.
     * @apilevel high-level
     */
    public void setAttributeSet(boolean value) {
        tokenboolean_AttributeSet = value;
    }
    /**
     * @apilevel internal
     */
    protected boolean tokenboolean_AttributeSet;
    /**
     * Retrieves the value for the lexeme AttributeSet.
     * @return The value for the lexeme AttributeSet.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="AttributeSet")
    public boolean getAttributeSet() {
        return tokenboolean_AttributeSet;
    }
    /**
     * Replaces the lexeme Level.
     * @param value The new value for the lexeme Level.
     * @apilevel high-level
     */
    public void setLevel(int value) {
        tokenint_Level = value;
    }
    /**
     * @apilevel internal
     */
    protected int tokenint_Level;
    /**
     * Retrieves the value for the lexeme Level.
     * @return The value for the lexeme Level.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Token(name="Level")
    public int getLevel() {
        return tokenint_Level;
    }
    /**
     * Replaces the optional node for the FEach child. This is the <code>Opt</code>
     * node containing the child FEach, not the actual child!
     * @param opt The new node to be used as the optional node for the FEach child.
     * @apilevel low-level
     */
    public void setFEachOpt(Opt<FEach> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) FEach child.
     * @param node The new node to be used as the FEach child.
     * @apilevel high-level
     */
    public void setFEach(FEach node) {
        getFEachOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FEach child exists.
     * @return {@code true} if the optional FEach child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFEach() {
        return getFEachOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FEach child.
     * @return The FEach child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FEach getFEach() {
        return (FEach) getFEachOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FEach child. This is the <code>Opt</code> node containing the child FEach, not the actual child!
     * @return The optional node for child the FEach child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FEach")
    public Opt<FEach> getFEachOpt() {
        return (Opt<FEach>) getChild(3);
    }
    /**
     * Retrieves the optional node for child FEach. This is the <code>Opt</code> node containing the child FEach, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FEach.
     * @apilevel low-level
     */
    public Opt<FEach> getFEachOptNoTransform() {
        return (Opt<FEach>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the FFinal child. This is the <code>Opt</code>
     * node containing the child FFinal, not the actual child!
     * @param opt The new node to be used as the optional node for the FFinal child.
     * @apilevel low-level
     */
    public void setFFinalOpt(Opt<FFinal> opt) {
        setChild(opt, 4);
    }
    /**
     * Replaces the (optional) FFinal child.
     * @param node The new node to be used as the FFinal child.
     * @apilevel high-level
     */
    public void setFFinal(FFinal node) {
        getFFinalOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional FFinal child exists.
     * @return {@code true} if the optional FFinal child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFFinal() {
        return getFFinalOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) FFinal child.
     * @return The FFinal child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FFinal getFFinal() {
        return (FFinal) getFFinalOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the FFinal child. This is the <code>Opt</code> node containing the child FFinal, not the actual child!
     * @return The optional node for child the FFinal child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="FFinal")
    public Opt<FFinal> getFFinalOpt() {
        return (Opt<FFinal>) getChild(4);
    }
    /**
     * Retrieves the optional node for child FFinal. This is the <code>Opt</code> node containing the child FFinal, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child FFinal.
     * @apilevel low-level
     */
    public Opt<FFinal> getFFinalOptNoTransform() {
        return (Opt<FFinal>) getChildNoTransform(4);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 5);
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
        List<FAttribute> list = (List<FAttribute>) getChild(5);
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
        return (List<FAttribute>) getChildNoTransform(5);
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
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = getName().name().equals(str);

        return matches_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public FAttribute findAttribute(String name) {
        ASTNode$State state = state();
        FAttribute findAttribute_String_value = findMatching(getFAttributes(), name);

        return findAttribute_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getName().name();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isModification() {
        ASTNode$State state = state();
        boolean isModification_value = true;

        return isModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInternal() {
        ASTNode$State state = state();
        boolean isInternal_value = false;

        return isInternal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAnnotation() {
        ASTNode$State state = state();
        boolean isAnnotation_value = false;

        return isAnnotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotationNode() {
        ASTNode$State state = state();
        AnnotationNode annotationNode_value = new FAttributeAnnotationNode(this);

        return annotationNode_value;
    }
    /**
     * Check if this attribute is in an FVariable.
     * @attribute inh
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2662
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInFV() {
        ASTNode$State state = state();
        boolean isInFV_value = getParent().Define_isInFV(this, null);

        return isInFV_value;
    }
    /**
     * Check if this attribute is in a specific FVariable.
     * @attribute inh
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2672
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInFV(FVariable fv) {
        ASTNode$State state = state();
        boolean isInFV_FVariable_value = getParent().Define_isInFV(this, null, fv);

        return isInFV_FVariable_value;
    }
    /**
     * Check if this attribute is in an FDerivedType.
     * @attribute inh
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2682
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInDerivedType() {
        ASTNode$State state = state();
        boolean isInDerivedType_value = getParent().Define_isInDerivedType(this, null);

        return isInDerivedType_value;
    }
    /**
     * Check if this attribute is in a specific FDerivedType.
     * @attribute inh
     * @aspect Attributes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2692
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInDerivedType(FDerivedType t) {
        ASTNode$State state = state();
        boolean isInDerivedType_FDerivedType_value = getParent().Define_isInDerivedType(this, null, t);

        return isInDerivedType_FDerivedType_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1608
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:517
     * @apilevel internal
     */
    public boolean Define_inAttributeValue(ASTNode caller, ASTNode child) {
        if (caller == getValueOptNoTransform()) {
            return true;
        }
        else {
            return getParent().Define_inAttributeValue(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
