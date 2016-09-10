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
 * @aspect FmiXMLGenerator
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/FmiXMLCodeGen/src/jastadd/FmiXMLGenerator.jrag:377
 */
public class Fmi1XMLGenerator extends FmiXMLGenerator {
    
	
    public static final Creator CREATOR = new Creator()
    {
        public Fmi1XMLGenerator create(Printer expPrinter, char escapeCharacter, FClass fclass) {
            return new Fmi1XMLGenerator(expPrinter, escapeCharacter, fclass);
        }
    };

    
    
	/**
	 * Constructor.
	 * 
	 * @param expPrinter Printer object used to generate code for expressions.
	 * @param escapeCharacter Escape characters used to decode tags.
	 * @param fclass An FClass object used as a basis for the code generation.
	 */
	public Fmi1XMLGenerator(Printer expPrinter, char escapeCharacter,
			FClass fclass) {
		super(expPrinter,escapeCharacter, fclass);
	}

    
	
	/**
	 * Gets the root-tag for FMI 1.0 XML-generation.
	 * 
	 * @see XMLTag
	 */
    protected String root() {
    	return "fmiModelDescription";
    }

    

	/**
	 * Internal class used to generate a fmiModelDescription tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_fmiModelDescription extends XMLTag {
		
		private final SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		
		public XMLTag_fmiModelDescription(AbstractGenerator myGenerator, FClass fclass) {
			super("fmiModelDescription", "fmiModelDescription", myGenerator, fclass);
		}
		
		public String[] children() {
            return new String[] {"unitDefinitions", "typeDefinitions", "defaultExperiment",
                                 "vendorAnnotations", "modelVariables", "implementation"};
        }

        public void generateAttributes(CodeStream genPrinter) {
            generateAttribute("fmiVersion",               "1.0",                                   genPrinter);
            generateAttribute("modelName",                fclass.name(),                           genPrinter);
            generateAttribute("modelIdentifier",          fclass.nameUnderscore(),                 genPrinter);
            generateAttribute("guid",                     fclass.guid(),                           genPrinter);
            generateAttribute("generationTool",           ASTNode.vendorName(),                    genPrinter);
            generateAttribute("generationDateAndTime",    dateformat.format(new Date()),           genPrinter);
            generateAttribute("variableNamingConvention", "structured",                            genPrinter);
            generateAttribute("numberOfContinuousStates", fclass.numDifferentiatedRealVariables(), genPrinter);
            generateAttribute("numberOfEventIndicators",  numberOfEventIndicators(fclass),         genPrinter);
        }
	}

    
	
	/**
	 * Internal class used to generate a UnitDefinitions tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_unitDefinitions extends XMLTag {
        protected String unit;
        protected Iterator<String> unitItr;
        protected HashMap<String,HashSet<String>> unitMap;
		
		public XMLTag_unitDefinitions(AbstractGenerator myGenerator, FClass fclass) {
			super("unitDefinitions", "UnitDefinitions", myGenerator, fclass);
            unitMap = extractUnits(fclass);
		}
		
		public String[] children() { return new String[] {"baseUnit"}; }
		
		public void generate(CodeStream genPrinter) {
			//Generate code if any units are defined.
            Set<String> units = unitMap.keySet();
            if(!units.isEmpty()) {
                unitItr = units.iterator();
                super.generate(genPrinter);
            }
		}
		
		public void generateChildren(CodeStream genPrinter) {
            while(unitItr.hasNext()) {
                unit = unitItr.next();
                super.generateChildren(genPrinter);
            }
        }
        
        public class XMLTag_baseUnit extends XMLTag {

            private String def;

            public XMLTag_baseUnit(AbstractGenerator myGenerator, FClass fclass) {
                super("baseUnit", "BaseUnit", myGenerator, fclass);
            }

            public String[] children() { return new String[] {"displayUnitDefinition"}; }

            public void generateAttributes(CodeStream genPrinter) {
                generateAttribute("unit", unit, genPrinter);
            }

            public void generateChildren(CodeStream genPrinter) {
                HashSet<String> defs = unitMap.get(unit);
                Iterator<String> defsItr = defs.iterator();
                while(defsItr.hasNext()) {
                    def = defsItr.next();
                    super.generateChildren(genPrinter);
                }
            }

            public class XMLTag_displayUnitDefinition extends XMLTag {

                public XMLTag_displayUnitDefinition(AbstractGenerator myGenerator, FClass fclass) {
                    super("displayUnitDefinition", "DisplayUnitDefinition", myGenerator, fclass);
                }

                public void generateAttributes(CodeStream genPrinter) {
                    generateAttribute("displayUnit", def, genPrinter);
                    Unit conv = getUnitConversion(unit, def);
                    if (conv != null) {
	                    double factor = conv.getScale();
	                    double offset = conv.getOffset();
	                    if (factor != 1.0) {
                            generateAttribute("gain", factor, genPrinter);
                        }
                        if (offset != 0.0) {
                            generateAttribute("offset", offset, genPrinter);
                        }
                    }
                }
            }
        }
    }

    
	
	/**
	 * Internal class used to generate a TypeDefinitions tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_typeDefinitions extends XMLTag {
		
		private FEnumDecl enumdecl;
		
		public XMLTag_typeDefinitions(AbstractGenerator myGenerator, FClass fclass) {
			super("typeDefinitions", "TypeDefinitions", myGenerator, fclass);
		}
		
		public String[] children() { return new String[] {"type"}; }
		
		public void generate(CodeStream genPrinter) {
            if (fclass.getNumFEnumDecl() > 0) super.generate(genPrinter);
		}
		
		public void generateChildren(CodeStream genPrinter) {
			Iterator<FEnumDecl> itr = fclass.getFEnumDecls().iterator();
			while (itr.hasNext()) {
				enumdecl = itr.next();
				super.generateChildren(genPrinter);
			}
		}
		
		public class XMLTag_type extends XMLTag {
			
			public XMLTag_type(AbstractGenerator myGenerator, FClass fclass) {
				super("type", "Type", myGenerator, fclass);
			}
            
            public String[] children() { return new String[] {"enumerationType"}; }
			
			public void generateAttributes(CodeStream genPrinter) {
				generateAttribute("name", enumdecl.name(), genPrinter);
                if (enumdecl.hasFStringComment())
					generateAttribute("description", enumdecl.getFStringComment().getComment(), genPrinter);
			}
		}
		
		public class XMLTag_enumerationType extends XMLTag {
			
			private FEnumLiteral literal;
			
			public XMLTag_enumerationType(AbstractGenerator myGenerator, FClass fclass) {
				super("enumerationType", "EnumerationType", myGenerator, fclass);
			}
			
			public String[] children() { return new String[] {"item"}; }
			
			public void generateAttributes(CodeStream genPrinter) {
                generateAttribute("min", "1",                        genPrinter);
				generateAttribute("max", enumdecl.numEnumLiterals(), genPrinter);
			}
			
			public void generateChildren(CodeStream genPrinter) {
				Iterator<FEnumLiteral> itr = enumdecl.enumLiterals().iterator();
				while (itr.hasNext()) {
					literal = itr.next();
					super.generateChildren(genPrinter);
				}
			}
			
			public class XMLTag_item extends XMLTag {
				
				public XMLTag_item(AbstractGenerator myGenerator, FClass fclass) {
					super("item", "Item", myGenerator, fclass);
				}
				
				public void generateAttributes(CodeStream genPrinter) {
                    generateAttribute("name", literal.name(), genPrinter);
                    if (literal.hasFStringComment())
						generateAttribute("description", literal.getFStringComment().getComment(), genPrinter);
				}
			}
		}
	}

    
	
	/**
	 * Internal class used to generate a ModelVariables tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_modelVariables extends XMLTag {
		
		private FVariable variable;
		
		public XMLTag_modelVariables(AbstractGenerator myGenerator, FClass fclass) {
			super("modelVariables", "ModelVariables", myGenerator, fclass);
		}
		
		public String[] children() { return new String[] {"variables"}; }
		
		public void generateChildren(CodeStream genPrinter) {
			// get and sort all FVariables
			ArrayList<FVariable> variables = (ArrayList<FVariable>) fclass.allVariables().clone();
			VariableNameComparator comp = new VariableNameComparator();
			Collections.sort(variables, comp);

			for (FVariable var : variables) {
                if (var.isXMLVariable()) {
					variable = var;
					super.generateChildren(genPrinter);
				}
			}
		}
		
		public class XMLTag_variables extends XMLTag {

			public XMLTag_variables(AbstractGenerator myGenerator, FClass fclass) {
				super("variables", "ScalarVariable", myGenerator, fclass);
			}

			public String[] children() {
				return new String[] {"real", "integer", "boolean", "string", "enumeration", "directDependency"};
			}
			
			public void generateAttributes(CodeStream genPrinter) {
				generateAttribute("name",           variable.name(),           genPrinter);
				generateAttribute("valueReference", variable.valueReference(), genPrinter);
                if (variable.hasFStringComment())
                    generateAttribute("description", variable.getFStringComment().getComment(), genPrinter);
                
                generateAttribute("variability", getVariability(variable), genPrinter);
                
                generateAttribute("causality", getCausality(variable), genPrinter);

                if (variable.isAlias() && variable.isNegated())
                    generateAttribute("alias", "negatedAlias", genPrinter);
                else if (variable.isAlias())
                    generateAttribute("alias", "alias", genPrinter);
                else //default
                    generateAttribute("alias", "noAlias", genPrinter);
            }
        }

		public class XMLTag_real extends XMLTag {

			public XMLTag_real(AbstractGenerator myGenerator, FClass fclass) {
				super("real", "Real", myGenerator, fclass);
			}
			
			public void generate(CodeStream genPrinter) {
                if(variable.isReal()) super.generate(genPrinter);
			}

			public void generateAttributes(CodeStream genPrinter) {
				FRealVariable realvariable = (FRealVariable)variable;

                if(realvariable.quantityAttributeSet())
                    generateAttribute("quantity", realvariable.quantity_XML(), genPrinter);
                if(realvariable.unitAttributeSet()) {
                    generateAttribute("unit", realvariable.unit_XML(), genPrinter);
                    if(realvariable.displayUnitAttributeSet()) {
                        generateAttribute("displayUnit", realvariable.displayUnit_XML(), genPrinter);
                    }
                }
                generateAttribute("relativeQuantity", false, genPrinter);
                if(realvariable.minAttributeSet())
                    generateAttribute("min", realvariable.minAttribute(), genPrinter);
                if(realvariable.maxAttributeSet())
                    generateAttribute("max", realvariable.maxAttribute(), genPrinter);
                if(realvariable.nominalAttributeSet())
                    generateAttribute("nominal", realvariable.nominalAttribute(), genPrinter);
                
                generateStartAndFixedAttribute(genPrinter, variable);
            }
        }

		public class XMLTag_integer extends XMLTag {

			public XMLTag_integer(AbstractGenerator myGenerator, FClass fclass) {
				super("integer", "Integer", myGenerator, fclass);
			}
			
			public void generate(CodeStream genPrinter) {
                if(variable.isInteger()) super.generate(genPrinter);
			}

			public void generateAttributes(CodeStream genPrinter) {
				FIntegerVariable integervariable = (FIntegerVariable)variable;
				
                if(integervariable.quantityAttributeSet())
                    generateAttribute("quantity", integervariable.quantity_XML(), genPrinter);
                if(integervariable.minAttributeSet())
                    generateAttribute("min", integervariable.minAttribute(), genPrinter);
                if(integervariable.maxAttributeSet())
                    generateAttribute("max", integervariable.maxAttribute(), genPrinter);
                
                generateStartAndFixedAttribute(genPrinter, variable);
            }
        }

		public class XMLTag_boolean extends XMLTag {

			public XMLTag_boolean(AbstractGenerator myGenerator, FClass fclass) {
				super("boolean", "Boolean", myGenerator, fclass);
			}
			
			public void generate(CodeStream genPrinter) {
                if(variable.isBoolean()) super.generate(genPrinter);
			}

			public void generateAttributes(CodeStream genPrinter) {
				generateStartAndFixedAttribute(genPrinter, variable);
			}
		}

		public class XMLTag_string extends XMLTag {

			public XMLTag_string(AbstractGenerator myGenerator, FClass fclass) {
				super("string", "String", myGenerator, fclass);
			}
			
			public void generate(CodeStream genPrinter) {
                if(variable.isString()) super.generate(genPrinter);
			}

			public void generateAttributes(CodeStream genPrinter) {
				generateStartAndFixedAttribute(genPrinter, variable);
			}
		}

		public class XMLTag_enumeration extends XMLTag {

			public XMLTag_enumeration(AbstractGenerator myGenerator, FClass fclass) {
				super("enumeration", "Enumeration", myGenerator, fclass);
			}
			
			public void generate(CodeStream genPrinter) {
                if(variable.isEnum()) super.generate(genPrinter);
			}

			public void generateAttributes(CodeStream genPrinter) {
				FEnumVariable enumvariable = (FEnumVariable)variable;
				//declaredType
				generateAttribute("declaredType", enumvariable.myFEnumDecl().name(), genPrinter);

                if(enumvariable.quantityAttributeSet())
                    generateAttribute("quantity", enumvariable.quantity_XML(), genPrinter);
                if(enumvariable.minAttributeSet())
                    generateAttribute("min", enumvariable.minAttribute(), genPrinter);
                if(enumvariable.maxAttributeSet())
                    generateAttribute("max", enumvariable.maxAttribute(), genPrinter);
                
                generateStartAndFixedAttribute(genPrinter, variable);
            }
        }
        
        protected void generateStartAndFixedAttribute(CodeStream genPrinter, FVariable var) {
            if (generateStartAttribute(var)) {
                generateAttribute("start", getXMLStartAttribute(var), genPrinter);
                
                if (!var.fixedAttribute() && !var.variability().knownParameterOrLess())
                    generateAttribute("fixed", false, genPrinter); //Default is true
            }
        }
        
        public class XMLTag_directDependency extends XMLTag {
            
            public XMLTag_directDependency(AbstractGenerator myGenerator, FClass fclass) {
                super("directDependency", "DirectDependency", myGenerator, fclass);
            }
            
            public void generate(CodeStream genPrinter) {
                if (variable.isOutput()) {
                    generateOpening(xml, genPrinter);
                    for (FVariable dv : variable.directDependencies()) {
                        generateTagStart("Name", genPrinter);
                        generateOpenEnd(genPrinter);
                        genPrinter.print(dv.name());
                        generateClosing("Name", genPrinter);
                    }
                    generateClosing(xml, genPrinter);
                }
            }
        }
    }

    
	
	/*** XML tags for Co-Simulation ***/
	/**
	 * Internal class used to generate a Implementation tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_implementation extends CSTag {
		
		public XMLTag_implementation(AbstractGenerator myGenerator, FClass fclass) {
			super("implementation", "Implementation", myGenerator, fclass);
		}
		
		public String[] children() { return new String[] {"coSimulation_StandAlone"}; }
	}

    
	
	/**
	 * Internal class used to generate a CoSimulation_StandAlone tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_coSimulation_StandAlone extends CSTag {
		
		public XMLTag_coSimulation_StandAlone(AbstractGenerator myGenerator, FClass fclass) {
			super("coSimulation_StandAlone", "CoSimulation_StandAlone", myGenerator, fclass);
		}
	
		public String[] children() { return new String[] {"capabilities"}; }
	}

    
	
	/**
	 * Internal class used to generate a Capabilities tag.
	 * 
	 * @see XMLTag
	 */
	public class XMLTag_capabilities extends CSTag {
		
		public XMLTag_capabilities(AbstractGenerator myGenerator, FClass fclass) {
			super("capabilities", "Capabilities", myGenerator, fclass);
		}
		
		public void generateAttributes(CodeStream genPrinter) {

            generateAttribute("canHandleVariableCommunicationStepSize", true,  genPrinter);
            generateAttribute("canHandleEvents",                        true,  genPrinter);
            generateAttribute("canRejectSteps",                         false, genPrinter);
            generateAttribute("canInterpolateInputs",                   true,  genPrinter);
            generateAttribute("maxOutputDerivativeOrder",               0,     genPrinter);
            generateAttribute("canRunAsynchronuously",                  false, genPrinter);
            generateAttribute("canSignalEvents",                        false, genPrinter);
            generateAttribute("canBeInstantiatedOnlyOncePerProcess",    true,  genPrinter);
            generateAttribute("canNotUseMemoryManagementFunctions",     false, genPrinter);
        }
    }


}
