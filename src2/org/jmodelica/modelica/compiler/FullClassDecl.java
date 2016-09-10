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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:103
 * @production FullClassDecl : {@link BaseClassDecl} ::= <span class="component">[{@link StringComment}]</span> <span class="component">Equation:{@link AbstractEquation}*</span> <span class="component">{@link Algorithm}*</span> <span class="component">Super:{@link ExtendsClause}*</span> <span class="component">Import:{@link ImportClause}*</span> <span class="component">{@link ClassDecl}*</span> <span class="component">{@link ComponentDecl}*</span> <span class="component">ElementModification:{@link Modification}*</span> <span class="component">[{@link ExternalClause}]</span> <span class="component">[{@link Annotation}]</span> <span class="component">{@link EndDecl}</span>;

 */
public class FullClassDecl extends BaseClassDecl implements Cloneable {
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:320
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
        str.print(indent);
	    if (hasEncapsulated())
	    	str.print("encapsulated ");
	    if (hasPartial())
	    	str.print("partial "); 		
 	    if (hasRedeclare())
	    	str.print("redeclare ");
	    if (hasFinal())
	    	str.print("final ");
	    if (hasInner())
	    	str.print("inner ");
	    if (hasOuter())
	    	str.print("outer ");
	    if (hasReplaceable())
	    	str.print("replaceable ");
	    
 		
 		str.print(getRestriction().toString());
 		str.print(" " + getName().getID() + "\n");

		
 		// Print all local classes
 		int numPubClass = 0;
// 		str.print(indent + "public\n");
 		for (int i=0;i<getNumClassDecl();i++)
 			if (((BaseClassDecl)getClassDecl(i)).isPublic()) {
 			 	numPubClass++;
	 			p.print(getClassDecl(i),str,indent+"  ");
	 			str.print(";\n\n");
			}
			
		if (getNumClassDecl()-numPubClass>0) {	
	 		str.print(indent + "protected\n");
 			for (int i=0;i<getNumClassDecl();i++)
 				if (((BaseClassDecl)getClassDecl(i)).isProtected()) {
		 			p.print(getClassDecl(i),str,indent+"  ");
		 			str.print(";\n\n");
		 		}
		}
			
		// Print all extends clauses
 		for (int i=0;i<getNumSuper();i++) {
 			p.print(getSuper(i),str,indent+"  ");
 			str.print(";\n");
		} 			
			
 		// Print all components
 		int numPubComp = 0;
// 		str.print(indent + "public\n");
 		for (int i=0;i<getNumComponentDecl();i++)
 			if (getComponentDecl(i).isPublic()) {
 			 	numPubComp++;
	 			p.print(getComponentDecl(i),str,indent+"  ");
	 			str.print(";\n");
			}
			
		if (getNumComponentDecl()-numPubComp>0) {	
	 		str.print(indent + "protected\n");
 			for (int i=0;i<getNumComponentDecl();i++)
 				if (getComponentDecl(i).isProtected()) {
		 			p.print(getComponentDecl(i),str,indent+"  ");
		 			str.print(";\n");
			}
		}	
		
		if (getNumEquation()>0) {
			str.print(indent + "equation\n");
			for (int i=0;i<getNumEquation();i++) {
				str.print(p.indent(indent));
				p.print(getEquation(i),str,indent);
				str.print(";\n");
			}
		}
		
		for (Algorithm a : getAlgorithms()) {
			p.print(a, str, indent);
		}
		
