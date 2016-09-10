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
 * @declaredat /home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/jModelica/Compiler/ModelicaCBackEnd/src/jastadd/codegen/CADGenerator.jrag:23
 */
public class CADGenerator extends CGenerator {
    static  boolean shouldGenerateDAEJacobians(FClass fclass) {
		OptionRegistry opt = fclass.myOptions();
		return opt.getBooleanOption("generate_dae_jacobian");
	}

    static  boolean shouldGenerateODEJacobians(FClass fclass) {
		OptionRegistry opt = fclass.myOptions();
		return opt.getBooleanOption("generate_ode_jacobian");
	}

    static  boolean shouldGenerateBlockJacobians(FClass fclass) {
		OptionRegistry opt = fclass.myOptions();
		return opt.getBooleanOption("generate_ode_jacobian") || opt.getBooleanOption("generate_block_jacobian");
	}

    public  CADGenerator(Printer expPrinter, char escapeCharacter,
			FClass fclass) {
		super(expPrinter, escapeCharacter, fclass);
	}

    public  class DAETag_C_equationResidualDirectionalDerivative extends DAETag {
		
		public DAETag_C_equationResidualDirectionalDerivative(AbstractGenerator myGenerator, FClass fclass) {
			super("C_DAE_equation_directional_derivative", myGenerator, fclass);
		}
	
		public void generate(CodeStream genPrinter) {
			int i = 0;
			if (shouldGenerateDAEJacobians(fclass)) {
				for (FAbstractEquation e : fclass.equations()) {
					e.genVarDecls_CAD(ASTNode.printer_C, genPrinter, INDENT);
				}
				Enumerator enumerator = new Enumerator();
				for (FAbstractEquation e : fclass.equations()) {
					e.genResidual_CAD(enumerator, INDENT, genPrinter, null, new HashSet<Integer>());
				}
			}
		}
	}

    public  class DAETag_CAD_function_headers extends DAETag {
		
		public DAETag_CAD_function_headers(AbstractGenerator myGenerator, FClass fclass) {
			super("CAD_function_headers", myGenerator, fclass);
		}
		// Function calls might appear in dae_dir_df, in model_ode_derivatives or in blocks and should
		// therefore be generated if one of them is true. 
		public void generate(CodeStream genPrinter) {
			if (shouldGenerateDAEJacobians(fclass) || shouldGenerateODEJacobians(fclass) || shouldGenerateBlockJacobians(fclass)){
				for (FFunctionDecl func : fclass.getFFunctionDecls()){
					func.genHeader_CAD(genPrinter, "");
				}
			}
		}
	}

    public  class DAETag_CAD_functions extends DAETag {
		
		public DAETag_CAD_functions(AbstractGenerator myGenerator, FClass fclass) {
			super("CAD_functions", myGenerator, fclass);
		}
		// Function calls might appear in dae_dir_df, in model_ode_derivatives or in blocks and should
		// therefore be generated if one of them is true. 
		public void generate(CodeStream genPrinter) {
			if (shouldGenerateDAEJacobians(fclass) || shouldGenerateODEJacobians(fclass) || shouldGenerateBlockJacobians(fclass)){
				for (FFunctionDecl func : fclass.getFFunctionDecls()){
					func.prettyPrint_CAD(genPrinter, "");
				}
			}
		}
	}

    public  class DAETag_CAD_dae_blocks_residual_functions extends DAETag {
		
		public DAETag_CAD_dae_blocks_residual_functions(AbstractGenerator myGenerator, FClass fclass) {
			super("CAD_dae_blocks_residual_functions", myGenerator, fclass);
		}

        @Override
        public boolean isActive() {
            return !fclass.onlyInitBLT() && super.isActive();
        }

		public void generate(CodeStream genPrinter) {
			if (shouldGenerateBlockJacobians(fclass)) {
				for (AbstractEquationBlock block : fclass.getDAEStructuredBLT().getAllBlocks()) {
					block.genBlockResidualFunction_CAD(false, "", genPrinter); 
				}
			}
		}
	}

    public  class DAETag_CAD_dae_init_blocks_residual_functions extends DAETag {
		
