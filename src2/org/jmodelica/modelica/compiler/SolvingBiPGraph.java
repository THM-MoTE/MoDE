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
 * @ast class
 * @aspect AutomaticTearing
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaMiddleEnd/src/jastadd/structural/BLT.jrag:3471
 */
public class SolvingBiPGraph extends AbstractBiPGraph<SolvingEq, SolvingVar, SCCBlock<SolvingEq, SolvingVar>> {
    public boolean constrainedAugmentedPath(SolvingEq startNode) {
        Collection<SolvingVar> vars = startNode.getVariables();
        if (startNode.getMatching() != null)
            return true;
        for (SolvingVar var : startNode.getVariables()) {
            if (!canMatch(startNode, var))
                continue;
            if (var.getMatching() == null || constrainedAugmentedPath(startNode, var.getMatching())) {
                match(startNode, var);
                return true;
            }
        }
        return false;
    }

    private boolean constrainedAugmentedPath(SolvingEq startNode, SolvingEq currentNode) {
        if (currentNode.compareTo(startNode) > 0)
            return true;
        if (currentNode.getVariables().size() != 2)
            return false;
        for (SolvingVar var : currentNode.getVariables()) {
            if (currentNode.getMatching() == var)
                continue;
            if (!canMatch(currentNode, var))
                continue;
            if (var.getMatching() == null || constrainedAugmentedPath(startNode, var.getMatching())) {
                match(currentNode, var);
                return true;
            }
        }
        return false;
    }

    

    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> SolvingBiPGraph(Collection<E> eqns, Collection<V> vars) {
        super(eqns, vars);
    }

    

    public <E extends AbstractEq<E, V>, V extends AbstractVar<E, V>> SolvingBiPGraph(Collection<E> block, boolean isInitial) {
        super(block, isInitial);
    }

    

    @Override
    public boolean canMatch(SolvingEq e, SolvingVar v) {
        return super.canMatch(e, v) && isSolved(e, v).isSolvable();
    }

    

    public Solvability isSolved(SolvingEq e, SolvingVar v) {
        return e.getEquation().isSolved(v.getVariable(), true);
    }

    

    @Override
    public void addInsidence(SolvingEq e, SolvingVar v) {
        super.addInsidence(e, v);
        v.occurrence();
        if (e.isReal() != v.isReal())
            return;
        e.sameTypeOccurrence();
        v.sameTypeOccurrence();
        Solvability solvability = isSolved(e, v);
        switch (solvability) {
        case ANALYTICALLY_SOLVABLE:
            e.addAnalyticallySolvableVariable(v);
            v.analyticallySolvableOccurrence();
            break;
        case NUMERICALLY_SOLVABLE:
            e.addNumericallySolvableVariable(v);
            v.numericallySolvableOccurrence();
            break;
        }
    }

    

    @Override
    protected SolvingEq createEq(String name, FAbstractEquation eqn, int groupNumber, Collection<SolvingEq> groupMembers, FTypePrefixVariability variability, FType type, boolean isMeta) {
        return new SolvingEq(name, eqn, groupNumber, groupMembers, variability, type, isMeta);
    }

    

    @Override
    protected SolvingVar createVar(String name, FVariable var) {
        return new SolvingVar(name, var);
    }

    

    @Override
    public void removeVariable(SolvingVar v) {
        for (SolvingEq e : getEquations())
            e.getSolvableVariables().remove(v);
        super.removeVariable(v);
    }

    

    @Override
    protected SCCBlock<SolvingEq, SolvingVar> createComponentBlock() {
        return new SCCBlock<SolvingEq, SolvingVar>();
    }


}
