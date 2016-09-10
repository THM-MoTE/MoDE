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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:152
 * @production InstAccess : {@link CommonAccess};

 */
public abstract class InstAccess extends CommonAccess implements Cloneable, CommonNamePart {
    /**
     * Creates a new InstAccess with the FArraySubscripts taken from the given Index.
     * 
     * @param i  the Index specifying what array subscripts to use
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2065
     */
    public InstAccess specify(Index i) {
		return specifyEach(i, new int[1]);
	}
    /**
     * Create a copy with the FArraySubscripts of each part set to match the Index.
     * 
     * @param i    the Index specifying what array subscripts to use
     * @param dim  the next dimension in <code>i</code> to use, 
     * wrapped in an array so that it can be changed by the method
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:2076
     */
    protected InstAccess specifyEach(Index i, int[] dim) {
		return (InstAccess) fullCopy();
	}
    /**
     * Evaluate an assignment with this as the left side during function evaluation.
     * 
     * @param values  constant values for the variables
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:4074
     */
    public void assignToInFuncEval(AlgorithmEvaluator evaluator, CValue right) {
        InstAccess firstPart = getFirstInstAccess();
        InstComponentDecl comp = firstPart.myInstComponentDecl();
        if (comp instanceof InstAssignable) {
            InstAssignable var = (InstAssignable) firstPart.myInstComponentDecl();
            CValue val = var.type().assignToPartInFuncEval(firstPart, var.evaluationValue(evaluator), right);
            evaluator.setEvaluationValue(var, val);
        }
    }
    /**
     * Create an access from a class name.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:417
     */
    public static InstAccess fromName(String name) {
		String[] parts = name.split("\\.");
		if (parts.length == 1) {
			return new InstParseAccess(parts[0]);
		} else {
			List<InstAccess> l = new List<InstAccess>();
			for (String part : parts)
				l.add(new InstParseAccess(part));
			return new InstDot(l);
		}
	}
    /**
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1110
     */
    public FIdUseExp createFExp() {
        return new FIdUseExp(new FIdUseInstAccess(this));
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1702
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(name());
		if (hasFArraySubscripts())
			p.print(getFArraySubscripts(), str, indent);
	}
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:161
     */
    public InstAccess buildAccessContextSizeExp(FExp.SizeContextReplacer crp) {
        List<InstAccess> res = crp.buildContext();
        for (InstAccess part : allParts()) {
            res.addChild(part.copyReplaceAccess(crp));
        }
        return new InstDot(res);
    }
    /**
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:189
     */
    public List<InstAccess> buildAccessContext(String name, FArraySubscripts fas) {
        List<InstAccess> res = accessContextInst();
        if (fas == null) {
            res.add(new InstAmbiguousAccess(name));
        } else {
            res.add(new InstAmbiguousArrayAccess(name, fas));
        }
        return res;
    }
    /**
     * @aspect FunctionCallSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:368
     */
    public FExp createSizeFExp(FExp.FunctionSizeContextReplacer crp) {
        InstComponentDecl var = myInstComponentDecl();
        InstFunctionArgument arg = crp.getMap().get(var);
        if (arg != null) {
            return arg.createSizeFExp(crp).cell(crp, getFArraySubscripts());
        } else {
            return copyReplaceAccess(crp).createFExp();
        }
    }
    /**
     * @aspect SizesUtil
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:537
     */
    public InstAccess copyReplaceAccess(FExp.ContextReplacer crp) {
        if (hasFArraySubscripts()) {
            return new InstAmbiguousArrayAccess(name(), getFArraySubscripts().copyReplaceAccess(crp));
        } else {
            return new InstAmbiguousAccess(name());
        }
    }
    /**
     * @aspect ComplianceCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:97
     */
    public void complianceCheck(ErrorCheckType checkType) {
        super.complianceCheck(checkType);
        InstComponentDecl decl = myInstComponentDecl();
        if (decl.isRecord() && hasFArraySubscripts() && inFunction() && 
                !getFArraySubscripts().variability().parameterOrLess()) {
            ONLY_FMU_NON_FIXED_RECORD_ARRAY_INDEX.invoke(this);
        }
        if (decl.isExternalObject() && !decl.inFunction() && decl.getComponentDecl().isConstant() && inFunction()) {
            EXTERNAL_OBJECT_CONSTANT_FROM_FUNCTION.invoke(this);
        }
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:758
     */
    public void forceUsesVariability(ErrorCheckType checkType, FTypePrefixVariability v) {
        myInstComponentDecl().forceVariability(checkType, v);
        forceUsesInSubscriptsVariability(checkType, v);
    }
    /**
     * @aspect ForceVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:763
     */
    public void forceUsesInSubscriptsVariability(ErrorCheckType checkType, FTypePrefixVariability v) {}
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:51
     */
    public void nameCheckAmbigous(ErrorCheckType checkType) {
        if (!isExpandableConnectorMemberInConnect()) {
            InstLookupResult<InstComponentDecl> comp = myInstLookupComponent();
            InstLookupResult<InstClassDecl> cls      = myInstLookupClass();
            if (!comp.isNotFound())
                comp.problem(this, "component", qualifiedName());
            else if (!cls.isNotFound())
                cls.problem(this, "class", qualifiedName());
            else 
                comp.problem(this, "class or component", qualifiedName());
        }
    }
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:72
     */
    public void nameCheckComponentAccess(ErrorCheckType checkType) {
        //log.debug("InstComponentAccess.nameCheck(" + checkType + "): " + name() + " " + myInstComponentDecl().name());
        if (hasLookupProblem()) {
            myInstLookup().problem(this, "component", qualifiedName());
        }
        if (!inConnectClause() && !isModificationName() && isConditional()) {
            error("The component "+qualifiedName()+" is conditional: Access of conditional components is only valid in connect statements");
        }
    }
    /**
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:90
     */
    public void generateClassLookupProblems(InstLookupResult lookup, ASTNode n) {
        if (lookup.isProblem()) {
            lookup.problem(this, n.classErrorType(), n.classErrorName());
        }
    }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:574
     */
    public void typeError() {
	  typeError(this);
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:578
     */
    protected void typeError(InstAccess top) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1222
     */
    public void typeCheck(ErrorCheckType checkType) {
//	  if (getTopInstAccess() == this && !type().isUnknown()) {
		  // TODO: if this is a slice, check that all branches are of equal size
//	  }
  }
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1236
     */
    public void checkAccessCompInClassLeft(InstAccess right, ErrorCheckType checkType) {}
    /**
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1256
     */
    public void checkAccessCompInClassRight(InstClassDecl icd, ErrorCheckType checkType) {}
    /**
     * Connect the variables referenced in a connect or branch statement in the connection set manager.
     * 
     * @param right   the other access
     * @param prefix  the prefix to use when flattening names
     * @param csm     the connection set manager to add variables to
     * @param source  the originating connect or branch statement
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1066
     */
    public void connectTo(InstAccess right, FQName prefix, ConnectionSetManager csm, ConnectionEdge source) {
        FQName leftName  = flattenAndResolveIndices(prefix);
        FQName rightName = right.flattenAndResolveIndices(prefix);
        
        boolean leftOutside  = isOutsideConnector();
        boolean rightOutside = right.isOutsideConnector();
        InstComponentDecl leftComp  = lookupEvaluatingIndices();
        InstComponentDecl rightComp = right.lookupEvaluatingIndices();
        
        boolean handleExpandable = !csm.isExpandableConnectorsDone();
        if (handleExpandable && (isExpandableConnectorPart() || right.isExpandableConnectorPart())) {
            if (isExpandableConnectorPart())
                csm.getExpandable().addIntroducingConnection(this, right, prefix, source);
            if (right.isExpandableConnectorPart())
                csm.getExpandable().addIntroducingConnection(right, this, prefix, source);
        } else if (handleExpandable && leftComp.isExpandableConnector()) {
            csm.getExpandable().addSpanningConnection(leftComp, rightComp, prefix, source);
        } else if (isArray() && !leftComp.isOverconstrainedConnection(rightComp)) {
            Indices leftInd = indices();
            Indices rightInd = right.indices();
            Iterator<Index> leftIter = leftInd.iterator();
            Iterator<Index> rightIter = rightInd.iterator();
            while (leftIter.hasNext()) {
                Index leftI = leftInd.translate(leftIter.next());
                Index rightI = rightInd.translate(rightIter.next());
                FQName leftCellName = leftName.copyReplacingSubscripts(leftI);
                FQName rightCellName = rightName.copyReplacingSubscripts(rightI);
                InstComponentDecl leftCompCell = leftComp.findCell(leftI, leftI.ndims() - leftComp.ndims());
                InstComponentDecl rightCompCell = rightComp.findCell(rightI, rightI.ndims() - rightComp.ndims());
                ConnectionSetEntry leftEntry = ConnectionSetEntry.create(leftCompCell, leftOutside, leftCellName);
                ConnectionSetEntry rightEntry = ConnectionSetEntry.create(rightCompCell, rightOutside, rightCellName);  
                leftCompCell.connectTo(leftEntry, rightEntry, prefix, csm, source, true);
            }
        } else {
            ConnectionSetEntry leftEntry = ConnectionSetEntry.create(leftComp, leftOutside, leftName);
            ConnectionSetEntry rightEntry = ConnectionSetEntry.create(rightComp, rightOutside, rightName);  
            leftComp.connectTo(leftEntry, rightEntry, prefix, csm, source, true);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:264
     */
    public void flattenMyRecord(FClass fc) {
        myInstClassDecl().flattenRecord(fc);
    }
    /**
     * Move any non-parameter indices to given list and replace with colon.
     * Copy any parameter non-scalar indices to given list.
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2051
     */
    public void extractNonParameterIndices(List<FSubscript> sub, FTypePrefixVariability v) {}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2168
     */
    public FQName flattenAssignablePart(FQName prefix) {
        return flatten(prefix);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2196
     */
    public FQName flatten(FQName prefix) { 
        if (myInstComponentDecl().isEnumLiteral())
            return myInstComponentDecl().getFQName().fullCopy();
        
        FQName base = isForIndex() ? new FQNameEmpty() : prefix;
        return flattenName(prefix, base, 0);
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2204
     */
    public FQName flattenOuterAccess(FQName prefix) { 
        return myInstComponentDecl().getFQName().copyPrefix().append(name(), flattenFAS(prefix));
    }
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2215
     */
    public FArraySubscripts flattenFAS(FQName prefix) {
        boolean arr = isArray();
        if ((!arr && hasFArraySubscripts()) || (arr && flattenFASContext())) {
            return allFArraySubscripts().get(0).flatten(prefix);
        } else {
            return null;
        }
    }
    /**
     * Flatten part of this name.
     * 
     * @param prefix  prefix to pass when flattening subscripts
     * @param base    prefix to prepend to name
     * @param first   first part of name to flatten
     * @param last    last part of name to flatten
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2248
     */
    public FQName flattenName(FQName prefix, FQName base, int first) {
        return base.copyAndAppend(name(), flattenFAS(prefix));
    }
    /**
     * Specialized flattening method for resolving loop indices during flattening.
     * Intended for use when building connection sets. Do not use for accesses in functions or size 
     * expressions.
     * 
     * @param prefix  prefix to add to name
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2268
     */
    public FQName flattenAndResolveIndices(FQName prefix) {
        FQNameFull res = new FQNameFull();
        flattenPartsAndResolveIndices(prefix, res);
        return prefix.copyAndAppend(res);
    }
    /**
     * Specialized flattening method for resolving loop indices during flattening.
     * Intended for use when building connection sets. Do not use for accesses in functions or size 
     * expressions.
     * 
     * @param prefix  prefix to add to name
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2281
     */
    protected void flattenPartsAndResolveIndices(FQName prefix, FQNameFull target) {}
    /**
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2687
     */
    public FIdUse flattenRecordName() {
        return new FIdUse(myInstClassDecl().qualifiedName());
    }
    /**
     * Lookup the specific array component corresponding to this access, using current ceval() 
     * value for indices. If no specific component can be found or this access is not to a specific 
     * element, the component for the array is returned.
     * 
     * @param array  the component node for the array
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:456
     */
    public InstComponentDecl lookupArrayElement(InstComponentDecl array) {
        return array;
    }
    /**
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:483
     */
    public InstLookupResult<InstComponentDecl> lookupArrayElement(InstLookupResult<InstComponentDecl> array) {
        if (array.isError()) {
            return array;
        }
        
        InstComponentDecl icd = lookupArrayElement(array.unresolved().target());
        if (icd == array.unresolved().target()) {
            return array;
        }
        return array.create(icd);
    }
    /**
     * Lookup component, re-evaluating any array accesses except in last component.
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:498
     */
    public InstComponentDecl lookupEvaluatingIndices() {
        InstAccess cur = getFirstInstAccess();
        InstComponentDecl icd = cur.myInstComponentDecl();
        
        InstAccess next = cur.getNextInstAccess();
        while (next != null && icd != null && !icd.isUnknown()) {
            icd = cur.lookupArrayElement(icd);
            icd = icd.memberInstComponent(next.name()).targetOrNull();
            cur = next;
            next = next.getNextInstAccess();
        }
        icd = cur.lookupArrayElement(icd);
        
        return (icd == null) ? unknownInstComponentDecl() : icd;
    }
    /**
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:658
     */
    public void populateInstRecordModificationList(
            List<InstRecordModification> list, InstValueModification org, FExp exp) {
        InstComponentDecl var = myInstComponentDecl();
        if (var.isRecord()) {
            Modification mod = org.modification();
            while (var.isArray()) {
                var = var.getInstComponentDecl(0);
            }
            for (InstComponentDecl comp : var.allInstComponentDecls()) {
                String name = comp.name();
                FExp val = exp.dynamicFExp(new FIdUseExp(new FIdUseInstAccess(copyAndAppend(name))));
                list.add(new InstValueRecordModification(mod, name, val));
            }
        }
    }
    /**
     * @aspect InstDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:170
     */
    public void dumpTree(String indent) {
  		String s = indent + dump() +": "+qualifiedName() + " at line: " + beginLine();
  		System.out.println(s);
   	}
    /**
     * Copy this access, append a name part to the copy and return the copy.
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1010
     */
    public InstDot copyAndAppend(String id) {
    	InstAccess left = fullCopy();
    	InstAccess right = createPartToAppend(id);
        return new InstDot(new List<InstAccess>().add(left).add(right));
    }
    /**
     * Create an InstAccess suitable for appending to this access.
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1025
     */
    public InstAccess createPartToAppend(String id) {
    	return new InstParseAccess(id);
    }
    /**
     * @aspect GeneralHelpers
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1778
     */
    abstract public InstAccess copy();
    /**
     * @declaredat ASTNode:1
     */
    public InstAccess() {
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
    public InstAccess clone() throws CloneNotSupportedException {
        InstAccess node = (InstAccess) super.clone();
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
    public abstract InstAccess fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:63
     */
    public abstract InstAccess treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:71
     */
    public abstract InstAccess treeCopy();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:581
     */
    @ASTNodeAnnotation.Attribute
    public abstract String name();
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:610
     */
    @ASTNodeAnnotation.Attribute
    public abstract String qualifiedName();
    @ASTNodeAnnotation.Attribute
    public int ndims() {
        ASTNode$State state = state();
        int ndims_value = 0;

        return ndims_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FArraySubscripts> allFArraySubscripts() {
        ASTNode$State state = state();
        java.util.List<FArraySubscripts> allFArraySubscripts_value = Arrays.asList(new FArraySubscripts());

        return allFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FArraySubscripts> qualifiedAllFArraySubscripts() {
        ASTNode$State state = state();
        java.util.List<FArraySubscripts> qualifiedAllFArraySubscripts_value = concatenation(surroundingFArraySubscripts(), allFArraySubscripts());

        return qualifiedAllFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size size() {
        ASTNode$State state = state();
        Size size_value = isArray() ? arraySize() : Size.SCALAR;

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size arraySize() {
        ASTNode$State state = state();
        Size arraySize_value = Size.SCALAR;

        return arraySize_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = ndims()>0;

        return isArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public Indices indices() {
        ASTNode$State state = state();
        Indices indices_value = Indices.createFromFas(qualifiedAllFArraySubscripts());

        return indices_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_value = ceval(evaluator, Index.NULL);

        return ceval_VariableEvaluator_value;
    }
    @ASTNodeAnnotation.Attribute
    public CValue ceval(VariableEvaluator evaluator, Index i) {
        ASTNode$State state = state();
        CValue ceval_VariableEvaluator_Index_value = CValue.UNKNOWN;

        return ceval_VariableEvaluator_Index_value;
    }
    @ASTNodeAnnotation.Attribute
    public CommonNamePart nextNamePart() {
        ASTNode$State state = state();
        CommonNamePart nextNamePart_value = getNextInstAccess();

        return nextNamePart_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknownSizeVarUse() {
        ASTNode$State state = state();
        boolean isUnknownSizeVarUse_value = myInstComponentDecl().isUnknownSizeVar();

        return isUnknownSizeVarUse_value;
    }
    @ASTNodeAnnotation.Attribute
    public int declarationDims() {
        ASTNode$State state = state();
        int declarationDims_value = 0;

        return declarationDims_value;
    }
    /**
     * @attribute syn
     * @aspect LinearFVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3252
     */
    @ASTNodeAnnotation.Attribute
    public boolean isIndependent(Set<? extends CommonVariableDecl> set) {
        ASTNode$State state = state();
        try {
                return !set.contains(myInstComponentDecl());
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isForIndex() {
        ASTNode$State state = state();
        boolean isForIndex_value = myInstComponentDecl().isForIndex();

        return isForIndex_value;
    }
    @ASTNodeAnnotation.Attribute
    public int numParts() {
        ASTNode$State state = state();
        int numParts_value = 1;

        return numParts_value;
    }
    @ASTNodeAnnotation.Attribute
    public Size declarationSize() {
        ASTNode$State state = state();
        Size declarationSize_value = Size.SCALAR;

        return declarationSize_value;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstAccess> buildAccessContext() {
        ASTNode$State state = state();
        List<InstAccess> buildAccessContext_value = buildAccessContext(name(), accessContextFAS());

        return buildAccessContext_value;
    }
    /**
     * @attribute syn
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:224
     */
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts accessContextFAS() {
        ASTNode$State state = state();
        try {
                FArraySubscripts res = null;
                if (declarationDims() > 0) {
                    for (FArraySubscripts fas : allFArraySubscripts()) {
                        res = fas.buildAccessContext();
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:560
     */
    @ASTNodeAnnotation.Attribute
    public FType type() {
        ASTNode$State state = state();
        try {
                if (myInstComponentDecl().isAssignable()) {
                    InstAssignable ip = (InstAssignable) myInstComponentDecl();
                    FType t = ip.type().scalarType();
                    return isArray() ? t.arrayType(size()) : t;
                } else if (myInstClassDecl().isEnum()) {
                    return myInstClassDecl().enumType();
                } else if (myInstClassDecl().isBoolean()) {
                    return myInstClassDecl().fBooleanType(size());
                } else {
                    return fUnknownType();
                }
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConditional() {
        ASTNode$State state = state();
        boolean isConditional_value = myInstComponentDecl().hasConditionalAttribute();

        return isConditional_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAccessToStream() {
        ASTNode$State state = state();
        boolean isAccessToStream_value = myInstComponentDecl().isStream();

        return isAccessToStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentSizeClass() {
        ASTNode$State state = state();
        boolean isComponentSizeClass_value = myInstClassDecl().isComponentSizeClass();

        return isComponentSizeClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutsideConnector() {
        ASTNode$State state = state();
        boolean isOutsideConnector_value = getFirstInstAccess().myInstComponentDecl().isConnector();

        return isOutsideConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnectorPart() {
        ASTNode$State state = state();
        boolean isExpandableConnectorPart_value = false;

        return isExpandableConnectorPart_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findReferencedExpandableConnector() {
        ASTNode$State state = state();
        InstComponentDecl findReferencedExpandableConnector_value = null;

        return findReferencedExpandableConnector_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess findExpandableMemberPart(InstComponentDecl expandable) {
        ASTNode$State state = state();
        InstAccess findExpandableMemberPart_InstComponentDecl_value = null;

        return findExpandableMemberPart_InstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess splitArrayAccess(int index) {
        ASTNode$State state = state();
        InstAccess splitArrayAccess_int_value = this;

        return splitArrayAccess_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAssignable topInstAssignable() {
        ASTNode$State state = state();
        InstAssignable topInstAssignable_value = (InstAssignable) myInstComponentDecl();

        return topInstAssignable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasUnknownIndices() {
        ASTNode$State state = state();
        boolean hasUnknownIndices_value = hasFArraySubscripts() && getFArraySubscripts().hasUnknownIndices();

        return hasUnknownIndices_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:298
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> qualifiedLookupInstClass(String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstClassDecl> res = qualifiedLookupInstClassUnconstrained(name);
                if (res.successful()) { // TODO: limit to only replaceable and replaced components and their children?
                    InstNode constr = lookupConstrainingInstNode();
                    if (constr != null && !constr.memberInstClass(name).successful())
                        return InstLookupResult.<InstClassDecl>constrained(res, closestConstrainingDecl());
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> qualifiedLookupInstClassUnconstrained(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> qualifiedLookupInstClassUnconstrained_String_value = InstLookupResult.notFound();

        return qualifiedLookupInstClassUnconstrained_String_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:324
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl lookupConstrainingInstClassHelper(InstAccess part, String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstClassDecl> res;
                if (part == null) {
                    res = lookupInstClass(name);
                } else {
                    InstNode parent = part.lookupConstrainingInstNode();
                    res = (parent != null) ? parent.memberInstClass(name) : InstLookupResult.<InstClassDecl>notFound();
                }
                if (!res.successful())
                    return null;
                InstClassDecl icd = res.target();
                if (!icd.hasInstConstrainingClass() || !icd.isReplaceable())
                    return icd;
                return (InstClassDecl) icd.getInstConstrainingClass().getInstNode();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClassDecl() {
        ASTNode$State state = state();
        InstClassDecl myInstClassDecl_value = unknownInstClassDecl();

        return myInstClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> myInstLookupClass() {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> myInstLookupClass_value = lookupInstClass(name());

        return myInstLookupClass_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:355
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> qualifiedLookupInstComponent(String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstComponentDecl> res = qualifiedLookupInstComponentUnconstrained(name);
                if (res.successful()) { // TODO: limit to only replaceable and replaced components and their children?
                    InstNode constr = lookupConstrainingInstNode();
                    if (constr != null && !constr.memberInstComponent(name).successful())
                        return InstLookupResult.<InstComponentDecl>constrained(res, closestConstrainingDecl());
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> qualifiedLookupInstComponentUnconstrained(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> qualifiedLookupInstComponentUnconstrained_String_value = InstLookupResult.notFound();

        return qualifiedLookupInstComponentUnconstrained_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode lookupConstrainingInstNode() {
        ASTNode$State state = state();
        InstNode lookupConstrainingInstNode_value = null;

        return lookupConstrainingInstNode_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:385
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupConstrainingInstComponentHelper(InstAccess part, String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstComponentDecl> res;
                if (part == null) {
                    res = lookupInstComponent(name);
                } else {
                    InstNode parent = part.lookupConstrainingInstNode();
                    res = (parent != null) ? parent.memberInstComponent(name) : InstLookupResult.<InstComponentDecl>notFound();
                }
                if (!res.successful())
                    return null;
                InstComponentDecl icd = res.target();
                if (!icd.isReplaceable())
                    return icd;
                return icd.constrainingInstComponentDecl();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstNode closestConstrainingDecl() {
        ASTNode$State state = state();
        InstNode closestConstrainingDecl_value = null;

        return closestConstrainingDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasLookupProblem() {
        ASTNode$State state = state();
        boolean hasLookupProblem_value = false;

        return hasLookupProblem_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl myInstComponentDecl() {
        ASTNode$State state = state();
        InstComponentDecl myInstComponentDecl_value = unknownInstComponentDecl();

        return myInstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> myInstLookupComponent() {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> myInstLookupComponent_value = lookupInstComponent(name());

        return myInstLookupComponent_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<? extends InstLookupResult.Item> myInstLookup() {
        ASTNode$State state = state();
        InstLookupResult<? extends InstLookupResult.Item> myInstLookup_value = myInstLookupClass();

        return myInstLookup_value;
    }
    @ASTNodeAnnotation.Attribute
    public FRecordType recordType() {
        ASTNode$State state = state();
        FRecordType recordType_value = myInstClassDecl().recordType();

        return recordType_value;
    }
    @ASTNodeAnnotation.Attribute
    public Set<InstComponentDecl> accessedVarSet() {
        ASTNode$State state = state();
        Set<InstComponentDecl> accessedVarSet_value = Collections.singleton(myInstComponentDecl());

        return accessedVarSet_value;
    }
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability indexVariability() {
        ASTNode$State state = state();
        FTypePrefixVariability indexVariability_value = fConstant();

        return indexVariability_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isAssignable() {
        ASTNode$State state = state();
        boolean isAssignable_value = myInstComponentDecl().isAssignable();

        return isAssignable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = true;

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingTypeOfClass() {
        ASTNode$State state = state();
        InstNode constrainingTypeOfClass_value = myInstClassDecl().constrainingInstType();

        return constrainingTypeOfClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public String lastName() {
        ASTNode$State state = state();
        String lastName_value = name();

        return lastName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String enclosingName() {
        ASTNode$State state = state();
        String enclosingName_value = "";

        return enclosingName_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getLastInstAccess() {
        ASTNode$State state = state();
        InstAccess getLastInstAccess_value = this;

        return getLastInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getFirstInstAccess() {
        ASTNode$State state = state();
        InstAccess getFirstInstAccess_value = this;

        return getFirstInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<InstAccess> allParts() {
        ASTNode$State state = state();
        Iterable<InstAccess> allParts_value = Arrays.asList(this);

        return allParts_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstAccess getTopInstAccess() {
        ASTNode$State state = state();
        InstAccess getTopInstAccess_value = retrieveTopInstAccess(this);

        return getTopInstAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getLastFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getLastFArraySubscripts_value = getLastInstAccess().getFArraySubscripts();

        return getLastFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public FArraySubscripts getFArraySubscripts() {
        ASTNode$State state = state();
        FArraySubscripts getFArraySubscripts_value = null;

        return getFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFArraySubscripts() {
        ASTNode$State state = state();
        boolean hasFArraySubscripts_value = false;

        return hasFArraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentAccess() {
        ASTNode$State state = state();
        boolean isComponentAccess_value = false;

        return isComponentAccess_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClassAccess() {
        ASTNode$State state = state();
        boolean isClassAccess_value = false;

        return isClassAccess_value;
    }
    /**
     * @attribute syn
     * @aspect Slices
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1047
     */
    @ASTNodeAnnotation.Attribute
    public boolean isSlice() {
        ASTNode$State state = state();
        try {
                java.util.List<FArraySubscripts> l = allFArraySubscripts();
                int last = l.size() - 1;
                for (int i = 0; i < last; i++) {
                    if (l.get(i).ndims() > 0) {
                        return true;
                    }
                }
                return l.get(last).isSlice();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDisabled() {
        ASTNode$State state = state();
        boolean isDisabled_value = false;

        return isDisabled_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstCallable myInstCallable() {
        ASTNode$State state = state();
        InstCallable myInstCallable_value = myInstLookupCallable().target(INST_UNKNOWN_CALLABLE, this);

        return myInstCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstCallable> myInstLookupCallable() {
        ASTNode$State state = state();
        InstLookupResult<InstCallable> myInstLookupCallable_value = myInstLookup().asCallable();

        return myInstLookupCallable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean matches(String str) {
        ASTNode$State state = state();
        boolean matches_String_value = name().equals(str);

        return matches_String_value;
    }
    /**
     * @attribute syn
     * @aspect Derivatives
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:529
     */
    @ASTNodeAnnotation.Attribute
    public InstDerExp createDerExp(int order) {
        ASTNode$State state = state();
        try {
                FExp use = new FIdUseExp(new FIdUseInstAccess(fullCopy()));
                return (order == 1) ? new InstDerExp(use) : new InstHDerExp(use, order);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String toString_C(CodePrinter p) {
        ASTNode$State state = state();
        String toString_C_CodePrinter_value = myInstLookupComponent().target().name_C();

        return toString_C_CodePrinter_value;
    }
    /**
     * Get the expanded FArraySubscripts for any surrounding components.
     * @attribute inh
     * @aspect Arrays
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:361
     */
    @ASTNodeAnnotation.Attribute
    public ArrayList<FArraySubscripts> surroundingFArraySubscripts() {
        ASTNode$State state = state();
        ArrayList<FArraySubscripts> surroundingFArraySubscripts_value = getParent().Define_surroundingFArraySubscripts(this, null);

        return surroundingFArraySubscripts_value;
    }
    /**
     * Perform constant evaluation of an access to a record member.
     * @attribute inh
     * @aspect ConstantEvaluation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ConstantEvaluation.jrag:2556
     */
    @ASTNodeAnnotation.Attribute
    public CValue cevalRecordMember(VariableEvaluator evaluator, InstNamedAccess access) {
        ASTNode$State state = state();
        CValue cevalRecordMember_VariableEvaluator_InstNamedAccess_value = getParent().Define_cevalRecordMember(this, null, evaluator, access);

        return cevalRecordMember_VariableEvaluator_InstNamedAccess_value;
    }
    /**
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1600
     */
    @ASTNodeAnnotation.Attribute
    public boolean inFunction() {
        ASTNode$State state = state();
        boolean inFunction_value = getParent().Define_inFunction(this, null);

        return inFunction_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1909
     */
    @ASTNodeAnnotation.Attribute
    public boolean inConnectClause() {
        ASTNode$State state = state();
        boolean inConnectClause_value = getParent().Define_inConnectClause(this, null);

        return inConnectClause_value;
    }
    /**
     * @attribute inh
     * @aspect AccessSizes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Sizes.jrag:209
     */
    @ASTNodeAnnotation.Attribute
    public List<InstAccess> accessContextInst() {
        ASTNode$State state = state();
        List<InstAccess> accessContextInst_value = getParent().Define_accessContextInst(this, null);

        return accessContextInst_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1139
     */
    @ASTNodeAnnotation.Attribute
    public boolean isModificationName() {
        ASTNode$State state = state();
        boolean isModificationName_value = getParent().Define_isModificationName(this, null);

        return isModificationName_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:114
     */
    @ASTNodeAnnotation.Attribute
    public boolean isExpandableConnectorMemberInConnect() {
        ASTNode$State state = state();
        boolean isExpandableConnectorMemberInConnect_value = getParent().Define_isExpandableConnectorMemberInConnect(this, null);

        return isExpandableConnectorMemberInConnect_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceNameCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:119
     */
    @ASTNodeAnnotation.Attribute
    public boolean inConnectWithExistingComponent() {
        ASTNode$State state = state();
        boolean inConnectWithExistingComponent_value = getParent().Define_inConnectWithExistingComponent(this, null);

        return inConnectWithExistingComponent_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:608
     */
    @ASTNodeAnnotation.Attribute
    public boolean inCardinality() {
        ASTNode$State state = state();
        boolean inCardinality_value = getParent().Define_inCardinality(this, null);

        return inCardinality_value;
    }
    /**
     * Get the list of constants that need to be added to the surrounding function.
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:755
     */
    @ASTNodeAnnotation.Attribute
    public Set<InstAssignable> functionConstantList() {
        ASTNode$State state = state();
        Set<InstAssignable> functionConstantList_value = getParent().Define_functionConstantList(this, null);

        return functionConstantList_value;
    }
    /**
     * @attribute inh
     * @aspect FlatteningDebug
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1787
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2139
     */
    @ASTNodeAnnotation.Attribute
    public String findTempVarName(InstComponentDecl var) {
        ASTNode$State state = state();
        String findTempVarName_InstComponentDecl_value = getParent().Define_findTempVarName(this, null, var);

        return findTempVarName_InstComponentDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2224
     */
    @ASTNodeAnnotation.Attribute
    public boolean flattenFASContext() {
        ASTNode$State state = state();
        boolean flattenFASContext_value = getParent().Define_flattenFASContext(this, null);

        return flattenFASContext_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:27
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClass_String_value = getParent().Define_lookupInstClass(this, null, name);

        return lookupInstClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:138
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassFromTop(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassFromTop_String_value = getParent().Define_lookupInstClassFromTop(this, null, name);

        return lookupInstClassFromTop_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:319
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl lookupConstrainingInstClass(String name) {
        ASTNode$State state = state();
        InstClassDecl lookupConstrainingInstClass_String_value = getParent().Define_lookupConstrainingInstClass(this, null, name);

        return lookupConstrainingInstClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:317
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);

        return lookupInstComponent_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:380
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupConstrainingInstComponent(String name) {
        ASTNode$State state = state();
        InstComponentDecl lookupConstrainingInstComponent_String_value = getParent().Define_lookupConstrainingInstComponent(this, null, name);

        return lookupConstrainingInstComponent_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:409
     */
    @ASTNodeAnnotation.Attribute
    public InstNode findClosestConstrainingInstNode() {
        ASTNode$State state = state();
        InstNode findClosestConstrainingInstNode_value = getParent().Define_findClosestConstrainingInstNode(this, null);

        return findClosestConstrainingInstNode_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:431
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> localLookupInstComponent(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> localLookupInstComponent_String_value = getParent().Define_localLookupInstComponent(this, null, name);

        return localLookupInstComponent_String_value;
    }
    /**
     * Here a few cases are classified based on their context.
     * @attribute inh
     * @aspect InstNameClassification
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstNameClassification.jrag:94
     */
    @ASTNodeAnnotation.Attribute
    public Kind kind() {
        ASTNode$State state = state();
        Kind kind_value = getParent().Define_kind(this, null);

        return kind_value;
    }
    /**
     * Find the component that this access should be evaluated in.
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2146
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl containingInstComponent() {
        ASTNode$State state = state();
        InstComponentDecl containingInstComponent_value = getParent().Define_containingInstComponent(this, null);

        return containingInstComponent_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:908
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess getNextInstAccess() {
        ASTNode$State state = state();
        InstAccess getNextInstAccess_value = getParent().Define_getNextInstAccess(this, null);

        return getNextInstAccess_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:968
     */
    @ASTNodeAnnotation.Attribute
    public InstAccess retrieveTopInstAccess(InstAccess pre) {
        ASTNode$State state = state();
        InstAccess retrieveTopInstAccess_InstAccess_value = getParent().Define_retrieveTopInstAccess(this, null, pre);

        return retrieveTopInstAccess_InstAccess_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:977
     */
    @ASTNodeAnnotation.Attribute
    public boolean inQualified() {
        ASTNode$State state = state();
        boolean inQualified_value = getParent().Define_inQualified(this, null);

        return inQualified_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1143
     * @apilevel internal
     */
    public boolean Define_myAccessExists(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return !myInstComponentDecl().isUnknown();
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:922
     * @apilevel internal
     */
    public InstAccess Define_myInstAccess(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_collectInstAccesses() {
    /**
     * @attribute coll
     * @aspect FlatteningDebug
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1784
     */
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_collectInstAccesses_contributors().add(this);
                }
            }
        super.collect_contributors_FClass_collectInstAccesses();
    }
    protected void contributeTo_FClass_FClass_collectInstAccesses(HashSet<InstAccess> collection) {
        super.contributeTo_FClass_FClass_collectInstAccesses(collection);
        collection.add(this);
    }

}