		public DAETag_CAD_dae_init_blocks_residual_functions(AbstractGenerator myGenerator, FClass fclass) {
			super("CAD_dae_init_blocks_residual_functions", myGenerator, fclass);
		}

		public void generate(CodeStream genPrinter) {
			if ( shouldGenerateBlockJacobians(fclass)) {
				for (AbstractEquationBlock block : fclass.getDAEInitBLT()) {
					block.genBlockResidualFunction_CAD(true, "", genPrinter); 
				}
				
			}
		}
	}

    public  class DAETag_CAD_dae_add_blocks_residual_functions extends DAETag {

        public DAETag_CAD_dae_add_blocks_residual_functions(AbstractGenerator myGenerator, FClass fclass) {
            super("CAD_dae_add_blocks_residual_functions", myGenerator, fclass);
        }

        @Override
        public boolean isActive() {
            return !fclass.onlyInitBLT() && super.isActive();
        }

        public void generate(CodeStream genPrinter) {
            if (shouldGenerateBlockJacobians(fclass)) {
                CodePrinter p = ASTNode.printer_CAD;
                String indent = p.indent("");
                for (AbstractEquationBlock block : fclass.getDAEStructuredBLT().getAllBlocks())
                    block.genBlockAddCall_C(p, genPrinter, indent, true, false, fclass.myOptions().getStringOption("nonlinear_solver"), -1);
            }
        }
	    }

    public  class DAETag_CAD_dae_init_add_blocks_residual_functions extends DAETag {

        public DAETag_CAD_dae_init_add_blocks_residual_functions(AbstractGenerator myGenerator, FClass fclass) {
            super("CAD_dae_init_add_blocks_residual_functions", myGenerator, fclass);
        }

        public void generate(CodeStream genPrinter) {
            if (shouldGenerateBlockJacobians(fclass)) {
                CodePrinter p = ASTNode.printer_CAD;
                String indent = p.indent("");
                for (AbstractEquationBlock block : fclass.getDAEInitBLT())
                    block.genBlockAddCall_C(p, genPrinter, indent, true, true, fclass.myOptions().getStringOption("nonlinear_solver"), -1);
            }
        }
    }

    public  class DAETag_CAD_ode_derivatives extends DAETag {
		
		public DAETag_CAD_ode_derivatives(AbstractGenerator myGenerator, FClass fclass) {
			super("CAD_ode_derivatives", myGenerator, fclass);
		}

        @Override
        public boolean isActive() {
            return !fclass.onlyInitBLT() && super.isActive();
        }

		public void generate(CodeStream genPrinter) {
			if (shouldGenerateODEJacobians(fclass)) {
				genPrinter.print("\n/******** Declarations *******/\n");
				fclass.getDAEStructuredBLT().genSolvedVarDecls_CAD(genPrinter, INDENT);
				genPrinter.print("\njmi_real_t** dz = jmi->dz;\n");
				fclass.getDAEStructuredBLT().genOdeDerivativeBlocks_CAD(genPrinter);
			}
		}
	}

    public  class DAETag_C_ODESparsity extends DAETag {
		
		public DAETag_C_ODESparsity(AbstractGenerator myGenerator, FClass fclass) {
			super("C_DAE_ODE_jacobian_sparsity", myGenerator, fclass);
		}
	
