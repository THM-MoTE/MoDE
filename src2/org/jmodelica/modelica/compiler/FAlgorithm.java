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
 * A flattened algorithm clause.
 * @ast node
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/ast/FlatModelica.ast:698
 * @production FAlgorithm : {@link FAbstractEquation} ::= <span class="component">{@link FStatement}*</span>;

 */
public class FAlgorithm extends FAbstractEquation implements Cloneable {
    /**
     * Constructs an algorithm block that is not initial.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:189
     */
    public FAlgorithm(List<FStatement> stmts) {
		this(new FNormalEquation(), new List<FAttribute>(), stmts);
	}
    /**
     * Constructs an algorithm block.
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:196
     */
    public FAlgorithm(FEquationType type, List<FStatement> stmts) {
		this(type, new List<FAttribute>(), stmts);
	}
    /**
     * Find LHS variables which are definetly assigned to before any use.
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1858
     */
    public Set<FVariable> defSet() {
        HashSet<FVariable> fvSet = new HashSet<FVariable>();
        HashSet<FVariable> fvUse = new HashSet<FVariable>();
        for (FStatement stmt : getFStatements()) {
            stmt.defSet(fvSet, fvUse);
        }
        return fvSet;
    }
    /**
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3756
     */
    private String functionName = null;
    /**
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3757
     */
    public String generateFunctionName() {
        if (functionName == null)
            functionName = myFClass().generateFunctionName();
        return functionName;
    }
    /**
     * @aspect FlatPrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:1359
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);
		p.print(getType(),str,"");
		str.print("algorithm\n");
		getFStatements().prettyPrintWithIndent(p, str, p.indent(indent), ";");
	}
    /**
     * @aspect FlatTypeAnalysis
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/TypeAnalysis.jrag:55
     */
    public FExternalStmt getFExternalStmt() {
        for (FStatement stmt : getFStatements())
            if (stmt instanceof FExternalStmt)
                return (FExternalStmt) stmt;
        return null;
    }
    /**
     * @aspect ContentCheck
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ContentsCheck.jadd:52
     */
    public void contentCheck(ErrorCheckType checkType) {}
    /**
     * @aspect Flattening
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/Flattening.jrag:662
     */
    public void ensureReturn() {
        int num = getNumFStatement();
        if (num == 0 || !(getFStatement(num - 1) instanceof FReturnStmt)) 
            addFStatement(new FReturnStmt());
    }
    /**
     * @aspect FlatEquations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/flattening/FlatteningEquations.jrag:127
     */
    public void flattenEqn(List<FAbstractEquation> l, FQName prefix, FClass fc) {
        List l2 = new List();
        FStatement.flattenFStatementList(getFStatements(), l2, fc, prefix);
        l.add(new FAlgorithm(l2));
    }
    /**
     * @aspect TransformCanonical
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1048
     */
    public void acceptTransform(AlgorithmTransformer tf)  { tf.visit(this); }
    /**
     * @aspect CommonSubexpressionElimination
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/CommonSubexpressionElimination.jrag:155
     */
    public void collectFunctionCalls(FClass.commonSubexpressionEliminationIfSet m) {
        
    }
    /**
     * @aspect VariabilityPropagation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/VariabilityPropagation.jrag:389
     */
    public void variabilityPropagation(FClass.VariabilityPropagator propagator) {
        FTypePrefixVariability variability = variabilityRHS();
        if (variability.parameterVariability()) {
            for (FVariable fv : referencedFVariablesInLHS()) {
                fv.variabilityPropagation(propagator, variability, null);
            }
            propagator.addEquation(variability, this);
            this.taggedByVProp = true;
        }
    }
    /**
     * @aspect WhenClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/WhenTransformation.jrag:78
     */
    @Override
    protected FAbstractEquation convertWhenEqnToIfEqn(Collection<FAbstractEquation> outerEqnList, FClass fclass) {
        Collection<FStatement> newStmts = new ArrayList<FStatement>();
        for (FStatement stmt : getFStatements()) {
            newStmts.add(stmt.convertWhenStmtToIfStmt(outerEqnList, newStmts, fclass));
        }
        setFStatementList(new List<FStatement>(newStmts));
        return this;
    }
    /**
     * @aspect Scalarization
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/scalarization/Scalarization.jrag:958
     */
    @Override
    public void scalarize(Scalarizer.Equation s) {
		List<FStatement> stmts = new List<FStatement>();
        FStatement.scalarizeStmtList(s.algorithm(stmts), getFStatements());
        s.add(new FAlgorithm(stmts));
	}
    /**
     * @aspect BLT
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:376
     */
    @Override
	public SimpleEquationBlock createSimpleEquationBlock(Collection<FVariable> fvs, Collection<Integer> assignedIndices, Solvability solvability, EquationBlockFactory.BlockProducer producer, BlockDependency blockDependency) { 
		if (numScalarEquations() == 0)
			return new MetaEquationBlock(producer, blockDependency, this);
		for (Integer assignedIndex : assignedIndices)
			if (assignedIndex == null)
				throw new IllegalArgumentException("FAlgorithm, AssignedIndex must be set for this class type! equation: " + this);
		if (solvability.isAnalyticallySolvable()) {
			return new SolvedAlgorithmBlock(producer, blockDependency, this, fvs, assignedIndices);
		} else {
			return new UnsolvedAlgorithmBlock(producer, blockDependency, this, fvs, assignedIndices);
		}
	}
    /**
     * @aspect Graphs
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Graphs.jadd:2197
     */
    @Override
    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>, C extends SCCBlock<E, V>>
    AbstractBiPGraph<E, V ,C>.IncidenceMap createIncidenceMap(AbstractBiPGraph<E, V, C> g, EnumSet<AbstractBiPGraph.VarType> variableTypes,
            AbstractBiPGraph.VariableResolver<E, V> resolver) {
        return g.new ManyIncidenceMap(this, resolver, variableTypes);
    }
    /**
     * @aspect XMLCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFMUXBackEnd/src/jastadd/XMLCodeGen.jrag:302
     */
    public void prettyPrint_XML(Printer p, CodeStream str, String indent) {
		open_XML(str, indent);
		p.print(getFStatements(), str, p.indent(indent));
		close_XML(str, indent);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1603
     */
    @Override
    public void genVarDecls_C(CodePrinter p, CodeStream str, String indent) {
        super.genVarDecls_C(p, str, indent);
        if (!inFunction() && !isParameterEquation()) {
            boolean first = true;
            String switchTemp = this.tempName_C();
            for (FIdUseExp use : uniqueFIdUseExpsInLHS()) {
                if (first) {
                    first = false;
                    use.type().printDecl_C(printer_C, str, indent, switchTemp, null);
                }
                if (!use.inFunctionCallLeftTop()) 
                    use.type().printDecl_C(printer_C, str, indent, use.tempName_C(), use);
            }
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:1738
     */
    @Override
	public void prettyPrint_C(CodePrinter p, CodeStream str, String indent) {
		if (!inFunction()) {
			// Print initialization stmts for variables which might not be set before use
			Set<FVariable> defSet = defSet();
			for (FVariable fv : referencedFVariablesInLHS()) {
				if (!defSet.contains(fv)) {
					FStatement.printAssignStmt_C(str, indent, fv.name_C(), fv.algorithmInit_C());
				}
			}
		}
		// Print the algorithm
		p.print(getFStatements(), str, indent);
	}
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3458
     */
    @Override
    public void genBlock_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        boolean sideEffect = forVariables == null || forVariables.size() == uniqueFIdUseExpsInLHS().size();
        genBlockEval_C(p, str, indent, visited, forVariables, forIndices);
        if (!sideEffect)
            for (FIdUseExp use : uniqueFIdUseExpsInLHS())
                use.genWriteBackAssignment_C(str, indent, use.tempName_C(), forVariables);
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3468
     */
    @Override
    public void genBlockEval_C(CodePrinter p, CodeStream str, String indent, Set<FAbstractEquation> visited,
            Collection<FVariable> forVariables, Collection<Integer> forIndices) {
        boolean firstVisit = visited == null ? true : visited.add(this);
        boolean sideEffect = forVariables == null || forVariables.size() == uniqueFIdUseExpsInLHS().size();
        if (firstVisit) {
            if (sideEffect)
                p.print(this, str, indent);
            else
                prettyPrintNoSideEffect_C(str, indent);
        }
    }
    /**
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3623
     */
    @Override
    public void genResidual_C(CodePrinter p, CodeStream str, String indent, Enumerator enumerator, Set<FAbstractEquation> visited, Set<Integer> forIndices) {
        if (!visited.contains(this)) {
            visited.add(this);
            p.printPreSteps(this, str, indent);
            prettyPrintNoSideEffect_C(str, indent);
            p.printPostSteps(this, str, indent);
        }
        Enumerator indexCounter = new Enumerator();
        for (FIdUseExp use : uniqueFIdUseExpsInLHS())
            use.genWriteBackResidual_C(str, indent, use.tempName_C(), enumerator, forIndices, indexCounter);
    }
    /**
     * Helper for genBlock_C and genResidual_C
     * Prints the algorithm, statements which restore LHS variables,
     * and statements which put the new values in temporaries.
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:3641
     */
    public void prettyPrintNoSideEffect_C(CodeStream str, String indent) {
        String switchTemp = this.tempName_C();
        Collection<FIdUseExp> lhs = uniqueFIdUseExpsInLHS();
        for (FIdUseExp use : lhs)
            FStatement.printAssignStmt_C(str, indent, use.tempName_C(), use.myFV().name_C());
        prettyPrint_C(str, indent);
        for (FIdUseExp use : lhs) {
            FStatement.printAssignStmt_C(str, indent, switchTemp, use.myFV().name_C());
            FStatement.printAssignStmt_C(str, indent, use.myFV().name_C(), use.tempName_C());
            FStatement.printAssignStmt_C(str, indent, use.tempName_C(), switchTemp);
        }
    }
    /**
     * @declaredat ASTNode:1
     */
    public FAlgorithm() {
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
        children = new ASTNode[5];
        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
        setChild(new Opt(), 4);
    }
    /**
     * @declaredat ASTNode:17
     */
    public FAlgorithm(FEquationType p0, List<FAttribute> p1, List<FStatement> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:25
     */
    protected int numChildren() {
        return 3;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:31
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:37
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        numScalarEquations_reset();
        referencedFVariablesInLHS_reset();
        tempName_C_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:46
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
        collect_contributors_FStatement_eventGenExps = false;
    }
    /**
     * @api internal
     * @declaredat ASTNode:53
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:59
     */
    public FAlgorithm clone() throws CloneNotSupportedException {
        FAlgorithm node = (FAlgorithm) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:66
     */
    public FAlgorithm copy() {
        try {
            FAlgorithm node = (FAlgorithm) clone();
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
     * @declaredat ASTNode:85
     */
    public FAlgorithm fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:94
     */
    public FAlgorithm treeCopyNoTransform() {
        FAlgorithm tree = (FAlgorithm) copy();
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                switch (i) {
                case 4:
                    tree.children[i] = new Opt();
                    continue;
                case 3:
                    tree.children[i] = new List();
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
     * @declaredat ASTNode:122
     */
    public FAlgorithm treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:129
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Type child.
     * @param node The new node to replace the Type child.
     * @apilevel high-level
     */
    public void setType(FEquationType node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Type child.
     * @return The current node used as the Type child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Type")
    public FEquationType getType() {
        return (FEquationType) getChild(0);
    }
    /**
     * Retrieves the Type child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Type child.
     * @apilevel low-level
     */
    public FEquationType getTypeNoTransform() {
        return (FEquationType) getChildNoTransform(0);
    }
    /**
     * Replaces the FAttribute list.
     * @param list The new list node to be used as the FAttribute list.
     * @apilevel high-level
     */
    public void setFAttributeList(List<FAttribute> list) {
        setChild(list, 1);
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
        List<FAttribute> list = (List<FAttribute>) getChild(1);
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
        return (List<FAttribute>) getChildNoTransform(1);
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
     * Replaces the FStatement list.
     * @param list The new list node to be used as the FStatement list.
     * @apilevel high-level
     */
    public void setFStatementList(List<FStatement> list) {
        setChild(list, 2);
    }
    /**
     * Retrieves the number of children in the FStatement list.
     * @return Number of children in the FStatement list.
     * @apilevel high-level
     */
    public int getNumFStatement() {
        return getFStatementList().getNumChild();
    }
    /**
     * Retrieves the number of children in the FStatement list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the FStatement list.
     * @apilevel low-level
     */
    public int getNumFStatementNoTransform() {
        return getFStatementListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the FStatement list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the FStatement list.
     * @apilevel high-level
     */
    public FStatement getFStatement(int i) {
        return (FStatement) getFStatementList().getChild(i);
    }
    /**
     * Check whether the FStatement list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasFStatement() {
        return getFStatementList().getNumChild() != 0;
    }
    /**
     * Append an element to the FStatement list.
     * @param node The element to append to the FStatement list.
     * @apilevel high-level
     */
    public void addFStatement(FStatement node) {
        List<FStatement> list = (parent == null || state == null) ? getFStatementListNoTransform() : getFStatementList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addFStatementNoTransform(FStatement node) {
        List<FStatement> list = getFStatementListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the FStatement list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setFStatement(FStatement node, int i) {
        List<FStatement> list = getFStatementList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the FStatement list.
     * @return The node representing the FStatement list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="FStatement")
    public List<FStatement> getFStatementList() {
        List<FStatement> list = (List<FStatement>) getChild(2);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the FStatement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FStatement list.
     * @apilevel low-level
     */
    public List<FStatement> getFStatementListNoTransform() {
        return (List<FStatement>) getChildNoTransform(2);
    }
    /**
     * Retrieves the FStatement list.
     * @return The node representing the FStatement list.
     * @apilevel high-level
     */
    public List<FStatement> getFStatements() {
        return getFStatementList();
    }
    /**
     * Retrieves the FStatement list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the FStatement list.
     * @apilevel low-level
     */
    public List<FStatement> getFStatementsNoTransform() {
        return getFStatementListNoTransform();
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * @return Number of children in the InitialEquation list.
     * @apilevel high-level
     */
    public int getNumInitialEquation() {
        return getInitialEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the InitialEquation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the InitialEquation list.
     * @apilevel low-level
     */
    public int getNumInitialEquationNoTransform() {
        return getInitialEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the InitialEquation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the InitialEquation list.
     * @apilevel high-level
     */
    public FAbstractEquation getInitialEquation(int i) {
        return (FAbstractEquation) getInitialEquationList().getChild(i);
    }
    /**
     * Check whether the InitialEquation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasInitialEquation() {
        return getInitialEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the InitialEquation list.
     * @param node The element to append to the InitialEquation list.
     * @apilevel high-level
     */
    public void addInitialEquation(FAbstractEquation node) {
        List<FAbstractEquation> list = (parent == null || state == null) ? getInitialEquationListNoTransform() : getInitialEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addInitialEquationNoTransform(FAbstractEquation node) {
        List<FAbstractEquation> list = getInitialEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the InitialEquation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setInitialEquation(FAbstractEquation node, int i) {
        List<FAbstractEquation> list = getInitialEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the child position of the InitialEquation list.
     * @return The the child position of the InitialEquation list.
     * @apilevel low-level
     */
    protected int getInitialEquationListChildPosition() {
        return 3;
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationListNoTransform() {
        return (List<FAbstractEquation>) getChildNoTransform(3);
    }
    /**
     * Retrieves the InitialEquation list.
     * @return The node representing the InitialEquation list.
     * @apilevel high-level
     */
    public List<FAbstractEquation> getInitialEquations() {
        return getInitialEquationList();
    }
    /**
     * Retrieves the InitialEquation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the InitialEquation list.
     * @apilevel low-level
     */
    public List<FAbstractEquation> getInitialEquationsNoTransform() {
        return getInitialEquationListNoTransform();
    }
    /**
     * Replaces the (optional) DynamicFAbstractEquation child.
     * @param node The new node to be used as the DynamicFAbstractEquation child.
     * @apilevel high-level
     */
    public void setDynamicFAbstractEquation(FAbstractEquation node) {
        getDynamicFAbstractEquationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional DynamicFAbstractEquation child exists.
     * @return {@code true} if the optional DynamicFAbstractEquation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasDynamicFAbstractEquation() {
        return getDynamicFAbstractEquationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) DynamicFAbstractEquation child.
     * @return The DynamicFAbstractEquation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public FAbstractEquation getDynamicFAbstractEquation() {
        return (FAbstractEquation) getDynamicFAbstractEquationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for child DynamicFAbstractEquation. This is the <code>Opt</code> node containing the child DynamicFAbstractEquation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    public Opt<FAbstractEquation> getDynamicFAbstractEquationOptNoTransform() {
        return (Opt<FAbstractEquation>) getChildNoTransform(4);
    }
    /**
     * Retrieves the child position of the optional child DynamicFAbstractEquation.
     * @return The the child position of the optional child DynamicFAbstractEquation.
     * @apilevel low-level
     */
    protected int getDynamicFAbstractEquationOptChildPosition() {
        return 4;
    }
    /**
     * @aspect <NoAspect>
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:3336
     */
        private boolean collect_contributors_FStatement_eventGenExps = false;
    protected void collect_contributors_FStatement_eventGenExps() {
        if(collect_contributors_FStatement_eventGenExps) return;
        super.collect_contributors_FStatement_eventGenExps();
        collect_contributors_FStatement_eventGenExps = true;
    }

    /**
     * @apilevel internal
     */
    protected boolean numScalarEquations_computed = false;
    /**
     * @apilevel internal
     */
    protected int numScalarEquations_value;
    /**
     * @apilevel internal
     */
    private void numScalarEquations_reset() {
        numScalarEquations_computed = false;
    }
    @ASTNodeAnnotation.Attribute
    public int numScalarEquations() {
        if(numScalarEquations_computed) {
            return numScalarEquations_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        numScalarEquations_value = numScalarEquations_compute();
        if (isFinal && num == state().boundariesCrossed) {
            numScalarEquations_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return numScalarEquations_value;
    }
    /**
     * @apilevel internal
     */
    private int numScalarEquations_compute() {
            Set<FVariable> assignedVars = new HashSet<FVariable>();
            for (FIdUseExp use : FIdUseExpsInLHS()) {
                if (!use.myFV().isUnknown() && !assignedVars.contains(use.myFV())) {
                    FVariable fv = (FVariable) use.myFV();
                    assignedVars.add(fv);
                }
            }
            return assignedVars.size();
    
        }
    /**
     * @attribute syn
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1688
     */
    @ASTNodeAnnotation.Attribute
    public boolean replacedAtInitialization() {
        ASTNode$State state = state();
        try {
                if (super.replacedAtInitialization())
                    return true;
                
                /* 
                 * Even if there are no when statements, there might still be discrete 
                 * variables which are dependent on their pre() variables 
                 */
                Set<FVariable> notDefSet = referencedFVariablesInLHS();
                notDefSet.removeAll(defSet());
                for (FVariable fv : notDefSet)
                    if (fv.isDiscrete())
                        return true;
                return false;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public List<FAbstractEquation> getInitialEquationList() {
        ASTNode$State state = state();
        List<FAbstractEquation> getInitialEquationList_value = getInitialEquationList_compute();
        setChild(getInitialEquationList_value, getInitialEquationListChildPosition());

        List<FAbstractEquation> node = (List<FAbstractEquation>) this.getChild(getInitialEquationListChildPosition());
        return node;
    }
    /**
     * @apilevel internal
     */
    private List<FAbstractEquation> getInitialEquationList_compute() {
            ArrayList<FAbstractEquation> l = new ArrayList<FAbstractEquation>();
            
            // Keeps fiduseexps in lhs which have not been removed
            Set<FIdUseExp> usesLHS = FIdUseExpsInLHS();
            
            // Keeps track of which variables are definetly set
            Set<FVariable> fvSet  = new HashSet<FVariable>();
            Set<FVariable> fvUse  = new HashSet<FVariable>();
            
            // Create a new algorithm with some statements removed
            ArrayList<FStatement> stmts = new ArrayList<FStatement>();
            for (FStatement stmt : getFStatements()) {
                stmt.addAsInitial(stmts, usesLHS, fvSet, fvUse);
            }
            
            Set<FVariable> lhs = lookupFVariablesInSet(usesLHS);
    
            // Add initial statements for variables which are not definetly set
            // in the new algorithm
            ArrayList<FStatement> initStmts = new ArrayList<FStatement>();
            for (FVariable fv : lhs)
                if (!fvSet.contains(fv))
                    initStmts.add(new FAssignStmt(fv.createUseExp(), fv.createAlgorithmArgument(true)));
            for (FStatement stmt : stmts)
                initStmts.add(stmt);
            if (initStmts.size() > 0)
                l.add(new FAlgorithm(new List<FStatement>(initStmts)));
            
            // Create equations for variables which are no longer assigned 
            // in the new algorithm
            Set<FVariable> removedFVs = referencedFVariablesInLHS();
            removedFVs.removeAll(lhs);
            for (FVariable fv : removedFVs)
                l.add(new FEquation(fv.createUseExp(), fv.createFPreExp()));
            
            return new List<FAbstractEquation>(l);
        }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2070
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInRHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FStatement stmt : getFStatements())
                    res.addAll(stmt.FIdUseExpsInRHS(visitor));
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2108
     */
    @ASTNodeAnnotation.Attribute
    public Set<FIdUseExp> FIdUseExpsInLHS(FIdUseExpLookupVisitor visitor) {
        ASTNode$State state = state();
        try {
                Set<FIdUseExp> res = new LinkedHashSet<FIdUseExp>();
                for (FStatement stmt : getFStatements())
                    res.addAll(stmt.FIdUseExpsInLHS(visitor));
                return res;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect ReferencedVariables
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:2182
     */
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> variableDependenciesRHS() {
        ASTNode$State state = state();
        try {
                Set<FVariable> lhs = referencedFVariablesInLHS();
                Set<FVariable> rhs = referencedFVariablesInRHS();
                Set<FVariable> res = new LinkedHashSet<FVariable>();
                for (FVariable fv : rhs) {
                    if (!lhs.contains(fv)) {
                        res.add(fv);
                    }
                }
                return res;
            }
        finally {
        }
    }
    /**
     * @apilevel internal
     */
    protected boolean referencedFVariablesInLHS_computed = false;
    /**
     * @apilevel internal
     */
    protected Set<FVariable> referencedFVariablesInLHS_value;
    /**
     * @apilevel internal
     */
    private void referencedFVariablesInLHS_reset() {
        referencedFVariablesInLHS_computed = false;
        referencedFVariablesInLHS_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public Set<FVariable> referencedFVariablesInLHS() {
        if(referencedFVariablesInLHS_computed) {
            return referencedFVariablesInLHS_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        referencedFVariablesInLHS_value = super.referencedFVariablesInLHS();
        if (isFinal && num == state().boundariesCrossed) {
            referencedFVariablesInLHS_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return referencedFVariablesInLHS_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean checkLinearity(Set<FVariable> vars) {
        ASTNode$State state = state();
        boolean checkLinearity_Set_FVariable__value = false;

        return checkLinearity_Set_FVariable__value;
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:146
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variability() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability variability = fConstant();
                for (FAbstractVariable variable : referencedFVariablesInLHS()) {
                    variability = variability.combine(variable.variability());
                }
                return variability;
            }
        finally {
        }
    }
    /**
     * @attribute syn
     * @aspect Variability
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Variability.jrag:181
     */
    @ASTNodeAnnotation.Attribute
    public FTypePrefixVariability variabilityRHS() {
        ASTNode$State state = state();
        try {
                FTypePrefixVariability variability = fConstant();
                for (FVariable variable : variableDependenciesRHS()) {
                    variability = variability.combine(variable.variability());
                }
                for (FExp exp : timeExps()) {
                    variability = variability.combine(exp.variability());
                }
                return variability;
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public boolean generatesEvents() {
        ASTNode$State state = state();
        boolean generatesEvents_value = relExpInEquation().size() + delayExpInEquation().size() > 0;

        return generatesEvents_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean canPropagate() {
        ASTNode$State state = state();
        boolean canPropagate_value = super.canPropagate() && variables().size() > 0 &&
                    variables().size() == numScalarEquations() && variabilityRHS().parameterOrLess();

        return canPropagate_value;
    }
    /**
     * @attribute syn
     * @aspect AlgorithmDifferentiation
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Differentiation.jrag:876
     */
    @ASTNodeAnnotation.Attribute
    public FAlgorithm diff() {
        ASTNode$State state = state();
        try {
                List<FStatement> diffed = new List<FStatement>();
                for (FStatement statement : getFStatements())
                    statement.diff(diffed);
                return new FDerivativeAlgorithm(diffed, order() + 1);
            }
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public int order() {
        ASTNode$State state = state();
        int order_value = 0;

        return order_value;
    }
    /**
     * @attribute syn
     * @aspect EquationSolve
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/Symbolic.jrag:25
     */
    @ASTNodeAnnotation.Attribute
    public Solvability isSolved(FVariable var, boolean duringTearing) {
        ASTNode$State state = state();
        try {
        		Set<FVariable> leftVars = referencedFVariablesInLHS();
        		
        		boolean inLeft = false;
        		for (FVariable fv : leftVars) {
        			if (fv == var)
        				inLeft = true;
        		}
        		
        		if (inLeft)
        			return Solvability.ANALYTICALLY_SOLVABLE;
        		else if (leftVars.size() == 1 && duringTearing && canUseLocalIteration())
        			return Solvability.NUMERICALLY_SOLVABLE;
        		else
        			return Solvability.UNSOLVABLE;
        	}
        finally {
        }
    }
    @ASTNodeAnnotation.Attribute
    public String xmlTag() {
        ASTNode$State state = state();
        String xmlTag_value = "Algorithm";

        return xmlTag_value;
    }
    @ASTNodeAnnotation.Attribute
    public String xmlNamespace() {
        ASTNode$State state = state();
        String xmlNamespace_value = "fun";

        return xmlNamespace_value;
    }
    /**
     * @apilevel internal
     */
    protected boolean tempName_C_computed = false;
    /**
     * @apilevel internal
     */
    protected String tempName_C_value;
    /**
     * @apilevel internal
     */
    private void tempName_C_reset() {
        tempName_C_computed = false;
        tempName_C_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public String tempName_C() {
        if(tempName_C_computed) {
            return tempName_C_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        tempName_C_value = nextTempName_C();
        if (isFinal && num == state().boundariesCrossed) {
            tempName_C_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return tempName_C_value;
    }
    @ASTNodeAnnotation.Attribute
    public String nextTempName_C() {
        ASTNode$State state = state();
        String nextTempName_C_value = myCodeGenContext().nextTempName_C();

        return nextTempName_C_value;
    }
    /**
     * @attribute inh
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1572
     */
    @ASTNodeAnnotation.Attribute
    public FClass myFClass() {
        ASTNode$State state = state();
        FClass myFClass_value = getParent().Define_myFClass(this, null);

        return myFClass_value;
    }
    /**
     * @attribute inh
     * @aspect CCodeGen
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/CCodeGen.jrag:2325
     */
    @ASTNodeAnnotation.Attribute
    public CodeGenContext myCodeGenContext() {
        ASTNode$State state = state();
        CodeGenContext myCodeGenContext_value = getParent().Define_myCodeGenContext(this, null);

        return myCodeGenContext_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3729
     * @apilevel internal
     */
    public FAlgorithm Define_myFAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return this;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3743
     * @apilevel internal
     */
    public boolean Define_useIsAssignment(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1645
     * @apilevel internal
     */
    public boolean Define_inAlgorithm(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return !inFunction();
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1667
     * @apilevel internal
     */
    public boolean Define_insideBlockStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatUtil.jrag:1675
     * @apilevel internal
     */
    public boolean Define_insideBranchedStmt(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/errorcheck/ComplianceCheck.jadd:86
     * @apilevel internal
     */
    public boolean Define_inWhile(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:862
     * @apilevel internal
     */
    public FStatement Define_enclosingLoop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return null;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/TransformCanonical.jrag:1089
     * @apilevel internal
     */
    public boolean Define_needsIndicatorInit(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/optimizations/InlineFunctions.jrag:1221
     * @apilevel internal
     */
    public boolean Define_inForLoop(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return false;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
    protected void collect_contributors_FClass_algorithms() {
    /**
     * @attribute coll
     * @aspect FlatAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:1102
     */
        if (!inFunction()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_algorithms_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_algorithms();
    }
    protected void collect_contributors_FClass_myAlgorithms() {
    /**
     * @attribute coll
     * @aspect FlatAlgorithmAPI
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/FlatAPI.jrag:3738
     */
        if (!inFunction()) {
            {
                FClass ref = (FClass) (myFClass());
                if (ref != null) {
                    ref.FClass_myAlgorithms_contributors().add(this);
                }
            }
        }
        super.collect_contributors_FClass_myAlgorithms();
    }
    protected void contributeTo_FClass_FClass_algorithms(ArrayList<FAlgorithm> collection) {
        super.contributeTo_FClass_FClass_algorithms(collection);
        if (!inFunction())
            collection.add(this);
    }

    protected void contributeTo_FClass_FClass_myAlgorithms(ArrayList<FAlgorithm> collection) {
        super.contributeTo_FClass_FClass_myAlgorithms(collection);
        if (!inFunction())
            collection.add(this);
    }

}