		str.print(indent + "end " + getName().getID());
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1313
     */
    public Opt<InstExternal> newInstExternalOpt() {
    	return hasExternalClause() ? new Opt(getExternalClause().instantiate()) : new Opt();
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1317
     */
    public InstFullClassDecl newInstClassDecl() {
        InstFullClassDecl fcd = new InstFullClassDecl(this, new Opt(), newInstRestriction(), newInstExternalOpt());
        fcd.setInstConstrainingClassOpt(newInstConstrainingClassOpt(null));
        fcd.setLocation(this);
        return fcd;
    }
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1380
     */
    public InstClassDecl createInstReplacingClass(
            ClassDecl replacedClass, InstRedeclareClassNode icr, InstRedeclareClassNode cicr) {
        InstRestriction ir = newInstRestriction();
        Opt<InstExternal> exto = newInstExternalOpt();
        ClassDecl constrainingDecl = (cicr == null) ? replacedClass : cicr.redeclaringClassDecl();
        InstReplacingFullClassDecl fcd = new InstReplacingFullClassDecl(this, new Opt(), ir, exto, replacedClass, icr);
        fcd.setInstConstrainingClassOpt(constrainingDecl.newInstConstrainingClassOpt(cicr));
        //TODO: Should be constr clause of original or redeclared? 
        // - Should be from redeclared if it has one.
        fcd.setLocation(this);
        return fcd;
    }
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:203
     */
    Composition originalComposition;
    /**
     * @aspect Library
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/Library.jrag:212
     */
    public LibClassDecl createLibClassDecl() {
        return new LibClassDecl(this);
    }
    /**
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:559
     */
    public void addBuiltinFunctions(List<? super BaseClassDecl> list, ExternalClause builtin) {
    	if (isPackage()) {
    		List<ClassDecl> subList = new List<ClassDecl>();
    		for (ClassDecl cd : getClassDecls())
    			cd.addBuiltinFunctions(subList, builtin);
    		setClassDeclList(subList);
    	} else {
	    	String name = getName().getID();
	    	if (name.equals("Integer") || name.equals("String")) {
	    		// Add character that isn't allowed in identifiers to prevent collision with user class or the primitive class
	    		name = "!" + name;
	    		getName().setID(name);
	    		getEndDecl().setEndID(name);
	    	}
	    	if (getNumAlgorithm() == 0)
	    	    setExternalClause(builtin.fullCopy());
    	}
    	list.add(this);
    }
    /**
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:189
     */
    protected ClassDecl simpleLookupClassInImports(String name) {
		ClassDecl res;
		for (ImportClause imp : getImports()) {
			res = imp.simpleLookupClassInImport(name);
			if (!res.isUnknown())
				return res;
		}
		
		return unknownClassDecl();
	}
    /**
     * @aspect SimpleClassLookup
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:200
     */
    protected ClassDecl simpleLookupClassInExtends(String name) {
		ClassDecl res;
		for (ExtendsClause sup : getSupers()) {
			res = sup.findClassDecl().simpleLookupClassMemberScope(name);
			if (!res.isUnknown())
				return res;
		}
		
		return unknownClassDecl();
	}
    /**
     * @aspect DumpClasses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/DumpTree.jadd:430
     */
    public void dumpClasses(String indent) {
		System.out.println(indent + name());
		for (ClassDecl cd : getClassDecls()) {
			cd.dumpClasses(indent + " ");
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:177
     */
    @Override
	protected void addFormattingInformation(FormattingInfo formattingInfo) {
		super.addFormattingInformation(formattingInfo);
		
		if (formattingInfo != null) {
			for (Clause clause : originalComposition.getClauses()) {
				if (clause instanceof EquationClause || clause instanceof Algorithm) {
					clause.addPreFormatting(formattingInfo);
					clause.addPostFormatting(formattingInfo);
					clause.addInsideFormatting(formattingInfo);
				}
			}
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:609
     */
    @Override
	protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		indentation.stepIn();
		if (hasStringComment()) {
			if (!getName().hasBeenFormatted()) {
				getName().postFormatting = new DefaultFormattingItem(indentation.toString());
			}
			if (!getStringComment().hasBeenFormatted()) {
				getStringComment().postFormatting = new DefaultFormattingItem("\n");
			}
		}

		for (Clause clause : originalComposition.getClauses()) {
			if ((clause instanceof EquationClause || clause instanceof Algorithm) && !clause.hasBeenFormatted()) {
				clause.setDefaultFormattingHelper(indentation);
			}
		}

		if (hasAnnotation()) {
		    Annotation annotation = getAnnotation();
			if (!annotation.hasBeenFormatted()) {
				annotation.preFormatting = new DefaultFormattingItem(indentation.toString());
			}
		}
		return true;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1202
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		prettyPrintFormattedHelper(printer, printStream, new Opt<Each>(), getFinalOpt());
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1248
     */
    void prettyPrintFormattedDecl(Printer printer, CodeStream printStream) {
		if (prettyPrintFormatedShouldHaveExtends())
			printStream.print("extends");
		getName().doPrettyPrintFormatted(printer, printStream);
		if (prettyPrintFormatedShouldHaveExtends() && getNumSuper() == 1 && getSuper(0).hasClassModification()) {
			getSuper(0).getClassModification().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasStringComment()) {
			getStringComment().doPrettyPrintFormatted(printer, printStream);
		}

		for (Clause clause : originalComposition.getClauses()) {
			clause.doPrettyPrintFormatted(printer, printStream);
		}

		if (hasExternalClause()) {
			getExternalClause().doPrettyPrintFormatted(printer, printStream);
		}
		
		getEndDecl().doPrettyPrintFormatted(printer, printStream);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1318
     */
    public void addNewComponentDecl(ComponentDecl componentDecl) {
		Stack<Clause> clauseStack = new Stack<Clause>();

		for (int i = originalComposition.getNumClause() - 1; i >= 0; i--) {
			Clause clause = originalComposition.getClause(i);
			if (clause instanceof ComponentDecl && ((ComponentDecl) clause).isPublic() == componentDecl.isPublic()) {
				break;
			}
			clauseStack.push(clause);
			originalComposition.getClauses().removeChild(i);
		}

		originalComposition.addClause(componentDecl);

		while (!clauseStack.isEmpty()) {
			originalComposition.addClause(clauseStack.pop());
		}

		addComponentDecl(componentDecl);
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1339
     */
    public void addNewEquation(AbstractEquation equation) {
		for (int i = originalComposition.getNumClause() - 1; i >= 0; i--) {
			Clause clause = originalComposition.getClause(i);
			if (clause instanceof EquationClause && ((EquationClause) clause).getAbstractEquation(0).isInitial() == equation.isInitial()) {
				EquationClause equationClause = (EquationClause) clause;
				Stack<AbstractEquation> equationStack = new Stack<AbstractEquation>();
				boolean foundGoodPosition = false;
				for (int j = equationClause.getNumAbstractEquation() - 1; j >= 0; j--) {
					AbstractEquation currentEquation = equationClause.getAbstractEquation(j);
					if (currentEquation.getClass() == equation.getClass()) {
						equationStack.push(equation);
						foundGoodPosition = true;
						break;
					}
					equationStack.push(currentEquation);
					equationClause.getAbstractEquations().removeChild(j);
				}

				while (!equationStack.isEmpty()) {
					equationClause.addAbstractEquation(equationStack.pop());
				}
				if (!foundGoodPosition) {
					equationClause.addAbstractEquation(equation);
				}
				addEquation(equation);
				return;
			}
		}

		List<AbstractEquation> abstractEquationList = new List<AbstractEquation>();
		abstractEquationList.add(equation);
		originalComposition.addClause(new EquationClause(abstractEquationList));
		addEquation(equation);
	}
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:34
     */
    public boolean collectTestCases(TestSuite ts, String className) {
        if (super.collectTestCases(ts, className)) 
            return true;
        return getClassDeclList().collectTestCases(ts, className);
    }
    /**
     * @aspect TestFramework
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/TestFramework/src/jastadd/TestFramework.jrag:55
     */
    public void collectTestCases(TestSuite ts) {
        ts.enterClass(name());
        AnnotationNode a1 = annotation("__JModelica/UnitTesting/tests");
        if (a1.exists()) {
            for (AnnotationNode a2 : a1) 
                generateTestCase(ts, a2);
        } else {
            getClassDeclList().collectTestCases(ts);
        }
        ts.exitClass();
    }
    /**
     * @declaredat ASTNode:1
     */
    public FullClassDecl() {
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
        children = new ASTNode[23];
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 5);
        setChild(new Opt(), 6);
        setChild(new Opt(), 7);
        setChild(new Opt(), 8);
        setChild(new Opt(), 9);
        setChild(new Opt(), 10);
        setChild(new Opt(), 11);
        setChild(new Opt(), 12);
        setChild(new List(), 13);
        setChild(new List(), 14);
        setChild(new List(), 15);
        setChild(new List(), 16);
        setChild(new List(), 17);
        setChild(new List(), 18);
        setChild(new List(), 19);
        setChild(new Opt(), 20);
        setChild(new Opt(), 21);
    }
    /**
     * @declaredat ASTNode:32
     */
    public FullClassDecl(IdDecl p0, VisibilityType p1, Opt<Encapsulated> p2, Opt<Partial> p3, Restriction p4, Opt<Redeclare> p5, Opt<Final> p6, Opt<Inner> p7, Opt<Outer> p8, Opt<Replaceable> p9, Opt<ConstrainingClause> p10, Opt<Comment> p11, Opt<StringComment> p12, List<AbstractEquation> p13, List<Algorithm> p14, List<ExtendsClause> p15, List<ImportClause> p16, List<ClassDecl> p17, List<ComponentDecl> p18, List<Modification> p19, Opt<ExternalClause> p20, Opt<Annotation> p21, EndDecl p22) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
        setChild(p3, 3);
        setChild(p4, 4);
        setChild(p5, 5);
        setChild(p6, 6);
        setChild(p7, 7);
        setChild(p8, 8);
        setChild(p9, 9);
        setChild(p10, 10);
        setChild(p11, 11);
        setChild(p12, 12);
        setChild(p13, 13);
        setChild(p14, 14);
        setChild(p15, 15);
        setChild(p16, 16);
        setChild(p17, 17);
        setChild(p18, 18);
        setChild(p19, 19);
        setChild(p20, 20);
        setChild(p21, 21);
        setChild(p22, 22);
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:60
     */
    protected int numChildren() {
        return 23;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:66
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:72
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        simpleLookupClassDefaultScope_String_reset();
        simpleLookupClassLocalScope_String_reset();
        simpleLookupClassMemberScope_String_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:81
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:87
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:93
     */
    public FullClassDecl clone() throws CloneNotSupportedException {
        FullClassDecl node = (FullClassDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:100
     */
    public FullClassDecl copy() {
        try {
            FullClassDecl node = (FullClassDecl) clone();
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
     * @declaredat ASTNode:119
     */
    public FullClassDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:128
     */
    public FullClassDecl treeCopyNoTransform() {
        FullClassDecl tree = (FullClassDecl) copy();
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
     * @declaredat ASTNode:148
     */
    public FullClassDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:155
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(IdDecl node) {
        setChild(node, 0);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public IdDecl getName() {
        return (IdDecl) getChild(0);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public IdDecl getNameNoTransform() {
        return (IdDecl) getChildNoTransform(0);
    }
    /**
     * Replaces the VisibilityType child.
     * @param node The new node to replace the VisibilityType child.
     * @apilevel high-level
     */
    public void setVisibilityType(VisibilityType node) {
        setChild(node, 1);
    }
    /**
     * Retrieves the VisibilityType child.
     * @return The current node used as the VisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="VisibilityType")
    public VisibilityType getVisibilityType() {
        return (VisibilityType) getChild(1);
    }
    /**
     * Retrieves the VisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the VisibilityType child.
     * @apilevel low-level
     */
    public VisibilityType getVisibilityTypeNoTransform() {
        return (VisibilityType) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Encapsulated child. This is the <code>Opt</code>
     * node containing the child Encapsulated, not the actual child!
     * @param opt The new node to be used as the optional node for the Encapsulated child.
     * @apilevel low-level
     */
    public void setEncapsulatedOpt(Opt<Encapsulated> opt) {
        setChild(opt, 2);
    }
    /**
     * Replaces the (optional) Encapsulated child.
     * @param node The new node to be used as the Encapsulated child.
     * @apilevel high-level
     */
    public void setEncapsulated(Encapsulated node) {
        getEncapsulatedOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Encapsulated child exists.
     * @return {@code true} if the optional Encapsulated child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasEncapsulated() {
        return getEncapsulatedOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Encapsulated child.
     * @return The Encapsulated child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Encapsulated getEncapsulated() {
        return (Encapsulated) getEncapsulatedOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Encapsulated child. This is the <code>Opt</code> node containing the child Encapsulated, not the actual child!
     * @return The optional node for child the Encapsulated child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Encapsulated")
    public Opt<Encapsulated> getEncapsulatedOpt() {
        return (Opt<Encapsulated>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Encapsulated. This is the <code>Opt</code> node containing the child Encapsulated, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Encapsulated.
     * @apilevel low-level
     */
    public Opt<Encapsulated> getEncapsulatedOptNoTransform() {
        return (Opt<Encapsulated>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Partial child. This is the <code>Opt</code>
     * node containing the child Partial, not the actual child!
     * @param opt The new node to be used as the optional node for the Partial child.
     * @apilevel low-level
     */
    public void setPartialOpt(Opt<Partial> opt) {
        setChild(opt, 3);
    }
    /**
     * Replaces the (optional) Partial child.
     * @param node The new node to be used as the Partial child.
     * @apilevel high-level
     */
    public void setPartial(Partial node) {
        getPartialOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Partial child exists.
     * @return {@code true} if the optional Partial child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasPartial() {
        return getPartialOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Partial child.
     * @return The Partial child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Partial getPartial() {
        return (Partial) getPartialOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Partial child. This is the <code>Opt</code> node containing the child Partial, not the actual child!
     * @return The optional node for child the Partial child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Partial")
    public Opt<Partial> getPartialOpt() {
        return (Opt<Partial>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Partial. This is the <code>Opt</code> node containing the child Partial, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Partial.
     * @apilevel low-level
     */
    public Opt<Partial> getPartialOptNoTransform() {
        return (Opt<Partial>) getChildNoTransform(3);
    }
    /**
     * Replaces the Restriction child.
     * @param node The new node to replace the Restriction child.
     * @apilevel high-level
     */
    public void setRestriction(Restriction node) {
        setChild(node, 4);
    }
    /**
     * Retrieves the Restriction child.
     * @return The current node used as the Restriction child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Restriction")
    public Restriction getRestriction() {
        return (Restriction) getChild(4);
    }
    /**
     * Retrieves the Restriction child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Restriction child.
     * @apilevel low-level
     */
    public Restriction getRestrictionNoTransform() {
        return (Restriction) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the Redeclare child. This is the <code>Opt</code>
     * node containing the child Redeclare, not the actual child!
     * @param opt The new node to be used as the optional node for the Redeclare child.
     * @apilevel low-level
     */
    public void setRedeclareOpt(Opt<Redeclare> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) Redeclare child.
     * @param node The new node to be used as the Redeclare child.
     * @apilevel high-level
     */
    public void setRedeclare(Redeclare node) {
        getRedeclareOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Redeclare child exists.
     * @return {@code true} if the optional Redeclare child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasRedeclare() {
        return getRedeclareOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Redeclare child.
     * @return The Redeclare child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Redeclare getRedeclare() {
        return (Redeclare) getRedeclareOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Redeclare child. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * @return The optional node for child the Redeclare child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Redeclare")
    public Opt<Redeclare> getRedeclareOpt() {
        return (Opt<Redeclare>) getChild(5);
    }
    /**
     * Retrieves the optional node for child Redeclare. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Redeclare.
     * @apilevel low-level
     */
    public Opt<Redeclare> getRedeclareOptNoTransform() {
        return (Opt<Redeclare>) getChildNoTransform(5);
    }
    /**
     * Replaces the optional node for the Final child. This is the <code>Opt</code>
     * node containing the child Final, not the actual child!
     * @param opt The new node to be used as the optional node for the Final child.
     * @apilevel low-level
     */
    public void setFinalOpt(Opt<Final> opt) {
        setChild(opt, 6);
    }
    /**
     * Replaces the (optional) Final child.
     * @param node The new node to be used as the Final child.
     * @apilevel high-level
     */
    public void setFinal(Final node) {
        getFinalOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Final child exists.
     * @return {@code true} if the optional Final child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasFinal() {
        return getFinalOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Final child.
     * @return The Final child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Final getFinal() {
        return (Final) getFinalOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Final child. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * @return The optional node for child the Final child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Final")
    public Opt<Final> getFinalOpt() {
        return (Opt<Final>) getChild(6);
    }
    /**
     * Retrieves the optional node for child Final. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Final.
     * @apilevel low-level
     */
    public Opt<Final> getFinalOptNoTransform() {
        return (Opt<Final>) getChildNoTransform(6);
    }
    /**
     * Replaces the optional node for the Inner child. This is the <code>Opt</code>
     * node containing the child Inner, not the actual child!
     * @param opt The new node to be used as the optional node for the Inner child.
     * @apilevel low-level
     */
    public void setInnerOpt(Opt<Inner> opt) {
        setChild(opt, 7);
    }
    /**
     * Replaces the (optional) Inner child.
     * @param node The new node to be used as the Inner child.
     * @apilevel high-level
     */
    public void setInner(Inner node) {
        getInnerOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Inner child exists.
     * @return {@code true} if the optional Inner child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasInner() {
        return getInnerOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Inner child.
     * @return The Inner child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Inner getInner() {
        return (Inner) getInnerOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Inner child. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * @return The optional node for child the Inner child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Inner")
    public Opt<Inner> getInnerOpt() {
        return (Opt<Inner>) getChild(7);
    }
    /**
     * Retrieves the optional node for child Inner. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Inner.
     * @apilevel low-level
     */
    public Opt<Inner> getInnerOptNoTransform() {
        return (Opt<Inner>) getChildNoTransform(7);
    }
    /**
     * Replaces the optional node for the Outer child. This is the <code>Opt</code>
     * node containing the child Outer, not the actual child!
     * @param opt The new node to be used as the optional node for the Outer child.
     * @apilevel low-level
     */
    public void setOuterOpt(Opt<Outer> opt) {
        setChild(opt, 8);
    }
    /**
     * Replaces the (optional) Outer child.
     * @param node The new node to be used as the Outer child.
     * @apilevel high-level
     */
    public void setOuter(Outer node) {
        getOuterOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Outer child exists.
     * @return {@code true} if the optional Outer child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasOuter() {
        return getOuterOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Outer child.
     * @return The Outer child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Outer getOuter() {
        return (Outer) getOuterOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Outer child. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * @return The optional node for child the Outer child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Outer")
    public Opt<Outer> getOuterOpt() {
        return (Opt<Outer>) getChild(8);
    }
    /**
     * Retrieves the optional node for child Outer. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Outer.
     * @apilevel low-level
     */
    public Opt<Outer> getOuterOptNoTransform() {
        return (Opt<Outer>) getChildNoTransform(8);
    }
    /**
     * Replaces the optional node for the Replaceable child. This is the <code>Opt</code>
     * node containing the child Replaceable, not the actual child!
     * @param opt The new node to be used as the optional node for the Replaceable child.
     * @apilevel low-level
     */
    public void setReplaceableOpt(Opt<Replaceable> opt) {
        setChild(opt, 9);
    }
    /**
     * Replaces the (optional) Replaceable child.
     * @param node The new node to be used as the Replaceable child.
     * @apilevel high-level
     */
    public void setReplaceable(Replaceable node) {
        getReplaceableOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Replaceable child exists.
     * @return {@code true} if the optional Replaceable child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasReplaceable() {
        return getReplaceableOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Replaceable child.
     * @return The Replaceable child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Replaceable getReplaceable() {
        return (Replaceable) getReplaceableOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Replaceable child. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * @return The optional node for child the Replaceable child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Replaceable")
    public Opt<Replaceable> getReplaceableOpt() {
        return (Opt<Replaceable>) getChild(9);
    }
    /**
     * Retrieves the optional node for child Replaceable. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Replaceable.
     * @apilevel low-level
     */
    public Opt<Replaceable> getReplaceableOptNoTransform() {
        return (Opt<Replaceable>) getChildNoTransform(9);
    }
    /**
     * Replaces the optional node for the ConstrainingClause child. This is the <code>Opt</code>
     * node containing the child ConstrainingClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClause child.
     * @apilevel low-level
     */
    public void setConstrainingClauseOpt(Opt<ConstrainingClause> opt) {
        setChild(opt, 10);
    }
    /**
     * Replaces the (optional) ConstrainingClause child.
     * @param node The new node to be used as the ConstrainingClause child.
     * @apilevel high-level
     */
    public void setConstrainingClause(ConstrainingClause node) {
        getConstrainingClauseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConstrainingClause child exists.
     * @return {@code true} if the optional ConstrainingClause child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConstrainingClause() {
        return getConstrainingClauseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConstrainingClause child.
     * @return The ConstrainingClause child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ConstrainingClause getConstrainingClause() {
        return (ConstrainingClause) getConstrainingClauseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConstrainingClause child. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * @return The optional node for child the ConstrainingClause child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConstrainingClause")
    public Opt<ConstrainingClause> getConstrainingClauseOpt() {
        return (Opt<ConstrainingClause>) getChild(10);
    }
    /**
     * Retrieves the optional node for child ConstrainingClause. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClause.
     * @apilevel low-level
     */
    public Opt<ConstrainingClause> getConstrainingClauseOptNoTransform() {
        return (Opt<ConstrainingClause>) getChildNoTransform(10);
    }
    /**
     * Replaces the optional node for the ConstrainingClauseComment child. This is the <code>Opt</code>
     * node containing the child ConstrainingClauseComment, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClauseComment child.
     * @apilevel low-level
     */
    public void setConstrainingClauseCommentOpt(Opt<Comment> opt) {
        setChild(opt, 11);
    }
    /**
     * Replaces the (optional) ConstrainingClauseComment child.
     * @param node The new node to be used as the ConstrainingClauseComment child.
     * @apilevel high-level
     */
    public void setConstrainingClauseComment(Comment node) {
        getConstrainingClauseCommentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConstrainingClauseComment child exists.
     * @return {@code true} if the optional ConstrainingClauseComment child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConstrainingClauseComment() {
        return getConstrainingClauseCommentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConstrainingClauseComment child.
     * @return The ConstrainingClauseComment child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Comment getConstrainingClauseComment() {
        return (Comment) getConstrainingClauseCommentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConstrainingClauseComment child. This is the <code>Opt</code> node containing the child ConstrainingClauseComment, not the actual child!
     * @return The optional node for child the ConstrainingClauseComment child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConstrainingClauseComment")
    public Opt<Comment> getConstrainingClauseCommentOpt() {
        return (Opt<Comment>) getChild(11);
    }
    /**
     * Retrieves the optional node for child ConstrainingClauseComment. This is the <code>Opt</code> node containing the child ConstrainingClauseComment, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClauseComment.
     * @apilevel low-level
     */
    public Opt<Comment> getConstrainingClauseCommentOptNoTransform() {
        return (Opt<Comment>) getChildNoTransform(11);
    }
    /**
     * Replaces the optional node for the StringComment child. This is the <code>Opt</code>
     * node containing the child StringComment, not the actual child!
     * @param opt The new node to be used as the optional node for the StringComment child.
     * @apilevel low-level
     */
    public void setStringCommentOpt(Opt<StringComment> opt) {
        setChild(opt, 12);
    }
    /**
     * Replaces the (optional) StringComment child.
     * @param node The new node to be used as the StringComment child.
     * @apilevel high-level
     */
    public void setStringComment(StringComment node) {
        getStringCommentOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional StringComment child exists.
     * @return {@code true} if the optional StringComment child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasStringComment() {
        return getStringCommentOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) StringComment child.
     * @return The StringComment child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public StringComment getStringComment() {
        return (StringComment) getStringCommentOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the StringComment child. This is the <code>Opt</code> node containing the child StringComment, not the actual child!
     * @return The optional node for child the StringComment child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="StringComment")
    public Opt<StringComment> getStringCommentOpt() {
        return (Opt<StringComment>) getChild(12);
    }
    /**
     * Retrieves the optional node for child StringComment. This is the <code>Opt</code> node containing the child StringComment, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child StringComment.
     * @apilevel low-level
     */
    public Opt<StringComment> getStringCommentOptNoTransform() {
        return (Opt<StringComment>) getChildNoTransform(12);
    }
    /**
     * Replaces the Equation list.
     * @param list The new list node to be used as the Equation list.
     * @apilevel high-level
     */
    public void setEquationList(List<AbstractEquation> list) {
        setChild(list, 13);
    }
    /**
     * Retrieves the number of children in the Equation list.
     * @return Number of children in the Equation list.
     * @apilevel high-level
     */
    public int getNumEquation() {
        return getEquationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Equation list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Equation list.
     * @apilevel low-level
     */
    public int getNumEquationNoTransform() {
        return getEquationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Equation list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Equation list.
     * @apilevel high-level
     */
    public AbstractEquation getEquation(int i) {
        return (AbstractEquation) getEquationList().getChild(i);
    }
    /**
     * Check whether the Equation list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasEquation() {
        return getEquationList().getNumChild() != 0;
    }
    /**
     * Append an element to the Equation list.
     * @param node The element to append to the Equation list.
     * @apilevel high-level
     */
    public void addEquation(AbstractEquation node) {
        List<AbstractEquation> list = (parent == null || state == null) ? getEquationListNoTransform() : getEquationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addEquationNoTransform(AbstractEquation node) {
        List<AbstractEquation> list = getEquationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Equation list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setEquation(AbstractEquation node, int i) {
        List<AbstractEquation> list = getEquationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Equation list.
     * @return The node representing the Equation list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Equation")
    public List<AbstractEquation> getEquationList() {
        List<AbstractEquation> list = (List<AbstractEquation>) getChild(13);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Equation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Equation list.
     * @apilevel low-level
     */
    public List<AbstractEquation> getEquationListNoTransform() {
        return (List<AbstractEquation>) getChildNoTransform(13);
    }
    /**
     * Retrieves the Equation list.
     * @return The node representing the Equation list.
     * @apilevel high-level
     */
    public List<AbstractEquation> getEquations() {
        return getEquationList();
    }
    /**
     * Retrieves the Equation list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Equation list.
     * @apilevel low-level
     */
    public List<AbstractEquation> getEquationsNoTransform() {
        return getEquationListNoTransform();
    }
    /**
     * Replaces the Algorithm list.
     * @param list The new list node to be used as the Algorithm list.
     * @apilevel high-level
     */
    public void setAlgorithmList(List<Algorithm> list) {
        setChild(list, 14);
    }
    /**
     * Retrieves the number of children in the Algorithm list.
     * @return Number of children in the Algorithm list.
     * @apilevel high-level
     */
    public int getNumAlgorithm() {
        return getAlgorithmList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Algorithm list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Algorithm list.
     * @apilevel low-level
     */
    public int getNumAlgorithmNoTransform() {
        return getAlgorithmListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Algorithm list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Algorithm list.
     * @apilevel high-level
     */
    public Algorithm getAlgorithm(int i) {
        return (Algorithm) getAlgorithmList().getChild(i);
    }
    /**
     * Check whether the Algorithm list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasAlgorithm() {
        return getAlgorithmList().getNumChild() != 0;
    }
    /**
     * Append an element to the Algorithm list.
     * @param node The element to append to the Algorithm list.
     * @apilevel high-level
     */
    public void addAlgorithm(Algorithm node) {
        List<Algorithm> list = (parent == null || state == null) ? getAlgorithmListNoTransform() : getAlgorithmList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addAlgorithmNoTransform(Algorithm node) {
        List<Algorithm> list = getAlgorithmListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Algorithm list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setAlgorithm(Algorithm node, int i) {
        List<Algorithm> list = getAlgorithmList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Algorithm list.
     * @return The node representing the Algorithm list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Algorithm")
    public List<Algorithm> getAlgorithmList() {
        List<Algorithm> list = (List<Algorithm>) getChild(14);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Algorithm list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Algorithm list.
     * @apilevel low-level
     */
    public List<Algorithm> getAlgorithmListNoTransform() {
        return (List<Algorithm>) getChildNoTransform(14);
    }
    /**
     * Retrieves the Algorithm list.
     * @return The node representing the Algorithm list.
     * @apilevel high-level
     */
    public List<Algorithm> getAlgorithms() {
        return getAlgorithmList();
    }
    /**
     * Retrieves the Algorithm list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Algorithm list.
     * @apilevel low-level
     */
    public List<Algorithm> getAlgorithmsNoTransform() {
        return getAlgorithmListNoTransform();
    }
    /**
     * Replaces the Super list.
     * @param list The new list node to be used as the Super list.
     * @apilevel high-level
     */
    public void setSuperList(List<ExtendsClause> list) {
        setChild(list, 15);
    }
    /**
     * Retrieves the number of children in the Super list.
     * @return Number of children in the Super list.
     * @apilevel high-level
     */
    public int getNumSuper() {
        return getSuperList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Super list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Super list.
     * @apilevel low-level
     */
    public int getNumSuperNoTransform() {
        return getSuperListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Super list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Super list.
     * @apilevel high-level
     */
    public ExtendsClause getSuper(int i) {
        return (ExtendsClause) getSuperList().getChild(i);
    }
    /**
     * Check whether the Super list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasSuper() {
        return getSuperList().getNumChild() != 0;
    }
    /**
     * Append an element to the Super list.
     * @param node The element to append to the Super list.
     * @apilevel high-level
     */
    public void addSuper(ExtendsClause node) {
        List<ExtendsClause> list = (parent == null || state == null) ? getSuperListNoTransform() : getSuperList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addSuperNoTransform(ExtendsClause node) {
        List<ExtendsClause> list = getSuperListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Super list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setSuper(ExtendsClause node, int i) {
        List<ExtendsClause> list = getSuperList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Super list.
     * @return The node representing the Super list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Super")
    public List<ExtendsClause> getSuperList() {
        List<ExtendsClause> list = (List<ExtendsClause>) getChild(15);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Super list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Super list.
     * @apilevel low-level
     */
    public List<ExtendsClause> getSuperListNoTransform() {
        return (List<ExtendsClause>) getChildNoTransform(15);
    }
    /**
     * Retrieves the Super list.
     * @return The node representing the Super list.
     * @apilevel high-level
     */
    public List<ExtendsClause> getSupers() {
        return getSuperList();
    }
    /**
     * Retrieves the Super list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Super list.
     * @apilevel low-level
     */
    public List<ExtendsClause> getSupersNoTransform() {
        return getSuperListNoTransform();
    }
    /**
     * Replaces the Import list.
     * @param list The new list node to be used as the Import list.
     * @apilevel high-level
     */
    public void setImportList(List<ImportClause> list) {
        setChild(list, 16);
    }
    /**
     * Retrieves the number of children in the Import list.
     * @return Number of children in the Import list.
     * @apilevel high-level
     */
    public int getNumImport() {
        return getImportList().getNumChild();
    }
    /**
     * Retrieves the number of children in the Import list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the Import list.
     * @apilevel low-level
     */
    public int getNumImportNoTransform() {
        return getImportListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the Import list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the Import list.
     * @apilevel high-level
     */
    public ImportClause getImport(int i) {
        return (ImportClause) getImportList().getChild(i);
    }
    /**
     * Check whether the Import list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasImport() {
        return getImportList().getNumChild() != 0;
    }
    /**
     * Append an element to the Import list.
     * @param node The element to append to the Import list.
     * @apilevel high-level
     */
    public void addImport(ImportClause node) {
        List<ImportClause> list = (parent == null || state == null) ? getImportListNoTransform() : getImportList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addImportNoTransform(ImportClause node) {
        List<ImportClause> list = getImportListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the Import list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setImport(ImportClause node, int i) {
        List<ImportClause> list = getImportList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the Import list.
     * @return The node representing the Import list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="Import")
    public List<ImportClause> getImportList() {
        List<ImportClause> list = (List<ImportClause>) getChild(16);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the Import list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Import list.
     * @apilevel low-level
     */
    public List<ImportClause> getImportListNoTransform() {
        return (List<ImportClause>) getChildNoTransform(16);
    }
    /**
     * Retrieves the Import list.
     * @return The node representing the Import list.
     * @apilevel high-level
     */
    public List<ImportClause> getImports() {
        return getImportList();
    }
    /**
     * Retrieves the Import list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the Import list.
     * @apilevel low-level
     */
    public List<ImportClause> getImportsNoTransform() {
        return getImportListNoTransform();
    }
    /**
     * Replaces the ClassDecl list.
     * @param list The new list node to be used as the ClassDecl list.
     * @apilevel high-level
     */
    public void setClassDeclList(List<ClassDecl> list) {
        setChild(list, 17);
    }
    /**
     * Retrieves the number of children in the ClassDecl list.
     * @return Number of children in the ClassDecl list.
     * @apilevel high-level
     */
    public int getNumClassDecl() {
        return getClassDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ClassDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ClassDecl list.
     * @apilevel low-level
     */
    public int getNumClassDeclNoTransform() {
        return getClassDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ClassDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ClassDecl list.
     * @apilevel high-level
     */
    public ClassDecl getClassDecl(int i) {
        return (ClassDecl) getClassDeclList().getChild(i);
    }
    /**
     * Check whether the ClassDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasClassDecl() {
        return getClassDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the ClassDecl list.
     * @param node The element to append to the ClassDecl list.
     * @apilevel high-level
     */
    public void addClassDecl(ClassDecl node) {
        List<ClassDecl> list = (parent == null || state == null) ? getClassDeclListNoTransform() : getClassDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addClassDeclNoTransform(ClassDecl node) {
        List<ClassDecl> list = getClassDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ClassDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setClassDecl(ClassDecl node, int i) {
        List<ClassDecl> list = getClassDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ClassDecl list.
     * @return The node representing the ClassDecl list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ClassDecl")
    public List<ClassDecl> getClassDeclList() {
        List<ClassDecl> list = (List<ClassDecl>) getChild(17);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ClassDecl list.
     * @apilevel low-level
     */
    public List<ClassDecl> getClassDeclListNoTransform() {
        return (List<ClassDecl>) getChildNoTransform(17);
    }
    /**
     * Retrieves the ClassDecl list.
     * @return The node representing the ClassDecl list.
     * @apilevel high-level
     */
    public List<ClassDecl> getClassDecls() {
        return getClassDeclList();
    }
    /**
     * Retrieves the ClassDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ClassDecl list.
     * @apilevel low-level
     */
    public List<ClassDecl> getClassDeclsNoTransform() {
        return getClassDeclListNoTransform();
    }
    /**
     * Replaces the ComponentDecl list.
     * @param list The new list node to be used as the ComponentDecl list.
     * @apilevel high-level
     */
    public void setComponentDeclList(List<ComponentDecl> list) {
        setChild(list, 18);
    }
    /**
     * Retrieves the number of children in the ComponentDecl list.
     * @return Number of children in the ComponentDecl list.
     * @apilevel high-level
     */
    public int getNumComponentDecl() {
        return getComponentDeclList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ComponentDecl list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ComponentDecl list.
     * @apilevel low-level
     */
    public int getNumComponentDeclNoTransform() {
        return getComponentDeclListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ComponentDecl list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ComponentDecl list.
     * @apilevel high-level
     */
    public ComponentDecl getComponentDecl(int i) {
        return (ComponentDecl) getComponentDeclList().getChild(i);
    }
    /**
     * Check whether the ComponentDecl list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasComponentDecl() {
        return getComponentDeclList().getNumChild() != 0;
    }
    /**
     * Append an element to the ComponentDecl list.
     * @param node The element to append to the ComponentDecl list.
     * @apilevel high-level
     */
    public void addComponentDecl(ComponentDecl node) {
        List<ComponentDecl> list = (parent == null || state == null) ? getComponentDeclListNoTransform() : getComponentDeclList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addComponentDeclNoTransform(ComponentDecl node) {
        List<ComponentDecl> list = getComponentDeclListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ComponentDecl list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setComponentDecl(ComponentDecl node, int i) {
        List<ComponentDecl> list = getComponentDeclList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ComponentDecl list.
     * @return The node representing the ComponentDecl list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ComponentDecl")
    public List<ComponentDecl> getComponentDeclList() {
        List<ComponentDecl> list = (List<ComponentDecl>) getChild(18);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ComponentDecl list.
     * @apilevel low-level
     */
    public List<ComponentDecl> getComponentDeclListNoTransform() {
        return (List<ComponentDecl>) getChildNoTransform(18);
    }
    /**
     * Retrieves the ComponentDecl list.
     * @return The node representing the ComponentDecl list.
     * @apilevel high-level
     */
    public List<ComponentDecl> getComponentDecls() {
        return getComponentDeclList();
    }
    /**
     * Retrieves the ComponentDecl list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ComponentDecl list.
     * @apilevel low-level
     */
    public List<ComponentDecl> getComponentDeclsNoTransform() {
        return getComponentDeclListNoTransform();
    }
    /**
     * Replaces the ElementModification list.
     * @param list The new list node to be used as the ElementModification list.
     * @apilevel high-level
     */
    public void setElementModificationList(List<Modification> list) {
        setChild(list, 19);
    }
    /**
     * Retrieves the number of children in the ElementModification list.
     * @return Number of children in the ElementModification list.
     * @apilevel high-level
     */
    public int getNumElementModification() {
        return getElementModificationList().getNumChild();
    }
    /**
     * Retrieves the number of children in the ElementModification list.
     * Calling this method will not trigger rewrites.
     * @return Number of children in the ElementModification list.
     * @apilevel low-level
     */
    public int getNumElementModificationNoTransform() {
        return getElementModificationListNoTransform().getNumChildNoTransform();
    }
    /**
     * Retrieves the element at index {@code i} in the ElementModification list.
     * @param i Index of the element to return.
     * @return The element at position {@code i} in the ElementModification list.
     * @apilevel high-level
     */
    public Modification getElementModification(int i) {
        return (Modification) getElementModificationList().getChild(i);
    }
    /**
     * Check whether the ElementModification list has any children.
     * @return {@code true} if it has at least one child, {@code false} otherwise.
     * @apilevel high-level
     */
    public boolean hasElementModification() {
        return getElementModificationList().getNumChild() != 0;
    }
    /**
     * Append an element to the ElementModification list.
     * @param node The element to append to the ElementModification list.
     * @apilevel high-level
     */
    public void addElementModification(Modification node) {
        List<Modification> list = (parent == null || state == null) ? getElementModificationListNoTransform() : getElementModificationList();
        list.addChild(node);
    }
    /**
     * @apilevel low-level
     */
    public void addElementModificationNoTransform(Modification node) {
        List<Modification> list = getElementModificationListNoTransform();
        list.addChild(node);
    }
    /**
     * Replaces the ElementModification list element at index {@code i} with the new node {@code node}.
     * @param node The new node to replace the old list element.
     * @param i The list index of the node to be replaced.
     * @apilevel high-level
     */
    public void setElementModification(Modification node, int i) {
        List<Modification> list = getElementModificationList();
        list.setChild(node, i);
    }
    /**
     * Retrieves the ElementModification list.
     * @return The node representing the ElementModification list.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.ListChild(name="ElementModification")
    public List<Modification> getElementModificationList() {
        List<Modification> list = (List<Modification>) getChild(19);
        list.getNumChild();
        return list;
    }
    /**
     * Retrieves the ElementModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementModification list.
     * @apilevel low-level
     */
    public List<Modification> getElementModificationListNoTransform() {
        return (List<Modification>) getChildNoTransform(19);
    }
    /**
     * Retrieves the ElementModification list.
     * @return The node representing the ElementModification list.
     * @apilevel high-level
     */
    public List<Modification> getElementModifications() {
        return getElementModificationList();
    }
    /**
     * Retrieves the ElementModification list.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The node representing the ElementModification list.
     * @apilevel low-level
     */
    public List<Modification> getElementModificationsNoTransform() {
        return getElementModificationListNoTransform();
    }
    /**
     * Replaces the optional node for the ExternalClause child. This is the <code>Opt</code>
     * node containing the child ExternalClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ExternalClause child.
     * @apilevel low-level
     */
    public void setExternalClauseOpt(Opt<ExternalClause> opt) {
        setChild(opt, 20);
    }
    /**
     * Replaces the (optional) ExternalClause child.
     * @param node The new node to be used as the ExternalClause child.
     * @apilevel high-level
     */
    public void setExternalClause(ExternalClause node) {
        getExternalClauseOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ExternalClause child exists.
     * @return {@code true} if the optional ExternalClause child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasExternalClause() {
        return getExternalClauseOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ExternalClause child.
     * @return The ExternalClause child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ExternalClause getExternalClause() {
        return (ExternalClause) getExternalClauseOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ExternalClause child. This is the <code>Opt</code> node containing the child ExternalClause, not the actual child!
     * @return The optional node for child the ExternalClause child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ExternalClause")
    public Opt<ExternalClause> getExternalClauseOpt() {
        return (Opt<ExternalClause>) getChild(20);
    }
    /**
     * Retrieves the optional node for child ExternalClause. This is the <code>Opt</code> node containing the child ExternalClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ExternalClause.
     * @apilevel low-level
     */
    public Opt<ExternalClause> getExternalClauseOptNoTransform() {
        return (Opt<ExternalClause>) getChildNoTransform(20);
    }
    /**
     * Replaces the optional node for the Annotation child. This is the <code>Opt</code>
     * node containing the child Annotation, not the actual child!
     * @param opt The new node to be used as the optional node for the Annotation child.
     * @apilevel low-level
     */
    public void setAnnotationOpt(Opt<Annotation> opt) {
        setChild(opt, 21);
    }
    /**
     * Replaces the (optional) Annotation child.
     * @param node The new node to be used as the Annotation child.
     * @apilevel high-level
     */
    public void setAnnotation(Annotation node) {
        getAnnotationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Annotation child exists.
     * @return {@code true} if the optional Annotation child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasAnnotation() {
        return getAnnotationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Annotation child.
     * @return The Annotation child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Annotation getAnnotation() {
        return (Annotation) getAnnotationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Annotation child. This is the <code>Opt</code> node containing the child Annotation, not the actual child!
     * @return The optional node for child the Annotation child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Annotation")
    public Opt<Annotation> getAnnotationOpt() {
        return (Opt<Annotation>) getChild(21);
    }
    /**
     * Retrieves the optional node for child Annotation. This is the <code>Opt</code> node containing the child Annotation, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Annotation.
     * @apilevel low-level
     */
    public Opt<Annotation> getAnnotationOptNoTransform() {
        return (Opt<Annotation>) getChildNoTransform(21);
    }
    /**
     * Replaces the EndDecl child.
     * @param node The new node to replace the EndDecl child.
     * @apilevel high-level
     */
    public void setEndDecl(EndDecl node) {
        setChild(node, 22);
    }
    /**
     * Retrieves the EndDecl child.
     * @return The current node used as the EndDecl child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="EndDecl")
    public EndDecl getEndDecl() {
        return (EndDecl) getChild(22);
    }
    /**
     * Retrieves the EndDecl child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the EndDecl child.
     * @apilevel low-level
     */
    public EndDecl getEndDeclNoTransform() {
        return (EndDecl) getChildNoTransform(22);
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<AbstractEquation> equations() {
        ASTNode$State state = state();
        Iterable<AbstractEquation> equations_value = getEquations();

        return equations_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Algorithm> algorithms() {
        ASTNode$State state = state();
        Iterable<Algorithm> algorithms_value = getAlgorithms();

        return algorithms_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ExtendsClause> superClasses() {
        ASTNode$State state = state();
        Iterable<ExtendsClause> superClasses_value = getSupers();

        return superClasses_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ComponentDecl> components() {
        ASTNode$State state = state();
        Iterable<ComponentDecl> components_value = getComponentDecls();

        return components_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<Modification> elementModifications() {
        ASTNode$State state = state();
        Iterable<Modification> elementModifications_value = getElementModifications();

        return elementModifications_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ClassDecl> classes() {
        ASTNode$State state = state();
        Iterable<ClassDecl> classes_value = filterErrorNodes(getClassDecls());

        return classes_value;
    }
    @ASTNodeAnnotation.Attribute
    public Iterable<ImportClause> imports() {
        ASTNode$State state = state();
        Iterable<ImportClause> imports_value = getImports();

        return imports_value;
    }
    protected Map simpleLookupClassDefaultScope_String_values;
    /**
     * @apilevel internal
     */
    private void simpleLookupClassDefaultScope_String_reset() {
        simpleLookupClassDefaultScope_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassDefaultScope(String name) {
        Object _parameters = name;
        if (simpleLookupClassDefaultScope_String_values == null) simpleLookupClassDefaultScope_String_values = new HashMap(4);
        if(simpleLookupClassDefaultScope_String_values.containsKey(_parameters)) {
            return (ClassDecl)simpleLookupClassDefaultScope_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ClassDecl simpleLookupClassDefaultScope_String_value = simpleLookupClassDefaultScope_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            simpleLookupClassDefaultScope_String_values.put(_parameters, simpleLookupClassDefaultScope_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return simpleLookupClassDefaultScope_String_value;
    }
    /**
     * @apilevel internal
     */
    private ClassDecl simpleLookupClassDefaultScope_compute(String name) {
    		ClassDecl res = simpleLookupClassMemberScope(name);
    		if (res.isUnknown())
    			res = simpleLookupClassInImports(name);
    		
    		return res.isUnknown() ? simpleLookupClass(name) : res;
    	}
    protected Map simpleLookupClassLocalScope_String_values;
    /**
     * @apilevel internal
     */
    private void simpleLookupClassLocalScope_String_reset() {
        simpleLookupClassLocalScope_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassLocalScope(String name) {
        Object _parameters = name;
        if (simpleLookupClassLocalScope_String_values == null) simpleLookupClassLocalScope_String_values = new HashMap(4);
        if(simpleLookupClassLocalScope_String_values.containsKey(_parameters)) {
            return (ClassDecl)simpleLookupClassLocalScope_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ClassDecl simpleLookupClassLocalScope_String_value = simpleLookupClassLocalScope_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            simpleLookupClassLocalScope_String_values.put(_parameters, simpleLookupClassLocalScope_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return simpleLookupClassLocalScope_String_value;
    }
    /**
     * @apilevel internal
     */
    private ClassDecl simpleLookupClassLocalScope_compute(String name) {
    		if (duringFindClassDeclRevisits > MAX_FIND_CLASS_DECL_REVISITS) 
    			return unknownClassDecl();
    		duringFindClassDeclRevisits++;
    		
    		ClassDecl res = simpleLookupInClassList(getClassDecls(), name);
    		if (res == null)
    			res = simpleLookupClassInImports(name);
    		
    		duringFindClassDeclRevisits--;
    		return res.isUnknown() ? simpleLookupClass(name) : res;
    	}
    protected Map simpleLookupClassMemberScope_String_values;
    /**
     * @apilevel internal
     */
    private void simpleLookupClassMemberScope_String_reset() {
        simpleLookupClassMemberScope_String_values = null;
    }
    @ASTNodeAnnotation.Attribute
    public ClassDecl simpleLookupClassMemberScope(String name) {
        Object _parameters = name;
        if (simpleLookupClassMemberScope_String_values == null) simpleLookupClassMemberScope_String_values = new HashMap(4);
        if(simpleLookupClassMemberScope_String_values.containsKey(_parameters)) {
            return (ClassDecl)simpleLookupClassMemberScope_String_values.get(_parameters);
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        ClassDecl simpleLookupClassMemberScope_String_value = simpleLookupClassMemberScope_compute(name);
        if (isFinal && num == state().boundariesCrossed) {
            simpleLookupClassMemberScope_String_values.put(_parameters, simpleLookupClassMemberScope_String_value);
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return simpleLookupClassMemberScope_String_value;
    }
    /**
     * @apilevel internal
     */
    private ClassDecl simpleLookupClassMemberScope_compute(String name) {
    		if (duringFindClassDeclRevisits > MAX_FIND_CLASS_DECL_REVISITS) 
    			return unknownClassDecl();
    		duringFindClassDeclRevisits++;
    		
    		ClassDecl res = simpleLookupInClassList(getClassDecls(), name);
    		if (res == null)
    			res = simpleLookupClassInExtends(name);
    		
    		duringFindClassDeclRevisits--;
    		return res;
    	}
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getAnnotationOpt().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode createNullAnnotationNode() {
        ASTNode$State state = state();
        AnnotationNode createNullAnnotationNode_value = new FullClassDeclAnnotationNode(this);

        return createNullAnnotationNode_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean prettyPrintFormatedShouldHaveExtends() {
        ASTNode$State state = state();
        boolean prettyPrintFormatedShouldHaveExtends_value = false;

        return prettyPrintFormatedShouldHaveExtends_value;
    }
    /**
     * @attribute inh
     * @aspect PredefinedTypes
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/PredefinedTypes.jrag:23
     */
    @ASTNodeAnnotation.Attribute
    public List getPredefinedType() {
        ASTNode$State state = state();
        List getPredefinedType_value = getParent().Define_getPredefinedType(this, null);

        return getPredefinedType_value;
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/SimpleLookup.jrag:51
     * @apilevel internal
     */
    public ClassDecl Define_simpleLookupClass(ASTNode caller, ASTNode child, String name) {
        if (caller == getSuperListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return simpleLookupClassLocalScope(name);
        }
        else {
            int childIndex = this.getIndexOfChild(caller);
            return simpleLookupClassDefaultScope(name);
        }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:652
     * @apilevel internal
     */
    public String Define_classNamePrefix(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        return combineName(classNamePrefix(), name());
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:727
     * @apilevel internal
     */
    public String Define_packagePath(ASTNode caller, ASTNode child, String name) {
        int childIndex = this.getIndexOfChild(caller);
        {
                ClassDecl cd = simpleLookupClassDottedGlobal(name);
                return (cd == null) ? null : cd.dirName();
            }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:738
     * @apilevel internal
     */
    public String Define_topPackagePath(ASTNode caller, ASTNode child) {
        int childIndex = this.getIndexOfChild(caller);
        {
        	  String path = topPackagePath();
        	  return (path == null) ? dirName() : path;
          }
    }
    /**
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:848
     * @apilevel internal
     */
    public BaseClassDecl Define_enclosingClassDecl(ASTNode caller, ASTNode child) {
        if (caller == getExternalClauseOptNoTransform()) {
            return this;
        }
        else if (caller == getAnnotationOptNoTransform()) {
            return this;
        }
        else if (caller == getComponentDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else if (caller == getClassDeclListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else if (caller == getImportListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else if (caller == getSuperListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else if (caller == getAlgorithmListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else if (caller == getEquationListNoTransform()) {
            int childIndex = caller.getIndexOfChild(child);
            return this;
        }
        else {
            return getParent().Define_enclosingClassDecl(this, caller);
        }
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