		public void generate(CodeStream genPrinter) {
			if (shouldGenerateODEJacobians(fclass)) {
			    
			    int A_n_nz = 0;
			    int B_n_nz = 0;
			    int C_n_nz = 0;
			    int D_n_nz = 0;
			    
			    for (FDerivativeVariable v : fclass.derivativeVariables()) {
					for (FVariable vv : v.dependsOn()) {
						if (vv.isDifferentiatedVariable()) {
							A_n_nz++;
						}
					}
					for (FVariable vv : v.dependsOn()) {
						if (vv.isInput()) {
							B_n_nz++;
						}
					}
				}	

				for (FVariable v : fclass.outputs()) {
					for (FVariable vv : v.dependsOn()) {
						if (vv.isDifferentiatedVariable()) {
							C_n_nz++;
						}
					}
					for (FVariable vv : v.dependsOn()) {
						if (vv.isInput()) {
							D_n_nz++;
						}
					}
				}	
			    
				genPrinter.print("static const int CAD_ODE_A_n_nz = ");
				genPrinter.print(A_n_nz);
				genPrinter.print(";\n");	
				genPrinter.print("static const int CAD_ODE_B_n_nz = ");	
				genPrinter.print(B_n_nz);
				genPrinter.print(";\n");	
				genPrinter.print("static const int CAD_ODE_C_n_nz = ");	
				genPrinter.print(C_n_nz);
				genPrinter.print(";\n");	
				genPrinter.print("static const int CAD_ODE_D_n_nz = ");	
				genPrinter.print(D_n_nz);
				genPrinter.print(";\n");	
				
				StringBuffer A_str_row = new StringBuffer();
				StringBuffer A_str_col = new StringBuffer();	
				StringBuffer B_str_row = new StringBuffer();
				StringBuffer B_str_col = new StringBuffer();	
				StringBuffer C_str_row = new StringBuffer();
				StringBuffer C_str_col = new StringBuffer();	
				StringBuffer D_str_row = new StringBuffer();
				StringBuffer D_str_col = new StringBuffer();	
				
				A_str_row.append("static const int CAD_ODE_A_nz_rows[" + (A_n_nz==0? 1: A_n_nz) + "] = {");
				A_str_col.append("static const int CAD_ODE_A_nz_cols[" + (A_n_nz==0? 1: A_n_nz) + "] = {");
				B_str_row.append("static const int CAD_ODE_B_nz_rows[" + (B_n_nz==0? 1: B_n_nz) + "] = {");
				B_str_col.append("static const int CAD_ODE_B_nz_cols[" + (B_n_nz==0? 1: B_n_nz) + "] = {");
				C_str_row.append("static const int CAD_ODE_C_nz_rows[" + (C_n_nz==0? 1: C_n_nz) + "] = {");
				C_str_col.append("static const int CAD_ODE_C_nz_cols[" + (C_n_nz==0? 1: C_n_nz) + "] = {");
				D_str_row.append("static const int CAD_ODE_D_nz_rows[" + (D_n_nz==0? 1: D_n_nz) + "] = {");
				D_str_col.append("static const int CAD_ODE_D_nz_cols[" + (D_n_nz==0? 1: D_n_nz) + "] = {");
			    
			    int row_index = 0;
			    int A_i = 0;
			    int B_i = 0; 
			    boolean A_p = false;
			    boolean B_p = false;	
			    for (FDerivativeVariable v : fclass.derivativeVariables()) {
					for (FVariable vv : v.dependsOn()) {
						A_p = false;
						B_p = false;
						if (vv.isDifferentiatedVariable()) {
							A_str_col.append(vv.differentiatedRealVariableIndex());
							A_str_row.append(row_index);
							A_i++;
							A_p = true;
						}
						if (A_i<A_n_nz && A_p) {
							A_str_col.append(",");
							A_str_row.append(",");	
						}
						if (vv.isInput()) {
							B_str_col.append(vv.inputIndex());
							B_str_row.append(row_index);
							B_i++;
							B_p = true;
						}
						if (B_i<B_n_nz && B_p) {
							B_str_col.append(",");
							B_str_row.append(",");	
						}
					}
					row_index++;
				}	

			    row_index = 0;
			    int C_i = 0;
			    int D_i = 0; 
			    boolean C_p = false;
			    boolean D_p = false;
			    for (FVariable v : fclass.outputs()) {
					for (FVariable vv : v.dependsOn()) {
						C_p = false;
						D_p = false;
						if (vv.isDifferentiatedVariable()) {
							C_str_col.append(vv.differentiatedRealVariableIndex());
							C_str_row.append(row_index);
							C_i++;
							C_p = true;
						}
						if (C_i<C_n_nz && C_p) {
							C_str_col.append(",");
							C_str_row.append(",");	
						}
						if (vv.isInput()) {
							D_str_col.append(vv.inputIndex());
							D_str_row.append(row_index);
							D_i++;
							D_p = true;
						}
						if (D_i<D_n_nz & D_p) {
							D_str_col.append(",");
							D_str_row.append(",");	
						}
					}
					row_index++;
				}	

/*
				for (FVariable v : fclass.outputs()) {
					genPrinter.print("\t\t<Output name=\"");
					genPrinter.print(v.name());
					genPrinter.print("\" stateDependency=\"");
					i = 0;
					for (FVariable vv : v.dependsOn()) {
						if (vv.isDifferentiatedVariable()) {
							genPrinter.print(vv.differentiatedRealVariableIndex()+1);
							genPrinter.print(" ");
						}
						i++;
					}
					if (v.isDifferentiatedVariable()) {
							genPrinter.print(v.differentiatedRealVariableIndex()+1);		
							genPrinter.print(" ");					
					}
					genPrinter.print("\" inputDependency=\"");
					i = 0;
					for (FVariable vv : v.dependsOn()) {
						if (vv.isInput()) {
							genPrinter.print(vv.inputIndex()+1);	
							genPrinter.print(" ");
						}
						i++;
					}
					genPrinter.print("\"/>\n");	
				}	
				genPrinter.print("\t</Outputs>\n");	
				*/
				
				A_str_row.append(A_n_nz==0? "-1};\n": "};\n");
				A_str_col.append(A_n_nz==0? "-1};\n": "};\n");	
				B_str_row.append(B_n_nz==0? "-1};\n": "};\n");
				B_str_col.append(B_n_nz==0? "-1};\n": "};\n");	
				C_str_row.append(C_n_nz==0? "-1};\n": "};\n");
				C_str_col.append(C_n_nz==0? "-1};\n": "};\n");	
				D_str_row.append(D_n_nz==0? "-1};\n": "};\n");
				D_str_col.append(D_n_nz==0? "-1};\n": "};\n");	

				genPrinter.print(A_str_row.toString());
				genPrinter.print(A_str_col.toString());				
				genPrinter.print(B_str_row.toString());
				genPrinter.print(B_str_col.toString());				
				genPrinter.print(C_str_row.toString());
				genPrinter.print(C_str_col.toString());				
				genPrinter.print(D_str_row.toString());
				genPrinter.print(D_str_col.toString());				  	    
			} else {
				genPrinter.print("static const int CAD_ODE_A_n_nz = 0;\n");
				genPrinter.print("static const int CAD_ODE_B_n_nz = 0;\n");	
				genPrinter.print("static const int CAD_ODE_C_n_nz = 0;\n");	
				genPrinter.print("static const int CAD_ODE_D_n_nz = 0;\n");	
				
				genPrinter.print("static const int CAD_ODE_A_nz_rows[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_A_nz_cols[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_B_nz_rows[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_B_nz_cols[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_C_nz_rows[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_C_nz_cols[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_D_nz_rows[1] = {-1};\n");
				genPrinter.print("static const int CAD_ODE_D_nz_cols[1] = {-1};\n");
			
			}
		} 
	}

