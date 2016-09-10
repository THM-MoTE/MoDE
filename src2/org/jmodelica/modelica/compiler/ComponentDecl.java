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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/ast/Modelica.ast:236
 * @production ComponentDecl : {@link BaseComponentDecl} ::= <span class="component">{@link VisibilityType}</span> <span class="component">Name:{@link IdDecl}</span> <span class="component">[VarArraySubscripts:{@link ArraySubscripts}]</span> <span class="component">[{@link Modification}]</span> <span class="component">[{@link ConditionalAttribute}]</span> <span class="component">{@link Comment}</span> <span class="component">[{@link ConstrainingClause}]</span> <span class="component">CCComment:{@link Comment}</span>;

 */
public class ComponentDecl extends BaseComponentDecl implements Cloneable {
    /**
     * @aspect Constructors
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/Constructors.jrag:592
     */
    public ComponentDecl(boolean isParameter,
                                       String type,
                                       String name,
                                       String bexp) {
        this(new Opt(),
             new Opt(),
             new Opt(),
             new Opt(),
             new Opt(),
             new Opt(),
             isParameter? new Opt(new Parameter()): new Opt(),
             new Opt(),
             new ClassAccess(type),
             new Opt(),
             new PublicVisibilityType(),
             new IdDecl(name),
             new Opt(),
             new Opt(),
             new Opt(),
             new Comment(new Opt(),new Opt()),
             new Opt(),
             new Comment(new Opt(),new Opt()));
        
        Exp bexp_ast=null;
        
        if (!bexp.equals("")) {
            try {
                bexp_ast = ParserHandler.parseExpString(bexp);
            } catch (Exception e) { 
                log.error("Error when parsing string"); 
            }
            this.setModification(new ValueModification(bexp_ast));
        }
    }
    /**
     * @aspect PrettyPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFlatTree/src/jastadd/PrettyPrint.jrag:544
     */
    public void prettyPrint(Printer p, CodeStream str, String indent) {
		str.print(indent);//+getVisibilityType().toString()+" ";
		
		if (hasRedeclare())
			str.print(getRedeclare().toString() + " ");
		if (hasFinal())
			str.print(getFinal().toString() + " ");
		if (hasInner())
			str.print(getInner().toString() + " ");
		if (hasOuter())
			str.print(getOuter().toString() + " ");
		if (hasReplaceable())
			str.print(getReplaceable().toString() + " ");	
		if (hasTypePrefixFlow())
			str.print(getTypePrefixFlow().toString() + " ");
		if (hasTypePrefixVariability())
			str.print(getTypePrefixVariability().toString() + " ");
		if (hasTypePrefixInputOutput())
			str.print(getTypePrefixInputOutput().toString() + " ");
		
		p.print(getClassName(),str,indent);
		if (hasTypeArraySubscripts())
			p.print(getTypeArraySubscripts(),str,indent);
		str.print(" " + getName().getID()); 
	    if (hasVarArraySubscripts())
			p.print(getVarArraySubscripts(),str,indent);
		p.print(getModificationOpt(),str,indent);
		 
		if (hasConditionalAttribute()) 
		    p.print(getConditionalAttribute(), str, indent);
				 
		if (hasConstrainingClause()) 
		    p.print(getConstrainingClause(), str, indent);
	}
    /**
     * @aspect InstanceTreeConstruction
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1488
     */
    public InstAccess newInstClassAccess() {
		return getClassName().newInstAccess();
	}
    /**
     * @aspect InstaceConstrainingClauses
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/instance/InstanceTree.jrag:1725
     */
    public Opt newInstConstrainingComponentOpt(InstComponentRedeclare cicr) {
        if (hasConstrainingClause()) {
            ConstrainingClause cc = getConstrainingClause();
            Opt opt = cc.hasClassModification() ? new Opt(cc.getClassModification().newInstModification()) : new Opt();
            return new Opt(new InstConstrainingComponent(cc.getAccess().newInstAccess(), opt, this, cicr));
        } else {
            return new Opt();
        }
    }
    /**
     * @aspect InitialTransformations
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/source/InitialTransformations.jrag:220
     */
    public void addToFullClassDecl(FullClassDecl fcd) {
        if (hasRedeclare()) {
            ComponentAccess ca = new ComponentAccess(getName().getID(), getVarArraySubscriptsOpt().fullCopy());
            fcd.addElementModification(new ComponentRedeclare(new Opt(), new Opt(), ca, this));
        } else {
            fcd.addComponentDecl(this);
        }
    }
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:883
     */
    @Override
	protected boolean setDefaultFormattingHelper(DefaultFormattingIndentation indentation) {
		FormattingItem inheritedPreFormatting = inheritFormatting(indentation);
		if (hasRedeclare()) {
			getRedeclare().preFormatting = inheritedPreFormatting;
			getRedeclare().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasFinal()) {
			getFinal().preFormatting = inheritedPreFormatting;
			getFinal().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasInner()) {
			getInner().preFormatting = inheritedPreFormatting;
			getInner().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasOuter()) {
			getOuter().preFormatting = inheritedPreFormatting;
			getOuter().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasReplaceable()) {
			getReplaceable().preFormatting = inheritedPreFormatting;
			getReplaceable().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasTypePrefixFlow()) {
			getTypePrefixFlow().preFormatting = inheritedPreFormatting;
			getTypePrefixFlow().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasTypePrefixVariability()) {
			getTypePrefixVariability().preFormatting = inheritedPreFormatting;
			getTypePrefixVariability().postFormatting = new DefaultFormattingItem(" ");
		} else if (hasTypePrefixInputOutput()) {
			getTypePrefixInputOutput().preFormatting = inheritedPreFormatting;
			getTypePrefixInputOutput().postFormatting = new DefaultFormattingItem(" ");
		} else {
			getClassName().preFormatting = inheritedPreFormatting;
		}

		getClassName().postFormatting = new DefaultFormattingItem(" ");
		if (getComment().hasStringComment() || getComment().hasAnnotation()) {
			if (hasModification()) {
				getModification().postFormatting = new DefaultFormattingItem(" ");
			} else {
				getName().postFormatting = new DefaultFormattingItem(" ");
			}
		}
		postFormatting = new DefaultFormattingItem("\n");
		return false;
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:926
     */
    private FormattingItem inheritFormatting(DefaultFormattingIndentation indentation) {
		if (getParent() instanceof List && getParent().getParent() instanceof FullClassDecl) {
			List<Clause> clauseList = (List<Clause>) ((FullClassDecl) getParent().getParent()).originalComposition.getClauses();
			int thisIndex = clauseList.getIndexOfChild(this);
			if (thisIndex > 0 && clauseList.getChild(thisIndex - 1) instanceof ComponentDecl) {
				ComponentDecl componentToInheritFrom = (ComponentDecl) clauseList.getChild(thisIndex - 1);

				if (componentToInheritFrom.hasRedeclare()) {
					return componentToInheritFrom.getRedeclare().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasFinal()) {
					return componentToInheritFrom.getFinal().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasInner()) {
					return componentToInheritFrom.getInner().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasOuter()) {
					return componentToInheritFrom.getOuter().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasReplaceable()) {
					return componentToInheritFrom.getReplaceable().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasTypePrefixFlow()) {
					return componentToInheritFrom.getTypePrefixFlow().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasTypePrefixVariability()) {
					return componentToInheritFrom.getTypePrefixVariability().preFormatting.copyWhitepacesFromFormatting();
				} else if (componentToInheritFrom.hasTypePrefixInputOutput()) {
					return componentToInheritFrom.getTypePrefixInputOutput().preFormatting.copyWhitepacesFromFormatting();
				} else {
					return componentToInheritFrom.getClassName().preFormatting.copyWhitepacesFromFormatting();
				}
			}
		}
		return new DefaultFormattingItem(indentation.toString());
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1809
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream) {
		prettyPrintFormattedHelper(printer, printStream, new Opt<Each>(), getFinalOpt());
		printStream.print(";");
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1814
     */
    void prettyPrintFormattedHelper(Printer printer, CodeStream printStream, Opt<Each> each_, Opt<Final> final_) {
		if (hasRedeclare()) {
			getRedeclare().doPrettyPrintFormatted(printer, printStream);
		}
		if (each_.getNumChild() == 1) {
			each_.getChild(0).doPrettyPrintFormatted(printer, printStream);
		}
		if (final_.getNumChild() == 1) {
			final_.getChild(0).doPrettyPrintFormatted(printer, printStream);
		}
		if (hasInner()) {
			getInner().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasOuter()) {
			getOuter().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasReplaceable()) {
			getReplaceable().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasTypePrefixFlow()) {
			getTypePrefixFlow().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasTypePrefixVariability()) {
			getTypePrefixVariability().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasTypePrefixInputOutput()) {
			getTypePrefixInputOutput().doPrettyPrintFormatted(printer, printStream);
		}

		printer.print(getClassName(), printStream, "");
		if (hasVarArraySubscripts()) {// TODO: Try to keep type array subscripts in typeArraySubscripts()
			ArraySubscripts as = new ArraySubscripts();
			for (Subscript s : getVarArraySubscripts().getSubscripts()) {
				if (s.getStart() < getName().getStart())
					as.addSubscript((Subscript)s.fullCopy());
			}
			if (as.getNumSubscript() > 0)
				as.doPrettyPrintFormatted(printer, printStream);
		}
		
		prettyPrintFormattedDecl(printer, printStream);
		
		if (hasConstrainingClause()) {
			printer.print(getConstrainingClause(), printStream, "");
		}
	}
    /**
     * @aspect FormattedPrint
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/FormattedPrint.jrag:1866
     */
    void prettyPrintFormattedDecl(Printer printer, CodeStream printStream) {
		getName().doPrettyPrintFormatted(printer, printStream); 
		if (hasVarArraySubscripts()) {// TODO: Try to keep type array subscripts in typeArraySubscripts()
			ArraySubscripts as = new ArraySubscripts();
			for (Subscript s : getVarArraySubscripts().getSubscripts()) {
				if (s.getStart() > getName().getStart())
					as.addSubscript((Subscript)s.fullCopy());
			}
			if (as.getNumSubscript() > 0)
				as.doPrettyPrintFormatted(printer, printStream);
		}
		if (hasModification()) {
			getModification().doPrettyPrintFormatted(printer, printStream);
		}
		if (hasConditionalAttribute()) {
			getConditionalAttribute().doPrettyPrintFormatted(printer, printStream);
		}

		getComment().doPrettyPrintFormatted(printer, printStream);
		getCCComment().doPrettyPrintFormatted(printer, printStream);
		
	}
    /**
     * @declaredat ASTNode:1
     */
    public ComponentDecl() {
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
        children = new ASTNode[18];
        setChild(new Opt(), 0);
        setChild(new Opt(), 1);
        setChild(new Opt(), 2);
        setChild(new Opt(), 3);
        setChild(new Opt(), 4);
        setChild(new Opt(), 5);
        setChild(new Opt(), 6);
        setChild(new Opt(), 7);
        setChild(new Opt(), 9);
        setChild(new Opt(), 12);
        setChild(new Opt(), 13);
        setChild(new Opt(), 14);
        setChild(new Opt(), 16);
    }
    /**
     * @declaredat ASTNode:26
     */
    public ComponentDecl(Opt<Redeclare> p0, Opt<Final> p1, Opt<Inner> p2, Opt<Outer> p3, Opt<Replaceable> p4, Opt<TypePrefixFlow> p5, Opt<TypePrefixVariability> p6, Opt<TypePrefixInputOutput> p7, Access p8, Opt<ArraySubscripts> p9, VisibilityType p10, IdDecl p11, Opt<ArraySubscripts> p12, Opt<Modification> p13, Opt<ConditionalAttribute> p14, Comment p15, Opt<ConstrainingClause> p16, Comment p17) {
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
    }
    /**
     * @apilevel low-level
     * @declaredat ASTNode:49
     */
    protected int numChildren() {
        return 18;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:55
     */
    public boolean mayHaveRewrite() {
        return false;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:61
     */
    public void flushAttrCache() {
        super.flushAttrCache();
        arraySubscripts_reset();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:68
     */
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
    /**
     * @api internal
     * @declaredat ASTNode:74
     */
    public void flushRewriteCache() {
        super.flushRewriteCache();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:80
     */
    public ComponentDecl clone() throws CloneNotSupportedException {
        ComponentDecl node = (ComponentDecl) super.clone();
        return node;
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:87
     */
    public ComponentDecl copy() {
        try {
            ComponentDecl node = (ComponentDecl) clone();
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
     * @declaredat ASTNode:106
     */
    public ComponentDecl fullCopy() {
        return treeCopyNoTransform();
    }
    /**
     * Create a deep copy of the AST subtree at this node.
     * The copy is dangling, i.e. has no parent.
     * @return dangling copy of the subtree at this node
     * @apilevel low-level
     * @declaredat ASTNode:115
     */
    public ComponentDecl treeCopyNoTransform() {
        ComponentDecl tree = (ComponentDecl) copy();
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
     * @declaredat ASTNode:135
     */
    public ComponentDecl treeCopy() {
        doFullTraversal();
        return treeCopyNoTransform();
    }
    /**
     * @apilevel internal
     * @declaredat ASTNode:142
     */
    protected boolean is$Equal(ASTNode node) {
        return super.is$Equal(node);    
    }
    /**
     * Replaces the optional node for the Redeclare child. This is the <code>Opt</code>
     * node containing the child Redeclare, not the actual child!
     * @param opt The new node to be used as the optional node for the Redeclare child.
     * @apilevel low-level
     */
    public void setRedeclareOpt(Opt<Redeclare> opt) {
        setChild(opt, 0);
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
        return (Opt<Redeclare>) getChild(0);
    }
    /**
     * Retrieves the optional node for child Redeclare. This is the <code>Opt</code> node containing the child Redeclare, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Redeclare.
     * @apilevel low-level
     */
    public Opt<Redeclare> getRedeclareOptNoTransform() {
        return (Opt<Redeclare>) getChildNoTransform(0);
    }
    /**
     * Replaces the optional node for the Final child. This is the <code>Opt</code>
     * node containing the child Final, not the actual child!
     * @param opt The new node to be used as the optional node for the Final child.
     * @apilevel low-level
     */
    public void setFinalOpt(Opt<Final> opt) {
        setChild(opt, 1);
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
        return (Opt<Final>) getChild(1);
    }
    /**
     * Retrieves the optional node for child Final. This is the <code>Opt</code> node containing the child Final, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Final.
     * @apilevel low-level
     */
    public Opt<Final> getFinalOptNoTransform() {
        return (Opt<Final>) getChildNoTransform(1);
    }
    /**
     * Replaces the optional node for the Inner child. This is the <code>Opt</code>
     * node containing the child Inner, not the actual child!
     * @param opt The new node to be used as the optional node for the Inner child.
     * @apilevel low-level
     */
    public void setInnerOpt(Opt<Inner> opt) {
        setChild(opt, 2);
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
        return (Opt<Inner>) getChild(2);
    }
    /**
     * Retrieves the optional node for child Inner. This is the <code>Opt</code> node containing the child Inner, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Inner.
     * @apilevel low-level
     */
    public Opt<Inner> getInnerOptNoTransform() {
        return (Opt<Inner>) getChildNoTransform(2);
    }
    /**
     * Replaces the optional node for the Outer child. This is the <code>Opt</code>
     * node containing the child Outer, not the actual child!
     * @param opt The new node to be used as the optional node for the Outer child.
     * @apilevel low-level
     */
    public void setOuterOpt(Opt<Outer> opt) {
        setChild(opt, 3);
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
        return (Opt<Outer>) getChild(3);
    }
    /**
     * Retrieves the optional node for child Outer. This is the <code>Opt</code> node containing the child Outer, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Outer.
     * @apilevel low-level
     */
    public Opt<Outer> getOuterOptNoTransform() {
        return (Opt<Outer>) getChildNoTransform(3);
    }
    /**
     * Replaces the optional node for the Replaceable child. This is the <code>Opt</code>
     * node containing the child Replaceable, not the actual child!
     * @param opt The new node to be used as the optional node for the Replaceable child.
     * @apilevel low-level
     */
    public void setReplaceableOpt(Opt<Replaceable> opt) {
        setChild(opt, 4);
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
        return (Opt<Replaceable>) getChild(4);
    }
    /**
     * Retrieves the optional node for child Replaceable. This is the <code>Opt</code> node containing the child Replaceable, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Replaceable.
     * @apilevel low-level
     */
    public Opt<Replaceable> getReplaceableOptNoTransform() {
        return (Opt<Replaceable>) getChildNoTransform(4);
    }
    /**
     * Replaces the optional node for the TypePrefixFlow child. This is the <code>Opt</code>
     * node containing the child TypePrefixFlow, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixFlow child.
     * @apilevel low-level
     */
    public void setTypePrefixFlowOpt(Opt<TypePrefixFlow> opt) {
        setChild(opt, 5);
    }
    /**
     * Replaces the (optional) TypePrefixFlow child.
     * @param node The new node to be used as the TypePrefixFlow child.
     * @apilevel high-level
     */
    public void setTypePrefixFlow(TypePrefixFlow node) {
        getTypePrefixFlowOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixFlow child exists.
     * @return {@code true} if the optional TypePrefixFlow child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixFlow() {
        return getTypePrefixFlowOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixFlow child.
     * @return The TypePrefixFlow child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixFlow getTypePrefixFlow() {
        return (TypePrefixFlow) getTypePrefixFlowOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixFlow child. This is the <code>Opt</code> node containing the child TypePrefixFlow, not the actual child!
     * @return The optional node for child the TypePrefixFlow child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixFlow")
    public Opt<TypePrefixFlow> getTypePrefixFlowOpt() {
        return (Opt<TypePrefixFlow>) getChild(5);
    }
    /**
     * Retrieves the optional node for child TypePrefixFlow. This is the <code>Opt</code> node containing the child TypePrefixFlow, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixFlow.
     * @apilevel low-level
     */
    public Opt<TypePrefixFlow> getTypePrefixFlowOptNoTransform() {
        return (Opt<TypePrefixFlow>) getChildNoTransform(5);
    }
    /**
     * Replaces the optional node for the TypePrefixVariability child. This is the <code>Opt</code>
     * node containing the child TypePrefixVariability, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixVariability child.
     * @apilevel low-level
     */
    public void setTypePrefixVariabilityOpt(Opt<TypePrefixVariability> opt) {
        setChild(opt, 6);
    }
    /**
     * Replaces the (optional) TypePrefixVariability child.
     * @param node The new node to be used as the TypePrefixVariability child.
     * @apilevel high-level
     */
    public void setTypePrefixVariability(TypePrefixVariability node) {
        getTypePrefixVariabilityOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixVariability child exists.
     * @return {@code true} if the optional TypePrefixVariability child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixVariability() {
        return getTypePrefixVariabilityOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixVariability child.
     * @return The TypePrefixVariability child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixVariability getTypePrefixVariability() {
        return (TypePrefixVariability) getTypePrefixVariabilityOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixVariability child. This is the <code>Opt</code> node containing the child TypePrefixVariability, not the actual child!
     * @return The optional node for child the TypePrefixVariability child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixVariability")
    public Opt<TypePrefixVariability> getTypePrefixVariabilityOpt() {
        return (Opt<TypePrefixVariability>) getChild(6);
    }
    /**
     * Retrieves the optional node for child TypePrefixVariability. This is the <code>Opt</code> node containing the child TypePrefixVariability, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixVariability.
     * @apilevel low-level
     */
    public Opt<TypePrefixVariability> getTypePrefixVariabilityOptNoTransform() {
        return (Opt<TypePrefixVariability>) getChildNoTransform(6);
    }
    /**
     * Replaces the optional node for the TypePrefixInputOutput child. This is the <code>Opt</code>
     * node containing the child TypePrefixInputOutput, not the actual child!
     * @param opt The new node to be used as the optional node for the TypePrefixInputOutput child.
     * @apilevel low-level
     */
    public void setTypePrefixInputOutputOpt(Opt<TypePrefixInputOutput> opt) {
        setChild(opt, 7);
    }
    /**
     * Replaces the (optional) TypePrefixInputOutput child.
     * @param node The new node to be used as the TypePrefixInputOutput child.
     * @apilevel high-level
     */
    public void setTypePrefixInputOutput(TypePrefixInputOutput node) {
        getTypePrefixInputOutputOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypePrefixInputOutput child exists.
     * @return {@code true} if the optional TypePrefixInputOutput child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypePrefixInputOutput() {
        return getTypePrefixInputOutputOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypePrefixInputOutput child.
     * @return The TypePrefixInputOutput child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public TypePrefixInputOutput getTypePrefixInputOutput() {
        return (TypePrefixInputOutput) getTypePrefixInputOutputOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypePrefixInputOutput child. This is the <code>Opt</code> node containing the child TypePrefixInputOutput, not the actual child!
     * @return The optional node for child the TypePrefixInputOutput child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypePrefixInputOutput")
    public Opt<TypePrefixInputOutput> getTypePrefixInputOutputOpt() {
        return (Opt<TypePrefixInputOutput>) getChild(7);
    }
    /**
     * Retrieves the optional node for child TypePrefixInputOutput. This is the <code>Opt</code> node containing the child TypePrefixInputOutput, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypePrefixInputOutput.
     * @apilevel low-level
     */
    public Opt<TypePrefixInputOutput> getTypePrefixInputOutputOptNoTransform() {
        return (Opt<TypePrefixInputOutput>) getChildNoTransform(7);
    }
    /**
     * Replaces the ClassName child.
     * @param node The new node to replace the ClassName child.
     * @apilevel high-level
     */
    public void setClassName(Access node) {
        setChild(node, 8);
    }
    /**
     * Retrieves the ClassName child.
     * @return The current node used as the ClassName child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="ClassName")
    public Access getClassName() {
        return (Access) getChild(8);
    }
    /**
     * Retrieves the ClassName child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the ClassName child.
     * @apilevel low-level
     */
    public Access getClassNameNoTransform() {
        return (Access) getChildNoTransform(8);
    }
    /**
     * Replaces the optional node for the TypeArraySubscripts child. This is the <code>Opt</code>
     * node containing the child TypeArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the TypeArraySubscripts child.
     * @apilevel low-level
     */
    public void setTypeArraySubscriptsOpt(Opt<ArraySubscripts> opt) {
        setChild(opt, 9);
    }
    /**
     * Replaces the (optional) TypeArraySubscripts child.
     * @param node The new node to be used as the TypeArraySubscripts child.
     * @apilevel high-level
     */
    public void setTypeArraySubscripts(ArraySubscripts node) {
        getTypeArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional TypeArraySubscripts child exists.
     * @return {@code true} if the optional TypeArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasTypeArraySubscripts() {
        return getTypeArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) TypeArraySubscripts child.
     * @return The TypeArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ArraySubscripts getTypeArraySubscripts() {
        return (ArraySubscripts) getTypeArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the TypeArraySubscripts child. This is the <code>Opt</code> node containing the child TypeArraySubscripts, not the actual child!
     * @return The optional node for child the TypeArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="TypeArraySubscripts")
    public Opt<ArraySubscripts> getTypeArraySubscriptsOpt() {
        return (Opt<ArraySubscripts>) getChild(9);
    }
    /**
     * Retrieves the optional node for child TypeArraySubscripts. This is the <code>Opt</code> node containing the child TypeArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child TypeArraySubscripts.
     * @apilevel low-level
     */
    public Opt<ArraySubscripts> getTypeArraySubscriptsOptNoTransform() {
        return (Opt<ArraySubscripts>) getChildNoTransform(9);
    }
    /**
     * Replaces the VisibilityType child.
     * @param node The new node to replace the VisibilityType child.
     * @apilevel high-level
     */
    public void setVisibilityType(VisibilityType node) {
        setChild(node, 10);
    }
    /**
     * Retrieves the VisibilityType child.
     * @return The current node used as the VisibilityType child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="VisibilityType")
    public VisibilityType getVisibilityType() {
        return (VisibilityType) getChild(10);
    }
    /**
     * Retrieves the VisibilityType child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the VisibilityType child.
     * @apilevel low-level
     */
    public VisibilityType getVisibilityTypeNoTransform() {
        return (VisibilityType) getChildNoTransform(10);
    }
    /**
     * Replaces the Name child.
     * @param node The new node to replace the Name child.
     * @apilevel high-level
     */
    public void setName(IdDecl node) {
        setChild(node, 11);
    }
    /**
     * Retrieves the Name child.
     * @return The current node used as the Name child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Name")
    public IdDecl getName() {
        return (IdDecl) getChild(11);
    }
    /**
     * Retrieves the Name child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Name child.
     * @apilevel low-level
     */
    public IdDecl getNameNoTransform() {
        return (IdDecl) getChildNoTransform(11);
    }
    /**
     * Replaces the optional node for the VarArraySubscripts child. This is the <code>Opt</code>
     * node containing the child VarArraySubscripts, not the actual child!
     * @param opt The new node to be used as the optional node for the VarArraySubscripts child.
     * @apilevel low-level
     */
    public void setVarArraySubscriptsOpt(Opt<ArraySubscripts> opt) {
        setChild(opt, 12);
    }
    /**
     * Replaces the (optional) VarArraySubscripts child.
     * @param node The new node to be used as the VarArraySubscripts child.
     * @apilevel high-level
     */
    public void setVarArraySubscripts(ArraySubscripts node) {
        getVarArraySubscriptsOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional VarArraySubscripts child exists.
     * @return {@code true} if the optional VarArraySubscripts child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasVarArraySubscripts() {
        return getVarArraySubscriptsOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) VarArraySubscripts child.
     * @return The VarArraySubscripts child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ArraySubscripts getVarArraySubscripts() {
        return (ArraySubscripts) getVarArraySubscriptsOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the VarArraySubscripts child. This is the <code>Opt</code> node containing the child VarArraySubscripts, not the actual child!
     * @return The optional node for child the VarArraySubscripts child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="VarArraySubscripts")
    public Opt<ArraySubscripts> getVarArraySubscriptsOpt() {
        return (Opt<ArraySubscripts>) getChild(12);
    }
    /**
     * Retrieves the optional node for child VarArraySubscripts. This is the <code>Opt</code> node containing the child VarArraySubscripts, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child VarArraySubscripts.
     * @apilevel low-level
     */
    public Opt<ArraySubscripts> getVarArraySubscriptsOptNoTransform() {
        return (Opt<ArraySubscripts>) getChildNoTransform(12);
    }
    /**
     * Replaces the optional node for the Modification child. This is the <code>Opt</code>
     * node containing the child Modification, not the actual child!
     * @param opt The new node to be used as the optional node for the Modification child.
     * @apilevel low-level
     */
    public void setModificationOpt(Opt<Modification> opt) {
        setChild(opt, 13);
    }
    /**
     * Replaces the (optional) Modification child.
     * @param node The new node to be used as the Modification child.
     * @apilevel high-level
     */
    public void setModification(Modification node) {
        getModificationOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional Modification child exists.
     * @return {@code true} if the optional Modification child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasModification() {
        return getModificationOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) Modification child.
     * @return The Modification child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public Modification getModification() {
        return (Modification) getModificationOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the Modification child. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * @return The optional node for child the Modification child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="Modification")
    public Opt<Modification> getModificationOpt() {
        return (Opt<Modification>) getChild(13);
    }
    /**
     * Retrieves the optional node for child Modification. This is the <code>Opt</code> node containing the child Modification, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child Modification.
     * @apilevel low-level
     */
    public Opt<Modification> getModificationOptNoTransform() {
        return (Opt<Modification>) getChildNoTransform(13);
    }
    /**
     * Replaces the optional node for the ConditionalAttribute child. This is the <code>Opt</code>
     * node containing the child ConditionalAttribute, not the actual child!
     * @param opt The new node to be used as the optional node for the ConditionalAttribute child.
     * @apilevel low-level
     */
    public void setConditionalAttributeOpt(Opt<ConditionalAttribute> opt) {
        setChild(opt, 14);
    }
    /**
     * Replaces the (optional) ConditionalAttribute child.
     * @param node The new node to be used as the ConditionalAttribute child.
     * @apilevel high-level
     */
    public void setConditionalAttribute(ConditionalAttribute node) {
        getConditionalAttributeOpt().setChild(node, 0);
    }
    /**
     * Check whether the optional ConditionalAttribute child exists.
     * @return {@code true} if the optional ConditionalAttribute child exists, {@code false} if it does not.
     * @apilevel high-level
     */
    public boolean hasConditionalAttribute() {
        return getConditionalAttributeOpt().getNumChild() != 0;
    }
    /**
     * Retrieves the (optional) ConditionalAttribute child.
     * @return The ConditionalAttribute child, if it exists. Returns {@code null} otherwise.
     * @apilevel low-level
     */
    public ConditionalAttribute getConditionalAttribute() {
        return (ConditionalAttribute) getConditionalAttributeOpt().getChild(0);
    }
    /**
     * Retrieves the optional node for the ConditionalAttribute child. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * @return The optional node for child the ConditionalAttribute child.
     * @apilevel low-level
     */
    @ASTNodeAnnotation.OptChild(name="ConditionalAttribute")
    public Opt<ConditionalAttribute> getConditionalAttributeOpt() {
        return (Opt<ConditionalAttribute>) getChild(14);
    }
    /**
     * Retrieves the optional node for child ConditionalAttribute. This is the <code>Opt</code> node containing the child ConditionalAttribute, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConditionalAttribute.
     * @apilevel low-level
     */
    public Opt<ConditionalAttribute> getConditionalAttributeOptNoTransform() {
        return (Opt<ConditionalAttribute>) getChildNoTransform(14);
    }
    /**
     * Replaces the Comment child.
     * @param node The new node to replace the Comment child.
     * @apilevel high-level
     */
    public void setComment(Comment node) {
        setChild(node, 15);
    }
    /**
     * Retrieves the Comment child.
     * @return The current node used as the Comment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="Comment")
    public Comment getComment() {
        return (Comment) getChild(15);
    }
    /**
     * Retrieves the Comment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the Comment child.
     * @apilevel low-level
     */
    public Comment getCommentNoTransform() {
        return (Comment) getChildNoTransform(15);
    }
    /**
     * Replaces the optional node for the ConstrainingClause child. This is the <code>Opt</code>
     * node containing the child ConstrainingClause, not the actual child!
     * @param opt The new node to be used as the optional node for the ConstrainingClause child.
     * @apilevel low-level
     */
    public void setConstrainingClauseOpt(Opt<ConstrainingClause> opt) {
        setChild(opt, 16);
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
        return (Opt<ConstrainingClause>) getChild(16);
    }
    /**
     * Retrieves the optional node for child ConstrainingClause. This is the <code>Opt</code> node containing the child ConstrainingClause, not the actual child!
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The optional node for child ConstrainingClause.
     * @apilevel low-level
     */
    public Opt<ConstrainingClause> getConstrainingClauseOptNoTransform() {
        return (Opt<ConstrainingClause>) getChildNoTransform(16);
    }
    /**
     * Replaces the CCComment child.
     * @param node The new node to replace the CCComment child.
     * @apilevel high-level
     */
    public void setCCComment(Comment node) {
        setChild(node, 17);
    }
    /**
     * Retrieves the CCComment child.
     * @return The current node used as the CCComment child.
     * @apilevel high-level
     */
    @ASTNodeAnnotation.Child(name="CCComment")
    public Comment getCCComment() {
        return (Comment) getChild(17);
    }
    /**
     * Retrieves the CCComment child.
     * <p><em>This method does not invoke AST transformations.</em></p>
     * @return The current node used as the CCComment child.
     * @apilevel low-level
     */
    public Comment getCCCommentNoTransform() {
        return (Comment) getChildNoTransform(17);
    }
    /**
     * @apilevel internal
     */
    protected boolean arraySubscripts_computed = false;
    /**
     * @apilevel internal
     */
    protected ArraySubscripts arraySubscripts_value;
    /**
     * @apilevel internal
     */
    private void arraySubscripts_reset() {
        arraySubscripts_computed = false;
        arraySubscripts_value = null;
    }
    @ASTNodeAnnotation.Attribute
    public ArraySubscripts arraySubscripts() {
        if(arraySubscripts_computed) {
            return arraySubscripts_value;
        }
        ASTNode$State state = state();
        boolean intermediate = state.INTERMEDIATE_VALUE;
        state.INTERMEDIATE_VALUE = false;
        int num = state.boundariesCrossed;
        boolean isFinal = this.is$Final();
        arraySubscripts_value = hasVarArraySubscripts() ? getVarArraySubscripts() : null;
        if (isFinal && num == state().boundariesCrossed) {
            arraySubscripts_computed = true;
        } else {
        }
        state.INTERMEDIATE_VALUE |= intermediate;

        return arraySubscripts_value;
    }
    @ASTNodeAnnotation.Attribute
    public String toString() {
        ASTNode$State state = state();
        String toString_value = prettyPrint("");

        return toString_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasConstrainingModification() {
        ASTNode$State state = state();
        boolean hasConstrainingModification_value = hasConstrainingClause() && getConstrainingClause().hasClassModification();

        return hasConstrainingModification_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isUnknown() {
        ASTNode$State state = state();
        boolean isUnknown_value = false;

        return isUnknown_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode annotation() {
        ASTNode$State state = state();
        AnnotationNode annotation_value = getComment().annotation();

        return annotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public AnnotationNode modificationAnnotation() {
        ASTNode$State state = state();
        AnnotationNode modificationAnnotation_value = getModificationOpt().annotation();

        return modificationAnnotation_value;
    }
    @ASTNodeAnnotation.Attribute
    public String name() {
        ASTNode$State state = state();
        String name_value = getNameNoTransform().getID();

        return name_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isPublic() {
        ASTNode$State state = state();
        boolean isPublic_value = getVisibilityType().isPublic();

        return isPublic_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isProtected() {
        ASTNode$State state = state();
        boolean isProtected_value = getVisibilityType().isProtected();

        return isProtected_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isFlow() {
        ASTNode$State state = state();
        boolean isFlow_value = hasTypePrefixFlow() && getTypePrefixFlow().isFlow();

        return isFlow_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isStream() {
        ASTNode$State state = state();
        boolean isStream_value = hasTypePrefixFlow() && getTypePrefixFlow().isStream();

        return isStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasFlowOrStream() {
        ASTNode$State state = state();
        boolean hasFlowOrStream_value = hasTypePrefixFlow();

        return hasFlowOrStream_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInner() {
        ASTNode$State state = state();
        boolean isInner_value = hasInner();

        return isInner_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOuter() {
        ASTNode$State state = state();
        boolean isOuter_value = hasOuter();

        return isOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean hasInnerOrOuter() {
        ASTNode$State state = state();
        boolean hasInnerOrOuter_value = hasInner() || hasOuter();

        return hasInnerOrOuter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isParameter() {
        ASTNode$State state = state();
        boolean isParameter_value = hasTypePrefixVariability() && getTypePrefixVariability().parameterVariability();

        return isParameter_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isConstant() {
        ASTNode$State state = state();
        boolean isConstant_value = hasTypePrefixVariability() && getTypePrefixVariability().constantVariability();

        return isConstant_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isDiscrete() {
        ASTNode$State state = state();
        boolean isDiscrete_value = hasTypePrefixVariability() && getTypePrefixVariability().discreteVariability();

        return isDiscrete_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isInput() {
        ASTNode$State state = state();
        boolean isInput_value = hasTypePrefixInputOutput() && getTypePrefixInputOutput().isInput();

        return isInput_value;
    }
    @ASTNodeAnnotation.Attribute
    public boolean isOutput() {
        ASTNode$State state = state();
        boolean isOutput_value = hasTypePrefixInputOutput() && getTypePrefixInputOutput().isOutput();

        return isOutput_value;
    }
    @ASTNodeAnnotation.Attribute
    public String extraMemoryUseInfo() {
        ASTNode$State state = state();
        String extraMemoryUseInfo_value = " \"" + name() + "\"";

        return extraMemoryUseInfo_value;
    }
    /**
     * @attribute inh
     * @aspect Names
     * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaFrontEnd/src/jastadd/util/Util.jrag:652
     */
    @ASTNodeAnnotation.Attribute
    public String classNamePrefix() {
        ASTNode$State state = state();
        String classNamePrefix_value = getParent().Define_classNamePrefix(this, null);

        return classNamePrefix_value;
    }
    /**
     * @apilevel internal
     */
    public ASTNode rewriteTo() {
        return super.rewriteTo();
    }
}
