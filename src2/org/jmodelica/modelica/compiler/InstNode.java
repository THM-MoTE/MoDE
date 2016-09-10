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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/InstanceTree.ast:17
 * @production InstNode : {@link BaseNode} ::= <span class="component">{@link InstComponentDecl}*</span> <span class="component">{@link InstClassDecl}*</span> <span class="component">{@link InstExtends}*</span> <span class="component">{@link InstImport}*</span> <span class="component">RedeclaredInstClassDecl:{@link InstClassDecl}*</span> <span class="component">{@link FAbstractEquation}*</span> <span class="component">ElementInstModification:{@link InstModification}*</span> <span class="component">{@link FQName}</span>;

 */
public abstract class InstNode extends BaseNode implements Cloneable, InstLookupRedirectNode, AllInstComponentSource, AllInstClassSource {
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:258
     */
    public void checkContentsOKInExternalObject() {
		for (InstExtends ie : getInstExtendss())
			ie.checkContentsOKInExternalObject();
		boolean ok = true;
		for (InstClassDecl icd : getInstClassDecls())
			if (!icd.name().equals("constructor") && !icd.name().equals("destructor"))
				ok = false;
		if (getNumInstComponentDecl() > 0)
			ok = false;
		if (getNumRedeclaredInstClassDecl() > 0)
			ok = false;
		if (getNumFAbstractEquation() > 0)
			ok = false;
		if (!ok)
			error("External object classes may not contain any elements except the constructor and destructor");
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:613
     */
    public void resetCollectErrors() {
		super.resetCollectErrors();
		resetCollectErrorsOn(getInstComponentDeclListNoTransform());
		resetCollectErrorsOn(getInstClassDeclListNoTransform());
		resetCollectErrorsOn(getInstExtendsListNoTransform());
		resetCollectErrorsOn(getInstImportListNoTransform());
		resetCollectErrorsOn(getRedeclaredInstClassDeclListNoTransform());
		resetCollectErrorsOn(getFAbstractEquationListNoTransform());
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:623
     */
    public void collectErrors(ErrorCheckType checkType) {
    if (!errorChecked) {
      errorChecked = true;
	  allChecks(checkType);
	  for (InstNode n : getInstComponentDecls()) 
		  n.collectErrors(checkType);
	  for (InstNode n : getInstExtendss()) 
		  n.collectErrors(checkType);
	  for (FAbstractEquation e : getFAbstractEquations()) 
		  e.collectErrors(checkType);
	}
  }
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1059
     */
    public void checkRedeclares(ErrorCheckType checkType) {
	    if (!errorChecked) {
	        for (InstNode n : getInstComponentDecls()) 
	            n.checkRedeclares(checkType);
	        for (InstNode n : getInstExtendss()) 
	            n.checkRedeclares(checkType);
	      }
	}
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1483
     */
    protected static final byte RECURSIVE_UNKNOWN = 0;
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1484
     */
    protected static final byte RECURSIVE_YES     = 1;
    /**
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1485
     */
    protected static final byte RECURSIVE_NO      = 2;
    /**
     * Find all duplicates among child components.
     * @aspect DuplicateComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:159
     */
    public void calculateDuplicates() {
        Map<String,InstComponentDecl> map = new HashMap<String,InstComponentDecl>();
        for (InstComponentDecl comp : allInstComponentDecls()) 
            comp.calculateDuplicate(map);
    }
    /**
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:1245
     */
    public void buildConnectionSets(FQName prefix, ConnectionSetManager csm, boolean connect) {
		prefix = getFQName();
		for (FAbstractEquation ae : getFAbstractEquations()) 
		   ae.buildConnectionSets(prefix, csm, connect);
		getInstComponentDeclList().buildConnectionSets(prefix, csm, connect);
		getInstExtendsList().buildConnectionSets(prefix, csm, connect);
	}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:131
     */
    public void flattenUsedFuncsAndEnums(FClass fc) {
        getInstComponentDeclList().flattenUsedFuncsAndEnums(fc);
        getFAbstractEquationList().flattenUsedFuncsAndEnums(fc);
        getInstExtendsList().flattenUsedFuncsAndEnums(fc);
        for (InstModification im : totalMergedEnvironment()) 
            im.flattenUsedFuncsAndEnums(fc);
        super.flattenUsedFuncsAndEnums(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:164
     */
    public void flattenOverloadedOperatorsForFlow(FClass fc) {
        for (InstComponentDecl icd : getInstComponentDecls())
            icd.flattenOverloadedOperatorsForFlow(fc);
        for (InstExtends ie : getInstExtendss())
            ie.flattenOverloadedOperatorsForFlow(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:260
     */
    public void flattenStateSelect(FClass fc) {
        lookupInstClass("StateSelect").target().flattenEnum(fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:338
     */
    public static final int FUNC_AND_REC_MOD_LEVEL = 1000;
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:497
     */
    public void flattenComponentsInFunction(FFunctionDecl ffd, FClass fc, Set<String> added, int level) {
        HashMap<InstNode,Integer> oldLevels = setModificationLevel(level);
        for (InstExtends ie : getInstExtendss())
            ie.flattenComponentsInFunction(ffd, fc, added, level + 1);
        for (InstComponentDecl icd : getInstComponentDecls()) {
            if (added.add(icd.name())) {
                HashMap<InstNode,Integer> oldLevels2 = icd.setModificationLevel(level + 1);
                icd.flattenInFunction(ffd, fc, false, null);
                icd.flattenUsedFuncsAndEnums(fc);
                icd.clearModificationLevel(oldLevels2);
            }
        }
        clearModificationLevel(oldLevels);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:558
     */
    public void flattenThisRecord(FClass fc) {
        String name = qualifiedTypeName();
        if (fc.lookupFRec(name) == null) {
            FRecordDecl frd = new FRecordDecl();
            frd.setFQName(new FQNameString(name));
            
            Set<String> names = new HashSet<String>();
            flattenComponentsInRecord(frd, fc, names, FUNC_AND_REC_MOD_LEVEL);
            
            fc.addFRecordDecl(frd);
            
            flattenUsedFuncsAndEnums(fc);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:573
     */
    public void flattenComponentsInRecord(FRecordDecl frd, FClass fc, Set<String> names, int level) {
        HashMap<InstNode,Integer> oldLevels = setModificationLevel(level);
        for (InstExtends ie : getInstExtendss())
            ie.flattenComponentsInRecord(frd, fc, names, level + 1);
        for (InstComponentDecl icd : getInstComponentDecls()) {
            HashMap<InstNode,Integer> oldLevels2 = icd.setModificationLevel(level + 1);
            icd.flattenInRecord(frd, fc, names);
            icd.clearModificationLevel(oldLevels2);
        }
        clearModificationLevel(oldLevels);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:922
     */
    public void flatten(FClass fc, boolean excludeBinding, int level) {
        flatten(fc, getFQName(), excludeBinding, level);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:926
     */
    public void flatten(FClass fc, FQName name, boolean excludeBinding, int level) {
        HashMap<InstNode,Integer> oldLevels = setModificationLevel(level);
        flattenEquations(name, fc);
        getInstComponentDeclList().flatten(fc, excludeBinding, level + 1);
        getInstExtendsList().flatten(fc, excludeBinding, level + 1);
        contribute(fc);
        clearModificationLevel(oldLevels);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:935
     */
    public void flattenEquations(FQName name, FClass fc) {
        for (FAbstractEquation ae : getFAbstractEquations()) 
            ae.flatten(name, fc);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1051
     */
    public static boolean containsRedeclared(InstNode in) {
        for (InstComponentDecl icd : in.getInstComponentDecls()) {
            if (icd.containsRedeclared()) {
                return true;
            }
        }
        for (InstClassDecl icd : in.getInstClassDecls()) {
            if (icd.containsRedeclared()) {
                return true;
            }
        }
        return false;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1152
     */
    public void addAttributes(List<FAttribute> attr, Environment env) {
        addAttributes(attr, env, AttributeExpRetriever.DEFAULT, true);
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1156
     */
    public void addAttributes(
            List<FAttribute> attr, Environment env, AttributeExpRetriever aer, boolean cls) {
        for (InstModification im : env) 
            im.collectAttributes(attr, im.myInstNode().getFQNamePrefix(), aer, cls);
    }
    /**
     * Set the modification level for contained modifications.
     * 
     * @throws IllegalArgumentException  if level is negative
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1715
     */
    public HashMap<InstNode,Integer> setModificationLevel(int level) {
        HashMap<InstNode,Integer> old = new HashMap<InstNode,Integer>();
        setModificationLevelHelper(old, level);
        return old;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1721
     */
    public void setModificationLevelHelper(HashMap<InstNode,Integer> old, int level) {
        myModificationLevel = level;
        old.put(this, myModificationLevel);
        for (InstNode extra : extraNodesToSetModLevelFor()) {
            if (extra != null && !old.containsKey(extra)) {
                extra.setModificationLevelHelper(old, extra.nextModLevelForExtraNode(level));
            }
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1731
     */
    public void clearModificationLevel(HashMap<InstNode,Integer> old) {
        for (InstNode n : old.keySet()) {
            n.myModificationLevel = old.get(n);
        }
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1766
     */
    protected InstNode[] listExtraNodesToSetModLevelFor(boolean ext, InstNode... nodes) {
        InstNode[] res = new InstNode[nodes.length + (ext ? getNumInstExtends() : 0) + 1];
        System.arraycopy(nodes, 0, res, 0, nodes.length);
        for (int i = nodes.length; i < res.length - 1; i++) {
            res[i] = getInstExtends(i - nodes.length);
        }
        res[res.length - 1] = parentNodeToSetModLevelFor();
        return res;
    }
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1776
     */
    private int myModificationLevel = Integer.MAX_VALUE;
    /**
     * @aspect AttributeContributer
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:3385
     */
    
        public FClass contribute(FClass fClass) {
            for (AttributeContributer contributer : attributeContributers())
                contributer.contribute(this, fClass);
            return fClass;
        }
    /**
     * If icd is in an outer component, try to find corresponding class in inner decl.
     * 
     * If inner decl isn't found, return icd to avoid extra error messages.
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:522
     */
    public InstClassDecl findInnerClassIfAny(InstClassDecl icd) {
        if (icd.inOrIsOuter()) {
            InstClassDecl inner = icd.myInnerInstClassDecl();
            if (inner != null) 
                icd = inner;
        }
        return icd;
    }
    /**
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:634
     */
    public InstClassDecl simpleLookupInstClassDeclRecursive(String name) {
        String[] parts = name.split("\\.", 2);
        InstClassDecl icd = findMatching(getInstClassDecls(), parts[0]);
        if (icd != null)
            return icd = (parts.length == 1) ? icd : icd.simpleLookupInstClassDeclRecursive(parts[1]);
        else
            return unknownInstClassDecl();
    }
    /**
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:617
     */
    public InstLookupResult findInnerComponentIfAny(InstComponentDecl icd) {
        if (icd.isOuter()) {
            return InstLookupResult.outer(icd);
        }
        return InstLookupResult.found(icd);
    }
    /**
     * Dynamically places an FExp in the tree under this InstNode.
     * 
     * @return  the final version of the dynamically placed node.
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:851
     */
    public FExp dynamicFExp(FExp exp) {
		getDynamicFExpOpt().setChild(exp, 0);
		return (FExp) getDynamicFExpOpt().getChild(0);
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1059
     */
    public InstComponentDecl createInstComponentDecl(ComponentDecl cd) {
        // Check if the component is redeclared. 
        // -> Yes: Create an InstReplacingComponent component
        // -> No: Create an InstComponent 
        InstComponentRedeclare irc = retrieveReplacingComponent(cd.name());
        InstComponentRedeclare cicr = retrieveConstrainingComponent(cd.name());
        if (irc!=null) {
            ComponentDecl replacingComp = irc.getComponentRedeclare().getComponentDecl();
            return new InstCreateReplacingComponentDecl(replacingComp, irc, cd, irc, cicr);
            // TODO: handle expandable connectors in this case
        } else { 
            return new InstCreateComponentDecl(cd, null);
        }
     }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1088
     */
    public InstClassDecl createInstClassDecl(ClassDecl bcd) {
         // Check if the class is redeclared. 
         // -> Yes: Create an InstReplacingClass component
         // -> No: Create an InstClassDecl
         InstRedeclareClassNode icr = retrieveReplacingClass(bcd.name());
         InstRedeclareClassNode cicr = retrieveConstrainingClass(bcd.name());
         if (icr != null) {
             ClassDecl replacingClass = icr.redeclaringClassDecl();
             return bcd.newInstReplacingClass(replacingClass, icr, cicr);
         } else {
             return bcd.newInstClassDecl();
         }
     }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1119
     */
    public InstNode createInstExtends(ExtendsClause ec, InstNode lookup) {
        // This cannot be redeclared. Just create and return.
        return ec.newInstExtends(lookup);
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1140
     */
    public InstNode createInstExtendsCheckReplacing(ExtendsClause ec, InstNode lookup) {
        if (!isInInstModification() && ec.needsReplacingExtends()) {
            Environment e = myEnvironment();
            InstModification im = findMatching(e, name());
            if (im != null)
                return im.createInstReplacingExtends(ec, lookup);
        }
        return ec.newInstExtends(lookup);
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1170
     */
    public InstExtends createInstReplacingExtends(ExtendsClause ec, InstNode lookup) {
        return ec.newInstExtends(lookup);
    }
    /**
     * @aspect InstaceConstrainingClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1769
     */
    public List buildFAbstractEquationList() { 
	    List l = new List();
	    for (AbstractEquation e : equations()) {
	    	l.add(e.instantiate());
	    }
	    for (Algorithm a : algorithms()) {
	    	l.add(a.instantiate());
	    }
	    for (FAlgorithm a : fAlgorithms()) {
	        l.add(a.fullCopy());
	    }
	    return l;
	}
    /**
     * Iterate over all components in this node and all InstExtends (recursively).
     * 
     * @return  an Iterable over the components
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2163
     */
    public Iterable<InstComponentDecl> allInstComponentDecls() {
        return new AllInstComponentIterable(this);
    }
    /**
     * Iterate over all classes in this node and all InstExtends (recursively).
     * 
     * @return  an Iterable over the classes
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2184
     */
    public Iterable<InstClassDecl> allInstClassDecls() {
        return new AllInstClassIterable(this);
    }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2191
     */
    protected Iterator<InstComponentDecl> allInstComponentDeclsIterator() {
        return new AllInstComponentIterator(this);
    }
    /**
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2198
     */
    protected Iterator<InstClassDecl> allInstClassDeclsIterator() {
        return new AllInstClassIterator(this);
    }
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2568
     */
    public void dumpTree(String indent) {
		System.out.println(indent + dump());
		System.out.println(toString(indent+"|"));
		for (InstNode n : getInstClassDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstComponentDecls())
			n.dumpTree(indent + " ");
		for (InstNode n : getInstExtendss())
			n.dumpTree(indent + " ");

	}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2660
     */
    public String toString(String indent) {
	   StringBuilder str = new StringBuilder();
	   str.append(indent + "InstNode:\n");
	   str.append(prettyPrint(indent + " "));
	   appendEnvironment(str, indent);

	   return str.toString();	
	}
    /**
     * @aspect InstanceDumpTree
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2669
     */
    protected void appendEnvironment(StringBuilder str, String indent) {
		String next = indent + " ";
		str.append(indent);
		str.append(" myEnvironment():\n");
		str.append(myEnvironment().toString(next));
		str.append(indent);
		str.append(" myEnvironment('");
		str.append(name());
		str.append("'):\n");
		str.append(myEnvironment(name()).toString(next));
		str.append(indent);
		str.append(" mergedEnvironment():\n");
		str.append(getMergedEnvironment().toString(next));
	}
    /**
     * @aspect Types
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:56
     */
    public static boolean comparePrimitiveTypes(InstNode superType, InstNode subType, boolean top) {
        if (subType == superType) 
            return true;
        return subType.baseClassName().equals(superType.baseClassName()) && 
                (subType.ndims() == superType.ndims() || 
                 top && subType.ndims() == 0 || 
                 superType.isClassDecl() && subType.ndims() > superType.ndims());
    }
    /**
     * @aspect Types
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/Types.jrag:65
     */
    public static boolean compareCompositeTypes(InstNode superType, InstNode subType, boolean top) {
        if (subType == superType || subType.myInstClass().isUnknown()) 
            return true;
        
        if (superType.isArray() != subType.isArray()) {
            if (top && superType.isArray()) {
                superType = superType.getInstComponentDecl(0);
            } else if (superType.isClassDecl() || subType.isClassDecl()) {
                if (superType.isClassDecl())
                    subType = subType.getInstComponentDecl(0);
                else
                    superType = superType.getInstComponentDecl(0);
            } else {
                return false;
            }
        }
        
        if (superType.isArray()) {
            List<InstComponentDecl> superComponents = superType.getInstComponentDecls();
            List<InstComponentDecl> subComponents = subType.getInstComponentDecls();
            for (int i = 0, n = Math.min(superComponents.getNumChild(), subComponents.getNumChild()); i < n; i++)
                if (!subComponents.getChild(i).subType(superComponents.getChild(i), false))
                    return false;
        } else {
            // Check that all elements (here: components) in superType are in subType 
            for (InstComponentDecl superTypeChild : superType.containedInstComponents()) {
                InstComponentDecl subTypeChild = subType.memberInstComponent(superTypeChild.name()).targetOrNull();
                if (subTypeChild == null || !subTypeChild.subType(superTypeChild.constrainingInstType(), false))
                    return false;
            }
        }
        return true;
    }
    /**
     * @declaredat ASTNode:1
     */
    public InstNode() {
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
        children = new ASTNode[8];
        setChild(new List(), 0);
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new List(), 4);
        setChild(new List(), 5);
        setChild(new List(), 6);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:23
     */
    protected int numChildren() {
        return 0;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:29
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:35
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        getFQName_reset();
        myInputs_reset();
        myNonInputs_reset();
        myOutputs_reset();
        myModifiableComponents_reset();
        genericLookupInstClass_String_reset();
        genericLookupInstComponent_String_reset();
        memberInstComponent_String_reset();
        memberInstConstantWithExtends_String_reset();
        memberInstConstant_String_reset();
        localInstModifications_reset();
        getMergedEnvironment_reset();
        myEnvironment_def_String_reset();
        totalMergedEnvironment_reset();
        getDynamicFExpOpt_reset();
        getInstComponentDeclList_reset();
        getInstClassDeclList_reset();
        getRedeclaredInstClassDeclList_reset();
        getInstExtendsList_reset();
        getElementInstModificationList_reset();
        getFAbstractEquationList_reset();
        containedInstComponents_reset();
        retrieveFQName_reset();
        lookupInstComponent_String_reset();
        lookupInstConstant_String_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:66
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:72
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:78
     */
    public InstNode clone() throws CloneNotSupportedException {
        InstNode node = (InstNode) super.clone();
        return node;
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @deprecated Please use treeCopy or treeCopyNoTransform instead
     * @declaredat ASTNode:89
     */
    public abstract InstNode fullCopy();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:96
     */
    public abstract InstNode treeCopyNoTransform();
    /**
     * Create a deep copy of the AST subtree at this node.
     * The subtree of this node is traversed to trigger rewrites before copy.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:104
     */
    public abstract InstNode treeCopy();
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel high-level
     */
    public int getNumInstComponentDecl() {
        return getInstComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstComponentDecl list.
     * @apilevel low-level
     */
    public int getNumInstComponentDeclNoTransform() {
        return getInstComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstComponentDecl list.
     * @apilevel high-level
     */
    public InstComponentDecl getInstComponentDecl(int i) {
        return (InstComponentDecl) getInstComponentDeclList().getChild(i);
    }
    /**
     * Check whether the InstComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstComponentDecl() {
        return getInstComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstComponentDecl list.
     * @param node The element to append to the InstComponentDecl list.
     * @apilevel high-level
     */
    public void addInstComponentDecl(InstComponentDecl node) {
        List<InstComponentDecl> list = (parent == null || state == null) ? getInstComponentDeclListNoTransform() : getInstComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstComponentDeclNoTransform(InstComponentDecl node) {
        List<InstComponentDecl> list = getInstComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstComponentDecl(InstComponentDecl node, int i) {
        List<InstComponentDecl> list = getInstComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstComponentDecl list.
     * @return The the child position of the InstComponentDecl list.
     * @apilevel low-level
     */
    protected int getInstComponentDeclListChildPosition() {
        return 0;
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclListNoTransform() {
        return (List<InstComponentDecl>) getChildNoTransform(0);
    }
    /**
     * Retrieves the InstComponentDecl list.
     * @return The node representing the InstComponentDecl list.
     * @apilevel high-level
     */
    public List<InstComponentDecl> getInstComponentDecls() {
        return getInstComponentDeclList();
    }
    /**
     * Retrieves the InstComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstComponentDecl list.
     * @apilevel low-level
     */
    public List<InstComponentDecl> getInstComponentDeclsNoTransform() {
        return getInstComponentDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * @return Number of children in the InstClassDecl list.
     * @apilevel high-level
     */
    public int getNumInstClassDecl() {
        return getInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstClassDecl list.
     * @apilevel low-level
     */
    public int getNumInstClassDeclNoTransform() {
        return getInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getInstClassDecl(int i) {
        return (InstClassDecl) getInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the InstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstClassDecl() {
        return getInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstClassDecl list.
     * @param node The element to append to the InstClassDecl list.
     * @apilevel high-level
     */
    public void addInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getInstClassDeclListNoTransform() : getInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstClassDecl list.
     * @return The the child position of the InstClassDecl list.
     * @apilevel low-level
     */
    protected int getInstClassDeclListChildPosition() {
        return 1;
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(1);
    }
    /**
     * Retrieves the InstClassDecl list.
     * @return The node representing the InstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getInstClassDecls() {
        return getInstClassDeclList();
    }
    /**
     * Retrieves the InstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getInstClassDeclsNoTransform() {
        return getInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * @return Number of children in the InstExtends list.
     * @apilevel high-level
     */
    public int getNumInstExtends() {
        return getInstExtendsList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstExtends list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstExtends list.
     * @apilevel low-level
     */
    public int getNumInstExtendsNoTransform() {
        return getInstExtendsListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstExtends list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstExtends list.
     * @apilevel high-level
     */
    public InstExtends getInstExtends(int i) {
        return (InstExtends) getInstExtendsList().getChild(i);
    }
    /**
     * Check whether the InstExtends list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstExtends() {
        return getInstExtendsList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstExtends list.
     * @param node The element to append to the InstExtends list.
     * @apilevel high-level
     */
    public void addInstExtends(InstExtends node) {
        List<InstExtends> list = (parent == null || state == null) ? getInstExtendsListNoTransform() : getInstExtendsList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstExtendsNoTransform(InstExtends node) {
        List<InstExtends> list = getInstExtendsListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstExtends list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstExtends(InstExtends node, int i) {
        List<InstExtends> list = getInstExtendsList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstExtends list.
     * @return The the child position of the InstExtends list.
     * @apilevel low-level
     */
    protected int getInstExtendsListChildPosition() {
        return 2;
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendsListNoTransform() {
        return (List<InstExtends>) getChildNoTransform(2);
    }
    /**
     * Retrieves the InstExtends list.
     * @return The node representing the InstExtends list.
     * @apilevel high-level
     */
    public List<InstExtends> getInstExtendss() {
        return getInstExtendsList();
    }
    /**
     * Retrieves the InstExtends list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstExtends list.
     * @apilevel low-level
     */
    public List<InstExtends> getInstExtendssNoTransform() {
        return getInstExtendsListNoTransform();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * @return Number of children in the InstImport list.
     * @apilevel high-level
     */
    public int getNumInstImport() {
        return getInstImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InstImport list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InstImport list.
     * @apilevel low-level
     */
    public int getNumInstImportNoTransform() {
        return getInstImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InstImport list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InstImport list.
     * @apilevel high-level
     */
    public InstImport getInstImport(int i) {
        return (InstImport) getInstImportList().getChild(i);
    }
    /**
     * Check whether the InstImport list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInstImport() {
        return getInstImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the InstImport list.
     * @param node The element to append to the InstImport list.
     * @apilevel high-level
     */
    public void addInstImport(InstImport node) {
        List<InstImport> list = (parent == null || state == null) ? getInstImportListNoTransform() : getInstImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInstImportNoTransform(InstImport node) {
        List<InstImport> list = getInstImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InstImport list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInstImport(InstImport node, int i) {
        List<InstImport> list = getInstImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InstImport list.
     * @return The the child position of the InstImport list.
     * @apilevel low-level
     */
    protected int getInstImportListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportListNoTransform() {
        return (List<InstImport>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InstImport list.
     * @return The node representing the InstImport list.
     * @apilevel high-level
     */
    public List<InstImport> getInstImports() {
        return getInstImportList();
    }
    /**
     * Retrieves the InstImport list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InstImport list.
     * @apilevel low-level
     */
    public List<InstImport> getInstImportsNoTransform() {
        return getInstImportListNoTransform();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public int getNumRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the RedeclaredInstClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public int getNumRedeclaredInstClassDeclNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the RedeclaredInstClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public InstClassDecl getRedeclaredInstClassDecl(int i) {
        return (InstClassDecl) getRedeclaredInstClassDeclList().getChild(i);
    }
    /**
     * Check whether the RedeclaredInstClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasRedeclaredInstClassDecl() {
        return getRedeclaredInstClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the RedeclaredInstClassDecl list.
     * @param node The element to append to the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public void addRedeclaredInstClassDecl(InstClassDecl node) {
        List<InstClassDecl> list = (parent == null || state == null) ? getRedeclaredInstClassDeclListNoTransform() : getRedeclaredInstClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addRedeclaredInstClassDeclNoTransform(InstClassDecl node) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the RedeclaredInstClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setRedeclaredInstClassDecl(InstClassDecl node, int i) {
        List<InstClassDecl> list = getRedeclaredInstClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the RedeclaredInstClassDecl list.
     * @return The the child position of the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    protected int getRedeclaredInstClassDeclListChildPosition() {
        return 4;
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclListNoTransform() {
        return (List<InstClassDecl>) getChildNoTransform(4);
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel high-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDecls() {
        return getRedeclaredInstClassDeclList();
    }
    /**
     * Retrieves the RedeclaredInstClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the RedeclaredInstClassDecl list.
     * @apilevel low-level
     */
    public List<InstClassDecl> getRedeclaredInstClassDeclsNoTransform() {
        return getRedeclaredInstClassDeclListNoTransform();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel high-level
     */
    public int getNumFAbstractEquation() {
        return getFAbstractEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FAbstractEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FAbstractEquation list.
     * @apilevel low-level
     */
    public int getNumFAbstractEquationNoTransform() {
        return getFAbstractEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FAbstractEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FAbstractEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getFAbstractEquation(int i) {
        return (FAbstractEquation) getFAbstractEquationList().getChild(i);
    }
    /**
     * Check whether the FAbstractEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFAbstractEquation() {
        return getFAbstractEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the FAbstractEquation list.
     * @param node The element to append to the FAbstractEquation list.
     * @apilevel high-level
     */
    public void addFAbstractEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getFAbstractEquationListNoTransform() : getFAbstractEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFAbstractEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getFAbstractEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FAbstractEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFAbstractEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getFAbstractEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the FAbstractEquation list.
     * @return The the child position of the FAbstractEquation list.
     * @apilevel low-level
     */
    protected int getFAbstractEquationListChildPosition() {
        return 5;
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(5);
    }
    /**
     * Retrieves the FAbstractEquation list.
     * @return The node representing the FAbstractEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getFAbstractEquations() {
        return getFAbstractEquationList();
    }
    /**
     * Retrieves the FAbstractEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FAbstractEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getFAbstractEquationsNoTransform() {
        return getFAbstractEquationListNoTransform();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * @return Number of children in the ElementInstModification list.
     * @apilevel high-level
     */
    public int getNumElementInstModification() {
        return getElementInstModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementInstModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementInstModification list.
     * @apilevel low-level
     */
    public int getNumElementInstModificationNoTransform() {
        return getElementInstModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementInstModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementInstModification list.
     * @apilevel high-level
     */
    public InstModification getElementInstModification(int i) {
        return (InstModification) getElementInstModificationList().getChild(i);
    }
    /**
     * Check whether the ElementInstModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementInstModification() {
        return getElementInstModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementInstModification list.
     * @param node The element to append to the ElementInstModification list.
     * @apilevel high-level
     */
    public void addElementInstModification(InstModification node) {
        List<InstModification> list = (parent == null || state == null) ? getElementInstModificationListNoTransform() : getElementInstModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementInstModificationNoTransform(InstModification node) {
        List<InstModification> list = getElementInstModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementInstModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementInstModification(InstModification node, int i) {
        List<InstModification> list = getElementInstModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the ElementInstModification list.
     * @return The the child position of the ElementInstModification list.
     * @apilevel low-level
     */
    protected int getElementInstModificationListChildPosition() {
        return 6;
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationListNoTransform() {
        return (List<InstModification>) getChildNoTransform(6);
    }
    /**
     * Retrieves the ElementInstModification list.
     * @return The node representing the ElementInstModification list.
     * @apilevel high-level
     */
    public List<InstModification> getElementInstModifications() {
        return getElementInstModificationList();
    }
    /**
     * Retrieves the ElementInstModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementInstModification list.
     * @apilevel low-level
     */
    public List<InstModification> getElementInstModificationsNoTransform() {
        return getElementInstModificationListNoTransform();
    }
    /**
     * Retrieves the FQName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the FQName child.
     * @apilevel low-level
     */
    public FQName getFQNameNoTransform() {
        return (FQName) getChildNoTransform(7);
    }
    /**
     * Retrieves the child position of the optional child FQName.
     * @return The the child position of the optional child FQName.
     * @apilevel low-level
     */
    protected int getFQNameChildPosition() {
        return 7;
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1846
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
    public Size size() {
        ASTNode$State state = state();
        Size size_value = FArraySubscripts.declarationSize(myFSubscripts());

        return size_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArray() {
        ASTNode$State state = state();
        boolean isArray_value = ndims()>0;

        return isArray_value;
    }
    @ASTNodeAnnotation.Attribute
    public FQName getFQNamePrefix() {
        ASTNode$State state = state();
        FQName getFQNamePrefix_value = retrieveFQName();

        return getFQNamePrefix_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getFQName_computed = false;
    /**
     * @apilevel internal
     */
    protected FQName getFQName_value;
    /**
     * @apilevel internal
     */
    private void getFQName_reset() {
        getFQName_computed = false;
        getFQName_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public FQName getFQName() {
        if(getFQName_computed) {
            return (FQName) getChild(getFQNameChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFQName_value = getFQNamePrefix();
        setChild(getFQName_value, getFQNameChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFQName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        FQName node = (FQName) this.getChild(getFQNameChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    protected boolean myInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myInputs_value;
    /**
     * @apilevel internal
     */
    private void myInputs_reset() {
        myInputs_computed = false;
        myInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myInputs() {
        if(myInputs_computed) {
            return myInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myInputs_value = myInputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myInputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<InstComponentDecl> myInputs_compute() {
             ArrayList<InstComponentDecl> l = new ArrayList<InstComponentDecl>();
             Map<String,Integer> names = new HashMap<String,Integer>();
             for (InstComponentDecl icd : allInstComponentDecls()) {
                 if (icd.isInput()) {
                     // Make sure inherited ones are added first, 
                     // but that any that are also present locally replace them.
                     if (names.containsKey(icd.name())) {
                         l.set(names.get(icd.name()), icd);
                     } else {
                         names.put(icd.name(), l.size());
                         l.add(icd);
                     }
                 }
             }
             return l;
         }
    /**
     * @apilevel internal
     */
    protected boolean myNonInputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myNonInputs_value;
    /**
     * @apilevel internal
     */
    private void myNonInputs_reset() {
        myNonInputs_computed = false;
        myNonInputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myNonInputs() {
        if(myNonInputs_computed) {
            return myNonInputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myNonInputs_value = myNonInputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myNonInputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myNonInputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<InstComponentDecl> myNonInputs_compute() {
             ArrayList<InstComponentDecl> l = new ArrayList<InstComponentDecl>();
             Map<String,Integer> names = new HashMap<String,Integer>();
             for (InstComponentDecl icd : allInstComponentDecls()) {
                 if (!icd.isInput()) {
                     // Make sure inherited ones are added first, 
                     // but that any that are also present locally replace them.
                     if (names.containsKey(icd.name())) {
                         l.set(names.get(icd.name()), icd);
                     } else {
                         names.put(icd.name(), l.size());
                         l.add(icd);
                     }
                 }
             }
             return l;
         }
    /**
     * @apilevel internal
     */
    protected boolean myOutputs_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myOutputs_value;
    /**
     * @apilevel internal
     */
    private void myOutputs_reset() {
        myOutputs_computed = false;
        myOutputs_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myOutputs() {
        if(myOutputs_computed) {
            return myOutputs_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myOutputs_value = myOutputs_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myOutputs_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myOutputs_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<InstComponentDecl> myOutputs_compute() {
             ArrayList<InstComponentDecl> l = new ArrayList<InstComponentDecl>();
             Map<String,Integer> names = new HashMap<String,Integer>();
             for (InstComponentDecl icd : allInstComponentDecls()) {
                 if (icd.isOutput()) {
                     // Make sure inherited ones are added first, 
                     // but that any that are also present locally replace them.
                     if (names.containsKey(icd.name())) {
                         l.set(names.get(icd.name()), icd);
                     } else {
                         names.put(icd.name(), l.size());
                         l.add(icd);
                     }
                 }
             }
             return l;
         }
    /**
     * @apilevel internal
     */
    protected boolean myModifiableComponents_computed = false;
    /**
     * @apilevel internal
     */
    protected ArrayList<InstComponentDecl> myModifiableComponents_value;
    /**
     * @apilevel internal
     */
    private void myModifiableComponents_reset() {
        myModifiableComponents_computed = false;
        myModifiableComponents_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArrayList<InstComponentDecl> myModifiableComponents() {
        if(myModifiableComponents_computed) {
            return myModifiableComponents_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        myModifiableComponents_value = myModifiableComponents_compute();
        if (isFinal && num == state().boundariesCrossed) {
            myModifiableComponents_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myModifiableComponents_value;
    }
    /**
     * @apilevel internal
     */
    private ArrayList<InstComponentDecl> myModifiableComponents_compute() {
             ArrayList<InstComponentDecl> l = new ArrayList<InstComponentDecl>();
             for (InstComponentDecl icd : allInstComponentDecls())
                 if (icd.isModifiable())
                     l.add(icd);
             return l;
         }
    @ASTNodeAnnotation.Attribute
    public boolean canBeReplacedFor(InstNode source) {
        ASTNode$State state = state();
        boolean canBeReplacedFor_InstNode_value = canBeReplacedIn(commonAncestor(source));

        return canBeReplacedFor_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canBeReplacedIn(InstNode ancestor) {
        ASTNode$State state = state();
        boolean canBeReplacedIn_InstNode_value = isReplaceable() || canBeReplacedInHelper(ancestor);

        return canBeReplacedIn_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecursed() {
        ASTNode$State state = state();
        boolean isRecursed_value = false;

        return isRecursed_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOfInstClassDecl(InstClassDecl icd) {
        ASTNode$State state = state();
        boolean isOfInstClassDecl_InstClassDecl_value = false;

        return isOfInstClassDecl_InstClassDecl_value;
    }
    /**
     * @attribute syn
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:320
     */
    @ASTNodeAnnotation.Attribute
    public String kindDescription() {
        ASTNode$State state = state();
        try {
                throw new UnsupportedOperationException();
            }
        finally {
        }
    }
    /**
     * Find the first flow variable in this node, if any.
     * @attribute syn
     * @aspect Connections
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Connections.jrag:591
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl findFlowVar() {
        ASTNode$State state = state();
        try {
                for (InstComponentDecl icd : allInstComponentDecls())
                    if (icd.isFlow())
                        return icd;
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:512
     */
    @ASTNodeAnnotation.Attribute
    public FAlgorithm findFunctionAlgorithm() {
        ASTNode$State state = state();
        try {
                if (getNumFAbstractEquation() > 0) {
                    FAbstractEquation equ = getFAbstractEquation(0);
                    if (equ instanceof FAlgorithm)
                        return (FAlgorithm) equ;
                } else {
                    for (InstExtends ie : getInstExtendss()) {
                        FAlgorithm tmp = ie.findFunctionAlgorithm();
                        if (tmp != null) 
                            return tmp;
                    }
                    return new FAlgorithm(new List());
                }
                return null;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String qualifiedTypeName() {
        ASTNode$State state = state();
        String qualifiedTypeName_value = qualifiedName();

        return qualifiedTypeName_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean containsRedeclared() {
        ASTNode$State state = state();
        boolean containsRedeclared_value = InstNode.containsRedeclared(this);

        return containsRedeclared_value;
    }
    @ASTNodeAnnotation.Attribute
    public int nextModLevelForExtraNode(int level) {
        ASTNode$State state = state();
        int nextModLevelForExtraNode_int_value = level + 1;

        return nextModLevelForExtraNode_int_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode[] extraNodesToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode[] extraNodesToSetModLevelFor_value = listExtraNodesToSetModLevelFor(false);

        return extraNodesToSetModLevelFor_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasModificationLevel() {
        ASTNode$State state = state();
        boolean hasModificationLevel_value = myModificationLevel != Integer.MAX_VALUE;

        return hasModificationLevel_value;
    }
    /**
     * @attribute syn
     * @aspect FlatExpressions
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1947
     */
    @ASTNodeAnnotation.Attribute
    public int countInstComponentDecls() {
        ASTNode$State state = state();
        try {
                int res = getNumInstComponentDecl();
                for (InstExtends ie : getInstExtendss()) {
                    res += ie.countInstComponentDecls();
                }
                return res;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupInnerInstComponentNoLocal(InstComponentDecl outer, InstComponentDecl nonInner) {
        ASTNode$State state = state();
        InstComponentDecl lookupInnerInstComponentNoLocal_InstComponentDecl_InstComponentDecl_value = lookupInnerInstComponent(outer, false);

        return lookupInnerInstComponentNoLocal_InstComponentDecl_InstComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassRedirect(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassRedirect_String_value = genericLookupInstClass(name);

        return lookupInstClassRedirect_String_value;
    }
    /**
     * Lookup the class being redeclared & extended in the last step of a chain 
     * of "redeclare class extends" declarations, where it is known that the last 
     * redeclaring class is below this node.
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:191
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupLastRedeclareExtendsInstClass(String name) {
        ASTNode$State state = state();
        try {
                // TODO: find better way of detecting if there is only one "redeclare class extends" in chain
                InstLookupResult<InstClassDecl> first = lookupCurRedeclareExtendsInstClass(name);
                if (first.successful()) {
                    InstLookupResult<InstClassDecl> second = first.target().lookupRedeclareExtendsInstClass(name);
                    if (second.successful())
                        return second;
                }
                return first;
            }
        finally {
        }
    }
    /**
     * Look up the next class being redeclared & extended in a chain of 
     * "redeclare class extends" declarations.
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:206
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupNextRedeclareExtendsInstClass(String name) {
        ASTNode$State state = state();
        try {
                for (InstExtends ie : getInstExtendss()) {
                    InstLookupResult<InstClassDecl> res = ie.lookupCurRedeclareExtendsInstClass(name);
                    if (res.successful())
                        return res;
                }
                for (InstClassDecl icd : getInstClassDecls()) 
                    if (icd.matches(name)) 
                        return InstLookupResult.found(icd.originalInstClass());
                return InstLookupResult.notFound();
            }
        finally {
        }
    }
    /**
     * Look up the next class being redeclared & extended in a chain of 
     * "redeclare class extends" declarations, including among direct children.
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:222
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupCurRedeclareExtendsInstClass(String name) {
        ASTNode$State state = state();
        try {
                for (InstClassDecl icd : getRedeclaredInstClassDecls()) 
                    if (icd.matches(name)) 
                        return InstLookupResult.found(icd);
                return lookupNextRedeclareExtendsInstClass(name);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassInSurrounding(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassInSurrounding_String_value = lookupInstClass(name);

        return lookupInstClassInSurrounding_String_value;
    }
    protected Map genericLookupInstClass_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstClass_String_reset() {
        genericLookupInstClass_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> genericLookupInstClass(String name) {
        Object _parameters = name;
        if (genericLookupInstClass_String_values == null) genericLookupInstClass_String_values = new HashMap(4);
        if(genericLookupInstClass_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstClassDecl>)genericLookupInstClass_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstClassDecl> genericLookupInstClass_String_value = genericLookupInstClass_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstClass_String_values.put(_parameters, genericLookupInstClass_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstClass_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstClassDecl> genericLookupInstClass_compute(String name) {
            for (InstClassDecl icd : getInstClassDecls()) 
                if (icd.matches(name)) 
                    return InstLookupResult.found(icd);
            
            for (InstExtends ie : getInstExtendss()) {
                InstLookupResult<InstClassDecl> res = ie.memberInstClass(name);
                if (res.successful())
                    return res;
            }
            
            for (InstImport ii : getInstImports()) {
                InstLookupResult<InstClassDecl> res = ii.lookupInstClassInImport(name);
                if (res.successful())
                    return res;
            }
            
            return lookupInstClassInSurrounding(name);
        }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:368
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClass(String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstClassDecl> res = superLookupInstClassLocal(name);
                return res.successful() ? res : superLookupInstClassSurrounding(name);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassSurrounding(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> superLookupInstClassSurrounding_String_value = lookupInstClass(name);

        return superLookupInstClassSurrounding_String_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:376
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> superLookupInstClassLocal(String name) {
        ASTNode$State state = state();
        try {
                for (InstImport ii : getInstImports()) {
                    InstLookupResult<InstClassDecl> res = ii.lookupInstClassInImport(name);
                    if (res.successful())
                        return res;
                }
                
                for (InstClassDecl icd : getInstClassDecls()) {
                    if (icd.matches(name)) {
                        return InstLookupResult.found(icd);
                    }
                }
                
                return InstLookupResult.notFound();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> memberInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> memberInstClass_String_value = InstLookupResult.notFound();

        return memberInstClass_String_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstClassDecl myInstClass() {
        ASTNode$State state = state();
        InstClassDecl myInstClass_value = unknownInstClassDecl();

        return myInstClass_value;
    }
    /**
     * Look up qualified class names in the instance class structure.
     * 
     * @param name  a qualified name, for example 'A.B.C'
     * @attribute syn
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:662
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualified(String name) {
        ASTNode$State state = state();
        try {
                return lookupInstClassQualified(name, false);
            }
        finally {
        }
    }
    /**
     * Look up qualified class names in the instance class structure.
     * 
     * @param name  a qualified name, for example 'A.B.C'
     * @attribute syn
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:671
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualifiedGlobal(String name) {
        ASTNode$State state = state();
        try {
                return lookupInstClassQualified(name, true);
            }
        finally {
        }
    }
    /**
     * Look up qualified class names in the instance class structure.
     * 
     * @param name    a qualified name, for example 'A.B.C'
     * @param global  should the lookup start in the global scope?
     * @attribute syn
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:681
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualified(String name, boolean global) {
        ASTNode$State state = state();
        try {
                String[] parts = name.split("\\.");
                InstNode icd = this;
                InstLookupResult<InstClassDecl> res = null;
                boolean first = true;
                for (String part : parts) {
                    res = icd.lookupInstClassQualifiedPart(part, first, global);
                    if (!res.successful())
                        return res;
                    icd = res.target();
                    first = false;
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect SimpleInstClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:696
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassQualifiedPart(String name, boolean first, boolean global) {
        ASTNode$State state = state();
        try {
                if (!first) {
                    return memberInstClass(name);
                } else if (global) {
                    return lookupInstClassFromTop(name);
                } else {
                    return lookupInstClass(name);
                }
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:414
     */
    @ASTNodeAnnotation.Attribute
    public InstNode myConstrainingDecl() {
        ASTNode$State state = state();
        try {
                if (hasInstConstraining() && getInstConstraining().hasInstRedeclare()) {
                    return getInstConstraining().getRedeclareInstNode();
                } else {
                    return myDefaultConstrainingDecl();
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public InstNode myDefaultConstrainingDecl() {
        ASTNode$State state = state();
        InstNode myDefaultConstrainingDecl_value = this;

        return myDefaultConstrainingDecl_value;
    }
    protected Map genericLookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void genericLookupInstComponent_String_reset() {
        genericLookupInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstComponent(String name) {
        Object _parameters = name;
        if (genericLookupInstComponent_String_values == null) genericLookupInstComponent_String_values = new HashMap(4);
        if(genericLookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)genericLookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> genericLookupInstComponent_String_value = genericLookupInstComponent_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            genericLookupInstComponent_String_values.put(_parameters, genericLookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return genericLookupInstComponent_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> genericLookupInstComponent_compute(String name) {
            InstLookupResult<InstComponentDecl> res = memberInstComponent(name);
            if (res.successful())
                return res;
            for (InstImport ii : getInstImports()) {
                res = ii.lookupInstConstantInImport(name);
                if (res.successful())
                    return res;
            }
            return genericLookupInstConstant(name);
        }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> genericLookupInstConstant(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstComponentDecl> genericLookupInstConstant_String_value = lookupInstConstant(name);

        return genericLookupInstConstant_String_value;
    }
    /**
     * @attribute syn
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:591
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> arrayMemberInstComponent(String name, int ndims) {
        ASTNode$State state = state();
        try {
                if (ndims == 0) 
                    return memberInstComponent(name);
                return getInstComponentDecl(0).arrayMemberInstComponent(name, ndims - 1);
            }
        finally {
        }
    }
    protected Map memberInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstComponent_String_reset() {
        memberInstComponent_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstComponent(String name) {
        Object _parameters = name;
        if (memberInstComponent_String_values == null) memberInstComponent_String_values = new HashMap(4);
        if(memberInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstComponent_String_value = memberInstComponent_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstComponent_String_values.put(_parameters, memberInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstComponent_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> memberInstComponent_compute(String name) {
            if (isArray()) {
                return arrayMemberInstComponent(name, ndims());
            } else {    
                for (InstComponentDecl ic : getInstComponentDecls()) 
                    if (ic.matches(name))
                        return findInnerComponentIfAny(ic);
    
                for (InstExtends ie : getInstExtendss()) {
                    InstLookupResult<InstComponentDecl> res = ie.memberInstComponent(name);
                    if (res.successful())
                        return res;
                }
                
                return InstLookupResult.notFound();
            }
        }
    /**
     * @attribute syn
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:629
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstantFirst(String name) {
        ASTNode$State state = state();
        try {
                InstLookupResult<InstComponentDecl> res = memberInstConstantWithExtends(name);
                if (res.successful())
                    return res;
                
                for (InstImport ii : getInstImports()) {
                    res = ii.lookupInstConstantInImport(name);
                    if (res.successful())
                        return res;
                }
                
                return lookupInstConstant(name);
            }
        finally {
        }
    }
    protected Map memberInstConstantWithExtends_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstConstantWithExtends_String_reset() {
        memberInstConstantWithExtends_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstantWithExtends(String name) {
        Object _parameters = name;
        if (memberInstConstantWithExtends_String_values == null) memberInstConstantWithExtends_String_values = new HashMap(4);
        if(memberInstConstantWithExtends_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstConstantWithExtends_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstConstantWithExtends_String_value = memberInstConstantWithExtends_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstConstantWithExtends_String_values.put(_parameters, memberInstConstantWithExtends_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstConstantWithExtends_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> memberInstConstantWithExtends_compute(String name) {
            InstLookupResult<InstComponentDecl> res = memberInstConstant(name);
            if (res.successful())
                return res;
            
            for (InstExtends ie : getInstExtendss()) {
                res = ie.memberInstConstantWithExtends(name);
                if (res.successful())
                    return res;
            }
            
            return InstLookupResult.notFound();
        }
    protected Map memberInstConstant_String_values;
    /**
     * @apilevel internal
     */
    private void memberInstConstant_String_reset() {
        memberInstConstant_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> memberInstConstant(String name) {
        Object _parameters = name;
        if (memberInstConstant_String_values == null) memberInstConstant_String_values = new HashMap(4);
        if(memberInstConstant_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)memberInstConstant_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> memberInstConstant_String_value = memberInstConstant_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            memberInstConstant_String_values.put(_parameters, memberInstConstant_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return memberInstConstant_String_value;
    }
    /**
     * @apilevel internal
     */
    private InstLookupResult<InstComponentDecl> memberInstConstant_compute(String name) {
            for (InstComponentDecl ic : getInstComponentDecls()) 
                if (ic.getComponentDecl().isConstant() && ic.matches(name))
                    return InstLookupResult.found(ic);
            
            return InstLookupResult.notFound();
        }
    /**
     * @attribute syn
     * @aspect SimpleLookupInstComponentDecl
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:758
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl simpleLookupInstComponentDecl(String name) {
        ASTNode$State state = state();
        try {
                for (InstComponentDecl icd : getInstComponentDecls()) {
                    if (icd.name().matches(name))
                        return icd;
                }
                for (InstExtends ie : getInstExtendss()) {
                    InstComponentDecl match = ie.simpleLookupInstComponentDecl(name);
                    if (match != null)
                        return match;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * The scalar type of this class or component, if it is a primitive type, otherwise the unknown type.
     * @attribute syn
     * @aspect InstTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:48
     */
    @ASTNodeAnnotation.Attribute
    public FType primitiveScalarType() {
        ASTNode$State state = state();
        try {
                if (isReal()) 
                    return fRealScalarType();
                else if (isInteger()) 
                    return fIntegerScalarType();
                else if (isBoolean()) 
                    return fBooleanScalarType();
                else if (isString()) 
                    return fStringScalarType();
                else if (isExternalObject())
                    return new FExternalObjectType(Size.SCALAR, "ExternalObject", new FIdUse("ExternalObject.constructor"), new FIdUse("ExternalObject.destructor"));
                return fUnknownType();
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReal() {
        ASTNode$State state = state();
        boolean isReal_value = false;

        return isReal_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInteger() {
        ASTNode$State state = state();
        boolean isInteger_value = false;

        return isInteger_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isBoolean() {
        ASTNode$State state = state();
        boolean isBoolean_value = false;

        return isBoolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isString() {
        ASTNode$State state = state();
        boolean isString_value = false;

        return isString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isEnum() {
        ASTNode$State state = state();
        boolean isEnum_value = false;

        return isEnum_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExternalObject() {
        ASTNode$State state = state();
        boolean isExternalObject_value = false;

        return isExternalObject_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPartialFunction() {
        ASTNode$State state = state();
        boolean isPartialFunction_value = false;

        return isPartialFunction_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isMeOrMyClass(InstNode node) {
        ASTNode$State state = state();
        boolean isMeOrMyClass_InstNode_value = node == this;

        return isMeOrMyClass_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode inheritingNode() {
        ASTNode$State state = state();
        InstNode inheritingNode_value = this;

        return inheritingNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean inArrayComponent() {
        ASTNode$State state = state();
        boolean inArrayComponent_value = false;

        return inArrayComponent_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFunction() {
        ASTNode$State state = state();
        boolean isFunction_value = false;

        return isFunction_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean localInstModifications_computed = false;
    /**
     * @apilevel internal
     */
    protected Collection<InstModification> localInstModifications_value;
    /**
     * @apilevel internal
     */
    private void localInstModifications_reset() {
        localInstModifications_computed = false;
        localInstModifications_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModifications() {
        if(localInstModifications_computed) {
            return localInstModifications_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        localInstModifications_value = localInstModifications_compute();
        if (isFinal && num == state().boundariesCrossed) {
            localInstModifications_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return localInstModifications_value;
    }
    /**
     * @apilevel internal
     */
    private Collection<InstModification> localInstModifications_compute() {
            Collection<InstModification> nc = localInstModificationsNoClass();
            Collection<InstModification> c = localInstModificationsClass();
            if (nc.isEmpty()) {
                return c;
            } else if (c.isEmpty()) {
                return nc;
            } else {
                ArrayList<InstModification> l = new ArrayList<InstModification>();
                l.addAll(nc);
                l.addAll(c);
                return l;
            }
        }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsNoClass() {
        ASTNode$State state = state();
        Collection<InstModification> localInstModificationsNoClass_value = Collections.<InstModification>emptyList();

        return localInstModificationsNoClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public Collection<InstModification> localInstModificationsClass() {
        ASTNode$State state = state();
        Collection<InstModification> localInstModificationsClass_value = Collections.<InstModification>emptyList();

        return localInstModificationsClass_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstModification> instModificationsFromConstrainingType() {
        ASTNode$State state = state();
        java.util.List<InstModification> instModificationsFromConstrainingType_value = Collections.<InstModification>emptyList();

        return instModificationsFromConstrainingType_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getMergedEnvironment_computed = false;
    /**
     * @apilevel internal
     */
    protected Environment getMergedEnvironment_value;
    /**
     * @apilevel internal
     */
    private void getMergedEnvironment_reset() {
        getMergedEnvironment_computed = false;
        getMergedEnvironment_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment getMergedEnvironment() {
        if(getMergedEnvironment_computed) {
            return getMergedEnvironment_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getMergedEnvironment_value = filteredEnvironment().mergeInnerClone(getElementInstModifications(), localInstModifications());
        if (isFinal && num == state().boundariesCrossed) {
            getMergedEnvironment_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getMergedEnvironment_value;
    }
    @ASTNodeAnnotation.Attribute
    public Environment filteredEnvironment() {
        ASTNode$State state = state();
        Environment filteredEnvironment_value = nameScope() ? myEnvironment(name()) : myEnvironment();

        return filteredEnvironment_value;
    }
    protected Map myEnvironment_def_String_values;
    /**
     * @apilevel internal
     */
    private void myEnvironment_def_String_reset() {
        myEnvironment_def_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironment_def(String name) {
        Object _parameters = name;
        if (myEnvironment_def_String_values == null) myEnvironment_def_String_values = new HashMap(4);
        if(myEnvironment_def_String_values.containsKey(_parameters)) {
            return (Environment)myEnvironment_def_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        Environment myEnvironment_def_String_value = getMergedEnvironment().filter(name, retrieveReplacingComponent(name), retrieveReplacingClass(name));
        if (isFinal && num == state().boundariesCrossed) {
            myEnvironment_def_String_values.put(_parameters, myEnvironment_def_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return myEnvironment_def_String_value;
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:699
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentRedeclare retrieveReplacingComponent(String name) {
        ASTNode$State state = state();
        try {
        		for (InstModification im : getMergedEnvironment()) {
        			InstComponentRedeclare icr = im.matchInstComponentRedeclare(name);
        			if (icr != null) 
        				return icr;
        		}
        		return null;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:708
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentRedeclare retrieveConstrainingComponent(String name) {
        ASTNode$State state = state();
        try {
                for (InstModification im : getMergedEnvironment()) {
                    InstComponentRedeclare icr = im.matchInstComponentRedeclare(name);
                    if (icr != null && icr.getComponentRedeclare().getComponentDecl().hasConstrainingClause()) 
                        return icr;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:718
     */
    @ASTNodeAnnotation.Attribute
    public InstRedeclareClassNode retrieveReplacingClass(String name) {
        ASTNode$State state = state();
        try {
        		for (InstModification im : getMergedEnvironment()) {
        			InstClassRedeclare icr = im.matchInstClassRedeclare(name);
        			if (icr != null) 
        				return icr;
        		}
        		return null;
        	}
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:727
     */
    @ASTNodeAnnotation.Attribute
    public InstRedeclareClassNode retrieveConstrainingClass(String name) {
        ASTNode$State state = state();
        try {
                for (InstModification im : getMergedEnvironment()) {
                    InstRedeclareClassNode icr = im.matchInstClassRedeclare(name);
                    if (icr != null && icr.redeclaringClassDecl().hasConstrainingClause()) 
                        return icr;
                }
                return null;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean totalMergedEnvironment_computed = false;
    /**
     * @apilevel internal
     */
    protected Environment totalMergedEnvironment_value;
    /**
     * @apilevel internal
     */
    private void totalMergedEnvironment_reset() {
        totalMergedEnvironment_computed = false;
        totalMergedEnvironment_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Environment totalMergedEnvironment() {
        if(totalMergedEnvironment_computed) {
            return totalMergedEnvironment_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        totalMergedEnvironment_value = totalMergedEnvironment_compute();
        if (isFinal && num == state().boundariesCrossed) {
            totalMergedEnvironment_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return totalMergedEnvironment_value;
    }
    /**
     * @apilevel internal
     */
    private Environment totalMergedEnvironment_compute() {
    		if (getNumInstExtends()==0)
    			return getMergedEnvironment();
    		else
    			return getInstExtends(0).totalMergedEnvironment();
    	}
    /**
     * @apilevel internal
     */
    protected boolean getDynamicFExpOpt_computed = false;
    /**
     * @apilevel internal
     */
    protected Opt getDynamicFExpOpt_value;
    /**
     * @apilevel internal
     */
    private void getDynamicFExpOpt_reset() {
        getDynamicFExpOpt_computed = false;
        getDynamicFExpOpt_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Opt getDynamicFExpOpt() {
        if(getDynamicFExpOpt_computed) {
            return getDynamicFExpOpt_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getDynamicFExpOpt_value = new DynamicOpt();
        getDynamicFExpOpt_value.setParent(this);
        getDynamicFExpOpt_value.is$Final = true;
        if (true) {
            getDynamicFExpOpt_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return getDynamicFExpOpt_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getInstComponentDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstComponentDeclList_value;
    /**
     * @apilevel internal
     */
    private void getInstComponentDeclList_reset() {
        getInstComponentDeclList_computed = false;
        getInstComponentDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstComponentDeclList() {
        if(getInstComponentDeclList_computed) {
            return (List) getChild(getInstComponentDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstComponentDeclList_value = getInstComponentDeclList_compute();
        setChild(getInstComponentDeclList_value, getInstComponentDeclListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstComponentDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstComponentDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstComponentDeclList_compute() {
    		List<InstComponentDecl> l = new List<InstComponentDecl>();
    		for (ComponentDecl cd : components()) 
    	        l.add(createInstComponentDecl(cd));
    		return l;
    		
    	}
    /**
     * @apilevel internal
     */
    protected boolean getInstClassDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstClassDeclList_value;
    /**
     * @apilevel internal
     */
    private void getInstClassDeclList_reset() {
        getInstClassDeclList_computed = false;
        getInstClassDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstClassDeclList() {
        if(getInstClassDeclList_computed) {
            return (List) getChild(getInstClassDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstClassDeclList_value = getInstClassDeclList_compute();
        setChild(getInstClassDeclList_value, getInstClassDeclListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstClassDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstClassDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstClassDeclList_compute() {
            List l = new List();
            
            for (ClassDecl cd : classes()) {
                if (!cd.hasRedeclare()) {
                    InstClassDecl icd = createInstClassDecl(cd);
                    if (icd != null)
                        l.add(icd);
                }
            }
            
            return l;
        }
    /**
     * @apilevel internal
     */
    protected boolean getRedeclaredInstClassDeclList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getRedeclaredInstClassDeclList_value;
    /**
     * @apilevel internal
     */
    private void getRedeclaredInstClassDeclList_reset() {
        getRedeclaredInstClassDeclList_computed = false;
        getRedeclaredInstClassDeclList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getRedeclaredInstClassDeclList() {
        if(getRedeclaredInstClassDeclList_computed) {
            return (List) getChild(getRedeclaredInstClassDeclListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getRedeclaredInstClassDeclList_value = getRedeclaredInstClassDeclList_compute();
        setChild(getRedeclaredInstClassDeclList_value, getRedeclaredInstClassDeclListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getRedeclaredInstClassDeclList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getRedeclaredInstClassDeclListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getRedeclaredInstClassDeclList_compute() {
    		List l = new List();
    		
    		for (ClassDecl cd : classes()) {
    			if (cd.hasRedeclare()) {
    			    InstNode icd = cd.newInstClassDecl();
    			    if (icd != null)
    			    	l.add(icd);
    			}
    		}				
    		
    		return l;
    	}
    /**
     * @apilevel internal
     */
    protected boolean getInstExtendsList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getInstExtendsList_value;
    /**
     * @apilevel internal
     */
    private void getInstExtendsList_reset() {
        getInstExtendsList_computed = false;
        getInstExtendsList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstExtendsList() {
        if(getInstExtendsList_computed) {
            return (List) getChild(getInstExtendsListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getInstExtendsList_value = getInstExtendsList_compute();
        setChild(getInstExtendsList_value, getInstExtendsListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getInstExtendsList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getInstExtendsListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstExtendsList_compute() {
            List l = new List();
            if (shouldHaveInstExtendsList()) {
                InstNode lookup = instLookupNodeForShortClassExtends();
                for (ExtendsClause e : superClasses()) { 
                    l.add(createInstExtends(e, lookup));
                }
            }
            return l;
        }
    @ASTNodeAnnotation.Attribute
    public boolean shouldHaveInstExtendsList() {
        ASTNode$State state = state();
        boolean shouldHaveInstExtendsList_value = true;

        return shouldHaveInstExtendsList_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstNode instLookupNodeForShortClassExtends() {
        ASTNode$State state = state();
        InstNode instLookupNodeForShortClassExtends_value = myInstClass().instLookupNodeForShortClassExtends();

        return instLookupNodeForShortClassExtends_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean getElementInstModificationList_computed = false;
    /**
     * @apilevel internal
     */
    protected List<InstModification> getElementInstModificationList_value;
    /**
     * @apilevel internal
     */
    private void getElementInstModificationList_reset() {
        getElementInstModificationList_computed = false;
        getElementInstModificationList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List<InstModification> getElementInstModificationList() {
        if(getElementInstModificationList_computed) {
            return (List<InstModification>) getChild(getElementInstModificationListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getElementInstModificationList_value = getElementInstModificationList_compute();
        setChild(getElementInstModificationList_value, getElementInstModificationListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getElementInstModificationList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List<InstModification> node = (List<InstModification>) this.getChild(getElementInstModificationListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<InstModification> getElementInstModificationList_compute() {
            List<InstModification> l = new List<InstModification>();
            for (Modification m : elementModifications()) 
                l.add(m.newInstModification());
            return l;
    	}
    /**
     * @apilevel internal
     */
    protected boolean getFAbstractEquationList_computed = false;
    /**
     * @apilevel internal
     */
    protected List getFAbstractEquationList_value;
    /**
     * @apilevel internal
     */
    private void getFAbstractEquationList_reset() {
        getFAbstractEquationList_computed = false;
        getFAbstractEquationList_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public List getFAbstractEquationList() {
        if(getFAbstractEquationList_computed) {
            return (List) getChild(getFAbstractEquationListChildPosition());
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        getFAbstractEquationList_value = buildFAbstractEquationList();
        setChild(getFAbstractEquationList_value, getFAbstractEquationListChildPosition());
        if (isFinal && num == state().boundariesCrossed) {
            getFAbstractEquationList_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        List node = (List) this.getChild(getFAbstractEquationListChildPosition());
        return node;
    }
    @ASTNodeAnnotation.Attribute
    public List getInstImportList() {
        ASTNode$State state = state();
        List getInstImportList_value = getInstImportList_compute();
        setChild(getInstImportList_value, getInstImportListChildPosition());

        List node = (List) this.getChild(getInstImportListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List getInstImportList_compute() {
        	List l = new List();
        	for (ImportClause ic : imports()) {
        		InstImport iic = ic.newInstImport();
        		iic.setLocation(ic);
        		l.add(iic);
        	}
        	return l;
        }
    @ASTNodeAnnotation.Attribute
    public boolean nameScope() {
        ASTNode$State state = state();
        boolean nameScope_value = false;

        return nameScope_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = "";

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public String buildQualifiedName() {
        ASTNode$State state = state();
        String buildQualifiedName_value = combineName(instClassNamePrefix(false), name());

        return buildQualifiedName_value;
    }
    @ASTNodeAnnotation.Attribute
    public String baseClassName() {
        ASTNode$State state = state();
        String baseClassName_value = (getNumInstExtends() > 0) ? getInstExtends(0).baseClassName() : qualifiedName();

        return baseClassName_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<AbstractEquation> equations() {
        ASTNode$State state = state();
        Iterable<AbstractEquation> equations_value = Collections.<AbstractEquation>emptyList();

        return equations_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Algorithm> algorithms() {
        ASTNode$State state = state();
        Iterable<Algorithm> algorithms_value = Collections.<Algorithm>emptyList();

        return algorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<FAlgorithm> fAlgorithms() {
        ASTNode$State state = state();
        Iterable<FAlgorithm> fAlgorithms_value = Collections.<FAlgorithm>emptyList();

        return fAlgorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = Collections.<ComponentDecl>emptyList();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = Collections.<ExtendsClause>emptyList();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = Collections.<ClassDecl>emptyList();

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = Collections.<ImportClause>emptyList();

        return imports_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Modification> elementModifications() {
        ASTNode$State state = state();
        Iterable<Modification> elementModifications_value = Collections.<Modification>emptyList();

        return elementModifications_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInstConstraining() {
        ASTNode$State state = state();
        boolean hasInstConstraining_value = false;

        return hasInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public InstConstraining getInstConstraining() {
        ASTNode$State state = state();
        InstConstraining getInstConstraining_value = null;

        return getInstConstraining_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRedeclared() {
        ASTNode$State state = state();
        boolean isRedeclared_value = false;

        return isRedeclared_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isReplaceable() {
        ASTNode$State state = state();
        boolean isReplaceable_value = false;

        return isReplaceable_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstrained() {
        ASTNode$State state = state();
        boolean isConstrained_value = isReplaceable() || isRedeclared();

        return isConstrained_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsPrimitive() {
        ASTNode$State state = state();
        boolean extendsPrimitive_value = false;

        return extendsPrimitive_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isClassDecl() {
        ASTNode$State state = state();
        boolean isClassDecl_value = false;

        return isClassDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isExtends() {
        ASTNode$State state = state();
        boolean isExtends_value = false;

        return isExtends_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isComponentDecl() {
        ASTNode$State state = state();
        boolean isComponentDecl_value = false;

        return isComponentDecl_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOrExtendsPrimitive() {
        ASTNode$State state = state();
        boolean isOrExtendsPrimitive_value = isPrimitive() || extendsPrimitive();

        return isOrExtendsPrimitive_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean extendsEnum() {
        ASTNode$State state = state();
        boolean extendsEnum_value = false;

        return extendsEnum_value;
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2088
     */
    @ASTNodeAnnotation.Attribute
    public InstNode commonAncestor(InstNode node) {
        ASTNode$State state = state();
        try {
                HashSet<InstNode> theirs = new HashSet<InstNode>(node.instAncestors());
                for (InstNode mine : instAncestors())
                    if (theirs.contains(mine))
                        return mine;
                return null;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2096
     */
    @ASTNodeAnnotation.Attribute
    public java.util.List<InstNode> instAncestors() {
        ASTNode$State state = state();
        try {
                ArrayList<InstNode> list = new ArrayList<InstNode>();
                InstNode cur = this;
                while (cur != null) {
                    list.add(cur);
                    cur = cur.instNodeParent();
                }
                return list;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2110
     */
    @ASTNodeAnnotation.Attribute
    public InstNode matchingAncestor(InstNode node) {
        ASTNode$State state = state();
        try {
                if (node.isClassDecl()) {
                    int dims = node.nTypeDims();
                    for (InstNode mine : instAncestors()) {
                        if (mine.isThisClass(node)) {
                            if (dims == 0 || mine.isClassDecl()) {
                                return mine;
                            }
                            dims = dims - 1;
                        }
                    }
                    return null;
                } else {
                    return commonAncestor(node);
                }
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int nTypeDims() {
        ASTNode$State state = state();
        int nTypeDims_value = 0;

        return nTypeDims_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isThisClass(InstNode node) {
        ASTNode$State state = state();
        boolean isThisClass_InstNode_value = this == node;

        return isThisClass_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public java.util.List<FSubscript> myFSubscripts() {
        ASTNode$State state = state();
        java.util.List<FSubscript> myFSubscripts_value = Collections.emptyList();

        return myFSubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = false;

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitive() {
        ASTNode$State state = state();
        boolean isPrimitive_value = false;

        return isPrimitive_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean subType(InstNode t) {
        ASTNode$State state = state();
        boolean subType_InstNode_value = subType(t, true);

        return subType_InstNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean subType(InstNode t, boolean top) {
        ASTNode$State state = state();
        boolean subType_InstNode_boolean_value = false;

        return subType_InstNode_boolean_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isCompositeType() {
        ASTNode$State state = state();
        boolean isCompositeType_value = false;

        return isCompositeType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isArrayPartType() {
        ASTNode$State state = state();
        boolean isArrayPartType_value = false;

        return isArrayPartType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isRecordType() {
        ASTNode$State state = state();
        boolean isRecordType_value = false;

        return isRecordType_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPrimitiveType() {
        ASTNode$State state = state();
        boolean isPrimitiveType_value = false;

        return isPrimitiveType_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean containedInstComponents_computed = false;
    /**
     * @apilevel internal
     */
    protected SortedSet<InstComponentDecl> containedInstComponents_value;
    /**
     * @apilevel internal
     */
    private void containedInstComponents_reset() {
        containedInstComponents_computed = false;
        containedInstComponents_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public SortedSet<InstComponentDecl> containedInstComponents() {
        if(containedInstComponents_computed) {
            return containedInstComponents_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        containedInstComponents_value = containedInstComponents_compute();
        if (isFinal && num == state().boundariesCrossed) {
            containedInstComponents_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return containedInstComponents_value;
    }
    /**
     * @apilevel internal
     */
    private SortedSet<InstComponentDecl> containedInstComponents_compute() {
            SortedSet<InstComponentDecl> s = new TreeSet<InstComponentDecl>(InstComponentDecl.NAME_COMPARATOR);
            for (InstNode node : getInstExtendss())
                s.addAll(node.containedInstComponents());
            for (InstComponentDecl node : getInstComponentDecls())
                s.add(node);
            return s;
        }
    @ASTNodeAnnotation.Attribute
    public InstNode constrainingInstType() {
        ASTNode$State state = state();
        InstNode constrainingInstType_value = this;

        return constrainingInstType_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode classAnnotation() {
        ASTNode$State state = state();
        AnnotationNode classAnnotation_value = myInstClass().annotation();

        return classAnnotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public SourceRoot sourceRoot() {
        ASTNode$State state = state();
        SourceRoot sourceRoot_value = (SourceRoot) root();

        return sourceRoot_value;
    }
    @ASTNodeAnnotation.Attribute
    public String buildInstanceName(InstClassDecl cls, FQName suffix) {
        ASTNode$State state = state();
        String buildInstanceName_InstClassDecl_FQName_value = (suffix.numParts() == 0) ? cls.name() : cls.name() + '.' + suffix.name();

        return buildInstanceName_InstClassDecl_FQName_value;
    }
    /**
     * @attribute syn
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:715
     */
    @ASTNodeAnnotation.Attribute
    public String libraryName() {
        ASTNode$State state = state();
        try {
        	  InstClassDecl icd = myInstClass();
        	  String res = icd.isUnknown() ? findLibraryName() : icd.findLibraryName();
        	  return (res == null) ? name() : res;
          }
        finally {
        }
    }
    /**
     * @attribute inh
     * @aspect FlatTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2342
     */
    @ASTNodeAnnotation.Attribute
    public boolean inRecordDecl() {
        ASTNode$State state = state();
        boolean inRecordDecl_value = getParent().Define_inRecordDecl(this, null);

        return inRecordDecl_value;
    }
    /**
     * @attribute inh
     * @aspect FlatNames
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:108
     */
    @ASTNodeAnnotation.Attribute
    public FQName retrieveFQName() {
        if(retrieveFQName_computed) {
            return retrieveFQName_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        retrieveFQName_value = getParent().Define_retrieveFQName(this, null);
        if (isFinal && num == state().boundariesCrossed) {
            retrieveFQName_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return retrieveFQName_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean retrieveFQName_computed = false;
    /**
     * @apilevel internal
     */
    protected FQName retrieveFQName_value;
    /**
     * @apilevel internal
     */
    private void retrieveFQName_reset() {
        retrieveFQName_computed = false;
        retrieveFQName_value = null;
    }
    /**
     * Get the class or component containing this node.
     * @attribute inh
     * @aspect FlatFunctionUtils
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1636
     */
    @ASTNodeAnnotation.Attribute
    public InstNode containingEntity() {
        ASTNode$State state = state();
        InstNode containingEntity_value = getParent().Define_containingEntity(this, null);

        return containingEntity_value;
    }
    /**
     * Helper method for {@link #canBeReplacedIn(InstNode)} - use it instead.
     * @attribute inh
     * @aspect InstanceErrorCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1372
     */
    @ASTNodeAnnotation.Attribute
    public boolean canBeReplacedInHelper(InstNode ancestor) {
        ASTNode$State state = state();
        boolean canBeReplacedInHelper_InstNode_value = getParent().Define_canBeReplacedInHelper(this, null, ancestor);

        return canBeReplacedInHelper_InstNode_value;
    }
    /**
     * @attribute inh
     * @aspect FlatTypeCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:336
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInRedeclareMod() {
        ASTNode$State state = state();
        boolean isInRedeclareMod_value = getParent().Define_isInRedeclareMod(this, null);

        return isInRedeclareMod_value;
    }
    /**
     * Extract the part of a binding array expression that refers to this primitive or record.
     * 
     * Will not create new nodes unless necessary.
     * 
     * @param fe    the expression to split
     * @param node  the node where the binding expression was declared 
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1369
     */
    @ASTNodeAnnotation.Attribute
    public FExp splitBindingFExp(FExp fe, InstNode node) {
        ASTNode$State state = state();
        FExp splitBindingFExp_FExp_InstNode_value = getParent().Define_splitBindingFExp(this, null, fe, node);

        return splitBindingFExp_FExp_InstNode_value;
    }
    /**
     * @attribute inh
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1742
     */
    @ASTNodeAnnotation.Attribute
    public InstNode parentNodeToSetModLevelFor() {
        ASTNode$State state = state();
        InstNode parentNodeToSetModLevelFor_value = getParent().Define_parentNodeToSetModLevelFor(this, null);

        return parentNodeToSetModLevelFor_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:21
     */
    @ASTNodeAnnotation.Attribute
    public boolean inOuter() {
        ASTNode$State state = state();
        boolean inOuter_value = getParent().Define_inOuter(this, null);

        return inOuter_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:27
     */
    @ASTNodeAnnotation.Attribute
    public boolean inInner() {
        ASTNode$State state = state();
        boolean inInner_value = getParent().Define_inInner(this, null);

        return inInner_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:49
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl lookupInnerInstComponent(InstComponentDecl outer, boolean firstScope) {
        ASTNode$State state = state();
        InstComponentDecl lookupInnerInstComponent_InstComponentDecl_boolean_value = getParent().Define_lookupInnerInstComponent(this, null, outer, firstScope);

        return lookupInnerInstComponent_InstComponentDecl_boolean_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:131
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl lookupInnerInstClass(String name, boolean firstScope) {
        ASTNode$State state = state();
        InstClassDecl lookupInnerInstClass_String_boolean_value = getParent().Define_lookupInnerInstClass(this, null, name, firstScope);

        return lookupInnerInstClass_String_boolean_value;
    }
    /**
     * @attribute inh
     * @aspect InnerOuterClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:146
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl lookupInInnerInstClass(String name) {
        ASTNode$State state = state();
        InstClassDecl lookupInInnerInstClass_String_value = getParent().Define_lookupInInnerInstClass(this, null, name);

        return lookupInInnerInstClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:28
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:139
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupInstClassFromTop(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupInstClassFromTop_String_value = getParent().Define_lookupInstClassFromTop(this, null, name);

        return lookupInstClassFromTop_String_value;
    }
    /**
     * Look up the class being redeclared & extended in a "redeclare class extends" declaration.
     * @attribute inh
     * @aspect InstLookupClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:149
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClass(String name) {
        ASTNode$State state = state();
        InstLookupResult<InstClassDecl> lookupRedeclareExtendsInstClass_String_value = getParent().Define_lookupRedeclareExtendsInstClass(this, null, name);

        return lookupRedeclareExtendsInstClass_String_value;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:319
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstComponent(String name) {
        Object _parameters = name;
        if (lookupInstComponent_String_values == null) lookupInstComponent_String_values = new HashMap(4);
        if(lookupInstComponent_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)lookupInstComponent_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> lookupInstComponent_String_value = getParent().Define_lookupInstComponent(this, null, name);
        if (isFinal && num == state().boundariesCrossed) {
            lookupInstComponent_String_values.put(_parameters, lookupInstComponent_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return lookupInstComponent_String_value;
    }
    protected Map lookupInstComponent_String_values;
    /**
     * @apilevel internal
     */
    private void lookupInstComponent_String_reset() {
        lookupInstComponent_String_values = null;
    }
    /**
     * @attribute inh
     * @aspect InstLookupComponents
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:625
     */
    @ASTNodeAnnotation.Attribute
    public InstLookupResult<InstComponentDecl> lookupInstConstant(String name) {
        Object _parameters = name;
        if (lookupInstConstant_String_values == null) lookupInstConstant_String_values = new HashMap(4);
        if(lookupInstConstant_String_values.containsKey(_parameters)) {
            return (InstLookupResult<InstComponentDecl>)lookupInstConstant_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        InstLookupResult<InstComponentDecl> lookupInstConstant_String_value = getParent().Define_lookupInstConstant(this, null, name);
        if (isFinal && num == state().boundariesCrossed) {
            lookupInstConstant_String_values.put(_parameters, lookupInstConstant_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return lookupInstConstant_String_value;
    }
    protected Map lookupInstConstant_String_values;
    /**
     * @apilevel internal
     */
    private void lookupInstConstant_String_reset() {
        lookupInstConstant_String_values = null;
    }
    /**
     * Find the surrounding class, if any.
     * @attribute inh
     * @aspect InstBindingType
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:345
     */
    @ASTNodeAnnotation.Attribute
    public InstClassDecl surroundingInstClass() {
        ASTNode$State state = state();
        InstClassDecl surroundingInstClass_value = getParent().Define_surroundingInstClass(this, null);

        return surroundingInstClass_value;
    }
    /**
     * @attribute inh
     * @aspect InstVariability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstVariability.jrag:37
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability overrideVariability(FTypePrefixVariability var, FTypePrefixVariability bexpVar) {
        ASTNode$State state = state();
        FTypePrefixVariability overrideVariability_FTypePrefixVariability_FTypePrefixVariability_value = getParent().Define_overrideVariability(this, null, var, bexpVar);

        return overrideVariability_FTypePrefixVariability_FTypePrefixVariability_value;
    }
    /**
     * myEnvironment represents the environment of the InstNode itself. It is defined
     * as an inherited attribute and is computed from the outer environment located at
     * ancestor InstNodes.
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:488
     */
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironment() {
        ASTNode$State state = state();
        Environment myEnvironment_value = getParent().Define_myEnvironment(this, null);

        return myEnvironment_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:489
     */
    @ASTNodeAnnotation.Attribute
    public Environment myEnvironment(String name) {
        ASTNode$State state = state();
        Environment myEnvironment_String_value = getParent().Define_myEnvironment(this, null, name);

        return myEnvironment_String_value;
    }
    /**
     * @attribute inh
     * @aspect Environments
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:761
     */
    @ASTNodeAnnotation.Attribute
    public InstNode myInstNode() {
        ASTNode$State state = state();
        InstNode myInstNode_value = getParent().Define_myInstNode(this, null);

        return myInstNode_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1180
     */
    @ASTNodeAnnotation.Attribute
    public boolean isInInstModification() {
        ASTNode$State state = state();
        boolean isInInstModification_value = getParent().Define_isInInstModification(this, null);

        return isInInstModification_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1862
     */
    @ASTNodeAnnotation.Attribute
    public String instClassNamePrefix(boolean sup) {
        ASTNode$State state = state();
        String instClassNamePrefix_boolean_value = getParent().Define_instClassNamePrefix(this, null, sup);

        return instClassNamePrefix_boolean_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2083
     */
    @ASTNodeAnnotation.Attribute
    public boolean enclosedBy(InstNode node) {
        ASTNode$State state = state();
        boolean enclosedBy_InstNode_value = getParent().Define_enclosedBy(this, null, node);

        return enclosedBy_InstNode_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2106
     */
    @ASTNodeAnnotation.Attribute
    public InstNode instNodeParent() {
        ASTNode$State state = state();
        InstNode instNodeParent_value = getParent().Define_instNodeParent(this, null);

        return instNodeParent_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2147
     */
    @ASTNodeAnnotation.Attribute
    public InstComponentDecl containingInstComponent() {
        ASTNode$State state = state();
        InstComponentDecl containingInstComponent_value = getParent().Define_containingInstComponent(this, null);

        return containingInstComponent_value;
    }
    /**
     * @attribute inh
     * @aspect InstanceAST_API
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2315
     */
    @ASTNodeAnnotation.Attribute
    public InstNode containingInstNode() {
        ASTNode$State state = state();
        InstNode containingInstNode_value = getParent().Define_containingInstNode(this, null);

        return containingInstNode_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:722
     */
    @ASTNodeAnnotation.Attribute
    public String findLibraryName() {
        ASTNode$State state = state();
        String findLibraryName_value = getParent().Define_findLibraryName(this, null);

        return findLibraryName_value;
    }
    /**
     * @attribute inh
     * @aspect Visibility
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1131
     */
    @ASTNodeAnnotation.Attribute
    public boolean inProtectedComponent() {
        ASTNode$State state = state();
        boolean inProtectedComponent_value = getParent().Define_inProtectedComponent(this, null);

        return inProtectedComponent_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:478
     * @apilevel internal
     */
    public int Define_retrieveArrayCompNdims(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return ndims() - 1;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:805
     * @apilevel internal
     */
    public boolean Define_inIterExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:813
     * @apilevel internal
     */
    public Size Define_expandSizeForIterExp(ASTNode caller, ASTNode child, Size s) {
        int childIndex = this.getIndexOfChild(caller);
        return s;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1225
     * @apilevel internal
     */
    public CommonForIndex Define_myForIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Arrays.jrag:1889
     * @apilevel internal
     */
    public int Define_iterExpDepth(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:773
     * @apilevel internal
     */
    public boolean Define_inDeadIfBranch(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1668
     * @apilevel internal
     */
    public boolean Define_isNormalEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2332
     * @apilevel internal
     */
    public boolean Define_inRecord(ASTNode caller, ASTNode child) {
        if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return false;
        }
        else {
            return getParent().Define_inRecord(this, caller);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2342
     * @apilevel internal
     */
    public boolean Define_inRecordDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2349
     * @apilevel internal
     */
    public boolean Define_inRecordConstructor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatNameBinding.jrag:436
     * @apilevel internal
     */
    public boolean Define_isForIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1626
     * @apilevel internal
     */
    public FFunctionDecl Define_containingFFunctionDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1645
     * @apilevel internal
     */
    public boolean Define_inAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1723
     * @apilevel internal
     */
    public boolean Define_functionCallIsExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1731
     * @apilevel internal
     */
    public ArrayList<FFunctionCallLeft> Define_myLefts(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new ArrayList<FFunctionCallLeft>();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1768
     * @apilevel internal
     */
    public String Define_calcGeneratedVarName(ASTNode caller, ASTNode child, FlatVariableMap.GeneratedVarType gvt) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1936
     * @apilevel internal
     */
    public boolean Define_inWhen(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1943
     * @apilevel internal
     */
    public boolean Define_isInitial(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:205
     * @apilevel internal
     */
    public boolean Define_inAssert(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:210
     * @apilevel internal
     */
    public boolean Define_inIfTestWithoutConnect(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:194
     * @apilevel internal
     */
    public boolean Define_isForAttributeOnOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:202
     * @apilevel internal
     */
    public boolean Define_isForOperatorRecordDeclarationMember(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:303
     * @apilevel internal
     */
    public boolean Define_iterExpUseOK(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:372
     * @apilevel internal
     */
    public FAbstractEquation Define_surroundingFAbstractEquation(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:551
     * @apilevel internal
     */
    public InstComponentDecl Define_errorEnclosingComponent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return containingInstComponent();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1351
     * @apilevel internal
     */
    public boolean Define_canBeReplacedForMe(ASTNode caller, ASTNode child, InstNode node) {
        int childIndex = this.getIndexOfChild(caller);
        return node.canBeReplacedFor(this);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1372
     * @apilevel internal
     */
    public boolean Define_canBeReplacedInHelper(ASTNode caller, ASTNode child, InstNode ancestor) {
        int childIndex = this.getIndexOfChild(caller);
        return (ancestor != this) && canBeReplacedIn(ancestor);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1492
     * @apilevel internal
     */
    public boolean Define_isWithin(ASTNode caller, ASTNode child, InstClassDecl icd) {
        int childIndex = this.getIndexOfChild(caller);
        return isOfInstClassDecl(icd);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1683
     * @apilevel internal
     */
    public FWhenEquation Define_myWhen(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ErrorCheck.jrag:1693
     * @apilevel internal
     */
    public FWhenEquation Define_findTopWhen(ASTNode caller, ASTNode child, FWhenEquation last) {
        int childIndex = this.getIndexOfChild(caller);
        return last;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/NameCheck.jadd:180
     * @apilevel internal
     */
    public ASTNode Define_nameCollisionScope(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:608
     * @apilevel internal
     */
    public boolean Define_inCardinality(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:666
     * @apilevel internal
     */
    public boolean Define_iterExpMustBeScalar(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
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
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/TypeCheck.jrag:1201
     * @apilevel internal
     */
    public boolean Define_inExternalObject(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return isExternalObject();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1369
     * @apilevel internal
     */
    public FExp Define_splitBindingFExp(ASTNode caller, ASTNode child, FExp fe, InstNode node) {
        int childIndex = this.getIndexOfChild(caller);
        return (node == this) ? fe : splitBindingFExp(fe, node);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1611
     * @apilevel internal
     */
    public boolean Define_inModWithEach(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1695
     * @apilevel internal
     */
    public boolean Define_isOnPrimitiveTypeDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1706
     * @apilevel internal
     */
    public int Define_modificationLevel(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return myModificationLevel;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1839
     * @apilevel internal
     */
    public boolean Define_expandSize(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:1927
     * @apilevel internal
     */
    public int Define_argIndexInRecordConstructor(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2095
     * @apilevel internal
     */
    public InstComponentDecl Define_findComponentWithThisBindingExp(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2104
     * @apilevel internal
     */
    public int Define_findDepthOfNestledFunctionCalls(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2122
     * @apilevel internal
     */
    public FExp Define_findArgOfNestledFunctionCall(ASTNode caller, ASTNode child, int index, int depth) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:2656
     * @apilevel internal
     */
    public FQName Define_sizeFlatteningPrefix(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return retrieveFQName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:49
     * @apilevel internal
     */
    public InstComponentDecl Define_lookupInnerInstComponent(ASTNode caller, ASTNode child, InstComponentDecl outer, boolean firstScope) {
        int childIndex = this.getIndexOfChild(caller);
        {
                InstComponentDecl res = genericLookupInstComponent(outer.name()).unresolved().targetOrNull();
                if (!firstScope && res != null && res.isInner()) {
                    return res;
                } else if (res != null && res.isOuter() && !res.isInner()) {
                    res = null;
                }
                return lookupInnerInstComponentNoLocal(outer, res);
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InnerOuter.jrag:131
     * @apilevel internal
     */
    public InstClassDecl Define_lookupInnerInstClass(ASTNode caller, ASTNode child, String name, boolean firstScope) {
        int childIndex = this.getIndexOfChild(caller);
        {
                if (!firstScope) {
                    InstClassDecl icd = genericLookupInstClass(name).target();
                    if (icd != null && icd.isInner())
                        return icd;
                }
                return lookupInnerInstClass(name, false);
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:29
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return superLookupInstClass(name);
        }
        else if (caller == getElementInstModificationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else if (caller == getFAbstractEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else if (caller == getInstComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else if (caller == getRedeclaredInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else if (caller == getInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:63
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassFromMod(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return genericLookupInstClass(name);
        }
        else {
            return getParent().Define_lookupInstClassFromMod(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:121
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupInstClassInChain(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return ((InstNode) child).lookupInstClass(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupClasses.jrag:149
     * @apilevel internal
     */
    public InstLookupResult<InstClassDecl> Define_lookupRedeclareExtendsInstClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getRedeclaredInstClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return lookupNextRedeclareExtendsInstClass(name);
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return InstLookupResult.notFound();
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:320
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return genericLookupInstComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:441
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInSurrounding(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return genericLookupInstComponent(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:625
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstConstant(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return memberInstConstantFirst(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:732
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstComponentInInstElement(ASTNode caller, ASTNode child, String name) {
        if (caller == getElementInstModificationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return memberInstComponent(name).unresolved();
        }
        else {
            return getParent().Define_lookupInstComponentInInstElement(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstLookupComponents.jrag:750
     * @apilevel internal
     */
    public InstLookupResult<InstComponentDecl> Define_lookupInstReplacingComponent(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return memberInstComponent(name).unresolved();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstTypeAnalysis.jrag:287
     * @apilevel internal
     */
    public InstModification Define_retrieveModificationLackingEach(ASTNode caller, ASTNode child, Size s) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:468
     * @apilevel internal
     */
    public Environment Define_myEnvironmentNoClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getMergedEnvironment().clone();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:469
     * @apilevel internal
     */
    public Environment Define_myEnvironmentClass(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return new Environment();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:488
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return getMergedEnvironment().clone();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:517
     * @apilevel internal
     */
    public Environment Define_myEnvironment(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        return myEnvironment_def(name);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:677
     * @apilevel internal
     */
    public InstModification Define_surroundingInstModification(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:741
     * @apilevel internal
     */
    public InstRedeclareClassNode Define_lookupReplacingClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getInstExtendsListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            {
            		for (InstClassDecl icd : getRedeclaredInstClassDecls())
            			if (icd.name().equals(name))
            				return icd;
            		return retrieveReplacingClass(name);
            	}
        }
        else {
            return getParent().Define_lookupReplacingClass(this, caller, name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:760
     * @apilevel internal
     */
    public InstNode Define_myInstNode(ASTNode caller, ASTNode child) {
        if (caller == getElementInstModificationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return myInstNode();
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return this;
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1936
     * @apilevel internal
     */
    public InstEnumClassDecl Define_myInstEnumClassDecl(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1941
     * @apilevel internal
     */
    public int Define_myIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2083
     * @apilevel internal
     */
    public boolean Define_enclosedBy(ASTNode caller, ASTNode child, InstNode node) {
        int childIndex = this.getIndexOfChild(caller);
        return (node == this) || enclosedBy(node);
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2106
     * @apilevel internal
     */
    public InstNode Define_instNodeParent(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2315
     * @apilevel internal
     */
    public InstNode Define_containingInstNode(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2410
     * @apilevel internal
     */
    public int Define_myDimension(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return 0;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2418
     * @apilevel internal
     */
    public boolean Define_isTopDimension(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return true;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:2463
     * @apilevel internal
     */
    public Index Define_parentIndex(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:721
     * @apilevel internal
     */
    public String Define_findLibraryName(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return libraryName();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:727
     * @apilevel internal
     */
    public String Define_packagePath(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
                InstLookupResult<InstClassDecl> icd = lookupInstClassQualifiedGlobal(name);
                return icd.successful() ? icd.target().dirName() : null;
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:922
     * @apilevel internal
     */
    public InstAccess Define_myInstAccess(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:1838
     * @apilevel internal
     */
    public boolean Define_isElse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:1288
     * @apilevel internal
     */
    public FIfWhenEquation Define_surroundingIfOrElse(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen/Expressions.jrag:519
     * @apilevel internal
     */
    public boolean Define_isAssignUse(ASTNode caller, ASTNode child) {
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