    public  class DAETag_C_equationSparsity extends DAETag {
		
		public DAETag_C_equationSparsity(AbstractGenerator myGenerator, FClass fclass) {
			super("C_DAE_equation_sparsity", myGenerator, fclass);
		}
	
		public void generate(CodeStream genPrinter) {
			if (shouldGenerateDAEJacobians(fclass)) {
			    
			    int dae_n_nz = fclass.freeParametersEquationSparsity_n_nz()+
			        fclass.derivativeVariablesEquationSparsity_n_nz() + 
			    	fclass.differentiatedRealVariablesEquationSparsity_n_nz() +
			    	fclass.realInputsEquationSparsity_n_nz() +
			    	fclass.algebraicRealVariablesEquationSparsity_n_nz();

				genPrinter.print("static const int CAD_dae_real_p_opt_n_nz = ");
				genPrinter.print(fclass.freeParametersEquationSparsity_n_nz());
				genPrinter.print(";\n");			     
				genPrinter.print("static const int CAD_dae_real_dx_n_nz = ");
				genPrinter.print(fclass.derivativeVariablesEquationSparsity_n_nz());
				genPrinter.print(";\n");
				genPrinter.print("static const int CAD_dae_real_x_n_nz = ");
				genPrinter.print(fclass.differentiatedRealVariablesEquationSparsity_n_nz());
				genPrinter.print(";\n");
				genPrinter.print("static const int CAD_dae_real_u_n_nz = ");
				genPrinter.print(fclass.realInputsEquationSparsity_n_nz());
				genPrinter.print(";\n");
				genPrinter.print("static const int CAD_dae_real_w_n_nz = ");
				genPrinter.print(fclass.algebraicRealVariablesEquationSparsity_n_nz());
				genPrinter.print(";\n");
			     
			    genPrinter.print("static int CAD_dae_n_nz = " + dae_n_nz + ";\n");
			     
			    ArrayList<Integer>[] sp_p_opt = fclass.freeParametersEquationSparsity();
				ArrayList<Integer>[] sp_dx = fclass.derivativeVariablesEquationSparsity();
				ArrayList<Integer>[] sp_x = fclass.differentiatedRealVariablesEquationSparsity();
				ArrayList<Integer>[] sp_u = fclass.realInputsEquationSparsity();
				ArrayList<Integer>[] sp_w = fclass.algebraicRealVariablesEquationSparsity();
				
				StringBuffer str_row = new StringBuffer();
				StringBuffer str_col = new StringBuffer();	
				
				str_row.append("static const int CAD_dae_nz_rows[" + dae_n_nz + "] = {");
				str_col.append("static const int CAD_dae_nz_cols[" + dae_n_nz + "] = {");


				int ind = 0;
				int col_offs = 0;
				for (int j=0; j<fclass.numFreeParameters(); j++) {
					for (int k=0; k<sp_p_opt[j].size(); k++) {
						str_row.append(sp_p_opt[j].get(k).intValue());
						str_col.append(j + col_offs);
						if (ind<dae_n_nz-1) {
							str_row.append(",");
							str_col.append(",");
						}
						ind ++;
					}
				}

				col_offs += fclass.numFreeParameters();
				for (int j=0; j<fclass.numDerivativeVariables(); j++) {
					for (int k=0; k<sp_dx[j].size(); k++) {
						str_row.append(sp_dx[j].get(k).intValue());
						str_col.append(j + col_offs);
						if (ind<dae_n_nz-1) {
							str_row.append(",");
							str_col.append(",");
						}
						ind ++;
					}
				}

				col_offs += fclass.numDerivativeVariables();
				for (int j=0; j<fclass.numDifferentiatedRealVariables(); j++) {
					for (int k=0; k<sp_x[j].size(); k++) {
						str_row.append(sp_x[j].get(k).intValue());
						str_col.append(j + col_offs);
						if (ind<dae_n_nz-1) {
							str_row.append(",");
							str_col.append(",");
						}
						ind ++;
					}
				}

				col_offs += fclass.numDifferentiatedRealVariables();
				for (int j=0; j<fclass.numRealInputs(); j++) {
					for (int k=0; k<sp_u[j].size(); k++) {
						str_row.append(sp_u[j].get(k).intValue());
						str_col.append(j + col_offs);
						if (ind<dae_n_nz-1) {
							str_row.append(",");
							str_col.append(",");
						}
						ind ++;
					}
				}

				col_offs += fclass.numRealInputs();
				for (int j=0; j<fclass.numAlgebraicContinousRealVariables(); j++) {
					for (int k=0; k<sp_w[j].size(); k++) {
						str_row.append(sp_w[j].get(k).intValue());
						str_col.append(j + col_offs);
						if (ind<dae_n_nz-1) {
							str_row.append(",");
							str_col.append(",");
						}
						ind ++;
					}
				}

				str_row.append("};\n");
				str_col.append("};\n");	
				
				genPrinter.print(str_row.toString());
				genPrinter.print(str_col.toString());				
				
			} else {
			 	genPrinter.print("static int CAD_dae_n_nz = 1;\n");
				genPrinter.print("static const int CAD_dae_nz_rows[1] = {-1};\n");
				genPrinter.print("static const int CAD_dae_nz_cols[1] = {-1};\n");
			}
		}
	
	}


}
